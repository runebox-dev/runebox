import io.runebox.ObfInfo;

public class Class236 extends Class255 {
	@ObfInfo(name = "bd", desc = "I")
	public static int field2561;
	@ObfInfo(name = "bx", desc = "[I")
	public static int[] field2525;
	@ObfInfo(name = "br", desc = "[I")
	public static int[] field2559;
	@ObfInfo(name = "bv", desc = "[I")
	public static int[] field2562;
	@ObfInfo(name = "bm", desc = "[I")
	public static int[] field2563;
	@ObfInfo(name = "bi", desc = "[Ljc;")
	public Class237[] field2537;
	@ObfInfo(name = "bn", desc = "[Lkm;")
	public Class273[] field2550;
	@ObfInfo(name = "bt", desc = "[Lkm;")
	public Class273[] field2558;
	@ObfInfo(name = "be", desc = "Z")
	public boolean field2553;
	@ObfInfo(name = "au", desc = "B")
	public byte field2555;
	@ObfInfo(name = "av", desc = "[B")
	public byte[] field2530;
	@ObfInfo(name = "ae", desc = "[B")
	public byte[] field2533;
	@ObfInfo(name = "aq", desc = "[B")
	public byte[] field2536;
	@ObfInfo(name = "aw", desc = "[B")
	public byte[] field2538;
	@ObfInfo(name = "ap", desc = "[B")
	public byte[] field2548;
	@ObfInfo(name = "bu", desc = "I")
	public int field2519;
	@ObfInfo(name = "az", desc = "I")
	public int field2522;
	@ObfInfo(name = "ab", desc = "I")
	public int field2526;
	@ObfInfo(name = "as", desc = "I")
	public int field2527;
	@ObfInfo(name = "bp", desc = "I")
	public int field2541;
	@ObfInfo(name = "bg", desc = "I")
	public int field2554;
	@ObfInfo(name = "bk", desc = "I")
	public int field2557;
	@ObfInfo(name = "bh", desc = "I")
	public int field2560;
	@ObfInfo(name = "af", desc = "[I")
	public int[] field2523;
	@ObfInfo(name = "aa", desc = "[I")
	public int[] field2524;
	@ObfInfo(name = "ao", desc = "[I")
	public int[] field2528;
	@ObfInfo(name = "ah", desc = "[I")
	public int[] field2529;
	@ObfInfo(name = "at", desc = "[I")
	public int[] field2532;
	@ObfInfo(name = "ac", desc = "[I")
	public int[] field2542;
	@ObfInfo(name = "ar", desc = "[I")
	public int[] field2543;
	@ObfInfo(name = "am", desc = "[I")
	public int[] field2544;
	@ObfInfo(name = "bs", desc = "[[I")
	public int[][] field2545;
	@ObfInfo(name = "bf", desc = "[[I")
	public int[][] field2546;
	@ObfInfo(name = "bo", desc = "[[I")
	public int[][] field2547;
	@ObfInfo(name = "ag", desc = "[[I")
	public int[][] field2551;
	@ObfInfo(name = "bl", desc = "S")
	public short field2552;
	@ObfInfo(name = "bw", desc = "S")
	public short field2556;
	@ObfInfo(name = "ax", desc = "[S")
	public short[] field2534;
	@ObfInfo(name = "ay", desc = "[S")
	public short[] field2535;
	@ObfInfo(name = "ad", desc = "[S")
	public short[] field2539;
	@ObfInfo(name = "ai", desc = "[S")
	public short[] field2540;
	@ObfInfo(name = "an", desc = "[S")
	public short[] field2549;

	static {
		field2559 = new int[10000];
		field2525 = new int[10000];
		field2561 = 0;
		field2562 = Class253.field2683;
		field2563 = Class253.field2687;
	}

	public Class236() {
		this.field2522 = 0;
		this.field2526 = 0;
		this.field2555 = 0;
		this.field2553 = false;
	}

