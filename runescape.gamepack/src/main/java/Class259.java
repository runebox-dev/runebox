import io.runebox.ObfInfo;

@ObfInfo(name = "jy")
public class Class259 {
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -606265631)
	public final int field2693;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 334735629)
	public final int field2694;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1849692139)
	public final int field2696;

	public Class259(int var1, int var2, int var3) {
		this.field2696 = var1;
		this.field2693 = var2;
		this.field2694 = var3;
	}

	@ObfInfo(name = "mn", desc = "([Lnx;IIIIIIIIB)V", opaque = "1")
	public static void method4985(Class362[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Class569.method10183(var2, var3, var4, var5);
		Class274.method5171();

		for (int var10 = 0; var10 < var0.length; ++var10) {
			Class362 var11 = var0[var10];
			if (var11 != null && (var1 == var11.field3832 || var1 == -1412584499 && Client.field761 == var11)) {
				int var12;
				if (var8 == -1) {
					Client.field750[Client.field666] = var6 + var11.field3826;
					Client.field751[Client.field666] = var11.field3827 + var7;
					Client.field752[Client.field666] = var11.field3828;
					Client.field598[Client.field666] = var11.field3829;
					var12 = ++Client.field666 - 1;
				} else {
					var12 = var8;
				}

				var11.field3957 = var12;
				var11.field3852 = Client.field541;
				if (!var11.field3896 || !Client.method3365(var11)) {
					if (var11.field3817 > 0) {
						Class41.method578(var11);
					}

					int var13 = var11.field3826 + var6;
					int var14 = var11.field3827 + var7;
					int var15 = var11.field3844;
					int var16;
					int var17;
					if (Client.field761 == var11) {
						if (var1 != -1412584499 && !var11.field3849) {
							Client.field4718 = var0;
							Client.field2790 = var6;
							Client.field1679 = var7;
							continue;
						}

						if (Client.field720 && Client.field714) {
							var16 = Class42.field231;
							var17 = Class42.field221;
							var16 -= Client.field653;
							var17 -= Client.field725;
							if (var16 < Client.field715) {
								var16 = Client.field715;
							}

							if (var16 + var11.field3828 > Client.field715 + Client.field710.field3828) {
								var16 = Client.field710.field3828 + Client.field715 - var11.field3828;
							}

							if (var17 < Client.field531) {
								var17 = Client.field531;
							}

							if (var17 + var11.field3829 > Client.field531 + Client.field710.field3829) {
								var17 = Client.field710.field3829 + Client.field531 - var11.field3829;
							}

							var13 = var16;
							var14 = var17;
						}

						if (!var11.field3849) {
							var15 = 128;
						}
					}

					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					int var23;
					if (var11.field3815 == 9) {
						var20 = var13;
						var21 = var14;
						var22 = var13 + var11.field3828;
						var23 = var14 + var11.field3829;
						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						if (var23 < var14) {
							var21 = var23;
							var23 = var14;
						}

						++var22;
						++var23;
						var16 = var20 > var2 ? var20 : var2;
						var17 = var21 > var3 ? var21 : var3;
						var18 = var22 < var4 ? var22 : var4;
						var19 = var23 < var5 ? var23 : var5;
					} else {
						var20 = var13 + var11.field3828;
						var21 = var14 + var11.field3829;
						var16 = var13 > var2 ? var13 : var2;
						var17 = var14 > var3 ? var14 : var3;
						var18 = var20 < var4 ? var20 : var4;
						var19 = var21 < var5 ? var21 : var5;
					}

					if (!var11.field3896 || var16 < var18 && var17 < var19) {
						if (var11.field3817 != 0) {
							if (1336 == var11.field3817) {
								if (Client.field1474.method2470()) {
									var14 += 15;
									Client.field2102.method8199("Fps:" + Class45.field252, var13 + var11.field3828, var14, 16776960, -1);
									var14 += 15;
									Runtime var41 = Runtime.getRuntime();
									var21 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L);
									var22 = 16776960;
									if (var21 > 327680 && !Client.field687) {
										var22 = 16711680;
									}

									Client.field2102.method8199("Mem:" + var21 + "k", var13 + var11.field3828, var14, var22, -1);
									var14 += 15;
								}
								continue;
							}

							if (1337 == var11.field3817) {
								Client.field686 = var13;
								Client.field576 = var14;
								Class169.method3532(var13, var14, var11.field3828, var11.field3829);
								Client.field747[var11.field3957] = true;
								Class569.method10183(var2, var3, var4, var5);
								continue;
							}

							if (var11.field3817 == 1338) {
								Client.method8468(var11, var13, var14, var12);
								Class569.method10183(var2, var3, var4, var5);
								continue;
							}

							if (1339 == var11.field3817) {
								Client.method4226(var11, var13, var14, var12);
								Class569.method10183(var2, var3, var4, var5);
								continue;
							}

							if (1400 == var11.field3817) {
								Client.field3069.method9165(var13, var14, var11.field3828, var11.field3829, Client.field541, Client.field1474.method2468());
							}

							if (var11.field3817 == 1401) {
								Client.field3069.method9072(var13, var14, var11.field3828, var11.field3829);
							}

							if (1402 == var11.field3817) {
								Class53.field1208.method2375(var13, Client.field541);
							}
						}

						if (var11.field3815 == 0) {
							if (!var11.field3896 && Client.method3365(var11) && Client.field1905 != var11) {
								continue;
							}

							if (!var11.field3896) {
								if (var11.field3835 > var11.field3837 - var11.field3829) {
									var11.field3835 = var11.field3837 - var11.field3829;
								}

								if (var11.field3835 < 0) {
									var11.field3835 = 0;
								}
							}

							method4985(var0, var11.field3812, var16, var17, var18, var19, var13 - var11.field3958, var14 - var11.field3835, var12);
							if (var11.field3950 != null) {
								method4985(var11.field3950, var11.field3812, var16, var17, var18, var19, var13 - var11.field3958, var14 - var11.field3835, var12);
							}

							Class100 var29 = (Class100)Client.field698.method9439((long)var11.field3812);
							if (var29 != null) {
								Client.method2768(var29.field1225, var16, var17, var18, var19, var13, var14, var12);
							}

							Class569.method10183(var2, var3, var4, var5);
							Class274.method5171();
						} else if (11 == var11.field3815) {
							if (Client.method3365(var11) && Client.field1905 != var11) {
								continue;
							}

							if (var11.field3950 != null) {
								method4985(var11.field3950, var11.field3812, var16, var17, var18, var19, var13 - var11.field3958, var14 - var11.field3835, var12);
							}

							Class569.method10183(var2, var3, var4, var5);
							Class274.method5171();
						}

						if (Client.field756 || Client.field749[var12] || Client.field608 > 1) {
							if (0 == var11.field3815 && !var11.field3896 && var11.field3837 > var11.field3829) {
								Client.method576(var11.field3828 + var13, var14, var11.field3835, var11.field3829, var11.field3837);
							}

							if (1 != var11.field3815) {
								if (3 == var11.field3815) {
									if (Client.method9305(var11)) {
										var20 = var11.field3839;
										if (Client.field1905 == var11 && 0 != var11.field3841) {
											var20 = var11.field3841;
										}
									} else {
										var20 = var11.field3894;
										if (Client.field1905 == var11 && 0 != var11.field3840) {
											var20 = var11.field3840;
										}
									}

									if (var11.field3842) {
										switch(var11.field3930.field5476) {
										case 1:
											Class569.method10139(var13, var14, var11.field3828, var11.field3829, var11.field3894, var11.field3839);
											break;
										case 2:
											Class569.method10140(var13, var14, var11.field3828, var11.field3829, var11.field3894, var11.field3839, 255 - (var11.field3844 & 255), 255 - (var11.field3845 & 255));
											break;
										default:
											if (var15 == 0) {
												Class569.method10138(var13, var14, var11.field3828, var11.field3829, var20);
											} else {
												Class569.method10157(var13, var14, var11.field3828, var11.field3829, var20, 256 - (var15 & 255));
											}
										}
									} else if (var15 == 0) {
										Class569.method10142(var13, var14, var11.field3828, var11.field3829, var20);
									} else {
										Class569.method10143(var13, var14, var11.field3828, var11.field3829, var20, 256 - (var15 & 255));
									}
								} else if (4 == var11.field3815) {
									Class424 var36 = var11.method6631(Client.field4644);
									if (var36 == null) {
										if (Class362.field3810) {
											Class490.method8827(var11);
										}
									} else {
										String var44 = var11.field3876;
										if (Client.method9305(var11)) {
											var21 = var11.field3839;
											if (Client.field1905 == var11 && 0 != var11.field3841) {
												var21 = var11.field3841;
											}

											if (var11.field3877.length() > 0) {
												var44 = var11.field3877;
											}
										} else {
											var21 = var11.field3894;
											if (Client.field1905 == var11 && var11.field3840 != 0) {
												var21 = var11.field3840;
											}
										}

										if (var11.field3896 && -1 != var11.field3946) {
											Class187 var45 = Class187.method3421(var11.field3946);
											var44 = var45.field2013;
											if (var44 == null) {
												var44 = Class367.field4306;
											}

											if ((1 == var45.field2025 || 1 != var11.field3919) && var11.field3919 != -1) {
												var44 = Class111.method3839(16748608) + var44 + Class111.field1394 + " " + 'x' + Client.method4482(var11.field3919);
											}
										}

										if (Client.field607 == var11) {
											var44 = Class367.field4207;
											var21 = var11.field3894;
										}

										if (!var11.field3896) {
											var44 = Client.method6771(var44, var11);
										}

										var36.method8149(var44, var13, var14, var11.field3828, var11.field3829, var21, var11.field3914 ? 0 : -1, Class501.method8891(var11.field3844), var11.field3879, var11.field3880, var11.field3843);
									}
								} else {
									int var25;
									int var26;
									int var42;
									if (var11.field3815 == 5) {
										Class553 var32;
										if (!var11.field3896) {
											var32 = var11.method6626(Client.field4644, Client.method9305(var11), Client.field4823);
											if (var32 != null) {
												var32.method9628(var13, var14);
											} else if (Class362.field3810) {
												Class490.method8827(var11);
											}
										} else {
											if (var11.field3946 != -1) {
												var32 = Class183.method3653(var11.field3946, var11.field3919, var11.field3924, var11.field3854, var11.field3874, false);
											} else {
												var32 = var11.method6626(Client.field4644, false, Client.field4823);
											}

											if (var32 == null) {
												if (Class362.field3810) {
													Class490.method8827(var11);
												}
											} else {
												var21 = var32.field5425;
												var22 = var32.field5426;
												if (!var11.field3821) {
													var23 = var11.field3828 * 4096 / var21;
													if (0 != var11.field3802) {
														var32.method9622(var13 + var11.field3828 / 2, var14 + var11.field3829 / 2, var11.field3802, var23);
													} else if (var15 != 0) {
														var32.method9614(var13, var14, var11.field3828, var11.field3829, 256 - (var15 & 255));
													} else if (var11.field3828 == var21 && var22 == var11.field3829) {
														var32.method9628(var13, var14);
													} else {
														var32.method9709(var13, var14, var11.field3828, var11.field3829);
													}
												} else {
													Class569.method10137(var13, var14, var11.field3828 + var13, var11.field3829 + var14);
													var23 = (var21 - 1 + var11.field3828) / var21;
													var42 = (var22 - 1 + var11.field3829) / var22;

													for (var25 = 0; var25 < var23; ++var25) {
														for (var26 = 0; var26 < var42; ++var26) {
															if (0 != var11.field3802) {
																var32.method9622(var21 / 2 + var13 + var25 * var21, var26 * var22 + var14 + var22 / 2, var11.field3802, 4096);
															} else if (var15 != 0) {
																var32.method9625(var25 * var21 + var13, var26 * var22 + var14, 256 - (var15 & 255));
															} else {
																var32.method9628(var25 * var21 + var13, var26 * var22 + var14);
															}
														}
													}

													Class569.method10183(var2, var3, var4, var5);
												}
											}
										}
									} else {
										int var27;
										if (6 == var11.field3815) {
											boolean var31 = Client.method9305(var11);
											if (var31) {
												var21 = var11.field3918;
											} else {
												var21 = var11.field3861;
											}

											Class308 var37 = null;
											var23 = 0;
											if (var11.field3946 != -1) {
												Class187 var38 = Class187.method3421(var11.field3946);
												if (var38 != null) {
													var38 = var38.method3787(var11.field3919);
													var37 = var38.method3777(1);
													if (var37 != null) {
														var37.method5865();
														var23 = var37.field2960 / 2;
													} else {
														Class490.method8827(var11);
													}
												}
											} else if (var11.field3891 == 5) {
												if (0 == var11.field3858) {
													var37 = Client.field815.method6434((Class217)null, -1, (Class217)null, -1);
												} else {
													var37 = Client.field170.method1140();
												}
											} else if (var11.field3891 == 7) {
												var37 = var11.field3820.method6434((Class217)null, -1, Class344.method6474(Client.field170.field1234), Client.field170.field1270);
											} else {
												Class190 var39 = null;
												if (6 == var11.field3891) {
													var25 = var11.field3858;
													if (var25 >= 0 && var25 < Client.field5093.field1013.length) {
														Class102 var40 = Client.field5093.field1013[var25];
														if (var40 != null && var40.field1309 != null) {
															var27 = var40.field1309.method3684();
															if (var27 != -1) {
																var11.field3858 = var27;
															}

															var39 = var40.method2764();
														}
													}
												} else if (2 == var11.field3891) {
													var25 = var11.field3858;
													var26 = Class184.method2222(var25).method3684();
													if (var26 != -1) {
														var11.field3858 = var26;
													}
												}

												Class217 var43 = null;
												var26 = -1;
												if (var21 != -1) {
													var43 = Class344.method6474(var21);
													var26 = var11.field3853;
												}

												var37 = var11.method6642(Client.field4644, var43, var26, var31, Client.field170.field1001, var39);
												if (var37 == null && Class362.field3810) {
													Class490.method8827(var11);
												}
											}

											Class274.method5176(var13 + var11.field3828 / 2, var11.field3829 / 2 + var14);
											var42 = Class274.field2804[var11.field3865] * var11.field3868 >> 16;
											var25 = Class274.field2805[var11.field3865] * var11.field3868 >> 16;
											if (var37 != null) {
												if (!var11.field3896) {
													var37.method5883(0, var11.field3866, 0, var11.field3865, 0, var42, var25);
												} else {
													var37.method5865();
													if (var11.field3872) {
														var37.method5884(0, var11.field3866, var11.field3867, var11.field3865, var11.field3863, var42 + var23 + var11.field3864, var11.field3864 + var25, var11.field3868);
													} else {
														var37.method5883(0, var11.field3866, var11.field3867, var11.field3865, var11.field3863, var11.field3864 + var42 + var23, var11.field3864 + var25);
													}
												}
											}

											Class274.method5131();
										} else {
											Class424 var33;
											if (8 == var11.field3815 && Client.field879 == var11 && Client.field526 == Client.field688) {
												var20 = 0;
												var21 = 0;
												var33 = Client.field2102;
												String var35 = var11.field3876;

												String var24;
												for (var35 = Client.method6771(var35, var11); var35.length() > 0; var21 += var33.field4784 + 1) {
													var25 = var35.indexOf(Class111.field1393);
													if (var25 != -1) {
														var24 = var35.substring(0, var25);
														var35 = var35.substring(var25 + 4);
													} else {
														var24 = var35;
														var35 = "";
													}

													var26 = var33.method8139(var24);
													if (var26 > var20) {
														var20 = var26;
													}
												}

												var20 += 6;
												var21 += 7;
												var25 = var13 + var11.field3828 - 5 - var20;
												var26 = 5 + var11.field3829 + var14;
												if (var25 < var13 + 5) {
													var25 = var13 + 5;
												}

												if (var25 + var20 > var4) {
													var25 = var4 - var20;
												}

												if (var26 + var21 > var5) {
													var26 = var5 - var21;
												}

												Class569.method10138(var25, var26, var20, var21, 16777120);
												Class569.method10142(var25, var26, var20, var21, 0);
												var35 = var11.field3876;
												var27 = 2 + var33.field4784 + var26;

												for (var35 = Client.method6771(var35, var11); var35.length() > 0; var27 += var33.field4784 + 1) {
													int var28 = var35.indexOf(Class111.field1393);
													if (var28 != -1) {
														var24 = var35.substring(0, var28);
														var35 = var35.substring(var28 + 4);
													} else {
														var24 = var35;
														var35 = "";
													}

													var33.method8248(var24, var25 + 3, var27, 0, -1);
												}
											}

											if (var11.field3815 == 9) {
												if (var11.field3862) {
													var21 = var14 + var11.field3829;
													var22 = var13 + var11.field3828;
													var23 = var14;
												} else {
													var21 = var14;
													var22 = var13 + var11.field3828;
													var23 = var11.field3829 + var14;
												}

												if (1 == var11.field3846) {
													Class569.method10148(var13, var21, var22, var23, var11.field3894);
												} else {
													Client.method4684(var13, var21, var22, var23, var11.field3894, var11.field3846);
												}
											} else if (var11.field3815 == 12) {
												Class363 var30 = var11.method6756();
												Class359 var34 = var11.method6655();
												if (var30 != null && var34 != null && var30.method6830()) {
													var33 = var11.method6631(Client.field4644);
													if (var33 != null) {
														Client.field739.method9774(var13, var14, var11.field3828, var11.field3829, var30.method6831(), var30.method6832(), var30.method6969(), var30.method6829(), var30.method7028());
														var23 = var11.field3914 ? var11.field3854 : -1;
														if (!var30.method6825() && var30.method6822().method7888()) {
															Client.field739.method9785(var34.field3788, var23, var34.field3790, var34.field3789);
															Client.field739.method9776(var30.method6865(), var33);
														} else {
															Client.field739.method9785(var11.field3894, var23, var34.field3790, var34.field3789);
															Client.field739.method9776(var30.method6822(), var33);
														}

														Class569.method10183(var2, var3, var4, var5);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}
}
