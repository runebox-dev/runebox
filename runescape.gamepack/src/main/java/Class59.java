public final class Class59 extends Class255 {
	public Class211 field440;
	public boolean field443;
	public int field435;
	public int field436;
	public int field437;
	public int field438;
	public int field439;
	public int field441;
	public int field442;
	public int field445;

	public Class59(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field438 = 0;
		this.field442 = 0;
		this.field443 = false;
		this.field445 = var1;
		this.field436 = var2;
		this.field437 = var3;
		this.field441 = var4;
		this.field439 = var5;
		this.field435 = var7 + var6;
		int var8 = Class224.method4163(this.field445).field2301;
		if (var8 != -1) {
			this.field443 = false;
			this.field440 = Class237.method4637(var8);
		} else {
			this.field443 = true;
		}

	}

	public final void method1091(int var1) {
		if (!this.field443) {
			this.field442 += var1;
			if (!this.field440.method4038()) {
				while (this.field442 > this.field440.field2139[this.field438]) {
					this.field442 -= this.field440.field2139[this.field438];
					++this.field438;
					if (this.field438 >= this.field440.field2142.length) {
						this.field443 = true;
						break;
					}
				}
			} else {
				this.field438 += var1;
				if (this.field438 >= this.field440.method4005()) {
					this.field443 = true;
				}
			}

		}
	}

	public final Class262 method1092() {
		Class224 var2 = Class224.method4163(this.field445);
		Class262 var3;
		if (!this.field443) {
			var3 = var2.method4227(this.field438);
		} else {
			var3 = var2.method4227(-1);
		}

		return var3 == null ? null : var3;
	}

	public static int method1099(int var0, int var1, int var2) {
		int var4 = Class319.method5997(var2 - var1 + 1);
		var4 <<= var1;
		return var0 & ~var4;
	}

	public static void method1097() {
		Class165.field1819.clear();
	}
}
