import io.runebox.ObfInfo;

@ObfInfo(name = "kz")
public class Class286 extends Class520 {
	@ObfInfo(name = "ax", desc = "[I")
	public static int[] field3016;
	@ObfInfo(name = "an", desc = "Z")
	public boolean field3007;
	@ObfInfo(name = "az", desc = "Z")
	public boolean field3015;
	@ObfInfo(name = "ap", desc = "I")
	public int field3006;
	@ObfInfo(name = "ae", desc = "I")
	public int field3012;
	@ObfInfo(name = "au", desc = "I")
	public int field3013;
	@ObfInfo(name = "ai", desc = "[I")
	public int[] field3004;
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field3008;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field3009;
	@ObfInfo(name = "av", desc = "[I")
	public int[] field3010;
	@ObfInfo(name = "ah", desc = "[I")
	public int[] field3014;

	public Class286(Class562 var1) {
		this.field3015 = false;
		this.field3006 = var1.method9997();
		this.field3007 = var1.method9902() == 1;
		int var2 = var1.method9902();
		if (var2 >= 1 && var2 <= 4) {
			this.field3009 = new int[var2];

			int var3;
			for (var3 = 0; var3 < var2; ++var3) {
				this.field3009[var3] = var1.method9997();
			}

			if (var2 > 1) {
				this.field3010 = new int[var2 - 1];

				for (var3 = 0; var3 < var2 - 1; ++var3) {
					this.field3010[var3] = var1.method9902();
				}
			}

			if (var2 > 1) {
				this.field3008 = new int[var2 - 1];

				for (var3 = 0; var3 < var2 - 1; ++var3) {
					this.field3008[var3] = var1.method9902();
				}
			}

			this.field3004 = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.field3004[var3] = var1.method9832();
			}

			this.field3012 = var1.method9902();
			this.field3013 = var1.method9902();
			this.field3014 = null;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "aq", desc = "(DILok;)Z")
	public boolean method5686(double var1, int var3, Class375 var4) {
		int var5;
		for (var5 = 0; var5 < this.field3009.length; ++var5) {
			if (var4.method7157(this.field3009[var5]) == null) {
				return false;
			}
		}

		var5 = var3 * var3;
		this.field3014 = new int[var5];

		for (int var6 = 0; var6 < this.field3009.length; ++var6) {
			Class568 var7 = Class554.method5696(var4, this.field3009[var6]);
			var7.method10111();
			byte[] var8 = var7.field5497;
			int[] var9 = var7.field5500;
			int var10 = this.field3004[var6];
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
					if (var14 >> 8 == (var14 & 65535)) {
						var14 &= 255;
						var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & 65280;
					}
				}
			}

			for (var11 = 0; var11 < var9.length; ++var11) {
				var9[var11] = Class274.method5119(var9[var11], var1);
			}

			if (var6 == 0) {
				var11 = 0;
			} else {
				var11 = this.field3010[var6 - 1];
			}

			if (var11 == 0) {
				if (var7.field5495 == var3) {
					for (var12 = 0; var12 < var5; ++var12) {
						this.field3014[var12] = var9[var8[var12] & 255];
					}
				} else if (var7.field5495 == 64 && var3 == 128) {
					var12 = 0;

					for (var13 = 0; var13 < var3; ++var13) {
						for (var14 = 0; var14 < var3; ++var14) {
							this.field3014[var12++] = var9[var8[(var13 >> 1 << 6) + (var14 >> 1)] & 255];
						}
					}
				} else {
					if (var7.field5495 != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var12 = 0;

					for (var13 = 0; var13 < var3; ++var13) {
						for (var14 = 0; var14 < var3; ++var14) {
							this.field3014[var12++] = var9[var8[(var13 << 1 << 7) + (var14 << 1)] & 255];
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

	@ObfInfo(name = "ad", desc = "()V")
	public void method5687() {
		this.field3014 = null;
	}

	@ObfInfo(name = "ag", desc = "(I)V")
	public void method5688(int var1) {
		if (this.field3014 != null) {
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.field3012 == 1 || this.field3012 == 3) {
				if (field3016 == null || field3016.length < this.field3014.length) {
					field3016 = new int[this.field3014.length];
				}

				if (this.field3014.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field3014.length;
				var4 = var1 * var2 * this.field3013;
				var5 = var3 - 1;
				if (this.field3012 == 1) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) {
					var7 = var4 + var6 & var5;
					field3016[var6] = this.field3014[var7];
				}

				var10 = this.field3014;
				this.field3014 = field3016;
				field3016 = var10;
			}

			if (this.field3012 == 2 || this.field3012 == 4) {
				if (field3016 == null || field3016.length < this.field3014.length) {
					field3016 = new int[this.field3014.length];
				}

				if (this.field3014.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field3014.length;
				var4 = this.field3013 * var1;
				var5 = var2 - 1;
				if (this.field3012 == 2) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) {
					for (var7 = 0; var7 < var2; ++var7) {
						int var8 = var6 + var7;
						int var9 = (var4 + var7 & var5) + var6;
						field3016[var8] = this.field3014[var9];
					}
				}

				var10 = this.field3014;
				this.field3014 = field3016;
				field3016 = var10;
			}

		}
	}
}
