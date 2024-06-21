import io.runebox.ObfInfo;

@ObfInfo(name = "eu")
public class Class125 extends Class471 {
	@ObfInfo(name = "ak", desc = "Z")
	public final boolean field1514;

	public Class125(boolean var1) {
		this.field1514 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lso;Lso;I)I", opaque = "1733702")
	public int method2990(Class483 var1, Class483 var2) {
		if (var2.field4959 != var1.field4959) {
			return this.field1514 ? var1.field4959 - var2.field4959 : var2.field4959 - var1.field4959;
		} else {
			return this.method8640(var1, var2);
		}
	}

	@ObfInfo(desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method2990((Class483)var1, (Class483)var2);
	}
}
