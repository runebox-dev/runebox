import io.runebox.ObfInfo;

@ObfInfo(name = "vv")
public final class Class568 extends Class569 {
	@ObfInfo(name = "aq", desc = "[B")
	public byte[] field5497;
	@ObfInfo(name = "an", desc = "I")
	public int field5493;
	@ObfInfo(name = "ap", desc = "I")
	public int field5494;
	@ObfInfo(name = "ag", desc = "I")
	public int field5495;
	@ObfInfo(name = "ak", desc = "I")
	public int field5496;
	@ObfInfo(name = "av", desc = "I")
	public int field5498;
	@ObfInfo(name = "aj", desc = "I")
	public int field5499;
	@ObfInfo(name = "ad", desc = "[I")
	public int[] field5500;

	@ObfInfo(name = "aq", desc = "()V")
	public void method10111() {
		if (this.field5495 != this.field5499 || this.field5496 != this.field5498) {
			byte[] var1 = new byte[this.field5499 * this.field5498];
			int var2 = 0;

			for (int var3 = 0; var3 < this.field5496; ++var3) {
				for (int var4 = 0; var4 < this.field5495; ++var4) {
					var1[this.field5494 + var4 + (this.field5493 + var3) * this.field5499] = this.field5497[var2++];
				}
			}

			this.field5497 = var1;
			this.field5495 = this.field5499;
			this.field5496 = this.field5498;
			this.field5494 = 0;
			this.field5493 = 0;
		}
	}

	@ObfInfo(name = "ad", desc = "(III)V")
	public void method10112(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field5500.length; ++var4) {
			int var5 = this.field5500[var4] >> 16 & 255;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = this.field5500[var4] >> 8 & 255;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.field5500[var4] & 255;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.field5500[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}

	@ObfInfo(name = "ag", desc = "(II)V")
	public void method10122(int var1, int var2) {
		var1 += this.field5494;
		var2 += this.field5493;
		int var3 = var1 + Class88.field5502 * var2;
		int var4 = 0;
		int var5 = this.field5496;
		int var6 = this.field5495;
		int var7 = Class88.field5502 - var6;
		int var8 = 0;
		int var9;
		if (var2 < Class569.field5505) {
			var9 = Class569.field5505 - var2;
			var5 -= var9;
			var2 = Class569.field5505;
			var4 += var9 * var6;
			var3 += Class88.field5502 * var9;
		}

		if (var5 + var2 > Class569.field5507) {
			var5 -= var5 + var2 - Class569.field5507;
		}

		if (var1 < Class569.field5508) {
			var9 = Class569.field5508 - var1;
			var6 -= var9;
			var1 = Class569.field5508;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 + var1 > Class569.field5509) {
			var9 = var6 + var1 - Class569.field5509;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			method10113(Class569.field5504, this.field5497, this.field5500, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfInfo(name = "ap", desc = "(IIII)V")
	public void method10120(int var1, int var2, int var3, int var4) {
		int var5 = this.field5495;
		int var6 = this.field5496;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.field5499;
		int var10 = this.field5498;
		int var11 = (var9 << 16) / var3;
		int var12 = (var10 << 16) / var4;
		int var13;
		if (this.field5494 > 0) {
			var13 = ((this.field5494 << 16) + var11 - 1) / var11;
			var1 += var13;
			var7 += var13 * var11 - (this.field5494 << 16);
		}

		if (this.field5493 > 0) {
			var13 = ((this.field5493 << 16) + var12 - 1) / var12;
			var2 += var13;
			var8 += var13 * var12 - (this.field5493 << 16);
		}

		if (var5 < var9) {
			var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
		}

		if (var6 < var10) {
			var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
		}

		var13 = var1 + Class88.field5502 * var2;
		int var14 = Class88.field5502 - var3;
		if (var4 + var2 > Class569.field5507) {
			var4 -= var4 + var2 - Class569.field5507;
		}

		int var15;
		if (var2 < Class569.field5505) {
			var15 = Class569.field5505 - var2;
			var4 -= var15;
			var13 += Class88.field5502 * var15;
			var8 += var15 * var12;
		}

		if (var3 + var1 > Class569.field5509) {
			var15 = var3 + var1 - Class569.field5509;
			var3 -= var15;
			var14 += var15;
		}

		if (var1 < Class569.field5508) {
			var15 = Class569.field5508 - var1;
			var3 -= var15;
			var13 += var15;
			var7 += var15 * var11;
			var14 += var15;
		}

		method10115(Class569.field5504, this.field5497, this.field5500, var7, var8, var13, var14, var3, var4, var11, var12, var5);
	}

	@ObfInfo(name = "ak", desc = "([I[B[IIIIIII)V")
	public static void method10113(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

	@ObfInfo(name = "an", desc = "([I[B[IIIIIIIIII)V")
	public static void method10115(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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
