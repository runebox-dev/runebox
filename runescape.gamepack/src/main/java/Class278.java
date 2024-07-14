import io.runebox.ObfInfo;

@ObfInfo(name = "kr")
public class Class278 extends Class280 {
	@ObfInfo(name = "bv", desc = "I")
	public static int field2927;
	@ObfInfo(name = "bl", desc = "[I")
	public static int[] field2950;
	@ObfInfo(name = "bc", desc = "[I")
	public static int[] field2951;
	@ObfInfo(name = "bb", desc = "[I")
	public static int[] field2953;
	@ObfInfo(name = "bn", desc = "[I")
	public static int[] field2954;
	@ObfInfo(name = "bm", desc = "[Llk;")
	public Class297[] field2918;
	@ObfInfo(name = "bo", desc = "[Llm;")
	public Class299[] field2940;
	@ObfInfo(name = "bi", desc = "[Llm;")
	public Class299[] field2941;
	@ObfInfo(name = "bs", desc = "Z")
	public boolean field2944;
	@ObfInfo(name = "ay", desc = "B")
	public byte field2932;
	@ObfInfo(name = "ax", desc = "[B")
	public byte[] field2911;
	@ObfInfo(name = "ah", desc = "[B")
	public byte[] field2922;
	@ObfInfo(name = "aa", desc = "[B")
	public byte[] field2929;
	@ObfInfo(name = "az", desc = "[B")
	public byte[] field2946;
	@ObfInfo(name = "au", desc = "[B")
	public byte[] field2949;
	@ObfInfo(name = "ak", desc = "I")
	public int field2913;
	@ObfInfo(name = "av", desc = "I")
	public int field2917;
	@ObfInfo(name = "bw", desc = "I")
	public int field2919;
	@ObfInfo(name = "bp", desc = "I")
	public int field2920;
	@ObfInfo(name = "ao", desc = "I")
	public int field2928;
	@ObfInfo(name = "bx", desc = "I")
	public int field2936;
	@ObfInfo(name = "bu", desc = "I")
	public int field2947;
	@ObfInfo(name = "by", desc = "I")
	public int field2948;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field2910;
	@ObfInfo(name = "ap", desc = "[I")
	public int[] field2914;
	@ObfInfo(name = "an", desc = "[I")
	public int[] field2915;
	@ObfInfo(name = "ai", desc = "[I")
	public int[] field2916;
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field2921;
	@ObfInfo(name = "af", desc = "[I")
	public int[] field2933;
	@ObfInfo(name = "am", desc = "[I")
	public int[] field2934;
	@ObfInfo(name = "ae", desc = "[I")
	public int[] field2952;
	@ObfInfo(name = "ar", desc = "[[I")
	public int[][] field2935;
	@ObfInfo(name = "bj", desc = "[[I")
	public int[][] field2937;
	@ObfInfo(name = "be", desc = "[[I")
	public int[][] field2938;
	@ObfInfo(name = "bt", desc = "[[I")
	public int[][] field2945;
	@ObfInfo(name = "ba", desc = "S")
	public short field2942;
	@ObfInfo(name = "bg", desc = "S")
	public short field2943;
	@ObfInfo(name = "at", desc = "[S")
	public short[] field2923;
	@ObfInfo(name = "ac", desc = "[S")
	public short[] field2925;
	@ObfInfo(name = "al", desc = "[S")
	public short[] field2926;
	@ObfInfo(name = "aw", desc = "[S")
	public short[] field2931;
	@ObfInfo(name = "as", desc = "[S")
	public short[] field2939;

	static {
		field2950 = new int[10000];
		field2951 = new int[10000];
		field2927 = 0;
		field2953 = Class274.field2804;
		field2954 = Class274.field2805;
	}

	public Class278() {
		this.field2913 = 0;
		this.field2917 = 0;
		this.field2932 = 0;
		this.field2944 = false;
	}

