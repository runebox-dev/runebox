import io.runebox.ObfInfo;

@ObfInfo(name = "ez")
public class Class130 {
	@ObfInfo(name = "at", desc = "[F")
	public static float[] field1540;
	@ObfInfo(name = "aa", desc = "[F")
	public static float[] field1545;
	@ObfInfo(owner = "mo", name = "ak", desc = "J", longMultiplier = -2105784994464855103L)
	public static long field3433;
	@ObfInfo(owner = "uo", name = "al", desc = "J", longMultiplier = 6580268898646674783L)
	public static long field5299;
	@ObfInfo(name = "az", desc = "F")
	public static final float field1542;
	@ObfInfo(name = "af", desc = "F")
	public static final float field1543;

	static {
		field1542 = Math.ulp(1.0F);
		field1543 = 2.0F * field1542;
		field1545 = new float[4];
		field1540 = new float[5];
	}

	@ObfInfo(name = "ak", desc = "(I)J", opaque = "1584228593")
	public static synchronized long method3047() {
		long var1 = System.currentTimeMillis();
		if (var1 < field3433) {
			field5299 += field3433 - var1;
		}

		field3433 = var1;
		return var1 + field5299;
	}

	@ObfInfo(owner = "ka", name = "ak", desc = "(Lfm;FI)F", opaque = "1105352009")
	public static float method5160(Class143 var0, float var1) {
		if (var0 != null && var0.method3162() != 0) {
			if (var1 < (float)var0.field1627[0].field1476) {
				return Class141.field1613 == var0.field1645 ? var0.field1627[0].field1473 : Class301.method6024(var0, var1, true);
			} else if (var1 > (float)var0.field1627[var0.method3162() - 1].field1476) {
				return Class141.field1613 == var0.field1626 ? var0.field1627[var0.method3162() - 1].field1473 : Class301.method6024(var0, var1, false);
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
								method7418(var0, var6, var7, var8, var9, var10, var11, var12, var13);
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
								field1545[3] = var0.field1634;
								field1545[2] = var0.field1646;
								field1545[1] = var0.field1632;
								field1545[0] = var0.field1641 - var7;
								field1540[0] = 0.0F;
								field1540[1] = 0.0F;
								field1540[2] = 0.0F;
								field1540[3] = 0.0F;
								field1540[4] = 0.0F;
								int var22 = Class204.method3939(field1545, 3, 0.0F, true, 1.0F, true, field1540);
								if (var22 == 1) {
									var8 = field1540[0];
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

	@ObfInfo(owner = "pe", name = "aj", desc = "(Lfm;FFFFFFFFI)V", opaque = "262168940")
	public static void method7418(Class143 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			float var10 = var4 - var1;
			if ((double)var10 != 0.0D) {
				float var11 = var2 - var1;
				float var12 = var3 - var1;
				float[] var13 = new float[]{var11 / var10, var12 / var10};
				var0.field1628 = 0.33333334F == var13[0] && 0.6666667F == var13[1];
				float var14 = var13[0];
				float var15 = var13[1];
				if ((double)var13[0] < 0.0D) {
					var13[0] = 0.0F;
				}

				if ((double)var13[1] > 1.0D) {
					var13[1] = 1.0F;
				}

				float var16;
				float var17;
				float var18;
				float var19;
				float var20;
				if ((double)var13[0] > 1.0D || var13[1] < -1.0F) {
					var13[1] = 1.0F - var13[1];
					if (var13[0] < 0.0F) {
						var13[0] = 0.0F;
					}

					if (var13[1] < 0.0F) {
						var13[1] = 0.0F;
					}

					if (var13[0] > 1.0F || var13[1] > 1.0F) {
						var16 = (float)(1.0D + (double)var13[1] * ((double)var13[1] - 2.0D) + (double)(var13[0] * (var13[0] - 2.0F + var13[1])));
						if (var16 + field1542 > 0.0F) {
							if (var13[0] + field1542 < 1.3333334F) {
								var17 = var13[0] - 2.0F;
								var18 = var13[0] - 1.0F;
								var19 = (float)Math.sqrt((double)(var17 * var17 - var18 * 4.0F * var18));
								var20 = (var19 + -var17) * 0.5F;
								if (var13[1] + field1542 > var20) {
									var13[1] = var20 - field1542;
								} else {
									var20 = 0.5F * (-var17 - var19);
									if (var13[1] < var20 + field1542) {
										var13[1] = var20 + field1542;
									}
								}
							} else {
								var13[0] = 1.3333334F - field1542;
								var13[1] = 0.33333334F - field1542;
							}
						}
					}

					var13[1] = 1.0F - var13[1];
				}

				if (var13[0] != var14) {
					var2 = var13[0] * var10 + var1;
					if ((double)var14 != 0.0D) {
						var6 = var5 + (var6 - var5) * var13[0] / var14;
					}
				}

				if (var15 != var13[1]) {
					var3 = var13[1] * var10 + var1;
					if ((double)var15 != 1.0D) {
						var7 = (float)((double)var8 - (1.0D - (double)var13[1]) * (double)(var8 - var7) / (1.0D - (double)var15));
					}
				}

				var0.field1629 = var1;
				var0.field1630 = var4;
				var16 = var13[0];
				var17 = var13[1];
				var18 = var16 - 0.0F;
				var19 = var17 - var16;
				var20 = 1.0F - var17;
				float var21 = var19 - var18;
				var0.field1634 = var20 - var19 - var21;
				var0.field1646 = var21 + var21 + var21;
				var0.field1632 = var18 + var18 + var18;
				var0.field1641 = 0.0F;
				var18 = var6 - var5;
				var19 = var7 - var6;
				var20 = var8 - var7;
				var21 = var19 - var18;
				var0.field1623 = var20 - var19 - var21;
				var0.field1637 = var21 + var21 + var21;
				var0.field1636 = var18 + var18 + var18;
				var0.field1635 = var5;
			}
		}
	}

	@ObfInfo(name = "ho", desc = "(B)I", opaque = "-1")
	public static int method3051() {
		if (Client.field713 != null && Client.field785 < Client.field713.size()) {
			int var1 = 0;

			for (int var2 = 0; var2 <= Client.field785; ++var2) {
				var1 += ((Class82)Client.field713.get(var2)).field999;
			}

			return var1 * 10000 / Client.field786;
		} else {
			return 10000;
		}
	}

	@ObfInfo(name = "jp", desc = "(I)V", opaque = "16711935")
	public static void method3052() {
		Client.method2513(Client.field3961, Client.field110, Client.field283);
		Class318.method6188(Client.field148, Client.field2816);
		if (Client.field3961 == Client.field3960 && Client.field110 == Client.field1760 && Client.field283 == Client.field1538 && Client.field148 == Client.field1105 && Client.field2029 == Client.field2816) {
			Client.field752 = false;
			Client.field496 = false;
			Client.field746 = false;
			Client.field747 = false;
			Client.field3440 = 0;
			Client.field2982 = 0;
			Client.field1523 = 0;
			Client.field1408 = 0;
			Client.field2960 = 0;
			Client.field3830 = 0;
			Client.field1526 = 0;
			Client.field904 = 0;
			Client.field3887 = 0;
			Client.field4853 = 0;
			Client.field749 = null;
			Client.field751 = null;
			Client.field750 = null;
		}

	}
}
