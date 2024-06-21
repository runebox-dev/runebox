package io.runebox.updater.ir.textify.core;

import io.runebox.updater.ir.Path;

import java.util.ArrayList;
import java.util.List;

public class Printer {
    private final static String LINE_SEPARATOR = System.lineSeparator();
    private final static String INDENT_STRING = "  ";

    /**
     * List of all lines of the file.
     */
    private final List<Line> lines;

    public Printer() {
        this.lines = new ArrayList<>(List.of(new Line(0)));
    }

    private Line getLastLine() {
        return this.lines.get(this.lines.size() - 1);
    }

    /**
     * Increase the indentation of the current line by one.
     */
    public void increaseIndent() {
        getLastLine().indent += 1;
    }

    /**
     * Decrease the indentation of the current line by one.
     */
    public void decreaseIndent() {
        Line lastLine = getLastLine();
        lastLine.indent -= 1;

        if (lastLine.indent < 0) {
            lastLine.indent = 0;
            //throw new IllegalStateException("Negative indent");
        }
    }

    /**
     * Start a new line
     */
    public void newLine() {
        int indent = getLastLine().indent;
        this.lines.add(new Line(indent));
    }

    /**
     * Append an unescaped string to the current line.
     *
     * @param text to be appended
     */
    public void addText(String text) {
        add(new TextToken(text));
    }

    /**
     * Append an escaped string.
     *
     * @param text  that will be appended
     * @param quote string is quote by this character
     */
    public void addEscaped(String text, char quote) {
        add(new EscapedToken(text, quote));
    }

    /**
     * Append a string to the current line that gets escaped if necessary.
     *
     * @param text to be appended
     */
    public void addLiteral(String text) {
        add(new LiteralToken(text));
    }

    /**
     * Append a Path to the current line.
     *
     * @param path that gets appended
     */
    public void addPath(Path path) {
        add(new PathToken(path));
    }

    /**
     * Append a token to the current line.
     *
     * @param token that is added to the line
     */
    protected void add(Token token) {
        getLastLine().tokens.add(token);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Line line : this.lines) {
            appendIndent(builder, line.indent);

            for (Token token : line.tokens) {
                token.append(builder);
            }

            builder.append(LINE_SEPARATOR);
        }

        return builder.toString();
    }

    private void appendIndent(StringBuilder builder, int indent) {
        builder.ensureCapacity(INDENT_STRING.length() * indent);
        for (int i = 0; i < indent; i++) {
            builder.append(INDENT_STRING);
        }
    }

    private interface Token {
        void append(StringBuilder builder);
    }

    private class Line {
        /**
         * All tokens that form the content of this line.
         */
        private final List<Token> tokens = new ArrayList<>();
        /**
         * The indentation of this line.
         */
        private int indent;

        public Line(int indent) {
            this.indent = indent;
        }
    }

    private class TextToken implements Token {
        private final String text;

        public TextToken(String text) {
            this.text = text;
        }

        @Override
        public void append(StringBuilder builder) {
            builder.append(text);
        }
    }

    private class LiteralToken implements Token {
        private final String text;

        public LiteralToken(String text) {
            this.text = text;
        }

        @Override
        public void append(StringBuilder builder) {
            TextUtil.printMaybeEscapedString(builder, text);
        }
    }

    private class EscapedToken implements Token {
        private final String text;
        private final char quote;

        public EscapedToken(String text, char quote) {
            this.text = text;
            this.quote = quote;
        }

        @Override
        public void append(StringBuilder builder) {
            TextUtil.printEscapedString(builder, text, quote);
        }
    }

    private class PathToken implements Token {
        private final Path path;

        public PathToken(Path path) {
            this.path = path;
        }

        @Override
        public void append(StringBuilder builder) {
            for (String pkg : path.getPackage()) {
                TextUtil.printMaybeEscapedString(builder, pkg);
                builder.append('.');
            }
            TextUtil.printMaybeEscapedString(builder, path.getName());
        }
    }
}
