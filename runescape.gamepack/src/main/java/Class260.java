import io.runebox.ObfInfo;

@ObfInfo(name = "jz")
public class Class260 {
	@ObfInfo(name = "aq", desc = "[Ljf;")
	public Class240[] field2700;

	@ObfInfo(name = "aq", desc = "(B)V")
	public void method5012() {
		this.field2700 = new Class240[1];
		Class234 var2 = Class234.field2479;
		this.field2700[0] = new Class240(var2.field2484, var2.field2476);
	}

	@ObfInfo(name = "ad", desc = "(IIILjv;Lip;Z[I[II)I")
	public int method4986(int var1, int var2, int var3, Class256 var4, Class224 var5, boolean var6, int[] var7, int[] var8) {
		return this.method4989(var1, var2, var3, var4, var5, var6, var7, var8, this.field2700[0]);
	}

	@ObfInfo(name = "ag", desc = "(IIILjv;Lip;Z[I[ILjf;B)I", opaque = "0")
	public int method4989(int var1, int var2, int var3, Class256 var4, Class224 var5, boolean var6, int[] var7, int[] var8, Class240 var9) {
		var9.method4611();
		int var11 = var9.method4615();
		int var12 = var9.method4616();
		int[][] var13 = var9.method4618();
		int[][] var14 = var9.method4617();
		int[] var15 = var9.method4619();
		int[] var16 = var9.method4620();
		boolean var17;
		if (var3 == 1) {
			var17 = this.method4990(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var17 = this.method4991(var1, var2, var4, var5, var9);
		} else {
			var17 = this.method5005(var1, var2, var3, var4, var5, var9);
		}

		int var18 = var1 - (var11 >> 1);
		int var19 = var2 - (var12 >> 1);
		int var20 = var9.method4647();
		int var21 = var9.method4614();
		int var22;
		int var23;
		int var25;
		if (!var17) {
			if (!var6) {
				return -1;
			}

			var22 = Integer.MAX_VALUE;
			var23 = Integer.MAX_VALUE;
			byte var24 = 10;
			var25 = var4.field2674;
			int var26 = var4.field2671;
			int var27 = var4.field2672;
			int var28 = var4.field2670;

			for (int var29 = var25 - var24; var29 <= var24 + var25; ++var29) {
				for (int var30 = var26 - var24; var30 <= var24 + var26; ++var30) {
					int var31 = var29 - var18;
					int var32 = var30 - var19;
					if (var31 >= 0 && var32 >= 0 && var31 < var11 && var32 < var12 && var13[var31][var32] < 100) {
						int var33 = 0;
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var25 + var27 - 1) {
							var33 = var29 - (var25 + var27 - 1);
						}

						int var34 = 0;
						if (var30 < var26) {
							var34 = var26 - var30;
						} else if (var30 > var26 + var28 - 1) {
							var34 = var30 - (var26 + var28 - 1);
						}

						int var35 = var33 * var33 + var34 * var34;
						if (var35 < var22 || var22 == var35 && var13[var31][var32] < var23) {
							var22 = var35;
							var23 = var13[var31][var32];
							var20 = var29;
							var21 = var30;
						}
					}
				}
			}

			if (var22 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var1 == var20 && var2 == var21) {
			var7[0] = var20;
			var8[0] = var21;
			return 0;
		} else {
			byte var37 = 0;
			var15[var37] = var20;
			var22 = var37 + 1;
			var16[var37] = var21;

			int var38;
			for (var23 = var38 = var14[var20 - var18][var21 - var19]; var1 != var20 || var2 != var21; var23 = var14[var20 - var18][var21 - var19]) {
				if (var23 != var38) {
					var38 = var23;
					var15[var22] = var20;
					var16[var22++] = var21;
				}

				if ((var23 & 2) != 0) {
					++var20;
				} else if ((var23 & 8) != 0) {
					--var20;
				}

				if ((var23 & 1) != 0) {
					++var21;
				} else if ((var23 & 4) != 0) {
					--var21;
				}
			}

			var25 = 0;

			while (var22-- > 0) {
				var7[var25] = var15[var22];
				var8[var25++] = var16[var22];
				if (var25 >= var7.length) {
					break;
				}
			}

			return var25;
		}
	}

	@ObfInfo(name = "ak", desc = "(IILjv;Lip;Ljf;I)Z", opaque = "417425771")
	public final boolean method4990(int var1, int var2, Class256 var3, Class224 var4, Class240 var5) {
		int var7 = var5.method4615();
		int var8 = var5.method4616();
		int[][] var9 = var5.method4618();
		int[][] var10 = var5.method4617();
		int[] var11 = var5.method4619();
		int[] var12 = var5.method4620();
		int var13 = var5.method4621();
		int var14 = var1;
		int var15 = var2;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var1 - var16;
		int var19 = var2 - var17;
		var10[var16][var17] = 99;
		var9[var16][var17] = 0;
		byte var20 = 0;
		int var21 = 0;
		var11[var20] = var1;
		byte var10001 = var20;
		int var26 = var20 + 1;
		var12[var10001] = var2;
		int[][] var22 = var4.field2435;

		while (var26 != var21) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = var21 + 1 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var23 = var14 - var4.field2424;
			int var24 = var15 - var4.field2432;
			if (var3.method1967(1, var14, var15, var4)) {
				var5.method4636(var14, var15);
				return true;
			}

			int var25 = var9[var16][var17] + 1;
			if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 1076101384) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17] = 2;
				var9[var16 - 1][var17] = var25;
			}

			if (var16 < var7 - 1 && var10[var16 + 1][var17] == 0 && (var22[var23 + 1][var24] & 1076101504) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17] = 8;
				var9[var16 + 1][var17] = var25;
			}

			if (var17 > 0 && var10[var16][var17 - 1] == 0 && (var22[var23][var24 - 1] & 1076101378) == 0) {
				var11[var26] = var14;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16][var17 - 1] = 1;
				var9[var16][var17 - 1] = var25;
			}

			if (var17 < var8 - 1 && var10[var16][var17 + 1] == 0 && (var22[var23][var24 + 1] & 1076101408) == 0) {
				var11[var26] = var14;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16][var17 + 1] = 4;
				var9[var16][var17 + 1] = var25;
			}

			if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && (var22[var23 - 1][var24 - 1] & 1076101390) == 0 && (var22[var23 - 1][var24] & 1076101384) == 0 && (var22[var23][var24 - 1] & 1076101378) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17 - 1] = 3;
				var9[var16 - 1][var17 - 1] = var25;
			}

			if (var16 < var7 - 1 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var23 + 1][var24 - 1] & 1076101507) == 0 && (var22[var23 + 1][var24] & 1076101504) == 0 && (var22[var23][var24 - 1] & 1076101378) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 - 1] = 9;
				var9[var16 + 1][var17 - 1] = var25;
			}

			if (var16 > 0 && var17 < var8 - 1 && var10[var16 - 1][var17 + 1] == 0 && (var22[var23 - 1][var24 + 1] & 1076101432) == 0 && (var22[var23 - 1][var24] & 1076101384) == 0 && (var22[var23][var24 + 1] & 1076101408) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17 + 1] = 6;
				var9[var16 - 1][var17 + 1] = var25;
			}

			if (var16 < var7 - 1 && var17 < var8 - 1 && var10[var16 + 1][var17 + 1] == 0 && (var22[var23 + 1][var24 + 1] & 1076101600) == 0 && (var22[var23 + 1][var24] & 1076101504) == 0 && (var22[var23][var24 + 1] & 1076101408) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var25;
			}
		}

		var5.method4636(var14, var15);
		return false;
	}

	@ObfInfo(name = "ap", desc = "(IILjv;Lip;Ljf;I)Z", opaque = "-1895890143")
	public final boolean method4991(int var1, int var2, Class256 var3, Class224 var4, Class240 var5) {
		int var7 = var5.method4615();
		int var8 = var5.method4616();
		int[][] var9 = var5.method4618();
		int[][] var10 = var5.method4617();
		int[] var11 = var5.method4619();
		int[] var12 = var5.method4620();
		int var13 = var5.method4621();
		int var14 = var1;
		int var15 = var2;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var1 - var16;
		int var19 = var2 - var17;
		var10[var16][var17] = 99;
		var9[var16][var17] = 0;
		byte var20 = 0;
		int var21 = 0;
		var11[var20] = var1;
		byte var10001 = var20;
		int var26 = var20 + 1;
		var12[var10001] = var2;
		int[][] var22 = var4.field2435;

		while (var26 != var21) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = var21 + 1 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var23 = var14 - var4.field2424;
			int var24 = var15 - var4.field2432;
			if (var3.method1967(2, var14, var15, var4)) {
				var5.method4636(var14, var15);
				return true;
			}

			int var25 = var9[var16][var17] + 1;
			if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 1076101390) == 0 && (var22[var23 - 1][var24 + 1] & 1076101432) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17] = 2;
				var9[var16 - 1][var17] = var25;
			}

			if (var16 < var7 - 2 && var10[var16 + 1][var17] == 0 && (var22[var23 + 2][var24] & 1076101507) == 0 && (var22[var23 + 2][var24 + 1] & 1076101600) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17] = 8;
				var9[var16 + 1][var17] = var25;
			}

			if (var17 > 0 && var10[var16][var17 - 1] == 0 && (var22[var23][var24 - 1] & 1076101390) == 0 && (var22[var23 + 1][var24 - 1] & 1076101507) == 0) {
				var11[var26] = var14;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16][var17 - 1] = 1;
				var9[var16][var17 - 1] = var25;
			}

			if (var17 < var8 - 2 && var10[var16][var17 + 1] == 0 && (var22[var23][var24 + 2] & 1076101432) == 0 && (var22[var23 + 1][var24 + 2] & 1076101600) == 0) {
				var11[var26] = var14;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16][var17 + 1] = 4;
				var9[var16][var17 + 1] = var25;
			}

			if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && (var22[var23 - 1][var24] & 1076101438) == 0 && (var22[var23 - 1][var24 - 1] & 1076101390) == 0 && (var22[var23][var24 - 1] & 1076101519) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17 - 1] = 3;
				var9[var16 - 1][var17 - 1] = var25;
			}

			if (var16 < var7 - 2 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var23 + 1][var24 - 1] & 1076101519) == 0 && (var22[var23 + 2][var24 - 1] & 1076101507) == 0 && (var22[var23 + 2][var24] & 1076101603) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 - 1] = 9;
				var9[var16 + 1][var17 - 1] = var25;
			}

			if (var16 > 0 && var17 < var8 - 2 && var10[var16 - 1][var17 + 1] == 0 && (var22[var23 - 1][var24 + 1] & 1076101438) == 0 && (var22[var23 - 1][var24 + 2] & 1076101432) == 0 && (var22[var23][var24 + 2] & 1076101624) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17 + 1] = 6;
				var9[var16 - 1][var17 + 1] = var25;
			}

			if (var16 < var7 - 2 && var17 < var8 - 2 && var10[var16 + 1][var17 + 1] == 0 && (var22[var23 + 1][var24 + 2] & 1076101624) == 0 && (var22[var23 + 2][var24 + 2] & 1076101600) == 0 && (var22[var23 + 2][var24 + 1] & 1076101603) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var25;
			}
		}

		var5.method4636(var14, var15);
		return false;
	}

	@ObfInfo(name = "an", desc = "(IIILjv;Lip;Ljf;I)Z", opaque = "-1600755395")
	public final boolean method5005(int var1, int var2, int var3, Class256 var4, Class224 var5, Class240 var6) {
		int var8 = var6.method4615();
		int var9 = var6.method4616();
		int[][] var10 = var6.method4618();
		int[][] var11 = var6.method4617();
		int[] var12 = var6.method4619();
		int[] var13 = var6.method4620();
		int var14 = var6.method4621();
		int var15 = var1;
		int var16 = var2;
		int var17 = var8 >> 1;
		int var18 = var9 >> 1;
		int var19 = var1 - var17;
		int var20 = var2 - var18;
		var11[var17][var18] = 99;
		var10[var17][var18] = 0;
		byte var21 = 0;
		int var22 = 0;
		var12[var21] = var1;
		int var28 = var21 + 1;
		var13[var21] = var2;
		int[][] var23 = var5.field2435;

		while (true) {
			label296:
			while (true) {
				int var24;
				int var25;
				int var26;
				int var27;
				do {
					do {
						do {
							label273:
							do {
								if (var28 == var22) {
									var6.method4636(var15, var16);
									return false;
								}

								var15 = var12[var22];
								var16 = var13[var22];
								var22 = var22 + 1 & var14;
								var17 = var15 - var19;
								var18 = var16 - var20;
								var24 = var15 - var5.field2424;
								var25 = var16 - var5.field2432;
								if (var4.method1967(var3, var15, var16, var5)) {
									var6.method4636(var15, var16);
									return true;
								}

								var26 = var10[var17][var18] + 1;
								if (var17 > 0 && var11[var17 - 1][var18] == 0 && (var23[var24 - 1][var25] & 1076101390) == 0 && (var23[var24 - 1][var3 + var25 - 1] & 1076101432) == 0) {
									var27 = 1;

									while (true) {
										if (var27 >= var3 - 1) {
											var12[var28] = var15 - 1;
											var13[var28] = var16;
											var28 = var28 + 1 & var14;
											var11[var17 - 1][var18] = 2;
											var10[var17 - 1][var18] = var26;
											break;
										}

										if ((var23[var24 - 1][var25 + var27] & 1076101438) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var17 < var8 - var3 && var11[var17 + 1][var18] == 0 && (var23[var3 + var24][var25] & 1076101507) == 0 && (var23[var3 + var24][var3 + var25 - 1] & 1076101600) == 0) {
									var27 = 1;

									while (true) {
										if (var27 >= var3 - 1) {
											var12[var28] = var15 + 1;
											var13[var28] = var16;
											var28 = var28 + 1 & var14;
											var11[var17 + 1][var18] = 8;
											var10[var17 + 1][var18] = var26;
											break;
										}

										if ((var23[var3 + var24][var25 + var27] & 1076101603) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var18 > 0 && var11[var17][var18 - 1] == 0 && (var23[var24][var25 - 1] & 1076101390) == 0 && (var23[var3 + var24 - 1][var25 - 1] & 1076101507) == 0) {
									var27 = 1;

									while (true) {
										if (var27 >= var3 - 1) {
											var12[var28] = var15;
											var13[var28] = var16 - 1;
											var28 = var28 + 1 & var14;
											var11[var17][var18 - 1] = 1;
											var10[var17][var18 - 1] = var26;
											break;
										}

										if ((var23[var24 + var27][var25 - 1] & 1076101519) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var18 < var9 - var3 && var11[var17][var18 + 1] == 0 && (var23[var24][var3 + var25] & 1076101432) == 0 && (var23[var3 + var24 - 1][var3 + var25] & 1076101600) == 0) {
									var27 = 1;

									while (true) {
										if (var27 >= var3 - 1) {
											var12[var28] = var15;
											var13[var28] = var16 + 1;
											var28 = var28 + 1 & var14;
											var11[var17][var18 + 1] = 4;
											var10[var17][var18 + 1] = var26;
											break;
										}

										if ((var23[var24 + var27][var3 + var25] & 1076101624) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var17 > 0 && var18 > 0 && var11[var17 - 1][var18 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 1076101390) == 0) {
									var27 = 1;

									while (true) {
										if (var27 >= var3) {
											var12[var28] = var15 - 1;
											var13[var28] = var16 - 1;
											var28 = var28 + 1 & var14;
											var11[var17 - 1][var18 - 1] = 3;
											var10[var17 - 1][var18 - 1] = var26;
											break;
										}

										if ((var23[var24 - 1][var25 - 1 + var27] & 1076101438) != 0 || (var23[var24 - 1 + var27][var25 - 1] & 1076101519) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var17 < var8 - var3 && var18 > 0 && var11[var17 + 1][var18 - 1] == 0 && (var23[var3 + var24][var25 - 1] & 1076101507) == 0) {
									var27 = 1;

									while (true) {
										if (var27 >= var3) {
											var12[var28] = var15 + 1;
											var13[var28] = var16 - 1;
											var28 = var28 + 1 & var14;
											var11[var17 + 1][var18 - 1] = 9;
											var10[var17 + 1][var18 - 1] = var26;
											break;
										}

										if ((var23[var3 + var24][var25 - 1 + var27] & 1076101603) != 0 || (var23[var24 + var27][var25 - 1] & 1076101519) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var17 > 0 && var18 < var9 - var3 && var11[var17 - 1][var18 + 1] == 0 && (var23[var24 - 1][var3 + var25] & 1076101432) == 0) {
									for (var27 = 1; var27 < var3; ++var27) {
										if ((var23[var24 - 1][var25 + var27] & 1076101438) != 0 || (var23[var24 - 1 + var27][var3 + var25] & 1076101624) != 0) {
											continue label273;
										}
									}

									var12[var28] = var15 - 1;
									var13[var28] = var16 + 1;
									var28 = var28 + 1 & var14;
									var11[var17 - 1][var18 + 1] = 6;
									var10[var17 - 1][var18 + 1] = var26;
								}
							} while(var17 >= var8 - var3);
						} while(var18 >= var9 - var3);
					} while(var11[var17 + 1][var18 + 1] != 0);
				} while((var23[var3 + var24][var3 + var25] & 1076101600) != 0);

				for (var27 = 1; var27 < var3; ++var27) {
					if ((var23[var24 + var27][var3 + var25] & 1076101624) != 0 || (var23[var3 + var24][var25 + var27] & 1076101603) != 0) {
						continue label296;
					}
				}

				var12[var28] = var15 + 1;
				var13[var28] = var16 + 1;
				var28 = var28 + 1 & var14;
				var11[var17 + 1][var18 + 1] = 12;
				var10[var17 + 1][var18 + 1] = var26;
			}
		}
	}

	@ObfInfo(name = "bl", desc = "([BIII)I", opaque = "1279444700")
	public static int method5011(byte[] var0, int var1, int var2) {
		int var4 = -1;

		for (int var5 = var1; var5 < var2; ++var5) {
			var4 = var4 >>> 8 ^ Class562.field5469[(var4 ^ var0[var5]) & 255];
		}

		var4 = ~var4;
		return var4;
	}
}
