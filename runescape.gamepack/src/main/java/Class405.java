public class Class405 {
	public static final char[] field4630;

	static {
		field4630 = new char[]{'\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178'};
	}

	public static byte method2753(char var0) {
		byte var2;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var2 = (byte)var0;
		} else if (var0 == 8364) {
			var2 = -128;
		} else if (var0 == 8218) {
			var2 = -126;
		} else if (var0 == 402) {
			var2 = -125;
		} else if (var0 == 8222) {
			var2 = -124;
		} else if (var0 == 8230) {
			var2 = -123;
		} else if (var0 == 8224) {
			var2 = -122;
		} else if (var0 == 8225) {
			var2 = -121;
		} else if (var0 == 710) {
			var2 = -120;
		} else if (var0 == 8240) {
			var2 = -119;
		} else if (var0 == 352) {
			var2 = -118;
		} else if (var0 == 8249) {
			var2 = -117;
		} else if (var0 == 338) {
			var2 = -116;
		} else if (var0 == 381) {
			var2 = -114;
		} else if (var0 == 8216) {
			var2 = -111;
		} else if (var0 == 8217) {
			var2 = -110;
		} else if (var0 == 8220) {
			var2 = -109;
		} else if (var0 == 8221) {
			var2 = -108;
		} else if (var0 == 8226) {
			var2 = -107;
		} else if (var0 == 8211) {
			var2 = -106;
		} else if (var0 == 8212) {
			var2 = -105;
		} else if (var0 == 732) {
			var2 = -104;
		} else if (var0 == 8482) {
			var2 = -103;
		} else if (var0 == 353) {
			var2 = -102;
		} else if (var0 == 8250) {
			var2 = -101;
		} else if (var0 == 339) {
			var2 = -100;
		} else if (var0 == 382) {
			var2 = -98;
		} else if (var0 == 376) {
			var2 = -97;
		} else {
			var2 = 63;
		}

		return var2;
	}

	public static Class67 method7541(int var0, int var1) {
		Class80 var3 = (Class80)Class128.field1533.get(var0);
		return var3.method2231(var1);
	}

	public static char method3288(byte var0) {
		int var2 = var0 & 255;
		if (var2 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var2, 16));
		} else {
			if (var2 >= 128 && var2 < 160) {
				char var3 = field4630[var2 - 128];
				if (var3 == 0) {
					var3 = '?';
				}

				var2 = var3;
			}

			return (char)var2;
		}
	}

	public static String method7119(byte[] var0, int var1, int var2) {
		char[] var4 = new char[var2];
		int var5 = 0;

		for (int var6 = 0; var6 < var2; ++var6) {
			int var7 = var0[var6 + var1] & 255;
			if (var7 != 0) {
				if (var7 >= 128 && var7 < 160) {
					char var8 = field4630[var7 - 128];
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
