import java.util.ArrayList;
import java.util.BitSet;

public class Class333 extends Class506 {
	public Class331[] field3469;
	public Class63[] field3466;
	public byte[] field3468;
	public byte[] field3471;
	public byte[] field3473;
	public int field3465;
	public int[] field3470;
	public ArrayList field3472;
	public short[] field3467;

	public Class333(byte[] var1) {
		this.field3472 = new ArrayList(8);
		this.field3466 = new Class63[128];
		this.field3467 = new short[128];
		this.field3468 = new byte[128];
		this.field3473 = new byte[128];
		this.field3469 = new Class331[128];
		this.field3471 = new byte[128];
		this.field3470 = new int[128];
		Class521 var2 = new Class521(var1);

		int var3;
		for (var3 = 0; 0 != var2.field5221[var2.field5219 + var3]; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.method9406();
		}

		++var2.field5219;
		++var3;
		var5 = var2.field5219;
		var2.field5219 += var3;

		int var6;
		for (var6 = 0; var2.field5221[var2.field5219 + var6] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.method9406();
		}

		++var2.field5219;
		++var6;
		var8 = var2.field5219;
		var2.field5219 += var6;

		int var9;
		for (var9 = 0; var2.field5221[var2.field5219 + var9] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.method9406();
		}

		++var2.field5219;
		++var9;
		byte[] var36 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var36[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var15 = var2.method9405();
				if (var15 == 0) {
					var13 = var12++;
				} else {
					if (var15 <= var13) {
						--var15;
					}

					var13 = var15;
				}

				var36[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		Class331[] var37 = new Class331[var12];

		Class331 var38;
		for (var14 = 0; var14 < var37.length; ++var14) {
			var38 = var37[var14] = new Class331();
			int var16 = var2.method9405();
			if (var16 > 0) {
				var38.field3447 = new byte[var16 * 2];
			}

			var16 = var2.method9405();
			if (var16 > 0) {
				var38.field3444 = new byte[var16 * 2 + 2];
				var38.field3444[1] = 64;
			}
		}

		var14 = var2.method9405();
		byte[] var39 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.method9405();
		byte[] var40 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; 0 != var2.field5221[var2.field5219 + var17]; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.method9406();
		}

		++var2.field5219;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.method9405();
			this.field3467[var20] = (short)var19;
		}

		var19 = 0;

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.method9405();
			var48 = this.field3467;
			var48[var20] = (short)(var48[var20] + (var19 << 8));
		}

