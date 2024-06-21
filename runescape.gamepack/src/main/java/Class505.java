import io.runebox.ObfInfo;

public class Class505 {
	@ObfInfo(name = "aa", desc = "[I")
	public static int[] field5166;

	static {
		field5166 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field5166[var0] = method9264(var0);
		}

		method9266();
	}

	@ObfInfo(name = "al", desc = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", opaque = "-655791540")
	public static void method9272(int var0, String var1, String var2, String var3) {
		Class80 var5 = (Class80)Class128.field1533.get(var0);
		if (var5 == null) {
			var5 = new Class80();
			Class128.field1533.put(var0, var5);
		}

		Class67 var6 = var5.method2224(var0, var1, var2, var3);
		Class128.field1529.method9333(var6, (long)var6.field833);
		Class128.field1528.method7389(var6);
		Client.field686 = Client.field677;
	}

	@ObfInfo(name = "ak", desc = "(II)I", opaque = "-303194213")
	public static int method9264(int var0) {
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
		double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
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
		return (int)(var16 * 128.0D) + (var21 << 7);
	}

	@ObfInfo(name = "al", desc = "(I)V", opaque = "273354446")
	public static void method9266() {
		if (Client.field5165 == null) {
			Client.field5165 = new int[65536];
			double var1 = 0.949999988079071D;

			for (int var3 = 0; var3 < 65536; ++var3) {
				double var4 = 0.0078125D + (double)(var3 >> 10 & 63) / 64.0D;
				double var6 = 0.0625D + (double)(var3 >> 7 & 7) / 8.0D;
				double var8 = (double)(var3 & 127) / 128.0D;
				double var10 = var8;
				double var12 = var8;
				double var14 = var8;
				if (0.0D != var6) {
					double var16;
					if (var8 < 0.5D) {
						var16 = var8 * (1.0D + var6);
					} else {
						var16 = var8 + var6 - var6 * var8;
					}

					double var18 = 2.0D * var8 - var16;
					double var20 = var4 + 0.3333333333333333D;
					if (var20 > 1.0D) {
						--var20;
					}

					double var24 = var4 - 0.3333333333333333D;
					if (var24 < 0.0D) {
						++var24;
					}

					if (var20 * 6.0D < 1.0D) {
						var10 = var18 + 6.0D * (var16 - var18) * var20;
					} else if (2.0D * var20 < 1.0D) {
						var10 = var16;
					} else if (var20 * 3.0D < 2.0D) {
						var10 = var18 + 6.0D * (0.6666666666666666D - var20) * (var16 - var18);
					} else {
						var10 = var18;
					}

					if (var4 * 6.0D < 1.0D) {
						var12 = var18 + 6.0D * (var16 - var18) * var4;
					} else if (2.0D * var4 < 1.0D) {
						var12 = var16;
					} else if (3.0D * var4 < 2.0D) {
						var12 = 6.0D * (var16 - var18) * (0.6666666666666666D - var4) + var18;
					} else {
						var12 = var18;
					}

					if (var24 * 6.0D < 1.0D) {
						var14 = var18 + (var16 - var18) * 6.0D * var24;
					} else if (var24 * 2.0D < 1.0D) {
						var14 = var16;
					} else if (var24 * 3.0D < 2.0D) {
						var14 = var18 + (0.6666666666666666D - var24) * (var16 - var18) * 6.0D;
					} else {
						var14 = var18;
					}
				}

				var10 = Math.pow(var10, var1);
				var12 = Math.pow(var12, var1);
				var14 = Math.pow(var14, var1);
				int var26 = (int)(var10 * 256.0D);
				int var17 = (int)(var12 * 256.0D);
				int var27 = (int)(256.0D * var14);
				int var19 = (var17 << 8) + (var26 << 16) + var27;
				Client.field5165[var3] = var19 & 16777215;
			}

		}
	}

	@ObfInfo(name = "aj", desc = "(IB)I")
	public static int method9269(int var0) {
		return 255 - (var0 & 255);
	}
}
