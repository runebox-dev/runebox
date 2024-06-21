import io.runebox.ObfInfo;

@ObfInfo(name = "vp")
public class Class561 extends Class507 {
	@ObfInfo(name = "bs", desc = "[F")
	public static float[] field5421;
	@ObfInfo(name = "bi", desc = "I")
	public static int field5419;
	@ObfInfo(name = "ag", desc = "I")
	public static int field5420;
	@ObfInfo(name = "bo", desc = "I")
	public static int field5422;
	@ObfInfo(name = "bt", desc = "I")
	public static int field5424;
	@ObfInfo(name = "bn", desc = "I")
	public static int field5425;
	@ObfInfo(name = "am", desc = "[I")
	public static int[] field5418;

	static {
		field5422 = 0;
		field5419 = 0;
		field5424 = 0;
		field5425 = 0;
	}

	@ObfInfo(name = "ed", desc = "([III[F)V")
	public static void method10142(int[] var0, int var1, int var2, float[] var3) {
		field5418 = var0;
		Class87.field5423 = var1;
		field5420 = var2;
		field5421 = var3;
		method10144(0, 0, var1, var2);
	}

	@ObfInfo(name = "es", desc = "()V")
	public static void method10143() {
		field5424 = 0;
		field5422 = 0;
		field5425 = Class87.field5423;
		field5419 = field5420;
	}

	@ObfInfo(name = "ef", desc = "(IIII)V")
	public static void method10144(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > Class87.field5423) {
			var2 = Class87.field5423;
		}

		if (var3 > field5420) {
			var3 = field5420;
		}

