import java.net.URL;

public class Class64 {
	public static int field469;
	public static int field470;
	public static int[] field471;
	public static int[] field472;
	public int field473;
	public int field475;
	public int field478;
	public int field480;
	public int field482;
	public String field467;
	public String field476;
	public String field477;

	static {
		field469 = 0;
		field470 = 0;
		field471 = new int[]{1, 1, 1, 1};
		field472 = new int[]{0, 1, 2, 3};
	}

	public boolean method1175() {
		return (Class534.field5282.method175() & this.field480) != 0;
	}

	public boolean method1139() {
		return (Class534.field5281.method175() & this.field480) != 0;
	}

	public boolean method1155() {
		return (Class534.field5265.method175() & this.field480) != 0;
	}

	public boolean method1147() {
		return (Class534.field5267.method175() & this.field480) != 0;
	}

	public boolean method1142() {
		return (Class534.field5271.method175() & this.field480) != 0;
	}

	public boolean method1143() {
		return (Class534.field5294.method175() & this.field480) != 0;
	}

	public boolean method1144() {
		return (Class534.field5290.method175() & this.field480) != 0;
	}

	public boolean method1189() {
		return (Class534.field5295.method175() & this.field480) != 0;
	}

	public boolean method1146() {
		return (Class534.field5268.method175() & this.field480) != 0;
	}

	public boolean method1187() {
		return (Class534.field5270.method175() & this.field480) != 0;
	}

