import io.runebox.ObfInfo;

@ObfInfo(name = "vi")
public class Class554 {
	@ObfInfo(desc = "(LClass382;II)[LClass557;")
	public static Class557[] method7961(Class382 var0, int var1, int var2) {
		return !method2876(var0, var1, var2) ? null : Class81.method2244();
	}

	@ObfInfo(desc = "(LClass382;II)LClass557;")
	public static Class557 method7680(Class382 var0, int var1, int var2) {
		if (!method2876(var0, var1, var2)) {
			return null;
		} else {
			Class557 var5 = new Class557();
			var5.field5396 = Class81.field5375;
			var5.field5399 = Class81.field3966;
			var5.field5398 = Class81.field5374[0];
			var5.field5397 = Class81.field5377[0];
			var5.field5392 = Class81.field5376[0];
			var5.field5395 = Class81.field5379[0];
			var5.field5394 = Class81.field1371;
			var5.field5393 = Class81.field1910[0];
			Class81.field5374 = null;
			Class81.field5377 = null;
			Class81.field5376 = null;
			Class81.field5379 = null;
			Class81.field1371 = null;
			Class81.field1910 = (byte[][])null;
			return var5;
		}
	}

	@ObfInfo(desc = "(LClass382;II)[LClass549;")
	public static Class549[] method6029(Class382 var0, int var1, int var2) {
		return !method2876(var0, var1, var2) ? null : method4391();
	}

	@ObfInfo(desc = "(LClass382;II)LClass549;")
	public static Class549 method9868(Class382 var0, int var1, int var2) {
		if (!method2876(var0, var1, var2)) {
			return null;
		} else {
			Class549 var5 = new Class549();
			var5.field5361 = Class81.field5375;
			var5.field5358 = Class81.field3966;
			var5.field5363 = Class81.field5374[0];
			var5.field5362 = Class81.field5377[0];
			var5.field5353 = Class81.field5376[0];
			var5.field5354 = Class81.field5379[0];
			int var6 = var5.field5354 * var5.field5353;
			byte[] var7 = Class81.field1910[0];
			var5.field5357 = new int[var6];

			for (int var8 = 0; var8 < var6; ++var8) {
				var5.field5357[var8] = Class81.field1371[var7[var8] & 255];
			}

			Class81.field5374 = null;
			Class81.field5377 = null;
			Class81.field5376 = null;
			Class81.field5379 = null;
			Class81.field1371 = null;
			Class81.field1910 = (byte[][])null;
			return var5;
		}
	}

