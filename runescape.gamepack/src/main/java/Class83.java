import io.runebox.ObfInfo;

@ObfInfo(name = "de")
public final class Class83 extends Class86 {
	@ObfInfo(desc = "Ljava/lang/String;")
	public static String field5475;
	@ObfInfo(name = "ae", desc = "Lkb;")
	public Class262 field1031;
	@ObfInfo(name = "al", desc = "Lnt;")
	public Class358 field1029;
	@ObfInfo(name = "ag", desc = "Lsi;")
	public Class477 field1008;
	@ObfInfo(name = "bs", desc = "Lsi;")
	public Class477 field1032;
	@ObfInfo(name = "bf", desc = "Lsi;")
	public Class477 field1033;
	@ObfInfo(name = "ak", desc = "Lvv;")
	public Class567 field1025;
	@ObfInfo(name = "bn", desc = "Ldt;")
	public Class98 field1007;
	@ObfInfo(name = "ai", desc = "Z")
	public boolean field1015;
	@ObfInfo(name = "aw", desc = "Z")
	public boolean field1026;
	@ObfInfo(name = "bo", desc = "Z")
	public boolean field1034;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1181672555)
	public int field1009;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1473193873)
	public int field1010;
	@ObfInfo(name = "as", desc = "I", intMultiplier = 1900830555)
	public int field1013;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1346184075)
	public int field1014;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1240607451)
	public int field1016;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -276492539)
	public int field1017;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -945585951)
	public int field1018;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -59454839)
	public int field1019;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1989491569)
	public int field1020;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -364235779)
	public int field1021;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1883337735)
	public int field1022;
	@ObfInfo(name = "am", desc = "I", intMultiplier = -1273931853)
	public int field1023;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1258225711)
	public int field1024;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1258235987)
	public int field1027;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = 1995509191)
	public int field1028;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = -1451120567)
	public int field1030;
	@ObfInfo(name = "bi", desc = "I", intMultiplier = -393423257)
	public int field1035;
	@ObfInfo(name = "bt", desc = "I", intMultiplier = 1697985689)
	public int field1036;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1205493335)
	public int field1037;
	@ObfInfo(name = "aa", desc = "[Ljava/lang/String;")
	public String[] field1012;

	public Class83() {
		this.field1009 = -1;
		this.field1010 = -1;
		this.field1012 = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.field1012[var1] = "";
		}

		this.field1020 = 0;
		this.field1014 = 0;
		this.field1016 = 0;
		this.field1017 = 0;
		this.field1026 = false;
		this.field1037 = 0;
		this.field1015 = false;
		this.field1008 = Class477.field4944;
		this.field1032 = Class477.field4944;
		this.field1033 = Class477.field4944;
		this.field1034 = false;
		this.field1007 = Client.field3857;
	}

	@ObfInfo(name = "aq", desc = "(Lua;I)V", opaque = "1827607702")
	public final void method2270(Class521 var1) {
		var1.field5219 = 0;
		byte var3 = var1.method9406();
		boolean var4 = true;
		this.field1009 = var1.method9406();
		this.field1010 = var1.method9406();
		int var5 = -1;
		this.field1037 = 0;
		int[] var6 = new int[12];

		int var8;
		int var9;
		int var10;
		for (int var7 = 0; var7 < 12; ++var7) {
			var8 = var1.method9405();
			if (var8 == 0) {
				var6[var7] = 0;
			} else {
				var9 = var1.method9405();
				var6[var7] = var9 + (var8 << 8);
				if (var7 == 0 && 65535 == var6[0]) {
					var5 = var1.method9407();
					break;
				}

				if (var6[var7] >= 512) {
					var10 = Class7.method109(var6[var7] - 512).field2492;
					if (var10 != 0) {
						this.field1037 = var10;
					}
				}
			}
		}

		int[] var28 = new int[12];

		for (var8 = 0; var8 < 12; ++var8) {
			var9 = var1.method9405();
			if (var9 == 0) {
				var28[var8] = 0;
			} else {
				var10 = var1.method9405();
				var28[var8] = (var9 << 8) + var10;
			}
		}

		int[] var29 = new int[5];

		for (var9 = 0; var9 < 5; ++var9) {
			var10 = var1.method9405();
			if (var10 < 0 || var10 >= Client.field4687[var9].length) {
				var10 = 0;
			}

			var29[var9] = var10;
		}

		super.field1061 = var1.method9407();
		if (65535 == super.field1061) {
			super.field1061 = -1;
		}

		super.field1092 = var1.method9407();
		if (65535 == super.field1092) {
			super.field1092 = -1;
		}

		super.field1063 = super.field1092;
		super.field1064 = var1.method9407();
		if (65535 == super.field1064) {
			super.field1064 = -1;
		}

		super.field1073 = var1.method9407();
		if (super.field1073 == 65535) {
			super.field1073 = -1;
		}

		super.field1056 = var1.method9407();
		if (65535 == super.field1056) {
			super.field1056 = -1;
		}

		super.field1067 = var1.method9407();
		if (65535 == super.field1067) {
			super.field1067 = -1;
		}

		super.field1068 = var1.method9407();
		if (super.field1068 == 65535) {
			super.field1068 = -1;
		}

		this.field1025 = new Class567(var1.method9415(), Client.field2627);
		this.method2251();
		this.method2254();
		this.method2257();
		if (Client.field107 == this) {
			field5475 = this.field1025.method10260();
		}

		this.field1020 = var1.method9405();
		this.field1014 = var1.method9407();
		this.field1015 = var1.method9405() == 1;
		if (0 == Client.field532 && Client.field626 >= 2) {
			this.field1015 = false;
		}

		Class183[] var30 = null;
		boolean var31 = false;
		int var11 = var1.method9407();
		var31 = 1 == (var11 >> 15 & 1);
		int var12;
		if (var11 > 0 && var11 != 32768) {
			var30 = new Class183[12];

			for (var12 = 0; var12 < 12; ++var12) {
				int var13 = var11 >> 12 - var12 & 1;
				if (var13 == 1) {
					int var17 = var6[var12] - 512;
					int var18 = var1.method9405();
					boolean var19 = 0 != (var18 & 1);
					boolean var20 = 0 != (var18 & 2);
					Class183 var21 = new Class183(var17);
					int var22;
					int[] var23;
					boolean var24;
					int var25;
					short var26;
					if (var19) {
						var22 = var1.method9405();
						var23 = new int[]{var22 & 15, var22 >> 4 & 15};
						var24 = var21.field1911 != null && var21.field1911.length == var23.length;

						for (var25 = 0; var25 < 2; ++var25) {
							if (var23[var25] != 15) {
								var26 = (short)var1.method9407();
								if (var24) {
									var21.field1911[var23[var25]] = var26;
								}
							}
						}
					}

					if (var20) {
						var22 = var1.method9405();
						var23 = new int[]{var22 & 15, var22 >> 4 & 15};
						var24 = var21.field1909 != null && var21.field1909.length == var23.length;

						for (var25 = 0; var25 < 2; ++var25) {
							if (15 != var23[var25]) {
								var26 = (short)var1.method9407();
								if (var24) {
									var21.field1909[var23[var25]] = var26;
								}
							}
						}
					}

					var30[var12] = var21;
				}
			}
		}

		for (var12 = 0; var12 < 3; ++var12) {
			this.field1012[var12] = var1.method9415();
		}

		byte var27 = var1.method9406();
		if (this.field1029 == null) {
			this.field1029 = new Class358();
		}

		this.field1029.method7076(var28, var6, var30, var31, var29, var3, var5, var27);
	}

	@ObfInfo(name = "ap", desc = "(I)Z", opaque = "-2142454980")
	public boolean method2250() {
		if (Class477.field4944 == this.field1008) {
			this.method2252();
		}

		return this.field1008 == Class477.field4943;
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public void method2251() {
		this.field1008 = Class477.field4944;
	}

	@ObfInfo(name = "ax", desc = "(B)V", opaque = "2")
	public void method2252() {
		this.field1008 = Client.field274.method1888(this.field1025) ? Class477.field4943 : Class477.field4942;
	}

	@ObfInfo(name = "ay", desc = "(B)Z", opaque = "0")
	public boolean method2253() {
		if (Class477.field4944 == this.field1032) {
			this.method2255();
		}

		return this.field1032 == Class477.field4943;
	}

	@ObfInfo(name = "au", desc = "(B)V")
	public void method2254() {
		this.field1032 = Class477.field4944;
	}

	@ObfInfo(name = "as", desc = "(B)V", opaque = "1")
	public void method2255() {
		this.field1032 = Client.field1420 != null && Client.field1420.method8731(this.field1025) ? Class477.field4943 : Class477.field4942;
	}

	@ObfInfo(name = "aw", desc = "(I)V", opaque = "1795902773")
	public void method2256() {
		for (int var2 = 0; var2 < 4; ++var2) {
			if (null != Client.field670[var2] && Client.field670[var2].method3354(this.field1025.method10260()) != -1 && var2 != 2) {
				this.field1033 = Class477.field4943;
				return;
			}
		}

		this.field1033 = Class477.field4942;
	}

	@ObfInfo(name = "ad", desc = "(I)V")
	public void method2257() {
		this.field1033 = Class477.field4944;
	}

	@ObfInfo(name = "ai", desc = "(I)Z")
	public boolean method2293() {
		if (Class477.field4944 == this.field1033) {
			this.method2256();
		}

		return this.field1033 == Class477.field4943;
	}

	@ObfInfo(name = "an", desc = "(B)I")
	public int method2258() {
		return this.field1029 != null && -1 != this.field1029.field3954 ? Class225.method3256(this.field1029.field3954).field2320 : 1;
	}

	@ObfInfo(name = "ah", desc = "(I)Lkb;", opaque = "102285859")
	public final Class262 method1092() {
		if (this.field1029 == null) {
			return null;
		} else {
			Class211 var2 = super.field1074 != -1 && 0 == super.field1103 ? Class237.method4637(super.field1074) : null;
			Class211 var3 = super.field1096 != -1 && !this.field1026 && (super.field1096 != super.field1061 || var2 == null) ? Class237.method4637(super.field1096) : null;
			Class262 var4 = this.field1029.method7086(var2, super.field1101, var3, super.field1122);
			if (var4 == null) {
				return null;
			} else {
				var4.method5173();
				super.field1130 = var4.field2696;
				int var5 = var4.field2853;
				if (!this.field1026) {
					var4 = this.method2338(var4);
				}

				if (!this.field1026 && this.field1031 != null) {
					if (Client.field778 >= this.field1017) {
						this.field1031 = null;
					}

					if (Client.field778 >= this.field1016 && Client.field778 < this.field1017) {
						Class262 var6 = this.field1031;
						var6.method5189(this.field1018 - super.field1065, this.field1019 - this.field1021, this.field1027 - super.field1126);
						if (512 == super.field1133) {
							var6.method5243();
							var6.method5243();
							var6.method5243();
						} else if (1024 == super.field1133) {
							var6.method5243();
							var6.method5243();
						} else if (1536 == super.field1133) {
							var6.method5243();
						}

						Class262[] var7 = new Class262[]{var4, var6};
						var4 = new Class262(var7, 2);
						if (512 == super.field1133) {
							var6.method5243();
						} else if (1024 == super.field1133) {
							var6.method5243();
							var6.method5243();
						} else if (1536 == super.field1133) {
							var6.method5243();
							var6.method5243();
							var6.method5243();
						}

						var6.method5189(super.field1065 - this.field1018, this.field1021 - this.field1019, super.field1126 - this.field1027);
					}
				}

				var4.field2873 = true;
				if (super.field1121 != 0 && Client.field778 >= super.field1116 && Client.field778 < super.field1117) {
					var4.field2842 = super.field1118;
					var4.field2915 = super.field1119;
					var4.field2916 = super.field1120;
					var4.field2917 = super.field1121;
					var4.field2867 = (short)var5;
				} else {
					var4.field2917 = 0;
				}

				return var4;
			}
		}
	}

	@ObfInfo(name = "am", desc = "(Ldt;IILjv;B)V", opaque = "4")
	public final void method2261(Class98 var1, int var2, int var3, Class256 var4) {
		if (-1 != super.field1074 && Class237.method4637(super.field1074).field2141 == 1) {
			super.field1074 = -1;
		}

		this.method2334();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.field1080[0] >= 0 && super.field1080[0] < 104 && super.field1127[0] >= 0 && super.field1127[0] < 104) {
				if (Class256.field2704 == var4) {
					Client.method3225(var1, this, var2, var3, Class256.field2704);
				}

				this.method2263(var2, var3, var4);
			} else {
				this.method2249(var2, var3);
			}
		} else {
			this.method2249(var2, var3);
		}

	}

	@ObfInfo(name = "ar", desc = "(III)V")
	public void method2249(int var1, int var2) {
		super.field1125 = 0;
		super.field1077 = 0;
		super.field1129 = 0;
		super.field1080[0] = var1;
		super.field1127[0] = var2;
		int var4 = this.method2258();
		super.field1065 = var4 * 64 + super.field1080[0] * 128;
		super.field1126 = super.field1127[0] * 128 + var4 * 64;
	}

	@ObfInfo(name = "ag", desc = "(IILjv;I)V", opaque = "1482629100")
	public final void method2263(int var1, int var2, Class256 var3) {
		if (super.field1125 < 9) {
			++super.field1125;
		}

		for (int var5 = super.field1125; var5 > 0; --var5) {
			super.field1080[var5] = super.field1080[var5 - 1];
			super.field1127[var5] = super.field1127[var5 - 1];
			super.field1128[var5] = super.field1128[var5 - 1];
		}

		super.field1080[0] = var1;
		super.field1127[0] = var2;
		super.field1128[0] = var3;
	}

	@ObfInfo(name = "bs", desc = "(I)Z", opaque = "1426949207")
	public final boolean method2264() {
		return this.field1029 != null;
	}

	@ObfInfo(name = "bq", desc = "([BIB)I")
	public static int method2298(byte[] var0, int var1) {
		int var4 = -1;

		for (int var5 = 0; var5 < var1; ++var5) {
			var4 = var4 >>> 8 ^ Class521.field5220[(var4 ^ var0[var5]) & 255];
		}

		var4 = ~var4;
		return var4;
	}

	@ObfInfo(name = "aj", desc = "(CB)C", opaque = "1")
	public static char method2297(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfInfo(name = "bv", desc = "(Lnb;IB)V", opaque = "1")
	public static void method2274(Class340 var0, int var1) {
		Class232 var3 = Class7.method109(var1);
		var0.field3764.field3950[var3.field2468] = var1 + 512;
		if (-1 != var3.field2465) {
			var0.field3764.field3950[var3.field2465] = 0;
		}

		if (var3.field2466 != -1) {
			var0.field3764.field3950[var3.field2466] = 0;
		}

		var0.field3764.method7055();
	}
}
