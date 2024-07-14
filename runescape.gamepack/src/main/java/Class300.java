import io.runebox.ObfInfo;

@ObfInfo(name = "ln")
public abstract class Class300 {
	@ObfInfo(name = "ad", desc = "(Lkq;Llt;IIII)V")
	public abstract void method5013(Class277 var1, Class306 var2, int var3, int var4, int var5);

	@ObfInfo(name = "ag", desc = "(Lkq;Llw;IIB)V")
	public abstract void method5015(Class277 var1, Class309 var2, int var3, int var4);

	@ObfInfo(name = "aq", desc = "(Lkt;IIIIJ)V")
	public abstract void method5021(Class280 var1, int var2, int var3, int var4, int var5, long var6);

	@ObfInfo(name = "ae", desc = "(Lkq;Llt;IIIIIIIIIIIIIIB)V", opaque = "18")
	public void method5814(Class277 var1, Class306 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
		int var18 = Class274.method5120() + Class274.method5126() * var5 / var13;
		int var19 = Class274.method5115() + Class274.method5126() * var9 / var13;
		int var20 = Class274.method5120() + Class274.method5126() * var6 / var14;
		int var21 = Class274.method5115() + Class274.method5126() * var10 / var14;
		int var22 = Class274.method5120() + Class274.method5126() * var7 / var15;
		int var23 = Class274.method5115() + Class274.method5126() * var11 / var15;
		int var24 = Class274.method5120() + Class274.method5126() * var8 / var16;
		int var25 = Class274.method5115() + Class274.method5126() * var12 / var16;
		float var26 = Class304.method7114(var13);
		float var27 = Class304.method7114(var14);
		float var28 = Class304.method7114(var15);
		float var29 = Class304.method7114(var16);
		Class274.field2803.field3073 = 0;
		int var30;
		int var31;
		if ((var21 - var25) * (var22 - var24) - (var20 - var24) * (var23 - var25) > 0) {
			Class274.field2803.field3079 = false;
			var30 = Class274.method5127();
			if (var22 < 0 || var24 < 0 || var20 < 0 || var22 > var30 || var24 > var30 || var20 > var30) {
				Class274.field2803.field3079 = true;
			}

			if (var1.field2857 && Class277.method5315(var1.field2859, var1.field2895, var23, var25, var21, var22, var24, var20)) {
				var1.field2843 = var3;
				var1.field2876 = var4;
			}

			if (var2.field3133 == -1) {
				if (var2.field3131 != 12345678) {
					Class274.method5134(var23, var25, var21, var22, var24, var20, var28, var29, var27, var2.field3131, var2.field3132, var2.field3136);
				}
			} else if (!Class277.field2827) {
				if (var2.field3129) {
					Class274.method5137(var23, var25, var21, var22, var24, var20, var28, var29, var27, var2.field3131, var2.field3132, var2.field3136, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.field3133);
				} else {
					Class274.method5137(var23, var25, var21, var22, var24, var20, var28, var29, var27, var2.field3131, var2.field3132, var2.field3136, var7, var8, var6, var11, var12, var10, var15, var16, var14, var2.field3133);
				}
			} else {
				var31 = Class274.field2803.field3081.method5739(var2.field3133);
				Class274.method5134(var23, var25, var21, var22, var24, var20, var28, var29, var27, Class277.method5481(var31, var2.field3131), Class277.method5481(var31, var2.field3132), Class277.method5481(var31, var2.field3136));
			}
		}

		if ((var18 - var20) * (var25 - var21) - (var19 - var21) * (var24 - var20) > 0) {
			Class274.field2803.field3079 = false;
			var30 = Class274.method5127();
			if (var18 < 0 || var20 < 0 || var24 < 0 || var18 > var30 || var20 > var30 || var24 > var30) {
				Class274.field2803.field3079 = true;
			}

			if (var1.field2857 && Class277.method5315(var1.field2859, var1.field2895, var19, var21, var25, var18, var20, var24)) {
				var1.field2843 = var3;
				var1.field2876 = var4;
			}

			if (var2.field3133 == -1) {
				if (var2.field3134 != 12345678) {
					Class274.method5134(var19, var21, var25, var18, var20, var24, var26, var27, var29, var2.field3134, var2.field3136, var2.field3132);
				}
			} else if (!Class277.field2827) {
				Class274.method5137(var19, var21, var25, var18, var20, var24, var26, var27, var29, var2.field3134, var2.field3136, var2.field3132, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.field3133);
			} else {
				var31 = Class274.field2803.field3081.method5739(var2.field3133);
				Class274.method5134(var19, var21, var25, var18, var20, var24, var26, var27, var29, Class277.method5481(var31, var2.field3134), Class277.method5481(var31, var2.field3136), Class277.method5481(var31, var2.field3132));
			}
		}

	}

	@ObfInfo(name = "au", desc = "(Lkq;Llw;III)V", opaque = "616407607")
	public void method5825(Class277 var1, Class309 var2, int var3, int var4) {
		Class274.field2803.field3073 = 0;
		int var6 = var2.field3235.length;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = var2.field3235[var7];
			int var9 = var2.field3233[var7];
			int var10 = var2.field3237[var7];
			int var11 = Class309.field3238[var8];
			int var12 = Class309.field3238[var9];
			int var13 = Class309.field3238[var10];
			int var14 = Class309.field3246[var8];
			int var15 = Class309.field3246[var9];
			int var16 = Class309.field3246[var10];
			float var17 = Class309.field3245[var8];
			float var18 = Class309.field3245[var9];
			float var19 = Class309.field3245[var10];
			if ((var11 - var12) * (var16 - var15) - (var13 - var12) * (var14 - var15) > 0) {
				Class274.field2803.field3079 = false;
				int var20 = Class274.method5127();
				if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
					Class274.field2803.field3079 = true;
				}

				if (var1.field2857 && Class277.method5315(var1.field2859, var1.field2895, var14, var15, var16, var11, var12, var13)) {
					var1.field2843 = var3;
					var1.field2876 = var4;
				}

				if (var2.field3231 != null && var2.field3231[var7] != -1) {
					if (!Class277.field2827) {
						if (var2.field3239) {
							Class274.method5137(var14, var15, var16, var11, var12, var13, var17, var18, var19, var2.field3232[var7], var2.field3242[var7], var2.field3247[var7], Class309.field3236[0], Class309.field3236[1], Class309.field3236[3], Class309.field3248[0], Class309.field3248[1], Class309.field3248[3], Class309.field3249[0], Class309.field3249[1], Class309.field3249[3], var2.field3231[var7]);
						} else {
							Class274.method5137(var14, var15, var16, var11, var12, var13, var17, var18, var19, var2.field3232[var7], var2.field3242[var7], var2.field3247[var7], Class309.field3236[var8], Class309.field3236[var9], Class309.field3236[var10], Class309.field3248[var8], Class309.field3248[var9], Class309.field3248[var10], Class309.field3249[var8], Class309.field3249[var9], Class309.field3249[var10], var2.field3231[var7]);
						}
					} else {
						int var21 = Class274.field2803.field3081.method5739(var2.field3231[var7]);
						Class274.method5134(var14, var15, var16, var11, var12, var13, var17, var18, var19, Class277.method5481(var21, var2.field3232[var7]), Class277.method5481(var21, var2.field3242[var7]), Class277.method5481(var21, var2.field3247[var7]));
					}
				} else if (var2.field3232[var7] != 12345678) {
					Class274.method5134(var14, var15, var16, var11, var12, var13, var17, var18, var19, var2.field3232[var7], var2.field3242[var7], var2.field3247[var7]);
				}
			}
		}

	}
}
