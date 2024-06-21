import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Class72 {
	@ObfInfo(owner = "my", name = "ax", desc = "Lgc;")
	public static Class159 field3527;
	@ObfInfo(owner = "rs", name = "ay", desc = "Lgo;")
	public static Class171 field4874;
	@ObfInfo(owner = "ep", name = "ad", desc = "Llw;")
	public static Class309 field1483;
	@ObfInfo(owner = "aq", name = "ap", desc = "Lnb;")
	public static Class340 field88;
	@ObfInfo(name = "ae", desc = "Lnb;")
	public static Class340 field892;
	@ObfInfo(name = "aq", desc = "[Lcr;")
	public static Class70[] field882;
	@ObfInfo(name = "ai", desc = "Z")
	public static boolean field886;
	@ObfInfo(name = "an", desc = "Z")
	public static boolean field890;
	@ObfInfo(owner = "lh", name = "au", desc = "I", intMultiplier = 1484412449)
	public static int field3177;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 359682213)
	public static int field881;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = -322801345)
	public static int field896;
	@ObfInfo(name = "aa", desc = "[I")
	public static int[] field877;
	@ObfInfo(name = "az", desc = "[I")
	public static int[] field878;
	@ObfInfo(name = "ab", desc = "[I")
	public static int[] field887;
	@ObfInfo(name = "at", desc = "[[I")
	public static int[][] field879;
	@ObfInfo(owner = "ey", name = "af", desc = "[Ljava/lang/String;")
	public static String[] field1537;
	@ObfInfo(name = "ao", desc = "[Ljava/lang/String;")
	public static String[] field880;
	@ObfInfo(name = "am", desc = "Ljava/util/ArrayList;")
	public static ArrayList field888;
	@ObfInfo(name = "as", desc = "Ljava/util/Calendar;")
	public static Calendar field884;
	@ObfInfo(name = "bo", desc = "D")
	public static final double field889;
	@ObfInfo(name = "aw", desc = "[Ljava/lang/String;")
	public static final String[] field885;

	static {
		field877 = new int[5];
		field879 = new int[5][5000];
		field887 = new int[1000];
		field880 = new String[1000];
		field881 = 0;
		field882 = new Class70[50];
		field884 = Calendar.getInstance();
		field885 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field886 = false;
		field890 = false;
		field888 = new ArrayList();
		field896 = 0;
		field889 = Math.log(2.0D);
	}

	@ObfInfo(owner = "oq", name = "ak", desc = "(Ldw;I)V")
	public static void method7210(Class101 var0) {
		method3072(var0, 500000, 475000);
	}

	@ObfInfo(owner = "fb", name = "al", desc = "(Ldw;IIB)V", opaque = "0")
	public static void method3072(Class101 var0, int var1, int var2) {
		Object[] var4 = var0.field1333;
		Class91 var5;
		if (Class538.method2221(var0.field1334)) {
			field1483 = (Class309)var4[0];
			Class200 var6 = Class200.method3917(field1483.field3256);
			var5 = Class91.method67(var0.field1334, var6.field2045, var6.field2065);
		} else {
			int var7 = (Integer)var4[0];
			var5 = Class91.method3660(var7);
		}

		if (var5 != null) {
			method4053(var0, var5, var1, var2);
		}

	}

	@ObfInfo(owner = "ic", name = "aj", desc = "(Ldw;Ldm;III)V", opaque = "876437766")
	public static void method4053(Class101 var0, Class91 var1, int var2, int var3) {
		Object[] var5 = var0.field1333;
		Class85.field83 = 0;
		Class85.field1806 = 0;
		int var6 = -1;
		int[] var7 = var1.field1207;
		int[] var8 = var1.field1212;
		byte var9 = -1;
		field881 = 0;
		field886 = false;
		boolean var10 = false;
		int var11 = 0;
		boolean var23 = false;

		label860: {
			label861: {
				try {
					int var14;
					try {
						var23 = true;
						field878 = new int[var1.field1210];
						int var12 = 0;
						field1537 = new String[var1.field1211];
						int var28 = 0;

						int var15;
						String var38;
						for (var14 = 1; var14 < var5.length; ++var14) {
							if (var5[var14] instanceof Integer) {
								var15 = (Integer)var5[var14];
								if (var15 == -2147483647) {
									var15 = var0.field1326;
								}

								if (var15 == -2147483646) {
									var15 = var0.field1329;
								}

								if (var15 == -2147483645) {
									var15 = var0.field1325 != null ? var0.field1325.field3676 : -1;
								}

								if (var15 == -2147483644) {
									var15 = var0.field1328;
								}

								if (var15 == -2147483643) {
									var15 = var0.field1325 != null ? var0.field1325.field3791 : -1;
								}

								if (var15 == -2147483642) {
									var15 = var0.field1324 != null ? var0.field1324.field3676 : -1;
								}

								if (var15 == -2147483641) {
									var15 = var0.field1324 != null ? var0.field1324.field3791 : -1;
								}

								if (var15 == -2147483640) {
									var15 = var0.field1330;
								}

								if (var15 == -2147483639) {
									var15 = var0.field1332;
								}

								field878[var12++] = var15;
							} else if (var5[var14] instanceof String) {
								var38 = (String)var5[var14];
								if (var38.equals("event_opbase")) {
									var38 = var0.field1327;
								}

								field1537[var28++] = var38;
							}
						}

						field896 = var0.field1331;

						label841:
						while (true) {
							++var11;
							if (var11 > var2) {
								throw new RuntimeException();
							}

							++var6;
							int var26 = var7[var6];
							if (var26 >= 100) {
								boolean var37;
								if (var1.field1212[var6] == 1) {
									var37 = true;
								} else {
									var37 = false;
								}

								var15 = method3709(var26, var1, var37);
								switch(var15) {
								case 0:
									var23 = false;
									break label841;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var26 == 0) {
								field887[++Class85.field83 - 1] = var8[var6];
							} else if (var26 == 1) {
								var14 = var8[var6];
								field887[++Class85.field83 - 1] = Class351.field3889[var14];
							} else if (var26 == 2) {
								var14 = var8[var6];
								Class351.field3889[var14] = field887[--Class85.field83];
								Class140.method3138(var14);
							} else if (var26 == 3) {
								field880[++Class85.field1806 - 1] = var1.field1209[var6];
							} else if (var26 == 6) {
								var6 += var8[var6];
							} else if (var26 == 7) {
								Class85.field83 -= 2;
								if (field887[Class85.field83 + 1] != field887[Class85.field83]) {
									var6 += var8[var6];
								}
							} else if (var26 == 8) {
								Class85.field83 -= 2;
								if (field887[Class85.field83] == field887[1 + Class85.field83]) {
									var6 += var8[var6];
								}
							} else if (var26 == 9) {
								Class85.field83 -= 2;
								if (field887[Class85.field83] < field887[1 + Class85.field83]) {
									var6 += var8[var6];
								}
							} else if (var26 == 10) {
								Class85.field83 -= 2;
								if (field887[Class85.field83] > field887[Class85.field83 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 21) {
								if (0 == field881) {
									var23 = false;
									break label861;
								}

								Class70 var36 = field882[--field881];
								var1 = var36.field854;
								var7 = var1.field1207;
								var8 = var1.field1212;
								var6 = var36.field855;
								field878 = var36.field856;
								field1537 = var36.field860;
							} else if (var26 == 25) {
								var14 = var8[var6];
								field887[++Class85.field83 - 1] = Class351.method6175(var14);
							} else if (var26 == 27) {
								var14 = var8[var6];
								Class351.method2494(var14, field887[--Class85.field83]);
							} else if (var26 == 31) {
								Class85.field83 -= 2;
								if (field887[Class85.field83] <= field887[Class85.field83 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 32) {
								Class85.field83 -= 2;
								if (field887[Class85.field83] >= field887[1 + Class85.field83]) {
									var6 += var8[var6];
								}
							} else if (var26 == 33) {
								field887[++Class85.field83 - 1] = field878[var8[var6]];
							} else if (var26 == 34) {
								field878[var8[var6]] = field887[--Class85.field83];
							} else if (var26 == 35) {
								field880[++Class85.field1806 - 1] = field1537[var8[var6]];
							} else if (var26 == 36) {
								field1537[var8[var6]] = field880[--Class85.field1806];
							} else if (var26 == 37) {
								var14 = var8[var6];
								Class85.field1806 -= var14;
								var38 = Class412.method2925(field880, Class85.field1806, var14);
								field880[++Class85.field1806 - 1] = var38;
							} else if (var26 == 38) {
								--Class85.field83;
							} else if (var26 == 39) {
								--Class85.field1806;
							} else {
								int var18;
								if (var26 != 40) {
									if (var26 == 42) {
										field887[++Class85.field83 - 1] = Client.field3250.method2813(var8[var6]);
									} else if (var26 == 43) {
										Client.field3250.method2814(var8[var6], field887[--Class85.field83]);
									} else if (var26 == 44) {
										var14 = var8[var6] >> 16;
										var15 = var8[var6] & 65535;
										int var29 = field887[--Class85.field83];
										if (var29 < 0 || var29 > 5000) {
											throw new RuntimeException();
										}

										field877[var14] = var29;
										byte var32 = -1;
										if (var15 == 105) {
											var32 = 0;
										}

										for (var18 = 0; var18 < var29; ++var18) {
											field879[var14][var18] = var32;
										}
									} else if (var26 == 45) {
										var14 = var8[var6];
										var15 = field887[--Class85.field83];
										if (var15 < 0 || var15 >= field877[var14]) {
											throw new RuntimeException();
										}

										field887[++Class85.field83 - 1] = field879[var14][var15];
									} else if (var26 == 46) {
										var14 = var8[var6];
										Class85.field83 -= 2;
										var15 = field887[Class85.field83];
										if (var15 < 0 || var15 >= field877[var14]) {
											throw new RuntimeException();
										}

										field879[var14][var15] = field887[Class85.field83 + 1];
									} else {
										String var30;
										if (var26 == 47) {
											var30 = Client.field3250.method2819(var8[var6]);
											if (var30 == null) {
												var30 = Class378.field4152;
											}

											field880[++Class85.field1806 - 1] = var30;
										} else if (var26 == 48) {
											Client.field3250.method2815(var8[var6], field880[--Class85.field1806]);
										} else if (var26 == 49) {
											var30 = Client.field3250.method2854(var8[var6]);
											field880[++Class85.field1806 - 1] = var30;
										} else if (var26 == 50) {
											Client.field3250.method2828(var8[var6], field880[--Class85.field1806]);
										} else if (var26 == 60) {
											Class515 var33 = var1.field1214[var8[var6]];
											Class516 var41 = (Class516)var33.method9326((long)field887[--Class85.field83]);
											if (var41 != null) {
												var6 += var41.field5199;
											}
										} else {
											Integer var34;
											if (var26 == 74) {
												var34 = field3527.method3394(var8[var6]);
												if (var34 == null) {
													field887[++Class85.field83 - 1] = -1;
												} else {
													field887[++Class85.field83 - 1] = var34;
												}
											} else {
												if (var26 != 76) {
													throw new IllegalStateException();
												}

												var34 = Client.field242.method8964(var8[var6]);
												if (var34 == null) {
													field887[++Class85.field83 - 1] = -1;
												} else {
													field887[++Class85.field83 - 1] = var34;
												}
											}
										}
									}
								} else {
									var14 = var8[var6];
									Class91 var40 = Class91.method3660(var14);
									int[] var16 = new int[var40.field1210];
									String[] var17 = new String[var40.field1211];

									for (var18 = 0; var18 < var40.field1213; ++var18) {
										var16[var18] = field887[var18 + (Class85.field83 - var40.field1213)];
									}

									for (var18 = 0; var18 < var40.field1216; ++var18) {
										var17[var18] = field880[var18 + (Class85.field1806 - var40.field1216)];
									}

									Class85.field83 -= var40.field1213;
									Class85.field1806 -= var40.field1216;
									Class70 var35 = new Class70();
									var35.field854 = var1;
									var35.field855 = var6;
									var35.field856 = field878;
									var35.field860 = field1537;
									field882[++field881 - 1] = var35;
									var1 = var40;
									var7 = var40.field1207;
									var8 = var40.field1212;
									var6 = -1;
									field878 = var16;
									field1537 = var17;
								}
							}
						}
					} catch (Exception var24) {
						var10 = true;
						StringBuilder var13 = new StringBuilder(30);
						var13.append("").append(var1.field5170).append(" ");

						for (var14 = field881 - 1; var14 >= 0; --var14) {
							var13.append("").append(field882[var14].field854.field5170).append(" ");
						}

						var13.append("").append(var9);
						Class548.method8904(var13.toString(), var24);
						var23 = false;
						break label860;
					}
				} finally {
					if (var23) {
						while (field888.size() > 0) {
							Class118 var20 = (Class118)field888.remove(0);
							Client.method7098(var20.method2929(), var20.method2928(), var20.method2943(), var20.method2930(), "");
						}

						if (field886) {
							field886 = false;
							Class77.method2188();
						}

						if (!var10 && var3 > 0 && var11 >= var3) {
							Class548.method8904("Warning: Script " + var1.field1208 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (field888.size() > 0) {
					Class118 var31 = (Class118)field888.remove(0);
					Client.method7098(var31.method2929(), var31.method2928(), var31.method2943(), var31.method2930(), "");
				}

				if (field886) {
					field886 = false;
					Class77.method2188();
				}

				if (!var10 && var3 > 0 && var11 >= var3) {
					Class548.method8904("Warning: Script " + var1.field1208 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (field888.size() > 0) {
				Class118 var39 = (Class118)field888.remove(0);
				Client.method7098(var39.method2929(), var39.method2928(), var39.method2943(), var39.method2930(), "");
			}

			if (field886) {
				field886 = false;
				Class77.method2188();
			}

			if (!var10 && var3 > 0 && var11 >= var3) {
				Class548.method8904("Warning: Script " + var1.field1208 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (field888.size() > 0) {
			Class118 var27 = (Class118)field888.remove(0);
			Client.method7098(var27.method2929(), var27.method2928(), var27.method2943(), var27.method2930(), "");
		}

		if (field886) {
			field886 = false;
			Class77.method2188();
		}

		if (!var10 && var3 > 0 && var11 >= var3) {
			Class548.method8904("Warning: Script " + var1.field1208 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfInfo(owner = "hg", name = "az", desc = "(ILdm;ZI)I", opaque = "-117770958")
	public static int method3709(int var0, Class91 var1, boolean var2) {
		if (var0 < 1000) {
			return method6443(var0, var1, var2);
		} else if (var0 < 1100) {
			return method7558(var0, var1, var2);
		} else if (var0 < 1200) {
			return method6837(var0, var1, var2);
		} else if (var0 < 1300) {
			return method804(var0, var1, var2);
		} else if (var0 < 1400) {
			return Class451.method8420(var0, var1, var2);
		} else if (var0 < 1500) {
			return method3419(var0, var1, var2);
		} else if (var0 < 1600) {
			return method7764(var0, var1, var2);
		} else if (var0 < 1700) {
			return Class2.method24(var0, var1, var2);
		} else if (var0 < 1800) {
			return method8836(var0, var1, var2);
		} else if (var0 < 1900) {
			return method6162(var0, var1, var2);
		} else if (var0 < 2000) {
			return Class115.method2892(var0, var1, var2);
		} else if (var0 < 2100) {
			return method7558(var0, var1, var2);
		} else if (var0 < 2200) {
			return method6837(var0, var1, var2);
		} else if (var0 < 2300) {
			return method804(var0, var1, var2);
		} else if (var0 < 2400) {
			return Class451.method8420(var0, var1, var2);
		} else if (var0 < 2500) {
			return method3419(var0, var1, var2);
		} else if (var0 < 2600) {
			return method3237(var0, var1, var2);
		} else if (var0 < 2700) {
			return method2949(var0, var1, var2);
		} else if (var0 < 2800) {
			return method7190(var0, var1, var2);
		} else if (var0 < 2900) {
			return method5161(var0, var1, var2);
		} else if (var0 < 3000) {
			return Class115.method2892(var0, var1, var2);
		} else if (var0 < 3200) {
			return method7531(var0, var1, var2);
		} else if (var0 < 3300) {
			return method863(var0, var1, var2);
		} else if (var0 < 3400) {
			return method3585(var0, var1, var2);
		} else if (var0 < 3500) {
			return method6693(var0, var1, var2);
		} else if (var0 < 3600) {
			return method4760(var0, var1, var2);
		} else if (var0 < 3700) {
			return Class85.method2305(var0, var1, var2);
		} else if (var0 < 3800) {
			return method8552(var0, var1, var2);
		} else if (var0 < 3900) {
			return method3053(var0, var1, var2);
		} else if (var0 < 4000) {
			return method7202(var0, var1, var2);
		} else if (var0 < 4100) {
			return method8961(var0, var1, var2);
		} else if (var0 < 4200) {
			return method7966(var0, var1, var2);
		} else if (var0 < 4300) {
			return method8962(var0, var1, var2);
		} else if (var0 < 5100) {
			return method6271(var0, var1, var2);
		} else if (var0 < 5400) {
			return method190(var0, var1, var2);
		} else if (var0 < 5600) {
			return method3624(var0, var1, var2);
		} else if (var0 < 5700) {
			return method7380(var0, var1, var2);
		} else if (var0 < 6300) {
			return method6167(var0, var1, var2);
		} else if (var0 < 6600) {
			return method3753(var0, var1, var2);
		} else if (var0 < 6700) {
			return method327(var0, var1, var2);
		} else if (var0 < 6800) {
			return method69(var0, var1, var2);
		} else if (var0 < 6900) {
			return Class148.method3257(var0, var1, var2);
		} else if (var0 < 7000) {
			return method2947(var0, var1, var2);
		} else if (var0 < 7100) {
			return method7118(var0, var1, var2);
		} else if (var0 < 7200) {
			return method7378(var0, var1, var2);
		} else if (var0 < 7500) {
			return method7139(var0, var1, var2);
		} else if (var0 < 7600) {
			return Class223.method4223(var0, var1, var2);
		} else if (var0 < 7700) {
			return Class186.method3693(var0, var1, var2);
		} else {
			return var0 < 8100 ? method7810(var0, var1, var2) : 2;
		}
	}

	@ObfInfo(owner = "mw", name = "af", desc = "(ILdm;ZI)I", opaque = "-1171471756")
	public static int method6443(int var0, Class91 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 100) {
			Class85.field83 -= 3;
			var4 = field887[Class85.field83];
			var5 = field887[Class85.field83 + 1];
			int var12 = field887[Class85.field83 + 2];
			if (var5 == 0) {
				throw new RuntimeException();
			} else {
				Class340 var7 = Client.field25.method6718(var4);
				if (var7.field3745 == null) {
					var7.field3745 = new Class340[var12 + 1];
				}

				if (var7.field3745.length <= var12) {
					Class340[] var8 = new Class340[var12 + 1];

					for (int var9 = 0; var9 < var7.field3745.length; ++var9) {
						var8[var9] = var7.field3745[var9];
					}

					var7.field3745 = var8;
				}

				if (var12 > 0 && var7.field3745[var12 - 1] == null) {
					throw new RuntimeException("" + (var12 - 1));
				} else {
					Class340 var13 = new Class340();
					var13.field3755 = var5;
					var13.field3826 = var13.field3676 = var7.field3676;
					var13.field3791 = var12;
					var13.field3675 = true;
					if (var5 == 12) {
						var13.method6529();
						var13.method6530().method6800(new Class112(var13));
						var13.method6530().method6799(new Class126(var13));
					}

					var7.field3745[var12] = var13;
					if (var2) {
						field892 = var13;
					} else {
						field88 = var13;
					}

					Class317.method6187(var7);
					return 1;
				}
			}
		} else {
			Class340 var10;
			if (var0 == 101) {
				var10 = var2 ? field892 : field88;
				Class340 var11 = Client.field25.method6718(var10.field3676);
				var11.field3745[var10.field3791] = null;
				Class317.method6187(var11);
				return 1;
			} else if (var0 == 102) {
				var10 = Client.field25.method6718(field887[--Class85.field83]);
				var10.field3745 = null;
				Class317.method6187(var10);
				return 1;
			} else if (var0 != 200) {
				if (var0 == 201) {
					var10 = Client.field25.method6718(field887[--Class85.field83]);
					if (var10 != null) {
						field887[++Class85.field83 - 1] = 1;
						if (var2) {
							field892 = var10;
						} else {
							field88 = var10;
						}
					} else {
						field887[++Class85.field83 - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				Class85.field83 -= 2;
				var4 = field887[Class85.field83];
				var5 = field887[1 + Class85.field83];
				Class340 var6 = Client.field25.method6721(var4, var5);
				if (var6 != null && var5 != -1) {
					field887[++Class85.field83 - 1] = 1;
					if (var2) {
						field892 = var6;
					} else {
						field88 = var6;
					}
				} else {
					field887[++Class85.field83 - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfInfo(owner = "po", name = "aa", desc = "(ILdm;ZB)I", opaque = "1")
	public static int method7558(int var0, Class91 var1, boolean var2) {
		int var4 = -1;
		Class340 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = field887[--Class85.field83];
			var5 = Client.field25.method6718(var4);
		} else {
			var5 = var2 ? field892 : field88;
		}

		if (var0 == 1000) {
			Class85.field83 -= 4;
			var5.field3686 = field887[Class85.field83];
			var5.field3687 = field887[1 + Class85.field83];
			var5.field3682 = field887[2 + Class85.field83];
			var5.field3683 = field887[3 + Class85.field83];
			Class317.method6187(var5);
			Client.field2077.method1224(var5);
			if (var4 != -1 && var5.field3755 == 0) {
				Client.method3152(Client.field25.field3877[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == 1001) {
			Class85.field83 -= 4;
			var5.field3728 = field887[Class85.field83];
			var5.field3707 = field887[1 + Class85.field83];
			var5.field3778 = field887[Class85.field83 + 2];
			var5.field3685 = field887[Class85.field83 + 3];
			Class317.method6187(var5);
			Client.field2077.method1224(var5);
			if (var4 != -1 && var5.field3755 == 0) {
				Client.method3152(Client.field25.field3877[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == 1003) {
			boolean var6 = field887[--Class85.field83] == 1;
			if (var5.field3775 != var6) {
				var5.field3775 = var6;
				Class317.method6187(var5);
			}

			return 1;
		} else if (var0 == 1005) {
			var5.field3824 = field887[--Class85.field83] == 1;
			return 1;
		} else if (var0 == 1006) {
			var5.field3825 = field887[--Class85.field83] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "np", name = "at", desc = "(ILdm;ZI)I", opaque = "956879990")
	public static int method6837(int var0, Class91 var1, boolean var2) {
		int var5 = -1;
		Class340 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = field887[--Class85.field83];
			var4 = Client.field25.method6718(var5);
		} else {
			var4 = var2 ? field892 : field88;
		}

		int var24;
		if (var0 == 1100) {
			Class85.field83 -= 2;
			var24 = field887[Class85.field83];
			int var20 = field887[Class85.field83 + 1];
			if (var4.field3755 == 12) {
				Class354 var17 = var4.method6530();
				if (var17 != null && var17.method6985(var24, var20)) {
					Class317.method6187(var4);
				}
			} else {
				var4.field3698 = var24;
				if (var4.field3698 > var4.field3800 - var4.field3692) {
					var4.field3698 = var4.field3800 - var4.field3692;
				}

				if (var4.field3698 < 0) {
					var4.field3698 = 0;
				}

				var4.field3699 = var20;
				if (var4.field3699 > var4.field3701 - var4.field3736) {
					var4.field3699 = var4.field3701 - var4.field3736;
				}

				if (var4.field3699 < 0) {
					var4.field3699 = 0;
				}

				Class317.method6187(var4);
			}

			return 1;
		} else if (var0 == 1101) {
			var4.field3702 = field887[--Class85.field83];
			Class317.method6187(var4);
			return 1;
		} else if (var0 == 1102) {
			var4.field3706 = field887[--Class85.field83] == 1;
			Class317.method6187(var4);
			return 1;
		} else if (var0 == 1103) {
			var4.field3708 = field887[--Class85.field83];
			Class317.method6187(var4);
			return 1;
		} else if (var0 == 1104) {
			var4.field3754 = field887[--Class85.field83];
			Class317.method6187(var4);
			return 1;
		} else if (var0 == 1105) {
			var4.field3712 = field887[--Class85.field83];
			Class317.method6187(var4);
			return 1;
		} else if (var0 == 1106) {
			var4.field3777 = field887[--Class85.field83];
			Class317.method6187(var4);
			return 1;
		} else if (var0 == 1107) {
			var4.field3693 = field887[--Class85.field83] == 1;
			Class317.method6187(var4);
			return 1;
		} else if (var0 == 1108) {
			var4.field3792 = 1;
			var4.field3722 = field887[--Class85.field83];
			Class317.method6187(var4);
			return 1;
		} else if (var0 == 1109) {
			Class85.field83 -= 6;
			var4.field3769 = field887[Class85.field83];
			var4.field3784 = field887[Class85.field83 + 1];
			var4.field3729 = field887[2 + Class85.field83];
			var4.field3814 = field887[3 + Class85.field83];
			var4.field3731 = field887[Class85.field83 + 4];
			var4.field3732 = field887[Class85.field83 + 5];
			Class317.method6187(var4);
			return 1;
		} else if (var0 == 1110) {
			var24 = field887[--Class85.field83];
			if (var4.field3725 != var24) {
				var4.field3725 = var24;
				var4.field3812 = 0;
				var4.field3813 = 0;
				Class317.method6187(var4);
			}

			return 1;
		} else if (var0 == 1111) {
			var4.field3700 = field887[--Class85.field83] == 1;
			Class317.method6187(var4);
			return 1;
		} else {
			String var14;
			Class354 var16;
			if (var0 == 1112) {
				var14 = field880[--Class85.field1806];
				if (var4.field3755 == 12) {
					var16 = var4.method6530();
					if (var16 != null && var16.method6809()) {
						var16.method6755(var14);
					} else {
						var4.field3740 = var14;
					}

					Class317.method6187(var4);
				} else if (!var14.equals(var4.field3740)) {
					var4.field3740 = var14;
					Class317.method6187(var4);
				}

				return 1;
			} else {
				Class354 var21;
				if (var0 == 1113) {
					var4.field3739 = field887[--Class85.field83];
					if (12 == var4.field3755) {
						var21 = var4.method6530();
						if (var21 != null) {
							var21.method6898();
						}
					}

					Class317.method6187(var4);
					return 1;
				} else if (var0 == 1114) {
					Class85.field83 -= 3;
					if (12 == var4.field3755) {
						var21 = var4.method6530();
						if (var21 != null) {
							var21.method6763(field887[Class85.field83], field887[1 + Class85.field83]);
							var21.method6764(field887[2 + Class85.field83]);
						}
					} else {
						var4.field3743 = field887[Class85.field83];
						var4.field3744 = field887[1 + Class85.field83];
						var4.field3757 = field887[Class85.field83 + 2];
					}

					Class317.method6187(var4);
					return 1;
				} else if (var0 == 1115) {
					var4.field3751 = field887[--Class85.field83] == 1;
					Class317.method6187(var4);
					return 1;
				} else if (var0 == 1116) {
					var4.field3694 = field887[--Class85.field83];
					Class317.method6187(var4);
					return 1;
				} else if (var0 == 1117) {
					var4.field3718 = field887[--Class85.field83];
					Class317.method6187(var4);
					return 1;
				} else if (var0 == 1118) {
					var4.field3719 = field887[--Class85.field83] == 1;
					Class317.method6187(var4);
					return 1;
				} else if (var0 == 1119) {
					var4.field3720 = field887[--Class85.field83] == 1;
					Class317.method6187(var4);
					return 1;
				} else if (var0 == 1120) {
					Class85.field83 -= 2;
					var4.field3800 = field887[Class85.field83];
					var4.field3701 = field887[Class85.field83 + 1];
					Class317.method6187(var4);
					if (var5 != -1 && 0 == var4.field3755) {
						Client.method3152(Client.field25.field3877[var5 >> 16], var4, false);
					}

					return 1;
				} else if (var0 == 1121) {
					Client.method844(var4.field3676, var4.field3791);
					Client.field533 = var4;
					Class317.method6187(var4);
					return 1;
				} else if (var0 == 1122) {
					var4.field3713 = field887[--Class85.field83];
					Class317.method6187(var4);
					return 1;
				} else if (var0 == 1123) {
					var4.field3703 = field887[--Class85.field83];
					Class317.method6187(var4);
					return 1;
				} else if (var0 == 1124) {
					var4.field3709 = field887[--Class85.field83];
					Class317.method6187(var4);
					return 1;
				} else if (var0 == 1125) {
					var24 = field887[--Class85.field83];
					Class558 var18 = (Class558)Class62.method1112(Class558.method7193(), var24);
					if (var18 != null) {
						var4.field3670 = var18;
						Class317.method6187(var4);
					}

					return 1;
				} else {
					boolean var22;
					if (var0 == 1126) {
						var22 = field887[--Class85.field83] == 1;
						var4.field3711 = var22;
						return 1;
					} else if (var0 == 1127) {
						var22 = field887[--Class85.field83] == 1;
						var4.field3737 = var22;
						return 1;
					} else if (var0 == 1129) {
						var4.field3714 = field880[--Class85.field1806];
						Class317.method6187(var4);
						return 1;
					} else if (var0 == 1130) {
						var4.method6596(field880[--Class85.field1806], "", Client.field3381, Client.method2242());
						return 1;
					} else if (var0 == 1131) {
						Class85.field83 -= 2;
						var4.method6516(field887[Class85.field83], field887[Class85.field83 + 1]);
						return 1;
					} else if (var0 == 1132) {
						var4.method6517(field880[--Class85.field1806], field887[--Class85.field83]);
						return 1;
					} else {
						Class364 var23;
						if (var0 == 1133) {
							--Class85.field83;
							var23 = var4.method6531();
							if (var23 != null) {
								var23.field3979 = field887[Class85.field83];
								Class317.method6187(var4);
							}

							return 1;
						} else if (var0 == 1134) {
							--Class85.field83;
							var23 = var4.method6531();
							if (var23 != null) {
								var23.field3980 = field887[Class85.field83];
								Class317.method6187(var4);
							}

							return 1;
						} else if (var0 == 1135) {
							--Class85.field1806;
							var21 = var4.method6530();
							if (var21 != null) {
								var4.field3741 = field880[Class85.field1806];
							}

							return 1;
						} else if (var0 == 1136) {
							--Class85.field83;
							var23 = var4.method6531();
							if (var23 != null) {
								var23.field3981 = field887[Class85.field83];
								Class317.method6187(var4);
							}

							return 1;
						} else if (var0 == 1137) {
							--Class85.field83;
							var21 = var4.method6530();
							if (var21 != null && var21.method6759(field887[Class85.field83])) {
								Class317.method6187(var4);
							}

							return 1;
						} else if (var0 == 1138) {
							--Class85.field83;
							var21 = var4.method6530();
							if (var21 != null && var21.method6957(field887[Class85.field83])) {
								Class317.method6187(var4);
							}

							return 1;
						} else if (var0 == 1139) {
							--Class85.field83;
							var21 = var4.method6530();
							if (var21 != null && var21.method6761(field887[Class85.field83])) {
								Class317.method6187(var4);
							}

							return 1;
						} else if (var0 == 1140) {
							var22 = field887[--Class85.field83] == 1;
							Client.field510.method4070();
							var16 = var4.method6530();
							if (var16 != null && var16.method6753(var22)) {
								if (var22) {
									Client.field510.method4068(var4);
								}

								Class317.method6187(var4);
							}

							return 1;
						} else if (var0 == 1141) {
							var22 = field887[--Class85.field83] == 1;
							if (!var22 && Client.field510.method4069() == var4) {
								Client.field510.method4070();
								Class317.method6187(var4);
							}

							var16 = var4.method6530();
							if (var16 != null) {
								var16.method6876(var22);
							}

							return 1;
						} else if (var0 == 1142) {
							Class85.field83 -= 2;
							var21 = var4.method6530();
							if (var21 != null && var21.method7023(field887[Class85.field83], field887[1 + Class85.field83])) {
								Class317.method6187(var4);
							}

							return 1;
						} else if (var0 == 1143) {
							--Class85.field83;
							var21 = var4.method6530();
							if (var21 != null && var21.method7023(field887[Class85.field83], field887[Class85.field83])) {
								Class317.method6187(var4);
							}

							return 1;
						} else if (var0 == 1144) {
							--Class85.field83;
							var21 = var4.method6530();
							if (var21 != null) {
								var21.method6766(field887[Class85.field83]);
								Class317.method6187(var4);
							}

							return 1;
						} else if (var0 == 1145) {
							--Class85.field83;
							var21 = var4.method6530();
							if (var21 != null) {
								var21.method6765(field887[Class85.field83]);
							}

							return 1;
						} else if (var0 == 1146) {
							--Class85.field83;
							var21 = var4.method6530();
							if (var21 != null) {
								var21.method6768(field887[Class85.field83]);
							}

							return 1;
						} else if (var0 == 1147) {
							--Class85.field83;
							var21 = var4.method6530();
							if (var21 != null) {
								var21.method6767(field887[Class85.field83]);
								Class317.method6187(var4);
							}

							return 1;
						} else {
							Class32 var19;
							if (var0 == 1148) {
								Class85.field83 -= 2;
								var19 = var4.method6629();
								if (var19 != null) {
									var19.method641(field887[Class85.field83], field887[Class85.field83 + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								Class85.field83 -= 2;
								var19 = var4.method6629();
								if (var19 != null) {
									var19.method642((char)field887[Class85.field83], field887[1 + Class85.field83]);
								}

								return 1;
							} else if (var0 == 1150) {
								var4.method6514(field880[--Class85.field1806], Client.field3381);
								return 1;
							} else if (var0 == 1151) {
								Class85.field1806 -= 3;
								var14 = field880[Class85.field1806];
								String var15 = field880[1 + Class85.field1806];
								String var8 = field880[Class85.field1806 + 2];
								long var9 = Client.method2242();
								long var11 = Client.method3062();
								String var13 = Client.method2951().method9219(Client.method2951().field5106);
								if (-1L != var9) {
									var14 = var14.replaceAll("%userid%", Long.toString(var9));
								}

								if (var11 != -1L) {
									var14 = var14.replaceAll("%userhash%", Long.toString(var11));
								}

								if (!var13.isEmpty()) {
									var14 = var14.replaceAll("%deviceid%", var13);
								}

								var4.method6513(var14, var15, var8, var13, Long.toString(var11), Client.field3381);
								return 1;
							} else if (var0 == 1152) {
								if (var4.field3755 != 11) {
									throw new RuntimeException();
								} else {
									Class164 var6 = var4.method6526();
									boolean var7 = var6 != null && Class191.method3562().method3743(var6.method3438());
									field887[++Class85.field83 - 1] = var7 ? 1 : 0;
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

	@ObfInfo(owner = "bo", name = "ab", desc = "(ILdm;ZI)I", opaque = "-1019616391")
	public static int method804(int var0, Class91 var1, boolean var2) {
		Class340 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Client.field25.method6718(field887[--Class85.field83]);
		} else {
			var4 = var2 ? field892 : field88;
		}

		Class317.method6187(var4);
		int var5;
		int var6;
		if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
			if (var0 == 1201) {
				var4.field3792 = 2;
				var4.field3722 = field887[--Class85.field83];
				return 1;
			} else if (var0 == 1202) {
				var4.field3792 = 3;
				var4.field3722 = Client.field107.field1029.method7054();
				return 1;
			} else if (var0 == 1207) {
				boolean var8 = field887[--Class85.field83] == 1;
				Class340.method1841(var4, Client.field107.field1029, var8);
				return 1;
			} else if (var0 == 1208) {
				var5 = field887[--Class85.field83];
				if (var4.field3764 == null) {
					throw new RuntimeException("");
				} else {
					Class83.method2274(var4, var5);
					return 1;
				}
			} else if (var0 == 1209) {
				Class85.field83 -= 2;
				var5 = field887[Class85.field83];
				var6 = field887[Class85.field83 + 1];
				if (var4.field3764 == null) {
					throw new RuntimeException("");
				} else {
					Class340.method4772(var4, var5, var6);
					return 1;
				}
			} else if (var0 == 1210) {
				var5 = field887[--Class85.field83];
				if (var4.field3764 == null) {
					throw new RuntimeException("");
				} else {
					Class374.method7189(var4, Client.field107.field1029.field3946, var5);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			Class85.field83 -= 2;
			var5 = field887[Class85.field83];
			var6 = field887[1 + Class85.field83];
			var4.field3810 = var5;
			var4.field3811 = var6;
			Class232 var7 = Class232.method109(var5);
			var4.field3729 = var7.field2456;
			var4.field3814 = var7.field2480;
			var4.field3731 = var7.field2457;
			var4.field3769 = var7.field2459;
			var4.field3784 = var7.field2442;
			var4.field3732 = var7.field2455;
			if (var0 == 1205) {
				var4.field3738 = 0;
			} else if (var0 == 1212 | var7.field2462 == 1) {
				var4.field3738 = 1;
			} else {
				var4.field3738 = 2;
			}

			if (var4.field3733 > 0) {
				var4.field3732 = var4.field3732 * 32 / var4.field3733;
			} else if (var4.field3728 > 0) {
				var4.field3732 = var4.field3732 * 32 / var4.field3728;
			}

			return 1;
		}
	}

	@ObfInfo(owner = "nk", name = "ao", desc = "(Lnb;I[B[BI)V", opaque = "-1795281107")
	public static void method6717(Class340 var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3753 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3753 = new byte[11][];
			var0.field3735 = new byte[11][];
			var0.field3697 = new int[11];
			var0.field3756 = new int[11];
		}

		var0.field3753[var1] = var2;
		if (var2 != null) {
			var0.field3730 = true;
		} else {
			var0.field3730 = false;

			for (int var5 = 0; var5 < var0.field3753.length; ++var5) {
				if (var0.field3753[var5] != null) {
					var0.field3730 = true;
					break;
				}
			}
		}

		var0.field3735[var1] = var3;
	}

	@ObfInfo(owner = "hd", name = "ah", desc = "(Lnb;IIII)V", opaque = "-1281338571")
	public static void method3690(Class340 var0, int var1, int var2, int var3) {
		if (var0.field3697 == null) {
			throw new RuntimeException();
		} else {
			var0.field3697[var1] = var2;
			var0.field3756[var1] = var3;
		}
	}

	@ObfInfo(owner = "dr", name = "av", desc = "(Lnb;II)V", opaque = "-1992565034")
	public static void method2493(Class340 var0, int var1) {
		if (var0.field3753 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3684 == null) {
				var0.field3684 = new int[var0.field3753.length];
			}

			var0.field3684[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfInfo(owner = "gg", name = "aq", desc = "(ILdm;ZI)I", opaque = "-1973737786")
	public static int method3419(int var0, Class91 var1, boolean var2) {
		Class340 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Client.field25.method6718(field887[--Class85.field83]);
		} else {
			var4 = var2 ? field892 : field88;
		}

		String var5 = field880[--Class85.field1806];
		int[] var6 = null;
		if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
			int var7 = field887[--Class85.field83];
			if (var7 > 0) {
				for (var6 = new int[var7]; var7-- > 0; var6[var7] = field887[--Class85.field83]) {
				}
			}

			var5 = var5.substring(0, var5.length() - 1);
		}

		Object[] var10 = new Object[var5.length() + 1];

		int var8;
		for (var8 = var10.length - 1; var8 >= 1; --var8) {
			if (var5.charAt(var8 - 1) == 's') {
				var10[var8] = field880[--Class85.field1806];
			} else {
				var10[var8] = new Integer(field887[--Class85.field83]);
			}
		}

		var8 = field887[--Class85.field83];
		if (var8 != -1) {
			var10[0] = new Integer(var8);
		} else {
			var10 = null;
		}

		if (var0 == 1400) {
			var4.field3818 = var10;
		} else if (var0 == 1401) {
			var4.field3663 = var10;
		} else if (var0 == 1402) {
			var4.field3768 = var10;
		} else if (var0 == 1403) {
			var4.field3820 = var10;
		} else if (var0 == 1404) {
			var4.field3772 = var10;
		} else if (var0 == 1405) {
			var4.field3773 = var10;
		} else if (var0 == 1406) {
			var4.field3776 = var10;
		} else if (var0 == 1407) {
			var4.field3827 = var10;
			var4.field3781 = var6;
		} else if (var0 == 1408) {
			var4.field3783 = var10;
		} else if (var0 == 1409) {
			var4.field3672 = var10;
		} else if (var0 == 1410) {
			var4.field3774 = var10;
		} else if (var0 == 1411) {
			var4.field3767 = var10;
		} else if (var0 == 1412) {
			var4.field3771 = var10;
		} else if (var0 == 1414) {
			var4.field3779 = var10;
			var4.field3780 = var6;
		} else if (var0 == 1415) {
			var4.field3715 = var10;
			var4.field3782 = var6;
		} else if (var0 == 1416) {
			var4.field3688 = var10;
		} else if (var0 == 1417) {
			var4.field3680 = var10;
		} else if (var0 == 1418) {
			var4.field3798 = var10;
		} else if (var0 == 1419) {
			var4.field3689 = var10;
		} else if (var0 == 1420) {
			var4.field3721 = var10;
		} else if (var0 == 1421) {
			var4.field3727 = var10;
		} else if (var0 == 1422) {
			var4.field3795 = var10;
		} else if (var0 == 1423) {
			var4.field3796 = var10;
		} else if (var0 == 1424) {
			var4.field3797 = var10;
		} else if (var0 == 1425) {
			var4.field3799 = var10;
		} else if (var0 == 1426) {
			var4.field3766 = var10;
		} else if (var0 == 1427) {
			var4.field3802 = var10;
		} else if (var0 == 1428) {
			var4.field3793 = var10;
		} else if (var0 == 1429) {
			var4.field3794 = var10;
		} else if (var0 == 1430) {
			var4.field3789 = var10;
		} else if (var0 == 1431) {
			var4.field3790 = var10;
		} else if (var0 == 1434) {
			var4.field3801 = var10;
		} else if (var0 == 1435) {
			var4.field3819 = var10;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			Class352 var9 = var4.method6533();
			if (var9 != null) {
				if (var0 == 1436) {
					var9.field3898 = var10;
				} else if (var0 == 1437) {
					var9.field3894 = var10;
				} else if (var0 == 1438) {
					var9.field3897 = var10;
				} else if (var0 == 1439) {
					var9.field3895 = var10;
				}
			}
		}

		var4.field3822 = true;
		return 1;
	}

	@ObfInfo(owner = "pz", name = "ap", desc = "(ILdm;ZI)I", opaque = "209873879")
	public static int method7764(int var0, Class91 var1, boolean var2) {
		Class340 var4 = var2 ? field892 : field88;
		if (var0 == 1500) {
			field887[++Class85.field83 - 1] = var4.field3705;
			return 1;
		} else if (var0 == 1501) {
			field887[++Class85.field83 - 1] = var4.field3691;
			return 1;
		} else if (var0 == 1502) {
			field887[++Class85.field83 - 1] = var4.field3692;
			return 1;
		} else if (var0 == 1503) {
			field887[++Class85.field83 - 1] = var4.field3736;
			return 1;
		} else if (var0 == 1504) {
			field887[++Class85.field83 - 1] = var4.field3775 ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			field887[++Class85.field83 - 1] = var4.field3826;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "sm", name = "ax", desc = "(ILdm;ZB)I", opaque = "6")
	public static int method8836(int var0, Class91 var1, boolean var2) {
		Class340 var4 = var2 ? field892 : field88;
		if (var0 == 1700) {
			field887[++Class85.field83 - 1] = var4.field3810;
			return 1;
		} else if (var0 == 1701) {
			if (var4.field3810 != -1) {
				field887[++Class85.field83 - 1] = var4.field3811;
			} else {
				field887[++Class85.field83 - 1] = 0;
			}

			return 1;
		} else if (var0 == 1702) {
			field887[++Class85.field83 - 1] = var4.field3791;
			return 1;
		} else if (var0 == 1707) {
			field887[++Class85.field83 - 1] = var4.method6519() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return Class199.method3888(var4);
		} else {
			return var0 == 1709 ? method6300(var4) : 2;
		}
	}

	@ObfInfo(owner = "mt", name = "au", desc = "(Lnb;I)I", opaque = "-1593981666")
	public static int method6300(Class340 var0) {
		if (var0.field3755 != 11) {
			field880[Class85.field1806 - 1] = "";
			return 1;
		} else {
			String var2 = field880[--Class85.field1806];
			field880[++Class85.field1806 - 1] = var0.method6521(var2);
			return 1;
		}
	}

	@ObfInfo(owner = "ly", name = "as", desc = "(ILdm;ZB)I", opaque = "4")
	public static int method6162(int var0, Class91 var1, boolean var2) {
		Class340 var4 = var2 ? field892 : field88;
		if (var0 == 1800) {
			field887[++Class85.field83 - 1] = Class344.method3653(Client.method3511(var4));
			return 1;
		} else if (var0 != 1801) {
			if (var0 == 1802) {
				if (var4.field3785 == null) {
					field880[++Class85.field1806 - 1] = "";
				} else {
					field880[++Class85.field1806 - 1] = var4.field3785;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = field887[--Class85.field83];
			--var5;
			if (var4.field3758 != null && var5 < var4.field3758.length && null != var4.field3758[var5]) {
				field880[++Class85.field1806 - 1] = var4.field3758[var5];
			} else {
				field880[++Class85.field1806 - 1] = "";
			}

			return 1;
		}
	}

	@ObfInfo(owner = "fp", name = "ad", desc = "(ILdm;ZI)I", opaque = "1467609227")
	public static int method3237(int var0, Class91 var1, boolean var2) {
		Class340 var4 = Client.field25.method6718(field887[--Class85.field83]);
		if (var0 == 2500) {
			field887[++Class85.field83 - 1] = var4.field3705;
			return 1;
		} else if (var0 == 2501) {
			field887[++Class85.field83 - 1] = var4.field3691;
			return 1;
		} else if (var0 == 2502) {
			field887[++Class85.field83 - 1] = var4.field3692;
			return 1;
		} else if (var0 == 2503) {
			field887[++Class85.field83 - 1] = var4.field3736;
			return 1;
		} else if (var0 == 2504) {
			field887[++Class85.field83 - 1] = var4.field3775 ? 1 : 0;
			return 1;
		} else if (var0 == 2505) {
			field887[++Class85.field83 - 1] = var4.field3826;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "eo", name = "ai", desc = "(ILdm;ZI)I", opaque = "-683111114")
	public static int method2949(int var0, Class91 var1, boolean var2) {
		Class340 var4 = Client.field25.method6718(field887[--Class85.field83]);
		if (var0 == 2600) {
			field887[++Class85.field83 - 1] = var4.field3698;
			return 1;
		} else if (var0 == 2601) {
			field887[++Class85.field83 - 1] = var4.field3699;
			return 1;
		} else if (var0 == 2602) {
			field880[++Class85.field1806 - 1] = var4.field3740;
			return 1;
		} else if (var0 == 2603) {
			field887[++Class85.field83 - 1] = var4.field3800;
			return 1;
		} else if (var0 == 2604) {
			field887[++Class85.field83 - 1] = var4.field3701;
			return 1;
		} else if (var0 == 2605) {
			field887[++Class85.field83 - 1] = var4.field3732;
			return 1;
		} else if (var0 == 2606) {
			field887[++Class85.field83 - 1] = var4.field3729;
			return 1;
		} else if (var0 == 2607) {
			field887[++Class85.field83 - 1] = var4.field3731;
			return 1;
		} else if (var0 == 2608) {
			field887[++Class85.field83 - 1] = var4.field3814;
			return 1;
		} else if (var0 == 2609) {
			field887[++Class85.field83 - 1] = var4.field3708;
			return 1;
		} else if (var0 == 2610) {
			field887[++Class85.field83 - 1] = var4.field3709;
			return 1;
		} else if (var0 == 2611) {
			field887[++Class85.field83 - 1] = var4.field3702;
			return 1;
		} else if (var0 == 2612) {
			field887[++Class85.field83 - 1] = var4.field3703;
			return 1;
		} else if (var0 == 2613) {
			field887[++Class85.field83 - 1] = var4.field3670.method175();
			return 1;
		} else if (var0 == 2614) {
			field887[++Class85.field83 - 1] = var4.field3737 ? 1 : 0;
			return 1;
		} else {
			Class364 var5;
			if (var0 == 2617) {
				var5 = var4.method6531();
				field887[++Class85.field83 - 1] = var5 != null ? var5.field3979 : 0;
			}

			if (var0 == 2618) {
				var5 = var4.method6531();
				field887[++Class85.field83 - 1] = var5 != null ? var5.field3980 : 0;
				return 1;
			} else {
				Class354 var8;
				if (var0 == 2619) {
					var8 = var4.method6530();
					field880[++Class85.field1806 - 1] = var8 != null ? var8.method6802().method8125() : "";
					return 1;
				} else if (var0 == 2620) {
					var5 = var4.method6531();
					field887[++Class85.field83 - 1] = var5 != null ? var5.field3981 : 0;
					return 1;
				} else if (var0 == 2621) {
					var8 = var4.method6530();
					field887[++Class85.field83 - 1] = var8 != null ? var8.method6812() : 0;
					return 1;
				} else if (var0 == 2622) {
					var8 = var4.method6530();
					field887[++Class85.field83 - 1] = var8 != null ? var8.method6813() : 0;
					return 1;
				} else if (var0 == 2623) {
					var8 = var4.method6530();
					field887[++Class85.field83 - 1] = var8 != null ? var8.method6814() : 0;
					return 1;
				} else if (var0 == 2624) {
					var8 = var4.method6530();
					field887[++Class85.field83 - 1] = var8 != null && var8.method6929() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var8 = var4.method6530();
						field880[++Class85.field1806 - 1] = var8 != null ? var8.method6803().method8113() : "";
						return 1;
					} else if (var0 == 2627) {
						var8 = var4.method6530();
						int var6 = var8 != null ? var8.method6958() : 0;
						int var7 = var8 != null ? var8.method6807() : 0;
						field887[++Class85.field83 - 1] = Math.min(var6, var7);
						field887[++Class85.field83 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 2628) {
						var8 = var4.method6530();
						field887[++Class85.field83 - 1] = var8 != null ? var8.method6807() : 0;
						return 1;
					} else if (var0 == 2629) {
						var8 = var4.method6530();
						field887[++Class85.field83 - 1] = var8 != null ? var8.method6816() : 0;
						return 1;
					} else if (var0 == 2630) {
						var8 = var4.method6530();
						field887[++Class85.field83 - 1] = var8 != null ? var8.method6815() : 0;
						return 1;
					} else if (var0 == 2631) {
						var8 = var4.method6530();
						field887[++Class85.field83 - 1] = var8 != null ? var8.method6817() : 0;
						return 1;
					} else if (var0 == 2632) {
						var8 = var4.method6530();
						field887[++Class85.field83 - 1] = var8 != null ? var8.method6934() : 0;
						return 1;
					} else {
						Class32 var9;
						if (var0 == 2633) {
							var9 = var4.method6629();
							field887[Class85.field83 - 1] = var9 != null ? var9.method660(field887[Class85.field83 - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var9 = var4.method6629();
							field887[Class85.field83 - 1] = var9 != null ? var9.method646((char)field887[Class85.field83 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method6530();
					field887[++Class85.field83 - 1] = var8 != null && var8.method6867() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfInfo(owner = "ol", name = "an", desc = "(ILdm;ZB)I", opaque = "2")
	public static int method7190(int var0, Class91 var1, boolean var2) {
		Class340 var4;
		if (var0 == 2700) {
			var4 = Client.field25.method6718(field887[--Class85.field83]);
			field887[++Class85.field83 - 1] = var4.field3810;
			return 1;
		} else if (var0 == 2701) {
			var4 = Client.field25.method6718(field887[--Class85.field83]);
			if (-1 != var4.field3810) {
				field887[++Class85.field83 - 1] = var4.field3811;
			} else {
				field887[++Class85.field83 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2702) {
			int var6 = field887[--Class85.field83];
			Class104 var5 = (Class104)Client.field654.method9361((long)var6);
			if (var5 != null) {
				field887[++Class85.field83 - 1] = 1;
			} else {
				field887[++Class85.field83 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2706) {
			field887[++Class85.field83 - 1] = Client.field740;
			return 1;
		} else if (var0 == 2707) {
			var4 = Client.field25.method6718(field887[--Class85.field83]);
			field887[++Class85.field83 - 1] = var4.method6519() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var4 = Client.field25.method6718(field887[--Class85.field83]);
			return Class199.method3888(var4);
		} else if (var0 == 2709) {
			var4 = Client.field25.method6718(field887[--Class85.field83]);
			return method6300(var4);
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "ka", name = "am", desc = "(ILdm;ZI)I", opaque = "1473340524")
	public static int method5161(int var0, Class91 var1, boolean var2) {
		Class340 var4 = Client.field25.method6718(field887[--Class85.field83]);
		if (var0 == 2800) {
			field887[++Class85.field83 - 1] = Class344.method3653(Client.method3511(var4));
			return 1;
		} else if (var0 != 2801) {
			if (var0 == 2802) {
				if (var4.field3785 == null) {
					field880[++Class85.field1806 - 1] = "";
				} else {
					field880[++Class85.field1806 - 1] = var4.field3785;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = field887[--Class85.field83];
			--var5;
			if (var4.field3758 != null && var5 < var4.field3758.length && null != var4.field3758[var5]) {
				field880[++Class85.field1806 - 1] = var4.field3758[var5];
			} else {
				field880[++Class85.field1806 - 1] = "";
			}

			return 1;
		}
	}

	@ObfInfo(owner = "pl", name = "ar", desc = "(ILdm;ZI)I", opaque = "-2005168863")
	public static int method7531(int var0, Class91 var1, boolean var2) {
		String var14;
		if (var0 == 3100) {
			var14 = field880[--Class85.field1806];
			Class128.method2747(0, "", var14);
			return 1;
		} else if (var0 == 3101) {
			Class85.field83 -= 2;
			Client.method3578(Client.field107, field887[Class85.field83], field887[Class85.field83 + 1]);
			return 1;
		} else if (var0 == 3103) {
			if (!field890) {
				field886 = true;
			}

			return 1;
		} else {
			int var11;
			if (var0 == 3104) {
				var14 = field880[--Class85.field1806];
				var11 = 0;
				if (Class412.method3873(var14)) {
					var11 = Class412.method3402(var14);
				}

				Class316 var15 = Class316.method3908(Class315.field3313, Client.field548.field1446);
				var15.field3374.method9590(var11);
				Client.field548.method2897(var15);
				return 1;
			} else {
				Class316 var9;
				if (var0 == 3105) {
					var14 = field880[--Class85.field1806];
					var9 = Class316.method3908(Class315.field3329, Client.field548.field1446);
					var9.field3374.method9388(var14.length() + 1);
					var9.field3374.method9473(var14);
					Client.field548.method2897(var9);
					return 1;
				} else if (var0 == 3106) {
					var14 = field880[--Class85.field1806];
					var9 = Class316.method3908(Class315.field3370, Client.field548.field1446);
					var9.field3374.method9388(var14.length() + 1);
					var9.field3374.method9473(var14);
					Client.field548.method2897(var9);
					return 1;
				} else {
					int var4;
					String var5;
					if (var0 == 3107) {
						var4 = field887[--Class85.field83];
						var5 = field880[--Class85.field1806];
						Client.method2223(var4, var5);
						return 1;
					} else if (var0 == 3108) {
						Class85.field83 -= 3;
						var4 = field887[Class85.field83];
						var11 = field887[Class85.field83 + 1];
						int var13 = field887[Class85.field83 + 2];
						Class340 var16 = Client.field25.method6718(var13);
						Client.method2517(var16, var4, var11);
						return 1;
					} else if (var0 == 3109) {
						Class85.field83 -= 2;
						var4 = field887[Class85.field83];
						var11 = field887[Class85.field83 + 1];
						Class340 var12 = var2 ? field892 : field88;
						Client.method2517(var12, var4, var11);
						return 1;
					} else if (var0 == 3110) {
						Client.field1468 = field887[--Class85.field83] == 1;
						return 1;
					} else if (var0 == 3111) {
						field887[++Class85.field83 - 1] = Client.field4851.method2701() ? 1 : 0;
						return 1;
					} else if (var0 == 3112) {
						Client.field4851.method2609(field887[--Class85.field83] == 1);
						return 1;
					} else if (var0 == 3113) {
						var14 = field880[--Class85.field1806];
						boolean var10 = field887[--Class85.field83] == 1;
						Class40.method7134(var14, var10, false);
						return 1;
					} else if (var0 == 3115) {
						var4 = field887[--Class85.field83];
						var9 = Class316.method3908(Class315.field3309, Client.field548.field1446);
						var9.field3374.method9389(var4);
						Client.field548.method2897(var9);
						return 1;
					} else if (var0 == 3116) {
						var4 = field887[--Class85.field83];
						Class85.field1806 -= 2;
						var5 = field880[Class85.field1806];
						String var6 = field880[1 + Class85.field1806];
						if (var5.length() > 500) {
							return 1;
						} else if (var6.length() > 500) {
							return 1;
						} else {
							Class316 var7 = Class316.method3908(Class315.field3328, Client.field548.field1446);
							var7.field3374.method9389(Class521.method7983(var5) + 1 + Class521.method7983(var6));
							var7.field3374.method9473(var6);
							var7.field3374.method9435(var4);
							var7.field3374.method9473(var5);
							Client.field548.method2897(var7);
							return 1;
						}
					} else if (var0 == 3117) {
						--Class85.field83;
						return 1;
					} else if (var0 == 3118) {
						Client.field641 = field887[--Class85.field83] == 1;
						return 1;
					} else if (var0 == 3119) {
						Client.field680 = field887[--Class85.field83] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (field887[--Class85.field83] == 1) {
							Client.field530 |= 1;
						} else {
							Client.field530 &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (field887[--Class85.field83] == 1) {
							Client.field530 |= 2;
						} else {
							Client.field530 &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (field887[--Class85.field83] == 1) {
							Client.field530 |= 4;
						} else {
							Client.field530 &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (field887[--Class85.field83] == 1) {
							Client.field530 |= 8;
						} else {
							Client.field530 &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.field530 = 0;
						return 1;
					} else if (var0 == 3125) {
						Client.field607 = field887[--Class85.field83] == 1;
						return 1;
					} else if (var0 == 3126) {
						Client.field621 = field887[--Class85.field83] == 1;
						return 1;
					} else if (var0 == 3127) {
						Client.method3793(field887[--Class85.field83] == 1);
						return 1;
					} else if (var0 == 3128) {
						field887[++Class85.field83 - 1] = Client.method7960() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						Class85.field83 -= 2;
						Client.field582 = field887[Class85.field83];
						Client.field583 = field887[Class85.field83 + 1];
						return 1;
					} else if (var0 == 3130) {
						Class85.field83 -= 2;
						return 1;
					} else if (var0 == 3131) {
						--Class85.field83;
						return 1;
					} else if (var0 == 3132) {
						field887[++Class85.field83 - 1] = Client.field182;
						field887[++Class85.field83 - 1] = Client.field5261;
						return 1;
					} else if (var0 == 3133) {
						--Class85.field83;
						return 1;
					} else if (var0 == 3134) {
						return 1;
					} else if (var0 == 3135) {
						Class85.field83 -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field655 = 3;
						Client.field656 = field887[--Class85.field83];
						return 1;
					} else if (var0 == 3137) {
						Client.field655 = 2;
						Client.field656 = field887[--Class85.field83];
						return 1;
					} else if (var0 == 3138) {
						Client.field655 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field655 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field655 = 3;
						Client.field656 = var2 ? field892.field3676 : field88.field3676;
						return 1;
					} else {
						boolean var8;
						if (var0 == 3141) {
							var8 = field887[--Class85.field83] == 1;
							Client.field4851.method2618(var8);
							return 1;
						} else if (var0 == 3142) {
							field887[++Class85.field83 - 1] = Client.field4851.method2612() ? 1 : 0;
							return 1;
						} else if (var0 == 3143) {
							var8 = field887[--Class85.field83] == 1;
							Client.field540 = var8;
							if (!var8) {
								Client.field4851.method2628("");
							}

							return 1;
						} else if (var0 == 3144) {
							field887[++Class85.field83 - 1] = Client.field540 ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == 3146) {
							var8 = field887[--Class85.field83] == 1;
							Client.field4851.method2723(!var8);
							return 1;
						} else if (var0 == 3147) {
							field887[++Class85.field83 - 1] = Client.field4851.method2614() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							field887[++Class85.field83 - 1] = Class76.field928;
							return 1;
						} else if (var0 == 3154) {
							field887[++Class85.field83 - 1] = Class130.method3051();
							return 1;
						} else if (var0 == 3155) {
							--Class85.field1806;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							Class85.field83 -= 2;
							return 1;
						} else if (var0 == 3158) {
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--Class85.field83;
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--Class85.field83;
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--Class85.field1806;
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--Class85.field83;
							field880[++Class85.field1806 - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--Class85.field83;
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							Class85.field83 -= 2;
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							Class85.field83 -= 2;
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							Class85.field83 -= 2;
							field880[++Class85.field1806 - 1] = "";
							field880[++Class85.field1806 - 1] = "";
							field880[++Class85.field1806 - 1] = "";
							field880[++Class85.field1806 - 1] = "";
							field880[++Class85.field1806 - 1] = "";
							field880[++Class85.field1806 - 1] = "";
							field880[++Class85.field1806 - 1] = "";
							field880[++Class85.field1806 - 1] = "";
							field880[++Class85.field1806 - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--Class85.field83;
							return 1;
						} else if (var0 == 3173) {
							--Class85.field83;
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--Class85.field83;
							return 1;
						} else if (var0 == 3175) {
							field887[++Class85.field83 - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--Class85.field1806;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--Class85.field1806;
							return 1;
						} else if (var0 == 3181) {
							Client.method3956(field887[--Class85.field83]);
							return 1;
						} else if (var0 == 3182) {
							field887[++Class85.field83 - 1] = Client.method715();
							return 1;
						} else if (var0 == 3185) {
							var4 = field887[--Class85.field83];
							Client.field4851.method2638(var4);
							return 1;
						} else if (var0 == 3186) {
							var4 = Client.field4851.method2679();
							field887[++Class85.field83 - 1] = var4;
							return 1;
						} else if (var0 == 3189) {
							var4 = field887[--Class85.field83];
							Client.method8410(var4);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfInfo(owner = "bu", name = "ag", desc = "(ILdm;ZI)I", opaque = "-1200923592")
	public static int method863(int var0, Class91 var1, boolean var2) {
		if (var0 == 3200) {
			Class85.field83 -= 3;
			Client.method8553(field887[Class85.field83], field887[1 + Class85.field83], field887[2 + Class85.field83]);
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			int var13;
			int var16;
			if (var0 == 3201) {
				Class85.field83 -= 5;
				var13 = field887[Class85.field83];
				var16 = field887[1 + Class85.field83];
				var6 = field887[Class85.field83 + 2];
				var7 = field887[3 + Class85.field83];
				var8 = field887[4 + Class85.field83];
				ArrayList var15 = new ArrayList();
				var15.add(var13);
				Client.method160(var15, var16, var6, var7, var8);
				return 1;
			} else if (var0 == 3202) {
				Class85.field83 -= 2;
				Client.method674(field887[Class85.field83], field887[1 + Class85.field83]);
				return 1;
			} else {
				Class81 var4;
				Class99 var5;
				String var12;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var11;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var13 = field887[--Class85.field83];
							var16 = 0;
							Class81 var20 = (Class81)Class62.method1112(Class81.method8884(), var13);
							if (var20 != null) {
								var16 = Class81.field996 != var20 ? 1 : 0;
							}

							field887[++Class85.field83 - 1] = var16;
							return 1;
						} else if (var0 == 3218) {
							var13 = field887[--Class85.field83];
							var16 = 0;
							Class99 var19 = (Class99)Class62.method1112(Class99.method8414(), var13);
							if (var19 != null) {
								var16 = Class99.field1305 != var19 ? 1 : 0;
							}

							field887[++Class85.field83 - 1] = var16;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								Class85.field83 -= 2;
								var13 = field887[Class85.field83];
								var16 = field887[1 + Class85.field83];
								Class380.method7208(var13, var16);
								return 1;
							} else if (var0 == 3221) {
								Class85.field83 -= 6;
								var13 = field887[Class85.field83];
								var16 = field887[1 + Class85.field83];
								var6 = field887[2 + Class85.field83];
								var7 = field887[3 + Class85.field83];
								var8 = field887[Class85.field83 + 4];
								int var9 = field887[5 + Class85.field83];
								ArrayList var10 = new ArrayList();
								var10.add(var13);
								var10.add(var16);
								Client.method160(var10, var6, var7, var8, var9);
								return 1;
							} else if (var0 == 3222) {
								Class85.field83 -= 4;
								var13 = field887[Class85.field83];
								var16 = field887[1 + Class85.field83];
								var6 = field887[2 + Class85.field83];
								var7 = field887[3 + Class85.field83];
								Class332.method3992(var13, var16, var6, var7);
								return 1;
							} else {
								return 2;
							}
						} else {
							var4 = Class81.field996;
							var5 = Class99.field1305;
							var11 = true;
							boolean var18 = true;
							if (var0 == 3217) {
								var8 = field887[--Class85.field83];
								var4 = (Class81)Class62.method1112(Class81.method8884(), var8);
								if (var4 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var8));
								}
							}

							if (var0 == 3219) {
								var8 = field887[--Class85.field83];
								var5 = (Class99)Class62.method1112(Class99.method8414(), var8);
								if (var5 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var8));
								}
							}

							String var14;
							byte var17;
							if (Class99.field1305 == var5) {
								switch(var4.field995) {
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
								switch(var5.field1312) {
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

							field887[++Class85.field83 - 1] = var17;
							field887[++Class85.field83 - 1] = var7;
							return 1;
						}
					} else {
						var4 = Class81.field996;
						var5 = Class99.field1305;
						var11 = false;
						if (var0 == 3214) {
							var7 = field887[--Class85.field83];
							var4 = (Class81)Class62.method1112(Class81.method8884(), var7);
							if (var4 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var7));
							}
						}

						if (var0 == 3215) {
							var7 = field887[--Class85.field83];
							var5 = (Class99)Class62.method1112(Class99.method8414(), var7);
							if (var5 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var7));
							}
						}

						if (var0 == 3210) {
							var7 = field887[--Class85.field83];
							var4 = (Class81)Class62.method1112(Class81.method8884(), var7);
							if (var4 == null) {
								var5 = (Class99)Class62.method1112(Class99.method8414(), var7);
								if (var5 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var7));
								}
							}
						} else if (var0 == 3182) {
							var4 = Class81.field992;
						} else if (var0 == 3204) {
							var5 = Class99.field1310;
						} else if (var0 == 3206) {
							var5 = Class99.field1308;
						} else if (var0 == 3208) {
							var5 = Class99.field1309;
						}

						if (Class99.field1305 == var5) {
							switch(var4.field995) {
							case 1:
								var6 = Client.field4851.method2612() ? 1 : 0;
								break;
							case 2:
								var6 = Client.field4851.method2614() ? 1 : 0;
								break;
							case 3:
								var6 = Client.field4851.method2617() ? 1 : 0;
								break;
							case 4:
								var6 = Client.field4851.method2720();
								break;
							case 5:
								var6 = Client.method715();
								break;
							default:
								var12 = String.format("Unkown device option: %s.", var4.toString());
								throw new RuntimeException(var12);
							}
						} else {
							switch(var5.field1312) {
							case 1:
								var6 = Client.field4851.method2701() ? 1 : 0;
								break;
							case 2:
								var7 = Client.field4851.method2637();
								var6 = Math.round((float)(var7 * 100) / 255.0F);
								break;
							case 3:
								var7 = Client.field4851.method2704();
								var6 = Math.round((float)(var7 * 100) / 127.0F);
								break;
							case 4:
								var7 = Client.field4851.method2657();
								var6 = Math.round((float)(var7 * 100) / 127.0F);
								break;
							default:
								var12 = String.format("Unkown game option: %s.", var5.toString());
								throw new RuntimeException(var12);
							}
						}

						field887[++Class85.field83 - 1] = var6;
						return 1;
					}
				} else {
					var4 = Class81.field996;
					var5 = Class99.field1305;
					var6 = field887[--Class85.field83];
					if (var0 == 3212) {
						var7 = field887[--Class85.field83];
						var4 = (Class81)Class62.method1112(Class81.method8884(), var7);
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var7));
						}
					}

					if (var0 == 3213) {
						var7 = field887[--Class85.field83];
						var5 = (Class99)Class62.method1112(Class99.method8414(), var7);
						if (var5 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var7));
						}
					}

					if (var0 == 3209) {
						var7 = field887[--Class85.field83];
						var4 = (Class81)Class62.method1112(Class81.method8884(), var7);
						if (var4 == null) {
							var5 = (Class99)Class62.method1112(Class99.method8414(), var7);
							if (var5 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var7));
							}
						}
					} else if (var0 == 3181) {
						var4 = Class81.field992;
					} else if (var0 == 3203) {
						var5 = Class99.field1310;
					} else if (var0 == 3205) {
						var5 = Class99.field1308;
					} else if (var0 == 3207) {
						var5 = Class99.field1309;
					}

					if (Class99.field1305 == var5) {
						switch(var4.field995) {
						case 1:
							Client.field4851.method2618(var6 == 1);
							break;
						case 2:
							Client.field4851.method2723(var6 == 1);
							break;
						case 3:
							Client.field4851.method2733(var6 == 1);
							break;
						case 4:
							if (var6 < 0) {
								var6 = 0;
							}

							Client.field4851.method2658(var6);
							break;
						case 5:
							Client.method3956(var6);
							break;
						default:
							var12 = String.format("Unkown device option: %s.", var4.toString());
							throw new RuntimeException(var12);
						}
					} else {
						switch(var5.field1312) {
						case 1:
							Client.field4851.method2609(var6 == 1);
							break;
						case 2:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 255) / 100.0F);
							Client.method6714(var7);
							break;
						case 3:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 127) / 100.0F);
							Client.method795(var7);
							break;
						case 4:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 127) / 100.0F);
							Client.method1773(var7);
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

	@ObfInfo(owner = "gt", name = "bs", desc = "(ILdm;ZB)I", opaque = "1")
	public static int method3585(int var0, Class91 var1, boolean var2) {
		if (var0 == 3300) {
			field887[++Class85.field83 - 1] = Client.field778;
			return 1;
		} else {
			int var4;
			int var5;
			if (var0 == 3301) {
				Class85.field83 -= 2;
				var4 = field887[Class85.field83];
				var5 = field887[Class85.field83 + 1];
				field887[++Class85.field83 - 1] = Class79.method1113(var4, var5);
				return 1;
			} else if (var0 == 3302) {
				Class85.field83 -= 2;
				var4 = field887[Class85.field83];
				var5 = field887[1 + Class85.field83];
				field887[++Class85.field83 - 1] = Class79.method3244(var4, var5);
				return 1;
			} else if (var0 == 3303) {
				Class85.field83 -= 2;
				var4 = field887[Class85.field83];
				var5 = field887[Class85.field83 + 1];
				field887[++Class85.field83 - 1] = Class79.method2115(var4, var5);
				return 1;
			} else if (var0 == 3304) {
				var4 = field887[--Class85.field83];
				field887[++Class85.field83 - 1] = Class199.method2189(var4).field2036;
				return 1;
			} else if (var0 == 3305) {
				var4 = field887[--Class85.field83];
				field887[++Class85.field83 - 1] = Client.field495[var4];
				return 1;
			} else if (var0 == 3306) {
				var4 = field887[--Class85.field83];
				field887[++Class85.field83 - 1] = Client.field624[var4];
				return 1;
			} else if (var0 == 3307) {
				var4 = field887[--Class85.field83];
				field887[++Class85.field83 - 1] = Client.field625[var4];
				return 1;
			} else {
				int var6;
				if (var0 == 3308) {
					var4 = Client.field3857.field1300;
					var5 = (Client.field107.field1065 >> 7) + Client.field3857.field1289;
					var6 = (Client.field107.field1126 >> 7) + Client.field3857.field1285;
					field887[++Class85.field83 - 1] = (var5 << 14) + (var4 << 28) + var6;
					return 1;
				} else if (var0 == 3309) {
					var4 = field887[--Class85.field83];
					field887[++Class85.field83 - 1] = var4 >> 14 & 16383;
					return 1;
				} else if (var0 == 3310) {
					var4 = field887[--Class85.field83];
					field887[++Class85.field83 - 1] = var4 >> 28;
					return 1;
				} else if (var0 == 3311) {
					var4 = field887[--Class85.field83];
					field887[++Class85.field83 - 1] = var4 & 16383;
					return 1;
				} else if (var0 == 3312) {
					field887[++Class85.field83 - 1] = Client.field528 ? 1 : 0;
					return 1;
				} else if (var0 == 3313) {
					Class85.field83 -= 2;
					var4 = 32768 + field887[Class85.field83];
					var5 = field887[1 + Class85.field83];
					field887[++Class85.field83 - 1] = Class79.method1113(var4, var5);
					return 1;
				} else if (var0 == 3314) {
					Class85.field83 -= 2;
					var4 = field887[Class85.field83] + 32768;
					var5 = field887[1 + Class85.field83];
					field887[++Class85.field83 - 1] = Class79.method3244(var4, var5);
					return 1;
				} else if (var0 == 3315) {
					Class85.field83 -= 2;
					var4 = 32768 + field887[Class85.field83];
					var5 = field887[Class85.field83 + 1];
					field887[++Class85.field83 - 1] = Class79.method2115(var4, var5);
					return 1;
				} else if (var0 == 3316) {
					if (Client.field626 >= 2) {
						field887[++Class85.field83 - 1] = Client.field626;
					} else {
						field887[++Class85.field83 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3317) {
					field887[++Class85.field83 - 1] = Client.field649;
					return 1;
				} else if (var0 == 3318) {
					field887[++Class85.field83 - 1] = Client.field557;
					return 1;
				} else if (var0 == 3321) {
					field887[++Class85.field83 - 1] = Client.field659 / 100;
					return 1;
				} else if (var0 == 3322) {
					field887[++Class85.field83 - 1] = Client.field660;
					return 1;
				} else if (var0 == 3323) {
					if (Client.field663) {
						field887[++Class85.field83 - 1] = 1;
					} else {
						field887[++Class85.field83 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3324) {
					field887[++Class85.field83 - 1] = Client.field675;
					return 1;
				} else if (var0 == 3325) {
					Class85.field83 -= 4;
					var4 = field887[Class85.field83];
					var5 = field887[1 + Class85.field83];
					var6 = field887[Class85.field83 + 2];
					int var7 = field887[3 + Class85.field83];
					var4 += var5 << 14;
					var4 += var6 << 28;
					var4 += var7;
					field887[++Class85.field83 - 1] = var4;
					return 1;
				} else if (var0 == 3326) {
					field887[++Class85.field83 - 1] = Client.field709;
					return 1;
				} else if (var0 == 3327) {
					field887[++Class85.field83 - 1] = Client.field504;
					return 1;
				} else if (var0 == 3331) {
					field887[++Class85.field83 - 1] = Client.field659;
					return 1;
				} else if (var0 == 3332) {
					var4 = field887[--Class85.field83];
					field887[++Class85.field83 - 1] = Client.field627[var4];
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfInfo(owner = "nh", name = "bf", desc = "(ILdm;ZI)I", opaque = "-1753459143")
	public static int method6693(int var0, Class91 var1, boolean var2) {
		int var4;
		int var5;
		int var7;
		if (var0 == 3400) {
			Class85.field83 -= 2;
			var4 = field887[Class85.field83];
			var5 = field887[Class85.field83 + 1];
			Class208 var11 = Class208.method170(var4);
			if (var11.field2103 != 's') {
			}

			for (var7 = 0; var7 < var11.field2105; ++var7) {
				if (var5 == var11.field2106[var7]) {
					field880[++Class85.field1806 - 1] = var11.field2108[var7];
					var11 = null;
					break;
				}
			}

			if (var11 != null) {
				field880[++Class85.field1806 - 1] = var11.field2099;
			}

			return 1;
		} else if (var0 != 3408) {
			if (var0 == 3411) {
				var4 = field887[--Class85.field83];
				Class208 var10 = Class208.method170(var4);
				field887[++Class85.field83 - 1] = var10.method3965();
				return 1;
			} else {
				return 2;
			}
		} else {
			Class85.field83 -= 4;
			var4 = field887[Class85.field83];
			var5 = field887[Class85.field83 + 1];
			int var6 = field887[2 + Class85.field83];
			var7 = field887[3 + Class85.field83];
			Class208 var8 = Class208.method170(var6);
			if (var8.field2100 == var4 && var8.field2103 == var5) {
				for (int var9 = 0; var9 < var8.field2105; ++var9) {
					if (var8.field2106[var9] == var7) {
						if (var5 == 115) {
							field880[++Class85.field1806 - 1] = var8.field2108[var9];
						} else {
							field887[++Class85.field83 - 1] = var8.field2107[var9];
						}

						var8 = null;
						break;
					}
				}

				if (var8 != null) {
					if (var5 == 115) {
						field880[++Class85.field1806 - 1] = var8.field2099;
					} else {
						field887[++Class85.field83 - 1] = var8.field2104;
					}
				}

				return 1;
			} else {
				if (var5 == 115) {
					field880[++Class85.field1806 - 1] = Class378.field4152;
				} else {
					field887[++Class85.field83 - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfInfo(owner = "jm", name = "bo", desc = "(ILdm;ZI)I", opaque = "418571588")
	public static int method4760(int var0, Class91 var1, boolean var2) {
		int var4;
		if (var0 == 3500) {
			var4 = field887[--Class85.field83];
			field887[++Class85.field83 - 1] = Client.field721.method4342(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var4 = field887[--Class85.field83];
			field887[++Class85.field83 - 1] = Client.field721.method4374(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var4 = field887[--Class85.field83];
			field887[++Class85.field83 - 1] = Client.field721.method4343(var4) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "ru", name = "bt", desc = "(ILdm;ZI)I")
	public static int method8552(int var0, Class91 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(owner = "ez", name = "bn", desc = "(ILdm;ZB)I", opaque = "11")
	public static int method3053(int var0, Class91 var1, boolean var2) {
		if (var0 == 3800) {
			if (Client.field2020 != null) {
				field887[++Class85.field83 - 1] = 1;
				field3527 = Client.field2020;
			} else {
				field887[++Class85.field83 - 1] = 0;
			}

			return 1;
		} else {
			int var4;
			if (var0 == 3801) {
				var4 = field887[--Class85.field83];
				if (null != Client.field670[var4]) {
					field887[++Class85.field83 - 1] = 1;
					field3527 = Client.field670[var4];
				} else {
					field887[++Class85.field83 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3802) {
				field880[++Class85.field1806 - 1] = field3527.field1772;
				return 1;
			} else if (var0 == 3803) {
				field887[++Class85.field83 - 1] = field3527.field1765 ? 1 : 0;
				return 1;
			} else if (var0 == 3804) {
				field887[++Class85.field83 - 1] = field3527.field1770;
				return 1;
			} else if (var0 == 3805) {
				field887[++Class85.field83 - 1] = field3527.field1771;
				return 1;
			} else if (var0 == 3806) {
				field887[++Class85.field83 - 1] = field3527.field1776;
				return 1;
			} else if (var0 == 3807) {
				field887[++Class85.field83 - 1] = field3527.field1773;
				return 1;
			} else if (var0 == 3809) {
				field887[++Class85.field83 - 1] = field3527.field1774;
				return 1;
			} else if (var0 == 3810) {
				var4 = field887[--Class85.field83];
				field880[++Class85.field1806 - 1] = field3527.field1785[var4];
				return 1;
			} else if (var0 == 3811) {
				var4 = field887[--Class85.field83];
				field887[++Class85.field83 - 1] = field3527.field1768[var4];
				return 1;
			} else if (var0 == 3812) {
				field887[++Class85.field83 - 1] = field3527.field1769;
				return 1;
			} else if (var0 == 3813) {
				var4 = field887[--Class85.field83];
				field880[++Class85.field1806 - 1] = field3527.field1786[var4];
				return 1;
			} else {
				int var6;
				int var7;
				if (var0 == 3814) {
					Class85.field83 -= 3;
					var4 = field887[Class85.field83];
					var7 = field887[Class85.field83 + 1];
					var6 = field887[2 + Class85.field83];
					field887[++Class85.field83 - 1] = field3527.method3400(var4, var7, var6);
					return 1;
				} else if (var0 == 3815) {
					field887[++Class85.field83 - 1] = field3527.field1781;
					return 1;
				} else if (var0 == 3816) {
					field887[++Class85.field83 - 1] = field3527.field1782;
					return 1;
				} else if (var0 == 3817) {
					field887[++Class85.field83 - 1] = field3527.method3354(field880[--Class85.field1806]);
					return 1;
				} else if (var0 == 3818) {
					field887[Class85.field83 - 1] = field3527.method3338()[field887[Class85.field83 - 1]];
					return 1;
				} else if (var0 == 3819) {
					Class85.field83 -= 2;
					var4 = field887[Class85.field83];
					var7 = field887[Class85.field83 + 1];
					Client.method4767(var7, var4);
					return 1;
				} else if (var0 == 3820) {
					var4 = field887[--Class85.field83];
					field887[++Class85.field83 - 1] = field3527.field1779[var4];
					return 1;
				} else {
					if (var0 == 3821) {
						Class85.field83 -= 3;
						var4 = field887[Class85.field83];
						boolean var5 = field887[Class85.field83 + 1] == 1;
						var6 = field887[2 + Class85.field83];
						Client.method2778(var6, var4, var5);
					}

					if (var0 == 3822) {
						var4 = field887[--Class85.field83];
						field887[++Class85.field83 - 1] = field3527.field1780[var4] ? 1 : 0;
						return 1;
					} else if (var0 == 3850) {
						if (Client.field4619 != null) {
							field887[++Class85.field83 - 1] = 1;
							field4874 = Client.field4619;
						} else {
							field887[++Class85.field83 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3851) {
						var4 = field887[--Class85.field83];
						if (Client.field684[var4] != null) {
							field887[++Class85.field83 - 1] = 1;
							field4874 = Client.field684[var4];
							field3177 = var4;
						} else {
							field887[++Class85.field83 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3852) {
						field880[++Class85.field1806 - 1] = field4874.field1851;
						return 1;
					} else if (var0 == 3853) {
						field887[++Class85.field83 - 1] = field4874.field1853;
						return 1;
					} else if (var0 == 3854) {
						field887[++Class85.field83 - 1] = field4874.field1852;
						return 1;
					} else if (var0 == 3855) {
						field887[++Class85.field83 - 1] = field4874.method3536();
						return 1;
					} else if (var0 == 3856) {
						var4 = field887[--Class85.field83];
						field880[++Class85.field1806 - 1] = ((Class140)field4874.field1854.get(var4)).field1601.method10260();
						return 1;
					} else if (var0 == 3857) {
						var4 = field887[--Class85.field83];
						field887[++Class85.field83 - 1] = ((Class140)field4874.field1854.get(var4)).field1602;
						return 1;
					} else if (var0 == 3858) {
						var4 = field887[--Class85.field83];
						field887[++Class85.field83 - 1] = ((Class140)field4874.field1854.get(var4)).field1607;
						return 1;
					} else if (var0 == 3859) {
						var4 = field887[--Class85.field83];
						Client.method2452(field3177, var4);
						return 1;
					} else if (var0 == 3860) {
						field887[++Class85.field83 - 1] = field4874.method3539(field880[--Class85.field1806]);
						return 1;
					} else if (var0 == 3861) {
						field887[Class85.field83 - 1] = field4874.method3533()[field887[Class85.field83 - 1]];
						return 1;
					} else if (var0 == 3890) {
						field887[++Class85.field83 - 1] = Client.field242 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfInfo(owner = "on", name = "bw", desc = "(ILdm;ZI)I", opaque = "1664267166")
	public static int method7202(int var0, Class91 var1, boolean var2) {
		int var4;
		if (var0 == 3903) {
			var4 = field887[--Class85.field83];
			field887[++Class85.field83 - 1] = Client.field531[var4].method7436();
			return 1;
		} else if (var0 == 3904) {
			var4 = field887[--Class85.field83];
			field887[++Class85.field83 - 1] = Client.field531[var4].field4589;
			return 1;
		} else if (var0 == 3905) {
			var4 = field887[--Class85.field83];
			field887[++Class85.field83 - 1] = Client.field531[var4].field4590;
			return 1;
		} else if (var0 == 3906) {
			var4 = field887[--Class85.field83];
			field887[++Class85.field83 - 1] = Client.field531[var4].field4591;
			return 1;
		} else if (var0 == 3907) {
			var4 = field887[--Class85.field83];
			field887[++Class85.field83 - 1] = Client.field531[var4].field4592;
			return 1;
		} else if (var0 == 3908) {
			var4 = field887[--Class85.field83];
			field887[++Class85.field83 - 1] = Client.field531[var4].field4588;
			return 1;
		} else {
			int var14;
			if (var0 == 3910) {
				var4 = field887[--Class85.field83];
				var14 = Client.field531[var4].method7435();
				field887[++Class85.field83 - 1] = var14 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == 3911) {
				var4 = field887[--Class85.field83];
				var14 = Client.field531[var4].method7435();
				field887[++Class85.field83 - 1] = var14 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == 3912) {
				var4 = field887[--Class85.field83];
				var14 = Client.field531[var4].method7435();
				field887[++Class85.field83 - 1] = var14 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == 3913) {
				var4 = field887[--Class85.field83];
				var14 = Client.field531[var4].method7435();
				field887[++Class85.field83 - 1] = var14 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == 3914) {
					var12 = field887[--Class85.field83] == 1;
					if (Client.field1829 != null) {
						Client.field1829.method7125(Class365.field3989, var12);
					}

					return 1;
				} else if (var0 == 3915) {
					var12 = field887[--Class85.field83] == 1;
					if (Client.field1829 != null) {
						Client.field1829.method7125(Class365.field3988, var12);
					}

					return 1;
				} else if (var0 == 3916) {
					Class85.field83 -= 2;
					var12 = field887[Class85.field83] == 1;
					boolean var13 = field887[Class85.field83 + 1] == 1;
					if (Client.field1829 != null) {
						Client.field776.field426 = var13;
						Client.field1829.method7125(Client.field776, var12);
					}

					return 1;
				} else if (var0 == 3917) {
					var12 = field887[--Class85.field83] == 1;
					if (Client.field1829 != null) {
						Client.field1829.method7125(Class365.field3990, var12);
					}

					return 1;
				} else if (var0 == 3918) {
					var12 = field887[--Class85.field83] == 1;
					if (Client.field1829 != null) {
						Client.field1829.method7125(Class365.field3987, var12);
					}

					return 1;
				} else if (var0 == 3919) {
					field887[++Class85.field83 - 1] = Client.field1829 == null ? 0 : Client.field1829.field3986.size();
					return 1;
				} else {
					Class403 var5;
					if (var0 == 3920) {
						var4 = field887[--Class85.field83];
						var5 = (Class403)Client.field1829.field3986.get(var4);
						field887[++Class85.field83 - 1] = var5.field4624;
						return 1;
					} else if (var0 == 3921) {
						var4 = field887[--Class85.field83];
						var5 = (Class403)Client.field1829.field3986.get(var4);
						field880[++Class85.field1806 - 1] = var5.method7540();
						return 1;
					} else if (var0 == 3922) {
						var4 = field887[--Class85.field83];
						var5 = (Class403)Client.field1829.field3986.get(var4);
						field880[++Class85.field1806 - 1] = var5.method7535();
						return 1;
					} else if (var0 == 3923) {
						var4 = field887[--Class85.field83];
						var5 = (Class403)Client.field1829.field3986.get(var4);
						long var6 = Class130.method3047() - Client.field1985 - var5.field4621;
						int var8 = (int)(var6 / 3600000L);
						int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
						int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * 60000)) / 1000L);
						String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
						field880[++Class85.field1806 - 1] = var11;
						return 1;
					} else if (var0 == 3924) {
						var4 = field887[--Class85.field83];
						var5 = (Class403)Client.field1829.field3986.get(var4);
						field887[++Class85.field83 - 1] = var5.field4622.field4591;
						return 1;
					} else if (var0 == 3925) {
						var4 = field887[--Class85.field83];
						var5 = (Class403)Client.field1829.field3986.get(var4);
						field887[++Class85.field83 - 1] = var5.field4622.field4590;
						return 1;
					} else if (var0 == 3926) {
						var4 = field887[--Class85.field83];
						var5 = (Class403)Client.field1829.field3986.get(var4);
						field887[++Class85.field83 - 1] = var5.field4622.field4589;
						return 1;
					} else if (var0 == 3939) {
						var4 = field887[--Class85.field83];
						field887[++Class85.field83 - 1] = Class232.method109(var4).field2461 ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfInfo(owner = "sy", name = "bl", desc = "(ILdm;ZB)I", opaque = "0")
	public static int method8961(int var0, Class91 var1, boolean var2) {
		int var5;
		int var10;
		if (var0 == 4000) {
			Class85.field83 -= 2;
			var10 = field887[Class85.field83];
			var5 = field887[Class85.field83 + 1];
			field887[++Class85.field83 - 1] = var5 + var10;
			return 1;
		} else if (var0 == 4001) {
			Class85.field83 -= 2;
			var10 = field887[Class85.field83];
			var5 = field887[Class85.field83 + 1];
			field887[++Class85.field83 - 1] = var10 - var5;
			return 1;
		} else if (var0 == 4002) {
			Class85.field83 -= 2;
			var10 = field887[Class85.field83];
			var5 = field887[1 + Class85.field83];
			field887[++Class85.field83 - 1] = var5 * var10;
			return 1;
		} else if (var0 == 4003) {
			Class85.field83 -= 2;
			var10 = field887[Class85.field83];
			var5 = field887[1 + Class85.field83];
			field887[++Class85.field83 - 1] = var10 / var5;
			return 1;
		} else if (var0 == 4004) {
			var10 = field887[--Class85.field83];
			field887[++Class85.field83 - 1] = (int)(Math.random() * (double)var10);
			return 1;
		} else if (var0 == 4005) {
			var10 = field887[--Class85.field83];
			field887[++Class85.field83 - 1] = (int)(Math.random() * (double)(var10 + 1));
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			if (var0 == 4006) {
				Class85.field83 -= 5;
				var10 = field887[Class85.field83];
				var5 = field887[1 + Class85.field83];
				var6 = field887[2 + Class85.field83];
				var7 = field887[Class85.field83 + 3];
				var8 = field887[4 + Class85.field83];
				field887[++Class85.field83 - 1] = (var8 - var6) * (var5 - var10) / (var7 - var6) + var10;
				return 1;
			} else if (var0 == 4007) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[Class85.field83 + 1];
				field887[++Class85.field83 - 1] = var10 + var5 * var10 / 100;
				return 1;
			} else if (var0 == 4008) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[Class85.field83 + 1];
				field887[++Class85.field83 - 1] = var10 | 1 << var5;
				return 1;
			} else if (var0 == 4009) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[1 + Class85.field83];
				field887[++Class85.field83 - 1] = var10 & -1 - (1 << var5);
				return 1;
			} else if (var0 == 4010) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[Class85.field83 + 1];
				field887[++Class85.field83 - 1] = 0 != (var10 & 1 << var5) ? 1 : 0;
				return 1;
			} else if (var0 == 4011) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[Class85.field83 + 1];
				field887[++Class85.field83 - 1] = var10 % var5;
				return 1;
			} else if (var0 == 4012) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[1 + Class85.field83];
				if (var10 == 0) {
					field887[++Class85.field83 - 1] = 0;
				} else {
					field887[++Class85.field83 - 1] = (int)Math.pow((double)var10, (double)var5);
				}

				return 1;
			} else if (var0 == 4013) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[1 + Class85.field83];
				if (var10 == 0) {
					field887[++Class85.field83 - 1] = 0;
					return 1;
				} else {
					switch(var5) {
					case 0:
						field887[++Class85.field83 - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						field887[++Class85.field83 - 1] = var10;
						break;
					case 2:
						field887[++Class85.field83 - 1] = (int)Math.sqrt((double)var10);
						break;
					case 3:
						field887[++Class85.field83 - 1] = (int)Math.cbrt((double)var10);
						break;
					case 4:
						field887[++Class85.field83 - 1] = (int)Math.sqrt(Math.sqrt((double)var10));
						break;
					default:
						field887[++Class85.field83 - 1] = (int)Math.pow((double)var10, 1.0D / (double)var5);
					}

					return 1;
				}
			} else if (var0 == 4014) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[Class85.field83 + 1];
				field887[++Class85.field83 - 1] = var10 & var5;
				return 1;
			} else if (var0 == 4015) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[1 + Class85.field83];
				field887[++Class85.field83 - 1] = var10 | var5;
				return 1;
			} else if (var0 == 4016) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[Class85.field83 + 1];
				field887[++Class85.field83 - 1] = var10 < var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4017) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[1 + Class85.field83];
				field887[++Class85.field83 - 1] = var10 > var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4018) {
				Class85.field83 -= 3;
				long var11 = (long)field887[Class85.field83];
				long var12 = (long)field887[1 + Class85.field83];
				long var13 = (long)field887[2 + Class85.field83];
				field887[++Class85.field83 - 1] = (int)(var11 * var13 / var12);
				return 1;
			} else if (var0 == 4025) {
				var10 = Class319.method1938(field887[--Class85.field83]);
				field887[++Class85.field83 - 1] = var10;
				return 1;
			} else if (var0 == 4026) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[1 + Class85.field83];
				field887[++Class85.field83 - 1] = var10 ^ 1 << var5;
				return 1;
			} else if (var0 == 4027) {
				Class85.field83 -= 3;
				var10 = field887[Class85.field83];
				var5 = field887[Class85.field83 + 1];
				var6 = field887[Class85.field83 + 2];
				field887[++Class85.field83 - 1] = Class319.method6695(var10, var5, var6);
				return 1;
			} else if (var0 == 4028) {
				Class85.field83 -= 3;
				var10 = field887[Class85.field83];
				var5 = field887[1 + Class85.field83];
				var6 = field887[Class85.field83 + 2];
				field887[++Class85.field83 - 1] = Class319.method1099(var10, var5, var6);
				return 1;
			} else if (var0 == 4029) {
				Class85.field83 -= 3;
				var10 = field887[Class85.field83];
				var5 = field887[1 + Class85.field83];
				var6 = field887[2 + Class85.field83];
				var7 = 31 - var6;
				field887[++Class85.field83 - 1] = var10 << var7 >>> var7 + var5;
				return 1;
			} else if (var0 == 4030) {
				Class85.field83 -= 4;
				var10 = field887[Class85.field83];
				var5 = field887[Class85.field83 + 1];
				var6 = field887[2 + Class85.field83];
				var7 = field887[3 + Class85.field83];
				var10 = Class319.method1099(var10, var6, var7);
				var8 = Class319.method5997(var7 - var6 + 1);
				if (var5 > var8) {
					var5 = var8;
				}

				field887[++Class85.field83 - 1] = var10 | var5 << var6;
				return 1;
			} else if (var0 == 4032) {
				field887[Class85.field83 - 1] = Class503.method8425(field887[Class85.field83 - 1]);
				return 1;
			} else if (var0 == 4033) {
				field887[Class85.field83 - 1] = Class503.method8816(field887[Class85.field83 - 1]);
				return 1;
			} else if (var0 == 4034) {
				Class85.field83 -= 2;
				var10 = field887[Class85.field83];
				var5 = field887[Class85.field83 + 1];
				var6 = Class503.method8709(var10, var5);
				field887[++Class85.field83 - 1] = var6;
				return 1;
			} else if (var0 == 4035) {
				field887[Class85.field83 - 1] = Math.abs(field887[Class85.field83 - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var4 = field880[--Class85.field1806];
				var5 = -1;
				if (Class412.method3873(var4)) {
					var5 = Class412.method3402(var4);
				}

				field887[++Class85.field83 - 1] = var5;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfInfo(owner = "qo", name = "be", desc = "(ILdm;ZI)I", opaque = "-886020653")
	public static int method7966(int var0, Class91 var1, boolean var2) {
		String var4;
		int var10;
		if (var0 == 4100) {
			var4 = field880[--Class85.field1806];
			var10 = field887[--Class85.field83];
			field880[++Class85.field1806 - 1] = var4 + var10;
			return 1;
		} else {
			String var5;
			if (var0 == 4101) {
				Class85.field1806 -= 2;
				var4 = field880[Class85.field1806];
				var5 = field880[Class85.field1806 + 1];
				field880[++Class85.field1806 - 1] = var4 + var5;
				return 1;
			} else if (var0 == 4102) {
				var4 = field880[--Class85.field1806];
				var10 = field887[--Class85.field83];
				field880[++Class85.field1806 - 1] = var4 + Class412.method2887(var10, true);
				return 1;
			} else if (var0 == 4103) {
				var4 = field880[--Class85.field1806];
				field880[++Class85.field1806 - 1] = var4.toLowerCase();
				return 1;
			} else {
				int var7;
				int var13;
				if (var0 == 4104) {
					var13 = field887[--Class85.field83];
					long var16 = ((long)var13 + 11745L) * 86400000L;
					field884.setTime(new Date(var16));
					var7 = field884.get(5);
					int var18 = field884.get(2);
					int var9 = field884.get(1);
					field880[++Class85.field1806 - 1] = var7 + "-" + field885[var18] + "-" + var9;
					return 1;
				} else if (var0 != 4105) {
					if (var0 == 4106) {
						var13 = field887[--Class85.field83];
						field880[++Class85.field1806 - 1] = Integer.toString(var13);
						return 1;
					} else if (var0 == 4107) {
						Class85.field1806 -= 2;
						field887[++Class85.field83 - 1] = Class412.method7044(Class398.method5569(field880[Class85.field1806], field880[1 + Class85.field1806], Client.field2071));
						return 1;
					} else {
						int var12;
						byte[] var15;
						Class418 var17;
						if (var0 == 4108) {
							var4 = field880[--Class85.field1806];
							Class85.field83 -= 2;
							var10 = field887[Class85.field83];
							var12 = field887[1 + Class85.field83];
							var15 = Client.field1430.method7216(var12, 0);
							var17 = new Class418(var15);
							field887[++Class85.field83 - 1] = var17.method7991(var4, var10);
							return 1;
						} else if (var0 == 4109) {
							var4 = field880[--Class85.field1806];
							Class85.field83 -= 2;
							var10 = field887[Class85.field83];
							var12 = field887[Class85.field83 + 1];
							var15 = Client.field1430.method7216(var12, 0);
							var17 = new Class418(var15);
							field887[++Class85.field83 - 1] = var17.method8073(var4, var10);
							return 1;
						} else if (var0 == 4110) {
							Class85.field1806 -= 2;
							var4 = field880[Class85.field1806];
							var5 = field880[1 + Class85.field1806];
							if (field887[--Class85.field83] == 1) {
								field880[++Class85.field1806 - 1] = var4;
							} else {
								field880[++Class85.field1806 - 1] = var5;
							}

							return 1;
						} else if (var0 == 4111) {
							var4 = field880[--Class85.field1806];
							field880[++Class85.field1806 - 1] = Class436.method7992(var4);
							return 1;
						} else if (var0 == 4112) {
							var4 = field880[--Class85.field1806];
							var10 = field887[--Class85.field83];
							field880[++Class85.field1806 - 1] = var4 + (char)var10;
							return 1;
						} else if (var0 == 4113) {
							var13 = field887[--Class85.field83];
							field887[++Class85.field83 - 1] = Class412.method289((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4114) {
							var13 = field887[--Class85.field83];
							field887[++Class85.field83 - 1] = Class412.method2605((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4115) {
							var13 = field887[--Class85.field83];
							field887[++Class85.field83 - 1] = Class328.method6267((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4116) {
							var13 = field887[--Class85.field83];
							field887[++Class85.field83 - 1] = Class412.method293((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4117) {
							var4 = field880[--Class85.field1806];
							if (var4 != null) {
								field887[++Class85.field83 - 1] = var4.length();
							} else {
								field887[++Class85.field83 - 1] = 0;
							}

							return 1;
						} else if (var0 == 4118) {
							var4 = field880[--Class85.field1806];
							Class85.field83 -= 2;
							var10 = field887[Class85.field83];
							var12 = field887[Class85.field83 + 1];
							field880[++Class85.field1806 - 1] = var4.substring(var10, var12);
							return 1;
						} else if (var0 == 4119) {
							var4 = field880[--Class85.field1806];
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

							field880[++Class85.field1806 - 1] = var11.toString();
							return 1;
						} else if (var0 == 4120) {
							var4 = field880[--Class85.field1806];
							var10 = field887[--Class85.field83];
							field887[++Class85.field83 - 1] = var4.indexOf(var10);
							return 1;
						} else if (var0 == 4121) {
							Class85.field1806 -= 2;
							var4 = field880[Class85.field1806];
							var5 = field880[1 + Class85.field1806];
							var12 = field887[--Class85.field83];
							field887[++Class85.field83 - 1] = var4.indexOf(var5, var12);
							return 1;
						} else if (var0 == 4122) {
							var4 = field880[--Class85.field1806];
							field880[++Class85.field1806 - 1] = var4.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							Class85.field1806 -= 3;
							var4 = field880[Class85.field1806];
							var5 = field880[Class85.field1806 + 1];
							String var6 = field880[2 + Class85.field1806];
							if (Client.field107.field1029 == null) {
								field880[++Class85.field1806 - 1] = var6;
								return 1;
							} else {
								switch(Client.field107.field1029.field3948) {
								case 0:
									field880[++Class85.field1806 - 1] = var4;
									break;
								case 1:
									field880[++Class85.field1806 - 1] = var5;
									break;
								case 2:
								default:
									field880[++Class85.field1806 - 1] = var6;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							field887[++Class85.field83 - 1] = Client.field107.field1029 != null ? Client.field107.field1029.field3948 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					Class85.field1806 -= 2;
					var4 = field880[Class85.field1806];
					var5 = field880[1 + Class85.field1806];
					if (Client.field107.field1029 != null && 0 != Client.field107.field1029.field3946) {
						field880[++Class85.field1806 - 1] = var5;
					} else {
						field880[++Class85.field1806 - 1] = var4;
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(owner = "sy", name = "bg", desc = "(ILdm;ZI)I", opaque = "1449106522")
	public static int method8962(int var0, Class91 var1, boolean var2) {
		int var4;
		if (var0 == 4200) {
			var4 = field887[--Class85.field83];
			field880[++Class85.field1806 - 1] = Class232.method109(var4).field2449;
			return 1;
		} else {
			Class232 var6;
			int var7;
			if (var0 == 4201) {
				Class85.field83 -= 2;
				var4 = field887[Class85.field83];
				var7 = field887[1 + Class85.field83];
				var6 = Class232.method109(var4);
				if (var7 >= 1 && var7 <= 5 && null != var6.field2469[var7 - 1]) {
					field880[++Class85.field1806 - 1] = var6.field2469[var7 - 1];
				} else {
					field880[++Class85.field1806 - 1] = "";
				}

				return 1;
			} else if (var0 == 4202) {
				Class85.field83 -= 2;
				var4 = field887[Class85.field83];
				var7 = field887[Class85.field83 + 1];
				var6 = Class232.method109(var4);
				if (var7 >= 1 && var7 <= 5 && null != var6.field2487[var7 - 1]) {
					field880[++Class85.field1806 - 1] = var6.field2487[var7 - 1];
				} else {
					field880[++Class85.field1806 - 1] = "";
				}

				return 1;
			} else if (var0 == 4203) {
				var4 = field887[--Class85.field83];
				field887[++Class85.field83 - 1] = Class232.method109(var4).field2464;
				return 1;
			} else if (var0 == 4204) {
				var4 = field887[--Class85.field83];
				field887[++Class85.field83 - 1] = Class232.method109(var4).field2462 == 1 ? 1 : 0;
				return 1;
			} else {
				Class232 var5;
				if (var0 == 4205) {
					var4 = field887[--Class85.field83];
					var5 = Class232.method109(var4);
					if (var5.field2486 == -1 && var5.field2485 >= 0) {
						field887[++Class85.field83 - 1] = var5.field2485;
					} else {
						field887[++Class85.field83 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4206) {
					var4 = field887[--Class85.field83];
					var5 = Class232.method109(var4);
					if (var5.field2486 >= 0 && var5.field2485 >= 0) {
						field887[++Class85.field83 - 1] = var5.field2485;
					} else {
						field887[++Class85.field83 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4207) {
					var4 = field887[--Class85.field83];
					field887[++Class85.field83 - 1] = Class232.method109(var4).field2467 ? 1 : 0;
					return 1;
				} else if (var0 == 4208) {
					var4 = field887[--Class85.field83];
					var5 = Class232.method109(var4);
					if (var5.field2453 == -1 && var5.field2498 >= 0) {
						field887[++Class85.field83 - 1] = var5.field2498;
					} else {
						field887[++Class85.field83 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4209) {
					var4 = field887[--Class85.field83];
					var5 = Class232.method109(var4);
					if (var5.field2453 >= 0 && var5.field2498 >= 0) {
						field887[++Class85.field83 - 1] = var5.field2498;
					} else {
						field887[++Class85.field83 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4210) {
					String var8 = field880[--Class85.field1806];
					var7 = field887[--Class85.field83];
					Client.method6146(var8, var7 == 1);
					field887[++Class85.field83 - 1] = Client.field1870;
					return 1;
				} else if (var0 != 4211) {
					if (var0 == 4212) {
						Client.field1524 = 0;
						return 1;
					} else if (var0 == 4213) {
						var4 = field887[--Class85.field83];
						var7 = Class232.method109(var4).method4426();
						if (var7 == -1) {
							field887[++Class85.field83 - 1] = var7;
						} else {
							field887[++Class85.field83 - 1] = var7 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var4 = field887[--Class85.field83];
						field887[++Class85.field83 - 1] = Class232.method109(var4).field2468;
						return 1;
					} else if (var0 == 4215) {
						var4 = field887[--Class85.field83];
						field887[++Class85.field83 - 1] = Class232.method109(var4).field2465;
						return 1;
					} else if (var0 == 4216) {
						var4 = field887[--Class85.field83];
						field887[++Class85.field83 - 1] = Class232.method109(var4).field2466;
						return 1;
					} else if (var0 == 4217) {
						var4 = field887[--Class85.field83];
						var5 = Class232.method109(var4);
						field887[++Class85.field83 - 1] = var5.field2444;
						return 1;
					} else if (var0 == 4218) {
						var4 = field887[--Class85.field83];
						field880[++Class85.field1806 - 1] = Class232.method109(var4).field2446;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (Client.field277 != null && Client.field1524 < Client.field1870) {
						field887[++Class85.field83 - 1] = Client.field277[++Client.field1524 - 1] & '\uffff';
					} else {
						field887[++Class85.field83 - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(owner = "ms", name = "bu", desc = "(ILdm;ZB)I", opaque = "-1")
	public static int method6271(int var0, Class91 var1, boolean var2) {
		if (var0 == 5000) {
			field887[++Class85.field83 - 1] = Client.field716;
			return 1;
		} else if (var0 == 5001) {
			Class85.field83 -= 3;
			Client.field716 = field887[Class85.field83];
			Client.field5081 = Class113.method2877(field887[1 + Class85.field83]);
			if (Client.field5081 == null) {
				Client.field5081 = Class553.field5371;
			}

			Client.field597 = field887[Class85.field83 + 2];
			Class316 var14 = Class316.method3908(Class315.field3316, Client.field548.field1446);
			var14.field3374.method9388(Client.field716);
			var14.field3374.method9388(Client.field5081.field5370);
			var14.field3374.method9388(Client.field597);
			Client.field548.method2897(var14);
			return 1;
		} else {
			String var4;
			Class316 var7;
			int var9;
			int var11;
			if (var0 == 5002) {
				var4 = field880[--Class85.field1806];
				Class85.field83 -= 2;
				var9 = field887[Class85.field83];
				var11 = field887[1 + Class85.field83];
				var7 = Class316.method3908(Class315.field3291, Client.field548.field1446);
				var7.field3374.method9388(Class521.method7983(var4) + 2);
				var7.field3374.method9473(var4);
				var7.field3374.method9388(var9 - 1);
				var7.field3374.method9388(var11);
				Client.field548.method2897(var7);
				return 1;
			} else {
				Class67 var6;
				int var8;
				if (var0 == 5003) {
					Class85.field83 -= 2;
					var8 = field887[Class85.field83];
					var9 = field887[Class85.field83 + 1];
					var6 = Class128.method7541(var8, var9);
					if (var6 != null) {
						field887[++Class85.field83 - 1] = var6.field833;
						field887[++Class85.field83 - 1] = var6.field839;
						field880[++Class85.field1806 - 1] = var6.field840 != null ? var6.field840 : "";
						field880[++Class85.field1806 - 1] = var6.field837 != null ? var6.field837 : "";
						field880[++Class85.field1806 - 1] = var6.field838 != null ? var6.field838 : "";
						field887[++Class85.field83 - 1] = var6.method1837() ? 1 : (var6.method1829() ? 2 : 0);
					} else {
						field887[++Class85.field83 - 1] = -1;
						field887[++Class85.field83 - 1] = 0;
						field880[++Class85.field1806 - 1] = "";
						field880[++Class85.field1806 - 1] = "";
						field880[++Class85.field1806 - 1] = "";
						field887[++Class85.field83 - 1] = 0;
					}

					return 1;
				} else {
					Class67 var5;
					if (var0 == 5004) {
						var8 = field887[--Class85.field83];
						var5 = Class128.method452(var8);
						if (var5 != null) {
							field887[++Class85.field83 - 1] = var5.field831;
							field887[++Class85.field83 - 1] = var5.field839;
							field880[++Class85.field1806 - 1] = var5.field840 != null ? var5.field840 : "";
							field880[++Class85.field1806 - 1] = var5.field837 != null ? var5.field837 : "";
							field880[++Class85.field1806 - 1] = var5.field838 != null ? var5.field838 : "";
							field887[++Class85.field83 - 1] = var5.method1837() ? 1 : (var5.method1829() ? 2 : 0);
						} else {
							field887[++Class85.field83 - 1] = -1;
							field887[++Class85.field83 - 1] = 0;
							field880[++Class85.field1806 - 1] = "";
							field880[++Class85.field1806 - 1] = "";
							field880[++Class85.field1806 - 1] = "";
							field887[++Class85.field83 - 1] = 0;
						}

						return 1;
					} else if (var0 == 5005) {
						if (Client.field5081 == null) {
							field887[++Class85.field83 - 1] = -1;
						} else {
							field887[++Class85.field83 - 1] = Client.field5081.field5370;
						}

						return 1;
					} else {
						Class316 var12;
						if (var0 == 5008) {
							var4 = field880[--Class85.field1806];
							var9 = field887[--Class85.field83];
							var12 = Class166.method3512(var9, var4, Client.field2071, -1);
							Client.field548.method2897(var12);
							return 1;
						} else if (var0 == 5009) {
							Class85.field1806 -= 2;
							var4 = field880[Class85.field1806];
							String var10 = field880[Class85.field1806 + 1];
							var12 = Class316.method3908(Class315.field3318, Client.field548.field1446);
							var12.field3374.method9389(0);
							int var13 = var12.field3374.field5219;
							var12.field3374.method9473(var4);
							Class134.method3084(var12.field3374, var10);
							var12.field3374.method9401(var12.field3374.field5219 - var13);
							Client.field548.method2897(var12);
							return 1;
						} else if (var0 == 5010) {
							var4 = field880[--Class85.field1806];
							Class85.field83 -= 2;
							var9 = field887[Class85.field83];
							var11 = field887[1 + Class85.field83];
							var7 = Class166.method3512(var9, var4, Client.field2071, var11);
							Client.field548.method2897(var7);
							return 1;
						} else if (var0 != 5015) {
							if (var0 == 5016) {
								field887[++Class85.field83 - 1] = Client.field597;
								return 1;
							} else if (var0 == 5017) {
								var8 = field887[--Class85.field83];
								field887[++Class85.field83 - 1] = Class128.method2735(var8);
								return 1;
							} else if (var0 == 5018) {
								var8 = field887[--Class85.field83];
								field887[++Class85.field83 - 1] = Class128.method2518(var8);
								return 1;
							} else if (var0 == 5019) {
								var8 = field887[--Class85.field83];
								field887[++Class85.field83 - 1] = Class128.method2731(var8);
								return 1;
							} else if (var0 == 5020) {
								var4 = field880[--Class85.field1806];
								Client.method2236(var4);
								return 1;
							} else if (var0 == 5021) {
								Client.field483 = field880[--Class85.field1806].toLowerCase().trim();
								return 1;
							} else if (var0 == 5022) {
								field880[++Class85.field1806 - 1] = Client.field483;
								return 1;
							} else if (var0 == 5023) {
								var4 = field880[--Class85.field1806];
								System.out.println(var4);
								return 1;
							} else if (var0 == 5030) {
								Class85.field83 -= 2;
								var8 = field887[Class85.field83];
								var9 = field887[Class85.field83 + 1];
								var6 = Class128.method7541(var8, var9);
								if (var6 != null) {
									field887[++Class85.field83 - 1] = var6.field833;
									field887[++Class85.field83 - 1] = var6.field839;
									field880[++Class85.field1806 - 1] = var6.field840 != null ? var6.field840 : "";
									field880[++Class85.field1806 - 1] = var6.field837 != null ? var6.field837 : "";
									field880[++Class85.field1806 - 1] = var6.field838 != null ? var6.field838 : "";
									field887[++Class85.field83 - 1] = var6.method1837() ? 1 : (var6.method1829() ? 2 : 0);
									field880[++Class85.field1806 - 1] = "";
									field887[++Class85.field83 - 1] = 0;
								} else {
									field887[++Class85.field83 - 1] = -1;
									field887[++Class85.field83 - 1] = 0;
									field880[++Class85.field1806 - 1] = "";
									field880[++Class85.field1806 - 1] = "";
									field880[++Class85.field1806 - 1] = "";
									field887[++Class85.field83 - 1] = 0;
									field880[++Class85.field1806 - 1] = "";
									field887[++Class85.field83 - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var8 = field887[--Class85.field83];
								var5 = Class128.method452(var8);
								if (var5 != null) {
									field887[++Class85.field83 - 1] = var5.field831;
									field887[++Class85.field83 - 1] = var5.field839;
									field880[++Class85.field1806 - 1] = var5.field840 != null ? var5.field840 : "";
									field880[++Class85.field1806 - 1] = var5.field837 != null ? var5.field837 : "";
									field880[++Class85.field1806 - 1] = var5.field838 != null ? var5.field838 : "";
									field887[++Class85.field83 - 1] = var5.method1837() ? 1 : (var5.method1829() ? 2 : 0);
									field880[++Class85.field1806 - 1] = "";
									field887[++Class85.field83 - 1] = 0;
								} else {
									field887[++Class85.field83 - 1] = -1;
									field887[++Class85.field83 - 1] = 0;
									field880[++Class85.field1806 - 1] = "";
									field880[++Class85.field1806 - 1] = "";
									field880[++Class85.field1806 - 1] = "";
									field887[++Class85.field83 - 1] = 0;
									field880[++Class85.field1806 - 1] = "";
									field887[++Class85.field83 - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (Client.field107 != null && Client.field107.field1025 != null) {
								var4 = Client.field107.field1025.method10260();
							} else {
								var4 = "";
							}

							field880[++Class85.field1806 - 1] = var4;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfInfo(owner = "ap", name = "bh", desc = "(ILdm;ZI)I", opaque = "-850771288")
	public static int method190(int var0, Class91 var1, boolean var2) {
		if (var0 == 5306) {
			field887[++Class85.field83 - 1] = Client.method9643();
			return 1;
		} else {
			int var4;
			if (var0 == 5307) {
				var4 = field887[--Class85.field83];
				if (var4 == 1 || var4 == 2) {
					Client.method3259(var4);
				}

				return 1;
			} else if (var0 == 5308) {
				field887[++Class85.field83 - 1] = Client.field4851.method2695();
				return 1;
			} else if (var0 != 5309) {
				if (var0 == 5310) {
					--Class85.field83;
					return 1;
				} else {
					return 2;
				}
			} else {
				var4 = field887[--Class85.field83];
				if (var4 == 1 || var4 == 2) {
					Client.field4851.method2706(var4);
				}

				return 1;
			}
		}
	}

	@ObfInfo(owner = "gw", name = "bk", desc = "(ILdm;ZI)I", opaque = "-1996387452")
	public static int method3624(int var0, Class91 var1, boolean var2) {
		int var4;
		if (var0 == 5504) {
			Class85.field83 -= 2;
			var4 = field887[Class85.field83];
			int var5 = field887[Class85.field83 + 1];
			if (!Client.field496) {
				Client.field571 = var4;
				Client.field572 = var5;
			}

			return 1;
		} else if (var0 == 5505) {
			field887[++Class85.field83 - 1] = Client.field571;
			return 1;
		} else if (var0 == 5506) {
			field887[++Class85.field83 - 1] = Client.field572;
			return 1;
		} else if (var0 == 5530) {
			var4 = field887[--Class85.field83];
			if (var4 < 0) {
				var4 = 0;
			}

			Client.field522 = var4;
			return 1;
		} else if (var0 == 5531) {
			field887[++Class85.field83 - 1] = Client.field522;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "oy", name = "bp", desc = "(ILdm;ZI)I")
	public static int method7380(int var0, Class91 var1, boolean var2) {
		if (var0 == 5630) {
			Client.field549 = 250;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "cm", name = "br", desc = "(II)I")
	public static int method1803(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}

	@ObfInfo(owner = "ky", name = "bx", desc = "(II)I")
	public static int method5782(int var0) {
		return (int)((Math.log((double)var0) / field889 - 7.0D) * 256.0D);
	}

	@ObfInfo(owner = "ma", name = "bd", desc = "(ILdm;ZB)I", opaque = "-1")
	public static int method6167(int var0, Class91 var1, boolean var2) {
		if (var0 == 6200) {
			Class85.field83 -= 2;
			Client.field758 = (short)method1803(field887[Class85.field83]);
			if (Client.field758 <= 0) {
				Client.field758 = 256;
			}

			Client.field759 = (short)method1803(field887[1 + Class85.field83]);
			if (Client.field759 <= 0) {
				Client.field759 = 256;
			}

			return 1;
		} else if (var0 == 6201) {
			Class85.field83 -= 2;
			Client.field760 = (short)field887[Class85.field83];
			if (Client.field760 <= 0) {
				Client.field760 = 256;
			}

			Client.field508 = (short)field887[1 + Class85.field83];
			if (Client.field508 <= 0) {
				Client.field508 = 320;
			}

			return 1;
		} else if (var0 == 6202) {
			Class85.field83 -= 4;
			Client.field762 = (short)field887[Class85.field83];
			if (Client.field762 <= 0) {
				Client.field762 = 1;
			}

			Client.field718 = (short)field887[1 + Class85.field83];
			if (Client.field718 <= 0) {
				Client.field718 = 32767;
			} else if (Client.field718 < Client.field762) {
				Client.field718 = Client.field762;
			}

			Client.field653 = (short)field887[Class85.field83 + 2];
			if (Client.field653 <= 0) {
				Client.field653 = 1;
			}

			Client.field765 = (short)field887[Class85.field83 + 3];
			if (Client.field765 <= 0) {
				Client.field765 = 32767;
			} else if (Client.field765 < Client.field653) {
				Client.field765 = Client.field653;
			}

			return 1;
		} else if (var0 == 6203) {
			if (Client.field541 != null) {
				Client.method6444(0, 0, Client.field541.field3692, Client.field541.field3736, false);
				field887[++Class85.field83 - 1] = Client.field768;
				field887[++Class85.field83 - 1] = Client.field769;
			} else {
				field887[++Class85.field83 - 1] = -1;
				field887[++Class85.field83 - 1] = -1;
			}

			return 1;
		} else if (var0 == 6204) {
			field887[++Class85.field83 - 1] = Client.field760;
			field887[++Class85.field83 - 1] = Client.field508;
			return 1;
		} else if (var0 == 6205) {
			field887[++Class85.field83 - 1] = method5782(Client.field758);
			field887[++Class85.field83 - 1] = method5782(Client.field759);
			return 1;
		} else if (var0 == 6220) {
			field887[++Class85.field83 - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			field887[++Class85.field83 - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			field887[++Class85.field83 - 1] = Client.field182;
			return 1;
		} else if (var0 == 6223) {
			field887[++Class85.field83 - 1] = Client.field5261;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "hi", name = "bv", desc = "(ILdm;ZI)I", opaque = "150549543")
	public static int method3753(int var0, Class91 var1, boolean var2) {
		if (var0 == 6500) {
			field887[++Class85.field83 - 1] = Class64.method7411() ? 1 : 0;
			return 1;
		} else {
			Class64 var9;
			if (var0 == 6501) {
				var9 = Class64.method4486();
				if (var9 != null) {
					field887[++Class85.field83 - 1] = var9.field473;
					field887[++Class85.field83 - 1] = var9.field480;
					field880[++Class85.field1806 - 1] = var9.field477;
					field887[++Class85.field83 - 1] = var9.field482;
					field887[++Class85.field83 - 1] = var9.field475;
					field880[++Class85.field1806 - 1] = var9.field476;
				} else {
					field887[++Class85.field83 - 1] = -1;
					field887[++Class85.field83 - 1] = 0;
					field880[++Class85.field1806 - 1] = "";
					field887[++Class85.field83 - 1] = 0;
					field887[++Class85.field83 - 1] = 0;
					field880[++Class85.field1806 - 1] = "";
				}

				return 1;
			} else if (var0 == 6502) {
				var9 = Class64.method3086();
				if (var9 != null) {
					field887[++Class85.field83 - 1] = var9.field473;
					field887[++Class85.field83 - 1] = var9.field480;
					field880[++Class85.field1806 - 1] = var9.field477;
					field887[++Class85.field83 - 1] = var9.field482;
					field887[++Class85.field83 - 1] = var9.field475;
					field880[++Class85.field1806 - 1] = var9.field476;
				} else {
					field887[++Class85.field83 - 1] = -1;
					field887[++Class85.field83 - 1] = 0;
					field880[++Class85.field1806 - 1] = "";
					field887[++Class85.field83 - 1] = 0;
					field887[++Class85.field83 - 1] = 0;
					field880[++Class85.field1806 - 1] = "";
				}

				return 1;
			} else {
				int var4;
				Class64 var5;
				int var11;
				if (var0 == 6506) {
					var4 = field887[--Class85.field83];
					var5 = null;

					for (var11 = 0; var11 < Class64.field469; ++var11) {
						if (Class76.field4598[var11].field473 == var4) {
							var5 = Class76.field4598[var11];
							break;
						}
					}

					if (var5 != null) {
						field887[++Class85.field83 - 1] = var5.field473;
						field887[++Class85.field83 - 1] = var5.field480;
						field880[++Class85.field1806 - 1] = var5.field477;
						field887[++Class85.field83 - 1] = var5.field482;
						field887[++Class85.field83 - 1] = var5.field475;
						field880[++Class85.field1806 - 1] = var5.field476;
					} else {
						field887[++Class85.field83 - 1] = -1;
						field887[++Class85.field83 - 1] = 0;
						field880[++Class85.field1806 - 1] = "";
						field887[++Class85.field83 - 1] = 0;
						field887[++Class85.field83 - 1] = 0;
						field880[++Class85.field1806 - 1] = "";
					}

					return 1;
				} else if (var0 == 6507) {
					Class85.field83 -= 4;
					var4 = field887[Class85.field83];
					boolean var10 = field887[1 + Class85.field83] == 1;
					var11 = field887[Class85.field83 + 2];
					boolean var7 = 1 == field887[Class85.field83 + 3];
					Class472.method8652(var4, var10, var11, var7);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == 6512) {
						Client.field639 = field887[--Class85.field83] == 1;
						return 1;
					} else {
						Class217 var6;
						int var8;
						if (var0 == 6513) {
							Class85.field83 -= 2;
							var4 = field887[Class85.field83];
							var8 = field887[Class85.field83 + 1];
							var6 = Class217.method5716(var8);
							if (var6.method4117()) {
								field880[++Class85.field1806 - 1] = Class225.method3256(var4).method4253(var8, var6.field2187);
							} else {
								field887[++Class85.field83 - 1] = Class225.method3256(var4).method4271(var8, var6.field2186);
							}

							return 1;
						} else if (var0 == 6514) {
							Class85.field83 -= 2;
							var4 = field887[Class85.field83];
							var8 = field887[1 + Class85.field83];
							var6 = Class217.method5716(var8);
							if (var6.method4117()) {
								field880[++Class85.field1806 - 1] = Class222.method4161(var4).method4195(var8, var6.field2187);
							} else {
								field887[++Class85.field83 - 1] = Class222.method4161(var4).method4182(var8, var6.field2186);
							}

							return 1;
						} else if (var0 == 6515) {
							Class85.field83 -= 2;
							var4 = field887[Class85.field83];
							var8 = field887[Class85.field83 + 1];
							var6 = Class217.method5716(var8);
							if (var6.method4117()) {
								field880[++Class85.field1806 - 1] = Class232.method109(var4).method4425(var8, var6.field2187);
							} else {
								field887[++Class85.field83 - 1] = Class232.method109(var4).method4424(var8, var6.field2186);
							}

							return 1;
						} else if (var0 == 6516) {
							Class85.field83 -= 2;
							var4 = field887[Class85.field83];
							var8 = field887[1 + Class85.field83];
							var6 = Class217.method5716(var8);
							if (var6.method4117()) {
								field880[++Class85.field1806 - 1] = Class234.method2604(var4).method4492(var8, var6.field2187);
							} else {
								field887[++Class85.field83 - 1] = Class234.method2604(var4).method4491(var8, var6.field2186);
							}

							return 1;
						} else if (var0 == 6518) {
							field887[++Class85.field83 - 1] = Client.field565 ? 1 : 0;
							return 1;
						} else if (var0 == 6519) {
							field887[++Class85.field83 - 1] = Client.field561;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == 6521) {
							return 1;
						} else if (var0 == 6522) {
							--Class85.field1806;
							--Class85.field83;
							return 1;
						} else if (var0 == 6523) {
							--Class85.field1806;
							--Class85.field83;
							return 1;
						} else if (var0 == 6524) {
							field887[++Class85.field83 - 1] = -1;
							return 1;
						} else if (var0 == 6525) {
							field887[++Class85.field83 - 1] = 1;
							return 1;
						} else if (var0 == 6526) {
							field887[++Class85.field83 - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							field887[++Class85.field83 - 1] = Client.field491;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = field887[--Class85.field83];
					if (var4 >= 0 && var4 < Class64.field469) {
						var5 = Class76.field4598[var4];
						field887[++Class85.field83 - 1] = var5.field473;
						field887[++Class85.field83 - 1] = var5.field480;
						field880[++Class85.field1806 - 1] = var5.field477;
						field887[++Class85.field83 - 1] = var5.field482;
						field887[++Class85.field83 - 1] = var5.field475;
						field880[++Class85.field1806 - 1] = var5.field476;
					} else {
						field887[++Class85.field83 - 1] = -1;
						field887[++Class85.field83 - 1] = 0;
						field880[++Class85.field1806 - 1] = "";
						field887[++Class85.field83 - 1] = 0;
						field887[++Class85.field83 - 1] = 0;
						field880[++Class85.field1806 - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(owner = "au", name = "bm", desc = "(ILdm;ZB)I", opaque = "9")
	public static int method327(int var0, Class91 var1, boolean var2) {
		int var4;
		if (var0 == 6600) {
			var4 = Client.field3857.field1300;
			int var17 = Client.field3857.field1289 + (Client.field107.field1065 >> 7);
			int var13 = Client.field3857.field1285 + (Client.field107.field1126 >> 7);
			Client.method3301().method9001(var4, var17, var13, true);
			return 1;
		} else {
			Class286 var8;
			if (var0 == 6601) {
				var4 = field887[--Class85.field83];
				String var16 = "";
				var8 = Client.method3301().method9019(var4);
				if (var8 != null) {
					var16 = var8.method5802();
				}

				field880[++Class85.field1806 - 1] = var16;
				return 1;
			} else if (var0 == 6602) {
				var4 = field887[--Class85.field83];
				Client.method3301().method9002(var4);
				return 1;
			} else if (var0 == 6603) {
				field887[++Class85.field83 - 1] = Client.method3301().method9023();
				return 1;
			} else if (var0 == 6604) {
				var4 = field887[--Class85.field83];
				Client.method3301().method9090(var4);
				return 1;
			} else if (var0 == 6605) {
				field887[++Class85.field83 - 1] = Client.method3301().method9018() ? 1 : 0;
				return 1;
			} else {
				Class348 var15;
				if (var0 == 6606) {
					var15 = new Class348(field887[--Class85.field83]);
					Client.method3301().method9067(var15.field3869, var15.field3868);
					return 1;
				} else if (var0 == 6607) {
					var15 = new Class348(field887[--Class85.field83]);
					Client.method3301().method9021(var15.field3869, var15.field3868);
					return 1;
				} else if (var0 == 6608) {
					var15 = new Class348(field887[--Class85.field83]);
					Client.method3301().method9022(var15.field3870, var15.field3869, var15.field3868);
					return 1;
				} else if (var0 == 6609) {
					var15 = new Class348(field887[--Class85.field83]);
					Client.method3301().method9035(var15.field3870, var15.field3869, var15.field3868);
					return 1;
				} else if (var0 == 6610) {
					field887[++Class85.field83 - 1] = Client.method3301().method9024();
					field887[++Class85.field83 - 1] = Client.method3301().method9158();
					return 1;
				} else {
					Class286 var12;
					if (var0 == 6611) {
						var4 = field887[--Class85.field83];
						var12 = Client.method3301().method9019(var4);
						if (var12 == null) {
							field887[++Class85.field83 - 1] = 0;
						} else {
							field887[++Class85.field83 - 1] = var12.method5806().method6698();
						}

						return 1;
					} else if (var0 == 6612) {
						var4 = field887[--Class85.field83];
						var12 = Client.method3301().method9019(var4);
						if (var12 == null) {
							field887[++Class85.field83 - 1] = 0;
							field887[++Class85.field83 - 1] = 0;
						} else {
							field887[++Class85.field83 - 1] = (var12.method5800() - var12.method5799() + 1) * 64;
							field887[++Class85.field83 - 1] = (var12.method5824() - var12.method5801() + 1) * 64;
						}

						return 1;
					} else if (var0 == 6613) {
						var4 = field887[--Class85.field83];
						var12 = Client.method3301().method9019(var4);
						if (var12 == null) {
							field887[++Class85.field83 - 1] = 0;
							field887[++Class85.field83 - 1] = 0;
							field887[++Class85.field83 - 1] = 0;
							field887[++Class85.field83 - 1] = 0;
						} else {
							field887[++Class85.field83 - 1] = var12.method5799() * 64;
							field887[++Class85.field83 - 1] = var12.method5801() * 64;
							field887[++Class85.field83 - 1] = var12.method5800() * 64 + 64 - 1;
							field887[++Class85.field83 - 1] = var12.method5824() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == 6614) {
						var4 = field887[--Class85.field83];
						var12 = Client.method3301().method9019(var4);
						if (var12 == null) {
							field887[++Class85.field83 - 1] = -1;
						} else {
							field887[++Class85.field83 - 1] = var12.method5798();
						}

						return 1;
					} else if (var0 == 6615) {
						var15 = Client.method3301().method9026();
						if (var15 == null) {
							field887[++Class85.field83 - 1] = -1;
							field887[++Class85.field83 - 1] = -1;
						} else {
							field887[++Class85.field83 - 1] = var15.field3869;
							field887[++Class85.field83 - 1] = var15.field3868;
						}

						return 1;
					} else if (var0 == 6616) {
						field887[++Class85.field83 - 1] = Client.method3301().method9069();
						return 1;
					} else if (var0 == 6617) {
						var15 = new Class348(field887[--Class85.field83]);
						var12 = Client.method3301().method9004();
						if (var12 == null) {
							field887[++Class85.field83 - 1] = -1;
							field887[++Class85.field83 - 1] = -1;
							return 1;
						} else {
							int[] var11 = var12.method5789(var15.field3870, var15.field3869, var15.field3868);
							if (var11 == null) {
								field887[++Class85.field83 - 1] = -1;
								field887[++Class85.field83 - 1] = -1;
							} else {
								field887[++Class85.field83 - 1] = var11[0];
								field887[++Class85.field83 - 1] = var11[1];
							}

							return 1;
						}
					} else {
						Class348 var6;
						if (var0 == 6618) {
							var15 = new Class348(field887[--Class85.field83]);
							var12 = Client.method3301().method9004();
							if (var12 == null) {
								field887[++Class85.field83 - 1] = -1;
								field887[++Class85.field83 - 1] = -1;
								return 1;
							} else {
								var6 = var12.method5842(var15.field3869, var15.field3868);
								if (var6 == null) {
									field887[++Class85.field83 - 1] = -1;
								} else {
									field887[++Class85.field83 - 1] = var6.method6698();
								}

								return 1;
							}
						} else {
							Class348 var9;
							if (var0 == 6619) {
								Class85.field83 -= 2;
								var4 = field887[Class85.field83];
								var9 = new Class348(field887[1 + Class85.field83]);
								method5323(var4, var9, false);
								return 1;
							} else if (var0 == 6620) {
								Class85.field83 -= 2;
								var4 = field887[Class85.field83];
								var9 = new Class348(field887[1 + Class85.field83]);
								method5323(var4, var9, true);
								return 1;
							} else if (var0 == 6621) {
								Class85.field83 -= 2;
								var4 = field887[Class85.field83];
								var9 = new Class348(field887[Class85.field83 + 1]);
								var8 = Client.method3301().method9019(var4);
								if (var8 == null) {
									field887[++Class85.field83 - 1] = 0;
									return 1;
								} else {
									field887[++Class85.field83 - 1] = var8.method5843(var9.field3870, var9.field3869, var9.field3868) ? 1 : 0;
									return 1;
								}
							} else if (var0 == 6622) {
								field887[++Class85.field83 - 1] = Client.method3301().method9027();
								field887[++Class85.field83 - 1] = Client.method3301().method9028();
								return 1;
							} else if (var0 == 6623) {
								var15 = new Class348(field887[--Class85.field83]);
								var12 = Client.method3301().method9147(var15.field3870, var15.field3869, var15.field3868);
								if (var12 == null) {
									field887[++Class85.field83 - 1] = -1;
								} else {
									field887[++Class85.field83 - 1] = var12.method5792();
								}

								return 1;
							} else if (var0 == 6624) {
								Client.method3301().method9029(field887[--Class85.field83]);
								return 1;
							} else if (var0 == 6625) {
								Client.method3301().method9030();
								return 1;
							} else if (var0 == 6626) {
								Client.method3301().method9031(field887[--Class85.field83]);
								return 1;
							} else if (var0 == 6627) {
								Client.method3301().method9032();
								return 1;
							} else {
								boolean var14;
								if (var0 == 6628) {
									var14 = field887[--Class85.field83] == 1;
									Client.method3301().method9066(var14);
									return 1;
								} else if (var0 == 6629) {
									var4 = field887[--Class85.field83];
									Client.method3301().method9034(var4);
									return 1;
								} else if (var0 == 6630) {
									var4 = field887[--Class85.field83];
									Client.method3301().method9050(var4);
									return 1;
								} else if (var0 == 6631) {
									Client.method3301().method9056();
									return 1;
								} else if (var0 == 6632) {
									var14 = field887[--Class85.field83] == 1;
									Client.method3301().method9013(var14);
									return 1;
								} else {
									boolean var10;
									if (var0 == 6633) {
										Class85.field83 -= 2;
										var4 = field887[Class85.field83];
										var10 = field887[Class85.field83 + 1] == 1;
										Client.method3301().method9038(var4, var10);
										return 1;
									} else if (var0 == 6634) {
										Class85.field83 -= 2;
										var4 = field887[Class85.field83];
										var10 = 1 == field887[Class85.field83 + 1];
										Client.method3301().method9039(var4, var10);
										return 1;
									} else if (var0 == 6635) {
										field887[++Class85.field83 - 1] = Client.method3301().method9040() ? 1 : 0;
										return 1;
									} else if (var0 == 6636) {
										var4 = field887[--Class85.field83];
										field887[++Class85.field83 - 1] = Client.method3301().method9041(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6637) {
										var4 = field887[--Class85.field83];
										field887[++Class85.field83 - 1] = Client.method3301().method9042(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										Class85.field83 -= 2;
										var4 = field887[Class85.field83];
										var9 = new Class348(field887[1 + Class85.field83]);
										var6 = Client.method3301().method8989(var4, var9);
										if (var6 == null) {
											field887[++Class85.field83 - 1] = -1;
										} else {
											field887[++Class85.field83 - 1] = var6.method6698();
										}

										return 1;
									} else {
										Class305 var7;
										if (var0 == 6639) {
											var7 = Client.method3301().method9047();
											if (var7 == null) {
												field887[++Class85.field83 - 1] = -1;
												field887[++Class85.field83 - 1] = -1;
											} else {
												field887[++Class85.field83 - 1] = var7.method5728();
												field887[++Class85.field83 - 1] = var7.field3235.method6698();
											}

											return 1;
										} else if (var0 == 6640) {
											var7 = Client.method3301().method9058();
											if (var7 == null) {
												field887[++Class85.field83 - 1] = -1;
												field887[++Class85.field83 - 1] = -1;
											} else {
												field887[++Class85.field83 - 1] = var7.method5728();
												field887[++Class85.field83 - 1] = var7.field3235.method6698();
											}

											return 1;
										} else {
											Class200 var5;
											if (var0 == 6693) {
												var4 = field887[--Class85.field83];
												var5 = Class200.method3917(var4);
												if (var5.field2048 == null) {
													field880[++Class85.field1806 - 1] = "";
												} else {
													field880[++Class85.field1806 - 1] = var5.field2048;
												}

												return 1;
											} else if (var0 == 6694) {
												var4 = field887[--Class85.field83];
												var5 = Class200.method3917(var4);
												field887[++Class85.field83 - 1] = var5.field2050;
												return 1;
											} else if (var0 == 6695) {
												var4 = field887[--Class85.field83];
												var5 = Class200.method3917(var4);
												if (var5 == null) {
													field887[++Class85.field83 - 1] = -1;
												} else {
													field887[++Class85.field83 - 1] = var5.field2065;
												}

												return 1;
											} else if (var0 == 6696) {
												var4 = field887[--Class85.field83];
												var5 = Class200.method3917(var4);
												if (var5 == null) {
													field887[++Class85.field83 - 1] = -1;
												} else {
													field887[++Class85.field83 - 1] = var5.field2046;
												}

												return 1;
											} else if (var0 == 6697) {
												field887[++Class85.field83 - 1] = field1483.field3256;
												return 1;
											} else if (var0 == 6698) {
												field887[++Class85.field83 - 1] = field1483.field3254.method6698();
												return 1;
											} else if (var0 == 6699) {
												field887[++Class85.field83 - 1] = field1483.field3255.method6698();
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

	@ObfInfo(owner = "af", name = "bq", desc = "(ILdm;ZB)I", opaque = "0")
	public static int method69(int var0, Class91 var1, boolean var2) {
		if (var0 == 6754) {
			int var6 = field887[--Class85.field83];
			Class225 var7 = Class225.method3256(var6);
			field880[++Class85.field1806 - 1] = var7 != null ? var7.field2337 : "";
			return 1;
		} else {
			Class225 var4;
			if (var0 == 6764) {
				Class85.field83 -= 2;
				var4 = Class225.method3256(field887[Class85.field83]);
				int var5 = field887[Class85.field83 + 1];
				field887[++Class85.field83 - 1] = var4.method4256(var5);
				field887[++Class85.field83 - 1] = var4.method4258(var5);
				return 1;
			} else if (var0 == 6765) {
				var4 = Class225.method3256(field887[--Class85.field83]);
				field887[++Class85.field83 - 1] = var4 != null ? var4.field2319 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfInfo(owner = "eo", name = "bc", desc = "(ILdm;ZB)I")
	public static int method2947(int var0, Class91 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(owner = "ny", name = "bz", desc = "(ILdm;ZB)I")
	public static int method7118(int var0, Class91 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(owner = "ow", name = "ba", desc = "(ILdm;ZI)I", opaque = "-1592763649")
	public static int method7378(int var0, Class91 var1, boolean var2) {
		if (var0 == 7108) {
			field887[++Class85.field83 - 1] = Client.method3273() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "of", name = "bb", desc = "(ILdm;ZB)I", opaque = "0")
	public static int method7139(int var0, Class91 var1, boolean var2) {
		if (var0 == 7463) {
			boolean var4 = field887[--Class85.field83] == 1;
			Client.method171(var4);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "qd", name = "ck", desc = "(ILdm;ZB)I", opaque = "-2")
	public static int method7810(int var0, Class91 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 8000) {
			--Class85.field83;
			var4 = field887[Class85.field83];
			var5 = field877[var4];
			Class532.method6164(field879[var4], new int[var5], 0, var5 - 1);
			return 1;
		} else if (var0 == 8001) {
			Class85.field83 -= 3;
			var4 = field887[Class85.field83];
			var5 = field887[Class85.field83 + 1];
			int var6 = field887[Class85.field83 + 2];
			int var7 = field877[var4];
			if (var7 <= 1) {
				return 1;
			} else {
				Class445.method8321(field879[var4], var7, var5, var6);
				return 1;
			}
		} else {
			return 2;
		}
	}

	@ObfInfo(owner = "ab", name = "cn", desc = "(IB)V", opaque = "7")
	public static void method35(int var0) {
		if (var0 != -1) {
			if (Client.field25.method6720(var0)) {
				Class340[] var2 = Client.field25.field3877[var0];

				for (int var3 = 0; var3 < var2.length; ++var3) {
					Class340 var4 = var2[var3];
					if (var4.field3765 != null) {
						Class101 var5 = new Class101();
						var5.field1325 = var4;
						var5.field1333 = var4.field3765;
						method3072(var5, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfInfo(owner = "kd", name = "ch", desc = "(ILnj;ZI)V")
	public static void method5323(int var0, Class348 var1, boolean var2) {
		Class286 var4 = Client.method3301().method9019(var0);
		int var5 = Client.field107.field1023;
		int var6 = Client.field3857.field1289 + (Client.field107.field1065 >> 7);
		int var7 = Client.field3857.field1285 + (Client.field107.field1126 >> 7);
		Class348 var8 = new Class348(var5, var6, var7);
		Client.method3301().method9037(var4, var8, var1, var2);
	}

	@ObfInfo(owner = "ff", name = "cp", desc = "(Luy;I)Ljava/lang/Object;", opaque = "251829696")
	public static Object method3094(Class545 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5335) {
			case 0:
				return field880[--Class85.field1806];
			case 2:
				return field887[--Class85.field83];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfInfo(owner = "lc", name = "cd", desc = "(IB)Ljava/lang/Object;")
	public static Object method5884(int var0) {
		return method3094((Class545)Class62.method1112(Class545.method9900(), var0));
	}
}
