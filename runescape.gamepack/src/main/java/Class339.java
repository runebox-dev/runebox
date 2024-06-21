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

	@ObfInfo(owner = "mp", name = "al", desc = "(Lua;I)Ljava/lang/String;")
	public static String method6268(Class521 var0) {
		return method828(var0, 32767);
	}

	@ObfInfo(owner = "bq", name = "aj", desc = "(Lua;II)Ljava/lang/String;", opaque = "1500452705")
	public static String method828(Class521 var0, int var1) {
		try {
			int var3 = var0.method9419();
			if (var3 > var1) {
				var3 = var1;
			}

			byte[] var4 = new byte[var3];
			var0.field5219 += Client.field3661.method6656(var0.field5221, var0.field5219, var4, 0, var3);
			String var5 = Class363.method7119(var4, 0, var3);
			return var5;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}
}
