import io.runebox.ObfInfo;

public final class Class77 extends Class506 {
	@ObfInfo(name = "ak", desc = "Lpk;")
	public static Class401 field976;
	@ObfInfo(name = "ax", desc = "Lin;")
	public Class222 field965;
	@ObfInfo(name = "ao", desc = "Lbz;")
	public Class52 field958;
	@ObfInfo(name = "ae", desc = "Lbz;")
	public Class52 field972;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1096256259)
	public int field959;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -2046732581)
	public int field960;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -2142850895)
	public int field961;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1066887777)
	public int field962;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -896933039)
	public int field963;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 844790461)
	public int field966;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 835726103)
	public int field968;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 1986008745)
	public int field969;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -114126391)
	public int field971;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 56891629)
	public int field973;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1864766337)
	public int field974;
	@ObfInfo(name = "aq", desc = "[I")
	public int[] field964;

	static {
		field976 = new Class401();
	}

	@ObfInfo(name = "aj", desc = "(I)V", opaque = "1381505609")
	public void method2177() {
		int var2 = this.field966;
		Class222 var3 = this.field965.method4181();
		if (var3 != null) {
			this.field966 = var3.field2245;
			this.field960 = var3.field2273 * 128;
			this.field959 = var3.field2283 * 128;
			this.field968 = var3.field2284;
			this.field969 = var3.field2281;
			this.field964 = var3.field2286;
		} else {
			this.field966 = -1;
			this.field960 = 0;
			this.field959 = 0;
			this.field968 = 0;
			this.field969 = 0;
			this.field964 = null;
		}

		if (this.field966 != var2 && this.field958 != null) {
			Client.field3984.method755(this.field958);
			this.field958 = null;
		}

	}

	@ObfInfo(owner = "bq", name = "az", desc = "(IIILin;II)V", opaque = "-1996713989")
	public static void method846(int var0, int var1, int var2, Class222 var3, int var4) {
		Class77 var6 = new Class77();
		var6.field974 = var0;
		var6.field973 = var1 * 128;
		var6.field961 = var2 * 128;
		int var7 = var3.field2252;
		int var8 = var3.field2253;
		if (var4 == 1 || var4 == 3) {
			var7 = var3.field2253;
			var8 = var3.field2252;
		}

		var6.field962 = 128 * (var7 + var1);
		var6.field963 = 128 * (var8 + var2);
		var6.field966 = var3.field2245;
		var6.field960 = var3.field2273 * 128;
		var6.field959 = Math.max(var3.field2283 * 128 - 128, 0);
		var6.field968 = var3.field2284;
		var6.field969 = var3.field2281;
		var6.field964 = var3.field2286;
		if (var3.field2278 != null) {
			var6.field965 = var3;
			var6.method2177();
		}

		field976.method7477(var6);
		if (var6.field964 != null) {
			var6.field971 = var6.field968 + (int)(Math.random() * (double)(var6.field969 - var6.field968));
		}

	}

	@ObfInfo(name = "oi", desc = "(B)V", opaque = "6")
	public static void method2188() {
		Class316 var1 = Class316.method3908(Class315.field3326, Client.field548.field1446);
		Client.field548.method2897(var1);
		Class72.field890 = true;

		for (Class104 var2 = (Class104)Client.field654.method9363(); var2 != null; var2 = (Class104)Client.field654.method9364()) {
			if (0 == var2.field1364 || var2.field1364 == 3) {
				Client.method716(var2, true);
			}
		}

		if (Client.field533 != null) {
			Class317.method6187(Client.field533);
			Client.field533 = null;
		}

		Class72.field890 = false;
	}
}
