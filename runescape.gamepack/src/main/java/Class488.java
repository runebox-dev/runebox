public class Class488 implements Class78 {
	public Class256[] field4999;
	public Class98 field4995;
	public int field4987;
	public int field4988;
	public int field4989;
	public int field4991;
	public int field4992;
	public int field4993;
	public int field4994;
	public int field4996;
	public int field4997;
	public int[] field4990;
	public int[] field4998;

	public Class488(int var1, int var2, int var3, int var4) {
		this.field4996 = 0;
		this.field4988 = 0;
		this.field4989 = 2;
		this.field4992 = 0;
		this.field4991 = -1;
		this.field4994 = -1;
		this.field4993 = -1;
		this.field4987 = 0;
		this.field4997 = 0;
		this.field4990 = new int[10];
		this.field4998 = new int[10];
		this.field4999 = new Class256[10];
		this.field4995 = new Class98(var1, var2, var3, var4);
	}

	public void method8911() {
		this.field4995.field1283.field2769 = this.field4995.field1300;
	}

	public int method2199() {
		return this.field4991;
	}

	public int method2191() {
		return this.field4993;
	}

	public int method2193() {
		return this.field4996;
	}

	public final void method8912(int var1, int var2, Class256 var3) {
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (this.field4990[0] >= 0 && this.field4990[0] < 104 && this.field4998[0] >= 0 && this.field4998[0] < 104) {
				this.method8914(var1, var2, var3);
			} else {
				this.method8913(var1, var2);
			}
		} else {
			this.method8913(var1, var2);
		}

	}

	public void method8913(int var1, int var2) {
		this.field4997 = 0;
		this.field4990[0] = var1;
		this.field4998[0] = var2;
		byte var4 = 1;
		this.field4991 = var4 * 64 + 128 * this.field4990[0];
		this.field4993 = var4 * 64 + this.field4998[0] * 128;
	}

	public final void method8914(int var1, int var2, Class256 var3) {
		if (this.field4997 < 9) {
			++this.field4997;
		}

		for (int var5 = this.field4997; var5 > 0; --var5) {
			this.field4990[var5] = this.field4990[var5 - 1];
			this.field4998[var5] = this.field4998[var5 - 1];
			this.field4999[var5] = this.field4999[var5 - 1];
		}

		this.field4990[0] = var1;
		this.field4998[0] = var2;
		this.field4999[0] = var3;
	}

	public final void method8908() {
		int var2 = this.field4988 - this.field4987 & 2047;
		if (var2 != 0) {
			boolean var3 = true;
			boolean var4 = true;
			int var5 = var2 > 1024 ? -1 : 1;
			this.field4987 += (this.field4992 > 0 ? 1 + this.field4989 : this.field4989) * var5;
			--this.field4992;
			if (var2 < this.field4989 || var2 > 2048 - this.field4989) {
				this.field4987 = this.field4988;
			}

			this.field4987 &= 2047;
		}

		if (0 == this.field4997) {
			this.method8913(this.field4990[0], this.field4998[0]);
		} else {
			int var11 = this.field4991;
			int var12 = this.field4993;
			byte var13 = 1;
			int var6 = this.field4990[this.field4997 - 1] * 128 + var13 * 64;
			int var7 = this.field4998[this.field4997 - 1] * 128 + var13 * 64;
			Class256 var8 = this.field4999[this.field4997 - 1];
			int var9 = (int)(Math.ceil((double)var8.field2702) * 128.0D);
			if (var6 - var11 <= var9 && var6 - var11 >= -var9 && var7 - var12 <= var9 && var7 - var12 >= -var9) {
				byte var10 = 4;
				if (this.field4997 > 2) {
					var10 = 6;
				}

				if (this.field4997 > 3) {
					var10 = 8;
				}

				int var14 = (int)((float)var10 * var8.field2702);
				if (var6 != var11 || var7 != var12) {
					if (var11 < var6) {
						this.field4991 += var14;
						if (this.field4991 > var6) {
							this.field4991 = var6;
						}
					} else if (var11 > var6) {
						this.field4991 -= var14;
						if (this.field4991 < var6) {
							this.field4991 = var6;
						}
					}

					if (var12 < var7) {
						this.field4993 += var14;
						if (this.field4993 > var7) {
							this.field4993 = var7;
						}
					} else if (var12 > var7) {
						this.field4993 -= var14;
						if (this.field4993 < var7) {
							this.field4993 = var7;
						}
					}
				}

				if (var6 == this.field4991 && this.field4993 == var7) {
					--this.field4997;
				}

			} else {
				this.field4991 = var6;
				this.field4993 = var7;
				--this.field4997;
			}
		}
	}
}