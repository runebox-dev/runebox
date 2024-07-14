import io.runebox.ObfInfo;

@ObfInfo(name = "cl")
public class Class64 extends Class520 {
	@ObfInfo(name = "ae", desc = "[Lbc;")
	public static Class29[] field502;
	@ObfInfo(name = "au", desc = "[Lbq;")
	public static Class43[] field515;
	@ObfInfo(name = "ah", desc = "[Lbr;")
	public static Class44[] field495;
	@ObfInfo(name = "ai", desc = "[Lcf;")
	public static Class58[] field492;
	@ObfInfo(name = "aj", desc = "Lco;")
	public static Class67 field498;
	@ObfInfo(name = "ac", desc = "Z")
	public static boolean field497;
	@ObfInfo(name = "az", desc = "[Z")
	public static boolean[] field505;
	@ObfInfo(name = "at", desc = "[F")
	public static float[] field504;
	@ObfInfo(name = "af", desc = "[F")
	public static float[] field507;
	@ObfInfo(name = "aw", desc = "[F")
	public static float[] field513;
	@ObfInfo(name = "am", desc = "[F")
	public static float[] field516;
	@ObfInfo(name = "ar", desc = "[F")
	public static float[] field517;
	@ObfInfo(name = "bt", desc = "[F")
	public static float[] field518;
	@ObfInfo(name = "av", desc = "I")
	public static int field499;
	@ObfInfo(name = "ab", desc = "I")
	public static int field500;
	@ObfInfo(name = "be", desc = "[I")
	public static int[] field503;
	@ObfInfo(name = "ax", desc = "[I")
	public static int[] field506;
	@ObfInfo(name = "bj", desc = "[I")
	public static int[] field519;
	@ObfInfo(name = "an", desc = "Z")
	public boolean field496;
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field511;
	@ObfInfo(name = "bm", desc = "[B")
	public byte[] field521;
	@ObfInfo(name = "aq", desc = "[[B")
	public byte[][] field520;
	@ObfInfo(name = "al", desc = "[F")
	public float[] field508;
	@ObfInfo(name = "as", desc = "[F")
	public float[] field512;
	@ObfInfo(name = "ad", desc = "I")
	public int field493;
	@ObfInfo(name = "ag", desc = "I")
	public int field494;
	@ObfInfo(name = "ap", desc = "I")
	public int field501;
	@ObfInfo(name = "ay", desc = "I")
	public int field509;
	@ObfInfo(name = "ao", desc = "I")
	public int field510;
	@ObfInfo(name = "ak", desc = "I")
	public int field514;
	@ObfInfo(name = "bo", desc = "I")
	public int field522;
	@ObfInfo(name = "bi", desc = "I")
	public int field523;

	static {
		field498 = new Class67();
		field497 = false;
	}

	public Class64(byte[] var1) {
		this.method1300(var1);
	}

