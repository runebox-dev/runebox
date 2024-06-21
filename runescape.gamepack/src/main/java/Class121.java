import io.runebox.ObfInfo;

public class Class121 extends Class471 {
	@ObfInfo(name = "ak", desc = "Z")
	public final boolean field1490;

	public Class121(boolean var1) {
		this.field1490 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lso;Lso;I)I", opaque = "-563542583")
	public int method2964(Class483 var1, Class483 var2) {
		if (0 != var1.field4959 && 0 != var2.field4959) {
			return this.field1490 ? var1.method8703().method10275(var2.method8703()) : var2.method8703().method10275(var1.method8703());
		} else {
			return this.method8640(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2964((Class483)var1, (Class483)var2);
	}
}