	@ObfInfo(desc = "(LClass382;Ljava/lang/String;Ljava/lang/String;)[LClass557;")
	public static Class557[] method3837(Class382 var0, String var1, String var2) {
		if (!var0.method7235(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method7233(var1);
			int var5 = var0.method7299(var4, var2);
			return method7961(var0, var4, var5);
		}
	}

	@ObfInfo(desc = "(LClass382;Ljava/lang/String;Ljava/lang/String;)LClass557;")
	public static Class557 method8860(Class382 var0, String var1, String var2) {
		if (!var0.method7235(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method7233(var1);
			int var5 = var0.method7299(var4, var2);
			return method7680(var0, var4, var5);
		}
	}

	@ObfInfo(desc = "(LClass382;I)LClass557;")
	public static Class557 method3054(Class382 var0, int var1) {
		if (!method7874(var0, var1)) {
			return null;
		} else {
			Class557 var4 = new Class557();
			var4.field5396 = Class81.field5375;
			var4.field5399 = Class81.field3966;
			var4.field5398 = Class81.field5374[0];
			var4.field5397 = Class81.field5377[0];
			var4.field5392 = Class81.field5376[0];
			var4.field5395 = Class81.field5379[0];
			var4.field5394 = Class81.field1371;
			var4.field5393 = Class81.field1910[0];
			Class81.field5374 = null;
			Class81.field5377 = null;
			Class81.field5376 = null;
			Class81.field5379 = null;
			Class81.field1371 = null;
			Class81.field1910 = (byte[][])null;
			return var4;
		}
	}

	@ObfInfo(desc = "()[LClass549;")
	public static Class549[] method4391() {
		Class549[] var1 = new Class549[Class81.field5378];

		for (int var2 = 0; var2 < Class81.field5378; ++var2) {
			Class549 var3 = var1[var2] = new Class549();
			var3.field5361 = Class81.field5375;
			var3.field5358 = Class81.field3966;
			var3.field5363 = Class81.field5374[var2];
			var3.field5362 = Class81.field5377[var2];
			var3.field5353 = Class81.field5376[var2];
			var3.field5354 = Class81.field5379[var2];
			int var4 = var3.field5354 * var3.field5353;
			byte[] var5 = Class81.field1910[var2];
			var3.field5357 = new int[var4];

			for (int var6 = 0; var6 < var4; ++var6) {
				var3.field5357[var6] = Class81.field1371[var5[var6] & 255];
			}
		}

		Class81.field5374 = null;
		Class81.field5377 = null;
		Class81.field5376 = null;
		Class81.field5379 = null;
		Class81.field1371 = null;
		Class81.field1910 = (byte[][])null;
		return var1;
	}

	@ObfInfo(desc = "(LClass382;II)Z")
	public static boolean method2876(Class382 var0, int var1, int var2) {
		byte[] var4 = var0.method7216(var1, var2);
		if (var4 == null) {
			return false;
		} else {
			method3794(var4);
			return true;
		}
	}

	@ObfInfo(desc = "(LClass382;I)Z")
	public static boolean method7874(Class382 var0, int var1) {
		byte[] var3 = var0.method7221(var1);
		if (var3 == null) {
			return false;
		} else {
			method3794(var3);
			return true;
		}
	}

	@ObfInfo(desc = "([B)V")
	public static void method3794(byte[] var0) {
		Class521 var2 = new Class521(var0);
		var2.field5219 = var0.length - 2;
		Class81.field5378 = var2.method9407();
		Class81.field5374 = new int[Class81.field5378];
		Class81.field5377 = new int[Class81.field5378];
		Class81.field5376 = new int[Class81.field5378];
		Class81.field5379 = new int[Class81.field5378];
		Class81.field1910 = new byte[Class81.field5378][];
		var2.field5219 = var0.length - 7 - Class81.field5378 * 8;
		Class81.field5375 = var2.method9407();
		Class81.field3966 = var2.method9407();
		int var3 = (var2.method9405() & 255) + 1;

		int var4;
		for (var4 = 0; var4 < Class81.field5378; ++var4) {
			Class81.field5374[var4] = var2.method9407();
		}

		for (var4 = 0; var4 < Class81.field5378; ++var4) {
			Class81.field5377[var4] = var2.method9407();
		}

		for (var4 = 0; var4 < Class81.field5378; ++var4) {
			Class81.field5376[var4] = var2.method9407();
		}

		for (var4 = 0; var4 < Class81.field5378; ++var4) {
			Class81.field5379[var4] = var2.method9407();
		}

		var2.field5219 = var0.length - 7 - Class81.field5378 * 8 - (var3 - 1) * 3;
		Class81.field1371 = new int[var3];

		for (var4 = 1; var4 < var3; ++var4) {
			Class81.field1371[var4] = var2.method9399();
			if (0 == Class81.field1371[var4]) {
				Class81.field1371[var4] = 1;
			}
		}

		var2.field5219 = 0;

		for (var4 = 0; var4 < Class81.field5378; ++var4) {
			int var5 = Class81.field5376[var4];
			int var6 = Class81.field5379[var4];
			int var7 = var6 * var5;
			byte[] var8 = new byte[var7];
			Class81.field1910[var4] = var8;
			int var9 = var2.method9405();
			int var10;
			if (var9 == 0) {
				for (var10 = 0; var10 < var7; ++var10) {
					var8[var10] = var2.method9406();
				}
			} else if (var9 == 1) {
				for (var10 = 0; var10 < var5; ++var10) {
					for (int var11 = 0; var11 < var6; ++var11) {
						var8[var11 * var5 + var10] = var2.method9406();
					}
				}
			}
		}

	}
}
