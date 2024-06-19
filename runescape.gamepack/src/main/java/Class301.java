public class Class301 implements Class298 {
	public int field3203;
	public int field3204;
	public int field3205;
	public int field3206;
	public int field3207;
	public int field3208;

	public void method5354(Class286 var1) {
		if (var1.field3135 > this.field3206) {
			var1.field3135 = this.field3206;
		}

		if (var1.field3136 < this.field3206) {
			var1.field3136 = this.field3206;
		}

		if (var1.field3134 > this.field3208) {
			var1.field3134 = this.field3208;
		}

		if (var1.field3129 < this.field3208) {
			var1.field3129 = this.field3208;
		}

	}

	public boolean method5327(int var1, int var2, int var3) {
		if (var1 >= this.field3203 && var1 < this.field3204 + this.field3203) {
			return var2 >> 6 == this.field3207 && this.field3205 == var3 >> 6;
		} else {
			return false;
		}
	}

	public boolean method5348(int var1, int var2) {
		return var1 >> 6 == this.field3206 && this.field3208 == var2 >> 6;
	}

	public int[] method5329(int var1, int var2, int var3) {
		if (!this.method5327(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field3206 * 64 - this.field3207 * 64 + var2, this.field3208 * 64 - this.field3205 * 64 + var3};
			return var5;
		}
	}

	public Class348 method5330(int var1, int var2) {
		if (!this.method5348(var1, var2)) {
			return null;
		} else {
			int var4 = var1 + (this.field3207 * 64 - this.field3206 * 64);
			int var5 = var2 + (this.field3205 * 64 - this.field3208 * 64);
			return new Class348(this.field3203, var4, var5);
		}
	}

	public void method5349(Class521 var1) {
		this.field3203 = var1.method9405();
		this.field3204 = var1.method9405();
		this.field3207 = var1.method9407();
		this.field3205 = var1.method9407();
		this.field3206 = var1.method9407();
		this.field3208 = var1.method9407();
		this.method6019();
	}

	public void method6019() {
	}

	public static void method6030() {
		Class279.field3086.method5890(5);
	}

	public static float method6024(Class143 var0, float var1, boolean var2) {
		float var4 = 0.0F;
		if (var0 != null && var0.method3162() != 0) {
			float var5 = (float)var0.field1627[0].field1476;
			float var6 = (float)var0.field1627[var0.method3162() - 1].field1476;
			float var7 = var6 - var5;
			if ((double)var7 == 0.0D) {
				return var0.field1627[0].field1473;
			} else {
				float var8 = 0.0F;
				if (var1 > var6) {
					var8 = (var1 - var6) / var7;
				} else {
					var8 = (var1 - var5) / var7;
				}

				double var9 = (double)((int)var8);
				float var11 = Math.abs((float)((double)var8 - var9));
				float var12 = var7 * var11;
				var9 = Math.abs(var9 + 1.0D);
				double var13 = var9 / 2.0D;
				double var15 = (double)((int)var13);
				var11 = (float)(var13 - var15);
				float var17;
				float var18;
				if (var2) {
					if (Class141.field1612 == var0.field1645) {
						if (0.0D != (double)var11) {
							var12 += var5;
						} else {
							var12 = var6 - var12;
						}
					} else if (var0.field1645 != Class141.field1616 && var0.field1645 != Class141.field1611) {
						if (var0.field1645 == Class141.field1609) {
							var12 = var5 - var1;
							var17 = var0.field1627[0].field1475;
							var18 = var0.field1627[0].field1474;
							var4 = var0.field1627[0].field1473;
							if (0.0D != (double)var17) {
								var4 -= var18 * var12 / var17;
							}

							return var4;
						}
					} else {
						var12 = var6 - var12;
					}
				} else if (var0.field1626 == Class141.field1612) {
					if ((double)var11 != 0.0D) {
						var12 = var6 - var12;
					} else {
						var12 += var5;
					}
				} else if (Class141.field1616 != var0.field1626 && var0.field1626 != Class141.field1611) {
					if (var0.field1626 == Class141.field1609) {
						var12 = var1 - var6;
						var17 = var0.field1627[var0.method3162() - 1].field1477;
						var18 = var0.field1627[var0.method3162() - 1].field1478;
						var4 = var0.field1627[var0.method3162() - 1].field1473;
						if ((double)var17 != 0.0D) {
							var4 += var12 * var18 / var17;
						}

						return var4;
					}
				} else {
					var12 += var5;
				}

				var4 = Class261.method5160(var0, var12);
				float var19;
				if (var2 && var0.field1645 == Class141.field1611) {
					var19 = var0.field1627[var0.method3162() - 1].field1473 - var0.field1627[0].field1473;
					var4 = (float)((double)var4 - (double)var19 * var9);
				} else if (!var2 && Class141.field1611 == var0.field1626) {
					var19 = var0.field1627[var0.method3162() - 1].field1473 - var0.field1627[0].field1473;
					var4 = (float)((double)var4 + var9 * (double)var19);
				}

				return var4;
			}
		} else {
			return var4;
		}
	}
}
