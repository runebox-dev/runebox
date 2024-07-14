import io.runebox.ObfInfo;

@ObfInfo(name = "pu")
public class Class411 {
	@ObfInfo(name = "aq", desc = "[C")
	public static final char[] field4669;

	static {
		field4669 = new char[]{'\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178'};
	}

	@ObfInfo(owner = "nd", name = "ad", desc = "(CI)Z", opaque = "-2146996983")
	public static boolean method6424(char var0) {
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var2 = field4669;

				for (int var3 = 0; var3 < var2.length; ++var3) {
					char var4 = var2[var3];
					if (var0 == var4) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfInfo(owner = "hj", name = "ak", desc = "(CI)C", opaque = "-896424214")
	public static char method3859(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}

	@ObfInfo(owner = "ox", name = "ap", desc = "(BB)C", opaque = "1")
	public static char method7268(byte var0) {
		int var2 = var0 & 255;
		if (var2 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var2, 16));
		} else {
			if (var2 >= 128 && var2 < 160) {
				char var3 = field4669[var2 - 128];
				if (var3 == 0) {
					var3 = '?';
				}

				var2 = var3;
			}

			return (char)var2;
		}
	}

	@ObfInfo(owner = "jl", name = "aj", desc = "(Ljava/lang/CharSequence;II[BII)I", opaque = "-1039324313")
	public static int method4750(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var6 = var2 - var1;

		for (int var7 = 0; var7 < var6; ++var7) {
			char var8 = var0.charAt(var1 + var7);
			if (var8 > 0 && var8 < 128 || var8 >= 160 && var8 <= 255) {
				var3[var4 + var7] = (byte)var8;
			} else if (var8 == 8364) {
				var3[var4 + var7] = -128;
			} else if (var8 == 8218) {
				var3[var4 + var7] = -126;
			} else if (var8 == 402) {
				var3[var4 + var7] = -125;
			} else if (var8 == 8222) {
				var3[var4 + var7] = -124;
			} else if (var8 == 8230) {
				var3[var4 + var7] = -123;
			} else if (var8 == 8224) {
				var3[var4 + var7] = -122;
			} else if (var8 == 8225) {
				var3[var4 + var7] = -121;
			} else if (var8 == 710) {
				var3[var4 + var7] = -120;
			} else if (var8 == 8240) {
				var3[var4 + var7] = -119;
			} else if (var8 == 352) {
				var3[var4 + var7] = -118;
			} else if (var8 == 8249) {
				var3[var4 + var7] = -117;
			} else if (var8 == 338) {
				var3[var4 + var7] = -116;
			} else if (var8 == 381) {
				var3[var4 + var7] = -114;
			} else if (var8 == 8216) {
				var3[var4 + var7] = -111;
			} else if (var8 == 8217) {
				var3[var4 + var7] = -110;
			} else if (var8 == 8220) {
				var3[var4 + var7] = -109;
			} else if (var8 == 8221) {
				var3[var4 + var7] = -108;
			} else if (var8 == 8226) {
				var3[var4 + var7] = -107;
			} else if (var8 == 8211) {
				var3[var4 + var7] = -106;
			} else if (var8 == 8212) {
				var3[var4 + var7] = -105;
			} else if (var8 == 732) {
				var3[var4 + var7] = -104;
			} else if (var8 == 8482) {
				var3[var4 + var7] = -103;
			} else if (var8 == 353) {
				var3[var4 + var7] = -102;
			} else if (var8 == 8250) {
				var3[var4 + var7] = -101;
			} else if (var8 == 339) {
				var3[var4 + var7] = -100;
			} else if (var8 == 382) {
				var3[var4 + var7] = -98;
			} else if (var8 == 376) {
				var3[var4 + var7] = -97;
			} else {
				var3[var4 + var7] = 63;
			}
		}

		return var6;
	}

	@ObfInfo(owner = "kt", name = "av", desc = "([BIIB)Ljava/lang/String;", opaque = "1")
	public static String method5589(byte[] var0, int var1, int var2) {
		char[] var4 = new char[var2];
		int var5 = 0;

		for (int var6 = 0; var6 < var2; ++var6) {
			int var7 = var0[var1 + var6] & 255;
			if (var7 != 0) {
				if (var7 >= 128 && var7 < 160) {
					char var8 = field4669[var7 - 128];
					if (var8 == 0) {
						var8 = '?';
					}

					var7 = var8;
				}

				var4[var5++] = (char)var7;
			}
		}

		return new String(var4, 0, var5);
	}
}
