import io.runebox.ObfInfo;

@ObfInfo(name = "vb")
public final class Class548 {
	@ObfInfo(name = "av", desc = "Lve;")
	public static Class551 field5366;
	@ObfInfo(owner = "ve", name = "am", desc = "[I")
	public static int[] field5401;

	static {
		field5366 = new Class551();
	}

	@ObfInfo(name = "aq", desc = "([BI[BII)I")
	public static int method9558(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized(field5366) {
			field5366.field5395 = var2;
			field5366.field5384 = var4;
			field5366.field5408 = var0;
			field5366.field5387 = 0;
			field5366.field5404 = var1;
			field5366.field5393 = 0;
			field5366.field5381 = 0;
			field5366.field5385 = 0;
			field5366.field5389 = 0;
			method9552(field5366);
			var1 -= field5366.field5404;
			field5366.field5395 = null;
			field5366.field5408 = null;
			return var1;
		}
	}

	@ObfInfo(name = "ad", desc = "(Lve;)V")
	public static void method9551(Class551 var0) {
		byte var2 = var0.field5403;
		int var3 = var0.field5391;
		int var4 = var0.field5400;
		int var5 = var0.field5409;
		int[] var6 = field5401;
		int var7 = var0.field5396;
		byte[] var8 = var0.field5408;
		int var9 = var0.field5387;
		int var10 = var0.field5404;
		int var12 = var0.field5415 + 1;

		label67:
		while (true) {
			if (var3 > 0) {
				while (true) {
					if (var10 == 0) {
						break label67;
					}

					if (var3 == 1) {
						if (var10 == 0) {
							var3 = 1;
							break label67;
						}

						var8[var9] = var2;
						++var9;
						--var10;
						break;
					}

					var8[var9] = var2;
					--var3;
					++var9;
					--var10;
				}
			}

			while (var4 != var12) {
				var2 = (byte)var5;
				var7 = var6[var7];
				byte var1 = (byte)var7;
				var7 >>= 8;
				++var4;
				if (var1 != var5) {
					var5 = var1;
					if (var10 == 0) {
						var3 = 1;
						break label67;
					}

					var8[var9] = var2;
					++var9;
					--var10;
				} else {
					if (var4 != var12) {
						var3 = 2;
						var7 = var6[var7];
						var1 = (byte)var7;
						var7 >>= 8;
						++var4;
						if (var4 != var12) {
							if (var1 != var5) {
								var5 = var1;
							} else {
								var3 = 3;
								var7 = var6[var7];
								var1 = (byte)var7;
								var7 >>= 8;
								++var4;
								if (var4 != var12) {
									if (var1 != var5) {
										var5 = var1;
									} else {
										var7 = var6[var7];
										var1 = (byte)var7;
										var7 >>= 8;
										++var4;
										var3 = (var1 & 255) + 4;
										var7 = var6[var7];
										var5 = (byte)var7;
										var7 >>= 8;
										++var4;
									}
								}
							}
						}
						continue label67;
					}

					if (var10 == 0) {
						var3 = 1;
						break label67;
					}

					var8[var9] = var2;
					++var9;
					--var10;
				}
			}

			var3 = 0;
			break;
		}

		int var13 = var0.field5389;
		var0.field5389 += var10 - var10;
		if (var0.field5389 < var13) {
		}

		var0.field5403 = var2;
		var0.field5391 = var3;
		var0.field5400 = var4;
		var0.field5409 = var5;
		field5401 = var6;
		var0.field5396 = var7;
		var0.field5408 = var8;
		var0.field5387 = var9;
		var0.field5404 = var10;
	}

	@ObfInfo(name = "ag", desc = "(Lve;)V")
	public static void method9552(Class551 var0) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		int var22 = 0;
		int[] var23 = null;
		int[] var24 = null;
		int[] var25 = null;
		var0.field5388 = -2038632395;
		if (field5401 == null) {
			field5401 = new int[var0.field5388 * 1380286496];
		}

		boolean var26 = true;

