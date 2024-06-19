import java.util.Arrays;
import java.util.HashMap;

public class Class262 extends Class255 {
	public static Class262 field2844;
	public static Class262 field2885;
	public static Class428 field2846;
	public static Class428 field2847;
	public static Class428 field2848;
	public static boolean field2905;
	public static boolean[] field2868;
	public static boolean[] field2881;
	public static byte[] field2845;
	public static byte[] field2876;
	public static char[] field2891;
	public static char[][] field2892;
	public static float[] field2887;
	public static float[] field2901;
	public static float[] field2919;
	public static int field2879;
	public static int field2902;
	public static int field2903;
	public static int[] field2843;
	public static int[] field2860;
	public static int[] field2865;
	public static int[] field2870;
	public static int[] field2882;
	public static int[] field2884;
	public static int[] field2886;
	public static int[] field2889;
	public static int[] field2893;
	public static int[] field2895;
	public static int[] field2896;
	public static int[] field2899;
	public static int[] field2900;
	public static int[] field2909;
	public static int[] field2910;
	public static int[] field2913;
	public static int[] field2918;
	public static int[][] field2894;
	public static final float field2851;
	public boolean field2873;
	public byte field2842;
	public byte field2890;
	public byte field2915;
	public byte field2916;
	public byte field2917;
	public byte[] field2861;
	public byte[] field2862;
	public byte[] field2864;
	public int field2849;
	public int field2853;
	public int field2874;
	public int field2875;
	public int field2877;
	public int field2878;
	public int field2904;
	public int field2912;
	public int[] field2850;
	public int[] field2852;
	public int[] field2854;
	public int[] field2855;
	public int[] field2856;
	public int[] field2857;
	public int[] field2858;
	public int[] field2859;
	public int[] field2866;
	public int[] field2907;
	public int[] field2908;
	public int[] field2911;
	public int[][] field2869;
	public int[][] field2871;
	public int[][] field2872;
	public int[][] field2898;
	public HashMap field2888;
	public short field2867;
	public short[] field2863;

	static {
		field2885 = new Class262();
		field2876 = new byte[1];
		field2844 = new Class262();
		field2845 = new byte[1];
		field2846 = new Class428();
		field2847 = new Class428();
		field2848 = new Class428();
		field2881 = new boolean[6500];
		field2868 = new boolean[6500];
		field2843 = new int[6500];
		field2884 = new int[6500];
		field2887 = new float[6500];
		field2886 = new int[6500];
		field2889 = new int[6500];
		field2870 = new int[6500];
		field2860 = new int[6500];
		field2891 = new char[6000];
		field2892 = new char[6000][512];
		field2893 = new int[12];
		field2894 = new int[12][2000];
		field2895 = new int[2000];
		field2896 = new int[2000];
		field2865 = new int[12];
		field2918 = new int[10];
		field2899 = new int[10];
		field2900 = new int[10];
		field2901 = new float[10];
		field2905 = true;
		field2913 = Class253.field2683;
		field2909 = Class253.field2687;
		field2910 = Class253.field2684;
		field2882 = Class253.field2685;
		field2851 = Class264.method3408(50);
		field2919 = new float[3];
	}

	public Class262() {
		this.field2849 = 0;
		this.field2853 = 0;
		this.field2890 = 0;
		this.field2904 = 0;
		this.field2873 = false;
		this.field2888 = new HashMap();
	}

	public Class262(Class262[] var1, int var2) {
		this.field2849 = 0;
		this.field2853 = 0;
		this.field2890 = 0;
		this.field2904 = 0;
		this.field2873 = false;
		this.field2888 = new HashMap();
		this.field2849 = 0;
		this.field2853 = 0;
		this.field2904 = 0;
		this.field2890 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Class262 var4 = var1[var3];
			if (var4 != null) {
				this.field2849 += var4.field2849;
				this.field2853 += var4.field2853;
				this.field2904 += var4.field2904;
				if (this.field2890 == -1) {
					this.field2890 = var4.field2890;
				}
			}
		}

