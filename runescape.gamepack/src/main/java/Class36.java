public class Class36 {
	public int field253;
	public int field254;
	public int field255;
	public int field256;
	public int field257;
	public int field258;
	public int[] field259;

	public Class36() {
		Class61 var1 = Class66.field818;
		this.field256 = var1.method1109(16);
		this.field254 = var1.method1109(24);
		this.field255 = var1.method1109(24);
		this.field258 = var1.method1109(24) + 1;
		this.field257 = var1.method1109(6) + 1;
		this.field253 = var1.method1109(8);
		int[] var2 = new int[this.field257];

		int var3;
		for (var3 = 0; var3 < this.field257; ++var3) {
			int var4 = 0;
			int var5 = var1.method1109(3);
			boolean var6 = var1.method1104() != 0;
			if (var6) {
				var4 = var1.method1109(5);
			}

			var2[var3] = var4 << 3 | var5;
		}

		this.field259 = new int[this.field257 * 8];

		for (var3 = 0; var3 < this.field257 * 8; ++var3) {
			this.field259[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method1109(8) : -1;
		}

	}

	public void method739(float[] var1, int var2, boolean var3, Class61 var4) {
		int var5;
		for (var5 = 0; var5 < var2; ++var5) {
			var1[var5] = 0.0F;
		}

		if (!var3) {
			var5 = Class66.field807[this.field253].field913;
			int var6 = this.field255 - this.field254;
			int var7 = var6 / this.field258;
			int[] var8 = new int[var7];

			for (int var9 = 0; var9 < 8; ++var9) {
				int var10 = 0;

				while (var10 < var7) {
					int var11;
					int var12;
					if (var9 == 0) {
						var11 = Class66.field807[this.field253].method2107(var4);

						for (var12 = var5 - 1; var12 >= 0; --var12) {
							if (var12 + var10 < var7) {
								var8[var12 + var10] = var11 % this.field257;
							}

							var11 /= this.field257;
						}
					}

					for (var11 = 0; var11 < var5; ++var11) {
						var12 = var8[var10];
						int var13 = this.field259[var12 * 8 + var9];
						if (var13 >= 0) {
							int var14 = this.field254 + this.field258 * var10;
							Class75 var15 = Class66.field807[var13];
							int var16;
							if (this.field256 == 0) {
								var16 = this.field258 / var15.field913;

								for (int var20 = 0; var20 < var16; ++var20) {
									float[] var21 = var15.method2101(var4);

									for (int var19 = 0; var19 < var15.field913; ++var19) {
										var1[var20 + var14 + var19 * var16] += var21[var19];
									}
								}
							} else {
								var16 = 0;

								while (var16 < this.field258) {
									float[] var17 = var15.method2101(var4);

									for (int var18 = 0; var18 < var15.field913; ++var18) {
										var1[var16 + var14] += var17[var18];
										++var16;
									}
								}
							}
						}

						++var10;
						if (var10 >= var7) {
							break;
						}
					}
				}
			}

		}
	}
}
