import io.runebox.ObfInfo;

@ObfInfo(name = "pz")
public class Class416 {
	@ObfInfo(name = "al", desc = "[C")
	public static char[] field4659;
	@ObfInfo(name = "aj", desc = "[C")
	public static char[] field4660;
	@ObfInfo(name = "ak", desc = "[C")
	public static char[] field4663;
	@ObfInfo(name = "az", desc = "[I")
	public static int[] field4661;

	static {
		field4663 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4663[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4663[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4663[var0] = (char)(var0 + 48 - 52);
		}

		field4663[62] = '+';
		field4663[63] = '/';
		field4659 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4659[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4659[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4659[var0] = (char)(var0 + 48 - 52);
		}

		field4659[62] = '*';
		field4659[63] = '-';
		field4660 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4660[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4660[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4660[var0] = (char)(var0 + 48 - 52);
		}

		field4660[62] = '-';
		field4660[63] = '_';
		field4661 = new int[128];

		for (var0 = 0; var0 < field4661.length; ++var0) {
			field4661[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4661[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4661[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4661[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4661;
		field4661[43] = 62;
		var2[42] = 62;
		int[] var1 = field4661;
		field4661[47] = 63;
		var1[45] = 63;
	}

	@ObfInfo(desc = "([B)Ljava/lang/String;")
	public static String method3598(byte[] var0) {
		return method3961(var0, 0, var0.length);
	}

	@ObfInfo(desc = "([BII)Ljava/lang/String;")
	public static String method3961(byte[] var0, int var1, int var2) {
		StringBuilder var4 = new StringBuilder();

		for (int var5 = var1; var5 < var2 + var1; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(field4663[var6 >>> 2]);
			if (var5 < var2 - 1) {
				int var7 = var0[var5 + 1] & 255;
				var4.append(field4663[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var2 - 2) {
					int var8 = var0[var5 + 2] & 255;
					var4.append(field4663[(var7 & 15) << 2 | var8 >>> 6]).append(field4663[var8 & 63]);
				} else {
					var4.append(field4663[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(field4663[(var6 & 3) << 4]).append("==");
			}
		}

		return var4.toString();
	}
}