		var20 = 0;
		int var21 = 0;
		int var22 = 0;

		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				var22 = var2.method9424();
			}

			var48 = this.field3467;
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field3470[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field3470[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.field5221[var5++] - 1;
				}

				this.field3471[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (0 != this.field3470[var25]) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.field5221[var8++] + 16 << 2;
				}

				this.field3473[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		Class331 var42 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field3470[var26] != 0) {
				if (var20 == 0) {
					var42 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field3469[var26] = var42;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				if (this.field3470[var27] > 0) {
					var26 = var2.method9405() + 1;
				}
			}

			this.field3468[var27] = (byte)var26;
			--var20;
		}

		this.field3465 = var2.method9405() + 1;

		Class331 var28;
		int var29;
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3447 != null) {
				for (var29 = 1; var29 < var28.field3447.length; var29 += 2) {
					var28.field3447[var29] = var2.method9406();
				}
			}

			if (var28.field3444 != null) {
				for (var29 = 3; var29 < var28.field3444.length - 2; var29 += 2) {
					var28.field3444[var29] = var2.method9406();
				}
			}
		}

		if (var39 != null) {
			for (var27 = 1; var27 < var39.length; var27 += 2) {
				var39[var27] = var2.method9406();
			}
		}

		if (var40 != null) {
			for (var27 = 1; var27 < var40.length; var27 += 2) {
				var40[var27] = var2.method9406();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3444 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field3444.length; var29 += 2) {
					var19 = var19 + 1 + var2.method9405();
					var28.field3444[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3447 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field3447.length; var29 += 2) {
					var19 = var19 + 1 + var2.method9405();
					var28.field3447[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var45;
		byte var47;
		if (var39 != null) {
			var19 = var2.method9405();
			var39[0] = (byte)var19;

			for (var27 = 2; var27 < var39.length; var27 += 2) {
				var19 = var19 + 1 + var2.method9405();
				var39[var27] = (byte)var19;
			}

			var47 = var39[0];
			byte var43 = var39[1];

			for (var29 = 0; var29 < var47; ++var29) {
				this.field3468[var29] = (byte)(32 + this.field3468[var29] * var43 >> 6);
			}

			for (var29 = 2; var29 < var39.length; var29 += 2) {
				var30 = var39[var29];
				byte var31 = var39[var29 + 1];
				var32 = var43 * (var30 - var47) + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = Class319.method2738(var32, var30 - var47);
					this.field3468[var33] = (byte)(this.field3468[var33] * var34 + 32 >> 6);
					var32 += var31 - var43;
				}

				var47 = var30;
				var43 = var31;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				this.field3468[var45] = (byte)(32 + this.field3468[var45] * var43 >> 6);
			}

			var38 = null;
		}

		if (var40 != null) {
			var19 = var2.method9405();
			var40[0] = (byte)var19;

			for (var27 = 2; var27 < var40.length; var27 += 2) {
				var19 = var19 + 1 + var2.method9405();
				var40[var27] = (byte)var19;
			}

			var47 = var40[0];
			int var44 = var40[1] << 1;

			for (var29 = 0; var29 < var47; ++var29) {
				var45 = (this.field3473[var29] & 255) + var44;
				if (var45 < 0) {
					var45 = 0;
				}

				if (var45 > 128) {
					var45 = 128;
				}

				this.field3473[var29] = (byte)var45;
			}

			int var46;
			for (var29 = 2; var29 < var40.length; var29 += 2) {
				var30 = var40[var29];
				var46 = var40[var29 + 1] << 1;
				var32 = (var30 - var47) / 2 + (var30 - var47) * var44;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = Class319.method2738(var32, var30 - var47);
					int var35 = (this.field3473[var33] & 255) + var34;
					if (var35 < 0) {
						var35 = 0;
					}

					if (var35 > 128) {
						var35 = 128;
					}

					this.field3473[var33] = (byte)var35;
					var32 += var46 - var44;
				}

				var47 = var30;
				var44 = var46;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				var46 = var44 + (this.field3473[var45] & 255);
				if (var46 < 0) {
					var46 = 0;
				}

				if (var46 > 128) {
					var46 = 128;
				}

				this.field3473[var45] = (byte)var46;
			}

			Object var41 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3445 = var2.method9405();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3447 != null) {
				var28.field3446 = var2.method9405();
			}

			if (var28.field3444 != null) {
				var28.field3448 = var2.method9405();
			}

			if (var28.field3445 > 0) {
				var28.field3451 = var2.method9405();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3450 = var2.method9405();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3450 > 0) {
				var28.field3449 = var2.method9405();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3449 > 0) {
				var28.field3443 = var2.method9405();
			}
		}

	}

	public boolean method6302(Class43 var1, BitSet var2) {
		boolean var4 = true;
		int var5 = 0;
		Class63 var6 = new Class63();

		int var8;
		for (int var7 = var2.nextSetBit(0); var7 != -1; var7 = var2.nextSetBit(var8)) {
			var8 = var2.nextClearBit(var7);

			for (int var9 = var7; var9 < var8; ++var9) {
				if (var2.get(var9)) {
					int var10 = this.field3470[var9];
					if (var10 != 0) {
						if (var10 != var5) {
							var5 = var10--;
							if (0 == (var10 & 1)) {
								var6 = new Class63(var1.method839(var10 >> 2));
							} else {
								var6 = var1.method826(var10 >> 2);
							}

							if (var6.method1116()) {
								var4 = false;
							} else {
								this.field3472.add(this.field3472.size(), var6);
							}
						}

						if (!var6.method1116()) {
							this.field3466[var9] = var6;
							this.field3470[var9] = 0;
						}
					}
				}
			}
		}

		return var4;
	}

	public void method6303() {
		this.field3470 = null;
	}
}
