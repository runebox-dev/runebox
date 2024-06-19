public class Class205 extends Class507 {
	public static Class299 field2084;
	public int field2085;

	static {
		field2084 = new Class299(64);
	}

	public Class205() {
		this.field2085 = 0;
	}

	public void method3942(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method3943(var1, var3);
		}
	}

	public void method3943(Class521 var1, int var2) {
		if (var2 == 5) {
			this.field2085 = var1.method9407();
		}

	}

	public static void method3880(Class382 var0) {
		Class239.field2088 = var0;
		Client.field2083 = Class239.field2088.method7237(16);
	}
}
