import io.runebox.ObfInfo;

@ObfInfo(name = "vf")
public class Class551 {
	@ObfInfo(name = "al", desc = "Ljava/lang/Object;")
	public Object field5369;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1978856885)
	public final int field5367;

	public Class551(int var1) {
		this.field5367 = var1;
	}

	public Class551(int var1, Object var2) {
		this.field5367 = var1;
		this.field5369 = var2;
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		return super.hashCode();
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (!(var1 instanceof Class551)) {
			return false;
		} else {
			Class551 var2 = (Class551)var1;
			if (var2.field5369 == null && this.field5369 != null) {
				return false;
			} else if (this.field5369 == null && var2.field5369 != null) {
				return false;
			} else {
				return this.field5367 == var2.field5367 && var2.field5369.equals(this.field5369);
			}
		}
	}
}
