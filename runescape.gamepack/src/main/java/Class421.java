import io.runebox.ObfInfo;

@ObfInfo(name = "qe")
public class Class421 {
	@ObfInfo(name = "aq", desc = "Lqi;")
	public Class425 field4688;
	@ObfInfo(name = "ad", desc = "Lqo;")
	public Class431 field4689;
	@ObfInfo(name = "ag", desc = "Lqo;")
	public Class431 field4691;

	public Class421() {
		this.field4688 = new Class425();
		this.field4689 = new Class431();
		this.field4691 = new Class431(1.0F, 1.0F, 1.0F);
	}

	public String toString() {
		return "[" + this.field4688.toString() + "|" + this.field4689.toString() + "|" + this.field4691.toString() + "]";
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (var1 == this) {
			return true;
		} else if (!(var1 instanceof Class421)) {
			return false;
		} else {
			Class421 var2 = (Class421)var1;
			return this.field4688.equals(var2.field4688) && this.field4689.method8027(var2.field4689) && this.field4691.method8027(var2.field4691);
		}
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + this.field4688.hashCode();
		var3 = var3 * 31 + this.field4689.hashCode();
		var3 = var3 * 31 + this.field4691.hashCode();
		return var3;
	}
}
