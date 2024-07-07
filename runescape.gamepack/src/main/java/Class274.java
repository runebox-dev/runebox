import io.runebox.ObfInfo;

@ObfInfo(name = "kn")
public class Class274 {
	@ObfInfo(name = "aj", desc = "Lky;")
	public static Class285 field2801;
	@ObfInfo(name = "an", desc = "Llo;")
	public static Class301 field2803;
	@ObfInfo(name = "ad", desc = "[I")
	public static int[] field2802;
	@ObfInfo(name = "ak", desc = "[I")
	public static int[] field2804;
	@ObfInfo(name = "ap", desc = "[I")
	public static int[] field2805;
	@ObfInfo(name = "aq", desc = "[I")
	public static int[] field2806;
	@ObfInfo(name = "ag", desc = "[I")
	public static int[] field2807;
	@ObfInfo(name = "av", desc = "Lky;")
	public static final Class285 field2808;
	@ObfInfo(name = "ab", desc = "Lky;")
	public static final Class285 field2809;

	static {
		field2806 = new int[65536];
		field2802 = new int[512];
		field2807 = new int[2048];
		field2804 = new int[2048];
		field2805 = new int[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field2802[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field2807[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			field2804[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
			field2805[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
		}

		field2803 = new Class301();
		field2808 = new Class290(field2803);
		field2809 = new Class312(field2803);
		field2801 = field2808;
	}

	@ObfInfo(name = "aq", desc = "(Z)V")
	public static void method5194(boolean var0) {
		if (var0 && Class569.field5506 != null) {
			field2801 = field2809;
		} else {
			field2801 = field2808;
		}

	}

	@ObfInfo(name = "ad", desc = "(Llh;)V")
	public static void method5178(Class294 var0) {
		field2803.field3081 = var0;
	}

	@ObfInfo(name = "ag", desc = "(D)V")
	public static void method5117(double var0) {
		method5118(var0, 0, 512);
	}

	@ObfInfo(name = "ak", desc = "(DII)V")
	public static void method5118(double var0, int var2, int var3) {
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
				var22 = method5119(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				field2806[var4++] = var22;
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(ID)I")
	public static int method5119(int var0, double var1) {
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

	@ObfInfo(name = "an", desc = "()I")
	public static int method5120() {
		return field2803.field3083;
	}

	@ObfInfo(name = "aj", desc = "()I")
	public static int method5115() {
		return field2803.field3084;
	}

	@ObfInfo(name = "av", desc = "()I")
	public static int method5121() {
		return field2803.field3075;
	}

	@ObfInfo(name = "ab", desc = "()I")
	public static int method5123() {
		return field2803.field3088;
	}

	@ObfInfo(name = "ai", desc = "()I")
	public static int method5124() {
		return field2803.field3077;
	}

	@ObfInfo(name = "ae", desc = "()I")
	public static int method5140() {
		return field2803.field3076;
	}

	@ObfInfo(name = "au", desc = "()I")
	public static int method5126() {
		return field2803.field3071;
	}

	@ObfInfo(name = "ah", desc = "()I")
	public static int method5127() {
		return field2803.field3085;
	}

	@ObfInfo(name = "az", desc = "([III[F)V")
	public static void method5128(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && field2801 == field2809) {
			field2801 = field2808;
		}

		field2801.method5640(var0, var1, var2, var3);
	}

	@ObfInfo(name = "ax", desc = "()V")
	public static void method5171() {
		method5130(Class569.field5508, Class569.field5505, Class569.field5509, Class569.field5507);
	}

	@ObfInfo(name = "ac", desc = "(IIII)V")
	public static void method5130(int var0, int var1, int var2, int var3) {
		field2803.field3085 = var2 - var0;
		field2803.field3086 = var3 - var1;
		method5131();
		if (field2803.field3091.length < field2803.field3086) {
			field2803.field3091 = new int[Class337.method7475(field2803.field3086)];
		}

		int var4 = Class88.field5502 * var1 + var0;

		for (int var5 = 0; var5 < field2803.field3086; ++var5) {
			field2803.field3091[var5] = var4;
			var4 += Class88.field5502;
		}

	}

	@ObfInfo(name = "al", desc = "()V")
	public static void method5131() {
		field2803.method5835();
	}

	@ObfInfo(name = "ay", desc = "(II)V")
	public static void method5176(int var0, int var1) {
		int var2 = field2803.field3091[0];
		int var3 = var2 / Class88.field5502;
		int var4 = var2 - Class88.field5502 * var3;
		field2803.method5836(var0, var4, var1, var3);
	}

	@ObfInfo(name = "ao", desc = "(III)V")
	public static void method5195(int var0, int var1, int var2) {
		field2803.method5837(var0, var1, var2);
	}

	@ObfInfo(name = "aa", desc = "(IIIIIIFFFIII)V")
	public static void method5134(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2801.method5645(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfInfo(name = "as", desc = "(IIIIIIFFFI)V")
	public static void method5135(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
		field2801.method5646(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfInfo(name = "aw", desc = "(IIIIIIFFFIIIIIIIIIIIII)V")
	public static void method5136(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2801.method5655(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfInfo(name = "at", desc = "(IIIIIIFFFIIIIIIIIIIIII)V")
	public static void method5137(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2801.method5648(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfInfo(name = "af", desc = "(IIIIIIFFFIIIBBBB)V")
	public static void method5138(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
		field2801.method5643(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
	}

	@ObfInfo(name = "am", desc = "(IIIIIIFFFIBBBB)V")
	public static void method5139(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
		field2801.method5677(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
	}
}
