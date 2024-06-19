public class Class199 extends Class507 {
	public static Class299 field2034;
	public int field2036;

	static {
		field2034 = new Class299(64);
	}

	public Class199() {
		this.field2036 = 0;
	}

	public void method3877(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method3879(var1, var3);
		}
	}

	public void method3879(Class521 var1, int var2) {
		if (var2 == 2) {
			this.field2036 = var1.method9407();
		}

	}

	public static void method2750() {
		field2034.method5995();
	}

	public static int method3888(Class340 var0) {
		if (11 != var0.field3755) {
			--Class85.field1806;
			Class72.field887[++Class85.field83 - 1] = -1;
			return 1;
		} else {
			String var2 = Class72.field880[--Class85.field1806];
			Class72.field887[++Class85.field83 - 1] = var0.method6520(var2);
			return 1;
		}
	}
}
