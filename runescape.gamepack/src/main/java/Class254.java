public class Class254 {
	public Class243[] field2693;

	public void method4868() {
		this.field2693 = new Class243[1];
		Class221 var2 = Class221.field2227;
		this.field2693[0] = new Class243(var2.field2230, var2.field2234);
	}

	public int method4869(int var1, int var2, int var3, Class250 var4, Class226 var5, boolean var6, int[] var7, int[] var8) {
		return this.method4870(var1, var2, var3, var4, var5, var6, var7, var8, this.field2693[0]);
	}

	public int method4870(int var1, int var2, int var3, Class250 var4, Class226 var5, boolean var6, int[] var7, int[] var8, Class243 var9) {
		var9.method4676();
		int var11 = var9.method4680();
		int var12 = var9.method4689();
		int[][] var13 = var9.method4683();
		int[][] var14 = var9.method4699();
		int[] var15 = var9.method4691();
		int[] var16 = var9.method4685();
		boolean var17;
		if (var3 == 1) {
			var17 = this.method4871(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var17 = this.method4872(var1, var2, var4, var5, var9);
		} else {
			var17 = this.method4874(var1, var2, var3, var4, var5, var9);
		}

		int var18 = var1 - (var11 >> 1);
		int var19 = var2 - (var12 >> 1);
		int var20 = var9.method4678();
		int var21 = var9.method4700();
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
			var25 = var4.field2673;
			int var26 = var4.field2672;
			int var27 = var4.field2671;
			int var28 = var4.field2674;

			for (int var29 = var25 - var24; var29 <= var25 + var24; ++var29) {
				for (int var30 = var26 - var24; var30 <= var26 + var24; ++var30) {
					int var31 = var29 - var18;
					int var32 = var30 - var19;
					if (var31 >= 0 && var32 >= 0 && var31 < var11 && var32 < var12 && var13[var31][var32] < 100) {
						int var33 = 0;
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var27 + var25 - 1) {
							var33 = var29 - (var27 + var25 - 1);
						}

						int var34 = 0;
						if (var30 < var26) {
							var34 = var26 - var30;
						} else if (var30 > var28 + var26 - 1) {
							var34 = var30 - (var28 + var26 - 1);
						}

						int var35 = var33 * var33 + var34 * var34;
						if (var35 < var22 || var35 == var22 && var13[var31][var32] < var23) {
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

		if (var20 == var1 && var21 == var2) {
			var7[0] = var20;
			var8[0] = var21;
			return 0;
		} else {
			byte var37 = 0;
			var15[var37] = var20;
			var22 = var37 + 1;
			var16[var37] = var21;

			int var38;
			for (var23 = var38 = var14[var20 - var18][var21 - var19]; var20 != var1 || var21 != var2; var23 = var14[var20 - var18][var21 - var19]) {
				if (var38 != var23) {
					var38 = var23;
					var15[var22] = var20;
					var16[var22++] = var21;
				}

				if ((var23 & 2) != 0) {
					++var20;
				} else if (0 != (var23 & 8)) {
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

	public final boolean method4871(int var1, int var2, Class250 var3, Class226 var4, Class243 var5) {
		int var7 = var5.method4680();
		int var8 = var5.method4689();
		int[][] var9 = var5.method4683();
		int[][] var10 = var5.method4699();
		int[] var11 = var5.method4691();
		int[] var12 = var5.method4685();
		int var13 = var5.method4686();
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
		int[][] var22 = var4.field2363;

		while (var21 != var26) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = var21 + 1 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var23 = var14 - var4.field2369;
			int var24 = var15 - var4.field2362;
			if (var3.method1088(1, var14, var15, var4)) {
				var5.method4677(var14, var15);
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

			if (var16 < var7 - 1 && 0 == var10[var16 + 1][var17] && (var22[var23 + 1][var24] & 1076101504) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17] = 8;
				var9[var16 + 1][var17] = var25;
			}

			if (var17 > 0 && 0 == var10[var16][var17 - 1] && (var22[var23][var24 - 1] & 1076101378) == 0) {
				var11[var26] = var14;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16][var17 - 1] = 1;
				var9[var16][var17 - 1] = var25;
			}

			if (var17 < var8 - 1 && var10[var16][var17 + 1] == 0 && 0 == (var22[var23][var24 + 1] & 1076101408)) {
				var11[var26] = var14;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16][var17 + 1] = 4;
				var9[var16][var17 + 1] = var25;
			}

			if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && 0 == (var22[var23 - 1][var24 - 1] & 1076101390) && 0 == (var22[var23 - 1][var24] & 1076101384) && 0 == (var22[var23][var24 - 1] & 1076101378)) {
				var11[var26] = var14 - 1;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17 - 1] = 3;
				var9[var16 - 1][var17 - 1] = var25;
			}

			if (var16 < var7 - 1 && var17 > 0 && 0 == var10[var16 + 1][var17 - 1] && (var22[var23 + 1][var24 - 1] & 1076101507) == 0 && 0 == (var22[var23 + 1][var24] & 1076101504) && 0 == (var22[var23][var24 - 1] & 1076101378)) {
				var11[var26] = var14 + 1;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 - 1] = 9;
				var9[var16 + 1][var17 - 1] = var25;
			}

			if (var16 > 0 && var17 < var8 - 1 && 0 == var10[var16 - 1][var17 + 1] && 0 == (var22[var23 - 1][var24 + 1] & 1076101432) && 0 == (var22[var23 - 1][var24] & 1076101384) && (var22[var23][var24 + 1] & 1076101408) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17 + 1] = 6;
				var9[var16 - 1][var17 + 1] = var25;
			}

			if (var16 < var7 - 1 && var17 < var8 - 1 && 0 == var10[var16 + 1][var17 + 1] && 0 == (var22[var23 + 1][var24 + 1] & 1076101600) && (var22[var23 + 1][var24] & 1076101504) == 0 && 0 == (var22[var23][var24 + 1] & 1076101408)) {
				var11[var26] = var14 + 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var25;
			}
		}

		var5.method4677(var14, var15);
		return false;
	}

	public final boolean method4872(int var1, int var2, Class250 var3, Class226 var4, Class243 var5) {
		int var7 = var5.method4680();
		int var8 = var5.method4689();
		int[][] var9 = var5.method4683();
		int[][] var10 = var5.method4699();
		int[] var11 = var5.method4691();
		int[] var12 = var5.method4685();
		int var13 = var5.method4686();
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
		int[][] var22 = var4.field2363;

		while (var21 != var26) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = var21 + 1 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var23 = var14 - var4.field2369;
			int var24 = var15 - var4.field2362;
			if (var3.method1088(2, var14, var15, var4)) {
				var5.method4677(var14, var15);
				return true;
			}

			int var25 = 1 + var9[var16][var17];
			if (var16 > 0 && 0 == var10[var16 - 1][var17] && 0 == (var22[var23 - 1][var24] & 1076101390) && (var22[var23 - 1][var24 + 1] & 1076101432) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17] = 2;
				var9[var16 - 1][var17] = var25;
			}

			if (var16 < var7 - 2 && var10[var16 + 1][var17] == 0 && 0 == (var22[var23 + 2][var24] & 1076101507) && (var22[var23 + 2][var24 + 1] & 1076101600) == 0) {
				var11[var26] = var14 + 1;
				var12[var26] = var15;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17] = 8;
				var9[var16 + 1][var17] = var25;
			}

			if (var17 > 0 && var10[var16][var17 - 1] == 0 && (var22[var23][var24 - 1] & 1076101390) == 0 && 0 == (var22[var23 + 1][var24 - 1] & 1076101507)) {
				var11[var26] = var14;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16][var17 - 1] = 1;
				var9[var16][var17 - 1] = var25;
			}

			if (var17 < var8 - 2 && var10[var16][var17 + 1] == 0 && 0 == (var22[var23][var24 + 2] & 1076101432) && 0 == (var22[var23 + 1][var24 + 2] & 1076101600)) {
				var11[var26] = var14;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16][var17 + 1] = 4;
				var9[var16][var17 + 1] = var25;
			}

			if (var16 > 0 && var17 > 0 && 0 == var10[var16 - 1][var17 - 1] && (var22[var23 - 1][var24] & 1076101438) == 0 && (var22[var23 - 1][var24 - 1] & 1076101390) == 0 && 0 == (var22[var23][var24 - 1] & 1076101519)) {
				var11[var26] = var14 - 1;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17 - 1] = 3;
				var9[var16 - 1][var17 - 1] = var25;
			}

			if (var16 < var7 - 2 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && 0 == (var22[var23 + 1][var24 - 1] & 1076101519) && 0 == (var22[var23 + 2][var24 - 1] & 1076101507) && 0 == (var22[var23 + 2][var24] & 1076101603)) {
				var11[var26] = var14 + 1;
				var12[var26] = var15 - 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 - 1] = 9;
				var9[var16 + 1][var17 - 1] = var25;
			}

			if (var16 > 0 && var17 < var8 - 2 && 0 == var10[var16 - 1][var17 + 1] && (var22[var23 - 1][var24 + 1] & 1076101438) == 0 && (var22[var23 - 1][var24 + 2] & 1076101432) == 0 && (var22[var23][var24 + 2] & 1076101624) == 0) {
				var11[var26] = var14 - 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 - 1][var17 + 1] = 6;
				var9[var16 - 1][var17 + 1] = var25;
			}

			if (var16 < var7 - 2 && var17 < var8 - 2 && 0 == var10[var16 + 1][var17 + 1] && 0 == (var22[var23 + 1][var24 + 2] & 1076101624) && (var22[var23 + 2][var24 + 2] & 1076101600) == 0 && 0 == (var22[var23 + 2][var24 + 1] & 1076101603)) {
				var11[var26] = var14 + 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var25;
			}
		}

		var5.method4677(var14, var15);
		return false;
	}

	public final boolean method4874(int var1, int var2, int var3, Class250 var4, Class226 var5, Class243 var6) {
		int var8 = var6.method4680();
		int var9 = var6.method4689();
		int[][] var10 = var6.method4683();
		int[][] var11 = var6.method4699();
		int[] var12 = var6.method4691();
		int[] var13 = var6.method4685();
		int var14 = var6.method4686();
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
		int[][] var23 = var5.field2363;

		while (true) {
			label299:
			while (true) {
				int var24;
				int var25;
				int var26;
				int var27;
				do {
					do {
						do {
							label276:
							do {
								if (var22 == var28) {
									var6.method4677(var15, var16);
									return false;
								}

								var15 = var12[var22];
								var16 = var13[var22];
								var22 = var22 + 1 & var14;
								var17 = var15 - var19;
								var18 = var16 - var20;
								var24 = var15 - var5.field2369;
								var25 = var16 - var5.field2362;
								if (var4.method1088(var3, var15, var16, var5)) {
									var6.method4677(var15, var16);
									return true;
								}

								var26 = 1 + var10[var17][var18];
								if (var17 > 0 && 0 == var11[var17 - 1][var18] && (var23[var24 - 1][var25] & 1076101390) == 0 && 0 == (var23[var24 - 1][var25 + var3 - 1] & 1076101432)) {
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

										if (0 != (var23[var24 - 1][var27 + var25] & 1076101438)) {
											break;
										}

										++var27;
									}
								}

								if (var17 < var8 - var3 && 0 == var11[var17 + 1][var18] && (var23[var24 + var3][var25] & 1076101507) == 0 && 0 == (var23[var24 + var3][var25 + var3 - 1] & 1076101600)) {
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

										if ((var23[var24 + var3][var27 + var25] & 1076101603) != 0) {
											break;
										}

										++var27;
									}
								}

								if (var18 > 0 && 0 == var11[var17][var18 - 1] && (var23[var24][var25 - 1] & 1076101390) == 0 && (var23[var24 + var3 - 1][var25 - 1] & 1076101507) == 0) {
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

										if (0 != (var23[var27 + var24][var25 - 1] & 1076101519)) {
											break;
										}

										++var27;
									}
								}

								if (var18 < var9 - var3 && 0 == var11[var17][var18 + 1] && (var23[var24][var25 + var3] & 1076101432) == 0 && 0 == (var23[var24 + var3 - 1][var25 + var3] & 1076101600)) {
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

										if (0 != (var23[var27 + var24][var25 + var3] & 1076101624)) {
											break;
										}

										++var27;
									}
								}

								if (var17 > 0 && var18 > 0 && 0 == var11[var17 - 1][var18 - 1] && (var23[var24 - 1][var25 - 1] & 1076101390) == 0) {
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

										if (0 != (var23[var24 - 1][var27 + (var25 - 1)] & 1076101438) || 0 != (var23[var24 - 1 + var27][var25 - 1] & 1076101519)) {
											break;
										}

										++var27;
									}
								}

								if (var17 < var8 - var3 && var18 > 0 && var11[var17 + 1][var18 - 1] == 0 && (var23[var24 + var3][var25 - 1] & 1076101507) == 0) {
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

										if ((var23[var24 + var3][var25 - 1 + var27] & 1076101603) != 0 || 0 != (var23[var27 + var24][var25 - 1] & 1076101519)) {
											break;
										}

										++var27;
									}
								}

								if (var17 > 0 && var18 < var9 - var3 && 0 == var11[var17 - 1][var18 + 1] && 0 == (var23[var24 - 1][var25 + var3] & 1076101432)) {
									for (var27 = 1; var27 < var3; ++var27) {
										if (0 != (var23[var24 - 1][var27 + var25] & 1076101438) || (var23[var27 + (var24 - 1)][var25 + var3] & 1076101624) != 0) {
											continue label276;
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
					} while(0 != var11[var17 + 1][var18 + 1]);
				} while(0 != (var23[var24 + var3][var25 + var3] & 1076101600));

				for (var27 = 1; var27 < var3; ++var27) {
					if ((var23[var27 + var24][var25 + var3] & 1076101624) != 0 || 0 != (var23[var24 + var3][var27 + var25] & 1076101603)) {
						continue label299;
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
}
