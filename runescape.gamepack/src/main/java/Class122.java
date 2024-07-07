import io.runebox.ObfInfo;

@ObfInfo(name = "er")
public class Class122 extends Class475 {
	@ObfInfo(name = "aq", desc = "Z")
	public final boolean field1461;

	public Class122(boolean var1) {
		this.field1461 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lsh;Lsh;I)I", opaque = "-1568307644")
	public int method2988(Class476 var1, Class476 var2) {
		if (var1.field4971 == Client.field525) {
			if (Client.field525 != var2.field4971) {
				return this.field1461 ? -1 : 1;
			}
		} else if (var2.field4971 == Client.field525) {
			return this.field1461 ? 1 : -1;
		}

		return this.method8667(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.method2988((Class476)var1, (Class476)var2);
	}
}
