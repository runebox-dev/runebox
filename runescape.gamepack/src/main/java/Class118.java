import io.runebox.ObfInfo;

@ObfInfo(name = "en")
public class Class118 {
	@ObfInfo(name = "al", desc = "I", intMultiplier = 462637913)
	public int field1469;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1636216495)
	public int field1470;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -841998663)
	public int field1471;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1700021687)
	public int field1472;

	public Class118(int var1, int var2, int var3, int var4) {
		this.field1471 = var1;
		this.field1469 = var2;
		this.field1470 = var3;
		this.field1472 = var4;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method2929() {
		return this.field1471;
	}

	@ObfInfo(name = "al", desc = "(I)I")
	public int method2928() {
		return this.field1469;
	}

	@ObfInfo(name = "aj", desc = "(I)I")
	public int method2943() {
		return this.field1470;
	}

	@ObfInfo(name = "az", desc = "(I)I")
	public int method2930() {
		return this.field1472;
	}

	@ObfInfo(name = "hx", desc = "(II)V", opaque = "-1438891682")
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

	@ObfInfo(name = "oa", desc = "(Lnb;I)Ljava/lang/String;", opaque = "-101011192")
	public static String method2931(Class340 var0) {
		if (Class344.method3653(Client.method3511(var0)) == 0) {
			return null;
		} else {
			return var0.field3763 != null && var0.field3763.trim().length() != 0 ? var0.field3763 : null;
		}
	}
}
