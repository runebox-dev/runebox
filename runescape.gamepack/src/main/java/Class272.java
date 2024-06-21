import io.runebox.ObfInfo;

public abstract class Class272 {
	@ObfInfo(name = "al", desc = "(Ljy;Lkg;IIIB)V")
	public abstract void method4662(Class259 var1, Class267 var2, int var3, int var4, int var5);

	@ObfInfo(name = "ak", desc = "(Lju;IIIIJ)V")
	public abstract void method4663(Class255 var1, int var2, int var3, int var4, int var5, long var6);

	@ObfInfo(name = "aj", desc = "(Ljy;Lke;IIB)V")
	public abstract void method4672(Class259 var1, Class265 var2, int var3, int var4);

	@ObfInfo(name = "av", desc = "(Ljy;Lkg;IIIIIIIIIIIIIII)V", opaque = "-1990979035")
	public void method5463(Class259 var1, Class267 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
		int var18 = Class253.method4805() + Class253.method4792() * var5 / var13;
		int var19 = Class253.method4788() + Class253.method4792() * var9 / var13;
		int var20 = Class253.method4805() + Class253.method4792() * var6 / var14;
		int var21 = Class253.method4788() + Class253.method4792() * var10 / var14;
		int var22 = Class253.method4805() + Class253.method4792() * var7 / var15;
		int var23 = Class253.method4788() + Class253.method4792() * var11 / var15;
		int var24 = Class253.method4805() + Class253.method4792() * var8 / var16;
		int var25 = Class253.method4788() + Class253.method4792() * var12 / var16;
		float var26 = Class264.method3408(var13);
		float var27 = Class264.method3408(var14);
		float var28 = Class264.method3408(var15);
		float var29 = Class264.method3408(var16);
		Class253.field2688.field3049 = 0;
		int var30;
		int var31;
		if ((var22 - var24) * (var21 - var25) - (var23 - var25) * (var20 - var24) > 0) {
			Class253.field2688.field3039 = false;
			var30 = Class253.method4863();
			if (var22 < 0 || var24 < 0 || var20 < 0 || var22 > var30 || var24 > var30 || var20 > var30) {
				Class253.field2688.field3039 = true;
			}

			if (var1.field2757 && Class259.method4988(var1.field2761, var1.field2762, var23, var25, var21, var22, var24, var20)) {
				var1.field2763 = var3;
				var1.field2764 = var4;
			}

			if (-1 == var2.field2967) {
				if (var2.field2965 != 12345678) {
					Class253.method4800(var23, var25, var21, var22, var24, var20, var28, var29, var27, var2.field2965, var2.field2964, var2.field2966);
				}
			} else if (!Class259.field2782) {
				if (var2.field2968) {
					Class253.method4803(var23, var25, var21, var22, var24, var20, var28, var29, var27, var2.field2965, var2.field2964, var2.field2966, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.field2967);
				} else {
					Class253.method4803(var23, var25, var21, var22, var24, var20, var28, var29, var27, var2.field2965, var2.field2964, var2.field2966, var7, var8, var6, var11, var12, var10, var15, var16, var14, var2.field2967);
				}
			} else {
				var31 = Class253.field2688.field3043.method4718(var2.field2967);
				Class253.method4800(var23, var25, var21, var22, var24, var20, var28, var29, var27, Class259.method4987(var31, var2.field2965), Class259.method4987(var31, var2.field2964), Class259.method4987(var31, var2.field2966));
			}
		}

		if ((var18 - var20) * (var25 - var21) - (var24 - var20) * (var19 - var21) > 0) {
			Class253.field2688.field3039 = false;
			var30 = Class253.method4863();
			if (var18 < 0 || var20 < 0 || var24 < 0 || var18 > var30 || var20 > var30 || var24 > var30) {
				Class253.field2688.field3039 = true;
			}

			if (var1.field2757 && Class259.method4988(var1.field2761, var1.field2762, var19, var21, var25, var18, var20, var24)) {
				var1.field2763 = var3;
				var1.field2764 = var4;
			}

			if (var2.field2967 == -1) {
				if (12345678 != var2.field2963) {
					Class253.method4800(var19, var21, var25, var18, var20, var24, var26, var27, var29, var2.field2963, var2.field2966, var2.field2964);
				}
			} else if (!Class259.field2782) {
				Class253.method4803(var19, var21, var25, var18, var20, var24, var26, var27, var29, var2.field2963, var2.field2966, var2.field2964, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.field2967);
			} else {
				var31 = Class253.field2688.field3043.method4718(var2.field2967);
				Class253.method4800(var19, var21, var25, var18, var20, var24, var26, var27, var29, Class259.method4987(var31, var2.field2963), Class259.method4987(var31, var2.field2966), Class259.method4987(var31, var2.field2964));
			}
		}

	}

	@ObfInfo(name = "aq", desc = "(Ljy;Lke;IIB)V", opaque = "1")
	public void method5472(Class259 var1, Class265 var2, int var3, int var4) {
		Class253.field2688.field3049 = 0;
		int var6 = var2.field2937.length;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = var2.field2937[var7];
			int var9 = var2.field2930[var7];
			int var10 = var2.field2931[var7];
			int var11 = Class265.field2938[var8];
			int var12 = Class265.field2938[var9];
			int var13 = Class265.field2938[var10];
			int var14 = Class265.field2939[var8];
			int var15 = Class265.field2939[var9];
			int var16 = Class265.field2939[var10];
			float var17 = Class265.field2940[var8];
			float var18 = Class265.field2940[var9];
			float var19 = Class265.field2940[var10];
			if ((var11 - var12) * (var16 - var15) - (var14 - var15) * (var13 - var12) > 0) {
				Class253.field2688.field3039 = false;
				int var20 = Class253.method4863();
				if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
					Class253.field2688.field3039 = true;
				}

				if (var1.field2757 && Class259.method4988(var1.field2761, var1.field2762, var14, var15, var16, var11, var12, var13)) {
					var1.field2763 = var3;
					var1.field2764 = var4;
				}

				if (var2.field2932 != null && var2.field2932[var7] != -1) {
					if (!Class259.field2782) {
						if (var2.field2935) {
							Class253.method4803(var14, var15, var16, var11, var12, var13, var17, var18, var19, var2.field2926[var7], var2.field2927[var7], var2.field2925[var7], Class265.field2941[0], Class265.field2941[1], Class265.field2941[3], Class265.field2942[0], Class265.field2942[1], Class265.field2942[3], Class265.field2943[0], Class265.field2943[1], Class265.field2943[3], var2.field2932[var7]);
						} else {
							Class253.method4803(var14, var15, var16, var11, var12, var13, var17, var18, var19, var2.field2926[var7], var2.field2927[var7], var2.field2925[var7], Class265.field2941[var8], Class265.field2941[var9], Class265.field2941[var10], Class265.field2942[var8], Class265.field2942[var9], Class265.field2942[var10], Class265.field2943[var8], Class265.field2943[var9], Class265.field2943[var10], var2.field2932[var7]);
						}
					} else {
						int var21 = Class253.field2688.field3043.method4718(var2.field2932[var7]);
						Class253.method4800(var14, var15, var16, var11, var12, var13, var17, var18, var19, Class259.method4987(var21, var2.field2926[var7]), Class259.method4987(var21, var2.field2927[var7]), Class259.method4987(var21, var2.field2925[var7]));
					}
				} else if (12345678 != var2.field2926[var7]) {
					Class253.method4800(var14, var15, var16, var11, var12, var13, var17, var18, var19, var2.field2926[var7], var2.field2927[var7], var2.field2925[var7]);
				}
			}
		}

	}
}
