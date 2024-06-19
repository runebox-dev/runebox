public class Class188 {
	public static String method2595(Class515 var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			Class498 var4 = (Class498)var0.method9326((long)var1);
			return var4 == null ? var2 : (String)var4.field5095;
		}
	}

	public static void method3696() {
		Class525 var1 = null;

		try {
			var1 = Class179.method2980("", Client.field1497.field4550, true);
			Class521 var2 = Client.field4851.method2608();
			var1.method9668(var2.field5221, 0, var2.field5219);
		} catch (Exception var4) {
		}

		try {
			if (var1 != null) {
				var1.method9669(true);
			}
		} catch (Exception var3) {
		}

	}
}
