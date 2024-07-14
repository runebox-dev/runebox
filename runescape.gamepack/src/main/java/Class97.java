import io.runebox.ObfInfo;

@ObfInfo(name = "ds")
public final class Class97 {
	@ObfInfo(owner = "hi", name = "aq", desc = "Lok;")
	public static Class375 field2099;
	@ObfInfo(name = "ak", desc = "[[[B")
	public static byte[][][] field1188;
	@ObfInfo(owner = "kp", name = "an", desc = "[[[B")
	public static byte[][][] field2822;
	@ObfInfo(owner = "ny", name = "ap", desc = "[[[B")
	public static byte[][][] field3989;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1409837805)
	public static int field1197;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1581876365)
	public static int field1199;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1640997177)
	public static int field1200;
	@ObfInfo(name = "ae", desc = "[I")
	public static int[] field1189;
	@ObfInfo(name = "av", desc = "[I")
	public static int[] field1190;
	@ObfInfo(name = "ab", desc = "[I")
	public static int[] field1191;
	@ObfInfo(owner = "af", name = "ai", desc = "[I")
	public static int[] field34;
	@ObfInfo(owner = "ue", name = "au", desc = "[I")
	public static int[] field5252;
	@ObfInfo(name = "aj", desc = "[[I")
	public static int[][] field1192;
	@ObfInfo(owner = "ar", name = "ah", desc = "[[[I")
	public static int[][][] field82;
	@ObfInfo(name = "ad", desc = "[[[S")
	public static short[][][] field1186;
	@ObfInfo(name = "ag", desc = "[[[S")
	public static short[][][] field1187;
	@ObfInfo(name = "as", desc = "[I")
	public static final int[] field1185;
	@ObfInfo(name = "al", desc = "[I")
	public static final int[] field1193;
	@ObfInfo(name = "ay", desc = "[I")
	public static final int[] field1194;
	@ObfInfo(name = "ao", desc = "[I")
	public static final int[] field1195;
	@ObfInfo(name = "aa", desc = "[I")
	public static final int[] field1196;
	@ObfInfo(name = "aw", desc = "[I")
	public static final int[] field1198;

	static {
		field1197 = 99;
		field1193 = new int[]{1, 2, 4, 8};
		field1194 = new int[]{16, 32, 64, 128};
		field1195 = new int[]{1, 0, -1, 0};
		field1196 = new int[]{0, -1, 0, 1};
		field1185 = new int[]{1, -1, -1, 1};
		field1198 = new int[]{-1, -1, 1, 1};
		field1199 = (int)(Math.random() * 17.0D) - 8;
		field1200 = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfInfo(owner = "if", name = "aq", desc = "(I)V")
	public static void method4118() {
		field1197 = 99;
		field1186 = new short[4][104][104];
		field1187 = new short[4][104][104];
		field1188 = new byte[4][104][104];
		field3989 = new byte[4][104][104];
		field82 = new int[4][105][105];
		field2822 = new byte[4][105][105];
		field1192 = new int[105][105];
		field1190 = new int[104];
		field1191 = new int[104];
		field34 = new int[104];
		field1189 = new int[104];
		field5252 = new int[104];
	}

	@ObfInfo(owner = "li", name = "ag", desc = "(Lde;IIIII)V", opaque = "-1895642980")
	public static void method5780(Class83 var0, int var1, int var2, int var3, int var4) {
		int[][][] var6 = var0.field1025;
		int var7 = var0.field1030 - 1;
		int var8 = var0.field1018 - 1;

		for (int var9 = var2; var9 <= var2 + var4; ++var9) {
			for (int var10 = var1; var10 <= var1 + var3; ++var10) {
				if (var10 >= 0 && var10 < var6[0].length - 1 && var9 >= 0 && var9 < var6[0][0].length - 1) {
					field2822[0][var10][var9] = 127;
					if (var1 == var10 && var10 > 0) {
						var6[0][var10][var9] = var6[0][var10 - 1][var9];
					}

					if (var1 + var3 == var10 && var10 < var7) {
						var6[0][var10][var9] = var6[0][var10 + 1][var9];
					}

					if (var2 == var9 && var9 > 0) {
						var6[0][var10][var9] = var6[0][var10][var9 - 1];
					}

					if (var2 + var4 == var9 && var9 < var8) {
						var6[0][var10][var9] = var6[0][var10][var9 + 1];
					}
				}
			}
		}

	}

	@ObfInfo(owner = "ca", name = "ak", desc = "(Lde;[BIIIII)V", opaque = "-740937112")
	public static void method1137(Class83 var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var8;
		int var9;
		if (var0.field1015 != null) {
			for (int var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 64; ++var8) {
					for (var9 = 0; var9 < 64; ++var9) {
						if (var2 + var8 > 0 && var2 + var8 < var0.field1015[var7].field2435.length && var3 + var9 > 0 && var3 + var9 < var0.field1015[var7].field2435[var2 + var8].length) {
							int[] var10000 = var0.field1015[var7].field2435[var2 + var8];
							var10000[var3 + var9] &= -1073741825;
						}
					}
				}
			}
		}

		Class562 var13 = new Class562(var1);

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (int var10 = 0; var10 < 64; ++var10) {
					int var11 = var2 + var9;
					int var12 = var3 + var10;
					Class283.method5628(var0, var13, var8, var11, var12, var4 + var11, var5 + var12, 0);
				}
			}
		}

	}

	@ObfInfo(owner = "ih", name = "ap", desc = "(Lde;[BIIIIIIIIIB)V", opaque = "1")
	public static void method4130(Class83 var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		Class224[] var12 = var0.field1015;
		int var14;
		if (var12 != null) {
			for (int var13 = 0; var13 < 8; ++var13) {
				for (var14 = 0; var14 < 8; ++var14) {
					if (var3 + var13 > 0 && var3 + var13 < var12[var2].field2435.length && var4 + var14 > 0 && var4 + var14 < var12[var2].field2435[var3 + var13].length) {
						int[] var10000 = var12[var2].field2435[var3 + var13];
						var10000[var4 + var14] &= -1073741825;
					}
				}
			}
		}

		Class562 var26 = new Class562(var1);

		for (var14 = 0; var14 < 4; ++var14) {
			for (int var15 = 0; var15 < 64; ++var15) {
				for (int var16 = 0; var16 < 64; ++var16) {
					if (var5 == var14 && var15 >= var6 && var15 < var6 + 8 && var16 >= var7 && var16 < var7 + 8) {
						int var17 = Class346.method6604(var15 & 7, var16 & 7, var8) + var3;
						int var20 = var15 & 7;
						int var21 = var16 & 7;
						int var22 = var8 & 3;
						int var19;
						if (var22 == 0) {
							var19 = var21;
						} else if (var22 == 1) {
							var19 = 7 - var20;
						} else if (var22 == 2) {
							var19 = 7 - var21;
						} else {
							var19 = var20;
						}

						int var23 = var4 + var19;
						int var24 = (var15 & 7) + var3 + var9;
						int var25 = (var16 & 7) + var4 + var10;
						Class283.method5628(var0, var26, var2, var17, var23, var24, var25, var8);
					} else {
						Class283.method5628(var0, var26, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfInfo(owner = "cd", name = "an", desc = "([[[IIIII)V", opaque = "702035000")
	public static void method1170(int[][][] var0, int var1, int var2, int var3) {
		int var5;
		for (var5 = 0; var5 < 8; ++var5) {
			for (int var6 = 0; var6 < 8; ++var6) {
				var0[var1][var2 + var5][var3 + var6] = 0;
			}
		}

		if (var2 > 0) {
			for (var5 = 1; var5 < 8; ++var5) {
				var0[var1][var2][var3 + var5] = var0[var1][var2 - 1][var3 + var5];
			}
		}

		if (var3 > 0) {
			for (var5 = 1; var5 < 8; ++var5) {
				var0[var1][var2 + var5][var3] = var0[var1][var2 + var5][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}

	@ObfInfo(name = "ai", desc = "(Lde;[BIIIIIII)V")
	public static void method2572(Class83 var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Class562 var9 = new Class562(var1);
		int var10 = -1;

		while (true) {
			int var11 = var9.method9844();
			if (var11 == 0) {
				return;
			}

			var10 += var11;
			int var12 = 0;

			while (true) {
				int var13 = var9.method9842();
				if (var13 == 0) {
					break;
				}

				var12 += var13 - 1;
				int var14 = var12 & 63;
				int var15 = var12 >> 6 & 63;
				int var16 = var12 >> 12;
				int var17 = var9.method9902();
				int var18 = var17 >> 2;
				int var19 = var17 & 3;
				if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
					Class197 var20 = Class197.method61(var10);
					int var21 = Class232.method4438(var15 & 7, var14 & 7, var8, var20.field2140, var20.field2141, var19) + var3;
					int var24 = var15 & 7;
					int var25 = var14 & 7;
					int var27 = var20.field2140;
					int var28 = var20.field2141;
					int var29;
					if ((var19 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var8 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var25;
					} else if (var26 == 1) {
						var23 = 7 - var24 - (var27 - 1);
					} else if (var26 == 2) {
						var23 = 7 - var25 - (var28 - 1);
					} else {
						var23 = var24;
					}

					var29 = var4 + var23;
					if (var21 > 0 && var29 > 0 && var21 < var0.field1030 - 1 && var29 < var0.field1018 - 1) {
						int var30 = var2;
						if ((var0.field1023[1][var21][var29] & 2) == 2) {
							var30 = var2 - 1;
						}

						Class224 var31 = null;
						if (var30 >= 0 && var0.field1015 != null) {
							var31 = var0.field1015[var30];
						}

						method246(var0, var2, var21, var29, var10, var8 + var19 & 3, var18, var31);
					}
				}
			}
		}
	}

	@ObfInfo(owner = "ar", name = "ae", desc = "(Lde;IIIIIILip;I)V", opaque = "793708325")
	public static void method246(Class83 var0, int var1, int var2, int var3, int var4, int var5, int var6, Class224 var7) {
		if (!Client.field687 || (var0.field1023[0][var2][var3] & 2) != 0 || (var0.field1023[var1][var2][var3] & 16) == 0) {
			if (var1 < field1197) {
				field1197 = var1;
			}

			Class197 var9 = Class197.method61(var4);
			int var10;
			int var11;
			if (var5 != 1 && var5 != 3) {
				var10 = var9.field2140;
				var11 = var9.field2141;
			} else {
				var10 = var9.field2141;
				var11 = var9.field2140;
			}

			int var12;
			int var13;
			if (var2 + var10 <= var0.field1030) {
				var12 = (var10 >> 1) + var2;
				var13 = (var10 + 1 >> 1) + var2;
			} else {
				var12 = var2;
				var13 = var2 + 1;
			}

			int var14;
			int var15;
			if (var3 + var11 <= var0.field1018) {
				var14 = (var11 >> 1) + var3;
				var15 = (var11 + 1 >> 1) + var3;
			} else {
				var14 = var3;
				var15 = var3 + 1;
			}

			int[][] var16 = var0.field1025[var1];
			int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
			int var18 = (var2 << 7) + (var10 << 6);
			int var19 = (var3 << 7) + (var11 << 6);
			long var20 = Class296.method4129(var2, var3, 2, var9.field2144 == 0, var4, var0.field1026);
			int var22 = (var5 << 6) + var6;
			if (var9.field2165 == 1) {
				var22 += 256;
			}

			if (var9.method3908()) {
				Class55.method3129(var1, var2, var3, var9, var5);
			}

			Class277 var23 = var0.field1014;
			Object var24;
			if (var6 == 22) {
				if (!Client.field687 || var9.field2144 != 0 || var9.field2126 == 1 || var9.field2134) {
					if (var9.field2148 == -1 && var9.field2166 == null) {
						var24 = var9.method3902(22, var5, var16, var18, var17, var19);
					} else {
						var24 = new Class96(var0, var4, 22, var5, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
					}

					var23.method5258(var1, var2, var3, var17, (Class280)var24, var20, var22);
					if (var9.field2126 == 1 && var7 != null) {
						var7.method4308(var2, var3);
					}

				}
			} else {
				int var25;
				if (var6 != 10 && var6 != 11) {
					int[] var10000;
					if (var6 >= 12) {
						if (var9.field2148 == -1 && var9.field2166 == null) {
							var24 = var9.method3902(var6, var5, var16, var18, var17, var19);
						} else {
							var24 = new Class96(var0, var4, var6, var5, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
						}

						var23.method5262(var1, var2, var3, var17, 1, 1, (Class280)var24, 0, var20, var22);
						if (var6 >= 12 && var6 <= 17 && var6 != 13 && var1 > 0) {
							var10000 = field82[var1][var2];
							var10000[var3] |= 2340;
						}

						if (var9.field2126 != 0 && var7 != null) {
							var7.method4306(var2, var3, var10, var11, var9.field2143);
						}

					} else if (var6 == 0) {
						if (var9.field2148 == -1 && var9.field2166 == null) {
							var24 = var9.method3902(0, var5, var16, var18, var17, var19);
						} else {
							var24 = new Class96(var0, var4, 0, var5, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
						}

						var23.method5260(var1, var2, var3, var17, (Class280)var24, (Class280)null, field1193[var5], 0, var20, var22);
						if (var5 == 0) {
							if (var9.field2156) {
								field2822[var1][var2][var3] = 50;
								field2822[var1][var2][var3 + 1] = 50;
							}

							if (var9.field2133) {
								var10000 = field82[var1][var2];
								var10000[var3] |= 585;
							}
						} else if (var5 == 1) {
							if (var9.field2156) {
								field2822[var1][var2][var3 + 1] = 50;
								field2822[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var9.field2133) {
								var10000 = field82[var1][var2];
								var10000[var3 + 1] |= 1170;
							}
						} else if (var5 == 2) {
							if (var9.field2156) {
								field2822[var1][var2 + 1][var3] = 50;
								field2822[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var9.field2133) {
								var10000 = field82[var1][var2 + 1];
								var10000[var3] |= 585;
							}
						} else if (var5 == 3) {
							if (var9.field2156) {
								field2822[var1][var2][var3] = 50;
								field2822[var1][var2 + 1][var3] = 50;
							}

							if (var9.field2133) {
								var10000 = field82[var1][var2];
								var10000[var3] |= 1170;
							}
						}

						if (var9.field2126 != 0 && var7 != null) {
							var7.method4305(var2, var3, var6, var5, var9.field2143);
						}

						if (var9.field2149 != 16) {
							var23.method5353(var1, var2, var3, var9.field2149);
						}

					} else if (var6 == 1) {
						if (var9.field2148 == -1 && var9.field2166 == null) {
							var24 = var9.method3902(1, var5, var16, var18, var17, var19);
						} else {
							var24 = new Class96(var0, var4, 1, var5, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
						}

						var23.method5260(var1, var2, var3, var17, (Class280)var24, (Class280)null, field1194[var5], 0, var20, var22);
						if (var9.field2156) {
							if (var5 == 0) {
								field2822[var1][var2][var3 + 1] = 50;
							} else if (var5 == 1) {
								field2822[var1][var2 + 1][var3 + 1] = 50;
							} else if (var5 == 2) {
								field2822[var1][var2 + 1][var3] = 50;
							} else if (var5 == 3) {
								field2822[var1][var2][var3] = 50;
							}
						}

						if (var9.field2126 != 0 && var7 != null) {
							var7.method4305(var2, var3, var6, var5, var9.field2143);
						}

					} else {
						int var30;
						if (var6 == 2) {
							var30 = var5 + 1 & 3;
							Object var32;
							Object var33;
							if (var9.field2148 == -1 && var9.field2166 == null) {
								var33 = var9.method3902(2, var5 + 4, var16, var18, var17, var19);
								var32 = var9.method3902(2, var30, var16, var18, var17, var19);
							} else {
								var33 = new Class96(var0, var4, 2, var5 + 4, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
								var32 = new Class96(var0, var4, 2, var30, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
							}

							var23.method5260(var1, var2, var3, var17, (Class280)var33, (Class280)var32, field1193[var5], field1193[var30], var20, var22);
							if (var9.field2133) {
								if (var5 == 0) {
									var10000 = field82[var1][var2];
									var10000[var3] |= 585;
									var10000 = field82[var1][var2];
									var10000[var3 + 1] |= 1170;
								} else if (var5 == 1) {
									var10000 = field82[var1][var2];
									var10000[var3 + 1] |= 1170;
									var10000 = field82[var1][var2 + 1];
									var10000[var3] |= 585;
								} else if (var5 == 2) {
									var10000 = field82[var1][var2 + 1];
									var10000[var3] |= 585;
									var10000 = field82[var1][var2];
									var10000[var3] |= 1170;
								} else if (var5 == 3) {
									var10000 = field82[var1][var2];
									var10000[var3] |= 1170;
									var10000 = field82[var1][var2];
									var10000[var3] |= 585;
								}
							}

							if (var9.field2126 != 0 && var7 != null) {
								var7.method4305(var2, var3, var6, var5, var9.field2143);
							}

							if (var9.field2149 != 16) {
								var23.method5353(var1, var2, var3, var9.field2149);
							}

						} else if (var6 == 3) {
							if (var9.field2148 == -1 && var9.field2166 == null) {
								var24 = var9.method3902(3, var5, var16, var18, var17, var19);
							} else {
								var24 = new Class96(var0, var4, 3, var5, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
							}

							var23.method5260(var1, var2, var3, var17, (Class280)var24, (Class280)null, field1194[var5], 0, var20, var22);
							if (var9.field2156) {
								if (var5 == 0) {
									field2822[var1][var2][var3 + 1] = 50;
								} else if (var5 == 1) {
									field2822[var1][var2 + 1][var3 + 1] = 50;
								} else if (var5 == 2) {
									field2822[var1][var2 + 1][var3] = 50;
								} else if (var5 == 3) {
									field2822[var1][var2][var3] = 50;
								}
							}

							if (var9.field2126 != 0 && var7 != null) {
								var7.method4305(var2, var3, var6, var5, var9.field2143);
							}

						} else if (var6 == 9) {
							if (var9.field2148 == -1 && var9.field2166 == null) {
								var24 = var9.method3902(var6, var5, var16, var18, var17, var19);
							} else {
								var24 = new Class96(var0, var4, var6, var5, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
							}

							var23.method5262(var1, var2, var3, var17, 1, 1, (Class280)var24, 0, var20, var22);
							if (var9.field2126 != 0 && var7 != null) {
								var7.method4306(var2, var3, var10, var11, var9.field2143);
							}

							if (var9.field2149 != 16) {
								var23.method5353(var1, var2, var3, var9.field2149);
							}

						} else if (var6 == 4) {
							if (var9.field2148 == -1 && var9.field2166 == null) {
								var24 = var9.method3902(4, var5, var16, var18, var17, var19);
							} else {
								var24 = new Class96(var0, var4, 4, var5, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
							}

							var23.method5350(var1, var2, var3, var17, (Class280)var24, (Class280)null, field1193[var5], 0, 0, 0, var20, var22);
						} else {
							long var31;
							Object var34;
							if (var6 == 5) {
								var30 = 16;
								var31 = var23.method5278(var1, var2, var3);
								if (var31 != 0L) {
									var30 = Class197.method61(Class296.method4404(var31)).field2149;
								}

								if (var9.field2148 == -1 && var9.field2166 == null) {
									var34 = var9.method3902(4, var5, var16, var18, var17, var19);
								} else {
									var34 = new Class96(var0, var4, 4, var5, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
								}

								var23.method5350(var1, var2, var3, var17, (Class280)var34, (Class280)null, field1193[var5], 0, field1195[var5] * var30, field1196[var5] * var30, var20, var22);
							} else if (var6 == 6) {
								var30 = 8;
								var31 = var23.method5278(var1, var2, var3);
								if (var31 != 0L) {
									var30 = Class197.method61(Class296.method4404(var31)).field2149 / 2;
								}

								if (var9.field2148 == -1 && var9.field2166 == null) {
									var34 = var9.method3902(4, var5 + 4, var16, var18, var17, var19);
								} else {
									var34 = new Class96(var0, var4, 4, var5 + 4, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
								}

								var23.method5350(var1, var2, var3, var17, (Class280)var34, (Class280)null, 256, var5, field1185[var5] * var30, field1198[var5] * var30, var20, var22);
							} else if (var6 == 7) {
								var25 = var5 + 2 & 3;
								if (var9.field2148 == -1 && var9.field2166 == null) {
									var24 = var9.method3902(4, var25 + 4, var16, var18, var17, var19);
								} else {
									var24 = new Class96(var0, var4, 4, var25 + 4, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
								}

								var23.method5350(var1, var2, var3, var17, (Class280)var24, (Class280)null, 256, var25, 0, 0, var20, var22);
							} else if (var6 == 8) {
								var30 = 8;
								var31 = var23.method5278(var1, var2, var3);
								if (var31 != 0L) {
									var30 = Class197.method61(Class296.method4404(var31)).field2149 / 2;
								}

								int var29 = var5 + 2 & 3;
								Object var28;
								if (var9.field2148 == -1 && var9.field2166 == null) {
									var34 = var9.method3902(4, var5 + 4, var16, var18, var17, var19);
									var28 = var9.method3902(4, var29 + 4, var16, var18, var17, var19);
								} else {
									var34 = new Class96(var0, var4, 4, var5 + 4, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
									var28 = new Class96(var0, var4, 4, var29 + 4, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
								}

								var23.method5350(var1, var2, var3, var17, (Class280)var34, (Class280)var28, 256, var5, field1185[var5] * var30, field1198[var5] * var30, var20, var22);
							}
						}
					}
				} else {
					if (var9.field2148 == -1 && var9.field2166 == null) {
						var24 = var9.method3902(10, var5, var16, var18, var17, var19);
					} else {
						var24 = new Class96(var0, var4, 10, var5, var1, var2, var3, var9.field2148, var9.field2160, (Class280)null);
					}

					if (var24 != null && var23.method5262(var1, var2, var3, var17, var10, var11, (Class280)var24, var6 == 11 ? 256 : 0, var20, var22) && var9.field2156) {
						var25 = 15;
						if (var24 instanceof Class308) {
							var25 = ((Class308)var24).method5867() / 4;
							if (var25 > 30) {
								var25 = 30;
							}
						}

						for (int var26 = 0; var26 <= var10; ++var26) {
							for (int var27 = 0; var27 <= var11; ++var27) {
								if (var25 > field2822[var1][var2 + var26][var3 + var27]) {
									field2822[var1][var2 + var26][var3 + var27] = (byte)var25;
								}
							}
						}
					}

					if (var9.field2126 != 0 && var7 != null) {
						var7.method4306(var2, var3, var10, var11, var9.field2143);
					}

				}
			}
		}
	}

	@ObfInfo(owner = "bx", name = "au", desc = "(Lde;B)V", opaque = "1")
	public static void method888(Class83 var0) {
		int var2 = var0.field1030;
		int var3 = var0.field1018;
		int[][][] var4 = var0.field1025;
		byte[][][] var5 = var0.field1023;
		Class277 var6 = var0.field1014;
		Class224[] var7 = var0.field1015;

		int var8;
		int var9;
		int var10;
		int var11;
		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var2; ++var9) {
				for (var10 = 0; var10 < var3; ++var10) {
					if ((var0.field1023[var8][var9][var10] & 1) == 1) {
						var11 = var8;
						if ((var0.field1023[1][var9][var10] & 2) == 2) {
							var11 = var8 - 1;
						}

						if (var11 >= 0 && var7 != null) {
							var7[var11].method4321(var9, var10);
						}
					}
				}
			}
		}

		field1199 += (int)(Math.random() * 5.0D) - 2;
		if (field1199 < -8) {
			field1199 = -8;
		}

		if (field1199 > 8) {
			field1199 = 8;
		}

		field1200 += (int)(Math.random() * 5.0D) - 2;
		if (field1200 < -16) {
			field1200 = -16;
		}

		if (field1200 > 16) {
			field1200 = 16;
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
			byte[][] var51 = field2822[var8];
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
					var21 = (int)Math.sqrt((double)(var20 * var20 + var19 * var19 + 65536));
					var22 = (var19 << 8) / var21;
					var23 = 65536 / var21;
					var24 = (var20 << 8) / var21;
					var25 = (var24 * -50 + var22 * -50 + var23 * -10) / var16 + 96;
					var26 = (var51[var18][var17] >> 1) + (var51[var18][var17 + 1] >> 3) + (var51[var18][var17 - 1] >> 2) + (var51[var18 - 1][var17] >> 2) + (var51[var18 + 1][var17] >> 3);
					field1192[var18][var17] = var25 - var26;
				}
			}

			for (var17 = 0; var17 < var3; ++var17) {
				field1190[var17] = 0;
				field1191[var17] = 0;
				field34[var17] = 0;
				field1189[var17] = 0;
				field5252[var17] = 0;
			}

			for (var17 = -5; var17 < var2 + 5; ++var17) {
				for (var18 = 0; var18 < var3; ++var18) {
					var19 = var17 + 5;
					int var10002;
					if (var19 >= 0 && var19 < var2) {
						long var57 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var22 = (int)var57;
						var23 = field1186[var8][var19][var18] & var22;
						if (var23 > 0) {
							var25 = var23 - 1;
							Class191 var62 = (Class191)Class191.field2094.method6327((long)var25);
							Class191 var60;
							if (var62 != null) {
								var60 = var62;
							} else {
								byte[] var27 = field2099.method7132(1, var25);
								var62 = new Class191();
								if (var27 != null) {
									var62.method3842(new Class562(var27), var25);
								}

								var62.method3841();
								Class191.field2094.method6330(var62, (long)var25);
								var60 = var62;
							}

							var10000 = field1190;
							var10000[var18] += var60.field2097;
							var10000 = field1191;
							var10000[var18] += var60.field2098;
							var10000 = field34;
							var10000[var18] += var60.field2095;
							var10000 = field1189;
							var10000[var18] += var60.field2104;
							var10002 = field5252[var18]++;
						}
					}

					var20 = var17 - 5;
					if (var20 >= 0 && var20 < var2) {
						long var58 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var23 = (int)var58;
						var24 = field1186[var8][var20][var18] & var23;
						if (var24 > 0) {
							var26 = var24 - 1;
							Class191 var63 = (Class191)Class191.field2094.method6327((long)var26);
							Class191 var61;
							if (var63 != null) {
								var61 = var63;
							} else {
								byte[] var28 = field2099.method7132(1, var26);
								var63 = new Class191();
								if (var28 != null) {
									var63.method3842(new Class562(var28), var26);
								}

								var63.method3841();
								Class191.field2094.method6330(var63, (long)var26);
								var61 = var63;
							}

							var10000 = field1190;
							var10000[var18] -= var61.field2097;
							var10000 = field1191;
							var10000[var18] -= var61.field2098;
							var10000 = field34;
							var10000[var18] -= var61.field2095;
							var10000 = field1189;
							var10000[var18] -= var61.field2104;
							var10002 = field5252[var18]--;
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
							var18 += field1190[var24];
							var19 += field1191[var24];
							var20 += field34[var24];
							var21 += field1189[var24];
							var22 += field5252[var24];
						}

						var25 = var23 - 5;
						if (var25 >= 0 && var25 < var3) {
							var18 -= field1190[var25];
							var19 -= field1191[var25];
							var20 -= field34[var25];
							var21 -= field1189[var25];
							var22 -= field5252[var25];
						}

						if (var23 >= 1 && var23 < var3 - 1 && (!Client.field687 || (var5[0][var17][var23] & 2) != 0 || (var5[var8][var17][var23] & 16) == 0)) {
							if (var8 < field1197) {
								field1197 = var8;
							}

							long var64 = (long)Math.pow(2.0D, 15.0D) - 1L;
							int var65 = (int)var64;
							int var29 = field1186[var8][var17][var23] & var65;
							int var30 = field1187[var8][var17][var23] & var65;
							if (var29 > 0 || var30 > 0) {
								int var31 = var4[var8][var17][var23];
								int var32 = var4[var8][var17 + 1][var23];
								int var33 = var4[var8][var17 + 1][var23 + 1];
								int var34 = var4[var8][var17][var23 + 1];
								int var35 = field1192[var17][var23];
								int var36 = field1192[var17 + 1][var23];
								int var37 = field1192[var17 + 1][var23 + 1];
								int var38 = field1192[var17][var23 + 1];
								int var39 = -1;
								int var40 = -1;
								int var41;
								int var42;
								if (var29 > 0) {
									var41 = var18 * 256 / var21;
									var42 = var19 / var22;
									int var43 = var20 / var22;
									var39 = method2367(var41, var42, var43);
									var41 = field1199 + var41 & 255;
									var43 += field1200;
									if (var43 < 0) {
										var43 = 0;
									} else if (var43 > 255) {
										var43 = 255;
									}

									var40 = method2367(var41, var42, var43);
								}

								if (var8 > 0) {
									boolean var66 = true;
									if (var29 == 0 && field1188[var8][var17][var23] != 0) {
										var66 = false;
									}

									if (var30 > 0 && !Class213.method1943(var30 - 1).field2315) {
										var66 = false;
									}

									if (var66 && var31 == var32 && var31 == var33 && var31 == var34) {
										var10000 = field82[var8][var17];
										var10000[var23] |= 2340;
									}
								}

								var41 = 0;
								if (var40 != -1) {
									var41 = Class274.field2806[Class218.method4199(var40, 96)];
								}

								if (var30 == 0) {
									var6.method5311(var8, var17, var23, 0, 0, -1, var31, var32, var33, var34, Class218.method4199(var39, var35), Class218.method4199(var39, var36), Class218.method4199(var39, var37), Class218.method4199(var39, var38), 0, 0, 0, 0, var41, 0);
								} else {
									var42 = field1188[var8][var17][var23] + 1;
									byte var67 = field3989[var8][var17][var23];
									Class213 var44 = Class213.method1943(var30 - 1);
									int var45 = var44.field2307;
									int var46;
									int var47;
									int var48;
									int var49;
									if (var45 >= 0) {
										var47 = Class274.field2803.field3081.method5739(var45);
										var46 = -1;
									} else if (var44.field2309 == 16711935) {
										var46 = -2;
										var45 = -1;
										var47 = -2;
									} else {
										var46 = method2367(var44.field2311, var44.field2310, var44.field2314);
										var48 = field1199 + var44.field2311 & 255;
										var49 = field1200 + var44.field2314;
										if (var49 < 0) {
											var49 = 0;
										} else if (var49 > 255) {
											var49 = 255;
										}

										var47 = method2367(var48, var44.field2310, var49);
									}

									var48 = 0;
									if (var47 != -2) {
										var48 = Class274.field2806[method1229(var47, 96)];
									}

									if (var44.field2313 != -1) {
										var49 = field1199 + var44.field2316 & 255;
										int var50 = field1200 + var44.field2308;
										if (var50 < 0) {
											var50 = 0;
										} else if (var50 > 255) {
											var50 = 255;
										}

										var47 = method2367(var49, var44.field2317, var50);
										var48 = Class274.field2806[method1229(var47, 96)];
									}

									var6.method5311(var8, var17, var23, var42, var67, var45, var31, var32, var33, var34, Class218.method4199(var39, var35), Class218.method4199(var39, var36), Class218.method4199(var39, var37), Class218.method4199(var39, var38), method1229(var46, var35), method1229(var46, var36), method1229(var46, var37), method1229(var46, var38), var41, var48);
								}
							}
						}
					}
				}
			}

			for (var17 = 1; var17 < var3 - 1; ++var17) {
				for (var18 = 1; var18 < var2 - 1; ++var18) {
					if ((var0.field1023[var8][var18][var17] & 8) != 0) {
						var23 = 0;
					} else if (var8 > 0 && (var0.field1023[1][var18][var17] & 2) != 0) {
						var23 = var8 - 1;
					} else {
						var23 = var8;
					}

					var6.method5256(var8, var18, var17, var23);
				}
			}

			field1186[var8] = (short[][])null;
			field1187[var8] = (short[][])null;
			field1188[var8] = (byte[][])null;
			field3989[var8] = (byte[][])null;
			field2822[var8] = (byte[][])null;
		}

		var6.method5332(-50, -10, -50);

		for (var8 = 0; var8 < var2; ++var8) {
			for (var9 = 0; var9 < var3; ++var9) {
				if ((var5[1][var8][var9] & 2) == 2) {
					var6.method5254(var8, var9);
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
						short var59;
						if ((field82[var54][var56][var55] & var8) != 0) {
							var15 = var55;
							var16 = var55;
							var17 = var54;

							for (var18 = var54; var15 > 0 && (field82[var54][var56][var15 - 1] & var8) != 0; --var15) {
							}

							while (var16 < var3 && (field82[var54][var56][var16 + 1] & var8) != 0) {
								++var16;
							}

							label414:
							while (var17 > 0) {
								for (var19 = var15; var19 <= var16; ++var19) {
									if ((field82[var17 - 1][var56][var19] & var8) == 0) {
										break label414;
									}
								}

								--var17;
							}

							label403:
							while (var18 < var11) {
								for (var19 = var15; var19 <= var16; ++var19) {
									if ((field82[var18 + 1][var56][var19] & var8) == 0) {
										break label403;
									}
								}

								++var18;
							}

							var19 = (var18 + 1 - var17) * (var16 - var15 + 1);
							if (var19 >= 8) {
								var59 = 240;
								var21 = var4[var18][var56][var15] - var59;
								var22 = var4[var17][var56][var15];
								var6.method5255(var11, 1, var56 * 128, var56 * 128, var15 * 128, var16 * 128 + 128, var21, var22);

								for (var23 = var17; var23 <= var18; ++var23) {
									for (var24 = var15; var24 <= var16; ++var24) {
										var10000 = field82[var23][var56];
										var10000[var24] &= ~var8;
									}
								}
							}
						}

						if ((field82[var54][var56][var55] & var9) != 0) {
							var15 = var56;
							var16 = var56;
							var17 = var54;

							for (var18 = var54; var15 > 0 && (field82[var54][var15 - 1][var55] & var9) != 0; --var15) {
							}

							while (var16 < var2 && (field82[var54][var16 + 1][var55] & var9) != 0) {
								++var16;
							}

							label467:
							while (var17 > 0) {
								for (var19 = var15; var19 <= var16; ++var19) {
									if ((field82[var17 - 1][var19][var55] & var9) == 0) {
										break label467;
									}
								}

								--var17;
							}

							label456:
							while (var18 < var11) {
								for (var19 = var15; var19 <= var16; ++var19) {
									if ((field82[var18 + 1][var19][var55] & var9) == 0) {
										break label456;
									}
								}

								++var18;
							}

							var19 = (var18 + 1 - var17) * (var16 - var15 + 1);
							if (var19 >= 8) {
								var59 = 240;
								var21 = var4[var18][var15][var55] - var59;
								var22 = var4[var17][var15][var55];
								var6.method5255(var11, 2, var15 * 128, var16 * 128 + 128, var55 * 128, var55 * 128, var21, var22);

								for (var23 = var17; var23 <= var18; ++var23) {
									for (var24 = var15; var24 <= var16; ++var24) {
										var10000 = field82[var23][var24];
										var10000[var55] &= ~var9;
									}
								}
							}
						}

						if ((field82[var54][var56][var55] & var10) != 0) {
							var15 = var56;
							var16 = var56;
							var17 = var55;

							for (var18 = var55; var17 > 0 && (field82[var54][var56][var17 - 1] & var10) != 0; --var17) {
							}

							while (var18 < var3 && (field82[var54][var56][var18 + 1] & var10) != 0) {
								++var18;
							}

							label520:
							while (var15 > 0) {
								for (var19 = var17; var19 <= var18; ++var19) {
									if ((field82[var54][var15 - 1][var19] & var10) == 0) {
										break label520;
									}
								}

								--var15;
							}

							label509:
							while (var16 < var2) {
								for (var19 = var17; var19 <= var18; ++var19) {
									if ((field82[var54][var16 + 1][var19] & var10) == 0) {
										break label509;
									}
								}

								++var16;
							}

							if ((var16 - var15 + 1) * (var18 - var17 + 1) >= 4) {
								var19 = var4[var54][var15][var17];
								var6.method5255(var11, 4, var15 * 128, var16 * 128 + 128, var17 * 128, var18 * 128 + 128, var19, var19);

								for (var20 = var15; var20 <= var16; ++var20) {
									for (var21 = var17; var21 <= var18; ++var21) {
										var10000 = field82[var54][var20];
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

	@ObfInfo(owner = "gb", name = "ah", desc = "(IIB)I", opaque = "13")
	public static int method3351(int var0, int var1) {
		int var3 = method6475(var0 + 45365, var1 + 91923, 4) - 128 + (method6475(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (method6475(var0, var1, 1) - 128 >> 2);
		var3 = (int)((double)var3 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}

		return var3;
	}

	@ObfInfo(owner = "nf", name = "az", desc = "(IIIB)I")
	public static int method6475(int var0, int var1, int var2) {
		int var4 = var0 / var2;
		int var5 = var0 & var2 - 1;
		int var6 = var1 / var2;
		int var7 = var1 & var2 - 1;
		int var8 = method1118(var4, var6);
		int var9 = method1118(var4 + 1, var6);
		int var10 = method1118(var4, var6 + 1);
		int var11 = method1118(var4 + 1, var6 + 1);
		int var12 = method6281(var8, var9, var5, var2);
		int var13 = method6281(var10, var11, var5, var2);
		return method6281(var12, var13, var7, var2);
	}

	@ObfInfo(owner = "mh", name = "ax", desc = "(IIIII)I")
	public static int method6281(int var0, int var1, int var2, int var3) {
		int var5 = 65536 - Class274.field2805[var2 * 1024 / var3] >> 1;
		return ((65536 - var5) * var0 >> 16) + (var1 * var5 >> 16);
	}

	@ObfInfo(owner = "ca", name = "ac", desc = "(III)I")
	public static int method1118(int var0, int var1) {
		int var3 = method3597(var0 - 1, var1 - 1) + method3597(var0 + 1, var1 - 1) + method3597(var0 - 1, var1 + 1) + method3597(var0 + 1, var1 + 1);
		int var4 = method3597(var0 - 1, var1) + method3597(var0 + 1, var1) + method3597(var0, var1 - 1) + method3597(var0, var1 + 1);
		int var5 = method3597(var0, var1);
		return var5 / 4 + var3 / 16 + var4 / 8;
	}

	@ObfInfo(owner = "gv", name = "al", desc = "(III)I")
	public static int method3597(int var0, int var1) {
		int var3 = var1 * 57 + var0;
		var3 ^= var3 << 13;
		int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 255;
	}

	@ObfInfo(owner = "ci", name = "ao", desc = "(III)I", opaque = "-790321212")
	public static int method1229(int var0, int var1) {
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

			return (var0 & 65408) + var1;
		}
	}

	@ObfInfo(owner = "dh", name = "aa", desc = "(IIII)I", opaque = "1460736969")
	public static int method2367(int var0, int var1, int var2) {
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
