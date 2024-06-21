import io.runebox.ObfInfo;

@ObfInfo(name = "dk")
public final class Class89 extends Class506 {
	@ObfInfo(desc = "Ljava/lang/String;")
	public static String field3115;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -1214778777)
	public int field1185;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1008038753)
	public int field1186;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 433863545)
	public int field1187;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 875810921)
	public int field1188;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 106953625)
	public int field1189;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1536759051)
	public int field1190;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -264142591)
	public int field1191;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1848412699)
	public int field1192;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -995596597)
	public int field1193;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 2010923569)
	public int field1194;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1855293411)
	public int field1195;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1120669841)
	public int field1196;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1187381017)
	public int field1197;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1758720105)
	public int field1198;

	public Class89() {
		this.field1194 = 31;
		this.field1197 = 0;
		this.field1198 = -1;
	}

	@ObfInfo(name = "ak", desc = "(IB)V")
	public void method2398(int var1) {
		this.field1194 = var1;
	}

	@ObfInfo(name = "al", desc = "(II)Z", opaque = "2089405296")
	public boolean method2401(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1194 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfInfo(name = "az", desc = "(I)[Lhc;")
	public static Class185[] method2403() {
		return new Class185[]{Class185.field1921, Class185.field1924, Class185.field1922};
	}

	@ObfInfo(name = "ax", desc = "(ZI)V", opaque = "-515367669")
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
