import io.runebox.ObfInfo;

@ObfInfo(name = "du")
public class Class99 extends Class520 {
	@ObfInfo(owner = "ou", name = "ae", desc = "Lvv;")
	public static Class568 field4534;
	@ObfInfo(owner = "he", name = "av", desc = "Z")
	public static boolean field2009;
	@ObfInfo(name = "ag", desc = "Lnx;")
	public Class362 field1215;
	@ObfInfo(name = "aj", desc = "Lnx;")
	public Class362 field1216;
	@ObfInfo(name = "ad", desc = "Z")
	public boolean field1213;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1018815261)
	public int field1210;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1437104327)
	public int field1211;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -776132997)
	public int field1212;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1323625187)
	public int field1214;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1997341365)
	public int field1218;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 487300869)
	public int field1220;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1628898499)
	public int field1221;
	@ObfInfo(name = "aq", desc = "[Ljava/lang/Object;")
	public Object[] field1217;
	@ObfInfo(name = "ai", desc = "Ljava/lang/String;")
	public String field1219;

	public Class99() {
		this.field1221 = 76;
	}

	@ObfInfo(name = "aq", desc = "([Ljava/lang/Object;B)V")
	public void method2640(Object[] var1) {
		this.field1217 = var1;
	}

	@ObfInfo(name = "ad", desc = "(IB)V")
	public void method2641(int var1) {
		this.field1221 = var1;
	}

	@ObfInfo(name = "ag", desc = "(Lnx;I)V")
	public void method2642(Class362 var1) {
		this.field1215 = var1;
	}

	@ObfInfo(name = "al", desc = "(Lcw;I)V", opaque = "131831")
	public static void method2639(Class75 var0) {
		if (var0.method2157() != Client.field528) {
			Client.field528 = var0.method2157();
			boolean var2 = var0.method2157();
			if (field2009 != var2) {
				Class187.field2011.method6332();
				Class187.field2016.method6332();
				Class187.field2010.method6332();
				field2009 = var2;
			}
		}

		if (Client.field796 != var0.field912) {
			Class390 var4 = Client.field112;
			int var3 = var0.field912;
			if ((var3 & Class545.field5331.method129()) != 0) {
				field4534 = Class402.method7469(var4, "logo_deadman_mode", "");
			} else if ((var3 & Class545.field5358.method129()) != 0) {
				field4534 = Class402.method7469(var4, "logo_seasonal_mode", "");
			} else if ((var3 & Class545.field5336.method129()) != 0) {
				field4534 = Class402.method7469(var4, "logo_speedrunning", "");
			} else {
				field4534 = Class402.method7469(var4, "logo", "");
			}
		}

		Client.field95 = var0.field905;
		Client.field525 = var0.field902;
		Client.field796 = var0.field912;
		Client.field4657 = var0.field903;
		Client.field1939 = Client.field527 == 0 ? 43594 : var0.field902 + 40000;
		Client.field159 = 0 == Client.field527 ? 443 : 50000 + var0.field902;
		Client.field1853 = Client.field1939;
	}
}
