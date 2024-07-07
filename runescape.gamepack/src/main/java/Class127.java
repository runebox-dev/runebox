import io.runebox.ObfInfo;

@ObfInfo(name = "ew")
public class Class127 extends Class471 {
	@ObfInfo(name = "ak", desc = "Z")
	public final boolean field1525;

	public Class127(boolean var1) {
		this.field1525 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lso;Lso;I)I", opaque = "-988123482")
	public int method3011(Class483 var1, Class483 var2) {
		if (0 != var1.field4959 && var2.field4959 != 0) {
			return this.field1525 ? var1.field4960 - var2.field4960 : var2.field4960 - var1.field4960;
		} else {
			return this.method8640(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method3011((Class483)var1, (Class483)var2);
	}
}
