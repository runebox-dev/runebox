public class Class551 {
	public Object field5369;
	public final int field5367;

	public Class551(int var1) {
		this.field5367 = var1;
	}

	public Class551(int var1, Object var2) {
		this.field5367 = var1;
		this.field5369 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

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