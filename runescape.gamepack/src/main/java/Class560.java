public final class Class560 {
	public static Class565 field5416;
	public static int[] field5211;

	static {
		field5416 = new Class565();
	}

	public static int method10112(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized(field5416) {
			field5416.field5447 = var2;
			field5416.field5473 = var4;
			field5416.field5444 = var0;
			field5416.field5443 = 0;
			field5416.field5448 = var1;
			field5416.field5468 = 0;
			field5416.field5437 = 0;
			field5416.field5453 = 0;
			field5416.field5449 = 0;
			method10114(field5416);
			var1 -= field5416.field5448;
			field5416.field5447 = null;
			field5416.field5444 = null;
			return var1;
		}
	}

	public static void method10113(Class565 var0) {
		byte var2 = var0.field5450;
		int var3 = var0.field5451;
		int var4 = var0.field5459;
		int var5 = var0.field5457;
		int[] var6 = field5211;
		int var7 = var0.field5446;
		byte[] var8 = var0.field5444;
		int var9 = var0.field5443;
		int var10 = var0.field5448;
		int var12 = var0.field5474 + 1;

		label71:
		while (true) {
			if (var3 > 0) {
				while (true) {
					if (var10 == 0) {
						break label71;
					}

					if (var3 == 1) {
						if (var10 == 0) {
							var3 = 1;
							break label71;
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

			while (var12 != var4) {
				var2 = (byte)var5;
				var7 = var6[var7];
				byte var1 = (byte)var7;
				var7 >>= 8;
				++var4;
				if (var5 != var1) {
					var5 = var1;
					if (var10 == 0) {
						var3 = 1;
						break label71;
					}

					var8[var9] = var2;
					++var9;
					--var10;
				} else {
					if (var12 != var4) {
						var3 = 2;
						var7 = var6[var7];
						var1 = (byte)var7;
						var7 >>= 8;
						++var4;
						if (var12 != var4) {
							if (var5 != var1) {
								var5 = var1;
							} else {
								var3 = 3;
								var7 = var6[var7];
								var1 = (byte)var7;
								var7 >>= 8;
								++var4;
								if (var12 != var4) {
									if (var5 != var1) {
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
						continue label71;
					}

					if (var10 == 0) {
						var3 = 1;
						break label71;
					}

					var8[var9] = var2;
					++var9;
					--var10;
				}
			}

			var3 = 0;
			break;
		}

		int var13 = var0.field5449;
		var0.field5449 += var10 - var10;
		if (var0.field5449 < var13) {
		}

		var0.field5450 = var2;
		var0.field5451 = var3;
		var0.field5459 = var4;
		var0.field5457 = var5;
		field5211 = var6;
		var0.field5446 = var7;
		var0.field5444 = var8;
		var0.field5443 = var9;
		var0.field5448 = var10;
	}

	public static void method10114(Class565 var0) {
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
		var0.field5454 = -1466655953;
		if (field5211 == null) {
			field5211 = new int[var0.field5454 * -925582496];
		}

		boolean var26 = true;

		while (true) {
			while (var26) {
				byte var1 = method10111(var0);
				if (var1 == 23) {
					return;
				}

				var1 = method10111(var0);
				var1 = method10111(var0);
				var1 = method10111(var0);
				var1 = method10111(var0);
				var1 = method10111(var0);
				var1 = method10111(var0);
				var1 = method10111(var0);
				var1 = method10111(var0);
				var1 = method10111(var0);
				var1 = method10130(var0);
				if (var1 != 0) {
				}

				var0.field5455 = 0;
				var1 = method10111(var0);
				var0.field5455 = var0.field5455 << 8 | var1 & 255;
				var1 = method10111(var0);
				var0.field5455 = var0.field5455 << 8 | var1 & 255;
				var1 = method10111(var0);
				var0.field5455 = var0.field5455 << 8 | var1 & 255;

				int var35;
				for (var35 = 0; var35 < 16; ++var35) {
					var1 = method10130(var0);
					if (var1 == 1) {
						var0.field5463[var35] = true;
					} else {
						var0.field5463[var35] = false;
					}
				}

				for (var35 = 0; var35 < 256; ++var35) {
					var0.field5462[var35] = false;
				}

				int var36;
				for (var35 = 0; var35 < 16; ++var35) {
					if (var0.field5463[var35]) {
						for (var36 = 0; var36 < 16; ++var36) {
							var1 = method10130(var0);
							if (var1 == 1) {
								var0.field5462[var35 * 16 + var36] = true;
							}
						}
					}
				}

				method10118(var0);
				int var38 = var0.field5456 + 2;
				int var39 = method10121(3, var0);
				int var40 = method10121(15, var0);

				for (var35 = 0; var35 < var40; ++var35) {
					var36 = 0;

					while (true) {
						var1 = method10130(var0);
						if (var1 == 0) {
							var0.field5466[var35] = (byte)var36;
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
					var29 = var0.field5466[var35];

					byte var28;
					for (var28 = var27[var29]; var29 > 0; --var29) {
						var27[var29] = var27[var29 - 1];
					}

					var27[0] = var28;
					var0.field5467[var35] = var28;
				}

				int var37;
				for (var37 = 0; var37 < var39; ++var37) {
					int var49 = method10121(5, var0);

					for (var35 = 0; var35 < var38; ++var35) {
						while (true) {
							var1 = method10130(var0);
							if (var1 == 0) {
								var0.field5469[var37][var35] = (byte)var49;
								break;
							}

							var1 = method10130(var0);
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
						if (var0.field5469[var37][var35] > var3) {
							var3 = var0.field5469[var37][var35];
						}

						if (var0.field5469[var37][var35] < var2) {
							var2 = var0.field5469[var37][var35];
						}
					}

					method10125(var0.field5470[var37], var0.field5471[var37], var0.field5472[var37], var0.field5469[var37], var2, var3, var38);
					var0.field5461[var37] = var2;
				}

				int var41 = var0.field5456 + 1;
				int var42 = -1;
				byte var43 = 0;

				for (var35 = 0; var35 <= 255; ++var35) {
					var0.field5458[var35] = 0;
				}

				int var56 = 4095;

				int var54;
				int var55;
				for (var54 = 15; var54 >= 0; --var54) {
					for (var55 = 15; var55 >= 0; --var55) {
						var0.field5465[var56] = (byte)(var54 * 16 + var55);
						--var56;
					}

					var0.field5452[var54] = var56 + 1;
				}

				int var46 = 0;
				byte var53;
				if (var43 == 0) {
					++var42;
					var43 = 50;
					var53 = var0.field5467[var42];
					var22 = var0.field5461[var53];
					var23 = var0.field5470[var53];
					var25 = var0.field5472[var53];
					var24 = var0.field5471[var53];
				}

				int var44 = var43 - 1;
				int var50 = var22;

				int var51;
				byte var52;
				for (var51 = method10121(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
					++var50;
					var52 = method10130(var0);
				}

				int var45 = var25[var51 - var24[var50]];

				while (true) {
					int[] var10000;
					int var10002;
					while (var45 != var41) {
						if (var45 != 0 && var45 != 1) {
							int var33 = var45 - 1;
							int var30;
							if (var33 < 16) {
								var30 = var0.field5452[0];

								for (var1 = var0.field5465[var33 + var30]; var33 > 3; var33 -= 4) {
									int var34 = var33 + var30;
									var0.field5465[var34] = var0.field5465[var34 - 1];
									var0.field5465[var34 - 1] = var0.field5465[var34 - 2];
									var0.field5465[var34 - 2] = var0.field5465[var34 - 3];
									var0.field5465[var34 - 3] = var0.field5465[var34 - 4];
								}

								while (var33 > 0) {
									var0.field5465[var33 + var30] = var0.field5465[var33 + var30 - 1];
									--var33;
								}

								var0.field5465[var30] = var1;
							} else {
								int var31 = var33 / 16;
								int var32 = var33 % 16;
								var30 = var0.field5452[var31] + var32;

								for (var1 = var0.field5465[var30]; var30 > var0.field5452[var31]; --var30) {
									var0.field5465[var30] = var0.field5465[var30 - 1];
								}

								for (var10002 = var0.field5452[var31]++; var31 > 0; --var31) {
									var10002 = var0.field5452[var31]--;
									var0.field5465[var0.field5452[var31]] = var0.field5465[var0.field5452[var31 - 1] + 16 - 1];
								}

								var10002 = var0.field5452[0]--;
								var0.field5465[var0.field5452[0]] = var1;
								if (var0.field5452[0] == 0) {
									var56 = 4095;

									for (var54 = 15; var54 >= 0; --var54) {
										for (var55 = 15; var55 >= 0; --var55) {
											var0.field5465[var56] = var0.field5465[var0.field5452[var54] + var55];
											--var56;
										}

										var0.field5452[var54] = var56 + 1;
									}
								}
							}

							var10002 = var0.field5458[var0.field5464[var1 & 255] & 255]++;
							field5211[var46] = var0.field5464[var1 & 255] & 255;
							++var46;
							if (var44 == 0) {
								++var42;
								var44 = 50;
								var53 = var0.field5467[var42];
								var22 = var0.field5461[var53];
								var23 = var0.field5470[var53];
								var25 = var0.field5472[var53];
								var24 = var0.field5471[var53];
							}

							--var44;
							var50 = var22;

							for (var51 = method10121(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
								++var50;
								var52 = method10130(var0);
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
									var53 = var0.field5467[var42];
									var22 = var0.field5461[var53];
									var23 = var0.field5470[var53];
									var25 = var0.field5472[var53];
									var24 = var0.field5471[var53];
								}

								--var44;
								var50 = var22;

								for (var51 = method10121(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
									++var50;
									var52 = method10130(var0);
								}

								var45 = var25[var51 - var24[var50]];
							} while(var45 == 0 || var45 == 1);

							++var47;
							var1 = var0.field5464[var0.field5465[var0.field5452[0]] & 255];
							var10000 = var0.field5458;

							for (var10000[var1 & 255] += var47; var47 > 0; --var47) {
								field5211[var46] = var1 & 255;
								++var46;
							}
						}
					}

					var0.field5451 = 0;
					var0.field5450 = 0;
					var0.field5460[0] = 0;

					for (var35 = 1; var35 <= 256; ++var35) {
						var0.field5460[var35] = var0.field5458[var35 - 1];
					}

					for (var35 = 1; var35 <= 256; ++var35) {
						var10000 = var0.field5460;
						var10000[var35] += var0.field5460[var35 - 1];
					}

					for (var35 = 0; var35 < var46; ++var35) {
						var1 = (byte)(field5211[var35] & 255);
						var10000 = field5211;
						int var10001 = var0.field5460[var1 & 255];
						var10000[var10001] |= var35 << 8;
						var10002 = var0.field5460[var1 & 255]++;
					}

					var0.field5446 = field5211[var0.field5455] >> 8;
					var0.field5459 = 0;
					var0.field5446 = field5211[var0.field5446];
					var0.field5457 = (byte)(var0.field5446 & 255);
					var0.field5446 >>= 8;
					++var0.field5459;
					var0.field5474 = var46;
					method10113(var0);
					if (var0.field5459 == var0.field5474 + 1 && var0.field5451 == 0) {
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

	public static byte method10111(Class565 var0) {
		return (byte)method10121(8, var0);
	}

	public static byte method10130(Class565 var0) {
		return (byte)method10121(1, var0);
	}

	public static int method10121(int var0, Class565 var1) {
		while (var1.field5468 < var0) {
			var1.field5437 = var1.field5437 << 8 | var1.field5447[var1.field5473] & 255;
			var1.field5468 += 8;
			++var1.field5473;
			++var1.field5453;
			if (var1.field5453 == 0) {
			}
		}

		int var2 = var1.field5437 >> var1.field5468 - var0 & (1 << var0) - 1;
		var1.field5468 -= var0;
		return var2;
	}

	public static void method10118(Class565 var0) {
		var0.field5456 = 0;

		for (int var1 = 0; var1 < 256; ++var1) {
			if (var0.field5462[var1]) {
				var0.field5464[var0.field5456] = (byte)var1;
				++var0.field5456;
			}
		}

	}

	public static void method10125(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
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
