public final class Class557 extends Class561 {
	public byte[] field5393;
	public int field5392;
	public int field5395;
	public int field5396;
	public int field5397;
	public int field5398;
	public int field5399;
	public int[] field5394;

	public void method10084() {
		if (this.field5392 != this.field5396 || this.field5395 != this.field5399) {
			byte[] var1 = new byte[this.field5396 * this.field5399];
			int var2 = 0;

			for (int var3 = 0; var3 < this.field5395; ++var3) {
				for (int var4 = 0; var4 < this.field5392; ++var4) {
					var1[this.field5398 + var4 + (this.field5397 + var3) * this.field5396] = this.field5393[var2++];
				}
			}

			this.field5393 = var1;
			this.field5392 = this.field5396;
			this.field5395 = this.field5399;
			this.field5398 = 0;
			this.field5397 = 0;
		}
	}

	public void method10092(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field5394.length; ++var4) {
			int var5 = this.field5394[var4] >> 16 & 255;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = this.field5394[var4] >> 8 & 255;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.field5394[var4] & 255;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.field5394[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}

	public void method10086(int var1, int var2) {
		var1 += this.field5398;
		var2 += this.field5397;
		int var3 = var1 + Class87.field5423 * var2;
		int var4 = 0;
		int var5 = this.field5395;
		int var6 = this.field5392;
		int var7 = Class87.field5423 - var6;
		int var8 = 0;
		int var9;
		if (var2 < Class561.field5422) {
			var9 = Class561.field5422 - var2;
			var5 -= var9;
			var2 = Class561.field5422;
			var4 += var9 * var6;
			var3 += Class87.field5423 * var9;
		}

		if (var5 + var2 > Class561.field5419) {
			var5 -= var5 + var2 - Class561.field5419;
		}

		if (var1 < Class561.field5424) {
			var9 = Class561.field5424 - var1;
			var6 -= var9;
			var1 = Class561.field5424;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 + var1 > Class561.field5425) {
			var9 = var6 + var1 - Class561.field5425;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			method10087(Class561.field5418, this.field5393, this.field5394, var4, var3, var6, var5, var7, var8);
		}
	}

	public void method10088(int var1, int var2, int var3, int var4) {
		int var5 = this.field5392;
		int var6 = this.field5395;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.field5396;
		int var10 = this.field5399;
		int var11 = (var9 << 16) / var3;
		int var12 = (var10 << 16) / var4;
		int var13;
		if (this.field5398 > 0) {
			var13 = ((this.field5398 << 16) + var11 - 1) / var11;
			var1 += var13;
			var7 += var13 * var11 - (this.field5398 << 16);
		}

		if (this.field5397 > 0) {
			var13 = ((this.field5397 << 16) + var12 - 1) / var12;
			var2 += var13;
			var8 += var13 * var12 - (this.field5397 << 16);
		}

		if (var5 < var9) {
			var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
		}

		if (var6 < var10) {
			var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
		}

		var13 = var1 + Class87.field5423 * var2;
		int var14 = Class87.field5423 - var3;
		if (var4 + var2 > Class561.field5419) {
			var4 -= var4 + var2 - Class561.field5419;
		}

		int var15;
		if (var2 < Class561.field5422) {
			var15 = Class561.field5422 - var2;
			var4 -= var15;
			var13 += Class87.field5423 * var15;
			var8 += var15 * var12;
		}

		if (var3 + var1 > Class561.field5425) {
			var15 = var3 + var1 - Class561.field5425;
			var3 -= var15;
			var14 += var15;
		}

		if (var1 < Class561.field5424) {
			var15 = Class561.field5424 - var1;
			var3 -= var15;
			var13 += var15;
			var7 += var15 * var11;
			var14 += var15;
		}

		method10089(Class561.field5418, this.field5393, this.field5394, var7, var8, var13, var14, var3, var4, var11, var12, var5);
	}

	public static void method10087(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			byte var12;
			for (var11 = var9; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public static void method10089(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; ++var13) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				byte var16 = var1[(var3 >> 16) + var14];
				if (var16 != 0) {
					var0[var5++] = var2[var16 & 255];
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}
}
