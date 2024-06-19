public class Class257 extends Class506 {
	public static int[] field2726;
	public boolean field2719;
	public boolean field2725;
	public int field2716;
	public int field2722;
	public int field2723;
	public int[] field2712;
	public int[] field2713;
	public int[] field2714;
	public int[] field2718;
	public int[] field2720;

	public Class257(Class521 var1) {
		this.field2725 = false;
		this.field2716 = var1.method9407();
		this.field2719 = var1.method9405() == 1;
		int var2 = var1.method9405();
		if (var2 >= 1 && var2 <= 4) {
			this.field2718 = new int[var2];

			int var3;
			for (var3 = 0; var3 < var2; ++var3) {
				this.field2718[var3] = var1.method9407();
			}

			if (var2 > 1) {
				this.field2714 = new int[var2 - 1];

				for (var3 = 0; var3 < var2 - 1; ++var3) {
					this.field2714[var3] = var1.method9405();
				}
			}

			if (var2 > 1) {
				this.field2720 = new int[var2 - 1];

				for (var3 = 0; var3 < var2 - 1; ++var3) {
					this.field2720[var3] = var1.method9405();
				}
			}

			this.field2713 = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.field2713[var3] = var1.method9410();
			}

			this.field2722 = var1.method9405();
			this.field2723 = var1.method9405();
			this.field2712 = null;
		} else {
			throw new RuntimeException();
		}
	}

	public boolean method4912(double var1, int var3, Class382 var4) {
		int var5;
		for (var5 = 0; var5 < this.field2718.length; ++var5) {
			if (var4.method7225(this.field2718[var5]) == null) {
				return false;
			}
		}

		var5 = var3 * var3;
		this.field2712 = new int[var5];

		for (int var6 = 0; var6 < this.field2718.length; ++var6) {
			Class557 var7 = Class554.method3054(var4, this.field2718[var6]);
			var7.method10084();
			byte[] var8 = var7.field5393;
			int[] var9 = var7.field5394;
			int var10 = this.field2713[var6];
			if ((var10 & -16777216) == 16777216) {
			}

			if ((var10 & -16777216) == 33554432) {
			}

			int var11;
			int var12;
			int var13;
			int var14;
			if ((var10 & -16777216) == 50331648) {
				var11 = var10 & 16711935;
				var12 = var10 >> 8 & 255;

				for (var13 = 0; var13 < var9.length; ++var13) {
					var14 = var9[var13];
					if ((var14 & 65535) == var14 >> 8) {
						var14 &= 255;
						var9[var13] = var14 * var11 >> 8 & 16711935 | var14 * var12 & 65280;
					}
				}
			}

			for (var11 = 0; var11 < var9.length; ++var11) {
				var9[var11] = Class253.method4817(var9[var11], var1);
			}

			if (var6 == 0) {
				var11 = 0;
			} else {
				var11 = this.field2714[var6 - 1];
			}

			if (var11 == 0) {
				if (var7.field5392 == var3) {
					for (var12 = 0; var12 < var5; ++var12) {
						this.field2712[var12] = var9[var8[var12] & 255];
					}
				} else if (var7.field5392 == 64 && var3 == 128) {
					var12 = 0;

					for (var13 = 0; var13 < var3; ++var13) {
						for (var14 = 0; var14 < var3; ++var14) {
							this.field2712[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
						}
					}
				} else {
					if (var7.field5392 != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var12 = 0;

					for (var13 = 0; var13 < var3; ++var13) {
						for (var14 = 0; var14 < var3; ++var14) {
							this.field2712[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var11 == 1) {
			}

			if (var11 == 2) {
			}

			if (var11 == 3) {
			}
		}

		return true;
	}

	public void method4913() {
		this.field2712 = null;
	}

	public void method4914(int var1) {
		if (this.field2712 != null) {
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.field2722 == 1 || this.field2722 == 3) {
				if (field2726 == null || field2726.length < this.field2712.length) {
					field2726 = new int[this.field2712.length];
				}

				if (this.field2712.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field2712.length;
				var4 = var2 * var1 * this.field2723;
				var5 = var3 - 1;
				if (this.field2722 == 1) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) {
					var7 = var6 + var4 & var5;
					field2726[var6] = this.field2712[var7];
				}

				var10 = this.field2712;
				this.field2712 = field2726;
				field2726 = var10;
			}

			if (this.field2722 == 2 || this.field2722 == 4) {
				if (field2726 == null || field2726.length < this.field2712.length) {
					field2726 = new int[this.field2712.length];
				}

				if (this.field2712.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field2712.length;
				var4 = this.field2723 * var1;
				var5 = var2 - 1;
				if (this.field2722 == 2) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) {
					for (var7 = 0; var7 < var2; ++var7) {
						int var8 = var7 + var6;
						int var9 = var6 + (var7 + var4 & var5);
						field2726[var8] = this.field2712[var9];
					}
				}

				var10 = this.field2712;
				this.field2712 = field2726;
				field2726 = var10;
			}

		}
	}
}
