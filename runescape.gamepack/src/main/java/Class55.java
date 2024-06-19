import java.util.Random;

public class Class55 {
	public static int[] field391;
	public static int[] field398;
	public static int[] field400;
	public static int[] field407;
	public static int[] field409;
	public static int[] field412;
	public static int[] field413;
	public static int[] field414;
	public Class48 field392;
	public Class48 field393;
	public Class48 field394;
	public Class48 field395;
	public Class48 field396;
	public Class48 field397;
	public Class48 field405;
	public Class48 field408;
	public Class48 field415;
	public Class71 field416;
	public int field402;
	public int field403;
	public int field404;
	public int field406;
	public int[] field399;
	public int[] field401;
	public int[] field410;

	static {
		field409 = new int[32768];
		Random var0 = new Random(0L);

		int var1;
		for (var1 = 0; var1 < 32768; ++var1) {
			field409[var1] = (var0.nextInt() & 2) - 1;
		}

		field407 = new int[32768];

		for (var1 = 0; var1 < 32768; ++var1) {
			field407[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
		}

		field398 = new int[220500];
		field412 = new int[5];
		field413 = new int[5];
		field414 = new int[5];
		field400 = new int[5];
		field391 = new int[5];
	}

	public Class55() {
		this.field399 = new int[]{0, 0, 0, 0, 0};
		this.field410 = new int[]{0, 0, 0, 0, 0};
		this.field401 = new int[]{0, 0, 0, 0, 0};
		this.field402 = 0;
		this.field403 = 100;
		this.field406 = 500;
		this.field404 = 0;
	}

	public final int[] method1058(int var1, int var2) {
		Class445.method8335(field398, 0, var1);
		if (var2 < 10) {
			return field398;
		} else {
			double var3 = (double)var1 / ((double)var2 + 0.0D);
			this.field408.method865();
			this.field392.method865();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (this.field393 != null) {
				this.field393.method865();
				this.field394.method865();
				var5 = (int)((double)(this.field393.field330 - this.field393.field329) * 32.768D / var3);
				var6 = (int)((double)this.field393.field329 * 32.768D / var3);
			}

			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			if (this.field395 != null) {
				this.field395.method865();
				this.field396.method865();
				var8 = (int)((double)(this.field395.field330 - this.field395.field329) * 32.768D / var3);
				var9 = (int)((double)this.field395.field329 * 32.768D / var3);
			}

			int var11;
			for (var11 = 0; var11 < 5; ++var11) {
				if (this.field399[var11] != 0) {
					field412[var11] = 0;
					field413[var11] = (int)((double)this.field401[var11] * var3);
					field414[var11] = (this.field399[var11] << 14) / 100;
					field400[var11] = (int)((double)(this.field408.field330 - this.field408.field329) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field410[var11]) / var3);
					field391[var11] = (int)((double)this.field408.field329 * 32.768D / var3);
				}
			}

			int var12;
			int var13;
			int var14;
			int var15;
			int[] var10000;
			for (var11 = 0; var11 < var1; ++var11) {
				var12 = this.field408.method867(var1);
				var13 = this.field392.method867(var1);
				if (this.field393 != null) {
					var14 = this.field393.method867(var1);
					var15 = this.field394.method867(var1);
					var12 += this.method1054(var7, var15, this.field393.field332) >> 1;
					var7 += (var14 * var5 >> 16) + var6;
				}

				if (this.field395 != null) {
					var14 = this.field395.method867(var1);
					var15 = this.field396.method867(var1);
					var13 = var13 * ((this.method1054(var10, var15, this.field395.field332) >> 1) + 32768) >> 15;
					var10 += (var14 * var8 >> 16) + var9;
				}

				for (var14 = 0; var14 < 5; ++var14) {
					if (this.field399[var14] != 0) {
						var15 = var11 + field413[var14];
						if (var15 < var1) {
							var10000 = field398;
							var10000[var15] += this.method1054(field412[var14], var13 * field414[var14] >> 15, this.field408.field332);
							var10000 = field412;
							var10000[var14] += (var12 * field400[var14] >> 16) + field391[var14];
						}
					}
				}
			}

			int var16;
			if (this.field397 != null) {
				this.field397.method865();
				this.field415.method865();
				var11 = 0;
				boolean var19 = false;
				boolean var20 = true;

				for (var14 = 0; var14 < var1; ++var14) {
					var15 = this.field397.method867(var1);
					var16 = this.field415.method867(var1);
					if (var20) {
						var12 = this.field397.field329 + ((this.field397.field330 - this.field397.field329) * var15 >> 8);
					} else {
						var12 = this.field397.field329 + ((this.field397.field330 - this.field397.field329) * var16 >> 8);
					}

					var11 += 256;
					if (var11 >= var12) {
						var11 = 0;
						var20 = !var20;
					}

					if (var20) {
						field398[var14] = 0;
					}
				}
			}

			if (this.field402 > 0 && this.field403 > 0) {
				var11 = (int)((double)this.field402 * var3);

				for (var12 = var11; var12 < var1; ++var12) {
					var10000 = field398;
					var10000[var12] += field398[var12 - var11] * this.field403 / 100;
				}
			}

			if (this.field416.field861[0] > 0 || this.field416.field861[1] > 0) {
				this.field405.method865();
				var11 = this.field405.method867(var1 + 1);
				var12 = this.field416.method1945(0, (float)var11 / 65536.0F);
				var13 = this.field416.method1945(1, (float)var11 / 65536.0F);
				if (var1 >= var13 + var12) {
					var14 = 0;
					var15 = var13;
					if (var13 > var1 - var12) {
						var15 = var1 - var12;
					}

					int var17;
					while (var14 < var15) {
						var16 = (int)((long)field398[var14 + var12] * (long)Class71.field870 >> 16);

						for (var17 = 0; var17 < var12; ++var17) {
							var16 += (int)((long)field398[var14 + var12 - 1 - var17] * (long)Class71.field867[0][var17] >> 16);
						}

						for (var17 = 0; var17 < var14; ++var17) {
							var16 -= (int)((long)field398[var14 - 1 - var17] * (long)Class71.field867[1][var17] >> 16);
						}

						field398[var14] = var16;
						var11 = this.field405.method867(var1 + 1);
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
							var17 = (int)((long)field398[var14 + var12] * (long)Class71.field870 >> 16);

							for (var18 = 0; var18 < var12; ++var18) {
								var17 += (int)((long)field398[var14 + var12 - 1 - var18] * (long)Class71.field867[0][var18] >> 16);
							}

							for (var18 = 0; var18 < var13; ++var18) {
								var17 -= (int)((long)field398[var14 - 1 - var18] * (long)Class71.field867[1][var18] >> 16);
							}

							field398[var14] = var17;
							var11 = this.field405.method867(var1 + 1);
							++var14;
						}

						if (var14 >= var1 - var12) {
							while (var14 < var1) {
								var17 = 0;

								for (var18 = var14 + var12 - var1; var18 < var12; ++var18) {
									var17 += (int)((long)field398[var14 + var12 - 1 - var18] * (long)Class71.field867[0][var18] >> 16);
								}

								for (var18 = 0; var18 < var13; ++var18) {
									var17 -= (int)((long)field398[var14 - 1 - var18] * (long)Class71.field867[1][var18] >> 16);
								}

								field398[var14] = var17;
								this.field405.method867(var1 + 1);
								++var14;
							}
							break;
						}

						var12 = this.field416.method1945(0, (float)var11 / 65536.0F);
						var13 = this.field416.method1945(1, (float)var11 / 65536.0F);
						var15 += 128;
					}
				}
			}

			for (var11 = 0; var11 < var1; ++var11) {
				if (field398[var11] < -32768) {
					field398[var11] = -32768;
				}

				if (field398[var11] > 32767) {
					field398[var11] = 32767;
				}
			}

			return field398;
		}
	}

	public final int method1054(int var1, int var2, int var3) {
		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return field407[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) {
			return ((var1 & 32767) * var2 >> 14) - var2;
		} else {
			return var3 == 4 ? field409[var1 / 2607 & 32767] * var2 : 0;
		}
	}

	public final void method1057(Class521 var1) {
		this.field408 = new Class48();
		this.field408.method864(var1);
		this.field392 = new Class48();
		this.field392.method864(var1);
		int var2 = var1.method9405();
		if (var2 != 0) {
			--var1.field5219;
			this.field393 = new Class48();
			this.field393.method864(var1);
			this.field394 = new Class48();
			this.field394.method864(var1);
		}

		var2 = var1.method9405();
		if (var2 != 0) {
			--var1.field5219;
			this.field395 = new Class48();
			this.field395.method864(var1);
			this.field396 = new Class48();
			this.field396.method864(var1);
		}

		var2 = var1.method9405();
		if (var2 != 0) {
			--var1.field5219;
			this.field397 = new Class48();
			this.field397.method864(var1);
			this.field415 = new Class48();
			this.field415.method864(var1);
		}

		for (int var3 = 0; var3 < 10; ++var3) {
			int var4 = var1.method9419();
			if (var4 == 0) {
				break;
			}

			this.field399[var3] = var4;
			this.field410[var3] = var1.method9457();
			this.field401[var3] = var1.method9419();
		}

		this.field402 = var1.method9419();
		this.field403 = var1.method9419();
		this.field406 = var1.method9407();
		this.field404 = var1.method9407();
		this.field416 = new Class71();
		this.field405 = new Class48();
		this.field416.method1946(var1, this.field405);
	}
}
