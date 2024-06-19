public class Class217 extends Class507 {
	public static Class299 field2188;
	public boolean field2184;
	public char field2185;
	public int field2186;
	public String field2187;

	static {
		field2188 = new Class299(64);
	}

	public Class217() {
		this.field2184 = true;
	}

	public void method4099() {
	}

	public void method4100(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method4101(var1, var3);
		}
	}

	public void method4101(Class521 var1, int var2) {
		if (var2 == 1) {
			this.field2185 = Class405.method3288(var1.method9406());
		} else if (var2 == 2) {
			this.field2186 = var1.method9410();
		} else if (var2 == 4) {
			this.field2184 = false;
		} else if (var2 == 5) {
			this.field2187 = var1.method9415();
		}

	}

	public boolean method4117() {
		return this.field2185 == 's';
	}
}
