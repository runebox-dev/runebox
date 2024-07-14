import io.runebox.ObfInfo;

@ObfInfo(name = "db")
public final class Class80 extends Class101 {
	@ObfInfo(owner = "ff", name = "ab", desc = "I", intMultiplier = -408274121)
	public static int field1598;
	@ObfInfo(owner = "mf", name = "ae", desc = "I", intMultiplier = -1132619759)
	public static int field3328;
	@ObfInfo(owner = "vf", name = "ad", desc = "Ljava/lang/String;")
	public static String field5417;
	@ObfInfo(name = "ac", desc = "Llv;")
	public Class308 field986;
	@ObfInfo(name = "ad", desc = "Lne;")
	public Class343 field1001;
	@ObfInfo(name = "bj", desc = "Lsv;")
	public Class490 field988;
	@ObfInfo(name = "ar", desc = "Lsv;")
	public Class490 field996;
	@ObfInfo(name = "bt", desc = "Lsv;")
	public Class490 field997;
	@ObfInfo(name = "aq", desc = "Lvo;")
	public Class561 field991;
	@ObfInfo(name = "bi", desc = "Lde;")
	public Class83 field1002;
	@ObfInfo(name = "as", desc = "Z")
	public boolean field980;
	@ObfInfo(name = "at", desc = "Z")
	public boolean field993;
	@ObfInfo(name = "be", desc = "Z")
	public boolean field999;
	@ObfInfo(name = "bo", desc = "I", intMultiplier = -222891375)
	public int field1000;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -804506783)
	public int field973;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1883916637)
	public int field974;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -227316761)
	public int field975;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -928426009)
	public int field976;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1427353479)
	public int field978;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 493218289)
	public int field979;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = 950609833)
	public int field981;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 661219069)
	public int field982;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1067051769)
	public int field983;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -762257201)
	public int field984;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1969000863)
	public int field985;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 453202295)
	public int field987;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1925049089)
	public int field989;
	@ObfInfo(name = "bm", desc = "I", intMultiplier = -277668463)
	public int field990;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -526627409)
	public int field992;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1321984477)
	public int field994;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 1676236885)
	public int field995;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 1196811517)
	public int field998;
	@ObfInfo(name = "aj", desc = "[Ljava/lang/String;")
	public String[] field977;

	public Class80() {
		this.field975 = -1;
		this.field992 = -1;
		this.field977 = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.field977[var1] = "";
		}

		this.field976 = 0;
		this.field979 = 0;
		this.field974 = 0;
		this.field973 = 0;
		this.field980 = false;
		this.field998 = 0;
		this.field993 = false;
		this.field996 = Class490.field5014;
		this.field997 = Class490.field5014;
		this.field988 = Class490.field5014;
		this.field999 = false;
		this.field1002 = Client.field5093;
	}

	@ObfInfo(name = "al", desc = "(Lvp;I)V", opaque = "572565498")
	public final void method2256(Class562 var1) {
		var1.field5471 = 0;
		byte var3 = var1.method9955();
		boolean var4 = true;
		this.field975 = var1.method9955();
		this.field992 = var1.method9955();
		int var5 = -1;
		this.field998 = 0;
		int[] var6 = new int[12];

		int var8;
		int var9;
		int var10;
		for (int var7 = 0; var7 < 12; ++var7) {
			var8 = var1.method9902();
			if (var8 == 0) {
				var6[var7] = 0;
			} else {
				var9 = var1.method9902();
				var6[var7] = (var8 << 8) + var9;
				if (var7 == 0 && var6[0] == 65535) {
					var5 = var1.method9997();
					break;
				}

				if (var6[var7] >= 512) {
					var10 = Class187.method3421(var6[var7] - 512).field2055;
					if (var10 != 0) {
						this.field998 = var10;
					}
				}
			}
		}

		int[] var15 = new int[12];

		for (var8 = 0; var8 < 12; ++var8) {
			var9 = var1.method9902();
			if (var9 == 0) {
				var15[var8] = 0;
			} else {
				var10 = var1.method9902();
				var15[var8] = (var9 << 8) + var10;
			}
		}

		int[] var16 = new int[5];

		for (var9 = 0; var9 < 5; ++var9) {
			var10 = var1.method9902();
			if (var10 < 0 || var10 >= Client.field1467[var9].length) {
				var10 = 0;
			}

			var16[var9] = var10;
		}

		super.field1234 = var1.method9997();
		if (super.field1234 == 65535) {
			super.field1234 = -1;
		}

		super.field1235 = var1.method9997();
		if (super.field1235 == 65535) {
			super.field1235 = -1;
		}

		super.field1245 = super.field1235;
		super.field1237 = var1.method9997();
		if (super.field1237 == 65535) {
			super.field1237 = -1;
		}

		super.field1238 = var1.method9997();
		if (super.field1238 == 65535) {
			super.field1238 = -1;
		}

		super.field1239 = var1.method9997();
		if (super.field1239 == 65535) {
			super.field1239 = -1;
		}

		super.field1260 = var1.method9997();
		if (super.field1260 == 65535) {
			super.field1260 = -1;
		}

		super.field1241 = var1.method9997();
		if (super.field1241 == 65535) {
			super.field1241 = -1;
		}

		this.field991 = new Class561(var1.method9837(), Client.field1066);
		this.method2241();
		this.method2292();
		this.method2247();
		if (Client.field170 == this) {
			field5417 = this.field991.method9789();
		}

		this.field976 = var1.method9902();
		this.field979 = var1.method9997();
		this.field993 = var1.method9902() == 1;
		if (Client.field527 == 0 && Client.field705 >= 2) {
			this.field993 = false;
		}

		Class182[] var17 = null;
		boolean var18 = false;
		int var11 = var1.method9997();
		var18 = (var11 >> 15 & 1) == 1;
		int var12;
		if (var11 > 0 && var11 != 32768) {
			var17 = new Class182[12];

			for (var12 = 0; var12 < 12; ++var12) {
				int var13 = var11 >> 12 - var12 & 1;
				if (var13 == 1) {
					var17[var12] = Class182.method4430(var6[var12] - 512, var1);
				}
			}
		}

		for (var12 = 0; var12 < 3; ++var12) {
			this.field977[var12] = var1.method9837();
		}

		byte var14 = var1.method9955();
		if (this.field1001 == null) {
			this.field1001 = new Class343();
		}

		this.field1001.method6459(var15, var6, var17, var18, var16, var3, var5, var14);
	}

	@ObfInfo(name = "ay", desc = "(S)Z", opaque = "422")
	public boolean method2240() {
		if (Class490.field5014 == this.field996) {
			this.method2263();
		}

		return Class490.field5015 == this.field996;
	}

	@ObfInfo(name = "ao", desc = "(B)V")
	public void method2241() {
		this.field996 = Class490.field5014;
	}

	@ObfInfo(name = "aa", desc = "(I)V", opaque = "1294917531")
	public void method2263() {
		this.field996 = Client.field1585.method1247(this.field991) ? Class490.field5015 : Class490.field5016;
	}

	@ObfInfo(name = "as", desc = "(I)Z", opaque = "570187206")
	public boolean method2243() {
		if (Class490.field5014 == this.field997) {
			this.method2298();
		}

		return Class490.field5015 == this.field997;
	}

	@ObfInfo(name = "aw", desc = "(I)V")
	public void method2292() {
		this.field997 = Class490.field5014;
	}

	@ObfInfo(name = "at", desc = "(I)V", opaque = "-926792214")
	public void method2298() {
		this.field997 = Client.field883 != null && Client.field883.method8555(this.field991) ? Class490.field5015 : Class490.field5016;
	}

	@ObfInfo(name = "af", desc = "(I)V", opaque = "714579012")
	public void method2293() {
		for (int var2 = 0; var2 < 4; ++var2) {
			if (Client.field771[var2] != null && Client.field771[var2].method3514(this.field991.method9789()) != -1 && var2 != 2) {
				this.field988 = Class490.field5015;
				return;
			}
		}

		this.field988 = Class490.field5016;
	}

	@ObfInfo(name = "am", desc = "(B)V")
	public void method2247() {
		this.field988 = Class490.field5014;
	}

	@ObfInfo(name = "ar", desc = "(I)Z", opaque = "-59444676")
	public boolean method2248() {
		if (Class490.field5014 == this.field988) {
			this.method2293();
		}

		return Class490.field5015 == this.field988;
	}

	@ObfInfo(name = "bt", desc = "(I)I", opaque = "-1413696923")
	public int method2249() {
		return this.field1001 != null && this.field1001.field3721 != -1 ? Class184.method2222(this.field1001.field3721).field1943 : 1;
	}

	@ObfInfo(name = "ah", desc = "(I)Llv;", opaque = "-1073372180")
	public final Class308 method1140() {
		if (this.field1001 == null) {
			return null;
		} else {
			Class217 var2 = super.field1273 != -1 && super.field1276 == 0 ? Class344.method6474(super.field1273) : null;
			Class217 var3 = super.field1236 != -1 && !this.field980 && (super.field1236 != super.field1234 || var2 == null) ? Class344.method6474(super.field1236) : null;
			Class308 var4 = this.field1001.method6434(var2, super.field1274, var3, super.field1270);
			if (var4 == null) {
				return null;
			} else {
				var4.method5865();
				super.field1288 = var4.field2960;
				int var5 = var4.field3162;
				if (!this.field980) {
					var4 = this.method2649(var4);
				}

				if (!this.field980 && this.field986 != null) {
					if (Client.field541 >= this.field973) {
						this.field986 = null;
					}

					if (Client.field541 >= this.field974 && Client.field541 < this.field973) {
						Class308 var6 = this.field986;
						var6.method5881(this.field983 - super.field1266, this.field984 - this.field978, this.field985 - super.field1229);
						if (super.field1295 == 512) {
							var6.method5877();
							var6.method5877();
							var6.method5877();
						} else if (super.field1295 == 1024) {
							var6.method5877();
							var6.method5877();
						} else if (super.field1295 == 1536) {
							var6.method5877();
						}

						Class308[] var7 = new Class308[]{var4, var6};
						var4 = new Class308(var7, 2);
						if (super.field1295 == 512) {
							var6.method5877();
						} else if (super.field1295 == 1024) {
							var6.method5877();
							var6.method5877();
						} else if (super.field1295 == 1536) {
							var6.method5877();
							var6.method5877();
							var6.method5877();
						}

						var6.method5881(super.field1266 - this.field983, this.field978 - this.field984, super.field1229 - this.field985);
					}
				}

				var4.field3219 = true;
				if (super.field1277 != 0 && Client.field541 >= super.field1289 && Client.field541 < super.field1253) {
					var4.field3223 = super.field1261;
					var4.field3177 = super.field1292;
					var4.field3225 = super.field1293;
					var4.field3193 = super.field1277;
					var4.field3227 = (short)var5;
				} else {
					var4.field3193 = 0;
				}

				return var4;
			}
		}
	}

	@ObfInfo(name = "bj", desc = "(Lde;IILjb;B)V", opaque = "2")
	public final void method2272(Class83 var1, int var2, int var3, Class236 var4) {
		if (super.field1273 != -1 && Class344.method6474(super.field1273).field2348 == 1) {
			super.field1273 = -1;
		}

		this.method2658();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.field1242[0] >= 0 && super.field1242[0] < 104 && super.field1284[0] >= 0 && super.field1284[0] < 104) {
				if (Class236.field2501 == var4) {
					Class236 var7 = Class236.field2501;
					int var8 = super.field1242[0];
					int var9 = super.field1284[0];
					int var10 = this.method2249();
					if (var8 >= var10 && var8 < 104 - var10 && var9 >= var10 && var9 < 104 - var10 && var2 >= var10 && var2 < 104 - var10 && var3 >= var10 && var3 < 104 - var10) {
						int var11 = Client.field546.method4986(var8, var9, this.method2249(), Client.method8331(var2, var3), var1.field1015[this.field982], true, Client.field667, Client.field697);
						if (var11 >= 1) {
							for (int var12 = 0; var12 < var11 - 1; ++var12) {
								this.method2253(Client.field667[var12], Client.field697[var12], var7);
							}
						}
					}
				}

				this.method2253(var2, var3, var4);
			} else {
				this.method2252(var2, var3);
			}
		} else {
			this.method2252(var2, var3);
		}

	}

	@ObfInfo(name = "be", desc = "(IIB)V")
	public void method2252(int var1, int var2) {
		super.field1267 = 0;
		super.field1303 = 0;
		super.field1302 = 0;
		super.field1242[0] = var1;
		super.field1284[0] = var2;
		int var4 = this.method2249();
		super.field1266 = super.field1242[0] * 128 + var4 * 64;
		super.field1229 = super.field1284[0] * 128 + var4 * 64;
	}

	@ObfInfo(name = "bm", desc = "(IILjb;B)V", opaque = "10")
	public final void method2253(int var1, int var2, Class236 var3) {
		if (super.field1267 < 9) {
			++super.field1267;
		}

		for (int var5 = super.field1267; var5 > 0; --var5) {
			super.field1242[var5] = super.field1242[var5 - 1];
			super.field1284[var5] = super.field1284[var5 - 1];
			super.field1301[var5] = super.field1301[var5 - 1];
		}

		super.field1242[0] = var1;
		super.field1284[0] = var2;
		super.field1301[0] = var3;
	}

	@ObfInfo(name = "bo", desc = "(I)Z")
	public final boolean method2254() {
		return this.field1001 != null;
	}

	@ObfInfo(name = "ad", desc = "(IIB)I", opaque = "9")
	public static int method2297(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfInfo(name = "aq", desc = "([BB)Ljava/lang/String;", opaque = "64")
	public static String method2299(byte[] var0) {
		int var3 = var0.length;
		StringBuilder var4 = new StringBuilder();

		for (int var5 = 0; var5 < var3 + 0; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(Class391.field4579[var6 >>> 2]);
			if (var5 < var3 - 1) {
				int var7 = var0[var5 + 1] & 255;
				var4.append(Class391.field4579[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var3 - 2) {
					int var8 = var0[var5 + 2] & 255;
					var4.append(Class391.field4579[(var7 & 15) << 2 | var8 >>> 6]).append(Class391.field4579[var8 & 63]);
				} else {
					var4.append(Class391.field4579[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(Class391.field4579[(var6 & 3) << 4]).append("==");
			}
		}

		String var2 = var4.toString();
		return var2;
	}

	@ObfInfo(name = "cg", desc = "(Lue;B)Ljava/lang/Object;")
	public static Object method2296(Class525 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5247) {
			case 0:
				return Class70.field865[--field1598];
			case 1:
				return Class70.field860[--field3328];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}
}
