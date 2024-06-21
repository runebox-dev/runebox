import io.runebox.ObfInfo;

@ObfInfo(name = "na")
public class Class339 {
	@ObfInfo(name = "ak", desc = "(DDD)I")
	public static int method6490(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0D) {
			double var12;
			if (var4 < 0.5D) {
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var2 + var4 - var2 * var4;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = var0 + 0.3333333333333333D;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = var16 * 6.0D * (var12 - var14) + var14;
			} else if (var16 * 2.0D < 1.0D) {
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) {
				var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = var14 + var0 * (var12 - var14) * 6.0D;
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + 6.0D * (0.6666666666666666D - var0) * (var12 - var14);
			} else {
				var8 = var14;
			}

			if (6.0D * var20 < 1.0D) {
				var10 = var14 + 6.0D * (var12 - var14) * var20;
			} else if (var20 * 2.0D < 1.0D) {
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) {
				var10 = 6.0D * (0.6666666666666666D - var20) * (var12 - var14) + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(var6 * 256.0D);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(256.0D * var10);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfInfo(desc = "(LClass521;Ljava/lang/String;)I")
	public static int method3084(Class521 var0, String var1) {
		int var3 = var0.field5219;
		int var5 = var1.length();
		byte[] var6 = new byte[var5];

		for (int var7 = 0; var7 < var5; ++var7) {
			char var8 = var1.charAt(var7);
			if (var8 > 0 && var8 < 128 || var8 >= 160 && var8 <= 255) {
				var6[var7] = (byte)var8;
			} else if (var8 == 8364) {
				var6[var7] = -128;
			} else if (var8 == 8218) {
				var6[var7] = -126;
			} else if (var8 == 402) {
				var6[var7] = -125;
			} else if (var8 == 8222) {
				var6[var7] = -124;
			} else if (var8 == 8230) {
				var6[var7] = -123;
			} else if (var8 == 8224) {
				var6[var7] = -122;
			} else if (var8 == 8225) {
				var6[var7] = -121;
			} else if (var8 == 710) {
				var6[var7] = -120;
			} else if (var8 == 8240) {
				var6[var7] = -119;
			} else if (var8 == 352) {
				var6[var7] = -118;
			} else if (var8 == 8249) {
				var6[var7] = -117;
			} else if (var8 == 338) {
				var6[var7] = -116;
			} else if (var8 == 381) {
				var6[var7] = -114;
			} else if (var8 == 8216) {
				var6[var7] = -111;
			} else if (var8 == 8217) {
				var6[var7] = -110;
			} else if (var8 == 8220) {
				var6[var7] = -109;
			} else if (var8 == 8221) {
				var6[var7] = -108;
			} else if (var8 == 8226) {
				var6[var7] = -107;
			} else if (var8 == 8211) {
				var6[var7] = -106;
			} else if (var8 == 8212) {
				var6[var7] = -105;
			} else if (var8 == 732) {
				var6[var7] = -104;
			} else if (var8 == 8482) {
				var6[var7] = -103;
			} else if (var8 == 353) {
				var6[var7] = -102;
			} else if (var8 == 8250) {
				var6[var7] = -101;
			} else if (var8 == 339) {
				var6[var7] = -100;
			} else if (var8 == 382) {
				var6[var7] = -98;
			} else if (var8 == 376) {
				var6[var7] = -97;
			} else {
				var6[var7] = 63;
			}
		}

		var0.method9403(var6.length);
		var0.field5219 += Client.field3661.method6663(var6, 0, var6.length, var0.field5221, var0.field5219);
		return var0.field5219 - var3;
	}

	@ObfInfo(desc = "(LClass521;)Ljava/lang/String;")
	public static String method6268(Class521 var0) {
		return Class43.method828(var0, 32767);
	}
}
