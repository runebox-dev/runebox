public class Class261 {
	public static float method5160(Class143 var0, float var1) {
		if (var0 != null && var0.method3162() != 0) {
			if (var1 < (float)var0.field1627[0].field1476) {
				return var0.field1645 == Class141.field1613 ? var0.field1627[0].field1473 : Class301.method6024(var0, var1, true);
			} else if (var1 > (float)var0.field1627[var0.method3162() - 1].field1476) {
				return var0.field1626 == Class141.field1613 ? var0.field1627[var0.method3162() - 1].field1473 : Class301.method6024(var0, var1, false);
			} else if (var0.field1624) {
				return var0.field1627[0].field1473;
			} else {
				Class119 var3 = var0.method3173(var1);
				boolean var4 = false;
				boolean var5 = false;
				if (var3 == null) {
					return 0.0F;
				} else {
					float var6;
					float var7;
					float var8;
					if (0.0D == (double)var3.field1477 && 0.0D == (double)var3.field1478) {
						var4 = true;
					} else if (var3.field1477 == Float.MAX_VALUE && Float.MAX_VALUE == var3.field1478) {
						var5 = true;
					} else if (var3.field1479 != null) {
						if (var0.field1639) {
							var6 = (float)var3.field1476;
							float var10 = var3.field1473;
							var7 = var3.field1477 * 0.33333334F + var6;
							float var11 = var10 + var3.field1478 * 0.33333334F;
							float var9 = (float)var3.field1479.field1476;
							float var13 = var3.field1479.field1473;
							var8 = var9 - 0.33333334F * var3.field1479.field1475;
							float var12 = var13 - var3.field1479.field1474 * 0.33333334F;
							if (var0.field1631) {
								Class395.method7418(var0, var6, var7, var8, var9, var10, var11, var12, var13);
							} else if (var0 != null) {
								var0.field1629 = var6;
								float var14 = var9 - var6;
								float var15 = var13 - var10;
								float var16 = var7 - var6;
								float var17 = 0.0F;
								float var18 = 0.0F;
								if ((double)var16 != 0.0D) {
									var17 = (var11 - var10) / var16;
								}

								var16 = var9 - var8;
								if (0.0D != (double)var16) {
									var18 = (var13 - var12) / var16;
								}

								float var19 = 1.0F / (var14 * var14);
								float var20 = var14 * var17;
								float var21 = var14 * var18;
								var0.field1641 = var19 * (var21 + var20 - var15 - var15) / var14;
								var0.field1632 = var19 * (var15 + var15 + var15 - var20 - var20 - var21);
								var0.field1646 = var17;
								var0.field1634 = var10;
							}

							var0.field1639 = false;
						}
					} else {
						var4 = true;
					}

					if (var4) {
						return var3.field1473;
					} else if (var5) {
						return (float)var3.field1476 != var1 && var3.field1479 != null ? var3.field1479.field1473 : var3.field1473;
					} else if (var0.field1631) {
						if (var0 == null) {
							var6 = 0.0F;
						} else {
							if (var1 == var0.field1629) {
								var7 = 0.0F;
							} else if (var0.field1630 == var1) {
								var7 = 1.0F;
							} else {
								var7 = (var1 - var0.field1629) / (var0.field1630 - var0.field1629);
							}

							if (var0.field1628) {
								var8 = var7;
							} else {
								Class130.field1545[3] = var0.field1634;
								Class130.field1545[2] = var0.field1646;
								Class130.field1545[1] = var0.field1632;
								Class130.field1545[0] = var0.field1641 - var7;
								Class130.field1540[0] = 0.0F;
								Class130.field1540[1] = 0.0F;
								Class130.field1540[2] = 0.0F;
								Class130.field1540[3] = 0.0F;
								Class130.field1540[4] = 0.0F;
								int var22 = Class423.method3939(Class130.field1545, 3, 0.0F, true, 1.0F, true, Class130.field1540);
								if (var22 == 1) {
									var8 = Class130.field1540[0];
								} else {
									var8 = 0.0F;
								}
							}

							var6 = (var8 * (var0.field1637 + var0.field1623 * var8) + var0.field1636) * var8 + var0.field1635;
						}

						return var6;
					} else {
						if (var0 == null) {
							var6 = 0.0F;
						} else {
							var7 = var1 - var0.field1629;
							var6 = var0.field1634 + ((var0.field1632 + var7 * var0.field1641) * var7 + var0.field1646) * var7;
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
