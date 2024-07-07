import io.runebox.ObfInfo;

@ObfInfo(name = "ep")
public class Class120 extends Class475 {
	@ObfInfo(name = "aq", desc = "Z")
	public final boolean field1450;

	public Class120(boolean var1) {
		this.field1450 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lsh;Lsh;I)I", opaque = "1637037113")
	public int method2973(Class476 var1, Class476 var2) {
		if (var1.field4971 == Client.field525 && Client.field525 == var2.field4971) {
			return this.field1450 ? var1.method8693().method9799(var2.method8693()) : var2.method8693().method9799(var1.method8693());
		} else {
			return this.method8667(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2973((Class476)var1, (Class476)var2);
	}
}
