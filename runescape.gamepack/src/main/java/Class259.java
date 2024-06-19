import java.util.BitSet;

public class Class259 extends Class255 {
	public static boolean field2782;
	public static final int[] field2749;
	public static final int[] field2774;
	public static final int[] field2776;
	public static final int[] field2777;
	public static final int[] field2778;
	public static final int[] field2779;
	public static final int[] field2780;
	public Class240[] field2801;
	public Class240[][] field2770;
	public Class260[][][] field2735;
	public Class266[] field2738;
	public Class266[] field2748;
	public Class401 field2773;
	public boolean field2757;
	public boolean field2765;
	public int field2729;
	public int field2730;
	public int field2731;
	public int field2732;
	public int field2733;
	public int field2734;
	public int field2736;
	public int field2745;
	public int field2747;
	public int field2750;
	public int field2751;
	public int field2752;
	public int field2753;
	public int field2754;
	public int field2756;
	public int field2758;
	public int field2759;
	public int field2760;
	public int field2761;
	public int field2762;
	public int field2763;
	public int field2764;
	public int field2769;
	public int field2771;
	public int field2775;
	public int field2781;
	public int field2786;
	public int field2788;
	public int field2789;
	public int field2790;
	public int field2791;
	public int field2805;
	public int field2806;
	public int field2807;
	public int field2808;
	public int field2809;
	public int field2810;
	public int field2811;
	public int[] field2728;
	public int[] field2787;
	public int[][] field2767;
	public int[][] field2785;
	public int[][][] field2739;
	public int[][][] field2755;
	public BitSet field2793;
	public BitSet field2794;
	public BitSet field2799;
	public BitSet field2800;
	public final int field2741;
	public final int field2792;
	public final int field2795;
	public final int field2796;
	public final int field2797;
	public final int field2798;
	public final int field2802;
	public final int field2803;
	public final int field2804;

	static {
		field2782 = false;
		field2774 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		field2749 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		field2776 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		field2777 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		field2778 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		field2779 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		field2780 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
	}

	public Class259(int var1, int var2, int var3, int var4, int var5, int[][][] var6) {
		this.field2786 = 0;
		this.field2756 = 0;
		this.field2738 = new Class266[5000];
		this.field2745 = 0;
		this.field2775 = 0;
		this.field2769 = 0;
		this.field2748 = new Class266[100];
		this.field2757 = false;
		this.field2760 = 0;
		this.field2761 = 0;
		this.field2762 = 0;
		this.field2763 = -1;
		this.field2764 = -1;
		this.field2765 = false;
		this.field2729 = 4;
		this.field2728 = new int[this.field2729];
		this.field2770 = new Class240[this.field2729][500];
		this.field2771 = 0;
		this.field2801 = new Class240[500];
		this.field2773 = new Class401();
		this.field2785 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
		this.field2767 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
		this.field2787 = new int[9];
		this.field2736 = var2;
		this.field2732 = var3;
		this.field2733 = var4;
		this.field2735 = new Class260[var2][var3][var4];
		this.field2739 = new int[var2][var3 + 1][var4 + 1];
		this.field2755 = var6;
		this.field2745 = var5;
		this.field2741 = var1;
		if (var1 != -1) {
			this.field2792 = 0;
			this.field2793 = null;
			this.field2794 = null;
			this.field2795 = 0;
			this.field2796 = 0;
			this.field2797 = 0;
			this.field2798 = 0;
			this.field2799 = null;
			this.field2800 = null;
			this.field2804 = 0;
			this.field2802 = 0;
			this.field2803 = 0;
		} else {
			this.field2792 = 8386816;
			this.field2793 = new BitSet(this.field2792);
			this.field2794 = new BitSet(this.field2792);
			this.field2795 = 1048352;
			this.field2796 = 32761;
			this.field2797 = 181;
			this.field2798 = 9644832;
			this.field2799 = new BitSet(this.field2798);
			this.field2800 = new BitSet(this.field2798);
			this.field2804 = 1071648;
			this.field2802 = 33489;
			this.field2803 = 183;
		}

		Class235.method4541(var5);
		this.method4925();
	}

