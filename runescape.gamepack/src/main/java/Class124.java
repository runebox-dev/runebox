import io.runebox.ObfInfo;

@ObfInfo(name = "et")
public class Class124 extends Class475 {
	@ObfInfo(name = "aq", desc = "Z")
	public final boolean field1477;

	public Class124(boolean var1) {
		this.field1477 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lsh;Lsh;I)I", opaque = "-1860179608")
	public int method3007(Class476 var1, Class476 var2) {
		if (var1.field4971 != 0) {
			if (var2.field4971 == 0) {
				return this.field1477 ? -1 : 1;
			}
		} else if (var2.field4971 != 0) {
			return this.field1477 ? 1 : -1;
		}

		return this.method8667(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.method3007((Class476)var1, (Class476)var2);
	}
}
