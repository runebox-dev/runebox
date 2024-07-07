import io.runebox.ObfInfo;

@ObfInfo(name = "ed")
public class Class108 extends Class475 {
	@ObfInfo(name = "aq", desc = "Z")
	public final boolean field1374;

	public Class108(boolean var1) {
		this.field1374 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lsh;Lsh;B)I", opaque = "0")
	public int method2851(Class476 var1, Class476 var2) {
		if (Client.field525 == var1.field4971 && Client.field525 == var2.field4971) {
			return this.field1374 ? var1.field4970 - var2.field4970 : var2.field4970 - var1.field4970;
		} else {
			return this.method8667(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2851((Class476)var1, (Class476)var2);
	}
}
