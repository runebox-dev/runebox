import io.runebox.ObfInfo;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

@ObfInfo(name = "ca")
public class Class53 {
	@ObfInfo(owner = "hv", name = "br", desc = "Lqa;")
	public static Class417 field2223;
	@ObfInfo(owner = "jl", name = "bf", desc = "Lqa;")
	public static Class417 field2598;
	@ObfInfo(owner = "hs", name = "ai", desc = "Lvg;")
	public static Class553 field2205;
	@ObfInfo(name = "ab", desc = "Lvg;")
	public static Class553 field343;
	@ObfInfo(owner = "va", name = "ds", desc = "[Lvg;")
	public static Class553[] field5363;
	@ObfInfo(owner = "ek", name = "dp", desc = "Lvv;")
	public static Class568 field1431;
	@ObfInfo(owner = "ep", name = "aj", desc = "Lvv;")
	public static Class568 field1451;
	@ObfInfo(owner = "fz", name = "ah", desc = "Lvv;")
	public static Class568 field1746;
	@ObfInfo(owner = "bi", name = "dv", desc = "Lvv;")
	public static Class568 field179;
	@ObfInfo(name = "av", desc = "Lvv;")
	public static Class568 field342;
	@ObfInfo(name = "ax", desc = "Lvv;")
	public static Class568 field345;
	@ObfInfo(name = "az", desc = "Lvv;")
	public static Class568 field365;
	@ObfInfo(owner = "nr", name = "du", desc = "Lvv;")
	public static Class568 field3773;
	@ObfInfo(owner = "nv", name = "ac", desc = "Lvv;")
	public static Class568 field3793;
	@ObfInfo(owner = "se", name = "ap", desc = "Lvv;")
	public static Class568 field4962;
	@ObfInfo(owner = "te", name = "an", desc = "Lvv;")
	public static Class568 field5060;
	@ObfInfo(owner = "es", name = "do", desc = "[Lvv;")
	public static Class568[] field1462;
	@ObfInfo(owner = "kg", name = "ak", desc = "[Lvv;")
	public static Class568[] field2743;
	@ObfInfo(owner = "px", name = "dk", desc = "[Lvv;")
	public static Class568[] field4674;
	@ObfInfo(owner = "qn", name = "au", desc = "[Lvv;")
	public static Class568[] field4740;
	@ObfInfo(owner = "cx", name = "dm", desc = "[Lvv;")
	public static Class568[] field919;
	@ObfInfo(owner = "dt", name = "al", desc = "Ldj;")
	public static Class88 field1208;
	@ObfInfo(name = "dn", desc = "Z")
	public static boolean field339;
	@ObfInfo(name = "ad", desc = "Z")
	public static boolean field340;
	@ObfInfo(name = "ca", desc = "Z")
	public static boolean field344;
	@ObfInfo(name = "cb", desc = "Z")
	public static boolean field363;
	@ObfInfo(name = "cz", desc = "Z")
	public static boolean field379;
	@ObfInfo(owner = "ae", name = "cr", desc = "I", intMultiplier = -1828915477)
	public static int field27;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 48347693)
	public static int field341;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 769603281)
	public static int field347;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 3332333)
	public static int field348;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1109948055)
	public static int field349;
	@ObfInfo(name = "bh", desc = "I", intMultiplier = -782608359)
	public static int field351;
	@ObfInfo(name = "bz", desc = "I", intMultiplier = 920051483)
	public static int field352;
	@ObfInfo(name = "cf", desc = "I", intMultiplier = -59444677)
	public static int field353;
	@ObfInfo(name = "df", desc = "I", intMultiplier = 1276208829)
	public static int field366;
	@ObfInfo(name = "di", desc = "I", intMultiplier = 1391907999)
	public static int field369;
	@ObfInfo(name = "co", desc = "I", intMultiplier = 1139372411)
	public static int field370;
	@ObfInfo(name = "dt", desc = "I", intMultiplier = -2077730609)
	public static int field371;
	@ObfInfo(name = "da", desc = "I", intMultiplier = -1867410509)
	public static int field372;
	@ObfInfo(owner = "uj", name = "cc", desc = "I", intMultiplier = 1588295485)
	public static int field5282;
	@ObfInfo(owner = "fu", name = "cx", desc = "Ljava/lang/String;")
	public static String field1699;
	@ObfInfo(owner = "jl", name = "bk", desc = "Ljava/lang/String;")
	public static String field2597;
	@ObfInfo(name = "am", desc = "Ljava/lang/String;")
	public static String field350;
	@ObfInfo(name = "dg", desc = "Ljava/lang/String;")
	public static String field354;
	@ObfInfo(name = "cl", desc = "Ljava/lang/String;")
	public static String field355;
	@ObfInfo(name = "dd", desc = "Ljava/lang/String;")
	public static String field356;
	@ObfInfo(name = "cv", desc = "Ljava/lang/String;")
	public static String field357;
	@ObfInfo(name = "cu", desc = "Ljava/lang/String;")
	public static String field358;
	@ObfInfo(name = "cn", desc = "Ljava/lang/String;")
	public static String field359;
	@ObfInfo(name = "cg", desc = "Ljava/lang/String;")
	public static String field367;
	@ObfInfo(name = "cs", desc = "Ljava/lang/String;")
	public static String field368;
	@ObfInfo(name = "cm", desc = "Ljava/lang/String;")
	public static String field377;
	@ObfInfo(name = "dw", desc = "[Ljava/lang/String;")
	public static String[] field360;
	@ObfInfo(name = "ch", desc = "[Ljava/lang/String;")
	public static String[] field361;
	@ObfInfo(name = "dh", desc = "[Ljava/lang/String;")
	public static String[] field362;
	@ObfInfo(name = "dy", desc = "[Ljava/lang/String;")
	public static String[] field375;
	@ObfInfo(name = "dz", desc = "J", longMultiplier = 5231889937501240551L)
	public static long field373;
	@ObfInfo(name = "dc", desc = "J", longMultiplier = 7259940804597753815L)
	public static long field374;

	static {
		field341 = 0;
		field347 = 202 + field341;
		field349 = 10;
		field350 = "";
		field351 = -1;
		field352 = 1;
		field353 = 0;
		field357 = "";
		field355 = "";
		field377 = "";
		field367 = "";
		field358 = "";
		field359 = "";
		field370 = 0;
		field361 = new String[8];
		field368 = "";
		field363 = false;
		field379 = false;
		field344 = true;
		field366 = 0;
		field356 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		field354 = "1234567890";
		field339 = false;
		field369 = -1;
		field371 = 0;
		field372 = 0;
		new DecimalFormat("##0.00");
		new Class146();
		field373 = -1L;
		field374 = -1L;
		field375 = new String[]{"title.jpg"};
		field360 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field362 = new String[]{"logo_speedrunning"};
	}

	@ObfInfo(owner = "jj", name = "aq", desc = "(Lok;I)I", opaque = "1500532858")
	public static int method4692(Class375 var0) {
		int var2 = field375.length + field360.length;
		String[] var3 = field362;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			String var5 = var3[var4];
			if (var0.method7150(var5) != -1) {
				++var2;
			}
		}

		return var2;
	}

	@ObfInfo(owner = "dj", name = "ad", desc = "(Lok;Lok;ZII)V", opaque = "-1507932069")
	public static void method2401(Class375 var0, Class375 var1, boolean var2, int var3) {
		if (field340) {
			if (var3 == 4) {
				method3344(4);
			}

		} else {
			if (var3 == 0) {
				method2989(var2);
			} else {
				method3344(var3);
			}

			Class569.method10134();
			byte[] var5 = var0.method7153("title.jpg", "");
			field343 = Class41.method4002(var5);
			field2205 = field343.method9594();
			int var6 = Client.field796;
			if ((var6 & Class545.field5331.method129()) != 0) {
				Class99.field4534 = Class402.method7469(var1, "logo_deadman_mode", "");
			} else if ((var6 & Class545.field5358.method129()) != 0) {
				Class99.field4534 = Class402.method7469(var1, "logo_seasonal_mode", "");
			} else if ((var6 & Class545.field5336.method129()) != 0) {
				Class99.field4534 = Class402.method7469(var1, "logo_speedrunning", "");
			} else {
				Class99.field4534 = Class402.method7469(var1, "logo", "");
			}

			field4962 = Class402.method7469(var1, "titlebox", "");
			field5060 = Class402.method7469(var1, "titlebutton", "");
			field1451 = Class402.method7469(var1, "titlebutton_large", "");
			field342 = Class402.method7469(var1, "play_now_text", "");
			Class402.method7469(var1, "titlebutton_wide42,1", "");
			field2743 = Class510.method9001(var1, "runes", "");
			field4740 = Class510.method9001(var1, "title_mute", "");
			field1746 = Class402.method7469(var1, "options_radio_buttons,0", "");
			field365 = Class402.method7469(var1, "options_radio_buttons,4", "");
			field345 = Class402.method7469(var1, "options_radio_buttons,2", "");
			field3793 = Class402.method7469(var1, "options_radio_buttons,6", "");
			field5282 = field1746.field5495;
			field27 = field1746.field5496;
			field1208 = new Class88(field2743);
			if (var2) {
				field358 = "";
				field359 = "";
				field361 = new String[8];
				field370 = 0;
			}

			Client.field57 = 0;
			field1699 = "";
			field344 = true;
			field339 = false;
			Class30.method433();
			Class323.method4662();
			Client.method3213().method7068(false);
			field340 = true;
			field341 = (Client.field954 - 765) / 2;
			field347 = field341 + 202;
			field348 = 180 + field347;
			field343.method9636(field341, 0);
			field2205.method9636(field341 + 382, 0);
			Class99.field4534.method10122(field341 + 382 - Class99.field4534.field5495 / 2, 18);
		}
	}

	@ObfInfo(owner = "ck", name = "ag", desc = "(ZZB)Lvv;", opaque = "-1")
	public static Class568 method1275(boolean var0, boolean var1) {
		return var0 ? (var1 ? field3793 : field345) : (var1 ? field365 : field1746);
	}

	@ObfInfo(owner = "eq", name = "ak", desc = "(B)V", opaque = "-1")
	public static void method2986() {
		if (Client.field583 && field358 != null && field358.length() > 0) {
			field366 = 1;
		} else {
			field366 = 0;
		}

	}

	@ObfInfo(owner = "lk", name = "ap", desc = "(Lbs;Lqh;Lqh;B)V", opaque = "-1")
	public static void method5808(Class45 var0, Class424 var1, Class424 var2) {
		if (field339) {
			Class272.method5111(var0);
		} else {
			if ((Class42.field227 == 1 || !Client.field911 && 4 == Class42.field227) && Class42.field230 >= 765 + field341 - 50 && Class42.field222 >= 453) {
				Client.field1474.method2466(!Client.field1474.method2492());
				Class30.method433();
				Class323.method4662();
			}

			if (5 != Client.field537) {
				if (field373 == -1L) {
					field373 = Class329.method4953() + 1000L;
				}

				long var4 = Class329.method4953();
				if (Client.method2971() && -1L == field374) {
					field374 = var4;
					if (field374 > field373) {
						field373 = field374;
					}
				}

				if (Client.field537 == 10 || 11 == Client.field537) {
					int var6;
					if (Class395.field4602 == Client.field1376) {
						if (1 == Class42.field227 || !Client.field911 && 4 == Class42.field227) {
							var6 = 5 + field341;
							short var7 = 463;
							byte var8 = 100;
							byte var9 = 35;
							if (Class42.field230 >= var6 && Class42.field230 <= var8 + var6 && Class42.field222 >= var7 && Class42.field222 <= var9 + var7) {
								method7374();
								return;
							}
						}

						if (Class75.field1907 != null) {
							method7374();
						}
					}

					var6 = Class42.field227;
					int var28 = Class42.field230;
					int var29 = Class42.field222;
					if (var6 == 0) {
						var28 = Class42.field231;
						var29 = Class42.field221;
					}

					if (!Client.field911 && var6 == 4) {
						var6 = 1;
					}

					Class218 var30 = Client.method3132();
					int var33;
					short var34;
					if (0 == field353) {
						boolean var53 = false;

						while (var30.method4189()) {
							if (84 == var30.field2384) {
								var53 = true;
							}
						}

						var33 = field348 - 80;
						var34 = 291;
						if (var6 == 1 && var28 >= var33 - 75 && var28 <= var33 + 75 && var29 >= var34 - 20 && var29 <= var34 + 20) {
							Class35.method8133(Class77.method2225("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var33 = field348 + 80;
						if (var6 == 1 && var28 >= var33 - 75 && var28 <= var33 + 75 && var29 >= var34 - 20 && var29 <= var34 + 20 || var53) {
							method2433();
						}
					} else {
						int var10;
						short var11;
						if (1 == field353) {
							while (true) {
								if (!var30.method4189()) {
									var10 = field348 - 80;
									var11 = 321;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										method3156(false);
									}

									var10 = field348 + 80;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										method3344(0);
									}
									break;
								}

								if (84 == var30.field2384) {
									method3156(false);
								} else if (var30.field2384 == 13) {
									method3344(0);
								}
							}
						} else {
							int var14;
							int var15;
							short var31;
							if (field353 == 2) {
								var31 = 201;
								var10 = var31 + 52;
								if (var6 == 1 && var29 >= var10 - 12 && var29 < var10 + 2) {
									field366 = 0;
								}

								var10 += 15;
								if (var6 == 1 && var29 >= var10 - 12 && var29 < var10 + 2) {
									field366 = 1;
								}

								var10 += 15;
								var31 = 361;
								if (field2223 != null) {
									var33 = field2223.field4677 / 2;
									if (var6 == 1 && var28 >= field2223.field4679 - var33 && var28 <= var33 + field2223.field4679 && var29 >= var31 - 15 && var29 < var31) {
										switch(field352) {
										case 1:
											Class35.method8133(Class367.field4318, true, false);
											return;
										case 2:
											Class35.method8133("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var33 = field348 - 80;
								var34 = 321;
								if (var6 == 1 && var28 >= var33 - 75 && var28 <= var33 + 75 && var29 >= var34 - 20 && var29 <= var34 + 20) {
									Class31.method437();
									return;
								}

								var33 = field347 + 180 + 80;
								if (var6 == 1 && var28 >= var33 - 75 && var28 <= var33 + 75 && var29 >= var34 - 20 && var29 <= var34 + 20) {
									method3344(0);
									field358 = "";
									field359 = "";
									Client.field57 = 0;
									field1699 = "";
									field344 = true;
								}

								var33 = field348 + -117;
								var34 = 277;
								field363 = var28 >= var33 && var28 < field5282 + var33 && var29 >= var34 && var29 < var34 + field27;
								if (var6 == 1 && field363) {
									Client.field583 = !Client.field583;
									if (!Client.field583 && Client.field1474.method2482() != null) {
										Client.field1474.method2481((String)null);
									}
								}

								var33 = field348 + 24;
								var34 = 277;
								field379 = var28 >= var33 && var28 < field5282 + var33 && var29 >= var34 && var29 < field27 + var34;
								if (var6 == 1 && field379) {
									Client.field1474.method2520(!Client.field1474.method2562());
									if (!Client.field1474.method2562()) {
										field358 = "";
										Client.field1474.method2481((String)null);
										method2986();
									}
								}

								while (true) {
									Transferable var44;
									do {
										while (true) {
											label987:
											do {
												while (true) {
													while (var30.method4189()) {
														if (var30.field2384 != 13) {
															if (field366 != 0) {
																continue label987;
															}

															char var37 = var30.field2383;

															for (var14 = 0; var14 < field356.length() && field356.charAt(var14) != var37; ++var14) {
															}

															if (var30.field2384 == 85 && field358.length() > 0) {
																field358 = field358.substring(0, field358.length() - 1);
															}

															if (var30.field2384 == 84 || var30.field2384 == 80) {
																field366 = 1;
															}

															if (method261(var30.field2383) && field358.length() < 320) {
																field358 = field358 + var30.field2383;
															}
														} else {
															method3344(0);
															field358 = "";
															field359 = "";
															Client.field57 = 0;
															field1699 = "";
															field344 = true;
														}
													}

													return;
												}
											} while(1 != field366);

											if (var30.field2384 == 85 && field359.length() > 0) {
												field359 = field359.substring(0, field359.length() - 1);
											} else if (84 == var30.field2384 || 80 == var30.field2384) {
												field366 = 0;
												if (84 == var30.field2384) {
													Class31.method437();
													return;
												}
											}

											if ((var30.method4191(82) || var30.method4191(87)) && var30.field2384 == 67) {
												Clipboard var39 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var44 = var39.getContents(Client.field4671);
												var15 = 20 - field359.length();
												break;
											}

											if (Class225.method4342(var30.field2383) && method261(var30.field2383) && field359.length() < 20) {
												field359 = field359 + var30.field2383;
											}
										}
									} while(var15 <= 0);

									try {
										String var48 = (String)var44.getTransferData(DataFlavor.stringFlavor);
										int var45 = Math.min(var15, var48.length());

										for (int var51 = 0; var51 < var45; ++var51) {
											if (!Class225.method4342(var48.charAt(var51)) || !method261(var48.charAt(var51))) {
												method3344(3);
												return;
											}
										}

										field359 = field359 + var48.substring(0, var45);
									} catch (UnsupportedFlavorException var26) {
									} catch (IOException var27) {
									}
								}
							} else {
								Class417 var12;
								if (3 == field353) {
									var10 = 180 + field347;
									var11 = 241;
									var12 = var1.method8143(25, Class367.field4283.length() - 34, Class367.field4283, var10, var11);
									if (var6 == 1 && var12.method7670(var28, var29)) {
										Class35.method8133(Class367.field4289, true, false);
									}

									var10 = field347 + 180;
									var11 = 276;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										method2989(false);
									}

									var10 = field347 + 180;
									var11 = 326;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										Class35.method8133(Class367.field4318, true, false);
										return;
									}
								} else {
									int var13;
									if (field353 == 4) {
										var10 = field347 + 180 - 80;
										var11 = 321;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
											method4979();
											return;
										}

										if (var6 == 1 && var28 >= field347 + 180 - 9 && var28 <= 130 + 180 + field347 && var29 >= 263 && var29 <= 296) {
											field344 = !field344;
										}

										if (var6 == 1 && var28 >= 180 + field347 - 34 && var28 <= 34 + 180 + field347 && var29 >= 351 && var29 <= 363) {
											Class35.method8133(Class367.field4318, true, false);
										}

										var10 = field347 + 180 + 80;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
											method3344(0);
											field358 = "";
											field359 = "";
											Client.field57 = 0;
											field1699 = "";
										}

										while (var30.method4189()) {
											boolean var32 = false;

											for (var13 = 0; var13 < field354.length(); ++var13) {
												if (var30.field2383 == field354.charAt(var13)) {
													var32 = true;
													break;
												}
											}

											if (var30.field2384 == 13) {
												method3344(0);
												field358 = "";
												field359 = "";
												Client.field57 = 0;
												field1699 = "";
											} else {
												if (85 == var30.field2384 && field1699.length() > 0) {
													field1699 = field1699.substring(0, field1699.length() - 1);
												}

												if (var30.field2384 == 84) {
													method4979();
													return;
												}

												if (var32 && field1699.length() < 6) {
													field1699 = field1699 + var30.field2383;
												}
											}
										}
									} else if (field353 == 5) {
										var10 = 180 + field347 - 80;
										var11 = 321;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
											method141();
											return;
										}

										var10 = 80 + field347 + 180;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
											method3156(true);
										}

										var34 = 361;
										if (field2598 != null) {
											var13 = field2598.field4677 / 2;
											if (var6 == 1 && var28 >= field2598.field4679 - var13 && var28 <= var13 + field2598.field4679 && var29 >= var34 - 15 && var29 < var34) {
												Class35.method8133(Class77.method2225("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var30.method4189()) {
											boolean var35 = false;

											for (var14 = 0; var14 < field356.length(); ++var14) {
												if (var30.field2383 == field356.charAt(var14)) {
													var35 = true;
													break;
												}
											}

											if (13 == var30.field2384) {
												method3156(true);
											} else {
												if (85 == var30.field2384 && field358.length() > 0) {
													field358 = field358.substring(0, field358.length() - 1);
												}

												if (var30.field2384 == 84) {
													method141();
													return;
												}

												if (var35 && field358.length() < 320) {
													field358 = field358 + var30.field2383;
												}
											}
										}
									} else if (field353 != 6) {
										if (field353 == 7) {
											if (Client.field1369 && !Client.field533) {
												var10 = field348 - 150;
												var33 = 25 + var10 + 240 + 40;
												var34 = 231;
												var13 = var34 + 40;
												if (var6 == 1 && var28 >= var10 && var28 <= var33 && var29 >= var34 && var29 <= var13) {
													var15 = var10;
													int var16 = 0;

													while (true) {
														if (var16 >= 8) {
															var14 = 0;
															break;
														}

														if (var28 <= var15 + 30) {
															var14 = var16;
															break;
														}

														var15 += 30;
														var15 += var16 != 1 && var16 != 3 ? 5 : 20;
														++var16;
													}

													field370 = var14;
												}

												var14 = field347 + 180 - 80;
												short var38 = 321;
												Date var17;
												Date var18;
												SimpleDateFormat var19;
												StringBuilder var20;
												String[] var21;
												int var22;
												String var23;
												boolean var43;
												boolean var46;
												Calendar var47;
												Date var49;
												boolean var50;
												Date var52;
												Calendar var54;
												if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= var38 - 20 && var29 <= var38 + 20) {
													label858: {
														try {
															var19 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
															var19.setLenient(false);
															var20 = new StringBuilder();
															var21 = field361;
															var22 = 0;

															while (true) {
																if (var22 >= var21.length) {
																	var20.append("12");
																	var18 = var19.parse(var20.toString());
																	break;
																}

																var23 = var21[var22];
																if (var23 == null) {
																	method3344(7);
																	method4018("Date not valid.", "Please ensure all characters are populated.", "");
																	var18 = null;
																	break;
																}

																var20.append(var23);
																++var22;
															}

															var17 = var18;
														} catch (ParseException var25) {
															method3344(7);
															method4018("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var43 = false;
															break label858;
														}

														if (var18 == null) {
															var43 = false;
														} else {
															var47 = Calendar.getInstance();
															var47.set(1, var47.get(1) - 13);
															var47.set(5, var47.get(5) + 1);
															var47.set(11, 0);
															var47.set(12, 0);
															var47.set(13, 0);
															var47.set(14, 0);
															var49 = var47.getTime();
															var46 = var18.before(var49);
															var54 = Calendar.getInstance();
															var54.set(2, 0);
															var54.set(5, 1);
															var54.set(1, 1900);
															var52 = var54.getTime();
															var50 = var17.after(var52);
															if (!var50) {
																method3344(7);
																method4018("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var43 = false;
															} else {
																if (!var46) {
																	Client.field1805 = 8388607;
																} else {
																	Client.field1805 = (int)(var17.getTime() / 86400000L - 11745L);
																}

																var43 = true;
															}
														}
													}

													if (var43) {
														Class131.method3063(50);
														return;
													}
												}

												var14 = 80 + field347 + 180;
												if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= var38 - 20 && var29 <= var38 + 20) {
													field361 = new String[8];
													method3156(true);
												}

												while (var30.method4189()) {
													if (101 == var30.field2384) {
														field361[field370] = null;
													}

													if (85 == var30.field2384) {
														if (null == field361[field370] && field370 > 0) {
															--field370;
														}

														field361[field370] = null;
													}

													if (var30.field2383 >= '0' && var30.field2383 <= '9') {
														field361[field370] = "" + var30.field2383;
														if (field370 < 7) {
															++field370;
														}
													}

													if (84 == var30.field2384) {
														label786: {
															try {
																var19 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
																var19.setLenient(false);
																var20 = new StringBuilder();
																var21 = field361;
																var22 = 0;

																while (true) {
																	if (var22 < var21.length) {
																		var23 = var21[var22];
																		if (var23 != null) {
																			var20.append(var23);
																			++var22;
																			continue;
																		}

																		method3344(7);
																		method4018("Date not valid.", "Please ensure all characters are populated.", "");
																		var18 = null;
																	} else {
																		var20.append("12");
																		var18 = var19.parse(var20.toString());
																	}

																	var17 = var18;
																	break;
																}
															} catch (ParseException var24) {
																method3344(7);
																method4018("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var43 = false;
																break label786;
															}

															if (var18 == null) {
																var43 = false;
															} else {
																var47 = Calendar.getInstance();
																var47.set(1, var47.get(1) - 13);
																var47.set(5, var47.get(5) + 1);
																var47.set(11, 0);
																var47.set(12, 0);
																var47.set(13, 0);
																var47.set(14, 0);
																var49 = var47.getTime();
																var46 = var18.before(var49);
																var54 = Calendar.getInstance();
																var54.set(2, 0);
																var54.set(5, 1);
																var54.set(1, 1900);
																var52 = var54.getTime();
																var50 = var17.after(var52);
																if (!var50) {
																	method3344(7);
																	method4018("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var43 = false;
																} else {
																	if (!var46) {
																		Client.field1805 = 8388607;
																	} else {
																		Client.field1805 = (int)(var17.getTime() / 86400000L - 11745L);
																	}

																	var43 = true;
																}
															}
														}

														if (var43) {
															Class131.method3063(50);
														}

														return;
													}
												}
											} else {
												var10 = field347 + 180 - 80;
												var11 = 321;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													Class35.method8133(Class77.method2225("secure", true) + "m=dob/set_dob.ws", true, false);
													method4018(Class367.field4293, Class367.field4294, Class367.field4295);
													method3344(6);
													return;
												}

												var10 = 80 + 180 + field347;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													method3156(true);
												}
											}
										} else if (8 == field353) {
											var10 = 180 + field347 - 80;
											var11 = 321;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												Class35.method8133("https://www.jagex.com/terms/privacy", true, false);
												method4018(Class367.field4293, Class367.field4294, Class367.field4295);
												method3344(6);
												return;
											}

											var10 = field347 + 180 + 80;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												method3156(true);
											}
										} else if (field353 == 9) {
											var10 = field347 + 180;
											var11 = 311;
											if (var30.field2384 == 84 || var30.field2384 == 13 || var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												method2989(false);
											}
										} else if (10 == field353) {
											var10 = 180 + field347;
											var11 = 209;
											if (var30.field2384 == 84 || var6 == 1 && var28 >= var10 - 109 && var28 <= var10 + 109 && var29 >= var11 && var29 <= var11 + 68) {
												method4018(Class367.field4262, Class367.field4304, Class367.field4264);
												Client.field702 = Class556.field5442;
												Client.method4362(false);
												Class131.method3063(20);
											}
										} else if (field353 == 12) {
											var10 = field348;
											var11 = 233;
											var12 = var2.method8143(0, 30, Class367.field4325, var10, var11);
											Class417 var36 = var2.method8143(32, 32, Class367.field4325, var10, var11);
											Class417 var40 = var2.method8143(70, 34, Class367.field4325, var10, var11);
											var33 = var11 + 17;
											Class417 var41 = var2.method8143(0, 34, Class367.field4044, var10, var33);
											if (var6 == 1) {
												if (var12.method7670(var28, var29)) {
													Class35.method8133("https://www.jagex.com/terms", true, false);
												} else if (var36.method7670(var28, var29)) {
													Class35.method8133("https://www.jagex.com/terms/privacy", true, false);
												} else if (var40.method7670(var28, var29) || var41.method7670(var28, var29)) {
													Class35.method8133("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var10 = field348 - 80;
											var11 = 311;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												Client.field1474.method2483(Client.field663);
												method2989(true);
											}

											var10 = 80 + field348;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												field353 = 13;
											}
										} else if (13 == field353) {
											var10 = field348;
											var11 = 321;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												method2989(true);
											}
										} else if (14 == field353) {
											String var42 = "";
											switch(field351) {
											case 0:
												var42 = "https://secure.runescape.com/m=offence-appeal/account-history";
												break;
											case 1:
												var42 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
												break;
											case 2:
												var42 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												method3156(false);
											}

											var33 = field347 + 180;
											var34 = 276;
											if (var6 == 1 && var28 >= var33 - 75 && var28 <= var33 + 75 && var29 >= var34 - 20 && var29 <= var34 + 20) {
												Class35.method8133(var42, true, false);
												method4018(Class367.field4293, Class367.field4294, Class367.field4295);
												method3344(6);
												return;
											}

											var33 = 180 + field347;
											var34 = 326;
											if (var6 == 1 && var28 >= var33 - 75 && var28 <= var33 + 75 && var29 >= var34 - 20 && var29 <= var34 + 20) {
												method3156(false);
											}
										} else if (24 == field353) {
											var10 = 180 + field347;
											var11 = 301;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												method2989(false);
											}
										} else if (field353 == 32) {
											var10 = 180 + field347 - 80;
											var11 = 321;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												Class35.method8133(Class77.method2225("secure", true) + "m=dob/set_dob.ws", true, false);
												method4018(Class367.field4293, Class367.field4294, Class367.field4295);
												method3344(6);
												return;
											}

											var10 = field347 + 180 + 80;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												method3156(true);
											}
										} else if (field353 == 33) {
											var10 = 180 + field347;
											var11 = 276;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												Class35.method8133(Class367.field4289, true, false);
											}

											var10 = 180 + field347;
											var11 = 326;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												method3156(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!var30.method4189()) {
													var31 = 321;
													if (var6 == 1 && var29 >= var31 - 20 && var29 <= var31 + 20) {
														method3156(true);
													}

													return;
												}
											} while(84 != var30.field2384 && 13 != var30.field2384);

											method3156(true);
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

	@ObfInfo(owner = "jx", name = "an", desc = "(I)V")
	public static void method4979() {
		field1699.trim();
		if (field1699.length() != 6) {
			method4018(Class367.field4072, Class367.field4073, Class367.field4074);
		} else {
			Client.field57 = Integer.parseInt(field1699);
			field1699 = "";
			Client.method4362(true);
			method4018(Class367.field4262, Class367.field4304, Class367.field4264);
			Class131.method3063(20);
		}
	}

	@ObfInfo(owner = "dm", name = "av", desc = "(I)V", opaque = "387820820")
	public static void method2433() {
		if ((Client.field796 & Class545.field5353.method129()) != 0) {
			field357 = "";
			field355 = Class367.field4258;
			field377 = Class367.field4284;
			field367 = Class367.field4260;
			method3344(1);
			method2986();
		} else if ((Client.field796 & Class545.field5330.method129()) != 0) {
			if ((Client.field796 & Class545.field5348.method129()) != 0) {
				field355 = Class367.field4179;
				field377 = Class367.field4259;
				field367 = Class367.field4257;
			} else {
				field355 = Class367.field4249;
				field377 = Class367.field4250;
				field367 = Class367.field4247;
			}

			field357 = Class367.field4203;
			method3344(1);
			method2986();
		} else if ((Client.field796 & Class545.field5348.method129()) != 0) {
			field355 = Class367.field4252;
			field377 = Class367.field4170;
			field367 = Class367.field4254;
			field357 = Class367.field4203;
			method3344(1);
			method2986();
		} else {
			method3156(false);
		}

	}

	@ObfInfo(owner = "ar", name = "ab", desc = "(CB)Z", opaque = "-1")
	public static boolean method261(char var0) {
		return field356.indexOf(var0) != -1;
	}

	@ObfInfo(owner = "fj", name = "ai", desc = "(ZI)V", opaque = "1749388721")
	public static void method3156(boolean var0) {
		if (!Client.field4671.method1897() && !Client.field4671.method1369() && !Client.field4671.method1327()) {
			field355 = Class367.field4245;
			field377 = Class367.field4246;
			field367 = Class367.field4157;
			method3344(2);
			if (var0) {
				field359 = "";
			}

			if (field358 == null || field358.length() <= 0) {
				if (Client.field1474.method2482() != null) {
					field358 = Client.field1474.method2482();
					Client.field583 = true;
				} else {
					Client.field583 = false;
				}
			}

			method2986();
		} else {
			method3344(10);
		}
	}

	@ObfInfo(name = "as", desc = "(Lde;IIIIIIIILip;S)V", opaque = "339")
	public static void method1123(Class83 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class224 var9) {
		Class197 var11 = Class197.method61(var5);
		int var12 = var8 >= 0 ? var8 : var11.field2148;
		int var13;
		int var14;
		if (var6 != 1 && var6 != 3) {
			var13 = var11.field2140;
			var14 = var11.field2141;
		} else {
			var13 = var11.field2141;
			var14 = var11.field2140;
		}

		int var15;
		int var16;
		if (var13 + var3 <= var0.field1030) {
			var15 = var3 + (var13 >> 1);
			var16 = (var13 + 1 >> 1) + var3;
		} else {
			var15 = var3;
			var16 = var3 + 1;
		}

		int var17;
		int var18;
		if (var14 + var4 <= var0.field1018) {
			var17 = var4 + (var14 >> 1);
			var18 = (var14 + 1 >> 1) + var4;
		} else {
			var17 = var4;
			var18 = var4 + 1;
		}

		int[][] var19 = var0.field1025[var2];
		int var20 = var19[var16][var17] + var19[var15][var17] + var19[var15][var18] + var19[var16][var18] >> 2;
		int var21 = (var13 << 6) + (var3 << 7);
		int var22 = (var14 << 6) + (var4 << 7);
		Class277 var23 = var0.field1014;
		long var24 = Class296.method4129(var3, var4, 2, var11.field2144 == 0, var5, var0.field1026);
		int var26 = (var6 << 6) + var7;
		if (var11.field2165 == 1) {
			var26 += 256;
		}

		Object var27;
		if (var7 == 22) {
			if (var12 == -1 && var11.field2166 == null) {
				var27 = var11.method3945(22, var6, var19, var21, var20, var22);
			} else {
				var27 = new Class96(var0, var5, 22, var6, var2, var3, var4, var12, var11.field2160, (Class280)null);
			}

			var23.method5258(var1, var3, var4, var20, (Class280)var27, var24, var26);
			if (var11.field2126 == 1 && var9 != null) {
				var9.method4308(var3, var4);
			}

		} else if (var7 != 10 && var7 != 11) {
			if (var7 >= 12) {
				if (var12 == -1 && var11.field2166 == null) {
					var27 = var11.method3945(var7, var6, var19, var21, var20, var22);
				} else {
					var27 = new Class96(var0, var5, var7, var6, var2, var3, var4, var12, var11.field2160, (Class280)null);
				}

				var23.method5262(var1, var3, var4, var20, 1, 1, (Class280)var27, 0, var24, var26);
				if (0 != var11.field2126 && var9 != null) {
					var9.method4306(var3, var4, var13, var14, var11.field2143);
				}

			} else if (var7 == 0) {
				if (var12 == -1 && var11.field2166 == null) {
					var27 = var11.method3945(0, var6, var19, var21, var20, var22);
				} else {
					var27 = new Class96(var0, var5, 0, var6, var2, var3, var4, var12, var11.field2160, (Class280)null);
				}

				var23.method5260(var1, var3, var4, var20, (Class280)var27, (Class280)null, Class97.field1193[var6], 0, var24, var26);
				if (var11.field2126 != 0 && var9 != null) {
					var9.method4305(var3, var4, var7, var6, var11.field2143);
				}

			} else if (var7 == 1) {
				if (var12 == -1 && var11.field2166 == null) {
					var27 = var11.method3945(1, var6, var19, var21, var20, var22);
				} else {
					var27 = new Class96(var0, var5, 1, var6, var2, var3, var4, var12, var11.field2160, (Class280)null);
				}

				var23.method5260(var1, var3, var4, var20, (Class280)var27, (Class280)null, Class97.field1194[var6], 0, var24, var26);
				if (0 != var11.field2126 && var9 != null) {
					var9.method4305(var3, var4, var7, var6, var11.field2143);
				}

			} else {
				int var33;
				if (var7 == 2) {
					var33 = var6 + 1 & 3;
					Object var29;
					Object var35;
					if (var12 == -1 && var11.field2166 == null) {
						var35 = var11.method3945(2, var6 + 4, var19, var21, var20, var22);
						var29 = var11.method3945(2, var33, var19, var21, var20, var22);
					} else {
						var35 = new Class96(var0, var5, 2, var6 + 4, var2, var3, var4, var12, var11.field2160, (Class280)null);
						var29 = new Class96(var0, var5, 2, var33, var2, var3, var4, var12, var11.field2160, (Class280)null);
					}

					var23.method5260(var1, var3, var4, var20, (Class280)var35, (Class280)var29, Class97.field1193[var6], Class97.field1193[var33], var24, var26);
					if (var11.field2126 != 0 && var9 != null) {
						var9.method4305(var3, var4, var7, var6, var11.field2143);
					}

				} else if (var7 == 3) {
					if (var12 == -1 && var11.field2166 == null) {
						var27 = var11.method3945(3, var6, var19, var21, var20, var22);
					} else {
						var27 = new Class96(var0, var5, 3, var6, var2, var3, var4, var12, var11.field2160, (Class280)null);
					}

					var23.method5260(var1, var3, var4, var20, (Class280)var27, (Class280)null, Class97.field1194[var6], 0, var24, var26);
					if (0 != var11.field2126 && var9 != null) {
						var9.method4305(var3, var4, var7, var6, var11.field2143);
					}

				} else if (var7 == 9) {
					if (var12 == -1 && var11.field2166 == null) {
						var27 = var11.method3945(var7, var6, var19, var21, var20, var22);
					} else {
						var27 = new Class96(var0, var5, var7, var6, var2, var3, var4, var12, var11.field2160, (Class280)null);
					}

					var23.method5262(var1, var3, var4, var20, 1, 1, (Class280)var27, 0, var24, var26);
					if (0 != var11.field2126 && var9 != null) {
						var9.method4306(var3, var4, var13, var14, var11.field2143);
					}

				} else if (var7 == 4) {
					if (var12 == -1 && var11.field2166 == null) {
						var27 = var11.method3945(4, var6, var19, var21, var20, var22);
					} else {
						var27 = new Class96(var0, var5, 4, var6, var2, var3, var4, var12, var11.field2160, (Class280)null);
					}

					var23.method5350(var1, var3, var4, var20, (Class280)var27, (Class280)null, Class97.field1193[var6], 0, 0, 0, var24, var26);
				} else {
					long var28;
					Object var30;
					if (var7 == 5) {
						var33 = 16;
						var28 = var23.method5278(var1, var3, var4);
						if (0L != var28) {
							var33 = Class197.method61(Class296.method4404(var28)).field2149;
						}

						if (var12 == -1 && var11.field2166 == null) {
							var30 = var11.method3945(4, var6, var19, var21, var20, var22);
						} else {
							var30 = new Class96(var0, var5, 4, var6, var2, var3, var4, var12, var11.field2160, (Class280)null);
						}

						var23.method5350(var1, var3, var4, var20, (Class280)var30, (Class280)null, Class97.field1193[var6], 0, var33 * Class97.field1195[var6], var33 * Class97.field1196[var6], var24, var26);
					} else if (var7 == 6) {
						var33 = 8;
						var28 = var23.method5278(var1, var3, var4);
						if (var28 != 0L) {
							var33 = Class197.method61(Class296.method4404(var28)).field2149 / 2;
						}

						if (var12 == -1 && var11.field2166 == null) {
							var30 = var11.method3945(4, var6 + 4, var19, var21, var20, var22);
						} else {
							var30 = new Class96(var0, var5, 4, var6 + 4, var2, var3, var4, var12, var11.field2160, (Class280)null);
						}

						var23.method5350(var1, var3, var4, var20, (Class280)var30, (Class280)null, 256, var6, var33 * Class97.field1185[var6], var33 * Class97.field1198[var6], var24, var26);
					} else if (var7 == 7) {
						int var34 = var6 + 2 & 3;
						if (var12 == -1 && var11.field2166 == null) {
							var27 = var11.method3945(4, var34 + 4, var19, var21, var20, var22);
						} else {
							var27 = new Class96(var0, var5, 4, var34 + 4, var2, var3, var4, var12, var11.field2160, (Class280)null);
						}

						var23.method5350(var1, var3, var4, var20, (Class280)var27, (Class280)null, 256, var34, 0, 0, var24, var26);
					} else if (var7 == 8) {
						var33 = 8;
						var28 = var23.method5278(var1, var3, var4);
						if (0L != var28) {
							var33 = Class197.method61(Class296.method4404(var28)).field2149 / 2;
						}

						int var32 = var6 + 2 & 3;
						Object var31;
						if (var12 == -1 && var11.field2166 == null) {
							var30 = var11.method3945(4, var6 + 4, var19, var21, var20, var22);
							var31 = var11.method3945(4, var32 + 4, var19, var21, var20, var22);
						} else {
							var30 = new Class96(var0, var5, 4, var6 + 4, var2, var3, var4, var12, var11.field2160, (Class280)null);
							var31 = new Class96(var0, var5, 4, var32 + 4, var2, var3, var4, var12, var11.field2160, (Class280)null);
						}

						var23.method5350(var1, var3, var4, var20, (Class280)var30, (Class280)var31, 256, var6, var33 * Class97.field1185[var6], var33 * Class97.field1198[var6], var24, var26);
					}
				}
			}
		} else {
			if (var12 == -1 && var11.field2166 == null) {
				var27 = var11.method3945(10, var6, var19, var21, var20, var22);
			} else {
				var27 = new Class96(var0, var5, 10, var6, var2, var3, var4, var12, var11.field2160, (Class280)null);
			}

			if (var27 != null) {
				var23.method5262(var1, var3, var4, var20, var13, var14, (Class280)var27, var7 == 11 ? 256 : 0, var24, var26);
			}

			if (var11.field2126 != 0 && var9 != null) {
				var9.method4306(var3, var4, var13, var14, var11.field2143);
			}

		}
	}

	@ObfInfo(owner = "er", name = "ae", desc = "(ZB)V", opaque = "7")
	public static void method2989(boolean var0) {
		byte var2 = 0;
		boolean var3 = Client.field1474.method2484() >= Client.field663;
		if (!var3) {
			var2 = 12;
		} else if (Client.field4671.method1897() || Client.field4671.method1369() || Client.field4671.method1327()) {
			var2 = 10;
		}

		method3344(var2);
		if (var0) {
			field358 = "";
			field359 = "";
			Client.field57 = 0;
			field1699 = "";
		}

		if (field358 == null || field358.length() <= 0) {
			if (Client.field1474.method2482() != null) {
				field358 = Client.field1474.method2482();
				Client.field583 = true;
			} else {
				Client.field583 = false;
			}
		}

		method2986();
	}

	@ObfInfo(owner = "aj", name = "au", desc = "(B)V", opaque = "2")
	public static void method141() {
		field358 = field358.trim();
		if (field358.length() == 0) {
			method4018(Class367.field4296, Class367.field4285, Class367.field4056);
		} else {
			long var2 = Class78.method2131();
			byte var1;
			if (var2 == 0L) {
				var1 = 5;
			} else {
				String var5 = field358;
				Random var6 = new Random();
				Class562 var7 = new Class562(128);
				Class562 var8 = new Class562(128);
				int[] var9 = new int[]{var6.nextInt(), var6.nextInt(), (int)(var2 >> 32), (int)var2};
				var7.method9809(10);

				int var10;
				for (var10 = 0; var10 < 4; ++var10) {
					var7.method9812(var6.nextInt());
				}

				var7.method9812(var9[0]);
				var7.method9812(var9[1]);
				var7.method10034(var2);
				var7.method10034(0L);

				for (var10 = 0; var10 < 4; ++var10) {
					var7.method9812(var6.nextInt());
				}

				var7.method9853(Class78.field953, Class78.field962);
				var8.method9809(10);

				for (var10 = 0; var10 < 3; ++var10) {
					var8.method9812(var6.nextInt());
				}

				var8.method10034(var6.nextLong());
				var8.method9813(var6.nextLong());
				Client.method570(var8);
				var8.method10034(var6.nextLong());
				var8.method9853(Class78.field953, Class78.field962);
				var10 = Class562.method2698(var5);
				if (0 != var10 % 8) {
					var10 += 8 - var10 % 8;
				}

				Class562 var11 = new Class562(var10);
				var11.method9816(var5);
				var11.field5471 = var10;
				var11.method9849(var9);
				Class562 var12 = new Class562(var11.field5471 + 5 + var7.field5471 + var8.field5471);
				var12.method9809(2);
				var12.method9809(var7.field5471);
				var12.method9819(var7.field5472, 0, var7.field5471);
				var12.method9809(var8.field5471);
				var12.method9819(var8.field5472, 0, var8.field5471);
				var12.method9810(var11.field5471);
				var12.method9819(var11.field5472, 0, var11.field5471);
				String var13 = Class80.method2299(var12.field5472);

				byte var4;
				try {
					URL var14 = new URL(Class77.method2225("services", false) + "m=accountappeal/login.ws");
					URLConnection var15 = var14.openConnection();
					var15.setDoInput(true);
					var15.setDoOutput(true);
					var15.setConnectTimeout(5000);
					OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
					var16.write("data2=" + Class550.method9425(var13) + "&dest=" + Class550.method9425("passwordchoice.ws"));
					var16.flush();
					InputStream var17 = var15.getInputStream();
					var12 = new Class562(new byte[1000]);

					while (true) {
						int var18 = var17.read(var12.field5472, var12.field5471, 1000 - var12.field5471);
						if (var18 == -1) {
							var16.close();
							var17.close();
							String var23 = new String(var12.field5472);
							if (var23.startsWith("OFFLINE")) {
								var4 = 4;
							} else if (var23.startsWith("WRONG")) {
								var4 = 7;
							} else if (var23.startsWith("RELOAD")) {
								var4 = 3;
							} else if (var23.startsWith("Not permitted for social network accounts.")) {
								var4 = 6;
							} else {
								var12.method9850(var9);

								while (var12.field5471 > 0 && 0 == var12.field5472[var12.field5471 - 1]) {
									--var12.field5471;
								}

								var23 = new String(var12.field5472, 0, var12.field5471);
								boolean var19;
								if (var23 == null) {
									var19 = false;
								} else {
									label89: {
										try {
											new URL(var23);
										} catch (MalformedURLException var21) {
											var19 = false;
											break label89;
										}

										var19 = true;
									}
								}

								if (var19) {
									Class35.method8133(var23, true, false);
									var4 = 2;
								} else {
									var4 = 5;
								}
							}
							break;
						}

						var12.field5471 += var18;
						if (var12.field5471 >= 1000) {
							var4 = 5;
							break;
						}
					}
				} catch (Throwable var22) {
					var22.printStackTrace();
					var4 = 5;
				}

				var1 = var4;
			}

			switch(var1) {
			case 2:
				method4018(Class367.field4210, Class367.field4078, Class367.field4301);
				method3344(6);
				break;
			case 3:
				method4018(Class367.field4302, Class367.field4303, Class367.field4159);
				break;
			case 4:
				method4018(Class367.field4305, Class367.field4319, Class367.field4307);
				break;
			case 5:
				method4018(Class367.field4182, Class367.field4238, Class367.field4310);
				break;
			case 6:
				method4018(Class367.field4311, Class367.field4312, Class367.field4153);
				break;
			case 7:
				method4018(Class367.field4099, Class367.field4315, Class367.field4316);
			}

		}
	}

	@ObfInfo(owner = "fl", name = "ah", desc = "(Lqh;Lqh;Lqh;B)V", opaque = "7")
	public static void method3166(Class424 var0, Class424 var1, Class424 var2) {
		field341 = (Client.field954 - 765) / 2;
		field347 = field341 + 202;
		field348 = 180 + field347;
		if (field339) {
			method304(var0, var1);
		} else {
			field343.method9636(field341, 0);
			field2205.method9636(382 + field341, 0);
			Class99.field4534.method10122(field341 + 382 - Class99.field4534.field5495 / 2, 18);
			int var5;
			if (Client.field537 == 0 || Client.field537 == 5) {
				byte var4 = 20;
				var0.method8147(Class367.field4244, 180 + field347, 245 - var4, 16777215, -1);
				var5 = 253 - var4;
				Class569.method10142(field347 + 180 - 152, var5, 304, 34, 9179409);
				Class569.method10142(180 + field347 - 151, var5 + 1, 302, 32, 0);
				Class569.method10138(180 + field347 - 150, var5 + 2, field349 * 3, 30, 9179409);
				Class569.method10138(field347 + 180 - 150 + field349 * 3, var5 + 2, 300 - field349 * 3, 30, 0);
				var0.method8147(field350, 180 + field347, 276 - var4, 16777215, -1);
			}

			String var7;
			String var9;
			String var10;
			int var11;
			char[] var12;
			int var13;
			short var15;
			int var16;
			short var17;
			if (20 == Client.field537) {
				field4962.method10122(field347 + 180 - field4962.field5495 / 2, 271 - field4962.field5496 / 2);
				var15 = 201;
				var0.method8147(field355, field347 + 180, var15, 16776960, 0);
				var16 = var15 + 15;
				var0.method8147(field377, 180 + field347, var16, 16776960, 0);
				var16 += 15;
				var0.method8147(field367, 180 + field347, var16, 16776960, 0);
				var16 += 15;
				var16 += 7;
				if (4 != field353 && 10 != field353) {
					var0.method8248(Class367.field4251, field347 + 180 - 110, var16, 16777215, 0);
					var17 = 200;
					if (!Client.field1474.method2562()) {
						var7 = field358;
					} else {
						var9 = field358;
						var11 = var9.length();
						var12 = new char[var11];

						for (var13 = 0; var13 < var11; ++var13) {
							var12[var13] = '*';
						}

						var10 = new String(var12);
						var7 = var10;
					}

					for (var7 = var7; var0.method8139(var7) > var17; var7 = var7.substring(0, var7.length() - 1)) {
					}

					var0.method8248(Class442.method8142(var7), field347 + 180 - 70, var16, 16777215, 0);
					var16 += 15;
					var9 = field359;
					var11 = var9.length();
					var12 = new char[var11];

					for (var13 = 0; var13 < var11; ++var13) {
						var12[var13] = '*';
					}

					var10 = new String(var12);

					for (var10 = var10; var0.method8139(var10) > var17; var10 = var10.substring(1)) {
					}

					var0.method8248(Class367.field4272 + var10, 180 + field347 - 108, var16, 16777215, 0);
					var16 += 15;
				}
			}

			if (Client.field537 == 10 || Client.field537 == 11 || 50 == Client.field537) {
				field4962.method10122(field347, 171);
				short var6;
				if (field353 == 0) {
					var15 = 251;
					var0.method8147(Class367.field4274, 180 + field347, var15, 16776960, 0);
					var16 = var15 + 30;
					var5 = 180 + field347 - 80;
					var6 = 291;
					field5060.method10122(var5 - 73, var6 - 20);
					var0.method8148(Class367.field4234, var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var5 = 180 + field347 + 80;
					field5060.method10122(var5 - 73, var6 - 20);
					var0.method8148(Class367.field4276, var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (field353 == 1) {
					var0.method8147(field357, field347 + 180, 201, 16776960, 0);
					var15 = 236;
					var0.method8147(field355, field347 + 180, var15, 16777215, 0);
					var16 = var15 + 15;
					var0.method8147(field377, 180 + field347, var16, 16777215, 0);
					var16 += 15;
					var0.method8147(field367, 180 + field347, var16, 16777215, 0);
					var16 += 15;
					var5 = field347 + 180 - 80;
					var6 = 321;
					field5060.method10122(var5 - 73, var6 - 20);
					var0.method8147(Class367.field4039, var5, var6 + 5, 16777215, 0);
					var5 = field347 + 180 + 80;
					field5060.method10122(var5 - 73, var6 - 20);
					var0.method8147(Class367.field4139, var5, var6 + 5, 16777215, 0);
				} else if (2 == field353) {
					var15 = 201;
					var0.method8147(field355, field348, var15, 16776960, 0);
					var16 = var15 + 15;
					var0.method8147(field377, field348, var16, 16776960, 0);
					var16 += 15;
					var0.method8147(field367, field348, var16, 16776960, 0);
					var16 += 15;
					var16 += 7;
					var0.method8248(Class367.field4251, field348 - 110, var16, 16777215, 0);
					var17 = 200;
					if (!Client.field1474.method2562()) {
						var7 = field358;
					} else {
						var9 = field358;
						var11 = var9.length();
						var12 = new char[var11];

						for (var13 = 0; var13 < var11; ++var13) {
							var12[var13] = '*';
						}

						var10 = new String(var12);
						var7 = var10;
					}

					for (var7 = var7; var0.method8139(var7) > var17; var7 = var7.substring(1)) {
					}

					var0.method8248(Class442.method8142(var7) + (0 == field366 & Client.field541 % 40 < 20 ? Class111.method3839(16776960) + Class111.field1389 : ""), field348 - 70, var16, 16777215, 0);
					var16 += 15;
					var9 = field359;
					var11 = var9.length();
					var12 = new char[var11];

					for (var13 = 0; var13 < var11; ++var13) {
						var12[var13] = '*';
					}

					var10 = new String(var12);

					for (var10 = var10; var0.method8139(var10) > var17; var10 = var10.substring(1)) {
					}

					var0.method8248(Class367.field4272 + var10 + (1 == field366 & Client.field541 % 40 < 20 ? Class111.method3839(16776960) + Class111.field1389 : ""), field348 - 108, var16, 16777215, 0);
					var16 += 15;
					var15 = 277;
					var11 = -117 + field348;
					Class568 var27 = method1275(Client.field583, field363);
					var27.method10122(var11, var15);
					var11 += var27.field5495 + 5;
					var1.method8248(Class367.field4279, var11, var15 + 13, 16776960, 0);
					var11 = field348 + 24;
					var27 = method1275(Client.field1474.method2562(), field379);
					var27.method10122(var11, var15);
					var11 += var27.field5495 + 5;
					var1.method8248(Class367.field4280, var11, var15 + 13, 16776960, 0);
					var16 = var15 + 15;
					var13 = field348 - 80;
					short var14 = 321;
					field5060.method10122(var13 - 73, var14 - 20);
					var0.method8147(Class367.field4277, var13, var14 + 5, 16777215, 0);
					var13 = 80 + field348;
					field5060.method10122(var13 - 73, var14 - 20);
					var0.method8147(Class367.field4139, var13, var14 + 5, 16777215, 0);
					var15 = 357;
					switch(field352) {
					case 2:
						field2597 = Class367.field4150;
						break;
					default:
						field2597 = Class367.field4290;
					}

					field2223 = new Class417(field348, var15, var1.method8139(field2597), 11);
					field2598 = new Class417(field348, var15, var1.method8139(Class367.field4291), 11);
					var1.method8147(field2597, field348, var15, 16777215, 0);
				} else if (field353 == 3) {
					var15 = 201;
					var0.method8147(Class367.field4281, 180 + field347, var15, 16776960, 0);
					var16 = var15 + 20;
					var1.method8147(Class367.field4045, field347 + 180, var16, 16776960, 0);
					var16 += 20;
					var1.method8147(Class367.field4283, field347 + 180, var16, 16776960, 0);
					var16 += 15;
					var5 = field347 + 180;
					var6 = 276;
					field5060.method10122(var5 - 73, var6 - 20);
					var2.method8147(Class367.field4265, var5, var6 + 5, 16777215, 0);
					var5 = 180 + field347;
					var6 = 326;
					field5060.method10122(var5 - 73, var6 - 20);
					var2.method8147(Class367.field4228, var5, var6 + 5, 16777215, 0);
				} else {
					String var18;
					if (4 == field353) {
						var0.method8147(Class367.field4292, 180 + field347, 201, 16776960, 0);
						var15 = 236;
						var0.method8147(field355, field347 + 180, var15, 16777215, 0);
						var16 = var15 + 15;
						var0.method8147(field377, 180 + field347, var16, 16777215, 0);
						var16 += 15;
						var0.method8147(field367, field347 + 180, var16, 16777215, 0);
						var16 += 15;
						var18 = Class367.field4273;
						String var8 = field1699;
						int var25 = var8.length();
						char[] var28 = new char[var25];

						int var29;
						for (var29 = 0; var29 < var25; ++var29) {
							var28[var29] = '*';
						}

						var9 = new String(var28);
						var0.method8248(var18 + var9 + (Client.field541 % 40 < 20 ? Class111.method3839(16776960) + Class111.field1389 : ""), 180 + field347 - 108, var16, 16777215, 0);
						var16 -= 8;
						var0.method8248(Class367.field4042, field347 + 180 - 9, var16, 16776960, 0);
						var16 += 15;
						var0.method8248(Class367.field4261, 180 + field347 - 9, var16, 16776960, 0);
						int var21 = field347 + 180 - 9 + var0.method8139(Class367.field4261) + 15;
						var25 = var16 - var0.field4784;
						Class568 var30;
						if (field344) {
							var30 = field345;
						} else {
							var30 = field1746;
						}

						var30.method10122(var21, var25);
						var16 += 15;
						var29 = 180 + field347 - 80;
						short var33 = 321;
						field5060.method10122(var29 - 73, var33 - 20);
						var0.method8147(Class367.field4039, var29, var33 + 5, 16777215, 0);
						var29 = field347 + 180 + 80;
						field5060.method10122(var29 - 73, var33 - 20);
						var0.method8147(Class367.field4139, var29, var33 + 5, 16777215, 0);
						var1.method8147(Class367.field4290, 180 + field347, var33 + 36, 16777215, 0);
					} else {
						int var20;
						short var22;
						if (5 == field353) {
							var0.method8147(Class367.field4087, 180 + field347, 201, 16776960, 0);
							var15 = 221;
							var2.method8147(field355, field347 + 180, var15, 16776960, 0);
							var16 = var15 + 15;
							var2.method8147(field377, field347 + 180, var16, 16776960, 0);
							var16 += 15;
							var2.method8147(field367, 180 + field347, var16, 16776960, 0);
							var16 += 15;
							var16 += 14;
							var0.method8248(Class367.field4322, field347 + 180 - 145, var16, 16777215, 0);
							var17 = 174;
							if (!Client.field1474.method2562()) {
								var7 = field358;
							} else {
								var9 = field358;
								var11 = var9.length();
								var12 = new char[var11];

								for (var13 = 0; var13 < var11; ++var13) {
									var12[var13] = '*';
								}

								var10 = new String(var12);
								var7 = var10;
							}

							for (var7 = var7; var0.method8139(var7) > var17; var7 = var7.substring(1)) {
							}

							var0.method8248(Class442.method8142(var7) + (Client.field541 % 40 < 20 ? Class111.method3839(16776960) + Class111.field1389 : ""), field347 + 180 - 34, var16, 16777215, 0);
							var16 += 15;
							var20 = 180 + field347 - 80;
							var22 = 321;
							field5060.method10122(var20 - 73, var22 - 20);
							var0.method8147(Class367.field4341, var20, var22 + 5, 16777215, 0);
							var20 = 80 + 180 + field347;
							field5060.method10122(var20 - 73, var22 - 20);
							var0.method8147(Class367.field4118, var20, var22 + 5, 16777215, 0);
							var22 = 356;
							var1.method8147(Class367.field4291, field348, var22, 268435455, 0);
						} else if (6 == field353) {
							var15 = 201;
							var0.method8147(field355, 180 + field347, var15, 16776960, 0);
							var16 = var15 + 15;
							var0.method8147(field377, field347 + 180, var16, 16776960, 0);
							var16 += 15;
							var0.method8147(field367, 180 + field347, var16, 16776960, 0);
							var16 += 15;
							var5 = 180 + field347;
							var6 = 321;
							field5060.method10122(var5 - 73, var6 - 20);
							var0.method8147(Class367.field4118, var5, var6 + 5, 16777215, 0);
						} else if (field353 == 7) {
							if (Client.field1369 && !Client.field533) {
								var15 = 201;
								var0.method8147(field355, field348, var15, 16776960, 0);
								var16 = var15 + 15;
								var0.method8147(field377, field348, var16, 16776960, 0);
								var16 += 15;
								var0.method8147(field367, field348, var16, 16776960, 0);
								var5 = field348 - 150;
								var16 += 10;

								int var19;
								for (var19 = 0; var19 < 8; ++var19) {
									field5060.method10120(var5, var16, 30, 40);
									boolean var23 = var19 == field370 & Client.field541 % 40 < 20;
									var0.method8248((field361[var19] == null ? "" : field361[var19]) + (var23 ? Class111.method3839(16776960) + Class111.field1389 : ""), var5 + 10, var16 + 27, 16777215, 0);
									if (var19 != 1 && var19 != 3) {
										var5 += 35;
									} else {
										var5 += 50;
										var0.method8248(Class442.method8142("/"), var5 - 13, var16 + 27, 16777215, 0);
									}
								}

								var19 = field348 - 80;
								short var24 = 321;
								field5060.method10122(var19 - 73, var24 - 20);
								var0.method8147("Submit", var19, var24 + 5, 16777215, 0);
								var19 = field348 + 80;
								field5060.method10122(var19 - 73, var24 - 20);
								var0.method8147(Class367.field4139, var19, var24 + 5, 16777215, 0);
							} else {
								var15 = 216;
								var0.method8147(Class367.field4317, field347 + 180, var15, 16776960, 0);
								var16 = var15 + 15;
								var2.method8147(Class367.field4288, 180 + field347, var16, 16776960, 0);
								var16 += 15;
								var2.method8147(Class367.field4069, field347 + 180, var16, 16776960, 0);
								var16 += 15;
								var5 = 180 + field347 - 80;
								var6 = 321;
								field5060.method10122(var5 - 73, var6 - 20);
								var0.method8147(Class367.field4320, var5, var6 + 5, 16777215, 0);
								var5 = 80 + 180 + field347;
								field5060.method10122(var5 - 73, var6 - 20);
								var0.method8147(Class367.field4118, var5, var6 + 5, 16777215, 0);
							}
						} else if (8 == field353) {
							var15 = 216;
							var0.method8147(Class367.field4031, field347 + 180, var15, 16776960, 0);
							var16 = var15 + 15;
							var2.method8147(Class367.field4175, 180 + field347, var16, 16776960, 0);
							var16 += 15;
							var2.method8147(Class367.field4176, 180 + field347, var16, 16776960, 0);
							var16 += 15;
							var5 = 180 + field347 - 80;
							var6 = 321;
							field5060.method10122(var5 - 73, var6 - 20);
							var0.method8147(Class367.field4177, var5, var6 + 5, 16777215, 0);
							var5 = 80 + field347 + 180;
							field5060.method10122(var5 - 73, var6 - 20);
							var0.method8147(Class367.field4118, var5, var6 + 5, 16777215, 0);
						} else if (field353 == 9) {
							var15 = 221;
							var0.method8147(field355, 180 + field347, var15, 16776960, 0);
							var16 = var15 + 25;
							var0.method8147(field377, 180 + field347, var16, 16776960, 0);
							var16 += 25;
							var0.method8147(field367, 180 + field347, var16, 16776960, 0);
							var5 = 180 + field347;
							var6 = 311;
							field5060.method10122(var5 - 73, var6 - 20);
							var0.method8147(Class367.field4265, var5, var6 + 5, 16777215, 0);
						} else if (10 == field353) {
							var16 = 180 + field347;
							var17 = 209;
							var0.method8147(Class367.field4274, 180 + field347, var17, 16776960, 0);
							var5 = var17 + 20;
							field1451.method10122(var16 - 109, var5);
							if (field368.isEmpty()) {
								field342.method10122(var16 - 48, var5 + 18);
							} else {
								field342.method10122(var16 - 48, var5 + 5);
								var0.method8147(field368, var16, var5 + 68 - 15, 16776960, 0);
							}
						} else if (field353 == 12) {
							var16 = field348;
							var17 = 216;
							var2.method8147(Class367.field4324, var16, var17, 16777215, 0);
							var5 = var17 + 17;
							var2.method8147(Class367.field4325, var16, var5, 16777215, 0);
							var5 += 17;
							var2.method8147(Class367.field4044, var16, var5, 16777215, 0);
							var5 += 17;
							var2.method8147(Class367.field4327, var16, var5, 16777215, 0);
							var16 = field348 - 80;
							var17 = 311;
							field5060.method10122(var16 - 73, var17 - 20);
							var0.method8147(Class367.field4330, var16, var17 + 5, 16777215, 0);
							var16 = field348 + 80;
							field5060.method10122(var16 - 73, var17 - 20);
							var0.method8147(Class367.field4331, var16, var17 + 5, 16777215, 0);
						} else if (13 == field353) {
							var15 = 231;
							var2.method8147(Class367.field4125, 180 + field347, var15, 16777215, 0);
							var16 = var15 + 20;
							var2.method8147(Class367.field4329, field347 + 180, var16, 16777215, 0);
							var5 = field347 + 180;
							var15 = 311;
							field5060.method10122(var5 - 73, var15 - 20);
							var0.method8147(Class367.field4118, var5, var15 + 5, 16777215, 0);
						} else if (field353 == 14) {
							var15 = 201;
							String var31 = "";
							var18 = "";
							var7 = "";
							switch(field351) {
							case 0:
								var31 = Class367.field4114;
								var18 = Class367.field4088;
								var7 = Class367.field4089;
								break;
							case 1:
								var31 = Class367.field4126;
								var18 = Class367.field4127;
								var7 = Class367.field4128;
								break;
							case 2:
								var31 = Class367.field4162;
								var18 = Class367.field4163;
								var7 = Class367.field4164;
								break;
							default:
								method3156(false);
							}

							var0.method8147(var31, 180 + field347, var15, 16776960, 0);
							var16 = var15 + 20;
							var0.method8147(var18, field347 + 180, var16, 16776960, 0);
							var16 += 20;
							var0.method8147(var7, 180 + field347, var16, 16776960, 0);
							var20 = field347 + 180;
							var22 = 276;
							field5060.method10122(var20 - 73, var22 - 20);
							if (field351 == 1) {
								var0.method8147(Class367.field4071, var20, var22 + 5, 16777215, 0);
							} else {
								var0.method8147(Class367.field4070, var20, var22 + 5, 16777215, 0);
							}

							var20 = field347 + 180;
							var22 = 326;
							field5060.method10122(var20 - 73, var22 - 20);
							var0.method8147(Class367.field4118, var20, var22 + 5, 16777215, 0);
						} else if (24 == field353) {
							var15 = 221;
							var0.method8147(field355, field347 + 180, var15, 16777215, 0);
							var16 = var15 + 15;
							var0.method8147(field377, field347 + 180, var16, 16777215, 0);
							var16 += 15;
							var0.method8147(field367, field347 + 180, var16, 16777215, 0);
							var16 += 15;
							var5 = field347 + 180;
							var6 = 301;
							field5060.method10122(var5 - 73, var6 - 20);
							var0.method8147(Class367.field4034, var5, var6 + 5, 16777215, 0);
						} else if (32 == field353) {
							var15 = 216;
							var0.method8147(Class367.field4317, field347 + 180, var15, 16776960, 0);
							var16 = var15 + 15;
							var2.method8147(Class367.field4288, field347 + 180, var16, 16776960, 0);
							var16 += 15;
							var2.method8147(Class367.field4069, 180 + field347, var16, 16776960, 0);
							var16 += 15;
							var5 = field347 + 180 - 80;
							var6 = 321;
							field5060.method10122(var5 - 73, var6 - 20);
							var0.method8147(Class367.field4320, var5, var6 + 5, 16777215, 0);
							var5 = 80 + field347 + 180;
							field5060.method10122(var5 - 73, var6 - 20);
							var0.method8147(Class367.field4118, var5, var6 + 5, 16777215, 0);
						} else if (field353 == 33) {
							var15 = 201;
							var0.method8147(field355, 180 + field347, var15, 16776960, 0);
							var16 = var15 + 20;
							var1.method8147(field377, field347 + 180, var16, 16776960, 0);
							var16 += 20;
							var1.method8147(field367, 180 + field347, var16, 16776960, 0);
							var16 += 15;
							var5 = field347 + 180;
							var6 = 276;
							field5060.method10122(var5 - 73, var6 - 20);
							var2.method8147(Class367.field4333, var5, var6 + 5, 16777215, 0);
							var5 = field347 + 180;
							var6 = 326;
							field5060.method10122(var5 - 73, var6 - 20);
							var2.method8147(Class367.field4118, var5, var6 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.field537 >= 10) {
				int[] var34 = new int[4];
				Class569.method10132(var34);
				Class569.method10183(field341, 0, 765 + field341, Client.field15);
				field1208.method2375(field341 - 22, Client.field541);
				field1208.method2375(765 + field341 + 22 - 128, Client.field541);
				Class569.method10133(var34);
			}

			field4740[Client.field1474.method2492() ? 1 : 0].method10122(field341 + 765 - 40, 463);
			if (Client.field537 > 5 && Client.field1376 == Class395.field4602) {
				if (field1431 != null) {
					var16 = 5 + field341;
					var17 = 463;
					byte var26 = 100;
					byte var32 = 35;
					field1431.method10122(var16, var17);
					var0.method8147(Class367.field4043 + " " + Client.field525, var26 / 2 + var16, var32 / 2 + var17 - 2, 16777215, 0);
					if (Class75.field1907 != null) {
						var1.method8147(Class367.field4083, var26 / 2 + var16, 12 + var17 + var32 / 2, 16777215, 0);
					} else {
						var1.method8147(Class367.field4342, var26 / 2 + var16, var17 + var32 / 2 + 12, 16777215, 0);
					}
				} else {
					field1431 = Class402.method7469(Client.field112, "sl_button", "");
				}
			}

		}
	}

	@ObfInfo(owner = "hx", name = "az", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method4018(String var0, String var1, String var2) {
		field355 = var0;
		field377 = var1;
		field367 = var2;
	}

	@ObfInfo(owner = "av", name = "ax", desc = "(Lqh;Lqh;B)V", opaque = "1")
	public static void method304(Class424 var0, Class424 var1) {
		int var5;
		int var6;
		if (field5363 == null) {
			Class390 var4 = Client.field112;
			Class553[] var3;
			if (!var4.method7137("sl_back", "")) {
				var3 = null;
			} else {
				var5 = var4.method7150("sl_back");
				var6 = var4.method7209(var5, "");
				var3 = Class554.method8633(var4, var5, var6);
			}

			field5363 = var3;
		}

		if (field1462 == null) {
			field1462 = Class510.method9001(Client.field112, "sl_flags", "");
		}

		if (field919 == null) {
			field919 = Class510.method9001(Client.field112, "sl_arrows", "");
		}

		if (field4674 == null) {
			field4674 = Class510.method9001(Client.field112, "sl_stars", "");
		}

		if (field179 == null) {
			field179 = Class402.method7469(Client.field112, "leftarrow", "");
		}

		if (field3773 == null) {
			field3773 = Class402.method7469(Client.field112, "rightarrow", "");
		}

		Class569.method10138(field341, 23, 765, 480, 0);
		Class569.method10139(field341, 0, 125, 23, 12425273, 9135624);
		Class569.method10139(125 + field341, 0, 640, 23, 5197647, 2697513);
		var0.method8147(Class367.field4332, field341 + 62, 15, 0, -1);
		if (field4674 != null) {
			field4674[1].method10122(140 + field341, 1);
			var1.method8248(Class367.field4282, 152 + field341, 10, 16777215, -1);
			field4674[0].method10122(140 + field341, 12);
			var1.method8248(Class367.field4334, 152 + field341, 21, 16777215, -1);
		}

		if (field919 != null) {
			int var23 = field341 + 280;
			if (0 == Class75.field901[0] && Class75.field900[0] == 0) {
				field919[2].method10122(var23, 4);
			} else {
				field919[0].method10122(var23, 4);
			}

			if (0 == Class75.field901[0] && Class75.field900[0] == 1) {
				field919[3].method10122(var23 + 15, 4);
			} else {
				field919[1].method10122(var23 + 15, 4);
			}

			var0.method8248(Class367.field4335, var23 + 32, 17, 16777215, -1);
			int var25 = field341 + 390;
			if (1 == Class75.field901[0] && Class75.field900[0] == 0) {
				field919[2].method10122(var25, 4);
			} else {
				field919[0].method10122(var25, 4);
			}

			if (Class75.field901[0] == 1 && Class75.field900[0] == 1) {
				field919[3].method10122(var25 + 15, 4);
			} else {
				field919[1].method10122(var25 + 15, 4);
			}

			var0.method8248(Class367.field4336, var25 + 32, 17, 16777215, -1);
			var5 = field341 + 500;
			if (2 == Class75.field901[0] && Class75.field900[0] == 0) {
				field919[2].method10122(var5, 4);
			} else {
				field919[0].method10122(var5, 4);
			}

			if (2 == Class75.field901[0] && Class75.field900[0] == 1) {
				field919[3].method10122(var5 + 15, 4);
			} else {
				field919[1].method10122(var5 + 15, 4);
			}

			var0.method8248(Class367.field4337, var5 + 32, 17, 16777215, -1);
			var6 = 610 + field341;
			if (3 == Class75.field901[0] && 0 == Class75.field900[0]) {
				field919[2].method10122(var6, 4);
			} else {
				field919[0].method10122(var6, 4);
			}

			if (3 == Class75.field901[0] && 1 == Class75.field900[0]) {
				field919[3].method10122(var6 + 15, 4);
			} else {
				field919[1].method10122(var6 + 15, 4);
			}

			var0.method8248(Class367.field4166, var6 + 32, 17, 16777215, -1);
		}

		Class569.method10138(708 + field341, 4, 50, 16, 0);
		var1.method8147(Class367.field4139, 25 + field341 + 708, 16, 16777215, -1);
		field369 = -1;
		if (field5363 != null) {
			byte var24 = 88;
			byte var26 = 19;
			var5 = 765 / (var24 + 1) - 1;
			var6 = 480 / (var26 + 1);

			int var7;
			int var8;
			do {
				var7 = var6;
				var8 = var5;
				if (var6 * (var5 - 1) >= Class75.field898) {
					--var5;
				}

				if ((var6 - 1) * var5 >= Class75.field898) {
					--var6;
				}

				if (var5 * (var6 - 1) >= Class75.field898) {
					--var6;
				}
			} while(var7 != var6 || var8 != var5);

			var7 = (765 - var5 * var24) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			var8 = (480 - var6 * var26) / (var6 + 1);
			if (var8 > 5) {
				var8 = 5;
			}

			int var9 = (765 - var5 * var24 - (var5 - 1) * var7) / 2;
			int var10 = (480 - var6 * var26 - var8 * (var6 - 1)) / 2;
			int var11 = (Class75.field898 + var6 - 1) / var6;
			field372 = var11 - var5;
			if (field179 != null && field371 > 0) {
				field179.method10122(8, Client.field15 / 2 - field179.field5496 / 2);
			}

			if (field3773 != null && field371 < field372) {
				field3773.method10122(Client.field954 - field3773.field5495 - 8, Client.field15 / 2 - field3773.field5496 / 2);
			}

			int var12 = var10 + 23;
			int var13 = var9 + field341;
			int var14 = 0;
			boolean var15 = false;
			int var16 = field371;

			int var17;
			for (var17 = var16 * var6; var17 < Class75.field898 && var16 - field371 < var5; ++var17) {
				Class75 var18 = Class90.field3782[var17];
				boolean var19 = true;
				String var20 = Integer.toString(var18.field904);
				if (-1 == var18.field904) {
					var20 = Class367.field4339;
					var19 = false;
				} else if (var18.field904 > 1980) {
					var20 = Class367.field4340;
					var19 = false;
				}

				Class127 var21 = null;
				int var22 = 0;
				if (var18.method2212()) {
					var21 = var18.method2157() ? Class127.field1502 : Class127.field1507;
				} else if (var18.method2188()) {
					var21 = var18.method2157() ? Class127.field1510 : Class127.field1509;
				} else if (var18.method2162()) {
					var22 = 16711680;
					var21 = var18.method2157() ? Class127.field1495 : Class127.field1501;
				} else if (var18.method2164()) {
					var21 = var18.method2157() ? Class127.field1499 : Class127.field1503;
				} else if (var18.method2160()) {
					var21 = var18.method2157() ? Class127.field1498 : Class127.field1497;
				} else if (var18.method2193()) {
					var21 = var18.method2157() ? Class127.field1504 : Class127.field1505;
				} else if (var18.method2166()) {
					var21 = var18.method2157() ? Class127.field1508 : Class127.field1512;
				}

				if (var21 == null || var21.field1511 >= field5363.length) {
					var21 = var18.method2157() ? Class127.field1496 : Class127.field1506;
				}

				if (Class42.field231 >= var13 && Class42.field221 >= var12 && Class42.field231 < var13 + var24 && Class42.field221 < var12 + var26 && var19) {
					field369 = var17;
					field5363[var21.field1511].method9610(var13, var12, 128, 16777215);
					var15 = true;
				} else {
					field5363[var21.field1511].method9636(var13, var12);
				}

				if (field1462 != null) {
					field1462[(var18.method2157() ? 8 : 0) + var18.field907].method10122(var13 + 29, var12);
				}

				var0.method8147(Integer.toString(var18.field902), var13 + 15, 5 + var12 + var26 / 2, var22, -1);
				var1.method8147(var20, var13 + 60, var12 + var26 / 2 + 5, 268435455, -1);
				var12 += var8 + var26;
				++var14;
				if (var14 >= var6) {
					var12 = var10 + 23;
					var13 += var7 + var24;
					var14 = 0;
					++var16;
				}
			}

			if (var15) {
				var17 = var1.method8139(Class90.field3782[field369].field906) + 6;
				int var27 = var1.field4784 + 8;
				int var28 = Class42.field221 + 25;
				if (var28 + var27 > 480) {
					var28 = Class42.field221 - 25 - var27;
				}

				Class569.method10138(Class42.field231 - var17 / 2, var28, var17, var27, 16777120);
				Class569.method10142(Class42.field231 - var17 / 2, var28, var17, var27, 0);
				var1.method8147(Class90.field3782[field369].field906, Class42.field231, 4 + var1.field4784 + var28, 0, -1);
			}
		}

	}

	@ObfInfo(owner = "pe", name = "ay", desc = "(I)V", opaque = "-200384121")
	public static void method7374() {
		if (Class75.method7051()) {
			field339 = true;
			field371 = 0;
			field372 = 0;
		}

	}

	@ObfInfo(owner = "bd", name = "ao", desc = "(B)V")
	public static void method434() {
		method3344(24);
		method4018(Class367.field4065, Class367.field4269, Class367.field4270);
	}

	@ObfInfo(owner = "ga", name = "aa", desc = "(II)V", opaque = "-1202060921")
	public static void method3344(int var0) {
		if (var0 != field353) {
			field353 = var0;
		}
	}

	@ObfInfo(owner = "kc", name = "as", desc = "(Ljava/lang/String;I)V")
	public static void method5020(String var0) {
		field368 = Class543.method3366(var0);
	}

	@ObfInfo(name = "at", desc = "(ILjava/lang/String;I)V")
	public static void method1102(int var0, String var1) {
		field350 = var1;
		field349 = var0;
	}
}
