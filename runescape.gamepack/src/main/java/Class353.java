import io.runebox.ObfInfo;

@ObfInfo(name = "no")
public class Class353 extends Class506 {
	@ObfInfo(name = "ak", desc = "Ltx;")
	public Class518 field3899;
	@ObfInfo(name = "al", desc = "[B")
	public byte[] field3900;

	public Class353(Class521 var1) {
		this.field3899 = new Class518(16);
		var1.field5219 = var1.field5221.length - 3;
		int var2 = var1.method9405();
		int var3 = var1.method9407();
		int var4 = 14 + var2 * 10;
		var1.field5219 = 0;
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		int var12 = 0;

		int var13;
		int var14;
		int var15;
		for (var13 = 0; var13 < var2; ++var13) {
			var14 = -1;

			while (true) {
				var15 = var1.method9405();
				if (var15 != var14) {
					++var4;
				}

				var14 = var15 & 15;
				if (var15 == 7) {
					break;
				}

				if (var15 == 23) {
					++var5;
				} else if (var14 == 0) {
					++var7;
				} else if (var14 == 1) {
					++var8;
				} else if (var14 == 2) {
					++var6;
				} else if (var14 == 3) {
					++var9;
				} else if (var14 == 4) {
					++var10;
				} else if (var14 == 5) {
					++var11;
				} else {
					if (var14 != 6) {
						throw new RuntimeException();
					}

					++var12;
				}
			}
		}

		var4 += var5 * 5;
		var4 += 2 * (var8 + var7 + var6 + var9 + var11);
		var4 += var12 + var10;
		var13 = var1.field5219;
		var14 = var5 + var2 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

		for (var15 = 0; var15 < var14; ++var15) {
			var1.method9424();
		}

		var4 += var1.field5219 - var13;
		var15 = var1.field5219;
		int var16 = 0;
		int var17 = 0;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		int var22 = 0;
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28 = 0;

		int var29;
		for (var29 = 0; var29 < var6; ++var29) {
			var28 = var1.method9405() + var28 & 127;
			if (var28 != 0 && var28 != 32) {
				if (var28 == 1) {
					++var16;
				} else if (var28 == 33) {
					++var17;
				} else if (var28 == 7) {
					++var18;
				} else if (var28 == 39) {
					++var19;
				} else if (var28 == 10) {
					++var20;
				} else if (var28 == 42) {
					++var21;
				} else if (var28 == 99) {
					++var22;
				} else if (var28 == 98) {
					++var23;
				} else if (var28 == 101) {
					++var24;
				} else if (var28 == 100) {
					++var25;
				} else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
					++var27;
				} else {
					++var26;
				}
			} else {
				++var12;
			}
		}

		var29 = 0;
		int var30 = var1.field5219;
		var1.field5219 += var26;
		int var31 = var1.field5219;
		var1.field5219 += var11;
		int var32 = var1.field5219;
		var1.field5219 += var10;
		int var33 = var1.field5219;
		var1.field5219 += var9;
		int var34 = var1.field5219;
		var1.field5219 += var16;
		int var35 = var1.field5219;
		var1.field5219 += var18;
		int var36 = var1.field5219;
		var1.field5219 += var20;
		int var37 = var1.field5219;
		var1.field5219 += var8 + var7 + var11;
		int var38 = var1.field5219;
		var1.field5219 += var7;
		int var39 = var1.field5219;
		var1.field5219 += var27;
		int var40 = var1.field5219;
		var1.field5219 += var8;
		int var41 = var1.field5219;
		var1.field5219 += var17;
		int var42 = var1.field5219;
		var1.field5219 += var19;
		int var43 = var1.field5219;
		var1.field5219 += var21;
		int var44 = var1.field5219;
		var1.field5219 += var12;
		int var45 = var1.field5219;
		var1.field5219 += var9;
		int var46 = var1.field5219;
		var1.field5219 += var22;
		int var47 = var1.field5219;
		var1.field5219 += var23;
		int var48 = var1.field5219;
		var1.field5219 += var24;
		int var49 = var1.field5219;
		var1.field5219 += var25;
		int var50 = var1.field5219;
		var1.field5219 += var5 * 3;
		this.field3900 = new byte[var4];
		Class521 var51 = new Class521(this.field3900);
		var51.method9590(1297377380);
		var51.method9590(6);
		var51.method9389(var2 > 1 ? 1 : 0);
		var51.method9389(var2);
		var51.method9389(var3);
		var1.field5219 = var13;
		int var52 = 0;
		int var53 = 0;
		int var54 = 0;
		int var55 = 0;
		int var56 = 0;
		int var57 = 0;
		int var58 = 0;
		int[] var59 = new int[128];
		var28 = 0;
		int[] var60 = new int[16];
		int[] var61 = new int[16];
		var61[9] = 128;
		var60[9] = 128;

