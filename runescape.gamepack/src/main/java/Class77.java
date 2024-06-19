public final class Class77 extends Class506 {
	public static Class401 field976;
	public Class222 field965;
	public Class52 field958;
	public Class52 field972;
	public int field959;
	public int field960;
	public int field961;
	public int field962;
	public int field963;
	public int field966;
	public int field968;
	public int field969;
	public int field971;
	public int field973;
	public int field974;
	public int[] field964;

	static {
		field976 = new Class401();
	}

	public void method2177() {
		int var2 = this.field966;
		Class222 var3 = this.field965.method4181();
		if (var3 != null) {
			this.field966 = var3.field2245;
			this.field960 = var3.field2273 * 128;
			this.field959 = var3.field2283 * 128;
			this.field968 = var3.field2284;
			this.field969 = var3.field2281;
			this.field964 = var3.field2286;
		} else {
			this.field966 = -1;
			this.field960 = 0;
			this.field959 = 0;
			this.field968 = 0;
			this.field969 = 0;
			this.field964 = null;
		}

		if (this.field966 != var2 && this.field958 != null) {
			Client.field3984.method755(this.field958);
			this.field958 = null;
		}

	}

	public static Class199 method2189(int var0) {
		Class199 var2 = (Class199)Class199.field2034.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field2039.method7216(5, var0);
			var2 = new Class199();
			if (var3 != null) {
				var2.method3877(new Class521(var3));
			}

			Class199.field2034.method5987(var2, (long)var0);
			return var2;
		}
	}

	public static void method3246() {
		for (Class77 var1 = (Class77)field976.method7482(); var1 != null; var1 = (Class77)field976.method7490()) {
			if (var1.field958 != null) {
				Client.field3984.method755(var1.field958);
				var1.field958 = null;
			}

			if (var1.field972 != null) {
				Client.field3984.method755(var1.field972);
				var1.field972 = null;
			}
		}

		field976.method7476();
	}

	public static void method3919() {
		for (Class77 var1 = (Class77)field976.method7482(); var1 != null; var1 = (Class77)field976.method7490()) {
			if (var1.field965 != null) {
				var1.method2177();
			}
		}

	}

	public static Class91 method2190(int var0, int var1) {
		Class91 var3 = (Class91)Class91.field1206.method5993((long)(var0 << 16));
		if (var3 != null) {
			return var3;
		} else {
			String var4 = String.valueOf(var0);
			int var5 = Client.field4783.method7233(var4);
			if (var5 == -1) {
				return null;
			} else {
				byte[] var6 = Client.field4783.method7221(var5);
				if (var6 != null) {
					if (var6.length <= 1) {
						return null;
					}

					var3 = Class91.method2359(var6);
					if (var3 != null) {
						Class91.field1206.method5987(var3, (long)(var0 << 16));
						return var3;
					}
				}

				return null;
			}
		}
	}

	public static void method846(int var0, int var1, int var2, Class222 var3, int var4) {
		Class77 var6 = new Class77();
		var6.field974 = var0;
		var6.field973 = var1 * 128;
		var6.field961 = var2 * 128;
		int var7 = var3.field2252;
		int var8 = var3.field2253;
		if (var4 == 1 || var4 == 3) {
			var7 = var3.field2253;
			var8 = var3.field2252;
		}

		var6.field962 = 128 * (var7 + var1);
		var6.field963 = 128 * (var8 + var2);
		var6.field966 = var3.field2245;
		var6.field960 = var3.field2273 * 128;
		var6.field959 = Math.max(var3.field2283 * 128 - 128, 0);
		var6.field968 = var3.field2284;
		var6.field969 = var3.field2281;
		var6.field964 = var3.field2286;
		if (var3.field2278 != null) {
			var6.field965 = var3;
			var6.method2177();
		}

		field976.method7477(var6);
		if (var6.field964 != null) {
			var6.field971 = var6.field968 + (int)(Math.random() * (double)(var6.field969 - var6.field968));
		}

	}

	public static void method2181(Class27 var0) {
		var0.field136 = false;
		if (var0.field138 != null) {
			var0.field138.field390 = 0;
		}

		for (Class27 var2 = var0.method384(); var2 != null; var2 = var0.method379()) {
			method2181(var2);
		}

	}
}
