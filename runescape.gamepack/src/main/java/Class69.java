public class Class69 {
	public int field851;
	public final Class465 field850;
	public final Class466 field849;
	public final Class544 field852;

	public Class69(Class544 var1) {
		this.field851 = 0;
		this.field852 = var1;
		this.field849 = new Class466(var1);
		this.field850 = new Class465(var1);
	}

	public boolean method1872() {
		return this.field851 == 2;
	}

	public final void method1873() {
		this.field851 = 1;
	}

	public final void method1881(Class521 var1, int var2) {
		this.field849.method8565(var1, var2);
		this.field851 = 2;
		Client.method2419();
	}

	public final void method1918() {
		for (Class443 var2 = (Class443)this.field849.field4905.method7568(); var2 != null; var2 = (Class443)this.field849.field4905.method7570()) {
			if ((long)var2.field4793 < Class327.method3047() / 1000L - 5L) {
				if (var2.field4794 > 0) {
					Class128.method2747(5, "", var2.field4792 + Class378.field4308);
				}

				if (var2.field4794 == 0) {
					Class128.method2747(5, "", var2.field4792 + Class378.field4377);
				}

				var2.method9301();
			}
		}

	}

	public final void method1876() {
		this.field851 = 0;
		this.field849.method8730();
		this.field850.method8730();
	}

	public final boolean method1893(Class567 var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(Client.field107.field1025)) {
			return true;
		} else {
			return this.field849.method8580(var1, var2);
		}
	}

	public final boolean method1878(Class567 var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.field850.method8731(var1);
		}
	}

	public final void method1879(String var1) {
		if (var1 != null) {
			Class567 var3 = new Class567(var1, this.field852);
			if (var3.method10262()) {
				if (this.method1880()) {
					Class412.method7730();
				} else if (Client.field107.field1025.equals(var3)) {
					method3331();
				} else if (this.method1893(var3, false)) {
					StringBuilder var10000 = (new StringBuilder()).append(var1);
					Class378 var10001 = (Class378)null;
					String var5 = var10000.append(Class378.field4327).toString();
					Class128.method2747(30, "", var5);
				} else if (this.method1878(var3)) {
					method3705(var1);
				} else {
					Class316 var4 = Class316.method3908(Class315.field3278, Client.field548.field1446);
					var4.field3374.method9388(Class521.method7983(var1));
					var4.field3374.method9473(var1);
					Client.field548.method2897(var4);
				}
			}
		}
	}

	public final boolean method1880() {
		return this.field849.method8799() || this.field849.method8761() >= 200 && 1 != Client.field611;
	}

	public final void method1921(String var1) {
		if (var1 != null) {
			Class567 var3 = new Class567(var1, this.field852);
			if (var3.method10262()) {
				String var4;
				Class378 var5;
				if (this.method1885()) {
					var5 = (Class378)null;
					var4 = Class378.field4328;
					Class128.method2747(30, "", var4);
				} else if (Client.field107.field1025.equals(var3)) {
					var5 = (Class378)null;
					var4 = Class378.field4451;
					Class128.method2747(30, "", var4);
				} else if (this.method1878(var3)) {
					StringBuilder var10000 = (new StringBuilder()).append(var1);
					Class378 var10001 = (Class378)null;
					var4 = var10000.append(Class378.field4329).toString();
					Class128.method2747(30, "", var4);
				} else if (this.method1893(var3, false)) {
					method4661(var1);
				} else {
					method3933(var1);
				}
			}
		}
	}

	public final boolean method1885() {
		return this.field850.method8799() || this.field850.method8761() >= 100 && Client.field611 != 1;
	}

	public final void method1933(String var1) {
		if (var1 != null) {
			Class567 var3 = new Class567(var1, this.field852);
			if (var3.method10262()) {
				if (this.field849.method8737(var3)) {
					Client.field687 = Client.field677;
					Class316 var4 = Class316.method3908(Class315.field3298, Client.field548.field1446);
					var4.field3374.method9388(Class521.method7983(var1));
					var4.field3374.method9473(var1);
					Client.field548.method2897(var4);
				}

				Client.method2419();
			}
		}
	}

	public final void method1884(String var1, boolean var2) {
		if (var1 != null) {
			Class567 var4 = new Class567(var1, this.field852);
			if (var4.method10262()) {
				if (this.field850.method8737(var4)) {
					Client.field687 = Client.field677;
					if (var2) {
						Class316 var5 = Class316.method3908(Class315.field3342, Client.field548.field1446);
						var5.field3374.method9388(Class521.method7983(var1));
						var5.field3374.method9473(var1);
						Client.field548.method2897(var5);
					}
				}

				Client.method2220();
			}
		}
	}

	public final boolean method1888(Class567 var1) {
		Class448 var3 = (Class448)this.field849.method8734(var1);
		return var3 != null && var3.method8861();
	}

	public static int method1938(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
		var0 = (var0 >>> 4) + var0 & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	public static void method3705(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Class378 var10001 = (Class378)null;
		var10000 = var10000.append(Class378.field4332).append(var0);
		var10001 = (Class378)null;
		String var2 = var10000.append(Class378.field4333).toString();
		Class128.method2747(30, "", var2);
	}

	public static void method3331() {
		Class378 var10000 = (Class378)null;
		String var1 = Class378.field4330;
		Class128.method2747(30, "", var1);
	}

	public static void method4661(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Class378 var10001 = (Class378)null;
		var10000 = var10000.append(Class378.field4278).append(var0);
		var10001 = (Class378)null;
		String var2 = var10000.append(Class378.field4335).toString();
		Class128.method2747(30, "", var2);
	}

	public static void method3933(String var0) {
		Class316 var2 = Class316.method3908(Class315.field3305, Client.field548.field1446);
		var2.field3374.method9388(Class521.method7983(var0));
		var2.field3374.method9473(var0);
		Client.field548.method2897(var2);
	}

	public static void method4403(String var0, int var1) {
		Class316 var3 = Class316.method3908(Class315.field3332, Client.field548.field1446);
		var3.field3374.method9388(Class521.method7983(var0) + 1);
		var3.field3374.method9496(var1);
		var3.field3374.method9473(var0);
		Client.field548.method2897(var3);
	}
}