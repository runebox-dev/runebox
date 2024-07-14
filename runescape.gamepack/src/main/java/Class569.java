import io.runebox.ObfInfo;

@ObfInfo(name = "vw")
public class Class569 extends Class516 {
	@ObfInfo(name = "bt", desc = "[F")
	public static float[] field5506;
	@ObfInfo(name = "ar", desc = "I")
	public static int field5503;
	@ObfInfo(name = "be", desc = "I")
	public static int field5505;
	@ObfInfo(name = "bm", desc = "I")
	public static int field5507;
	@ObfInfo(name = "bo", desc = "I")
	public static int field5508;
	@ObfInfo(name = "bi", desc = "I")
	public static int field5509;
	@ObfInfo(name = "af", desc = "[I")
	public static int[] field5504;

	static {
		field5505 = 0;
		field5507 = 0;
		field5508 = 0;
		field5509 = 0;
	}

	@ObfInfo(name = "ea", desc = "([III[F)V")
	public static void method10146(int[] var0, int var1, int var2, float[] var3) {
		field5504 = var0;
		Class88.field5502 = var1;
		field5503 = var2;
		field5506 = var3;
		method10183(0, 0, var1, var2);
	}

	@ObfInfo(name = "en", desc = "()V")
	public static void method10129() {
		field5508 = 0;
		field5505 = 0;
		field5509 = Class88.field5502;
		field5507 = field5503;
	}

	@ObfInfo(name = "ez", desc = "(IIII)V")
	public static void method10183(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > Class88.field5502) {
			var2 = Class88.field5502;
		}

		if (var3 > field5503) {
			var3 = field5503;
		}

