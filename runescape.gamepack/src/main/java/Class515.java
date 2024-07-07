import io.runebox.ObfInfo;

@ObfInfo(name = "tu")
public class Class515 {
	@ObfInfo(name = "ad", desc = "Ljava/lang/Object;")
	public final Object field5152;
	@ObfInfo(name = "aq", desc = "Ljava/lang/Object;")
	public final Object field5155;

	public Class515(Object var1, Object var2) {
		this.field5155 = var1;
		this.field5152 = var2;
	}

	public String toString() {
		return this.field5155 + ", " + this.field5152;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof Class515) {
			Class515 var2 = (Class515)var1;
			if (this.field5155 == null) {
				if (var2.field5155 != null) {
					return false;
				}
			} else if (!this.field5155.equals(var2.field5155)) {
				return false;
			}

			if (this.field5152 == null) {
				if (var2.field5152 != null) {
					return false;
				}
			} else if (!this.field5152.equals(var2.field5152)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5155 != null) {
			var1 += this.field5155.hashCode();
		}

		if (this.field5152 != null) {
			var1 += this.field5152.hashCode() * 31;
		}

		return var1;
	}
}
