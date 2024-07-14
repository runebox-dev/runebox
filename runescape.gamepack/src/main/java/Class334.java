import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.BitSet;

@ObfInfo(name = "mv")
public class Class334 extends Class520 {
	@ObfInfo(name = "aj", desc = "[Lml;")
	public Class324[] field3645;
	@ObfInfo(name = "ag", desc = "[Lcv;")
	public Class74[] field3647;
	@ObfInfo(name = "an", desc = "[B")
	public byte[] field3646;
	@ObfInfo(name = "ap", desc = "[B")
	public byte[] field3649;
	@ObfInfo(name = "av", desc = "[B")
	public byte[] field3651;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1461697003)
	public int field3650;
	@ObfInfo(name = "ai", desc = "[I")
	public int[] field3654;
	@ObfInfo(name = "ab", desc = "Ljava/util/ArrayList;")
	public ArrayList field3653;
	@ObfInfo(name = "ak", desc = "[S")
	public short[] field3648;

	public Class334(byte[] var1) {
		this.field3653 = new ArrayList(8);
		this.field3647 = new Class74[128];
		this.field3648 = new short[128];
		this.field3649 = new byte[128];
		this.field3646 = new byte[128];
		this.field3645 = new Class324[128];
		this.field3651 = new byte[128];
		this.field3654 = new int[128];
		Class562 var2 = new Class562(var1);

		int var3;
		for (var3 = 0; var2.field5472[var2.field5471 + var3] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.method9955();
		}

		++var2.field5471;
		++var3;
		var5 = var2.field5471;
		var2.field5471 += var3;

		int var6;
		for (var6 = 0; var2.field5472[var2.field5471 + var6] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.method9955();
		}

		++var2.field5471;
		++var6;
		var8 = var2.field5471;
		var2.field5471 += var6;

		int var9;
		for (var9 = 0; var2.field5472[var2.field5471 + var9] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.method9955();
		}

		++var2.field5471;
		++var9;
		byte[] var36 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var36[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var15 = var2.method9902();
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

		Class324[] var37 = new Class324[var12];

		Class324 var38;
		for (var14 = 0; var14 < var37.length; ++var14) {
			var38 = var37[var14] = new Class324();
			int var16 = var2.method9902();
			if (var16 > 0) {
				var38.field3487 = new byte[var16 * 2];
			}

			var16 = var2.method9902();
			if (var16 > 0) {
				var38.field3483 = new byte[var16 * 2 + 2];
				var38.field3483[1] = 64;
			}
		}

		var14 = var2.method9902();
		byte[] var39 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.method9902();
		byte[] var40 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.field5472[var2.field5471 + var17] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.method9955();
		}

		++var2.field5471;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.method9902();
			this.field3648[var20] = (short)var19;
		}

		var19 = 0;

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.method9902();
			var48 = this.field3648;
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

				var22 = var2.method9948();
			}

			var48 = this.field3648;
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field3654[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field3654[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.field5472[var5++] - 1;
				}

				this.field3651[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field3654[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.field5472[var8++] + 16 << 2;
				}

				this.field3646[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		Class324 var42 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field3654[var26] != 0) {
				if (var20 == 0) {
					var42 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field3645[var26] = var42;
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

				if (this.field3654[var27] > 0) {
					var26 = var2.method9902() + 1;
				}
			}

			this.field3649[var27] = (byte)var26;
			--var20;
		}

		this.field3650 = var2.method9902() + 1;

		Class324 var28;
		int var29;
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3487 != null) {
				for (var29 = 1; var29 < var28.field3487.length; var29 += 2) {
					var28.field3487[var29] = var2.method9955();
				}
			}

			if (var28.field3483 != null) {
				for (var29 = 3; var29 < var28.field3483.length - 2; var29 += 2) {
					var28.field3483[var29] = var2.method9955();
				}
			}
		}

		if (var39 != null) {
			for (var27 = 1; var27 < var39.length; var27 += 2) {
				var39[var27] = var2.method9955();
			}
		}

		if (var40 != null) {
			for (var27 = 1; var27 < var40.length; var27 += 2) {
				var40[var27] = var2.method9955();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3483 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field3483.length; var29 += 2) {
					var19 = var19 + 1 + var2.method9902();
					var28.field3483[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3487 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field3487.length; var29 += 2) {
					var19 = var19 + 1 + var2.method9902();
					var28.field3487[var29] = (byte)var19;
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
			var19 = var2.method9902();
			var39[0] = (byte)var19;

			for (var27 = 2; var27 < var39.length; var27 += 2) {
				var19 = var19 + 1 + var2.method9902();
				var39[var27] = (byte)var19;
			}

			var47 = var39[0];
			byte var43 = var39[1];

			for (var29 = 0; var29 < var47; ++var29) {
				this.field3649[var29] = (byte)(this.field3649[var29] * var43 + 32 >> 6);
			}

			for (var29 = 2; var29 < var39.length; var29 += 2) {
				var30 = var39[var29];
				byte var31 = var39[var29 + 1];
				var32 = (var30 - var47) / 2 + (var30 - var47) * var43;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = Class337.method4003(var32, var30 - var47);
					this.field3649[var33] = (byte)(this.field3649[var33] * var34 + 32 >> 6);
					var32 += var31 - var43;
				}

				var47 = var30;
				var43 = var31;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				this.field3649[var45] = (byte)(this.field3649[var45] * var43 + 32 >> 6);
			}

			var38 = null;
		}

		if (var40 != null) {
			var19 = var2.method9902();
			var40[0] = (byte)var19;

			for (var27 = 2; var27 < var40.length; var27 += 2) {
				var19 = var19 + 1 + var2.method9902();
				var40[var27] = (byte)var19;
			}

			var47 = var40[0];
			int var44 = var40[1] << 1;

			for (var29 = 0; var29 < var47; ++var29) {
				var45 = (this.field3646[var29] & 255) + var44;
				if (var45 < 0) {
					var45 = 0;
				}

				if (var45 > 128) {
					var45 = 128;
				}

				this.field3646[var29] = (byte)var45;
			}

			int var46;
			for (var29 = 2; var29 < var40.length; var29 += 2) {
				var30 = var40[var29];
				var46 = var40[var29 + 1] << 1;
				var32 = (var30 - var47) / 2 + (var30 - var47) * var44;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = Class337.method4003(var32, var30 - var47);
					int var35 = (this.field3646[var33] & 255) + var34;
					if (var35 < 0) {
						var35 = 0;
					}

					if (var35 > 128) {
						var35 = 128;
					}

					this.field3646[var33] = (byte)var35;
					var32 += var46 - var44;
				}

				var47 = var30;
				var44 = var46;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				var46 = (this.field3646[var45] & 255) + var44;
				if (var46 < 0) {
					var46 = 0;
				}

				if (var46 > 128) {
					var46 = 128;
				}

				this.field3646[var45] = (byte)var46;
			}

			Object var41 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3477 = var2.method9902();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3487 != null) {
				var28.field3481 = var2.method9902();
			}

			if (var28.field3483 != null) {
				var28.field3479 = var2.method9902();
			}

			if (var28.field3477 > 0) {
				var28.field3480 = var2.method9902();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3482 = var2.method9902();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3482 > 0) {
				var28.field3476 = var2.method9902();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3476 > 0) {
				var28.field3478 = var2.method9902();
			}
		}

	}

	@ObfInfo(name = "ad", desc = "(Lbh;Ljava/util/BitSet;I)Z", opaque = "-406537006")
	public boolean method6357(Class34 var1, BitSet var2) {
		boolean var4 = true;
		int var5 = 0;
		Class74 var6 = new Class74();

		int var8;
		for (int var7 = var2.nextSetBit(0); var7 != -1; var7 = var2.nextSetBit(var8)) {
			var8 = var2.nextClearBit(var7);

			for (int var9 = var7; var9 < var8; ++var9) {
				if (var2.get(var9)) {
					int var10 = this.field3654[var9];
					if (var10 != 0) {
						if (var5 != var10) {
							var5 = var10--;
							if ((var10 & 1) == 0) {
								var6 = new Class74(var1.method452(var10 >> 2));
							} else {
								var6 = var1.method456(var10 >> 2);
							}

							if (var6.method2147()) {
								var4 = false;
							} else {
								this.field3653.add(this.field3653.size(), var6);
							}
						}

						if (!var6.method2147()) {
							this.field3647[var9] = var6;
							this.field3654[var9] = 0;
						}
					}
				}
			}
		}

		return var4;
	}

	@ObfInfo(name = "ag", desc = "(I)V")
	public void method6358() {
		this.field3654 = null;
	}

	@ObfInfo(owner = "bg", name = "aq", desc = "(Lok;II)Lmv;", opaque = "1882744642")
	public static Class334 method450(Class375 var0, int var1) {
		byte[] var3 = var0.method7139(var1);
		return var3 == null ? null : new Class334(var3);
	}
}
