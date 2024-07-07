import io.runebox.ObfInfo;

@ObfInfo(name = "lw")
public final class Class309 {
	@ObfInfo(name = "ay", desc = "[F")
	public static float[] field3245;
	@ObfInfo(name = "ao", desc = "[I")
	public static int[] field3236;
	@ObfInfo(name = "ac", desc = "[I")
	public static int[] field3238;
	@ObfInfo(name = "al", desc = "[I")
	public static int[] field3246;
	@ObfInfo(name = "aa", desc = "[I")
	public static int[] field3248;
	@ObfInfo(name = "as", desc = "[I")
	public static int[] field3249;
	@ObfInfo(name = "at", desc = "[[I")
	public static final int[][] field3234;
	@ObfInfo(name = "aw", desc = "[[I")
	public static final int[][] field3250;
	@ObfInfo(name = "ae", desc = "Z")
	public boolean field3239;
	@ObfInfo(name = "au", desc = "I")
	public int field3240;
	@ObfInfo(name = "ah", desc = "I")
	public int field3241;
	@ObfInfo(name = "ax", desc = "I")
	public int field3243;
	@ObfInfo(name = "az", desc = "I")
	public int field3244;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field3229;
	@ObfInfo(name = "ad", desc = "[I")
	public int[] field3230;
	@ObfInfo(name = "ai", desc = "[I")
	public int[] field3231;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field3232;
	@ObfInfo(name = "av", desc = "[I")
	public int[] field3233;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field3235;
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field3237;
	@ObfInfo(name = "ap", desc = "[I")
	public int[] field3242;
	@ObfInfo(name = "an", desc = "[I")
	public int[] field3247;
	@ObfInfo(name = "aq", desc = "[I")
	public int[] field3251;

	static {
		field3238 = new int[6];
		field3246 = new int[6];
		field3245 = new float[6];
		field3236 = new int[6];
		field3248 = new int[6];
		field3249 = new int[6];
		field3250 = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
		field3234 = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
	}

