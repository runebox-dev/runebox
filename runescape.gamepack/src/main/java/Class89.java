public final class Class89 extends Class506 {
	public static String field3115;
	public int field1185;
	public int field1186;
	public int field1187;
	public int field1188;
	public int field1189;
	public int field1190;
	public int field1191;
	public int field1192;
	public int field1193;
	public int field1194;
	public int field1195;
	public int field1196;
	public int field1197;
	public int field1198;

	public Class89() {
		this.field1194 = 31;
		this.field1197 = 0;
		this.field1198 = -1;
	}

	public void method2398(int var1) {
		this.field1194 = var1;
	}

	public boolean method2401(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1194 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	public static Class185[] method2403() {
		return new Class185[]{Class185.field1921, Class185.field1924, Class185.field1922};
	}

	public static void method2397(boolean var0) {
		byte var2 = 0;
		if (!Client.method348()) {
			var2 = 12;
		} else if (Client.field2077.method1198() || Client.field2077.method1291() || Client.field2077.method1737()) {
			var2 = 10;
		}

		Class76.method4120(var2);
		if (var0) {
			Class76.field955 = "";
			Class76.field938 = "";
			Client.field4650 = 0;
			field3115 = "";
		}

		Class76.method276();
		Class76.method8882();
	}
}
