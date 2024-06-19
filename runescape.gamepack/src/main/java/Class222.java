public class Class222 extends Class507 {
	public static Class236[] field2243;
	public static Class299 field2239;
	public static Class299 field2241;
	public static Class299 field2242;
	public static Class299 field2276;
	public static boolean field2288;
	public Class515 field2289;
	public boolean field2240;
	public boolean field2255;
	public boolean field2259;
	public boolean field2265;
	public boolean field2267;
	public boolean field2268;
	public boolean field2275;
	public boolean field2277;
	public boolean field2279;
	public int field2244;
	public int field2245;
	public int field2251;
	public int field2252;
	public int field2253;
	public int field2254;
	public int field2256;
	public int field2257;
	public int field2258;
	public int field2260;
	public int field2261;
	public int field2262;
	public int field2263;
	public int field2266;
	public int field2270;
	public int field2271;
	public int field2272;
	public int field2273;
	public int field2274;
	public int field2280;
	public int field2281;
	public int field2282;
	public int field2283;
	public int field2284;
	public int field2285;
	public int field2287;
	public int[] field2246;
	public int[] field2269;
	public int[] field2278;
	public int[] field2286;
	public String field2247;
	public String[] field2264;
	public short[] field2237;
	public short[] field2248;
	public short[] field2249;
	public short[] field2250;

	static {
		field2288 = false;
		field2239 = new Class299(4096);
		field2276 = new Class299(500);
		field2241 = new Class299(30);
		field2242 = new Class299(30);
		field2243 = new Class236[4];
	}

	public Class222() {
		this.field2247 = Class378.field4152;
		this.field2252 = 1;
		this.field2253 = 1;
		this.field2282 = 2;
		this.field2255 = true;
		this.field2254 = -1;
		this.field2257 = -1;
		this.field2259 = false;
		this.field2240 = false;
		this.field2260 = -1;
		this.field2261 = 16;
		this.field2262 = 0;
		this.field2263 = 0;
		this.field2264 = new String[5];
		this.field2272 = -1;
		this.field2266 = -1;
		this.field2267 = false;
		this.field2268 = true;
		this.field2251 = 128;
		this.field2270 = 128;
		this.field2274 = 128;
		this.field2256 = 0;
		this.field2258 = 0;
		this.field2271 = 0;
		this.field2275 = false;
		this.field2279 = false;
		this.field2287 = -1;
		this.field2285 = -1;
		this.field2280 = -1;
		this.field2245 = -1;
		this.field2273 = 0;
		this.field2283 = 0;
		this.field2284 = 0;
		this.field2281 = 0;
		this.field2265 = true;
		this.field2277 = false;
	}

	public void method4172() {
		if (-1 == this.field2254) {
			this.field2254 = 0;
			if (this.field2269 != null && (this.field2246 == null || 10 == this.field2246[0])) {
				this.field2254 = 1;
			}

			for (int var2 = 0; var2 < 5; ++var2) {
				if (null != this.field2264[var2]) {
					this.field2254 = 1;
				}
			}
		}

		if (-1 == this.field2287) {
			this.field2287 = this.field2282 != 0 ? 1 : 0;
		}

	}

	public void method4173(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method4174(var1, var3);
		}
	}

	public void method4174(Class521 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method9405();
			if (var4 > 0) {
				if (this.field2269 != null && !field2288) {
					var1.field5219 += var4 * 3;
				} else {
					this.field2246 = new int[var4];
					this.field2269 = new int[var4];

					for (var5 = 0; var5 < var4; ++var5) {
						this.field2269[var5] = var1.method9407();
						this.field2246[var5] = var1.method9405();
					}
				}
			}
		} else if (var2 == 2) {
			this.field2247 = var1.method9415();
		} else if (var2 == 5) {
			var4 = var1.method9405();
			if (var4 > 0) {
				if (this.field2269 != null && !field2288) {
					var1.field5219 += var4 * 2;
				} else {
					this.field2246 = null;
					this.field2269 = new int[var4];

					for (var5 = 0; var5 < var4; ++var5) {
						this.field2269[var5] = var1.method9407();
					}
				}
			}
		} else if (var2 == 14) {
			this.field2252 = var1.method9405();
		} else if (var2 == 15) {
			this.field2253 = var1.method9405();
		} else if (var2 == 17) {
			this.field2282 = 0;
			this.field2255 = false;
		} else if (var2 == 18) {
			this.field2255 = false;
		} else if (var2 == 19) {
			this.field2254 = var1.method9405();
		} else if (var2 == 21) {
			this.field2257 = 0;
		} else if (var2 == 22) {
			this.field2259 = true;
		} else if (var2 == 23) {
			this.field2240 = true;
		} else if (var2 == 24) {
			this.field2260 = var1.method9407();
			if (65535 == this.field2260) {
				this.field2260 = -1;
			}
		} else if (var2 == 27) {
			this.field2282 = 1;
		} else if (var2 == 28) {
			this.field2261 = var1.method9405();
		} else if (var2 == 29) {
			this.field2262 = var1.method9406();
		} else if (var2 == 39) {
			this.field2263 = var1.method9406() * 25;
		} else if (var2 >= 30 && var2 < 35) {
			this.field2264[var2 - 30] = var1.method9415();
			if (this.field2264[var2 - 30].equalsIgnoreCase(Class378.field4147)) {
				this.field2264[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.method9405();
			this.field2248 = new short[var4];
			this.field2249 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2248[var5] = (short)var1.method9407();
				this.field2249[var5] = (short)var1.method9407();
			}
		} else if (var2 == 41) {
			var4 = var1.method9405();
			this.field2250 = new short[var4];
			this.field2237 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2250[var5] = (short)var1.method9407();
				this.field2237[var5] = (short)var1.method9407();
			}
		} else if (var2 == 61) {
			var1.method9407();
		} else if (var2 == 62) {
			this.field2267 = true;
		} else if (var2 == 64) {
			this.field2268 = false;
		} else if (var2 == 65) {
			this.field2251 = var1.method9407();
		} else if (var2 == 66) {
			this.field2270 = var1.method9407();
		} else if (var2 == 67) {
			this.field2274 = var1.method9407();
		} else if (var2 == 68) {
			this.field2266 = var1.method9407();
		} else if (var2 == 69) {
			var1.method9405();
		} else if (var2 == 70) {
			this.field2256 = var1.method9535();
		} else if (var2 == 71) {
			this.field2258 = var1.method9535();
		} else if (var2 == 72) {
			this.field2271 = var1.method9535();
		} else if (var2 == 73) {
			this.field2275 = true;
		} else if (var2 == 74) {
			this.field2279 = true;
		} else if (var2 == 75) {
			this.field2287 = var1.method9405();
		} else if (var2 != 77 && var2 != 92) {
			if (var2 == 78) {
				this.field2245 = var1.method9407();
				this.field2273 = var1.method9405();
				this.field2283 = var1.method9405();
			} else if (var2 == 79) {
				this.field2284 = var1.method9407();
				this.field2281 = var1.method9407();
				this.field2273 = var1.method9405();
				this.field2283 = var1.method9405();
				var4 = var1.method9405();
				this.field2286 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2286[var5] = var1.method9407();
				}
			} else if (var2 == 81) {
				var1.method9405();
			} else if (var2 == 82) {
				this.field2272 = var1.method9407();
			} else if (var2 == 89) {
				this.field2265 = false;
			} else if (var2 == 90) {
				this.field2277 = true;
			} else if (var2 == 249) {
				this.field2289 = Class95.method2487(var1, this.field2289);
			}
		} else {
			this.field2285 = var1.method9407();
			if (this.field2285 == 65535) {
				this.field2285 = -1;
			}

			this.field2280 = var1.method9407();
			if (65535 == this.field2280) {
				this.field2280 = -1;
			}

			var4 = -1;
			if (var2 == 92) {
				var4 = var1.method9407();
				if (var4 == 65535) {
					var4 = -1;
				}
			}

			var5 = var1.method9405();
			this.field2278 = new int[var5 + 2];

			for (int var6 = 0; var6 <= var5; ++var6) {
				this.field2278[var6] = var1.method9407();
				if (this.field2278[var6] == 65535) {
					this.field2278[var6] = -1;
				}
			}

			this.field2278[var5 + 1] = var4;
		}

	}

	public final boolean method4175(int var1) {
		if (this.field2246 != null) {
			for (int var5 = 0; var5 < this.field2246.length; ++var5) {
				if (var1 == this.field2246[var5]) {
					return Class30.field28.method7232(this.field2269[var5] & 65535, 0);
				}
			}

			return true;
		} else if (this.field2269 == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var3 = true;

			for (int var4 = 0; var4 < this.field2269.length; ++var4) {
				var3 &= Class30.field28.method7232(this.field2269[var4] & 65535, 0);
			}

			return var3;
		}
	}

	public final boolean method4176() {
		if (this.field2269 == null) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field2269.length; ++var3) {
				var2 &= Class30.field28.method7232(this.field2269[var3] & 65535, 0);
			}

			return var2;
		}
	}

	public final Class255 method4177(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (this.field2246 == null) {
			var8 = (long)(var2 + (this.field2244 << 10));
		} else {
			var8 = (long)((var1 << 3) + (this.field2244 << 10) + var2);
		}

		Object var10 = (Class255)field2241.method5993(var8);
		if (var10 == null) {
			Class236 var11 = this.method4214(var1, var2);
			if (var11 == null) {
				return null;
			}

			if (!this.field2259) {
				var10 = var11.method4572(64 + this.field2262, 768 + this.field2263, -50, -10, -50);
			} else {
				var11.field2556 = (short)(64 + this.field2262);
				var11.field2552 = (short)(this.field2263 + 768);
				var11.method4563();
				var10 = var11;
			}

			field2241.method5987((Class507)var10, var8);
		}

		if (this.field2259) {
			var10 = ((Class236)var10).method4565();
		}

		if (this.field2257 >= 0) {
			if (var10 instanceof Class262) {
				var10 = ((Class262)var10).method5238(var3, var4, var5, var6, true, this.field2257);
			} else if (var10 instanceof Class236) {
				var10 = ((Class236)var10).method4566(var3, var4, var5, var6, true, this.field2257);
			}
		}

		return (Class255)var10;
	}

	public final Class262 method4194(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (this.field2246 == null) {
			var8 = (long)((this.field2244 << 10) + var2);
		} else {
			var8 = (long)(var2 + (var1 << 3) + (this.field2244 << 10));
		}

		Class262 var10 = (Class262)field2242.method5993(var8);
		if (var10 == null) {
			Class236 var11 = this.method4214(var1, var2);
			if (var11 == null) {
				return null;
			}

			var10 = var11.method4572(this.field2262 + 64, 768 + this.field2263, -50, -10, -50);
			field2242.method5987(var10, var8);
		}

		if (this.field2257 >= 0) {
			var10 = var10.method5238(var3, var4, var5, var6, true, this.field2257);
		}

		return var10;
	}

	public final Class262 method4205(int var1, int var2, int[][] var3, int var4, int var5, int var6, Class211 var7, int var8) {
		long var10;
		if (this.field2246 == null) {
			var10 = (long)((this.field2244 << 10) + var2);
		} else {
			var10 = (long)((var1 << 3) + (this.field2244 << 10) + var2);
		}

		Class262 var12 = (Class262)field2242.method5993(var10);
		if (var12 == null) {
			Class236 var13 = this.method4214(var1, var2);
			if (var13 == null) {
				return null;
			}

			var12 = var13.method4572(this.field2262 + 64, 768 + this.field2263, -50, -10, -50);
			field2242.method5987(var12, var10);
		}

		if (var7 == null && -1 == this.field2257) {
			return var12;
		} else {
			if (var7 != null) {
				var12 = var7.method4000(var12, var8, var2);
			} else {
				var12 = var12.method5214(true);
			}

			if (this.field2257 >= 0) {
				var12 = var12.method5238(var3, var4, var5, var6, false, this.field2257);
			}

			return var12;
		}
	}

	public final Class236 method4214(int var1, int var2) {
		Class236 var4 = null;
		boolean var5;
		int var6;
		int var8;
		if (this.field2246 == null) {
			if (var1 != 10) {
				return null;
			}

			if (this.field2269 == null) {
				return null;
			}

			var5 = this.field2267;
			if (var1 == 2 && var2 > 3) {
				var5 = !var5;
			}

			var6 = this.field2269.length;

			for (int var7 = 0; var7 < var6; ++var7) {
				var8 = this.field2269[var7];
				if (var5) {
					var8 += 65536;
				}

				var4 = (Class236)field2276.method5993((long)var8);
				if (var4 == null) {
					var4 = Class236.method4594(Class30.field28, var8 & 65535, 0);
					if (var4 == null) {
						return null;
					}

					if (var5) {
						var4.method4575();
					}

					field2276.method5987(var4, (long)var8);
				}

				if (var6 > 1) {
					field2243[var7] = var4;
				}
			}

			if (var6 > 1) {
				var4 = new Class236(field2243, var6);
			}
		} else {
			int var9 = -1;

			for (var6 = 0; var6 < this.field2246.length; ++var6) {
				if (var1 == this.field2246[var6]) {
					var9 = var6;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var6 = this.field2269[var9];
			boolean var10 = this.field2267 ^ var2 > 3;
			if (var10) {
				var6 += 65536;
			}

			var4 = (Class236)field2276.method5993((long)var6);
			if (var4 == null) {
				var4 = Class236.method4594(Class30.field28, var6 & 65535, 0);
				if (var4 == null) {
					return null;
				}

				if (var10) {
					var4.method4575();
				}

				field2276.method5987(var4, (long)var6);
			}
		}

		if (this.field2251 == 128 && this.field2270 == 128 && 128 == this.field2274) {
			var5 = false;
		} else {
			var5 = true;
		}

		boolean var11;
		if (this.field2256 == 0 && 0 == this.field2258 && 0 == this.field2271) {
			var11 = false;
		} else {
			var11 = true;
		}

		Class236 var12 = new Class236(var4, var2 == 0 && !var5 && !var11, this.field2248 == null, this.field2250 == null, true);
		if (var1 == 4 && var2 > 3) {
			var12.method4597(256);
			var12.method4558(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var12.method4582();
		} else if (var2 == 2) {
			var12.method4569();
		} else if (var2 == 3) {
			var12.method4570();
		}

		if (this.field2248 != null) {
			for (var8 = 0; var8 < this.field2248.length; ++var8) {
				var12.method4573(this.field2248[var8], this.field2249[var8]);
			}
		}

		if (this.field2250 != null) {
			for (var8 = 0; var8 < this.field2250.length; ++var8) {
				var12.method4600(this.field2250[var8], this.field2237[var8]);
			}
		}

		if (var5) {
			var12.method4576(this.field2251, this.field2270, this.field2274);
		}

		if (var11) {
			var12.method4558(this.field2256, this.field2258, this.field2271);
		}

		return var12;
	}

	public final Class222 method4181() {
		int var2 = -1;
		if (this.field2285 != -1) {
			var2 = Class351.method6175(this.field2285);
		} else if (this.field2280 != -1) {
			var2 = Class351.field3889[this.field2280];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field2278.length - 1) {
			var3 = this.field2278[var2];
		} else {
			var3 = this.field2278[this.field2278.length - 1];
		}

		return var3 != -1 ? method4161(var3) : null;
	}

	public int method4182(int var1, int var2) {
		Class515 var5 = this.field2289;
		int var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			Class516 var6 = (Class516)var5.method9326((long)var1);
			if (var6 == null) {
				var4 = var2;
			} else {
				var4 = var6.field5199;
			}
		}

		return var4;
	}

	public String method4195(int var1, String var2) {
		return Class188.method2595(this.field2289, var1, var2);
	}

	public boolean method4210() {
		if (this.field2278 == null) {
			return -1 != this.field2245 || this.field2286 != null;
		} else {
			for (int var2 = 0; var2 < this.field2278.length; ++var2) {
				if (-1 != this.field2278[var2]) {
					Class222 var3 = method4161(this.field2278[var2]);
					if (-1 != var3.field2245 || var3.field2286 != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public static Class222 method4161(int var0) {
		Class222 var2 = (Class222)field2239.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class30.field2238.method7216(6, var0);
			var2 = new Class222();
			var2.field2244 = var0;
			if (var3 != null) {
				var2.method4173(new Class521(var3));
			}

			var2.method4172();
			if (var2.field2279) {
				var2.field2282 = 0;
				var2.field2255 = false;
			}

			field2239.method5987(var2, (long)var0);
			return var2;
		}
	}
}