	public Class278(byte[] var1) {
		this.field2913 = 0;
		this.field2917 = 0;
		this.field2932 = 0;
		this.field2944 = false;
		Class562 var2 = new Class562(10);
		var2.method9810(-2);
		if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
			this.method5503(var1);
		} else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
			this.method5504(var1);
		} else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			this.method5505(var1);
		} else {
			this.method5556(var1);
		}

	}

	public Class278(Class278[] var1, int var2) {
		this.field2913 = 0;
		this.field2917 = 0;
		this.field2932 = 0;
		this.field2944 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		this.field2913 = 0;
		this.field2917 = 0;
		this.field2928 = 0;
		this.field2932 = -1;

		int var10;
		Class278 var11;
		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				this.field2913 += var11.field2913;
				this.field2917 += var11.field2917;
				this.field2928 += var11.field2928;
				if (var11.field2922 != null) {
					var4 = true;
				} else {
					if (this.field2932 == -1) {
						this.field2932 = var11.field2932;
					}

					if (this.field2932 != var11.field2932) {
						var4 = true;
					}
				}

				var3 |= var11.field2949 != null;
				var5 |= var11.field2946 != null;
				var6 |= var11.field2934 != null;
				var7 |= var11.field2926 != null;
				var8 |= var11.field2911 != null;
				var9 |= var11.field2937 != null;
			}
		}

		this.field2914 = new int[this.field2913];
		this.field2915 = new int[this.field2913];
		this.field2910 = new int[this.field2913];
		this.field2933 = new int[this.field2913];
		this.field2921 = new int[this.field2917];
		this.field2916 = new int[this.field2917];
		this.field2952 = new int[this.field2917];
		if (var3) {
			this.field2949 = new byte[this.field2917];
		}

		if (var4) {
			this.field2922 = new byte[this.field2917];
		}

		if (var5) {
			this.field2946 = new byte[this.field2917];
		}

		if (var6) {
			this.field2934 = new int[this.field2917];
		}

		if (var7) {
			this.field2926 = new short[this.field2917];
		}

		if (var8) {
			this.field2911 = new byte[this.field2917];
		}

		if (var9) {
			this.field2937 = new int[this.field2913][];
			this.field2938 = new int[this.field2913][];
		}

		this.field2925 = new short[this.field2917];
		if (this.field2928 > 0) {
			this.field2929 = new byte[this.field2928];
			this.field2939 = new short[this.field2928];
			this.field2931 = new short[this.field2928];
			this.field2923 = new short[this.field2928];
		}

		this.field2913 = 0;
		this.field2917 = 0;
		this.field2928 = 0;

		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				int var12;
				for (var12 = 0; var12 < var11.field2917; ++var12) {
					if (var3 && var11.field2949 != null) {
						this.field2949[this.field2917] = var11.field2949[var12];
					}

					if (var4) {
						if (var11.field2922 != null) {
							this.field2922[this.field2917] = var11.field2922[var12];
						} else {
							this.field2922[this.field2917] = var11.field2932;
						}
					}

					if (var5 && var11.field2946 != null) {
						this.field2946[this.field2917] = var11.field2946[var12];
					}

					if (var6 && var11.field2934 != null) {
						this.field2934[this.field2917] = var11.field2934[var12];
					}

					if (var7) {
						if (var11.field2926 != null) {
							this.field2926[this.field2917] = var11.field2926[var12];
						} else {
							this.field2926[this.field2917] = -1;
						}
					}

					if (var8) {
						if (var11.field2911 != null && var11.field2911[var12] != -1) {
							this.field2911[this.field2917] = (byte)(var11.field2911[var12] + this.field2928);
						} else {
							this.field2911[this.field2917] = -1;
						}
					}

					this.field2925[this.field2917] = var11.field2925[var12];
					this.field2921[this.field2917] = this.method5501(var11, var11.field2921[var12]);
					this.field2916[this.field2917] = this.method5501(var11, var11.field2916[var12]);
					this.field2952[this.field2917] = this.method5501(var11, var11.field2952[var12]);
					++this.field2917;
				}

				for (var12 = 0; var12 < var11.field2928; ++var12) {
					byte var13 = this.field2929[this.field2928] = var11.field2929[var12];
					if (var13 == 0) {
						this.field2939[this.field2928] = (short)this.method5501(var11, var11.field2939[var12]);
						this.field2931[this.field2928] = (short)this.method5501(var11, var11.field2931[var12]);
						this.field2923[this.field2928] = (short)this.method5501(var11, var11.field2923[var12]);
					}

					++this.field2928;
				}
			}
		}

	}

	public Class278(Class278 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.field2913 = 0;
		this.field2917 = 0;
		this.field2932 = 0;
		this.field2944 = false;
		this.field2913 = var1.field2913;
		this.field2917 = var1.field2917;
		this.field2928 = var1.field2928;
		int var6;
		if (var2) {
			this.field2914 = var1.field2914;
			this.field2915 = var1.field2915;
			this.field2910 = var1.field2910;
		} else {
			this.field2914 = new int[this.field2913];
			this.field2915 = new int[this.field2913];
			this.field2910 = new int[this.field2913];

			for (var6 = 0; var6 < this.field2913; ++var6) {
				this.field2914[var6] = var1.field2914[var6];
				this.field2915[var6] = var1.field2915[var6];
				this.field2910[var6] = var1.field2910[var6];
			}
		}

		if (var3) {
			this.field2925 = var1.field2925;
		} else {
			this.field2925 = new short[this.field2917];

			for (var6 = 0; var6 < this.field2917; ++var6) {
				this.field2925[var6] = var1.field2925[var6];
			}
		}

		if (!var4 && var1.field2926 != null) {
			this.field2926 = new short[this.field2917];

			for (var6 = 0; var6 < this.field2917; ++var6) {
				this.field2926[var6] = var1.field2926[var6];
			}
		} else {
			this.field2926 = var1.field2926;
		}

		if (var5) {
			this.field2946 = var1.field2946;
		} else {
			this.field2946 = new byte[this.field2917];
			if (var1.field2946 == null) {
				for (var6 = 0; var6 < this.field2917; ++var6) {
					this.field2946[var6] = 0;
				}
			} else {
				for (var6 = 0; var6 < this.field2917; ++var6) {
					this.field2946[var6] = var1.field2946[var6];
				}
			}
		}

		this.field2921 = var1.field2921;
		this.field2916 = var1.field2916;
		this.field2952 = var1.field2952;
		this.field2949 = var1.field2949;
		this.field2922 = var1.field2922;
		this.field2911 = var1.field2911;
		this.field2932 = var1.field2932;
		this.field2929 = var1.field2929;
		this.field2939 = var1.field2939;
		this.field2931 = var1.field2931;
		this.field2923 = var1.field2923;
		this.field2933 = var1.field2933;
		this.field2934 = var1.field2934;
		this.field2935 = var1.field2935;
		this.field2945 = var1.field2945;
		this.field2940 = var1.field2940;
		this.field2918 = var1.field2918;
		this.field2941 = var1.field2941;
		this.field2937 = var1.field2937;
		this.field2938 = var1.field2938;
		this.field2942 = var1.field2942;
		this.field2943 = var1.field2943;
	}

	@ObfInfo(name = "ad", desc = "([B)V")
	public void method5503(byte[] var1) {
		Class562 var2 = new Class562(var1);
		Class562 var3 = new Class562(var1);
		Class562 var4 = new Class562(var1);
		Class562 var5 = new Class562(var1);
		Class562 var6 = new Class562(var1);
		Class562 var7 = new Class562(var1);
		Class562 var8 = new Class562(var1);
		var2.field5471 = var1.length - 26;
		int var9 = var2.method9997();
		int var10 = var2.method9997();
		int var11 = var2.method9902();
		int var12 = var2.method9902();
		int var13 = var2.method9902();
		int var14 = var2.method9902();
		int var15 = var2.method9902();
		int var16 = var2.method9902();
		int var17 = var2.method9902();
		int var18 = var2.method9902();
		int var19 = var2.method9997();
		int var20 = var2.method9997();
		int var21 = var2.method9997();
		int var22 = var2.method9997();
		int var23 = var2.method9997();
		int var24 = var2.method9997();
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28;
		if (var11 > 0) {
			this.field2929 = new byte[var11];
			var2.field5471 = 0;

			for (var28 = 0; var28 < var11; ++var28) {
				byte var29 = this.field2929[var28] = var2.method9955();
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

		var28 = var9 + var11;
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
		this.field2913 = var9;
		this.field2917 = var10;
		this.field2928 = var11;
		this.field2914 = new int[var9];
		this.field2915 = new int[var9];
		this.field2910 = new int[var9];
		this.field2921 = new int[var10];
		this.field2916 = new int[var10];
		this.field2952 = new int[var10];
		if (var17 == 1) {
			this.field2933 = new int[var9];
		}

		if (var12 == 1) {
			this.field2949 = new byte[var10];
		}

		if (var13 == 255) {
			this.field2922 = new byte[var10];
		} else {
			this.field2932 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2946 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2934 = new int[var10];
		}

		if (var16 == 1) {
			this.field2926 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field2911 = new byte[var10];
		}

		if (var18 == 1) {
			this.field2937 = new int[var9][];
			this.field2938 = new int[var9][];
		}

		this.field2925 = new short[var10];
		if (var11 > 0) {
			this.field2939 = new short[var11];
			this.field2931 = new short[var11];
			this.field2923 = new short[var11];
		}

		var2.field5471 = var11;
		var3.field5471 = var40;
		var4.field5471 = var41;
		var5.field5471 = var42;
		var6.field5471 = var34;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;

		int var53;
		int var54;
		int var55;
		int var56;
		int var57;
		for (var53 = 0; var53 < var9; ++var53) {
			var54 = var2.method9902();
			var55 = 0;
			if ((var54 & 1) != 0) {
				var55 = var3.method9841();
			}

			var56 = 0;
			if ((var54 & 2) != 0) {
				var56 = var4.method9841();
			}

			var57 = 0;
			if ((var54 & 4) != 0) {
				var57 = var5.method9841();
			}

			this.field2914[var53] = var50 + var55;
			this.field2915[var53] = var51 + var56;
			this.field2910[var53] = var52 + var57;
			var50 = this.field2914[var53];
			var51 = this.field2915[var53];
			var52 = this.field2910[var53];
			if (var17 == 1) {
				this.field2933[var53] = var6.method9902();
			}
		}

		if (var18 == 1) {
			for (var53 = 0; var53 < var9; ++var53) {
				var54 = var6.method9902();
				this.field2937[var53] = new int[var54];
				this.field2938[var53] = new int[var54];

				for (var55 = 0; var55 < var54; ++var55) {
					this.field2937[var53][var55] = var6.method9902();
					this.field2938[var53][var55] = var6.method9902();
				}
			}
		}

		var2.field5471 = var39;
		var3.field5471 = var30;
		var4.field5471 = var32;
		var5.field5471 = var35;
		var6.field5471 = var33;
		var7.field5471 = var37;
		var8.field5471 = var38;

		for (var53 = 0; var53 < var10; ++var53) {
			this.field2925[var53] = (short)var2.method9997();
			if (var12 == 1) {
				this.field2949[var53] = var3.method9955();
			}

			if (var13 == 255) {
				this.field2922[var53] = var4.method9955();
			}

			if (var14 == 1) {
				this.field2946[var53] = var5.method9955();
			}

			if (var15 == 1) {
				this.field2934[var53] = var6.method9902();
			}

			if (var16 == 1) {
				this.field2926[var53] = (short)(var7.method9997() - 1);
			}

			if (this.field2911 != null && this.field2926[var53] != -1) {
				this.field2911[var53] = (byte)(var8.method9902() - 1);
			}
		}

		var2.field5471 = var36;
		var3.field5471 = var31;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		var56 = 0;

		int var58;
		for (var57 = 0; var57 < var10; ++var57) {
			var58 = var3.method9902();
			if (var58 == 1) {
				var53 = var2.method9841() + var56;
				var54 = var2.method9841() + var53;
				var55 = var2.method9841() + var54;
				var56 = var55;
				this.field2921[var57] = var53;
				this.field2916[var57] = var54;
				this.field2952[var57] = var55;
			}

			if (var58 == 2) {
				var54 = var55;
				var55 = var2.method9841() + var56;
				var56 = var55;
				this.field2921[var57] = var53;
				this.field2916[var57] = var54;
				this.field2952[var57] = var55;
			}

			if (var58 == 3) {
				var53 = var55;
				var55 = var2.method9841() + var56;
				var56 = var55;
				this.field2921[var57] = var53;
				this.field2916[var57] = var54;
				this.field2952[var57] = var55;
			}

			if (var58 == 4) {
				int var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.method9841() + var56;
				var56 = var55;
				this.field2921[var57] = var53;
				this.field2916[var57] = var59;
				this.field2952[var57] = var55;
			}
		}

		var2.field5471 = var43;
		var3.field5471 = var44;
		var4.field5471 = var45;
		var5.field5471 = var46;
		var6.field5471 = var47;
		var7.field5471 = var48;

		for (var57 = 0; var57 < var11; ++var57) {
			var58 = this.field2929[var57] & 255;
			if (var58 == 0) {
				this.field2939[var57] = (short)var2.method9997();
				this.field2931[var57] = (short)var2.method9997();
				this.field2923[var57] = (short)var2.method9997();
			}
		}

		var2.field5471 = var28;
		var57 = var2.method9902();
		if (var57 != 0) {
			new Class288();
			var2.method9997();
			var2.method9997();
			var2.method9997();
			var2.method9832();
		}

	}

	@ObfInfo(name = "ag", desc = "([B)V")
	public void method5504(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		Class562 var4 = new Class562(var1);
		Class562 var5 = new Class562(var1);
		Class562 var6 = new Class562(var1);
		Class562 var7 = new Class562(var1);
		Class562 var8 = new Class562(var1);
		var4.field5471 = var1.length - 23;
		int var9 = var4.method9997();
		int var10 = var4.method9997();
		int var11 = var4.method9902();
		int var12 = var4.method9902();
		int var13 = var4.method9902();
		int var14 = var4.method9902();
		int var15 = var4.method9902();
		int var16 = var4.method9902();
		int var17 = var4.method9902();
		int var18 = var4.method9997();
		int var19 = var4.method9997();
		int var20 = var4.method9997();
		int var21 = var4.method9997();
		int var22 = var4.method9997();
		byte var23 = 0;
		int var47 = var9 + var23;
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
		int var10000 = var20 + var47;
		this.field2913 = var9;
		this.field2917 = var10;
		this.field2928 = var11;
		this.field2914 = new int[var9];
		this.field2915 = new int[var9];
		this.field2910 = new int[var9];
		this.field2921 = new int[var10];
		this.field2916 = new int[var10];
		this.field2952 = new int[var10];
		if (var11 > 0) {
			this.field2929 = new byte[var11];
			this.field2939 = new short[var11];
			this.field2931 = new short[var11];
			this.field2923 = new short[var11];
		}

		if (var16 == 1) {
			this.field2933 = new int[var9];
		}

		if (var12 == 1) {
			this.field2949 = new byte[var10];
			this.field2911 = new byte[var10];
			this.field2926 = new short[var10];
		}

		if (var13 == 255) {
			this.field2922 = new byte[var10];
		} else {
			this.field2932 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2946 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2934 = new int[var10];
		}

		if (var17 == 1) {
			this.field2937 = new int[var9][];
			this.field2938 = new int[var9][];
		}

		this.field2925 = new short[var10];
		var4.field5471 = var23;
		var5.field5471 = var34;
		var6.field5471 = var35;
		var7.field5471 = var47;
		var8.field5471 = var29;
		int var37 = 0;
		int var38 = 0;
		int var39 = 0;

		int var40;
		int var41;
		int var42;
		int var43;
		int var44;
		for (var40 = 0; var40 < var9; ++var40) {
			var41 = var4.method9902();
			var42 = 0;
			if ((var41 & 1) != 0) {
				var42 = var5.method9841();
			}

			var43 = 0;
			if ((var41 & 2) != 0) {
				var43 = var6.method9841();
			}

			var44 = 0;
			if ((var41 & 4) != 0) {
				var44 = var7.method9841();
			}

			this.field2914[var40] = var37 + var42;
			this.field2915[var40] = var38 + var43;
			this.field2910[var40] = var39 + var44;
			var37 = this.field2914[var40];
			var38 = this.field2915[var40];
			var39 = this.field2910[var40];
			if (var16 == 1) {
				this.field2933[var40] = var8.method9902();
			}
		}

		if (var17 == 1) {
			for (var40 = 0; var40 < var9; ++var40) {
				var41 = var8.method9902();
				this.field2937[var40] = new int[var41];
				this.field2938[var40] = new int[var41];

				for (var42 = 0; var42 < var41; ++var42) {
					this.field2937[var40][var42] = var8.method9902();
					this.field2938[var40][var42] = var8.method9902();
				}
			}
		}

		var4.field5471 = var32;
		var5.field5471 = var28;
		var6.field5471 = var26;
		var7.field5471 = var30;
		var8.field5471 = var27;

		for (var40 = 0; var40 < var10; ++var40) {
			this.field2925[var40] = (short)var4.method9997();
			if (var12 == 1) {
				var41 = var5.method9902();
				if ((var41 & 1) == 1) {
					this.field2949[var40] = 1;
					var2 = true;
				} else {
					this.field2949[var40] = 0;
				}

				if ((var41 & 2) == 2) {
					this.field2911[var40] = (byte)(var41 >> 2);
					this.field2926[var40] = this.field2925[var40];
					this.field2925[var40] = 127;
					if (this.field2926[var40] != -1) {
						var3 = true;
					}
				} else {
					this.field2911[var40] = -1;
					this.field2926[var40] = -1;
				}
			}

			if (var13 == 255) {
				this.field2922[var40] = var6.method9955();
			}

			if (var14 == 1) {
				this.field2946[var40] = var7.method9955();
			}

			if (var15 == 1) {
				this.field2934[var40] = var8.method9902();
			}
		}

		var4.field5471 = var31;
		var5.field5471 = var25;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		var43 = 0;

		int var45;
		int var46;
		for (var44 = 0; var44 < var10; ++var44) {
			var45 = var5.method9902();
			if (var45 == 1) {
				var40 = var4.method9841() + var43;
				var41 = var4.method9841() + var40;
				var42 = var4.method9841() + var41;
				var43 = var42;
				this.field2921[var44] = var40;
				this.field2916[var44] = var41;
				this.field2952[var44] = var42;
			}

			if (var45 == 2) {
				var41 = var42;
				var42 = var4.method9841() + var43;
				var43 = var42;
				this.field2921[var44] = var40;
				this.field2916[var44] = var41;
				this.field2952[var44] = var42;
			}

			if (var45 == 3) {
				var40 = var42;
				var42 = var4.method9841() + var43;
				var43 = var42;
				this.field2921[var44] = var40;
				this.field2916[var44] = var41;
				this.field2952[var44] = var42;
			}

			if (var45 == 4) {
				var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.method9841() + var43;
				var43 = var42;
				this.field2921[var44] = var40;
				this.field2916[var44] = var46;
				this.field2952[var44] = var42;
			}
		}

		var4.field5471 = var33;

		for (var44 = 0; var44 < var11; ++var44) {
			this.field2929[var44] = 0;
			this.field2939[var44] = (short)var4.method9997();
			this.field2931[var44] = (short)var4.method9997();
			this.field2923[var44] = (short)var4.method9997();
		}

		if (this.field2911 != null) {
			boolean var48 = false;

			for (var45 = 0; var45 < var10; ++var45) {
				var46 = this.field2911[var45] & 255;
				if (var46 != 255) {
					if ((this.field2939[var46] & '\uffff') == this.field2921[var45] && (this.field2931[var46] & '\uffff') == this.field2916[var45] && (this.field2923[var46] & '\uffff') == this.field2952[var45]) {
						this.field2911[var45] = -1;
					} else {
						var48 = true;
					}
				}
			}

			if (!var48) {
				this.field2911 = null;
			}
		}

		if (!var3) {
			this.field2926 = null;
		}

		if (!var2) {
			this.field2949 = null;
		}

	}

	@ObfInfo(name = "ak", desc = "([B)V")
	public void method5505(byte[] var1) {
		Class562 var2 = new Class562(var1);
		Class562 var3 = new Class562(var1);
		Class562 var4 = new Class562(var1);
		Class562 var5 = new Class562(var1);
		Class562 var6 = new Class562(var1);
		Class562 var7 = new Class562(var1);
		Class562 var8 = new Class562(var1);
		var2.field5471 = var1.length - 23;
		int var9 = var2.method9997();
		int var10 = var2.method9997();
		int var11 = var2.method9902();
		int var12 = var2.method9902();
		int var13 = var2.method9902();
		int var14 = var2.method9902();
		int var15 = var2.method9902();
		int var16 = var2.method9902();
		int var17 = var2.method9902();
		int var18 = var2.method9997();
		int var19 = var2.method9997();
		int var20 = var2.method9997();
		int var21 = var2.method9997();
		int var22 = var2.method9997();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			this.field2929 = new byte[var11];
			var2.field5471 = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.field2929[var26] = var2.method9955();
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

		var26 = var9 + var11;
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
		this.field2913 = var9;
		this.field2917 = var10;
		this.field2928 = var11;
		this.field2914 = new int[var9];
		this.field2915 = new int[var9];
		this.field2910 = new int[var9];
		this.field2921 = new int[var10];
		this.field2916 = new int[var10];
		this.field2952 = new int[var10];
		if (var17 == 1) {
			this.field2933 = new int[var9];
		}

		if (var12 == 1) {
			this.field2949 = new byte[var10];
		}

		if (var13 == 255) {
			this.field2922 = new byte[var10];
		} else {
			this.field2932 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2946 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2934 = new int[var10];
		}

		if (var16 == 1) {
			this.field2926 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field2911 = new byte[var10];
		}

		this.field2925 = new short[var10];
		if (var11 > 0) {
			this.field2939 = new short[var11];
			this.field2931 = new short[var11];
			this.field2923 = new short[var11];
		}

		var2.field5471 = var11;
		var3.field5471 = var38;
		var4.field5471 = var39;
		var5.field5471 = var40;
		var6.field5471 = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;

		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) {
			var52 = var2.method9902();
			var53 = 0;
			if ((var52 & 1) != 0) {
				var53 = var3.method9841();
			}

			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.method9841();
			}

			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.method9841();
			}

			this.field2914[var51] = var48 + var53;
			this.field2915[var51] = var49 + var54;
			this.field2910[var51] = var50 + var55;
			var48 = this.field2914[var51];
			var49 = this.field2915[var51];
			var50 = this.field2910[var51];
			if (var17 == 1) {
				this.field2933[var51] = var6.method9902();
			}
		}

		var2.field5471 = var37;
		var3.field5471 = var28;
		var4.field5471 = var30;
		var5.field5471 = var33;
		var6.field5471 = var31;
		var7.field5471 = var35;
		var8.field5471 = var36;

		for (var51 = 0; var51 < var10; ++var51) {
			this.field2925[var51] = (short)var2.method9997();
			if (var12 == 1) {
				this.field2949[var51] = var3.method9955();
			}

			if (var13 == 255) {
				this.field2922[var51] = var4.method9955();
			}

			if (var14 == 1) {
				this.field2946[var51] = var5.method9955();
			}

			if (var15 == 1) {
				this.field2934[var51] = var6.method9902();
			}

			if (var16 == 1) {
				this.field2926[var51] = (short)(var7.method9997() - 1);
			}

			if (this.field2911 != null && this.field2926[var51] != -1) {
				this.field2911[var51] = (byte)(var8.method9902() - 1);
			}
		}

		var2.field5471 = var34;
		var3.field5471 = var29;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;

		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.method9902();
			if (var56 == 1) {
				var51 = var2.method9841() + var54;
				var52 = var2.method9841() + var51;
				var53 = var2.method9841() + var52;
				var54 = var53;
				this.field2921[var55] = var51;
				this.field2916[var55] = var52;
				this.field2952[var55] = var53;
			}

			if (var56 == 2) {
				var52 = var53;
				var53 = var2.method9841() + var54;
				var54 = var53;
				this.field2921[var55] = var51;
				this.field2916[var55] = var52;
				this.field2952[var55] = var53;
			}

			if (var56 == 3) {
				var51 = var53;
				var53 = var2.method9841() + var54;
				var54 = var53;
				this.field2921[var55] = var51;
				this.field2916[var55] = var52;
				this.field2952[var55] = var53;
			}

			if (var56 == 4) {
				int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.method9841() + var54;
				var54 = var53;
				this.field2921[var55] = var51;
				this.field2916[var55] = var57;
				this.field2952[var55] = var53;
			}
		}

		var2.field5471 = var41;
		var3.field5471 = var42;
		var4.field5471 = var43;
		var5.field5471 = var44;
		var6.field5471 = var45;
		var7.field5471 = var46;

		for (var55 = 0; var55 < var11; ++var55) {
			var56 = this.field2929[var55] & 255;
			if (var56 == 0) {
				this.field2939[var55] = (short)var2.method9997();
				this.field2931[var55] = (short)var2.method9997();
				this.field2923[var55] = (short)var2.method9997();
			}
		}

		var2.field5471 = var26;
		var55 = var2.method9902();
		if (var55 != 0) {
			new Class288();
			var2.method9997();
			var2.method9997();
			var2.method9997();
			var2.method9832();
		}

	}

	@ObfInfo(name = "ap", desc = "([B)V")
	public void method5556(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		Class562 var4 = new Class562(var1);
		Class562 var5 = new Class562(var1);
		Class562 var6 = new Class562(var1);
		Class562 var7 = new Class562(var1);
		Class562 var8 = new Class562(var1);
		var4.field5471 = var1.length - 18;
		int var9 = var4.method9997();
		int var10 = var4.method9997();
		int var11 = var4.method9902();
		int var12 = var4.method9902();
		int var13 = var4.method9902();
		int var14 = var4.method9902();
		int var15 = var4.method9902();
		int var16 = var4.method9902();
		int var17 = var4.method9997();
		int var18 = var4.method9997();
		int var19 = var4.method9997();
		int var20 = var4.method9997();
		byte var21 = 0;
		int var45 = var9 + var21;
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
		int var10000 = var19 + var45;
		this.field2913 = var9;
		this.field2917 = var10;
		this.field2928 = var11;
		this.field2914 = new int[var9];
		this.field2915 = new int[var9];
		this.field2910 = new int[var9];
		this.field2921 = new int[var10];
		this.field2916 = new int[var10];
		this.field2952 = new int[var10];
		if (var11 > 0) {
			this.field2929 = new byte[var11];
			this.field2939 = new short[var11];
			this.field2931 = new short[var11];
			this.field2923 = new short[var11];
		}

		if (var16 == 1) {
			this.field2933 = new int[var9];
		}

		if (var12 == 1) {
			this.field2949 = new byte[var10];
			this.field2911 = new byte[var10];
			this.field2926 = new short[var10];
		}

		if (var13 == 255) {
			this.field2922 = new byte[var10];
		} else {
			this.field2932 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2946 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2934 = new int[var10];
		}

		this.field2925 = new short[var10];
		var4.field5471 = var21;
		var5.field5471 = var32;
		var6.field5471 = var33;
		var7.field5471 = var45;
		var8.field5471 = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) {
			var39 = var4.method9902();
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.method9841();
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.method9841();
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.method9841();
			}

			this.field2914[var38] = var35 + var40;
			this.field2915[var38] = var36 + var41;
			this.field2910[var38] = var37 + var42;
			var35 = this.field2914[var38];
			var36 = this.field2915[var38];
			var37 = this.field2910[var38];
			if (var16 == 1) {
				this.field2933[var38] = var8.method9902();
			}
		}

		var4.field5471 = var30;
		var5.field5471 = var26;
		var6.field5471 = var24;
		var7.field5471 = var28;
		var8.field5471 = var25;

		for (var38 = 0; var38 < var10; ++var38) {
			this.field2925[var38] = (short)var4.method9997();
			if (var12 == 1) {
				var39 = var5.method9902();
				if ((var39 & 1) == 1) {
					this.field2949[var38] = 1;
					var2 = true;
				} else {
					this.field2949[var38] = 0;
				}

				if ((var39 & 2) == 2) {
					this.field2911[var38] = (byte)(var39 >> 2);
					this.field2926[var38] = this.field2925[var38];
					this.field2925[var38] = 127;
					if (this.field2926[var38] != -1) {
						var3 = true;
					}
				} else {
					this.field2911[var38] = -1;
					this.field2926[var38] = -1;
				}
			}

			if (var13 == 255) {
				this.field2922[var38] = var6.method9955();
			}

			if (var14 == 1) {
				this.field2946[var38] = var7.method9955();
			}

			if (var15 == 1) {
				this.field2934[var38] = var8.method9902();
			}
		}

		var4.field5471 = var29;
		var5.field5471 = var23;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.method9902();
			if (var43 == 1) {
				var38 = var4.method9841() + var41;
				var39 = var4.method9841() + var38;
				var40 = var4.method9841() + var39;
				var41 = var40;
				this.field2921[var42] = var38;
				this.field2916[var42] = var39;
				this.field2952[var42] = var40;
			}

			if (var43 == 2) {
				var39 = var40;
				var40 = var4.method9841() + var41;
				var41 = var40;
				this.field2921[var42] = var38;
				this.field2916[var42] = var39;
				this.field2952[var42] = var40;
			}

			if (var43 == 3) {
				var38 = var40;
				var40 = var4.method9841() + var41;
				var41 = var40;
				this.field2921[var42] = var38;
				this.field2916[var42] = var39;
				this.field2952[var42] = var40;
			}

			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.method9841() + var41;
				var41 = var40;
				this.field2921[var42] = var38;
				this.field2916[var42] = var44;
				this.field2952[var42] = var40;
			}
		}

		var4.field5471 = var31;

		for (var42 = 0; var42 < var11; ++var42) {
			this.field2929[var42] = 0;
			this.field2939[var42] = (short)var4.method9997();
			this.field2931[var42] = (short)var4.method9997();
			this.field2923[var42] = (short)var4.method9997();
		}

		if (this.field2911 != null) {
			boolean var46 = false;

			for (var43 = 0; var43 < var10; ++var43) {
				var44 = this.field2911[var43] & 255;
				if (var44 != 255) {
					if ((this.field2939[var44] & '\uffff') == this.field2921[var43] && (this.field2931[var44] & '\uffff') == this.field2916[var43] && (this.field2923[var44] & '\uffff') == this.field2952[var43]) {
						this.field2911[var43] = -1;
					} else {
						var46 = true;
					}
				}
			}

			if (!var46) {
				this.field2911 = null;
			}
		}

		if (!var3) {
			this.field2926 = null;
		}

		if (!var2) {
			this.field2949 = null;
		}

	}

	@ObfInfo(name = "an", desc = "(Lkr;I)I")
	public final int method5501(Class278 var1, int var2) {
		int var3 = -1;
		int var4 = var1.field2914[var2];
		int var5 = var1.field2915[var2];
		int var6 = var1.field2910[var2];

		for (int var7 = 0; var7 < this.field2913; ++var7) {
			if (this.field2914[var7] == var4 && this.field2915[var7] == var5 && this.field2910[var7] == var6) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.field2914[this.field2913] = var4;
			this.field2915[this.field2913] = var5;
			this.field2910[this.field2913] = var6;
			if (var1.field2933 != null) {
				this.field2933[this.field2913] = var1.field2933[var2];
			}

			if (var1.field2937 != null) {
				this.field2937[this.field2913] = var1.field2937[var2];
				this.field2938[this.field2913] = var1.field2938[var2];
			}

			var3 = this.field2913++;
		}

		return var3;
	}

	@ObfInfo(name = "aj", desc = "()Lkr;")
	public Class278 method5509() {
		Class278 var1 = new Class278();
		if (this.field2949 != null) {
			var1.field2949 = new byte[this.field2917];

			for (int var2 = 0; var2 < this.field2917; ++var2) {
				var1.field2949[var2] = this.field2949[var2];
			}
		}

		var1.field2913 = this.field2913;
		var1.field2917 = this.field2917;
		var1.field2928 = this.field2928;
		var1.field2914 = this.field2914;
		var1.field2915 = this.field2915;
		var1.field2910 = this.field2910;
		var1.field2921 = this.field2921;
		var1.field2916 = this.field2916;
		var1.field2952 = this.field2952;
		var1.field2922 = this.field2922;
		var1.field2946 = this.field2946;
		var1.field2911 = this.field2911;
		var1.field2925 = this.field2925;
		var1.field2926 = this.field2926;
		var1.field2932 = this.field2932;
		var1.field2929 = this.field2929;
		var1.field2939 = this.field2939;
		var1.field2931 = this.field2931;
		var1.field2923 = this.field2923;
		var1.field2933 = this.field2933;
		var1.field2934 = this.field2934;
		var1.field2935 = this.field2935;
		var1.field2945 = this.field2945;
		var1.field2940 = this.field2940;
		var1.field2918 = this.field2918;
		var1.field2942 = this.field2942;
		var1.field2943 = this.field2943;
		return var1;
	}

	@ObfInfo(name = "av", desc = "([[IIIIZI)Lkr;")
	public Class278 method5510(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method5523();
		int var7 = this.field2936 + var2;
		int var8 = this.field2947 + var2;
		int var9 = this.field2919 + var4;
		int var10 = this.field2948 + var4;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				Class278 var11;
				if (var5) {
					var11 = new Class278();
					var11.field2913 = this.field2913;
					var11.field2917 = this.field2917;
					var11.field2928 = this.field2928;
					var11.field2914 = this.field2914;
					var11.field2910 = this.field2910;
					var11.field2921 = this.field2921;
					var11.field2916 = this.field2916;
					var11.field2952 = this.field2952;
					var11.field2949 = this.field2949;
					var11.field2922 = this.field2922;
					var11.field2946 = this.field2946;
					var11.field2911 = this.field2911;
					var11.field2925 = this.field2925;
					var11.field2926 = this.field2926;
					var11.field2932 = this.field2932;
					var11.field2929 = this.field2929;
					var11.field2939 = this.field2939;
					var11.field2931 = this.field2931;
					var11.field2923 = this.field2923;
					var11.field2933 = this.field2933;
					var11.field2934 = this.field2934;
					var11.field2935 = this.field2935;
					var11.field2945 = this.field2945;
					var11.field2942 = this.field2942;
					var11.field2943 = this.field2943;
					var11.field2915 = new int[var11.field2913];
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
					for (var12 = 0; var12 < var11.field2913; ++var12) {
						var13 = this.field2914[var12] + var2;
						var14 = this.field2910[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = (128 - var15) * var1[var17][var18] + var1[var17 + 1][var18] * var15 >> 7;
						var20 = (128 - var15) * var1[var17][var18 + 1] + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = (128 - var16) * var19 + var16 * var20 >> 7;
						var11.field2915[var12] = this.field2915[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field2913; ++var12) {
						var13 = (-this.field2915[var12] << 16) / super.field2960;
						if (var13 < var6) {
							var14 = this.field2914[var12] + var2;
							var15 = this.field2910[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = (128 - var16) * var1[var18][var19] + var1[var18 + 1][var19] * var16 >> 7;
							var21 = (128 - var16) * var1[var18][var19 + 1] + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = (128 - var17) * var20 + var17 * var21 >> 7;
							var11.field2915[var12] = (var22 - var3) * (var6 - var13) / var6 + this.field2915[var12];
						}
					}
				}

				var11.method5524();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfInfo(name = "ab", desc = "()V")
	public void method5511() {
		int[] var1;
		int var2;
		int var10002;
		int var3;
		int var4;
		if (this.field2933 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field2913; ++var3) {
				var4 = this.field2933[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field2935 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field2935[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field2913; this.field2935[var4][var1[var4]++] = var3++) {
				var4 = this.field2933[var3];
			}

			this.field2933 = null;
		}

		if (this.field2934 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field2917; ++var3) {
				var4 = this.field2934[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field2945 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field2945[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field2917; this.field2945[var4][var1[var4]++] = var3++) {
				var4 = this.field2934[var3];
			}

			this.field2934 = null;
		}

	}

	@ObfInfo(name = "ai", desc = "()V")
	public void method5512() {
		for (int var1 = 0; var1 < this.field2913; ++var1) {
			int var2 = this.field2914[var1];
			this.field2914[var1] = this.field2910[var1];
			this.field2910[var1] = -var2;
		}

		this.method5524();
	}

	@ObfInfo(name = "ae", desc = "()V")
	public void method5507() {
		for (int var1 = 0; var1 < this.field2913; ++var1) {
			this.field2914[var1] = -this.field2914[var1];
			this.field2910[var1] = -this.field2910[var1];
		}

		this.method5524();
	}

	@ObfInfo(name = "au", desc = "()V")
	public void method5514() {
		for (int var1 = 0; var1 < this.field2913; ++var1) {
			int var2 = this.field2910[var1];
			this.field2910[var1] = this.field2914[var1];
			this.field2914[var1] = -var2;
		}

		this.method5524();
	}

	@ObfInfo(name = "al", desc = "(I)V")
	public void method5515(int var1) {
		int var2 = field2953[var1];
		int var3 = field2954[var1];

		for (int var4 = 0; var4 < this.field2913; ++var4) {
			int var5 = this.field2914[var4] * var3 + this.field2910[var4] * var2 >> 16;
			this.field2910[var4] = this.field2910[var4] * var3 - this.field2914[var4] * var2 >> 16;
			this.field2914[var4] = var5;
		}

		this.method5524();
	}

	@ObfInfo(name = "ay", desc = "(III)V")
	public void method5544(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2913; ++var4) {
			int[] var10000 = this.field2914;
			var10000[var4] += var1;
			var10000 = this.field2915;
			var10000[var4] += var2;
			var10000 = this.field2910;
			var10000[var4] += var3;
		}

		this.method5524();
	}

	@ObfInfo(name = "ao", desc = "(SS)V")
	public void method5567(short var1, short var2) {
		for (int var3 = 0; var3 < this.field2917; ++var3) {
			if (this.field2925[var3] == var1) {
				this.field2925[var3] = var2;
			}
		}

	}

	@ObfInfo(name = "aa", desc = "(SS)V")
	public void method5576(short var1, short var2) {
		if (this.field2926 != null) {
			for (int var3 = 0; var3 < this.field2917; ++var3) {
				if (this.field2926[var3] == var1) {
					this.field2926[var3] = var2;
				}
			}

		}
	}

	@ObfInfo(name = "as", desc = "()V")
	public void method5519() {
		int var1;
		for (var1 = 0; var1 < this.field2913; ++var1) {
			this.field2910[var1] = -this.field2910[var1];
		}

		for (var1 = 0; var1 < this.field2917; ++var1) {
			int var2 = this.field2921[var1];
			this.field2921[var1] = this.field2952[var1];
			this.field2952[var1] = var2;
		}

		this.method5524();
	}

	@ObfInfo(name = "aw", desc = "(III)V")
	public void method5513(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2913; ++var4) {
			this.field2914[var4] = this.field2914[var4] * var1 / 128;
			this.field2915[var4] = this.field2915[var4] * var2 / 128;
			this.field2910[var4] = this.field2910[var4] * var3 / 128;
		}

		this.method5524();
	}

	@ObfInfo(name = "at", desc = "()V")
	public void method5521() {
		if (this.field2940 == null) {
			this.field2940 = new Class299[this.field2913];

			int var1;
			for (var1 = 0; var1 < this.field2913; ++var1) {
				this.field2940[var1] = new Class299();
			}

			for (var1 = 0; var1 < this.field2917; ++var1) {
				int var2 = this.field2921[var1];
				int var3 = this.field2916[var1];
				int var4 = this.field2952[var1];
				int var5 = this.field2914[var3] - this.field2914[var2];
				int var6 = this.field2915[var3] - this.field2915[var2];
				int var7 = this.field2910[var3] - this.field2910[var2];
				int var8 = this.field2914[var4] - this.field2914[var2];
				int var9 = this.field2915[var4] - this.field2915[var2];
				int var10 = this.field2910[var4] - this.field2910[var2];
				int var11 = var6 * var10 - var7 * var9;
				int var12 = var7 * var8 - var5 * var10;

				int var13;
				for (var13 = var5 * var9 - var6 * var8; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
					var11 >>= 1;
					var12 >>= 1;
				}

				int var14 = (int)Math.sqrt((double)(var13 * var13 + var11 * var11 + var12 * var12));
				if (var14 <= 0) {
					var14 = 1;
				}

				var11 = var11 * 256 / var14;
				var12 = var12 * 256 / var14;
				var13 = var13 * 256 / var14;
				byte var15;
				if (this.field2949 == null) {
					var15 = 0;
				} else {
					var15 = this.field2949[var1];
				}

				if (var15 == 0) {
					Class299 var16 = this.field2940[var2];
					var16.field3068 += var11;
					var16.field3064 += var12;
					var16.field3063 += var13;
					++var16.field3066;
					var16 = this.field2940[var3];
					var16.field3068 += var11;
					var16.field3064 += var12;
					var16.field3063 += var13;
					++var16.field3066;
					var16 = this.field2940[var4];
					var16.field3068 += var11;
					var16.field3064 += var12;
					var16.field3063 += var13;
					++var16.field3066;
				} else if (var15 == 1) {
					if (this.field2918 == null) {
						this.field2918 = new Class297[this.field2917];
					}

					Class297 var17 = this.field2918[var1] = new Class297();
					var17.field3062 = var11;
					var17.field3057 = var12;
					var17.field3056 = var13;
				}
			}

		}
	}

	@ObfInfo(name = "af", desc = "()V")
	public void method5524() {
		this.field2940 = null;
		this.field2941 = null;
		this.field2918 = null;
		this.field2944 = false;
	}

	@ObfInfo(name = "am", desc = "()V")
	public void method5523() {
		if (!this.field2944) {
			super.field2960 = 0;
			this.field2920 = 0;
			this.field2936 = 999999;
			this.field2947 = -999999;
			this.field2948 = -99999;
			this.field2919 = 99999;

			for (int var1 = 0; var1 < this.field2913; ++var1) {
				int var2 = this.field2914[var1];
				int var3 = this.field2915[var1];
				int var4 = this.field2910[var1];
				if (var2 < this.field2936) {
					this.field2936 = var2;
				}

				if (var2 > this.field2947) {
					this.field2947 = var2;
				}

				if (var4 < this.field2919) {
					this.field2919 = var4;
				}

				if (var4 > this.field2948) {
					this.field2948 = var4;
				}

				if (-var3 > super.field2960) {
					super.field2960 = -var3;
				}

				if (var3 > this.field2920) {
					this.field2920 = var3;
				}
			}

			this.field2944 = true;
		}
	}

	@ObfInfo(name = "bt", desc = "(IIIII)Llv;")
	public final Class308 method5517(int var1, int var2, int var3, int var4, int var5) {
		this.method5521();
		int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
		int var7 = var2 * var6 >> 8;
		Class308 var8 = new Class308();
		var8.field3166 = new int[this.field2917];
		var8.field3200 = new int[this.field2917];
		var8.field3168 = new int[this.field2917];
		if (this.field2928 > 0 && this.field2911 != null) {
			int[] var9 = new int[this.field2928];

			int var10;
			for (var10 = 0; var10 < this.field2917; ++var10) {
				if (this.field2911[var10] != -1) {
					++var9[this.field2911[var10] & 255];
				}
			}

			var8.field3179 = 0;

			for (var10 = 0; var10 < this.field2928; ++var10) {
				if (var9[var10] > 0 && this.field2929[var10] == 0) {
					++var8.field3179;
				}
			}

			var8.field3175 = new int[var8.field3179];
			var8.field3205 = new int[var8.field3179];
			var8.field3182 = new int[var8.field3179];
			var10 = 0;

			int var11;
			for (var11 = 0; var11 < this.field2928; ++var11) {
				if (var9[var11] > 0 && this.field2929[var11] == 0) {
					var8.field3175[var10] = this.field2939[var11] & '\uffff';
					var8.field3205[var10] = this.field2931[var11] & '\uffff';
					var8.field3182[var10] = this.field2923[var11] & '\uffff';
					var9[var11] = var10++;
				} else {
					var9[var11] = -1;
				}
			}

			var8.field3171 = new byte[this.field2917];

			for (var11 = 0; var11 < this.field2917; ++var11) {
				if (this.field2911[var11] != -1) {
					var8.field3171[var11] = (byte)var9[this.field2911[var11] & 255];
				} else {
					var8.field3171[var11] = -1;
				}
			}
		}

		for (int var16 = 0; var16 < this.field2917; ++var16) {
			byte var17;
			if (this.field2949 == null) {
				var17 = 0;
			} else {
				var17 = this.field2949[var16];
			}

			byte var18;
			if (this.field2946 == null) {
				var18 = 0;
			} else {
				var18 = this.field2946[var16];
			}

			short var12;
			if (this.field2926 == null) {
				var12 = -1;
			} else {
				var12 = this.field2926[var16];
			}

			if (var18 == -2) {
				var17 = 3;
			}

			if (var18 == -1) {
				var17 = 2;
			}

			Class299 var13;
			int var14;
			Class297 var19;
			if (var12 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = this.field2918[var16];
						var14 = (var19.field3056 * var5 + var19.field3062 * var3 + var19.field3057 * var4) / (var7 / 2 + var7) + var1;
						var8.field3166[var16] = method5561(this.field2925[var16] & '\uffff', var14);
						var8.field3168[var16] = -1;
					} else if (var17 == 3) {
						var8.field3166[var16] = 128;
						var8.field3168[var16] = -1;
					} else {
						var8.field3168[var16] = -2;
					}
				} else {
					int var15 = this.field2925[var16] & '\uffff';
					if (this.field2941 != null && this.field2941[this.field2921[var16]] != null) {
						var13 = this.field2941[this.field2921[var16]];
					} else {
						var13 = this.field2940[this.field2921[var16]];
					}

					var14 = (var13.field3063 * var5 + var13.field3068 * var3 + var13.field3064 * var4) / (var13.field3066 * var7) + var1;
					var8.field3166[var16] = method5561(var15, var14);
					if (this.field2941 != null && this.field2941[this.field2916[var16]] != null) {
						var13 = this.field2941[this.field2916[var16]];
					} else {
						var13 = this.field2940[this.field2916[var16]];
					}

					var14 = (var13.field3063 * var5 + var13.field3068 * var3 + var13.field3064 * var4) / (var13.field3066 * var7) + var1;
					var8.field3200[var16] = method5561(var15, var14);
					if (this.field2941 != null && this.field2941[this.field2952[var16]] != null) {
						var13 = this.field2941[this.field2952[var16]];
					} else {
						var13 = this.field2940[this.field2952[var16]];
					}

					var14 = (var13.field3063 * var5 + var13.field3068 * var3 + var13.field3064 * var4) / (var13.field3066 * var7) + var1;
					var8.field3168[var16] = method5561(var15, var14);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = this.field2918[var16];
					var14 = (var19.field3056 * var5 + var19.field3062 * var3 + var19.field3057 * var4) / (var7 / 2 + var7) + var1;
					var8.field3166[var16] = method5516(var14);
					var8.field3168[var16] = -1;
				} else {
					var8.field3168[var16] = -2;
				}
			} else {
				if (this.field2941 != null && this.field2941[this.field2921[var16]] != null) {
					var13 = this.field2941[this.field2921[var16]];
				} else {
					var13 = this.field2940[this.field2921[var16]];
				}

				var14 = (var13.field3063 * var5 + var13.field3068 * var3 + var13.field3064 * var4) / (var13.field3066 * var7) + var1;
				var8.field3166[var16] = method5516(var14);
				if (this.field2941 != null && this.field2941[this.field2916[var16]] != null) {
					var13 = this.field2941[this.field2916[var16]];
				} else {
					var13 = this.field2940[this.field2916[var16]];
				}

				var14 = (var13.field3063 * var5 + var13.field3068 * var3 + var13.field3064 * var4) / (var13.field3066 * var7) + var1;
				var8.field3200[var16] = method5516(var14);
				if (this.field2941 != null && this.field2941[this.field2952[var16]] != null) {
					var13 = this.field2941[this.field2952[var16]];
				} else {
					var13 = this.field2940[this.field2952[var16]];
				}

				var14 = (var13.field3063 * var5 + var13.field3068 * var3 + var13.field3064 * var4) / (var13.field3066 * var7) + var1;
				var8.field3168[var16] = method5516(var14);
			}
		}

		this.method5511();
		var8.field3158 = this.field2913;
		var8.field3159 = this.field2914;
		var8.field3173 = this.field2915;
		var8.field3211 = this.field2910;
		var8.field3162 = this.field2917;
		var8.field3163 = this.field2921;
		var8.field3164 = this.field2916;
		var8.field3155 = this.field2952;
		var8.field3169 = this.field2922;
		var8.field3170 = this.field2946;
		var8.field3226 = this.field2932;
		var8.field3178 = this.field2935;
		var8.field3208 = this.field2945;
		var8.field3172 = this.field2926;
		var8.field3180 = this.field2937;
		var8.field3181 = this.field2938;
		return var8;
	}

	@ObfInfo(name = "aq", desc = "(Lok;II)Lkr;")
	public static Class278 method5522(Class375 var0, int var1, int var2) {
		byte[] var3 = var0.method7132(var1, var2);
		return var3 == null ? null : new Class278(var3);
	}

	@ObfInfo(name = "ar", desc = "(Lkr;Lkr;IIIZ)V")
	public static void method5526(Class278 var0, Class278 var1, int var2, int var3, int var4, boolean var5) {
		var0.method5523();
		var0.method5521();
		var1.method5523();
		var1.method5521();
		++field2927;
		int var6 = 0;
		int[] var7 = var1.field2914;
		int var8 = var1.field2913;

		int var9;
		for (var9 = 0; var9 < var0.field2913; ++var9) {
			Class299 var10 = var0.field2940[var9];
			if (var10.field3066 != 0) {
				int var11 = var0.field2915[var9] - var3;
				if (var11 <= var1.field2920) {
					int var12 = var0.field2914[var9] - var2;
					if (var12 >= var1.field2936 && var12 <= var1.field2947) {
						int var13 = var0.field2910[var9] - var4;
						if (var13 >= var1.field2919 && var13 <= var1.field2948) {
							for (int var14 = 0; var14 < var8; ++var14) {
								Class299 var15 = var1.field2940[var14];
								if (var7[var14] == var12 && var1.field2910[var14] == var13 && var1.field2915[var14] == var11 && var15.field3066 != 0) {
									if (var0.field2941 == null) {
										var0.field2941 = new Class299[var0.field2913];
									}

									if (var1.field2941 == null) {
										var1.field2941 = new Class299[var8];
									}

									Class299 var16 = var0.field2941[var9];
									if (var16 == null) {
										var16 = var0.field2941[var9] = new Class299(var10);
									}

									Class299 var17 = var1.field2941[var14];
									if (var17 == null) {
										var17 = var1.field2941[var14] = new Class299(var15);
									}

									var16.field3068 += var15.field3068;
									var16.field3064 += var15.field3064;
									var16.field3063 += var15.field3063;
									var16.field3066 += var15.field3066;
									var17.field3068 += var10.field3068;
									var17.field3064 += var10.field3064;
									var17.field3063 += var10.field3063;
									var17.field3066 += var10.field3066;
									++var6;
									field2950[var9] = field2927;
									field2951[var14] = field2927;
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) {
			for (var9 = 0; var9 < var0.field2917; ++var9) {
				if (field2950[var0.field2921[var9]] == field2927 && field2950[var0.field2916[var9]] == field2927 && field2950[var0.field2952[var9]] == field2927) {
					if (var0.field2949 == null) {
						var0.field2949 = new byte[var0.field2917];
					}

					var0.field2949[var9] = 2;
				}
			}

			for (var9 = 0; var9 < var1.field2917; ++var9) {
				if (field2951[var1.field2921[var9]] == field2927 && field2951[var1.field2916[var9]] == field2927 && field2951[var1.field2952[var9]] == field2927) {
					if (var1.field2949 == null) {
						var1.field2949 = new byte[var1.field2917];
					}

					var1.field2949[var9] = 2;
				}
			}

		}
	}

	@ObfInfo(name = "bj", desc = "(II)I")
	public static int method5561(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfInfo(name = "be", desc = "(I)I")
	public static int method5516(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}
}
