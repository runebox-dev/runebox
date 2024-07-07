import io.runebox.ObfInfo;

@ObfInfo(name = "gx")
public class Class180 extends Class516 {
	@ObfInfo(name = "ad", desc = "Lmo;")
	public static Class327 field1903;
	@ObfInfo(owner = "lr", name = "aq", desc = "Lok;")
	public static Class375 field3125;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 142521319)
	public int field1901;

	static {
		field1903 = new Class327(64);
	}

	public Class180() {
		this.field1901 = 0;
	}

	@ObfInfo(name = "ag", desc = "(Lvp;B)V")
	public void method3608(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method3603(var1, var3);
		}
	}

	@ObfInfo(name = "ak", desc = "(Lvp;IS)V", opaque = "146")
	public void method3603(Class562 var1, int var2) {
		if (var2 == 2) {
			this.field1901 = var1.method9997();
		}

	}

	@ObfInfo(owner = "fz", name = "aq", desc = "(Lok;I)V")
	public static void method3340(Class375 var0) {
		field3125 = var0;
	}

	@ObfInfo(owner = "kf", name = "ad", desc = "(II)Lgx;", opaque = "271071562")
	public static Class180 method5046(int var0) {
		Class180 var2 = (Class180)field1903.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field3125.method7132(5, var0);
			var2 = new Class180();
			if (var3 != null) {
				var2.method3608(new Class562(var3));
			}

			field1903.method6330(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(owner = "nd", name = "ap", desc = "(I)V")
	public static void method6423() {
		field1903.method6332();
	}

	@ObfInfo(name = "pl", desc = "(IB)Luh;", opaque = "-1")
	public static Class528 method3614(int var0) {
		Class528 var2 = (Class528)Client.field823.method6327((long)var0);
		if (var2 == null) {
			var2 = new Class528(Client.field2574, var0);
		}

		return var2;
	}
}
