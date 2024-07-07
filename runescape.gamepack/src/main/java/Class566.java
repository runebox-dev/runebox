import io.runebox.ObfInfo;

@ObfInfo(name = "vt")
public class Class566 {
	@ObfInfo(name = "ad", desc = "Ljava/lang/Object;")
	public Object field5492;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1593412931)
	public final int field5491;

	public Class566(int var1) {
		this.field5491 = var1;
	}

	public Class566(int var1, Object var2) {
		this.field5491 = var1;
		this.field5492 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof Class566)) {
			return false;
		} else {
			Class566 var2 = (Class566)var1;
			if (var2.field5492 == null && this.field5492 != null) {
				return false;
			} else if (this.field5492 == null && var2.field5492 != null) {
				return false;
			} else {
				return this.field5491 == var2.field5491 && var2.field5492.equals(this.field5492);
			}
		}
	}
}
