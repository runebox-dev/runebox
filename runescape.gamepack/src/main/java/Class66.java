import io.runebox.ObfInfo;

@ObfInfo(name = "cn")
public class Class66 extends Class506 {
	@ObfInfo(name = "aq", desc = "[Lbb;")
	public static Class28[] field810;
	@ObfInfo(name = "av", desc = "[Lbj;")
	public static Class36[] field803;
	@ObfInfo(name = "ah", desc = "[Lbx;")
	public static Class50[] field808;
	@ObfInfo(name = "at", desc = "Lci;")
	public static Class61 field818;
	@ObfInfo(name = "ao", desc = "[Lcw;")
	public static Class75[] field807;
	@ObfInfo(name = "ax", desc = "Z")
	public static boolean field806;
	@ObfInfo(name = "ap", desc = "[Z")
	public static boolean[] field811;
	@ObfInfo(name = "am", desc = "[F")
	public static float[] field809;
	@ObfInfo(name = "ai", desc = "[F")
	public static float[] field819;
	@ObfInfo(name = "an", desc = "[F")
	public static float[] field820;
	@ObfInfo(name = "ar", desc = "[F")
	public static float[] field822;
	@ObfInfo(name = "ag", desc = "[F")
	public static float[] field823;
	@ObfInfo(name = "bs", desc = "[F")
	public static float[] field824;
	@ObfInfo(name = "ab", desc = "I")
	public static int field805;
	@ObfInfo(name = "ac", desc = "I")
	public static int field828;
	@ObfInfo(name = "ae", desc = "[I")
	public static int[] field812;
	@ObfInfo(name = "bo", desc = "[I")
	public static int[] field813;
	@ObfInfo(name = "bf", desc = "[I")
	public static int[] field825;
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field816;
	@ObfInfo(name = "aw", desc = "Z")
	public boolean field817;
	@ObfInfo(name = "bi", desc = "[B")
	public byte[] field827;
	@ObfInfo(name = "ak", desc = "[[B")
	public byte[][] field804;
	@ObfInfo(name = "ad", desc = "[F")
	public float[] field814;
	@ObfInfo(name = "ay", desc = "[F")
	public float[] field826;
	@ObfInfo(name = "bt", desc = "I")
	public int field798;
	@ObfInfo(name = "al", desc = "I")
	public int field799;
	@ObfInfo(name = "aj", desc = "I")
	public int field800;
	@ObfInfo(name = "az", desc = "I")
	public int field801;
	@ObfInfo(name = "af", desc = "I")
	public int field802;
	@ObfInfo(name = "au", desc = "I")
	public int field815;
	@ObfInfo(name = "as", desc = "I")
	public int field821;
	@ObfInfo(name = "bn", desc = "I")
	public int field829;

	static {
		field818 = new Class61();
		field806 = false;
	}

	public Class66(byte[] var1) {
		this.method1808(var1);
	}

