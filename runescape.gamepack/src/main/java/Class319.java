public class Class319 {
	public static int[] field3393;

	static {
		new Object();
		field3393 = new int[33];
		field3393[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3393[var1] = var0 - 1;
			var0 += var0;
		}

	}

	public static int method5997(int var0) {
		return field3393[var0];
	}

	public static int method3791(int var0) {
		int var2 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var2 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var2 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var2 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var2 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var2;
		}

		return var2 + var0;
	}

	public static int method2738(int var0, int var1) {
		int var3 = var0 >>> 31;
		return (var3 + var0) / var1 - var3;
	}
}
