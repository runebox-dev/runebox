import io.runebox.ObfInfo;

@ObfInfo(name = "cw")
public class Class75 {
	@ObfInfo(name = "af", desc = "[[F")
	public float[][] field917;
	@ObfInfo(name = "ak", desc = "I")
	public int field913;
	@ObfInfo(name = "al", desc = "I")
	public int field914;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field915;
	@ObfInfo(name = "az", desc = "[I")
	public int[] field916;
	@ObfInfo(name = "aa", desc = "[I")
	public int[] field918;

	public Class75() {
		Class61 var1 = Class66.field818;
		var1.method1109(24);
		this.field913 = var1.method1109(16);
		this.field914 = var1.method1109(24);
		this.field915 = new int[this.field914];
		boolean var2 = var1.method1104() != 0;
		int var3;
		int var4;
		int var6;
		if (var2) {
			var3 = 0;

			for (var4 = var1.method1109(5) + 1; var3 < this.field914; ++var4) {
				int var5 = var1.method1109(Class319.method3791(this.field914 - var3));

				for (var6 = 0; var6 < var5; ++var6) {
					this.field915[var3++] = var4;
				}
			}
		} else {
			boolean var15 = var1.method1104() != 0;

			for (var4 = 0; var4 < this.field914; ++var4) {
				if (var15 && var1.method1104() == 0) {
					this.field915[var4] = 0;
				} else {
					this.field915[var4] = var1.method1109(5) + 1;
				}
			}
		}

		this.method2092();
		var3 = var1.method1109(4);
		if (var3 > 0) {
			float var16 = Class66.method1814(var1.method1109(32));
			float var17 = Class66.method1814(var1.method1109(32));
			var6 = var1.method1109(4) + 1;
			boolean var7 = var1.method1104() != 0;
			int var8;
			if (var3 == 1) {
				var8 = method2090(this.field914, this.field913);
			} else {
				var8 = this.field914 * this.field913;
			}

			this.field916 = new int[var8];

			int var9;
			for (var9 = 0; var9 < var8; ++var9) {
				this.field916[var9] = var1.method1109(var6);
			}

			this.field917 = new float[this.field914][this.field913];
			float var10;
			int var11;
			int var12;
			if (var3 == 1) {
				for (var9 = 0; var9 < this.field914; ++var9) {
					var10 = 0.0F;
					var11 = 1;

					for (var12 = 0; var12 < this.field913; ++var12) {
						int var13 = var9 / var11 % var8;
						float var14 = (float)this.field916[var13] * var17 + var16 + var10;
						this.field917[var9][var12] = var14;
						if (var7) {
							var10 = var14;
						}

						var11 *= var8;
					}
				}
			} else {
				for (var9 = 0; var9 < this.field914; ++var9) {
					var10 = 0.0F;
					var11 = this.field913 * var9;

					for (var12 = 0; var12 < this.field913; ++var12) {
						float var18 = (float)this.field916[var11] * var17 + var16 + var10;
						this.field917[var9][var12] = var18;
						if (var7) {
							var10 = var18;
						}

						++var11;
					}
				}
			}
		}

	}

	@ObfInfo(name = "al", desc = "()V")
	public void method2092() {
		int[] var1 = new int[this.field914];
		int[] var2 = new int[33];

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < this.field914; ++var3) {
			var4 = this.field915[var3];
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
						if (var9 != var6) {
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
					if (var9 == var6) {
						var2[var8] = var7;
					}
				}
			}
		}

		this.field918 = new int[8];
		int var11 = 0;

		for (var3 = 0; var3 < this.field914; ++var3) {
			var4 = this.field915[var3];
			if (var4 != 0) {
				var5 = var1[var3];
				var6 = 0;

				for (var7 = 0; var7 < var4; ++var7) {
					var8 = Integer.MIN_VALUE >>> var7;
					if ((var5 & var8) != 0) {
						if (this.field918[var6] == 0) {
							this.field918[var6] = var11;
						}

						var6 = this.field918[var6];
					} else {
						++var6;
					}

					if (var6 >= this.field918.length) {
						int[] var12 = new int[this.field918.length * 2];

						for (var10 = 0; var10 < this.field918.length; ++var10) {
							var12[var10] = this.field918[var10];
						}

						this.field918 = var12;
					}

					var8 >>>= 1;
				}

				this.field918[var6] = ~var3;
				if (var6 >= var11) {
					var11 = var6 + 1;
				}
			}
		}

	}

	@ObfInfo(name = "aj", desc = "(Lci;)I")
	public int method2107(Class61 var1) {
		int var2;
		for (var2 = 0; this.field918[var2] >= 0; var2 = var1.method1104() != 0 ? this.field918[var2] : var2 + 1) {
		}

		return ~this.field918[var2];
	}

	@ObfInfo(name = "az", desc = "(Lci;)[F")
	public float[] method2101(Class61 var1) {
		return this.field917[this.method2107(var1)];
	}

	@ObfInfo(name = "ak", desc = "(II)I")
	public static int method2090(int var0, int var1) {
		int var2;
		for (var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; Class497.method9205(var2, var1) > var0; --var2) {
		}

		return var2;
	}
}