	@ObfInfo(name = "al", desc = "([B)V")
	public void method1808(byte[] var1) {
		Class521 var2 = new Class521(var1);
		this.field799 = var2.method9410();
		this.field800 = var2.method9410();
		this.field801 = var2.method9410();
		this.field802 = var2.method9410();
		if (this.field802 < 0) {
			this.field802 = ~this.field802;
			this.field816 = true;
		}

		int var3 = var2.method9410();
		this.field804 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.method9405();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.method9417(var7, 0, var5);
			this.field804[var4] = var7;
		}

	}

	@ObfInfo(name = "az", desc = "(I)[F")
	public float[] method1810(int var1) {
		Class61 var2 = new Class61();
		var2.method1102(this.field804[var1], 0);
		this.field814 = new float[field828];
		var2.method1104();
		int var3 = var2.method1109(Class192.method3791(field812.length - 1));
		boolean var4 = field811[var3];
		int var5 = var4 ? field828 : field805;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method1104() != 0;
			var7 = var2.method1104() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (field805 >> 2);
			var10 = (var5 >> 2) + (field805 >> 2);
			var11 = field805 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (field805 >> 2);
			var13 = var5 - (var5 >> 2) + (field805 >> 2);
			var14 = field805 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		Class28 var15 = field810[field812[var3]];
		int var16 = var15.field141;
		int var17 = var15.field142[var16];
		Class65 var18 = field808[var17].method894(var2);
		boolean var19 = !var18.method1797();

		int var20;
		for (var20 = 0; var20 < var15.field143; ++var20) {
			Class36 var21 = field803[var15.field140[var20]];
			float[] var22 = this.field814;
			var21.method739(var22, var5 >> 1, var19, var2);
		}

		if (var18.method1797()) {
			var16 = var15.field141;
			int var10000 = var15.field142[var16];
			var18.method1796(this.field814, var5 >> 1);
		}

		int var43;
		int var46;
		if (!var18.method1797()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field814[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var43 = var5 >> 2;
			var46 = var5 >> 3;
			float[] var23 = this.field814;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var48 = var4 ? field822 : field819;
			float[] var25 = var4 ? field823 : field820;
			float[] var26 = var4 ? field824 : field809;
			int[] var27 = var4 ? field813 : field825;

			int var28;
			float var29;
			float var30;
			float var31;
			float var32;
			for (var28 = 0; var28 < var43; ++var28) {
				var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1];
				var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
				var31 = var48[var28 * 2];
				var32 = var48[var28 * 2 + 1];
				var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
				var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31;
			}

			float var33;
			float var34;
			for (var28 = 0; var28 < var46; ++var28) {
				var29 = var23[var20 + 3 + var28 * 4];
				var30 = var23[var20 + 1 + var28 * 4];
				var31 = var23[var28 * 4 + 3];
				var32 = var23[var28 * 4 + 1];
				var23[var20 + 3 + var28 * 4] = var29 + var31;
				var23[var20 + 1 + var28 * 4] = var30 + var32;
				var33 = var48[var20 - 4 - var28 * 4];
				var34 = var48[var20 - 3 - var28 * 4];
				var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
				var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
			}

			var28 = Class192.method3791(var5 - 1);

			int var49;
			int var50;
			int var51;
			int var52;
			for (var49 = 0; var49 < var28 - 3; ++var49) {
				var50 = var5 >> var49 + 2;
				var51 = 8 << var49;

				for (var52 = 0; var52 < 2 << var49; ++var52) {
					int var53 = var5 - var50 * 2 * var52;
					int var54 = var5 - var50 * (var52 * 2 + 1);

					for (int var35 = 0; var35 < var5 >> var49 + 4; ++var35) {
						int var36 = var35 * 4;
						float var37 = var23[var53 - 1 - var36];
						float var38 = var23[var53 - 3 - var36];
						float var39 = var23[var54 - 1 - var36];
						float var40 = var23[var54 - 3 - var36];
						var23[var53 - 1 - var36] = var37 + var39;
						var23[var53 - 3 - var36] = var38 + var40;
						float var41 = var48[var35 * var51];
						float var42 = var48[var35 * var51 + 1];
						var23[var54 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var54 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
					}
				}
			}

			for (var49 = 1; var49 < var46 - 1; ++var49) {
				var50 = var27[var49];
				if (var49 < var50) {
					var51 = var49 * 8;
					var52 = var50 * 8;
					var33 = var23[var51 + 1];
					var23[var51 + 1] = var23[var52 + 1];
					var23[var52 + 1] = var33;
					var33 = var23[var51 + 3];
					var23[var51 + 3] = var23[var52 + 3];
					var23[var52 + 3] = var33;
					var33 = var23[var51 + 5];
					var23[var51 + 5] = var23[var52 + 5];
					var23[var52 + 5] = var33;
					var33 = var23[var51 + 7];
					var23[var51 + 7] = var23[var52 + 7];
					var23[var52 + 7] = var33;
				}
			}

			for (var49 = 0; var49 < var20; ++var49) {
				var23[var49] = var23[var49 * 2 + 1];
			}

			for (var49 = 0; var49 < var46; ++var49) {
				var23[var5 - 1 - var49 * 2] = var23[var49 * 4];
				var23[var5 - 2 - var49 * 2] = var23[var49 * 4 + 1];
				var23[var5 - var43 - 1 - var49 * 2] = var23[var49 * 4 + 2];
				var23[var5 - var43 - 2 - var49 * 2] = var23[var49 * 4 + 3];
			}

			for (var49 = 0; var49 < var46; ++var49) {
				var30 = var26[var49 * 2];
				var31 = var26[var49 * 2 + 1];
				var32 = var23[var20 + var49 * 2];
				var33 = var23[var20 + var49 * 2 + 1];
				var34 = var23[var5 - 2 - var49 * 2];
				float var55 = var23[var5 - 1 - var49 * 2];
				float var56 = var31 * (var32 - var34) + var30 * (var33 + var55);
				var23[var20 + var49 * 2] = (var32 + var34 + var56) * 0.5F;
				var23[var5 - 2 - var49 * 2] = (var32 + var34 - var56) * 0.5F;
				var56 = var31 * (var33 + var55) - var30 * (var32 - var34);
				var23[var20 + var49 * 2 + 1] = (var33 - var55 + var56) * 0.5F;
				var23[var5 - 1 - var49 * 2] = (-var33 + var55 + var56) * 0.5F;
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49] = var23[var49 * 2 + var20] * var25[var49 * 2] + var23[var49 * 2 + 1 + var20] * var25[var49 * 2 + 1];
				var23[var20 - 1 - var49] = var23[var49 * 2 + var20] * var25[var49 * 2 + 1] - var23[var49 * 2 + 1 + var20] * var25[var49 * 2];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var5 - var43 + var49] = -var23[var49];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49] = var23[var49 + var43];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49 + var43] = -var23[var43 - var49 - 1];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49 + var20] = var23[var5 - var49 - 1];
			}

			float[] var57;
			for (var49 = var9; var49 < var10; ++var49) {
				var30 = (float)Math.sin(((double)(var49 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D);
				var57 = this.field814;
				var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var49 = var12; var49 < var13; ++var49) {
				var30 = (float)Math.sin(((double)(var49 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field814;
				var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field815 > 0) {
			var43 = this.field815 + var5 >> 2;
			var44 = new float[var43];
			int var47;
			if (!this.field817) {
				for (var46 = 0; var46 < this.field821; ++var46) {
					var47 = (this.field815 >> 1) + var46;
					var44[var46] += this.field826[var47];
				}
			}

			if (var18.method1797()) {
				for (var46 = var9; var46 < var5 >> 1; ++var46) {
					var47 = var44.length - (var5 >> 1) + var46;
					var44[var47] += this.field814[var46];
				}
			}
		}

		float[] var45 = this.field826;
		this.field826 = this.field814;
		this.field814 = var45;
		this.field815 = var5;
		this.field821 = var13 - (var5 >> 1);
		this.field817 = !var18.method1797();
		return var44;
	}

	@ObfInfo(name = "at", desc = "([I)Lbr;")
	public Class44 method1817(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.field827 == null) {
				this.field815 = 0;
				this.field826 = new float[field828];
				this.field827 = new byte[this.field800];
				this.field798 = 0;
				this.field829 = 0;
			}

			for (; this.field829 < this.field804.length; ++this.field829) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method1810(this.field829);
				if (var2 != null) {
					int var3 = this.field798;
					int var4 = var2.length;
					if (var4 > this.field800 - var3) {
						var4 = this.field800 - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int)(128.0F + var2[var5] * 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}

						this.field827[var3++] = (byte)(var6 - 128);
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field798;
					}

					this.field798 = var3;
				}
			}

			this.field826 = null;
			byte[] var7 = this.field827;
			this.field827 = null;
			return new Class44(this.field799, var7, this.field801, this.field802, this.field816);
		}
	}

	@ObfInfo(name = "ak", desc = "(I)F")
	public static float method1814(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
	}

	@ObfInfo(name = "aj", desc = "([B)V")
	public static void method1809(byte[] var0) {
		Class61 var1 = field818;
		var1.method1102(var0, 0);
		field805 = 1 << var1.method1109(4);
		field828 = 1 << var1.method1109(4);

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) {
			var3 = var2 != 0 ? field828 : field805;
			var4 = var3 >> 1;
			var5 = var3 >> 2;
			var6 = var3 >> 3;
			float[] var7 = new float[var4];

			for (int var8 = 0; var8 < var5; ++var8) {
				var7[var8 * 2] = (float)Math.cos((double)(var8 * 4) * 3.141592653589793D / (double)var3);
				var7[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4) * 3.141592653589793D / (double)var3));
			}

			float[] var14 = new float[var4];

			for (int var9 = 0; var9 < var5; ++var9) {
				var14[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
				var14[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
			}

			float[] var15 = new float[var5];

			for (int var10 = 0; var10 < var6; ++var10) {
				var15[var10 * 2] = (float)Math.cos((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3);
				var15[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3));
			}

			int[] var16 = new int[var6];
			int var11 = Class192.method3791(var6 - 1);

			for (int var12 = 0; var12 < var6; ++var12) {
				var16[var12] = Class319.method8360(var12, var11);
			}

			if (var2 != 0) {
				field822 = var7;
				field823 = var14;
				field824 = var15;
				field813 = var16;
			} else {
				field819 = var7;
				field820 = var14;
				field809 = var15;
				field825 = var16;
			}
		}

		var2 = var1.method1109(8) + 1;
		field807 = new Class75[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field807[var3] = new Class75();
		}

		var3 = var1.method1109(6) + 1;

		for (var4 = 0; var4 < var3; ++var4) {
			var1.method1109(16);
		}

		var3 = var1.method1109(6) + 1;
		field808 = new Class50[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field808[var4] = new Class50();
		}

		var4 = var1.method1109(6) + 1;
		field803 = new Class36[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field803[var5] = new Class36();
		}

		var5 = var1.method1109(6) + 1;
		field810 = new Class28[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			field810[var6] = new Class28();
		}

		var6 = var1.method1109(6) + 1;
		field811 = new boolean[var6];
		field812 = new int[var6];

		for (int var13 = 0; var13 < var6; ++var13) {
			field811[var13] = var1.method1104() != 0;
			var1.method1109(16);
			var1.method1109(16);
			field812[var13] = var1.method1109(8);
		}

	}

	@ObfInfo(name = "af", desc = "(Lor;)Z")
	public static boolean method1811(Class382 var0) {
		if (!field806) {
			byte[] var1 = var0.method7216(0, 0);
			if (var1 == null) {
				return false;
			}

			method1809(var1);
			field806 = true;
		}

		return true;
	}

	@ObfInfo(name = "aa", desc = "(Lor;II)Lcn;")
	public static Class66 method1818(Class382 var0, int var1, int var2) {
		if (!method1811(var0)) {
			var0.method7232(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.method7216(var1, var2);
			return var3 == null ? null : new Class66(var3);
		}
	}
}
