import io.runebox.ObfInfo;

@ObfInfo(name = "ua")
public class Class521 {
	@ObfInfo(owner = "gd", name = "aq", desc = "([Ljava/lang/String;[SI)V")
	public static void method3362(String[] var0, short[] var1) {
		method3701(var0, var1, 0, var0.length - 1);
	}

	@ObfInfo(owner = "hb", name = "ad", desc = "([Ljava/lang/String;[SIII)V", opaque = "1893552247")
	public static void method3701(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			short var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					short var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method3701(var0, var1, var2, var6 - 1);
			method3701(var0, var1, var6 + 1, var3);
		}

	}

	@ObfInfo(owner = "hr", name = "ag", desc = "([Ljava/lang/String;[II)V")
	public static void method3990(String[] var0, int[] var1) {
		method2564(var0, var1, 0, var0.length - 1);
	}

	@ObfInfo(owner = "dq", name = "ak", desc = "([Ljava/lang/String;[IIII)V", opaque = "1121307176")
	public static void method2564(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method2564(var0, var1, var2, var6 - 1);
			method2564(var0, var1, var6 + 1, var3);
		}

	}

	@ObfInfo(owner = "gf", name = "ap", desc = "([I[IIIB)V", opaque = "0")
	public static void method3376(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			int var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;
			int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < (var10 & var9) + var7) {
					int var11 = var0[var10];
					var0[var10] = var0[var6];
					var0[var6] = var11;
					int var12 = var1[var10];
					var1[var10] = var1[var6];
					var1[var6++] = var12;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method3376(var0, var1, var2, var6 - 1);
			method3376(var0, var1, var6 + 1, var3);
		}

	}
}
