import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfInfo(name = "cr")
public class Class70 {
	@ObfInfo(owner = "hp", name = "al", desc = "Lgj;")
	public static Class166 field2183;
	@ObfInfo(owner = "va", name = "ac", desc = "Lgk;")
	public static Class167 field5362;
	@ObfInfo(owner = "kx", name = "as", desc = "Lku;")
	public static Class281 field2989;
	@ObfInfo(owner = "bo", name = "az", desc = "Lnx;")
	public static Class362 field204;
	@ObfInfo(name = "ax", desc = "Lnx;")
	public static Class362 field869;
	@ObfInfo(name = "ah", desc = "[Lcd;")
	public static Class56[] field868;
	@ObfInfo(name = "aw", desc = "Z")
	public static boolean field866;
	@ObfInfo(name = "at", desc = "Z")
	public static boolean field873;
	@ObfInfo(owner = "ue", name = "ay", desc = "I", intMultiplier = -1930464263)
	public static int field5245;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1780967395)
	public static int field867;
	@ObfInfo(name = "am", desc = "I", intMultiplier = -597753149)
	public static int field875;
	@ObfInfo(name = "ak", desc = "[I")
	public static int[] field862;
	@ObfInfo(name = "an", desc = "[I")
	public static int[] field864;
	@ObfInfo(name = "av", desc = "[I")
	public static int[] field865;
	@ObfInfo(name = "aj", desc = "[[I")
	public static int[][] field874;
	@ObfInfo(owner = "al", name = "ap", desc = "[Ljava/lang/String;")
	public static String[] field61;
	@ObfInfo(name = "ai", desc = "[Ljava/lang/String;")
	public static String[] field860;
	@ObfInfo(name = "af", desc = "Ljava/util/ArrayList;")
	public static ArrayList field863;
	@ObfInfo(name = "ao", desc = "Ljava/util/Calendar;")
	public static Calendar field870;
	@ObfInfo(owner = "eq", name = "wi", desc = "Ljava/util/Iterator;")
	public static Iterator field1456;
	@ObfInfo(owner = "ie", name = "wa", desc = "Ljava/util/List;")
	public static List field2319;
	@ObfInfo(name = "be", desc = "D")
	public static final double field872;
	@ObfInfo(name = "aa", desc = "[Ljava/lang/String;")
	public static final String[] field871;

	static {
		field864 = new int[5];
		field874 = new int[5][5000];
		field865 = new int[1000];
		field860 = new String[1000];
		field867 = 0;
		field868 = new Class56[50];
		field870 = Calendar.getInstance();
		field871 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field866 = false;
		field873 = false;
		field863 = new ArrayList();
		field875 = 0;
		field872 = Math.log(2.0D);
	}

	@ObfInfo(owner = "df", name = "aq", desc = "(Ldu;I)V")
	public static void method2344(Class99 var0) {
		method6553(var0, 500000, 475000);
	}

	@ObfInfo(owner = "no", name = "ad", desc = "(Ldu;III)V", opaque = "2102354700")
	public static void method6553(Class99 var0, int var1, int var2) {
		Object[] var4 = var0.field1217;
		Class85 var5;
		if (Class529.method3860(var0.field1221)) {
			field2989 = (Class281)var4[0];
			Class163 var6 = Class163.method3540(field2989.field2962);
			var5 = Class85.method4435(var0.field1221, var6.field1775, var6.field1778);
		} else {
			int var7 = (Integer)var4[0];
			var5 = Class85.method3896(var7);
		}

		if (var5 != null) {
			method6084(var0, var5, var1, var2);
		}

	}

	@ObfInfo(owner = "mb", name = "ag", desc = "(Ldu;Ldg;III)V", opaque = "-1950945045")
	public static void method6084(Class99 var0, Class85 var1, int var2, int var3) {
		Object[] var5 = var0.field1217;
		Class80.field1598 = 0;
		Class80.field3328 = 0;
		int var6 = -1;
		int[] var7 = var1.field1071;
		int[] var8 = var1.field1072;
		byte var9 = -1;
		field867 = 0;
		field866 = false;
		boolean var10 = false;
		int var11 = 0;
		boolean var23 = false;

		label859: {
			label860: {
				try {
					int var14;
					try {
						var23 = true;
						field862 = new int[var1.field1074];
						int var12 = 0;
						field61 = new String[var1.field1070];
						int var28 = 0;

						int var15;
						String var38;
						for (var14 = 1; var14 < var5.length; ++var14) {
							if (var5[var14] instanceof Integer) {
								var15 = (Integer)var5[var14];
								if (var15 == -2147483647) {
									var15 = var0.field1212;
								}

								if (var15 == -2147483646) {
									var15 = var0.field1214;
								}

								if (var15 == -2147483645) {
									var15 = var0.field1215 != null ? var0.field1215.field3812 : -1;
								}

								if (var15 == -2147483644) {
									var15 = var0.field1211;
								}

								if (var15 == -2147483643) {
									var15 = var0.field1215 != null ? var0.field1215.field3851 : -1;
								}

								if (var15 == -2147483642) {
									var15 = var0.field1216 != null ? var0.field1216.field3812 : -1;
								}

								if (var15 == -2147483641) {
									var15 = var0.field1216 != null ? var0.field1216.field3851 : -1;
								}

								if (var15 == -2147483640) {
									var15 = var0.field1210;
								}

								if (var15 == -2147483639) {
									var15 = var0.field1218;
								}

								field862[var12++] = var15;
							} else if (var5[var14] instanceof String) {
								var38 = (String)var5[var14];
								if (var38.equals("event_opbase")) {
									var38 = var0.field1219;
								}

								field61[var28++] = var38;
							}
						}

						field875 = var0.field1220;

						label840:
						while (true) {
							++var11;
							if (var11 > var2) {
								throw new RuntimeException();
							}

							++var6;
							int var26 = var7[var6];
							if (var26 >= 100) {
								boolean var37;
								if (var1.field1072[var6] == 1) {
									var37 = true;
								} else {
									var37 = false;
								}

								var15 = method3883(var26, var1, var37);
								switch(var15) {
								case 0:
									var23 = false;
									break label840;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var26 == 0) {
								field865[++Class80.field1598 - 1] = var8[var6];
							} else if (var26 == 1) {
								var14 = var8[var6];
								field865[++Class80.field1598 - 1] = Class353.field3769[var14];
							} else if (var26 == 2) {
								var14 = var8[var6];
								Class353.field3769[var14] = field865[--Class80.field1598];
								Class82.method2313(var14);
							} else if (var26 == 3) {
								field860[++Class80.field3328 - 1] = var1.field1073[var6];
							} else if (var26 == 6) {
								var6 += var8[var6];
							} else if (var26 == 7) {
								Class80.field1598 -= 2;
								if (field865[Class80.field1598 + 1] != field865[Class80.field1598]) {
									var6 += var8[var6];
								}
							} else if (var26 == 8) {
								Class80.field1598 -= 2;
								if (field865[1 + Class80.field1598] == field865[Class80.field1598]) {
									var6 += var8[var6];
								}
							} else if (var26 == 9) {
								Class80.field1598 -= 2;
								if (field865[Class80.field1598] < field865[1 + Class80.field1598]) {
									var6 += var8[var6];
								}
							} else if (var26 == 10) {
								Class80.field1598 -= 2;
								if (field865[Class80.field1598] > field865[1 + Class80.field1598]) {
									var6 += var8[var6];
								}
							} else if (var26 == 21) {
								if (0 == field867) {
									var23 = false;
									break label860;
								}

								Class56 var36 = field868[--field867];
								var1 = var36.field414;
								var7 = var1.field1071;
								var8 = var1.field1072;
								var6 = var36.field412;
								field862 = var36.field415;
								field61 = var36.field413;
							} else if (var26 == 25) {
								var14 = var8[var6];
								field865[++Class80.field1598 - 1] = Class353.method3359(var14);
							} else if (var26 == 27) {
								var14 = var8[var6];
								Class353.method4043(var14, field865[--Class80.field1598]);
							} else if (var26 == 31) {
								Class80.field1598 -= 2;
								if (field865[Class80.field1598] <= field865[1 + Class80.field1598]) {
									var6 += var8[var6];
								}
							} else if (var26 == 32) {
								Class80.field1598 -= 2;
								if (field865[Class80.field1598] >= field865[Class80.field1598 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 33) {
								field865[++Class80.field1598 - 1] = field862[var8[var6]];
							} else if (var26 == 34) {
								field862[var8[var6]] = field865[--Class80.field1598];
							} else if (var26 == 35) {
								field860[++Class80.field3328 - 1] = field61[var8[var6]];
							} else if (var26 == 36) {
								field61[var8[var6]] = field860[--Class80.field3328];
							} else if (var26 == 37) {
								var14 = var8[var6];
								Class80.field3328 -= var14;
								var38 = Class413.method146(field860, Class80.field3328, var14);
								field860[++Class80.field3328 - 1] = var38;
							} else if (var26 == 38) {
								--Class80.field1598;
							} else if (var26 == 39) {
								--Class80.field3328;
							} else {
								int var18;
								if (var26 != 40) {
									if (var26 == 42) {
										field865[++Class80.field1598 - 1] = Client.field4564.method2841(var8[var6]);
									} else if (var26 == 43) {
										Client.field4564.method2800(var8[var6], field865[--Class80.field1598]);
									} else if (var26 == 44) {
										var14 = var8[var6] >> 16;
										var15 = var8[var6] & 65535;
										int var29 = field865[--Class80.field1598];
										if (var29 < 0 || var29 > 5000) {
											throw new RuntimeException();
										}

										field864[var14] = var29;
										byte var32 = -1;
										if (var15 == 105) {
											var32 = 0;
										}

										for (var18 = 0; var18 < var29; ++var18) {
											field874[var14][var18] = var32;
										}
									} else if (var26 == 45) {
										var14 = var8[var6];
										var15 = field865[--Class80.field1598];
										if (var15 < 0 || var15 >= field864[var14]) {
											throw new RuntimeException();
										}

										field865[++Class80.field1598 - 1] = field874[var14][var15];
									} else if (var26 == 46) {
										var14 = var8[var6];
										Class80.field1598 -= 2;
										var15 = field865[Class80.field1598];
										if (var15 < 0 || var15 >= field864[var14]) {
											throw new RuntimeException();
										}

										field874[var14][var15] = field865[Class80.field1598 + 1];
									} else {
										String var30;
										if (var26 == 47) {
											var30 = Client.field4564.method2805(var8[var6]);
											if (var30 == null) {
												var30 = Class367.field4306;
											}

											field860[++Class80.field3328 - 1] = var30;
										} else if (var26 == 48) {
											Client.field4564.method2804(var8[var6], field860[--Class80.field3328]);
										} else if (var26 == 49) {
											var30 = Client.field4564.method2820(var8[var6]);
											field860[++Class80.field3328 - 1] = var30;
										} else if (var26 == 50) {
											Client.field4564.method2802(var8[var6], field860[--Class80.field3328]);
										} else if (var26 == 60) {
											Class502 var33 = var1.field1078[var8[var6]];
											Class508 var41 = (Class508)var33.method8901((long)field865[--Class80.field1598]);
											if (var41 != null) {
												var6 += var41.field5094;
											}
										} else {
											Integer var34;
											if (var26 == 74) {
												var34 = field5362.method3458(var8[var6]);
												if (var34 == null) {
													field865[++Class80.field1598 - 1] = -1;
												} else {
													field865[++Class80.field1598 - 1] = var34;
												}
											} else {
												if (var26 != 76) {
													throw new IllegalStateException();
												}

												var34 = Client.field1315.method8641(var8[var6]);
												if (var34 == null) {
													field865[++Class80.field1598 - 1] = -1;
												} else {
													field865[++Class80.field1598 - 1] = var34;
												}
											}
										}
									}
								} else {
									var14 = var8[var6];
									Class85 var40 = Class85.method3896(var14);
									int[] var16 = new int[var40.field1074];
									String[] var17 = new String[var40.field1070];

									for (var18 = 0; var18 < var40.field1076; ++var18) {
										var16[var18] = field865[Class80.field1598 - var40.field1076 + var18];
									}

									for (var18 = 0; var18 < var40.field1077; ++var18) {
										var17[var18] = field860[var18 + (Class80.field3328 - var40.field1077)];
									}

									Class80.field1598 -= var40.field1076;
									Class80.field3328 -= var40.field1077;
									Class56 var35 = new Class56();
									var35.field414 = var1;
									var35.field412 = var6;
									var35.field415 = field862;
									var35.field413 = field61;
									field868[++field867 - 1] = var35;
									var1 = var40;
									var7 = var40.field1071;
									var8 = var40.field1072;
									var6 = -1;
									field862 = var16;
									field61 = var17;
								}
							}
						}
					} catch (Exception var24) {
						var10 = true;
						StringBuilder var13 = new StringBuilder(30);
						var13.append("").append(var1.field5234).append(" ");

						for (var14 = field867 - 1; var14 >= 0; --var14) {
							var13.append("").append(field868[var14].field414.field5234).append(" ");
						}

						var13.append("").append(var9);
						Class552.method8390(var13.toString(), var24);
						var23 = false;
						break label859;
					}
				} finally {
					if (var23) {
						while (field863.size() > 0) {
							Class123 var20 = (Class123)field863.remove(0);
							Client.method8423(var20.method2993(), var20.method2998(), var20.method3000(), var20.method2997(), "");
						}

						if (field866) {
							field866 = false;
							Client.method2918();
						}

						if (!var10 && var3 > 0 && var11 >= var3) {
							Class552.method8390("Warning: Script " + var1.field1079 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (field863.size() > 0) {
					Class123 var31 = (Class123)field863.remove(0);
					Client.method8423(var31.method2993(), var31.method2998(), var31.method3000(), var31.method2997(), "");
				}

				if (field866) {
					field866 = false;
					Client.method2918();
				}

				if (!var10 && var3 > 0 && var11 >= var3) {
					Class552.method8390("Warning: Script " + var1.field1079 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (field863.size() > 0) {
				Class123 var39 = (Class123)field863.remove(0);
				Client.method8423(var39.method2993(), var39.method2998(), var39.method3000(), var39.method2997(), "");
			}

			if (field866) {
				field866 = false;
				Client.method2918();
			}

			if (!var10 && var3 > 0 && var11 >= var3) {
				Class552.method8390("Warning: Script " + var1.field1079 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (field863.size() > 0) {
			Class123 var27 = (Class123)field863.remove(0);
			Client.method8423(var27.method2993(), var27.method2998(), var27.method3000(), var27.method2997(), "");
		}

		if (field866) {
			field866 = false;
			Client.method2918();
		}

		if (!var10 && var3 > 0 && var11 >= var3) {
			Class552.method8390("Warning: Script " + var1.field1079 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfInfo(owner = "hk", name = "ak", desc = "(ILdg;ZI)I", opaque = "1859731413")
	public static int method3883(int var0, Class85 var1, boolean var2) {
		if (var0 < 1000) {
			return method9424(var0, var1, var2);
		} else if (var0 < 1100) {
			return method2869(var0, var1, var2);
		} else if (var0 < 1200) {
			return method7102(var0, var1, var2);
		} else if (var0 < 1300) {
			return method6287(var0, var1, var2);
		} else if (var0 < 1400) {
			return method325(var0, var1, var2);
		} else if (var0 < 1500) {
			return method305(var0, var1, var2);
		} else if (var0 < 1600) {
			return method3543(var0, var1, var2);
		} else if (var0 < 1700) {
			return method6320(var0, var1, var2);
		} else if (var0 < 1800) {
			return method2301(var0, var1, var2);
		} else if (var0 < 1900) {
			return Class256.method4948(var0, var1, var2);
		} else if (var0 < 2000) {
			return method5851(var0, var1, var2);
		} else if (var0 < 2100) {
			return method2869(var0, var1, var2);
		} else if (var0 < 2200) {
			return method7102(var0, var1, var2);
		} else if (var0 < 2300) {
			return method6287(var0, var1, var2);
		} else if (var0 < 2400) {
			return method325(var0, var1, var2);
		} else if (var0 < 2500) {
			return method305(var0, var1, var2);
		} else if (var0 < 2600) {
			return method1(var0, var1, var2);
		} else if (var0 < 2700) {
			return method2300(var0, var1, var2);
		} else if (var0 < 2800) {
			return method6283(var0, var1, var2);
		} else if (var0 < 2900) {
			return Class346.method6483(var0, var1, var2);
		} else if (var0 < 3000) {
			return method5851(var0, var1, var2);
		} else if (var0 < 3200) {
			return method7239(var0, var1, var2);
		} else if (var0 < 3300) {
			return method1972(var0, var1, var2);
		} else if (var0 < 3400) {
			return method3192(var0, var1, var2);
		} else if (var0 < 3500) {
			return method7053(var0, var1, var2);
		} else if (var0 < 3600) {
			return method5113(var0, var1, var2);
		} else if (var0 < 3700) {
			return method7269(var0, var1, var2);
		} else if (var0 < 3800) {
			return method787(var0, var1, var2);
		} else if (var0 < 3900) {
			return method3415(var0, var1, var2);
		} else if (var0 < 4000) {
			return method3598(var0, var1, var2);
		} else if (var0 < 4100) {
			return method571(var0, var1, var2);
		} else if (var0 < 4200) {
			return method275(var0, var1, var2);
		} else if (var0 < 4300) {
			return method2224(var0, var1, var2);
		} else if (var0 < 5100) {
			return method60(var0, var1, var2);
		} else if (var0 < 5400) {
			return method36(var0, var1, var2);
		} else if (var0 < 5600) {
			return method3031(var0, var1, var2);
		} else if (var0 < 5700) {
			return Class129.method3047(var0, var1, var2);
		} else if (var0 < 6300) {
			return method6227(var0, var1, var2);
		} else if (var0 < 6600) {
			return method803(var0, var1, var2);
		} else if (var0 < 6700) {
			return method5010(var0, var1, var2);
		} else if (var0 < 6800) {
			return method8839(var0, var1, var2);
		} else if (var0 < 6900) {
			return method2136(var0, var1, var2);
		} else if (var0 < 7000) {
			return method274(var0, var1, var2);
		} else if (var0 < 7100) {
			return method451(var0, var1, var2);
		} else if (var0 < 7200) {
			return method6605(var0, var1, var2);
		} else if (var0 < 7500) {
			return method6572(var0, var1, var2);
		} else if (var0 < 7600) {
			return method5048(var0, var1, var2);
		} else if (var0 < 7700) {
			return method8281(var0, var1, var2);
		} else {
			return var0 < 8100 ? method39(var0, var1, var2) : 2;
		}
	}

	@ObfInfo(owner = "um", name = "ap", desc = "(ILdg;ZI)I", opaque = "-387580854")
	public static int method9424(int var0, Class85 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 100) {
			Class80.field1598 -= 3;
			var4 = field865[Class80.field1598];
			var5 = field865[Class80.field1598 + 1];
			int var12 = field865[Class80.field1598 + 2];
			if (var5 == 0) {
				throw new RuntimeException();
			} else {
				Class362 var7 = Client.field4644.method6417(var4);
				if (var7.field3950 == null) {
					var7.field3950 = new Class362[var12 + 1];
				}

				if (var7.field3950.length <= var12) {
					Class362[] var8 = new Class362[var12 + 1];

					for (int var9 = 0; var9 < var7.field3950.length; ++var9) {
						var8[var9] = var7.field3950[var9];
					}

					var7.field3950 = var8;
				}

				if (var12 > 0 && var7.field3950[var12 - 1] == null) {
					throw new RuntimeException("" + (var12 - 1));
				} else {
					Class362 var13 = new Class362();
					var13.field3815 = var5;
					var13.field3832 = var13.field3812 = var7.field3812;
					var13.field3851 = var12;
					var13.field3896 = true;
					if (var5 == 12) {
						var13.method6653();
						var13.method6756().method6821(new Class128(var13));
						var13.method6756().method6820(new Class114(var13));
					}

					var7.field3950[var12] = var13;
					if (var2) {
						field869 = var13;
					} else {
						field204 = var13;
					}

					Class490.method8827(var7);
					return 1;
				}
			}
		} else {
			Class362 var10;
			if (var0 == 101) {
				var10 = var2 ? field869 : field204;
				Class362 var11 = Client.field4644.method6417(var10.field3812);
				var11.field3950[var10.field3851] = null;
				Class490.method8827(var11);
				return 1;
			} else if (var0 == 102) {
				var10 = Client.field4644.method6417(field865[--Class80.field1598]);
				var10.field3950 = null;
				Class490.method8827(var10);
				return 1;
			} else if (var0 != 200) {
				if (var0 == 201) {
					var10 = Client.field4644.method6417(field865[--Class80.field1598]);
					if (var10 != null) {
						field865[++Class80.field1598 - 1] = 1;
						if (var2) {
							field869 = var10;
						} else {
							field204 = var10;
						}
					} else {
						field865[++Class80.field1598 - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				Class80.field1598 -= 2;
				var4 = field865[Class80.field1598];
				var5 = field865[Class80.field1598 + 1];
				Class362 var6 = Client.field4644.method6411(var4, var5);
				if (var6 != null && var5 != -1) {
					field865[++Class80.field1598 - 1] = 1;
					if (var2) {
						field869 = var6;
					} else {
						field204 = var6;
					}
				} else {
					field865[++Class80.field1598 - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfInfo(owner = "ef", name = "an", desc = "(ILdg;ZI)I", opaque = "1052343396")
	public static int method2869(int var0, Class85 var1, boolean var2) {
		int var4 = -1;
		Class362 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = field865[--Class80.field1598];
			var5 = Client.field4644.method6417(var4);
		} else {
			var5 = var2 ? field869 : field204;
		}

		if (var0 == 1000) {
			Class80.field1598 -= 4;
			var5.field3888 = field865[Class80.field1598];
			var5.field3823 = field865[Class80.field1598 + 1];
			var5.field3818 = field865[Class80.field1598 + 2];
			var5.field3878 = field865[Class80.field1598 + 3];
			Class490.method8827(var5);
			Client.field4671.method1352(var5);
			if (var4 != -1 && 0 == var5.field3815) {
				Client.method4491(Client.field4644.field3698[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == 1001) {
			Class80.field1598 -= 4;
			var5.field3928 = field865[Class80.field1598];
			var5.field3825 = field865[1 + Class80.field1598];
			var5.field3898 = field865[Class80.field1598 + 2];
			var5.field3902 = field865[Class80.field1598 + 3];
			Class490.method8827(var5);
			Client.field4671.method1352(var5);
			if (var4 != -1 && 0 == var5.field3815) {
				Client.method4491(Client.field4644.field3698[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == 1003) {
			boolean var6 = field865[--Class80.field1598] == 1;
			if (var5.field3833 != var6) {
				var5.field3833 = var6;
				Class490.method8827(var5);
			}

			return 1;
		} else if (var0 == 1005) {
			var5.field3960 = field865[--Class80.field1598] == 1;
			return 1;
		} else if (var0 == 1006) {
			var5.field3961 = field865[--Class80.field1598] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "oe", name = "aj", desc = "(ILdg;ZI)I", opaque = "-764736311")
	public static int method7102(int var0, Class85 var1, boolean var2) {
		int var5 = -1;
		Class362 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = field865[--Class80.field1598];
			var4 = Client.field4644.method6417(var5);
		} else {
			var4 = var2 ? field869 : field204;
		}

		int var24;
		if (var0 == 1100) {
			Class80.field1598 -= 2;
			var24 = field865[Class80.field1598];
			int var20 = field865[Class80.field1598 + 1];
			if (var4.field3815 == 12) {
				Class363 var17 = var4.method6756();
				if (var17 != null && var17.method6920(var24, var20)) {
					Class490.method8827(var4);
				}
			} else {
				var4.field3958 = var24;
				if (var4.field3958 > var4.field3836 - var4.field3828) {
					var4.field3958 = var4.field3836 - var4.field3828;
				}

				if (var4.field3958 < 0) {
					var4.field3958 = 0;
				}

				var4.field3835 = var20;
				if (var4.field3835 > var4.field3837 - var4.field3829) {
					var4.field3835 = var4.field3837 - var4.field3829;
				}

				if (var4.field3835 < 0) {
					var4.field3835 = 0;
				}

				Class490.method8827(var4);
			}

			return 1;
		} else if (var0 == 1101) {
			var4.field3894 = field865[--Class80.field1598];
			Class490.method8827(var4);
			return 1;
		} else if (var0 == 1102) {
			var4.field3842 = field865[--Class80.field1598] == 1;
			Class490.method8827(var4);
			return 1;
		} else if (var0 == 1103) {
			var4.field3844 = field865[--Class80.field1598];
			Class490.method8827(var4);
			return 1;
		} else if (var0 == 1104) {
			var4.field3846 = field865[--Class80.field1598];
			Class490.method8827(var4);
			return 1;
		} else if (var0 == 1105) {
			var4.field3848 = field865[--Class80.field1598];
			Class490.method8827(var4);
			return 1;
		} else if (var0 == 1106) {
			var4.field3802 = field865[--Class80.field1598];
			Class490.method8827(var4);
			return 1;
		} else if (var0 == 1107) {
			var4.field3821 = field865[--Class80.field1598] == 1;
			Class490.method8827(var4);
			return 1;
		} else if (var0 == 1108) {
			var4.field3891 = 1;
			var4.field3858 = field865[--Class80.field1598];
			Class490.method8827(var4);
			return 1;
		} else if (var0 == 1109) {
			Class80.field1598 -= 6;
			var4.field3863 = field865[Class80.field1598];
			var4.field3864 = field865[1 + Class80.field1598];
			var4.field3865 = field865[2 + Class80.field1598];
			var4.field3866 = field865[3 + Class80.field1598];
			var4.field3867 = field865[Class80.field1598 + 4];
			var4.field3868 = field865[Class80.field1598 + 5];
			Class490.method8827(var4);
			return 1;
		} else if (var0 == 1110) {
			var24 = field865[--Class80.field1598];
			if (var4.field3861 != var24) {
				var4.field3861 = var24;
				var4.field3853 = 0;
				var4.field3926 = 0;
				Class490.method8827(var4);
			}

			return 1;
		} else if (var0 == 1111) {
			var4.field3872 = field865[--Class80.field1598] == 1;
			Class490.method8827(var4);
			return 1;
		} else {
			String var14;
			Class363 var16;
			if (var0 == 1112) {
				var14 = field860[--Class80.field3328];
				if (var4.field3815 == 12) {
					var16 = var4.method6756();
					if (var16 != null && var16.method6830()) {
						var16.method6848(var14);
					} else {
						var4.field3876 = var14;
					}

					Class490.method8827(var4);
				} else if (!var14.equals(var4.field3876)) {
					var4.field3876 = var14;
					Class490.method8827(var4);
				}

				return 1;
			} else {
				Class363 var21;
				if (var0 == 1113) {
					var4.field3875 = field865[--Class80.field1598];
					if (12 == var4.field3815) {
						var21 = var4.method6756();
						if (var21 != null) {
							var21.method6790();
						}
					}

					Class490.method8827(var4);
					return 1;
				} else if (var0 == 1114) {
					Class80.field1598 -= 3;
					if (12 == var4.field3815) {
						var21 = var4.method6756();
						if (var21 != null) {
							var21.method6839(field865[Class80.field1598], field865[Class80.field1598 + 1]);
							var21.method6810(field865[Class80.field1598 + 2]);
						}
					} else {
						var4.field3879 = field865[Class80.field1598];
						var4.field3880 = field865[1 + Class80.field1598];
						var4.field3843 = field865[2 + Class80.field1598];
					}

					Class490.method8827(var4);
					return 1;
				} else if (var0 == 1115) {
					var4.field3914 = field865[--Class80.field1598] == 1;
					Class490.method8827(var4);
					return 1;
				} else if (var0 == 1116) {
					var4.field3924 = field865[--Class80.field1598];
					Class490.method8827(var4);
					return 1;
				} else if (var0 == 1117) {
					var4.field3854 = field865[--Class80.field1598];
					Class490.method8827(var4);
					return 1;
				} else if (var0 == 1118) {
					var4.field3855 = field865[--Class80.field1598] == 1;
					Class490.method8827(var4);
					return 1;
				} else if (var0 == 1119) {
					var4.field3856 = field865[--Class80.field1598] == 1;
					Class490.method8827(var4);
					return 1;
				} else if (var0 == 1120) {
					Class80.field1598 -= 2;
					var4.field3836 = field865[Class80.field1598];
					var4.field3837 = field865[1 + Class80.field1598];
					Class490.method8827(var4);
					if (var5 != -1 && var4.field3815 == 0) {
						Client.method4491(Client.field4644.field3698[var5 >> 16], var4, false);
					}

					return 1;
				} else if (var0 == 1121) {
					Client.method3516(var4.field3812, var4.field3851);
					Client.field607 = var4;
					Class490.method8827(var4);
					return 1;
				} else if (var0 == 1122) {
					var4.field3857 = field865[--Class80.field1598];
					Class490.method8827(var4);
					return 1;
				} else if (var0 == 1123) {
					var4.field3839 = field865[--Class80.field1598];
					Class490.method8827(var4);
					return 1;
				} else if (var0 == 1124) {
					var4.field3845 = field865[--Class80.field1598];
					Class490.method8827(var4);
					return 1;
				} else if (var0 == 1125) {
					var24 = field865[--Class80.field1598];
					Class563 var18 = (Class563)Class406.method4071(Class563.method3243(), var24);
					if (var18 != null) {
						var4.field3930 = var18;
						Class490.method8827(var4);
					}

					return 1;
				} else {
					boolean var22;
					if (var0 == 1126) {
						var22 = field865[--Class80.field1598] == 1;
						var4.field3862 = var22;
						return 1;
					} else if (var0 == 1127) {
						var22 = field865[--Class80.field1598] == 1;
						var4.field3838 = var22;
						return 1;
					} else if (var0 == 1129) {
						var4.field3850 = field860[--Class80.field3328];
						Class490.method8827(var4);
						return 1;
					} else if (var0 == 1130) {
						var4.method6637(field860[--Class80.field3328], "", Client.field4823, Client.method8516());
						return 1;
					} else if (var0 == 1131) {
						Class80.field1598 -= 2;
						var4.method6641(field865[Class80.field1598], field865[Class80.field1598 + 1]);
						return 1;
					} else if (var0 == 1132) {
						var4.method6746(field860[--Class80.field3328], field865[--Class80.field1598]);
						return 1;
					} else {
						Class359 var23;
						if (var0 == 1133) {
							--Class80.field1598;
							var23 = var4.method6655();
							if (var23 != null) {
								var23.field3790 = field865[Class80.field1598];
								Class490.method8827(var4);
							}

							return 1;
						} else if (var0 == 1134) {
							--Class80.field1598;
							var23 = var4.method6655();
							if (var23 != null) {
								var23.field3789 = field865[Class80.field1598];
								Class490.method8827(var4);
							}

							return 1;
						} else if (var0 == 1135) {
							--Class80.field3328;
							var21 = var4.method6756();
							if (var21 != null) {
								var4.field3877 = field860[Class80.field3328];
							}

							return 1;
						} else if (var0 == 1136) {
							--Class80.field1598;
							var23 = var4.method6655();
							if (var23 != null) {
								var23.field3788 = field865[Class80.field1598];
								Class490.method8827(var4);
							}

							return 1;
						} else if (var0 == 1137) {
							--Class80.field1598;
							var21 = var4.method6756();
							if (var21 != null && var21.method6906(field865[Class80.field1598])) {
								Class490.method8827(var4);
							}

							return 1;
						} else if (var0 == 1138) {
							--Class80.field1598;
							var21 = var4.method6756();
							if (var21 != null && var21.method6781(field865[Class80.field1598])) {
								Class490.method8827(var4);
							}

							return 1;
						} else if (var0 == 1139) {
							--Class80.field1598;
							var21 = var4.method6756();
							if (var21 != null && var21.method6782(field865[Class80.field1598])) {
								Class490.method8827(var4);
							}

							return 1;
						} else if (var0 == 1140) {
							var22 = field865[--Class80.field1598] == 1;
							Client.field766.method4400();
							var16 = var4.method6756();
							if (var16 != null && var16.method6953(var22)) {
								if (var22) {
									Client.field766.method4398(var4);
								}

								Class490.method8827(var4);
							}

							return 1;
						} else if (var0 == 1141) {
							var22 = field865[--Class80.field1598] == 1;
							if (!var22 && Client.field766.method4399() == var4) {
								Client.field766.method4400();
								Class490.method8827(var4);
							}

							var16 = var4.method6756();
							if (var16 != null) {
								var16.method6775(var22);
							}

							return 1;
						} else if (var0 == 1142) {
							Class80.field1598 -= 2;
							var21 = var4.method6756();
							if (var21 != null && var21.method6798(field865[Class80.field1598], field865[Class80.field1598 + 1])) {
								Class490.method8827(var4);
							}

							return 1;
						} else if (var0 == 1143) {
							--Class80.field1598;
							var21 = var4.method6756();
							if (var21 != null && var21.method6798(field865[Class80.field1598], field865[Class80.field1598])) {
								Class490.method8827(var4);
							}

							return 1;
						} else if (var0 == 1144) {
							--Class80.field1598;
							var21 = var4.method6756();
							if (var21 != null) {
								var21.method6787(field865[Class80.field1598]);
								Class490.method8827(var4);
							}

							return 1;
						} else if (var0 == 1145) {
							--Class80.field1598;
							var21 = var4.method6756();
							if (var21 != null) {
								var21.method6939(field865[Class80.field1598]);
							}

							return 1;
						} else if (var0 == 1146) {
							--Class80.field1598;
							var21 = var4.method6756();
							if (var21 != null) {
								var21.method6789(field865[Class80.field1598]);
							}

							return 1;
						} else if (var0 == 1147) {
							--Class80.field1598;
							var21 = var4.method6756();
							if (var21 != null) {
								var21.method6803(field865[Class80.field1598]);
								Class490.method8827(var4);
							}

							return 1;
						} else {
							Class36 var19;
							if (var0 == 1148) {
								Class80.field1598 -= 2;
								var19 = var4.method6705();
								if (var19 != null) {
									var19.method485(field865[Class80.field1598], field865[Class80.field1598 + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								Class80.field1598 -= 2;
								var19 = var4.method6705();
								if (var19 != null) {
									var19.method486((char)field865[Class80.field1598], field865[Class80.field1598 + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var4.method6639(field860[--Class80.field3328], Client.field4823);
								return 1;
							} else if (var0 == 1151) {
								Class80.field3328 -= 3;
								var14 = field860[Class80.field3328];
								String var15 = field860[Class80.field3328 + 1];
								String var8 = field860[2 + Class80.field3328];
								long var9 = Client.method8516();
								long var11 = Client.method4423();
								String var13 = Client.method8337().method9016(Client.method8337().field5117);
								if (var9 != -1L) {
									var14 = var14.replaceAll("%userid%", Long.toString(var9));
								}

								if (-1L != var11) {
									var14 = var14.replaceAll("%userhash%", Long.toString(var11));
								}

								if (!var13.isEmpty()) {
									var14 = var14.replaceAll("%deviceid%", var13);
								}

								var4.method6634(var14, var15, var8, var13, Long.toString(var11), Client.field4823);
								return 1;
							} else if (var0 == 1152) {
								if (11 != var4.field3815) {
									throw new RuntimeException();
								} else {
									Class227 var6 = var4.method6685();
									boolean var7 = var6 != null && Class222.method7869().method4274(var6.method4360());
									field865[++Class80.field1598 - 1] = var7 ? 1 : 0;
									return 1;
								}
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}

	@ObfInfo(owner = "mj", name = "av", desc = "(ILdg;ZI)I", opaque = "-385380656")
	public static int method6287(int var0, Class85 var1, boolean var2) {
		Class362 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Client.field4644.method6417(field865[--Class80.field1598]);
		} else {
			var4 = var2 ? field869 : field204;
		}

		Class490.method8827(var4);
		int var5;
		int var6;
		if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
			if (var0 == 1201) {
				var4.field3891 = 2;
				var4.field3858 = field865[--Class80.field1598];
				return 1;
			} else if (var0 == 1202) {
				var4.field3891 = 3;
				var4.field3858 = Client.field170.field1001.method6437();
				return 1;
			} else if (var0 == 1207) {
				boolean var8 = field865[--Class80.field1598] == 1;
				Class362.method6603(var4, Client.field170.field1001, var8);
				return 1;
			} else if (var0 == 1208) {
				var5 = field865[--Class80.field1598];
				if (var4.field3820 == null) {
					throw new RuntimeException("");
				} else {
					Class362.method4456(var4, var5);
					return 1;
				}
			} else if (var0 == 1209) {
				Class80.field1598 -= 2;
				var5 = field865[Class80.field1598];
				var6 = field865[1 + Class80.field1598];
				if (var4.field3820 == null) {
					throw new RuntimeException("");
				} else {
					Class362.method2302(var4, var5, var6);
					return 1;
				}
			} else if (var0 == 1210) {
				var5 = field865[--Class80.field1598];
				if (var4.field3820 == null) {
					throw new RuntimeException("");
				} else {
					Class209.method4041(var4, Client.field170.field1001.field3720, var5);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			Class80.field1598 -= 2;
			var5 = field865[Class80.field1598];
			var6 = field865[1 + Class80.field1598];
			var4.field3946 = var5;
			var4.field3919 = var6;
			Class187 var7 = Class187.method3421(var5);
			var4.field3865 = var7.field2031;
			var4.field3866 = var7.field2042;
			var4.field3867 = var7.field2022;
			var4.field3863 = var7.field2023;
			var4.field3864 = var7.field2024;
			var4.field3868 = var7.field2019;
			if (var0 == 1205) {
				var4.field3874 = 0;
			} else if (var0 == 1212 | 1 == var7.field2025) {
				var4.field3874 = 1;
			} else {
				var4.field3874 = 2;
			}

			if (var4.field3869 > 0) {
				var4.field3868 = var4.field3868 * 32 / var4.field3869;
			} else if (var4.field3928 > 0) {
				var4.field3868 = var4.field3868 * 32 / var4.field3928;
			}

			return 1;
		}
	}

	@ObfInfo(owner = "ax", name = "ab", desc = "(ILdg;ZI)I", opaque = "-2131551299")
	public static int method325(int var0, Class85 var1, boolean var2) {
		boolean var4 = true;
		Class362 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = Client.field4644.method6417(field865[--Class80.field1598]);
			var4 = false;
		} else {
			var5 = var2 ? field869 : field204;
		}

		int var10;
		if (var0 == 1300) {
			var10 = field865[--Class80.field1598] - 1;
			if (var10 >= 0 && var10 <= 9) {
				var5.method6662(var10, field860[--Class80.field3328]);
				return 1;
			} else {
				--Class80.field3328;
				return 1;
			}
		} else {
			int var11;
			if (var0 == 1301) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var11 = field865[1 + Class80.field1598];
				var5.field3895 = Client.field4644.method6411(var10, var11);
				return 1;
			} else if (var0 == 1302) {
				var5.field3849 = field865[--Class80.field1598] == 1;
				return 1;
			} else if (var0 == 1303) {
				var5.field3870 = field865[--Class80.field1598];
				return 1;
			} else if (var0 == 1304) {
				var5.field3873 = field865[--Class80.field1598];
				return 1;
			} else if (var0 == 1305) {
				var5.field3940 = field860[--Class80.field3328];
				return 1;
			} else if (var0 == 1306) {
				var5.field3899 = field860[--Class80.field3328];
				return 1;
			} else if (var0 == 1307) {
				var5.field3909 = null;
				return 1;
			} else if (var0 == 1308) {
				var5.field3949 = field865[--Class80.field1598] == 1;
				return 1;
			} else if (var0 == 1309) {
				--Class80.field1598;
				return 1;
			} else {
				byte[] var7;
				int var8;
				if (var0 != 1350) {
					byte var9;
					if (var0 == 1351) {
						Class80.field1598 -= 2;
						var9 = 10;
						var7 = new byte[]{(byte)field865[Class80.field1598]};
						byte[] var12 = new byte[]{(byte)field865[Class80.field1598 + 1]};
						Class279.method5584(var5, var9, var7, var12);
						return 1;
					} else if (var0 == 1352) {
						Class80.field1598 -= 3;
						var10 = field865[Class80.field1598] - 1;
						var11 = field865[1 + Class80.field1598];
						var8 = field865[Class80.field1598 + 2];
						if (var10 >= 0 && var10 <= 9) {
							method6222(var5, var10, var11, var8);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1353) {
						var9 = 10;
						var11 = field865[--Class80.field1598];
						var8 = field865[--Class80.field1598];
						method6222(var5, var9, var11, var8);
						return 1;
					} else if (var0 == 1354) {
						--Class80.field1598;
						var10 = field865[Class80.field1598] - 1;
						if (var10 >= 0 && var10 <= 9) {
							Class45.method659(var5, var10);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1355) {
						var9 = 10;
						Class45.method659(var5, var9);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var6 = null;
					var7 = null;
					if (var4) {
						Class80.field1598 -= 10;

						for (var8 = 0; var8 < 10 && field865[var8 + Class80.field1598] >= 0; var8 += 2) {
						}

						if (var8 > 0) {
							var6 = new byte[var8 / 2];
							var7 = new byte[var8 / 2];

							for (var8 -= 2; var8 >= 0; var8 -= 2) {
								var6[var8 / 2] = (byte)field865[var8 + Class80.field1598];
								var7[var8 / 2] = (byte)field865[1 + Class80.field1598 + var8];
							}
						}
					} else {
						Class80.field1598 -= 2;
						var6 = new byte[]{(byte)field865[Class80.field1598]};
						var7 = new byte[]{(byte)field865[Class80.field1598 + 1]};
					}

					var8 = field865[--Class80.field1598] - 1;
					if (var8 >= 0 && var8 <= 9) {
						Class279.method5584(var5, var8, var6, var7);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfInfo(owner = "md", name = "ae", desc = "(Lnx;IIII)V", opaque = "10000537")
	public static void method6222(Class362 var0, int var1, int var2, int var3) {
		if (var0.field3948 == null) {
			throw new RuntimeException();
		} else {
			var0.field3948[var1] = var2;
			var0.field3892[var1] = var3;
		}
	}

	@ObfInfo(owner = "av", name = "ah", desc = "(ILdg;ZB)I", opaque = "1")
	public static int method305(int var0, Class85 var1, boolean var2) {
		Class362 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Client.field4644.method6417(field865[--Class80.field1598]);
		} else {
			var4 = var2 ? field869 : field204;
		}

		String var5 = field860[--Class80.field3328];
		int[] var6 = null;
		if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
			int var7 = field865[--Class80.field1598];
			if (var7 > 0) {
				for (var6 = new int[var7]; var7-- > 0; var6[var7] = field865[--Class80.field1598]) {
				}
			}

			var5 = var5.substring(0, var5.length() - 1);
		}

		Object[] var10 = new Object[var5.length() + 1];

		int var8;
		for (var8 = var10.length - 1; var8 >= 1; --var8) {
			if (var5.charAt(var8 - 1) == 's') {
				var10[var8] = field860[--Class80.field3328];
			} else {
				var10[var8] = new Integer(field865[--Class80.field1598]);
			}
		}

		var8 = field865[--Class80.field1598];
		if (var8 != -1) {
			var10[0] = new Integer(var8);
		} else {
			var10 = null;
		}

		if (var0 == 1400) {
			var4.field3933 = var10;
		} else if (var0 == 1401) {
			var4.field3905 = var10;
		} else if (var0 == 1402) {
			var4.field3904 = var10;
		} else if (var0 == 1403) {
			var4.field3939 = var10;
		} else if (var0 == 1404) {
			var4.field3908 = var10;
		} else if (var0 == 1405) {
			var4.field3890 = var10;
		} else if (var0 == 1406) {
			var4.field3912 = var10;
		} else if (var0 == 1407) {
			var4.field3913 = var10;
			var4.field3885 = var6;
		} else if (var0 == 1408) {
			var4.field3947 = var10;
		} else if (var0 == 1409) {
			var4.field3920 = var10;
		} else if (var0 == 1410) {
			var4.field3910 = var10;
		} else if (var0 == 1411) {
			var4.field3903 = var10;
		} else if (var0 == 1412) {
			var4.field3819 = var10;
		} else if (var0 == 1414) {
			var4.field3915 = var10;
			var4.field3916 = var6;
		} else if (var0 == 1415) {
			var4.field3917 = var10;
			var4.field3954 = var6;
		} else if (var0 == 1416) {
			var4.field3871 = var10;
		} else if (var0 == 1417) {
			var4.field3922 = var10;
		} else if (var0 == 1418) {
			var4.field3923 = var10;
		} else if (var0 == 1419) {
			var4.field3813 = var10;
		} else if (var0 == 1420) {
			var4.field3927 = var10;
		} else if (var0 == 1421) {
			var4.field3884 = var10;
		} else if (var0 == 1422) {
			var4.field3931 = var10;
		} else if (var0 == 1423) {
			var4.field3932 = var10;
		} else if (var0 == 1424) {
			var4.field3834 = var10;
		} else if (var0 == 1425) {
			var4.field3935 = var10;
		} else if (var0 == 1426) {
			var4.field3936 = var10;
		} else if (var0 == 1427) {
			var4.field3934 = var10;
		} else if (var0 == 1428) {
			var4.field3929 = var10;
		} else if (var0 == 1429) {
			var4.field3847 = var10;
		} else if (var0 == 1430) {
			var4.field3822 = var10;
		} else if (var0 == 1431) {
			var4.field3811 = var10;
		} else if (var0 == 1434) {
			var4.field3937 = var10;
		} else if (var0 == 1435) {
			var4.field3921 = var10;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			Class342 var9 = var4.method6657();
			if (var9 != null) {
				if (var0 == 1436) {
					var9.field3713 = var10;
				} else if (var0 == 1437) {
					var9.field3708 = var10;
				} else if (var0 == 1438) {
					var9.field3714 = var10;
				} else if (var0 == 1439) {
					var9.field3711 = var10;
				}
			}
		}

		var4.field3900 = true;
		return 1;
	}

	@ObfInfo(owner = "go", name = "az", desc = "(ILdg;ZI)I", opaque = "-54379499")
	public static int method3543(int var0, Class85 var1, boolean var2) {
		Class362 var4 = var2 ? field869 : field204;
		if (var0 == 1500) {
			field865[++Class80.field1598 - 1] = var4.field3826;
			return 1;
		} else if (var0 == 1501) {
			field865[++Class80.field1598 - 1] = var4.field3827;
			return 1;
		} else if (var0 == 1502) {
			field865[++Class80.field1598 - 1] = var4.field3828;
			return 1;
		} else if (var0 == 1503) {
			field865[++Class80.field1598 - 1] = var4.field3829;
			return 1;
		} else if (var0 == 1504) {
			field865[++Class80.field1598 - 1] = var4.field3833 ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			field865[++Class80.field1598 - 1] = var4.field3832;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "ml", name = "ax", desc = "(ILdg;ZI)I", opaque = "-221633474")
	public static int method6320(int var0, Class85 var1, boolean var2) {
		Class362 var4 = var2 ? field869 : field204;
		if (var0 == 1600) {
			field865[++Class80.field1598 - 1] = var4.field3958;
			return 1;
		} else if (var0 == 1601) {
			field865[++Class80.field1598 - 1] = var4.field3835;
			return 1;
		} else {
			Class363 var8;
			if (var0 == 1602) {
				if (12 == var4.field3815) {
					var8 = var4.method6756();
					if (var8 != null) {
						field860[++Class80.field3328 - 1] = var8.method6822().method7876();
						return 1;
					}
				}

				field860[++Class80.field3328 - 1] = var4.field3876;
				return 1;
			} else if (var0 == 1603) {
				field865[++Class80.field1598 - 1] = var4.field3836;
				return 1;
			} else if (var0 == 1604) {
				field865[++Class80.field1598 - 1] = var4.field3837;
				return 1;
			} else if (var0 == 1605) {
				field865[++Class80.field1598 - 1] = var4.field3868;
				return 1;
			} else if (var0 == 1606) {
				field865[++Class80.field1598 - 1] = var4.field3865;
				return 1;
			} else if (var0 == 1607) {
				field865[++Class80.field1598 - 1] = var4.field3867;
				return 1;
			} else if (var0 == 1608) {
				field865[++Class80.field1598 - 1] = var4.field3866;
				return 1;
			} else if (var0 == 1609) {
				field865[++Class80.field1598 - 1] = var4.field3844;
				return 1;
			} else if (var0 == 1610) {
				field865[++Class80.field1598 - 1] = var4.field3845;
				return 1;
			} else if (var0 == 1611) {
				field865[++Class80.field1598 - 1] = var4.field3894;
				return 1;
			} else if (var0 == 1612) {
				field865[++Class80.field1598 - 1] = var4.field3839;
				return 1;
			} else if (var0 == 1613) {
				field865[++Class80.field1598 - 1] = var4.field3930.method129();
				return 1;
			} else if (var0 == 1614) {
				field865[++Class80.field1598 - 1] = var4.field3838 ? 1 : 0;
				return 1;
			} else {
				Class359 var5;
				if (var0 == 1617) {
					var5 = var4.method6655();
					field865[++Class80.field1598 - 1] = var5 != null ? var5.field3790 : 0;
				}

				if (var0 == 1618) {
					var5 = var4.method6655();
					field865[++Class80.field1598 - 1] = var5 != null ? var5.field3789 : 0;
					return 1;
				} else if (var0 == 1619) {
					var8 = var4.method6756();
					field860[++Class80.field3328 - 1] = var8 != null ? var8.method6865().method7876() : "";
					return 1;
				} else if (var0 == 1620) {
					var5 = var4.method6655();
					field865[++Class80.field1598 - 1] = var5 != null ? var5.field3788 : 0;
					return 1;
				} else if (var0 == 1621) {
					var8 = var4.method6756();
					field865[++Class80.field1598 - 1] = var8 != null ? var8.method6833() : 0;
					return 1;
				} else if (var0 == 1622) {
					var8 = var4.method6756();
					field865[++Class80.field1598 - 1] = var8 != null ? var8.method6834() : 0;
					return 1;
				} else if (var0 == 1623) {
					var8 = var4.method6756();
					field865[++Class80.field1598 - 1] = var8 != null ? var8.method6835() : 0;
					return 1;
				} else if (var0 == 1624) {
					var8 = var4.method6756();
					field865[++Class80.field1598 - 1] = var8 != null && var8.method6825() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var8 = var4.method6756();
						field860[++Class80.field3328 - 1] = var8 != null ? var8.method6987().method8087() : "";
						return 1;
					} else if (var0 == 1627) {
						var8 = var4.method6756();
						int var6 = var8 != null ? var8.method6829() : 0;
						int var7 = var8 != null ? var8.method6969() : 0;
						field865[++Class80.field1598 - 1] = Math.min(var6, var7);
						field865[++Class80.field1598 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 1628) {
						var8 = var4.method6756();
						field865[++Class80.field1598 - 1] = var8 != null ? var8.method6969() : 0;
						return 1;
					} else if (var0 == 1629) {
						var8 = var4.method6756();
						field865[++Class80.field1598 - 1] = var8 != null ? var8.method6837() : 0;
						return 1;
					} else if (var0 == 1630) {
						var8 = var4.method6756();
						field865[++Class80.field1598 - 1] = var8 != null ? var8.method6974() : 0;
						return 1;
					} else if (var0 == 1631) {
						var8 = var4.method6756();
						field865[++Class80.field1598 - 1] = var8 != null ? var8.method6838() : 0;
						return 1;
					} else if (var0 == 1632) {
						var8 = var4.method6756();
						field865[++Class80.field1598 - 1] = var8 != null ? var8.method7020() : 0;
						return 1;
					} else {
						Class36 var9;
						if (var0 == 1633) {
							var9 = var4.method6705();
							field865[Class80.field1598 - 1] = var9 != null ? var9.method497(field865[Class80.field1598 - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var9 = var4.method6705();
							field865[Class80.field1598 - 1] = var9 != null ? var9.method488((char)field865[Class80.field1598 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method6756();
					field865[++Class80.field1598 - 1] = var8 != null && var8.method6826() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfInfo(owner = "dc", name = "ac", desc = "(ILdg;ZB)I", opaque = "23")
	public static int method2301(int var0, Class85 var1, boolean var2) {
		Class362 var4 = var2 ? field869 : field204;
		if (var0 == 1700) {
			field865[++Class80.field1598 - 1] = var4.field3946;
			return 1;
		} else if (var0 == 1701) {
			if (var4.field3946 != -1) {
				field865[++Class80.field1598 - 1] = var4.field3919;
			} else {
				field865[++Class80.field1598 - 1] = 0;
			}

			return 1;
		} else if (var0 == 1702) {
			field865[++Class80.field1598 - 1] = var4.field3851;
			return 1;
		} else if (var0 == 1707) {
			field865[++Class80.field1598 - 1] = var4.method6714() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return method6323(var4);
		} else {
			return var0 == 1709 ? method6568(var4) : 2;
		}
	}

	@ObfInfo(owner = "mn", name = "al", desc = "(Lnx;B)I", opaque = "-1")
	public static int method6323(Class362 var0) {
		if (11 != var0.field3815) {
			--Class80.field3328;
			field865[++Class80.field1598 - 1] = -1;
			return 1;
		} else {
			String var2 = field860[--Class80.field3328];
			field865[++Class80.field1598 - 1] = var0.method6644(var2);
			return 1;
		}
	}

	@ObfInfo(owner = "np", name = "ay", desc = "(Lnx;I)I", opaque = "-407252154")
	public static int method6568(Class362 var0) {
		if (var0.field3815 != 11) {
			field860[Class80.field3328 - 1] = "";
			return 1;
		} else {
			String var2 = field860[--Class80.field3328];
			field860[++Class80.field3328 - 1] = var0.method6707(var2);
			return 1;
		}
	}

	@ObfInfo(owner = "lr", name = "aa", desc = "(ILdg;ZB)I", opaque = "0")
	public static int method5851(int var0, Class85 var1, boolean var2) {
		Class362 var4;
		if (var0 != 1927 && var0 != 2927) {
			int var9;
			if (var0 == 1928) {
				var4 = var2 ? field869 : field204;
				var9 = field865[--Class80.field1598];
				if (var9 >= 1 && var9 <= 10) {
					Class123 var10 = new Class123(var9, var4.field3812, var4.field3851, var4.field3946);
					field863.add(var10);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				Class80.field1598 -= 3;
				int var8 = field865[Class80.field1598];
				var9 = field865[1 + Class80.field1598];
				int var6 = field865[2 + Class80.field1598];
				if (var6 >= 1 && var6 <= 10) {
					Class123 var7 = new Class123(var6, var8, var9, Client.field4644.method6417(var8).field3946);
					field863.add(var7);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (field875 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var4 = Client.field4644.method6417(field865[--Class80.field1598]);
			} else {
				var4 = var2 ? field869 : field204;
			}

			if (var4.field3934 == null) {
				return 0;
			} else {
				Class99 var5 = new Class99();
				var5.field1215 = var4;
				var5.field1217 = var4.field3934;
				var5.field1220 = field875 + 1;
				Client.field740.method7506(var5);
				return 1;
			}
		}
	}

	@ObfInfo(owner = "aa", name = "as", desc = "(ILdg;ZI)I", opaque = "1114547636")
	public static int method1(int var0, Class85 var1, boolean var2) {
		Class362 var4 = Client.field4644.method6417(field865[--Class80.field1598]);
		if (var0 == 2500) {
			field865[++Class80.field1598 - 1] = var4.field3826;
			return 1;
		} else if (var0 == 2501) {
			field865[++Class80.field1598 - 1] = var4.field3827;
			return 1;
		} else if (var0 == 2502) {
			field865[++Class80.field1598 - 1] = var4.field3828;
			return 1;
		} else if (var0 == 2503) {
			field865[++Class80.field1598 - 1] = var4.field3829;
			return 1;
		} else if (var0 == 2504) {
			field865[++Class80.field1598 - 1] = var4.field3833 ? 1 : 0;
			return 1;
		} else if (var0 == 2505) {
			field865[++Class80.field1598 - 1] = var4.field3832;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "dc", name = "aw", desc = "(ILdg;ZB)I", opaque = "0")
	public static int method2300(int var0, Class85 var1, boolean var2) {
		Class362 var4 = Client.field4644.method6417(field865[--Class80.field1598]);
		if (var0 == 2600) {
			field865[++Class80.field1598 - 1] = var4.field3958;
			return 1;
		} else if (var0 == 2601) {
			field865[++Class80.field1598 - 1] = var4.field3835;
			return 1;
		} else if (var0 == 2602) {
			field860[++Class80.field3328 - 1] = var4.field3876;
			return 1;
		} else if (var0 == 2603) {
			field865[++Class80.field1598 - 1] = var4.field3836;
			return 1;
		} else if (var0 == 2604) {
			field865[++Class80.field1598 - 1] = var4.field3837;
			return 1;
		} else if (var0 == 2605) {
			field865[++Class80.field1598 - 1] = var4.field3868;
			return 1;
		} else if (var0 == 2606) {
			field865[++Class80.field1598 - 1] = var4.field3865;
			return 1;
		} else if (var0 == 2607) {
			field865[++Class80.field1598 - 1] = var4.field3867;
			return 1;
		} else if (var0 == 2608) {
			field865[++Class80.field1598 - 1] = var4.field3866;
			return 1;
		} else if (var0 == 2609) {
			field865[++Class80.field1598 - 1] = var4.field3844;
			return 1;
		} else if (var0 == 2610) {
			field865[++Class80.field1598 - 1] = var4.field3845;
			return 1;
		} else if (var0 == 2611) {
			field865[++Class80.field1598 - 1] = var4.field3894;
			return 1;
		} else if (var0 == 2612) {
			field865[++Class80.field1598 - 1] = var4.field3839;
			return 1;
		} else if (var0 == 2613) {
			field865[++Class80.field1598 - 1] = var4.field3930.method129();
			return 1;
		} else if (var0 == 2614) {
			field865[++Class80.field1598 - 1] = var4.field3838 ? 1 : 0;
			return 1;
		} else {
			Class359 var5;
			if (var0 == 2617) {
				var5 = var4.method6655();
				field865[++Class80.field1598 - 1] = var5 != null ? var5.field3790 : 0;
			}

			if (var0 == 2618) {
				var5 = var4.method6655();
				field865[++Class80.field1598 - 1] = var5 != null ? var5.field3789 : 0;
				return 1;
			} else {
				Class363 var8;
				if (var0 == 2619) {
					var8 = var4.method6756();
					field860[++Class80.field3328 - 1] = var8 != null ? var8.method6865().method7876() : "";
					return 1;
				} else if (var0 == 2620) {
					var5 = var4.method6655();
					field865[++Class80.field1598 - 1] = var5 != null ? var5.field3788 : 0;
					return 1;
				} else if (var0 == 2621) {
					var8 = var4.method6756();
					field865[++Class80.field1598 - 1] = var8 != null ? var8.method6833() : 0;
					return 1;
				} else if (var0 == 2622) {
					var8 = var4.method6756();
					field865[++Class80.field1598 - 1] = var8 != null ? var8.method6834() : 0;
					return 1;
				} else if (var0 == 2623) {
					var8 = var4.method6756();
					field865[++Class80.field1598 - 1] = var8 != null ? var8.method6835() : 0;
					return 1;
				} else if (var0 == 2624) {
					var8 = var4.method6756();
					field865[++Class80.field1598 - 1] = var8 != null && var8.method6825() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var8 = var4.method6756();
						field860[++Class80.field3328 - 1] = var8 != null ? var8.method6987().method8087() : "";
						return 1;
					} else if (var0 == 2627) {
						var8 = var4.method6756();
						int var6 = var8 != null ? var8.method6829() : 0;
						int var7 = var8 != null ? var8.method6969() : 0;
						field865[++Class80.field1598 - 1] = Math.min(var6, var7);
						field865[++Class80.field1598 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 2628) {
						var8 = var4.method6756();
						field865[++Class80.field1598 - 1] = var8 != null ? var8.method6969() : 0;
						return 1;
					} else if (var0 == 2629) {
						var8 = var4.method6756();
						field865[++Class80.field1598 - 1] = var8 != null ? var8.method6837() : 0;
						return 1;
					} else if (var0 == 2630) {
						var8 = var4.method6756();
						field865[++Class80.field1598 - 1] = var8 != null ? var8.method6974() : 0;
						return 1;
					} else if (var0 == 2631) {
						var8 = var4.method6756();
						field865[++Class80.field1598 - 1] = var8 != null ? var8.method6838() : 0;
						return 1;
					} else if (var0 == 2632) {
						var8 = var4.method6756();
						field865[++Class80.field1598 - 1] = var8 != null ? var8.method7020() : 0;
						return 1;
					} else {
						Class36 var9;
						if (var0 == 2633) {
							var9 = var4.method6705();
							field865[Class80.field1598 - 1] = var9 != null ? var9.method497(field865[Class80.field1598 - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var9 = var4.method6705();
							field865[Class80.field1598 - 1] = var9 != null ? var9.method488((char)field865[Class80.field1598 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method6756();
					field865[++Class80.field1598 - 1] = var8 != null && var8.method6826() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfInfo(owner = "mi", name = "at", desc = "(ILdg;ZB)I", opaque = "-1")
	public static int method6283(int var0, Class85 var1, boolean var2) {
		Class362 var4;
		if (var0 == 2700) {
			var4 = Client.field4644.method6417(field865[--Class80.field1598]);
			field865[++Class80.field1598 - 1] = var4.field3946;
			return 1;
		} else if (var0 == 2701) {
			var4 = Client.field4644.method6417(field865[--Class80.field1598]);
			if (-1 != var4.field3946) {
				field865[++Class80.field1598 - 1] = var4.field3919;
			} else {
				field865[++Class80.field1598 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2702) {
			int var6 = field865[--Class80.field1598];
			Class100 var5 = (Class100)Client.field698.method9439((long)var6);
			if (var5 != null) {
				field865[++Class80.field1598 - 1] = 1;
			} else {
				field865[++Class80.field1598 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2706) {
			field865[++Class80.field1598 - 1] = Client.field592;
			return 1;
		} else if (var0 == 2707) {
			var4 = Client.field4644.method6417(field865[--Class80.field1598]);
			field865[++Class80.field1598 - 1] = var4.method6714() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var4 = Client.field4644.method6417(field865[--Class80.field1598]);
			return method6323(var4);
		} else if (var0 == 2709) {
			var4 = Client.field4644.method6417(field865[--Class80.field1598]);
			return method6568(var4);
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "ot", name = "am", desc = "(ILdg;ZI)I", opaque = "1858169972")
	public static int method7239(int var0, Class85 var1, boolean var2) {
		String var14;
		if (var0 == 3100) {
			var14 = field860[--Class80.field3328];
			Class115.method3716(0, "", var14);
			return 1;
		} else if (var0 == 3101) {
			Class80.field1598 -= 2;
			Class6.method71(Client.field170, field865[Class80.field1598], field865[1 + Class80.field1598]);
			return 1;
		} else if (var0 == 3103) {
			if (!field873) {
				field866 = true;
			}

			return 1;
		} else {
			int var11;
			if (var0 == 3104) {
				var14 = field860[--Class80.field3328];
				var11 = 0;
				if (Class86.method2366(var14)) {
					var11 = Class413.method7482(var14);
				}

				Class314 var15 = Class168.method3523(Class321.field3362, Client.field678.field1482);
				var15.field3270.method9812(var11);
				Client.field678.method3013(var15);
				return 1;
			} else {
				Class314 var9;
				if (var0 == 3105) {
					var14 = field860[--Class80.field3328];
					var9 = Class168.method3523(Class321.field3384, Client.field678.field1482);
					var9.field3270.method9809(var14.length() + 1);
					var9.field3270.method9816(var14);
					Client.field678.method3013(var9);
					return 1;
				} else if (var0 == 3106) {
					var14 = field860[--Class80.field3328];
					var9 = Class168.method3523(Class321.field3356, Client.field678.field1482);
					var9.field3270.method9809(var14.length() + 1);
					var9.field3270.method9816(var14);
					Client.field678.method3013(var9);
					return 1;
				} else {
					int var4;
					String var5;
					if (var0 == 3107) {
						var4 = field865[--Class80.field1598];
						var5 = field860[--Class80.field3328];
						Class30.method436(var4, var5);
						return 1;
					} else if (var0 == 3108) {
						Class80.field1598 -= 3;
						var4 = field865[Class80.field1598];
						var11 = field865[1 + Class80.field1598];
						int var13 = field865[Class80.field1598 + 2];
						Class362 var16 = Client.field4644.method6417(var13);
						Class42.method596(var16, var4, var11);
						return 1;
					} else if (var0 == 3109) {
						Class80.field1598 -= 2;
						var4 = field865[Class80.field1598];
						var11 = field865[1 + Class80.field1598];
						Class362 var12 = var2 ? field869 : field204;
						Class42.method596(var12, var4, var11);
						return 1;
					} else if (var0 == 3110) {
						Client.field911 = field865[--Class80.field1598] == 1;
						return 1;
					} else if (var0 == 3111) {
						field865[++Class80.field1598 - 1] = Client.field1474.method2554() ? 1 : 0;
						return 1;
					} else if (var0 == 3112) {
						Client.field1474.method2462(field865[--Class80.field1598] == 1);
						return 1;
					} else if (var0 == 3113) {
						var14 = field860[--Class80.field3328];
						boolean var10 = field865[--Class80.field1598] == 1;
						Class35.method8133(var14, var10, false);
						return 1;
					} else if (var0 == 3115) {
						var4 = field865[--Class80.field1598];
						var9 = Class168.method3523(Class321.field3412, Client.field678.field1482);
						var9.field3270.method9810(var4);
						Client.field678.method3013(var9);
						return 1;
					} else if (var0 == 3116) {
						var4 = field865[--Class80.field1598];
						Class80.field3328 -= 2;
						var5 = field860[Class80.field3328];
						String var6 = field860[1 + Class80.field3328];
						if (var5.length() > 500) {
							return 1;
						} else if (var6.length() > 500) {
							return 1;
						} else {
							Class314 var7 = Class168.method3523(Class321.field3402, Client.field678.field1482);
							var7.field3270.method9810(Class562.method2698(var5) + 1 + Class562.method2698(var6));
							var7.field3270.method9816(var5);
							var7.field3270.method9809(var4);
							var7.field3270.method9816(var6);
							Client.field678.method3013(var7);
							return 1;
						}
					} else if (var0 == 3117) {
						--Class80.field1598;
						return 1;
					} else if (var0 == 3118) {
						Client.field621 = field865[--Class80.field1598] == 1;
						return 1;
					} else if (var0 == 3119) {
						Client.field577 = field865[--Class80.field1598] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (field865[--Class80.field1598] == 1) {
							Client.field659 |= 1;
						} else {
							Client.field659 &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (field865[--Class80.field1598] == 1) {
							Client.field659 |= 2;
						} else {
							Client.field659 &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (field865[--Class80.field1598] == 1) {
							Client.field659 |= 4;
						} else {
							Client.field659 &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (field865[--Class80.field1598] == 1) {
							Client.field659 |= 8;
						} else {
							Client.field659 &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.field659 = 0;
						return 1;
					} else if (var0 == 3125) {
						Client.field650 = field865[--Class80.field1598] == 1;
						return 1;
					} else if (var0 == 3126) {
						Client.field652 = field865[--Class80.field1598] == 1;
						return 1;
					} else if (var0 == 3127) {
						Class384.method7240(field865[--Class80.field1598] == 1);
						return 1;
					} else if (var0 == 3128) {
						field865[++Class80.field1598 - 1] = Client.method276() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						Class80.field1598 -= 2;
						Client.field625 = field865[Class80.field1598];
						Client.field774 = field865[1 + Class80.field1598];
						return 1;
					} else if (var0 == 3130) {
						Class80.field1598 -= 2;
						return 1;
					} else if (var0 == 3131) {
						--Class80.field1598;
						return 1;
					} else if (var0 == 3132) {
						field865[++Class80.field1598 - 1] = Client.field954;
						field865[++Class80.field1598 - 1] = Client.field15;
						return 1;
					} else if (var0 == 3133) {
						--Class80.field1598;
						return 1;
					} else if (var0 == 3134) {
						return 1;
					} else if (var0 == 3135) {
						Class80.field1598 -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field699 = 3;
						Client.field530 = field865[--Class80.field1598];
						return 1;
					} else if (var0 == 3137) {
						Client.field699 = 2;
						Client.field530 = field865[--Class80.field1598];
						return 1;
					} else if (var0 == 3138) {
						Client.field699 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field699 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field699 = 3;
						Client.field530 = var2 ? field869.field3812 : field204.field3812;
						return 1;
					} else {
						boolean var8;
						if (var0 == 3141) {
							var8 = field865[--Class80.field1598] == 1;
							Client.field1474.method2520(var8);
							return 1;
						} else if (var0 == 3142) {
							field865[++Class80.field1598 - 1] = Client.field1474.method2562() ? 1 : 0;
							return 1;
						} else if (var0 == 3143) {
							var8 = field865[--Class80.field1598] == 1;
							Client.field583 = var8;
							if (!var8) {
								Client.field1474.method2481("");
							}

							return 1;
						} else if (var0 == 3144) {
							field865[++Class80.field1598 - 1] = Client.field583 ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == 3146) {
							var8 = field865[--Class80.field1598] == 1;
							Client.field1474.method2466(!var8);
							return 1;
						} else if (var0 == 3147) {
							field865[++Class80.field1598 - 1] = Client.field1474.method2492() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							field865[++Class80.field1598 - 1] = Class53.field349;
							return 1;
						} else if (var0 == 3154) {
							field865[++Class80.field1598 - 1] = Client.method8826();
							return 1;
						} else if (var0 == 3155) {
							--Class80.field3328;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							Class80.field1598 -= 2;
							return 1;
						} else if (var0 == 3158) {
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--Class80.field1598;
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--Class80.field1598;
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--Class80.field3328;
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--Class80.field1598;
							field860[++Class80.field3328 - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--Class80.field1598;
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							Class80.field1598 -= 2;
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							Class80.field1598 -= 2;
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							Class80.field1598 -= 2;
							field860[++Class80.field3328 - 1] = "";
							field860[++Class80.field3328 - 1] = "";
							field860[++Class80.field3328 - 1] = "";
							field860[++Class80.field3328 - 1] = "";
							field860[++Class80.field3328 - 1] = "";
							field860[++Class80.field3328 - 1] = "";
							field860[++Class80.field3328 - 1] = "";
							field860[++Class80.field3328 - 1] = "";
							field860[++Class80.field3328 - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--Class80.field1598;
							return 1;
						} else if (var0 == 3173) {
							--Class80.field1598;
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--Class80.field1598;
							return 1;
						} else if (var0 == 3175) {
							field865[++Class80.field1598 - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--Class80.field3328;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--Class80.field3328;
							return 1;
						} else if (var0 == 3181) {
							Client.method3553(field865[--Class80.field1598]);
							return 1;
						} else if (var0 == 3182) {
							field865[++Class80.field1598 - 1] = Client.method4783();
							return 1;
						} else if (var0 == 3185) {
							var4 = field865[--Class80.field1598];
							Client.field1474.method2491(var4);
							return 1;
						} else if (var0 == 3186) {
							var4 = Client.field1474.method2459();
							field865[++Class80.field1598 - 1] = var4;
							return 1;
						} else if (var0 == 3189) {
							var4 = field865[--Class80.field1598];
							Client.method3615(var4);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfInfo(owner = "cq", name = "ar", desc = "(ILdg;ZB)I", opaque = "5")
	public static int method1972(int var0, Class85 var1, boolean var2) {
		if (var0 == 3200) {
			Class80.field1598 -= 3;
			Client.method469(field865[Class80.field1598], field865[Class80.field1598 + 1], field865[Class80.field1598 + 2]);
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			int var13;
			int var16;
			if (var0 == 3201) {
				Class80.field1598 -= 5;
				var13 = field865[Class80.field1598];
				var16 = field865[1 + Class80.field1598];
				var6 = field865[2 + Class80.field1598];
				var7 = field865[Class80.field1598 + 3];
				var8 = field865[Class80.field1598 + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var13);
				Client.method8897(var15, var16, var6, var7, var8);
				return 1;
			} else if (var0 == 3202) {
				Class80.field1598 -= 2;
				Class88.method2389(field865[Class80.field1598], field865[Class80.field1598 + 1]);
				return 1;
			} else {
				Class79 var4;
				Class98 var5;
				String var12;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var11;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var13 = field865[--Class80.field1598];
							var16 = 0;
							Class79 var20 = (Class79)Class406.method4071(Class79.method142(), var13);
							if (var20 != null) {
								var16 = Class79.field971 != var20 ? 1 : 0;
							}

							field865[++Class80.field1598 - 1] = var16;
							return 1;
						} else if (var0 == 3218) {
							var13 = field865[--Class80.field1598];
							var16 = 0;
							Class98 var19 = (Class98)Class406.method4071(Class98.method2119(), var13);
							if (var19 != null) {
								var16 = Class98.field1204 != var19 ? 1 : 0;
							}

							field865[++Class80.field1598 - 1] = var16;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								Class80.field1598 -= 2;
								var13 = field865[Class80.field1598];
								var16 = field865[Class80.field1598 + 1];
								Class323.method3075(var13, var16);
								return 1;
							} else if (var0 == 3221) {
								Class80.field1598 -= 6;
								var13 = field865[Class80.field1598];
								var16 = field865[Class80.field1598 + 1];
								var6 = field865[Class80.field1598 + 2];
								var7 = field865[Class80.field1598 + 3];
								var8 = field865[Class80.field1598 + 4];
								int var9 = field865[5 + Class80.field1598];
								ArrayList var10 = new ArrayList();
								var10.add(var13);
								var10.add(var16);
								Client.method8897(var10, var6, var7, var8, var9);
								return 1;
							} else if (var0 == 3222) {
								Class80.field1598 -= 4;
								var13 = field865[Class80.field1598];
								var16 = field865[1 + Class80.field1598];
								var6 = field865[2 + Class80.field1598];
								var7 = field865[Class80.field1598 + 3];
								Class323.method3040(var13, var16, var6, var7);
								return 1;
							} else {
								return 2;
							}
						} else {
							var4 = Class79.field971;
							var5 = Class98.field1204;
							var11 = true;
							boolean var18 = true;
							if (var0 == 3217) {
								var8 = field865[--Class80.field1598];
								var4 = (Class79)Class406.method4071(Class79.method142(), var8);
								if (var4 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var8));
								}
							}

							if (var0 == 3219) {
								var8 = field865[--Class80.field1598];
								var5 = (Class98)Class406.method4071(Class98.method2119(), var8);
								if (var5 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var8));
								}
							}

							String var14;
							byte var17;
							if (Class98.field1204 == var5) {
								switch(var4.field963) {
								case 1:
								case 2:
								case 3:
									var17 = 0;
									var7 = 1;
									break;
								case 4:
									var17 = 0;
									var7 = Integer.MAX_VALUE;
									break;
								case 5:
									var17 = 0;
									var7 = 100;
									break;
								default:
									var14 = String.format("Unkown device option: %s.", var4.toString());
									throw new RuntimeException(var14);
								}
							} else {
								switch(var5.field1206) {
								case 1:
									var17 = 0;
									var7 = 1;
									break;
								case 2:
								case 3:
								case 4:
									var17 = 0;
									var7 = 100;
									break;
								default:
									var14 = String.format("Unkown game option: %s.", var5.toString());
									throw new RuntimeException(var14);
								}
							}

							field865[++Class80.field1598 - 1] = var17;
							field865[++Class80.field1598 - 1] = var7;
							return 1;
						}
					} else {
						var4 = Class79.field971;
						var5 = Class98.field1204;
						var11 = false;
						if (var0 == 3214) {
							var7 = field865[--Class80.field1598];
							var4 = (Class79)Class406.method4071(Class79.method142(), var7);
							if (var4 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var7));
							}
						}

						if (var0 == 3215) {
							var7 = field865[--Class80.field1598];
							var5 = (Class98)Class406.method4071(Class98.method2119(), var7);
							if (var5 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var7));
							}
						}

						if (var0 == 3210) {
							var7 = field865[--Class80.field1598];
							var4 = (Class79)Class406.method4071(Class79.method142(), var7);
							if (var4 == null) {
								var5 = (Class98)Class406.method4071(Class98.method2119(), var7);
								if (var5 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var7));
								}
							}
						} else if (var0 == 3182) {
							var4 = Class79.field968;
						} else if (var0 == 3204) {
							var5 = Class98.field1203;
						} else if (var0 == 3206) {
							var5 = Class98.field1201;
						} else if (var0 == 3208) {
							var5 = Class98.field1205;
						}

						if (Class98.field1204 == var5) {
							switch(var4.field963) {
							case 1:
								var6 = Client.field1474.method2562() ? 1 : 0;
								break;
							case 2:
								var6 = Client.field1474.method2492() ? 1 : 0;
								break;
							case 3:
								var6 = Client.field1474.method2470() ? 1 : 0;
								break;
							case 4:
								var6 = Client.field1474.method2471();
								break;
							case 5:
								var6 = Client.method4783();
								break;
							default:
								var12 = String.format("Unkown device option: %s.", var4.toString());
								throw new RuntimeException(var12);
							}
						} else {
							switch(var5.field1206) {
							case 1:
								var6 = Client.field1474.method2554() ? 1 : 0;
								break;
							case 2:
								var7 = Client.field1474.method2544();
								var6 = Math.round((float)(var7 * 100) / 255.0F);
								break;
							case 3:
								var7 = Client.field1474.method2478();
								var6 = Math.round((float)(var7 * 100) / 127.0F);
								break;
							case 4:
								var7 = Client.field1474.method2508();
								var6 = Math.round((float)(var7 * 100) / 127.0F);
								break;
							default:
								var12 = String.format("Unkown game option: %s.", var5.toString());
								throw new RuntimeException(var12);
							}
						}

						field865[++Class80.field1598 - 1] = var6;
						return 1;
					}
				} else {
					var4 = Class79.field971;
					var5 = Class98.field1204;
					var6 = field865[--Class80.field1598];
					if (var0 == 3212) {
						var7 = field865[--Class80.field1598];
						var4 = (Class79)Class406.method4071(Class79.method142(), var7);
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var7));
						}
					}

					if (var0 == 3213) {
						var7 = field865[--Class80.field1598];
						var5 = (Class98)Class406.method4071(Class98.method2119(), var7);
						if (var5 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var7));
						}
					}

					if (var0 == 3209) {
						var7 = field865[--Class80.field1598];
						var4 = (Class79)Class406.method4071(Class79.method142(), var7);
						if (var4 == null) {
							var5 = (Class98)Class406.method4071(Class98.method2119(), var7);
							if (var5 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var7));
							}
						}
					} else if (var0 == 3181) {
						var4 = Class79.field968;
					} else if (var0 == 3203) {
						var5 = Class98.field1203;
					} else if (var0 == 3205) {
						var5 = Class98.field1201;
					} else if (var0 == 3207) {
						var5 = Class98.field1205;
					}

					if (Class98.field1204 == var5) {
						switch(var4.field963) {
						case 1:
							Client.field1474.method2520(var6 == 1);
							break;
						case 2:
							Client.field1474.method2466(var6 == 1);
							break;
						case 3:
							Client.field1474.method2532(var6 == 1);
							break;
						case 4:
							if (var6 < 0) {
								var6 = 0;
							}

							Client.field1474.method2547(var6);
							break;
						case 5:
							Client.method3553(var6);
							break;
						default:
							var12 = String.format("Unkown device option: %s.", var4.toString());
							throw new RuntimeException(var12);
						}
					} else {
						switch(var5.field1206) {
						case 1:
							Client.field1474.method2462(var6 == 1);
							break;
						case 2:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 255) / 100.0F);
							Client.method2360(var7);
							break;
						case 3:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 127) / 100.0F);
							Client.method3006(var7);
							break;
						case 4:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 127) / 100.0F);
							Client.method3175(var7);
							break;
						default:
							var12 = String.format("Unkown game option: %s.", var5.toString());
							throw new RuntimeException(var12);
						}
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(owner = "fp", name = "bt", desc = "(ILdg;ZI)I", opaque = "1493718316")
	public static int method3192(int var0, Class85 var1, boolean var2) {
		if (var0 == 3300) {
			field865[++Class80.field1598 - 1] = Client.field541;
			return 1;
		} else {
			int var4;
			int var5;
			if (var0 == 3301) {
				Class80.field1598 -= 2;
				var4 = field865[Class80.field1598];
				var5 = field865[1 + Class80.field1598];
				field865[++Class80.field1598 - 1] = Class89.method3894(var4, var5);
				return 1;
			} else if (var0 == 3302) {
				Class80.field1598 -= 2;
				var4 = field865[Class80.field1598];
				var5 = field865[1 + Class80.field1598];
				field865[++Class80.field1598 - 1] = Class89.method476(var4, var5);
				return 1;
			} else if (var0 == 3303) {
				Class80.field1598 -= 2;
				var4 = field865[Class80.field1598];
				var5 = field865[Class80.field1598 + 1];
				field865[++Class80.field1598 - 1] = Class170.method3541(var4, var5);
				return 1;
			} else if (var0 == 3304) {
				var4 = field865[--Class80.field1598];
				field865[++Class80.field1598 - 1] = Class180.method5046(var4).field1901;
				return 1;
			} else if (var0 == 3305) {
				var4 = field865[--Class80.field1598];
				field865[++Class80.field1598 - 1] = Client.field629[var4];
				return 1;
			} else if (var0 == 3306) {
				var4 = field865[--Class80.field1598];
				field865[++Class80.field1598 - 1] = Client.field730[var4];
				return 1;
			} else if (var0 == 3307) {
				var4 = field865[--Class80.field1598];
				field865[++Class80.field1598 - 1] = Client.field669[var4];
				return 1;
			} else {
				int var6;
				if (var0 == 3308) {
					var4 = Client.field5093.field1016;
					var5 = Client.field5093.field1019 + (Client.field170.field1266 >> 7);
					var6 = (Client.field170.field1229 >> 7) + Client.field5093.field1021;
					field865[++Class80.field1598 - 1] = Class350.method6494(var4, var5, var6);
					return 1;
				} else if (var0 == 3309) {
					var4 = field865[--Class80.field1598];
					field865[++Class80.field1598 - 1] = Class350.method6502(var4);
					return 1;
				} else if (var0 == 3310) {
					var4 = field865[--Class80.field1598];
					field865[++Class80.field1598 - 1] = Class350.method6503(var4);
					return 1;
				} else if (var0 == 3311) {
					var4 = field865[--Class80.field1598];
					field865[++Class80.field1598 - 1] = Class350.method6508(var4);
					return 1;
				} else if (var0 == 3312) {
					field865[++Class80.field1598 - 1] = Client.field528 ? 1 : 0;
					return 1;
				} else if (var0 == 3313) {
					Class80.field1598 -= 2;
					var4 = field865[Class80.field1598] + 32768;
					var5 = field865[Class80.field1598 + 1];
					field865[++Class80.field1598 - 1] = Class89.method3894(var4, var5);
					return 1;
				} else if (var0 == 3314) {
					Class80.field1598 -= 2;
					var4 = field865[Class80.field1598] + 32768;
					var5 = field865[Class80.field1598 + 1];
					field865[++Class80.field1598 - 1] = Class89.method476(var4, var5);
					return 1;
				} else if (var0 == 3315) {
					Class80.field1598 -= 2;
					var4 = 32768 + field865[Class80.field1598];
					var5 = field865[Class80.field1598 + 1];
					field865[++Class80.field1598 - 1] = Class170.method3541(var4, var5);
					return 1;
				} else if (var0 == 3316) {
					if (Client.field705 >= 2) {
						field865[++Class80.field1598 - 1] = Client.field705;
					} else {
						field865[++Class80.field1598 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3317) {
					field865[++Class80.field1598 - 1] = Client.field549;
					return 1;
				} else if (var0 == 3318) {
					field865[++Class80.field1598 - 1] = Client.field525;
					return 1;
				} else if (var0 == 3321) {
					field865[++Class80.field1598 - 1] = Client.field703 / 100;
					return 1;
				} else if (var0 == 3322) {
					field865[++Class80.field1598 - 1] = Client.field704;
					return 1;
				} else if (var0 == 3323) {
					if (Client.field707) {
						field865[++Class80.field1598 - 1] = 1;
					} else {
						field865[++Class80.field1598 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3324) {
					field865[++Class80.field1598 - 1] = Client.field796;
					return 1;
				} else if (var0 == 3325) {
					Class80.field1598 -= 4;
					var4 = field865[Class80.field1598];
					var5 = field865[Class80.field1598 + 1];
					var6 = field865[Class80.field1598 + 2];
					int var7 = field865[Class80.field1598 + 3];
					int var8 = Class350.method6494(var6, var5, var7);
					field865[++Class80.field1598 - 1] = var8 + var4;
					return 1;
				} else if (var0 == 3326) {
					field865[++Class80.field1598 - 1] = Client.field545;
					return 1;
				} else if (var0 == 3327) {
					field865[++Class80.field1598 - 1] = Client.field833;
					return 1;
				} else if (var0 == 3331) {
					field865[++Class80.field1598 - 1] = Client.field703;
					return 1;
				} else if (var0 == 3332) {
					var4 = field865[--Class80.field1598];
					field865[++Class80.field1598 - 1] = Client.field801[var4];
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfInfo(owner = "od", name = "bj", desc = "(ILdg;ZI)I", opaque = "461416331")
	public static int method7053(int var0, Class85 var1, boolean var2) {
		int var4;
		int var5;
		int var7;
		if (var0 == 3400) {
			Class80.field1598 -= 2;
			var4 = field865[Class80.field1598];
			var5 = field865[1 + Class80.field1598];
			Class205 var11 = Class205.method7698(var4);
			if (var11.field2229 != 's') {
			}

			for (var7 = 0; var7 < var11.field2233; ++var7) {
				if (var11.field2227[var7] == var5) {
					field860[++Class80.field3328 - 1] = var11.field2235[var7];
					var11 = null;
					break;
				}
			}

			if (var11 != null) {
				field860[++Class80.field3328 - 1] = var11.field2230;
			}

			return 1;
		} else if (var0 != 3408) {
			if (var0 == 3411) {
				var4 = field865[--Class80.field1598];
				Class205 var10 = Class205.method7698(var4);
				field865[++Class80.field1598 - 1] = var10.method4009();
				return 1;
			} else {
				return 2;
			}
		} else {
			Class80.field1598 -= 4;
			var4 = field865[Class80.field1598];
			var5 = field865[1 + Class80.field1598];
			int var6 = field865[Class80.field1598 + 2];
			var7 = field865[3 + Class80.field1598];
			Class205 var8 = Class205.method7698(var6);
			if (var8.field2228 == var4 && var8.field2229 == var5) {
				for (int var9 = 0; var9 < var8.field2233; ++var9) {
					if (var8.field2227[var9] == var7) {
						if (var5 == 115) {
							field860[++Class80.field3328 - 1] = var8.field2235[var9];
						} else {
							field865[++Class80.field1598 - 1] = var8.field2226[var9];
						}

						var8 = null;
						break;
					}
				}

				if (var8 != null) {
					if (var5 == 115) {
						field860[++Class80.field3328 - 1] = var8.field2230;
					} else {
						field865[++Class80.field1598 - 1] = var8.field2231;
					}
				}

				return 1;
			} else {
				if (var5 == 115) {
					field860[++Class80.field3328 - 1] = Class367.field4306;
				} else {
					field865[++Class80.field1598 - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfInfo(owner = "km", name = "be", desc = "(ILdg;ZI)I", opaque = "144230853")
	public static int method5113(int var0, Class85 var1, boolean var2) {
		int var4;
		if (var0 == 3500) {
			var4 = field865[--Class80.field1598];
			field865[++Class80.field1598 - 1] = Client.field754.method4191(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var4 = field865[--Class80.field1598];
			field865[++Class80.field1598 - 1] = Client.field754.method4190(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var4 = field865[--Class80.field1598];
			field865[++Class80.field1598 - 1] = Client.field754.method4192(var4) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "ox", name = "bm", desc = "(ILdg;ZI)I", opaque = "2123126465")
	public static int method7269(int var0, Class85 var1, boolean var2) {
		if (var0 == 3600) {
			if (Client.field1585.field464 == 0) {
				field865[++Class80.field1598 - 1] = -2;
			} else if (1 == Client.field1585.field464) {
				field865[++Class80.field1598 - 1] = -1;
			} else {
				field865[++Class80.field1598 - 1] = Client.field1585.field465.method8582();
			}

			return 1;
		} else {
			int var4;
			if (var0 == 3601) {
				var4 = field865[--Class80.field1598];
				if (Client.field1585.method1209() && var4 >= 0 && var4 < Client.field1585.field465.method8582()) {
					Class456 var9 = (Class456)Client.field1585.field465.method8563(var4);
					field860[++Class80.field3328 - 1] = var9.method8694();
					field860[++Class80.field3328 - 1] = var9.method8695();
				} else {
					field860[++Class80.field3328 - 1] = "";
					field860[++Class80.field3328 - 1] = "";
				}

				return 1;
			} else if (var0 == 3602) {
				var4 = field865[--Class80.field1598];
				if (Client.field1585.method1209() && var4 >= 0 && var4 < Client.field1585.field465.method8582()) {
					field865[++Class80.field1598 - 1] = ((Class476)Client.field1585.field465.method8563(var4)).field4971;
				} else {
					field865[++Class80.field1598 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3603) {
				var4 = field865[--Class80.field1598];
				if (Client.field1585.method1209() && var4 >= 0 && var4 < Client.field1585.field465.method8582()) {
					field865[++Class80.field1598 - 1] = ((Class476)Client.field1585.field465.method8563(var4)).field4969;
				} else {
					field865[++Class80.field1598 - 1] = 0;
				}

				return 1;
			} else {
				String var10;
				if (var0 == 3604) {
					var10 = field860[--Class80.field3328];
					int var8 = field865[--Class80.field1598];
					Class61.method4216(var10, var8);
					return 1;
				} else if (var0 == 3605) {
					var10 = field860[--Class80.field3328];
					Client.field1585.method1270(var10);
					return 1;
				} else if (var0 == 3606) {
					var10 = field860[--Class80.field3328];
					Client.field1585.method1253(var10);
					return 1;
				} else if (var0 == 3607) {
					var10 = field860[--Class80.field3328];
					Client.field1585.method1218(var10);
					return 1;
				} else if (var0 == 3608) {
					var10 = field860[--Class80.field3328];
					boolean var7 = true;
					Client.field1585.method1215(var10, var7);
					return 1;
				} else if (var0 == 3609) {
					var10 = field860[--Class80.field3328];
					var10 = Client.method9264(var10);
					field865[++Class80.field1598 - 1] = Client.field1585.method1214(new Class561(var10, Client.field1066), false) ? 1 : 0;
					return 1;
				} else if (var0 == 3611) {
					if (Client.field883 != null) {
						field860[++Class80.field3328 - 1] = Client.field883.field4883;
					} else {
						field860[++Class80.field3328 - 1] = "";
					}

					return 1;
				} else if (var0 == 3612) {
					if (Client.field883 != null) {
						field865[++Class80.field1598 - 1] = Client.field883.method8582();
					} else {
						field865[++Class80.field1598 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3613) {
					var4 = field865[--Class80.field1598];
					if (Client.field883 != null && var4 < Client.field883.method8582()) {
						field860[++Class80.field3328 - 1] = Client.field883.method8563(var4).method8693().method9789();
					} else {
						field860[++Class80.field3328 - 1] = "";
					}

					return 1;
				} else if (var0 == 3614) {
					var4 = field865[--Class80.field1598];
					if (Client.field883 != null && var4 < Client.field883.method8582()) {
						field865[++Class80.field1598 - 1] = ((Class476)Client.field883.method8563(var4)).method8682();
					} else {
						field865[++Class80.field1598 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3615) {
					var4 = field865[--Class80.field1598];
					if (Client.field883 != null && var4 < Client.field883.method8582()) {
						field865[++Class80.field1598 - 1] = ((Class476)Client.field883.method8563(var4)).field4969;
					} else {
						field865[++Class80.field1598 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3616) {
					field865[++Class80.field1598 - 1] = Client.field883 != null ? Client.field883.field4882 : 0;
					return 1;
				} else if (var0 == 3617) {
					var10 = field860[--Class80.field3328];
					Client.method2938(var10);
					return 1;
				} else if (var0 == 3618) {
					field865[++Class80.field1598 - 1] = Client.field883 != null ? Client.field883.field4880 : 0;
					return 1;
				} else if (var0 == 3619) {
					var10 = field860[--Class80.field3328];
					Class432.method8038(var10);
					return 1;
				} else if (var0 == 3620) {
					Client.method2941();
					return 1;
				} else if (var0 == 3621) {
					if (!Client.field1585.method1209()) {
						field865[++Class80.field1598 - 1] = -1;
					} else {
						field865[++Class80.field1598 - 1] = Client.field1585.field463.method8582();
					}

					return 1;
				} else if (var0 == 3622) {
					var4 = field865[--Class80.field1598];
					if (Client.field1585.method1209() && var4 >= 0 && var4 < Client.field1585.field463.method8582()) {
						Class482 var5 = (Class482)Client.field1585.field463.method8563(var4);
						field860[++Class80.field3328 - 1] = var5.method8694();
						field860[++Class80.field3328 - 1] = var5.method8695();
					} else {
						field860[++Class80.field3328 - 1] = "";
						field860[++Class80.field3328 - 1] = "";
					}

					return 1;
				} else if (var0 == 3623) {
					var10 = field860[--Class80.field3328];
					var10 = Client.method9264(var10);
					field865[++Class80.field1598 - 1] = Client.field1585.method1232(new Class561(var10, Client.field1066)) ? 1 : 0;
					return 1;
				} else if (var0 == 3624) {
					var4 = field865[--Class80.field1598];
					if (Client.field883 != null && var4 < Client.field883.method8582() && Client.field883.method8563(var4).method8693().equals(Client.field170.field991)) {
						field865[++Class80.field1598 - 1] = 1;
					} else {
						field865[++Class80.field1598 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3625) {
					if (Client.field883 != null && Client.field883.field4881 != null) {
						field860[++Class80.field3328 - 1] = Client.field883.field4881;
					} else {
						field860[++Class80.field3328 - 1] = "";
					}

					return 1;
				} else if (var0 == 3626) {
					var4 = field865[--Class80.field1598];
					if (Client.field883 != null && var4 < Client.field883.method8582() && ((Class472)Client.field883.method8563(var4)).method8619()) {
						field865[++Class80.field1598 - 1] = 1;
					} else {
						field865[++Class80.field1598 - 1] = 0;
					}

					return 1;
				} else if (var0 != 3627) {
					if (var0 == 3628) {
						Client.field1585.field465.method8573();
						return 1;
					} else {
						boolean var6;
						if (var0 == 3629) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field465.method8604(new Class571(var6));
							return 1;
						} else if (var0 == 3630) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field465.method8604(new Class564(var6));
							return 1;
						} else if (var0 == 3631) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field465.method8604(new Class107(var6));
							return 1;
						} else if (var0 == 3632) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field465.method8604(new Class121(var6));
							return 1;
						} else if (var0 == 3633) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field465.method8604(new Class124(var6));
							return 1;
						} else if (var0 == 3634) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field465.method8604(new Class129(var6));
							return 1;
						} else if (var0 == 3635) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field465.method8604(new Class117(var6));
							return 1;
						} else if (var0 == 3636) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field465.method8604(new Class122(var6));
							return 1;
						} else if (var0 == 3637) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field465.method8604(new Class120(var6));
							return 1;
						} else if (var0 == 3638) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field465.method8604(new Class108(var6));
							return 1;
						} else if (var0 == 3639) {
							Client.field1585.field465.method8564();
							return 1;
						} else if (var0 == 3640) {
							Client.field1585.field463.method8573();
							return 1;
						} else if (var0 == 3641) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field463.method8604(new Class571(var6));
							return 1;
						} else if (var0 == 3642) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field463.method8604(new Class564(var6));
							return 1;
						} else if (var0 == 3643) {
							Client.field1585.field463.method8564();
							return 1;
						} else if (var0 == 3644) {
							if (Client.field883 != null) {
								Client.field883.method8573();
							}

							return 1;
						} else if (var0 == 3645) {
							var6 = field865[--Class80.field1598] == 1;
							if (Client.field883 != null) {
								Client.field883.method8604(new Class571(var6));
							}

							return 1;
						} else if (var0 == 3646) {
							var6 = field865[--Class80.field1598] == 1;
							if (Client.field883 != null) {
								Client.field883.method8604(new Class564(var6));
							}

							return 1;
						} else if (var0 == 3647) {
							var6 = field865[--Class80.field1598] == 1;
							if (Client.field883 != null) {
								Client.field883.method8604(new Class107(var6));
							}

							return 1;
						} else if (var0 == 3648) {
							var6 = field865[--Class80.field1598] == 1;
							if (Client.field883 != null) {
								Client.field883.method8604(new Class121(var6));
							}

							return 1;
						} else if (var0 == 3649) {
							var6 = field865[--Class80.field1598] == 1;
							if (Client.field883 != null) {
								Client.field883.method8604(new Class124(var6));
							}

							return 1;
						} else if (var0 == 3650) {
							var6 = field865[--Class80.field1598] == 1;
							if (Client.field883 != null) {
								Client.field883.method8604(new Class129(var6));
							}

							return 1;
						} else if (var0 == 3651) {
							var6 = field865[--Class80.field1598] == 1;
							if (Client.field883 != null) {
								Client.field883.method8604(new Class117(var6));
							}

							return 1;
						} else if (var0 == 3652) {
							var6 = field865[--Class80.field1598] == 1;
							if (Client.field883 != null) {
								Client.field883.method8604(new Class122(var6));
							}

							return 1;
						} else if (var0 == 3653) {
							var6 = field865[--Class80.field1598] == 1;
							if (Client.field883 != null) {
								Client.field883.method8604(new Class120(var6));
							}

							return 1;
						} else if (var0 == 3654) {
							var6 = field865[--Class80.field1598] == 1;
							if (Client.field883 != null) {
								Client.field883.method8604(new Class108(var6));
							}

							return 1;
						} else if (var0 == 3655) {
							if (Client.field883 != null) {
								Client.field883.method8564();
							}

							return 1;
						} else if (var0 == 3656) {
							var6 = field865[--Class80.field1598] == 1;
							Client.field1585.field465.method8604(new Class109(var6));
							return 1;
						} else if (var0 == 3657) {
							var6 = field865[--Class80.field1598] == 1;
							if (Client.field883 != null) {
								Client.field883.method8604(new Class109(var6));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = field865[--Class80.field1598];
					if (Client.field883 != null && var4 < Client.field883.method8582() && ((Class472)Client.field883.method8563(var4)).method8622()) {
						field865[++Class80.field1598 - 1] = 1;
					} else {
						field865[++Class80.field1598 - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(owner = "bs", name = "bo", desc = "(ILdg;ZI)I")
	public static int method787(int var0, Class85 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(owner = "gh", name = "bi", desc = "(ILdg;ZI)I", opaque = "1422529732")
	public static int method3415(int var0, Class85 var1, boolean var2) {
		if (var0 == 3800) {
			if (Client.field1685 != null) {
				field865[++Class80.field1598 - 1] = 1;
				field5362 = Client.field1685;
			} else {
				field865[++Class80.field1598 - 1] = 0;
			}

			return 1;
		} else {
			int var4;
			if (var0 == 3801) {
				var4 = field865[--Class80.field1598];
				if (Client.field771[var4] != null) {
					field865[++Class80.field1598 - 1] = 1;
					field5362 = Client.field771[var4];
				} else {
					field865[++Class80.field1598 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3802) {
				field860[++Class80.field3328 - 1] = field5362.field1835;
				return 1;
			} else if (var0 == 3803) {
				field865[++Class80.field1598 - 1] = field5362.field1836 ? 1 : 0;
				return 1;
			} else if (var0 == 3804) {
				field865[++Class80.field1598 - 1] = field5362.field1824;
				return 1;
			} else if (var0 == 3805) {
				field865[++Class80.field1598 - 1] = field5362.field1825;
				return 1;
			} else if (var0 == 3806) {
				field865[++Class80.field1598 - 1] = field5362.field1826;
				return 1;
			} else if (var0 == 3807) {
				field865[++Class80.field1598 - 1] = field5362.field1827;
				return 1;
			} else if (var0 == 3809) {
				field865[++Class80.field1598 - 1] = field5362.field1828;
				return 1;
			} else if (var0 == 3810) {
				var4 = field865[--Class80.field1598];
				field860[++Class80.field3328 - 1] = field5362.field1839[var4];
				return 1;
			} else if (var0 == 3811) {
				var4 = field865[--Class80.field1598];
				field865[++Class80.field1598 - 1] = field5362.field1830[var4];
				return 1;
			} else if (var0 == 3812) {
				field865[++Class80.field1598 - 1] = field5362.field1837;
				return 1;
			} else if (var0 == 3813) {
				var4 = field865[--Class80.field1598];
				field860[++Class80.field3328 - 1] = field5362.field1840[var4];
				return 1;
			} else {
				int var6;
				int var7;
				if (var0 == 3814) {
					Class80.field1598 -= 3;
					var4 = field865[Class80.field1598];
					var7 = field865[1 + Class80.field1598];
					var6 = field865[Class80.field1598 + 2];
					field865[++Class80.field1598 - 1] = field5362.method3457(var4, var7, var6);
					return 1;
				} else if (var0 == 3815) {
					field865[++Class80.field1598 - 1] = field5362.field1833;
					return 1;
				} else if (var0 == 3816) {
					field865[++Class80.field1598 - 1] = field5362.field1842;
					return 1;
				} else if (var0 == 3817) {
					field865[++Class80.field1598 - 1] = field5362.method3514(field860[--Class80.field3328]);
					return 1;
				} else if (var0 == 3818) {
					field865[Class80.field1598 - 1] = field5362.method3490()[field865[Class80.field1598 - 1]];
					return 1;
				} else if (var0 == 3819) {
					Class80.field1598 -= 2;
					var4 = field865[Class80.field1598];
					var7 = field865[Class80.field1598 + 1];
					Client.method5833(var7, var4);
					return 1;
				} else if (var0 == 3820) {
					var4 = field865[--Class80.field1598];
					field865[++Class80.field1598 - 1] = field5362.field1832[var4];
					return 1;
				} else {
					if (var0 == 3821) {
						Class80.field1598 -= 3;
						var4 = field865[Class80.field1598];
						boolean var5 = 1 == field865[1 + Class80.field1598];
						var6 = field865[2 + Class80.field1598];
						Client.method3060(var6, var4, var5);
					}

					if (var0 == 3822) {
						var4 = field865[--Class80.field1598];
						field865[++Class80.field1598 - 1] = field5362.field1834[var4] ? 1 : 0;
						return 1;
					} else if (var0 == 3850) {
						if (Client.field2773 != null) {
							field865[++Class80.field1598 - 1] = 1;
							field2183 = Client.field2773;
						} else {
							field865[++Class80.field1598 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3851) {
						var4 = field865[--Class80.field1598];
						if (Client.field772[var4] != null) {
							field865[++Class80.field1598 - 1] = 1;
							field2183 = Client.field772[var4];
							field5245 = var4;
						} else {
							field865[++Class80.field1598 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3852) {
						field860[++Class80.field3328 - 1] = field2183.field1813;
						return 1;
					} else if (var0 == 3853) {
						field865[++Class80.field1598 - 1] = field2183.field1806;
						return 1;
					} else if (var0 == 3854) {
						field865[++Class80.field1598 - 1] = field2183.field1812;
						return 1;
					} else if (var0 == 3855) {
						field865[++Class80.field1598 - 1] = field2183.method3445();
						return 1;
					} else if (var0 == 3856) {
						var4 = field865[--Class80.field1598];
						field860[++Class80.field3328 - 1] = ((Class131)field2183.field1808.get(var4)).field1528.method9789();
						return 1;
					} else if (var0 == 3857) {
						var4 = field865[--Class80.field1598];
						field865[++Class80.field1598 - 1] = ((Class131)field2183.field1808.get(var4)).field1530;
						return 1;
					} else if (var0 == 3858) {
						var4 = field865[--Class80.field1598];
						field865[++Class80.field1598 - 1] = ((Class131)field2183.field1808.get(var4)).field1527;
						return 1;
					} else if (var0 == 3859) {
						var4 = field865[--Class80.field1598];
						Client.method3039(field5245, var4);
						return 1;
					} else if (var0 == 3860) {
						field865[++Class80.field1598 - 1] = field2183.method3428(field860[--Class80.field3328]);
						return 1;
					} else if (var0 == 3861) {
						field865[Class80.field1598 - 1] = field2183.method3424()[field865[Class80.field1598 - 1]];
						return 1;
					} else if (var0 == 3890) {
						field865[++Class80.field1598 - 1] = Client.field1315 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfInfo(owner = "gv", name = "ba", desc = "(ILdg;ZI)I", opaque = "2064970127")
	public static int method3598(int var0, Class85 var1, boolean var2) {
		int var4;
		if (var0 == 3903) {
			var4 = field865[--Class80.field1598];
			field865[++Class80.field1598 - 1] = Client.field819[var4].method7541();
			return 1;
		} else if (var0 == 3904) {
			var4 = field865[--Class80.field1598];
			field865[++Class80.field1598 - 1] = Client.field819[var4].field4663;
			return 1;
		} else if (var0 == 3905) {
			var4 = field865[--Class80.field1598];
			field865[++Class80.field1598 - 1] = Client.field819[var4].field4662;
			return 1;
		} else if (var0 == 3906) {
			var4 = field865[--Class80.field1598];
			field865[++Class80.field1598 - 1] = Client.field819[var4].field4661;
			return 1;
		} else if (var0 == 3907) {
			var4 = field865[--Class80.field1598];
			field865[++Class80.field1598 - 1] = Client.field819[var4].field4664;
			return 1;
		} else if (var0 == 3908) {
			var4 = field865[--Class80.field1598];
			field865[++Class80.field1598 - 1] = Client.field819[var4].field4665;
			return 1;
		} else {
			int var14;
			if (var0 == 3910) {
				var4 = field865[--Class80.field1598];
				var14 = Client.field819[var4].method7540();
				field865[++Class80.field1598 - 1] = var14 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == 3911) {
				var4 = field865[--Class80.field1598];
				var14 = Client.field819[var4].method7540();
				field865[++Class80.field1598 - 1] = var14 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == 3912) {
				var4 = field865[--Class80.field1598];
				var14 = Client.field819[var4].method7540();
				field865[++Class80.field1598 - 1] = var14 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == 3913) {
				var4 = field865[--Class80.field1598];
				var14 = Client.field819[var4].method7540();
				field865[++Class80.field1598 - 1] = var14 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == 3914) {
					var12 = field865[--Class80.field1598] == 1;
					if (Client.field2533 != null) {
						Client.field2533.method7125(Class374.field4442, var12);
					}

					return 1;
				} else if (var0 == 3915) {
					var12 = field865[--Class80.field1598] == 1;
					if (Client.field2533 != null) {
						Client.field2533.method7125(Class374.field4441, var12);
					}

					return 1;
				} else if (var0 == 3916) {
					Class80.field1598 -= 2;
					var12 = 1 == field865[Class80.field1598];
					boolean var13 = 1 == field865[1 + Class80.field1598];
					if (Client.field2533 != null) {
						Client.field834.field878 = var13;
						Client.field2533.method7125(Client.field834, var12);
					}

					return 1;
				} else if (var0 == 3917) {
					var12 = field865[--Class80.field1598] == 1;
					if (Client.field2533 != null) {
						Client.field2533.method7125(Class374.field4440, var12);
					}

					return 1;
				} else if (var0 == 3918) {
					var12 = field865[--Class80.field1598] == 1;
					if (Client.field2533 != null) {
						Client.field2533.method7125(Class374.field4439, var12);
					}

					return 1;
				} else if (var0 == 3919) {
					field865[++Class80.field1598 - 1] = Client.field2533 == null ? 0 : Client.field2533.field4444.size();
					return 1;
				} else {
					Class403 var5;
					if (var0 == 3920) {
						var4 = field865[--Class80.field1598];
						var5 = (Class403)Client.field2533.field4444.get(var4);
						field865[++Class80.field1598 - 1] = var5.field4650;
						return 1;
					} else if (var0 == 3921) {
						var4 = field865[--Class80.field1598];
						var5 = (Class403)Client.field2533.field4444.get(var4);
						field860[++Class80.field3328 - 1] = var5.method7478();
						return 1;
					} else if (var0 == 3922) {
						var4 = field865[--Class80.field1598];
						var5 = (Class403)Client.field2533.field4444.get(var4);
						field860[++Class80.field3328 - 1] = var5.method7479();
						return 1;
					} else if (var0 == 3923) {
						var4 = field865[--Class80.field1598];
						var5 = (Class403)Client.field2533.field4444.get(var4);
						long var6 = Class329.method4953() - Client.field4967 - var5.field4648;
						int var8 = (int)(var6 / 3600000L);
						int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
						int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * 60000)) / 1000L);
						String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
						field860[++Class80.field3328 - 1] = var11;
						return 1;
					} else if (var0 == 3924) {
						var4 = field865[--Class80.field1598];
						var5 = (Class403)Client.field2533.field4444.get(var4);
						field865[++Class80.field1598 - 1] = var5.field4649.field4661;
						return 1;
					} else if (var0 == 3925) {
						var4 = field865[--Class80.field1598];
						var5 = (Class403)Client.field2533.field4444.get(var4);
						field865[++Class80.field1598 - 1] = var5.field4649.field4662;
						return 1;
					} else if (var0 == 3926) {
						var4 = field865[--Class80.field1598];
						var5 = (Class403)Client.field2533.field4444.get(var4);
						field865[++Class80.field1598 - 1] = var5.field4649.field4663;
						return 1;
					} else if (var0 == 3939) {
						var4 = field865[--Class80.field1598];
						field865[++Class80.field1598 - 1] = Class187.method3421(var4).field2058 ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfInfo(owner = "bn", name = "bg", desc = "(ILdg;ZI)I", opaque = "1898416425")
	public static int method571(int var0, Class85 var1, boolean var2) {
		int var5;
		int var10;
		if (var0 == 4000) {
			Class80.field1598 -= 2;
			var10 = field865[Class80.field1598];
			var5 = field865[Class80.field1598 + 1];
			field865[++Class80.field1598 - 1] = var5 + var10;
			return 1;
		} else if (var0 == 4001) {
			Class80.field1598 -= 2;
			var10 = field865[Class80.field1598];
			var5 = field865[Class80.field1598 + 1];
			field865[++Class80.field1598 - 1] = var10 - var5;
			return 1;
		} else if (var0 == 4002) {
			Class80.field1598 -= 2;
			var10 = field865[Class80.field1598];
			var5 = field865[Class80.field1598 + 1];
			field865[++Class80.field1598 - 1] = var5 * var10;
			return 1;
		} else if (var0 == 4003) {
			Class80.field1598 -= 2;
			var10 = field865[Class80.field1598];
			var5 = field865[Class80.field1598 + 1];
			field865[++Class80.field1598 - 1] = var10 / var5;
			return 1;
		} else if (var0 == 4004) {
			var10 = field865[--Class80.field1598];
			field865[++Class80.field1598 - 1] = (int)(Math.random() * (double)var10);
			return 1;
		} else if (var0 == 4005) {
			var10 = field865[--Class80.field1598];
			field865[++Class80.field1598 - 1] = (int)(Math.random() * (double)(var10 + 1));
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			if (var0 == 4006) {
				Class80.field1598 -= 5;
				var10 = field865[Class80.field1598];
				var5 = field865[Class80.field1598 + 1];
				var6 = field865[2 + Class80.field1598];
				var7 = field865[3 + Class80.field1598];
				var8 = field865[Class80.field1598 + 4];
				field865[++Class80.field1598 - 1] = (var5 - var10) * (var8 - var6) / (var7 - var6) + var10;
				return 1;
			} else if (var0 == 4007) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[1 + Class80.field1598];
				field865[++Class80.field1598 - 1] = var10 + var5 * var10 / 100;
				return 1;
			} else if (var0 == 4008) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[Class80.field1598 + 1];
				field865[++Class80.field1598 - 1] = var10 | 1 << var5;
				return 1;
			} else if (var0 == 4009) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[Class80.field1598 + 1];
				field865[++Class80.field1598 - 1] = var10 & -1 - (1 << var5);
				return 1;
			} else if (var0 == 4010) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[1 + Class80.field1598];
				field865[++Class80.field1598 - 1] = (var10 & 1 << var5) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == 4011) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[1 + Class80.field1598];
				field865[++Class80.field1598 - 1] = var10 % var5;
				return 1;
			} else if (var0 == 4012) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[Class80.field1598 + 1];
				if (var10 == 0) {
					field865[++Class80.field1598 - 1] = 0;
				} else {
					field865[++Class80.field1598 - 1] = (int)Math.pow((double)var10, (double)var5);
				}

				return 1;
			} else if (var0 == 4013) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[1 + Class80.field1598];
				if (var10 == 0) {
					field865[++Class80.field1598 - 1] = 0;
					return 1;
				} else {
					switch(var5) {
					case 0:
						field865[++Class80.field1598 - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						field865[++Class80.field1598 - 1] = var10;
						break;
					case 2:
						field865[++Class80.field1598 - 1] = (int)Math.sqrt((double)var10);
						break;
					case 3:
						field865[++Class80.field1598 - 1] = (int)Math.cbrt((double)var10);
						break;
					case 4:
						field865[++Class80.field1598 - 1] = (int)Math.sqrt(Math.sqrt((double)var10));
						break;
					default:
						field865[++Class80.field1598 - 1] = (int)Math.pow((double)var10, 1.0D / (double)var5);
					}

					return 1;
				}
			} else if (var0 == 4014) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[Class80.field1598 + 1];
				field865[++Class80.field1598 - 1] = var10 & var5;
				return 1;
			} else if (var0 == 4015) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[Class80.field1598 + 1];
				field865[++Class80.field1598 - 1] = var10 | var5;
				return 1;
			} else if (var0 == 4016) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[1 + Class80.field1598];
				field865[++Class80.field1598 - 1] = var10 < var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4017) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[Class80.field1598 + 1];
				field865[++Class80.field1598 - 1] = var10 > var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4018) {
				Class80.field1598 -= 3;
				long var11 = (long)field865[Class80.field1598];
				long var12 = (long)field865[1 + Class80.field1598];
				long var13 = (long)field865[Class80.field1598 + 2];
				field865[++Class80.field1598 - 1] = (int)(var11 * var13 / var12);
				return 1;
			} else if (var0 == 4025) {
				var10 = Class337.method2219(field865[--Class80.field1598]);
				field865[++Class80.field1598 - 1] = var10;
				return 1;
			} else if (var0 == 4026) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[Class80.field1598 + 1];
				field865[++Class80.field1598 - 1] = var10 ^ 1 << var5;
				return 1;
			} else if (var0 == 4027) {
				Class80.field1598 -= 3;
				var10 = field865[Class80.field1598];
				var5 = field865[1 + Class80.field1598];
				var6 = field865[Class80.field1598 + 2];
				field865[++Class80.field1598 - 1] = Class337.method3554(var10, var5, var6);
				return 1;
			} else if (var0 == 4028) {
				Class80.field1598 -= 3;
				var10 = field865[Class80.field1598];
				var5 = field865[1 + Class80.field1598];
				var6 = field865[Class80.field1598 + 2];
				field865[++Class80.field1598 - 1] = Class337.method215(var10, var5, var6);
				return 1;
			} else if (var0 == 4029) {
				Class80.field1598 -= 3;
				var10 = field865[Class80.field1598];
				var5 = field865[1 + Class80.field1598];
				var6 = field865[Class80.field1598 + 2];
				var7 = 31 - var6;
				field865[++Class80.field1598 - 1] = var10 << var7 >>> var7 + var5;
				return 1;
			} else if (var0 == 4030) {
				Class80.field1598 -= 4;
				var10 = field865[Class80.field1598];
				var5 = field865[1 + Class80.field1598];
				var6 = field865[Class80.field1598 + 2];
				var7 = field865[3 + Class80.field1598];
				var10 = Class337.method215(var10, var6, var7);
				var8 = Class337.method1146(1 + (var7 - var6));
				if (var5 > var8) {
					var5 = var8;
				}

				field865[++Class80.field1598 - 1] = var10 | var5 << var6;
				return 1;
			} else if (var0 == 4032) {
				field865[Class80.field1598 - 1] = Class503.method4076(field865[Class80.field1598 - 1]);
				return 1;
			} else if (var0 == 4033) {
				field865[Class80.field1598 - 1] = Class503.method144(field865[Class80.field1598 - 1]);
				return 1;
			} else if (var0 == 4034) {
				Class80.field1598 -= 2;
				var10 = field865[Class80.field1598];
				var5 = field865[1 + Class80.field1598];
				var6 = Class503.method6409(var10, var5);
				field865[++Class80.field1598 - 1] = var6;
				return 1;
			} else if (var0 == 4035) {
				field865[Class80.field1598 - 1] = Math.abs(field865[Class80.field1598 - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var4 = field860[--Class80.field3328];
				var5 = -1;
				if (Class86.method2366(var4)) {
					var5 = Class413.method7482(var4);
				}

				field865[++Class80.field1598 - 1] = var5;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfInfo(owner = "as", name = "bs", desc = "(ILdg;ZB)I", opaque = "1")
	public static int method275(int var0, Class85 var1, boolean var2) {
		String var4;
		int var10;
		if (var0 == 4100) {
			var4 = field860[--Class80.field3328];
			var10 = field865[--Class80.field1598];
			field860[++Class80.field3328 - 1] = var4 + var10;
			return 1;
		} else {
			String var5;
			if (var0 == 4101) {
				Class80.field3328 -= 2;
				var4 = field860[Class80.field3328];
				var5 = field860[1 + Class80.field3328];
				field860[++Class80.field3328 - 1] = var4 + var5;
				return 1;
			} else if (var0 == 4102) {
				var4 = field860[--Class80.field3328];
				var10 = field865[--Class80.field1598];
				field860[++Class80.field3328 - 1] = var4 + Class413.method3887(var10, true);
				return 1;
			} else if (var0 == 4103) {
				var4 = field860[--Class80.field3328];
				field860[++Class80.field3328 - 1] = var4.toLowerCase();
				return 1;
			} else {
				int var7;
				int var13;
				if (var0 == 4104) {
					var13 = field865[--Class80.field1598];
					long var16 = (11745L + (long)var13) * 86400000L;
					field870.setTime(new Date(var16));
					var7 = field870.get(5);
					int var18 = field870.get(2);
					int var9 = field870.get(1);
					field860[++Class80.field3328 - 1] = var7 + "-" + field871[var18] + "-" + var9;
					return 1;
				} else if (var0 != 4105) {
					if (var0 == 4106) {
						var13 = field865[--Class80.field1598];
						field860[++Class80.field3328 - 1] = Integer.toString(var13);
						return 1;
					} else if (var0 == 4107) {
						Class80.field3328 -= 2;
						field865[++Class80.field1598 - 1] = Class413.method4428(Class33.method449(field860[Class80.field3328], field860[Class80.field3328 + 1], Client.field1376));
						return 1;
					} else {
						int var12;
						byte[] var15;
						Class424 var17;
						if (var0 == 4108) {
							var4 = field860[--Class80.field3328];
							Class80.field1598 -= 2;
							var10 = field865[Class80.field1598];
							var12 = field865[Class80.field1598 + 1];
							var15 = Client.field1137.method7132(var12, 0);
							var17 = new Class424(var15);
							field865[++Class80.field1598 - 1] = var17.method8141(var4, var10);
							return 1;
						} else if (var0 == 4109) {
							var4 = field860[--Class80.field3328];
							Class80.field1598 -= 2;
							var10 = field865[Class80.field1598];
							var12 = field865[Class80.field1598 + 1];
							var15 = Client.field1137.method7132(var12, 0);
							var17 = new Class424(var15);
							field865[++Class80.field1598 - 1] = var17.method8140(var4, var10);
							return 1;
						} else if (var0 == 4110) {
							Class80.field3328 -= 2;
							var4 = field860[Class80.field3328];
							var5 = field860[Class80.field3328 + 1];
							if (field865[--Class80.field1598] == 1) {
								field860[++Class80.field3328 - 1] = var4;
							} else {
								field860[++Class80.field3328 - 1] = var5;
							}

							return 1;
						} else if (var0 == 4111) {
							var4 = field860[--Class80.field3328];
							field860[++Class80.field3328 - 1] = Class442.method8142(var4);
							return 1;
						} else if (var0 == 4112) {
							var4 = field860[--Class80.field3328];
							var10 = field865[--Class80.field1598];
							field860[++Class80.field3328 - 1] = var4 + (char)var10;
							return 1;
						} else if (var0 == 4113) {
							var13 = field865[--Class80.field1598];
							field865[++Class80.field1598 - 1] = Class413.method5781((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4114) {
							var13 = field865[--Class80.field1598];
							field865[++Class80.field1598 - 1] = Class413.method3588((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4115) {
							var13 = field865[--Class80.field1598];
							field865[++Class80.field1598 - 1] = Class413.method6364((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4116) {
							var13 = field865[--Class80.field1598];
							field865[++Class80.field1598 - 1] = Class413.method5044((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4117) {
							var4 = field860[--Class80.field3328];
							if (var4 != null) {
								field865[++Class80.field1598 - 1] = var4.length();
							} else {
								field865[++Class80.field1598 - 1] = 0;
							}

							return 1;
						} else if (var0 == 4118) {
							var4 = field860[--Class80.field3328];
							Class80.field1598 -= 2;
							var10 = field865[Class80.field1598];
							var12 = field865[Class80.field1598 + 1];
							field860[++Class80.field3328 - 1] = var4.substring(var10, var12);
							return 1;
						} else if (var0 == 4119) {
							var4 = field860[--Class80.field3328];
							StringBuilder var11 = new StringBuilder(var4.length());
							boolean var14 = false;

							for (var7 = 0; var7 < var4.length(); ++var7) {
								char var8 = var4.charAt(var7);
								if (var8 == '<') {
									var14 = true;
								} else if (var8 == '>') {
									var14 = false;
								} else if (!var14) {
									var11.append(var8);
								}
							}

							field860[++Class80.field3328 - 1] = var11.toString();
							return 1;
						} else if (var0 == 4120) {
							var4 = field860[--Class80.field3328];
							var10 = field865[--Class80.field1598];
							field865[++Class80.field1598 - 1] = var4.indexOf(var10);
							return 1;
						} else if (var0 == 4121) {
							Class80.field3328 -= 2;
							var4 = field860[Class80.field3328];
							var5 = field860[Class80.field3328 + 1];
							var12 = field865[--Class80.field1598];
							field865[++Class80.field1598 - 1] = var4.indexOf(var5, var12);
							return 1;
						} else if (var0 == 4122) {
							var4 = field860[--Class80.field3328];
							field860[++Class80.field3328 - 1] = var4.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							Class80.field3328 -= 3;
							var4 = field860[Class80.field3328];
							var5 = field860[Class80.field3328 + 1];
							String var6 = field860[2 + Class80.field3328];
							if (Client.field170.field1001 == null) {
								field860[++Class80.field3328 - 1] = var6;
								return 1;
							} else {
								switch(Client.field170.field1001.field3728) {
								case 0:
									field860[++Class80.field3328 - 1] = var4;
									break;
								case 1:
									field860[++Class80.field3328 - 1] = var5;
									break;
								case 2:
								default:
									field860[++Class80.field3328 - 1] = var6;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							field865[++Class80.field1598 - 1] = Client.field170.field1001 != null ? Client.field170.field1001.field3728 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					Class80.field3328 -= 2;
					var4 = field860[Class80.field3328];
					var5 = field860[1 + Class80.field3328];
					if (Client.field170.field1001 != null && 0 != Client.field170.field1001.field3720) {
						field860[++Class80.field3328 - 1] = var5;
					} else {
						field860[++Class80.field3328 - 1] = var4;
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(owner = "cy", name = "bp", desc = "(ILdg;ZI)I", opaque = "1628317124")
	public static int method2224(int var0, Class85 var1, boolean var2) {
		int var4;
		if (var0 == 4200) {
			var4 = field865[--Class80.field1598];
			field860[++Class80.field3328 - 1] = Class187.method3421(var4).field2013;
			return 1;
		} else {
			Class187 var6;
			int var7;
			if (var0 == 4201) {
				Class80.field1598 -= 2;
				var4 = field865[Class80.field1598];
				var7 = field865[1 + Class80.field1598];
				var6 = Class187.method3421(var4);
				if (var7 >= 1 && var7 <= 5 && null != var6.field2054[var7 - 1]) {
					field860[++Class80.field3328 - 1] = var6.field2054[var7 - 1];
				} else {
					field860[++Class80.field3328 - 1] = "";
				}

				return 1;
			} else if (var0 == 4202) {
				Class80.field1598 -= 2;
				var4 = field865[Class80.field1598];
				var7 = field865[Class80.field1598 + 1];
				var6 = Class187.method3421(var4);
				if (var7 >= 1 && var7 <= 5 && null != var6.field2034[var7 - 1]) {
					field860[++Class80.field3328 - 1] = var6.field2034[var7 - 1];
				} else {
					field860[++Class80.field3328 - 1] = "";
				}

				return 1;
			} else if (var0 == 4203) {
				var4 = field865[--Class80.field1598];
				field865[++Class80.field1598 - 1] = Class187.method3421(var4).field2026;
				return 1;
			} else if (var0 == 4204) {
				var4 = field865[--Class80.field1598];
				field865[++Class80.field1598 - 1] = Class187.method3421(var4).field2025 == 1 ? 1 : 0;
				return 1;
			} else {
				Class187 var5;
				if (var0 == 4205) {
					var4 = field865[--Class80.field1598];
					var5 = Class187.method3421(var4);
					if (-1 == var5.field2049 && var5.field2048 >= 0) {
						field865[++Class80.field1598 - 1] = var5.field2048;
					} else {
						field865[++Class80.field1598 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4206) {
					var4 = field865[--Class80.field1598];
					var5 = Class187.method3421(var4);
					if (var5.field2049 >= 0 && var5.field2048 >= 0) {
						field865[++Class80.field1598 - 1] = var5.field2048;
					} else {
						field865[++Class80.field1598 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4207) {
					var4 = field865[--Class80.field1598];
					field865[++Class80.field1598 - 1] = Class187.method3421(var4).field2030 ? 1 : 0;
					return 1;
				} else if (var0 == 4208) {
					var4 = field865[--Class80.field1598];
					var5 = Class187.method3421(var4);
					if (var5.field2062 == -1 && var5.field2061 >= 0) {
						field865[++Class80.field1598 - 1] = var5.field2061;
					} else {
						field865[++Class80.field1598 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4209) {
					var4 = field865[--Class80.field1598];
					var5 = Class187.method3421(var4);
					if (var5.field2062 >= 0 && var5.field2061 >= 0) {
						field865[++Class80.field1598 - 1] = var5.field2061;
					} else {
						field865[++Class80.field1598 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4210) {
					String var8 = field860[--Class80.field3328];
					var7 = field865[--Class80.field1598];
					Client.method143(var8, var7 == 1);
					field865[++Class80.field1598 - 1] = Client.field1226;
					return 1;
				} else if (var0 != 4211) {
					if (var0 == 4212) {
						Client.field477 = 0;
						return 1;
					} else if (var0 == 4213) {
						var4 = field865[--Class80.field1598];
						var7 = Class187.method3421(var4).method3757();
						if (var7 == -1) {
							field865[++Class80.field1598 - 1] = var7;
						} else {
							field865[++Class80.field1598 - 1] = var7 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var4 = field865[--Class80.field1598];
						field865[++Class80.field1598 - 1] = Class187.method3421(var4).field2027;
						return 1;
					} else if (var0 == 4215) {
						var4 = field865[--Class80.field1598];
						field865[++Class80.field1598 - 1] = Class187.method3421(var4).field2021;
						return 1;
					} else if (var0 == 4216) {
						var4 = field865[--Class80.field1598];
						field865[++Class80.field1598 - 1] = Class187.method3421(var4).field2029;
						return 1;
					} else if (var0 == 4217) {
						var4 = field865[--Class80.field1598];
						var5 = Class187.method3421(var4);
						field865[++Class80.field1598 - 1] = var5.field2056;
						return 1;
					} else if (var0 == 4218) {
						var4 = field865[--Class80.field1598];
						field860[++Class80.field3328 - 1] = Class187.method3421(var4).field2014;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (Client.field2687 != null && Client.field477 < Client.field1226) {
						field865[++Class80.field1598 - 1] = Client.field2687[++Client.field477 - 1] & '\uffff';
					} else {
						field865[++Class80.field1598 - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(owner = "ae", name = "bx", desc = "(ILdg;ZI)I", opaque = "1207290838")
	public static int method60(int var0, Class85 var1, boolean var2) {
		if (var0 == 5000) {
			field865[++Class80.field1598 - 1] = Client.field760;
			return 1;
		} else if (var0 == 5001) {
			Class80.field1598 -= 3;
			Client.field760 = field865[Class80.field1598];
			Client.field5281 = Class549.method145(field865[1 + Class80.field1598]);
			if (Client.field5281 == null) {
				Client.field5281 = Class549.field5373;
			}

			Client.field799 = field865[Class80.field1598 + 2];
			Class314 var14 = Class168.method3523(Class321.field3407, Client.field678.field1482);
			var14.field3270.method9809(Client.field760);
			var14.field3270.method9809(Client.field5281.field5375);
			var14.field3270.method9809(Client.field799);
			Client.field678.method3013(var14);
			return 1;
		} else {
			String var4;
			Class314 var7;
			int var9;
			int var11;
			if (var0 == 5002) {
				var4 = field860[--Class80.field3328];
				Class80.field1598 -= 2;
				var9 = field865[Class80.field1598];
				var11 = field865[1 + Class80.field1598];
				var7 = Class168.method3523(Class321.field3424, Client.field678.field1482);
				var7.field3270.method9809(Class562.method2698(var4) + 2);
				var7.field3270.method9816(var4);
				var7.field3270.method9809(var9 - 1);
				var7.field3270.method9809(var11);
				Client.field678.method3013(var7);
				return 1;
			} else {
				Class63 var6;
				int var8;
				if (var0 == 5003) {
					Class80.field1598 -= 2;
					var8 = field865[Class80.field1598];
					var9 = field865[Class80.field1598 + 1];
					var6 = Class115.method2638(var8, var9);
					if (var6 != null) {
						field865[++Class80.field1598 - 1] = var6.field481;
						field865[++Class80.field1598 - 1] = var6.field482;
						field860[++Class80.field3328 - 1] = var6.field484 != null ? var6.field484 : "";
						field860[++Class80.field3328 - 1] = var6.field488 != null ? var6.field488 : "";
						field860[++Class80.field3328 - 1] = var6.field489 != null ? var6.field489 : "";
						field865[++Class80.field1598 - 1] = var6.method1284() ? 1 : (var6.method1281() ? 2 : 0);
					} else {
						field865[++Class80.field1598 - 1] = -1;
						field865[++Class80.field1598 - 1] = 0;
						field860[++Class80.field3328 - 1] = "";
						field860[++Class80.field3328 - 1] = "";
						field860[++Class80.field3328 - 1] = "";
						field865[++Class80.field1598 - 1] = 0;
					}

					return 1;
				} else {
					Class63 var5;
					if (var0 == 5004) {
						var8 = field865[--Class80.field1598];
						var5 = Class115.method5731(var8);
						if (var5 != null) {
							field865[++Class80.field1598 - 1] = var5.field483;
							field865[++Class80.field1598 - 1] = var5.field482;
							field860[++Class80.field3328 - 1] = var5.field484 != null ? var5.field484 : "";
							field860[++Class80.field3328 - 1] = var5.field488 != null ? var5.field488 : "";
							field860[++Class80.field3328 - 1] = var5.field489 != null ? var5.field489 : "";
							field865[++Class80.field1598 - 1] = var5.method1284() ? 1 : (var5.method1281() ? 2 : 0);
						} else {
							field865[++Class80.field1598 - 1] = -1;
							field865[++Class80.field1598 - 1] = 0;
							field860[++Class80.field3328 - 1] = "";
							field860[++Class80.field3328 - 1] = "";
							field860[++Class80.field3328 - 1] = "";
							field865[++Class80.field1598 - 1] = 0;
						}

						return 1;
					} else if (var0 == 5005) {
						if (Client.field5281 == null) {
							field865[++Class80.field1598 - 1] = -1;
						} else {
							field865[++Class80.field1598 - 1] = Client.field5281.field5375;
						}

						return 1;
					} else {
						Class314 var12;
						if (var0 == 5008) {
							var4 = field860[--Class80.field3328];
							var9 = field865[--Class80.field1598];
							var12 = Class572.method8747(var9, var4, Client.field1376, -1);
							Client.field678.method3013(var12);
							return 1;
						} else if (var0 == 5009) {
							Class80.field3328 -= 2;
							var4 = field860[Class80.field3328];
							String var10 = field860[1 + Class80.field3328];
							var12 = Class168.method3523(Class321.field3396, Client.field678.field1482);
							var12.field3270.method9810(0);
							int var13 = var12.field3270.field5471;
							var12.field3270.method9816(var4);
							Class381.method4044(var12.field3270, var10);
							var12.field3270.method10019(var12.field3270.field5471 - var13);
							Client.field678.method3013(var12);
							return 1;
						} else if (var0 == 5010) {
							var4 = field860[--Class80.field3328];
							Class80.field1598 -= 2;
							var9 = field865[Class80.field1598];
							var11 = field865[Class80.field1598 + 1];
							var7 = Class572.method8747(var9, var4, Client.field1376, var11);
							Client.field678.method3013(var7);
							return 1;
						} else if (var0 != 5015) {
							if (var0 == 5016) {
								field865[++Class80.field1598 - 1] = Client.field799;
								return 1;
							} else if (var0 == 5017) {
								var8 = field865[--Class80.field1598];
								field865[++Class80.field1598 - 1] = Class115.method2155(var8);
								return 1;
							} else if (var0 == 5018) {
								var8 = field865[--Class80.field1598];
								field865[++Class80.field1598 - 1] = Class115.method889(var8);
								return 1;
							} else if (var0 == 5019) {
								var8 = field865[--Class80.field1598];
								field865[++Class80.field1598 - 1] = Class115.method2231(var8);
								return 1;
							} else if (var0 == 5020) {
								var4 = field860[--Class80.field3328];
								Client.method3419(var4);
								return 1;
							} else if (var0 == 5021) {
								Client.field762 = field860[--Class80.field3328].toLowerCase().trim();
								return 1;
							} else if (var0 == 5022) {
								field860[++Class80.field3328 - 1] = Client.field762;
								return 1;
							} else if (var0 == 5023) {
								var4 = field860[--Class80.field3328];
								System.out.println(var4);
								return 1;
							} else if (var0 == 5030) {
								Class80.field1598 -= 2;
								var8 = field865[Class80.field1598];
								var9 = field865[1 + Class80.field1598];
								var6 = Class115.method2638(var8, var9);
								if (var6 != null) {
									field865[++Class80.field1598 - 1] = var6.field481;
									field865[++Class80.field1598 - 1] = var6.field482;
									field860[++Class80.field3328 - 1] = var6.field484 != null ? var6.field484 : "";
									field860[++Class80.field3328 - 1] = var6.field488 != null ? var6.field488 : "";
									field860[++Class80.field3328 - 1] = var6.field489 != null ? var6.field489 : "";
									field865[++Class80.field1598 - 1] = var6.method1284() ? 1 : (var6.method1281() ? 2 : 0);
									field860[++Class80.field3328 - 1] = "";
									field865[++Class80.field1598 - 1] = 0;
								} else {
									field865[++Class80.field1598 - 1] = -1;
									field865[++Class80.field1598 - 1] = 0;
									field860[++Class80.field3328 - 1] = "";
									field860[++Class80.field3328 - 1] = "";
									field860[++Class80.field3328 - 1] = "";
									field865[++Class80.field1598 - 1] = 0;
									field860[++Class80.field3328 - 1] = "";
									field865[++Class80.field1598 - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var8 = field865[--Class80.field1598];
								var5 = Class115.method5731(var8);
								if (var5 != null) {
									field865[++Class80.field1598 - 1] = var5.field483;
									field865[++Class80.field1598 - 1] = var5.field482;
									field860[++Class80.field3328 - 1] = var5.field484 != null ? var5.field484 : "";
									field860[++Class80.field3328 - 1] = var5.field488 != null ? var5.field488 : "";
									field860[++Class80.field3328 - 1] = var5.field489 != null ? var5.field489 : "";
									field865[++Class80.field1598 - 1] = var5.method1284() ? 1 : (var5.method1281() ? 2 : 0);
									field860[++Class80.field3328 - 1] = "";
									field865[++Class80.field1598 - 1] = 0;
								} else {
									field865[++Class80.field1598 - 1] = -1;
									field865[++Class80.field1598 - 1] = 0;
									field860[++Class80.field3328 - 1] = "";
									field860[++Class80.field3328 - 1] = "";
									field860[++Class80.field3328 - 1] = "";
									field865[++Class80.field1598 - 1] = 0;
									field860[++Class80.field3328 - 1] = "";
									field865[++Class80.field1598 - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (Client.field170 != null && Client.field170.field991 != null) {
								var4 = Client.field170.field991.method9789();
							} else {
								var4 = "";
							}

							field860[++Class80.field3328 - 1] = var4;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfInfo(owner = "ad", name = "bu", desc = "(ILdg;ZB)I", opaque = "1")
	public static int method36(int var0, Class85 var1, boolean var2) {
		if (var0 == 5306) {
			field865[++Class80.field1598 - 1] = Client.method2130();
			return 1;
		} else {
			int var4;
			if (var0 == 5307) {
				var4 = field865[--Class80.field1598];
				if (var4 == 1 || var4 == 2) {
					Class209.method4042(var4);
				}

				return 1;
			} else if (var0 == 5308) {
				field865[++Class80.field1598 - 1] = Client.field1474.method2513();
				return 1;
			} else if (var0 != 5309) {
				if (var0 == 5310) {
					--Class80.field1598;
					return 1;
				} else {
					return 2;
				}
			} else {
				var4 = field865[--Class80.field1598];
				if (var4 == 1 || var4 == 2) {
					Client.field1474.method2485(var4);
				}

				return 1;
			}
		}
	}

	@ObfInfo(owner = "ev", name = "by", desc = "(ILdg;ZI)I", opaque = "-1536463174")
	public static int method3031(int var0, Class85 var1, boolean var2) {
		int var4;
		if (var0 == 5504) {
			Class80.field1598 -= 2;
			var4 = field865[Class80.field1598];
			int var5 = field865[1 + Class80.field1598];
			if (!Client.field792) {
				Client.field657 = var4;
				Client.field615 = var5;
			}

			return 1;
		} else if (var0 == 5505) {
			field865[++Class80.field1598 - 1] = Client.field657;
			return 1;
		} else if (var0 == 5506) {
			field865[++Class80.field1598 - 1] = Client.field615;
			return 1;
		} else if (var0 == 5530) {
			var4 = field865[--Class80.field1598];
			if (var4 < 0) {
				var4 = 0;
			}

			Client.field711 = var4;
			return 1;
		} else if (var0 == 5531) {
			field865[++Class80.field1598 - 1] = Client.field711;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "fj", name = "bl", desc = "(IB)I")
	public static int method3150(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfInfo(owner = "dp", name = "bc", desc = "(IS)I")
	public static int method2457(int var0) {
		return (int)((Math.log((double)var0) / field872 - 7.0D) * 256.0D);
	}

	@ObfInfo(owner = "mf", name = "bv", desc = "(ILdg;ZI)I", opaque = "587211556")
	public static int method6227(int var0, Class85 var1, boolean var2) {
		if (var0 == 6200) {
			Class80.field1598 -= 2;
			Client.field802 = (short)method3150(field865[Class80.field1598]);
			if (Client.field802 <= 0) {
				Client.field802 = 256;
			}

			Client.field803 = (short)method3150(field865[1 + Class80.field1598]);
			if (Client.field803 <= 0) {
				Client.field803 = 256;
			}

			return 1;
		} else if (var0 == 6201) {
			Class80.field1598 -= 2;
			Client.field675 = (short)field865[Class80.field1598];
			if (Client.field675 <= 0) {
				Client.field675 = 256;
			}

			Client.field805 = (short)field865[1 + Class80.field1598];
			if (Client.field805 <= 0) {
				Client.field805 = 320;
			}

			return 1;
		} else if (var0 == 6202) {
			Class80.field1598 -= 4;
			Client.field777 = (short)field865[Class80.field1598];
			if (Client.field777 <= 0) {
				Client.field777 = 1;
			}

			Client.field807 = (short)field865[1 + Class80.field1598];
			if (Client.field807 <= 0) {
				Client.field807 = 32767;
			} else if (Client.field807 < Client.field777) {
				Client.field807 = Client.field777;
			}

			Client.field808 = (short)field865[Class80.field1598 + 2];
			if (Client.field808 <= 0) {
				Client.field808 = 1;
			}

			Client.field809 = (short)field865[Class80.field1598 + 3];
			if (Client.field809 <= 0) {
				Client.field809 = 32767;
			} else if (Client.field809 < Client.field808) {
				Client.field809 = Client.field808;
			}

			return 1;
		} else if (var0 == 6203) {
			if (Client.field708 != null) {
				Class126.method3030(0, 0, Client.field708.field3828, Client.field708.field3829, false);
				field865[++Class80.field1598 - 1] = Client.field812;
				field865[++Class80.field1598 - 1] = Client.field726;
			} else {
				field865[++Class80.field1598 - 1] = -1;
				field865[++Class80.field1598 - 1] = -1;
			}

			return 1;
		} else if (var0 == 6204) {
			field865[++Class80.field1598 - 1] = Client.field675;
			field865[++Class80.field1598 - 1] = Client.field805;
			return 1;
		} else if (var0 == 6205) {
			field865[++Class80.field1598 - 1] = method2457(Client.field802);
			field865[++Class80.field1598 - 1] = method2457(Client.field803);
			return 1;
		} else if (var0 == 6220) {
			field865[++Class80.field1598 - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			field865[++Class80.field1598 - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			field865[++Class80.field1598 - 1] = Client.field954;
			return 1;
		} else if (var0 == 6223) {
			field865[++Class80.field1598 - 1] = Client.field15;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "bu", name = "bb", desc = "(ILdg;ZI)I", opaque = "396253424")
	public static int method803(int var0, Class85 var1, boolean var2) {
		if (var0 == 6500) {
			field865[++Class80.field1598 - 1] = Class75.method7051() ? 1 : 0;
			return 1;
		} else {
			Class75 var9;
			if (var0 == 6501) {
				var9 = Class75.method5782();
				if (var9 != null) {
					field865[++Class80.field1598 - 1] = var9.field902;
					field865[++Class80.field1598 - 1] = var9.field912;
					field860[++Class80.field3328 - 1] = var9.field906;
					field865[++Class80.field1598 - 1] = var9.field907;
					field865[++Class80.field1598 - 1] = var9.field904;
					field860[++Class80.field3328 - 1] = var9.field905;
				} else {
					field865[++Class80.field1598 - 1] = -1;
					field865[++Class80.field1598 - 1] = 0;
					field860[++Class80.field3328 - 1] = "";
					field865[++Class80.field1598 - 1] = 0;
					field865[++Class80.field1598 - 1] = 0;
					field860[++Class80.field3328 - 1] = "";
				}

				return 1;
			} else if (var0 == 6502) {
				var9 = Class75.method2220();
				if (var9 != null) {
					field865[++Class80.field1598 - 1] = var9.field902;
					field865[++Class80.field1598 - 1] = var9.field912;
					field860[++Class80.field3328 - 1] = var9.field906;
					field865[++Class80.field1598 - 1] = var9.field907;
					field865[++Class80.field1598 - 1] = var9.field904;
					field860[++Class80.field3328 - 1] = var9.field905;
				} else {
					field865[++Class80.field1598 - 1] = -1;
					field865[++Class80.field1598 - 1] = 0;
					field860[++Class80.field3328 - 1] = "";
					field865[++Class80.field1598 - 1] = 0;
					field865[++Class80.field1598 - 1] = 0;
					field860[++Class80.field3328 - 1] = "";
				}

				return 1;
			} else {
				int var4;
				Class75 var5;
				int var11;
				if (var0 == 6506) {
					var4 = field865[--Class80.field1598];
					var5 = null;

					for (var11 = 0; var11 < Class75.field898; ++var11) {
						if (var4 == Class90.field3782[var11].field902) {
							var5 = Class90.field3782[var11];
							break;
						}
					}

					if (var5 != null) {
						field865[++Class80.field1598 - 1] = var5.field902;
						field865[++Class80.field1598 - 1] = var5.field912;
						field860[++Class80.field3328 - 1] = var5.field906;
						field865[++Class80.field1598 - 1] = var5.field907;
						field865[++Class80.field1598 - 1] = var5.field904;
						field860[++Class80.field3328 - 1] = var5.field905;
					} else {
						field865[++Class80.field1598 - 1] = -1;
						field865[++Class80.field1598 - 1] = 0;
						field860[++Class80.field3328 - 1] = "";
						field865[++Class80.field1598 - 1] = 0;
						field865[++Class80.field1598 - 1] = 0;
						field860[++Class80.field3328 - 1] = "";
					}

					return 1;
				} else if (var0 == 6507) {
					Class80.field1598 -= 4;
					var4 = field865[Class80.field1598];
					boolean var10 = field865[1 + Class80.field1598] == 1;
					var11 = field865[2 + Class80.field1598];
					boolean var7 = 1 == field865[Class80.field1598 + 3];
					Class75.method3382(var4, var10, var11, var7);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == 6512) {
						Client.field683 = field865[--Class80.field1598] == 1;
						return 1;
					} else {
						Class186 var6;
						int var8;
						if (var0 == 6513) {
							Class80.field1598 -= 2;
							var4 = field865[Class80.field1598];
							var8 = field865[1 + Class80.field1598];
							var6 = Class186.method1971(var8);
							if (var6.method3731()) {
								field860[++Class80.field3328 - 1] = Class184.method2222(var4).method3662(var8, var6.field1997);
							} else {
								field865[++Class80.field1598 - 1] = Class184.method2222(var4).method3663(var8, var6.field1999);
							}

							return 1;
						} else if (var0 == 6514) {
							Class80.field1598 -= 2;
							var4 = field865[Class80.field1598];
							var8 = field865[Class80.field1598 + 1];
							var6 = Class186.method1971(var8);
							if (var6.method3731()) {
								field860[++Class80.field3328 - 1] = Class197.method61(var4).method3907(var8, var6.field1997);
							} else {
								field865[++Class80.field1598 - 1] = Class197.method61(var4).method3941(var8, var6.field1999);
							}

							return 1;
						} else if (var0 == 6515) {
							Class80.field1598 -= 2;
							var4 = field865[Class80.field1598];
							var8 = field865[Class80.field1598 + 1];
							var6 = Class186.method1971(var8);
							if (var6.method3731()) {
								field860[++Class80.field3328 - 1] = Class187.method3421(var4).method3802(var8, var6.field1997);
							} else {
								field865[++Class80.field1598 - 1] = Class187.method3421(var4).method3755(var8, var6.field1999);
							}

							return 1;
						} else if (var0 == 6516) {
							Class80.field1598 -= 2;
							var4 = field865[Class80.field1598];
							var8 = field865[1 + Class80.field1598];
							var6 = Class186.method1971(var8);
							if (var6.method3731()) {
								field860[++Class80.field3328 - 1] = Class193.method1910(var4).method3866(var8, var6.field1997);
							} else {
								field865[++Class80.field1598 - 1] = Class193.method1910(var4).method3865(var8, var6.field1999);
							}

							return 1;
						} else if (var0 == 6518) {
							field865[++Class80.field1598 - 1] = Client.field533 ? 1 : 0;
							return 1;
						} else if (var0 == 6519) {
							field865[++Class80.field1598 - 1] = Client.field660;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == 6521) {
							return 1;
						} else if (var0 == 6522) {
							--Class80.field3328;
							--Class80.field1598;
							return 1;
						} else if (var0 == 6523) {
							--Class80.field3328;
							--Class80.field1598;
							return 1;
						} else if (var0 == 6524) {
							field865[++Class80.field1598 - 1] = -1;
							return 1;
						} else if (var0 == 6525) {
							field865[++Class80.field1598 - 1] = 1;
							return 1;
						} else if (var0 == 6526) {
							field865[++Class80.field1598 - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							field865[++Class80.field1598 - 1] = Client.field532;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = field865[--Class80.field1598];
					if (var4 >= 0 && var4 < Class75.field898) {
						var5 = Class90.field3782[var4];
						field865[++Class80.field1598 - 1] = var5.field902;
						field865[++Class80.field1598 - 1] = var5.field912;
						field860[++Class80.field3328 - 1] = var5.field906;
						field865[++Class80.field1598 - 1] = var5.field907;
						field865[++Class80.field1598 - 1] = var5.field904;
						field860[++Class80.field3328 - 1] = var5.field905;
					} else {
						field865[++Class80.field1598 - 1] = -1;
						field865[++Class80.field1598 - 1] = 0;
						field860[++Class80.field3328 - 1] = "";
						field865[++Class80.field1598 - 1] = 0;
						field865[++Class80.field1598 - 1] = 0;
						field860[++Class80.field3328 - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(owner = "jz", name = "bn", desc = "(ILdg;ZI)I", opaque = "656489867")
	public static int method5010(int var0, Class85 var1, boolean var2) {
		int var4;
		if (var0 == 6600) {
			var4 = Client.field5093.field1016;
			int var17 = (Client.field170.field1266 >> 7) + Client.field5093.field1019;
			int var13 = (Client.field170.field1229 >> 7) + Client.field5093.field1021;
			Client.method150().method9060(var4, var17, var13, true);
			return 1;
		} else {
			Class247 var8;
			if (var0 == 6601) {
				var4 = field865[--Class80.field1598];
				String var16 = "";
				var8 = Client.method150().method9152(var4);
				if (var8 != null) {
					var16 = var8.method4762();
				}

				field860[++Class80.field3328 - 1] = var16;
				return 1;
			} else if (var0 == 6602) {
				var4 = field865[--Class80.field1598];
				Client.method150().method9149(var4);
				return 1;
			} else if (var0 == 6603) {
				field865[++Class80.field1598 - 1] = Client.method150().method9076();
				return 1;
			} else if (var0 == 6604) {
				var4 = field865[--Class80.field1598];
				Client.method150().method9073(var4);
				return 1;
			} else if (var0 == 6605) {
				field865[++Class80.field1598 - 1] = Client.method150().method9078() ? 1 : 0;
				return 1;
			} else {
				Class350 var15;
				if (var0 == 6606) {
					var15 = new Class350(field865[--Class80.field1598]);
					Client.method150().method9080(var15.field3748, var15.field3750);
					return 1;
				} else if (var0 == 6607) {
					var15 = new Class350(field865[--Class80.field1598]);
					Client.method150().method9171(var15.field3748, var15.field3750);
					return 1;
				} else if (var0 == 6608) {
					var15 = new Class350(field865[--Class80.field1598]);
					Client.method150().method9162(var15.field3749, var15.field3748, var15.field3750);
					return 1;
				} else if (var0 == 6609) {
					var15 = new Class350(field865[--Class80.field1598]);
					Client.method150().method9083(var15.field3749, var15.field3748, var15.field3750);
					return 1;
				} else if (var0 == 6610) {
					field865[++Class80.field1598 - 1] = Client.method150().method9084();
					field865[++Class80.field1598 - 1] = Client.method150().method9085();
					return 1;
				} else {
					Class247 var12;
					if (var0 == 6611) {
						var4 = field865[--Class80.field1598];
						var12 = Client.method150().method9152(var4);
						if (var12 == null) {
							field865[++Class80.field1598 - 1] = 0;
						} else {
							field865[++Class80.field1598 - 1] = var12.method4773().method6506();
						}

						return 1;
					} else if (var0 == 6612) {
						var4 = field865[--Class80.field1598];
						var12 = Client.method150().method9152(var4);
						if (var12 == null) {
							field865[++Class80.field1598 - 1] = 0;
							field865[++Class80.field1598 - 1] = 0;
						} else {
							field865[++Class80.field1598 - 1] = (var12.method4767() - var12.method4771() + 1) * 64;
							field865[++Class80.field1598 - 1] = (var12.method4788() - var12.method4768() + 1) * 64;
						}

						return 1;
					} else if (var0 == 6613) {
						var4 = field865[--Class80.field1598];
						var12 = Client.method150().method9152(var4);
						if (var12 == null) {
							field865[++Class80.field1598 - 1] = 0;
							field865[++Class80.field1598 - 1] = 0;
							field865[++Class80.field1598 - 1] = 0;
							field865[++Class80.field1598 - 1] = 0;
						} else {
							field865[++Class80.field1598 - 1] = var12.method4771() * 64;
							field865[++Class80.field1598 - 1] = var12.method4768() * 64;
							field865[++Class80.field1598 - 1] = var12.method4767() * 64 + 64 - 1;
							field865[++Class80.field1598 - 1] = var12.method4788() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == 6614) {
						var4 = field865[--Class80.field1598];
						var12 = Client.method150().method9152(var4);
						if (var12 == null) {
							field865[++Class80.field1598 - 1] = -1;
						} else {
							field865[++Class80.field1598 - 1] = var12.method4765();
						}

						return 1;
					} else if (var0 == 6615) {
						var15 = Client.method150().method9086();
						if (var15 == null) {
							field865[++Class80.field1598 - 1] = -1;
							field865[++Class80.field1598 - 1] = -1;
						} else {
							field865[++Class80.field1598 - 1] = var15.field3748;
							field865[++Class80.field1598 - 1] = var15.field3750;
						}

						return 1;
					} else if (var0 == 6616) {
						field865[++Class80.field1598 - 1] = Client.method150().method9220();
						return 1;
					} else if (var0 == 6617) {
						var15 = new Class350(field865[--Class80.field1598]);
						var12 = Client.method150().method9063();
						if (var12 == null) {
							field865[++Class80.field1598 - 1] = -1;
							field865[++Class80.field1598 - 1] = -1;
							return 1;
						} else {
							int[] var11 = var12.method4756(var15.field3749, var15.field3748, var15.field3750);
							if (var11 == null) {
								field865[++Class80.field1598 - 1] = -1;
								field865[++Class80.field1598 - 1] = -1;
							} else {
								field865[++Class80.field1598 - 1] = var11[0];
								field865[++Class80.field1598 - 1] = var11[1];
							}

							return 1;
						}
					} else {
						Class350 var6;
						if (var0 == 6618) {
							var15 = new Class350(field865[--Class80.field1598]);
							var12 = Client.method150().method9063();
							if (var12 == null) {
								field865[++Class80.field1598 - 1] = -1;
								field865[++Class80.field1598 - 1] = -1;
								return 1;
							} else {
								var6 = var12.method4757(var15.field3748, var15.field3750);
								if (var6 == null) {
									field865[++Class80.field1598 - 1] = -1;
								} else {
									field865[++Class80.field1598 - 1] = var6.method6506();
								}

								return 1;
							}
						} else {
							Class350 var9;
							if (var0 == 6619) {
								Class80.field1598 -= 2;
								var4 = field865[Class80.field1598];
								var9 = new Class350(field865[1 + Class80.field1598]);
								method5843(var4, var9, false);
								return 1;
							} else if (var0 == 6620) {
								Class80.field1598 -= 2;
								var4 = field865[Class80.field1598];
								var9 = new Class350(field865[1 + Class80.field1598]);
								method5843(var4, var9, true);
								return 1;
							} else if (var0 == 6621) {
								Class80.field1598 -= 2;
								var4 = field865[Class80.field1598];
								var9 = new Class350(field865[1 + Class80.field1598]);
								var8 = Client.method150().method9152(var4);
								if (var8 == null) {
									field865[++Class80.field1598 - 1] = 0;
									return 1;
								} else {
									field865[++Class80.field1598 - 1] = var8.method4759(var9.field3749, var9.field3748, var9.field3750) ? 1 : 0;
									return 1;
								}
							} else if (var0 == 6622) {
								field865[++Class80.field1598 - 1] = Client.method150().method9153();
								field865[++Class80.field1598 - 1] = Client.method150().method9053();
								return 1;
							} else if (var0 == 6623) {
								var15 = new Class350(field865[--Class80.field1598]);
								var12 = Client.method150().method9221(var15.field3749, var15.field3748, var15.field3750);
								if (var12 == null) {
									field865[++Class80.field1598 - 1] = -1;
								} else {
									field865[++Class80.field1598 - 1] = var12.method4772();
								}

								return 1;
							} else if (var0 == 6624) {
								Client.method150().method9089(field865[--Class80.field1598]);
								return 1;
							} else if (var0 == 6625) {
								Client.method150().method9090();
								return 1;
							} else if (var0 == 6626) {
								Client.method150().method9102(field865[--Class80.field1598]);
								return 1;
							} else if (var0 == 6627) {
								Client.method150().method9092();
								return 1;
							} else {
								boolean var14;
								if (var0 == 6628) {
									var14 = field865[--Class80.field1598] == 1;
									Client.method150().method9093(var14);
									return 1;
								} else if (var0 == 6629) {
									var4 = field865[--Class80.field1598];
									Client.method150().method9094(var4);
									return 1;
								} else if (var0 == 6630) {
									var4 = field865[--Class80.field1598];
									Client.method150().method9095(var4);
									return 1;
								} else if (var0 == 6631) {
									Client.method150().method9049();
									return 1;
								} else if (var0 == 6632) {
									var14 = field865[--Class80.field1598] == 1;
									Client.method150().method9097(var14);
									return 1;
								} else {
									boolean var10;
									if (var0 == 6633) {
										Class80.field1598 -= 2;
										var4 = field865[Class80.field1598];
										var10 = field865[1 + Class80.field1598] == 1;
										Client.method150().method9098(var4, var10);
										return 1;
									} else if (var0 == 6634) {
										Class80.field1598 -= 2;
										var4 = field865[Class80.field1598];
										var10 = 1 == field865[Class80.field1598 + 1];
										Client.method150().method9190(var4, var10);
										return 1;
									} else if (var0 == 6635) {
										field865[++Class80.field1598 - 1] = Client.method150().method9100() ? 1 : 0;
										return 1;
									} else if (var0 == 6636) {
										var4 = field865[--Class80.field1598];
										field865[++Class80.field1598 - 1] = Client.method150().method9101(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6637) {
										var4 = field865[--Class80.field1598];
										field865[++Class80.field1598 - 1] = Client.method150().method9116(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										Class80.field1598 -= 2;
										var4 = field865[Class80.field1598];
										var9 = new Class350(field865[1 + Class80.field1598]);
										var6 = Client.method150().method9105(var4, var9);
										if (var6 == null) {
											field865[++Class80.field1598 - 1] = -1;
										} else {
											field865[++Class80.field1598 - 1] = var6.method6506();
										}

										return 1;
									} else {
										Class268 var7;
										if (var0 == 6639) {
											var7 = Client.method150().method9107();
											if (var7 == null) {
												field865[++Class80.field1598 - 1] = -1;
												field865[++Class80.field1598 - 1] = -1;
											} else {
												field865[++Class80.field1598 - 1] = var7.method4659();
												field865[++Class80.field1598 - 1] = var7.field2748.method6506();
											}

											return 1;
										} else if (var0 == 6640) {
											var7 = Client.method150().method9108();
											if (var7 == null) {
												field865[++Class80.field1598 - 1] = -1;
												field865[++Class80.field1598 - 1] = -1;
											} else {
												field865[++Class80.field1598 - 1] = var7.method4659();
												field865[++Class80.field1598 - 1] = var7.field2748.method6506();
											}

											return 1;
										} else {
											Class163 var5;
											if (var0 == 6693) {
												var4 = field865[--Class80.field1598];
												var5 = Class163.method3540(var4);
												if (var5.field1776 == null) {
													field860[++Class80.field3328 - 1] = "";
												} else {
													field860[++Class80.field3328 - 1] = var5.field1776;
												}

												return 1;
											} else if (var0 == 6694) {
												var4 = field865[--Class80.field1598];
												var5 = Class163.method3540(var4);
												field865[++Class80.field1598 - 1] = var5.field1779;
												return 1;
											} else if (var0 == 6695) {
												var4 = field865[--Class80.field1598];
												var5 = Class163.method3540(var4);
												if (var5 == null) {
													field865[++Class80.field1598 - 1] = -1;
												} else {
													field865[++Class80.field1598 - 1] = var5.field1778;
												}

												return 1;
											} else if (var0 == 6696) {
												var4 = field865[--Class80.field1598];
												var5 = Class163.method3540(var4);
												if (var5 == null) {
													field865[++Class80.field1598 - 1] = -1;
												} else {
													field865[++Class80.field1598 - 1] = var5.field1795;
												}

												return 1;
											} else if (var0 == 6697) {
												field865[++Class80.field1598 - 1] = field2989.field2962;
												return 1;
											} else if (var0 == 6698) {
												field865[++Class80.field1598 - 1] = field2989.field2963.method6506();
												return 1;
											} else if (var0 == 6699) {
												field865[++Class80.field1598 - 1] = field2989.field2964.method6506();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfInfo(owner = "sz", name = "bh", desc = "(ILdg;ZI)I", opaque = "537701411")
	public static int method8839(int var0, Class85 var1, boolean var2) {
		if (var0 == 6754) {
			int var6 = field865[--Class80.field1598];
			Class184 var7 = Class184.method2222(var6);
			field860[++Class80.field3328 - 1] = var7 != null ? var7.field1942 : "";
			return 1;
		} else {
			Class184 var4;
			if (var0 == 6764) {
				Class80.field1598 -= 2;
				var4 = Class184.method2222(field865[Class80.field1598]);
				int var5 = field865[Class80.field1598 + 1];
				field865[++Class80.field1598 - 1] = var4.method3655(var5);
				field865[++Class80.field1598 - 1] = var4.method3669(var5);
				return 1;
			} else if (var0 == 6765) {
				var4 = Class184.method2222(field865[--Class80.field1598]);
				field865[++Class80.field1598 - 1] = var4 != null ? var4.field1967 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfInfo(owner = "cu", name = "bq", desc = "(ILdg;ZI)I", opaque = "25524426")
	public static int method2136(int var0, Class85 var1, boolean var2) {
		if (var0 == 6809) {
			int var4 = field865[--Class80.field1598];
			Class197 var5 = Class197.method61(var4);
			field860[++Class80.field3328 - 1] = var5 != null ? var5.field2175 : "";
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "as", name = "bd", desc = "(ILdg;ZI)I")
	public static int method274(int var0, Class85 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(owner = "bg", name = "bz", desc = "(ILdg;ZB)I")
	public static int method451(int var0, Class85 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(owner = "nv", name = "bk", desc = "(ILdg;ZI)I", opaque = "-707607351")
	public static int method6605(int var0, Class85 var1, boolean var2) {
		if (var0 == 7108) {
			field865[++Class80.field1598 - 1] = Client.method2906() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "ns", name = "br", desc = "(ILdg;ZS)I", opaque = "188")
	public static int method6572(int var0, Class85 var1, boolean var2) {
		if (var0 == 7463) {
			boolean var4 = field865[--Class80.field1598] == 1;
			Client.method3413(var4);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "kg", name = "bf", desc = "(ILdg;ZI)I", opaque = "383910096")
	public static int method5048(int var0, Class85 var1, boolean var2) {
		int var4;
		Object var5;
		int var6;
		Class528 var7;
		int var8;
		if (var0 != 7500 && var0 != 7508) {
			if (var0 != 7501) {
				int var21;
				int var23;
				if (var0 == 7502) {
					Class80.field1598 -= 3;
					var4 = field865[Class80.field1598];
					var21 = field865[Class80.field1598 + 1];
					var6 = field865[Class80.field1598 + 2];
					var23 = Class535.method3352(var21);
					var8 = Class535.method7324(var21);
					int var25 = Class535.method7128(var21);
					Class540 var26 = Class540.method4943(var4);
					Class533 var27 = Class533.method3885(var23);
					int[] var28 = var27.field5288[var8];
					int var13 = 0;
					int var14 = var28.length;
					if (var25 >= 0) {
						if (var25 >= var14) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
						}

						var13 = var25;
						var14 = var25 + 1;
					}

					Object[] var15 = var26.method9504(var8);
					if (var15 == null && var27.field5289 != null) {
						var15 = var27.field5289[var8];
					}

					int var16;
					int var17;
					if (var15 == null) {
						for (var16 = var13; var16 < var14; ++var16) {
							var17 = var28[var16];
							Class525 var29 = Class522.method2912(var17);
							if (Class525.field5246 == var29) {
								field860[++Class80.field3328 - 1] = "";
							} else {
								field865[++Class80.field1598 - 1] = Class526.method9337(var17);
							}
						}

						return 1;
					} else {
						var16 = var15.length / var28.length;
						if (var6 >= 0 && var6 < var16) {
							for (var17 = var13; var17 < var14; ++var17) {
								int var18 = var28.length * var6 + var17;
								Class525 var19 = Class522.method2912(var28[var17]);
								if (Class525.field5246 == var19) {
									field860[++Class80.field3328 - 1] = (String)var15[var18];
								} else {
									field865[++Class80.field1598 - 1] = (Integer)var15[var18];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == 7503) {
					Class80.field1598 -= 2;
					var4 = field865[Class80.field1598];
					var21 = field865[1 + Class80.field1598];
					var6 = 0;
					var23 = Class535.method3352(var21);
					var8 = Class535.method7324(var21);
					Class540 var24 = Class540.method4943(var4);
					Class533 var10 = Class533.method3885(var23);
					int[] var11 = var10.field5288[var8];
					Object[] var12 = var24.method9504(var8);
					if (var12 == null && var10.field5289 != null) {
						var12 = var10.field5289[var8];
					}

					if (var12 != null) {
						var6 = var12.length / var11.length;
					}

					field865[++Class80.field1598 - 1] = var6;
					return 1;
				} else if (var0 != 7504 && var0 != 7510) {
					if (var0 == 7505) {
						var4 = field865[--Class80.field1598];
						Class540 var22 = Class540.method4943(var4);
						field865[++Class80.field1598 - 1] = var22.field5308;
						return 1;
					} else if (var0 == 7506) {
						var4 = field865[--Class80.field1598];
						var21 = -1;
						if (field2319 != null && var4 >= 0 && var4 < field2319.size()) {
							var21 = (Integer)field2319.get(var4);
						}

						field865[++Class80.field1598 - 1] = var21;
						return 1;
					} else if (var0 != 7507 && var0 != 7509) {
						return 2;
					} else {
						var4 = field865[--Class80.field1598];
						var5 = method4996(var4);
						var6 = field865[--Class80.field1598];
						var7 = Client.method7236(var6);
						if (var7 == null) {
							throw new RuntimeException();
						} else if (Class535.method3352(var6) != Client.field824) {
							throw new RuntimeException();
						} else if (field2319 == null && field2319.isEmpty()) {
							throw new RuntimeException();
						} else {
							var8 = Class535.method7128(var6);
							List var9 = var7.method9380(var5, var8);
							field2319 = new LinkedList(field2319);
							if (var9 != null) {
								field2319.retainAll(var9);
							} else {
								field2319.clear();
							}

							field1456 = field2319.iterator();
							if (var0 == 7507) {
								field865[++Class80.field1598 - 1] = field2319.size();
							}

							return 1;
						}
					}
				} else {
					--Class80.field1598;
					var4 = field865[Class80.field1598];
					Class528 var20 = Class180.method3614(var4);
					if (var20 == null) {
						throw new RuntimeException();
					} else {
						field2319 = var20.method9380(0, 0);
						var6 = 0;
						if (field2319 != null) {
							Client.field824 = var4;
							field1456 = field2319.iterator();
							var6 = field2319.size();
						}

						if (var0 == 7504) {
							field865[++Class80.field1598 - 1] = var6;
						}

						return 1;
					}
				}
			} else {
				if (field1456 != null && field1456.hasNext()) {
					field865[++Class80.field1598 - 1] = (Integer)field1456.next();
				} else {
					field865[++Class80.field1598 - 1] = -1;
				}

				return 1;
			}
		} else {
			var4 = field865[--Class80.field1598];
			var5 = method4996(var4);
			var6 = field865[--Class80.field1598];
			var7 = Client.method7236(var6);
			if (var7 == null) {
				throw new RuntimeException();
			} else {
				var8 = Class535.method7128(var6);
				field2319 = var7.method9380(var5, var8);
				if (field2319 != null) {
					Client.field824 = Class535.method3352(var6);
					field1456 = field2319.iterator();
					if (var0 == 7500) {
						field865[++Class80.field1598 - 1] = field2319.size();
					}
				} else {
					Client.field824 = -1;
					field1456 = null;
					if (var0 == 7500) {
						field865[++Class80.field1598 - 1] = 0;
					}
				}

				return 1;
			}
		}
	}

	@ObfInfo(owner = "rb", name = "cf", desc = "(ILdg;ZI)I")
	public static int method8281(int var0, Class85 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(owner = "ad", name = "cv", desc = "(ILdg;ZI)I", opaque = "2116845328")
	public static int method39(int var0, Class85 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 8000) {
			--Class80.field1598;
			var4 = field865[Class80.field1598];
			var5 = field864[var4];
			Class521.method3376(field874[var4], new int[var5], 0, var5 - 1);
			return 1;
		} else if (var0 == 8001) {
			Class80.field1598 -= 3;
			var4 = field865[Class80.field1598];
			var5 = field865[Class80.field1598 + 1];
			int var6 = field865[Class80.field1598 + 2];
			int var7 = field864[var4];
			if (var7 <= 1) {
				return 1;
			} else {
				Class458.method8434(field874[var4], var7, var5, var6);
				return 1;
			}
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "av", name = "cl", desc = "(II)V", opaque = "583555939")
	public static void method302(int var0) {
		if (var0 != -1) {
			if (Client.field4644.method6412(var0)) {
				Class362[] var2 = Client.field4644.field3698[var0];

				for (int var3 = 0; var3 < var2.length; ++var3) {
					Class362 var4 = var2[var3];
					if (var4.field3901 != null) {
						Class99 var5 = new Class99();
						var5.field1215 = var4;
						var5.field1217 = var4.field3901;
						method6553(var5, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfInfo(owner = "lp", name = "cm", desc = "(ILnl;ZI)V")
	public static void method5843(int var0, Class350 var1, boolean var2) {
		Class247 var4 = Client.method150().method9152(var0);
		int var5 = Client.field170.field982;
		int var6 = (Client.field170.field1266 >> 7) + Client.field5093.field1019;
		int var7 = (Client.field170.field1229 >> 7) + Client.field5093.field1021;
		Class350 var8 = new Class350(var5, var6, var7);
		Client.method150().method9066(var4, var8, var1, var2);
	}

	@ObfInfo(owner = "jz", name = "cu", desc = "(IB)Ljava/lang/Object;")
	public static Object method4996(int var0) {
		return Class80.method2296((Class525)Class406.method4071(Class525.method9304(), var0));
	}
}
