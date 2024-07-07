import io.runebox.ObfInfo;

@ObfInfo(name = "em")
public class Class117 extends Class475 {
	@ObfInfo(name = "aq", desc = "Z")
	public final boolean field1434;

	public Class117(boolean var1) {
		this.field1434 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lsh;Lsh;I)I", opaque = "396253425")
	public int method2943(Class476 var1, Class476 var2) {
		if (var1.field4971 != 0 && var2.field4971 != 0) {
			return this.field1434 ? var1.field4970 - var2.field4970 : var2.field4970 - var1.field4970;
		} else {
			return this.method8667(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2943((Class476)var1, (Class476)var2);
	}
}
