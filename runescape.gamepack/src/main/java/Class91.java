import io.runebox.ObfInfo;

@ObfInfo(name = "dm")
public class Class91 extends Class507 {
	@ObfInfo(name = "ak", desc = "Llm;")
	public static Class299 field1206;
	@ObfInfo(name = "ao", desc = "[Ltu;")
	public Class515[] field1214;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 54182531)
	public int field1210;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -972598111)
	public int field1211;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 296809297)
	public int field1213;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1223292047)
	public int field1216;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field1207;
	@ObfInfo(name = "az", desc = "[I")
	public int[] field1212;
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public String field1208;
	@ObfInfo(name = "af", desc = "[Ljava/lang/String;")
	public String[] field1209;

	static {
		field1206 = new Class299(128);
	}

	@ObfInfo(name = "af", desc = "(IB)[Ltu;")
	public Class515[] method2407(int var1) {
		return new Class515[var1];
	}

	@ObfInfo(desc = "(I)LClass91;")
	public static Class91 method3660(int var0) {
		Class91 var2 = (Class91)field1206.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field4783.method7216(var0, 0);
			if (var3 == null) {
				return null;
			} else {
				var2 = method2359(var3);
				field1206.method5987(var2, (long)var0);
				return var2;
			}
		}
	}

	@ObfInfo(desc = "(III)LClass91;")
	public static Class91 method67(int var0, int var1, int var2) {
		int var4 = Class385.method5325(var1, var0);
		Class91 var5 = Class77.method2190(var4, var0);
		if (var5 != null) {
			return var5;
		} else {
			var4 = Class385.method3504(var2, var0);
			var5 = Class77.method2190(var4, var0);
			if (var5 != null) {
				return var5;
			} else {
				var4 = Class286.method5861(var0);
				var5 = Class77.method2190(var4, var0);
				return var5 != null ? var5 : null;
			}
		}
	}

	@ObfInfo(name = "al", desc = "([Ljava/lang/String;[II)V")
	public static void method2406(String[] var0, int[] var1) {
		Class532.method3940(var0, var1, 0, var0.length - 1);
	}

	@ObfInfo(desc = "([B)LClass91;")
	public static Class91 method2359(byte[] var0) {
		Class91 var2 = new Class91();
		Class521 var3 = new Class521(var0);
		var3.field5219 = var3.field5221.length - 2;
		int var4 = var3.method9407();
		int var5 = var3.field5221.length - 2 - var4 - 12;
		var3.field5219 = var5;
		int var6 = var3.method9410();
		var2.field1210 = var3.method9407();
		var2.field1211 = var3.method9407();
		var2.field1213 = var3.method9407();
		var2.field1216 = var3.method9407();
		int var7 = var3.method9405();
		int var8;
		int var9;
		if (var7 > 0) {
			var2.field1214 = var2.method2407(var7);

			for (var8 = 0; var8 < var7; ++var8) {
				var9 = var3.method9407();
				Class515 var10 = new Class515(var9 > 0 ? Class248.method4765(var9) : 1);
				var2.field1214[var8] = var10;

				while (var9-- > 0) {
					int var11 = var3.method9410();
					int var12 = var3.method9410();
					var10.method9333(new Class516(var12), (long)var11);
				}
			}
		}

		var3.field5219 = 0;
		var2.field1208 = var3.method9414();
		var2.field1207 = new int[var6];
		var2.field1212 = new int[var6];
		var2.field1209 = new String[var6];

		for (var8 = 0; var3.field5219 < var5; var2.field1207[var8++] = var9) {
			var9 = var3.method9407();
			if (var9 == 3) {
				var2.field1209[var8] = var3.method9415();
			} else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
				var2.field1212[var8] = var3.method9410();
			} else {
				var2.field1212[var8] = var3.method9405();
			}
		}

		return var2;
	}
}
