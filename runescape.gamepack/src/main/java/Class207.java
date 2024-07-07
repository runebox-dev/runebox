import io.runebox.ObfInfo;

@ObfInfo(name = "hy")
public class Class207 extends Class516 {
	@ObfInfo(name = "ak", desc = "Lmo;")
	public static Class327 field2251;
	@ObfInfo(name = "ag", desc = "Lmo;")
	public static Class327 field2252;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -134381729)
	public int field2253;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -559303949)
	public int field2254;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 624950315)
	public int field2255;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1729883099)
	public int field2256;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 945531)
	public int field2257;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -1320982237)
	public int field2258;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 463739565)
	public int field2259;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1492678773)
	public int field2260;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 2084950425)
	public int field2261;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -83055385)
	public int field2262;

	static {
		field2252 = new Class327(64);
		field2251 = new Class327(64);
	}

	public Class207() {
		this.field2253 = 255;
		this.field2254 = 255;
		this.field2255 = -1;
		this.field2256 = 1;
		this.field2257 = 70;
		this.field2258 = -1;
		this.field2259 = -1;
		this.field2260 = 30;
		this.field2262 = 0;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;I)V", opaque = "1251397205")
	public void method4034(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method4028(var1, var3);
		}
	}

	@ObfInfo(name = "ad", desc = "(Lvp;IB)V", opaque = "35")
	public void method4028(Class562 var1, int var2) {
		if (var2 == 1) {
			var1.method9997();
		} else if (var2 == 2) {
			this.field2253 = var1.method9902();
		} else if (var2 == 3) {
			this.field2254 = var1.method9902();
		} else if (var2 == 4) {
			this.field2255 = 0;
		} else if (var2 == 5) {
			this.field2257 = var1.method9997();
		} else if (var2 == 6) {
			var1.method9902();
		} else if (var2 == 7) {
			this.field2258 = var1.method9871();
		} else if (var2 == 8) {
			this.field2259 = var1.method9871();
		} else if (var2 == 11) {
			this.field2255 = var1.method9997();
		} else if (var2 == 14) {
			this.field2260 = var1.method9902();
		} else if (var2 == 15) {
			this.field2262 = var1.method9902();
		}

	}

	@ObfInfo(name = "ag", desc = "(I)Lvg;", opaque = "-819667087")
	public Class553 method4026() {
		if (this.field2258 < 0) {
			return null;
		} else {
			Class553 var2 = (Class553)field2251.method6327((long)this.field2258);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class554.method7253(Client.field2249, this.field2258, 0);
				if (var2 != null) {
					field2251.method6330(var2, (long)this.field2258);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "ak", desc = "(B)Lvg;", opaque = "4")
	public Class553 method4027() {
		if (this.field2259 < 0) {
			return null;
		} else {
			Class553 var2 = (Class553)field2251.method6327((long)this.field2259);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class554.method7253(Client.field2249, this.field2259, 0);
				if (var2 != null) {
					field2251.method6330(var2, (long)this.field2259);
				}

				return var2;
			}
		}
	}
}