		this.method5165(this.field2849, this.field2853, this.field2904);
		this.field2849 = 0;
		this.field2853 = 0;
		this.field2904 = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5284(var1[var3]);
		}

	}

	public Class262(int var1, int var2, int var3, byte var4) {
		this.field2849 = 0;
		this.field2853 = 0;
		this.field2890 = 0;
		this.field2904 = 0;
		this.field2873 = false;
		this.field2888 = new HashMap();
		this.method5165(var1, var2, var3);
		this.field2890 = var4;
		this.field2849 = 0;
		this.field2853 = 0;
		this.field2904 = 0;
	}

	public void method5165(int var1, int var2, int var3) {
		this.field2850 = new int[var1];
		this.field2907 = new int[var1];
		this.field2852 = new int[var1];
		this.field2854 = new int[var2];
		this.field2855 = new int[var2];
		this.field2856 = new int[var2];
		this.field2857 = new int[var2];
		this.field2858 = new int[var2];
		this.field2859 = new int[var2];
		if (var3 > 0) {
			this.field2866 = new int[var3];
			this.field2911 = new int[var3];
			this.field2908 = new int[var3];
		}

	}

	public void method5191(Class262 var1) {
		int var2 = this.field2854.length;
		if (this.field2864 == null && (var1.field2864 != null || this.field2890 != var1.field2890)) {
			this.field2864 = new byte[var2];
			Arrays.fill(this.field2864, this.field2890);
		}

		if (this.field2861 == null && var1.field2861 != null) {
			this.field2861 = new byte[var2];
			Arrays.fill(this.field2861, (byte)0);
		}

		if (this.field2863 == null && var1.field2863 != null) {
			this.field2863 = new short[var2];
			Arrays.fill(this.field2863, (short)-1);
		}

		if (this.field2862 == null && var1.field2862 != null) {
			this.field2862 = new byte[var2];
			Arrays.fill(this.field2862, (byte)-1);
		}

	}

	public void method5284(Class262 var1) {
		if (var1 != null) {
			this.method5191(var1);

			int var2;
			for (var2 = 0; var2 < var1.field2853; ++var2) {
				this.field2854[this.field2853] = var1.field2854[var2] + this.field2849;
				this.field2855[this.field2853] = var1.field2855[var2] + this.field2849;
				this.field2856[this.field2853] = var1.field2856[var2] + this.field2849;
				this.field2857[this.field2853] = var1.field2857[var2];
				this.field2858[this.field2853] = var1.field2858[var2];
				this.field2859[this.field2853] = var1.field2859[var2];
				if (this.field2864 != null) {
					this.field2864[this.field2853] = var1.field2864 != null ? var1.field2864[var2] : var1.field2890;
				}

				if (this.field2861 != null && var1.field2861 != null) {
					this.field2861[this.field2853] = var1.field2861[var2];
				}

				if (this.field2863 != null) {
					this.field2863[this.field2853] = var1.field2863 != null ? var1.field2863[var2] : -1;
				}

				if (this.field2862 != null) {
					if (var1.field2862 != null && var1.field2862[var2] != -1) {
						this.field2862[this.field2853] = (byte)(var1.field2862[var2] + this.field2904);
					} else {
						this.field2862[this.field2853] = -1;
					}
				}

				++this.field2853;
			}

			for (var2 = 0; var2 < var1.field2904; ++var2) {
				this.field2866[this.field2904] = var1.field2866[var2] + this.field2849;
				this.field2911[this.field2904] = var1.field2911[var2] + this.field2849;
				this.field2908[this.field2904] = var1.field2908[var2] + this.field2849;
				++this.field2904;
			}

			for (var2 = 0; var2 < var1.field2849; ++var2) {
				this.field2850[this.field2849] = var1.field2850[var2];
				this.field2907[this.field2849] = var1.field2907[var2];
				this.field2852[this.field2849] = var1.field2852[var2];
				++this.field2849;
			}

		}
	}

	public Class262 method5238(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method5173();
		int var7 = var2 - this.field2912;
		int var8 = this.field2912 + var2;
		int var9 = var4 - this.field2912;
		int var10 = this.field2912 + var4;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				Class262 var11;
				if (var5) {
					var11 = new Class262();
					var11.field2849 = this.field2849;
					var11.field2853 = this.field2853;
					var11.field2904 = this.field2904;
					var11.field2850 = this.field2850;
					var11.field2852 = this.field2852;
					var11.field2854 = this.field2854;
					var11.field2855 = this.field2855;
					var11.field2856 = this.field2856;
					var11.field2857 = this.field2857;
					var11.field2858 = this.field2858;
					var11.field2859 = this.field2859;
					var11.field2864 = this.field2864;
					var11.field2861 = this.field2861;
					var11.field2862 = this.field2862;
					var11.field2863 = this.field2863;
					var11.field2890 = this.field2890;
					var11.field2866 = this.field2866;
					var11.field2911 = this.field2911;
					var11.field2908 = this.field2908;
					var11.field2869 = this.field2869;
					var11.field2898 = this.field2898;
					var11.field2873 = this.field2873;
					var11.field2907 = new int[var11.field2849];
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
					for (var12 = 0; var12 < var11.field2849; ++var12) {
						var13 = this.field2850[var12] + var2;
						var14 = this.field2852[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field2907[var12] = this.field2907[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field2849; ++var12) {
						var13 = (-this.field2907[var12] << 16) / super.field2696;
						if (var13 < var6) {
							var14 = this.field2850[var12] + var2;
							var15 = this.field2852[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field2907[var12] = this.field2907[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method5176();
				return var11;
			}
		} else {
			return this;
		}
	}

	public Class262 method5214(boolean var1) {
		if (!var1 && field2876.length < this.field2853) {
			field2876 = new byte[this.field2853 + 100];
		}

		return this.method5171(var1, field2885, field2876);
	}

	public Class262 method5170(boolean var1) {
		if (!var1 && field2845.length < this.field2853) {
			field2845 = new byte[this.field2853 + 100];
		}

		return this.method5171(var1, field2844, field2845);
	}

	public Class262 method5171(boolean var1, Class262 var2, byte[] var3) {
		var2.field2849 = this.field2849;
		var2.field2853 = this.field2853;
		var2.field2904 = this.field2904;
		if (var2.field2850 == null || var2.field2850.length < this.field2849) {
			var2.field2850 = new int[this.field2849 + 100];
			var2.field2907 = new int[this.field2849 + 100];
			var2.field2852 = new int[this.field2849 + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.field2849; ++var4) {
			var2.field2850[var4] = this.field2850[var4];
			var2.field2907[var4] = this.field2907[var4];
			var2.field2852[var4] = this.field2852[var4];
		}

		if (var1) {
			var2.field2861 = this.field2861;
		} else {
			var2.field2861 = var3;
			if (this.field2861 == null) {
				for (var4 = 0; var4 < this.field2853; ++var4) {
					var2.field2861[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.field2853; ++var4) {
					var2.field2861[var4] = this.field2861[var4];
				}
			}
		}

		var2.field2854 = this.field2854;
		var2.field2855 = this.field2855;
		var2.field2856 = this.field2856;
		var2.field2857 = this.field2857;
		var2.field2858 = this.field2858;
		var2.field2859 = this.field2859;
		var2.field2864 = this.field2864;
		var2.field2862 = this.field2862;
		var2.field2863 = this.field2863;
		var2.field2890 = this.field2890;
		var2.field2866 = this.field2866;
		var2.field2911 = this.field2911;
		var2.field2908 = this.field2908;
		var2.field2869 = this.field2869;
		var2.field2898 = this.field2898;
		var2.field2871 = this.field2871;
		var2.field2872 = this.field2872;
		var2.field2873 = this.field2873;
		var2.method5176();
		var2.field2917 = 0;
		return var2;
	}

	public void method5172(int var1) {
		if (!this.field2888.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field2909[var1];
			int var9 = field2913[var1];

			for (int var10 = 0; var10 < this.field2849; ++var10) {
				int var12 = this.field2850[var10];
				int var13 = this.field2852[var10];
				int var11 = var12 * var8 + var13 * var9 >> 16;
				int var15 = this.field2907[var10];
				int var16 = Class402.method7534(this.field2850[var10], this.field2852[var10], var8, var9);
				if (var11 < var2) {
					var2 = var11;
				}

				if (var11 > var5) {
					var5 = var11;
				}

				if (var15 < var3) {
					var3 = var15;
				}

				if (var15 > var6) {
					var6 = var15;
				}

				if (var16 < var4) {
					var4 = var16;
				}

				if (var16 > var7) {
					var7 = var16;
				}
			}

			Class249 var17 = new Class249((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
			boolean var18 = true;
			if (var17.field2670 < 32) {
				var17.field2670 = 32;
			}

			if (var17.field2665 < 32) {
				var17.field2665 = 32;
			}

			if (this.field2873) {
				boolean var19 = true;
				var17.field2670 += 8;
				var17.field2665 += 8;
			}

			this.field2888.put(var1, var17);
		}
	}

	public void method5173() {
		if (this.field2874 != 1) {
			this.field2874 = 1;
			super.field2696 = 0;
			this.field2875 = 0;
			this.field2912 = 0;

			for (int var1 = 0; var1 < this.field2849; ++var1) {
				int var2 = this.field2850[var1];
				int var3 = this.field2907[var1];
				int var4 = this.field2852[var1];
				if (-var3 > super.field2696) {
					super.field2696 = -var3;
				}

				if (var3 > this.field2875) {
					this.field2875 = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.field2912) {
					this.field2912 = var5;
				}
			}

			this.field2912 = (int)(Math.sqrt((double)this.field2912) + 0.99D);
			this.field2878 = (int)(Math.sqrt((double)(this.field2912 * this.field2912 + super.field2696 * super.field2696)) + 0.99D);
			this.field2877 = this.field2878 + (int)(Math.sqrt((double)(this.field2912 * this.field2912 + this.field2875 * this.field2875)) + 0.99D);
		}
	}

	public void method5174() {
		if (this.field2874 != 2) {
			this.field2874 = 2;
			this.field2912 = 0;

			for (int var1 = 0; var1 < this.field2849; ++var1) {
				int var2 = this.field2850[var1];
				int var3 = this.field2907[var1];
				int var4 = this.field2852[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.field2912) {
					this.field2912 = var5;
				}
			}

			this.field2912 = (int)(Math.sqrt((double)this.field2912) + 0.99D);
			this.field2878 = this.field2912;
			this.field2877 = this.field2912 + this.field2912;
		}
	}

	public int method5175() {
		this.method5173();
		return this.field2912;
	}

	public void method5176() {
		this.field2874 = 0;
		this.field2888.clear();
	}

	public void method5177(Class246 var1, int var2) {
		if (this.field2869 != null) {
			Class238 var3 = var1.field2645[var2];
			Class248 var4 = var3.field2573;
			field2902 = 0;
			field2903 = 0;
			field2879 = 0;

			for (int var5 = 0; var5 < var3.field2574; ++var5) {
				int var6 = var3.field2569[var5];
				this.method5184(var4.field2661[var6], var4.field2662[var6], var3.field2570[var5], var3.field2577[var5], var3.field2578[var5]);
			}

			this.method5176();
		}
	}

	public void method5178(Class145 var1, int var2) {
		Class248 var3 = var1.field1654;
		Class239 var4 = var3.method4761();
		if (var4 != null) {
			var3.method4761().method4638(var1, var2);
			this.method5180(var3.method4761(), var1.method3191());
		}

		if (var1.method3192()) {
			this.method5179(var1, var2);
		}

		this.method5176();
	}

	public void method5179(Class145 var1, int var2) {
		Class248 var3 = var1.field1654;

		for (int var4 = 0; var4 < var3.field2660; ++var4) {
			int var5 = var3.field2661[var4];
			if (var5 == 5 && var1.field1657 != null && var1.field1657[var4] != null && var1.field1657[var4][0] != null && this.field2898 != null && this.field2861 != null) {
				Class143 var6 = var1.field1657[var4][0];
				int[] var7 = var3.field2662[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.field2898.length) {
						int[] var11 = this.field2898[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.field2861[var13] & 255) + var6.method3156(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.field2861[var13] = (byte)var14;
						}
					}
				}
			}
		}

	}

	public void method5180(Class239 var1, int var2) {
		this.method5256(var1, var2);
	}

	public void method5182(Class246 var1, int var2, Class246 var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				Class238 var6 = var1.field2645[var2];
				Class238 var7 = var3.field2645[var4];
				Class248 var8 = var6.field2573;
				field2902 = 0;
				field2903 = 0;
				field2879 = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.field2574; ++var11) {
					for (var12 = var6.field2569[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 != var10 || var8.field2661[var12] == 0) {
						this.method5184(var8.field2661[var12], var8.field2662[var12], var6.field2570[var11], var6.field2577[var11], var6.field2578[var11]);
					}
				}

				field2902 = 0;
				field2903 = 0;
				field2879 = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.field2574; ++var11) {
					for (var12 = var7.field2569[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 == var10 || var8.field2661[var12] == 0) {
						this.method5184(var8.field2661[var12], var8.field2662[var12], var7.field2570[var11], var7.field2577[var11], var7.field2578[var11]);
					}
				}

				this.method5176();
			} else {
				this.method5177(var1, var2);
			}
		}
	}

	public void method5268(Class248 var1, Class145 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		Class239 var7 = var1.method4761();
		if (var7 != null) {
			var7.method4642(var2, var3, var4, var5);
			if (var6) {
				this.method5180(var7, var2.method3191());
			}
		}

		if (!var5 && var2.method3192()) {
			this.method5179(var2, var3);
		}

	}

	public void method5183(Class246 var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.method5177(var1, var2);
		} else {
			Class238 var5 = var1.field2645[var2];
			Class248 var6 = var5.field2573;
			byte var7 = 0;
			int var11 = var7 + 1;
			int var8 = var3[var7];
			field2902 = 0;
			field2903 = 0;
			field2879 = 0;

			for (int var9 = 0; var9 < var5.field2574; ++var9) {
				int var10;
				for (var10 = var5.field2569[var9]; var10 > var8; var8 = var3[var11++]) {
				}

				if (var4) {
					if (var10 == var8 || var6.field2661[var10] == 0) {
						this.method5184(var6.field2661[var10], var6.field2662[var10], var5.field2570[var9], var5.field2577[var9], var5.field2578[var9]);
					}
				} else if (var10 != var8 || var6.field2661[var10] == 0) {
					this.method5184(var6.field2661[var10], var6.field2662[var10], var5.field2570[var9], var5.field2577[var9], var5.field2578[var9]);
				}
			}

		}
	}

	public void method5184(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			field2902 = 0;
			field2903 = 0;
			field2879 = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var18 = var2[var8];
				if (var18 < this.field2869.length) {
					int[] var19 = this.field2869[var18];

					for (var11 = 0; var11 < var19.length; ++var11) {
						var12 = var19[var11];
						field2902 += this.field2850[var12];
						field2903 += this.field2907[var12];
						field2879 += this.field2852[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				field2902 = field2902 / var7 + var3;
				field2903 = field2903 / var7 + var4;
				field2879 = field2879 / var7 + var5;
			} else {
				field2902 = var3;
				field2903 = var4;
				field2879 = var5;
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field2869.length) {
						var9 = this.field2869[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field2850;
							var10000[var11] += var3;
							var10000 = this.field2907;
							var10000[var11] += var4;
							var10000 = this.field2852;
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field2869.length) {
						var9 = this.field2869[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field2850;
							var10000[var11] -= field2902;
							var10000 = this.field2907;
							var10000[var11] -= field2903;
							var10000 = this.field2852;
							var10000[var11] -= field2879;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field2913[var14];
								var16 = field2909[var14];
								var17 = this.field2907[var11] * var15 + this.field2850[var11] * var16 >> 16;
								this.field2907[var11] = this.field2907[var11] * var16 - this.field2850[var11] * var15 >> 16;
								this.field2850[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2913[var12];
								var16 = field2909[var12];
								var17 = this.field2907[var11] * var16 - this.field2852[var11] * var15 >> 16;
								this.field2852[var11] = this.field2907[var11] * var15 + this.field2852[var11] * var16 >> 16;
								this.field2907[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2913[var13];
								var16 = field2909[var13];
								var17 = this.field2852[var11] * var15 + this.field2850[var11] * var16 >> 16;
								this.field2852[var11] = this.field2852[var11] * var16 - this.field2850[var11] * var15 >> 16;
								this.field2850[var11] = var17;
							}

							var10000 = this.field2850;
							var10000[var11] += field2902;
							var10000 = this.field2907;
							var10000[var11] += field2903;
							var10000 = this.field2852;
							var10000[var11] += field2879;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field2869.length) {
						var9 = this.field2869[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field2850;
							var10000[var11] -= field2902;
							var10000 = this.field2907;
							var10000[var11] -= field2903;
							var10000 = this.field2852;
							var10000[var11] -= field2879;
							this.field2850[var11] = this.field2850[var11] * var3 / 128;
							this.field2907[var11] = this.field2907[var11] * var4 / 128;
							this.field2852[var11] = this.field2852[var11] * var5 / 128;
							var10000 = this.field2850;
							var10000[var11] += field2902;
							var10000 = this.field2907;
							var10000[var11] += field2903;
							var10000 = this.field2852;
							var10000[var11] += field2879;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.field2898 != null && this.field2861 != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.field2898.length) {
							var9 = this.field2898[var8];

							for (var10 = 0; var10 < var9.length; ++var10) {
								var11 = var9[var10];
								var12 = (this.field2861[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.field2861[var11] = (byte)var12;
							}
						}
					}
				}

			}
		}
	}

	public void method5243() {
		for (int var1 = 0; var1 < this.field2849; ++var1) {
			int var2 = this.field2850[var1];
			this.field2850[var1] = this.field2852[var1];
			this.field2852[var1] = -var2;
		}

		this.method5176();
	}

	public void method5181() {
		for (int var1 = 0; var1 < this.field2849; ++var1) {
			this.field2850[var1] = -this.field2850[var1];
			this.field2852[var1] = -this.field2852[var1];
		}

		this.method5176();
	}

	public void method5222() {
		for (int var1 = 0; var1 < this.field2849; ++var1) {
			int var2 = this.field2852[var1];
			this.field2852[var1] = this.field2850[var1];
			this.field2850[var1] = -var2;
		}

		this.method5176();
	}

	public void method5251(int var1) {
		int var2 = field2913[var1];
		int var3 = field2909[var1];

		for (int var4 = 0; var4 < this.field2849; ++var4) {
			int var5 = this.field2907[var4] * var3 - this.field2852[var4] * var2 >> 16;
			this.field2852[var4] = this.field2907[var4] * var2 + this.field2852[var4] * var3 >> 16;
			this.field2907[var4] = var5;
		}

		this.method5176();
	}

	public void method5189(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2849; ++var4) {
			int[] var10000 = this.field2850;
			var10000[var4] += var1;
			var10000 = this.field2907;
			var10000[var4] += var2;
			var10000 = this.field2852;
			var10000[var4] += var3;
		}

		this.method5176();
	}

	public void method5190(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2849; ++var4) {
			this.field2850[var4] = this.field2850[var4] * var1 / 128;
			this.field2907[var4] = this.field2907[var4] * var2 / 128;
			this.field2852[var4] = this.field2852[var4] * var3 / 128;
		}

		this.method5176();
	}

	public final void method5288(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.field2874 != 2 && this.field2874 != 1) {
			this.method5174();
		}

		int var8 = Class253.method4805();
		int var9 = Class253.method4788();
		int var10 = field2913[var1];
		int var11 = field2909[var1];
		int var12 = field2913[var2];
		int var13 = field2909[var2];
		int var14 = field2913[var3];
		int var15 = field2909[var3];
		int var16 = field2913[var4];
		int var17 = field2909[var4];
		int var18 = var16 * var6 + var17 * var7 >> 16;

		for (int var19 = 0; var19 < this.field2849; ++var19) {
			int var20 = this.field2850[var19];
			int var21 = this.field2907[var19];
			int var22 = this.field2852[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field2886[var19] = var22 - var18;
			field2843[var19] = var8 + Class253.method4792() * var20 / var22;
			field2884[var19] = var9 + Class253.method4792() * var23 / var22;
			field2887[var19] = Class264.method3408(var22);
			if (this.field2904 > 0) {
				field2889[var19] = var20;
				field2870[var19] = var23;
				field2860[var19] = var22;
			}
		}

		try {
			this.method5196(false, false, false, 0L);
		} catch (Exception var24) {
		}

	}

	public final void method5192(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.field2874 != 2 && this.field2874 != 1) {
			this.method5174();
		}

		int var9 = Class253.method4805();
		int var10 = Class253.method4788();
		int var11 = field2913[var1];
		int var12 = field2909[var1];
		int var13 = field2913[var2];
		int var14 = field2909[var2];
		int var15 = field2913[var3];
		int var16 = field2909[var3];
		int var17 = field2913[var4];
		int var18 = field2909[var4];
		int var19 = var17 * var6 + var18 * var7 >> 16;

		for (int var20 = 0; var20 < this.field2849; ++var20) {
			int var21 = this.field2850[var20];
			int var22 = this.field2907[var20];
			int var23 = this.field2852[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field2886[var20] = var23 - var19;
			field2843[var20] = var9 + Class253.method4792() * var21 / var8;
			field2884[var20] = var10 + Class253.method4792() * var24 / var8;
			field2887[var20] = Class264.method3408(var8);
			if (this.field2904 > 0) {
				field2889[var20] = var21;
				field2870[var20] = var24;
				field2860[var20] = var23;
			}
		}

		try {
			this.method5196(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	public void method4892(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		int var12 = Class253.field2683[var2];
		int var13 = Class253.field2687[var2];
		int var14 = Class253.field2683[var3];
		int var15 = Class253.field2687[var3];
		this.method5194(var1, var12, var13, var14, var15, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	public void method5194(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.field2874 != 1) {
			this.method5173();
		}

		this.method5172(var1);
		int var11 = var8 * var5 - var6 * var4 >> 16;
		int var12 = var7 * var2 + var11 * var3 >> 16;
		int var13 = this.field2912 * var3 >> 16;
		int var14 = var13 + var12;
		if (var14 > 50 && var12 < Class235.method4555()) {
			int var15 = var8 * var4 + var6 * var5 >> 16;
			int var16 = (var15 - this.field2912) * Class253.method4792();
			if (var16 / var14 < Class253.method4789()) {
				int var17 = (this.field2912 + var15) * Class253.method4792();
				if (var17 / var14 > Class253.method4840()) {
					int var18 = var7 * var3 - var11 * var2 >> 16;
					int var19 = this.field2912 * var2 >> 16;
					int var20 = var19 + (this.field2875 * var3 >> 16);
					int var21 = (var20 + var18) * Class253.method4792();
					if (var21 / var14 > Class253.method4854()) {
						int var22 = var19 + (super.field2696 * var3 >> 16);
						int var23 = (var18 - var22) * Class253.method4792();
						if (var23 / var14 < Class253.method4790()) {
							int var24 = var13 + (super.field2696 * var2 >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.field2904 > 0;
							int var28 = Class274.field3024;
							int var30 = Class274.field3025;
							boolean var32 = Class274.method2732();
							boolean var33 = var9 != 0L && !Class74.method2085(var9);
							boolean var35 = false;
							int var37;
							int var38;
							int var39;
							if (var33 && var32) {
								boolean var36 = false;
								if (field2905) {
									var36 = Class274.method3632(this, var1, var6, var7, var8, var2, var3, var4, var5);
								} else {
									var37 = var12 - var13;
									if (var37 <= 50) {
										var37 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var37;
									} else {
										var17 /= var14;
										var16 /= var37;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var37;
									} else {
										var21 /= var14;
										var23 /= var37;
									}

									var38 = var28 - Class253.method4805();
									var39 = var30 - Class253.method4788();
									if (var38 > var16 && var38 < var17 && var39 > var23 && var39 < var21) {
										var36 = true;
									}
								}

								if (var36) {
									if (this.field2873) {
										Class274.field3027[++Class274.field3034 - 1] = var9;
									} else {
										var35 = true;
									}
								}
							}

							int var46 = Class253.method4805();
							var37 = Class253.method4788();
							var38 = 0;
							var39 = 0;
							if (var1 != 0) {
								var38 = field2913[var1];
								var39 = field2909[var1];
							}

							for (int var40 = 0; var40 < this.field2849; ++var40) {
								int var41 = this.field2850[var40];
								int var42 = this.field2907[var40];
								int var43 = this.field2852[var40];
								int var44;
								if (var1 != 0) {
									var44 = var43 * var38 + var41 * var39 >> 16;
									var43 = var43 * var39 - var41 * var38 >> 16;
									var41 = var44;
								}

								var41 += var6;
								var42 += var7;
								var43 += var8;
								var44 = var43 * var4 + var41 * var5 >> 16;
								var43 = var43 * var5 - var41 * var4 >> 16;
								var41 = var44;
								var44 = var42 * var3 - var43 * var2 >> 16;
								var43 = var42 * var2 + var43 * var3 >> 16;
								field2886[var40] = var43 - var12;
								if (var43 >= 50) {
									field2843[var40] = var46 + Class253.method4792() * var41 / var43;
									field2884[var40] = var37 + Class253.method4792() * var44 / var43;
									field2887[var40] = Class264.method3408(var43);
								} else {
									field2843[var40] = -5000;
									var25 = true;
								}

								if (var27) {
									field2889[var40] = var41;
									field2870[var40] = var44;
									field2860[var40] = var43;
								}
							}

							try {
								this.method5196(var25, var35, this.field2873, var9);
							} catch (Exception var45) {
							}

						}
					}
				}
			}
		}
	}

	public void method4893(int var1, Class428 var2, int var3, int var4, int var5, long var6) {
		if (this.field2874 != 1) {
			this.method5173();
		}

		this.method5172(var1);
		Class420 var8 = new Class420();
		var8.field4673 = new Class442((float)((double)var1 * 0.0030679615D), 0.0F, 0.0F);
		var8.field4675 = new Class421(1.0F, 1.0F, 1.0F);
		var8.field4674 = new Class421((float)var3, (float)var4, (float)var5);
		Class428 var9 = new Class428();
		var9.method7897(var8);
		var9.method7935(var2);
		int var10 = (int)var9.method7900(0.0F, 0.0F, 0.0F);
		boolean var11 = false;
		int var12 = Class253.method4805();
		int var13 = Class253.method4788();
		if (var1 != 0) {
		}

		for (int var14 = 0; var14 < this.field2849; ++var14) {
			int var15 = this.field2850[var14];
			int var16 = this.field2907[var14];
			int var17 = this.field2852[var14];
			var9.method7904((float)var15, (float)var16, (float)var17, field2919);
			var15 = (int)field2919[0];
			var16 = (int)field2919[1];
			var17 = (int)field2919[2];
			field2886[var14] = var17 - var10;
			if (var17 >= 50) {
				field2843[var14] = var12 + Class253.method4792() * var15 / var17;
				field2884[var14] = var13 + Class253.method4792() * var16 / var17;
				field2887[var14] = Class264.method3408(var17);
			} else {
				field2843[var14] = -5000;
				var11 = true;
			}

			if (this.field2904 > 0) {
				field2889[var14] = var15;
				field2870[var14] = var16;
				field2860[var14] = var17;
			}
		}

		boolean var19 = Class274.method2732();
		if (var19) {
			boolean var20 = var6 != 0L && !Class74.method2085(var6);
			var19 = var20;
		}

		try {
			this.method5196(var11, var19, this.field2873, var6);
		} catch (Exception var18) {
		}

	}

	public final void method5196(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.field2877 < 6000) {
			int var6;
			for (var6 = 0; var6 < this.field2877; ++var6) {
				field2891[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			int var16;
			int var18;
			for (char var7 = 0; var7 < this.field2853; ++var7) {
				if (this.field2859[var7] != -2) {
					var8 = this.field2854[var7];
					var9 = this.field2855[var7];
					var10 = this.field2856[var7];
					var11 = field2843[var8];
					var12 = field2843[var9];
					var13 = field2843[var10];
					int var17;
					int var33;
					if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
						var33 = field2889[var8];
						var15 = field2889[var9];
						var16 = field2889[var10];
						var17 = field2870[var8];
						var18 = field2870[var9];
						int var19 = field2870[var10];
						int var20 = field2860[var8];
						int var21 = field2860[var9];
						int var22 = field2860[var10];
						var33 -= var15;
						var16 -= var15;
						var17 -= var18;
						var19 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var22 * var17 - var20 * var19;
						int var24 = var20 * var16 - var22 * var33;
						int var25 = var19 * var33 - var17 * var16;
						if (var23 * var15 + var24 * var18 + var25 * var21 > 0) {
							field2868[var7] = true;
							int var26 = (field2886[var8] + field2886[var9] + field2886[var10]) / 3 + this.field2878;
							field2892[var26][field2891[var26]++] = var7;
						}
					} else {
						if (var2) {
							var15 = field2884[var8];
							var16 = field2884[var9];
							var17 = field2884[var10];
							var18 = var6 + Class274.field3025;
							boolean var14;
							if (var18 < var15 && var18 < var16 && var18 < var17) {
								var14 = false;
							} else {
								var18 = Class274.field3025 - var6;
								if (var18 > var15 && var18 > var16 && var18 > var17) {
									var14 = false;
								} else {
									var18 = Class274.field3024 + var6;
									if (var18 < var11 && var18 < var12 && var18 < var13) {
										var14 = false;
									} else {
										var18 = Class274.field3024 - var6;
										if (var18 > var11 && var18 > var12 && var18 > var13) {
											var14 = false;
										} else {
											var14 = true;
										}
									}
								}
							}

							if (var14) {
								Class274.field3027[++Class274.field3034 - 1] = var4;
								var2 = false;
							}
						}

						if ((var11 - var12) * (field2884[var10] - field2884[var9]) - (field2884[var8] - field2884[var9]) * (var13 - var12) > 0) {
							field2868[var7] = false;
							var33 = Class253.method4863();
							if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var33 && var12 <= var33 && var13 <= var33) {
								field2881[var7] = false;
							} else {
								field2881[var7] = true;
							}

							var15 = (field2886[var8] + field2886[var9] + field2886[var10]) / 3 + this.field2878;
							field2892[var15][field2891[var15]++] = var7;
						}
					}
				}
			}

			int var27;
			char var28;
			char[] var29;
			if (this.field2864 == null) {
				for (var27 = this.field2877 - 1; var27 >= 0; --var27) {
					var28 = field2891[var27];
					if (var28 > 0) {
						var29 = field2892[var27];

						for (var10 = 0; var10 < var28; ++var10) {
							this.method5197(var29[var10]);
						}
					}
				}

			} else {
				for (var27 = 0; var27 < 12; ++var27) {
					field2893[var27] = 0;
					field2865[var27] = 0;
				}

				for (var27 = this.field2877 - 1; var27 >= 0; --var27) {
					var28 = field2891[var27];
					if (var28 > 0) {
						var29 = field2892[var27];

						for (var10 = 0; var10 < var28; ++var10) {
							char var30 = var29[var10];
							byte var31 = this.field2864[var30];
							var13 = field2893[var31]++;
							field2894[var31][var13] = var30;
							if (var31 < 10) {
								int[] var36 = field2865;
								var36[var31] += var27;
							} else if (var31 == 10) {
								field2895[var13] = var27;
							} else {
								field2896[var13] = var27;
							}
						}
					}
				}

				var27 = 0;
				if (field2893[1] > 0 || field2893[2] > 0) {
					var27 = (field2865[1] + field2865[2]) / (field2893[1] + field2893[2]);
				}

				var8 = 0;
				if (field2893[3] > 0 || field2893[4] > 0) {
					var8 = (field2865[3] + field2865[4]) / (field2893[3] + field2893[4]);
				}

				var9 = 0;
				if (field2893[6] > 0 || field2893[8] > 0) {
					var9 = (field2865[6] + field2865[8]) / (field2893[6] + field2893[8]);
				}

				var11 = 0;
				var12 = field2893[10];
				int[] var32 = field2894[10];
				int[] var34 = field2895;
				if (var12 == var11) {
					var11 = 0;
					var12 = field2893[11];
					var32 = field2894[11];
					var34 = field2896;
				}

				if (var11 < var12) {
					var10 = var34[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var27) {
						this.method5197(var32[var11++]);
						if (var12 == var11 && var32 != field2894[11]) {
							var11 = 0;
							var12 = field2893[11];
							var32 = field2894[11];
							var34 = field2896;
						}

						if (var11 < var12) {
							var10 = var34[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.method5197(var32[var11++]);
						if (var12 == var11 && var32 != field2894[11]) {
							var11 = 0;
							var12 = field2893[11];
							var32 = field2894[11];
							var34 = field2896;
						}

						if (var11 < var12) {
							var10 = var34[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.method5197(var32[var11++]);
						if (var12 == var11 && var32 != field2894[11]) {
							var11 = 0;
							var12 = field2893[11];
							var32 = field2894[11];
							var34 = field2896;
						}

						if (var11 < var12) {
							var10 = var34[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2893[var15];
					int[] var35 = field2894[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.method5197(var35[var18]);
					}
				}

				while (var10 != -1000) {
					this.method5197(var32[var11++]);
					if (var12 == var11 && var32 != field2894[11]) {
						var11 = 0;
						var32 = field2894[11];
						var12 = field2893[11];
						var34 = field2896;
					}

					if (var11 < var12) {
						var10 = var34[var11];
					} else {
						var10 = -1000;
					}
				}

			}
		}
	}

	public final void method5197(int var1) {
		if (field2868[var1]) {
			this.method5200(var1);
		} else {
			int var2 = this.field2854[var1];
			int var3 = this.field2855[var1];
			int var4 = this.field2856[var1];
			Class253.field2688.field3039 = field2881[var1];
			if (this.field2861 == null) {
				Class253.field2688.field3049 = 0;
			} else {
				Class253.field2688.field3049 = (this.field2861[var1] == -1 ? 253 : this.field2861[var1]) & 255;
			}

			this.method5199(var1, field2884[var2], field2884[var3], field2884[var4], field2843[var2], field2843[var3], field2843[var4], field2887[var2], field2887[var3], field2887[var4], this.field2857[var1], this.field2858[var1], this.field2859[var1]);
		}
	}

	public boolean method5198(int var1) {
		return this.field2917 > 0 && var1 < this.field2867;
	}

	public final void method5199(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.field2863 != null && this.field2863[var1] != -1) {
			int var15;
			int var16;
			int var18;
			if (this.field2862 != null && this.field2862[var1] != -1) {
				int var17 = this.field2862[var1] & 255;
				var18 = this.field2866[var17];
				var15 = this.field2911[var17];
				var16 = this.field2908[var17];
			} else {
				var18 = this.field2854[var1];
				var15 = this.field2855[var1];
				var16 = this.field2856[var1];
			}

			if (this.field2859[var1] == -1) {
				Class253.method4802(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2889[var18], field2889[var15], field2889[var16], field2870[var18], field2870[var15], field2870[var16], field2860[var18], field2860[var15], field2860[var16], this.field2863[var1]);
			} else {
				Class253.method4802(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2889[var18], field2889[var15], field2889[var16], field2870[var18], field2870[var15], field2870[var16], field2860[var18], field2860[var15], field2860[var16], this.field2863[var1]);
			}
		} else {
			boolean var14 = this.method5198(var1);
			if (this.field2859[var1] == -1 && var14) {
				Class253.method4842(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2910[this.field2857[var1]], this.field2842, this.field2915, this.field2916, this.field2917);
			} else if (this.field2859[var1] == -1) {
				Class253.method4831(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2910[this.field2857[var1]]);
			} else if (var14) {
				Class253.method4804(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.field2842, this.field2915, this.field2916, this.field2917);
			} else {
				Class253.method4800(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	public final void method5200(int var1) {
		int var2 = Class253.method4805();
		int var3 = Class253.method4788();
		int var4 = 0;
		int var5 = this.field2854[var1];
		int var6 = this.field2855[var1];
		int var7 = this.field2856[var1];
		int var8 = field2860[var5];
		int var9 = field2860[var6];
		int var10 = field2860[var7];
		if (this.field2861 == null) {
			Class253.field2688.field3049 = 0;
		} else {
			Class253.field2688.field3049 = this.field2861[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field2918[var4] = field2843[var5];
			field2899[var4] = field2884[var5];
			field2901[var4] = field2887[var7];
			field2900[var4++] = this.field2857[var1];
		} else {
			var11 = field2889[var5];
			var12 = field2870[var5];
			var13 = this.field2857[var1];
			if (var10 >= 50) {
				var14 = (50 - var8) * field2882[var10 - var8];
				field2918[var4] = var2 + (var11 + ((field2889[var7] - var11) * var14 >> 16)) * Class253.method4792() / 50;
				field2899[var4] = var3 + (var12 + ((field2870[var7] - var12) * var14 >> 16)) * Class253.method4792() / 50;
				field2901[var4] = field2851;
				field2900[var4++] = var13 + ((this.field2859[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = (50 - var8) * field2882[var9 - var8];
				field2918[var4] = var2 + (var11 + ((field2889[var6] - var11) * var14 >> 16)) * Class253.method4792() / 50;
				field2899[var4] = var3 + (var12 + ((field2870[var6] - var12) * var14 >> 16)) * Class253.method4792() / 50;
				field2901[var4] = field2851;
				field2900[var4++] = var13 + ((this.field2858[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2918[var4] = field2843[var6];
			field2899[var4] = field2884[var6];
			field2901[var4] = field2887[var7];
			field2900[var4++] = this.field2858[var1];
		} else {
			var11 = field2889[var6];
			var12 = field2870[var6];
			var13 = this.field2858[var1];
			if (var8 >= 50) {
				var14 = (50 - var9) * field2882[var8 - var9];
				field2918[var4] = var2 + (var11 + ((field2889[var5] - var11) * var14 >> 16)) * Class253.method4792() / 50;
				field2899[var4] = var3 + (var12 + ((field2870[var5] - var12) * var14 >> 16)) * Class253.method4792() / 50;
				field2901[var4] = field2851;
				field2900[var4++] = var13 + ((this.field2857[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = (50 - var9) * field2882[var10 - var9];
				field2918[var4] = var2 + (var11 + ((field2889[var7] - var11) * var14 >> 16)) * Class253.method4792() / 50;
				field2899[var4] = var3 + (var12 + ((field2870[var7] - var12) * var14 >> 16)) * Class253.method4792() / 50;
				field2900[var4++] = var13 + ((this.field2859[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2918[var4] = field2843[var7];
			field2899[var4] = field2884[var7];
			field2901[var4] = field2887[var7];
			field2900[var4++] = this.field2859[var1];
		} else {
			var11 = field2889[var7];
			var12 = field2870[var7];
			var13 = this.field2859[var1];
			if (var9 >= 50) {
				var14 = (50 - var10) * field2882[var9 - var10];
				field2918[var4] = var2 + (var11 + ((field2889[var6] - var11) * var14 >> 16)) * Class253.method4792() / 50;
				field2899[var4] = var3 + (var12 + ((field2870[var6] - var12) * var14 >> 16)) * Class253.method4792() / 50;
				field2901[var4] = field2851;
				field2900[var4++] = var13 + ((this.field2858[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = (50 - var10) * field2882[var8 - var10];
				field2918[var4] = var2 + (var11 + ((field2889[var5] - var11) * var14 >> 16)) * Class253.method4792() / 50;
				field2899[var4] = var3 + (var12 + ((field2870[var5] - var12) * var14 >> 16)) * Class253.method4792() / 50;
				field2901[var4] = field2851;
				field2900[var4++] = var13 + ((this.field2857[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2918[0];
		var12 = field2918[1];
		var13 = field2918[2];
		var14 = field2899[0];
		int var15 = field2899[1];
		int var16 = field2899[2];
		float var17 = field2901[0];
		float var18 = field2901[1];
		float var19 = field2901[2];
		Class253.field2688.field3039 = false;
		int var20 = Class253.method4863();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Class253.field2688.field3039 = true;
			}

			this.method5199(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2900[0], field2900[1], field2900[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2918[3] < 0 || field2918[3] > var20) {
				Class253.field2688.field3039 = true;
			}

			int var22;
			if (this.field2863 != null && this.field2863[var1] != -1) {
				int var23;
				int var25;
				if (this.field2862 != null && this.field2862[var1] != -1) {
					int var24 = this.field2862[var1] & 255;
					var25 = this.field2866[var24];
					var22 = this.field2911[var24];
					var23 = this.field2908[var24];
				} else {
					var25 = var5;
					var22 = var6;
					var23 = var7;
				}

				short var26 = this.field2863[var1];
				if (this.field2859[var1] == -1) {
					Class253.method4802(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.field2857[var1], this.field2857[var1], this.field2857[var1], field2889[var25], field2889[var22], field2889[var23], field2870[var25], field2870[var22], field2870[var23], field2860[var25], field2860[var22], field2860[var23], var26);
					Class253.method4802(var14, var16, field2899[3], var11, var13, field2918[3], var17, var19, field2901[3], this.field2857[var1], this.field2857[var1], this.field2857[var1], field2889[var25], field2889[var22], field2889[var23], field2870[var25], field2870[var22], field2870[var23], field2860[var25], field2860[var22], field2860[var23], var26);
				} else {
					Class253.method4802(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2900[0], field2900[1], field2900[2], field2889[var25], field2889[var22], field2889[var23], field2870[var25], field2870[var22], field2870[var23], field2860[var25], field2860[var22], field2860[var23], var26);
					Class253.method4802(var14, var16, field2899[3], var11, var13, field2918[3], var17, var19, field2901[3], field2900[0], field2900[2], field2900[3], field2889[var25], field2889[var22], field2889[var23], field2870[var25], field2870[var22], field2870[var23], field2860[var25], field2860[var22], field2860[var23], var26);
				}
			} else {
				boolean var21 = this.method5198(var1);
				if (this.field2859[var1] == -1 && var21) {
					var22 = field2910[this.field2857[var1]];
					Class253.method4842(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.field2842, this.field2915, this.field2916, this.field2917);
					Class253.method4842(var14, var16, field2899[3], var11, var13, field2918[3], var17, var19, field2901[3], var22, this.field2842, this.field2915, this.field2916, this.field2917);
				} else if (this.field2859[var1] == -1) {
					var22 = field2910[this.field2857[var1]];
					Class253.method4831(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Class253.method4831(var14, var16, field2899[3], var11, var13, field2918[3], var17, var19, field2901[3], var22);
				} else if (var21) {
					Class253.method4804(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2900[0], field2900[1], field2900[2], this.field2842, this.field2916, this.field2915, this.field2917);
					Class253.method4804(var14, var16, field2899[3], var11, var13, field2918[3], 0.0F, 0.0F, 0.0F, field2900[0], field2900[2], field2900[3], this.field2842, this.field2916, this.field2915, this.field2917);
				} else {
					Class253.method4800(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2900[0], field2900[1], field2900[2]);
					Class253.method4800(var14, var16, field2899[3], var11, var13, field2918[3], var17, var19, field2901[3], field2900[0], field2900[2], field2900[3]);
				}
			}
		}

	}

	public void method5201(int var1, Class428 var2) {
		float var3 = (float)this.field2850[var1];
		float var4 = (float)(-this.field2907[var1]);
		float var5 = (float)(-this.field2852[var1]);
		float var6 = 1.0F;
		this.field2850[var1] = (int)(var2.field4699[0] * var3 + var2.field4699[4] * var4 + var2.field4699[8] * var5 + var2.field4699[12] * var6);
		this.field2907[var1] = -((int)(var2.field4699[1] * var3 + var2.field4699[5] * var4 + var2.field4699[9] * var5 + var2.field4699[13] * var6));
		this.field2852[var1] = -((int)(var2.field4699[2] * var3 + var2.field4699[6] * var4 + var2.field4699[10] * var5 + var2.field4699[14] * var6));
	}

	public void method5256(Class239 var1, int var2) {
		if (this.field2871 != null) {
			for (int var3 = 0; var3 < this.field2849; ++var3) {
				int[] var4 = this.field2871[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2872[var3];
					field2846.method7892();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						Class138 var8 = var1.method4641(var7);
						if (var8 != null) {
							field2847.method7887((float)var5[var6] / 255.0F);
							field2848.method7955(var8.method3107(var2));
							field2848.method7935(field2847);
							field2846.method7889(field2848);
						}
					}

					this.method5201(var3, field2846);
				}
			}

		}
	}
}
