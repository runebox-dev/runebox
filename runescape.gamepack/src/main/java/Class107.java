import io.runebox.ObfInfo;

@ObfInfo(name = "ec")
public class Class107 extends Class475 {
	@ObfInfo(name = "aq", desc = "Z")
	public final boolean field1370;

	public Class107(boolean var1) {
		this.field1370 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lsh;Lsh;I)I", opaque = "-671317756")
	public int method2850(Class476 var1, Class476 var2) {
		if (var1.field4971 != var2.field4971) {
			return this.field1370 ? var1.field4971 - var2.field4971 : var2.field4971 - var1.field4971;
		} else {
			return this.method8667(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2850((Class476)var1, (Class476)var2);
	}
}
