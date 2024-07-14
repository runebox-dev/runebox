import io.runebox.ObfInfo;

@ObfInfo(name = "kh")
public abstract class Class268 {
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1707677087)
	public int field2750;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 2107546585)
	public int field2751;
	@ObfInfo(name = "aj", desc = "Lnl;")
	public final Class350 field2748;
	@ObfInfo(name = "av", desc = "Lnl;")
	public final Class350 field2749;

	public Class268(Class350 var1, Class350 var2) {
		this.field2749 = var1;
		this.field2748 = var2;
	}

	@ObfInfo(name = "ag", desc = "(I)Lkm;")
	public abstract Class273 method4660();

	@ObfInfo(name = "ad", desc = "(B)I")
	public abstract int method4659();

	@ObfInfo(name = "ak", desc = "(I)I")
	public abstract int method4661();

	@ObfInfo(name = "ap", desc = "(I)I")
	public abstract int method4674();

	@ObfInfo(name = "at", desc = "(IIB)Z", opaque = "0")
	public boolean method5050(int var1, int var2) {
		if (this.method5056(var1, var2)) {
			return true;
		} else {
			return this.method5057(var1, var2);
		}
	}

	@ObfInfo(name = "af", desc = "(I)Z", opaque = "-1652474517")
	public boolean method5065() {
		return this.method4659() >= 0;
	}

	@ObfInfo(name = "am", desc = "(IIB)Z", opaque = "21")
	public boolean method5056(int var1, int var2) {
		if (!this.method5065()) {
			return false;
		} else {
			Class163 var4 = Class163.method3540(this.method4659());
			int var5 = this.method4661();
			int var6 = this.method4674();
			switch(var4.field1791.field2181) {
			case 0:
				if (var1 >= this.field2750 - var5 / 2 && var1 <= var5 / 2 + this.field2750) {
					break;
				}

				return false;
			case 1:
				if (var1 >= this.field2750 && var1 < this.field2750 + var5) {
					break;
				}

				return false;
			case 2:
				if (var1 <= this.field2750 - var5 || var1 > this.field2750) {
					return false;
				}
			}

			switch(var4.field1792.field2240) {
			case 0:
				if (var2 <= this.field2751 - var6 || var2 > this.field2751) {
					return false;
				}
				break;
			case 1:
				if (var2 < this.field2751 || var2 >= this.field2751 + var6) {
					return false;
				}
				break;
			case 2:
				if (var2 < this.field2751 - var6 / 2 || var2 > var6 / 2 + this.field2751) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfInfo(name = "ar", desc = "(III)Z", opaque = "-502571839")
	public boolean method5057(int var1, int var2) {
		Class273 var4 = this.method4660();
		if (var4 == null) {
			return false;
		} else if (var1 >= this.field2750 - var4.field2798 / 2 && var1 <= var4.field2798 / 2 + this.field2750) {
			return var2 >= this.field2751 && var2 <= this.field2751 + var4.field2797;
		} else {
			return false;
		}
	}
}
