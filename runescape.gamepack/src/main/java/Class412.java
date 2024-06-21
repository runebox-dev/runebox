import io.runebox.ObfInfo;
import java.util.regex.Pattern;

@ObfInfo(name = "pv")
public final class Class412 {
	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}

	@ObfInfo(owner = "em", name = "ak", desc = "([Ljava/lang/CharSequence;III)Ljava/lang/String;", opaque = "286265600")
	public static String method2925(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var9 = var0[var1];
			return var9 == null ? "null" : var9.toString();
		} else {
			int var4 = var2 + var1;
			int var5 = 0;

			for (int var6 = var1; var6 < var4; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var5 += 4;
				} else {
					var5 += var7.length();
				}
			}

			StringBuilder var10 = new StringBuilder(var5);

			for (int var11 = var1; var11 < var4; ++var11) {
				CharSequence var8 = var0[var11];
				if (var8 == null) {
					var10.append("null");
				} else {
					var10.append(var8);
				}
			}

			return var10.toString();
		}
	}

	@ObfInfo(owner = "hp", name = "al", desc = "(Ljava/lang/CharSequence;I)Z")
	public static boolean method3873(CharSequence var0) {
		return method7421(var0, 10, true);
	}

	@ObfInfo(owner = "pf", name = "aj", desc = "(Ljava/lang/CharSequence;IZI)Z", opaque = "-1874922848")
	public static boolean method7421(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var4 = false;
			boolean var5 = false;
			int var6 = 0;
			int var7 = var0.length();

			for (int var8 = 0; var8 < var7; ++var8) {
				char var9 = var0.charAt(var8);
				if (var8 == 0) {
					if (var9 == '-') {
						var4 = true;
						continue;
					}

					if (var9 == '+' && var2) {
						continue;
					}
				}

				int var11;
				if (var9 >= '0' && var9 <= '9') {
					var11 = var9 - '0';
				} else if (var9 >= 'A' && var9 <= 'Z') {
					var11 = var9 - '7';
				} else {
					if (var9 < 'a' || var9 > 'z') {
						return false;
					}

					var11 = var9 - 'W';
				}

				if (var11 >= var1) {
					return false;
				}

				if (var4) {
					var11 = -var11;
				}

				int var10 = var6 * var1 + var11;
				if (var10 / var1 != var6) {
					return false;
				}

				var6 = var10;
				var5 = true;
			}

			return var5;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfInfo(owner = "gd", name = "az", desc = "(Ljava/lang/CharSequence;I)I")
	public static int method3402(CharSequence var0) {
		return Class288.method5862(var0, 10, true);
	}

	@ObfInfo(owner = "ek", name = "aa", desc = "(IZI)Ljava/lang/String;", opaque = "695243981")
	public static String method2887(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var4 = var0;
			String var3;
			if (var1 && var0 >= 0) {
				int var5 = 2;

				for (int var6 = var0 / 10; var6 != 0; ++var5) {
					var6 /= 10;
				}

				char[] var7 = new char[var5];
				var7[0] = '+';

				for (int var8 = var5 - 1; var8 > 0; --var8) {
					int var9 = var4;
					var4 /= 10;
					int var10 = var9 - var4 * 10;
					if (var10 >= 10) {
						var7[var8] = (char)(var10 + 87);
					} else {
						var7[var8] = (char)(var10 + 48);
					}
				}

				var3 = new String(var7);
			} else {
				var3 = Integer.toString(var0, 10);
			}

			return var3;
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfInfo(name = "ac", desc = "(B)V")
	public static void method7730() {
		Class378 var10000 = (Class378)null;
		String var1 = Class378.field4326;
		Class128.method2747(30, "", var1);
	}

	@ObfInfo(owner = "ne", name = "at", desc = "(Ljava/lang/CharSequence;B)I")
	public static int method6666(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			var3 = (var3 << 5) - var3 + Class405.method2753(var0.charAt(var4));
		}

		return var3;
	}

	@ObfInfo(owner = "at", name = "ac", desc = "(CB)Z", opaque = "10")
	public static boolean method293(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfInfo(owner = "dw", name = "ao", desc = "(CB)Z", opaque = "1")
	public static boolean method2605(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfInfo(owner = "oe", name = "av", desc = "(Ljava/lang/String;B)Ljava/lang/String;", opaque = "82")
	public static String method7137(String var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];
		byte var4 = 2;

		for (int var5 = 0; var5 < var2; ++var5) {
			char var6 = var0.charAt(var5);
			if (var4 == 0) {
				var6 = Character.toLowerCase(var6);
			} else if (var4 == 2 || Character.isUpperCase(var6)) {
				char var7;
				if (var6 != 181 && var6 != 402) {
					var7 = Character.toTitleCase(var6);
				} else {
					var7 = var6;
				}

				var6 = var7;
			}

			if (Character.isLetter(var6)) {
				var4 = 0;
			} else if (var6 != '.' && var6 != '?' && var6 != '!') {
				if (Character.isSpaceChar(var6)) {
					if (var4 != 2) {
						var4 = 1;
					}
				} else {
					var4 = 1;
				}
			} else {
				var4 = 2;
			}

			var3[var5] = var6;
		}

		return new String(var3);
	}

	@ObfInfo(owner = "jh", name = "aq", desc = "(CII)Ljava/lang/String;", opaque = "497086263")
	public static String method4673(char var0, int var1) {
		char[] var3 = new char[var1];

		for (int var4 = 0; var4 < var1; ++var4) {
			var3[var4] = var0;
		}

		return new String(var3);
	}

	@ObfInfo(owner = "fj", name = "ap", desc = "(Ljava/lang/CharSequence;I)Ljava/lang/String;")
	public static String method3140(CharSequence var0) {
		return method4673('*', var0.length());
	}

	@ObfInfo(owner = "as", name = "ae", desc = "(CI)Z", opaque = "635952730")
	public static boolean method289(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfInfo(owner = "nt", name = "ax", desc = "(IB)I", opaque = "0")
	public static int method7044(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
