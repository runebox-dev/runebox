import io.runebox.ObfInfo;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@ObfInfo(name = "cx")
public class Class76 {
	@ObfInfo(owner = "am", name = "ao", desc = "Lea;")
	public static Class105 field53;
	@ObfInfo(owner = "ni", name = "bb", desc = "Lqi;")
	public static Class425 field3867;
	@ObfInfo(owner = "pz", name = "by", desc = "Lqi;")
	public static Class425 field4664;
	@ObfInfo(owner = "hq", name = "ac", desc = "Lvc;")
	public static Class549 field2037;
	@ObfInfo(name = "ao", desc = "Lvc;")
	public static Class549 field925;
	@ObfInfo(owner = "bc", name = "do", desc = "[Lvc;")
	public static Class549[] field150;
	@ObfInfo(owner = "du", name = "ah", desc = "Lvl;")
	public static Class557 field1313;
	@ObfInfo(owner = "gg", name = "dw", desc = "Lvl;")
	public static Class557 field1804;
	@ObfInfo(owner = "hp", name = "ae", desc = "Lvl;")
	public static Class557 field2028;
	@ObfInfo(owner = "ia", name = "df", desc = "Lvl;")
	public static Class557 field2116;
	@ObfInfo(owner = "iz", name = "ab", desc = "Lvl;")
	public static Class557 field2504;
	@ObfInfo(owner = "nm", name = "ax", desc = "Lvl;")
	public static Class557 field3890;
	@ObfInfo(owner = "nr", name = "dz", desc = "Lvl;")
	public static Class557 field3930;
	@ObfInfo(owner = "pr", name = "aq", desc = "Lvl;")
	public static Class557 field4636;
	@ObfInfo(owner = "qv", name = "at", desc = "Lvl;")
	public static Class557 field4747;
	@ObfInfo(name = "af", desc = "Lvl;")
	public static Class557 field923;
	@ObfInfo(name = "aa", desc = "Lvl;")
	public static Class557 field924;
	@ObfInfo(name = "ap", desc = "Lvl;")
	public static Class557 field926;
	@ObfInfo(owner = "fj", name = "dd", desc = "[Lvl;")
	public static Class557[] field1606;
	@ObfInfo(owner = "op", name = "da", desc = "[Lvl;")
	public static Class557[] field4465;
	@ObfInfo(owner = "qo", name = "av", desc = "[Lvl;")
	public static Class557[] field4707;
	@ObfInfo(owner = "qr", name = "ds", desc = "[Lvl;")
	public static Class557[] field4719;
	@ObfInfo(name = "az", desc = "[Lvl;")
	public static Class557[] field937;
	@ObfInfo(owner = "ph", name = "af", desc = "[Lcl;")
	public static Class64[] field4598;
	@ObfInfo(name = "al", desc = "Z")
	public static boolean field920;
	@ObfInfo(name = "db", desc = "Z")
	public static boolean field934;
	@ObfInfo(name = "cv", desc = "Z")
	public static boolean field943;
	@ObfInfo(name = "cx", desc = "Z")
	public static boolean field944;
	@ObfInfo(name = "cg", desc = "Z")
	public static boolean field947;
	@ObfInfo(owner = "ag", name = "an", desc = "I", intMultiplier = -2057094345)
	public static int field36;
	@ObfInfo(owner = "tc", name = "cy", desc = "I", intMultiplier = 264957019)
	public static int field5093;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -684644281)
	public static int field921;
	@ObfInfo(name = "bq", desc = "I", intMultiplier = 13511489)
	public static int field927;
	@ObfInfo(name = "am", desc = "I", intMultiplier = -467769523)
	public static int field928;
	@ObfInfo(name = "bz", desc = "I", intMultiplier = 1661503897)
	public static int field929;
	@ObfInfo(name = "cw", desc = "I", intMultiplier = -79033559)
	public static int field932;
	@ObfInfo(name = "dc", desc = "I", intMultiplier = -801470097)
	public static int field939;
	@ObfInfo(name = "dj", desc = "I", intMultiplier = -355769989)
	public static int field945;
	@ObfInfo(name = "dg", desc = "I", intMultiplier = -1791818179)
	public static int field949;
	@ObfInfo(name = "du", desc = "I", intMultiplier = -651306129)
	public static int field950;
	@ObfInfo(name = "ci", desc = "I", intMultiplier = -1312520673)
	public static int field953;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1270478887)
	public static int field956;
	@ObfInfo(owner = "cy", name = "ct", desc = "I", intMultiplier = -628097453)
	public static int field967;
	@ObfInfo(owner = "fj", name = "ba", desc = "Ljava/lang/String;")
	public static String field1605;
	@ObfInfo(name = "cn", desc = "Ljava/lang/String;")
	public static String field930;
	@ObfInfo(name = "ck", desc = "Ljava/lang/String;")
	public static String field933;
	@ObfInfo(name = "ch", desc = "Ljava/lang/String;")
	public static String field935;
	@ObfInfo(name = "cs", desc = "Ljava/lang/String;")
	public static String field938;
	@ObfInfo(name = "ce", desc = "Ljava/lang/String;")
	public static String field941;
	@ObfInfo(name = "ar", desc = "Ljava/lang/String;")
	public static String field942;
	@ObfInfo(name = "dq", desc = "Ljava/lang/String;")
	public static String field946;
	@ObfInfo(name = "cp", desc = "Ljava/lang/String;")
	public static String field951;
	@ObfInfo(name = "dm", desc = "Ljava/lang/String;")
	public static String field952;
	@ObfInfo(name = "cd", desc = "Ljava/lang/String;")
	public static String field955;
	@ObfInfo(name = "dy", desc = "[Ljava/lang/String;")
	public static String[] field922;
	@ObfInfo(name = "dh", desc = "[Ljava/lang/String;")
	public static String[] field936;
	@ObfInfo(name = "cc", desc = "[Ljava/lang/String;")
	public static String[] field940;
	@ObfInfo(name = "dk", desc = "[Ljava/lang/String;")
	public static String[] field954;
	@ObfInfo(name = "dl", desc = "J", longMultiplier = -8903805122193411189L)
	public static long field919;
	@ObfInfo(name = "dn", desc = "J", longMultiplier = -1064771094030866347L)
	public static long field931;

	static {
		field921 = 0;
		field956 = 202 + field921;
		field928 = 10;
		field942 = "";
		field927 = -1;
		field929 = 1;
		field932 = 0;
		field933 = "";
		field930 = "";
		field935 = "";
		field951 = "";
		field955 = "";
		field938 = "";
		field953 = 0;
		field940 = new String[8];
		field941 = "";
		field947 = false;
		field943 = false;
		field944 = true;
		field945 = 0;
		field946 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		field952 = "1234567890";
		field934 = false;
		field949 = -1;
		field950 = 0;
		field939 = 0;
		new DecimalFormat("##0.00");
		new Class135();
		field931 = -1L;
		field919 = -1L;
		field954 = new String[]{"title.jpg"};
		field936 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field922 = new String[]{"logo_speedrunning"};
	}

	@ObfInfo(owner = "ks", name = "ak", desc = "(Lor;B)I", opaque = "-2")
	public static int method5647(Class382 var0) {
		int var2 = field954.length + field936.length;
		String[] var3 = field922;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			String var5 = var3[var4];
			if (var0.method7233(var5) != -1) {
				++var2;
			}
		}

		return var2;
	}

	@ObfInfo(owner = "mo", name = "al", desc = "(Lor;Lor;ZII)V", opaque = "1662465912")
	public static void method6264(Class382 var0, Class382 var1, boolean var2, int var3) {
		if (field920) {
			if (var3 == 4) {
				method4120(4);
			}

		} else {
			if (var3 == 0) {
				Class89.method2397(var2);
			} else {
				method4120(var3);
			}

			Class561.method10160();
			byte[] var5 = var0.method7271("title.jpg", "");
			field2037 = Class46.method8418(var5);
			field925 = field2037.method9919();
			Class106.method2771(var1, Client.field675);
			field923 = Class554.method8860(var1, "titlebox", "");
			field924 = Class554.method8860(var1, "titlebutton", "");
			field4747 = Class554.method8860(var1, "titlebutton_large", "");
			field2504 = Class554.method8860(var1, "play_now_text", "");
			Class554.method8860(var1, "titlebutton_wide42,1", "");
			field937 = Class554.method3837(var1, "runes", "");
			field4707 = Class554.method3837(var1, "title_mute", "");
			field4636 = Class554.method8860(var1, "options_radio_buttons,0", "");
			field926 = Class554.method8860(var1, "options_radio_buttons,4", "");
			field2028 = Class554.method8860(var1, "options_radio_buttons,2", "");
			field3890 = Class554.method8860(var1, "options_radio_buttons,6", "");
			field5093 = field4636.field5392;
			field967 = field4636.field5395;
			Client.field2695 = new Class87(field937);
			if (var2) {
				field955 = "";
				field938 = "";
				field940 = new String[8];
				field953 = 0;
			}

			Client.field4650 = 0;
			Class89.field3115 = "";
			field944 = true;
			field934 = false;
			if (!Client.field4851.method2614()) {
				ArrayList var6 = new ArrayList();
				var6.add(new Class357(Client.field2961, "scape main", "", 255, false));
				Class332.method1940(var6, 0, 0, 0, 100, false);
			} else {
				Class380.method7208(0, 0);
			}

			Class332.method785();
			Class374 var7 = Client.field69;
			var7.method7166(false);
			field920 = true;
			field921 = (Client.field182 - 765) / 2;
			field956 = field921 + 202;
			field36 = 180 + field956;
			field2037.method9929(field921, 0);
			field925.method9929(382 + field921, 0);
			field1313.method10086(382 + field921 - field1313.field5392 / 2, 18);
		}
	}

	@ObfInfo(owner = "fo", name = "aj", desc = "(ZZI)Lvl;", opaque = "709857085")
	public static Class557 method3223(boolean var0, boolean var1) {
		return var0 ? (var1 ? field3890 : field2028) : (var1 ? field926 : field4636);
	}

	@ObfInfo(owner = "ff", name = "az", desc = "(I)Ljava/lang/String;")
	public static String method3091() {
		String var1;
		if (Client.field4851.method2612()) {
			String var3 = field955;
			String var2 = Class412.method4673('*', var3.length());
			var1 = var2;
		} else {
			var1 = field955;
		}

		return var1;
	}

	@ObfInfo(owner = "fi", name = "aa", desc = "(B)V", opaque = "-1")
	public static void method3136() {
		if (field920) {
			field923 = null;
			field924 = null;
			field937 = null;
			field2037 = null;
			field925 = null;
			field1313 = null;
			field4707 = null;
			field4636 = null;
			field2028 = null;
			field150 = null;
			field4719 = null;
			field1606 = null;
			field4465 = null;
			field2116 = null;
			Client.field2695.method2356();
			Class380.method7208(0, 100);
			Class374 var1 = Client.field69;
			var1.method7166(true);
			field920 = false;
		}
	}

	@ObfInfo(owner = "sq", name = "ab", desc = "(B)V", opaque = "2")
	public static void method8882() {
		if (Client.field540 && field955 != null && field955.length() > 0) {
			field945 = 1;
		} else {
			field945 = 0;
		}

	}

	@ObfInfo(owner = "am", name = "ac", desc = "(Lbe;Lqb;Lqb;I)V", opaque = "-1041767614")
	public static void method155(Class31 var0, Class418 var1, Class418 var2) {
		int var6;
		int var28;
		int var29;
		boolean var33;
		if (field934) {
			Class227 var27 = Client.field721;

			while (true) {
				if (!var27.method4363()) {
					if (1 != Class33.field237 && (Client.field1468 || Class33.field237 != 4)) {
						break;
					}

					var6 = field921 + 280;
					if (Class33.field238 >= var6 && Class33.field238 <= var6 + 14 && Class33.field239 >= 4 && Class33.field239 <= 18) {
						Class64.method4643(0, 0);
						break;
					}

					if (Class33.field238 >= var6 + 15 && Class33.field238 <= var6 + 80 && Class33.field239 >= 4 && Class33.field239 <= 18) {
						Class64.method4643(0, 1);
						break;
					}

					var28 = field921 + 390;
					if (Class33.field238 >= var28 && Class33.field238 <= var28 + 14 && Class33.field239 >= 4 && Class33.field239 <= 18) {
						Class64.method4643(1, 0);
						break;
					}

					if (Class33.field238 >= var28 + 15 && Class33.field238 <= var28 + 80 && Class33.field239 >= 4 && Class33.field239 <= 18) {
						Class64.method4643(1, 1);
						break;
					}

					var29 = 500 + field921;
					if (Class33.field238 >= var29 && Class33.field238 <= var29 + 14 && Class33.field239 >= 4 && Class33.field239 <= 18) {
						Class64.method4643(2, 0);
						break;
					}

					if (Class33.field238 >= var29 + 15 && Class33.field238 <= var29 + 80 && Class33.field239 >= 4 && Class33.field239 <= 18) {
						Class64.method4643(2, 1);
						break;
					}

					int var31 = 610 + field921;
					if (Class33.field238 >= var31 && Class33.field238 <= var31 + 14 && Class33.field239 >= 4 && Class33.field239 <= 18) {
						Class64.method4643(3, 0);
						break;
					}

					if (Class33.field238 >= var31 + 15 && Class33.field238 <= var31 + 80 && Class33.field239 >= 4 && Class33.field239 <= 18) {
						Class64.method4643(3, 1);
						break;
					}

					if (Class33.field238 >= field921 + 708 && Class33.field239 >= 4 && Class33.field238 <= 708 + field921 + 50 && Class33.field239 <= 20) {
						field934 = false;
						field2037.method9929(field921, 0);
						field925.method9929(field921 + 382, 0);
						field1313.method10086(382 + field921 - field1313.field5392 / 2, 18);
						break;
					}

					if (-1 != field949) {
						Class64 var55 = field4598[field949];
						boolean var51 = Class541.method5694(Client.field675, Class534.field5281);
						var33 = var55.method1139();
						Client.field434 = var33;
						var55.field467 = var33 ? "beta" : var55.field467;
						Class502.method9252(var55);
						field934 = false;
						field2037.method9929(field921, 0);
						field925.method9929(382 + field921, 0);
						field1313.method10086(field921 + 382 - field1313.field5392 / 2, 18);
						if (var33 != var51) {
							Client.method54();
						}
					} else {
						if (field950 > 0 && field3930 != null && Class33.field238 >= 0 && Class33.field238 <= field3930.field5392 && Class33.field239 >= Client.field5261 / 2 - 50 && Class33.field239 <= Client.field5261 / 2 + 50) {
							--field950;
						}

						if (field950 < field939 && field1804 != null && Class33.field238 >= Client.field182 - field1804.field5392 - 5 && Class33.field238 <= Client.field182 && Class33.field239 >= Client.field5261 / 2 - 50 && Class33.field239 <= Client.field5261 / 2 + 50) {
							++field950;
						}
					}
					break;
				}

				if (var27.field2389 == 13) {
					field934 = false;
					field2037.method9929(field921, 0);
					field925.method9929(field921 + 382, 0);
					field1313.method10086(field921 + 382 - field1313.field5392 / 2, 18);
					break;
				}

				if (var27.field2389 == 96) {
					if (field950 > 0 && field3930 != null) {
						--field950;
					}
				} else if (var27.field2389 == 97 && field950 < field939 && field1804 != null) {
					++field950;
				}
			}

		} else {
			if ((1 == Class33.field237 || !Client.field1468 && Class33.field237 == 4) && Class33.field238 >= 765 + field921 - 50 && Class33.field239 >= 453) {
				Client.field4851.method2723(!Client.field4851.method2614());
				if (!Client.field4851.method2614()) {
					ArrayList var4 = new ArrayList();
					var4.add(new Class357(Client.field2961, "scape main", "", 255, false));
					Class332.method1940(var4, 0, 0, 0, 100, false);
				} else {
					Class380.method7208(0, 0);
				}

				Class332.method785();
			}

			if (5 != Client.field555) {
				if (-1L == field931) {
					field931 = Class130.method3047() + 1000L;
				}

				long var26 = Class130.method3047();
				if (Class441.method8271() && field919 == -1L) {
					field919 = var26;
					if (field919 > field931) {
						field931 = field919;
					}
				}

				if (10 == Client.field555 || Client.field555 == 11) {
					if (Client.field2071 == Class402.field4616) {
						if (1 == Class33.field237 || !Client.field1468 && Class33.field237 == 4) {
							var6 = 5 + field921;
							short var7 = 463;
							byte var8 = 100;
							byte var9 = 35;
							if (Class33.field238 >= var6 && Class33.field238 <= var8 + var6 && Class33.field239 >= var7 && Class33.field239 <= var9 + var7) {
								method2088();
								return;
							}
						}

						if (field53 != null) {
							method2088();
						}
					}

					var6 = Class33.field237;
					var28 = Class33.field238;
					var29 = Class33.field239;
					if (var6 == 0) {
						var28 = Class33.field229;
						var29 = Class33.field220;
					}

					if (!Client.field1468 && var6 == 4) {
						var6 = 1;
					}

					Class227 var30 = Client.method7365();
					int var34;
					short var35;
					if (field932 == 0) {
						boolean var54 = false;

						while (var30.method4363()) {
							if (var30.field2389 == 84) {
								var54 = true;
							}
						}

						var34 = field36 - 80;
						var35 = 291;
						if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
							Class40.method7134(Class452.method8428("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var34 = 80 + field36;
						if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20 || var54) {
							if ((Client.field675 & Class534.field5290.method175()) != 0) {
								field933 = "";
								field930 = Class378.field4369;
								field935 = Class378.field4370;
								field951 = Class378.field4375;
								method4120(1);
								method8882();
							} else if ((Client.field675 & Class534.field5267.method175()) != 0) {
								if ((Client.field675 & Class534.field5292.method175()) != 0) {
									field930 = Class378.field4366;
									field935 = Class378.field4367;
									field951 = Class378.field4368;
								} else {
									field930 = Class378.field4360;
									field935 = Class378.field4445;
									field951 = Class378.field4157;
								}

								field933 = Class378.field4159;
								method4120(1);
								method8882();
							} else if ((Client.field675 & Class534.field5292.method175()) != 0) {
								field930 = Class378.field4363;
								field935 = Class378.field4364;
								field951 = Class378.field4365;
								field933 = Class378.field4159;
								method4120(1);
								method8882();
							} else {
								method5865(false);
							}
						}
					} else {
						int var10;
						short var11;
						if (field932 == 1) {
							while (true) {
								if (!var30.method4363()) {
									var10 = field36 - 80;
									var11 = 321;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										method5865(false);
									}

									var10 = 80 + field36;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										method4120(0);
									}
									break;
								}

								if (var30.field2389 == 84) {
									method5865(false);
								} else if (13 == var30.field2389) {
									method4120(0);
								}
							}
						} else {
							short var32;
							boolean var37;
							if (2 == field932) {
								var32 = 201;
								var10 = var32 + 52;
								if (var6 == 1 && var29 >= var10 - 12 && var29 < var10 + 2) {
									field945 = 0;
								}

								var10 += 15;
								if (var6 == 1 && var29 >= var10 - 12 && var29 < var10 + 2) {
									field945 = 1;
								}

								var10 += 15;
								var32 = 361;
								if (field3867 != null) {
									var34 = field3867.field4690 / 2;
									if (var6 == 1 && var28 >= field3867.field4691 - var34 && var28 <= var34 + field3867.field4691 && var29 >= var32 - 15 && var29 < var32) {
										switch(field929) {
										case 1:
											Class40.method7134(Class378.field4456, true, false);
											return;
										case 2:
											Class40.method7134("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var34 = field36 - 80;
								var35 = 321;
								if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
									field955 = field955.trim();
									if (field955.length() == 0) {
										method5778(Class378.field4264, Class378.field4351, Class378.field4248);
									} else if (field938.length() == 0) {
										method5778(Class378.field4352, Class378.field4268, Class378.field4269);
									} else {
										method5778(Class378.field4373, Class378.field4374, Class378.field4353);
										Client.method6138(false);
										Class118.method2945(20);
									}

									return;
								}

								var34 = 180 + field956 + 80;
								if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
									method4120(0);
									field955 = "";
									field938 = "";
									Client.field4650 = 0;
									Class89.field3115 = "";
									field944 = true;
								}

								var34 = -117 + field36;
								var35 = 277;
								field947 = var28 >= var34 && var28 < field5093 + var34 && var29 >= var35 && var29 < var35 + field967;
								if (var6 == 1 && field947) {
									Client.field540 = !Client.field540;
									if (!Client.field540 && Client.field4851.method2629() != null) {
										Client.field4851.method2628((String)null);
									}
								}

								var34 = 24 + field36;
								var35 = 277;
								field943 = var28 >= var34 && var28 < field5093 + var34 && var29 >= var35 && var29 < var35 + field967;
								if (var6 == 1 && field943) {
									Client.field4851.method2618(!Client.field4851.method2612());
									if (!Client.field4851.method2612()) {
										field955 = "";
										Client.field4851.method2628((String)null);
										method8882();
									}
								}

								label1205:
								while (true) {
									int var43;
									Transferable var45;
									do {
										while (true) {
											char var42;
											label1169:
											do {
												while (true) {
													while (var30.method4363()) {
														if (13 != var30.field2389) {
															if (field945 != 0) {
																continue label1169;
															}

															method2499(var30.field2377);
															if (85 == var30.field2389 && field955.length() > 0) {
																field955 = field955.substring(0, field955.length() - 1);
															}

															if (var30.field2389 == 84 || 80 == var30.field2389) {
																field945 = 1;
															}

															var42 = var30.field2377;
															var37 = field946.indexOf(var42) != -1;
															if (var37 && field955.length() < 320) {
																field955 = field955 + var30.field2377;
															}
														} else {
															method4120(0);
															field955 = "";
															field938 = "";
															Client.field4650 = 0;
															Class89.field3115 = "";
															field944 = true;
														}
													}

													return;
												}
											} while(field945 != 1);

											if (var30.field2389 == 85 && field938.length() > 0) {
												field938 = field938.substring(0, field938.length() - 1);
											} else if (var30.field2389 == 84 || var30.field2389 == 80) {
												field945 = 0;
												if (var30.field2389 == 84) {
													field955 = field955.trim();
													if (field955.length() == 0) {
														method5778(Class378.field4264, Class378.field4351, Class378.field4248);
													} else if (field938.length() == 0) {
														method5778(Class378.field4352, Class378.field4268, Class378.field4269);
													} else {
														method5778(Class378.field4373, Class378.field4374, Class378.field4353);
														Client.method6138(false);
														Class118.method2945(20);
													}

													return;
												}
											}

											if ((var30.method4342(82) || var30.method4342(87)) && var30.field2389 == 67) {
												Clipboard var46 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var45 = var46.getContents(Client.field2077);
												var43 = 20 - field938.length();
												break;
											}

											if (Class405.method9865(var30.field2377)) {
												var42 = var30.field2377;
												var37 = field946.indexOf(var42) != -1;
												if (var37 && field938.length() < 20) {
													field938 = field938 + var30.field2377;
												}
											}
										}
									} while(var43 <= 0);

									try {
										String var49 = (String)var45.getTransferData(DataFlavor.stringFlavor);
										int var47 = Math.min(var43, var49.length());
										int var48 = 0;

										while (true) {
											if (var48 >= var47) {
												field938 = field938 + var49.substring(0, var47);
												continue label1205;
											}

											if (!Class405.method9865(var49.charAt(var48))) {
												break;
											}

											char var53 = var49.charAt(var48);
											boolean var50 = field946.indexOf(var53) != -1;
											if (!var50) {
												break;
											}

											++var48;
										}

										method4120(3);
										return;
									} catch (UnsupportedFlavorException var24) {
									} catch (IOException var25) {
									}
								}
							} else {
								Class425 var12;
								if (field932 == 3) {
									var10 = 180 + field956;
									var11 = 241;
									var12 = var1.method7990(25, Class378.field4286.length() - 34, Class378.field4286, var10, var11);
									if (var6 == 1 && var12.method7851(var28, var29)) {
										Class40.method7134(Class378.field4455, true, false);
									}

									var10 = field956 + 180;
									var11 = 276;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										Class89.method2397(false);
									}

									var10 = field956 + 180;
									var11 = 326;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										Class40.method7134(Class378.field4456, true, false);
										return;
									}
								} else {
									int var13;
									if (4 == field932) {
										var10 = 180 + field956 - 80;
										var11 = 321;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
											Class89.field3115.trim();
											if (Class89.field3115.length() != 6) {
												method5778(Class378.field4183, Class378.field4184, Class378.field4383);
											} else {
												Client.field4650 = Integer.parseInt(Class89.field3115);
												Class89.field3115 = "";
												Client.method6138(true);
												method5778(Class378.field4373, Class378.field4374, Class378.field4353);
												Class118.method2945(20);
											}

											return;
										}

										if (var6 == 1 && var28 >= 180 + field956 - 9 && var28 <= field956 + 180 + 130 && var29 >= 263 && var29 <= 296) {
											field944 = !field944;
										}

										if (var6 == 1 && var28 >= 180 + field956 - 34 && var28 <= 34 + 180 + field956 && var29 >= 351 && var29 <= 363) {
											Class40.method7134(Class378.field4456, true, false);
										}

										var10 = 180 + field956 + 80;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
											method4120(0);
											field955 = "";
											field938 = "";
											Client.field4650 = 0;
											Class89.field3115 = "";
										}

										while (var30.method4363()) {
											var33 = false;

											for (var13 = 0; var13 < field952.length(); ++var13) {
												if (var30.field2377 == field952.charAt(var13)) {
													var33 = true;
													break;
												}
											}

											if (13 == var30.field2389) {
												method4120(0);
												field955 = "";
												field938 = "";
												Client.field4650 = 0;
												Class89.field3115 = "";
											} else {
												if (var30.field2389 == 85 && Class89.field3115.length() > 0) {
													Class89.field3115 = Class89.field3115.substring(0, Class89.field3115.length() - 1);
												}

												if (var30.field2389 == 84) {
													Class89.field3115.trim();
													if (Class89.field3115.length() != 6) {
														method5778(Class378.field4183, Class378.field4184, Class378.field4383);
													} else {
														Client.field4650 = Integer.parseInt(Class89.field3115);
														Class89.field3115 = "";
														Client.method6138(true);
														method5778(Class378.field4373, Class378.field4374, Class378.field4353);
														Class118.method2945(20);
													}

													return;
												}

												if (var33 && Class89.field3115.length() < 6) {
													Class89.field3115 = Class89.field3115 + var30.field2377;
												}
											}
										}
									} else {
										int var14;
										if (5 == field932) {
											var10 = 180 + field956 - 80;
											var11 = 321;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												field955 = field955.trim();
												if (field955.length() == 0) {
													method5778(Class378.field4419, Class378.field4408, Class378.field4409);
												} else {
													long var38 = Class74.method7131();
													int var36;
													if (var38 == 0L) {
														var36 = 5;
													} else {
														var36 = Class74.method68(var38, field955);
													}

													switch(var36) {
													case 2:
														method5778(Class378.field4410, Class378.field4214, Class378.field4412);
														method4120(6);
														break;
													case 3:
														method5778(Class378.field4413, Class378.field4414, Class378.field4415);
														break;
													case 4:
														method5778(Class378.field4416, Class378.field4178, Class378.field4168);
														break;
													case 5:
														method5778(Class378.field4261, Class378.field4420, Class378.field4217);
														break;
													case 6:
														method5778(Class378.field4422, Class378.field4423, Class378.field4424);
														break;
													case 7:
														method5778(Class378.field4425, Class378.field4172, Class378.field4436);
													}
												}

												return;
											}

											var10 = 180 + field956 + 80;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												method5865(true);
											}

											var35 = 361;
											if (field4664 != null) {
												var13 = field4664.field4690 / 2;
												if (var6 == 1 && var28 >= field4664.field4691 - var13 && var28 <= field4664.field4691 + var13 && var29 >= var35 - 15 && var29 < var35) {
													Class40.method7134(Class452.method8428("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
												}
											}

											while (var30.method4363()) {
												var37 = false;

												for (var14 = 0; var14 < field946.length(); ++var14) {
													if (var30.field2377 == field946.charAt(var14)) {
														var37 = true;
														break;
													}
												}

												if (13 == var30.field2389) {
													method5865(true);
												} else {
													if (var30.field2389 == 85 && field955.length() > 0) {
														field955 = field955.substring(0, field955.length() - 1);
													}

													if (84 == var30.field2389) {
														method8440();
														return;
													}

													if (var37 && field955.length() < 320) {
														field955 = field955 + var30.field2377;
													}
												}
											}
										} else if (field932 != 6) {
											if (7 == field932) {
												if (Client.field3974 && !Client.field565) {
													var10 = field36 - 150;
													var34 = 25 + var10 + 240 + 40;
													var35 = 231;
													var13 = var35 + 40;
													if (var6 == 1 && var28 >= var10 && var28 <= var34 && var29 >= var35 && var29 <= var13) {
														field953 = Class40.method797(var10, var28);
													}

													var14 = field956 + 180 - 80;
													short var15 = 321;
													boolean var16;
													Date var17;
													boolean var18;
													Calendar var19;
													Date var20;
													Date var21;
													boolean var52;
													if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= var15 - 20 && var29 <= var15 + 20) {
														label1072: {
															try {
																var17 = method3231();
															} catch (ParseException var23) {
																method6067("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var16 = false;
																break label1072;
															}

															if (var17 == null) {
																var16 = false;
															} else {
																var19 = Calendar.getInstance();
																var19.set(1, var19.get(1) - 13);
																var19.set(5, var19.get(5) + 1);
																var19.set(11, 0);
																var19.set(12, 0);
																var19.set(13, 0);
																var19.set(14, 0);
																var20 = var19.getTime();
																var18 = var17.before(var20);
																var21 = method3409();
																var52 = var17.after(var21);
																if (!var52) {
																	method6067("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var16 = false;
																} else {
																	if (!var18) {
																		Client.field1215 = 8388607;
																	} else {
																		Client.field1215 = (int)(var17.getTime() / 86400000L - 11745L);
																	}

																	var16 = true;
																}
															}
														}

														if (var16) {
															Class118.method2945(50);
															return;
														}
													}

													var14 = 80 + 180 + field956;
													if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= var15 - 20 && var29 <= var15 + 20) {
														field940 = new String[8];
														method5865(true);
													}

													while (var30.method4363()) {
														if (101 == var30.field2389) {
															field940[field953] = null;
														}

														if (var30.field2389 == 85) {
															if (null == field940[field953] && field953 > 0) {
																--field953;
															}

															field940[field953] = null;
														}

														if (var30.field2377 >= '0' && var30.field2377 <= '9') {
															field940[field953] = "" + var30.field2377;
															if (field953 < 7) {
																++field953;
															}
														}

														if (84 == var30.field2389) {
															label1008: {
																try {
																	var17 = method3231();
																} catch (ParseException var22) {
																	method6067("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var16 = false;
																	break label1008;
																}

																if (var17 == null) {
																	var16 = false;
																} else {
																	var19 = Calendar.getInstance();
																	var19.set(1, var19.get(1) - 13);
																	var19.set(5, var19.get(5) + 1);
																	var19.set(11, 0);
																	var19.set(12, 0);
																	var19.set(13, 0);
																	var19.set(14, 0);
																	var20 = var19.getTime();
																	var18 = var17.before(var20);
																	var21 = method3409();
																	var52 = var17.after(var21);
																	if (!var52) {
																		method6067("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																		var16 = false;
																	} else {
																		if (!var18) {
																			Client.field1215 = 8388607;
																		} else {
																			Client.field1215 = (int)(var17.getTime() / 86400000L - 11745L);
																		}

																		var16 = true;
																	}
																}
															}

															if (var16) {
																Class118.method2945(50);
															}

															return;
														}
													}
												} else {
													var10 = field956 + 180 - 80;
													var11 = 321;
													if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
														Class40.method7134(Class452.method8428("secure", true) + "m=dob/set_dob.ws", true, false);
														method5778(Class378.field4404, Class378.field4405, Class378.field4406);
														method4120(6);
														return;
													}

													var10 = 80 + 180 + field956;
													if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
														method5865(true);
													}
												}
											} else if (field932 == 8) {
												var10 = 180 + field956 - 80;
												var11 = 321;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													Class40.method7134("https://www.jagex.com/terms/privacy", true, false);
													method5778(Class378.field4404, Class378.field4405, Class378.field4406);
													method4120(6);
													return;
												}

												var10 = 80 + field956 + 180;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													method5865(true);
												}
											} else if (9 == field932) {
												var10 = 180 + field956;
												var11 = 311;
												if (var30.field2389 == 84 || var30.field2389 == 13 || var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													Class89.method2397(false);
												}
											} else if (field932 == 10) {
												var10 = 180 + field956;
												var11 = 209;
												if (var30.field2389 == 84 || var6 == 1 && var28 >= var10 - 109 && var28 <= var10 + 109 && var29 >= var11 && var29 <= var11 + 68) {
													method5778(Class378.field4373, Class378.field4374, Class378.field4353);
													Client.field527 = Class555.field5382;
													Client.method6138(false);
													Class118.method2945(20);
												}
											} else if (12 == field932) {
												var10 = field36;
												var11 = 233;
												var12 = var2.method7990(0, 30, Class378.field4306, var10, var11);
												Class425 var41 = var2.method7990(32, 32, Class378.field4306, var10, var11);
												Class425 var39 = var2.method7990(70, 34, Class378.field4306, var10, var11);
												var34 = var11 + 17;
												Class425 var40 = var2.method7990(0, 34, Class378.field4160, var10, var34);
												if (var6 == 1) {
													if (var12.method7851(var28, var29)) {
														Class40.method7134("https://www.jagex.com/terms", true, false);
													} else if (var41.method7851(var28, var29)) {
														Class40.method7134("https://www.jagex.com/terms/privacy", true, false);
													} else if (var39.method7851(var28, var29) || var40.method7851(var28, var29)) {
														Class40.method7134("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
													}
												}

												var10 = field36 - 80;
												var11 = 311;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													Client.method6645();
													Class89.method2397(true);
												}

												var10 = field36 + 80;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													field932 = 13;
												}
											} else if (13 == field932) {
												var10 = field36;
												var11 = 321;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													Class89.method2397(true);
												}
											} else if (14 == field932) {
												String var44 = "";
												switch(field927) {
												case 0:
													var44 = "https://secure.runescape.com/m=offence-appeal/account-history";
													break;
												case 1:
													var44 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
													break;
												case 2:
													var44 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
													break;
												default:
													method5865(false);
												}

												var34 = field956 + 180;
												var35 = 276;
												if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
													Class40.method7134(var44, true, false);
													method5778(Class378.field4404, Class378.field4405, Class378.field4406);
													method4120(6);
													return;
												}

												var34 = 180 + field956;
												var35 = 326;
												if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
													method5865(false);
												}
											} else if (field932 == 24) {
												var10 = 180 + field956;
												var11 = 301;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													Class89.method2397(false);
												}
											} else if (field932 == 32) {
												var10 = field956 + 180 - 80;
												var11 = 321;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													Class40.method7134(Class452.method8428("secure", true) + "m=dob/set_dob.ws", true, false);
													method5778(Class378.field4404, Class378.field4405, Class378.field4406);
													method4120(6);
													return;
												}

												var10 = 80 + 180 + field956;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													method5865(true);
												}
											} else if (field932 == 33) {
												var10 = 180 + field956;
												var11 = 276;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													Class40.method7134(Class378.field4455, true, false);
												}

												var10 = field956 + 180;
												var11 = 326;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													method5865(true);
												}
											}
										} else {
											while (true) {
												do {
													if (!var30.method4363()) {
														var32 = 321;
														if (var6 == 1 && var29 >= var32 - 20 && var29 <= var32 + 20) {
															method5865(true);
														}

														return;
													}
												} while(var30.field2389 != 84 && 13 != var30.field2389);

												method5865(true);
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

	@ObfInfo(owner = "ge", name = "ao", desc = "(I)Ljava/util/Date;")
	public static Date method3409() {
		Calendar var1 = Calendar.getInstance();
		var1.set(2, 0);
		var1.set(5, 1);
		var1.set(1, 1900);
		return var1.getTime();
	}

	@ObfInfo(owner = "lq", name = "ah", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
	public static void method6067(String var0, String var1, String var2) {
		method4120(7);
		method5778(var0, var1, var2);
	}

	@ObfInfo(owner = "fp", name = "av", desc = "(I)Ljava/util/Date;", opaque = "1885671406")
	public static Date method3231() throws ParseException {
		SimpleDateFormat var1 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var1.setLenient(false);
		StringBuilder var2 = new StringBuilder();
		String[] var3 = field940;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			String var5 = var3[var4];
			if (var5 == null) {
				method6067("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var2.append(var5);
		}

		var2.append("12");
		return var1.parse(var2.toString());
	}

	@ObfInfo(owner = "dt", name = "ap", desc = "(CB)Z", opaque = "13")
	public static boolean method2499(char var0) {
		for (int var2 = 0; var2 < field946.length(); ++var2) {
			if (field946.charAt(var2) == var0) {
				return true;
			}
		}

		return false;
	}

	@ObfInfo(owner = "lb", name = "ae", desc = "(ZB)V", opaque = "43")
	public static void method5865(boolean var0) {
		if (!Client.field2077.method1198() && !Client.field2077.method1291() && !Client.field2077.method1737()) {
			field930 = Class378.field4356;
			field935 = Class378.field4211;
			field951 = Class378.field4358;
			method4120(2);
			if (var0) {
				field938 = "";
			}

			Class19.method276();
			method8882();
		} else {
			method4120(10);
		}
	}

	@ObfInfo(owner = "rl", name = "ay", desc = "(I)V", opaque = "1722409036")
	public static void method8440() {
		field955 = field955.trim();
		if (field955.length() == 0) {
			method5778(Class378.field4419, Class378.field4408, Class378.field4409);
		} else {
			long var2 = Class74.method7131();
			int var1;
			if (0L == var2) {
				var1 = 5;
			} else {
				var1 = Class74.method68(var2, field955);
			}

			switch(var1) {
			case 2:
				method5778(Class378.field4410, Class378.field4214, Class378.field4412);
				method4120(6);
				break;
			case 3:
				method5778(Class378.field4413, Class378.field4414, Class378.field4415);
				break;
			case 4:
				method5778(Class378.field4416, Class378.field4178, Class378.field4168);
				break;
			case 5:
				method5778(Class378.field4261, Class378.field4420, Class378.field4217);
				break;
			case 6:
				method5778(Class378.field4422, Class378.field4423, Class378.field4424);
				break;
			case 7:
				method5778(Class378.field4425, Class378.field4172, Class378.field4436);
			}

		}
	}

	@ObfInfo(owner = "eu", name = "au", desc = "(Lqb;Lqb;Lqb;S)V", opaque = "3001")
	public static void method2996(Class418 var0, Class418 var1, Class418 var2) {
		field921 = (Client.field182 - 765) / 2;
		field956 = field921 + 202;
		field36 = field956 + 180;
		byte var4;
		int var5;
		int var11;
		int var25;
		int var28;
		int var29;
		int var30;
		int var33;
		int var36;
		int var39;
		if (field934) {
			if (field150 == null) {
				Class384 var44 = Client.field1793;
				Class549[] var49;
				if (!var44.method7235("sl_back", "")) {
					var49 = null;
				} else {
					var28 = var44.method7233("sl_back");
					var30 = var44.method7299(var28, "");
					var49 = Class554.method6029(var44, var28, var30);
				}

				field150 = var49;
			}

			if (field4719 == null) {
				field4719 = Class554.method3837(Client.field1793, "sl_flags", "");
			}

			if (field1606 == null) {
				field1606 = Class554.method3837(Client.field1793, "sl_arrows", "");
			}

			if (field4465 == null) {
				field4465 = Class554.method3837(Client.field1793, "sl_stars", "");
			}

			if (field3930 == null) {
				field3930 = Class554.method8860(Client.field1793, "leftarrow", "");
			}

			if (field1804 == null) {
				field1804 = Class554.method8860(Client.field1793, "rightarrow", "");
			}

			Class561.method10152(field921, 23, 765, 480, 0);
			Class561.method10221(field921, 0, 125, 23, 12425273, 9135624);
			Class561.method10221(field921 + 125, 0, 640, 23, 5197647, 2697513);
			var0.method7996(Class378.field4347, field921 + 62, 15, 0, -1);
			if (field4465 != null) {
				field4465[1].method10086(140 + field921, 1);
				var1.method8017(Class378.field4444, field921 + 152, 10, 16777215, -1);
				field4465[0].method10086(field921 + 140, 12);
				var1.method8017(Class378.field4394, field921 + 152, 21, 16777215, -1);
			}

			if (field1606 != null) {
				var25 = field921 + 280;
				if (0 == Class64.field472[0] && 0 == Class64.field471[0]) {
					field1606[2].method10086(var25, 4);
				} else {
					field1606[0].method10086(var25, 4);
				}

				if (Class64.field472[0] == 0 && 1 == Class64.field471[0]) {
					field1606[3].method10086(var25 + 15, 4);
				} else {
					field1606[1].method10086(var25 + 15, 4);
				}

				var0.method8017(Class378.field4267, var25 + 32, 17, 16777215, -1);
				var5 = 390 + field921;
				if (Class64.field472[0] == 1 && Class64.field471[0] == 0) {
					field1606[2].method10086(var5, 4);
				} else {
					field1606[0].method10086(var5, 4);
				}

				if (Class64.field472[0] == 1 && Class64.field471[0] == 1) {
					field1606[3].method10086(var5 + 15, 4);
				} else {
					field1606[1].method10086(var5 + 15, 4);
				}

				var0.method8017(Class378.field4433, var5 + 32, 17, 16777215, -1);
				var28 = 500 + field921;
				if (2 == Class64.field472[0] && 0 == Class64.field471[0]) {
					field1606[2].method10086(var28, 4);
				} else {
					field1606[0].method10086(var28, 4);
				}

				if (Class64.field472[0] == 2 && 1 == Class64.field471[0]) {
					field1606[3].method10086(var28 + 15, 4);
				} else {
					field1606[1].method10086(var28 + 15, 4);
				}

				var0.method8017(Class378.field4448, var28 + 32, 17, 16777215, -1);
				var30 = field921 + 610;
				if (3 == Class64.field472[0] && 0 == Class64.field471[0]) {
					field1606[2].method10086(var30, 4);
				} else {
					field1606[0].method10086(var30, 4);
				}

				if (3 == Class64.field472[0] && 1 == Class64.field471[0]) {
					field1606[3].method10086(var30 + 15, 4);
				} else {
					field1606[1].method10086(var30 + 15, 4);
				}

				var0.method8017(Class378.field4222, var30 + 32, 17, 16777215, -1);
			}

			Class561.method10152(708 + field921, 4, 50, 16, 0);
			var1.method7996(Class378.field4208, 25 + field921 + 708, 16, 16777215, -1);
			field949 = -1;
			if (field150 != null) {
				var4 = 88;
				byte var45 = 19;
				var28 = 765 / (var4 + 1) - 1;
				var30 = 480 / (var45 + 1);

				do {
					var33 = var30;
					var29 = var28;
					if ((var28 - 1) * var30 >= Class64.field469) {
						--var28;
					}

					if ((var30 - 1) * var28 >= Class64.field469) {
						--var30;
					}

					if (var28 * (var30 - 1) >= Class64.field469) {
						--var30;
					}
				} while(var33 != var30 || var29 != var28);

				var33 = (765 - var28 * var4) / (var28 + 1);
				if (var33 > 5) {
					var33 = 5;
				}

				var29 = (480 - var30 * var45) / (var30 + 1);
				if (var29 > 5) {
					var29 = 5;
				}

				var36 = (765 - var28 * var4 - (var28 - 1) * var33) / 2;
				var11 = (480 - var30 * var45 - (var30 - 1) * var29) / 2;
				var39 = (Class64.field469 + var30 - 1) / var30;
				field939 = var39 - var28;
				if (field3930 != null && field950 > 0) {
					field3930.method10086(8, Client.field5261 / 2 - field3930.field5395 / 2);
				}

				if (field1804 != null && field950 < field939) {
					field1804.method10086(Client.field182 - field1804.field5392 - 8, Client.field5261 / 2 - field1804.field5395 / 2);
				}

				int var41 = var11 + 23;
				int var14 = var36 + field921;
				int var15 = 0;
				boolean var16 = false;
				int var17 = field950;

				int var18;
				for (var18 = var17 * var30; var18 < Class64.field469 && var17 - field950 < var28; ++var18) {
					Class64 var19 = field4598[var18];
					boolean var20 = true;
					String var21 = Integer.toString(var19.field475);
					if (var19.field475 == -1) {
						var21 = Class378.field4399;
						var20 = false;
					} else if (var19.field475 > 1980) {
						var21 = Class378.field4443;
						var20 = false;
					}

					Class123 var22 = null;
					int var23 = 0;
					if (var19.method1144()) {
						var22 = var19.method1175() ? Class123.field1496 : Class123.field1499;
					} else if (var19.method1139()) {
						var22 = var19.method1175() ? Class123.field1508 : Class123.field1507;
					} else if (var19.method1143()) {
						var23 = 16711680;
						var22 = var19.method1175() ? Class123.field1498 : Class123.field1509;
					} else if (var19.method1189()) {
						var22 = var19.method1175() ? Class123.field1502 : Class123.field1500;
					} else if (var19.method1147()) {
						var22 = var19.method1175() ? Class123.field1504 : Class123.field1495;
					} else if (var19.method1146()) {
						var22 = var19.method1175() ? Class123.field1501 : Class123.field1503;
					} else if (var19.method1187()) {
						var22 = var19.method1175() ? Class123.field1506 : Class123.field1505;
					}

					if (var22 == null || var22.field1493 >= field150.length) {
						var22 = var19.method1175() ? Class123.field1511 : Class123.field1494;
					}

					if (Class33.field229 >= var14 && Class33.field220 >= var41 && Class33.field229 < var14 + var4 && Class33.field220 < var41 + var45 && var20) {
						field949 = var18;
						field150[var22.field1493].method9951(var14, var41, 128, 16777215);
						var16 = true;
					} else {
						field150[var22.field1493].method9929(var14, var41);
					}

					if (field4719 != null) {
						field4719[(var19.method1175() ? 8 : 0) + var19.field482].method10086(var14 + 29, var41);
					}

					var0.method7996(Integer.toString(var19.field473), var14 + 15, 5 + var45 / 2 + var41, var23, -1);
					var1.method7996(var21, var14 + 60, var41 + var45 / 2 + 5, 268435455, -1);
					var41 += var29 + var45;
					++var15;
					if (var15 >= var30) {
						var41 = var11 + 23;
						var14 += var33 + var4;
						var15 = 0;
						++var17;
					}
				}

				if (var16) {
					var18 = var1.method8080(field4598[field949].field477) + 6;
					int var46 = var1.field4730 + 8;
					int var47 = Class33.field220 + 25;
					if (var47 + var46 > 480) {
						var47 = Class33.field220 - 25 - var46;
					}

					Class561.method10152(Class33.field229 - var18 / 2, var47, var18, var46, 16777120);
					Class561.method10156(Class33.field229 - var18 / 2, var47, var18, var46, 0);
					var1.method7996(field4598[field949].field477, Class33.field229, var1.field4730 + var47 + 4, 0, -1);
				}
			}

		} else {
			field2037.method9929(field921, 0);
			field925.method9929(382 + field921, 0);
			field1313.method10086(field921 + 382 - field1313.field5392 / 2, 18);
			if (Client.field555 == 0 || Client.field555 == 5) {
				var4 = 20;
				var0.method7996(Class378.field4389, 180 + field956, 245 - var4, 16777215, -1);
				var5 = 253 - var4;
				Class561.method10156(180 + field956 - 152, var5, 304, 34, 9179409);
				Class561.method10156(field956 + 180 - 151, var5 + 1, 302, 32, 0);
				Class561.method10152(field956 + 180 - 150, var5 + 2, field928 * 3, 30, 9179409);
				Class561.method10152(field956 + 180 - 150 + field928 * 3, var5 + 2, 300 - field928 * 3, 30, 0);
				var0.method7996(field942, 180 + field956, 276 - var4, 16777215, -1);
			}

			String var7;
			String var8;
			short var24;
			short var26;
			if (Client.field555 == 20) {
				field923.method10086(180 + field956 - field923.field5392 / 2, 271 - field923.field5395 / 2);
				var24 = 201;
				var0.method7996(field930, 180 + field956, var24, 16776960, 0);
				var25 = var24 + 15;
				var0.method7996(field935, field956 + 180, var25, 16776960, 0);
				var25 += 15;
				var0.method7996(field951, field956 + 180, var25, 16776960, 0);
				var25 += 15;
				var25 += 7;
				if (4 != field932 && field932 != 10) {
					var0.method8017(Class378.field4382, 180 + field956 - 110, var25, 16777215, 0);
					var26 = 200;
					String var9;
					if (Client.field4851.method2612()) {
						var9 = field955;
						var8 = Class412.method4673('*', var9.length());
						var7 = var8;
					} else {
						var7 = field955;
					}

					for (var7 = var7; var0.method8080(var7) > var26; var7 = var7.substring(0, var7.length() - 1)) {
					}

					var0.method8017(Class436.method7992(var7), 180 + field956 - 70, var25, 16777215, 0);
					var25 += 15;
					var9 = field938;
					var8 = Class412.method4673('*', var9.length());

					String var10;
					for (var10 = var8; var0.method8080(var10) > var26; var10 = var10.substring(1)) {
					}

					var0.method8017(Class378.field4355 + var10, 180 + field956 - 108, var25, 16777215, 0);
					var25 += 15;
				}
			}

			if (10 == Client.field555 || 11 == Client.field555 || Client.field555 == 50) {
				field923.method10086(field956, 171);
				short var6;
				if (field932 == 0) {
					var24 = 251;
					var0.method7996(Class378.field4385, 180 + field956, var24, 16776960, 0);
					var25 = var24 + 30;
					var5 = 180 + field956 - 80;
					var6 = 291;
					field924.method10086(var5 - 73, var6 - 20);
					var0.method8011(Class378.field4386, var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var5 = 180 + field956 + 80;
					field924.method10086(var5 - 73, var6 - 20);
					var0.method8011(Class378.field4387, var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (1 == field932) {
					var0.method7996(field933, field956 + 180, 201, 16776960, 0);
					var24 = 236;
					var0.method7996(field930, 180 + field956, var24, 16777215, 0);
					var25 = var24 + 15;
					var0.method7996(field935, 180 + field956, var25, 16777215, 0);
					var25 += 15;
					var0.method7996(field951, 180 + field956, var25, 16777215, 0);
					var25 += 15;
					var5 = 180 + field956 - 80;
					var6 = 321;
					field924.method10086(var5 - 73, var6 - 20);
					var0.method7996(Class378.field4426, var5, var6 + 5, 16777215, 0);
					var5 = 180 + field956 + 80;
					field924.method10086(var5 - 73, var6 - 20);
					var0.method7996(Class378.field4208, var5, var6 + 5, 16777215, 0);
				} else {
					String var27;
					if (2 == field932) {
						var24 = 201;
						var0.method7996(field930, field36, var24, 16776960, 0);
						var25 = var24 + 15;
						var0.method7996(field935, field36, var25, 16776960, 0);
						var25 += 15;
						var0.method7996(field951, field36, var25, 16776960, 0);
						var25 += 15;
						var25 += 7;
						var0.method8017(Class378.field4382, field36 - 110, var25, 16777215, 0);
						var26 = 200;
						var27 = Client.field4851.method2612() ? Class412.method3140(field955) : field955;

						for (var7 = var27; var0.method8080(var7) > var26; var7 = var7.substring(1)) {
						}

						var0.method8017(Class436.method7992(var7) + (field945 == 0 & Client.field778 % 40 < 20 ? Class113.method8551(16776960) + Class113.field1425 : ""), field36 - 70, var25, 16777215, 0);
						var25 += 15;

						for (var8 = Class412.method3140(field938); var0.method8080(var8) > var26; var8 = var8.substring(1)) {
						}

						var0.method8017(Class378.field4355 + var8 + (1 == field945 & Client.field778 % 40 < 20 ? Class113.method8551(16776960) + Class113.field1425 : ""), field36 - 108, var25, 16777215, 0);
						var25 += 15;
						var24 = 277;
						var29 = -117 + field36;
						Class557 var34 = method3223(Client.field540, field947);
						var34.method10086(var29, var24);
						var29 += var34.field5392 + 5;
						var1.method8017(Class378.field4350, var29, var24 + 13, 16776960, 0);
						var29 = field36 + 24;
						var34 = method3223(Client.field4851.method2612(), field943);
						var34.method10086(var29, var24);
						var29 += var34.field5392 + 5;
						var1.method8017(Class378.field4391, var29, var24 + 13, 16776960, 0);
						var25 = var24 + 15;
						var11 = field36 - 80;
						short var12 = 321;
						field924.method10086(var11 - 73, var12 - 20);
						var0.method7996(Class378.field4225, var11, var12 + 5, 16777215, 0);
						var11 = 80 + field36;
						field924.method10086(var11 - 73, var12 - 20);
						var0.method7996(Class378.field4208, var11, var12 + 5, 16777215, 0);
						var24 = 357;
						switch(field929) {
						case 2:
							field1605 = Class378.field4403;
							break;
						default:
							field1605 = Class378.field4401;
						}

						field3867 = new Class425(field36, var24, var1.method8080(field1605), 11);
						field4664 = new Class425(field36, var24, var1.method8080(Class378.field4402), 11);
						var1.method7996(field1605, field36, var24, 16777215, 0);
					} else if (field932 == 3) {
						var24 = 201;
						var0.method7996(Class378.field4392, 180 + field956, var24, 16776960, 0);
						var25 = var24 + 20;
						var1.method7996(Class378.field4393, field956 + 180, var25, 16776960, 0);
						var25 += 20;
						var1.method7996(Class378.field4286, 180 + field956, var25, 16776960, 0);
						var25 += 15;
						var5 = 180 + field956;
						var6 = 276;
						field924.method10086(var5 - 73, var6 - 20);
						var2.method7996(Class378.field4395, var5, var6 + 5, 16777215, 0);
						var5 = field956 + 180;
						var6 = 326;
						field924.method10086(var5 - 73, var6 - 20);
						var2.method7996(Class378.field4390, var5, var6 + 5, 16777215, 0);
					} else if (field932 == 4) {
						var0.method7996(Class378.field4372, field956 + 180, 201, 16776960, 0);
						var24 = 236;
						var0.method7996(field930, field956 + 180, var24, 16777215, 0);
						var25 = var24 + 15;
						var0.method7996(field935, field956 + 180, var25, 16777215, 0);
						var25 += 15;
						var0.method7996(field951, field956 + 180, var25, 16777215, 0);
						var25 += 15;
						var27 = Class378.field4384;
						var8 = Class89.field3115;
						var7 = Class412.method4673('*', var8.length());
						var0.method8017(var27 + var7 + (Client.field778 % 40 < 20 ? Class113.method8551(16776960) + Class113.field1425 : ""), field956 + 180 - 108, var25, 16777215, 0);
						var25 -= 8;
						var0.method8017(Class378.field4153, 180 + field956 - 9, var25, 16776960, 0);
						var25 += 15;
						var0.method8017(Class378.field4154, field956 + 180 - 9, var25, 16776960, 0);
						var29 = 180 + field956 - 9 + var0.method8080(Class378.field4154) + 15;
						var36 = var25 - var0.field4730;
						Class557 var38;
						if (field944) {
							var38 = field2028;
						} else {
							var38 = field4636;
						}

						var38.method10086(var29, var36);
						var25 += 15;
						var39 = 180 + field956 - 80;
						short var13 = 321;
						field924.method10086(var39 - 73, var13 - 20);
						var0.method7996(Class378.field4426, var39, var13 + 5, 16777215, 0);
						var39 = 80 + field956 + 180;
						field924.method10086(var39 - 73, var13 - 20);
						var0.method7996(Class378.field4208, var39, var13 + 5, 16777215, 0);
						var1.method7996(Class378.field4401, field956 + 180, var13 + 36, 16777215, 0);
					} else if (field932 == 5) {
						var0.method7996(Class378.field4417, field956 + 180, 201, 16776960, 0);
						var24 = 221;
						var2.method7996(field930, 180 + field956, var24, 16776960, 0);
						var25 = var24 + 15;
						var2.method7996(field935, 180 + field956, var25, 16776960, 0);
						var25 += 15;
						var2.method7996(field951, 180 + field956, var25, 16776960, 0);
						var25 += 15;
						var25 += 14;
						var0.method8017(Class378.field4176, 180 + field956 - 145, var25, 16777215, 0);
						var26 = 174;

						for (var27 = method3091(); var0.method8080(var27) > var26; var27 = var27.substring(1)) {
						}

						var0.method8017(Class436.method7992(var27) + (Client.field778 % 40 < 20 ? Class113.method8551(16776960) + Class113.field1425 : ""), 180 + field956 - 34, var25, 16777215, 0);
						var25 += 15;
						var30 = field956 + 180 - 80;
						short var31 = 321;
						field924.method10086(var30 - 73, var31 - 20);
						var0.method7996(Class378.field4253, var30, var31 + 5, 16777215, 0);
						var30 = 180 + field956 + 80;
						field924.method10086(var30 - 73, var31 - 20);
						var0.method7996(Class378.field4400, var30, var31 + 5, 16777215, 0);
						var31 = 356;
						var1.method7996(Class378.field4402, field36, var31, 268435455, 0);
					} else if (6 == field932) {
						var24 = 201;
						var0.method7996(field930, field956 + 180, var24, 16776960, 0);
						var25 = var24 + 15;
						var0.method7996(field935, field956 + 180, var25, 16776960, 0);
						var25 += 15;
						var0.method7996(field951, 180 + field956, var25, 16776960, 0);
						var25 += 15;
						var5 = 180 + field956;
						var6 = 321;
						field924.method10086(var5 - 73, var6 - 20);
						var0.method7996(Class378.field4400, var5, var6 + 5, 16777215, 0);
					} else if (field932 == 7) {
						if (Client.field3974 && !Client.field565) {
							var24 = 201;
							var0.method7996(field930, field36, var24, 16776960, 0);
							var25 = var24 + 15;
							var0.method7996(field935, field36, var25, 16776960, 0);
							var25 += 15;
							var0.method7996(field951, field36, var25, 16776960, 0);
							var5 = field36 - 150;
							var25 += 10;

							for (var28 = 0; var28 < 8; ++var28) {
								field924.method10088(var5, var25, 30, 40);
								boolean var32 = field953 == var28 & Client.field778 % 40 < 20;
								var0.method8017((null == field940[var28] ? "" : field940[var28]) + (var32 ? Class113.method8551(16776960) + Class113.field1425 : ""), var5 + 10, var25 + 27, 16777215, 0);
								if (var28 != 1 && var28 != 3) {
									var5 += 35;
								} else {
									var5 += 50;
									var0.method8017(Class436.method7992("/"), var5 - 13, var25 + 27, 16777215, 0);
								}
							}

							var28 = field36 - 80;
							short var35 = 321;
							field924.method10086(var28 - 73, var35 - 20);
							var0.method7996("Submit", var28, var35 + 5, 16777215, 0);
							var28 = field36 + 80;
							field924.method10086(var28 - 73, var35 - 20);
							var0.method7996(Class378.field4208, var28, var35 + 5, 16777215, 0);
						} else {
							var24 = 216;
							var0.method7996(Class378.field4428, field956 + 180, var24, 16776960, 0);
							var25 = var24 + 15;
							var2.method7996(Class378.field4429, field956 + 180, var25, 16776960, 0);
							var25 += 15;
							var2.method7996(Class378.field4430, field956 + 180, var25, 16776960, 0);
							var25 += 15;
							var5 = field956 + 180 - 80;
							var6 = 321;
							field924.method10086(var5 - 73, var6 - 20);
							var0.method7996(Class378.field4431, var5, var6 + 5, 16777215, 0);
							var5 = 180 + field956 + 80;
							field924.method10086(var5 - 73, var6 - 20);
							var0.method7996(Class378.field4400, var5, var6 + 5, 16777215, 0);
						}
					} else if (8 == field932) {
						var24 = 216;
						var0.method7996(Class378.field4285, field956 + 180, var24, 16776960, 0);
						var25 = var24 + 15;
						var2.method7996(Class378.field4418, field956 + 180, var25, 16776960, 0);
						var25 += 15;
						var2.method7996(Class378.field4287, 180 + field956, var25, 16776960, 0);
						var25 += 15;
						var5 = 180 + field956 - 80;
						var6 = 321;
						field924.method10086(var5 - 73, var6 - 20);
						var0.method7996(Class378.field4142, var5, var6 + 5, 16777215, 0);
						var5 = field956 + 180 + 80;
						field924.method10086(var5 - 73, var6 - 20);
						var0.method7996(Class378.field4400, var5, var6 + 5, 16777215, 0);
					} else if (9 == field932) {
						var24 = 221;
						var0.method7996(field930, 180 + field956, var24, 16776960, 0);
						var25 = var24 + 25;
						var0.method7996(field935, 180 + field956, var25, 16776960, 0);
						var25 += 25;
						var0.method7996(field951, field956 + 180, var25, 16776960, 0);
						var5 = field956 + 180;
						var6 = 311;
						field924.method10086(var5 - 73, var6 - 20);
						var0.method7996(Class378.field4395, var5, var6 + 5, 16777215, 0);
					} else if (10 == field932) {
						var25 = field956 + 180;
						var26 = 209;
						var0.method7996(Class378.field4385, field956 + 180, var26, 16776960, 0);
						var5 = var26 + 20;
						field4747.method10086(var25 - 109, var5);
						if (field941.isEmpty()) {
							field2504.method10086(var25 - 48, var5 + 18);
						} else {
							field2504.method10086(var25 - 48, var5 + 5);
							var0.method7996(field941, var25, var5 + 68 - 15, 16776960, 0);
						}
					} else if (12 == field932) {
						var25 = field36;
						var26 = 216;
						var2.method7996(Class378.field4435, var25, var26, 16777215, 0);
						var5 = var26 + 17;
						var2.method7996(Class378.field4306, var25, var5, 16777215, 0);
						var5 += 17;
						var2.method7996(Class378.field4160, var25, var5, 16777215, 0);
						var5 += 17;
						var2.method7996(Class378.field4438, var25, var5, 16777215, 0);
						var25 = field36 - 80;
						var26 = 311;
						field924.method10086(var25 - 73, var26 - 20);
						var0.method7996(Class378.field4441, var25, var26 + 5, 16777215, 0);
						var25 = field36 + 80;
						field924.method10086(var25 - 73, var26 - 20);
						var0.method7996(Class378.field4442, var25, var26 + 5, 16777215, 0);
					} else if (field932 == 13) {
						var24 = 231;
						var2.method7996(Class378.field4295, field956 + 180, var24, 16777215, 0);
						var25 = var24 + 20;
						var2.method7996(Class378.field4440, 180 + field956, var25, 16777215, 0);
						var5 = 180 + field956;
						var24 = 311;
						field924.method10086(var5 - 73, var24 - 20);
						var0.method7996(Class378.field4400, var5, var24 + 5, 16777215, 0);
					} else if (14 == field932) {
						var24 = 201;
						String var42 = "";
						var27 = "";
						var7 = "";
						switch(field927) {
						case 0:
							var42 = Class378.field4198;
							var27 = Class378.field4199;
							var7 = Class378.field4200;
							break;
						case 1:
							var42 = Class378.field4182;
							var27 = Class378.field4238;
							var7 = Class378.field4439;
							break;
						case 2:
							var42 = Class378.field4273;
							var27 = Class378.field4274;
							var7 = Class378.field4275;
							break;
						default:
							method5865(false);
						}

						var0.method7996(var42, 180 + field956, var24, 16776960, 0);
						var25 = var24 + 20;
						var0.method7996(var27, 180 + field956, var25, 16776960, 0);
						var25 += 20;
						var0.method7996(var7, 180 + field956, var25, 16776960, 0);
						var33 = 180 + field956;
						short var37 = 276;
						field924.method10086(var33 - 73, var37 - 20);
						if (1 == field927) {
							var0.method7996(Class378.field4437, var33, var37 + 5, 16777215, 0);
						} else {
							var0.method7996(Class378.field4181, var33, var37 + 5, 16777215, 0);
						}

						var33 = field956 + 180;
						var37 = 326;
						field924.method10086(var33 - 73, var37 - 20);
						var0.method7996(Class378.field4400, var33, var37 + 5, 16777215, 0);
					} else if (24 == field932) {
						var24 = 221;
						var0.method7996(field930, 180 + field956, var24, 16777215, 0);
						var25 = var24 + 15;
						var0.method7996(field935, field956 + 180, var25, 16777215, 0);
						var25 += 15;
						var0.method7996(field951, 180 + field956, var25, 16777215, 0);
						var25 += 15;
						var5 = field956 + 180;
						var6 = 301;
						field924.method10086(var5 - 73, var6 - 20);
						var0.method7996(Class378.field4334, var5, var6 + 5, 16777215, 0);
					} else if (32 == field932) {
						var24 = 216;
						var0.method7996(Class378.field4428, 180 + field956, var24, 16776960, 0);
						var25 = var24 + 15;
						var2.method7996(Class378.field4429, 180 + field956, var25, 16776960, 0);
						var25 += 15;
						var2.method7996(Class378.field4430, field956 + 180, var25, 16776960, 0);
						var25 += 15;
						var5 = 180 + field956 - 80;
						var6 = 321;
						field924.method10086(var5 - 73, var6 - 20);
						var0.method7996(Class378.field4431, var5, var6 + 5, 16777215, 0);
						var5 = 80 + field956 + 180;
						field924.method10086(var5 - 73, var6 - 20);
						var0.method7996(Class378.field4400, var5, var6 + 5, 16777215, 0);
					} else if (field932 == 33) {
						var24 = 201;
						var0.method7996(field930, field956 + 180, var24, 16776960, 0);
						var25 = var24 + 20;
						var1.method7996(field935, field956 + 180, var25, 16776960, 0);
						var25 += 20;
						var1.method7996(field951, 180 + field956, var25, 16776960, 0);
						var25 += 15;
						var5 = 180 + field956;
						var6 = 276;
						field924.method10086(var5 - 73, var6 - 20);
						var2.method7996(Class378.field4454, var5, var6 + 5, 16777215, 0);
						var5 = 180 + field956;
						var6 = 326;
						field924.method10086(var5 - 73, var6 - 20);
						var2.method7996(Class378.field4400, var5, var6 + 5, 16777215, 0);
					}
				}
			}

			if (Client.field555 >= 10) {
				int[] var48 = new int[4];
				Class561.method10195(var48);
				Class561.method10144(field921, 0, 765 + field921, Client.field5261);
				Client.field2695.method2366(field921 - 22, Client.field778);
				Client.field2695.method2366(22 + field921 + 765 - 128, Client.field778);
				Class561.method10147(var48);
			}

			field4707[Client.field4851.method2614() ? 1 : 0].method10086(field921 + 765 - 40, 463);
			if (Client.field555 > 5 && Client.field2071 == Class402.field4616) {
				if (field2116 != null) {
					var25 = field921 + 5;
					var26 = 463;
					byte var43 = 100;
					byte var40 = 35;
					field2116.method10086(var25, var26);
					var0.method7996(Class378.field4325 + " " + Client.field557, var25 + var43 / 2, var40 / 2 + var26 - 2, 16777215, 0);
					if (field53 != null) {
						var1.method7996(Class378.field4452, var25 + var43 / 2, var40 / 2 + var26 + 12, 16777215, 0);
					} else {
						var1.method7996(Class378.field4453, var43 / 2 + var25, 12 + var40 / 2 + var26, 16777215, 0);
					}
				} else {
					field2116 = Class554.method8860(Client.field1793, "sl_button", "");
				}
			}

		}
	}

	@ObfInfo(owner = "ky", name = "as", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method5778(String var0, String var1, String var2) {
		field930 = var0;
		field935 = var1;
		field951 = var2;
	}

	@ObfInfo(owner = "cv", name = "ad", desc = "(I)V", opaque = "-1772684215")
	public static void method2088() {
		if (Class64.method7411()) {
			field934 = true;
			field950 = 0;
			field939 = 0;
		}

	}

	@ObfInfo(owner = "ie", name = "ai", desc = "(I)V")
	public static void method4065() {
		method4120(24);
		method5778(Class378.field4376, Class378.field4307, Class378.field4407);
	}

	@ObfInfo(owner = "lg", name = "an", desc = "(B)V")
	public static void method5912() {
		method4120(24);
		method5778(Class378.field4379, Class378.field4249, Class378.field4381);
	}

	@ObfInfo(owner = "ii", name = "am", desc = "(II)V")
	public static void method4120(int var0) {
		if (var0 != field932) {
			field932 = var0;
		}
	}

	@ObfInfo(owner = "ew", name = "ar", desc = "(Ljava/lang/String;B)V")
	public static void method3004(String var0) {
		field941 = Class527.method3137(var0);
	}

	@ObfInfo(owner = "ge", name = "ag", desc = "(ILjava/lang/String;I)V")
	public static void method3406(int var0, String var1) {
		field942 = var1;
		field928 = var0;
	}
}
