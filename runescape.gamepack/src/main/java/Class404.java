import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "pn")
final class Class404 implements Comparator {
	public Class404() {
	}

	@ObfInfo(name = "aq", desc = "(Lpm;Lpm;B)I", opaque = "4")
	public int method7483(Class403 var1, Class403 var2) {
		return var1.field4648 < var2.field4648 ? -1 : (var2.field4648 == var1.field4648 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method7483((Class403)var1, (Class403)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfInfo(name = "mi", desc = "(IIIIB)V", opaque = "0")
	public static void method7493(int var0, int var1, int var2, int var3) {
		if (0 == Client.field614 && !Client.field692) {
			Client.method2780(Class367.field4204, "", 23, 0, var0 - var2, var1 - var3);
		}

		long var5 = -1L;
		int var7 = 0;
		long var8 = -1L;
		int var10 = 0;

		while (true) {
			int var12 = Class296.field3052;
			if (var10 >= var12) {
				if (var5 != -1L) {
					var10 = Class296.method3011(var5);
					int var11 = (int)(var5 >>> 7 & 127L);
					Class80 var32 = Client.field5093.field1024[Client.field556];
					Class96.method2565(var32, Client.field556, var10, var11, var7);
				}

				return;
			}

			long var13 = Class296.field3053[var10];
			if (var8 != var13) {
				var8 = var13;
				int var17 = Class296.method3011(Class296.field3053[var10]);
				int var19 = Class296.method7062(var10);
				long var22 = Class296.field3053[var10];
				int var21 = (int)(var22 >>> 14 & 3L);
				int var33 = Class296.method3212(var10);
				int var23 = Class296.method3254(var10);
				if (var23 == 2047) {
					var23 = -1;
				}

				Class83 var24 = null;
				if (var23 >= 0 && Client.field5093.field1029[var23] != null) {
					var24 = Client.field5093.field1029[var23].field5001;
				} else if (var23 == -1) {
					var24 = Client.field5093;
				}

				if (var24 != null) {
					label382: {
						int var25 = var24.field1016;
						int var29;
						if (var21 == 2 && var24.field1014.method5282(var25, var17, var19, var13) >= 0) {
							Class197 var26 = Class197.method61(var33);
							if (var26.field2166 != null) {
								var26 = var26.method3905();
							}

							if (var26 == null) {
								break label382;
							}

							Class103 var27 = null;

							for (Class103 var28 = (Class103)var24.field1033.method7526(); var28 != null; var28 = (Class103)var24.field1033.method7511()) {
								if (var25 == var28.field1318 && var28.field1322 == var17 && var19 == var28.field1321 && var33 == var28.field1319) {
									var27 = var28;
									break;
								}
							}

							if (!Client.field4580 && Client.field614 == 1) {
								Class247.method4829(Class367.field4035, Client.field668 + " " + Class111.field1392 + " " + Class111.method3839(65535) + var26.field2175, 1, var33, var17, var19, -1, false, var23);
							} else if (Client.field692) {
								if (!Client.field4580 && 4 == (Client.field969 & 4)) {
									Class247.method4829(Client.field695, Client.field696 + " " + Class111.field1392 + " " + Class111.method3839(65535) + var26.field2175, 2, var33, var17, var19, -1, false, var23);
								}
							} else {
								String[] var38 = var26.field2168;
								if (var38 != null) {
									for (var29 = 4; var29 >= 0; --var29) {
										if (!Client.field4580 && (var27 == null || var27.method2769(var29)) && var38[var29] != null) {
											short var30 = 0;
											if (var29 == 0) {
												var30 = 3;
											}

											if (var29 == 1) {
												var30 = 4;
											}

											if (var29 == 2) {
												var30 = 5;
											}

											if (var29 == 3) {
												var30 = 6;
											}

											if (var29 == 4) {
												var30 = 1001;
											}

											Class247.method4829(var38[var29], Class111.method3839(65535) + var26.field2175, var30, var33, var17, var19, -1, false, var23);
										}
									}
								}

								Class247.method4829(Class367.field4314, Class111.method3839(65535) + var26.field2175, 1002, var26.field2132, var17, var19, -1, false, var23);
							}
						}

						int var37;
						Class102 var39;
						int[] var40;
						Class80 var44;
						if (var21 == 1) {
							Class102 var34 = var24.field1013[var33];
							if (var34 == null) {
								break label382;
							}

							if (var34.field1309.field1943 == 1 && (var34.field1266 & 127) == 64 && (var34.field1229 & 127) == 64) {
								for (var37 = 0; var37 < var24.field1027; ++var37) {
									var39 = var24.field1013[var24.field1028[var37]];
									if (var39 != null && var39 != var34 && 1 == var39.field1309.field1943 && var39.field1266 == var34.field1266 && var39.field1229 == var34.field1229) {
										Client.method5047(var39, var24.field1028[var37], var17, var19, var23);
									}
								}

								var37 = var24.field1017.field1402;
								var40 = var24.field1017.field1407;

								for (var29 = 0; var29 < var37; ++var29) {
									var44 = var24.field1024[var40[var29]];
									if (var44 != null && var34.field1266 == var44.field1266 && var34.field1229 == var44.field1229) {
										Class96.method2565(var44, var40[var29], var17, var19, var23);
									}
								}
							}

							Client.method5047(var34, var33, var17, var19, var23);
						}

						if (var21 == 0) {
							Class80 var35 = var24.field1024[var33];
							if (var35 == null) {
								break label382;
							}

							if (64 == (var35.field1266 & 127) && 64 == (var35.field1229 & 127)) {
								for (var37 = 0; var37 < var24.field1027; ++var37) {
									var39 = var24.field1013[var24.field1028[var37]];
									if (var39 != null && var39.field1309.field1943 == 1 && var35.field1266 == var39.field1266 && var35.field1229 == var39.field1229) {
										Client.method5047(var39, var24.field1028[var37], var17, var19, var23);
									}
								}

								var37 = var24.field1017.field1402;
								var40 = var24.field1017.field1407;

								for (var29 = 0; var29 < var37; ++var29) {
									var44 = var24.field1024[var40[var29]];
									if (var44 != null && var44 != var35 && var44.field1266 == var35.field1266 && var44.field1229 == var35.field1229) {
										Class96.method2565(var44, var40[var29], var17, var19, var23);
									}
								}
							}

							if (Client.field556 != var33) {
								Class96.method2565(var35, var33, var17, var19, var23);
							} else {
								var5 = var13;
								var7 = var23;
							}
						}

						if (var21 == 3) {
							Class408 var36 = var24.field1032[var25][var17][var19];
							if (var36 != null) {
								for (Class119 var41 = (Class119)var36.method7510(); var41 != null; var41 = (Class119)var36.method7512()) {
									Class187 var42 = Class187.method3421(var41.field1439);
									if (!Client.field1660 && 1 == Client.field614) {
										Class247.method4829(Class367.field4035, Client.field668 + " " + Class111.field1392 + " " + Class111.method3839(16748608) + var42.field2013, 16, var41.field1439, var17, var19, -1, false, var23);
									} else if (Client.field692) {
										if (!Client.field1660 && (Client.field969 & 1) == 1) {
											Class247.method4829(Client.field695, Client.field696 + " " + Class111.field1392 + " " + Class111.method3839(16748608) + var42.field2013, 17, var41.field1439, var17, var19, -1, false, var23);
										}
									} else {
										String[] var43 = var42.field2054;

										for (int var45 = 4; var45 >= 0; --var45) {
											if (!Client.field1660 && var41.method2965(var45)) {
												if (var43 != null && null != var43[var45]) {
													byte var31 = 0;
													if (var45 == 0) {
														var31 = 18;
													}

													if (var45 == 1) {
														var31 = 19;
													}

													if (var45 == 2) {
														var31 = 20;
													}

													if (var45 == 3) {
														var31 = 21;
													}

													if (var45 == 4) {
														var31 = 22;
													}

													Class247.method4829(var43[var45], Class111.method3839(16748608) + var42.field2013, var31, var41.field1439, var17, var19, -1, false, var23);
												} else if (var45 == 2) {
													Class247.method4829(Class367.field4194, Class111.method3839(16748608) + var42.field2013, 20, var41.field1439, var17, var19, -1, false, var23);
												}
											}
										}

										Class247.method4829(Class367.field4314, Class111.method3839(16748608) + var42.field2013, 1004, var41.field1439, var17, var19, -1, false, var23);
									}
								}
							}
						}
					}
				}
			}

			++var10;
		}
	}
}
