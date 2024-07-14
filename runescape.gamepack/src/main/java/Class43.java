import io.runebox.ObfInfo;

@ObfInfo(name = "bq")
public class Class43 {
	@ObfInfo(name = "an", desc = "I")
	public int field233;
	@ObfInfo(name = "ad", desc = "I")
	public int field234;
	@ObfInfo(name = "ag", desc = "I")
	public int field235;
	@ObfInfo(name = "aq", desc = "I")
	public int field236;
	@ObfInfo(name = "ap", desc = "I")
	public int field237;
	@ObfInfo(name = "ak", desc = "I")
	public int field238;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field239;

	public Class43() {
		Class67 var1 = Class64.field498;
		this.field236 = var1.method1942(16);
		this.field234 = var1.method1942(24);
		this.field235 = var1.method1942(24);
		this.field238 = var1.method1942(24) + 1;
		this.field237 = var1.method1942(6) + 1;
		this.field233 = var1.method1942(8);
		int[] var2 = new int[this.field237];

		int var3;
		for (var3 = 0; var3 < this.field237; ++var3) {
			int var4 = 0;
			int var5 = var1.method1942(3);
			boolean var6 = var1.method1930() != 0;
			if (var6) {
				var4 = var1.method1942(5);
			}

			var2[var3] = var4 << 3 | var5;
		}

		this.field239 = new int[this.field237 * 8];

		for (var3 = 0; var3 < this.field237 * 8; ++var3) {
			this.field239[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method1942(8) : -1;
		}

	}

	@ObfInfo(name = "aq", desc = "([FIZLco;)V")
	public void method625(float[] var1, int var2, boolean var3, Class67 var4) {
		int var5;
		for (var5 = 0; var5 < var2; ++var5) {
			var1[var5] = 0.0F;
		}

		if (!var3) {
			var5 = Class64.field492[this.field233].field428;
			int var6 = this.field235 - this.field234;
			int var7 = var6 / this.field238;
			int[] var8 = new int[var7];

			for (int var9 = 0; var9 < 8; ++var9) {
				int var10 = 0;

				while (var10 < var7) {
					int var11;
					int var12;
					if (var9 == 0) {
						var11 = Class64.field492[this.field233].method1181(var4);

						for (var12 = var5 - 1; var12 >= 0; --var12) {
							if (var10 + var12 < var7) {
								var8[var10 + var12] = var11 % this.field237;
							}

							var11 /= this.field237;
						}
					}

					for (var11 = 0; var11 < var5; ++var11) {
						var12 = var8[var10];
						int var13 = this.field239[var12 * 8 + var9];
						if (var13 >= 0) {
							int var14 = this.field238 * var10 + this.field234;
							Class58 var15 = Class64.field492[var13];
							int var16;
							if (this.field236 == 0) {
								var16 = this.field238 / var15.field428;

								for (int var20 = 0; var20 < var16; ++var20) {
									float[] var21 = var15.method1192(var4);

									for (int var19 = 0; var19 < var15.field428; ++var19) {
										var1[var16 * var19 + var14 + var20] += var21[var19];
									}
								}
							} else {
								var16 = 0;

								while (var16 < this.field238) {
									float[] var17 = var15.method1192(var4);

									for (int var18 = 0; var18 < var15.field428; ++var18) {
										var1[var14 + var16] += var17[var18];
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
