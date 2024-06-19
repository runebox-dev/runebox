public class Class143 {
	public Class119[] field1627;
	public Class141 field1626;
	public Class141 field1645;
	public boolean field1624;
	public boolean field1628;
	public boolean field1631;
	public boolean field1639;
	public float field1623;
	public float field1629;
	public float field1630;
	public float field1632;
	public float field1634;
	public float field1635;
	public float field1636;
	public float field1637;
	public float field1640;
	public float field1641;
	public float field1644;
	public float field1646;
	public float[] field1625;
	public int field1638;
	public int field1642;
	public int field1643;

	public Class143() {
		this.field1639 = true;
		this.field1638 = 0;
	}

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

	public void method3168() {
		this.field1642 = this.field1627[0].field1476;
		this.field1643 = this.field1627[this.method3162() - 1].field1476;
		this.field1625 = new float[this.method3159() + 1];

		for (int var2 = this.method3157(); var2 <= this.method3158(); ++var2) {
			this.field1625[var2 - this.method3157()] = Class261.method5160(this, (float)var2);
		}

		this.field1627 = null;
		this.field1644 = Class261.method5160(this, (float)(this.method3157() - 1));
		this.field1640 = Class261.method5160(this, (float)(this.method3158() + 1));
	}

	public float method3156(int var1) {
		if (var1 < this.method3157()) {
			return this.field1644;
		} else {
			return var1 > this.method3158() ? this.field1640 : this.field1625[var1 - this.method3157()];
		}
	}

	public int method3157() {
		return this.field1642;
	}

	public int method3158() {
		return this.field1643;
	}

	public int method3159() {
		return this.method3158() - this.method3157();
	}

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

	public Class119 method3173(float var1) {
		int var3 = this.method3175(var1);
		return var3 >= 0 && var3 < this.field1627.length ? this.field1627[var3] : null;
	}

	public int method3162() {
		return this.field1627 == null ? 0 : this.field1627.length;
	}
}
