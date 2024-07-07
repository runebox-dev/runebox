import io.runebox.ObfInfo;

@ObfInfo(name = "hr")
public class Class200 extends Class516 {
	@ObfInfo(name = "ad", desc = "Lmo;")
	public static Class327 field2203;
	@ObfInfo(name = "ag", desc = "Z")
	public boolean field2202;

	static {
		field2203 = new Class327(64);
	}

	public Class200() {
		this.field2202 = false;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;I)V", opaque = "-16711935")
	public void method3979(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method3980(var1, var3);
		}
	}

	@ObfInfo(name = "ad", desc = "(Lvp;IB)V", opaque = "0")
	public void method3980(Class562 var1, int var2) {
		if (var2 == 2) {
			this.field2202 = true;
		}

	}

	@ObfInfo(owner = "ao", name = "ag", desc = "(B)V")
	public static void method214() {
		field2203.method6332();
	}
}
