import io.runebox.ObfInfo;

public final class Class93 {
	@ObfInfo(owner = "iv", name = "ak", desc = "Lor;")
	public static Class382 field2417;
	@ObfInfo(owner = "hf", name = "aa", desc = "[[[B")
	public static byte[][][] field1938;
	@ObfInfo(owner = "jk", name = "az", desc = "[[[B")
	public static byte[][][] field2637;
	@ObfInfo(owner = "nx", name = "af", desc = "[[[B")
	public static byte[][][] field3973;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 426206599)
	public static int field1241;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1511509861)
	public static int field1246;
	@ObfInfo(name = "am", desc = "I", intMultiplier = -1397851693)
	public static int field1247;
	@ObfInfo(name = "ao", desc = "[I")
	public static int[] field1238;
	@ObfInfo(name = "av", desc = "[I")
	public static int[] field1239;
	@ObfInfo(owner = "fk", name = "ah", desc = "[I")
	public static int[] field1615;
	@ObfInfo(owner = "hx", name = "ac", desc = "[I")
	public static int[] field2094;
	@ObfInfo(owner = "ii", name = "ab", desc = "[I")
	public static int[] field2189;
	@ObfInfo(owner = "au", name = "at", desc = "[[I")
	public static int[][] field108;
	@ObfInfo(owner = "re", name = "aq", desc = "[[[I")
	public static int[][][] field4809;
	@ObfInfo(name = "aj", desc = "[[[S")
	public static short[][][] field1237;
	@ObfInfo(owner = "hd", name = "al", desc = "[[[S")
	public static short[][][] field1926;
	@ObfInfo(name = "au", desc = "[I")
	public static final int[] field1236;
	@ObfInfo(name = "as", desc = "[I")
	public static final int[] field1242;
	@ObfInfo(name = "aw", desc = "[I")
	public static final int[] field1243;
	@ObfInfo(name = "ad", desc = "[I")
	public static final int[] field1244;
	@ObfInfo(name = "ai", desc = "[I")
	public static final int[] field1245;
	@ObfInfo(name = "ay", desc = "[I")
	public static final int[] field1248;

	static {
		field1241 = 99;
		field1248 = new int[]{1, 2, 4, 8};
		field1236 = new int[]{16, 32, 64, 128};
		field1242 = new int[]{1, 0, -1, 0};
		field1243 = new int[]{0, -1, 0, 1};
		field1244 = new int[]{1, -1, -1, 1};
		field1245 = new int[]{-1, -1, 1, 1};
		field1246 = (int)(Math.random() * 17.0D) - 8;
		field1247 = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfInfo(owner = "pu", name = "ak", desc = "(I)V")
	public static void method7690() {
		field1241 = 99;
		field1926 = new short[4][104][104];
		field1237 = new short[4][104][104];
		field2637 = new byte[4][104][104];
		field3973 = new byte[4][104][104];
		field4809 = new int[4][105][105];
		field1938 = new byte[4][105][105];
		field108 = new int[105][105];
		field2189 = new int[104];
		field2094 = new int[104];
		field1238 = new int[104];
		field1615 = new int[104];
		field1239 = new int[104];
	}

	@ObfInfo(owner = "eq", name = "al", desc = "(I)V")
	public static void method2966() {
		field1926 = (short[][][])null;
		field1237 = (short[][][])null;
		field2637 = (byte[][][])null;
		field3973 = (byte[][][])null;
		field4809 = (int[][][])null;
		field1938 = (byte[][][])null;
		field108 = (int[][])null;
		field2189 = null;
		field2094 = null;
		field1238 = null;
		field1615 = null;
		field1239 = null;
	}

	@ObfInfo(owner = "im", name = "aj", desc = "(Ldt;IIIIB)V", opaque = "0")
	public static void method4167(Class98 var0, int var1, int var2, int var3, int var4) {
		int[][][] var6 = var0.field1291;
		int var7 = var0.field1298 - 1;
		int var8 = var0.field1282 - 1;

		for (int var9 = var2; var9 <= var4 + var2; ++var9) {
			for (int var10 = var1; var10 <= var3 + var1; ++var10) {
				if (var10 >= 0 && var10 < var6[0].length - 1 && var9 >= 0 && var9 < var6[0][0].length - 1) {
					field1938[0][var10][var9] = 127;
					if (var10 == var1 && var10 > 0) {
						var6[0][var10][var9] = var6[0][var10 - 1][var9];
					}

					if (var10 == var3 + var1 && var10 < var7) {
						var6[0][var10][var9] = var6[0][var10 + 1][var9];
					}

					if (var9 == var2 && var9 > 0) {
						var6[0][var10][var9] = var6[0][var10][var9 - 1];
					}

					if (var4 + var2 == var9 && var9 < var8) {
						var6[0][var10][var9] = var6[0][var10][var9 + 1];
					}
				}
			}
		}

	}

	@ObfInfo(owner = "sz", name = "az", desc = "(Ldt;[BIIIII)V", opaque = "-1704799649")
	public static void method8967(Class98 var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var8;
		int var9;
		if (var0.field1284 != null) {
			for (int var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 64; ++var8) {
					for (var9 = 0; var9 < 64; ++var9) {
						if (var8 + var2 > 0 && var8 + var2 < var0.field1284[var7].field2363.length && var9 + var3 > 0 && var9 + var3 < var0.field1284[var7].field2363[var8 + var2].length) {
							int[] var10000 = var0.field1284[var7].field2363[var8 + var2];
							var10000[var9 + var3] &= -1073741825;
						}
					}
				}
			}
		}

		Class521 var13 = new Class521(var1);

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (int var10 = 0; var10 < 64; ++var10) {
					int var11 = var9 + var2;
					int var12 = var10 + var3;
					method3245(var0, var13, var8, var11, var12, var11 + var4, var12 + var5, 0);
				}
			}
		}

	}

	@ObfInfo(owner = "ek", name = "af", desc = "(Ldt;[BIIIIIIIIII)V", opaque = "1158912261")
	public static void method2888(Class98 var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		Class226[] var12 = var0.field1284;
		int var14;
		if (var12 != null) {
			for (int var13 = 0; var13 < 8; ++var13) {
				for (var14 = 0; var14 < 8; ++var14) {
					if (var13 + var3 > 0 && var13 + var3 < var12[var2].field2363.length && var14 + var4 > 0 && var14 + var4 < var12[var2].field2363[var13 + var3].length) {
						int[] var10000 = var12[var2].field2363[var13 + var3];
						var10000[var14 + var4] &= -1073741825;
					}
				}
			}
		}

		Class521 var26 = new Class521(var1);

		for (var14 = 0; var14 < 4; ++var14) {
			for (int var15 = 0; var15 < 64; ++var15) {
				for (int var16 = 0; var16 < 64; ++var16) {
					if (var14 == var5 && var15 >= var6 && var15 < var6 + 8 && var16 >= var7 && var16 < var7 + 8) {
						int var19 = var15 & 7;
						int var20 = var16 & 7;
						int var21 = var8 & 3;
						int var18;
						if (var21 == 0) {
							var18 = var19;
						} else if (var21 == 1) {
							var18 = var20;
						} else if (var21 == 2) {
							var18 = 7 - var19;
						} else {
							var18 = 7 - var20;
						}

						int var22 = var18 + var3;
						int var23 = Class359.method5914(var15 & 7, var16 & 7, var8) + var4;
						int var24 = (var15 & 7) + var9 + var3;
						int var25 = var10 + var4 + (var16 & 7);
						method3245(var0, var26, var2, var22, var23, var24, var25, var8);
					} else {
						method3245(var0, var26, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfInfo(owner = "fq", name = "at", desc = "(Ldt;Lua;IIIIIIB)V", opaque = "-1")
	public static void method3245(Class98 var0, Class521 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var9 = var0.field1291;
		byte[][][] var10 = var0.field1292;
		int var11;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var9[0].length - 1 && var4 >= 0 && var4 < var9[0][0].length - 1) {
			var10[var2][var3][var4] = 0;

			while (true) {
				var11 = var1.method9407();
				if (var11 == 0) {
					if (var2 == 0) {
						var9[0][var3][var4] = -method3708(var5 + 932731, var6 + 556238) * 8;
					} else {
						var9[var2][var3][var4] = var9[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (var11 == 1) {
					int var12 = var1.method9405();
					if (var12 == 1) {
						var12 = 0;
					}

					if (var2 == 0) {
						var9[0][var3][var4] = 8 * -var12;
					} else {
						var9[var2][var3][var4] = var9[var2 - 1][var3][var4] - var12 * 8;
					}
					break;
				}

				if (var11 <= 49) {
					field1237[var2][var3][var4] = (short)var1.method9535();
					field2637[var2][var3][var4] = (byte)((var11 - 2) / 4);
					field3973[var2][var3][var4] = (byte)(var11 - 2 + var7 & 3);
				} else if (var11 <= 81) {
					var10[var2][var3][var4] = (byte)(var11 - 49);
				} else {
					field1926[var2][var3][var4] = (short)(var11 - 81);
				}
			}
		} else {
			while (true) {
				var11 = var1.method9407();
				if (var11 == 0) {
					break;
				}

				if (var11 == 1) {
					var1.method9405();
					break;
				}

				if (var11 <= 49) {
					var1.method9535();
				}
			}
		}

	}

	@ObfInfo(owner = "sm", name = "ab", desc = "([BIII)Z", opaque = "-1620684213")
	public static boolean method8829(byte[] var0, int var1, int var2) {
		boolean var4 = true;
		Class521 var5 = new Class521(var0);
		int var6 = -1;

		label62:
		while (true) {
			int var7 = var5.method9421();
			if (var7 == 0) {
				return var4;
			}

			var6 += var7;
			int var8 = 0;
			boolean var9 = false;

			while (true) {
				int var10;
				while (!var9) {
					var10 = var5.method9419();
					if (var10 == 0) {
						continue label62;
					}

					var8 += var10 - 1;
					int var11 = var8 & 63;
					int var12 = var8 >> 6 & 63;
					int var13 = var5.method9405() >> 2;
					int var14 = var12 + var1;
					int var15 = var11 + var2;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						Class222 var16 = Class222.method4161(var6);
						if (var13 != 22 || !Client.field599 || 0 != var16.field2254 || var16.field2282 == 1 || var16.field2275) {
							if (!var16.method4176()) {
								++Client.field657;
								var4 = false;
							}

							var9 = true;
						}
					}
				}

				var10 = var5.method9419();
				if (var10 == 0) {
					break;
				}

				var5.method9405();
			}
		}
	}

	@ObfInfo(name = "ao", desc = "(Ldt;[BIIIIIII)V")
	public static void method2432(Class98 var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Class521 var9 = new Class521(var1);
		int var10 = -1;

		while (true) {
			int var11 = var9.method9421();
			if (var11 == 0) {
				return;
			}

			var10 += var11;
			int var12 = 0;

			while (true) {
				int var13 = var9.method9419();
				if (var13 == 0) {
					break;
				}

				var12 += var13 - 1;
				int var14 = var12 & 63;
				int var15 = var12 >> 6 & 63;
				int var16 = var12 >> 12;
				int var17 = var9.method9405();
				int var18 = var17 >> 2;
				int var19 = var17 & 3;
				if (var16 == var5 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
					Class222 var20 = Class222.method4161(var10);
					int var23 = var15 & 7;
					int var24 = var14 & 7;
					int var26 = var20.field2252;
					int var27 = var20.field2253;
					int var28;
					if ((var19 & 1) == 1) {
						var28 = var26;
						var26 = var27;
						var27 = var28;
					}

					int var25 = var8 & 3;
					int var22;
					if (var25 == 0) {
						var22 = var23;
					} else if (var25 == 1) {
						var22 = var24;
					} else if (var25 == 2) {
						var22 = 7 - var23 - (var26 - 1);
					} else {
						var22 = 7 - var24 - (var27 - 1);
					}

					var28 = var22 + var3;
					int var31 = var15 & 7;
					int var32 = var14 & 7;
					int var34 = var20.field2252;
					int var35 = var20.field2253;
					int var36;
					if ((var19 & 1) == 1) {
						var36 = var34;
						var34 = var35;
						var35 = var36;
					}

					int var33 = var8 & 3;
					int var30;
					if (var33 == 0) {
						var30 = var32;
					} else if (var33 == 1) {
						var30 = 7 - var31 - (var34 - 1);
					} else if (var33 == 2) {
						var30 = 7 - var32 - (var35 - 1);
					} else {
						var30 = var31;
					}

					var36 = var30 + var4;
					if (var28 > 0 && var36 > 0 && var28 < var0.field1298 - 1 && var36 < var0.field1282 - 1) {
						int var37 = var2;
						if ((var0.field1292[1][var28][var36] & 2) == 2) {
							var37 = var2 - 1;
						}

						Class226 var38 = null;
						if (var37 >= 0 && var0.field1284 != null) {
							var38 = var0.field1284[var37];
						}

						method3110(var0, var2, var28, var36, var10, var19 + var8 & 3, var18, var38);
					}
				}
			}
		}
	}

	@ObfInfo(owner = "fh", name = "ah", desc = "(Ldt;IIIIIILir;B)V", opaque = "0")
	public static void method3110(Class98 var0, int var1, int var2, int var3, int var4, int var5, int var6, Class226 var7) {
		if (!Client.field599 || 0 != (var0.field1292[0][var2][var3] & 2) || 0 == (var0.field1292[var1][var2][var3] & 16)) {
			if (var1 < field1241) {
				field1241 = var1;
			}

			Class222 var9 = Class222.method4161(var4);
			int var10;
			int var11;
			if (var5 != 1 && var5 != 3) {
				var10 = var9.field2252;
				var11 = var9.field2253;
			} else {
				var10 = var9.field2253;
				var11 = var9.field2252;
			}

			int var12;
			int var13;
			if (var10 + var2 <= var0.field1298) {
				var12 = (var10 >> 1) + var2;
				var13 = var2 + (var10 + 1 >> 1);
			} else {
				var12 = var2;
				var13 = var2 + 1;
			}

			int var14;
			int var15;
			if (var11 + var3 <= var0.field1282) {
				var14 = (var11 >> 1) + var3;
				var15 = var3 + (var11 + 1 >> 1);
			} else {
				var14 = var3;
				var15 = var3 + 1;
			}

			int[][] var16 = var0.field1291[var1];
			int var17 = var16[var13][var14] + var16[var12][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
			int var18 = (var2 << 7) + (var10 << 6);
			int var19 = (var11 << 6) + (var3 << 7);
			long var20 = Class274.method3872(var2, var3, 2, 0 == var9.field2254, var4, var0.field1287);
			int var22 = (var5 << 6) + var6;
			if (var9.field2287 == 1) {
				var22 += 256;
			}

			if (var9.method4210()) {
				Class77.method846(var1, var2, var3, var9, var5);
			}

			Class259 var23 = var0.field1283;
			Object var24;
			if (var6 == 22) {
				if (!Client.field599 || 0 != var9.field2254 || 1 == var9.field2282 || var9.field2275) {
					if (-1 == var9.field2260 && var9.field2278 == null) {
						var24 = var9.method4177(22, var5, var16, var18, var17, var19);
					} else {
						var24 = new Class96(var0, var4, 22, var5, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
					}

					var23.method5062(var1, var2, var3, var17, (Class255)var24, var20, var22);
					if (var9.field2282 == 1 && var7 != null) {
						var7.method4306(var2, var3);
					}

				}
			} else {
				int var25;
				if (var6 != 10 && var6 != 11) {
					int[] var10000;
					if (var6 >= 12) {
						if (var9.field2260 == -1 && var9.field2278 == null) {
							var24 = var9.method4177(var6, var5, var16, var18, var17, var19);
						} else {
							var24 = new Class96(var0, var4, var6, var5, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
						}

						var23.method4935(var1, var2, var3, var17, 1, 1, (Class255)var24, 0, var20, var22);
						if (var6 >= 12 && var6 <= 17 && var6 != 13 && var1 > 0) {
							var10000 = field4809[var1][var2];
							var10000[var3] |= 2340;
						}

						if (0 != var9.field2282 && var7 != null) {
							var7.method4301(var2, var3, var10, var11, var9.field2255);
						}

					} else if (var6 == 0) {
						if (-1 == var9.field2260 && var9.field2278 == null) {
							var24 = var9.method4177(0, var5, var16, var18, var17, var19);
						} else {
							var24 = new Class96(var0, var4, 0, var5, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
						}

						var23.method4933(var1, var2, var3, var17, (Class255)var24, (Class255)null, field1248[var5], 0, var20, var22);
						if (var5 == 0) {
							if (var9.field2268) {
								field1938[var1][var2][var3] = 50;
								field1938[var1][var2][var3 + 1] = 50;
							}

							if (var9.field2240) {
								var10000 = field4809[var1][var2];
								var10000[var3] |= 585;
							}
						} else if (var5 == 1) {
							if (var9.field2268) {
								field1938[var1][var2][var3 + 1] = 50;
								field1938[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var9.field2240) {
								var10000 = field4809[var1][var2];
								var10000[var3 + 1] |= 1170;
							}
						} else if (var5 == 2) {
							if (var9.field2268) {
								field1938[var1][var2 + 1][var3] = 50;
								field1938[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var9.field2240) {
								var10000 = field4809[var1][var2 + 1];
								var10000[var3] |= 585;
							}
						} else if (var5 == 3) {
							if (var9.field2268) {
								field1938[var1][var2][var3] = 50;
								field1938[var1][var2 + 1][var3] = 50;
							}

							if (var9.field2240) {
								var10000 = field4809[var1][var2];
								var10000[var3] |= 1170;
							}
						}

						if (0 != var9.field2282 && var7 != null) {
							var7.method4303(var2, var3, var6, var5, var9.field2255);
						}

						if (var9.field2261 != 16) {
							var23.method4960(var1, var2, var3, var9.field2261);
						}

					} else if (var6 == 1) {
						if (-1 == var9.field2260 && var9.field2278 == null) {
							var24 = var9.method4177(1, var5, var16, var18, var17, var19);
						} else {
							var24 = new Class96(var0, var4, 1, var5, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
						}

						var23.method4933(var1, var2, var3, var17, (Class255)var24, (Class255)null, field1236[var5], 0, var20, var22);
						if (var9.field2268) {
							if (var5 == 0) {
								field1938[var1][var2][var3 + 1] = 50;
							} else if (var5 == 1) {
								field1938[var1][var2 + 1][var3 + 1] = 50;
							} else if (var5 == 2) {
								field1938[var1][var2 + 1][var3] = 50;
							} else if (var5 == 3) {
								field1938[var1][var2][var3] = 50;
							}
						}

						if (0 != var9.field2282 && var7 != null) {
							var7.method4303(var2, var3, var6, var5, var9.field2255);
						}

					} else {
						int var30;
						if (var6 == 2) {
							var30 = var5 + 1 & 3;
							Object var32;
							Object var33;
							if (var9.field2260 == -1 && var9.field2278 == null) {
								var33 = var9.method4177(2, var5 + 4, var16, var18, var17, var19);
								var32 = var9.method4177(2, var30, var16, var18, var17, var19);
							} else {
								var33 = new Class96(var0, var4, 2, var5 + 4, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
								var32 = new Class96(var0, var4, 2, var30, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
							}

							var23.method4933(var1, var2, var3, var17, (Class255)var33, (Class255)var32, field1248[var5], field1248[var30], var20, var22);
							if (var9.field2240) {
								if (var5 == 0) {
									var10000 = field4809[var1][var2];
									var10000[var3] |= 585;
									var10000 = field4809[var1][var2];
									var10000[var3 + 1] |= 1170;
								} else if (var5 == 1) {
									var10000 = field4809[var1][var2];
									var10000[var3 + 1] |= 1170;
									var10000 = field4809[var1][var2 + 1];
									var10000[var3] |= 585;
								} else if (var5 == 2) {
									var10000 = field4809[var1][var2 + 1];
									var10000[var3] |= 585;
									var10000 = field4809[var1][var2];
									var10000[var3] |= 1170;
								} else if (var5 == 3) {
									var10000 = field4809[var1][var2];
									var10000[var3] |= 1170;
									var10000 = field4809[var1][var2];
									var10000[var3] |= 585;
								}
							}

							if (0 != var9.field2282 && var7 != null) {
								var7.method4303(var2, var3, var6, var5, var9.field2255);
							}

							if (16 != var9.field2261) {
								var23.method4960(var1, var2, var3, var9.field2261);
							}

						} else if (var6 == 3) {
							if (var9.field2260 == -1 && var9.field2278 == null) {
								var24 = var9.method4177(3, var5, var16, var18, var17, var19);
							} else {
								var24 = new Class96(var0, var4, 3, var5, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
							}

							var23.method4933(var1, var2, var3, var17, (Class255)var24, (Class255)null, field1236[var5], 0, var20, var22);
							if (var9.field2268) {
								if (var5 == 0) {
									field1938[var1][var2][var3 + 1] = 50;
								} else if (var5 == 1) {
									field1938[var1][var2 + 1][var3 + 1] = 50;
								} else if (var5 == 2) {
									field1938[var1][var2 + 1][var3] = 50;
								} else if (var5 == 3) {
									field1938[var1][var2][var3] = 50;
								}
							}

							if (0 != var9.field2282 && var7 != null) {
								var7.method4303(var2, var3, var6, var5, var9.field2255);
							}

						} else if (var6 == 9) {
							if (var9.field2260 == -1 && var9.field2278 == null) {
								var24 = var9.method4177(var6, var5, var16, var18, var17, var19);
							} else {
								var24 = new Class96(var0, var4, var6, var5, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
							}

							var23.method4935(var1, var2, var3, var17, 1, 1, (Class255)var24, 0, var20, var22);
							if (var9.field2282 != 0 && var7 != null) {
								var7.method4301(var2, var3, var10, var11, var9.field2255);
							}

							if (16 != var9.field2261) {
								var23.method4960(var1, var2, var3, var9.field2261);
							}

						} else if (var6 == 4) {
							if (-1 == var9.field2260 && var9.field2278 == null) {
								var24 = var9.method4177(4, var5, var16, var18, var17, var19);
							} else {
								var24 = new Class96(var0, var4, 4, var5, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
							}

							var23.method5123(var1, var2, var3, var17, (Class255)var24, (Class255)null, field1248[var5], 0, 0, 0, var20, var22);
						} else {
							long var31;
							Object var34;
							if (var6 == 5) {
								var30 = 16;
								var31 = var23.method4951(var1, var2, var3);
								if (var31 != 0L) {
									var30 = Class222.method4161(Class274.method2942(var31)).field2261;
								}

								if (-1 == var9.field2260 && var9.field2278 == null) {
									var34 = var9.method4177(4, var5, var16, var18, var17, var19);
								} else {
									var34 = new Class96(var0, var4, 4, var5, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
								}

								var23.method5123(var1, var2, var3, var17, (Class255)var34, (Class255)null, field1248[var5], 0, field1242[var5] * var30, field1243[var5] * var30, var20, var22);
							} else if (var6 == 6) {
								var30 = 8;
								var31 = var23.method4951(var1, var2, var3);
								if (0L != var31) {
									var30 = Class222.method4161(Class274.method2942(var31)).field2261 / 2;
								}

								if (var9.field2260 == -1 && var9.field2278 == null) {
									var34 = var9.method4177(4, var5 + 4, var16, var18, var17, var19);
								} else {
									var34 = new Class96(var0, var4, 4, var5 + 4, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
								}

								var23.method5123(var1, var2, var3, var17, (Class255)var34, (Class255)null, 256, var5, var30 * field1244[var5], field1245[var5] * var30, var20, var22);
							} else if (var6 == 7) {
								var25 = var5 + 2 & 3;
								if (-1 == var9.field2260 && var9.field2278 == null) {
									var24 = var9.method4177(4, var25 + 4, var16, var18, var17, var19);
								} else {
									var24 = new Class96(var0, var4, 4, var25 + 4, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
								}

								var23.method5123(var1, var2, var3, var17, (Class255)var24, (Class255)null, 256, var25, 0, 0, var20, var22);
							} else if (var6 == 8) {
								var30 = 8;
								var31 = var23.method4951(var1, var2, var3);
								if (0L != var31) {
									var30 = Class222.method4161(Class274.method2942(var31)).field2261 / 2;
								}

								int var29 = var5 + 2 & 3;
								Object var28;
								if (var9.field2260 == -1 && var9.field2278 == null) {
									var34 = var9.method4177(4, var5 + 4, var16, var18, var17, var19);
									var28 = var9.method4177(4, var29 + 4, var16, var18, var17, var19);
								} else {
									var34 = new Class96(var0, var4, 4, var5 + 4, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
									var28 = new Class96(var0, var4, 4, var29 + 4, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
								}

								var23.method5123(var1, var2, var3, var17, (Class255)var34, (Class255)var28, 256, var5, var30 * field1244[var5], var30 * field1245[var5], var20, var22);
							}
						}
					}
				} else {
					if (-1 == var9.field2260 && var9.field2278 == null) {
						var24 = var9.method4177(10, var5, var16, var18, var17, var19);
					} else {
						var24 = new Class96(var0, var4, 10, var5, var1, var2, var3, var9.field2260, var9.field2265, (Class255)null);
					}

					if (var24 != null && var23.method4935(var1, var2, var3, var17, var10, var11, (Class255)var24, var6 == 11 ? 256 : 0, var20, var22) && var9.field2268) {
						var25 = 15;
						if (var24 instanceof Class262) {
							var25 = ((Class262)var24).method5175() / 4;
							if (var25 > 30) {
								var25 = 30;
							}
						}

						for (int var26 = 0; var26 <= var10; ++var26) {
							for (int var27 = 0; var27 <= var11; ++var27) {
								if (var25 > field1938[var1][var26 + var2][var27 + var3]) {
									field1938[var1][var26 + var2][var27 + var3] = (byte)var25;
								}
							}
						}
					}

					if (0 != var9.field2282 && var7 != null) {
						var7.method4301(var2, var3, var10, var11, var9.field2255);
					}

				}
			}
		}
	}

	@ObfInfo(owner = "uy", name = "av", desc = "(Ldt;I)V", opaque = "2124351975")
	public static void method9902(Class98 var0) {
		int var2 = var0.field1298;
		int var3 = var0.field1282;
		int[][][] var4 = var0.field1291;
		byte[][][] var5 = var0.field1292;
		Class259 var6 = var0.field1283;
		Class226[] var7 = var0.field1284;

		int var8;
		int var9;
		int var10;
		int var11;
		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var2; ++var9) {
				for (var10 = 0; var10 < var3; ++var10) {
					if ((var0.field1292[var8][var9][var10] & 1) == 1) {
						var11 = var8;
						if (2 == (var0.field1292[1][var9][var10] & 2)) {
							var11 = var8 - 1;
						}

						if (var11 >= 0 && var7 != null) {
							var7[var11].method4305(var9, var10);
						}
					}
				}
			}
		}

		field1246 += (int)(Math.random() * 5.0D) - 2;
		if (field1246 < -8) {
			field1246 = -8;
		}

		if (field1246 > 8) {
			field1246 = 8;
		}

		field1247 += (int)(Math.random() * 5.0D) - 2;
		if (field1247 < -16) {
			field1247 = -16;
		}

		if (field1247 > 16) {
			field1247 = 16;
		}

		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		int var24;
		for (var8 = 0; var8 < 4; ++var8) {
			byte[][] var51 = field1938[var8];
			boolean var52 = true;
			boolean var53 = true;
			boolean var12 = true;
			boolean var13 = true;
			boolean var14 = true;
			var15 = (int)Math.sqrt(5100.0D);
			var16 = var15 * 768 >> 8;

			int var25;
			int var26;
			for (var17 = 1; var17 < var3 - 1; ++var17) {
				for (var18 = 1; var18 < var2 - 1; ++var18) {
					var19 = var4[var8][var18 + 1][var17] - var4[var8][var18 - 1][var17];
					var20 = var4[var8][var18][var17 + 1] - var4[var8][var18][var17 - 1];
					var21 = (int)Math.sqrt((double)(var20 * var20 + 65536 + var19 * var19));
					var22 = (var19 << 8) / var21;
					var23 = 65536 / var21;
					var24 = (var20 << 8) / var21;
					var25 = 96 + (var23 * -10 + var22 * -50 + var24 * -50) / var16;
					var26 = (var51[var18][var17 - 1] >> 2) + (var51[var18 - 1][var17] >> 2) + (var51[var18 + 1][var17] >> 3) + (var51[var18][var17 + 1] >> 3) + (var51[var18][var17] >> 1);
					field108[var18][var17] = var25 - var26;
				}
			}

			for (var17 = 0; var17 < var3; ++var17) {
				field2189[var17] = 0;
				field2094[var17] = 0;
				field1238[var17] = 0;
				field1615[var17] = 0;
				field1239[var17] = 0;
			}

			for (var17 = -5; var17 < var2 + 5; ++var17) {
				for (var18 = 0; var18 < var3; ++var18) {
					var19 = var17 + 5;
					int var10002;
					if (var19 >= 0 && var19 < var2) {
						var20 = (int)Class349.method6730(15);
						var21 = field1926[var8][var19][var18] & var20;
						if (var21 > 0) {
							Class209 var57 = Class209.method4164(var21 - 1);
							var10000 = field2189;
							var10000[var18] += var57.field2113;
							var10000 = field2094;
							var10000[var18] += var57.field2109;
							var10000 = field1238;
							var10000[var18] += var57.field2114;
							var10000 = field1615;
							var10000[var18] += var57.field2115;
							var10002 = field1239[var18]++;
						}
					}

					var20 = var17 - 5;
					if (var20 >= 0 && var20 < var2) {
						var21 = (int)Class349.method6730(15);
						var22 = field1926[var8][var20][var18] & var21;
						if (var22 > 0) {
							Class209 var59 = Class209.method4164(var22 - 1);
							var10000 = field2189;
							var10000[var18] -= var59.field2113;
							var10000 = field2094;
							var10000[var18] -= var59.field2109;
							var10000 = field1238;
							var10000[var18] -= var59.field2114;
							var10000 = field1615;
							var10000[var18] -= var59.field2115;
							var10002 = field1239[var18]--;
						}
					}
				}

				if (var17 >= 1 && var17 < var2 - 1) {
					var18 = 0;
					var19 = 0;
					var20 = 0;
					var21 = 0;
					var22 = 0;

					for (var23 = -5; var23 < var3 + 5; ++var23) {
						var24 = var23 + 5;
						if (var24 >= 0 && var24 < var3) {
							var18 += field2189[var24];
							var19 += field2094[var24];
							var20 += field1238[var24];
							var21 += field1615[var24];
							var22 += field1239[var24];
						}

						var25 = var23 - 5;
						if (var25 >= 0 && var25 < var3) {
							var18 -= field2189[var25];
							var19 -= field2094[var25];
							var20 -= field1238[var25];
							var21 -= field1615[var25];
							var22 -= field1239[var25];
						}

						if (var23 >= 1 && var23 < var3 - 1 && (!Client.field599 || (var5[0][var17][var23] & 2) != 0 || 0 == (var5[var8][var17][var23] & 16))) {
							if (var8 < field1241) {
								field1241 = var8;
							}

							var26 = (int)Class349.method6730(15);
							int var27 = field1926[var8][var17][var23] & var26;
							int var28 = field1237[var8][var17][var23] & var26;
							if (var27 > 0 || var28 > 0) {
								int var29 = var4[var8][var17][var23];
								int var30 = var4[var8][var17 + 1][var23];
								int var31 = var4[var8][var17 + 1][var23 + 1];
								int var32 = var4[var8][var17][var23 + 1];
								int var33 = field108[var17][var23];
								int var34 = field108[var17 + 1][var23];
								int var35 = field108[var17 + 1][var23 + 1];
								int var36 = field108[var17][var23 + 1];
								int var37 = -1;
								int var38 = -1;
								int var39;
								int var40;
								int var41;
								if (var27 > 0) {
									var39 = var18 * 256 / var21;
									var40 = var19 / var22;
									var41 = var20 / var22;
									var37 = method7796(var39, var40, var41);
									var39 = field1246 + var39 & 255;
									var41 += field1247;
									if (var41 < 0) {
										var41 = 0;
									} else if (var41 > 255) {
										var41 = 255;
									}

									var38 = method7796(var39, var40, var41);
								}

								Class230 var42;
								if (var8 > 0) {
									boolean var60 = true;
									if (var27 == 0 && 0 != field2637[var8][var17][var23]) {
										var60 = false;
									}

									if (var28 > 0) {
										var41 = var28 - 1;
										var42 = (Class230)Class230.field2422.method5993((long)var41);
										if (var42 == null) {
											byte[] var43 = field2417.method7216(4, var41);
											var42 = new Class230();
											if (var43 != null) {
												var42.method4393(new Class521(var43), var41);
											}

											var42.method4394();
											Class230.field2422.method5987(var42, (long)var41);
										}

										if (!var42.field2420) {
											var60 = false;
										}
									}

									if (var60 && var30 == var29 && var31 == var29 && var32 == var29) {
										var10000 = field4809[var8][var17];
										var10000[var23] |= 2340;
									}
								}

								var39 = 0;
								if (var38 != -1) {
									var39 = Class253.field2684[method7706(var38, 96)];
								}

								if (var28 == 0) {
									var6.method5031(var8, var17, var23, 0, 0, -1, var29, var30, var31, var32, method7706(var37, var33), method7706(var37, var34), method7706(var37, var35), method7706(var37, var36), 0, 0, 0, 0, var39, 0);
								} else {
									var40 = field2637[var8][var17][var23] + 1;
									byte var61 = field3973[var8][var17][var23];
									int var62 = var28 - 1;
									Class230 var44 = (Class230)Class230.field2422.method5993((long)var62);
									if (var44 != null) {
										var42 = var44;
									} else {
										byte[] var45 = field2417.method7216(4, var62);
										var44 = new Class230();
										if (var45 != null) {
											var44.method4393(new Class521(var45), var62);
										}

										var44.method4394();
										Class230.field2422.method5987(var44, (long)var62);
										var42 = var44;
									}

									int var63 = var42.field2429;
									int var46;
									int var47;
									int var48;
									int var49;
									if (var63 >= 0) {
										var47 = Class253.field2688.field3043.method4718(var63);
										var46 = -1;
									} else if (16711935 == var42.field2418) {
										var46 = -2;
										var63 = -1;
										var47 = -2;
									} else {
										var46 = method7796(var42.field2425, var42.field2423, var42.field2424);
										var48 = var42.field2425 + field1246 & 255;
										var49 = field1247 + var42.field2424;
										if (var49 < 0) {
											var49 = 0;
										} else if (var49 > 255) {
											var49 = 255;
										}

										var47 = method7796(var48, var42.field2423, var49);
									}

									var48 = 0;
									if (var47 != -2) {
										var48 = Class253.field2684[method114(var47, 96)];
									}

									if (var42.field2419 != -1) {
										var49 = field1246 + var42.field2431 & 255;
										int var50 = field1247 + var42.field2427;
										if (var50 < 0) {
											var50 = 0;
										} else if (var50 > 255) {
											var50 = 255;
										}

										var47 = method7796(var49, var42.field2426, var50);
										var48 = Class253.field2684[method114(var47, 96)];
									}

									var6.method5031(var8, var17, var23, var40, var61, var63, var29, var30, var31, var32, method7706(var37, var33), method7706(var37, var34), method7706(var37, var35), method7706(var37, var36), method114(var46, var33), method114(var46, var34), method114(var46, var35), method114(var46, var36), var39, var48);
								}
							}
						}
					}
				}
			}

			for (var17 = 1; var17 < var3 - 1; ++var17) {
				for (var18 = 1; var18 < var2 - 1; ++var18) {
					var6.method4941(var8, var18, var17, method6728(var0, var8, var18, var17));
				}
			}

			field1926[var8] = (short[][])null;
			field1237[var8] = (short[][])null;
			field2637[var8] = (byte[][])null;
			field3973[var8] = (byte[][])null;
			field1938[var8] = (byte[][])null;
		}

		var6.method4956(-50, -10, -50);

		for (var8 = 0; var8 < var2; ++var8) {
			for (var9 = 0; var9 < var3; ++var9) {
				if (2 == (var5[1][var8][var9] & 2)) {
					var6.method4927(var8, var9);
				}
			}
		}

		var8 = 1;
		var9 = 2;
		var10 = 4;

		for (var11 = 0; var11 < 4; ++var11) {
			if (var11 > 0) {
				var8 <<= 3;
				var9 <<= 3;
				var10 <<= 3;
			}

			for (int var54 = 0; var54 <= var11; ++var54) {
				for (int var55 = 0; var55 <= var3; ++var55) {
					for (int var56 = 0; var56 <= var2; ++var56) {
						short var58;
						if ((field4809[var54][var56][var55] & var8) != 0) {
							var15 = var55;
							var16 = var55;
							var17 = var54;

							for (var18 = var54; var15 > 0 && (field4809[var54][var56][var15 - 1] & var8) != 0; --var15) {
							}

							while (var16 < var3 && (field4809[var54][var56][var16 + 1] & var8) != 0) {
								++var16;
							}

							label402:
							while (var17 > 0) {
								for (var19 = var15; var19 <= var16; ++var19) {
									if ((field4809[var17 - 1][var56][var19] & var8) == 0) {
										break label402;
									}
								}

								--var17;
							}

							label391:
							while (var18 < var11) {
								for (var19 = var15; var19 <= var16; ++var19) {
									if ((field4809[var18 + 1][var56][var19] & var8) == 0) {
										break label391;
									}
								}

								++var18;
							}

							var19 = (1 + (var16 - var15)) * (var18 + 1 - var17);
							if (var19 >= 8) {
								var58 = 240;
								var21 = var4[var18][var56][var15] - var58;
								var22 = var4[var17][var56][var15];
								var6.method5009(var11, 1, var56 * 128, var56 * 128, var15 * 128, var16 * 128 + 128, var21, var22);

								for (var23 = var17; var23 <= var18; ++var23) {
									for (var24 = var15; var24 <= var16; ++var24) {
										var10000 = field4809[var23][var56];
										var10000[var24] &= ~var8;
									}
								}
							}
						}

						if (0 != (field4809[var54][var56][var55] & var9)) {
							var15 = var56;
							var16 = var56;
							var17 = var54;

							for (var18 = var54; var15 > 0 && (field4809[var54][var15 - 1][var55] & var9) != 0; --var15) {
							}

							while (var16 < var2 && 0 != (field4809[var54][var16 + 1][var55] & var9)) {
								++var16;
							}

							label455:
							while (var17 > 0) {
								for (var19 = var15; var19 <= var16; ++var19) {
									if ((field4809[var17 - 1][var19][var55] & var9) == 0) {
										break label455;
									}
								}

								--var17;
							}

							label444:
							while (var18 < var11) {
								for (var19 = var15; var19 <= var16; ++var19) {
									if ((field4809[var18 + 1][var19][var55] & var9) == 0) {
										break label444;
									}
								}

								++var18;
							}

							var19 = (1 + (var16 - var15)) * (var18 + 1 - var17);
							if (var19 >= 8) {
								var58 = 240;
								var21 = var4[var18][var15][var55] - var58;
								var22 = var4[var17][var15][var55];
								var6.method5009(var11, 2, var15 * 128, 128 + var16 * 128, var55 * 128, var55 * 128, var21, var22);

								for (var23 = var17; var23 <= var18; ++var23) {
									for (var24 = var15; var24 <= var16; ++var24) {
										var10000 = field4809[var23][var24];
										var10000[var55] &= ~var9;
									}
								}
							}
						}

						if ((field4809[var54][var56][var55] & var10) != 0) {
							var15 = var56;
							var16 = var56;
							var17 = var55;

							for (var18 = var55; var17 > 0 && (field4809[var54][var56][var17 - 1] & var10) != 0; --var17) {
							}

							while (var18 < var3 && 0 != (field4809[var54][var56][var18 + 1] & var10)) {
								++var18;
							}

							label508:
							while (var15 > 0) {
								for (var19 = var17; var19 <= var18; ++var19) {
									if (0 == (field4809[var54][var15 - 1][var19] & var10)) {
										break label508;
									}
								}

								--var15;
							}

							label497:
							while (var16 < var2) {
								for (var19 = var17; var19 <= var18; ++var19) {
									if (0 == (field4809[var54][var16 + 1][var19] & var10)) {
										break label497;
									}
								}

								++var16;
							}

							if ((var18 - var17 + 1) * (var16 - var15 + 1) >= 4) {
								var19 = var4[var54][var15][var17];
								var6.method5009(var11, 4, var15 * 128, 128 + var16 * 128, var17 * 128, 128 + var18 * 128, var19, var19);

								for (var20 = var15; var20 <= var16; ++var20) {
									for (var21 = var17; var21 <= var18; ++var21) {
										var10000 = field4809[var54][var20];
										var10000[var21] &= ~var10;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(owner = "nk", name = "aq", desc = "(Ldt;IIIB)I", opaque = "-1")
	public static int method6728(Class98 var0, int var1, int var2, int var3) {
		if ((var0.field1292[var1][var2][var3] & 8) != 0) {
			return 0;
		} else {
			return var1 > 0 && (var0.field1292[1][var2][var3] & 2) != 0 ? var1 - 1 : var1;
		}
	}

	@ObfInfo(owner = "hg", name = "ap", desc = "(IIB)I", opaque = "-1")
	public static int method3708(int var0, int var1) {
		int var3 = method107(var0 + 45365, var1 + 91923, 4) - 128 + (method107(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (method107(var0, var1, 1) - 128 >> 2);
		var3 = 35 + (int)((double)var3 * 0.3D);
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}

		return var3;
	}

	@ObfInfo(owner = "ag", name = "ae", desc = "(IIII)I")
	public static int method107(int var0, int var1, int var2) {
		int var4 = var0 / var2;
		int var5 = var0 & var2 - 1;
		int var6 = var1 / var2;
		int var7 = var1 & var2 - 1;
		int var8 = method4759(var4, var6);
		int var9 = method4759(var4 + 1, var6);
		int var10 = method4759(var4, var6 + 1);
		int var11 = method4759(var4 + 1, var6 + 1);
		int var13 = 65536 - Class253.field2687[var5 * 1024 / var2] >> 1;
		int var12 = (var8 * (65536 - var13) >> 16) + (var13 * var9 >> 16);
		int var15 = 65536 - Class253.field2687[var5 * 1024 / var2] >> 1;
		int var14 = (var15 * var11 >> 16) + (var10 * (65536 - var15) >> 16);
		int var17 = 65536 - Class253.field2687[var7 * 1024 / var2] >> 1;
		int var16 = (var17 * var14 >> 16) + (var12 * (65536 - var17) >> 16);
		return var16;
	}

	@ObfInfo(owner = "jm", name = "ax", desc = "(III)I")
	public static int method4759(int var0, int var1) {
		int var3 = method2971(var0 - 1, var1 - 1) + method2971(var0 + 1, var1 - 1) + method2971(var0 - 1, var1 + 1) + method2971(var0 + 1, var1 + 1);
		int var4 = method2971(var0 - 1, var1) + method2971(var0 + 1, var1) + method2971(var0, var1 - 1) + method2971(var0, var1 + 1);
		int var5 = method2971(var0, var1);
		return var5 / 4 + var4 / 8 + var3 / 16;
	}

	@ObfInfo(owner = "eq", name = "ay", desc = "(III)I")
	public static int method2971(int var0, int var1) {
		int var3 = var1 * 57 + var0;
		var3 ^= var3 << 13;
		int var4 = (15731 * var3 * var3 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 255;
	}

	@ObfInfo(owner = "pv", name = "au", desc = "(III)I", opaque = "2011553859")
	public static int method7706(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = var1 * (var0 & 127) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}

	@ObfInfo(owner = "ah", name = "as", desc = "(IIS)I", opaque = "489")
	public static int method114(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}

	@ObfInfo(owner = "qc", name = "aw", desc = "(IIII)I", opaque = "286331154")
	public static int method7796(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var4 = var2 / 2 + (var0 / 4 << 10) + (var1 / 32 << 7);
		return var4;
	}
}
