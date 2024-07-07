import io.runebox.ObfInfo;

@ObfInfo(name = "pa")
public class Class391 {
	@ObfInfo(name = "aq", desc = "[C")
	public static char[] field4579;
	@ObfInfo(name = "ag", desc = "[C")
	public static char[] field4581;
	@ObfInfo(name = "ad", desc = "[C")
	public static char[] field4583;
	@ObfInfo(name = "ak", desc = "[I")
	public static int[] field4582;

	static {
		field4579 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4579[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4579[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4579[var0] = (char)(var0 + 48 - 52);
		}

		field4579[62] = '+';
		field4579[63] = '/';
		field4583 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4583[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4583[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4583[var0] = (char)(var0 + 48 - 52);
		}

		field4583[62] = '*';
		field4583[63] = '-';
		field4581 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4581[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4581[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4581[var0] = (char)(var0 + 48 - 52);
		}

		field4581[62] = '-';
		field4581[63] = '_';
		field4582 = new int[128];

		for (var0 = 0; var0 < field4582.length; ++var0) {
			field4582[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4582[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4582[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4582[var0] = 52 + (var0 - 48);
		}

		int[] var2 = field4582;
		field4582[43] = 62;
		var2[42] = 62;
		int[] var1 = field4582;
		field4582[47] = 63;
		var1[45] = 63;
	}
}
