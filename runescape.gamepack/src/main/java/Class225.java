public class Class225 extends Class507 {
	public static Class299 field2316;
	public static Class299 field2317;
	public Class515 field2360;
	public boolean field2343;
	public boolean field2344;
	public boolean field2349;
	public boolean field2354;
	public boolean field2355;
	public boolean field2356;
	public int field2314;
	public int field2318;
	public int field2319;
	public int field2320;
	public int field2321;
	public int field2323;
	public int field2324;
	public int field2325;
	public int field2326;
	public int field2327;
	public int field2328;
	public int field2329;
	public int field2330;
	public int field2331;
	public int field2332;
	public int field2333;
	public int field2334;
	public int field2335;
	public int field2336;
	public int field2338;
	public int field2340;
	public int field2347;
	public int field2348;
	public int field2352;
	public int field2361;
	public int[] field2322;
	public int[] field2351;
	public int[] field2357;
	public int[] field2358;
	public String field2337;
	public String[] field2342;
	public short[] field2339;
	public short[] field2345;
	public short[] field2346;
	public short[] field2350;
	public short[] field2359;

	static {
		field2316 = new Class299(64);
		field2317 = new Class299(50);
	}

	public Class225() {
		this.field2337 = Class378.field4152;
		this.field2320 = 1;
		this.field2323 = -1;
		this.field2321 = -1;
		this.field2314 = -1;
		this.field2326 = -1;
		this.field2347 = -1;
		this.field2328 = -1;
		this.field2329 = -1;
		this.field2330 = -1;
		this.field2331 = -1;
		this.field2361 = -1;
		this.field2333 = -1;
		this.field2334 = -1;
		this.field2335 = -1;
		this.field2336 = -1;
		this.field2324 = -1;
		this.field2342 = new String[5];
		this.field2343 = true;
		this.field2319 = -1;
		this.field2325 = 128;
		this.field2327 = 128;
		this.field2349 = false;
		this.field2348 = 0;
		this.field2340 = 0;
		this.field2332 = 32;
		this.field2352 = -1;
		this.field2338 = -1;
		this.field2354 = true;
		this.field2355 = true;
		this.field2356 = false;
		this.field2344 = false;
		this.field2358 = null;
		this.field2359 = null;
	}

	public void method4243() {
	}

	public void method4244(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method4245(var1, var3);
		}
	}

	public void method4245(Class521 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method9405();
			this.field2357 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2357[var5] = var1.method9407();
			}
		} else if (var2 == 2) {
			this.field2337 = var1.method9415();
		} else if (var2 == 12) {
			this.field2320 = var1.method9405();
		} else if (var2 == 13) {
			this.field2323 = var1.method9407();
		} else if (var2 == 14) {
			this.field2326 = var1.method9407();
		} else if (var2 == 15) {
			this.field2321 = var1.method9407();
		} else if (var2 == 16) {
			this.field2314 = var1.method9407();
		} else if (var2 == 17) {
			this.field2326 = var1.method9407();
			this.field2347 = var1.method9407();
			this.field2328 = var1.method9407();
			this.field2329 = var1.method9407();
		} else if (var2 == 18) {
			var1.method9407();
		} else if (var2 >= 30 && var2 < 35) {
			this.field2342[var2 - 30] = var1.method9415();
			if (this.field2342[var2 - 30].equalsIgnoreCase(Class378.field4147)) {
				this.field2342[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.method9405();
			this.field2345 = new short[var4];
			this.field2339 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2345[var5] = (short)var1.method9407();
				this.field2339[var5] = (short)var1.method9407();
			}
		} else if (var2 == 41) {
			var4 = var1.method9405();
			this.field2346 = new short[var4];
			this.field2350 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2346[var5] = (short)var1.method9407();
				this.field2350[var5] = (short)var1.method9407();
			}
		} else if (var2 == 60) {
			var4 = var1.method9405();
			this.field2322 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2322[var5] = var1.method9407();
			}
		} else if (var2 == 93) {
			this.field2343 = false;
		} else if (var2 == 95) {
			this.field2319 = var1.method9407();
		} else if (var2 == 97) {
			this.field2325 = var1.method9407();
		} else if (var2 == 98) {
			this.field2327 = var1.method9407();
		} else if (var2 == 99) {
			this.field2349 = true;
		} else if (var2 == 100) {
			this.field2348 = var1.method9406();
		} else if (var2 == 101) {
			this.field2340 = var1.method9406() * 5;
		} else {
			int var6;
			if (var2 == 102) {
				var4 = var1.method9405();
				var5 = 0;

				for (var6 = var4; var6 != 0; var6 >>= 1) {
					++var5;
				}

				this.field2358 = new int[var5];
				this.field2359 = new short[var5];

				for (int var7 = 0; var7 < var5; ++var7) {
					if (0 == (var4 & 1 << var7)) {
						this.field2358[var7] = -1;
						this.field2359[var7] = -1;
					} else {
						this.field2358[var7] = var1.method9423();
						this.field2359[var7] = (short)var1.method9420();
					}
				}
			} else if (var2 == 103) {
				this.field2332 = var1.method9407();
			} else if (var2 != 106 && var2 != 118) {
				if (var2 == 107) {
					this.field2354 = false;
				} else if (var2 == 109) {
					this.field2355 = false;
				} else if (var2 == 114) {
					this.field2330 = var1.method9407();
				} else if (var2 == 115) {
					this.field2330 = var1.method9407();
					this.field2331 = var1.method9407();
					this.field2361 = var1.method9407();
					this.field2333 = var1.method9407();
				} else if (var2 == 116) {
					this.field2334 = var1.method9407();
				} else if (var2 == 117) {
					this.field2334 = var1.method9407();
					this.field2335 = var1.method9407();
					this.field2336 = var1.method9407();
					this.field2324 = var1.method9407();
				} else if (var2 == 122) {
					this.field2356 = true;
				} else if (var2 == 123) {
					this.field2344 = true;
				} else if (var2 == 249) {
					this.field2360 = Class95.method2487(var1, this.field2360);
				}
			} else {
				this.field2352 = var1.method9407();
				if (this.field2352 == 65535) {
					this.field2352 = -1;
				}

				this.field2338 = var1.method9407();
				if (65535 == this.field2338) {
					this.field2338 = -1;
				}

				var4 = -1;
				if (var2 == 118) {
					var4 = var1.method9407();
					if (var4 == 65535) {
						var4 = -1;
					}
				}

				var5 = var1.method9405();
				this.field2351 = new int[var5 + 2];

				for (var6 = 0; var6 <= var5; ++var6) {
					this.field2351[var6] = var1.method9407();
					if (this.field2351[var6] == 65535) {
						this.field2351[var6] = -1;
					}
				}

				this.field2351[var5 + 1] = var4;
			}
		}

	}

	public final Class262 method4246(Class211 var1, int var2, Class211 var3, int var4, Class223 var5) {
		if (this.field2351 != null) {
			Class225 var12 = this.method4249();
			return var12 == null ? null : var12.method4246(var1, var2, var3, var4, var5);
		} else {
			long var7 = (long)this.field2318;
			if (var5 != null) {
				var7 |= var5.field2292 << 16;
			}

			Class262 var9 = (Class262)field2317.method5993(var7);
			if (var9 == null) {
				Class236 var10 = this.method4300(this.field2357, var5);
				if (var10 == null) {
					return null;
				}

				var9 = var10.method4572(this.field2348 + 64, 850 + this.field2340, -30, -50, -30);
				field2317.method5987(var9, var7);
			}

			Class262 var11;
			if (var1 != null && var3 != null) {
				var11 = var1.method4002(var9, var2, var3, var4);
			} else if (var1 != null) {
				var11 = var1.method3999(var9, var2);
			} else if (var3 != null) {
				var11 = var3.method3999(var9, var4);
			} else {
				var11 = var9.method5214(true);
			}

			if (128 != this.field2325 || 128 != this.field2327) {
				var11.method5190(this.field2325, this.field2327, this.field2325);
			}

			return var11;
		}
	}

	public final Class236 method4247(Class223 var1) {
		if (this.field2351 != null) {
			Class225 var3 = this.method4249();
			return var3 == null ? null : var3.method4247(var1);
		} else {
			return this.method4300(this.field2322, var1);
		}
	}

	public Class236 method4300(int[] var1, Class223 var2) {
		int[] var4 = var1;
		if (var2 != null && var2.field2291 != null) {
			var4 = var2.field2291;
		}

		if (var4 == null) {
			return null;
		} else {
			boolean var5 = false;

			for (int var6 = 0; var6 < var4.length; ++var6) {
				if (-1 != var4[var6] && !Client.field319.method7232(var4[var6], 0)) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			} else {
				Class236[] var10 = new Class236[var4.length];

				for (int var7 = 0; var7 < var4.length; ++var7) {
					var10[var7] = Class236.method4594(Client.field319, var4[var7], 0);
				}

				Class236 var11;
				if (var10.length == 1) {
					var11 = var10[0];
					if (var11 == null) {
						var11 = new Class236(var10, var10.length);
					}
				} else {
					var11 = new Class236(var10, var10.length);
				}

				short[] var8;
				int var9;
				if (this.field2345 != null) {
					var8 = this.field2339;
					if (var2 != null && var2.field2295 != null) {
						var8 = var2.field2295;
					}

					for (var9 = 0; var9 < this.field2345.length; ++var9) {
						var11.method4573(this.field2345[var9], var8[var9]);
					}
				}

				if (this.field2346 != null) {
					var8 = this.field2350;
					if (var2 != null && var2.field2293 != null) {
						var8 = var2.field2293;
					}

					for (var9 = 0; var9 < this.field2346.length; ++var9) {
						var11.method4600(this.field2346[var9], var8[var9]);
					}
				}

				return var11;
			}
		}
	}

	public final Class225 method4249() {
		int var2 = -1;
		if (-1 != this.field2352) {
			var2 = Class351.method6175(this.field2352);
		} else if (-1 != this.field2338) {
			var2 = Class351.field3889[this.field2338];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field2351.length - 1) {
			var3 = this.field2351[var2];
		} else {
			var3 = this.field2351[this.field2351.length - 1];
		}

		return var3 != -1 ? method3256(var3) : null;
	}

	public final int method4265() {
		if (this.field2351 != null) {
			Class225 var2 = this.method4249();
			if (var2 != null) {
				return var2.field2318;
			}
		}

		return -1;
	}

	public boolean method4251() {
		if (this.field2351 == null) {
			return true;
		} else {
			int var2 = -1;
			if (this.field2352 != -1) {
				var2 = Class351.method6175(this.field2352);
			} else if (this.field2338 != -1) {
				var2 = Class351.field3889[this.field2338];
			}

			if (var2 >= 0 && var2 < this.field2351.length) {
				return this.field2351[var2] != -1;
			} else {
				return -1 != this.field2351[this.field2351.length - 1];
			}
		}
	}

	public int method4271(int var1, int var2) {
		Class515 var5 = this.field2360;
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

	public String method4253(int var1, String var2) {
		return Class188.method2595(this.field2360, var1, var2);
	}

	public boolean method4262() {
		return this.field2358 != null && this.field2359 != null;
	}

	public int[] method4242() {
		return this.field2358;
	}

	public int method4256(int var1) {
		return this.field2358 != null && var1 < this.field2358.length ? this.field2358[var1] : -1;
	}

	public short[] method4257() {
		return this.field2359;
	}

	public short method4258(int var1) {
		return this.field2359 != null && var1 < this.field2359.length ? this.field2359[var1] : -1;
	}

	public static Class225 method3256(int var0) {
		Class225 var2 = (Class225)field2316.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field2315.method7216(9, var0);
			var2 = new Class225();
			var2.field2318 = var0;
			if (var3 != null) {
				var2.method4244(new Class521(var3));
			}

			var2.method4243();
			field2316.method5987(var2, (long)var0);
			return var2;
		}
	}
}
