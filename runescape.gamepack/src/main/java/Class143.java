import io.runebox.ObfInfo;

public class Class143 {
	@ObfInfo(name = "af", desc = "[Leo;")
	public Class119[] field1627;
	@ObfInfo(name = "az", desc = "Lfk;")
	public Class141 field1626;
	@ObfInfo(name = "aj", desc = "Lfk;")
	public Class141 field1645;
	@ObfInfo(name = "al", desc = "Z")
	public boolean field1624;
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field1628;
	@ObfInfo(name = "ak", desc = "Z")
	public boolean field1631;
	@ObfInfo(name = "ay", desc = "Z")
	public boolean field1639;
	@ObfInfo(name = "ax", desc = "F")
	public float field1623;
	@ObfInfo(name = "at", desc = "F")
	public float field1629;
	@ObfInfo(name = "ab", desc = "F")
	public float field1630;
	@ObfInfo(name = "ao", desc = "F")
	public float field1632;
	@ObfInfo(name = "av", desc = "F")
	public float field1634;
	@ObfInfo(name = "aq", desc = "F")
	public float field1635;
	@ObfInfo(name = "ap", desc = "F")
	public float field1636;
	@ObfInfo(name = "ae", desc = "F")
	public float field1637;
	@ObfInfo(name = "an", desc = "F")
	public float field1640;
	@ObfInfo(name = "ac", desc = "F")
	public float field1641;
	@ObfInfo(name = "ai", desc = "F")
	public float field1644;
	@ObfInfo(name = "ah", desc = "F")
	public float field1646;
	@ObfInfo(name = "as", desc = "[F")
	public float[] field1625;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -273377871)
	public int field1638;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = -32107801)
	public int field1642;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 375556369)
	public int field1643;

	public Class143() {
		this.field1639 = true;
		this.field1638 = 0;
	}

	@ObfInfo(name = "ak", desc = "(Lua;II)I", opaque = "116273575")
	public int method3174(Class521 var1, int var2) {
		int var4 = var1.method9407();
		int var5 = var1.method9405();
		Class154 var6 = (Class154)Class62.method1112(Class154.method2594(), var5);
		if (var6 == null) {
			var6 = Class154.field1712;
		}

		this.field1645 = Class111.method2869(var1.method9405());
		this.field1626 = Class111.method2869(var1.method9405());
		this.field1631 = var1.method9405() != 0;
		this.field1627 = new Class119[var4];
		Class119 var9 = null;

		for (int var7 = 0; var7 < var4; ++var7) {
			Class119 var8 = new Class119();
			var8.method2946(var1, var2);
			this.field1627[var7] = var8;
			if (var9 != null) {
				var9.field1479 = var8;
			}

			var9 = var8;
		}

		return var4;
	}

	@ObfInfo(name = "al", desc = "(I)V")
	public void method3168() {
		this.field1642 = this.field1627[0].field1476;
		this.field1643 = this.field1627[this.method3162() - 1].field1476;
		this.field1625 = new float[this.method3159() + 1];

		for (int var2 = this.method3157(); var2 <= this.method3158(); ++var2) {
			this.field1625[var2 - this.method3157()] = Class130.method5160(this, (float)var2);
		}

		this.field1627 = null;
		this.field1644 = Class130.method5160(this, (float)(this.method3157() - 1));
		this.field1640 = Class130.method5160(this, (float)(this.method3158() + 1));
	}

	@ObfInfo(name = "aj", desc = "(II)F", opaque = "-11287499")
	public float method3156(int var1) {
		if (var1 < this.method3157()) {
			return this.field1644;
		} else {
			return var1 > this.method3158() ? this.field1640 : this.field1625[var1 - this.method3157()];
		}
	}

	@ObfInfo(name = "az", desc = "(I)I")
	public int method3157() {
		return this.field1642;
	}

	@ObfInfo(name = "af", desc = "(S)I")
	public int method3158() {
		return this.field1643;
	}

	@ObfInfo(name = "aa", desc = "(I)I")
	public int method3159() {
		return this.method3158() - this.method3157();
	}

	@ObfInfo(name = "at", desc = "(FB)I", opaque = "17")
	public int method3175(float var1) {
		if (this.field1638 >= 0 && (float)this.field1627[this.field1638].field1476 <= var1 && (this.field1627[this.field1638].field1479 == null || (float)this.field1627[this.field1638].field1479.field1476 > var1)) {
			return this.field1638;
		} else if (var1 >= (float)this.method3157() && var1 <= (float)this.method3158()) {
			int var3 = this.method3162();
			int var4 = this.field1638;
			if (var3 > 0) {
				int var5 = 0;
				int var6 = var3 - 1;

				do {
					int var7 = var6 + var5 >> 1;
					if (var1 < (float)this.field1627[var7].field1476) {
						if (var1 > (float)this.field1627[var7 - 1].field1476) {
							var4 = var7 - 1;
							break;
						}

						var6 = var7 - 1;
					} else {
						if (var1 <= (float)this.field1627[var7].field1476) {
							var4 = var7;
							break;
						}

						if (var1 < (float)this.field1627[var7 + 1].field1476) {
							var4 = var7;
							break;
						}

						var5 = var7 + 1;
					}
				} while(var5 <= var6);
			}

			if (var4 != this.field1638) {
				this.field1638 = var4;
				this.field1639 = true;
			}

			return this.field1638;
		} else {
			return -1;
		}
	}

	@ObfInfo(name = "ab", desc = "(FI)Leo;", opaque = "-1081333275")
	public Class119 method3173(float var1) {
		int var3 = this.method3175(var1);
		return var3 >= 0 && var3 < this.field1627.length ? this.field1627[var3] : null;
	}

	@ObfInfo(name = "ac", desc = "(B)I")
	public int method3162() {
		return this.field1627 == null ? 0 : this.field1627.length;
	}
}
