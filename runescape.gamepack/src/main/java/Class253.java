import io.runebox.ObfInfo;

@ObfInfo(name = "js")
public class Class253 {
	@ObfInfo(name = "at", desc = "Lja;")
	public static Class235 field2689;
	@ObfInfo(name = "aa", desc = "Lkp;")
	public static Class276 field2688;
	@ObfInfo(name = "az", desc = "[I")
	public static int[] field2683;
	@ObfInfo(name = "ak", desc = "[I")
	public static int[] field2684;
	@ObfInfo(name = "aj", desc = "[I")
	public static int[] field2685;
	@ObfInfo(name = "af", desc = "[I")
	public static int[] field2687;
	@ObfInfo(name = "al", desc = "[I")
	public static int[] field2691;
	@ObfInfo(name = "ac", desc = "Lja;")
	public static final Class235 field2686;
	@ObfInfo(name = "ab", desc = "Lja;")
	public static final Class235 field2690;

	static {
		field2684 = new int[65536];
		field2691 = new int[512];
		field2685 = new int[2048];
		field2683 = new int[2048];
		field2687 = new int[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field2691[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field2685[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			field2683[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
			field2687[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
		}

		field2688 = new Class276();
		field2690 = new Class275(field2688);
		field2686 = new Class271(field2688);
		field2689 = field2690;
	}

	@ObfInfo(name = "ak", desc = "(Z)V")
	public static void method4801(boolean var0) {
		if (var0 && Class561.field5421 != null) {
			field2689 = field2686;
		} else {
			field2689 = field2690;
		}

	}

	@ObfInfo(name = "al", desc = "(Lkc;)V")
	public static void method4783(Class263 var0) {
		field2688.field3043 = var0;
	}

	@ObfInfo(name = "aj", desc = "(D)V")
	public static void method4784(double var0) {
		method4785(var0, 0, 512);
	}

	@ObfInfo(name = "az", desc = "(DII)V")
	public static void method4785(double var0, int var2, int var3) {
		int var4 = var2 * 128;

		for (int var5 = var2; var5 < var3; ++var5) {
			double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
			double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

			for (int var10 = 0; var10 < 128; ++var10) {
				double var11 = (double)var10 / 128.0D;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0D) {
					double var19;
					if (var11 < 0.5D) {
						var19 = var11 * (1.0D + var8);
					} else {
						var19 = var11 + var8 - var11 * var8;
					}

					double var21 = 2.0D * var11 - var19;
					double var23 = var6 + 0.3333333333333333D;
					if (var23 > 1.0D) {
						--var23;
					}

					double var27 = var6 - 0.3333333333333333D;
					if (var27 < 0.0D) {
						++var27;
					}

					if (6.0D * var23 < 1.0D) {
						var13 = var21 + (var19 - var21) * 6.0D * var23;
					} else if (2.0D * var23 < 1.0D) {
						var13 = var19;
					} else if (3.0D * var23 < 2.0D) {
						var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var21;
					}

					if (6.0D * var6 < 1.0D) {
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					} else if (2.0D * var6 < 1.0D) {
						var15 = var19;
					} else if (3.0D * var6 < 2.0D) {
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var15 = var21;
					}

					if (6.0D * var27 < 1.0D) {
						var17 = var21 + (var19 - var21) * 6.0D * var27;
					} else if (2.0D * var27 < 1.0D) {
						var17 = var19;
					} else if (3.0D * var27 < 2.0D) {
						var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
					} else {
						var17 = var21;
					}
				}

				int var30 = (int)(var13 * 256.0D);
				int var20 = (int)(var15 * 256.0D);
				int var29 = (int)(var17 * 256.0D);
				int var22 = (var30 << 16) + (var20 << 8) + var29;
				var22 = method4817(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				field2684[var4++] = var22;
			}
		}

	}

	@ObfInfo(name = "af", desc = "(ID)I")
	public static int method4817(int var0, double var1) {
		double var3 = (double)(var0 >> 16) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(var7 * 256.0D);
		return (var9 << 16) + (var10 << 8) + var11;
	}

	@ObfInfo(name = "aa", desc = "()I")
	public static int method4805() {
		return field2688.field3048;
	}

	@ObfInfo(name = "at", desc = "()I")
	public static int method4788() {
		return field2688.field3050;
	}

	@ObfInfo(name = "ab", desc = "()I")
	public static int method4840() {
		return field2688.field3037;
	}

	@ObfInfo(name = "ac", desc = "()I")
	public static int method4789() {
		return field2688.field3054;
	}

	@ObfInfo(name = "ao", desc = "()I")
	public static int method4790() {
		return field2688.field3056;
	}

	@ObfInfo(name = "ah", desc = "()I")
	public static int method4854() {
		return field2688.field3055;
	}

	@ObfInfo(name = "av", desc = "()I")
	public static int method4792() {
		return field2688.field3042;
	}

	@ObfInfo(name = "aq", desc = "()I")
	public static int method4863() {
		return field2688.field3051;
	}

	@ObfInfo(name = "ap", desc = "([III[F)V")
	public static void method4794(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && field2689 == field2686) {
			field2689 = field2690;
		}

		field2689.method4512(var0, var1, var2, var3);
	}

	@ObfInfo(name = "ae", desc = "()V")
	public static void method4851() {
		method4796(Class561.field5424, Class561.field5422, Class561.field5425, Class561.field5419);
	}

	@ObfInfo(name = "ax", desc = "(IIII)V")
	public static void method4796(int var0, int var1, int var2, int var3) {
		field2688.field3051 = var2 - var0;
		field2688.field3052 = var3 - var1;
		method4797();
		if (field2688.field3057.length < field2688.field3052) {
			field2688.field3057 = new int[Class248.method4765(field2688.field3052)];
		}

		int var4 = Class87.field5423 * var1 + var0;

		for (int var5 = 0; var5 < field2688.field3052; ++var5) {
			field2688.field3057[var5] = var4;
			var4 += Class87.field5423;
		}

	}

	@ObfInfo(name = "ay", desc = "()V")
	public static void method4797() {
		field2688.method5550();
	}

	@ObfInfo(name = "au", desc = "(II)V")
	public static void method4798(int var0, int var1) {
		int var2 = field2688.field3057[0];
		int var3 = var2 / Class87.field5423;
		int var4 = var2 - Class87.field5423 * var3;
		field2688.method5549(var0, var4, var1, var3);
	}

	@ObfInfo(name = "as", desc = "(III)V")
	public static void method4781(int var0, int var1, int var2) {
		field2688.method5552(var0, var1, var2);
	}

	@ObfInfo(name = "aw", desc = "(IIIIIIFFFIII)V")
	public static void method4800(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2689.method4524(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfInfo(name = "ad", desc = "(IIIIIIFFFI)V")
	public static void method4831(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
		field2689.method4518(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfInfo(name = "ai", desc = "(IIIIIIFFFIIIIIIIIIIIII)V")
	public static void method4802(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2689.method4519(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfInfo(name = "an", desc = "(IIIIIIFFFIIIIIIIIIIIII)V")
	public static void method4803(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2689.method4520(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfInfo(name = "am", desc = "(IIIIIIFFFIIIBBBB)V")
	public static void method4804(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
		field2689.method4515(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
	}

	@ObfInfo(name = "ar", desc = "(IIIIIIFFFIBBBB)V")
	public static void method4842(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
		field2689.method4516(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
	}
}
