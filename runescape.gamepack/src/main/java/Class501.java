import io.runebox.ObfInfo;

@ObfInfo(name = "tg")
public class Class501 {
	@ObfInfo(name = "aj", desc = "[I")
	public static int[] field5065;
	@ObfInfo(name = "an", desc = "[I")
	public static int[] field5068;

	static {
		field5068 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field5068[var0] = method8887(var0);
		}

		if (field5065 == null) {
			field5065 = new int[65536];
			double var25 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = (double)(var2 >> 10 & 63) / 64.0D + 0.0078125D;
				double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (var5 != 0.0D) {
					double var15;
					if (var7 < 0.5D) {
						var15 = (var5 + 1.0D) * var7;
					} else {
						var15 = var5 + var7 - var5 * var7;
					}

					double var17 = var7 * 2.0D - var15;
					double var19 = var3 + 0.3333333333333333D;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (var19 * 6.0D < 1.0D) {
						var9 = (var15 - var17) * 6.0D * var19 + var17;
					} else if (var19 * 2.0D < 1.0D) {
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) {
						var9 = (var15 - var17) * (0.6666666666666666D - var19) * 6.0D + var17;
					} else {
						var9 = var17;
					}

					if (var3 * 6.0D < 1.0D) {
						var11 = (var15 - var17) * 6.0D * var3 + var17;
					} else if (var3 * 2.0D < 1.0D) {
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) {
						var11 = (0.6666666666666666D - var3) * (var15 - var17) * 6.0D + var17;
					} else {
						var11 = var17;
					}

					if (var23 * 6.0D < 1.0D) {
						var13 = (var15 - var17) * 6.0D * var23 + var17;
					} else if (var23 * 2.0D < 1.0D) {
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = (var15 - var17) * (0.6666666666666666D - var23) * 6.0D + var17;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var25);
				var11 = Math.pow(var11, var25);
				var13 = Math.pow(var13, var25);
				int var26 = (int)(var9 * 256.0D);
				int var16 = (int)(var11 * 256.0D);
				int var27 = (int)(var13 * 256.0D);
				int var18 = (var26 << 16) + (var16 << 8) + var27;
				field5065[var2] = var18 & 16777215;
			}
		}

	}

	@ObfInfo(name = "aq", desc = "(II)I", opaque = "1046258857")
	public static int method8887(int var0) {
		double var2 = (double)(var0 >> 10 & 31) / 31.0D;
		double var4 = (double)(var0 >> 5 & 31) / 31.0D;
		double var6 = (double)(var0 & 31) / 31.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		int var18 = (int)(var12 * 256.0D / 6.0D);
		var18 &= 255;
		double var19 = var14 * 256.0D;
		if (var19 < 0.0D) {
			var19 = 0.0D;
		} else if (var19 > 255.0D) {
			var19 = 255.0D;
		}

		if (var16 > 0.7D) {
			var19 /= 2.0D;
			var19 = Math.floor(var19);
		}

		if (var16 > 0.75D) {
			var19 /= 2.0D;
			var19 = Math.floor(var19);
		}

		if (var16 > 0.85D) {
			var19 /= 2.0D;
			var19 = Math.floor(var19);
		}

		if (var16 > 0.95D) {
			var19 /= 2.0D;
			var19 = Math.floor(var19);
		}

		if (var16 > 0.995D) {
			var16 = 0.995D;
		}

		int var21 = (int)(var19 / 32.0D + (double)(var18 / 4 * 8));
		return (var21 << 7) + (int)(var16 * 128.0D);
	}

	@ObfInfo(name = "ad", desc = "(II)I")
	public static int method8891(int var0) {
		return 255 - (var0 & 255);
	}
}