	@ObfInfo(name = "ad", desc = "([B)V")
	public void method1300(byte[] var1) {
		Class562 var2 = new Class562(var1);
		this.field493 = var2.method9832();
		this.field494 = var2.method9832();
		this.field514 = var2.method9832();
		this.field501 = var2.method9832();
		if (this.field501 < 0) {
			this.field501 = ~this.field501;
			this.field496 = true;
		}

		int var3 = var2.method9832();
		this.field520 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.method9902();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.method9840(var7, 0, var5);
			this.field520[var4] = var7;
		}

	}

	@ObfInfo(name = "ak", desc = "(I)[F")
	public float[] method1314(int var1) {
		Class67 var2 = new Class67();
		var2.method1932(this.field520[var1], 0);
		this.field512 = new float[field500];
		var2.method1930();
		int var3 = var2.method1942(Class337.method3414(field506.length - 1));
		boolean var4 = field505[var3];
		int var5 = var4 ? field500 : field499;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method1930() != 0;
			var7 = var2.method1930() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (field499 >> 2);
			var10 = (field499 >> 2) + (var5 >> 2);
			var11 = field499 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (field499 >> 2);
			var13 = (field499 >> 2) + (var5 - (var5 >> 2));
			var14 = field499 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		Class44 var15 = field495[field506[var3]];
		int var16 = var15.field241;
		int var17 = var15.field242[var16];
		Class57 var18 = field502[var17].method418(var2);
		boolean var19 = !var18.method1174();

		int var20;
		for (var20 = 0; var20 < var15.field243; ++var20) {
			Class43 var21 = field515[var15.field240[var20]];
			float[] var22 = this.field512;
			var21.method625(var22, var5 >> 1, var19, var2);
		}

		if (var18.method1174()) {
			var16 = var15.field241;
			int var10000 = var15.field242[var16];
			var18.method1171(this.field512, var5 >> 1);
		}

		int var43;
		int var46;
		if (!var18.method1174()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field512[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var43 = var5 >> 2;
			var46 = var5 >> 3;
			float[] var23 = this.field512;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var48 = var4 ? field516 : field513;
			float[] var25 = var4 ? field517 : field504;
			float[] var26 = var4 ? field518 : field507;
			int[] var27 = var4 ? field503 : field519;

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
				var29 = var23[var28 * 4 + var20 + 3];
				var30 = var23[var28 * 4 + var20 + 1];
				var31 = var23[var28 * 4 + 3];
				var32 = var23[var28 * 4 + 1];
				var23[var28 * 4 + var20 + 3] = var29 + var31;
				var23[var28 * 4 + var20 + 1] = var30 + var32;
				var33 = var48[var20 - 4 - var28 * 4];
				var34 = var48[var20 - 3 - var28 * 4];
				var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
				var23[var28 * 4 + 1] = (var29 - var31) * var34 + (var30 - var32) * var33;
			}

			var28 = Class337.method3414(var5 - 1);

			int var49;
			int var50;
			int var51;
			int var52;
			for (var49 = 0; var49 < var28 - 3; ++var49) {
				var50 = var5 >> var49 + 2;
				var51 = 8 << var49;

				for (var52 = 0; var52 < 2 << var49; ++var52) {
					int var53 = var5 - var50 * 2 * var52;
					int var54 = var5 - (var52 * 2 + 1) * var50;

					for (int var35 = 0; var35 < var5 >> var49 + 4; ++var35) {
						int var36 = var35 * 4;
						float var37 = var23[var53 - 1 - var36];
						float var38 = var23[var53 - 3 - var36];
						float var39 = var23[var54 - 1 - var36];
						float var40 = var23[var54 - 3 - var36];
						var23[var53 - 1 - var36] = var37 + var39;
						var23[var53 - 3 - var36] = var38 + var40;
						float var41 = var48[var51 * var35];
						float var42 = var48[var51 * var35 + 1];
						var23[var54 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var54 - 3 - var36] = (var37 - var39) * var42 + (var38 - var40) * var41;
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
				var32 = var23[var49 * 2 + var20];
				var33 = var23[var49 * 2 + var20 + 1];
				var34 = var23[var5 - 2 - var49 * 2];
				float var55 = var23[var5 - 1 - var49 * 2];
				float var56 = (var32 - var34) * var31 + (var33 + var55) * var30;
				var23[var49 * 2 + var20] = (var32 + var34 + var56) * 0.5F;
				var23[var5 - 2 - var49 * 2] = (var32 + var34 - var56) * 0.5F;
				var56 = (var33 + var55) * var31 - (var32 - var34) * var30;
				var23[var49 * 2 + var20 + 1] = (var33 - var55 + var56) * 0.5F;
				var23[var5 - 1 - var49 * 2] = (-var33 + var55 + var56) * 0.5F;
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49] = var25[var49 * 2] * var23[var49 * 2 + var20] + var25[var49 * 2 + 1] * var23[var49 * 2 + 1 + var20];
				var23[var20 - 1 - var49] = var23[var49 * 2 + var20] * var25[var49 * 2 + 1] - var25[var49 * 2] * var23[var49 * 2 + 1 + var20];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var5 - var43 + var49] = -var23[var49];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49] = var23[var43 + var49];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var43 + var49] = -var23[var43 - var49 - 1];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var20 + var49] = var23[var5 - var49 - 1];
			}

			float[] var57;
			for (var49 = var9; var49 < var10; ++var49) {
				var30 = (float)Math.sin(((double)(var49 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D);
				var57 = this.field512;
				var57[var49] *= (float)Math.sin((double)var30 * 1.5707963267948966D * (double)var30);
			}

			for (var49 = var12; var49 < var13; ++var49) {
				var30 = (float)Math.sin(((double)(var49 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field512;
				var57[var49] *= (float)Math.sin((double)var30 * 1.5707963267948966D * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field509 > 0) {
			var43 = this.field509 + var5 >> 2;
			var44 = new float[var43];
			int var47;
			if (!this.field511) {
				for (var46 = 0; var46 < this.field510; ++var46) {
					var47 = (this.field509 >> 1) + var46;
					var44[var46] += this.field508[var47];
				}
			}

			if (var18.method1174()) {
				for (var46 = var9; var46 < var5 >> 1; ++var46) {
					var47 = var44.length - (var5 >> 1) + var46;
					var44[var47] += this.field512[var46];
				}
			}
		}

		float[] var45 = this.field508;
		this.field508 = this.field512;
		this.field512 = var45;
		this.field509 = var5;
		this.field510 = var13 - (var5 >> 1);
		this.field511 = !var18.method1174();
		return var44;
	}

	@ObfInfo(name = "aj", desc = "([I)Lbl;")
	public Class38 method1306(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.field521 == null) {
				this.field509 = 0;
				this.field508 = new float[field500];
				this.field521 = new byte[this.field494];
				this.field522 = 0;
				this.field523 = 0;
			}

			for (; this.field523 < this.field520.length; ++this.field523) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method1314(this.field523);
				if (var2 != null) {
					int var3 = this.field522;
					int var4 = var2.length;
					if (var4 > this.field494 - var3) {
						var4 = this.field494 - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int)(var2[var5] * 128.0F + 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}

						this.field521[var3++] = (byte)(var6 - 128);
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field522;
					}

					this.field522 = var3;
				}
			}

			this.field508 = null;
			byte[] var7 = this.field521;
			this.field521 = null;
			return new Class38(this.field493, var7, this.field514, this.field501, this.field496);
		}
	}

	@ObfInfo(name = "aq", desc = "(I)F")
	public static float method1301(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
	}

	@ObfInfo(name = "ag", desc = "([B)V")
	public static void method1305(byte[] var0) {
		Class67 var1 = field498;
		var1.method1932(var0, 0);
		field499 = 1 << var1.method1942(4);
		field500 = 1 << var1.method1942(4);

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) {
			var3 = var2 != 0 ? field500 : field499;
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
			int var11 = Class337.method3414(var6 - 1);

			for (int var12 = 0; var12 < var6; ++var12) {
				var16[var12] = Class337.method2625(var12, var11);
			}

			if (var2 != 0) {
				field516 = var7;
				field517 = var14;
				field518 = var15;
				field503 = var16;
			} else {
				field513 = var7;
				field504 = var14;
				field507 = var15;
				field519 = var16;
			}
		}

		var2 = var1.method1942(8) + 1;
		field492 = new Class58[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field492[var3] = new Class58();
		}

		var3 = var1.method1942(6) + 1;

		for (var4 = 0; var4 < var3; ++var4) {
			var1.method1942(16);
		}

		var3 = var1.method1942(6) + 1;
		field502 = new Class29[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field502[var4] = new Class29();
		}

		var4 = var1.method1942(6) + 1;
		field515 = new Class43[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field515[var5] = new Class43();
		}

		var5 = var1.method1942(6) + 1;
		field495 = new Class44[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			field495[var6] = new Class44();
		}

		var6 = var1.method1942(6) + 1;
		field505 = new boolean[var6];
		field506 = new int[var6];

		for (int var13 = 0; var13 < var6; ++var13) {
			field505[var13] = var1.method1930() != 0;
			var1.method1942(16);
			var1.method1942(16);
			field506[var13] = var1.method1942(8);
		}

	}

	@ObfInfo(name = "ap", desc = "(Lok;)Z")
	public static boolean method1303(Class375 var0) {
		if (!field497) {
			byte[] var1 = var0.method7132(0, 0);
			if (var1 == null) {
				return false;
			}

			method1305(var1);
			field497 = true;
		}

		return true;
	}

	@ObfInfo(name = "an", desc = "(Lok;II)Lcl;")
	public static Class64 method1304(Class375 var0, int var1, int var2) {
		if (!method1303(var0)) {
			var0.method7134(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.method7132(var1, var2);
			return var3 == null ? null : new Class64(var3);
		}
	}
}
