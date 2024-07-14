import io.runebox.ObfInfo;

@ObfInfo(name = "ci")
public class Class61 {
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1850775767)
	public int field464;
	@ObfInfo(name = "an", desc = "Lrl;")
	public final Class454 field463;
	@ObfInfo(name = "ap", desc = "Lry;")
	public final Class467 field465;
	@ObfInfo(name = "ak", desc = "Luu;")
	public final Class541 field466;

	public Class61(Class541 var1) {
		this.field464 = 0;
		this.field466 = var1;
		this.field465 = new Class467(var1);
		this.field463 = new Class454(var1);
	}

	@ObfInfo(name = "aq", desc = "(I)Z")
	public boolean method1209() {
		return this.field464 == 2;
	}

	@ObfInfo(name = "ad", desc = "(I)V")
	public final void method1210() {
		this.field464 = 1;
	}

	@ObfInfo(name = "ag", desc = "(Lvp;IB)V")
	public final void method1211(Class562 var1, int var2) {
		this.field465.method8522(var1, var2);
		this.field464 = 2;
		Class315.method6221();
	}

	@ObfInfo(name = "ak", desc = "(B)V", opaque = "7")
	public final void method1221() {
		for (Class492 var2 = (Class492)this.field465.field4929.method7351(); var2 != null; var2 = (Class492)this.field465.field4929.method7359()) {
			if ((long)var2.field5024 < Class329.method4953() / 1000L - 5L) {
				if (var2.field5022 > 0) {
					Class115.method3716(5, "", var2.field5023 + Class367.field4196);
				}

				if (var2.field5022 == 0) {
					Class115.method3716(5, "", var2.field5023 + Class367.field4197);
				}

				var2.method8885();
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(I)V")
	public final void method1262() {
		this.field464 = 0;
		this.field465.method8552();
		this.field463.method8552();
	}

	@ObfInfo(name = "an", desc = "(Lvo;ZI)Z", opaque = "1902606376")
	public final boolean method1214(Class561 var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(Client.field170.field991)) {
			return true;
		} else {
			return this.field465.method8526(var1, var2);
		}
	}

	@ObfInfo(name = "aj", desc = "(Lvo;I)Z")
	public final boolean method1232(Class561 var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.field463.method8555(var1);
		}
	}

	@ObfInfo(name = "av", desc = "(Ljava/lang/String;B)V", opaque = "0")
	public final void method1270(String var1) {
		if (var1 != null) {
			Class561 var3 = new Class561(var1, this.field466);
			if (var3.method9801()) {
				if (this.method1213()) {
					method5081(Class367.field4215);
				} else if (Client.field170.field991.equals(var3)) {
					method5081(Class367.field4219);
				} else if (this.method1214(var3, false)) {
					method567(var1);
				} else if (this.method1232(var3)) {
					method8895(var1);
				} else {
					Class314 var4 = Class168.method3523(ClientPacket.field3429, Client.field678.field1482);
					var4.field3270.method9809(Class562.method2698(var1));
					var4.field3270.method9816(var1);
					Client.field678.method3013(var4);
				}
			}
		}
	}

	@ObfInfo(name = "au", desc = "(B)Z", opaque = "0")
	public final boolean method1213() {
		return this.field465.method8554() || this.field465.method8582() >= 200 && Client.field654 != 1;
	}

	@ObfInfo(name = "ah", desc = "(Ljava/lang/String;I)V", opaque = "-63466726")
	public final void method1218(String var1) {
		if (var1 != null) {
			Class561 var3 = new Class561(var1, this.field466);
			if (var3.method9801()) {
				if (this.method1243()) {
					method3174();
				} else if (Client.field170.field991.equals(var3)) {
					method4604();
				} else if (this.method1232(var3)) {
					method5081(var1 + Class367.field4218);
				} else if (this.method1214(var3, false)) {
					method5081(Class367.field4223 + var1 + Class367.field4224);
				} else {
					Class314 var4 = Class168.method3523(ClientPacket.field3373, Client.field678.field1482);
					var4.field3270.method9809(Class562.method2698(var1));
					var4.field3270.method9816(var1);
					Client.field678.method3013(var4);
				}
			}
		}
	}

	@ObfInfo(name = "ac", desc = "(I)Z", opaque = "-1266723916")
	public final boolean method1243() {
		return this.field463.method8554() || this.field463.method8582() >= 100 && Client.field654 != 1;
	}

	@ObfInfo(name = "al", desc = "(Ljava/lang/String;B)V", opaque = "9")
	public final void method1253(String var1) {
		if (var1 != null) {
			Class561 var3 = new Class561(var1, this.field466);
			if (var3.method9801()) {
				if (this.field465.method8614(var3)) {
					Client.method8898();
					Class314 var4 = Class168.method3523(ClientPacket.field3366, Client.field678.field1482);
					var4.field3270.method9809(Class562.method2698(var1));
					var4.field3270.method9816(var1);
					Client.field678.method3013(var4);
				}

				Class315.method6221();
			}
		}
	}

	@ObfInfo(name = "ay", desc = "(Ljava/lang/String;ZB)V", opaque = "9")
	public final void method1215(String var1, boolean var2) {
		if (var1 != null) {
			Class561 var4 = new Class561(var1, this.field466);
			if (var4.method9801()) {
				if (this.field463.method8614(var4)) {
					Client.method8898();
					if (var2) {
						Class314 var5 = Class168.method3523(ClientPacket.field3431, Client.field678.field1482);
						var5.field3270.method9809(Class562.method2698(var1));
						var5.field3270.method9816(var1);
						Client.field678.method3013(var5);
					}
				}

				Client.method3335();
			}
		}
	}

	@ObfInfo(name = "aa", desc = "(Lvo;I)Z", opaque = "-1955548629")
	public final boolean method1247(Class561 var1) {
		Class456 var3 = (Class456)this.field465.method8556(var1);
		return var3 != null && var3.method8678();
	}

	@ObfInfo(owner = "kh", name = "ab", desc = "(Ljava/lang/String;I)V")
	public static void method5081(String var0) {
		Class115.method3716(30, "", var0);
	}

	@ObfInfo(owner = "bn", name = "ai", desc = "(Ljava/lang/String;I)V")
	public static void method567(String var0) {
		method5081(var0 + Class367.field4216);
	}

	@ObfInfo(owner = "tg", name = "ae", desc = "(Ljava/lang/String;S)V")
	public static void method8895(String var0) {
		method5081(Class367.field4221 + var0 + Class367.field4297);
	}

	@ObfInfo(owner = "fm", name = "az", desc = "(I)V")
	public static void method3174() {
		method5081(Class367.field4148);
	}

	@ObfInfo(owner = "jd", name = "ax", desc = "(I)V")
	public static void method4604() {
		method5081(Class367.field4220);
	}

	@ObfInfo(owner = "ij", name = "ao", desc = "(Ljava/lang/String;IB)V")
	public static void method4216(String var0, int var1) {
		Class314 var3 = Class168.method3523(ClientPacket.field3417, Client.field678.field1482);
		var3.field3270.method9809(Class562.method2698(var0) + 1);
		var3.field3270.method9816(var0);
		var3.field3270.method9809(var1);
		Client.field678.method3013(var3);
	}
}
