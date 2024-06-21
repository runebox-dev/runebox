import io.runebox.ObfInfo;

@ObfInfo(name = "ug")
public class Class527 {
	@ObfInfo(name = "aj", desc = "[C")
	public static final char[] field5236;
	@ObfInfo(name = "az", desc = "[C")
	public static final char[] field5238;

	static {
		field5236 = new char[]{' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df'};
		field5238 = new char[]{'[', ']', '#'};
	}

	@ObfInfo(owner = "fj", name = "al", desc = "(Ljava/lang/String;I)Ljava/lang/String;", opaque = "-666387902")
	public static String method3137(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}
}
