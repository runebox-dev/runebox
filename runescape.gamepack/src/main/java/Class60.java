import io.runebox.ObfInfo;
import java.util.Random;

@ObfInfo(name = "ch")
public class Class60 {
	@ObfInfo(name = "aa", desc = "[I")
	public static int[] field433;
	@ObfInfo(name = "aw", desc = "[I")
	public static int[] field436;
	@ObfInfo(name = "ay", desc = "[I")
	public static int[] field449;
	@ObfInfo(name = "ao", desc = "[I")
	public static int[] field450;
	@ObfInfo(name = "af", desc = "[I")
	public static int[] field452;
	@ObfInfo(name = "at", desc = "[I")
	public static int[] field454;
	@ObfInfo(name = "am", desc = "[I")
	public static int[] field456;
	@ObfInfo(name = "ar", desc = "[I")
	public static int[] field457;
	@ObfInfo(name = "ag", desc = "Lbb;")
	public Class28 field434;
	@ObfInfo(name = "ak", desc = "Lbb;")
	public Class28 field435;
	@ObfInfo(name = "an", desc = "Lbb;")
	public Class28 field437;
	@ObfInfo(name = "aj", desc = "Lbb;")
	public Class28 field438;
	@ObfInfo(name = "aq", desc = "Lbb;")
	public Class28 field441;
	@ObfInfo(name = "ad", desc = "Lbb;")
	public Class28 field445;
	@ObfInfo(name = "ax", desc = "Lbb;")
	public Class28 field446;
	@ObfInfo(name = "ap", desc = "Lbb;")
	public Class28 field447;
	@ObfInfo(name = "av", desc = "Lbb;")
	public Class28 field455;
	@ObfInfo(name = "az", desc = "Lcn;")
	public Class66 field453;
	@ObfInfo(name = "ac", desc = "I")
	public int field432;
	@ObfInfo(name = "au", desc = "I")
	public int field443;
	@ObfInfo(name = "ah", desc = "I")
	public int field444;
	@ObfInfo(name = "al", desc = "I")
	public int field448;
	@ObfInfo(name = "ai", desc = "[I")
	public int[] field439;
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field440;
	@ObfInfo(name = "ae", desc = "[I")
	public int[] field442;

