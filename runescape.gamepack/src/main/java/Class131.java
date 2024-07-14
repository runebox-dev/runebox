import io.runebox.ObfInfo;

@ObfInfo(name = "fa")
public class Class131 {
	@ObfInfo(name = "ag", desc = "Lvo;")
	public Class561 field1528;
	@ObfInfo(name = "aq", desc = "B")
	public byte field1530;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1991639177)
	public int field1527;

	@ObfInfo(name = "hm", desc = "(IB)V", opaque = "27")
	public static void method3063(int var0) {
		if (Client.field537 != var0) {
			if (Client.field537 == 30) {
				Client.field766.method4400();
			}

			if (Client.field537 == 0) {
				Client.field4671.method737();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				Client.method439(Class77.field932);
				Client.field565 = 0;
				Client.field586 = 0;
				Client.field595.method8317(var0);
				if (var0 != 20) {
					Client.method4362(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Client.field4428 != null) {
				Client.field4428.method8644();
				Client.field4428 = null;
			}

			if (Client.field537 == 25) {
				Client.field601 = 0;
				Client.field804 = 0;
				Client.field781 = 1;
				Client.field599 = 0;
				Client.field560 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var4 = Client.field537 == 11 ? 4 : 0;
					Class53.method2401(Client.field2983, Client.field112, false, var4);
				} else if (var0 == 11) {
					Class53.method2401(Client.field2983, Client.field112, false, 4);
				} else if (var0 == 50) {
					Class53.method4018("", "Updating date of birth...", "");
					Class53.method2401(Client.field2983, Client.field112, false, 7);
				} else if (var0 != 0 && Class53.field340) {
					Class53.field4962 = null;
					Class53.field5060 = null;
					Class53.field2743 = null;
					Class53.field343 = null;
					Class53.field2205 = null;
					Class99.field4534 = null;
					Class53.field4740 = null;
					Class53.field1746 = null;
					Class53.field345 = null;
					Class53.field5363 = null;
					Class53.field1462 = null;
					Class53.field919 = null;
					Class53.field4674 = null;
					Class53.field1431 = null;
					Class53.field1208.method2404();
					Class323.method3075(0, 100);
					Client.method3213().method7068(true);
					Class53.field340 = false;
				}
			} else {
				boolean var2 = Client.field1474.method2484() >= Client.field663;
				int var3 = var2 ? 0 : 12;
				Class53.method2401(Client.field2983, Client.field112, true, var3);
			}

			Client.field537 = var0;
		}
	}
}
