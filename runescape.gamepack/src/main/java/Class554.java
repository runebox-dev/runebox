import io.runebox.ObfInfo;

@ObfInfo(name = "vh")
public class Class554 {
	@ObfInfo(owner = "sd", name = "ad", desc = "(Lok;IIB)[Lvg;", opaque = "1")
	public static Class553[] method8633(Class375 var0, int var1, int var2) {
		return !method3253(var0, var1, var2) ? null : Class237.method4602();
	}

	@ObfInfo(owner = "ou", name = "ag", desc = "(Lok;III)Lvg;", opaque = "-934215165")
	public static Class553 method7253(Class375 var0, int var1, int var2) {
		if (!method3253(var0, var1, var2)) {
			return null;
		} else {
			Class553 var5 = new Class553();
			var5.field5425 = Client.field5433;
			var5.field5426 = Client.field5438;
			var5.field5423 = Client.field1454[0];
			var5.field5420 = Client.field1561[0];
			var5.field5421 = Client.field5435[0];
			var5.field5424 = Client.field3491[0];
			int var6 = var5.field5424 * var5.field5421;
			byte[] var7 = Client.field5434[0];
			var5.field5429 = new int[var6];

			for (int var8 = 0; var8 < var6; ++var8) {
				var5.field5429[var8] = Client.field5432[var7[var8] & 255];
			}

			method6571();
			return var5;
		}
	}

	@ObfInfo(owner = "la", name = "av", desc = "(Lok;IB)Lvv;")
	public static Class568 method5696(Class375 var0, int var1) {
		byte[] var4 = var0.method7139(var1);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			Class491.method8828(var4);
			var3 = true;
		}

		return !var3 ? null : method3374();
	}

	@ObfInfo(owner = "ge", name = "ab", desc = "(I)Lvv;")
	public static Class568 method3374() {
		Class568 var1 = new Class568();
		var1.field5499 = Client.field5433;
		var1.field5498 = Client.field5438;
		var1.field5494 = Client.field1454[0];
		var1.field5493 = Client.field1561[0];
		var1.field5495 = Client.field5435[0];
		var1.field5496 = Client.field3491[0];
		var1.field5500 = Client.field5432;
		var1.field5497 = Client.field5434[0];
		method6571();
		return var1;
	}

	@ObfInfo(owner = "fu", name = "ae", desc = "(Lok;III)Z", opaque = "145522420")
	public static boolean method3253(Class375 var0, int var1, int var2) {
		byte[] var4 = var0.method7132(var1, var2);
		if (var4 == null) {
			return false;
		} else {
			Class491.method8828(var4);
			return true;
		}
	}

	@ObfInfo(owner = "nr", name = "ah", desc = "(I)V")
	public static void method6571() {
		Client.field1454 = null;
		Client.field1561 = null;
		Client.field5435 = null;
		Client.field3491 = null;
		Client.field5432 = null;
		Client.field5434 = (byte[][])null;
	}
}