		field5424 = var0;
		field5422 = var1;
		field5425 = var2;
		field5419 = var3;
	}

	@ObfInfo(name = "ex", desc = "(IIII)V")
	public static void method10153(int var0, int var1, int var2, int var3) {
		if (field5424 < var0) {
			field5424 = var0;
		}

		if (field5422 < var1) {
			field5422 = var1;
		}

		if (field5425 > var2) {
			field5425 = var2;
		}

		if (field5419 > var3) {
			field5419 = var3;
		}

	}

	@ObfInfo(name = "el", desc = "([I)V")
	public static void method10195(int[] var0) {
		var0[0] = field5424;
		var0[1] = field5422;
		var0[2] = field5425;
		var0[3] = field5419;
	}

	@ObfInfo(name = "eb", desc = "([I)V")
	public static void method10147(int[] var0) {
		field5424 = var0[0];
		field5422 = var0[1];
		field5425 = var0[2];
		field5419 = var0[3];
	}

	@ObfInfo(name = "ep", desc = "()V")
	public static void method10160() {
		int var0 = 0;

		int var1;
		for (var1 = Class87.field5423 * field5420 - 7; var0 < var1; field5418[var0++] = 0) {
			field5418[var0++] = 0;
			field5418[var0++] = 0;
			field5418[var0++] = 0;
			field5418[var0++] = 0;
			field5418[var0++] = 0;
			field5418[var0++] = 0;
			field5418[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; field5418[var0++] = 0) {
		}

		method10165();
	}

	@ObfInfo(name = "ea", desc = "(IIII)V")
	public static void method10149(int var0, int var1, int var2, int var3) {
		if (var2 == 0) {
			method10163(var0, var1, var3);
		} else {
			if (var2 < 0) {
				var2 = -var2;
			}

			int var4 = var1 - var2;
			if (var4 < field5422) {
				var4 = field5422;
			}

			int var5 = var2 + var1 + 1;
			if (var5 > field5419) {
				var5 = field5419;
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
				if (var12 < field5424) {
					var12 = field5424;
				}

				var13 = var8 + var0;
				if (var13 > field5425) {
					var13 = field5425;
				}

				var14 = var12 + Class87.field5423 * var6;

				for (var15 = var12; var15 < var13; ++var15) {
					field5418[var14++] = var3;
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
				if (var12 < field5424) {
					var12 = field5424;
				}

				var13 = var8 + var0;
				if (var13 > field5425 - 1) {
					var13 = field5425 - 1;
				}

				var14 = var12 + Class87.field5423 * var6;

				for (var15 = var12; var15 <= var13; ++var15) {
					field5418[var14++] = var3;
				}

				++var6;
				var11 += var9 + var9;
			}

		}
	}

	@ObfInfo(name = "ey", desc = "(IIIII)V")
	public static void method10150(int var0, int var1, int var2, int var3, int var4) {
		if (var4 != 0) {
			if (var4 == 256) {
				method10149(var0, var1, var2, var3);
			} else {
				if (var2 < 0) {
					var2 = -var2;
				}

				int var5 = 256 - var4;
				int var6 = (var3 >> 16 & 255) * var4;
				int var7 = (var3 >> 8 & 255) * var4;
				int var8 = (var3 & 255) * var4;
				int var12 = var1 - var2;
				if (var12 < field5422) {
					var12 = field5422;
				}

				int var13 = var2 + var1 + 1;
				if (var13 > field5419) {
					var13 = field5419;
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
					if (var20 < field5424) {
						var20 = field5424;
					}

					var21 = var16 + var0;
					if (var21 > field5425) {
						var21 = field5425;
					}

					var22 = var20 + Class87.field5423 * var14;

					for (var23 = var20; var23 < var21; ++var23) {
						var9 = (field5418[var22] >> 16 & 255) * var5;
						var10 = (field5418[var22] >> 8 & 255) * var5;
						var11 = (field5418[var22] & 255) * var5;
						var24 = (var9 + var6 >> 8 << 16) + (var10 + var7 >> 8 << 8) + (var11 + var8 >> 8);
						field5418[var22++] = var24;
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
					if (var20 < field5424) {
						var20 = field5424;
					}

					var21 = var16 + var0;
					if (var21 > field5425 - 1) {
						var21 = field5425 - 1;
					}

					var22 = var20 + Class87.field5423 * var14;

					for (var23 = var20; var23 <= var21; ++var23) {
						var9 = (field5418[var22] >> 16 & 255) * var5;
						var10 = (field5418[var22] >> 8 & 255) * var5;
						var11 = (field5418[var22] & 255) * var5;
						var24 = (var9 + var6 >> 8 << 16) + (var10 + var7 >> 8 << 8) + (var11 + var8 >> 8);
						field5418[var22++] = var24;
					}

					++var14;
					var19 += var17 + var17;
				}

			}
		}
	}

	@ObfInfo(name = "er", desc = "(IIIIII)V")
	public static void method10151(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < field5424) {
			var2 -= field5424 - var0;
			var0 = field5424;
		}

		if (var1 < field5422) {
			var3 -= field5422 - var1;
			var1 = field5422;
		}

		if (var2 + var0 > field5425) {
			var2 = field5425 - var0;
		}

		if (var3 + var1 > field5419) {
			var3 = field5419 - var1;
		}

		var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 65280) * var5 >> 8 & 65280);
		int var6 = 256 - var5;
		int var7 = Class87.field5423 - var2;
		int var8 = var0 + Class87.field5423 * var1;

		for (int var9 = 0; var9 < var3; ++var9) {
			for (int var10 = -var2; var10 < 0; ++var10) {
				int var11 = field5418[var8];
				var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
				field5418[var8++] = var11 + var4;
			}

			var8 += var7;
		}

	}

	@ObfInfo(name = "ew", desc = "(IIIII)V")
	public static void method10152(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < field5424) {
			var2 -= field5424 - var0;
			var0 = field5424;
		}

		if (var1 < field5422) {
			var3 -= field5422 - var1;
			var1 = field5422;
		}

		if (var2 + var0 > field5425) {
			var2 = field5425 - var0;
		}

		if (var3 + var1 > field5419) {
			var3 = field5419 - var1;
		}

		int var5 = Class87.field5423 - var2;
		int var6 = var0 + Class87.field5423 * var1;

		for (int var7 = -var3; var7 < 0; ++var7) {
			for (int var8 = -var2; var8 < 0; ++var8) {
				field5418[var6++] = var4;
			}

			var6 += var5;
		}

	}

	@ObfInfo(name = "ec", desc = "(IIIIII)V")
	public static void method10221(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var2 > 0 && var3 > 0) {
			int var6 = 0;
			int var7 = 65536 / var3;
			if (var0 < field5424) {
				var2 -= field5424 - var0;
				var0 = field5424;
			}

			if (var1 < field5422) {
				var6 += (field5422 - var1) * var7;
				var3 -= field5422 - var1;
				var1 = field5422;
			}

			if (var2 + var0 > field5425) {
				var2 = field5425 - var0;
			}

			if (var3 + var1 > field5419) {
				var3 = field5419 - var1;
			}

			int var8 = Class87.field5423 - var2;
			int var9 = var0 + Class87.field5423 * var1;

			for (int var10 = -var3; var10 < 0; ++var10) {
				int var11 = 65536 - var6 >> 8;
				int var12 = var6 >> 8;
				int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 65280) * var11 + (var5 & 65280) * var12 & 16711680) >>> 8;

				for (int var14 = -var2; var14 < 0; ++var14) {
					field5418[var9++] = var13;
				}

				var9 += var8;
				var6 += var7;
			}

		}
	}

	@ObfInfo(name = "eu", desc = "(IIIIIIII)V")
	public static void method10162(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 > 0 && var3 > 0) {
			int var8 = 0;
			int var9 = 65536 / var3;
			if (var0 < field5424) {
				var2 -= field5424 - var0;
				var0 = field5424;
			}

			if (var1 < field5422) {
				var8 += (field5422 - var1) * var9;
				var3 -= field5422 - var1;
				var1 = field5422;
			}

			if (var2 + var0 > field5425) {
				var2 = field5425 - var0;
			}

			if (var3 + var1 > field5419) {
				var3 = field5419 - var1;
			}

			int var10 = Class87.field5423 - var2;
			int var11 = var0 + Class87.field5423 * var1;

			for (int var12 = -var3; var12 < 0; ++var12) {
				int var13 = 65536 - var8 >> 8;
				int var14 = var8 >> 8;
				int var15 = (var13 * var6 + var14 * var7 & 65280) >>> 8;
				if (var15 == 0) {
					var11 += Class87.field5423;
					var8 += var9;
				} else {
					int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & 65280) * var13 + (var5 & 65280) * var14 & 16711680) >>> 8;
					int var17 = 255 - var15;
					int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & 65280) * var15 >> 8 & 65280);

					for (int var19 = -var2; var19 < 0; ++var19) {
						int var20 = field5418[var11];
						if (var20 == 0) {
							field5418[var11++] = var18;
						} else {
							var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & 65280) * var17 >> 8 & 65280);
							field5418[var11++] = var20 + var18;
						}
					}

					var11 += var10;
					var8 += var9;
				}
			}

		}
	}

	@ObfInfo(name = "et", desc = "(IIIIII[BIZ)V")
	public static void method10141(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
		if (var2 + var0 >= 0 && var3 + var1 >= 0) {
			if (var0 < Class87.field5423 && var1 < field5420) {
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

				if (var2 + var0 > Class87.field5423) {
					var2 = Class87.field5423 - var0;
				}

				if (var3 + var1 > field5420) {
					var3 = field5420 - var1;
				}

				int var11 = var6.length / var7;
				int var12 = Class87.field5423 - var2;
				int var13 = var4 >>> 24;
				int var14 = var5 >>> 24;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				if (!var8 || var13 == 255 && var14 == 255) {
					var15 = (var10 + var1) * Class87.field5423 + var0 + var9;

					for (var16 = var10 + var1; var16 < var10 + var1 + var3; ++var16) {
						for (var17 = var9 + var0; var17 < var9 + var0 + var2; ++var17) {
							var18 = (var16 - var1) % var11;
							var19 = (var17 - var0) % var7;
							if (var6[var18 * var7 + var19] != 0) {
								field5418[var15++] = var5;
							} else {
								field5418[var15++] = var4;
							}
						}

						var15 += var12;
					}
				} else {
					var15 = (var10 + var1) * Class87.field5423 + var0 + var9;

					for (var16 = var10 + var1; var16 < var10 + var1 + var3; ++var16) {
						for (var17 = var9 + var0; var17 < var9 + var0 + var2; ++var17) {
							var18 = (var16 - var1) % var11;
							var19 = (var17 - var0) % var7;
							int var20 = var4;
							if (var6[var18 * var7 + var19] != 0) {
								var20 = var5;
							}

							int var21 = var20 >>> 24;
							int var22 = 255 - var21;
							int var23 = field5418[var15];
							int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & 65280) * var21 + (var23 & 65280) * var22 & 16711680) >> 8;
							field5418[var15++] = var24;
						}

						var15 += var12;
					}
				}

			}
		}
	}

	@ObfInfo(name = "ek", desc = "(IIIII)V")
	public static void method10156(int var0, int var1, int var2, int var3, int var4) {
		method10200(var0, var1, var2, var4);
		method10200(var0, var3 + var1 - 1, var2, var4);
		method10185(var0, var1, var3, var4);
		method10185(var2 + var0 - 1, var1, var3, var4);
	}

	@ObfInfo(name = "eg", desc = "(IIIIII)V")
	public static void method10157(int var0, int var1, int var2, int var3, int var4, int var5) {
		method10159(var0, var1, var2, var4, var5);
		method10159(var0, var3 + var1 - 1, var2, var4, var5);
		if (var3 >= 3) {
			method10161(var0, var1 + 1, var3 - 2, var4, var5);
			method10161(var2 + var0 - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	@ObfInfo(name = "eq", desc = "(IIII)V")
	public static void method10200(int var0, int var1, int var2, int var3) {
		if (var1 >= field5422 && var1 < field5419) {
			if (var0 < field5424) {
				var2 -= field5424 - var0;
				var0 = field5424;
			}

			if (var2 + var0 > field5425) {
				var2 = field5425 - var0;
			}

			int var4 = var0 + Class87.field5423 * var1;

			for (int var5 = 0; var5 < var2; ++var5) {
				field5418[var5 + var4] = var3;
			}

		}
	}

	@ObfInfo(name = "ee", desc = "(IIIII)V")
	public static void method10159(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= field5422 && var1 < field5419) {
			if (var0 < field5424) {
				var2 -= field5424 - var0;
				var0 = field5424;
			}

			if (var2 + var0 > field5425) {
				var2 = field5425 - var0;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = var0 + Class87.field5423 * var1;

			for (int var13 = 0; var13 < var2; ++var13) {
				int var9 = (field5418[var12] >> 16 & 255) * var5;
				int var10 = (field5418[var12] >> 8 & 255) * var5;
				int var11 = (field5418[var12] & 255) * var5;
				int var14 = (var9 + var6 >> 8 << 16) + (var10 + var7 >> 8 << 8) + (var11 + var8 >> 8);
				field5418[var12++] = var14;
			}

		}
	}

	@ObfInfo(name = "eo", desc = "(IIII)V")
	public static void method10185(int var0, int var1, int var2, int var3) {
		if (var0 >= field5424 && var0 < field5425) {
			if (var1 < field5422) {
				var2 -= field5422 - var1;
				var1 = field5422;
			}

			if (var2 + var1 > field5419) {
				var2 = field5419 - var1;
			}

			int var4 = var0 + Class87.field5423 * var1;

			for (int var5 = 0; var5 < var2; ++var5) {
				field5418[var4 + Class87.field5423 * var5] = var3;
			}

		}
	}

	@ObfInfo(name = "ez", desc = "(IIIII)V")
	public static void method10161(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= field5424 && var0 < field5425) {
			if (var1 < field5422) {
				var2 -= field5422 - var1;
				var1 = field5422;
			}

			if (var2 + var1 > field5419) {
				var2 = field5419 - var1;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = var0 + Class87.field5423 * var1;

			for (int var13 = 0; var13 < var2; ++var13) {
				int var9 = (field5418[var12] >> 16 & 255) * var5;
				int var10 = (field5418[var12] >> 8 & 255) * var5;
				int var11 = (field5418[var12] & 255) * var5;
				int var14 = (var9 + var6 >> 8 << 16) + (var10 + var7 >> 8 << 8) + (var11 + var8 >> 8);
				field5418[var12] = var14;
				var12 += Class87.field5423;
			}

		}
	}

	@ObfInfo(name = "fh", desc = "(IIIII)V")
	public static void method10220(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				method10200(var0, var1, var2 + 1, var4);
			} else {
				method10200(var2 + var0, var1, -var2 + 1, var4);
			}

		} else if (var2 == 0) {
			if (var3 >= 0) {
				method10185(var0, var1, var3 + 1, var4);
			} else {
				method10185(var0, var3 + var1, -var3 + 1, var4);
			}

		} else {
			if (var3 + var2 < 0) {
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
				if (var0 < field5424) {
					var1 += var5 * (field5424 - var0);
					var0 = field5424;
				}

				if (var2 >= field5425) {
					var2 = field5425 - 1;
				}

				while (var0 <= var2) {
					var6 = var1 >> 16;
					if (var6 >= field5422 && var6 < field5419) {
						field5418[var0 + Class87.field5423 * var6] = var4;
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
				if (var1 < field5422) {
					var0 += var5 * (field5422 - var1);
					var1 = field5422;
				}

				if (var3 >= field5419) {
					var3 = field5419 - 1;
				}

				while (var1 <= var3) {
					var6 = var0 >> 16;
					if (var6 >= field5424 && var6 < field5425) {
						field5418[var6 + Class87.field5423 * var1] = var4;
					}

					var0 += var5;
					++var1;
				}
			}

		}
	}

	@ObfInfo(name = "fk", desc = "(III)V")
	public static void method10163(int var0, int var1, int var2) {
		if (var0 >= field5424 && var1 >= field5422 && var0 < field5425 && var1 < field5419) {
			field5418[var0 + Class87.field5423 * var1] = var2;
		}
	}

	@ObfInfo(name = "fy", desc = "(III[I[I)V")
	public static void method10164(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + Class87.field5423 * var1;

		for (var1 = 0; var1 < var3.length; ++var1) {
			int var6 = var5 + var3[var1];

			for (var0 = -var4[var1]; var0 < 0; ++var0) {
				field5418[var6++] = var2;
			}

			var5 += Class87.field5423;
		}

	}

	@ObfInfo(name = "fm", desc = "()V")
	public static void method10165() {
		if (field5421 != null) {
			int var0;
			int var1;
			int var2;
			if (field5424 == 0 && field5425 == Class87.field5423 && field5422 == 0 && field5419 == field5420) {
				var0 = field5421.length;
				var1 = var0 - (var0 & 7);

				for (var2 = 0; var2 < var1; field5421[var2++] = 0.0F) {
					field5421[var2++] = 0.0F;
					field5421[var2++] = 0.0F;
					field5421[var2++] = 0.0F;
					field5421[var2++] = 0.0F;
					field5421[var2++] = 0.0F;
					field5421[var2++] = 0.0F;
					field5421[var2++] = 0.0F;
				}

				while (var2 < var0) {
					field5421[var2++] = 0.0F;
				}
			} else {
				var0 = field5425 - field5424;
				var1 = field5419 - field5422;
				var2 = Class87.field5423 - var0;
				int var3 = field5424 + field5422 * Class87.field5423;
				int var4 = var0 >> 3;
				int var5 = var0 & 7;
				var0 = var3 - 1;

				for (int var7 = -var1; var7 < 0; ++var7) {
					int var6;
					if (var4 > 0) {
						var6 = var4;

						do {
							++var0;
							field5421[var0] = 0.0F;
							++var0;
							field5421[var0] = 0.0F;
							++var0;
							field5421[var0] = 0.0F;
							++var0;
							field5421[var0] = 0.0F;
							++var0;
							field5421[var0] = 0.0F;
							++var0;
							field5421[var0] = 0.0F;
							++var0;
							field5421[var0] = 0.0F;
							++var0;
							field5421[var0] = 0.0F;
							--var6;
						} while(var6 > 0);
					}

					if (var5 > 0) {
						var6 = var5;

						do {
							++var0;
							field5421[var0] = 0.0F;
							--var6;
						} while(var6 > 0);
					}

					var0 += var2;
				}
			}

		}
	}

	@ObfInfo(name = "fr", desc = "()V")
	public static void method10166() {
		if (field5421 != null) {
			int var0 = field5421.length;

			for (int var1 = 0; var1 < var0; ++var1) {
				if (var1 % Class87.field5423 < Class87.field5423 / 2 && field5421[var1] > 0.0F) {
					int var2 = (int)(255.0F * Class300.method5999(field5421[var1]));
					field5418[var1] = var2 << 16 | var2 << 8 | var2;
				}
			}

		}
	}
}
