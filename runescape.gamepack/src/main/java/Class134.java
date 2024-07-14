import io.runebox.ObfInfo;

@ObfInfo(name = "fd")
public class Class134 {
	@ObfInfo(name = "ap", desc = "[Lff;")
	public Class136[] field1566;
	@ObfInfo(name = "ag", desc = "Lfh;")
	public Class138 field1567;
	@ObfInfo(name = "ak", desc = "Lfh;")
	public Class138 field1570;
	@ObfInfo(name = "aq", desc = "Z")
	public boolean field1562;
	@ObfInfo(name = "ad", desc = "Z")
	public boolean field1563;
	@ObfInfo(name = "al", desc = "Z")
	public boolean field1565;
	@ObfInfo(name = "an", desc = "Z")
	public boolean field1581;
	@ObfInfo(name = "ab", desc = "F")
	public float field1568;
	@ObfInfo(name = "ac", desc = "F")
	public float field1569;
	@ObfInfo(name = "ae", desc = "F")
	public float field1572;
	@ObfInfo(name = "au", desc = "F")
	public float field1573;
	@ObfInfo(name = "ah", desc = "F")
	public float field1574;
	@ObfInfo(name = "az", desc = "F")
	public float field1575;
	@ObfInfo(name = "ax", desc = "F")
	public float field1576;
	@ObfInfo(name = "ai", desc = "F")
	public float field1577;
	@ObfInfo(name = "av", desc = "F")
	public float field1578;
	@ObfInfo(name = "aj", desc = "F")
	public float field1579;
	@ObfInfo(name = "aw", desc = "F")
	public float field1583;
	@ObfInfo(name = "at", desc = "F")
	public float field1584;
	@ObfInfo(name = "ao", desc = "[F")
	public float[] field1580;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = -1309993249)
	public int field1564;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1857339093)
	public int field1571;
	@ObfInfo(name = "as", desc = "I", intMultiplier = -988948789)
	public int field1582;

	public Class134() {
		this.field1565 = true;
		this.field1564 = 0;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;II)I", opaque = "14314088")
	public int method3086(Class562 var1, int var2) {
		int var4 = var1.method9997();
		Class148.method3617(var1.method9902());
		this.field1567 = Class138.method463(var1.method9902());
		this.field1570 = Class138.method463(var1.method9902());
		this.field1562 = var1.method9902() != 0;
		this.field1566 = new Class136[var4];
		Class136 var5 = null;

		for (int var6 = 0; var6 < var4; ++var6) {
			Class136 var7 = new Class136();
			var7.method3123(var1, var2);
			this.field1566[var6] = var7;
			if (var5 != null) {
				var5.field1596 = var7;
			}

			var5 = var7;
		}

		return var4;
	}

	@ObfInfo(name = "ad", desc = "(I)V", opaque = "1160509687")
	public void method3090() {
		this.field1571 = this.field1566[0].field1590;
		this.field1582 = this.field1566[this.method3101() - 1].field1590;
		this.field1580 = new float[this.method3104() + 1];

		for (int var2 = this.method3089(); var2 <= this.method3085(); ++var2) {
			this.field1580[var2 - this.method3089()] = Class110.method2870(this, (float)var2);
		}

		this.field1566 = null;
		this.field1583 = Class110.method2870(this, (float)(this.method3089() - 1));
		this.field1584 = Class110.method2870(this, (float)(this.method3085() + 1));
	}

	@ObfInfo(name = "ag", desc = "(II)F", opaque = "139404465")
	public float method3088(int var1) {
		if (var1 < this.method3089()) {
			return this.field1583;
		} else {
			return var1 > this.method3085() ? this.field1584 : this.field1580[var1 - this.method3089()];
		}
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method3089() {
		return this.field1571;
	}

	@ObfInfo(name = "ap", desc = "(I)I")
	public int method3085() {
		return this.field1582;
	}

	@ObfInfo(name = "an", desc = "(B)I")
	public int method3104() {
		return this.method3085() - this.method3089();
	}

	@ObfInfo(name = "aj", desc = "(FI)I", opaque = "-1013815814")
	public int method3091(float var1) {
		if (this.field1564 >= 0 && (float)this.field1566[this.field1564].field1590 <= var1 && (this.field1566[this.field1564].field1596 == null || (float)this.field1566[this.field1564].field1596.field1590 > var1)) {
			return this.field1564;
		} else if (var1 >= (float)this.method3089() && var1 <= (float)this.method3085()) {
			int var3 = this.method3101();
			int var4 = this.field1564;
			if (var3 > 0) {
				int var5 = 0;
				int var6 = var3 - 1;

				do {
					int var7 = var5 + var6 >> 1;
					if (var1 < (float)this.field1566[var7].field1590) {
						if (var1 > (float)this.field1566[var7 - 1].field1590) {
							var4 = var7 - 1;
							break;
						}

						var6 = var7 - 1;
					} else {
						if (var1 <= (float)this.field1566[var7].field1590) {
							var4 = var7;
							break;
						}

						if (var1 < (float)this.field1566[var7 + 1].field1590) {
							var4 = var7;
							break;
						}

						var5 = var7 + 1;
					}
				} while(var5 <= var6);
			}

			if (this.field1564 != var4) {
				this.field1564 = var4;
				this.field1565 = true;
			}

			return this.field1564;
		} else {
			return -1;
		}
	}

	@ObfInfo(name = "av", desc = "(FI)Lff;", opaque = "1239401619")
	public Class136 method3110(float var1) {
		int var3 = this.method3091(var1);
		return var3 >= 0 && var3 < this.field1566.length ? this.field1566[var3] : null;
	}

	@ObfInfo(name = "ab", desc = "(B)I")
	public int method3101() {
		return this.field1566 == null ? 0 : this.field1566.length;
	}
}
