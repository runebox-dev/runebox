import io.runebox.ObfInfo;

@ObfInfo(name = "er")
public class Class122 extends Class471 {
	@ObfInfo(name = "ak", desc = "Z")
	public final boolean field1492;

	public Class122(boolean var1) {
		this.field1492 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lso;Lso;B)I", opaque = "-2")
	public int method2974(Class483 var1, Class483 var2) {
		if (Client.field557 == var1.field4959) {
			if (Client.field557 != var2.field4959) {
				return this.field1492 ? -1 : 1;
			}
		} else if (var2.field4959 == Client.field557) {
			return this.field1492 ? 1 : -1;
		}

		return this.method8640(var1, var2);
	}

	@ObfInfo(desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method2974((Class483)var1, (Class483)var2);
	}
}
