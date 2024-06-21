import io.runebox.ObfInfo;
import java.util.HashMap;
import java.util.Map;

public class Class211 extends Class507 {
	@ObfInfo(name = "ab", desc = "Llm;")
	public static Class299 field2129;
	@ObfInfo(name = "ao", desc = "Llm;")
	public static Class299 field2132;
	@ObfInfo(name = "ac", desc = "Llm;")
	public static Class299 field2148;
	@ObfInfo(name = "ak", desc = "Z")
	public static boolean field2130;
	@ObfInfo(name = "au", desc = "[Lik;")
	public Class219[] field2140;
	@ObfInfo(name = "ai", desc = "Z")
	public boolean field2144;
	@ObfInfo(name = "bs", desc = "Z")
	public boolean field2149;
	@ObfInfo(name = "ad", desc = "[Z")
	public boolean[] field2137;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1995770705)
	public int field2128;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -1594529517)
	public int field2133;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -460558267)
	public int field2136;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 946625509)
	public int field2138;
	@ObfInfo(name = "bo", desc = "I", intMultiplier = 1462179751)
	public int field2141;
	@ObfInfo(name = "as", desc = "I", intMultiplier = -351911437)
	public int field2143;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1203416379)
	public int field2145;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 612362347)
	public int field2146;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = 440495917)
	public int field2147;
	@ObfInfo(name = "bf", desc = "I", intMultiplier = 709224351)
	public int field2150;
	@ObfInfo(name = "bi", desc = "I", intMultiplier = -1104871125)
	public int field2152;
	@ObfInfo(name = "ax", desc = "[I")
	public int[] field2126;
	@ObfInfo(name = "ay", desc = "[I")
	public int[] field2139;
	@ObfInfo(name = "ae", desc = "[I")
	public int[] field2142;
	@ObfInfo(name = "aw", desc = "[I")
	public int[] field2151;
	@ObfInfo(name = "av", desc = "Ljava/util/Map;")
	public Map field2134;

	static {
		field2130 = false;
		field2129 = new Class299(64);
		field2148 = new Class299(100);
		field2132 = new Class299(100);
	}

	public Class211() {
		this.field2133 = -1;
		this.field2138 = 0;
		this.field2136 = 0;
		this.field2143 = -1;
		this.field2144 = false;
		this.field2128 = 5;
		this.field2146 = -1;
		this.field2147 = -1;
		this.field2145 = 99;
		this.field2149 = false;
		this.field2150 = -1;
		this.field2141 = -1;
		this.field2152 = 2;
	}

	@ObfInfo(name = "al", desc = "(Lua;B)V", opaque = "5")
	public void method3997(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method4006(var1, var3);
		}
	}

	@ObfInfo(name = "aj", desc = "(Lua;IS)V", opaque = "352")
	public void method4006(Class521 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method9407();
			this.field2139 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2139[var5] = var1.method9407();
			}

			this.field2142 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2142[var5] = var1.method9407();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2142[var5] += var1.method9407() << 16;
			}
		} else if (var2 == 2) {
			this.field2143 = var1.method9407();
		} else if (var2 == 3) {
			var4 = var1.method9405();
			this.field2151 = new int[var4 + 1];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2151[var5] = var1.method9405();
			}

			this.field2151[var4] = 9999999;
		} else if (var2 == 4) {
			this.field2144 = true;
		} else if (var2 == 5) {
			this.field2128 = var1.method9405();
		} else if (var2 == 6) {
			this.field2146 = var1.method9407();
		} else if (var2 == 7) {
			this.field2147 = var1.method9407();
		} else if (var2 == 8) {
			this.field2145 = var1.method9405();
			this.field2149 = true;
		} else if (var2 == 9) {
			this.field2150 = var1.method9405();
		} else if (var2 == 10) {
			this.field2141 = var1.method9405();
		} else if (var2 == 11) {
			this.field2152 = var1.method9405();
		} else if (var2 == 12) {
			var4 = var1.method9405();
			this.field2126 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2126[var5] = var1.method9407();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2126[var5] += var1.method9407() << 16;
			}
		} else if (var2 == 13) {
			var4 = var1.method9405();
			this.field2140 = new Class219[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2140[var5] = method1191(var1);
			}
		} else if (var2 == 14) {
			this.field2133 = var1.method9410();
		} else if (var2 == 15) {
			var4 = var1.method9407();
			this.field2134 = new HashMap();

			for (var5 = 0; var5 < var4; ++var5) {
				int var6 = var1.method9407();
				Class219 var7 = method1191(var1);
				this.field2134.put(var6, var7);
			}
		} else if (var2 == 16) {
			this.field2138 = var1.method9407();
			this.field2136 = var1.method9407();
		} else if (var2 == 17) {
			this.field2137 = new boolean[256];

			for (var4 = 0; var4 < this.field2137.length; ++var4) {
				this.field2137[var4] = false;
			}

			var4 = var1.method9405();

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2137[var1.method9405()] = true;
			}
		}

	}

	@ObfInfo(name = "az", desc = "(I)V", opaque = "-1726184148")
	public void method3998() {
		if (-1 == this.field2150) {
			if (this.field2151 == null && this.field2137 == null) {
				this.field2150 = 0;
			} else {
				this.field2150 = 2;
			}
		}

		if (this.field2141 == -1) {
			if (this.field2151 == null && this.field2137 == null) {
				this.field2141 = 0;
			} else {
				this.field2141 = 2;
			}
		}

	}

	@ObfInfo(name = "af", desc = "(Lkb;II)Lkb;", opaque = "919536438")
	public Class262 method3999(Class262 var1, int var2) {
		Class262 var5;
		if (!this.method4038()) {
			var2 = this.field2142[var2];
			Class246 var6 = method4922(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.method5214(true);
			} else {
				var5 = var1.method5214(!var6.method4757(var2));
				var5.method5177(var6, var2);
				return var5;
			}
		} else {
			Class145 var4 = method2867(this.field2133);
			if (var4 == null) {
				return var1.method5214(true);
			} else {
				var5 = var1.method5214(!var4.method3192());
				var5.method5178(var4, var2);
				return var5;
			}
		}
	}

	@ObfInfo(name = "aa", desc = "(Lkb;III)Lkb;", opaque = "-253461195")
	public Class262 method4000(Class262 var1, int var2, int var3) {
		Class262 var6;
		if (!this.method4038()) {
			var2 = this.field2142[var2];
			Class246 var7 = method4922(var2 >> 16);
			var2 &= 65535;
			if (var7 == null) {
				return var1.method5214(true);
			} else {
				var6 = var1.method5214(!var7.method4757(var2));
				var3 &= 3;
				if (var3 == 1) {
					var6.method5222();
				} else if (var3 == 2) {
					var6.method5181();
				} else if (var3 == 3) {
					var6.method5243();
				}

				var6.method5177(var7, var2);
				if (var3 == 1) {
					var6.method5243();
				} else if (var3 == 2) {
					var6.method5181();
				} else if (var3 == 3) {
					var6.method5222();
				}

				return var6;
			}
		} else {
			Class145 var5 = method2867(this.field2133);
			if (var5 == null) {
				return var1.method5214(true);
			} else {
				var6 = var1.method5214(!var5.method3192());
				var3 &= 3;
				if (var3 == 1) {
					var6.method5222();
				} else if (var3 == 2) {
					var6.method5181();
				} else if (var3 == 3) {
					var6.method5243();
				}

				var6.method5178(var5, var2);
				if (var3 == 1) {
					var6.method5243();
				} else if (var3 == 2) {
					var6.method5181();
				} else if (var3 == 3) {
					var6.method5222();
				}

				return var6;
			}
		}
	}

	@ObfInfo(name = "at", desc = "(Lkb;IB)Lkb;", opaque = "4")
	public Class262 method4001(Class262 var1, int var2) {
		Class262 var5;
		if (!this.method4038()) {
			var2 = this.field2142[var2];
			Class246 var6 = method4922(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.method5170(true);
			} else {
				var5 = var1.method5170(!var6.method4757(var2));
				var5.method5177(var6, var2);
				return var5;
			}
		} else {
			Class145 var4 = method2867(this.field2133);
			if (var4 == null) {
				return var1.method5170(true);
			} else {
				var5 = var1.method5170(!var4.method3192());
				var5.method5178(var4, var2);
				return var5;
			}
		}
	}

	@ObfInfo(name = "ab", desc = "(Lkb;ILic;IB)Lkb;", opaque = "1")
	public Class262 method4002(Class262 var1, int var2, Class211 var3, int var4) {
		if (field2130 && !this.method4038() && !var3.method4038()) {
			return this.method4042(var1, var2, var3, var4);
		} else {
			Class262 var6 = var1.method5214(false);
			boolean var7 = false;
			Class246 var8 = null;
			Class248 var9 = null;
			Class145 var10;
			if (this.method4038()) {
				var10 = this.method4007();
				if (var10 == null) {
					return var6;
				}

				if (var3.method4038() && this.field2137 == null) {
					var6.method5178(var10, var2);
					return var6;
				}

				var9 = var10.field1654;
				var6.method5268(var9, var10, var2, this.field2137, false, !var3.method4038());
			} else {
				var2 = this.field2142[var2];
				var8 = method4922(var2 >> 16);
				var2 &= 65535;
				if (var8 == null) {
					return var3.method3999(var1, var4);
				}

				if (!var3.method4038() && (this.field2151 == null || var4 == -1)) {
					var6.method5177(var8, var2);
					return var6;
				}

				if (this.field2151 == null || var4 == -1) {
					var6.method5177(var8, var2);
					return var6;
				}

				var7 = var3.method4038();
				if (!var7) {
					var6.method5183(var8, var2, this.field2151, false);
				}
			}

			if (var3.method4038()) {
				var10 = var3.method4007();
				if (var10 == null) {
					return var6;
				}

				if (var9 == null) {
					var9 = var10.field1654;
				}

				var6.method5268(var9, var10, var4, this.field2137, true, true);
			} else {
				var4 = var3.field2142[var4];
				Class246 var11 = method4922(var4 >> 16);
				var4 &= 65535;
				if (var11 == null) {
					return this.method3999(var1, var2);
				}

				var6.method5183(var11, var4, this.field2151, true);
			}

			if (var7 && var8 != null) {
				var6.method5183(var8, var2, this.field2151, false);
			}

			var6.method5176();
			return var6;
		}
	}

	@ObfInfo(name = "ac", desc = "(Lkb;ILic;II)Lkb;", opaque = "-1276132275")
	public Class262 method4042(Class262 var1, int var2, Class211 var3, int var4) {
		var2 = this.field2142[var2];
		Class246 var6 = method4922(var2 >> 16);
		var2 &= 65535;
		if (var6 == null) {
			return var3.method3999(var1, var4);
		} else {
			var4 = var3.field2142[var4];
			Class246 var7 = method4922(var4 >> 16);
			var4 &= 65535;
			Class262 var8;
			if (var7 == null) {
				var8 = var1.method5214(!var6.method4757(var2));
				var8.method5177(var6, var2);
				return var8;
			} else {
				var8 = var1.method5214(!var6.method4757(var2) & !var7.method4757(var4));
				var8.method5182(var6, var2, var7, var4, this.field2151);
				return var8;
			}
		}
	}

	@ObfInfo(name = "ao", desc = "(Lkb;II)Lkb;", opaque = "-2113245634")
	public Class262 method4004(Class262 var1, int var2) {
		if (!this.method4038()) {
			int var4 = this.field2142[var2];
			Class246 var5 = method4922(var4 >> 16);
			var4 &= 65535;
			if (var5 == null) {
				return var1.method5214(true);
			} else {
				Class246 var6 = null;
				int var7 = 0;
				if (this.field2126 != null && var2 < this.field2126.length) {
					var7 = this.field2126[var2];
					var6 = method4922(var7 >> 16);
					var7 &= 65535;
				}

				Class262 var8;
				if (var6 != null && var7 != 65535) {
					var8 = var1.method5214(!var5.method4757(var4) & !var6.method4757(var7));
					var8.method5177(var5, var4);
					var8.method5177(var6, var7);
					return var8;
				} else {
					var8 = var1.method5214(!var5.method4757(var4));
					var8.method5177(var5, var4);
					return var8;
				}
			}
		} else {
			return this.method3999(var1, var2);
		}
	}

	@ObfInfo(name = "ah", desc = "(B)Z", opaque = "2")
	public boolean method4038() {
		return this.field2133 >= 0;
	}

	@ObfInfo(name = "av", desc = "(B)I")
	public int method4005() {
		return this.field2136 - this.field2138;
	}

	@ObfInfo(name = "ap", desc = "(B)Lfo;", opaque = "0")
	public Class145 method4007() {
		return this.method4038() ? method2867(this.field2133) : null;
	}

	@ObfInfo(owner = "jc", name = "ak", desc = "(IS)Lic;", opaque = "127")
	public static Class211 method4637(int var0) {
		Class211 var2 = (Class211)field2129.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field2127.method7216(12, var0);
			var2 = new Class211();
			if (var3 != null) {
				var2.method3997(new Class521(var3));
			}

			var2.method3998();
			field2129.method5987(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(name = "aa", desc = "([[[IIIII)V", opaque = "-1193239731")
	public static void method4052(int[][][] var0, int var1, int var2, int var3) {
		int var5;
		for (var5 = 0; var5 < 8; ++var5) {
			for (int var6 = 0; var6 < 8; ++var6) {
				var0[var1][var5 + var2][var6 + var3] = 0;
			}
		}

		if (var2 > 0) {
			for (var5 = 1; var5 < 8; ++var5) {
				var0[var1][var2][var5 + var3] = var0[var1][var2 - 1][var5 + var3];
			}
		}

		if (var3 > 0) {
			for (var5 = 1; var5 < 8; ++var5) {
				var0[var1][var5 + var2][var3] = var0[var1][var5 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && 0 != var0[var1][var2][var3 - 1]) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && 0 != var0[var1][var2 - 1][var3 - 1]) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}

	@ObfInfo(owner = "jx", name = "aq", desc = "(II)Ljl;", opaque = "-15533869")
	public static Class246 method4922(int var0) {
		Class246 var2 = (Class246)field2148.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			Class382 var4 = Client.field2123;
			Class382 var5 = Client.field2131;
			boolean var6 = true;
			int[] var7 = var4.method7226(var0);

			for (int var8 = 0; var8 < var7.length; ++var8) {
				byte[] var9 = var4.method7224(var0, var7[var8]);
				if (var9 == null) {
					var6 = false;
				} else {
					int var10 = (var9[0] & 255) << 8 | var9[1] & 255;
					byte[] var11 = var5.method7224(var10, 0);
					if (var11 == null) {
						var6 = false;
					}
				}
			}

			Class246 var3;
			if (!var6) {
				var3 = null;
			} else {
				try {
					var3 = new Class246(var4, var5, var0, false);
				} catch (Exception var12) {
					var3 = null;
				}
			}

			if (var3 != null) {
				field2148.method5987(var3, (long)var0);
			}

			return var3;
		}
	}

	@ObfInfo(owner = "eg", name = "ae", desc = "(II)Lfo;", opaque = "786316708")
	public static Class145 method2867(int var0) {
		Class145 var3 = method2478(var0);
		int var2;
		if (var3 == null) {
			var2 = 2;
		} else {
			var2 = var3.method3190() ? 0 : 1;
		}

		return var2 != 0 ? null : method2478(var0);
	}

	@ObfInfo(owner = "dp", name = "ax", desc = "(II)Lfo;", opaque = "1510290443")
	public static Class145 method2478(int var0) {
		Class145 var2 = (Class145)field2132.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			var2 = Class145.method6486(Client.field2123, Client.field2131, var0, false);
			if (var2 != null) {
				field2132.method5987(var2, (long)var0);
			}

			return var2;
		}
	}

	@ObfInfo(owner = "cl", name = "ay", desc = "(Lua;B)Lik;", opaque = "-4")
	public static Class219 method1191(Class521 var0) {
		if (var0 != null) {
			boolean var2 = false;
			boolean var3 = false;
			boolean var4 = false;
			boolean var5 = false;
			int var6 = var0.method9407();
			int var7 = var0.method9405();
			int var8 = var0.method9405();
			int var9 = var0.method9405();
			if (var6 >= 1 && var7 >= 1 && var8 >= 0 && var9 >= 0) {
				return new Class219(var6, var7, var8, var9);
			}
		}

		return null;
	}

	@ObfInfo(owner = "jx", name = "au", desc = "(I)V")
	public static void method4923() {
		field2129.method5995();
		field2148.method5995();
		field2132.method5995();
	}
}
