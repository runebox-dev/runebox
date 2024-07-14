import io.runebox.ObfInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfInfo(name = "ii")
public class Class217 extends Class516 {
	@ObfInfo(name = "ab", desc = "Lmo;")
	public static Class327 field2357;
	@ObfInfo(name = "ai", desc = "Lmo;")
	public static Class327 field2358;
	@ObfInfo(name = "av", desc = "Lmo;")
	public static Class327 field2367;
	@ObfInfo(owner = "gb", name = "an", desc = "Lok;")
	public static Class375 field1752;
	@ObfInfo(owner = "jx", name = "aj", desc = "Lok;")
	public static Class375 field2682;
	@ObfInfo(name = "aq", desc = "Z")
	public static boolean field2364;
	@ObfInfo(owner = "ft", name = "aj", desc = "I", intMultiplier = -1471749567)
	public static int field1686;
	@ObfInfo(owner = "ft", name = "av", desc = "Ljava/util/concurrent/ThreadPoolExecutor;")
	public static ThreadPoolExecutor field1692;
	@ObfInfo(name = "ay", desc = "[Lhg;")
	public Class189[] field2360;
	@ObfInfo(name = "aw", desc = "Z")
	public boolean field2362;
	@ObfInfo(name = "bt", desc = "Z")
	public boolean field2369;
	@ObfInfo(name = "as", desc = "[Z")
	public boolean[] field2361;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = -1041319035)
	public int field2345;
	@ObfInfo(name = "be", desc = "I", intMultiplier = 65422091)
	public int field2348;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -116545325)
	public int field2351;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 996333495)
	public int field2353;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1347016563)
	public int field2354;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -922081079)
	public int field2359;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 2074913605)
	public int field2363;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 1527780161)
	public int field2365;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1645317391)
	public int field2366;
	@ObfInfo(name = "bj", desc = "I", intMultiplier = -524750121)
	public int field2368;
	@ObfInfo(name = "bm", desc = "I", intMultiplier = -543932181)
	public int field2370;
	@ObfInfo(name = "al", desc = "[I")
	public int[] field2349;
	@ObfInfo(name = "aa", desc = "[I")
	public int[] field2350;
	@ObfInfo(name = "ax", desc = "[I")
	public int[] field2355;
	@ObfInfo(name = "ac", desc = "[I")
	public int[] field2356;
	@ObfInfo(name = "au", desc = "Ljava/util/Map;")
	public Map field2352;

	static {
		field2364 = false;
		field2367 = new Class327(64);
		field2357 = new Class327(100);
		field2358 = new Class327(100);
	}

	public Class217() {
		this.field2351 = -1;
		this.field2353 = 0;
		this.field2354 = 0;
		this.field2359 = -1;
		this.field2362 = false;
		this.field2363 = 5;
		this.field2366 = -1;
		this.field2365 = -1;
		this.field2345 = 99;
		this.field2369 = false;
		this.field2368 = -1;
		this.field2348 = -1;
		this.field2370 = 2;
	}

	@ObfInfo(name = "ag", desc = "(Lvp;I)V", opaque = "-329091846")
	public void method4145(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method4181(var1, var3);
		}
	}

	@ObfInfo(name = "ak", desc = "(Lvp;II)V", opaque = "222435762")
	public void method4181(Class562 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method9997();
			this.field2349 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2349[var5] = var1.method9997();
			}

			this.field2355 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2355[var5] = var1.method9997();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2355[var5] += var1.method9997() << 16;
			}
		} else if (var2 == 2) {
			this.field2359 = var1.method9997();
		} else if (var2 == 3) {
			var4 = var1.method9902();
			this.field2350 = new int[var4 + 1];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2350[var5] = var1.method9902();
			}

			this.field2350[var4] = 9999999;
		} else if (var2 == 4) {
			this.field2362 = true;
		} else if (var2 == 5) {
			this.field2363 = var1.method9902();
		} else if (var2 == 6) {
			this.field2366 = var1.method9997();
		} else if (var2 == 7) {
			this.field2365 = var1.method9997();
		} else if (var2 == 8) {
			this.field2345 = var1.method9902();
			this.field2369 = true;
		} else if (var2 == 9) {
			this.field2368 = var1.method9902();
		} else if (var2 == 10) {
			this.field2348 = var1.method9902();
		} else if (var2 == 11) {
			this.field2370 = var1.method9902();
		} else if (var2 == 12) {
			var4 = var1.method9902();
			this.field2356 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2356[var5] = var1.method9997();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2356[var5] += var1.method9997() << 16;
			}
		} else {
			boolean var9;
			boolean var10;
			boolean var11;
			int var15;
			int var17;
			int var18;
			if (var2 == 13) {
				var4 = var1.method9902();
				this.field2360 = new Class189[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					Class189[] var6;
					Class189 var8;
					label145: {
						var6 = this.field2360;
						if (var1 != null) {
							var9 = false;
							var10 = false;
							var11 = false;
							boolean var12 = false;
							var15 = var1.method9997();
							var17 = var1.method9902();
							var18 = var1.method9902();
							int var19 = var1.method9902();
							if (var15 >= 1 && var17 >= 1 && var18 >= 0 && var19 >= 0) {
								var8 = new Class189(var15, var17, var18, var19);
								break label145;
							}
						}

						var8 = null;
					}

					var6[var5] = var8;
				}
			} else if (var2 == 14) {
				this.field2351 = var1.method9832();
			} else if (var2 == 15) {
				var4 = var1.method9997();
				this.field2352 = new HashMap();

				for (var5 = 0; var5 < var4; ++var5) {
					Class189 var7;
					int var13;
					label158: {
						var13 = var1.method9997();
						if (var1 != null) {
							boolean var14 = false;
							var9 = false;
							var10 = false;
							var11 = false;
							int var16 = var1.method9997();
							var15 = var1.method9902();
							var17 = var1.method9902();
							var18 = var1.method9902();
							if (var16 >= 1 && var15 >= 1 && var17 >= 0 && var18 >= 0) {
								var7 = new Class189(var16, var15, var17, var18);
								break label158;
							}
						}

						var7 = null;
					}

					this.field2352.put(var13, var7);
				}
			} else if (var2 == 16) {
				this.field2353 = var1.method9997();
				this.field2354 = var1.method9997();
			} else if (var2 == 17) {
				this.field2361 = new boolean[256];

				for (var4 = 0; var4 < this.field2361.length; ++var4) {
					this.field2361[var4] = false;
				}

				var4 = var1.method9902();

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2361[var1.method9902()] = true;
				}
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(I)V", opaque = "966933537")
	public void method4162() {
		if (this.field2368 == -1) {
			if (this.field2350 == null && this.field2361 == null) {
				this.field2368 = 0;
			} else {
				this.field2368 = 2;
			}
		}

		if (this.field2348 == -1) {
			if (this.field2350 == null && this.field2361 == null) {
				this.field2348 = 0;
			} else {
				this.field2348 = 2;
			}
		}

	}

	@ObfInfo(name = "an", desc = "(Llv;II)Llv;", opaque = "-1857948661")
	public Class308 method4135(Class308 var1, int var2) {
		if (!this.method4132()) {
			var2 = this.field2355[var2];
			Class292 var8 = method581(var2 >> 16);
			var2 &= 65535;
			if (var8 == null) {
				return var1.method5933(true);
			} else {
				Class308 var9 = var1.method5933(!var8.method5734(var2));
				var9.method5869(var8, var2);
				return var9;
			}
		} else {
			int var5 = this.field2351;
			Class150 var7 = method3191(var5);
			int var6;
			if (var7 == null) {
				var6 = 2;
			} else {
				var6 = var7.method3242() ? 0 : 1;
			}

			Class150 var4;
			if (var6 != 0) {
				var4 = null;
			} else {
				var4 = method3191(var5);
			}

			if (var4 == null) {
				return var1.method5933(true);
			} else {
				Class308 var10 = var1.method5933(!var4.method3217());
				var10.method5922(var4, var2);
				return var10;
			}
		}
	}

	@ObfInfo(name = "aj", desc = "(Llv;III)Llv;", opaque = "-247829249")
	public Class308 method4136(Class308 var1, int var2, int var3) {
		if (!this.method4132()) {
			var2 = this.field2355[var2];
			Class292 var9 = method581(var2 >> 16);
			var2 &= 65535;
			if (var9 == null) {
				return var1.method5933(true);
			} else {
				Class308 var10 = var1.method5933(!var9.method5734(var2));
				var3 &= 3;
				if (var3 == 1) {
					var10.method5879();
				} else if (var3 == 2) {
					var10.method5872();
				} else if (var3 == 3) {
					var10.method5877();
				}

				var10.method5869(var9, var2);
				if (var3 == 1) {
					var10.method5877();
				} else if (var3 == 2) {
					var10.method5872();
				} else if (var3 == 3) {
					var10.method5879();
				}

				return var10;
			}
		} else {
			int var6 = this.field2351;
			Class150 var8 = method3191(var6);
			int var7;
			if (var8 == null) {
				var7 = 2;
			} else {
				var7 = var8.method3242() ? 0 : 1;
			}

			Class150 var5;
			if (var7 != 0) {
				var5 = null;
			} else {
				var5 = method3191(var6);
			}

			if (var5 == null) {
				return var1.method5933(true);
			} else {
				Class308 var11 = var1.method5933(!var5.method3217());
				var3 &= 3;
				if (var3 == 1) {
					var11.method5879();
				} else if (var3 == 2) {
					var11.method5872();
				} else if (var3 == 3) {
					var11.method5877();
				}

				var11.method5922(var5, var2);
				if (var3 == 1) {
					var11.method5877();
				} else if (var3 == 2) {
					var11.method5872();
				} else if (var3 == 3) {
					var11.method5879();
				}

				return var11;
			}
		}
	}

	@ObfInfo(name = "av", desc = "(Llv;II)Llv;", opaque = "1281742568")
	public Class308 method4170(Class308 var1, int var2) {
		if (!this.method4132()) {
			var2 = this.field2355[var2];
			Class292 var8 = method581(var2 >> 16);
			var2 &= 65535;
			if (var8 == null) {
				return var1.method5916(true);
			} else {
				Class308 var9 = var1.method5916(!var8.method5734(var2));
				var9.method5869(var8, var2);
				return var9;
			}
		} else {
			int var5 = this.field2351;
			Class150 var7 = method3191(var5);
			int var6;
			if (var7 == null) {
				var6 = 2;
			} else {
				var6 = var7.method3242() ? 0 : 1;
			}

			Class150 var4;
			if (var6 != 0) {
				var4 = null;
			} else {
				var4 = method3191(var5);
			}

			if (var4 == null) {
				return var1.method5916(true);
			} else {
				Class308 var10 = var1.method5916(!var4.method3217());
				var10.method5922(var4, var2);
				return var10;
			}
		}
	}

	@ObfInfo(name = "ab", desc = "(Llv;ILii;II)Llv;", opaque = "-2041267323")
	public Class308 method4138(Class308 var1, int var2, Class217 var3, int var4) {
		if (field2364 && !this.method4132() && !var3.method4132()) {
			return this.method4143(var1, var2, var3, var4);
		} else {
			Class308 var6 = var1.method5933(false);
			boolean var7 = false;
			Class292 var8 = null;
			Class275 var9 = null;
			Class150 var10;
			if (this.method4132()) {
				var10 = this.method4142();
				if (var10 == null) {
					return var6;
				}

				if (var3.method4132() && this.field2361 == null) {
					var6.method5922(var10, var2);
					return var6;
				}

				var9 = var10.field1688;
				var6.method5960(var9, var10, var2, this.field2361, false, !var3.method4132());
			} else {
				var2 = this.field2355[var2];
				var8 = method581(var2 >> 16);
				var2 &= 65535;
				if (var8 == null) {
					return var3.method4135(var1, var4);
				}

				if (!var3.method4132() && (this.field2350 == null || var4 == -1)) {
					var6.method5869(var8, var2);
					return var6;
				}

				if (this.field2350 == null || var4 == -1) {
					var6.method5869(var8, var2);
					return var6;
				}

				var7 = var3.method4132();
				if (!var7) {
					var6.method5875(var8, var2, this.field2350, false);
				}
			}

			if (var3.method4132()) {
				var10 = var3.method4142();
				if (var10 == null) {
					return var6;
				}

				if (var9 == null) {
					var9 = var10.field1688;
				}

				var6.method5960(var9, var10, var4, this.field2361, true, true);
			} else {
				var4 = var3.field2355[var4];
				Class292 var11 = method581(var4 >> 16);
				var4 &= 65535;
				if (var11 == null) {
					return this.method4135(var1, var2);
				}

				var6.method5875(var11, var4, this.field2350, true);
			}

			if (var7 && var8 != null) {
				var6.method5875(var8, var2, this.field2350, false);
			}

			var6.method5868();
			return var6;
		}
	}

	@ObfInfo(name = "ai", desc = "(Llv;ILii;II)Llv;", opaque = "-787208312")
	public Class308 method4143(Class308 var1, int var2, Class217 var3, int var4) {
		var2 = this.field2355[var2];
		Class292 var6 = method581(var2 >> 16);
		var2 &= 65535;
		if (var6 == null) {
			return var3.method4135(var1, var4);
		} else {
			var4 = var3.field2355[var4];
			Class292 var7 = method581(var4 >> 16);
			var4 &= 65535;
			Class308 var8;
			if (var7 == null) {
				var8 = var1.method5933(!var6.method5734(var2));
				var8.method5869(var6, var2);
				return var8;
			} else {
				var8 = var1.method5933(!var6.method5734(var2) & !var7.method5734(var4));
				var8.method5885(var6, var2, var7, var4, this.field2350);
				return var8;
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(Llv;II)Llv;", opaque = "1137761895")
	public Class308 method4158(Class308 var1, int var2) {
		if (!this.method4132()) {
			int var4 = this.field2355[var2];
			Class292 var5 = method581(var4 >> 16);
			var4 &= 65535;
			if (var5 == null) {
				return var1.method5933(true);
			} else {
				Class292 var6 = null;
				int var7 = 0;
				if (this.field2356 != null && var2 < this.field2356.length) {
					var7 = this.field2356[var2];
					var6 = method581(var7 >> 16);
					var7 &= 65535;
				}

				Class308 var8;
				if (var6 != null && var7 != 65535) {
					var8 = var1.method5933(!var5.method5734(var4) & !var6.method5734(var7));
					var8.method5869(var5, var4);
					var8.method5869(var6, var7);
					return var8;
				} else {
					var8 = var1.method5933(!var5.method5734(var4));
					var8.method5869(var5, var4);
					return var8;
				}
			}
		} else {
			return this.method4135(var1, var2);
		}
	}

	@ObfInfo(name = "au", desc = "(I)Z")
	public boolean method4132() {
		return this.field2351 >= 0;
	}

	@ObfInfo(name = "ah", desc = "(B)I")
	public int method4141() {
		return this.field2354 - this.field2353;
	}

	@ObfInfo(name = "ac", desc = "(I)Lft;", opaque = "-255882027")
	public Class150 method4142() {
		if (this.method4132()) {
			int var3 = this.field2351;
			Class150 var5 = method3191(var3);
			int var4;
			if (var5 == null) {
				var4 = 2;
			} else {
				var4 = var5.method3242() ? 0 : 1;
			}

			Class150 var2;
			if (var4 != 0) {
				var2 = null;
			} else {
				var2 = method3191(var3);
			}

			return var2;
		} else {
			return null;
		}
	}

	@ObfInfo(owner = "dm", name = "aq", desc = "(Lok;Lok;Lok;I)V")
	public static void method2431(Class375 var0, Class375 var1, Class375 var2) {
		Class344.field5008 = var0;
		field1752 = var1;
		field2682 = var2;
	}

	@ObfInfo(owner = "bp", name = "az", desc = "(II)Llf;", opaque = "811238244")
	public static Class292 method581(int var0) {
		Class292 var2 = (Class292)field2357.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			var2 = Class292.method2221(field1752, field2682, var0, false);
			if (var2 != null) {
				field2357.method6330(var2, (long)var0);
			}

			return var2;
		}
	}

	@ObfInfo(owner = "mi", name = "ax", desc = "(II)I", opaque = "-1268230275")
	public static int method6286(int var0) {
		Class150 var2 = method3191(var0);
		if (var2 == null) {
			return 2;
		} else {
			return var2.method3242() ? 0 : 1;
		}
	}

	@ObfInfo(owner = "fp", name = "al", desc = "(II)Lft;", opaque = "-1152520617")
	public static Class150 method3191(int var0) {
		Class150 var2 = (Class150)field2358.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			Class375 var4 = field1752;
			Class375 var5 = field2682;
			boolean var6 = true;
			byte[] var7 = var4.method7140(var0 >> 16 & 65535, var0 & 65535);
			Class150 var3;
			if (var7 == null) {
				var6 = false;
				var3 = null;
			} else {
				int var8 = (var7[1] & 255) << 8 | var7[2] & 255;
				byte[] var9 = var5.method7140(var8, 0);
				if (var9 == null) {
					var6 = false;
				}

				if (!var6) {
					var3 = null;
				} else {
					if (field1692 == null) {
						field1686 = Runtime.getRuntime().availableProcessors();
						field1692 = new ThreadPoolExecutor(0, field1686, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(field1686 * 100 + 100), new Class171());
					}

					try {
						var3 = new Class150(var4, var5, var0, false);
					} catch (Exception var11) {
						var3 = null;
					}
				}
			}

			if (var3 != null) {
				field2358.method6330(var3, (long)var0);
			}

			return var3;
		}
	}
}
