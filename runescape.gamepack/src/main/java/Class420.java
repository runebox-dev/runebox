import io.runebox.ObfInfo;

@ObfInfo(name = "qd")
public class Class420 {
	@ObfInfo(name = "al", desc = "Lqe;")
	public Class421 field4674;
	@ObfInfo(name = "aj", desc = "Lqe;")
	public Class421 field4675;
	@ObfInfo(name = "ak", desc = "Lqz;")
	public Class442 field4673;

	public Class420() {
		this.field4673 = new Class442();
		this.field4674 = new Class421();
		this.field4675 = new Class421(1.0F, 1.0F, 1.0F);
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		return "[" + this.field4673.toString() + "|" + this.field4674.toString() + "|" + this.field4675.toString() + "]";
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (var1 == this) {
			return true;
		} else if (!(var1 instanceof Class420)) {
			return false;
		} else {
			Class420 var2 = (Class420)var1;
			return this.field4673.equals(var2.field4673) && this.field4674.method7812(var2.field4674) && this.field4675.method7812(var2.field4675);
		}
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + this.field4673.hashCode();
		var3 = var3 * 31 + this.field4674.hashCode();
		var3 = var3 * 31 + this.field4675.hashCode();
		return var3;
	}
}
