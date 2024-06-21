import io.runebox.ObfInfo;

@ObfInfo(name = "to")
public class Class509 {
	@ObfInfo(name = "al", desc = "Ljava/lang/Object;")
	public final Object field5175;
	@ObfInfo(name = "ak", desc = "Ljava/lang/Object;")
	public final Object field5176;

	public Class509(Object var1, Object var2) {
		this.field5176 = var1;
		this.field5175 = var2;
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		return this.field5176 + ", " + this.field5175;
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof Class509) {
			Class509 var2 = (Class509)var1;
			if (this.field5176 == null) {
				if (var2.field5176 != null) {
					return false;
				}
			} else if (!this.field5176.equals(var2.field5176)) {
				return false;
			}

			if (this.field5175 == null) {
				if (var2.field5175 != null) {
					return false;
				}
			} else if (!this.field5175.equals(var2.field5175)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		int var1 = 0;
		if (this.field5176 != null) {
			var1 += this.field5176.hashCode();
		}

		if (this.field5175 != null) {
			var1 += this.field5175.hashCode() * 31;
		}

		return var1;
	}
}
