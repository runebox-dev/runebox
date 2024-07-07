import io.runebox.ObfInfo;

@ObfInfo(name = "po")
public class Class405 {
	@ObfInfo(name = "ak", desc = "[C")
	public static final char[] field4630;

	static {
		field4630 = new char[]{'\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178'};
	}

	@ObfInfo(owner = "ea", name = "ak", desc = "(CB)B", opaque = "98")
	public static byte method2753(char var0) {
		byte var2;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 == 8364) {
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
		} else {
			var2 = (byte)var0;
		}

		return var2;
	}

	@ObfInfo(owner = "ce", name = "al", desc = "(CI)Z", opaque = "2131570085")
	public static boolean method1082(char var0) {
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var2 = field4630;

				for (int var3 = 0; var3 < var2.length; ++var3) {
					char var4 = var2[var3];
					if (var4 == var0) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfInfo(owner = "ut", name = "aj", desc = "(CI)Z", opaque = "-150416972")
	public static boolean method9865(char var0) {
		if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 160) && (var0 <= 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var2 = field4630;

				for (int var3 = 0; var3 < var2.length; ++var3) {
					char var4 = var2[var3];
					if (var4 == var0) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfInfo(owner = "qj", name = "af", desc = "(Ljava/lang/CharSequence;II[BII)I", opaque = "887001194")
	public static int method7872(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var6 = var2 - var1;

		for (int var7 = 0; var7 < var6; ++var7) {
			char var8 = var0.charAt(var7 + var1);
			if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
				if (var8 == 8364) {
					var3[var7 + var4] = -128;
				} else if (var8 == 8218) {
					var3[var7 + var4] = -126;
				} else if (var8 == 402) {
					var3[var7 + var4] = -125;
				} else if (var8 == 8222) {
					var3[var7 + var4] = -124;
				} else if (var8 == 8230) {
					var3[var7 + var4] = -123;
				} else if (var8 == 8224) {
					var3[var7 + var4] = -122;
				} else if (var8 == 8225) {
					var3[var7 + var4] = -121;
				} else if (var8 == 710) {
					var3[var7 + var4] = -120;
				} else if (var8 == 8240) {
					var3[var7 + var4] = -119;
				} else if (var8 == 352) {
					var3[var7 + var4] = -118;
				} else if (var8 == 8249) {
					var3[var7 + var4] = -117;
				} else if (var8 == 338) {
					var3[var7 + var4] = -116;
				} else if (var8 == 381) {
					var3[var7 + var4] = -114;
				} else if (var8 == 8216) {
					var3[var7 + var4] = -111;
				} else if (var8 == 8217) {
					var3[var7 + var4] = -110;
				} else if (var8 == 8220) {
					var3[var7 + var4] = -109;
				} else if (var8 == 8221) {
					var3[var7 + var4] = -108;
				} else if (var8 == 8226) {
					var3[var7 + var4] = -107;
				} else if (var8 == 8211) {
					var3[var7 + var4] = -106;
				} else if (var8 == 8212) {
					var3[var7 + var4] = -105;
				} else if (var8 == 732) {
					var3[var7 + var4] = -104;
				} else if (var8 == 8482) {
					var3[var7 + var4] = -103;
				} else if (var8 == 353) {
					var3[var7 + var4] = -102;
				} else if (var8 == 8250) {
					var3[var7 + var4] = -101;
				} else if (var8 == 339) {
					var3[var7 + var4] = -100;
				} else if (var8 == 382) {
					var3[var7 + var4] = -98;
				} else if (var8 == 376) {
					var3[var7 + var4] = -97;
				} else {
					var3[var7 + var4] = 63;
				}
			} else {
				var3[var7 + var4] = (byte)var8;
			}
		}

		return var6;
	}
}