	public Class236(byte[] var1) {
		this.field2522 = 0;
		this.field2526 = 0;
		this.field2555 = 0;
		this.field2553 = false;
		Class521 var2 = new Class521(10);
		var2.method9389(-2);
		if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
			this.method4559(var1);
		} else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
			this.method4560(var1);
		} else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			this.method4568(var1);
		} else {
			this.method4562(var1);
		}

	}

	public Class236(Class236[] var1, int var2) {
		this.field2522 = 0;
		this.field2526 = 0;
		this.field2555 = 0;
		this.field2553 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		this.field2522 = 0;
		this.field2526 = 0;
		this.field2527 = 0;
		this.field2555 = -1;

		int var10;
		Class236 var11;
		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				this.field2522 += var11.field2522;
				this.field2526 += var11.field2526;
				this.field2527 += var11.field2527;
				if (var11.field2536 != null) {
					var4 = true;
				} else {
					if (this.field2555 == -1) {
						this.field2555 = var11.field2555;
					}

					if (this.field2555 != var11.field2555) {
						var4 = true;
					}
				}

				var3 |= var11.field2530 != null;
				var5 |= var11.field2548 != null;
				var6 |= var11.field2543 != null;
				var7 |= var11.field2535 != null;
				var8 |= var11.field2533 != null;
				var9 |= var11.field2546 != null;
			}
		}

		this.field2523 = new int[this.field2522];
		this.field2524 = new int[this.field2522];
		this.field2532 = new int[this.field2522];
		this.field2544 = new int[this.field2522];
		this.field2542 = new int[this.field2526];
		this.field2528 = new int[this.field2526];
		this.field2529 = new int[this.field2526];
		if (var3) {
			this.field2530 = new byte[this.field2526];
		}

		if (var4) {
			this.field2536 = new byte[this.field2526];
		}

		if (var5) {
			this.field2548 = new byte[this.field2526];
		}

		if (var6) {
			this.field2543 = new int[this.field2526];
		}

		if (var7) {
			this.field2535 = new short[this.field2526];
		}

		if (var8) {
			this.field2533 = new byte[this.field2526];
		}

		if (var9) {
			this.field2546 = new int[this.field2522][];
			this.field2547 = new int[this.field2522][];
		}

		this.field2534 = new short[this.field2526];
		if (this.field2527 > 0) {
			this.field2538 = new byte[this.field2527];
			this.field2539 = new short[this.field2527];
			this.field2540 = new short[this.field2527];
			this.field2549 = new short[this.field2527];
		}

		this.field2522 = 0;
		this.field2526 = 0;
		this.field2527 = 0;

		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				int var12;
				for (var12 = 0; var12 < var11.field2526; ++var12) {
					if (var3 && var11.field2530 != null) {
						this.field2530[this.field2526] = var11.field2530[var12];
					}

					if (var4) {
						if (var11.field2536 != null) {
							this.field2536[this.field2526] = var11.field2536[var12];
						} else {
							this.field2536[this.field2526] = var11.field2555;
						}
					}

					if (var5 && var11.field2548 != null) {
						this.field2548[this.field2526] = var11.field2548[var12];
					}

					if (var6 && var11.field2543 != null) {
						this.field2543[this.field2526] = var11.field2543[var12];
					}

					if (var7) {
						if (var11.field2535 != null) {
							this.field2535[this.field2526] = var11.field2535[var12];
						} else {
							this.field2535[this.field2526] = -1;
						}
					}

					if (var8) {
						if (var11.field2533 != null && var11.field2533[var12] != -1) {
							this.field2533[this.field2526] = (byte)(var11.field2533[var12] + this.field2527);
						} else {
							this.field2533[this.field2526] = -1;
						}
					}

					this.field2534[this.field2526] = var11.field2534[var12];
					this.field2542[this.field2526] = this.method4608(var11, var11.field2542[var12]);
					this.field2528[this.field2526] = this.method4608(var11, var11.field2528[var12]);
					this.field2529[this.field2526] = this.method4608(var11, var11.field2529[var12]);
					++this.field2526;
				}

				for (var12 = 0; var12 < var11.field2527; ++var12) {
					byte var13 = this.field2538[this.field2527] = var11.field2538[var12];
					if (var13 == 0) {
						this.field2539[this.field2527] = (short)this.method4608(var11, var11.field2539[var12]);
						this.field2540[this.field2527] = (short)this.method4608(var11, var11.field2540[var12]);
						this.field2549[this.field2527] = (short)this.method4608(var11, var11.field2549[var12]);
					}

					++this.field2527;
				}
			}
		}

	}

	public Class236(Class236 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.field2522 = 0;
		this.field2526 = 0;
		this.field2555 = 0;
		this.field2553 = false;
		this.field2522 = var1.field2522;
		this.field2526 = var1.field2526;
		this.field2527 = var1.field2527;
		int var6;
		if (var2) {
			this.field2523 = var1.field2523;
			this.field2524 = var1.field2524;
			this.field2532 = var1.field2532;
		} else {
			this.field2523 = new int[this.field2522];
			this.field2524 = new int[this.field2522];
			this.field2532 = new int[this.field2522];

			for (var6 = 0; var6 < this.field2522; ++var6) {
				this.field2523[var6] = var1.field2523[var6];
				this.field2524[var6] = var1.field2524[var6];
				this.field2532[var6] = var1.field2532[var6];
			}
		}

		if (var3) {
			this.field2534 = var1.field2534;
		} else {
			this.field2534 = new short[this.field2526];

			for (var6 = 0; var6 < this.field2526; ++var6) {
				this.field2534[var6] = var1.field2534[var6];
			}
		}

		if (!var4 && var1.field2535 != null) {
			this.field2535 = new short[this.field2526];

			for (var6 = 0; var6 < this.field2526; ++var6) {
				this.field2535[var6] = var1.field2535[var6];
			}
		} else {
			this.field2535 = var1.field2535;
		}

		if (var5) {
			this.field2548 = var1.field2548;
		} else {
			this.field2548 = new byte[this.field2526];
			if (var1.field2548 == null) {
				for (var6 = 0; var6 < this.field2526; ++var6) {
					this.field2548[var6] = 0;
				}
			} else {
				for (var6 = 0; var6 < this.field2526; ++var6) {
					this.field2548[var6] = var1.field2548[var6];
				}
			}
		}

		this.field2542 = var1.field2542;
		this.field2528 = var1.field2528;
		this.field2529 = var1.field2529;
		this.field2530 = var1.field2530;
		this.field2536 = var1.field2536;
		this.field2533 = var1.field2533;
		this.field2555 = var1.field2555;
		this.field2538 = var1.field2538;
		this.field2539 = var1.field2539;
		this.field2540 = var1.field2540;
		this.field2549 = var1.field2549;
		this.field2544 = var1.field2544;
		this.field2543 = var1.field2543;
		this.field2551 = var1.field2551;
		this.field2545 = var1.field2545;
		this.field2558 = var1.field2558;
		this.field2537 = var1.field2537;
		this.field2550 = var1.field2550;
		this.field2546 = var1.field2546;
		this.field2547 = var1.field2547;
		this.field2556 = var1.field2556;
		this.field2552 = var1.field2552;
	}

	@ObfInfo(name = "al", desc = "([B)V")
	public void method4559(byte[] var1) {
		Class521 var2 = new Class521(var1);
		Class521 var3 = new Class521(var1);
		Class521 var4 = new Class521(var1);
		Class521 var5 = new Class521(var1);
		Class521 var6 = new Class521(var1);
		Class521 var7 = new Class521(var1);
		Class521 var8 = new Class521(var1);
		var2.field5219 = var1.length - 26;
		int var9 = var2.method9407();
		int var10 = var2.method9407();
		int var11 = var2.method9405();
		int var12 = var2.method9405();
		int var13 = var2.method9405();
		int var14 = var2.method9405();
		int var15 = var2.method9405();
		int var16 = var2.method9405();
		int var17 = var2.method9405();
		int var18 = var2.method9405();
		int var19 = var2.method9407();
		int var20 = var2.method9407();
		int var21 = var2.method9407();
		int var22 = var2.method9407();
		int var23 = var2.method9407();
		int var24 = var2.method9407();
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28;
		if (var11 > 0) {
			this.field2538 = new byte[var11];
			var2.field5219 = 0;

			for (var28 = 0; var28 < var11; ++var28) {
				byte var29 = this.field2538[var28] = var2.method9406();
				if (var29 == 0) {
					++var25;
				}

				if (var29 >= 1 && var29 <= 3) {
					++var26;
				}

				if (var29 == 2) {
					++var27;
				}
			}
		}

		var28 = var11 + var9;
		int var30 = var28;
		if (var12 == 1) {
			var28 += var10;
		}

		int var31 = var28;
		var28 += var10;
		int var32 = var28;
		if (var13 == 255) {
			var28 += var10;
		}

		int var33 = var28;
		if (var15 == 1) {
			var28 += var10;
		}

		int var34 = var28;
		var28 += var24;
		int var35 = var28;
		if (var14 == 1) {
			var28 += var10;
		}

		int var36 = var28;
		var28 += var22;
		int var37 = var28;
		if (var16 == 1) {
			var28 += var10 * 2;
		}

		int var38 = var28;
		var28 += var23;
		int var39 = var28;
		var28 += var10 * 2;
		int var40 = var28;
		var28 += var19;
		int var41 = var28;
		var28 += var20;
		int var42 = var28;
		var28 += var21;
		int var43 = var28;
		var28 += var25 * 6;
		int var44 = var28;
		var28 += var26 * 6;
		int var45 = var28;
		var28 += var26 * 6;
		int var46 = var28;
		var28 += var26 * 2;
		int var47 = var28;
		var28 += var26;
		int var48 = var28;
		var28 += var26 * 2 + var27 * 2;
		this.field2522 = var9;
		this.field2526 = var10;
		this.field2527 = var11;
		this.field2523 = new int[var9];
		this.field2524 = new int[var9];
		this.field2532 = new int[var9];
		this.field2542 = new int[var10];
		this.field2528 = new int[var10];
		this.field2529 = new int[var10];
		if (var17 == 1) {
			this.field2544 = new int[var9];
		}

		if (var12 == 1) {
			this.field2530 = new byte[var10];
		}

		if (var13 == 255) {
			this.field2536 = new byte[var10];
		} else {
			this.field2555 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2548 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2543 = new int[var10];
		}

		if (var16 == 1) {
			this.field2535 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field2533 = new byte[var10];
		}

		if (var18 == 1) {
			this.field2546 = new int[var9][];
			this.field2547 = new int[var9][];
		}

		this.field2534 = new short[var10];
		if (var11 > 0) {
			this.field2539 = new short[var11];
			this.field2540 = new short[var11];
			this.field2549 = new short[var11];
		}

		var2.field5219 = var11;
		var3.field5219 = var40;
		var4.field5219 = var41;
		var5.field5219 = var42;
		var6.field5219 = var34;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;

		int var53;
		int var54;
		int var55;
		int var56;
		int var57;
		for (var53 = 0; var53 < var9; ++var53) {
			var54 = var2.method9405();
			var55 = 0;
			if ((var54 & 1) != 0) {
				var55 = var3.method9457();
			}

			var56 = 0;
			if ((var54 & 2) != 0) {
				var56 = var4.method9457();
			}

			var57 = 0;
			if ((var54 & 4) != 0) {
				var57 = var5.method9457();
			}

			this.field2523[var53] = var55 + var50;
			this.field2524[var53] = var56 + var51;
			this.field2532[var53] = var57 + var52;
			var50 = this.field2523[var53];
			var51 = this.field2524[var53];
			var52 = this.field2532[var53];
			if (var17 == 1) {
				this.field2544[var53] = var6.method9405();
			}
		}

		if (var18 == 1) {
			for (var53 = 0; var53 < var9; ++var53) {
				var54 = var6.method9405();
				this.field2546[var53] = new int[var54];
				this.field2547[var53] = new int[var54];

				for (var55 = 0; var55 < var54; ++var55) {
					this.field2546[var53][var55] = var6.method9405();
					this.field2547[var53][var55] = var6.method9405();
				}
			}
		}

		var2.field5219 = var39;
		var3.field5219 = var30;
		var4.field5219 = var32;
		var5.field5219 = var35;
		var6.field5219 = var33;
		var7.field5219 = var37;
		var8.field5219 = var38;

		for (var53 = 0; var53 < var10; ++var53) {
			this.field2534[var53] = (short)var2.method9407();
			if (var12 == 1) {
				this.field2530[var53] = var3.method9406();
			}

			if (var13 == 255) {
				this.field2536[var53] = var4.method9406();
			}

			if (var14 == 1) {
				this.field2548[var53] = var5.method9406();
			}

			if (var15 == 1) {
				this.field2543[var53] = var6.method9405();
			}

			if (var16 == 1) {
				this.field2535[var53] = (short)(var7.method9407() - 1);
			}

			if (this.field2533 != null && this.field2535[var53] != -1) {
				this.field2533[var53] = (byte)(var8.method9405() - 1);
			}
		}

		var2.field5219 = var36;
		var3.field5219 = var31;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		var56 = 0;

		int var58;
		for (var57 = 0; var57 < var10; ++var57) {
			var58 = var3.method9405();
			if (var58 == 1) {
				var53 = var2.method9457() + var56;
				var54 = var2.method9457() + var53;
				var55 = var2.method9457() + var54;
				var56 = var55;
				this.field2542[var57] = var53;
				this.field2528[var57] = var54;
				this.field2529[var57] = var55;
			}

			if (var58 == 2) {
				var54 = var55;
				var55 = var2.method9457() + var56;
				var56 = var55;
				this.field2542[var57] = var53;
				this.field2528[var57] = var54;
				this.field2529[var57] = var55;
			}

			if (var58 == 3) {
				var53 = var55;
				var55 = var2.method9457() + var56;
				var56 = var55;
				this.field2542[var57] = var53;
				this.field2528[var57] = var54;
				this.field2529[var57] = var55;
			}

			if (var58 == 4) {
				int var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.method9457() + var56;
				var56 = var55;
				this.field2542[var57] = var53;
				this.field2528[var57] = var59;
				this.field2529[var57] = var55;
			}
		}

		var2.field5219 = var43;
		var3.field5219 = var44;
		var4.field5219 = var45;
		var5.field5219 = var46;
		var6.field5219 = var47;
		var7.field5219 = var48;

		for (var57 = 0; var57 < var11; ++var57) {
			var58 = this.field2538[var57] & 255;
			if (var58 == 0) {
				this.field2539[var57] = (short)var2.method9407();
				this.field2540[var57] = (short)var2.method9407();
				this.field2549[var57] = (short)var2.method9407();
			}
		}

		var2.field5219 = var28;
		var57 = var2.method9405();
		if (var57 != 0) {
			new Class261();
			var2.method9407();
			var2.method9407();
			var2.method9407();
			var2.method9410();
		}

	}

	@ObfInfo(name = "aj", desc = "([B)V")
	public void method4560(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		Class521 var4 = new Class521(var1);
		Class521 var5 = new Class521(var1);
		Class521 var6 = new Class521(var1);
		Class521 var7 = new Class521(var1);
		Class521 var8 = new Class521(var1);
		var4.field5219 = var1.length - 23;
		int var9 = var4.method9407();
		int var10 = var4.method9407();
		int var11 = var4.method9405();
		int var12 = var4.method9405();
		int var13 = var4.method9405();
		int var14 = var4.method9405();
		int var15 = var4.method9405();
		int var16 = var4.method9405();
		int var17 = var4.method9405();
		int var18 = var4.method9407();
		int var19 = var4.method9407();
		int var20 = var4.method9407();
		int var21 = var4.method9407();
		int var22 = var4.method9407();
		byte var23 = 0;
		int var47 = var23 + var9;
		int var25 = var47;
		var47 += var10;
		int var26 = var47;
		if (var13 == 255) {
			var47 += var10;
		}

		int var27 = var47;
		if (var15 == 1) {
			var47 += var10;
		}

		int var28 = var47;
		if (var12 == 1) {
			var47 += var10;
		}

		int var29 = var47;
		var47 += var22;
		int var30 = var47;
		if (var14 == 1) {
			var47 += var10;
		}

		int var31 = var47;
		var47 += var21;
		int var32 = var47;
		var47 += var10 * 2;
		int var33 = var47;
		var47 += var11 * 6;
		int var34 = var47;
		var47 += var18;
		int var35 = var47;
		var47 += var19;
		int var10000 = var47 + var20;
		this.field2522 = var9;
		this.field2526 = var10;
		this.field2527 = var11;
		this.field2523 = new int[var9];
		this.field2524 = new int[var9];
		this.field2532 = new int[var9];
		this.field2542 = new int[var10];
		this.field2528 = new int[var10];
		this.field2529 = new int[var10];
		if (var11 > 0) {
			this.field2538 = new byte[var11];
			this.field2539 = new short[var11];
			this.field2540 = new short[var11];
			this.field2549 = new short[var11];
		}

		if (var16 == 1) {
			this.field2544 = new int[var9];
		}

		if (var12 == 1) {
			this.field2530 = new byte[var10];
			this.field2533 = new byte[var10];
			this.field2535 = new short[var10];
		}

		if (var13 == 255) {
			this.field2536 = new byte[var10];
		} else {
			this.field2555 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2548 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2543 = new int[var10];
		}

		if (var17 == 1) {
			this.field2546 = new int[var9][];
			this.field2547 = new int[var9][];
		}

		this.field2534 = new short[var10];
		var4.field5219 = var23;
		var5.field5219 = var34;
		var6.field5219 = var35;
		var7.field5219 = var47;
		var8.field5219 = var29;
		int var37 = 0;
		int var38 = 0;
		int var39 = 0;

		int var40;
		int var41;
		int var42;
		int var43;
		int var44;
		for (var40 = 0; var40 < var9; ++var40) {
			var41 = var4.method9405();
			var42 = 0;
			if ((var41 & 1) != 0) {
				var42 = var5.method9457();
			}

			var43 = 0;
			if ((var41 & 2) != 0) {
				var43 = var6.method9457();
			}

			var44 = 0;
			if ((var41 & 4) != 0) {
				var44 = var7.method9457();
			}

			this.field2523[var40] = var42 + var37;
			this.field2524[var40] = var43 + var38;
			this.field2532[var40] = var44 + var39;
			var37 = this.field2523[var40];
			var38 = this.field2524[var40];
			var39 = this.field2532[var40];
			if (var16 == 1) {
				this.field2544[var40] = var8.method9405();
			}
		}

		if (var17 == 1) {
			for (var40 = 0; var40 < var9; ++var40) {
				var41 = var8.method9405();
				this.field2546[var40] = new int[var41];
				this.field2547[var40] = new int[var41];

				for (var42 = 0; var42 < var41; ++var42) {
					this.field2546[var40][var42] = var8.method9405();
					this.field2547[var40][var42] = var8.method9405();
				}
			}
		}

		var4.field5219 = var32;
		var5.field5219 = var28;
		var6.field5219 = var26;
		var7.field5219 = var30;
		var8.field5219 = var27;

		for (var40 = 0; var40 < var10; ++var40) {
			this.field2534[var40] = (short)var4.method9407();
			if (var12 == 1) {
				var41 = var5.method9405();
				if ((var41 & 1) == 1) {
					this.field2530[var40] = 1;
					var2 = true;
				} else {
					this.field2530[var40] = 0;
				}

				if ((var41 & 2) == 2) {
					this.field2533[var40] = (byte)(var41 >> 2);
					this.field2535[var40] = this.field2534[var40];
					this.field2534[var40] = 127;
					if (this.field2535[var40] != -1) {
						var3 = true;
					}
				} else {
					this.field2533[var40] = -1;
					this.field2535[var40] = -1;
				}
			}

			if (var13 == 255) {
				this.field2536[var40] = var6.method9406();
			}

			if (var14 == 1) {
				this.field2548[var40] = var7.method9406();
			}

			if (var15 == 1) {
				this.field2543[var40] = var8.method9405();
			}
		}

		var4.field5219 = var31;
		var5.field5219 = var25;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		var43 = 0;

		int var45;
		int var46;
		for (var44 = 0; var44 < var10; ++var44) {
			var45 = var5.method9405();
			if (var45 == 1) {
				var40 = var4.method9457() + var43;
				var41 = var4.method9457() + var40;
				var42 = var4.method9457() + var41;
				var43 = var42;
				this.field2542[var44] = var40;
				this.field2528[var44] = var41;
				this.field2529[var44] = var42;
			}

			if (var45 == 2) {
				var41 = var42;
				var42 = var4.method9457() + var43;
				var43 = var42;
				this.field2542[var44] = var40;
				this.field2528[var44] = var41;
				this.field2529[var44] = var42;
			}

			if (var45 == 3) {
				var40 = var42;
				var42 = var4.method9457() + var43;
				var43 = var42;
				this.field2542[var44] = var40;
				this.field2528[var44] = var41;
				this.field2529[var44] = var42;
			}

			if (var45 == 4) {
				var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.method9457() + var43;
				var43 = var42;
				this.field2542[var44] = var40;
				this.field2528[var44] = var46;
				this.field2529[var44] = var42;
			}
		}

		var4.field5219 = var33;

		for (var44 = 0; var44 < var11; ++var44) {
			this.field2538[var44] = 0;
			this.field2539[var44] = (short)var4.method9407();
			this.field2540[var44] = (short)var4.method9407();
			this.field2549[var44] = (short)var4.method9407();
		}

		if (this.field2533 != null) {
			boolean var48 = false;

			for (var45 = 0; var45 < var10; ++var45) {
				var46 = this.field2533[var45] & 255;
				if (var46 != 255) {
					if ((this.field2539[var46] & '\uffff') == this.field2542[var45] && (this.field2540[var46] & '\uffff') == this.field2528[var45] && (this.field2549[var46] & '\uffff') == this.field2529[var45]) {
						this.field2533[var45] = -1;
					} else {
						var48 = true;
					}
				}
			}

			if (!var48) {
				this.field2533 = null;
			}
		}

		if (!var3) {
			this.field2535 = null;
		}

		if (!var2) {
			this.field2530 = null;
		}

	}

	@ObfInfo(name = "az", desc = "([B)V")
	public void method4568(byte[] var1) {
		Class521 var2 = new Class521(var1);
		Class521 var3 = new Class521(var1);
		Class521 var4 = new Class521(var1);
		Class521 var5 = new Class521(var1);
		Class521 var6 = new Class521(var1);
		Class521 var7 = new Class521(var1);
		Class521 var8 = new Class521(var1);
		var2.field5219 = var1.length - 23;
		int var9 = var2.method9407();
		int var10 = var2.method9407();
		int var11 = var2.method9405();
		int var12 = var2.method9405();
		int var13 = var2.method9405();
		int var14 = var2.method9405();
		int var15 = var2.method9405();
		int var16 = var2.method9405();
		int var17 = var2.method9405();
		int var18 = var2.method9407();
		int var19 = var2.method9407();
		int var20 = var2.method9407();
		int var21 = var2.method9407();
		int var22 = var2.method9407();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			this.field2538 = new byte[var11];
			var2.field5219 = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.field2538[var26] = var2.method9406();
				if (var27 == 0) {
					++var23;
				}

				if (var27 >= 1 && var27 <= 3) {
					++var24;
				}

				if (var27 == 2) {
					++var25;
				}
			}
		}

		var26 = var11 + var9;
		int var28 = var26;
		if (var12 == 1) {
			var26 += var10;
		}

		int var29 = var26;
		var26 += var10;
		int var30 = var26;
		if (var13 == 255) {
			var26 += var10;
		}

		int var31 = var26;
		if (var15 == 1) {
			var26 += var10;
		}

		int var32 = var26;
		if (var17 == 1) {
			var26 += var9;
		}

		int var33 = var26;
		if (var14 == 1) {
			var26 += var10;
		}

		int var34 = var26;
		var26 += var21;
		int var35 = var26;
		if (var16 == 1) {
			var26 += var10 * 2;
		}

		int var36 = var26;
		var26 += var22;
		int var37 = var26;
		var26 += var10 * 2;
		int var38 = var26;
		var26 += var18;
		int var39 = var26;
		var26 += var19;
		int var40 = var26;
		var26 += var20;
		int var41 = var26;
		var26 += var23 * 6;
		int var42 = var26;
		var26 += var24 * 6;
		int var43 = var26;
		var26 += var24 * 6;
		int var44 = var26;
		var26 += var24 * 2;
		int var45 = var26;
		var26 += var24;
		int var46 = var26;
		var26 += var24 * 2 + var25 * 2;
		this.field2522 = var9;
		this.field2526 = var10;
		this.field2527 = var11;
		this.field2523 = new int[var9];
		this.field2524 = new int[var9];
		this.field2532 = new int[var9];
		this.field2542 = new int[var10];
		this.field2528 = new int[var10];
		this.field2529 = new int[var10];
		if (var17 == 1) {
			this.field2544 = new int[var9];
		}

		if (var12 == 1) {
			this.field2530 = new byte[var10];
		}

		if (var13 == 255) {
			this.field2536 = new byte[var10];
		} else {
			this.field2555 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2548 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2543 = new int[var10];
		}

		if (var16 == 1) {
			this.field2535 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field2533 = new byte[var10];
		}

		this.field2534 = new short[var10];
		if (var11 > 0) {
			this.field2539 = new short[var11];
			this.field2540 = new short[var11];
			this.field2549 = new short[var11];
		}

		var2.field5219 = var11;
		var3.field5219 = var38;
		var4.field5219 = var39;
		var5.field5219 = var40;
		var6.field5219 = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;

		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) {
			var52 = var2.method9405();
			var53 = 0;
			if ((var52 & 1) != 0) {
				var53 = var3.method9457();
			}

			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.method9457();
			}

			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.method9457();
			}

			this.field2523[var51] = var53 + var48;
			this.field2524[var51] = var54 + var49;
			this.field2532[var51] = var55 + var50;
			var48 = this.field2523[var51];
			var49 = this.field2524[var51];
			var50 = this.field2532[var51];
			if (var17 == 1) {
				this.field2544[var51] = var6.method9405();
			}
		}

		var2.field5219 = var37;
		var3.field5219 = var28;
		var4.field5219 = var30;
		var5.field5219 = var33;
		var6.field5219 = var31;
		var7.field5219 = var35;
		var8.field5219 = var36;

		for (var51 = 0; var51 < var10; ++var51) {
			this.field2534[var51] = (short)var2.method9407();
			if (var12 == 1) {
				this.field2530[var51] = var3.method9406();
			}

			if (var13 == 255) {
				this.field2536[var51] = var4.method9406();
			}

			if (var14 == 1) {
				this.field2548[var51] = var5.method9406();
			}

			if (var15 == 1) {
				this.field2543[var51] = var6.method9405();
			}

			if (var16 == 1) {
				this.field2535[var51] = (short)(var7.method9407() - 1);
			}

			if (this.field2533 != null && this.field2535[var51] != -1) {
				this.field2533[var51] = (byte)(var8.method9405() - 1);
			}
		}

		var2.field5219 = var34;
		var3.field5219 = var29;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;

		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.method9405();
			if (var56 == 1) {
				var51 = var2.method9457() + var54;
				var52 = var2.method9457() + var51;
				var53 = var2.method9457() + var52;
				var54 = var53;
				this.field2542[var55] = var51;
				this.field2528[var55] = var52;
				this.field2529[var55] = var53;
			}

			if (var56 == 2) {
				var52 = var53;
				var53 = var2.method9457() + var54;
				var54 = var53;
				this.field2542[var55] = var51;
				this.field2528[var55] = var52;
				this.field2529[var55] = var53;
			}

			if (var56 == 3) {
				var51 = var53;
				var53 = var2.method9457() + var54;
				var54 = var53;
				this.field2542[var55] = var51;
				this.field2528[var55] = var52;
				this.field2529[var55] = var53;
			}

			if (var56 == 4) {
				int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.method9457() + var54;
				var54 = var53;
				this.field2542[var55] = var51;
				this.field2528[var55] = var57;
				this.field2529[var55] = var53;
			}
		}

		var2.field5219 = var41;
		var3.field5219 = var42;
		var4.field5219 = var43;
		var5.field5219 = var44;
		var6.field5219 = var45;
		var7.field5219 = var46;

		for (var55 = 0; var55 < var11; ++var55) {
			var56 = this.field2538[var55] & 255;
			if (var56 == 0) {
				this.field2539[var55] = (short)var2.method9407();
				this.field2540[var55] = (short)var2.method9407();
				this.field2549[var55] = (short)var2.method9407();
			}
		}

		var2.field5219 = var26;
		var55 = var2.method9405();
		if (var55 != 0) {
			new Class261();
			var2.method9407();
			var2.method9407();
			var2.method9407();
			var2.method9410();
		}

	}

	@ObfInfo(name = "af", desc = "([B)V")
	public void method4562(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		Class521 var4 = new Class521(var1);
		Class521 var5 = new Class521(var1);
		Class521 var6 = new Class521(var1);
		Class521 var7 = new Class521(var1);
		Class521 var8 = new Class521(var1);
		var4.field5219 = var1.length - 18;
		int var9 = var4.method9407();
		int var10 = var4.method9407();
		int var11 = var4.method9405();
		int var12 = var4.method9405();
		int var13 = var4.method9405();
		int var14 = var4.method9405();
		int var15 = var4.method9405();
		int var16 = var4.method9405();
		int var17 = var4.method9407();
		int var18 = var4.method9407();
		int var19 = var4.method9407();
		int var20 = var4.method9407();
		byte var21 = 0;
		int var45 = var21 + var9;
		int var23 = var45;
		var45 += var10;
		int var24 = var45;
		if (var13 == 255) {
			var45 += var10;
		}

		int var25 = var45;
		if (var15 == 1) {
			var45 += var10;
		}

		int var26 = var45;
		if (var12 == 1) {
			var45 += var10;
		}

		int var27 = var45;
		if (var16 == 1) {
			var45 += var9;
		}

		int var28 = var45;
		if (var14 == 1) {
			var45 += var10;
		}

		int var29 = var45;
		var45 += var20;
		int var30 = var45;
		var45 += var10 * 2;
		int var31 = var45;
		var45 += var11 * 6;
		int var32 = var45;
		var45 += var17;
		int var33 = var45;
		var45 += var18;
		int var10000 = var45 + var19;
		this.field2522 = var9;
		this.field2526 = var10;
		this.field2527 = var11;
		this.field2523 = new int[var9];
		this.field2524 = new int[var9];
		this.field2532 = new int[var9];
		this.field2542 = new int[var10];
		this.field2528 = new int[var10];
		this.field2529 = new int[var10];
		if (var11 > 0) {
			this.field2538 = new byte[var11];
			this.field2539 = new short[var11];
			this.field2540 = new short[var11];
			this.field2549 = new short[var11];
		}

		if (var16 == 1) {
			this.field2544 = new int[var9];
		}

		if (var12 == 1) {
			this.field2530 = new byte[var10];
			this.field2533 = new byte[var10];
			this.field2535 = new short[var10];
		}

		if (var13 == 255) {
			this.field2536 = new byte[var10];
		} else {
			this.field2555 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2548 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2543 = new int[var10];
		}

		this.field2534 = new short[var10];
		var4.field5219 = var21;
		var5.field5219 = var32;
		var6.field5219 = var33;
		var7.field5219 = var45;
		var8.field5219 = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) {
			var39 = var4.method9405();
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.method9457();
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.method9457();
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.method9457();
			}

			this.field2523[var38] = var40 + var35;
			this.field2524[var38] = var41 + var36;
			this.field2532[var38] = var42 + var37;
			var35 = this.field2523[var38];
			var36 = this.field2524[var38];
			var37 = this.field2532[var38];
			if (var16 == 1) {
				this.field2544[var38] = var8.method9405();
			}
		}

		var4.field5219 = var30;
		var5.field5219 = var26;
		var6.field5219 = var24;
		var7.field5219 = var28;
		var8.field5219 = var25;

		for (var38 = 0; var38 < var10; ++var38) {
			this.field2534[var38] = (short)var4.method9407();
			if (var12 == 1) {
				var39 = var5.method9405();
				if ((var39 & 1) == 1) {
					this.field2530[var38] = 1;
					var2 = true;
				} else {
					this.field2530[var38] = 0;
				}

				if ((var39 & 2) == 2) {
					this.field2533[var38] = (byte)(var39 >> 2);
					this.field2535[var38] = this.field2534[var38];
					this.field2534[var38] = 127;
					if (this.field2535[var38] != -1) {
						var3 = true;
					}
				} else {
					this.field2533[var38] = -1;
					this.field2535[var38] = -1;
				}
			}

			if (var13 == 255) {
				this.field2536[var38] = var6.method9406();
			}

			if (var14 == 1) {
				this.field2548[var38] = var7.method9406();
			}

			if (var15 == 1) {
				this.field2543[var38] = var8.method9405();
			}
		}

		var4.field5219 = var29;
		var5.field5219 = var23;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.method9405();
			if (var43 == 1) {
				var38 = var4.method9457() + var41;
				var39 = var4.method9457() + var38;
				var40 = var4.method9457() + var39;
				var41 = var40;
				this.field2542[var42] = var38;
				this.field2528[var42] = var39;
				this.field2529[var42] = var40;
			}

			if (var43 == 2) {
				var39 = var40;
				var40 = var4.method9457() + var41;
				var41 = var40;
				this.field2542[var42] = var38;
				this.field2528[var42] = var39;
				this.field2529[var42] = var40;
			}

			if (var43 == 3) {
				var38 = var40;
				var40 = var4.method9457() + var41;
				var41 = var40;
				this.field2542[var42] = var38;
				this.field2528[var42] = var39;
				this.field2529[var42] = var40;
			}

			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.method9457() + var41;
				var41 = var40;
				this.field2542[var42] = var38;
				this.field2528[var42] = var44;
				this.field2529[var42] = var40;
			}
		}

		var4.field5219 = var31;

		for (var42 = 0; var42 < var11; ++var42) {
			this.field2538[var42] = 0;
			this.field2539[var42] = (short)var4.method9407();
			this.field2540[var42] = (short)var4.method9407();
			this.field2549[var42] = (short)var4.method9407();
		}

		if (this.field2533 != null) {
			boolean var46 = false;

			for (var43 = 0; var43 < var10; ++var43) {
				var44 = this.field2533[var43] & 255;
				if (var44 != 255) {
					if ((this.field2539[var44] & '\uffff') == this.field2542[var43] && (this.field2540[var44] & '\uffff') == this.field2528[var43] && (this.field2549[var44] & '\uffff') == this.field2529[var43]) {
						this.field2533[var43] = -1;
					} else {
						var46 = true;
					}
				}
			}

			if (!var46) {
				this.field2533 = null;
			}
		}

		if (!var3) {
			this.field2535 = null;
		}

		if (!var2) {
			this.field2530 = null;
		}

	}

	@ObfInfo(name = "aa", desc = "(Ljb;I)I")
	public final int method4608(Class236 var1, int var2) {
		int var3 = -1;
		int var4 = var1.field2523[var2];
		int var5 = var1.field2524[var2];
		int var6 = var1.field2532[var2];

		for (int var7 = 0; var7 < this.field2522; ++var7) {
			if (var4 == this.field2523[var7] && var5 == this.field2524[var7] && var6 == this.field2532[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.field2523[this.field2522] = var4;
			this.field2524[this.field2522] = var5;
			this.field2532[this.field2522] = var6;
			if (var1.field2544 != null) {
				this.field2544[this.field2522] = var1.field2544[var2];
			}

			if (var1.field2546 != null) {
				this.field2546[this.field2522] = var1.field2546[var2];
				this.field2547[this.field2522] = var1.field2547[var2];
			}

			var3 = this.field2522++;
		}

		return var3;
	}

	@ObfInfo(name = "at", desc = "()Ljb;")
	public Class236 method4565() {
		Class236 var1 = new Class236();
		if (this.field2530 != null) {
			var1.field2530 = new byte[this.field2526];

			for (int var2 = 0; var2 < this.field2526; ++var2) {
				var1.field2530[var2] = this.field2530[var2];
			}
		}

		var1.field2522 = this.field2522;
		var1.field2526 = this.field2526;
		var1.field2527 = this.field2527;
		var1.field2523 = this.field2523;
		var1.field2524 = this.field2524;
		var1.field2532 = this.field2532;
		var1.field2542 = this.field2542;
		var1.field2528 = this.field2528;
		var1.field2529 = this.field2529;
		var1.field2536 = this.field2536;
		var1.field2548 = this.field2548;
		var1.field2533 = this.field2533;
		var1.field2534 = this.field2534;
		var1.field2535 = this.field2535;
		var1.field2555 = this.field2555;
		var1.field2538 = this.field2538;
		var1.field2539 = this.field2539;
		var1.field2540 = this.field2540;
		var1.field2549 = this.field2549;
		var1.field2544 = this.field2544;
		var1.field2543 = this.field2543;
		var1.field2551 = this.field2551;
		var1.field2545 = this.field2545;
		var1.field2558 = this.field2558;
		var1.field2537 = this.field2537;
		var1.field2556 = this.field2556;
		var1.field2552 = this.field2552;
		return var1;
	}

	@ObfInfo(name = "ab", desc = "([[IIIIZI)Ljb;")
	public Class236 method4566(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method4579();
		int var7 = this.field2519 + var2;
		int var8 = this.field2560 + var2;
		int var9 = this.field2541 + var4;
		int var10 = this.field2557 + var4;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				Class236 var11;
				if (var5) {
					var11 = new Class236();
					var11.field2522 = this.field2522;
					var11.field2526 = this.field2526;
					var11.field2527 = this.field2527;
					var11.field2523 = this.field2523;
					var11.field2532 = this.field2532;
					var11.field2542 = this.field2542;
					var11.field2528 = this.field2528;
					var11.field2529 = this.field2529;
					var11.field2530 = this.field2530;
					var11.field2536 = this.field2536;
					var11.field2548 = this.field2548;
					var11.field2533 = this.field2533;
					var11.field2534 = this.field2534;
					var11.field2535 = this.field2535;
					var11.field2555 = this.field2555;
					var11.field2538 = this.field2538;
					var11.field2539 = this.field2539;
					var11.field2540 = this.field2540;
					var11.field2549 = this.field2549;
					var11.field2544 = this.field2544;
					var11.field2543 = this.field2543;
					var11.field2551 = this.field2551;
					var11.field2545 = this.field2545;
					var11.field2556 = this.field2556;
					var11.field2552 = this.field2552;
					var11.field2524 = new int[var11.field2522];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.field2522; ++var12) {
						var13 = this.field2523[var12] + var2;
						var14 = this.field2532[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field2524[var12] = this.field2524[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field2522; ++var12) {
						var13 = (-this.field2524[var12] << 16) / super.field2696;
						if (var13 < var6) {
							var14 = this.field2523[var12] + var2;
							var15 = this.field2532[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field2524[var12] = this.field2524[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method4578();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfInfo(name = "ac", desc = "()V")
	public void method4574() {
		int[] var1;
		int var2;
		int var10002;
		int var3;
		int var4;
		if (this.field2544 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field2522; ++var3) {
				var4 = this.field2544[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field2551 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field2551[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field2522; this.field2551[var4][var1[var4]++] = var3++) {
				var4 = this.field2544[var3];
			}

			this.field2544 = null;
		}

		if (this.field2543 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field2526; ++var3) {
				var4 = this.field2543[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field2545 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field2545[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field2526; this.field2545[var4][var1[var4]++] = var3++) {
				var4 = this.field2543[var3];
			}

			this.field2543 = null;
		}

	}

	@ObfInfo(name = "ao", desc = "()V")
	public void method4582() {
		for (int var1 = 0; var1 < this.field2522; ++var1) {
			int var2 = this.field2523[var1];
			this.field2523[var1] = this.field2532[var1];
			this.field2532[var1] = -var2;
		}

		this.method4578();
	}

	@ObfInfo(name = "aq", desc = "()V")
	public void method4569() {
		for (int var1 = 0; var1 < this.field2522; ++var1) {
			this.field2523[var1] = -this.field2523[var1];
			this.field2532[var1] = -this.field2532[var1];
		}

		this.method4578();
	}

	@ObfInfo(name = "ap", desc = "()V")
	public void method4570() {
		for (int var1 = 0; var1 < this.field2522; ++var1) {
			int var2 = this.field2532[var1];
			this.field2532[var1] = this.field2523[var1];
			this.field2523[var1] = -var2;
		}

		this.method4578();
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public void method4597(int var1) {
		int var2 = field2562[var1];
		int var3 = field2563[var1];

		for (int var4 = 0; var4 < this.field2522; ++var4) {
			int var5 = this.field2532[var4] * var2 + this.field2523[var4] * var3 >> 16;
			this.field2532[var4] = this.field2532[var4] * var3 - this.field2523[var4] * var2 >> 16;
			this.field2523[var4] = var5;
		}

		this.method4578();
	}

	@ObfInfo(name = "ax", desc = "(III)V")
	public void method4558(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2522; ++var4) {
			int[] var10000 = this.field2523;
			var10000[var4] += var1;
			var10000 = this.field2524;
			var10000[var4] += var2;
			var10000 = this.field2532;
			var10000[var4] += var3;
		}

		this.method4578();
	}

	@ObfInfo(name = "ay", desc = "(SS)V")
	public void method4573(short var1, short var2) {
		for (int var3 = 0; var3 < this.field2526; ++var3) {
			if (this.field2534[var3] == var1) {
				this.field2534[var3] = var2;
			}
		}

	}

	@ObfInfo(name = "au", desc = "(SS)V")
	public void method4600(short var1, short var2) {
		if (this.field2535 != null) {
			for (int var3 = 0; var3 < this.field2526; ++var3) {
				if (this.field2535[var3] == var1) {
					this.field2535[var3] = var2;
				}
			}

		}
	}

	@ObfInfo(name = "as", desc = "()V")
	public void method4575() {
		int var1;
		for (var1 = 0; var1 < this.field2522; ++var1) {
			this.field2532[var1] = -this.field2532[var1];
		}

		for (var1 = 0; var1 < this.field2526; ++var1) {
			int var2 = this.field2542[var1];
			this.field2542[var1] = this.field2529[var1];
			this.field2529[var1] = var2;
		}

		this.method4578();
	}

	@ObfInfo(name = "aw", desc = "(III)V")
	public void method4576(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2522; ++var4) {
			this.field2523[var4] = this.field2523[var4] * var1 / 128;
			this.field2524[var4] = this.field2524[var4] * var2 / 128;
			this.field2532[var4] = this.field2532[var4] * var3 / 128;
		}

		this.method4578();
	}

	@ObfInfo(name = "ad", desc = "()V")
	public void method4563() {
		if (this.field2558 == null) {
			this.field2558 = new Class273[this.field2522];

			int var1;
			for (var1 = 0; var1 < this.field2522; ++var1) {
				this.field2558[var1] = new Class273();
			}

			for (var1 = 0; var1 < this.field2526; ++var1) {
				int var2 = this.field2542[var1];
				int var3 = this.field2528[var1];
				int var4 = this.field2529[var1];
				int var5 = this.field2523[var3] - this.field2523[var2];
				int var6 = this.field2524[var3] - this.field2524[var2];
				int var7 = this.field2532[var3] - this.field2532[var2];
				int var8 = this.field2523[var4] - this.field2523[var2];
				int var9 = this.field2524[var4] - this.field2524[var2];
				int var10 = this.field2532[var4] - this.field2532[var2];
				int var11 = var10 * var6 - var9 * var7;
				int var12 = var8 * var7 - var10 * var5;

				int var13;
				for (var13 = var9 * var5 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
					var11 >>= 1;
					var12 >>= 1;
				}

				int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
				if (var14 <= 0) {
					var14 = 1;
				}

				var11 = var11 * 256 / var14;
				var12 = var12 * 256 / var14;
				var13 = var13 * 256 / var14;
				byte var15;
				if (this.field2530 == null) {
					var15 = 0;
				} else {
					var15 = this.field2530[var1];
				}

				if (var15 == 0) {
					Class273 var16 = this.field2558[var2];
					var16.field3021 += var11;
					var16.field3020 += var12;
					var16.field3022 += var13;
					++var16.field3019;
					var16 = this.field2558[var3];
					var16.field3021 += var11;
					var16.field3020 += var12;
					var16.field3022 += var13;
					++var16.field3019;
					var16 = this.field2558[var4];
					var16.field3021 += var11;
					var16.field3020 += var12;
					var16.field3022 += var13;
					++var16.field3019;
				} else if (var15 == 1) {
					if (this.field2537 == null) {
						this.field2537 = new Class237[this.field2526];
					}

					Class237 var17 = this.field2537[var1] = new Class237();
					var17.field2564 = var11;
					var17.field2565 = var12;
					var17.field2566 = var13;
				}
			}

		}
	}

	@ObfInfo(name = "ai", desc = "()V")
	public void method4578() {
		this.field2558 = null;
		this.field2550 = null;
		this.field2537 = null;
		this.field2553 = false;
	}

	@ObfInfo(name = "an", desc = "()V")
	public void method4579() {
		if (!this.field2553) {
			super.field2696 = 0;
			this.field2554 = 0;
			this.field2519 = 999999;
			this.field2560 = -999999;
			this.field2557 = -99999;
			this.field2541 = 99999;

			for (int var1 = 0; var1 < this.field2522; ++var1) {
				int var2 = this.field2523[var1];
				int var3 = this.field2524[var1];
				int var4 = this.field2532[var1];
				if (var2 < this.field2519) {
					this.field2519 = var2;
				}

				if (var2 > this.field2560) {
					this.field2560 = var2;
				}

				if (var4 < this.field2541) {
					this.field2541 = var4;
				}

				if (var4 > this.field2557) {
					this.field2557 = var4;
				}

				if (-var3 > super.field2696) {
					super.field2696 = -var3;
				}

				if (var3 > this.field2554) {
					this.field2554 = var3;
				}
			}

			this.field2553 = true;
		}
	}

	@ObfInfo(name = "ar", desc = "(IIIII)Lkb;")
	public final Class262 method4572(int var1, int var2, int var3, int var4, int var5) {
		this.method4563();
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
		int var7 = var6 * var2 >> 8;
		Class262 var8 = new Class262();
		var8.field2857 = new int[this.field2526];
		var8.field2858 = new int[this.field2526];
		var8.field2859 = new int[this.field2526];
		if (this.field2527 > 0 && this.field2533 != null) {
			int[] var9 = new int[this.field2527];

			int var10;
			for (var10 = 0; var10 < this.field2526; ++var10) {
				if (this.field2533[var10] != -1) {
					++var9[this.field2533[var10] & 255];
				}
			}

			var8.field2904 = 0;

			for (var10 = 0; var10 < this.field2527; ++var10) {
				if (var9[var10] > 0 && this.field2538[var10] == 0) {
					++var8.field2904;
				}
			}

			var8.field2866 = new int[var8.field2904];
			var8.field2911 = new int[var8.field2904];
			var8.field2908 = new int[var8.field2904];
			var10 = 0;

			int var11;
			for (var11 = 0; var11 < this.field2527; ++var11) {
				if (var9[var11] > 0 && this.field2538[var11] == 0) {
					var8.field2866[var10] = this.field2539[var11] & '\uffff';
					var8.field2911[var10] = this.field2540[var11] & '\uffff';
					var8.field2908[var10] = this.field2549[var11] & '\uffff';
					var9[var11] = var10++;
				} else {
					var9[var11] = -1;
				}
			}

			var8.field2862 = new byte[this.field2526];

			for (var11 = 0; var11 < this.field2526; ++var11) {
				if (this.field2533[var11] != -1) {
					var8.field2862[var11] = (byte)var9[this.field2533[var11] & 255];
				} else {
					var8.field2862[var11] = -1;
				}
			}
		}

		for (int var16 = 0; var16 < this.field2526; ++var16) {
			byte var17;
			if (this.field2530 == null) {
				var17 = 0;
			} else {
				var17 = this.field2530[var16];
			}

			byte var18;
			if (this.field2548 == null) {
				var18 = 0;
			} else {
				var18 = this.field2548[var16];
			}

			short var12;
			if (this.field2535 == null) {
				var12 = -1;
			} else {
				var12 = this.field2535[var16];
			}

			if (var18 == -2) {
				var17 = 3;
			}

			if (var18 == -1) {
				var17 = 2;
			}

			Class273 var13;
			int var14;
			Class237 var19;
			if (var12 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = this.field2537[var16];
						var14 = var1 + (var3 * var19.field2564 + var4 * var19.field2565 + var5 * var19.field2566) / (var7 + var7 / 2);
						var8.field2857[var16] = method4593(this.field2534[var16] & '\uffff', var14);
						var8.field2859[var16] = -1;
					} else if (var17 == 3) {
						var8.field2857[var16] = 128;
						var8.field2859[var16] = -1;
					} else {
						var8.field2859[var16] = -2;
					}
				} else {
					int var15 = this.field2534[var16] & '\uffff';
					if (this.field2550 != null && this.field2550[this.field2542[var16]] != null) {
						var13 = this.field2550[this.field2542[var16]];
					} else {
						var13 = this.field2558[this.field2542[var16]];
					}

					var14 = var1 + (var3 * var13.field3021 + var4 * var13.field3020 + var5 * var13.field3022) / (var7 * var13.field3019);
					var8.field2857[var16] = method4593(var15, var14);
					if (this.field2550 != null && this.field2550[this.field2528[var16]] != null) {
						var13 = this.field2550[this.field2528[var16]];
					} else {
						var13 = this.field2558[this.field2528[var16]];
					}

					var14 = var1 + (var3 * var13.field3021 + var4 * var13.field3020 + var5 * var13.field3022) / (var7 * var13.field3019);
					var8.field2858[var16] = method4593(var15, var14);
					if (this.field2550 != null && this.field2550[this.field2529[var16]] != null) {
						var13 = this.field2550[this.field2529[var16]];
					} else {
						var13 = this.field2558[this.field2529[var16]];
					}

					var14 = var1 + (var3 * var13.field3021 + var4 * var13.field3020 + var5 * var13.field3022) / (var7 * var13.field3019);
					var8.field2859[var16] = method4593(var15, var14);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = this.field2537[var16];
					var14 = var1 + (var3 * var19.field2564 + var4 * var19.field2565 + var5 * var19.field2566) / (var7 + var7 / 2);
					var8.field2857[var16] = method4612(var14);
					var8.field2859[var16] = -1;
				} else {
					var8.field2859[var16] = -2;
				}
			} else {
				if (this.field2550 != null && this.field2550[this.field2542[var16]] != null) {
					var13 = this.field2550[this.field2542[var16]];
				} else {
					var13 = this.field2558[this.field2542[var16]];
				}

				var14 = var1 + (var3 * var13.field3021 + var4 * var13.field3020 + var5 * var13.field3022) / (var7 * var13.field3019);
				var8.field2857[var16] = method4612(var14);
				if (this.field2550 != null && this.field2550[this.field2528[var16]] != null) {
					var13 = this.field2550[this.field2528[var16]];
				} else {
					var13 = this.field2558[this.field2528[var16]];
				}

				var14 = var1 + (var3 * var13.field3021 + var4 * var13.field3020 + var5 * var13.field3022) / (var7 * var13.field3019);
				var8.field2858[var16] = method4612(var14);
				if (this.field2550 != null && this.field2550[this.field2529[var16]] != null) {
					var13 = this.field2550[this.field2529[var16]];
				} else {
					var13 = this.field2558[this.field2529[var16]];
				}

				var14 = var1 + (var3 * var13.field3021 + var4 * var13.field3020 + var5 * var13.field3022) / (var7 * var13.field3019);
				var8.field2859[var16] = method4612(var14);
			}
		}

		this.method4574();
		var8.field2849 = this.field2522;
		var8.field2850 = this.field2523;
		var8.field2907 = this.field2524;
		var8.field2852 = this.field2532;
		var8.field2853 = this.field2526;
		var8.field2854 = this.field2542;
		var8.field2855 = this.field2528;
		var8.field2856 = this.field2529;
		var8.field2864 = this.field2536;
		var8.field2861 = this.field2548;
		var8.field2890 = this.field2555;
		var8.field2869 = this.field2551;
		var8.field2898 = this.field2545;
		var8.field2863 = this.field2535;
		var8.field2871 = this.field2546;
		var8.field2872 = this.field2547;
		return var8;
	}

	@ObfInfo(name = "ak", desc = "(Lor;II)Ljb;")
	public static Class236 method4594(Class382 var0, int var1, int var2) {
		byte[] var3 = var0.method7216(var1, var2);
		return var3 == null ? null : new Class236(var3);
	}

	@ObfInfo(name = "am", desc = "(Ljb;Ljb;IIIZ)V")
	public static void method4580(Class236 var0, Class236 var1, int var2, int var3, int var4, boolean var5) {
		var0.method4579();
		var0.method4563();
		var1.method4579();
		var1.method4563();
		++field2561;
		int var6 = 0;
		int[] var7 = var1.field2523;
		int var8 = var1.field2522;

		int var9;
		for (var9 = 0; var9 < var0.field2522; ++var9) {
			Class273 var10 = var0.field2558[var9];
			if (var10.field3019 != 0) {
				int var11 = var0.field2524[var9] - var3;
				if (var11 <= var1.field2554) {
					int var12 = var0.field2523[var9] - var2;
					if (var12 >= var1.field2519 && var12 <= var1.field2560) {
						int var13 = var0.field2532[var9] - var4;
						if (var13 >= var1.field2541 && var13 <= var1.field2557) {
							for (int var14 = 0; var14 < var8; ++var14) {
								Class273 var15 = var1.field2558[var14];
								if (var12 == var7[var14] && var13 == var1.field2532[var14] && var11 == var1.field2524[var14] && var15.field3019 != 0) {
									if (var0.field2550 == null) {
										var0.field2550 = new Class273[var0.field2522];
									}

									if (var1.field2550 == null) {
										var1.field2550 = new Class273[var8];
									}

									Class273 var16 = var0.field2550[var9];
									if (var16 == null) {
										var16 = var0.field2550[var9] = new Class273(var10);
									}

									Class273 var17 = var1.field2550[var14];
									if (var17 == null) {
										var17 = var1.field2550[var14] = new Class273(var15);
									}

									var16.field3021 += var15.field3021;
									var16.field3020 += var15.field3020;
									var16.field3022 += var15.field3022;
									var16.field3019 += var15.field3019;
									var17.field3021 += var10.field3021;
									var17.field3020 += var10.field3020;
									var17.field3022 += var10.field3022;
									var17.field3019 += var10.field3019;
									++var6;
									field2559[var9] = field2561;
									field2525[var14] = field2561;
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) {
			for (var9 = 0; var9 < var0.field2526; ++var9) {
				if (field2559[var0.field2542[var9]] == field2561 && field2559[var0.field2528[var9]] == field2561 && field2559[var0.field2529[var9]] == field2561) {
					if (var0.field2530 == null) {
						var0.field2530 = new byte[var0.field2526];
					}

					var0.field2530[var9] = 2;
				}
			}

			for (var9 = 0; var9 < var1.field2526; ++var9) {
				if (field2525[var1.field2542[var9]] == field2561 && field2525[var1.field2528[var9]] == field2561 && field2525[var1.field2529[var9]] == field2561) {
					if (var1.field2530 == null) {
						var1.field2530 = new byte[var1.field2526];
					}

					var1.field2530[var9] = 2;
				}
			}

		}
	}

	@ObfInfo(name = "ag", desc = "(II)I")
	public static int method4593(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfInfo(name = "bs", desc = "(I)I")
	public static int method4612(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}
}