		label267:
		for (int var63 = 0; var63 < var2; ++var63) {
			var51.method9590(1297379947);
			var51.field5219 += 4;
			int var64 = var51.field5219;
			int var65 = var64;
			int var66 = -1;

			while (true) {
				while (true) {
					int var67 = var1.method9424();
					var51.method9404(var67);
					var65 += var67;
					int var68 = var1.field5221[var29++] & 255;
					boolean var69 = var68 != var66;
					var66 = var68 & 15;
					if (var68 == 7) {
						if (var69) {
							var51.method9388(255);
						}

						var51.method9388(47);
						var51.method9388(0);
						var51.method9400(var51.field5219 - var64);
						continue label267;
					}

					if (var68 == 23) {
						if (var69) {
							var51.method9388(255);
						}

						var51.method9388(81);
						var51.method9388(3);
						var51.method9388(var1.field5221[var50++]);
						var51.method9388(var1.field5221[var50++]);
						var51.method9388(var1.field5221[var50++]);
					} else {
						var52 ^= var68 >> 4;
						int var71;
						int var74;
						if (var66 == 0) {
							if (var69) {
								var51.method9388(var52 + 144);
							}

							var53 += var1.field5221[var37++];
							var54 += var1.field5221[var38++];
							var74 = var53 & 127;
							var71 = var54 & 127;
							var51.method9388(var74);
							var51.method9388(var71);
							if (var71 > 0) {
								int var72 = var61[var52];
								Class356 var73 = (Class356)this.field3899.method9361((long)var72);
								if (var73 == null) {
									var73 = new Class356(var65);
									this.field3899.method9360(var73, (long)var72);
								}

								var73.field3928.set(var74);
							}
						} else if (var66 == 1) {
							if (var69) {
								var51.method9388(var52 + 128);
							}

							var53 += var1.field5221[var37++];
							var55 += var1.field5221[var40++];
							var51.method9388(var53 & 127);
							var51.method9388(var55 & 127);
						} else {
							byte var70;
							if (var66 == 2) {
								if (var69) {
									var51.method9388(var52 + 176);
								}

								var28 = var28 + var1.field5221[var15++] & 127;
								var51.method9388(var28);
								if (var28 != 0 && var28 != 32) {
									if (var28 == 1) {
										var70 = var1.field5221[var34++];
									} else if (var28 == 33) {
										var70 = var1.field5221[var41++];
									} else if (var28 == 7) {
										var70 = var1.field5221[var35++];
									} else if (var28 == 39) {
										var70 = var1.field5221[var42++];
									} else if (var28 == 10) {
										var70 = var1.field5221[var36++];
									} else if (var28 == 42) {
										var70 = var1.field5221[var43++];
									} else if (var28 == 99) {
										var70 = var1.field5221[var46++];
									} else if (var28 == 98) {
										var70 = var1.field5221[var47++];
									} else if (var28 == 101) {
										var70 = var1.field5221[var48++];
									} else if (var28 == 100) {
										var70 = var1.field5221[var49++];
									} else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
										var70 = var1.field5221[var39++];
									} else {
										var70 = var1.field5221[var30++];
									}
								} else {
									var70 = var1.field5221[var44++];
								}

								var74 = var70 + var59[var28];
								var59[var28] = var74;
								var71 = var74 & 127;
								var51.method9388(var71);
								if (var28 == 0) {
									var60[var52] = (var60[var52] & -2080769) + (var71 << 14);
								}

								if (var28 == 32) {
									var60[var52] = (var60[var52] & -16257) + (var71 << 7);
								}
							} else if (var66 == 3) {
								if (var69) {
									var51.method9388(var52 + 224);
								}

								var56 += var1.field5221[var45++];
								var56 += var1.field5221[var33++] << 7;
								var51.method9388(var56 & 127);
								var51.method9388(var56 >> 7 & 127);
							} else if (var66 == 4) {
								if (var69) {
									var51.method9388(var52 + 208);
								}

								var57 += var1.field5221[var32++];
								var51.method9388(var57 & 127);
							} else if (var66 == 5) {
								if (var69) {
									var51.method9388(var52 + 160);
								}

								var53 += var1.field5221[var37++];
								var58 += var1.field5221[var31++];
								var51.method9388(var53 & 127);
								var51.method9388(var58 & 127);
							} else {
								if (var66 != 6) {
									throw new RuntimeException();
								}

								if (var69) {
									var51.method9388(var52 + 192);
								}

								var70 = var1.field5221[var44++];
								var61[var52] = var60[var52] + var70;
								var51.method9388(var70);
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(name = "ak", desc = "(Lor;II)Lno;")
	public static Class353 method6747(Class382 var0, int var1, int var2) {
		byte[] var3 = var0.method7216(var1, var2);
		return var3 == null ? null : new Class353(new Class521(var3));
	}
}
