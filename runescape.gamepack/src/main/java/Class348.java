public class Class348 {
	public int field3868;
	public int field3869;
	public int field3870;

	public Class348(int var1, int var2, int var3) {
		this.field3870 = var1;
		this.field3869 = var2;
		this.field3868 = var3;
	}

	public Class348(Class348 var1) {
		this.field3870 = var1.field3870;
		this.field3869 = var1.field3869;
		this.field3868 = var1.field3868;
	}

	public Class348(int var1) {
		if (var1 == -1) {
			this.field3870 = -1;
		} else {
			this.field3870 = var1 >> 28 & 3;
			this.field3869 = var1 >> 14 & 16383;
			this.field3868 = var1 & 16383;
		}

	}

	public int method6698() {
		return Class58.method1085(this.field3870, this.field3869, this.field3868);
	}

	public boolean equals(Object var1) {
		if (var1 == this) {
			return true;
		} else {
			return !(var1 instanceof Class348) ? false : this.method6699((Class348)var1);
		}
	}

	public boolean method6699(Class348 var1) {
		if (this.field3870 != var1.field3870) {
			return false;
		} else if (this.field3869 != var1.field3869) {
			return false;
		} else {
			return var1.field3868 == this.field3868;
		}
	}

	public int hashCode() {
		return this.method6698();
	}

	public String toString() {
		return this.method6706(",");
	}

	public String method6706(String var1) {
		return this.field3870 + var1 + (this.field3869 >> 6) + var1 + (this.field3868 >> 6) + var1 + (this.field3869 & 63) + var1 + (this.field3868 & 63);
	}
}