	public static boolean method7411() {
		try {
			if (Class76.field53 == null) {
				Class76.field53 = Client.field3381.method2759(new URL(Client.field2657));
			} else if (Class76.field53.method2742()) {
				byte[] var1 = Class76.field53.method2743();
				Class521 var2 = new Class521(var1);
				var2.method9410();
				field469 = var2.method9407();
				Class76.field4598 = new Class64[field469];

				Class64 var4;
				for (int var3 = 0; var3 < field469; var4.field478 = var3++) {
					var4 = Class76.field4598[var3] = new Class64();
					var4.field473 = var2.method9407();
					var4.field480 = var2.method9410();
					var4.field476 = var2.method9415();
					var4.field477 = var2.method9415();
					var4.field482 = var2.method9405();
					var4.field475 = var2.method9535();
				}

				method5396(Class76.field4598, 0, Class76.field4598.length - 1, field472, field471);
				Class76.field53 = null;
				return true;
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			Class76.field53 = null;
		}

		return false;
	}

	public static void method4643(int var0, int var1) {
		int[] var3 = new int[4];
		int[] var4 = new int[4];
		var3[0] = var0;
		var4[0] = var1;
		int var5 = 1;

		for (int var6 = 0; var6 < 4; ++var6) {
			if (field472[var6] != var0) {
				var3[var5] = field472[var6];
				var4[var5] = field471[var6];
				++var5;
			}
		}

		field472 = var3;
		field471 = var4;
		method5396(Class76.field4598, 0, Class76.field4598.length - 1, field472, field471);
	}

	public static void method5396(Class64[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var6 = var1 - 1;
			int var7 = var2 + 1;
			int var8 = (var2 + var1) / 2;
			Class64 var9 = var0[var8];
			var0[var8] = var0[var1];
			var0[var1] = var9;

			while (var6 < var7) {
				boolean var10 = true;

				int var11;
				int var12;
				int var13;
				do {
					--var7;

					for (var11 = 0; var11 < 4; ++var11) {
						if (2 == var3[var11]) {
							var12 = var0[var7].field478;
							var13 = var9.field478;
						} else if (var3[var11] == 1) {
							var12 = var0[var7].field475;
							var13 = var9.field475;
							if (var12 == -1 && 1 == var4[var11]) {
								var12 = 2001;
							}

							if (var13 == -1 && 1 == var4[var11]) {
								var13 = 2001;
							}
						} else if (3 == var3[var11]) {
							var12 = var0[var7].method1175() ? 1 : 0;
							var13 = var9.method1175() ? 1 : 0;
						} else {
							var12 = var0[var7].field473;
							var13 = var9.field473;
						}

						if (var13 != var12) {
							if ((var4[var11] != 1 || var12 <= var13) && (0 != var4[var11] || var12 >= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				var10 = true;

				do {
					++var6;

					for (var11 = 0; var11 < 4; ++var11) {
						if (2 == var3[var11]) {
							var12 = var0[var6].field478;
							var13 = var9.field478;
						} else if (1 == var3[var11]) {
							var12 = var0[var6].field475;
							var13 = var9.field475;
							if (var12 == -1 && 1 == var4[var11]) {
								var12 = 2001;
							}

							if (var13 == -1 && 1 == var4[var11]) {
								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var6].method1175() ? 1 : 0;
							var13 = var9.method1175() ? 1 : 0;
						} else {
							var12 = var0[var6].field473;
							var13 = var9.field473;
						}

						if (var13 != var12) {
							if ((1 != var4[var11] || var12 >= var13) && (0 != var4[var11] || var12 <= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				if (var6 < var7) {
					Class64 var14 = var0[var6];
					var0[var6] = var0[var7];
					var0[var7] = var14;
				}
			}

			method5396(var0, var1, var7, var3, var4);
			method5396(var0, var7 + 1, var2, var3, var4);
		}

	}

	public static void method8652(int var0, boolean var1, int var2, boolean var3) {
		if (Class76.field4598 != null) {
			method3694(0, Class76.field4598.length - 1, var0, var1, var2, var3);
		}

	}

	public static void method3694(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var7 = (var1 + var0) / 2;
			int var8 = var0;
			Class64 var9 = Class76.field4598[var7];
			Class76.field4598[var7] = Class76.field4598[var1];
			Class76.field4598[var1] = var9;

			for (int var10 = var0; var10 < var1; ++var10) {
				if (method3596(Class76.field4598[var10], var9, var2, var3, var4, var5) <= 0) {
					Class64 var11 = Class76.field4598[var10];
					Class76.field4598[var10] = Class76.field4598[var8];
					Class76.field4598[var8++] = var11;
				}
			}

			Class76.field4598[var1] = Class76.field4598[var8];
			Class76.field4598[var8] = var9;
			method3694(var0, var8 - 1, var2, var3, var4, var5);
			method3694(var8 + 1, var1, var2, var3, var4, var5);
		}

	}

	public static int method3596(Class64 var0, Class64 var1, int var2, boolean var3, int var4, boolean var5) {
		int var7 = method4904(var0, var1, var2, var3);
		if (var7 != 0) {
			return var3 ? -var7 : var7;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var8 = method4904(var0, var1, var4, var5);
			return var5 ? -var8 : var8;
		}
	}

	public static int method4904(Class64 var0, Class64 var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var5 = var0.field475;
			int var6 = var1.field475;
			if (!var3) {
				if (var5 == -1) {
					var5 = 2001;
				}

				if (var6 == -1) {
					var6 = 2001;
				}
			}

			return var5 - var6;
		} else if (var2 == 2) {
			return var0.field482 - var1.field482;
		} else if (var2 == 3) {
			if (var0.field477.equals("-")) {
				if (var1.field477.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.field477.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.field477.compareTo(var1.field477);
			}
		} else if (var2 == 4) {
			return var0.method1142() ? (var1.method1142() ? 0 : 1) : (var1.method1142() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1155() ? (var1.method1155() ? 0 : 1) : (var1.method1155() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.method1147() ? (var1.method1147() ? 0 : 1) : (var1.method1147() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.method1175() ? (var1.method1175() ? 0 : 1) : (var1.method1175() ? -1 : 0);
		} else {
			return var0.field473 - var1.field473;
		}
	}

	public static Class64 method4486() {
		field470 = 0;
		return method3086();
	}

	public static Class64 method3086() {
		return field470 < field469 ? Class76.field4598[++field470 - 1] : null;
	}

	public static Class219 method1191(Class521 var0) {
		if (var0 != null) {
			boolean var2 = false;
			boolean var3 = false;
			boolean var4 = false;
			boolean var5 = false;
			int var6 = var0.method9407();
			int var7 = var0.method9405();
			int var8 = var0.method9405();
			int var9 = var0.method9405();
			if (var6 >= 1 && var7 >= 1 && var8 >= 0 && var9 >= 0) {
				return new Class219(var6, var7, var8, var9);
			}
		}

		return null;
	}
}
