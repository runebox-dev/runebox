import io.runebox.ObfInfo;

@ObfInfo(name = "gt")
public class Class176 extends Class516 {
	@ObfInfo(name = "ag", desc = "Lmo;")
	public static Class327 field1882;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1052630067)
	public int field1885;

	static {
		field1882 = new Class327(64);
	}

	public Class176() {
		this.field1885 = 0;
	}

	@ObfInfo(name = "ad", desc = "(Lvp;I)V", opaque = "-567087272")
	public void method3580(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method3581(var1, var3);
		}
	}

	@ObfInfo(name = "ag", desc = "(Lvp;IB)V")
	public void method3581(Class562 var1, int var2) {
		if (var2 == 5) {
			this.field1885 = var1.method9997();
		}

	}

	@ObfInfo(owner = "ib", name = "aq", desc = "(IB)Lgt;", opaque = "1")
	public static Class176 method4047(int var0) {
		Class176 var2 = (Class176)field1882.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field1887.method7132(16, var0);
			var2 = new Class176();
			if (var3 != null) {
				var2.method3580(new Class562(var3));
			}

			field1882.method6330(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(owner = "dt", name = "ak", desc = "(B)V")
	public static void method2636() {
		field1882.method6332();
	}
}