		while (true) {
			while (var26) {
				byte var1 = method9571(var0);
				if (var1 == 23) {
					return;
				}

				var1 = method9571(var0);
				var1 = method9571(var0);
				var1 = method9571(var0);
				var1 = method9571(var0);
				var1 = method9571(var0);
				var1 = method9571(var0);
				var1 = method9571(var0);
				var1 = method9571(var0);
				var1 = method9571(var0);
				var1 = method9554(var0);
				if (var1 != 0) {
				}

				var0.field5394 = 0;
				var1 = method9571(var0);
				var0.field5394 = var0.field5394 << 8 | var1 & 255;
				var1 = method9571(var0);
				var0.field5394 = var0.field5394 << 8 | var1 & 255;
				var1 = method9571(var0);
				var0.field5394 = var0.field5394 << 8 | var1 & 255;

				int var35;
				for (var35 = 0; var35 < 16; ++var35) {
					var1 = method9554(var0);
					if (var1 == 1) {
						var0.field5406[var35] = true;
					} else {
						var0.field5406[var35] = false;
					}
				}

				for (var35 = 0; var35 < 256; ++var35) {
					var0.field5407[var35] = false;
				}

				int var36;
				for (var35 = 0; var35 < 16; ++var35) {
					if (var0.field5406[var35]) {
						for (var36 = 0; var36 < 16; ++var36) {
							var1 = method9554(var0);
							if (var1 == 1) {
								var0.field5407[var35 * 16 + var36] = true;
							}
						}
					}
				}

				method9556(var0);
				int var38 = var0.field5402 + 2;
				int var39 = method9549(3, var0);
				int var40 = method9549(15, var0);

				for (var35 = 0; var35 < var40; ++var35) {
					var36 = 0;

					while (true) {
						var1 = method9554(var0);
						if (var1 == 0) {
							var0.field5390[var35] = (byte)var36;
							break;
						}

						++var36;
					}
				}

				byte[] var27 = new byte[6];

				byte var29;
				for (var29 = 0; var29 < var39; var27[var29] = var29++) {
				}

				for (var35 = 0; var35 < var40; ++var35) {
					var29 = var0.field5390[var35];

					byte var28;
					for (var28 = var27[var29]; var29 > 0; --var29) {
						var27[var29] = var27[var29 - 1];
					}

					var27[0] = var28;
					var0.field5377[var35] = var28;
				}

				int var37;
				for (var37 = 0; var37 < var39; ++var37) {
					int var49 = method9549(5, var0);

					for (var35 = 0; var35 < var38; ++var35) {
						while (true) {
							var1 = method9554(var0);
							if (var1 == 0) {
								var0.field5410[var37][var35] = (byte)var49;
								break;
							}

							var1 = method9554(var0);
							if (var1 == 0) {
								++var49;
							} else {
								--var49;
							}
						}
					}
				}

				for (var37 = 0; var37 < var39; ++var37) {
					byte var2 = 32;
					byte var3 = 0;

					for (var35 = 0; var35 < var38; ++var35) {
						if (var0.field5410[var37][var35] > var3) {
							var3 = var0.field5410[var37][var35];
						}

						if (var0.field5410[var37][var35] < var2) {
							var2 = var0.field5410[var37][var35];
						}
					}

					method9557(var0.field5411[var37], var0.field5412[var37], var0.field5413[var37], var0.field5410[var37], var2, var3, var38);
					var0.field5414[var37] = var2;
				}

				int var41 = var0.field5402 + 1;
				int var42 = -1;
				byte var43 = 0;

				for (var35 = 0; var35 <= 255; ++var35) {
					var0.field5398[var35] = 0;
				}

				int var56 = 4095;

				int var54;
				int var55;
				for (var54 = 15; var54 >= 0; --var54) {
					for (var55 = 15; var55 >= 0; --var55) {
						var0.field5386[var56] = (byte)(var54 * 16 + var55);
						--var56;
					}

					var0.field5397[var54] = var56 + 1;
				}

				int var46 = 0;
				byte var53;
				if (var43 == 0) {
					++var42;
					var43 = 50;
					var53 = var0.field5377[var42];
					var22 = var0.field5414[var53];
					var23 = var0.field5411[var53];
					var25 = var0.field5413[var53];
					var24 = var0.field5412[var53];
				}

				int var44 = var43 - 1;
				int var50 = var22;

				int var51;
				byte var52;
				for (var51 = method9549(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
					++var50;
					var52 = method9554(var0);
				}

				int var45 = var25[var51 - var24[var50]];

				while (true) {
					int[] var10000;
					int var10002;
					while (var41 != var45) {
						if (var45 != 0 && var45 != 1) {
							int var33 = var45 - 1;
							int var30;
							if (var33 < 16) {
								var30 = var0.field5397[0];

								for (var1 = var0.field5386[var30 + var33]; var33 > 3; var33 -= 4) {
									int var34 = var30 + var33;
									var0.field5386[var34] = var0.field5386[var34 - 1];
									var0.field5386[var34 - 1] = var0.field5386[var34 - 2];
									var0.field5386[var34 - 2] = var0.field5386[var34 - 3];
									var0.field5386[var34 - 3] = var0.field5386[var34 - 4];
								}

								while (var33 > 0) {
									var0.field5386[var30 + var33] = var0.field5386[var30 + var33 - 1];
									--var33;
								}

								var0.field5386[var30] = var1;
							} else {
								int var31 = var33 / 16;
								int var32 = var33 % 16;
								var30 = var0.field5397[var31] + var32;

								for (var1 = var0.field5386[var30]; var30 > var0.field5397[var31]; --var30) {
									var0.field5386[var30] = var0.field5386[var30 - 1];
								}

								for (var10002 = var0.field5397[var31]++; var31 > 0; --var31) {
									var10002 = var0.field5397[var31]--;
									var0.field5386[var0.field5397[var31]] = var0.field5386[var0.field5397[var31 - 1] + 16 - 1];
								}

								var10002 = var0.field5397[0]--;
								var0.field5386[var0.field5397[0]] = var1;
								if (var0.field5397[0] == 0) {
									var56 = 4095;

									for (var54 = 15; var54 >= 0; --var54) {
										for (var55 = 15; var55 >= 0; --var55) {
											var0.field5386[var56] = var0.field5386[var0.field5397[var54] + var55];
											--var56;
										}

										var0.field5397[var54] = var56 + 1;
									}
								}
							}

							var10002 = var0.field5398[var0.field5405[var1 & 255] & 255]++;
							field5401[var46] = var0.field5405[var1 & 255] & 255;
							++var46;
							if (var44 == 0) {
								++var42;
								var44 = 50;
								var53 = var0.field5377[var42];
								var22 = var0.field5414[var53];
								var23 = var0.field5411[var53];
								var25 = var0.field5413[var53];
								var24 = var0.field5412[var53];
							}

							--var44;
							var50 = var22;

							for (var51 = method9549(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
								++var50;
								var52 = method9554(var0);
							}

							var45 = var25[var51 - var24[var50]];
						} else {
							int var47 = -1;
							int var48 = 1;

							do {
								if (var45 == 0) {
									var47 += var48;
								} else if (var45 == 1) {
									var47 += var48 * 2;
								}

								var48 *= 2;
								if (var44 == 0) {
									++var42;
									var44 = 50;
									var53 = var0.field5377[var42];
									var22 = var0.field5414[var53];
									var23 = var0.field5411[var53];
									var25 = var0.field5413[var53];
									var24 = var0.field5412[var53];
								}

								--var44;
								var50 = var22;

								for (var51 = method9549(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
									++var50;
									var52 = method9554(var0);
								}

								var45 = var25[var51 - var24[var50]];
							} while(var45 == 0 || var45 == 1);

							++var47;
							var1 = var0.field5405[var0.field5386[var0.field5397[0]] & 255];
							var10000 = var0.field5398;

							for (var10000[var1 & 255] += var47; var47 > 0; --var47) {
								field5401[var46] = var1 & 255;
								++var46;
							}
						}
					}

					var0.field5391 = 0;
					var0.field5403 = 0;
					var0.field5399[0] = 0;

					for (var35 = 1; var35 <= 256; ++var35) {
						var0.field5399[var35] = var0.field5398[var35 - 1];
					}

					for (var35 = 1; var35 <= 256; ++var35) {
						var10000 = var0.field5399;
						var10000[var35] += var0.field5399[var35 - 1];
					}

					for (var35 = 0; var35 < var46; ++var35) {
						var1 = (byte)(field5401[var35] & 255);
						var10000 = field5401;
						int var10001 = var0.field5399[var1 & 255];
						var10000[var10001] |= var35 << 8;
						var10002 = var0.field5399[var1 & 255]++;
					}

					var0.field5396 = field5401[var0.field5394] >> 8;
					var0.field5400 = 0;
					var0.field5396 = field5401[var0.field5396];
					var0.field5409 = (byte)(var0.field5396 & 255);
					var0.field5396 >>= 8;
					++var0.field5400;
					var0.field5415 = var46;
					method9551(var0);
					if (var0.field5415 + 1 == var0.field5400 && var0.field5391 == 0) {
						var26 = true;
						break;
					}

					var26 = false;
					break;
				}
			}

			return;
		}
	}

	@ObfInfo(name = "ak", desc = "(Lve;)B")
	public static byte method9571(Class551 var0) {
		return (byte)method9549(8, var0);
	}

	@ObfInfo(name = "ap", desc = "(Lve;)B")
	public static byte method9554(Class551 var0) {
		return (byte)method9549(1, var0);
	}

	@ObfInfo(name = "an", desc = "(ILve;)I")
	public static int method9549(int var0, Class551 var1) {
		while (var1.field5393 < var0) {
			var1.field5381 = var1.field5381 << 8 | var1.field5395[var1.field5384] & 255;
			var1.field5393 += 8;
			++var1.field5384;
			++var1.field5385;
			if (var1.field5385 == 0) {
			}
		}

		int var2 = var1.field5381 >> var1.field5393 - var0 & (1 << var0) - 1;
		var1.field5393 -= var0;
		return var2;
	}

	@ObfInfo(name = "aj", desc = "(Lve;)V")
	public static void method9556(Class551 var0) {
		var0.field5402 = 0;

		for (int var1 = 0; var1 < 256; ++var1) {
			if (var0.field5407[var1]) {
				var0.field5405[var0.field5402] = (byte)var1;
				++var0.field5402;
			}
		}

	}

	@ObfInfo(name = "av", desc = "([I[I[I[BIII)V")
	public static void method9557(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		int var8;
		for (var8 = var4; var8 <= var5; ++var8) {
			for (int var9 = 0; var9 < var6; ++var9) {
				if (var3[var9] == var8) {
					var2[var7] = var9;
					++var7;
				}
			}
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var1[var8] = 0;
		}

		for (var8 = 0; var8 < var6; ++var8) {
			++var1[var3[var8] + 1];
		}

		for (var8 = 1; var8 < 23; ++var8) {
			var1[var8] += var1[var8 - 1];
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var0[var8] = 0;
		}

		int var10 = 0;

		for (var8 = var4; var8 <= var5; ++var8) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}

		for (var8 = var4 + 1; var8 <= var5; ++var8) {
			var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
		}

	}
}
