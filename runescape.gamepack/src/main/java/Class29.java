import io.runebox.ObfInfo;
import java.util.concurrent.locks.ReentrantLock;

public class Class29 {
	@ObfInfo(name = "al", desc = "Lbr;")
	public Class44 field151;
	@ObfInfo(name = "ak", desc = "Lcn;")
	public Class66 field145;
	@ObfInfo(name = "aj", desc = "Ljava/util/concurrent/locks/ReentrantLock;")
	public ReentrantLock field146;

	public Class29(Class66 var1, Class44 var2) {
		this.field145 = var1;
		this.field151 = var2;
		this.field146 = new ReentrantLock();
	}

	@ObfInfo(name = "at", desc = "(I)V")
	public static void method399() {
		Class217.field2188.method5995();
	}

	@ObfInfo(name = "kn", desc = "(Ldt;Ldh;IIIIII)V", opaque = "903806254")
	public static void method397(Class98 var0, Class86 var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null && var1.method2264()) {
			if (var1 instanceof Class100) {
				Class225 var8 = ((Class100)var1).field1314;
				if (var8.field2351 != null) {
					var8 = var8.method4249();
				}

				if (var8 == null) {
					return;
				}
			}

			int var77 = var0.field1288.field1392;
			int[] var9 = var0.field1288.field1393;
			boolean var10 = var2 < var77;
			int var11 = -2;
			if (var1.field1075 != null && (!var10 || !var1.field1078 && (Client.field716 == 4 || !var1.field1072 && (Client.field716 == 0 || 3 == Client.field716 || 1 == Client.field716 && ((Class83)var1).method2250())))) {
				Client.method1053(var0, var1, var1.field1130);
				if (Client.field601 > -1 && Client.field589 < Client.field590) {
					Client.field520[Client.field589] = Client.field3003.method8080(var1.field1075) / 2;
					Client.field593[Client.field589] = Client.field3003.field4730;
					Client.field591[Client.field589] = Client.field601;
					Client.field592[Client.field589] = Client.field486 - var11;
					Client.field606[Client.field589] = var1.field1104;
					Client.field700[Client.field589] = var1.field1081;
					Client.field598[Client.field589] = var1.field1069;
					Client.field745[Client.field589] = var1.field1062;
					Client.field652[Client.field589] = var1.field1075;
					++Client.field589;
					var11 += 12;
				}
			}

			int var17;
			int var24;
			int var25;
			if (!var1.field1100.method7625()) {
				Client.method1053(var0, var1, 15 + var1.field1130);

				for (Class94 var12 = (Class94)var1.field1100.method7600(); var12 != null; var12 = (Class94)var1.field1100.method7637()) {
					Class103 var13 = var12.method2475(Client.field778);
					if (var13 == null) {
						if (var12.method2473()) {
							var12.method9277();
						}
					} else {
						Class194 var14 = var12.field1253;
						Class549 var15 = var14.method3817();
						Class549 var16 = var14.method3816();
						int var18 = 0;
						if (var15 != null && var16 != null) {
							if (var14.field2005 * 2 < var16.field5353) {
								var18 = var14.field2005;
							}

							var17 = var16.field5353 - var18 * 2;
						} else {
							var17 = var14.field2004;
						}

						int var19 = 255;
						boolean var20 = true;
						int var21 = Client.field778 - var13.field1360;
						int var22 = var13.field1357 * var17 / var14.field2004;
						int var23;
						int var98;
						if (var13.field1362 > var21) {
							var23 = 0 == var14.field2003 ? 0 : var21 / var14.field2003 * var14.field2003;
							var24 = var17 * var13.field1356 / var14.field2004;
							var98 = var24 + var23 * (var22 - var24) / var13.field1362;
						} else {
							var98 = var22;
							var23 = var13.field1362 + var14.field1991 - var21;
							if (var14.field1999 >= 0) {
								var19 = (var23 << 8) / (var14.field1991 - var14.field1999);
							}
						}

						if (var13.field1357 > 0 && var98 < 1) {
							var98 = 1;
						}

						if (var15 != null && var16 != null) {
							if (var98 == var17) {
								var98 += var18 * 2;
							} else {
								var98 += var18;
							}

							var23 = var15.field5354;
							var11 += var23;
							var24 = Client.field601 + var3 - (var17 >> 1);
							var25 = var4 + Client.field486 - var11;
							var24 -= var18;
							if (var19 >= 0 && var19 < 255) {
								var15.method9937(var24, var25, var19);
								Class561.method10153(var24, var25, var24 + var98, var25 + var23);
								var16.method9937(var24, var25, var19);
							} else {
								var15.method10023(var24, var25);
								Class561.method10153(var24, var25, var24 + var98, var25 + var23);
								var16.method10023(var24, var25);
							}

							Class561.method10144(var3, var4, var5 + var3, var6 + var4);
							var11 += 2;
						} else {
							var11 += 5;
							if (Client.field601 > -1) {
								var23 = Client.field601 + var3 - (var17 >> 1);
								var24 = var4 + Client.field486 - var11;
								Class561.method10152(var23, var24, var98, 5, 65280);
								Class561.method10152(var23 + var98, var24, var17 - var98, 5, 16711680);
							}

							var11 += 2;
						}
					}
				}
			}

			if (var11 == -2) {
				var11 += 7;
			}

			if (var10 && var1.field1115 == Client.field778) {
				Class83 var79 = (Class83)var1;
				boolean var78;
				if (0 == Client.field530) {
					var78 = false;
				} else if (Client.field107 != var79) {
					boolean var84 = 0 != (Client.field530 & 4);
					boolean var88 = var84 || Client.method8419() && var79.method2250();
					if (!var88) {
						boolean var90 = (Client.field530 & 2) != 0;
						var88 = var90 && var79.method2253();
					}

					var78 = var88;
				} else {
					var78 = Client.method7533();
				}

				if (var78) {
					Class83 var85 = (Class83)var1;
					if (var10) {
						Client.method1053(var0, var1, 15 + var1.field1130);
						Class436 var91 = (Class436)Client.field552.get(Class497.field5084);
						var11 += 4;
						var91.method7996(var85.field1025.method10260(), Client.field601 + var3, Client.field486 + var4 - var11, 16777215, 0);
						var11 += 18;
					}
				}
			}

			if (var10) {
				Class83 var81 = (Class83)var1;
				if (var81.field1015) {
					return;
				}

				if (var81.field1009 != -1 || -1 != var81.field1010) {
					Client.method1053(var0, var1, var1.field1130 + 15);
					if (Client.field601 > -1) {
						if (var81.field1009 != -1) {
							var11 += 25;
							Client.field29[var81.field1009].method10023(Client.field601 + var3 - 12, var4 + Client.field486 - var11);
						}

						if (var81.field1010 != -1) {
							var11 += 25;
							Client.field76[var81.field1010].method10023(Client.field601 + var3 - 12, var4 + Client.field486 - var11);
						}
					}
				}

				if (var2 >= 0 && Client.field742 == 10 && var9[var2] == Client.field775) {
					Client.method1053(var0, var1, 15 + var1.field1130);
					if (Client.field601 > -1) {
						var11 += Client.field4039[1].field5354;
						Client.field4039[1].method10023(Client.field601 + var3 - 12, Client.field486 + var4 - var11);
					}
				}
			} else {
				Class100 var83 = (Class100)var1;
				int[] var80 = var83.method2530();
				short[] var87 = var83.method2531();
				if (var87 != null && var80 != null) {
					for (int var92 = 0; var92 < var87.length; ++var92) {
						if (var87[var92] >= 0 && var80[var92] >= 0) {
							long var93 = (long)var80[var92] << 8 | (long)var87[var92];
							Class549 var96 = (Class549)Client.field777.method8583(var93);
							if (var96 == null) {
								Class549[] var97 = Class554.method6029(Client.field1793, var80[var92], 0);
								if (var97 != null && var87[var92] < var97.length) {
									var96 = var97[var87[var92]];
									Client.field777.method8588(var93, var96);
								}
							}

							if (var96 != null) {
								Client.method1053(var0, var1, 15 + var1.field1130);
								if (Client.field601 > -1) {
									var96.method10023(var3 + Client.field601 - (var96.field5353 >> 1), Client.field486 + (var4 - var96.field5354) - 4);
								}
							}
						}
					}
				}

				if (1 == Client.field742 && Client.field568 == var0.field1297[var2 - var77] && Client.field778 % 20 < 10) {
					Client.method1053(var0, var1, 15 + var1.field1130);
					if (Client.field601 > -1) {
						Client.field4039[0].method10023(Client.field601 + var3 - 12, var4 + Client.field486 - 28);
					}
				}
			}

			for (int var86 = 0; var86 < 4; ++var86) {
				int var82 = var1.field1086[var86];
				int var89 = var1.field1084[var86];
				Class218 var95 = null;
				int var94 = 0;
				if (var89 >= 0) {
					if (var82 <= Client.field778) {
						continue;
					}

					var95 = Class218.method287(var1.field1084[var86]);
					var94 = var95.field2206;
					if (var95 != null && var95.field2211 != null) {
						var95 = var95.method4152();
						if (var95 == null) {
							var1.field1086[var86] = -1;
							continue;
						}
					}
				} else if (var82 < 0) {
					continue;
				}

				var17 = var1.field1087[var86];
				Class218 var100 = null;
				if (var17 >= 0) {
					var100 = Class218.method287(var17);
					if (var100 != null && var100.field2211 != null) {
						var100 = var100.method4152();
					}
				}

				if (var82 - var94 <= Client.field778) {
					if (var95 == null) {
						var1.field1086[var86] = -1;
					} else {
						Client.method1053(var0, var1, var1.field1130 / 2);
						if (Client.field601 > -1) {
							boolean var99 = true;
							if (var86 == 1) {
								Client.field486 -= 20;
							}

							if (var86 == 2) {
								Client.field601 -= 15;
								Client.field486 -= 10;
							}

							if (var86 == 3) {
								Client.field601 += 15;
								Client.field486 -= 10;
							}

							Class549 var103 = null;
							Class549 var101 = null;
							Class549 var102 = null;
							Class549 var104 = null;
							var24 = 0;
							var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							int var31 = 0;
							Class549 var32 = null;
							Class549 var33 = null;
							Class549 var34 = null;
							Class549 var35 = null;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							int var44 = 0;
							var103 = var95.method4125();
							int var45;
							if (var103 != null) {
								var24 = var103.field5353;
								var45 = var103.field5354;
								if (var45 > var44) {
									var44 = var45;
								}

								var28 = var103.field5363;
							}

							var101 = var95.method4124();
							if (var101 != null) {
								var25 = var101.field5353;
								var45 = var101.field5354;
								if (var45 > var44) {
									var44 = var45;
								}

								var29 = var101.field5363;
							}

							var102 = var95.method4127();
							if (var102 != null) {
								var26 = var102.field5353;
								var45 = var102.field5354;
								if (var45 > var44) {
									var44 = var45;
								}

								var30 = var102.field5363;
							}

							var104 = var95.method4128();
							if (var104 != null) {
								var27 = var104.field5353;
								var45 = var104.field5354;
								if (var45 > var44) {
									var44 = var45;
								}

								var31 = var104.field5363;
							}

							if (var100 != null) {
								var32 = var100.method4125();
								if (var32 != null) {
									var36 = var32.field5353;
									var45 = var32.field5354;
									if (var45 > var44) {
										var44 = var45;
									}

									var40 = var32.field5363;
								}

								var33 = var100.method4124();
								if (var33 != null) {
									var37 = var33.field5353;
									var45 = var33.field5354;
									if (var45 > var44) {
										var44 = var45;
									}

									var41 = var33.field5363;
								}

								var34 = var100.method4127();
								if (var34 != null) {
									var38 = var34.field5353;
									var45 = var34.field5354;
									if (var45 > var44) {
										var44 = var45;
									}

									var42 = var34.field5363;
								}

								var35 = var100.method4128();
								if (var35 != null) {
									var39 = var35.field5353;
									var45 = var35.field5354;
									if (var45 > var44) {
										var44 = var45;
									}

									var43 = var35.field5363;
								}
							}

							Class418 var105 = var95.method4135();
							if (var105 == null) {
								var105 = Client.field5366;
							}

							Class418 var46;
							if (var100 != null) {
								var46 = var100.method4135();
								if (var46 == null) {
									var46 = Client.field5366;
								}
							} else {
								var46 = Client.field5366;
							}

							String var47 = null;
							String var48 = null;
							boolean var49 = false;
							int var50 = 0;
							var47 = var95.method4151(var1.field1085[var86]);
							int var106 = var105.method8080(var47);
							if (var100 != null) {
								var48 = var100.method4151(var1.field1097[var86]);
								var50 = var46.method8080(var48);
							}

							int var51 = 0;
							int var52 = 0;
							if (var25 > 0) {
								if (var102 == null && var104 == null) {
									var51 = 1;
								} else {
									var51 = 1 + var106 / var25;
								}
							}

							if (var100 != null && var37 > 0) {
								if (var34 == null && var35 == null) {
									var52 = 1;
								} else {
									var52 = var50 / var37 + 1;
								}
							}

							int var53 = 0;
							int var54 = var53;
							if (var24 > 0) {
								var53 += var24;
							}

							var53 += 2;
							int var55 = var53;
							if (var26 > 0) {
								var53 += var26;
							}

							int var56 = var53;
							int var57 = var53;
							int var58;
							if (var25 > 0) {
								var58 = var51 * var25;
								var53 += var58;
								var57 += (var58 - var106) / 2;
							} else {
								var53 += var106;
							}

							var58 = var53;
							if (var27 > 0) {
								var53 += var27;
							}

							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62 = 0;
							int var63 = 0;
							int var64;
							if (var100 != null) {
								var53 += 2;
								var59 = var53;
								if (var36 > 0) {
									var53 += var36;
								}

								var53 += 2;
								var60 = var53;
								if (var38 > 0) {
									var53 += var38;
								}

								var61 = var53;
								var63 = var53;
								if (var37 > 0) {
									var64 = var52 * var37;
									var53 += var64;
									var63 += (var64 - var50) / 2;
								} else {
									var53 += var50;
								}

								var62 = var53;
								if (var39 > 0) {
									var53 += var39;
								}
							}

							var64 = var1.field1086[var86] - Client.field778;
							int var65 = var95.field2205 - var95.field2205 * var64 / var95.field2206;
							int var66 = var95.field2190 * var64 / var95.field2206 + -var95.field2190;
							int var67 = var65 + (var3 + Client.field601 - (var53 >> 1));
							int var68 = var66 + (Client.field486 + var4 - 12);
							int var69 = var68;
							int var70 = var68 + var44;
							int var71 = var68 + 15 + var95.field2210;
							int var72 = var71 - var105.field4732;
							int var73 = var105.field4734 + var71;
							if (var72 < var68) {
								var69 = var72;
							}

							if (var73 > var70) {
								var70 = var73;
							}

							int var74 = 0;
							int var75;
							int var76;
							if (var100 != null) {
								var74 = var100.field2210 + var68 + 15;
								var75 = var74 - var46.field4732;
								var76 = var46.field4734 + var74;
								if (var75 < var69) {
									;
								}

								if (var76 > var70) {
									;
								}
							}

							var75 = 255;
							if (var95.field2204 >= 0) {
								var75 = (var64 << 8) / (var95.field2206 - var95.field2204);
							}

							if (var75 >= 0 && var75 < 255) {
								if (var103 != null) {
									var103.method9937(var67 + var54 - var28, var68, var75);
								}

								if (var102 != null) {
									var102.method9937(var67 + var55 - var30, var68, var75);
								}

								if (var101 != null) {
									for (var76 = 0; var76 < var51; ++var76) {
										var101.method9937(var76 * var25 + (var67 + var56 - var29), var68, var75);
									}
								}

								if (var104 != null) {
									var104.method9937(var67 + var58 - var31, var68, var75);
								}

								var105.method7994(var47, var67 + var57, var71, var95.field2212, 0, var75);
								if (var100 != null) {
									if (var32 != null) {
										var32.method9937(var67 + var59 - var40, var68, var75);
									}

									if (var34 != null) {
										var34.method9937(var67 + var60 - var42, var68, var75);
									}

									if (var33 != null) {
										for (var76 = 0; var76 < var52; ++var76) {
											var33.method9937(var76 * var37 + (var67 + var61 - var41), var68, var75);
										}
									}

									if (var35 != null) {
										var35.method9937(var67 + var62 - var43, var68, var75);
									}

									var46.method7994(var48, var67 + var63, var74, var100.field2212, 0, var75);
								}
							} else {
								if (var103 != null) {
									var103.method10023(var67 + var54 - var28, var68);
								}

								if (var102 != null) {
									var102.method10023(var67 + var55 - var30, var68);
								}

								if (var101 != null) {
									for (var76 = 0; var76 < var51; ++var76) {
										var101.method10023(var76 * var25 + (var67 + var56 - var29), var68);
									}
								}

								if (var104 != null) {
									var104.method10023(var67 + var58 - var31, var68);
								}

								var105.method8017(var47, var67 + var57, var71, var95.field2212 | -16777216, 0);
								if (var100 != null) {
									if (var32 != null) {
										var32.method10023(var67 + var59 - var40, var68);
									}

									if (var34 != null) {
										var34.method10023(var67 + var60 - var42, var68);
									}

									if (var33 != null) {
										for (var76 = 0; var76 < var52; ++var76) {
											var33.method10023(var76 * var37 + (var67 + var61 - var41), var68);
										}
									}

									if (var35 != null) {
										var35.method10023(var67 + var62 - var43, var68);
									}

									var46.method8017(var48, var67 + var63, var74, var100.field2212 | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
