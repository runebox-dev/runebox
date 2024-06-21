import io.runebox.ObfInfo;

@ObfInfo(name = "ls")
public abstract class Class305 {
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1302371959)
	public int field3229;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 751024923)
	public int field3231;
	@ObfInfo(name = "ab", desc = "Lnj;")
	public final Class348 field3230;
	@ObfInfo(name = "at", desc = "Lnj;")
	public final Class348 field3235;

	public Class305(Class348 var1, Class348 var2) {
		this.field3230 = var1;
		this.field3235 = var2;
	}

	@ObfInfo(name = "aj", desc = "(B)Llh;")
	public abstract Class294 method5744();

	@ObfInfo(name = "al", desc = "(I)I")
	public abstract int method5728();

	@ObfInfo(name = "af", desc = "(I)I")
	public abstract int method5731();

	@ObfInfo(name = "az", desc = "(I)I")
	public abstract int method5732();

	@ObfInfo(name = "ad", desc = "(IIB)Z", opaque = "2")
	public boolean method6144(int var1, int var2) {
		if (this.method6127(var1, var2)) {
			return true;
		} else {
			return this.method6125(var1, var2);
		}
	}

	@ObfInfo(name = "ai", desc = "(B)Z", opaque = "1")
	public boolean method6119() {
		return this.method5728() >= 0;
	}

	@ObfInfo(name = "an", desc = "(III)Z", opaque = "-2078681057")
	public boolean method6127(int var1, int var2) {
		if (!this.method6119()) {
			return false;
		} else {
			Class200 var4 = Class200.method3917(this.method5728());
			int var5 = this.method5732();
			int var6 = this.method5731();
			switch(var4.field2049.field1923) {
			case 0:
				if (var1 >= this.field3229 - var5 / 2 && var1 <= this.field3229 + var5 / 2) {
					break;
				}

				return false;
			case 1:
				if (var1 >= this.field3229 && var1 < var5 + this.field3229) {
					break;
				}

				return false;
			case 2:
				if (var1 <= this.field3229 - var5 || var1 > this.field3229) {
					return false;
				}
			}

			switch(var4.field2059.field2159) {
			case 0:
				if (var2 < this.field3231 - var6 / 2 || var2 > var6 / 2 + this.field3231) {
					return false;
				}
				break;
			case 1:
				if (var2 >= this.field3231 && var2 < var6 + this.field3231) {
					break;
				}

				return false;
			case 2:
				if (var2 <= this.field3231 - var6 || var2 > this.field3231) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfInfo(name = "am", desc = "(IIB)Z", opaque = "0")
	public boolean method6125(int var1, int var2) {
		Class294 var4 = this.method5744();
		if (var4 == null) {
			return false;
		} else if (var1 >= this.field3229 - var4.field3172 / 2 && var1 <= var4.field3172 / 2 + this.field3229) {
			return var2 >= this.field3231 && var2 <= this.field3231 + var4.field3174;
		} else {
			return false;
		}
	}
}
