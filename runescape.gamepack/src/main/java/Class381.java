import io.runebox.ObfInfo;

@ObfInfo(name = "oq")
public class Class381 {
	@ObfInfo(owner = "ia", name = "aq", desc = "(Lvp;Ljava/lang/String;I)I")
	public static int method4044(Class562 var0, String var1) {
		int var3 = var0.field5471;
		byte[] var4 = Class201.method3996(var1);
		var0.method9824(var4.length);
		var0.field5471 += Client.field4507.method7222(var4, 0, var4.length, var0.field5472, var0.field5471);
		return var0.field5471 - var3;
	}

	@ObfInfo(owner = "hf", name = "ad", desc = "(Lvp;I)Ljava/lang/String;", opaque = "-1338309998")
	public static String method3835(Class562 var0) {
		String var2;
		try {
			int var3 = var0.method9842();
			if (var3 > 32767) {
				var3 = 32767;
			}

			byte[] var4 = new byte[var3];
			var0.field5471 += Client.field4507.method7223(var0.field5472, var0.field5471, var4, 0, var3);
			String var5 = Class411.method5589(var4, 0, var3);
			var2 = var5;
		} catch (Exception var6) {
			var2 = "Cabbage";
		}

		return var2;
	}
}
