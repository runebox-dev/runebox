import io.runebox.ObfInfo;

@ObfInfo(name = "nj")
public class Class348 {
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1268210065)
	public int field3868;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -10786693)
	public int field3869;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1559901275)
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

	@ObfInfo(name = "ak", desc = "(B)I")
	public int method6698() {
		return method1085(this.field3870, this.field3869, this.field3868);
	}

	public boolean equals(Object var1) {
		if (var1 == this) {
			return true;
		} else {
			return !(var1 instanceof Class348) ? false : this.method6699((Class348)var1);
		}
	}

	@ObfInfo(name = "aj", desc = "(Lnj;B)Z", opaque = "0")
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

	@ObfInfo(name = "az", desc = "(Ljava/lang/String;I)Ljava/lang/String;")
	public String method6706(String var1) {
		return this.field3870 + var1 + (this.field3869 >> 6) + var1 + (this.field3868 >> 6) + var1 + (this.field3869 & 63) + var1 + (this.field3868 & 63);
	}

	@ObfInfo(owner = "cf", name = "al", desc = "(IIII)I")
	public static int method1085(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}
}