	static {
		field450 = new int[32768];
		Random var0 = new Random(0L);

		int var1;
		for (var1 = 0; var1 < 32768; ++var1) {
			field450[var1] = (var0.nextInt() & 2) - 1;
		}

		field433 = new int[32768];

		for (var1 = 0; var1 < 32768; ++var1) {
			field433[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
		}

		field449 = new int[220500];
		field436 = new int[5];
		field454 = new int[5];
		field452 = new int[5];
		field456 = new int[5];
		field457 = new int[5];
	}

	public Class60() {
		this.field440 = new int[]{0, 0, 0, 0, 0};
		this.field439 = new int[]{0, 0, 0, 0, 0};
		this.field442 = new int[]{0, 0, 0, 0, 0};
		this.field443 = 0;
		this.field444 = 100;
		this.field432 = 500;
		this.field448 = 0;
	}

	@ObfInfo(name = "aq", desc = "(II)[I")
	public final int[] method1198(int var1, int var2) {
		Class458.method8428(field449, 0, var1);
		if (var2 < 10) {
			return field449;
		} else {
			double var3 = (double)var1 / ((double)var2 + 0.0D);
			this.field441.method405();
			this.field445.method405();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (this.field434 != null) {
				this.field434.method405();
				this.field435.method405();
				var5 = (int)((double)(this.field434.field126 - this.field434.field127) * 32.768D / var3);
				var6 = (int)((double)this.field434.field127 * 32.768D / var3);
			}

			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			if (this.field447 != null) {
				this.field447.method405();
				this.field437.method405();
				var8 = (int)((double)(this.field447.field126 - this.field447.field127) * 32.768D / var3);
				var9 = (int)((double)this.field447.field127 * 32.768D / var3);
			}

			int var11;
			for (var11 = 0; var11 < 5; ++var11) {
				if (this.field440[var11] != 0) {
					field436[var11] = 0;
					field454[var11] = (int)((double)this.field442[var11] * var3);
					field452[var11] = (this.field440[var11] << 14) / 100;
					field456[var11] = (int)((double)(this.field441.field126 - this.field441.field127) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field439[var11]) / var3);
					field457[var11] = (int)((double)this.field441.field127 * 32.768D / var3);
				}
			}

			int var12;
			int var13;
			int var14;
			int var15;
			int[] var10000;
			for (var11 = 0; var11 < var1; ++var11) {
				var12 = this.field441.method408(var1);
				var13 = this.field445.method408(var1);
				if (this.field434 != null) {
					var14 = this.field434.method408(var1);
					var15 = this.field435.method408(var1);
					var12 += this.method1207(var7, var15, this.field434.field125) >> 1;
					var7 += (var14 * var5 >> 16) + var6;
				}

				if (this.field447 != null) {
					var14 = this.field447.method408(var1);
					var15 = this.field437.method408(var1);
					var13 = var13 * ((this.method1207(var10, var15, this.field447.field125) >> 1) + 32768) >> 15;
					var10 += (var14 * var8 >> 16) + var9;
				}

				for (var14 = 0; var14 < 5; ++var14) {
					if (this.field440[var14] != 0) {
						var15 = var11 + field454[var14];
						if (var15 < var1) {
							var10000 = field449;
							var10000[var15] += this.method1207(field436[var14], var13 * field452[var14] >> 15, this.field441.field125);
							var10000 = field436;
							var10000[var14] += (var12 * field456[var14] >> 16) + field457[var14];
						}
					}
				}
			}

			int var16;
			if (this.field438 != null) {
				this.field438.method405();
				this.field455.method405();
				var11 = 0;
				boolean var19 = false;
				boolean var20 = true;

				for (var14 = 0; var14 < var1; ++var14) {
					var15 = this.field438.method408(var1);
					var16 = this.field455.method408(var1);
					if (var20) {
						var12 = this.field438.field127 + ((this.field438.field126 - this.field438.field127) * var15 >> 8);
					} else {
						var12 = this.field438.field127 + ((this.field438.field126 - this.field438.field127) * var16 >> 8);
					}

					var11 += 256;
					if (var11 >= var12) {
						var11 = 0;
						var20 = !var20;
					}

					if (var20) {
						field449[var14] = 0;
					}
				}
			}

			if (this.field443 > 0 && this.field444 > 0) {
				var11 = (int)((double)this.field443 * var3);

				for (var12 = var11; var12 < var1; ++var12) {
					var10000 = field449;
					var10000[var12] += field449[var12 - var11] * this.field444 / 100;
				}
			}

			if (this.field453.field848[0] > 0 || this.field453.field848[1] > 0) {
				this.field446.method405();
				var11 = this.field446.method408(var1 + 1);
				var12 = this.field453.method1920(0, (float)var11 / 65536.0F);
				var13 = this.field453.method1920(1, (float)var11 / 65536.0F);
				if (var1 >= var13 + var12) {
					var14 = 0;
					var15 = var13;
					if (var13 > var1 - var12) {
						var15 = var1 - var12;
					}

					int var17;
					while (var14 < var15) {
						var16 = (int)((long)field449[var14 + var12] * (long)Class66.field845 >> 16);

						for (var17 = 0; var17 < var12; ++var17) {
							var16 += (int)((long)field449[var14 + var12 - 1 - var17] * (long)Class66.field843[0][var17] >> 16);
						}

						for (var17 = 0; var17 < var14; ++var17) {
							var16 -= (int)((long)field449[var14 - 1 - var17] * (long)Class66.field843[1][var17] >> 16);
						}

						field449[var14] = var16;
						var11 = this.field446.method408(var1 + 1);
						++var14;
					}

					boolean var21 = true;
					var15 = 128;

					while (true) {
						if (var15 > var1 - var12) {
							var15 = var1 - var12;
						}

						int var18;
						while (var14 < var15) {
							var17 = (int)((long)field449[var14 + var12] * (long)Class66.field845 >> 16);

							for (var18 = 0; var18 < var12; ++var18) {
								var17 += (int)((long)field449[var14 + var12 - 1 - var18] * (long)Class66.field843[0][var18] >> 16);
							}

							for (var18 = 0; var18 < var13; ++var18) {
								var17 -= (int)((long)field449[var14 - 1 - var18] * (long)Class66.field843[1][var18] >> 16);
							}

							field449[var14] = var17;
							var11 = this.field446.method408(var1 + 1);
							++var14;
						}

						if (var14 >= var1 - var12) {
							while (var14 < var1) {
								var17 = 0;

								for (var18 = var14 + var12 - var1; var18 < var12; ++var18) {
									var17 += (int)((long)field449[var14 + var12 - 1 - var18] * (long)Class66.field843[0][var18] >> 16);
								}

								for (var18 = 0; var18 < var13; ++var18) {
									var17 -= (int)((long)field449[var14 - 1 - var18] * (long)Class66.field843[1][var18] >> 16);
								}

								field449[var14] = var17;
								this.field446.method408(var1 + 1);
								++var14;
							}
							break;
						}

						var12 = this.field453.method1920(0, (float)var11 / 65536.0F);
						var13 = this.field453.method1920(1, (float)var11 / 65536.0F);
						var15 += 128;
					}
				}
			}

			for (var11 = 0; var11 < var1; ++var11) {
				if (field449[var11] < -32768) {
					field449[var11] = -32768;
				}

				if (field449[var11] > 32767) {
					field449[var11] = 32767;
				}
			}

			return field449;
		}
	}

	@ObfInfo(name = "ad", desc = "(III)I")
	public final int method1207(int var1, int var2, int var3) {
		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return field433[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) {
			return ((var1 & 32767) * var2 >> 14) - var2;
		} else {
			return var3 == 4 ? field450[var1 / 2607 & 32767] * var2 : 0;
		}
	}

	@ObfInfo(name = "ag", desc = "(Lvp;)V")
	public final void method1197(Class562 var1) {
		this.field441 = new Class28();
		this.field441.method411(var1);
		this.field445 = new Class28();
		this.field445.method411(var1);
		int var2 = var1.method9902();
		if (var2 != 0) {
			--var1.field5471;
			this.field434 = new Class28();
			this.field434.method411(var1);
			this.field435 = new Class28();
			this.field435.method411(var1);
		}

		var2 = var1.method9902();
		if (var2 != 0) {
			--var1.field5471;
			this.field447 = new Class28();
			this.field447.method411(var1);
			this.field437 = new Class28();
			this.field437.method411(var1);
		}

		var2 = var1.method9902();
		if (var2 != 0) {
			--var1.field5471;
			this.field438 = new Class28();
			this.field438.method411(var1);
			this.field455 = new Class28();
			this.field455.method411(var1);
		}

		for (int var3 = 0; var3 < 10; ++var3) {
			int var4 = var1.method9842();
			if (var4 == 0) {
				break;
			}

			this.field440[var3] = var4;
			this.field439[var3] = var1.method9841();
			this.field442[var3] = var1.method9842();
		}

		this.field443 = var1.method9842();
		this.field444 = var1.method9842();
		this.field432 = var1.method9997();
		this.field448 = var1.method9997();
		this.field453 = new Class66();
		this.field446 = new Class28();
		this.field453.method1921(var1, this.field446);
	}
}
