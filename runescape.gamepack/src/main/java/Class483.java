import io.runebox.ObfInfo;

@ObfInfo(name = "so")
public class Class483 implements Class68 {
	@ObfInfo(name = "ah", desc = "[Ljb;")
	public Class236[] field5005;
	@ObfInfo(name = "ab", desc = "Lde;")
	public Class83 field5001;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 663953355)
	public int field4993;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1090116467)
	public int field4994;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -718963057)
	public int field4996;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -323233339)
	public int field4997;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 953925525)
	public int field4998;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1530400209)
	public int field4999;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -293479555)
	public int field5000;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 579113171)
	public int field5002;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 255992747)
	public int field5003;
	@ObfInfo(name = "au", desc = "[I")
	public int[] field4995;
	@ObfInfo(name = "ae", desc = "[I")
	public int[] field5004;

	public Class483(int var1, int var2, int var3, int var4) {
		this.field4996 = 0;
		this.field4994 = 0;
		this.field4993 = 2;
		this.field4998 = 0;
		this.field4997 = -1;
		this.field5003 = -1;
		this.field4999 = -1;
		this.field5000 = 0;
		this.field5002 = 0;
		this.field5004 = new int[10];
		this.field4995 = new int[10];
		this.field5005 = new Class236[10];
		this.field5001 = new Class83(var1, var2, var3, var4);
	}

	@ObfInfo(name = "ah", desc = "(I)V")
	public void method8741() {
		this.field5001.field1014.field2826 = this.field5001.field1016;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method1959() {
		return this.field4997;
	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method1966() {
		return this.field4999;
	}

	@ObfInfo(name = "ag", desc = "(I)I")
	public int method1957() {
		return this.field4996;
	}

	@ObfInfo(name = "az", desc = "(IILjb;I)V", opaque = "2129004065")
	public final void method8756(int var1, int var2, Class236 var3) {
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (this.field5004[0] >= 0 && this.field5004[0] < 104 && this.field4995[0] >= 0 && this.field4995[0] < 104) {
				this.method8746(var1, var2, var3);
			} else {
				this.method8751(var1, var2);
			}
		} else {
			this.method8751(var1, var2);
		}

	}

	@ObfInfo(name = "ax", desc = "(III)V")
	public void method8751(int var1, int var2) {
		this.field5002 = 0;
		this.field5004[0] = var1;
		this.field4995[0] = var2;
		byte var4 = 1;
		this.field4997 = this.field5004[0] * 128 + var4 * 64;
		this.field4999 = this.field4995[0] * 128 + var4 * 64;
	}

	@ObfInfo(name = "ac", desc = "(IILjb;I)V", opaque = "45610452")
	public final void method8746(int var1, int var2, Class236 var3) {
		if (this.field5002 < 9) {
			++this.field5002;
		}

		for (int var5 = this.field5002; var5 > 0; --var5) {
			this.field5004[var5] = this.field5004[var5 - 1];
			this.field4995[var5] = this.field4995[var5 - 1];
			this.field5005[var5] = this.field5005[var5 - 1];
		}

		this.field5004[0] = var1;
		this.field4995[0] = var2;
		this.field5005[0] = var3;
	}

	@ObfInfo(name = "al", desc = "(S)V", opaque = "1613")
	public final void method8745() {
		int var2 = this.field4994 - this.field5000 & 2047;
		if (var2 != 0) {
			boolean var3 = true;
			boolean var4 = true;
			int var5 = var2 > 1024 ? -1 : 1;
			this.field5000 += var5 * (this.field4998 > 0 ? this.field4993 + 1 : this.field4993);
			--this.field4998;
			if (var2 < this.field4993 || var2 > 2048 - this.field4993) {
				this.field5000 = this.field4994;
			}

			this.field5000 &= 2047;
		}

		if (this.field5002 == 0) {
			this.method8751(this.field5004[0], this.field4995[0]);
		} else {
			int var11 = this.field4997;
			int var12 = this.field4999;
			byte var13 = 1;
			int var6 = var13 * 128 / 2 + this.field5004[this.field5002 - 1] * 128;
			int var7 = var13 * 128 / 2 + this.field4995[this.field5002 - 1] * 128;
			Class236 var8 = this.field5005[this.field5002 - 1];
			int var9 = (int)(Math.ceil((double)var8.field2509) * 128.0D);
			if (var6 - var11 <= var9 && var6 - var11 >= -var9 && var7 - var12 <= var9 && var7 - var12 >= -var9) {
				byte var10 = 4;
				if (this.field5002 > 2) {
					var10 = 6;
				}

				if (this.field5002 > 3) {
					var10 = 8;
				}

				int var14 = (int)((float)var10 * var8.field2509);
				if (var11 != var6 || var12 != var7) {
					if (var11 < var6) {
						this.field4997 += var14;
						if (this.field4997 > var6) {
							this.field4997 = var6;
						}
					} else if (var11 > var6) {
						this.field4997 -= var14;
						if (this.field4997 < var6) {
							this.field4997 = var6;
						}
					}

					if (var12 < var7) {
						this.field4999 += var14;
						if (this.field4999 > var7) {
							this.field4999 = var7;
						}
					} else if (var12 > var7) {
						this.field4999 -= var14;
						if (this.field4999 < var7) {
							this.field4999 = var7;
						}
					}
				}

				if (this.field4997 == var6 && this.field4999 == var7) {
					--this.field5002;
				}

			} else {
				this.field4997 = var6;
				this.field4999 = var7;
				--this.field5002;
			}
		}
	}
}
