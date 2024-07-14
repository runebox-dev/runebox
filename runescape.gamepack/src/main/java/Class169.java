import io.runebox.ObfInfo;

@ObfInfo(name = "gm")
public class Class169 extends Class149 {
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public String field1851;
	@ObfInfo(name = "aq", desc = "J", longMultiplier = -7094035019809500935L)
	public long field1854;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class169(Class144 var1) {
		this.this$0 = var1;
		this.field1854 = -1L;
		this.field1851 = null;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V", opaque = "15")
	public void method3079(Class562 var1) {
		if (var1.method9902() != 255) {
			--var1.field5471;
			this.field1854 = var1.method9833();
		}

		this.field1851 = var1.method9836();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3463(this.field1854, this.field1851);
	}

	@ObfInfo(name = "jo", desc = "(IIIII)V", opaque = "1212027779")
	public static void method3532(int var0, int var1, int var2, int var3) {
		++Client.field643;
		Client.field5093.field1014.field2875 = Client.field541;
		if (Client.field170.field1266 >> 7 == Client.field778 && Client.field170.field1229 >> 7 == Client.field779) {
			Client.field778 = 0;
		}

		Class83 var5 = Client.field5093;
		if (Client.field577) {
			Client.method6615(var5, Client.field732, false);
		}

		Class83 var6 = Client.field5093;
		if (Client.field556 >= 0 && var6.field1024[Client.field556] != null) {
			Client.method6615(var6, Client.field556, false);
		}

		Class236.method4492(Client.field5093, true);
		Class83 var7 = Client.field5093;
		int var8 = var7.field1017.field1402;
		int[] var9 = var7.field1017.field1407;

		int var10;
		for (var10 = 0; var10 < var8; ++var10) {
			if (var9[var10] != Client.field556 && var9[var10] != Client.field732) {
				Client.method6615(var7, var9[var10], true);
			}
		}

		Class236.method4492(Client.field5093, false);
		Class83 var31 = Client.field5093;

		int var13;
		for (int var32 = 0; var32 < var31.field1020; ++var32) {
			Class483 var34 = var31.field1029[var31.field1031[var32]];
			if (var34 != null) {
				var34.field5003 = Client.method3531(var31, var34.field4997, var34.field4999, var31.field1016);
				var34.field5001.field1014.field2875 = Client.field541;
				var34.method8741();
				var31.field1014.method5263(var31.field1016, var34.field4997, var34.field4999, var34.field5003, 60, var34.field5001.field1014, var34.field5000, 0L, false);
				Class166.method3449(var34.field5001);
				Class83 var11 = var34.field5001;
				if (Client.field556 >= 0 && var11.field1024[Client.field556] != null) {
					Client.method6615(var11, Client.field556, false);
				}

				Class236.method4492(var34.field5001, true);
				Class83 var12 = var34.field5001;
				var13 = var12.field1017.field1402;
				int[] var14 = var12.field1017.field1407;

				for (int var15 = 0; var15 < var13; ++var15) {
					if (var14[var15] != Client.field556 && var14[var15] != Client.field732) {
						Client.method6615(var12, var14[var15], true);
					}
				}

				Class236.method4492(var34.field5001, false);
				Client.method5627(var34.field5001);
				Class83 var38 = var34.field5001;

				for (Class54 var39 = (Class54)var38.field1035.method7526(); var39 != null; var39 = (Class54)var38.field1035.method7511()) {
					if (var38.field1016 == var39.field384 && !var39.field382) {
						if (Client.field541 >= var39.field383) {
							var39.method1139(Client.field831);
							if (var39.field382) {
								var39.method9267();
							} else {
								var38.field1014.method5263(var39.field384, var39.field390, var39.field386, var39.field387, 60, var39, 0, -1L, false);
							}
						}
					} else {
						var39.method9267();
					}
				}
			}
		}

		Client.method5627(Client.field5093);
		Class83 var33 = Client.field5093;

		for (Class54 var35 = (Class54)var33.field1035.method7526(); var35 != null; var35 = (Class54)var33.field1035.method7511()) {
			if (var33.field1016 == var35.field384 && !var35.field382) {
				if (Client.field541 >= var35.field383) {
					var35.method1139(Client.field831);
					if (var35.field382) {
						var35.method9267();
					} else {
						var33.field1014.method5263(var35.field384, var35.field390, var35.field386, var35.field387, 60, var35, 0, -1L, false);
					}
				}
			} else {
				var35.method9267();
			}
		}

		Class126.method3030(var0, var1, var2, var3, true);
		var0 = Client.field810;
		var1 = Client.field811;
		var2 = Client.field812;
		var3 = Client.field726;
		Class569.method10183(var0, var1, var0 + var2, var1 + var3);
		Class274.method5171();
		Class569.method10150();
		var10 = Client.field657;
		if (Client.field631 / 256 > var10) {
			var10 = Client.field631 / 256;
		}

		if (Client.field797[4] && Client.field690[4] + 128 > var10) {
			var10 = Client.field690[4] + 128;
		}

		int var36 = Client.field615 & 2047;
		int var37 = Client.field4526;
		var13 = Client.field3024;
		int var40 = Client.field3275;
		int var17 = var10 * 3 + 600;
		Class6.method70(var37, var13, var40, var10, var36, var17, var3);
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		if (!Client.field792) {
			if (Client.field1474.method2554()) {
				var19 = Client.field5093.field1016;
			} else {
				label439: {
					var20 = 3;
					var21 = Client.field4407.method1959() >> 7;
					var22 = Client.field4407.method1966() >> 7;
					if (Client.field4606 < 310) {
						label434: {
							if (Client.field620 == 1) {
								var23 = Client.field4526 >> 7;
								var24 = Client.field3275 >> 7;
							} else {
								var23 = var21;
								var24 = var22;
							}

							var25 = Client.field144 >> 7;
							var26 = Client.field850 >> 7;
							if (var25 >= 0 && 104 > var25 && var26 >= 0 && 104 > var26) {
								if (var23 >= 0 && 104 > var23 && var24 >= 0 && 104 > var24) {
									if ((Client.field5093.field1023[Client.field5093.field1016][var25][var26] & 4) != 0) {
										var20 = Client.field5093.field1016;
									}

									if (var23 > var25) {
										var27 = var23 - var25;
									} else {
										var27 = var25 - var23;
									}

									if (var24 > var26) {
										var28 = var24 - var26;
									} else {
										var28 = var26 - var24;
									}

									int var30;
									if (var27 > var28) {
										var29 = var28 * 65536 / var27;
										var30 = 32768;

										while (true) {
											if (var23 == var25) {
												break label434;
											}

											if (var25 < var23) {
												++var25;
											} else if (var25 > var23) {
												--var25;
											}

											if ((Client.field5093.field1023[Client.field5093.field1016][var25][var26] & 4) != 0) {
												var20 = Client.field5093.field1016;
											}

											var30 += var29;
											if (var30 >= 65536) {
												var30 -= 65536;
												if (var26 < var24) {
													++var26;
												} else if (var26 > var24) {
													--var26;
												}

												if ((Client.field5093.field1023[Client.field5093.field1016][var25][var26] & 4) != 0) {
													var20 = Client.field5093.field1016;
												}
											}
										}
									} else {
										if (var28 > 0) {
											var29 = var27 * 65536 / var28;
											var30 = 32768;

											while (var24 != var26) {
												if (var26 < var24) {
													++var26;
												} else if (var26 > var24) {
													--var26;
												}

												if ((Client.field5093.field1023[Client.field5093.field1016][var25][var26] & 4) != 0) {
													var20 = Client.field5093.field1016;
												}

												var30 += var29;
												if (var30 >= 65536) {
													var30 -= 65536;
													if (var25 < var23) {
														++var25;
													} else if (var25 > var23) {
														--var25;
													}

													if ((Client.field5093.field1023[Client.field5093.field1016][var25][var26] & 4) != 0) {
														var20 = Client.field5093.field1016;
													}
												}
											}
										}
										break label434;
									}
								}

								var19 = Client.field5093.field1016;
								break label439;
							}

							var19 = Client.field5093.field1016;
							break label439;
						}
					}

					if (var21 >= 0 && 104 > var21 && var22 >= 0 && 104 > var22) {
						if ((Client.field5093.field1023[Client.field5093.field1016][var21][var22] & 4) != 0) {
							var20 = Client.field5093.field1016;
						}

						var19 = var20;
					} else {
						var19 = Client.field5093.field1016;
					}
				}
			}

			var18 = var19;
		} else {
			if (Client.field1474.method2554()) {
				var19 = Client.field5093.field1016;
			} else {
				var20 = Client.method3531(Client.field5093, Client.field144, Client.field850, Client.field5093.field1016);
				if (var20 - Client.field3664 < 800 && (Client.field5093.field1023[Client.field5093.field1016][Client.field144 >> 7][Client.field850 >> 7] & 4) != 0) {
					var19 = Client.field5093.field1016;
				} else {
					var19 = 3;
				}
			}

			var18 = var19;
		}

		var19 = Client.field144;
		var20 = Client.field3664;
		var21 = Client.field850;
		var22 = Client.field4606;
		var23 = Client.field3333;

		for (var24 = 0; var24 < 5; ++var24) {
			if (Client.field797[var24]) {
				var25 = (int)(Math.random() * (double)(Client.field798[var24] * 2 + 1) - (double)Client.field798[var24] + Math.sin((double)Client.field800[var24] / 100.0D * (double)Client.field524[var24]) * (double)Client.field690[var24]);
				if (var24 == 0) {
					Client.field144 += var25;
				}

				if (var24 == 1) {
					Client.field3664 += var25;
				}

				if (var24 == 2) {
					Client.field850 += var25;
				}

				if (var24 == 3) {
					Client.field3333 = Client.field3333 + var25 & 2047;
				}

				if (var24 == 4) {
					Client.field4606 += var25;
					if (Client.field4606 < 128) {
						Client.field4606 = 128;
					}

					if (Client.field4606 > 383) {
						Client.field4606 = 383;
					}
				}
			}
		}

		var24 = Class42.field231;
		var25 = Class42.field221;
		if (Class42.field227 != 0) {
			var24 = Class42.field230;
			var25 = Class42.field222;
		}

		if (var24 >= var0 && var24 < var0 + var2 && var25 >= var1 && var25 < var1 + var3) {
			var26 = var24 - var0;
			var27 = var25 - var1;
			Class296.field3047 = var26;
			Class296.field3046 = var27;
			Class296.field3050 = true;
			Class296.field3052 = 0;
			Class296.field3048 = false;
		} else {
			Class296.method3616();
		}

		Client.method3564();
		Class569.method10138(var0, var1, var2, var3, 0);
		Client.method3564();
		var26 = Class274.method5126();
		Class274.method5194(Client.field4671.field264);
		Class274.field2803.field3071 = Client.field814;
		Client.field5093.field1014.method5343(Client.field144, Client.field3664, Client.field850, Client.field4606, Client.field3333, var18);
		Class274.method5194(false);
		if (Client.field817) {
			Class569.method10151();
		}

		Class274.field2803.field3071 = var26;
		Client.method3564();
		Client.field5093.field1014.method5430();

		Class483 var41;
		for (var27 = 0; var27 < Client.field5093.field1020; ++var27) {
			var41 = Client.field5093.field1029[Client.field5093.field1031[var27]];
			if (var41 != null) {
				var41.field5001.field1014.method5430();
			}
		}

		Class479.method8710(Client.field5093, var0, var1, var2, var3);

		for (var27 = 0; var27 < Client.field5093.field1020; ++var27) {
			var41 = Client.field5093.field1029[Client.field5093.field1031[var27]];
			if (var41 != null) {
				Class479.method8710(var41.field5001, var0, var1, var2, var3);
			}
		}

		Class83 var42 = Client.field5093;
		if (Client.field550 == 2) {
			var28 = (Client.field553 - var42.field1019 << 7) + Client.field626;
			var29 = (Client.field813 - var42.field1021 << 7) + Client.field557;
			Client.method8077(var42, var28, var29, var28, var29, Client.field569 * 2);
			if (Client.field644 > -1 && Client.field541 % 20 < 10) {
				Client.field3331[0].method9628(Client.field644 + var0 - 12, Client.field611 + var1 - 28);
			}
		}

		((Class295)Class274.field2803.field3081).method5766(Client.field831);
		Client.method6321(var0, var1, var2, var3);
		Client.field144 = var19;
		Client.field3664 = var20;
		Client.field850 = var21;
		Client.field4606 = var22;
		Client.field3333 = var23;
		if (Client.field540 && Client.field2487.method7075(true, false) == 0) {
			Client.field540 = false;
		}

		if (Client.field540) {
			Class569.method10138(var0, var1, var2, var3, 0);
			Client.method1172(Class367.field4154, false);
		}

	}
}
