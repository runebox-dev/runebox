import io.runebox.ObfInfo;

@ObfInfo(name = "ef")
public class Class110 implements Class393 {
	@ObfInfo(name = "ag", desc = "Lef;")
	public static final Class110 field1380;
	@ObfInfo(name = "ad", desc = "Lef;")
	public static final Class110 field1381;
	@ObfInfo(name = "ap", desc = "Lef;")
	public static final Class110 field1382;
	@ObfInfo(name = "aq", desc = "Lef;")
	public static final Class110 field1385;
	@ObfInfo(name = "ak", desc = "Lef;")
	public static final Class110 field1386;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1225591323)
	public final int field1383;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 961190565)
	public final int field1384;

	static {
		field1385 = new Class110(0, 0);
		field1381 = new Class110(4, 1);
		field1380 = new Class110(2, 2);
		field1386 = new Class110(3, 3);
		field1382 = new Class110(1, 4);
	}

	public Class110(int var1, int var2) {
		this.field1383 = var1;
		this.field1384 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field1384;
	}

	@ObfInfo(name = "aq", desc = "(Lfd;FB)F", opaque = "14")
	public static float method2870(Class134 var0, float var1) {
		if (var0 != null && var0.method3101() != 0) {
			if (var1 < (float)var0.field1566[0].field1590) {
				return Class138.field1611 == var0.field1567 ? var0.field1566[0].field1591 : Class153.method3997(var0, var1, true);
			} else if (var1 > (float)var0.field1566[var0.method3101() - 1].field1590) {
				return Class138.field1611 == var0.field1570 ? var0.field1566[var0.method3101() - 1].field1591 : Class153.method3997(var0, var1, false);
			} else if (var0.field1563) {
				return var0.field1566[0].field1591;
			} else {
				Class136 var3 = var0.method3110(var1);
				boolean var4 = false;
				boolean var5 = false;
				if (var3 == null) {
					return 0.0F;
				} else {
					float var6;
					float var7;
					float var8;
					if ((double)var3.field1599 == 0.0D && (double)var3.field1595 == 0.0D) {
						var4 = true;
					} else if (var3.field1599 == Float.MAX_VALUE && var3.field1595 == Float.MAX_VALUE) {
						var5 = true;
					} else if (var3.field1596 != null) {
						if (var0.field1565) {
							var6 = (float)var3.field1590;
							float var10 = var3.field1591;
							var7 = var3.field1599 * 0.33333334F + var6;
							float var11 = var3.field1595 * 0.33333334F + var10;
							float var9 = (float)var3.field1596.field1590;
							float var13 = var3.field1596.field1591;
							var8 = var9 - var3.field1596.field1592 * 0.33333334F;
							float var12 = var13 - var3.field1596.field1593 * 0.33333334F;
							if (var0.field1562) {
								Class153.method448(var0, var6, var7, var8, var9, var10, var11, var12, var13);
							} else if (var0 != null) {
								var0.field1579 = var6;
								float var14 = var9 - var6;
								float var15 = var13 - var10;
								float var16 = var7 - var6;
								float var17 = 0.0F;
								float var18 = 0.0F;
								if ((double)var16 != 0.0D) {
									var17 = (var11 - var10) / var16;
								}

								var16 = var9 - var8;
								if ((double)var16 != 0.0D) {
									var18 = (var13 - var12) / var16;
								}

								float var19 = 1.0F / (var14 * var14);
								float var20 = var14 * var17;
								float var21 = var14 * var18;
								var0.field1568 = (var20 + var21 - var15 - var15) * var19 / var14;
								var0.field1577 = (var15 + var15 + var15 - var20 - var20 - var21) * var19;
								var0.field1572 = var17;
								var0.field1573 = var10;
							}

							var0.field1565 = false;
						}
					} else {
						var4 = true;
					}

					if (var4) {
						return var3.field1591;
					} else if (var5) {
						return (float)var3.field1590 != var1 && var3.field1596 != null ? var3.field1596.field1591 : var3.field1591;
					} else if (var0.field1562) {
						if (var0 == null) {
							var6 = 0.0F;
						} else {
							if (var0.field1579 == var1) {
								var7 = 0.0F;
							} else if (var0.field1578 == var1) {
								var7 = 1.0F;
							} else {
								var7 = (var1 - var0.field1579) / (var0.field1578 - var0.field1579);
							}

							if (var0.field1581) {
								var8 = var7;
							} else {
								Class153.field1724[3] = var0.field1573;
								Class153.field1724[2] = var0.field1572;
								Class153.field1724[1] = var0.field1577;
								Class153.field1724[0] = var0.field1568 - var7;
								Class153.field1726[0] = 0.0F;
								Class153.field1726[1] = 0.0F;
								Class153.field1726[2] = 0.0F;
								Class153.field1726[3] = 0.0F;
								Class153.field1726[4] = 0.0F;
								int var22 = Class340.method6408(Class153.field1724, 3, 0.0F, true, 1.0F, true, Class153.field1726);
								if (var22 == 1) {
									var8 = Class153.field1726[0];
								} else {
									var8 = 0.0F;
								}
							}

							var6 = ((var0.field1569 * var8 + var0.field1576) * var8 + var0.field1575) * var8 + var0.field1574;
						}

						return var6;
					} else {
						if (var0 == null) {
							var6 = 0.0F;
						} else {
							var7 = var1 - var0.field1579;
							var6 = ((var0.field1568 * var7 + var0.field1577) * var7 + var0.field1572) * var7 + var0.field1573;
						}

						return var6;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}
}
