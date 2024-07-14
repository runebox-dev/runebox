import io.runebox.ObfInfo;

@ObfInfo(name = "nl")
public class Class350 {
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1492035379)
	public int field3748;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 194034093)
	public int field3749;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1884235445)
	public int field3750;

	public Class350(int var1, int var2, int var3) {
		this.field3749 = var1;
		this.field3748 = var2;
		this.field3750 = var3;
	}

	public Class350(Class350 var1) {
		this.field3749 = var1.field3749;
		this.field3748 = var1.field3748;
		this.field3750 = var1.field3750;
	}

	public Class350(int var1) {
		if (var1 == -1) {
			this.field3749 = -1;
		} else {
			this.field3749 = var1 >> 28 & 3;
			this.field3748 = var1 >> 14 & 16383;
			this.field3750 = var1 & 16383;
		}

	}

	@ObfInfo(name = "aq", desc = "(B)I")
	public int method6506() {
		return method6494(this.field3749, this.field3748, this.field3750);
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Class350) ? false : this.method6513((Class350)var1);
		}
	}

	@ObfInfo(name = "an", desc = "(Lnl;I)Z", opaque = "794880841")
	public boolean method6513(Class350 var1) {
		if (this.field3749 != var1.field3749) {
			return false;
		} else if (this.field3748 != var1.field3748) {
			return false;
		} else {
			return this.field3750 == var1.field3750;
		}
	}

	public int hashCode() {
		return this.method6506();
	}

	public String toString() {
		return this.method6499(",");
	}

	@ObfInfo(name = "aj", desc = "(Ljava/lang/String;I)Ljava/lang/String;")
	public String method6499(String var1) {
		return this.field3749 + var1 + (this.field3748 >> 6) + var1 + (this.field3750 >> 6) + var1 + (this.field3748 & 63) + var1 + (this.field3750 & 63);
	}

	@ObfInfo(name = "ad", desc = "(IIII)I")
	public static int method6494(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfInfo(name = "ag", desc = "(II)I")
	public static int method6503(int var0) {
		return var0 >> 28 & 3;
	}

	@ObfInfo(name = "ak", desc = "(IB)I")
	public static int method6502(int var0) {
		return var0 >> 14 & 16383;
	}

	@ObfInfo(name = "ap", desc = "(II)I")
	public static int method6508(int var0) {
		return var0 & 16383;
	}

	@ObfInfo(name = "av", desc = "(IB)I")
	public static int method6517(int var0) {
		return var0 >> 3;
	}

	@ObfInfo(name = "ab", desc = "(IB)I")
	public static int method6501(int var0) {
		return var0 << 3;
	}

	@ObfInfo(name = "ai", desc = "(II)I")
	public static int method6523(int var0) {
		return var0 << 3;
	}
}
