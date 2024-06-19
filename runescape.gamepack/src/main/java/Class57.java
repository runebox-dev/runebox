import java.util.Comparator;

public class Class57 implements Comparator {
	public boolean field426;

	public int method1072(Class403 var1, Class403 var2) {
		if (var2.field4624 == var1.field4624) {
			return 0;
		} else {
			if (this.field426) {
				if (Client.field557 == var1.field4624) {
					return -1;
				}

				if (Client.field557 == var2.field4624) {
					return 1;
				}
			}

			return var1.field4624 < var2.field4624 ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method1072((Class403)var1, (Class403)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public static boolean method1082(char var0) {
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var2 = Class405.field4630;

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

	public static byte[] method1084(int var0) {
		return Class80.method2233(var0, false);
	}

	public static void method1081(Class98 var0, Class86 var1, int var2) {
		int var5;
		int var6;
		int var8;
		Class211 var12;
		if (var1.field1111 >= Client.field778) {
			int var4 = Math.max(1, var1.field1111 - Client.field778);
			var5 = var1.field1059 * 64 + var1.field1107 * 128;
			var6 = var1.field1059 * 64 + var1.field1109 * 128;
			var1.field1065 += (var5 - var1.field1065) / var4;
			var1.field1126 += (var6 - var1.field1126) / var4;
			var1.field1129 = 0;
			var1.field1133 = var1.field1113;
		} else if (var1.field1112 >= Client.field778) {
			boolean var11 = Client.field778 == var1.field1112 || -1 == var1.field1074 || var1.field1103 != 0;
			if (!var11) {
				var12 = Class237.method4637(var1.field1074);
				if (var12 != null && !var12.method4038()) {
					var11 = 1 + var1.field1102 > var12.field2139[var1.field1101];
				} else {
					var11 = true;
				}
			}

			if (var11) {
				var5 = var1.field1112 - var1.field1111;
				var6 = Client.field778 - var1.field1111;
				int var7 = var1.field1107 * 128 + var1.field1059 * 64;
				var8 = var1.field1109 * 128 + var1.field1059 * 64;
				int var9 = var1.field1059 * 64 + var1.field1108 * 128;
				int var10 = var1.field1059 * 64 + var1.field1110 * 128;
				var1.field1065 = (var7 * (var5 - var6) + var9 * var6) / var5;
				var1.field1126 = (var10 * var6 + (var5 - var6) * var8) / var5;
			}

			var1.field1129 = 0;
			var1.field1133 = var1.field1113;
			var1.field1060 = var1.field1133;
		} else {
			Client.method3707(var1);
		}

		if (var1.field1065 < 128 || var1.field1126 < 128 || var1.field1065 >= 13184 || var1.field1126 >= 13184) {
			var1.field1074 = -1;
			var1.field1111 = 0;
			var1.field1112 = 0;
			var1.method2314();
			var1.field1065 = var1.field1080[0] * 128 + var1.field1059 * 64;
			var1.field1126 = var1.field1127[0] * 128 + var1.field1059 * 64;
			var1.method2307();
		}

		if (Client.field107 == var1 && (var1.field1065 < 1536 || var1.field1126 < 1536 || var1.field1065 >= 11776 || var1.field1126 >= 11776)) {
			var1.field1074 = -1;
			var1.field1111 = 0;
			var1.field1112 = 0;
			var1.method2314();
			var1.field1065 = var1.field1059 * 64 + var1.field1080[0] * 128;
			var1.field1126 = var1.field1059 * 64 + var1.field1127[0] * 128;
			var1.method2307();
		}

		Class358.method7092(var0, var1);
		var1.field1058 = false;
		if (var1.field1096 != -1) {
			Class211 var13 = Class237.method4637(var1.field1096);
			if (var13 != null) {
				if (!var13.method4038() && var13.field2142 != null) {
					++var1.field1098;
					if (var1.field1122 < var13.field2142.length && var1.field1098 > var13.field2139[var1.field1122]) {
						var1.field1098 = 1;
						++var1.field1122;
						Client.method2455(var13, var1.field1122, var1.field1065, var1.field1126, var1);
					}

					if (var1.field1122 >= var13.field2142.length) {
						if (var13.field2143 > 0) {
							var1.field1122 -= var13.field2143;
							if (var13.field2149) {
								++var1.field1099;
							}

							if (var1.field1122 < 0 || var1.field1122 >= var13.field2142.length || var13.field2149 && var1.field1099 >= var13.field2145) {
								var1.field1098 = 0;
								var1.field1122 = 0;
								var1.field1099 = 0;
							}
						} else {
							var1.field1098 = 0;
							var1.field1122 = 0;
						}

						Client.method2455(var13, var1.field1122, var1.field1065, var1.field1126, var1);
					}
				} else if (var13.method4038()) {
					++var1.field1122;
					var5 = var13.method4005();
					if (var1.field1122 < var5) {
						Client.method794(var13, var1.field1122, var1.field1065, var1.field1126, var1);
					} else {
						if (var13.field2143 > 0) {
							var1.field1122 -= var13.field2143;
							if (var13.field2149) {
								++var1.field1099;
							}

							if (var1.field1122 < 0 || var1.field1122 >= var5 || var13.field2149 && var1.field1099 >= var13.field2145) {
								var1.field1122 = 0;
								var1.field1098 = 0;
								var1.field1099 = 0;
							}
						} else {
							var1.field1098 = 0;
							var1.field1122 = 0;
						}

						Client.method794(var13, var1.field1122, var1.field1065, var1.field1126, var1);
					}
				} else {
					var1.field1096 = -1;
				}
			} else {
				var1.field1096 = -1;
			}
		}

		Class495 var14 = new Class495(var1.method2313());

		for (Class485 var15 = (Class485)var14.method8982(); var15 != null; var15 = (Class485)var14.next()) {
			if (var15.field4964 != -1 && Client.field778 >= var15.field4966) {
				var6 = Class224.method4163(var15.field4964).field2301;
				if (var6 == -1) {
					var15.method9277();
					--var1.field1106;
				} else {
					var15.field4965 = Math.max(var15.field4965, 0);
					Class211 var16 = Class237.method4637(var6);
					if (var16.field2142 != null && !var16.method4038()) {
						++var15.field4963;
						if (var15.field4965 < var16.field2142.length && var15.field4963 > var16.field2139[var15.field4965]) {
							var15.field4963 = 1;
							++var15.field4965;
							Client.method2455(var16, var15.field4965, var1.field1065, var1.field1126, var1);
						}

						if (var15.field4965 >= var16.field2142.length) {
							var15.method9277();
							--var1.field1106;
						}
					} else if (var16.method4038()) {
						++var15.field4965;
						var8 = var16.method4005();
						if (var15.field4965 < var8) {
							Client.method794(var16, var15.field4965, var1.field1065, var1.field1126, var1);
						} else {
							var15.method9277();
							--var1.field1106;
						}
					} else {
						var15.method9277();
						--var1.field1106;
					}
				}
			}
		}

		if (-1 != var1.field1074 && var1.field1103 <= 1) {
			var12 = Class237.method4637(var1.field1074);
			if (var12.field2150 == 1 && var1.field1077 > 0 && var1.field1111 <= Client.field778 && var1.field1112 < Client.field778) {
				var1.field1103 = 1;
				return;
			}
		}

		if (var1.field1074 != -1 && var1.field1103 == 0) {
			var12 = Class237.method4637(var1.field1074);
			if (var12 == null) {
				var1.field1074 = -1;
			} else if (!var12.method4038() && var12.field2142 != null) {
				++var1.field1102;
				if (var1.field1101 < var12.field2142.length && var1.field1102 > var12.field2139[var1.field1101]) {
					var1.field1102 = 1;
					++var1.field1101;
					Client.method2455(var12, var1.field1101, var1.field1065, var1.field1126, var1);
				}

				if (var1.field1101 >= var12.field2142.length) {
					var1.field1101 -= var12.field2143;
					++var1.field1090;
					if (var1.field1090 >= var12.field2145) {
						var1.field1074 = -1;
					} else if (var1.field1101 >= 0 && var1.field1101 < var12.field2142.length) {
						Client.method2455(var12, var1.field1101, var1.field1065, var1.field1126, var1);
					} else {
						var1.field1074 = -1;
					}
				}

				var1.field1058 = var12.field2144;
			} else if (var12.method4038()) {
				++var1.field1101;
				var6 = var12.method4005();
				if (var1.field1101 < var6) {
					Client.method794(var12, var1.field1101, var1.field1065, var1.field1126, var1);
				} else {
					var1.field1101 -= var12.field2143;
					++var1.field1090;
					if (var1.field1090 >= var12.field2145) {
						var1.field1074 = -1;
					} else if (var1.field1101 >= 0 && var1.field1101 < var6) {
						Client.method794(var12, var1.field1101, var1.field1065, var1.field1126, var1);
					} else {
						var1.field1074 = -1;
					}
				}
			} else {
				var1.field1074 = -1;
			}
		}

		if (var1.field1103 > 0) {
			--var1.field1103;
		}

	}
}
