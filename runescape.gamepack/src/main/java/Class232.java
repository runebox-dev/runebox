public class Class232 extends Class507 {
	public static Class299 field2440;
	public static Class299 field2445;
	public static Class299 field2454;
	public Class515 field2458;
	public boolean field2461;
	public boolean field2467;
	public int field2442;
	public int field2444;
	public int field2447;
	public int field2448;
	public int field2450;
	public int field2453;
	public int field2455;
	public int field2456;
	public int field2457;
	public int field2459;
	public int field2460;
	public int field2462;
	public int field2463;
	public int field2464;
	public int field2465;
	public int field2466;
	public int field2468;
	public int field2471;
	public int field2472;
	public int field2474;
	public int field2475;
	public int field2477;
	public int field2478;
	public int field2480;
	public int field2481;
	public int field2482;
	public int field2484;
	public int field2485;
	public int field2486;
	public int field2488;
	public int field2489;
	public int field2490;
	public int field2491;
	public int field2492;
	public int field2493;
	public int field2495;
	public int field2496;
	public int field2497;
	public int field2498;
	public int[] field2479;
	public int[] field2483;
	public String field2446;
	public String field2449;
	public String[] field2469;
	public String[] field2487;
	public short[] field2451;
	public short[] field2470;
	public short[] field2476;
	public short[] field2494;

	static {
		field2454 = new Class299(64);
		field2445 = new Class299(50);
		field2440 = new Class299(200);
	}

	public Class232() {
		this.field2449 = Class378.field4152;
		this.field2446 = Class378.field4152;
		this.field2455 = 2000;
		this.field2456 = 0;
		this.field2480 = 0;
		this.field2457 = 0;
		this.field2459 = 0;
		this.field2442 = 0;
		this.field2462 = 0;
		this.field2464 = 1;
		this.field2468 = -1;
		this.field2465 = -1;
		this.field2466 = -1;
		this.field2467 = false;
		this.field2469 = new String[]{null, null, Class378.field4145, null, null};
		this.field2487 = new String[]{null, null, null, null, Class378.field4359};
		this.field2450 = -2;
		this.field2471 = -1;
		this.field2472 = -1;
		this.field2460 = 0;
		this.field2474 = -1;
		this.field2475 = -1;
		this.field2495 = 0;
		this.field2477 = -1;
		this.field2484 = -1;
		this.field2478 = -1;
		this.field2481 = -1;
		this.field2463 = -1;
		this.field2482 = -1;
		this.field2485 = -1;
		this.field2486 = -1;
		this.field2493 = 128;
		this.field2488 = 128;
		this.field2489 = 128;
		this.field2490 = 0;
		this.field2491 = 0;
		this.field2492 = 0;
		this.field2444 = 0;
		this.field2461 = false;
		this.field2496 = -1;
		this.field2497 = -1;
		this.field2498 = -1;
		this.field2453 = -1;
	}

	public void method4411() {
		if (this.field2462 == 1) {
			this.field2444 = 0;
		}

	}

	public void method4435(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method4413(var1, var3);
		}
	}

	public void method4413(Class521 var1, int var2) {
		if (var2 == 1) {
			this.field2448 = var1.method9407();
		} else if (var2 == 2) {
			this.field2449 = var1.method9415();
		} else if (var2 == 3) {
			this.field2446 = var1.method9415();
		} else if (var2 == 4) {
			this.field2455 = var1.method9407();
		} else if (var2 == 5) {
			this.field2456 = var1.method9407();
		} else if (var2 == 6) {
			this.field2480 = var1.method9407();
		} else if (var2 == 7) {
			this.field2459 = var1.method9407();
			if (this.field2459 > 32767) {
				this.field2459 -= 65536;
			}
		} else if (var2 == 8) {
			this.field2442 = var1.method9407();
			if (this.field2442 > 32767) {
				this.field2442 -= 65536;
			}
		} else if (var2 == 9) {
			var1.method9415();
		} else if (var2 == 11) {
			this.field2462 = 1;
		} else if (var2 == 12) {
			this.field2464 = var1.method9410();
		} else if (var2 == 13) {
			this.field2468 = var1.method9405();
		} else if (var2 == 14) {
			this.field2465 = var1.method9405();
		} else if (var2 == 16) {
			this.field2467 = true;
		} else if (var2 == 23) {
			this.field2471 = var1.method9407();
			this.field2460 = var1.method9405();
		} else if (var2 == 24) {
			this.field2472 = var1.method9407();
		} else if (var2 == 25) {
			this.field2474 = var1.method9407();
			this.field2495 = var1.method9405();
		} else if (var2 == 26) {
			this.field2475 = var1.method9407();
		} else if (var2 == 27) {
			this.field2466 = var1.method9405();
		} else if (var2 >= 30 && var2 < 35) {
			this.field2469[var2 - 30] = var1.method9415();
			if (this.field2469[var2 - 30].equalsIgnoreCase(Class378.field4147)) {
				this.field2469[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.field2487[var2 - 35] = var1.method9415();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method9405();
				this.field2451 = new short[var4];
				this.field2476 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2451[var5] = (short)var1.method9407();
					this.field2476[var5] = (short)var1.method9407();
				}
			} else if (var2 == 41) {
				var4 = var1.method9405();
				this.field2494 = new short[var4];
				this.field2470 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2494[var5] = (short)var1.method9407();
					this.field2470[var5] = (short)var1.method9407();
				}
			} else if (var2 == 42) {
				this.field2450 = var1.method9406();
			} else if (var2 == 65) {
				this.field2461 = true;
			} else if (var2 == 75) {
				this.field2444 = var1.method9535();
			} else if (var2 == 78) {
				this.field2477 = var1.method9407();
			} else if (var2 == 79) {
				this.field2484 = var1.method9407();
			} else if (var2 == 90) {
				this.field2478 = var1.method9407();
			} else if (var2 == 91) {
				this.field2463 = var1.method9407();
			} else if (var2 == 92) {
				this.field2481 = var1.method9407();
			} else if (var2 == 93) {
				this.field2482 = var1.method9407();
			} else if (var2 == 94) {
				var1.method9407();
			} else if (var2 == 95) {
				this.field2457 = var1.method9407();
			} else if (var2 == 97) {
				this.field2485 = var1.method9407();
			} else if (var2 == 98) {
				this.field2486 = var1.method9407();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.field2483 == null) {
					this.field2483 = new int[10];
					this.field2479 = new int[10];
				}

				this.field2483[var2 - 100] = var1.method9407();
				this.field2479[var2 - 100] = var1.method9407();
			} else if (var2 == 110) {
				this.field2493 = var1.method9407();
			} else if (var2 == 111) {
				this.field2488 = var1.method9407();
			} else if (var2 == 112) {
				this.field2489 = var1.method9407();
			} else if (var2 == 113) {
				this.field2490 = var1.method9406();
			} else if (var2 == 114) {
				this.field2491 = var1.method9406() * 5;
			} else if (var2 == 115) {
				this.field2492 = var1.method9405();
			} else if (var2 == 139) {
				this.field2496 = var1.method9407();
			} else if (var2 == 140) {
				this.field2497 = var1.method9407();
			} else if (var2 == 148) {
				this.field2498 = var1.method9407();
			} else if (var2 == 149) {
				this.field2453 = var1.method9407();
			} else if (var2 == 249) {
				this.field2458 = Class95.method2487(var1, this.field2458);
			}
		}

	}

	public void method4414(Class232 var1, Class232 var2) {
		this.field2448 = var1.field2448;
		this.field2455 = var1.field2455;
		this.field2456 = var1.field2456;
		this.field2480 = var1.field2480;
		this.field2457 = var1.field2457;
		this.field2459 = var1.field2459;
		this.field2442 = var1.field2442;
		this.field2451 = var1.field2451;
		this.field2476 = var1.field2476;
		this.field2494 = var1.field2494;
		this.field2470 = var1.field2470;
		this.field2449 = var2.field2449;
		this.field2446 = Class378.field4220;
		this.field2467 = var2.field2467;
		this.field2464 = var2.field2464;
		this.field2462 = 1;
	}

	public void method4415(Class232 var1, Class232 var2) {
		this.field2448 = var1.field2448;
		this.field2455 = var1.field2455;
		this.field2456 = var1.field2456;
		this.field2480 = var1.field2480;
		this.field2457 = var1.field2457;
		this.field2459 = var1.field2459;
		this.field2442 = var1.field2442;
		this.field2451 = var2.field2451;
		this.field2476 = var2.field2476;
		this.field2494 = var2.field2494;
		this.field2470 = var2.field2470;
		this.field2449 = var2.field2449;
		this.field2446 = var2.field2446;
		this.field2467 = var2.field2467;
		this.field2462 = var2.field2462;
		this.field2468 = var2.field2468;
		this.field2465 = var2.field2465;
		this.field2466 = var2.field2466;
		this.field2471 = var2.field2471;
		this.field2472 = var2.field2472;
		this.field2477 = var2.field2477;
		this.field2474 = var2.field2474;
		this.field2475 = var2.field2475;
		this.field2484 = var2.field2484;
		this.field2478 = var2.field2478;
		this.field2481 = var2.field2481;
		this.field2463 = var2.field2463;
		this.field2482 = var2.field2482;
		this.field2492 = var2.field2492;
		this.field2469 = var2.field2469;
		this.field2444 = var2.field2444;
		this.field2487 = new String[5];
		if (var2.field2487 != null) {
			for (int var4 = 0; var4 < 4; ++var4) {
				this.field2487[var4] = var2.field2487[var4];
			}
		}

		this.field2487[4] = Class378.field4219;
		this.field2464 = 0;
	}

	public void method4431(Class232 var1, Class232 var2) {
		this.field2448 = var1.field2448;
		this.field2455 = var1.field2455;
		this.field2456 = var1.field2456;
		this.field2480 = var1.field2480;
		this.field2457 = var1.field2457;
		this.field2459 = var1.field2459;
		this.field2442 = var1.field2442;
		this.field2451 = var1.field2451;
		this.field2476 = var1.field2476;
		this.field2494 = var1.field2494;
		this.field2470 = var1.field2470;
		this.field2462 = var1.field2462;
		this.field2449 = var2.field2449;
		this.field2446 = var2.field2446;
		this.field2464 = 0;
		this.field2467 = false;
		this.field2461 = false;
	}

	public final Class236 method4417(int var1) {
		int var4;
		if (this.field2483 != null && var1 > 1) {
			int var3 = -1;

			for (var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field2479[var4] && this.field2479[var4] != 0) {
					var3 = this.field2483[var4];
				}
			}

			if (var3 != -1) {
				return Class7.method109(var3).method4417(1);
			}
		}

		Class236 var5 = Class236.method4594(Class79.field2443, this.field2448, 0);
		if (var5 == null) {
			return null;
		} else {
			if (128 != this.field2493 || 128 != this.field2488 || 128 != this.field2489) {
				var5.method4576(this.field2493, this.field2488, this.field2489);
			}

			if (this.field2451 != null) {
				for (var4 = 0; var4 < this.field2451.length; ++var4) {
					var5.method4573(this.field2451[var4], this.field2476[var4]);
				}
			}

			if (this.field2494 != null) {
				for (var4 = 0; var4 < this.field2494.length; ++var4) {
					var5.method4600(this.field2494[var4], this.field2470[var4]);
				}
			}

			return var5;
		}
	}

	public final Class262 method4418(int var1) {
		if (this.field2483 != null && var1 > 1) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field2479[var4] && this.field2479[var4] != 0) {
					var3 = this.field2483[var4];
				}
			}

			if (var3 != -1) {
				return Class7.method109(var3).method4418(1);
			}
		}

		Class262 var6 = (Class262)field2445.method5993((long)this.field2447);
		if (var6 != null) {
			return var6;
		} else {
			Class236 var7 = Class236.method4594(Class79.field2443, this.field2448, 0);
			if (var7 == null) {
				return null;
			} else {
				if (this.field2493 != 128 || this.field2488 != 128 || this.field2489 != 128) {
					var7.method4576(this.field2493, this.field2488, this.field2489);
				}

				int var5;
				if (this.field2451 != null) {
					for (var5 = 0; var5 < this.field2451.length; ++var5) {
						var7.method4573(this.field2451[var5], this.field2476[var5]);
					}
				}

				if (this.field2494 != null) {
					for (var5 = 0; var5 < this.field2494.length; ++var5) {
						var7.method4600(this.field2494[var5], this.field2470[var5]);
					}
				}

				var6 = var7.method4572(this.field2490 + 64, this.field2491 + 768, -50, -10, -50);
				var6.field2873 = true;
				field2445.method5987(var6, (long)this.field2447);
				return var6;
			}
		}
	}

	public Class232 method4419(int var1) {
		if (this.field2483 != null && var1 > 1) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field2479[var4] && this.field2479[var4] != 0) {
					var3 = this.field2483[var4];
				}
			}

			if (var3 != -1) {
				return Class7.method109(var3);
			}
		}

		return this;
	}

	public final boolean method4439(int var1) {
		int var3 = this.field2471;
		int var4 = this.field2472;
		int var5 = this.field2477;
		if (var1 == 1) {
			var3 = this.field2474;
			var4 = this.field2475;
			var5 = this.field2484;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!Class79.field2443.method7232(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !Class79.field2443.method7232(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !Class79.field2443.method7232(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	public final Class236 method4476(int var1) {
		int var3 = this.field2471;
		int var4 = this.field2472;
		int var5 = this.field2477;
		if (var1 == 1) {
			var3 = this.field2474;
			var4 = this.field2475;
			var5 = this.field2484;
		}

		if (var3 == -1) {
			return null;
		} else {
			Class236 var6 = Class236.method4594(Class79.field2443, var3, 0);
			if (var4 != -1) {
				Class236 var7 = Class236.method4594(Class79.field2443, var4, 0);
				if (var5 != -1) {
					Class236 var8 = Class236.method4594(Class79.field2443, var5, 0);
					Class236[] var9 = new Class236[]{var6, var7, var8};
					var6 = new Class236(var9, 3);
				} else {
					Class236[] var11 = new Class236[]{var6, var7};
					var6 = new Class236(var11, 2);
				}
			}

			if (var1 == 0 && this.field2460 != 0) {
				var6.method4558(0, this.field2460, 0);
			}

			if (var1 == 1 && this.field2495 != 0) {
				var6.method4558(0, this.field2495, 0);
			}

			int var10;
			if (this.field2451 != null) {
				for (var10 = 0; var10 < this.field2451.length; ++var10) {
					var6.method4573(this.field2451[var10], this.field2476[var10]);
				}
			}

			if (this.field2494 != null) {
				for (var10 = 0; var10 < this.field2494.length; ++var10) {
					var6.method4600(this.field2494[var10], this.field2470[var10]);
				}
			}

			return var6;
		}
	}

	public final boolean method4422(int var1) {
		int var3 = this.field2478;
		int var4 = this.field2481;
		if (var1 == 1) {
			var3 = this.field2463;
			var4 = this.field2482;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!Class79.field2443.method7232(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !Class79.field2443.method7232(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	public final Class236 method4423(int var1) {
		int var3 = this.field2478;
		int var4 = this.field2481;
		if (var1 == 1) {
			var3 = this.field2463;
			var4 = this.field2482;
		}

		if (var3 == -1) {
			return null;
		} else {
			Class236 var5 = Class236.method4594(Class79.field2443, var3, 0);
			if (var4 != -1) {
				Class236 var6 = Class236.method4594(Class79.field2443, var4, 0);
				Class236[] var7 = new Class236[]{var5, var6};
				var5 = new Class236(var7, 2);
			}

			int var8;
			if (this.field2451 != null) {
				for (var8 = 0; var8 < this.field2451.length; ++var8) {
					var5.method4573(this.field2451[var8], this.field2476[var8]);
				}
			}

			if (this.field2494 != null) {
				for (var8 = 0; var8 < this.field2494.length; ++var8) {
					var5.method4600(this.field2494[var8], this.field2470[var8]);
				}
			}

			return var5;
		}
	}

	public int method4424(int var1, int var2) {
		Class515 var5 = this.field2458;
		int var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			Class516 var6 = (Class516)var5.method9326((long)var1);
			if (var6 == null) {
				var4 = var2;
			} else {
				var4 = var6.field5199;
			}
		}

		return var4;
	}

	public String method4425(int var1, String var2) {
		return Class188.method2595(this.field2458, var1, var2);
	}

	public int method4426() {
		if (this.field2450 != -1 && this.field2487 != null) {
			if (this.field2450 >= 0) {
				return null != this.field2487[this.field2450] ? this.field2450 : -1;
			} else {
				return Class378.field4359.equalsIgnoreCase(this.field2487[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	public boolean method4427() {
		return this.field2476 != null;
	}

	public boolean method4428() {
		return this.field2470 != null;
	}

	public static Class549 method3405(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var7 = ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var4 << 40) + ((long)var3 << 42);
		Class549 var9;
		if (!var5) {
			var9 = (Class549)field2440.method5993(var7);
			if (var9 != null) {
				return var9;
			}
		}

		Class232 var10 = Class7.method109(var0);
		if (var1 > 1 && var10.field2483 != null) {
			int var11 = -1;

			for (int var12 = 0; var12 < 10; ++var12) {
				if (var1 >= var10.field2479[var12] && var10.field2479[var12] != 0) {
					var11 = var10.field2483[var12];
				}
			}

			if (var11 != -1) {
				var10 = Class7.method109(var11);
			}
		}

		Class262 var21 = var10.method4418(1);
		if (var21 == null) {
			return null;
		} else {
			Class549 var22 = null;
			if (-1 != var10.field2486) {
				var22 = method3405(var10.field2485, 10, 1, 0, 0, true);
				if (var22 == null) {
					return null;
				}
			} else if (-1 != var10.field2497) {
				var22 = method3405(var10.field2496, var1, var2, var3, 0, false);
				if (var22 == null) {
					return null;
				}
			} else if (var10.field2453 != -1) {
				var22 = method3405(var10.field2498, var1, 0, 0, 0, false);
				if (var22 == null) {
					return null;
				}
			}

			int[] var13 = Class561.field5418;
			int var14 = Class87.field5423;
			int var15 = Class561.field5420;
			float[] var16 = Class561.field5421;
			int[] var17 = new int[4];
			Class561.method10195(var17);
			var9 = new Class549(36, 32);
			Class253.method4794(var9.field5357, 36, 32, (float[])null);
			Class561.method10160();
			Class253.method4851();
			Class253.method4798(16, 16);
			Class253.field2688.field3044 = false;
			if (-1 != var10.field2453) {
				var22.method10023(0, 0);
			}

			int var18 = var10.field2455;
			if (var5) {
				var18 = (int)(1.5D * (double)var18);
			} else if (var2 == 2) {
				var18 = (int)((double)var18 * 1.04D);
			}

			int var19 = var18 * Class253.field2683[var10.field2456] >> 16;
			int var20 = var18 * Class253.field2687[var10.field2456] >> 16;
			var21.method5173();
			var21.method5288(0, var10.field2480, var10.field2457, var10.field2456, var10.field2459, var21.field2696 / 2 + var19 + var10.field2442, var20 + var10.field2442);
			if (var10.field2497 != -1) {
				var22.method10023(0, 0);
			}

			if (var2 >= 1) {
				var9.method9920(1);
			}

			if (var2 >= 2) {
				var9.method9920(16777215);
			}

			if (var3 != 0) {
				var9.method9928(var3);
			}

			Class253.method4794(var9.field5357, 36, 32, (float[])null);
			if (var10.field2486 != -1) {
				var22.method10023(0, 0);
			}

			if (var4 == 1 || var4 == 2 && 1 == var10.field2462) {
				Class79.field2398.method8017(Class87.method2383(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				field2440.method5987(var9, var7);
			}

			Class253.method4794(var13, var14, var15, var16);
			Class561.method10147(var17);
			Class253.method4851();
			Class253.field2688.field3044 = true;
			return var9;
		}
	}

	public static void method3345() {
		field2440.method5995();
	}
}
