import io.runebox.ObfInfo;

@ObfInfo(name = "cb")
public final class Class54 extends Class280 {
	@ObfInfo(name = "aj", desc = "Lii;")
	public Class217 field388;
	@ObfInfo(name = "ai", desc = "Z")
	public boolean field382;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 2114524059)
	public int field383;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 2101976971)
	public int field384;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1066179869)
	public int field385;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -2075507115)
	public int field386;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1174215027)
	public int field387;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1618500387)
	public int field389;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1785821565)
	public int field390;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -612227199)
	public int field391;

	public Class54(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field385 = 0;
		this.field391 = 0;
		this.field382 = false;
		this.field389 = var1;
		this.field384 = var2;
		this.field390 = var3;
		this.field386 = var4;
		this.field387 = var5;
		this.field383 = var7 + var6;
		int var8 = Class188.method3600(this.field389).field2077;
		if (var8 != -1) {
			this.field382 = false;
			this.field388 = Class344.method6474(var8);
		} else {
			this.field382 = true;
		}

	}

	@ObfInfo(name = "aq", desc = "(II)V", opaque = "16711681")
	public final void method1139(int var1) {
		if (!this.field382) {
			this.field391 += var1;
			if (!this.field388.method4132()) {
				while (this.field391 > this.field388.field2349[this.field385]) {
					this.field391 -= this.field388.field2349[this.field385];
					++this.field385;
					if (this.field385 >= this.field388.field2355.length) {
						this.field382 = true;
						break;
					}
				}
			} else {
				this.field385 += var1;
				if (this.field385 >= this.field388.method4141()) {
					this.field382 = true;
				}
			}

		}
	}

	@ObfInfo(name = "ah", desc = "(I)Llv;", opaque = "-1073372180")
	public final Class308 method1140() {
		Class188 var2 = Class188.method3600(this.field389);
		Class308 var3;
		if (!this.field382) {
			var3 = var2.method3815(this.field385);
		} else {
			var3 = var2.method3815(-1);
		}

		return var3 == null ? null : var3;
	}
}
