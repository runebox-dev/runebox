import io.runebox.ObfInfo;

@ObfInfo(name = "ey")
public class Class129 extends Class475 {
	@ObfInfo(name = "aq", desc = "Z")
	public final boolean field1517;

	public Class129(boolean var1) {
		this.field1517 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lsh;Lsh;I)I")
	public int method3042(Class476 var1, Class476 var2) {
		if (var1.field4971 != 0 && var2.field4971 != 0) {
			return this.field1517 ? var1.method8693().method9799(var2.method8693()) : var2.method8693().method9799(var1.method8693());
		} else {
			return this.method8667(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method3042((Class476)var1, (Class476)var2);
	}

	@ObfInfo(name = "bw", desc = "(ILdg;ZB)I", opaque = "10")
	public static int method3047(int var0, Class85 var1, boolean var2) {
		if (var0 == 5630) {
			Client.field649 = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