	public Class309(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
		this.field3239 = true;
		if (var7 != var6 || var8 != var6 || var9 != var6) {
			this.field3239 = false;
		}

		this.field3240 = var1;
		this.field3241 = var2;
		this.field3244 = var18;
		this.field3243 = var19;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field3250[var1];
		int var25 = var24.length;
		this.field3251 = new int[var25];
		this.field3230 = new int[var25];
		this.field3229 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = var20 * var4;
		int var29 = var20 * var5;

		int var31;
		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		for (int var30 = 0; var30 < var25; ++var30) {
			var31 = var24[var30];
			if ((var31 & 1) == 0 && var31 <= 8) {
				var31 = (var31 - var2 - var2 - 1 & 7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - 9 - var2 & 3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - 13 - var2 & 3) + 13;
			}

			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = var6;
				var35 = var10;
				var36 = var14;
			} else if (var31 == 2) {
				var32 = var28 + var21;
				var33 = var29;
				var34 = var7 + var6 >> 1;
				var35 = var11 + var10 >> 1;
				var36 = var15 + var14 >> 1;
			} else if (var31 == 3) {
				var32 = var28 + var20;
				var33 = var29;
				var34 = var7;
				var35 = var11;
				var36 = var15;
			} else if (var31 == 4) {
				var32 = var28 + var20;
				var33 = var29 + var21;
				var34 = var8 + var7 >> 1;
				var35 = var12 + var11 >> 1;
				var36 = var16 + var15 >> 1;
			} else if (var31 == 5) {
				var32 = var28 + var20;
				var33 = var29 + var20;
				var34 = var8;
				var35 = var12;
				var36 = var16;
			} else if (var31 == 6) {
				var32 = var28 + var21;
				var33 = var29 + var20;
				var34 = var9 + var8 >> 1;
				var35 = var13 + var12 >> 1;
				var36 = var17 + var16 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var29 + var20;
				var34 = var9;
				var35 = var13;
				var36 = var17;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var29 + var21;
				var34 = var9 + var6 >> 1;
				var35 = var13 + var10 >> 1;
				var36 = var17 + var14 >> 1;
			} else if (var31 == 9) {
				var32 = var28 + var21;
				var33 = var29 + var22;
				var34 = var7 + var6 >> 1;
				var35 = var11 + var10 >> 1;
				var36 = var15 + var14 >> 1;
			} else if (var31 == 10) {
				var32 = var28 + var23;
				var33 = var29 + var21;
				var34 = var8 + var7 >> 1;
				var35 = var12 + var11 >> 1;
				var36 = var16 + var15 >> 1;
			} else if (var31 == 11) {
				var32 = var28 + var21;
				var33 = var29 + var23;
				var34 = var9 + var8 >> 1;
				var35 = var13 + var12 >> 1;
				var36 = var17 + var16 >> 1;
			} else if (var31 == 12) {
				var32 = var28 + var22;
				var33 = var29 + var21;
				var34 = var9 + var6 >> 1;
				var35 = var13 + var10 >> 1;
				var36 = var17 + var14 >> 1;
			} else if (var31 == 13) {
				var32 = var28 + var22;
				var33 = var29 + var22;
				var34 = var6;
				var35 = var10;
				var36 = var14;
			} else if (var31 == 14) {
				var32 = var28 + var23;
				var33 = var29 + var22;
				var34 = var7;
				var35 = var11;
				var36 = var15;
			} else if (var31 == 15) {
				var32 = var28 + var23;
				var33 = var29 + var23;
				var34 = var8;
				var35 = var12;
				var36 = var16;
			} else {
				var32 = var28 + var22;
				var33 = var29 + var23;
				var34 = var9;
				var35 = var13;
				var36 = var17;
			}

			this.field3251[var30] = var32;
			this.field3230[var30] = var34;
			this.field3229[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var38 = field3234[var1];
		var31 = var38.length / 4;
		this.field3235 = new int[var31];
		this.field3233 = new int[var31];
		this.field3237 = new int[var31];
		this.field3232 = new int[var31];
		this.field3242 = new int[var31];
		this.field3247 = new int[var31];
		if (var3 != -1) {
			this.field3231 = new int[var31];
		}

		var32 = 0;

		for (var33 = 0; var33 < var31; ++var33) {
			var34 = var38[var32];
			var35 = var38[var32 + 1];
			var36 = var38[var32 + 2];
			int var37 = var38[var32 + 3];
			var32 += 4;
			if (var35 < 4) {
				var35 = var35 - var2 & 3;
			}

			if (var36 < 4) {
				var36 = var36 - var2 & 3;
			}

			if (var37 < 4) {
				var37 = var37 - var2 & 3;
			}

			this.field3235[var33] = var35;
			this.field3233[var33] = var36;
			this.field3237[var33] = var37;
			if (var34 == 0) {
				this.field3232[var33] = var26[var35];
				this.field3242[var33] = var26[var36];
				this.field3247[var33] = var26[var37];
				if (this.field3231 != null) {
					this.field3231[var33] = -1;
				}
			} else {
				this.field3232[var33] = var27[var35];
				this.field3242[var33] = var27[var36];
				this.field3247[var33] = var27[var37];
				if (this.field3231 != null) {
					this.field3231[var33] = var3;
				}
			}
		}

		var33 = var6;
		var34 = var7;
		if (var7 < var6) {
			var33 = var7;
		}

		if (var7 > var7) {
			var34 = var7;
		}

		if (var8 < var33) {
			var33 = var8;
		}

		if (var8 > var7) {
			var34 = var8;
		}

		if (var9 < var33) {
			var33 = var9;
		}

		if (var9 > var34) {
			var34 = var9;
		}

		var33 /= 14;
		var34 /= 14;
	}
}
