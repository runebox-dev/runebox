public class Class118 {
	public int field1469;
	public int field1470;
	public int field1471;
	public int field1472;

	public Class118(int var1, int var2, int var3, int var4) {
		this.field1471 = var1;
		this.field1469 = var2;
		this.field1470 = var3;
		this.field1472 = var4;
	}

	public int method2929() {
		return this.field1471;
	}

	public int method2928() {
		return this.field1469;
	}

	public int method2943() {
		return this.field1470;
	}

	public int method2930() {
		return this.field1472;
	}

	public static void method2945(int var0) {
		if (var0 != Client.field555) {
			if (Client.field555 == 30) {
				Client.field510.method4070();
			}

			if (0 == Client.field555) {
				Client.field2077.method612();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				Client.method788(Class53.field363);
				Client.field493 = 0;
				Client.field524 = 0;
				Client.field551.method8355(var0);
				if (var0 != 20) {
					Client.method6138(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Client.field4879 != null) {
				Client.field4879.method8631();
				Client.field4879 = null;
			}

			if (25 == Client.field555) {
				Client.field542 = 0;
				Client.field553 = 0;
				Client.field554 = 1;
				Client.field657 = 0;
				Client.field596 = 1;
			}

			int var2;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var2 = Client.field555 == 11 ? 4 : 0;
					Class76.method6264(Client.field1556, Client.field1793, false, var2);
				} else if (var0 == 11) {
					Class76.method6264(Client.field1556, Client.field1793, false, 4);
				} else if (var0 == 50) {
					Class76.method5778("", "Updating date of birth...", "");
					Class76.method6264(Client.field1556, Client.field1793, false, 7);
				} else if (var0 != 0) {
					Class76.method3136();
				}
			} else {
				var2 = Client.method348() ? 0 : 12;
				Class76.method6264(Client.field1556, Client.field1793, true, var2);
			}

			Client.field555 = var0;
		}
	}
}