	public void method4925() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.field2736; ++var1) {
			for (var2 = 0; var2 < this.field2732; ++var2) {
				for (int var3 = 0; var3 < this.field2733; ++var3) {
					this.field2735[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < this.field2729; ++var1) {
			for (var2 = 0; var2 < this.field2728[var1]; ++var2) {
				this.field2770[var1][var2] = null;
			}

			this.field2728[var1] = 0;
		}

		for (var1 = 0; var1 < this.field2756; ++var1) {
			this.field2738[var1] = null;
		}

		this.field2756 = 0;

		for (var1 = 0; var1 < this.field2748.length; ++var1) {
			this.field2748[var1] = null;
		}

	}

	public void method5131(int var1) {
		this.field2786 = var1;

		for (int var2 = 0; var2 < this.field2732; ++var2) {
			for (int var3 = 0; var3 < this.field2733; ++var3) {
				if (this.field2735[var1][var2][var3] == null) {
					this.field2735[var1][var2][var3] = new Class260(var1, var2, var3);
				}
			}
		}

	}

	public void method4927(int var1, int var2) {
		Class260 var3 = this.field2735[0][var1][var2];

		for (int var4 = 0; var4 < 3; ++var4) {
			Class260 var5 = this.field2735[var4][var1][var2] = this.field2735[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.field2831;

				for (int var6 = 0; var6 < var5.field2822; ++var6) {
					Class266 var7 = var5.field2812[var6];
					if (Class190.method3713(var7.field2958) && var7.field2962 == var1 && var7.field2954 == var2) {
						--var7.field2952;
					}
				}
			}
		}

		if (this.field2735[0][var1][var2] == null) {
			this.field2735[0][var1][var2] = new Class260(0, var1, var2);
		}

		this.field2735[0][var1][var2].field2834 = var3;
		this.field2735[3][var1][var2] = null;
	}

	public void method5009(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Class240 var9 = new Class240();
		var9.field2592 = var3 / 128;
		var9.field2584 = var4 / 128;
		var9.field2585 = var5 / 128;
		var9.field2597 = var6 / 128;
		var9.field2589 = var2;
		var9.field2588 = var3;
		var9.field2586 = var4;
		var9.field2599 = var5;
		var9.field2591 = var6;
		var9.field2583 = var7;
		var9.field2593 = var8;
		this.field2770[var1][this.field2728[var1]++] = var9;
	}

	public void method4941(int var1, int var2, int var3, int var4) {
		Class260 var5 = this.field2735[var1][var2][var3];
		if (var5 != null) {
			this.field2735[var1][var2][var3].field2826 = var4;
		}
	}

	public void method5031(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		Class267 var21;
		int var22;
		if (var4 == 0) {
			var21 = new Class267(var11, var12, var13, var14, -1, var19, false);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field2735[var22][var2][var3] == null) {
					this.field2735[var22][var2][var3] = new Class260(var22, var2, var3);
				}
			}

			this.field2735[var1][var2][var3].field2829 = var21;
		} else if (var4 != 1) {
			Class265 var23 = new Class265(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field2735[var22][var2][var3] == null) {
					this.field2735[var22][var2][var3] = new Class260(var22, var2, var3);
				}
			}

			this.field2735[var1][var2][var3].field2836 = var23;
		} else {
			var21 = new Class267(var15, var16, var17, var18, var6, var20, var8 == var7 && var9 == var7 && var10 == var7);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field2735[var22][var2][var3] == null) {
					this.field2735[var22][var2][var3] = new Class260(var22, var2, var3);
				}
			}

			this.field2735[var1][var2][var3].field2829 = var21;
		}
	}

	public void method5062(int var1, int var2, int var3, int var4, Class255 var5, long var6, int var8) {
		if (var5 != null) {
			Class247 var9 = new Class247();
			var9.field2651 = var5;
			var9.field2653 = var2 * 128 + 64;
			var9.field2654 = var3 * 128 + 64;
			var9.field2650 = var4;
			var9.field2652 = var6;
			var9.field2648 = var8;
			if (this.field2735[var1][var2][var3] == null) {
				this.field2735[var1][var2][var3] = new Class260(var1, var2, var3);
			}

			this.field2735[var1][var2][var3].field2820 = var9;
		}
	}

	public void method4932(int var1, int var2, int var3, int var4, Class255 var5, long var6, Class255 var8, Class255 var9) {
		Class242 var10 = new Class242();
		var10.field2614 = var5;
		var10.field2618 = var2 * 128 + 64;
		var10.field2613 = var3 * 128 + 64;
		var10.field2616 = var4;
		var10.field2617 = var6;
		var10.field2615 = var8;
		var10.field2611 = var9;
		int var11 = 0;
		Class260 var12 = this.field2735[var1][var2][var3];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.field2822; ++var13) {
				if ((var12.field2812[var13].field2946 & 256) == 256 && var12.field2812[var13].field2950 instanceof Class262) {
					Class262 var14 = (Class262)var12.field2812[var13].field2950;
					var14.method5173();
					if (var14.field2696 > var11) {
						var11 = var14.field2696;
					}
				}
			}
		}

		var10.field2612 = var11;
		if (this.field2735[var1][var2][var3] == null) {
			this.field2735[var1][var2][var3] = new Class260(var1, var2, var3);
		}

		this.field2735[var1][var2][var3].field2821 = var10;
	}

	public void method4933(int var1, int var2, int var3, int var4, Class255 var5, Class255 var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) {
			Class280 var12 = new Class280();
			var12.field3096 = var9;
			var12.field3091 = var11;
			var12.field3092 = var2 * 128 + 64;
			var12.field3093 = var3 * 128 + 64;
			var12.field3099 = var4;
			var12.field3098 = var5;
			var12.field3097 = var6;
			var12.field3094 = var7;
			var12.field3095 = var8;

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.field2735[var13][var2][var3] == null) {
					this.field2735[var13][var2][var3] = new Class260(var13, var2, var3);
				}
			}

			this.field2735[var1][var2][var3].field2818 = var12;
		}
	}

	public void method5123(int var1, int var2, int var3, int var4, Class255 var5, Class255 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) {
			Class270 var14 = new Class270();
			var14.field3009 = var11;
			var14.field3014 = var13;
			var14.field3004 = var2 * 128 + 64;
			var14.field3005 = var3 * 128 + 64;
			var14.field3016 = var4;
			var14.field3011 = var5;
			var14.field3012 = var6;
			var14.field3010 = var7;
			var14.field3008 = var8;
			var14.field3007 = var9;
			var14.field3006 = var10;

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.field2735[var15][var2][var3] == null) {
					this.field2735[var15][var2][var3] = new Class260(var15, var2, var3);
				}
			}

			this.field2735[var1][var2][var3].field2817 = var14;
		}
	}

	public boolean method4935(int var1, int var2, int var3, int var4, int var5, int var6, Class255 var7, int var8, long var9, int var11) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var2 * 128 + var5 * 64;
			int var13 = var3 * 128 + var6 * 64;
			return this.method4938(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
		}
	}

	public boolean method5129(int var1, int var2, int var3, int var4, int var5, Class255 var6, int var7, long var8, boolean var10) {
		if (var6 == null) {
			return true;
		} else {
			int var11 = var2 - var5;
			int var12 = var3 - var5;
			int var13 = var5 + var2;
			int var14 = var5 + var3;
			if (var10) {
				if (var7 > 640 && var7 < 1408) {
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var11 -= 128;
				}
			}

			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			var14 /= 128;
			return this.method4938(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	public boolean method4937(int var1, int var2, int var3, int var4, int var5, Class255 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.method4938(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	public boolean method4938(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class255 var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var4 + var2; ++var15) {
			for (var16 = var3; var16 < var5 + var3; ++var16) {
				if (var15 < 0 || var16 < 0 || var15 >= this.field2732 || var16 >= this.field2733) {
					return false;
				}

				Class260 var17 = this.field2735[var1][var15][var16];
				if (var17 != null && var17.field2822 >= 5) {
					return false;
				}
			}
		}

		Class266 var21 = new Class266();
		var21.field2958 = var12;
		var21.field2946 = var14;
		var21.field2952 = var1;
		var21.field2948 = var6;
		var21.field2949 = var7;
		var21.field2947 = var8;
		var21.field2950 = var9;
		var21.field2951 = var10;
		var21.field2962 = var2;
		var21.field2954 = var3;
		var21.field2959 = var4 + var2 - 1;
		var21.field2956 = var5 + var3 - 1;

		for (var16 = var2; var16 < var4 + var2; ++var16) {
			for (int var22 = var3; var22 < var5 + var3; ++var22) {
				int var18 = 0;
				if (var16 > var2) {
					++var18;
				}

				if (var16 < var4 + var2 - 1) {
					var18 += 4;
				}

				if (var22 > var3) {
					var18 += 8;
				}

				if (var22 < var5 + var3 - 1) {
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.field2735[var19][var16][var22] == null) {
						this.field2735[var19][var16][var22] = new Class260(var19, var16, var22);
					}
				}

				Class260 var23 = this.field2735[var1][var16][var22];
				var23.field2812[var23.field2822] = var21;
				var23.field2824[var23.field2822] = var18;
				var23.field2825 |= var18;
				++var23.field2822;
			}
		}

		if (var11) {
			this.field2738[this.field2756++] = var21;
		}

		return true;
	}

	public void method4939() {
		for (int var1 = 0; var1 < this.field2756; ++var1) {
			Class266 var2 = this.field2738[var1];
			this.method4940(var2);
			this.field2738[var1] = null;
		}

		this.field2756 = 0;
	}

	public void method4940(Class266 var1) {
		for (int var2 = var1.field2962; var2 <= var1.field2959; ++var2) {
			for (int var3 = var1.field2954; var3 <= var1.field2956; ++var3) {
				Class260 var4 = this.field2735[var1.field2952][var2][var3];
				if (var4 != null) {
					int var5;
					for (var5 = 0; var5 < var4.field2822; ++var5) {
						if (var4.field2812[var5] == var1) {
							--var4.field2822;

							for (int var6 = var5; var6 < var4.field2822; ++var6) {
								var4.field2812[var6] = var4.field2812[var6 + 1];
								var4.field2824[var6] = var4.field2824[var6 + 1];
							}

							var4.field2812[var4.field2822] = null;
							break;
						}
					}

					var4.field2825 = 0;

					for (var5 = 0; var5 < var4.field2822; ++var5) {
						var4.field2825 |= var4.field2824[var5];
					}
				}
			}
		}

	}

	public void method4960(int var1, int var2, int var3, int var4) {
		Class260 var5 = this.field2735[var1][var2][var3];
		if (var5 != null) {
			Class270 var6 = var5.field2817;
			if (var6 != null) {
				var6.field3007 = var6.field3007 * var4 / 16;
				var6.field3006 = var6.field3006 * var4 / 16;
			}
		}
	}

	public void method5074(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		if (var4 != null) {
			var4.field2818 = null;
		}
	}

	public void method4943(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		if (var4 != null) {
			var4.field2817 = null;
		}
	}

	public void method5033(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.field2822; ++var5) {
				Class266 var6 = var4.field2812[var5];
				if (Class190.method3713(var6.field2958) && var6.field2962 == var2 && var6.field2954 == var3) {
					this.method4940(var6);
					return;
				}
			}

		}
	}

	public void method4945(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		if (var4 != null) {
			var4.field2820 = null;
		}
	}

	public void method4946(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		if (var4 != null) {
			var4.field2821 = null;
		}
	}

	public Class280 method4947(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		return var4 == null ? null : var4.field2818;
	}

	public Class270 method4948(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		return var4 == null ? null : var4.field2817;
	}

	public Class266 method4949(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.field2822; ++var5) {
				Class266 var6 = var4.field2812[var5];
				if (Class190.method3713(var6.field2958) && var6.field2962 == var2 && var6.field2954 == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	public Class247 method4950(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		return var4 != null && var4.field2820 != null ? var4.field2820 : null;
	}

	public long method4951(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		return var4 != null && var4.field2818 != null ? var4.field2818.field3096 : 0L;
	}

	public long method4952(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		return var4 != null && var4.field2817 != null ? var4.field2817.field3009 : 0L;
	}

	public long method4953(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.field2822; ++var5) {
				Class266 var6 = var4.field2812[var5];
				if (Class190.method3713(var6.field2958) && var6.field2962 == var2 && var6.field2954 == var3) {
					return var6.field2958;
				}
			}

			return 0L;
		}
	}

	public long method4954(int var1, int var2, int var3) {
		Class260 var4 = this.field2735[var1][var2][var3];
		return var4 != null && var4.field2820 != null ? var4.field2820.field2652 : 0L;
	}

	public int method5003(int var1, int var2, int var3, long var4) {
		Class260 var6 = this.field2735[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.field2818 != null && var6.field2818.field3096 == var4) {
			return var6.field2818.field3091 & 255;
		} else if (var6.field2817 != null && var6.field2817.field3009 == var4) {
			return var6.field2817.field3014 & 255;
		} else if (var6.field2820 != null && var6.field2820.field2652 == var4) {
			return var6.field2820.field2648 & 255;
		} else {
			for (int var7 = 0; var7 < var6.field2822; ++var7) {
				if (var6.field2812[var7].field2958 == var4) {
					return var6.field2812[var7].field2946 & 255;
				}
			}

			return -1;
		}
	}

	public void method4956(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2736; ++var4) {
			for (int var5 = 0; var5 < this.field2732; ++var5) {
				for (int var6 = 0; var6 < this.field2733; ++var6) {
					Class260 var7 = this.field2735[var4][var5][var6];
					if (var7 != null) {
						Class280 var8 = var7.field2818;
						Class236 var10;
						if (var8 != null && var8.field3098 instanceof Class236) {
							Class236 var9 = (Class236)var8.field3098;
							this.method4958(var9, var4, var5, var6, 1, 1);
							if (var8.field3097 instanceof Class236) {
								var10 = (Class236)var8.field3097;
								this.method4958(var10, var4, var5, var6, 1, 1);
								Class236.method4580(var9, var10, 0, 0, 0, false);
								var8.field3097 = var10.method4572(var10.field2556, var10.field2552, var1, var2, var3);
							}

							var8.field3098 = var9.method4572(var9.field2556, var9.field2552, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var7.field2822; ++var12) {
							Class266 var14 = var7.field2812[var12];
							if (var14 != null && var14.field2950 instanceof Class236) {
								Class236 var11 = (Class236)var14.field2950;
								this.method4958(var11, var4, var5, var6, var14.field2959 - var14.field2962 + 1, var14.field2956 - var14.field2954 + 1);
								var14.field2950 = var11.method4572(var11.field2556, var11.field2552, var1, var2, var3);
							}
						}

						Class247 var13 = var7.field2820;
						if (var13 != null && var13.field2651 instanceof Class236) {
							var10 = (Class236)var13.field2651;
							this.method4957(var10, var4, var5, var6);
							var13.field2651 = var10.method4572(var10.field2556, var10.field2552, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	public void method4957(Class236 var1, int var2, int var3, int var4) {
		int var6 = var3 + 1;
		int var7 = var4 - 1;
		int var8 = var4 + 1;

		for (int var9 = var3; var9 <= var6; ++var9) {
			if (var9 >= 0 && var9 < this.field2732) {
				for (int var10 = var7; var10 <= var8; ++var10) {
					if (var10 >= 0 && var10 < this.field2733 && (var9 >= var6 || var10 >= var8)) {
						Class260 var11 = this.field2735[var2][var9][var10];
						if (var11 != null && var11.field2820 != null && var11.field2820.field2651 instanceof Class236) {
							int var12 = this.method4959(var2, var9, var10, var2, var3, var4);
							Class236 var13 = (Class236)var11.field2820.field2651;
							Class236.method4580(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
						}
					}
				}
			}
		}

	}

	public void method4958(Class236 var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var5 + var3;
		int var10 = var4 - 1;
		int var11 = var6 + var4;

		for (int var12 = var2; var12 <= var2 + 1; ++var12) {
			if (this.field2736 != var12) {
				for (int var13 = var8; var13 <= var9; ++var13) {
					if (var13 >= 0 && var13 < this.field2732) {
						for (int var14 = var10; var14 <= var11; ++var14) {
							if (var14 >= 0 && var14 < this.field2733 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
								Class260 var15 = this.field2735[var12][var13][var14];
								if (var15 != null) {
									int var16 = this.method4959(var12, var13, var14, var2, var3, var4);
									Class280 var17 = var15.field2818;
									if (var17 != null) {
										Class236 var18;
										if (var17.field3098 instanceof Class236) {
											var18 = (Class236)var17.field3098;
											Class236.method4580(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.field3097 instanceof Class236) {
											var18 = (Class236)var17.field3097;
											Class236.method4580(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var15.field2822; ++var23) {
										Class266 var19 = var15.field2812[var23];
										if (var19 != null && var19.field2950 instanceof Class236) {
											Class236 var20 = (Class236)var19.field2950;
											int var21 = var19.field2959 - var19.field2962 + 1;
											int var22 = var19.field2956 - var19.field2954 + 1;
											Class236.method4580(var1, var20, (var19.field2962 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field2954 - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var8;
				var7 = false;
			}
		}

	}

	public int method4959(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method4928(var1, var2, var3) - this.method4928(var4, var5, var6);
	}

	public int method4928(int var1, int var2, int var3) {
		return (this.field2755[var1][var2][var3] + this.field2755[var1][var2 + 1][var3] + this.field2755[var1][var2][var3 + 1] + this.field2755[var1][var2 + 1][var3 + 1]) / 4;
	}

	public void method4961(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Class260 var7 = this.field2735[var4][var5][var6];
		if (var7 != null) {
			Class267 var8 = var7.field2829;
			int var10;
			if (var8 != null) {
				int var18 = var8.field2969;
				if (var18 != 0) {
					for (var10 = 0; var10 < 4; ++var10) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}

				}
			} else {
				Class265 var9 = var7.field2836;
				if (var9 != null) {
					var10 = var9.field2934;
					int var11 = var9.field2923;
					int var12 = var9.field2933;
					int var13 = var9.field2944;
					int[] var14 = this.field2785[var10];
					int[] var15 = this.field2767[var11];
					int var16 = 0;
					int var17;
					if (var12 != 0) {
						for (var17 = 0; var17 < 4; ++var17) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}

				}
			}
		}
	}

	public void method5045(int var1) {
		int var2 = Math.max(25, Math.min(var1, 90));
		this.field2745 = var2;
		Class235.method4541(this.field2745);
		if (this.field2787 != null && this.field2787.length > 0) {
			this.method4975(this.field2787, this.field2759, this.field2747, this.field2788, this.field2781);
		}

	}

	public boolean method4963(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(this.field2795 * var2 + this.field2796 * var3 + this.field2797 * var4 + var5);
	}

	public boolean method4964(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(this.field2795 * var2 + this.field2796 * var3 + this.field2797 * var4 + var5, var6);
		return var6;
	}

	public boolean method4965(int var1, int var2, int var3, int var4) {
		return this.method4963(this.field2793, var1, var2, var3, var4);
	}

	public boolean method5016(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4964(this.field2793, var1, var2, var3, var4, var5);
	}

	public boolean method5115(int var1, int var2, int var3, int var4) {
		return this.method4963(this.field2794, var1, var2, var3, var4);
	}

	public boolean method4968(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4964(this.field2794, var1, var2, var3, var4, var5);
	}

	public boolean method4969(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(this.field2804 * var2 + this.field2802 * var3 + this.field2803 * var4 + var5);
	}

	public boolean method4970(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(this.field2804 * var2 + this.field2802 * var3 + this.field2803 * var4 + var5, var6);
		return var6;
	}

	public boolean method4971(int var1, int var2, int var3, int var4) {
		return this.method4969(this.field2799, var1, var2, var3, var4);
	}

	public boolean method4972(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4970(this.field2799, var1, var2, var3, var4, var5);
	}

	public boolean method4973(int var1, int var2, int var3, int var4) {
		return this.method4969(this.field2800, var1, var2, var3, var4);
	}

	public boolean method4974(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4970(this.field2800, var1, var2, var3, var4, var5);
	}

	public void method4975(int[] var1, int var2, int var3, int var4, int var5) {
		this.field2787 = var1;
		this.field2759 = var2;
		this.field2747 = var3;
		this.field2788 = var4;
		this.field2781 = var5;
		this.field2808 = 0;
		this.field2809 = 0;
		this.field2810 = var4;
		this.field2811 = var5;
		this.field2806 = var4 / 2;
		this.field2807 = var5 / 2;
		this.field2794.set(0, this.field2794.size());
		this.field2800.set(0, this.field2800.size());
	}

	public void method4976(int var1, int var2) {
		this.field2790 = var1;
		this.field2805 = var2;
	}

	public boolean method4977(int var1, int var2) {
		if (!this.method5115(this.field2790, this.field2805, var1, var2)) {
			return this.method4965(this.field2790, this.field2805, var1, var2);
		} else {
			this.method4968(this.field2790, this.field2805, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; ++var4) {
				for (int var5 = -1; var5 <= 1; ++var5) {
					if (this.method4978(this.field2790, this.field2805, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method4978(this.field2790, (this.field2805 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method4978(this.field2790 + 1, this.field2805, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method4978(this.field2790 + 1, (this.field2805 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return this.method5016(this.field2790, this.field2805, var1, var2, var3);
		}
	}

	public boolean method4978(int var1, int var2, int var3, int var4) {
		if (!this.method4973(var1, var2, var3, var4)) {
			return this.method4971(var1, var2, var3, var4);
		} else {
			this.method4974(var1, var2, var3, var4, false);
			int var5 = var1 * 32 + 128;
			int var6 = var2 * 64;
			int var7 = (var3 - this.field2745 - 1) * 128;
			int var8 = (var4 - this.field2745 - 1) * 128;

			for (int var9 = -this.field2759; var9 <= this.field2747; var9 += 128) {
				if (this.method4979(var7, this.field2787[var1] + var9, var8, var5, var6)) {
					return this.method4972(var1, var2, var3, var4, true);
				}
			}

			return this.method4972(var1, var2, var3, var4, false);
		}
	}

	public boolean method4979(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = Class253.field2683;
		int[] var7 = Class253.field2687;
		int var8 = var6[var4];
		int var9 = var7[var4];
		int var10 = var6[var5];
		int var11 = var7[var5];
		int var12 = var10 * var3 + var11 * var1 >> 16;
		int var13 = var11 * var3 - var10 * var1 >> 16;
		int var14 = var8 * var2 + var13 * var9 >> 16;
		int var15 = var9 * var2 - var13 * var8 >> 16;
		if (var14 >= 50 && var14 <= Class235.method4555()) {
			int var16 = this.field2806 + var12 * 128 / var14;
			int var17 = this.field2807 + var15 * 128 / var14;
			return var16 >= this.field2808 && var16 <= this.field2810 && var17 >= this.field2809 && var17 <= this.field2811;
		} else {
			return false;
		}
	}

	public void method4980(int var1, int var2, int var3, boolean var4) {
		if (!this.method5089() || var4) {
			this.field2757 = true;
			this.field2765 = var4;
			this.field2760 = var1;
			this.field2761 = var2;
			this.field2762 = var3;
			this.field2763 = -1;
			this.field2764 = -1;
		}
	}

	public void method4981() {
		this.field2765 = true;
	}

	public boolean method5089() {
		return this.field2765 && this.field2763 != -1;
	}

	public void method5060() {
		this.field2763 = -1;
		this.field2765 = false;
	}

	public void method4984(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.field2732 * 128) {
			var1 = this.field2732 * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.field2733 * 128) {
			var3 = this.field2733 * 128 - 1;
		}

		if (var4 < 128) {
			var4 = 128;
		} else if (var4 > 383) {
			var4 = 383;
		}

		this.method4976((var4 - 128) / 32, var5 / 64);
		this.field2731 = var1;
		this.field2789 = var2;
		this.field2758 = var3;
		this.field2753 = var1 / 128;
		this.field2754 = var3 / 128;
		this.field2769 = var6;
		Class241 var7 = new Class241(var1, var2, var3, var4, var5);
		this.method4985(var7);
	}

	public void method4985(Class272 var1) {
		++this.field2750;
		this.field2791 = this.field2753 - this.field2745;
		if (this.field2791 < 0) {
			this.field2791 = 0;
		}

		this.field2751 = this.field2754 - this.field2745;
		if (this.field2751 < 0) {
			this.field2751 = 0;
		}

		this.field2734 = this.field2753 + this.field2745;
		if (this.field2734 > this.field2732) {
			this.field2734 = this.field2732;
		}

		this.field2752 = this.field2754 + this.field2745;
		if (this.field2752 > this.field2733) {
			this.field2752 = this.field2733;
		}

		if (this.field2741 == -1) {
			this.method5112();
		}

		this.field2775 = 0;

		int var2;
		Class260[][] var3;
		int var4;
		int var5;
		for (var2 = this.field2786; var2 < this.field2736; ++var2) {
			var3 = this.field2735[var2];

			for (var4 = this.field2791; var4 < this.field2734; ++var4) {
				for (var5 = this.field2751; var5 < this.field2752; ++var5) {
					Class260 var6 = var3[var4][var5];
					if (var6 != null) {
						if (var6.field2826 > this.field2769 || this.field2741 == -1 && !this.method4977(var4 - this.field2753 + this.field2745, var5 - this.field2754 + this.field2745) && this.field2755[var2][var4][var5] - this.field2789 < 2000) {
							var6.field2837 = false;
							var6.field2828 = false;
							var6.field2823 = 0;
						} else {
							var6.field2837 = true;
							var6.field2828 = true;
							if (var6.field2822 > 0) {
								var6.field2819 = true;
							} else {
								var6.field2819 = false;
							}

							++this.field2775;
						}
					}
				}
			}
		}

		int var7;
		int var8;
		int var9;
		Class260 var10;
		int var11;
		for (var2 = this.field2786; var2 < this.field2736; ++var2) {
			var3 = this.field2735[var2];

			for (var4 = -this.field2745; var4 <= 0; ++var4) {
				var5 = this.field2753 + var4;
				var11 = this.field2753 - var4;
				if (var5 >= this.field2791 || var11 < this.field2734) {
					for (var7 = -this.field2745; var7 <= 0; ++var7) {
						var8 = this.field2754 + var7;
						var9 = this.field2754 - var7;
						if (var5 >= this.field2791 && var5 < this.field2734) {
							if (var8 >= this.field2751 && var8 < this.field2752) {
								var10 = var3[var5][var8];
								if (var10 != null && var10.field2837) {
									this.method4986(var1, var10, true);
								}
							}

							if (var9 >= this.field2751 && var9 < this.field2752) {
								var10 = var3[var5][var9];
								if (var10 != null && var10.field2837) {
									this.method4986(var1, var10, true);
								}
							}
						}

						if (var11 >= this.field2791 && var11 < this.field2734) {
							if (var8 >= this.field2751 && var8 < this.field2752) {
								var10 = var3[var11][var8];
								if (var10 != null && var10.field2837) {
									this.method4986(var1, var10, true);
								}
							}

							if (var9 >= this.field2751 && var9 < this.field2752) {
								var10 = var3[var11][var9];
								if (var10 != null && var10.field2837) {
									this.method4986(var1, var10, true);
								}
							}
						}

						if (this.field2775 == 0) {
							this.field2757 = false;
							return;
						}
					}
				}
			}
		}

		for (var2 = this.field2786; var2 < this.field2736; ++var2) {
			var3 = this.field2735[var2];

			for (var4 = -this.field2745; var4 <= 0; ++var4) {
				var5 = this.field2753 + var4;
				var11 = this.field2753 - var4;
				if (var5 >= this.field2791 || var11 < this.field2734) {
					for (var7 = -this.field2745; var7 <= 0; ++var7) {
						var8 = this.field2754 + var7;
						var9 = this.field2754 - var7;
						if (var5 >= this.field2791 && var5 < this.field2734) {
							if (var8 >= this.field2751 && var8 < this.field2752) {
								var10 = var3[var5][var8];
								if (var10 != null && var10.field2837) {
									this.method4986(var1, var10, false);
								}
							}

							if (var9 >= this.field2751 && var9 < this.field2752) {
								var10 = var3[var5][var9];
								if (var10 != null && var10.field2837) {
									this.method4986(var1, var10, false);
								}
							}
						}

						if (var11 >= this.field2791 && var11 < this.field2734) {
							if (var8 >= this.field2751 && var8 < this.field2752) {
								var10 = var3[var11][var8];
								if (var10 != null && var10.field2837) {
									this.method4986(var1, var10, false);
								}
							}

							if (var9 >= this.field2751 && var9 < this.field2752) {
								var10 = var3[var11][var9];
								if (var10 != null && var10.field2837) {
									this.method4986(var1, var10, false);
								}
							}
						}

						if (this.field2775 == 0) {
							this.field2757 = false;
							return;
						}
					}
				}
			}
		}

		this.field2757 = false;
	}

	public void method4986(Class272 var1, Class260 var2, boolean var3) {
		this.field2773.method7477(var2);

		while (true) {
			Class260 var4;
			int var5;
			int var6;
			int var7;
			int var8;
			Class260[][] var9;
			Class260 var10;
			int var12;
			int var15;
			int var16;
			int var24;
			int var26;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										Class280 var11;
										Class266 var13;
										int var17;
										int var18;
										int var19;
										int var21;
										boolean var22;
										Class260 var33;
										while (true) {
											do {
												var4 = (Class260)this.field2773.method7480();
												if (var4 == null) {
													return;
												}
											} while(!var4.field2828);

											var5 = var4.field2813;
											var6 = var4.field2830;
											var7 = var4.field2831;
											var8 = var4.field2815;
											var9 = this.field2735[var7];
											if (!var4.field2837) {
												break;
											}

											if (var3) {
												if (var7 > 0) {
													var10 = this.field2735[var7 - 1][var5][var6];
													if (var10 != null && var10.field2828) {
														continue;
													}
												}

												if (var5 <= this.field2753 && var5 > this.field2791) {
													var10 = var9[var5 - 1][var6];
													if (var10 != null && var10.field2828 && (var10.field2837 || (var4.field2825 & 1) == 0)) {
														continue;
													}
												}

												if (var5 >= this.field2753 && var5 < this.field2734 - 1) {
													var10 = var9[var5 + 1][var6];
													if (var10 != null && var10.field2828 && (var10.field2837 || (var4.field2825 & 4) == 0)) {
														continue;
													}
												}

												if (var6 <= this.field2754 && var6 > this.field2751) {
													var10 = var9[var5][var6 - 1];
													if (var10 != null && var10.field2828 && (var10.field2837 || (var4.field2825 & 8) == 0)) {
														continue;
													}
												}

												if (var6 >= this.field2754 && var6 < this.field2752 - 1) {
													var10 = var9[var5][var6 + 1];
													if (var10 != null && var10.field2828 && (var10.field2837 || (var4.field2825 & 2) == 0)) {
														continue;
													}
												}
											} else {
												var3 = true;
											}

											var4.field2837 = false;
											if (var4.field2834 != null) {
												var10 = var4.field2834;
												if (var10.field2829 != null) {
													if (!this.method4990(0, var5, var6)) {
														var1.method4662(this, var10.field2829, 0, var5, var6);
													}
												} else if (var10.field2836 != null && !this.method4990(0, var5, var6)) {
													var1.method4672(this, var10.field2836, var5, var6);
												}

												var11 = var10.field2818;
												if (var11 != null) {
													var1.method4663(var11.field3098, 0, var11.field3092, var11.field3099, var11.field3093, var11.field3096);
												}

												for (var12 = 0; var12 < var10.field2822; ++var12) {
													var13 = var10.field2812[var12];
													if (var13 != null) {
														var1.method4663(var13.field2950, var13.field2951, var13.field2948, var13.field2947, var13.field2949, var13.field2958);
													}
												}
											}

											var22 = false;
											if (var4.field2829 != null) {
												if (!this.method4990(var8, var5, var6)) {
													var22 = true;
													if (var4.field2829.field2965 != 12345678 || this.field2757 && var7 <= this.field2760) {
														var1.method4662(this, var4.field2829, var8, var5, var6);
													}
												}
											} else if (var4.field2836 != null && !this.method4990(var8, var5, var6)) {
												var22 = true;
												var1.method4672(this, var4.field2836, var5, var6);
											}

											var21 = 0;
											var12 = 0;
											Class280 var23 = var4.field2818;
											Class270 var14 = var4.field2817;
											if (var23 != null || var14 != null) {
												if (this.field2753 == var5) {
													++var21;
												} else if (this.field2753 < var5) {
													var21 += 2;
												}

												if (this.field2754 == var6) {
													var21 += 3;
												} else if (this.field2754 > var6) {
													var21 += 6;
												}

												var12 = field2774[var21];
												var4.field2833 = field2776[var21];
											}

											if (var23 != null) {
												if ((var23.field3094 & field2749[var21]) != 0) {
													if (var23.field3094 == 16) {
														var4.field2823 = 3;
														var4.field2835 = field2777[var21];
														var4.field2832 = 3 - var4.field2835;
													} else if (var23.field3094 == 32) {
														var4.field2823 = 6;
														var4.field2835 = field2778[var21];
														var4.field2832 = 6 - var4.field2835;
													} else if (var23.field3094 == 64) {
														var4.field2823 = 12;
														var4.field2835 = field2779[var21];
														var4.field2832 = 12 - var4.field2835;
													} else {
														var4.field2823 = 9;
														var4.field2835 = field2780[var21];
														var4.field2832 = 9 - var4.field2835;
													}
												} else {
													var4.field2823 = 0;
												}

												if ((var23.field3094 & var12) != 0 && !this.method4991(var8, var5, var6, var23.field3094)) {
													var1.method4663(var23.field3098, 0, var23.field3092, var23.field3099, var23.field3093, var23.field3096);
												}

												if ((var23.field3095 & var12) != 0 && !this.method4991(var8, var5, var6, var23.field3095)) {
													var1.method4663(var23.field3097, 0, var23.field3092, var23.field3099, var23.field3093, var23.field3096);
												}
											}

											if (var14 != null && !this.method4992(var8, var5, var6, var14.field3011.field2696)) {
												if ((var14.field3010 & var12) != 0) {
													var1.method4663(var14.field3011, 0, var14.field3004 + var14.field3007, var14.field3016, var14.field3005 + var14.field3006, var14.field3009);
												} else if (var14.field3010 == 256) {
													var15 = var14.field3004 - this.field2731;
													var16 = var14.field3005 - this.field2758;
													var17 = var14.field3008;
													if (var17 != 1 && var17 != 2) {
														var18 = var15;
													} else {
														var18 = -var15;
													}

													if (var17 != 2 && var17 != 3) {
														var19 = var16;
													} else {
														var19 = -var16;
													}

													if (var19 < var18) {
														var1.method4663(var14.field3011, 0, var14.field3004 + var14.field3007, var14.field3016, var14.field3005 + var14.field3006, var14.field3009);
													} else if (var14.field3012 != null) {
														var1.method4663(var14.field3012, 0, var14.field3004, var14.field3016, var14.field3005, var14.field3009);
													}
												}
											}

											if (var22) {
												Class247 var27 = var4.field2820;
												if (var27 != null) {
													var1.method4663(var27.field2651, 0, var27.field2653, var27.field2650, var27.field2654, var27.field2652);
												}

												Class242 var31 = var4.field2821;
												if (var31 != null && var31.field2612 == 0) {
													if (var31.field2615 != null) {
														var1.method4663(var31.field2615, 0, var31.field2618, var31.field2616, var31.field2613, var31.field2617);
													}

													if (var31.field2611 != null) {
														var1.method4663(var31.field2611, 0, var31.field2618, var31.field2616, var31.field2613, var31.field2617);
													}

													if (var31.field2614 != null) {
														var1.method4663(var31.field2614, 0, var31.field2618, var31.field2616, var31.field2613, var31.field2617);
													}
												}
											}

											var15 = var4.field2825;
											if (var15 != 0) {
												if (var5 < this.field2753 && var5 >= this.field2791 && var5 < this.field2734 - 1 && (var15 & 4) != 0) {
													var33 = var9[var5 + 1][var6];
													if (var33 != null && var33.field2828) {
														this.field2773.method7477(var33);
													}
												}

												if (var6 < this.field2754 && var6 >= this.field2751 && var6 < this.field2752 - 1 && (var15 & 2) != 0) {
													var33 = var9[var5][var6 + 1];
													if (var33 != null && var33.field2828) {
														this.field2773.method7477(var33);
													}
												}

												if (var5 > this.field2753 && var5 > this.field2791 && var5 < this.field2734 && (var15 & 1) != 0) {
													var33 = var9[var5 - 1][var6];
													if (var33 != null && var33.field2828) {
														this.field2773.method7477(var33);
													}
												}

												if (var6 > this.field2754 && var6 > this.field2751 && var6 < this.field2752 && (var15 & 8) != 0) {
													var33 = var9[var5][var6 - 1];
													if (var33 != null && var33.field2828) {
														this.field2773.method7477(var33);
													}
												}
											}
											break;
										}

										if (var4.field2823 != 0) {
											var22 = true;

											for (var21 = 0; var21 < var4.field2822; ++var21) {
												if (var4.field2812[var21].field2957 != this.field2750 && (var4.field2824[var21] & var4.field2823) == var4.field2835) {
													var22 = false;
													break;
												}
											}

											if (var22) {
												var11 = var4.field2818;
												if (!this.method4991(var8, var5, var6, var11.field3094)) {
													var1.method4663(var11.field3098, 0, var11.field3092, var11.field3099, var11.field3093, var11.field3096);
												}

												var4.field2823 = 0;
											}
										}

										if (!var4.field2819) {
											break;
										}

										try {
											int var25 = var4.field2822;
											var4.field2819 = false;
											var21 = 0;

											label595:
											for (var12 = 0; var12 < var25; ++var12) {
												var13 = var4.field2812[var12];
												if (var13.field2957 != this.field2750) {
													for (var26 = var13.field2962; var26 <= var13.field2959; ++var26) {
														for (var15 = var13.field2954; var15 <= var13.field2956; ++var15) {
															var33 = var9[var26][var15];
															if (var33.field2837) {
																var4.field2819 = true;
																continue label595;
															}

															if (var33.field2823 != 0) {
																var17 = 0;
																if (var26 > var13.field2962) {
																	++var17;
																}

																if (var26 < var13.field2959) {
																	var17 += 4;
																}

																if (var15 > var13.field2954) {
																	var17 += 8;
																}

																if (var15 < var13.field2956) {
																	var17 += 2;
																}

																if ((var17 & var33.field2823) == var4.field2832) {
																	var4.field2819 = true;
																	continue label595;
																}
															}
														}
													}

													this.field2748[var21++] = var13;
													var26 = this.field2753 - var13.field2962;
													var15 = var13.field2959 - this.field2753;
													if (var15 > var26) {
														var26 = var15;
													}

													var16 = this.field2754 - var13.field2954;
													var17 = var13.field2956 - this.field2754;
													if (var17 > var16) {
														var13.field2955 = var17 + var26;
													} else {
														var13.field2955 = var16 + var26;
													}
												}
											}

											while (var21 > 0) {
												var12 = -50;
												var24 = -1;

												for (var26 = 0; var26 < var21; ++var26) {
													Class266 var34 = this.field2748[var26];
													if (var34.field2957 != this.field2750) {
														if (var34.field2955 > var12) {
															var12 = var34.field2955;
															var24 = var26;
														} else if (var34.field2955 == var12) {
															var16 = var34.field2948 - this.field2731;
															var17 = var34.field2949 - this.field2758;
															var18 = this.field2748[var24].field2948 - this.field2731;
															var19 = this.field2748[var24].field2949 - this.field2758;
															if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
																var24 = var26;
															}
														}
													}
												}

												if (var24 == -1) {
													break;
												}

												Class266 var35 = this.field2748[var24];
												var35.field2957 = this.field2750;
												if (!this.method4993(var8, var35.field2962, var35.field2959, var35.field2954, var35.field2956, var35.field2950.field2696)) {
													var1.method4663(var35.field2950, var35.field2951, var35.field2948, var35.field2947, var35.field2949, var35.field2958);
												}

												for (var15 = var35.field2962; var15 <= var35.field2959; ++var15) {
													for (var16 = var35.field2954; var16 <= var35.field2956; ++var16) {
														Class260 var36 = var9[var15][var16];
														if (var36.field2823 != 0) {
															this.field2773.method7477(var36);
														} else if ((var15 != var5 || var16 != var6) && var36.field2828) {
															this.field2773.method7477(var36);
														}
													}
												}
											}

											if (!var4.field2819) {
												break;
											}
										} catch (Exception var20) {
											var4.field2819 = false;
											break;
										}
									}
								} while(!var4.field2828);
							} while(var4.field2823 != 0);

							if (var5 > this.field2753 || var5 <= this.field2791) {
								break;
							}

							var10 = var9[var5 - 1][var6];
						} while(var10 != null && var10.field2828);

						if (var5 < this.field2753 || var5 >= this.field2734 - 1) {
							break;
						}

						var10 = var9[var5 + 1][var6];
					} while(var10 != null && var10.field2828);

					if (var6 > this.field2754 || var6 <= this.field2751) {
						break;
					}

					var10 = var9[var5][var6 - 1];
				} while(var10 != null && var10.field2828);

				if (var6 < this.field2754 || var6 >= this.field2752 - 1) {
					break;
				}

				var10 = var9[var5][var6 + 1];
			} while(var10 != null && var10.field2828);

			var4.field2828 = false;
			--this.field2775;
			Class242 var29 = var4.field2821;
			if (var29 != null && var29.field2612 != 0) {
				if (var29.field2615 != null) {
					var1.method4663(var29.field2615, 0, var29.field2618, var29.field2616 - var29.field2612, var29.field2613, var29.field2617);
				}

				if (var29.field2611 != null) {
					var1.method4663(var29.field2611, 0, var29.field2618, var29.field2616 - var29.field2612, var29.field2613, var29.field2617);
				}

				if (var29.field2614 != null) {
					var1.method4663(var29.field2614, 0, var29.field2618, var29.field2616 - var29.field2612, var29.field2613, var29.field2617);
				}
			}

			if (var4.field2833 != 0) {
				Class270 var30 = var4.field2817;
				if (var30 != null && !this.method4992(var8, var5, var6, var30.field3011.field2696)) {
					if ((var30.field3010 & var4.field2833) != 0) {
						var1.method4663(var30.field3011, 0, var30.field3004 + var30.field3007, var30.field3016, var30.field3005 + var30.field3006, var30.field3009);
					} else if (var30.field3010 == 256) {
						var12 = var30.field3004 - this.field2731;
						var24 = var30.field3005 - this.field2758;
						var26 = var30.field3008;
						if (var26 != 1 && var26 != 2) {
							var15 = var12;
						} else {
							var15 = -var12;
						}

						if (var26 != 2 && var26 != 3) {
							var16 = var24;
						} else {
							var16 = -var24;
						}

						if (var16 >= var15) {
							var1.method4663(var30.field3011, 0, var30.field3004 + var30.field3007, var30.field3016, var30.field3005 + var30.field3006, var30.field3009);
						} else if (var30.field3012 != null) {
							var1.method4663(var30.field3012, 0, var30.field3004, var30.field3016, var30.field3005, var30.field3009);
						}
					}
				}

				Class280 var28 = var4.field2818;
				if (var28 != null) {
					if ((var28.field3095 & var4.field2833) != 0 && !this.method4991(var8, var5, var6, var28.field3095)) {
						var1.method4663(var28.field3097, 0, var28.field3092, var28.field3099, var28.field3093, var28.field3096);
					}

					if ((var28.field3094 & var4.field2833) != 0 && !this.method4991(var8, var5, var6, var28.field3094)) {
						var1.method4663(var28.field3098, 0, var28.field3092, var28.field3099, var28.field3093, var28.field3096);
					}
				}
			}

			Class260 var32;
			if (var7 < this.field2736 - 1) {
				var32 = this.field2735[var7 + 1][var5][var6];
				if (var32 != null && var32.field2828) {
					this.field2773.method7477(var32);
				}
			}

			if (var5 < this.field2753 && var5 >= this.field2791 && var5 < this.field2734 - 1) {
				var32 = var9[var5 + 1][var6];
				if (var32 != null && var32.field2828) {
					this.field2773.method7477(var32);
				}
			}

			if (var6 < this.field2754 && var6 >= this.field2751 && var6 < this.field2752 - 1) {
				var32 = var9[var5][var6 + 1];
				if (var32 != null && var32.field2828) {
					this.field2773.method7477(var32);
				}
			}

			if (var5 > this.field2753 && var5 > this.field2791 && var5 < this.field2734) {
				var32 = var9[var5 - 1][var6];
				if (var32 != null && var32.field2828) {
					this.field2773.method7477(var32);
				}
			}

			if (var6 > this.field2754 && var6 > this.field2751 && var6 < this.field2752) {
				var32 = var9[var5][var6 - 1];
				if (var32 != null && var32.field2828) {
					this.field2773.method7477(var32);
				}
			}
		}
	}

	public void method5112() {
		int var1 = this.field2728[this.field2769];
		Class240[] var2 = this.field2770[this.field2769];
		this.field2771 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			Class240 var4 = var2[var3];
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.field2589 == 1) {
				var5 = var4.field2592 - this.field2753 + this.field2745;
				if (var5 >= 0 && var5 <= this.field2745 + this.field2745) {
					var6 = var4.field2585 - this.field2754 + this.field2745;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field2597 - this.field2754 + this.field2745;
					if (var7 > this.field2745 + this.field2745) {
						var7 = this.field2745 + this.field2745;
					}

					var13 = false;

					while (var6 <= var7) {
						if (this.method4977(var5, var6++)) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = this.field2731 - var4.field2588;
						if (var9 > 32) {
							var4.field2594 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2594 = 2;
							var9 = -var9;
						}

						var4.field2590 = (var4.field2599 - this.field2758 << 8) / var9;
						var4.field2598 = (var4.field2591 - this.field2758 << 8) / var9;
						var4.field2587 = (var4.field2583 - this.field2789 << 8) / var9;
						var4.field2600 = (var4.field2593 - this.field2789 << 8) / var9;
						this.field2801[this.field2771++] = var4;
					}
				}
			} else if (var4.field2589 == 2) {
				var5 = var4.field2585 - this.field2754 + this.field2745;
				if (var5 >= 0 && var5 <= this.field2745 + this.field2745) {
					var6 = var4.field2592 - this.field2753 + this.field2745;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field2584 - this.field2753 + this.field2745;
					if (var7 > this.field2745 + this.field2745) {
						var7 = this.field2745 + this.field2745;
					}

					var13 = false;

					while (var6 <= var7) {
						if (this.method4977(var6++, var5)) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = this.field2758 - var4.field2599;
						if (var9 > 32) {
							var4.field2594 = 3;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2594 = 4;
							var9 = -var9;
						}

						var4.field2595 = (var4.field2588 - this.field2731 << 8) / var9;
						var4.field2596 = (var4.field2586 - this.field2731 << 8) / var9;
						var4.field2587 = (var4.field2583 - this.field2789 << 8) / var9;
						var4.field2600 = (var4.field2593 - this.field2789 << 8) / var9;
						this.field2801[this.field2771++] = var4;
					}
				}
			} else if (var4.field2589 == 4) {
				var5 = var4.field2583 - this.field2789;
				if (var5 > 128) {
					var6 = var4.field2585 - this.field2754 + this.field2745;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field2597 - this.field2754 + this.field2745;
					if (var7 > this.field2745 + this.field2745) {
						var7 = this.field2745 + this.field2745;
					}

					if (var6 <= var7) {
						int var8 = var4.field2592 - this.field2753 + this.field2745;
						if (var8 < 0) {
							var8 = 0;
						}

						var9 = var4.field2584 - this.field2753 + this.field2745;
						if (var9 > this.field2745 + this.field2745) {
							var9 = this.field2745 + this.field2745;
						}

						boolean var10 = false;

						label159:
						for (int var11 = var8; var11 <= var9; ++var11) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (this.method4977(var11, var12)) {
									var10 = true;
									break label159;
								}
							}
						}

						if (var10) {
							var4.field2594 = 5;
							var4.field2595 = (var4.field2588 - this.field2731 << 8) / var5;
							var4.field2596 = (var4.field2586 - this.field2731 << 8) / var5;
							var4.field2590 = (var4.field2599 - this.field2758 << 8) / var5;
							var4.field2598 = (var4.field2591 - this.field2758 << 8) / var5;
							this.field2801[this.field2771++] = var4;
						}
					}
				}
			}
		}

	}

	public boolean method4990(int var1, int var2, int var3) {
		int var4 = this.field2739[var1][var2][var3];
		if (var4 == -this.field2750) {
			return false;
		} else if (this.field2750 == var4) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method4994(var5 + 1, this.field2755[var1][var2][var3], var6 + 1) && this.method4994(var5 + 128 - 1, this.field2755[var1][var2 + 1][var3], var6 + 1) && this.method4994(var5 + 128 - 1, this.field2755[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method4994(var5 + 1, this.field2755[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.field2739[var1][var2][var3] = this.field2750;
				return true;
			} else {
				this.field2739[var1][var2][var3] = -this.field2750;
				return false;
			}
		}
	}

	public boolean method4991(int var1, int var2, int var3, int var4) {
		if (!this.method4990(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.field2755[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > this.field2731) {
						if (!this.method4994(var5, var7, var6)) {
							return false;
						}

						if (!this.method4994(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4994(var5, var8, var6)) {
							return false;
						}

						if (!this.method4994(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4994(var5, var9, var6)) {
						return false;
					}

					if (!this.method4994(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.field2758) {
						if (!this.method4994(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.method4994(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4994(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.method4994(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4994(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.method4994(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.field2731) {
						if (!this.method4994(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.method4994(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4994(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.method4994(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4994(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.method4994(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.field2758) {
						if (!this.method4994(var5, var7, var6)) {
							return false;
						}

						if (!this.method4994(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4994(var5, var8, var6)) {
							return false;
						}

						if (!this.method4994(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.method4994(var5, var9, var6)) {
						return false;
					}

					if (!this.method4994(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.method4994(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.method4994(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.method4994(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.method4994(var5 + 128, var9, var6);
			} else if (var4 == 128) {
				return this.method4994(var5, var9, var6);
			} else {
				return true;
			}
		}
	}

	public boolean method4992(int var1, int var2, int var3, int var4) {
		if (!this.method4990(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method4994(var5 + 1, this.field2755[var1][var2][var3] - var4, var6 + 1) && this.method4994(var5 + 128 - 1, this.field2755[var1][var2 + 1][var3] - var4, var6 + 1) && this.method4994(var5 + 128 - 1, this.field2755[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method4994(var5 + 1, this.field2755[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	public boolean method4993(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) {
			if (!this.method4990(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.method4994(var7 + 1, this.field2755[var1][var2][var4] - var6, var8 + 1) && this.method4994(var7 + 128 - 1, this.field2755[var1][var2 + 1][var4] - var6, var8 + 1) && this.method4994(var7 + 128 - 1, this.field2755[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method4994(var7 + 1, this.field2755[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) {
				for (var8 = var4; var8 <= var5; ++var8) {
					if (this.field2739[var1][var7][var8] == -this.field2750) {
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var9 = this.field2755[var1][var2][var4] - var6;
			if (!this.method4994(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.method4994(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method4994(var7, var9, var11)) {
						return false;
					} else if (!this.method4994(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	public boolean method4994(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2771; ++var4) {
			Class240 var5 = this.field2801[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2594 == 1) {
				var6 = var5.field2588 - var1;
				if (var6 > 0) {
					var7 = var5.field2599 + (var5.field2590 * var6 >> 8);
					var8 = var5.field2591 + (var5.field2598 * var6 >> 8);
					var9 = var5.field2583 + (var5.field2587 * var6 >> 8);
					var10 = var5.field2593 + (var5.field2600 * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2594 == 2) {
				var6 = var1 - var5.field2588;
				if (var6 > 0) {
					var7 = var5.field2599 + (var5.field2590 * var6 >> 8);
					var8 = var5.field2591 + (var5.field2598 * var6 >> 8);
					var9 = var5.field2583 + (var5.field2587 * var6 >> 8);
					var10 = var5.field2593 + (var5.field2600 * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2594 == 3) {
				var6 = var5.field2599 - var3;
				if (var6 > 0) {
					var7 = var5.field2588 + (var5.field2595 * var6 >> 8);
					var8 = var5.field2586 + (var5.field2596 * var6 >> 8);
					var9 = var5.field2583 + (var5.field2587 * var6 >> 8);
					var10 = var5.field2593 + (var5.field2600 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2594 == 4) {
				var6 = var3 - var5.field2599;
				if (var6 > 0) {
					var7 = var5.field2588 + (var5.field2595 * var6 >> 8);
					var8 = var5.field2586 + (var5.field2596 * var6 >> 8);
					var9 = var5.field2583 + (var5.field2587 * var6 >> 8);
					var10 = var5.field2593 + (var5.field2600 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2594 == 5) {
				var6 = var2 - var5.field2583;
				if (var6 > 0) {
					var7 = var5.field2588 + (var5.field2595 * var6 >> 8);
					var8 = var5.field2586 + (var5.field2596 * var6 >> 8);
					var9 = var5.field2599 + (var5.field2590 * var6 >> 8);
					var10 = var5.field2591 + (var5.field2598 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}

		return false;
	}

	public void method4892(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		Class440 var12 = new Class440();
		var12.method8252((float)((double)(-var2) * 0.0030679615D));
		var12.method8253((float)((double)(-var3) * 0.0030679615D));
		var12.method8255((float)var7, (float)var8, (float)var9);
		Class428 var13 = new Class428();
		var13.method7956(var12);
		var13.method7901();
		int var14 = this.field2730 % 300;
		float var15 = (float)var14 / 300.0F * 6.283F;
		float var16 = (float)Math.sin((double)var15);
		float var17 = (float)Math.cos((double)var15);
		float var18 = var16 * 3.14159F / 100.0F;
		float var19 = var17 * 3.14159F / 100.0F;
		Class420 var20 = new Class420();
		Class428 var21 = new Class428();
		var20.field4673 = new Class442((float)((double)var1 * 0.0030679615D), var18, var19);
		var20.field4674 = new Class421((float)var4, (float)var5, (float)var6);
		Class428 var22 = new Class428();
		var22.method7897(var20);
		var22.method7901();
		Class420 var23 = new Class420();
		var23.field4674 = new Class421((float)(-(this.field2732 * 64)), 0.0F, (float)(-(this.field2733 * 64)));
		Class428 var24 = new Class428();
		var24.method7897(var23);
		var21.method7896(1.0F, 1.0F, 1.0F, 1.0F);
		var24.method7935(var21);
		var21.method7897(var20);
		var24.method7935(var21);
		var24.method7935(var13);
		this.field2731 = (int)var22.method7914((float)var7, (float)var8, (float)var9);
		this.field2789 = (int)var22.method7898((float)var7, (float)var8, (float)var9);
		this.field2758 = (int)var22.method7900((float)var7, (float)var8, (float)var9);
		this.field2753 = this.field2731 / 128;
		this.field2754 = this.field2758 / 128;
		Class245 var25 = new Class245(var24);
		this.method4985(var25);
	}

	public static int method4987(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	public static boolean method4988(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
			int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
			if (var8 == 0) {
				if (var9 != 0) {
					return var9 < 0 ? var10 <= 0 : var10 >= 0;
				} else {
					return true;
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
			}
		}
	}
}