		field5508 = var0;
		field5505 = var1;
		field5509 = var2;
		field5507 = var3;
	}

	@ObfInfo(name = "eq", desc = "(IIII)V")
	public static void method10137(int var0, int var1, int var2, int var3) {
		if (field5508 < var0) {
			field5508 = var0;
		}

		if (field5505 < var1) {
			field5505 = var1;
		}

		if (field5509 > var2) {
			field5509 = var2;
		}

		if (field5507 > var3) {
			field5507 = var3;
		}

	}

	@ObfInfo(name = "er", desc = "([I)V")
	public static void method10132(int[] var0) {
		var0[0] = field5508;
		var0[1] = field5505;
		var0[2] = field5509;
		var0[3] = field5507;
	}

	@ObfInfo(name = "em", desc = "([I)V")
	public static void method10133(int[] var0) {
		field5508 = var0[0];
		field5505 = var0[1];
		field5509 = var0[2];
		field5507 = var0[3];
	}

	@ObfInfo(name = "et", desc = "()V")
	public static void method10134() {
		int var0 = 0;

		int var1;
		for (var1 = Class88.field5502 * field5503 - 7; var0 < var1; field5504[var0++] = 0) {
			field5504[var0++] = 0;
			field5504[var0++] = 0;
			field5504[var0++] = 0;
			field5504[var0++] = 0;
			field5504[var0++] = 0;
			field5504[var0++] = 0;
			field5504[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; field5504[var0++] = 0) {
		}

		method10150();
	}

	@ObfInfo(name = "ec", desc = "(IIII)V")
	public static void method10127(int var0, int var1, int var2, int var3) {
		if (var2 == 0) {
			method10156(var0, var1, var3);
		} else {
			if (var2 < 0) {
				var2 = -var2;
			}

			int var4 = var1 - var2;
			if (var4 < field5505) {
				var4 = field5505;
			}

			int var5 = var1 + var2 + 1;
			if (var5 > field5507) {
				var5 = field5507;
			}

			int var6 = var4;
			int var7 = var2 * var2;
			int var8 = 0;
			int var9 = var1 - var4;
			int var10 = var9 * var9;
			int var11 = var10 - var9;
			if (var1 > var5) {
				var1 = var5;
			}

			int var12;
			int var13;
			int var14;
			int var15;
			while (var6 < var1) {
				while (var11 <= var7 || var10 <= var7) {
					var10 += var8 + var8;
					var11 += var8++ + var8;
				}

				var12 = var0 - var8 + 1;
				if (var12 < field5508) {
					var12 = field5508;
				}

				var13 = var0 + var8;
				if (var13 > field5509) {
					var13 = field5509;
				}

				var14 = Class88.field5502 * var6 + var12;

				for (var15 = var12; var15 < var13; ++var15) {
					field5504[var14++] = var3;
				}

				++var6;
				var10 -= var9-- + var9;
				var11 -= var9 + var9;
			}

			var8 = var2;
			var9 = var6 - var1;
			var11 = var9 * var9 + var7;
			var10 = var11 - var2;

			for (var11 -= var9; var6 < var5; var10 += var9++ + var9) {
				while (var11 > var7 && var10 > var7) {
					var11 -= var8-- + var8;
					var10 -= var8 + var8;
				}

				var12 = var0 - var8;
				if (var12 < field5508) {
					var12 = field5508;
				}

				var13 = var0 + var8;
				if (var13 > field5509 - 1) {
					var13 = field5509 - 1;
				}

				var14 = Class88.field5502 * var6 + var12;

				for (var15 = var12; var15 <= var13; ++var15) {
					field5504[var14++] = var3;
				}

				++var6;
				var11 += var9 + var9;
			}

		}
	}

	@ObfInfo(name = "ep", desc = "(IIIII)V")
	public static void method10131(int var0, int var1, int var2, int var3, int var4) {
		if (var4 != 0) {
			if (var4 == 256) {
				method10127(var0, var1, var2, var3);
			} else {
				if (var2 < 0) {
					var2 = -var2;
				}

				int var5 = 256 - var4;
				int var6 = (var3 >> 16 & 255) * var4;
				int var7 = (var3 >> 8 & 255) * var4;
				int var8 = (var3 & 255) * var4;
				int var12 = var1 - var2;
				if (var12 < field5505) {
					var12 = field5505;
				}

				int var13 = var1 + var2 + 1;
				if (var13 > field5507) {
					var13 = field5507;
				}

				int var14 = var12;
				int var15 = var2 * var2;
				int var16 = 0;
				int var17 = var1 - var12;
				int var18 = var17 * var17;
				int var19 = var18 - var17;
				if (var1 > var13) {
					var1 = var13;
				}

				int var9;
				int var10;
				int var11;
				int var20;
				int var21;
				int var22;
				int var23;
				int var24;
				while (var14 < var1) {
					while (var19 <= var15 || var18 <= var15) {
						var18 += var16 + var16;
						var19 += var16++ + var16;
					}

					var20 = var0 - var16 + 1;
					if (var20 < field5508) {
						var20 = field5508;
					}

					var21 = var0 + var16;
					if (var21 > field5509) {
						var21 = field5509;
					}

					var22 = Class88.field5502 * var14 + var20;

					for (var23 = var20; var23 < var21; ++var23) {
						var9 = (field5504[var22] >> 16 & 255) * var5;
						var10 = (field5504[var22] >> 8 & 255) * var5;
						var11 = (field5504[var22] & 255) * var5;
						var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
						field5504[var22++] = var24;
					}

					++var14;
					var18 -= var17-- + var17;
					var19 -= var17 + var17;
				}

				var16 = var2;
				var17 = -var17;
				var19 = var17 * var17 + var15;
				var18 = var19 - var2;

				for (var19 -= var17; var14 < var13; var18 += var17++ + var17) {
					while (var19 > var15 && var18 > var15) {
						var19 -= var16-- + var16;
						var18 -= var16 + var16;
					}

					var20 = var0 - var16;
					if (var20 < field5508) {
						var20 = field5508;
					}

					var21 = var0 + var16;
					if (var21 > field5509 - 1) {
						var21 = field5509 - 1;
					}

					var22 = Class88.field5502 * var14 + var20;

					for (var23 = var20; var23 <= var21; ++var23) {
						var9 = (field5504[var22] >> 16 & 255) * var5;
						var10 = (field5504[var22] >> 8 & 255) * var5;
						var11 = (field5504[var22] & 255) * var5;
						var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
						field5504[var22++] = var24;
					}

					++var14;
					var19 += var17 + var17;
				}

			}
		}
	}

	@ObfInfo(name = "ed", desc = "(IIIIII)V")
	public static void method10157(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < field5508) {
			var2 -= field5508 - var0;
			var0 = field5508;
		}

		if (var1 < field5505) {
			var3 -= field5505 - var1;
			var1 = field5505;
		}

		if (var0 + var2 > field5509) {
			var2 = field5509 - var0;
		}

		if (var1 + var3 > field5507) {
			var3 = field5507 - var1;
		}

		var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 65280) * var5 >> 8 & 65280);
		int var6 = 256 - var5;
		int var7 = Class88.field5502 - var2;
		int var8 = Class88.field5502 * var1 + var0;

		for (int var9 = 0; var9 < var3; ++var9) {
			for (int var10 = -var2; var10 < 0; ++var10) {
				int var11 = field5504[var8];
				var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
				field5504[var8++] = var4 + var11;
			}

			var8 += var7;
		}

	}

	@ObfInfo(name = "ee", desc = "(IIIII)V")
	public static void method10138(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < field5508) {
			var2 -= field5508 - var0;
			var0 = field5508;
		}

		if (var1 < field5505) {
			var3 -= field5505 - var1;
			var1 = field5505;
		}

		if (var0 + var2 > field5509) {
			var2 = field5509 - var0;
		}

		if (var1 + var3 > field5507) {
			var3 = field5507 - var1;
		}

		int var5 = Class88.field5502 - var2;
		int var6 = Class88.field5502 * var1 + var0;

		for (int var7 = -var3; var7 < 0; ++var7) {
			for (int var8 = -var2; var8 < 0; ++var8) {
				field5504[var6++] = var4;
			}

			var6 += var5;
		}

	}

	@ObfInfo(name = "ey", desc = "(IIIIII)V")
	public static void method10139(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var2 > 0 && var3 > 0) {
			int var6 = 0;
			int var7 = 65536 / var3;
			if (var0 < field5508) {
				var2 -= field5508 - var0;
				var0 = field5508;
			}

			if (var1 < field5505) {
				var6 += (field5505 - var1) * var7;
				var3 -= field5505 - var1;
				var1 = field5505;
			}

			if (var0 + var2 > field5509) {
				var2 = field5509 - var0;
			}

			if (var1 + var3 > field5507) {
				var3 = field5507 - var1;
			}

			int var8 = Class88.field5502 - var2;
			int var9 = Class88.field5502 * var1 + var0;

			for (int var10 = -var3; var10 < 0; ++var10) {
				int var11 = 65536 - var6 >> 8;
				int var12 = var6 >> 8;
				int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 65280) * var11 + (var5 & 65280) * var12 & 16711680) >>> 8;

				for (int var14 = -var2; var14 < 0; ++var14) {
					field5504[var9++] = var13;
				}

				var9 += var8;
				var6 += var7;
			}

		}
	}

	@ObfInfo(name = "ef", desc = "(IIIIIIII)V")
	public static void method10140(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 > 0 && var3 > 0) {
			int var8 = 0;
			int var9 = 65536 / var3;
			if (var0 < field5508) {
				var2 -= field5508 - var0;
				var0 = field5508;
			}

			if (var1 < field5505) {
				var8 += (field5505 - var1) * var9;
				var3 -= field5505 - var1;
				var1 = field5505;
			}

			if (var0 + var2 > field5509) {
				var2 = field5509 - var0;
			}

			if (var1 + var3 > field5507) {
				var3 = field5507 - var1;
			}

			int var10 = Class88.field5502 - var2;
			int var11 = Class88.field5502 * var1 + var0;

			for (int var12 = -var3; var12 < 0; ++var12) {
				int var13 = 65536 - var8 >> 8;
				int var14 = var8 >> 8;
				int var15 = (var6 * var13 + var7 * var14 & 65280) >>> 8;
				if (var15 == 0) {
					var11 += Class88.field5502;
					var8 += var9;
				} else {
					int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & 65280) * var13 + (var5 & 65280) * var14 & 16711680) >>> 8;
					int var17 = 255 - var15;
					int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & 65280) * var15 >> 8 & 65280);

					for (int var19 = -var2; var19 < 0; ++var19) {
						int var20 = field5504[var11];
						if (var20 == 0) {
							field5504[var11++] = var18;
						} else {
							var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & 65280) * var17 >> 8 & 65280);
							field5504[var11++] = var18 + var20;
						}
					}

					var11 += var10;
					var8 += var9;
				}
			}

		}
	}

	@ObfInfo(name = "el", desc = "(IIIIII[BIZ)V")
	public static void method10141(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
		if (var0 + var2 >= 0 && var1 + var3 >= 0) {
			if (var0 < Class88.field5502 && var1 < field5503) {
				int var9 = 0;
				int var10 = 0;
				if (var0 < 0) {
					var9 -= var0;
					var2 += var0;
				}

				if (var1 < 0) {
					var10 -= var1;
					var3 += var1;
				}

				if (var0 + var2 > Class88.field5502) {
					var2 = Class88.field5502 - var0;
				}

				if (var1 + var3 > field5503) {
					var3 = field5503 - var1;
				}

				int var11 = var6.length / var7;
				int var12 = Class88.field5502 - var2;
				int var13 = var4 >>> 24;
				int var14 = var5 >>> 24;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				if (!var8 || var13 == 255 && var14 == 255) {
					var15 = (var1 + var10) * Class88.field5502 + var0 + var9;

					for (var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
						for (var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
							var18 = (var16 - var1) % var11;
							var19 = (var17 - var0) % var7;
							if (var6[var7 * var18 + var19] != 0) {
								field5504[var15++] = var5;
							} else {
								field5504[var15++] = var4;
							}
						}

						var15 += var12;
					}
				} else {
					var15 = (var1 + var10) * Class88.field5502 + var0 + var9;

					for (var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
						for (var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
							var18 = (var16 - var1) % var11;
							var19 = (var17 - var0) % var7;
							int var20 = var4;
							if (var6[var7 * var18 + var19] != 0) {
								var20 = var5;
							}

							int var21 = var20 >>> 24;
							int var22 = 255 - var21;
							int var23 = field5504[var15];
							int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & 65280) * var21 + (var23 & 65280) * var22 & 16711680) >> 8;
							field5504[var15++] = var24;
						}

						var15 += var12;
					}
				}

			}
		}
	}

	@ObfInfo(name = "ff", desc = "(IIIII)V")
	public static void method10142(int var0, int var1, int var2, int var3, int var4) {
		method10128(var0, var1, var2, var4);
		method10128(var0, var1 + var3 - 1, var2, var4);
		method10182(var0, var1, var3, var4);
		method10182(var0 + var2 - 1, var1, var3, var4);
	}

	@ObfInfo(name = "fw", desc = "(IIIIII)V")
	public static void method10143(int var0, int var1, int var2, int var3, int var4, int var5) {
		method10145(var0, var1, var2, var4, var5);
		method10145(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			method10147(var0, var1 + 1, var3 - 2, var4, var5);
			method10147(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	@ObfInfo(name = "fv", desc = "(IIII)V")
	public static void method10128(int var0, int var1, int var2, int var3) {
		if (var1 >= field5505 && var1 < field5507) {
			if (var0 < field5508) {
				var2 -= field5508 - var0;
				var0 = field5508;
			}

			if (var0 + var2 > field5509) {
				var2 = field5509 - var0;
			}

			int var4 = Class88.field5502 * var1 + var0;

			for (int var5 = 0; var5 < var2; ++var5) {
				field5504[var4 + var5] = var3;
			}

		}
	}

	@ObfInfo(name = "fh", desc = "(IIIII)V")
	public static void method10145(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= field5505 && var1 < field5507) {
			if (var0 < field5508) {
				var2 -= field5508 - var0;
				var0 = field5508;
			}

			if (var0 + var2 > field5509) {
				var2 = field5509 - var0;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = Class88.field5502 * var1 + var0;

			for (int var13 = 0; var13 < var2; ++var13) {
				int var9 = (field5504[var12] >> 16 & 255) * var5;
				int var10 = (field5504[var12] >> 8 & 255) * var5;
				int var11 = (field5504[var12] & 255) * var5;
				int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
				field5504[var12++] = var14;
			}

		}
	}

	@ObfInfo(name = "fg", desc = "(IIII)V")
	public static void method10182(int var0, int var1, int var2, int var3) {
		if (var0 >= field5508 && var0 < field5509) {
			if (var1 < field5505) {
				var2 -= field5505 - var1;
				var1 = field5505;
			}

			if (var1 + var2 > field5507) {
				var2 = field5507 - var1;
			}

			int var4 = Class88.field5502 * var1 + var0;

			for (int var5 = 0; var5 < var2; ++var5) {
				field5504[Class88.field5502 * var5 + var4] = var3;
			}

		}
	}

	@ObfInfo(name = "fd", desc = "(IIIII)V")
	public static void method10147(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= field5508 && var0 < field5509) {
			if (var1 < field5505) {
				var2 -= field5505 - var1;
				var1 = field5505;
			}

			if (var1 + var2 > field5507) {
				var2 = field5507 - var1;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = Class88.field5502 * var1 + var0;

			for (int var13 = 0; var13 < var2; ++var13) {
				int var9 = (field5504[var12] >> 16 & 255) * var5;
				int var10 = (field5504[var12] >> 8 & 255) * var5;
				int var11 = (field5504[var12] & 255) * var5;
				int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
				field5504[var12] = var14;
				var12 += Class88.field5502;
			}

		}
	}

	@ObfInfo(name = "fi", desc = "(IIIII)V")
	public static void method10148(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				method10128(var0, var1, var2 + 1, var4);
			} else {
				method10128(var0 + var2, var1, -var2 + 1, var4);
			}

		} else if (var2 == 0) {
			if (var3 >= 0) {
				method10182(var0, var1, var3 + 1, var4);
			} else {
				method10182(var0, var1 + var3, -var3 + 1, var4);
			}

		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += 32768;
				var3 <<= 16;
				var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
				var2 += var0;
				if (var0 < field5508) {
					var1 += (field5508 - var0) * var5;
					var0 = field5508;
				}

				if (var2 >= field5509) {
					var2 = field5509 - 1;
				}

				while (var0 <= var2) {
					var6 = var1 >> 16;
					if (var6 >= field5505 && var6 < field5507) {
						field5504[Class88.field5502 * var6 + var0] = var4;
					}

					var1 += var5;
					++var0;
				}
			} else {
				var0 <<= 16;
				var0 += 32768;
				var2 <<= 16;
				var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
				var3 += var1;
				if (var1 < field5505) {
					var0 += (field5505 - var1) * var5;
					var1 = field5505;
				}

				if (var3 >= field5507) {
					var3 = field5507 - 1;
				}

				while (var1 <= var3) {
					var6 = var0 >> 16;
					if (var6 >= field5508 && var6 < field5509) {
						field5504[Class88.field5502 * var1 + var6] = var4;
					}

					var0 += var5;
					++var1;
				}
			}

		}
	}

	@ObfInfo(name = "fb", desc = "(III)V")
	public static void method10156(int var0, int var1, int var2) {
		if (var0 >= field5508 && var1 >= field5505 && var0 < field5509 && var1 < field5507) {
			field5504[Class88.field5502 * var1 + var0] = var2;
		}
	}

	@ObfInfo(name = "fp", desc = "(III[I[I)V")
	public static void method10149(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = Class88.field5502 * var1 + var0;

		for (var1 = 0; var1 < var3.length; ++var1) {
			int var6 = var3[var1] + var5;

			for (var0 = -var4[var1]; var0 < 0; ++var0) {
				field5504[var6++] = var2;
			}

			var5 += Class88.field5502;
		}

	}

	@ObfInfo(name = "fe", desc = "()V")
	public static void method10150() {
		if (field5506 != null) {
			int var0;
			int var1;
			int var2;
			if (field5508 == 0 && Class88.field5502 == field5509 && field5505 == 0 && field5507 == field5503) {
				var0 = field5506.length;
				var1 = var0 - (var0 & 7);

				for (var2 = 0; var2 < var1; field5506[var2++] = 0.0F) {
					field5506[var2++] = 0.0F;
					field5506[var2++] = 0.0F;
					field5506[var2++] = 0.0F;
					field5506[var2++] = 0.0F;
					field5506[var2++] = 0.0F;
					field5506[var2++] = 0.0F;
					field5506[var2++] = 0.0F;
				}

				while (var2 < var0) {
					field5506[var2++] = 0.0F;
				}
			} else {
				var0 = field5509 - field5508;
				var1 = field5507 - field5505;
				var2 = Class88.field5502 - var0;
				int var3 = Class88.field5502 * field5505 + field5508;
				int var4 = var0 >> 3;
				int var5 = var0 & 7;
				var0 = var3 - 1;

				for (int var7 = -var1; var7 < 0; ++var7) {
					int var6;
					if (var4 > 0) {
						var6 = var4;

						do {
							++var0;
							field5506[var0] = 0.0F;
							++var0;
							field5506[var0] = 0.0F;
							++var0;
							field5506[var0] = 0.0F;
							++var0;
							field5506[var0] = 0.0F;
							++var0;
							field5506[var0] = 0.0F;
							++var0;
							field5506[var0] = 0.0F;
							++var0;
							field5506[var0] = 0.0F;
							++var0;
							field5506[var0] = 0.0F;
							--var6;
						} while(var6 > 0);
					}

					if (var5 > 0) {
						var6 = var5;

						do {
							++var0;
							field5506[var0] = 0.0F;
							--var6;
						} while(var6 > 0);
					}

					var0 += var2;
				}
			}

		}
	}

	@ObfInfo(name = "fl", desc = "()V")
	public static void method10151() {
		if (field5506 != null) {
			int var0 = field5506.length;

			for (int var1 = 0; var1 < var0; ++var1) {
				if (var1 % Class88.field5502 < Class88.field5502 / 2 && field5506[var1] > 0.0F) {
					float var3 = field5506[var1];
					float var4 = 75.0F;
					float var5 = 10000.0F;
					float var6 = 750000.0F / (10000.0F - var3 * 9925.0F);
					float var2 = (var6 - 75.0F) / 9925.0F;
					int var7 = (int)(var2 * 255.0F);
					field5504[var1] = var7 << 16 | var7 << 8 | var7;
				}
			}

		}
	}
}
