public class Class228 extends Class507 {
	public static Class299 field2393;
	public static final int[] field2392;
	public int field2394;
	public int field2395;
	public int field2396;

	static {
		field2393 = new Class299(64);
		field2392 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2392[var1] = var0 - 1;
			var0 += var0;
		}

	}

	public void method4389(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method4381(var1, var3);
		}
	}

	public void method4381(Class521 var1, int var2) {
		if (var2 == 1) {
			this.field2394 = var1.method9407();
			this.field2395 = var1.method9405();
			this.field2396 = var1.method9405();
		}

	}
}
