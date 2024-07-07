import io.runebox.ObfInfo;

@ObfInfo(name = "fw")
public class Class153 {
	@ObfInfo(name = "an", desc = "[F")
	public static float[] field1724;
	@ObfInfo(name = "aj", desc = "[F")
	public static float[] field1726;
	@ObfInfo(name = "ap", desc = "F")
	public static final float field1723;
	@ObfInfo(name = "ak", desc = "F")
	public static final float field1728;

	static {
		field1728 = Math.ulp(1.0F);
		field1723 = 2.0F * field1728;
		field1724 = new float[4];
		field1726 = new float[5];
	}

	@ObfInfo(owner = "hs", name = "ad", desc = "(Lfd;FZI)F", opaque = "-1068328352")
	public static float method3997(Class134 var0, float var1, boolean var2) {
		float var4 = 0.0F;
		if (var0 != null && var0.method3101() != 0) {
			float var5 = (float)var0.field1566[0].field1590;
			float var6 = (float)var0.field1566[var0.method3101() - 1].field1590;
			float var7 = var6 - var5;
			if (0.0D == (double)var7) {
				return var0.field1566[0].field1591;
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
				var9 = Math.abs(1.0D + var9);
				double var13 = var9 / 2.0D;
				double var15 = (double)((int)var13);
				var11 = (float)(var13 - var15);
				float var17;
				float var18;
				if (var2) {
					if (Class138.field1610 == var0.field1567) {
						if ((double)var11 != 0.0D) {
							var12 += var5;
						} else {
							var12 = var6 - var12;
						}
					} else if (Class138.field1608 != var0.field1567 && Class138.field1609 != var0.field1567) {
						if (Class138.field1607 == var0.field1567) {
							var12 = var5 - var1;
							var17 = var0.field1566[0].field1592;
							var18 = var0.field1566[0].field1593;
							var4 = var0.field1566[0].field1591;
							if ((double)var17 != 0.0D) {
								var4 -= var12 * var18 / var17;
							}

							return var4;
						}
					} else {
						var12 = var6 - var12;
					}
				} else if (Class138.field1610 == var0.field1570) {
					if (0.0D != (double)var11) {
						var12 = var6 - var12;
					} else {
						var12 += var5;
					}
				} else if (Class138.field1608 != var0.field1570 && Class138.field1609 != var0.field1570) {
					if (Class138.field1607 == var0.field1570) {
						var12 = var1 - var6;
						var17 = var0.field1566[var0.method3101() - 1].field1599;
						var18 = var0.field1566[var0.method3101() - 1].field1595;
						var4 = var0.field1566[var0.method3101() - 1].field1591;
						if ((double)var17 != 0.0D) {
							var4 += var12 * var18 / var17;
						}

						return var4;
					}
				} else {
					var12 += var5;
				}

				var4 = Class110.method2870(var0, var12);
				float var19;
				if (var2 && Class138.field1609 == var0.field1567) {
					var19 = var0.field1566[var0.method3101() - 1].field1591 - var0.field1566[0].field1591;
					var4 = (float)((double)var4 - var9 * (double)var19);
				} else if (!var2 && Class138.field1609 == var0.field1570) {
					var19 = var0.field1566[var0.method3101() - 1].field1591 - var0.field1566[0].field1591;
					var4 = (float)((double)var4 + var9 * (double)var19);
				}

				return var4;
			}
		} else {
			return var4;
		}
	}

	@ObfInfo(owner = "bg", name = "ag", desc = "(Lfd;FFFFFFFFB)V", opaque = "13")
	public static void method448(Class134 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			float var10 = var4 - var1;
			if ((double)var10 != 0.0D) {
				float var11 = var2 - var1;
				float var12 = var3 - var1;
				float[] var13 = new float[]{var11 / var10, var12 / var10};
				var0.field1581 = var13[0] == 0.33333334F && 0.6666667F == var13[1];
				float var14 = var13[0];
				float var15 = var13[1];
				if ((double)var13[0] < 0.0D) {
					var13[0] = 0.0F;
				}

				if ((double)var13[1] > 1.0D) {
					var13[1] = 1.0F;
				}

				float var16;
				if ((double)var13[0] > 1.0D || var13[1] < -1.0F) {
					var13[1] = 1.0F - var13[1];
					if (var13[0] < 0.0F) {
						var13[0] = 0.0F;
					}

					if (var13[1] < 0.0F) {
						var13[1] = 0.0F;
					}

					if (var13[0] > 1.0F || var13[1] > 1.0F) {
						var16 = (float)((double)(var13[0] * (var13[0] - 2.0F + var13[1])) + ((double)var13[1] - 2.0D) * (double)var13[1] + 1.0D);
						if (var16 + field1728 > 0.0F) {
							method2857(var13);
						}
					}

					var13[1] = 1.0F - var13[1];
				}

				if (var14 != var13[0]) {
					var2 = var10 * var13[0] + var1;
					if ((double)var14 != 0.0D) {
						var6 = (var6 - var5) * var13[0] / var14 + var5;
					}
				}

				if (var15 != var13[1]) {
					float var10000 = var1 + var13[1] * var10;
					if (1.0D != (double)var15) {
						var7 = (float)((double)var8 - (1.0D - (double)var13[1]) * (double)(var8 - var7) / (1.0D - (double)var15));
					}
				}

				var0.field1579 = var1;
				var0.field1578 = var4;
				method2961(0.0F, var13[0], var13[1], 1.0F, var0);
				var16 = var6 - var5;
				float var17 = var7 - var6;
				float var18 = var8 - var7;
				float var19 = var17 - var16;
				var0.field1569 = var18 - var17 - var19;
				var0.field1576 = var19 + var19 + var19;
				var0.field1575 = var16 + var16 + var16;
				var0.field1574 = var5;
			}
		}
	}

	@ObfInfo(owner = "ee", name = "ak", desc = "([FI)V", opaque = "-443491666")
	public static void method2857(float[] var0) {
		if (field1728 + var0[0] < 1.3333334F) {
			float var2 = var0[0] - 2.0F;
			float var3 = var0[0] - 1.0F;
			float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * var3 * 4.0F));
			float var5 = 0.5F * (var4 + -var2);
			if (var0[1] + field1728 > var5) {
				var0[1] = var5 - field1728;
			} else {
				var5 = (-var2 - var4) * 0.5F;
				if (var0[1] < field1728 + var5) {
					var0[1] = field1728 + var5;
				}
			}
		} else {
			var0[0] = 1.3333334F - field1728;
			var0[1] = 0.33333334F - field1728;
		}

	}

	@ObfInfo(owner = "eo", name = "ap", desc = "(FFFFLfd;B)V")
	public static void method2961(float var0, float var1, float var2, float var3, Class134 var4) {
		float var6 = var1 - var0;
		float var7 = var2 - var1;
		float var8 = var3 - var2;
		float var9 = var7 - var6;
		var4.field1573 = var8 - var7 - var9;
		var4.field1572 = var9 + var9 + var9;
		var4.field1577 = var6 + var6 + var6;
		var4.field1568 = var0;
	}
}
