public class Class316 extends Class506 {
	public static Class316[] field3375;
	public static int field3377;
	public Class315 field3379;
	public Class531 field3374;
	public int field3373;
	public int field3376;

	static {
		field3375 = new Class316[300];
		field3377 = 0;
	}

	public void method6185() {
		if (field3377 < field3375.length) {
			field3375[++field3377 - 1] = this;
		}
	}

	public static Class316 method6159() {
		return field3377 == 0 ? new Class316() : field3375[--field3377];
	}

	public static Class316 method3908(Class315 var0, Class563 var1) {
		Class316 var3 = method6159();
		var3.field3379 = var0;
		var3.field3373 = var0.field3292;
		if (var3.field3373 == -1) {
			var3.field3374 = new Class531(260);
		} else if (-2 == var3.field3373) {
			var3.field3374 = new Class531(10000);
		} else if (var3.field3373 <= 18) {
			var3.field3374 = new Class531(20);
		} else if (var3.field3373 <= 98) {
			var3.field3374 = new Class531(100);
		} else {
			var3.field3374 = new Class531(260);
		}

		var3.field3374.method9777(var1);
		var3.field3374.method9760(var3.field3379.field3369);
		var3.field3376 = 0;
		return var3;
	}
}
