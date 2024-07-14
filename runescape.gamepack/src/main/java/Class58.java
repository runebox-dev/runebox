import io.runebox.ObfInfo;

@ObfInfo(name = "cf")
public class Class58 {
	@ObfInfo(name = "ap", desc = "[[F")
	public float[][] field429;
	@ObfInfo(name = "ad", desc = "I")
	public int field426;
	@ObfInfo(name = "aq", desc = "I")
	public int field428;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field425;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field427;
	@ObfInfo(name = "an", desc = "[I")
	public int[] field430;

	public Class58() {
		Class67 var1 = Class64.field498;
		var1.method1942(24);
		this.field428 = var1.method1942(16);
		this.field426 = var1.method1942(24);
		this.field427 = new int[this.field426];
		boolean var2 = var1.method1930() != 0;
		int var3;
		int var4;
		int var6;
		if (var2) {
			var3 = 0;

			for (var4 = var1.method1942(5) + 1; var3 < this.field426; ++var4) {
				int var5 = var1.method1942(Class337.method3414(this.field426 - var3));

				for (var6 = 0; var6 < var5; ++var6) {
					this.field427[var3++] = var4;
				}
			}
		} else {
			boolean var15 = var1.method1930() != 0;

			for (var4 = 0; var4 < this.field426; ++var4) {
				if (var15 && var1.method1930() == 0) {
					this.field427[var4] = 0;
				} else {
					this.field427[var4] = var1.method1942(5) + 1;
				}
			}
		}

		this.method1180();
		var3 = var1.method1942(4);
		if (var3 > 0) {
			float var16 = Class64.method1301(var1.method1942(32));
			float var17 = Class64.method1301(var1.method1942(32));
			var6 = var1.method1942(4) + 1;
			boolean var7 = var1.method1930() != 0;
			int var8;
			if (var3 == 1) {
				var8 = method1182(this.field426, this.field428);
			} else {
				var8 = this.field428 * this.field426;
			}

			this.field425 = new int[var8];

			int var9;
			for (var9 = 0; var9 < var8; ++var9) {
				this.field425[var9] = var1.method1942(var6);
			}

			this.field429 = new float[this.field426][this.field428];
			float var10;
			int var11;
			int var12;
			if (var3 == 1) {
				for (var9 = 0; var9 < this.field426; ++var9) {
					var10 = 0.0F;
					var11 = 1;

					for (var12 = 0; var12 < this.field428; ++var12) {
						int var13 = var9 / var11 % var8;
						float var14 = (float)this.field425[var13] * var17 + var16 + var10;
						this.field429[var9][var12] = var14;
						if (var7) {
							var10 = var14;
						}

						var11 = var8 * var11;
					}
				}
			} else {
				for (var9 = 0; var9 < this.field426; ++var9) {
					var10 = 0.0F;
					var11 = this.field428 * var9;

					for (var12 = 0; var12 < this.field428; ++var12) {
						float var18 = (float)this.field425[var11] * var17 + var16 + var10;
						this.field429[var9][var12] = var18;
						if (var7) {
							var10 = var18;
						}

						++var11;
					}
				}
			}
		}

	}

	@ObfInfo(name = "ad", desc = "()V")
	public void method1180() {
		int[] var1 = new int[this.field426];
		int[] var2 = new int[33];

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < this.field426; ++var3) {
			var4 = this.field427[var3];
			if (var4 != 0) {
				var5 = 1 << 32 - var4;
				var6 = var2[var4];
				var1[var3] = var6;
				int var9;
				if ((var6 & var5) != 0) {
					var7 = var2[var4 - 1];
				} else {
					var7 = var6 | var5;

					for (var8 = var4 - 1; var8 >= 1; --var8) {
						var9 = var2[var8];
						if (var6 != var9) {
							break;
						}

						var10 = 1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}

						var2[var8] = var9 | var10;
					}
				}

				var2[var4] = var7;

				for (var8 = var4 + 1; var8 <= 32; ++var8) {
					var9 = var2[var8];
					if (var6 == var9) {
						var2[var8] = var7;
					}
				}
			}
		}

		this.field430 = new int[8];
		int var11 = 0;

		for (var3 = 0; var3 < this.field426; ++var3) {
			var4 = this.field427[var3];
			if (var4 != 0) {
				var5 = var1[var3];
				var6 = 0;

				for (var7 = 0; var7 < var4; ++var7) {
					var8 = Integer.MIN_VALUE >>> var7;
					if ((var5 & var8) != 0) {
						if (this.field430[var6] == 0) {
							this.field430[var6] = var11;
						}

						var6 = this.field430[var6];
					} else {
						++var6;
					}

					if (var6 >= this.field430.length) {
						int[] var12 = new int[this.field430.length * 2];

						for (var10 = 0; var10 < this.field430.length; ++var10) {
							var12[var10] = this.field430[var10];
						}

						this.field430 = var12;
					}

					var8 >>>= 1;
				}

				this.field430[var6] = ~var3;
				if (var6 >= var11) {
					var11 = var6 + 1;
				}
			}
		}

	}

	@ObfInfo(name = "ag", desc = "(Lco;)I")
	public int method1181(Class67 var1) {
		int var2;
		for (var2 = 0; this.field430[var2] >= 0; var2 = var1.method1930() != 0 ? this.field430[var2] : var2 + 1) {
		}

		return ~this.field430[var2];
	}

	@ObfInfo(name = "ak", desc = "(Lco;)[F")
	public float[] method1192(Class67 var1) {
		return this.field429[this.method1181(var1)];
	}

	@ObfInfo(name = "aq", desc = "(II)I")
	public static int method1182(int var0, int var1) {
		int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

		while (true) {
			int var4 = var2;
			int var5 = var1;

			int var6;
			for (var6 = 1; var5 > 1; var5 >>= 1) {
				if ((var5 & 1) != 0) {
					var6 = var4 * var6;
				}

				var4 *= var4;
			}

			int var3;
			if (var5 == 1) {
				var3 = var4 * var6;
			} else {
				var3 = var6;
			}

			if (var3 <= var0) {
				return var2;
			}

			--var2;
		}
	}
}
