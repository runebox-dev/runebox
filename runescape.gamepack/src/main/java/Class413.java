import io.runebox.ObfInfo;
import java.util.regex.Pattern;

@ObfInfo(name = "pw")
public final class Class413 {
	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}

	@ObfInfo(owner = "aj", name = "aq", desc = "([Ljava/lang/CharSequence;III)Ljava/lang/String;", opaque = "-347468455")
	public static String method146(CharSequence[] var0, int var1, int var2) {
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

	@ObfInfo(owner = "pm", name = "ag", desc = "(Ljava/lang/CharSequence;I)I")
	public static int method7482(CharSequence var0) {
		return method7818(var0, 10, true);
	}

	@ObfInfo(owner = "qi", name = "ak", desc = "(Ljava/lang/CharSequence;IZI)I", opaque = "-900588011")
	public static int method7818(CharSequence var0, int var1, boolean var2) {
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
						throw new NumberFormatException();
					}

					var11 = var9 - 'W';
				}

				if (var11 >= var1) {
					throw new NumberFormatException();
				}

				if (var4) {
					var11 = -var11;
				}

				int var10 = var6 * var1 + var11;
				if (var10 / var1 != var6) {
					throw new NumberFormatException();
				}

				var6 = var10;
				var5 = true;
			}

			if (!var5) {
				throw new NumberFormatException();
			} else {
				return var6;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfInfo(owner = "hl", name = "ap", desc = "(IZS)Ljava/lang/String;", opaque = "220")
	public static String method3887(int var0, boolean var1) {
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

	@ObfInfo(owner = "bj", name = "an", desc = "(Ljava/lang/CharSequence;B)I", opaque = "1")
	public static int method513(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			var3 = (var3 << 5) - var3 + Class269.method5083(var0.charAt(var4));
		}

		return var3;
	}

	@ObfInfo(owner = "lj", name = "aj", desc = "(Ljava/lang/CharSequence;I)I")
	public static int method5797(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			var3 = (var3 << 5) - var3 + var0.charAt(var4);
		}

		return var3;
	}

	@ObfInfo(owner = "mw", name = "av", desc = "(CI)Z", opaque = "1674517984")
	public static boolean method6364(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfInfo(owner = "ke", name = "ab", desc = "(CI)Z", opaque = "99679")
	public static boolean method5044(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfInfo(owner = "gt", name = "ai", desc = "(CI)Z", opaque = "1259440795")
	public static boolean method3588(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfInfo(owner = "pv", name = "ae", desc = "(Ljava/lang/String;I)Ljava/lang/String;", opaque = "85940376")
	public static String method7602(String var0) {
		StringBuilder var2 = new StringBuilder(var0.length());
		int var3 = 0;
		int var4 = -1;

		for (int var5 = 0; var5 < var0.length(); ++var5) {
			char var6 = var0.charAt(var5);
			if (var6 == '<') {
				var2.append(var0.substring(var3, var5));
				var4 = var5;
			} else if (var6 == '>' && var4 != -1) {
				String var7 = var0.substring(var4 + 1, var5);
				var4 = -1;
				if (var7.equals("lt")) {
					var2.append("<");
				} else if (var7.equals("gt")) {
					var2.append(">");
				} else if (var7.equals("br")) {
					var2.append("\n");
				}

				var3 = var5 + 1;
			}
		}

		if (var3 < var0.length()) {
			var2.append(var0.substring(var3, var0.length()));
		}

		return var2.toString();
	}

	@ObfInfo(owner = "cr", name = "au", desc = "(Ljava/lang/String;B)Ljava/lang/String;", opaque = "0")
	public static String method2000(String var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];
		byte var4 = 2;

		for (int var5 = 0; var5 < var2; ++var5) {
			char var6 = var0.charAt(var5);
			if (var4 == 0) {
				var6 = Character.toLowerCase(var6);
			} else if (var4 == 2 || Character.isUpperCase(var6)) {
				var6 = Class411.method3859(var6);
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

	@ObfInfo(owner = "li", name = "ah", desc = "(CI)Z", opaque = "845886686")
	public static boolean method5781(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfInfo(owner = "iw", name = "az", desc = "(IB)I", opaque = "2")
	public static int method4428(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
