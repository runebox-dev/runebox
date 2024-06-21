import io.runebox.ObfInfo;

@ObfInfo(name = "et")
public class Class124 extends Class471 {
	@ObfInfo(name = "ak", desc = "Z")
	public final boolean field1513;

	public Class124(boolean var1) {
		this.field1513 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lso;Lso;I)I", opaque = "-837868126")
	public int method2989(Class483 var1, Class483 var2) {
		if (var1.field4959 == Client.field557 && Client.field557 == var2.field4959) {
			return this.field1513 ? var1.method8703().method10275(var2.method8703()) : var2.method8703().method10275(var1.method8703());
		} else {
			return this.method8640(var1, var2);
		}
	}

	@ObfInfo(desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method2989((Class483)var1, (Class483)var2);
	}
}
