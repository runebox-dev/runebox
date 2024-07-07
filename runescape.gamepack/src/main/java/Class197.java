import io.runebox.ObfInfo;

@ObfInfo(name = "ho")
public class Class197 extends Class507 {
	@ObfInfo(name = "az", desc = "Llm;")
	public static Class299 field2013;
	@ObfInfo(name = "av", desc = "Z")
	public boolean field2014;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1514514101)
	public int field2023;
	@ObfInfo(name = "aa", desc = "[I")
	public int[] field2015;
	@ObfInfo(name = "ah", desc = "[I")
	public int[] field2022;
	@ObfInfo(name = "at", desc = "[S")
	public short[] field2016;
	@ObfInfo(name = "ab", desc = "[S")
	public short[] field2017;
	@ObfInfo(name = "ac", desc = "[S")
	public short[] field2018;
	@ObfInfo(name = "ao", desc = "[S")
	public short[] field2019;

	static {
		field2013 = new Class299(64);
	}

	public Class197() {
		this.field2023 = -1;
		this.field2022 = new int[]{-1, -1, -1, -1, -1};
		this.field2014 = false;
	}

	@ObfInfo(name = "al", desc = "(Lua;I)V")
	public void method3845(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method3855(var1, var3);
		}
	}

	@ObfInfo(name = "aj", desc = "(Lua;II)V", opaque = "-266758959")
	public void method3855(Class521 var1, int var2) {
		if (var2 == 1) {
			this.field2023 = var1.method9405();
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				var4 = var1.method9405();
				this.field2015 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2015[var5] = var1.method9407();
				}
			} else if (var2 == 3) {
				this.field2014 = true;
			} else if (var2 == 40) {
				var4 = var1.method9405();
				this.field2016 = new short[var4];
				this.field2017 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2016[var5] = (short)var1.method9407();
					this.field2017[var5] = (short)var1.method9407();
				}
			} else if (var2 == 41) {
				var4 = var1.method9405();
				this.field2018 = new short[var4];
				this.field2019 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2018[var5] = (short)var1.method9407();
					this.field2019[var5] = (short)var1.method9407();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.field2022[var2 - 60] = var1.method9407();
			}
		}

	}

	@ObfInfo(name = "az", desc = "(B)Z", opaque = "3")
	public boolean method3847() {
		if (this.field2015 == null) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field2015.length; ++var3) {
				if (!Client.field1802.method7232(this.field2015[var3], 0)) {
					var2 = false;
				}
			}

			return var2;
		}
	}

	@ObfInfo(name = "af", desc = "(I)Ljb;", opaque = "1605515774")
	public Class236 method3848() {
		if (this.field2015 == null) {
			return null;
		} else {
			Class236[] var2 = new Class236[this.field2015.length];

			for (int var3 = 0; var3 < this.field2015.length; ++var3) {
				var2[var3] = Class236.method4594(Client.field1802, this.field2015[var3], 0);
			}

			Class236 var5;
			if (var2.length == 1) {
				var5 = var2[0];
			} else {
				var5 = new Class236(var2, var2.length);
			}

			int var4;
			if (this.field2016 != null) {
				for (var4 = 0; var4 < this.field2016.length; ++var4) {
					var5.method4573(this.field2016[var4], this.field2017[var4]);
				}
			}

			if (this.field2018 != null) {
				for (var4 = 0; var4 < this.field2018.length; ++var4) {
					var5.method4600(this.field2018[var4], this.field2019[var4]);
				}
			}

			return var5;
		}
	}

	@ObfInfo(name = "aa", desc = "(I)Z", opaque = "2026407683")
	public boolean method3846() {
		boolean var2 = true;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.field2022[var3] != -1 && !Client.field1802.method7232(this.field2022[var3], 0)) {
				var2 = false;
			}
		}

		return var2;
	}

	@ObfInfo(name = "at", desc = "(I)Ljb;", opaque = "-938751037")
	public Class236 method3850() {
		Class236[] var2 = new Class236[5];
		int var3 = 0;

		for (int var4 = 0; var4 < 5; ++var4) {
			if (this.field2022[var4] != -1) {
				var2[var3++] = Class236.method4594(Client.field1802, this.field2022[var4], 0);
			}
		}

		Class236 var6 = new Class236(var2, var3);
		int var5;
		if (this.field2016 != null) {
			for (var5 = 0; var5 < this.field2016.length; ++var5) {
				var6.method4573(this.field2016[var5], this.field2017[var5]);
			}
		}

		if (this.field2018 != null) {
			for (var5 = 0; var5 < this.field2018.length; ++var5) {
				var6.method4600(this.field2018[var5], this.field2019[var5]);
			}
		}

		return var6;
	}

	@ObfInfo(owner = "fa", name = "ak", desc = "(IB)Lho;", opaque = "-33")
	public static Class197 method3060(int var0) {
		Class197 var2 = (Class197)field2013.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else if (Client.field2012 == null) {
			return null;
		} else {
			byte[] var3 = Client.field2012.method7216(3, var0);
			var2 = new Class197();
			if (var3 != null) {
				var2.method3845(new Class521(var3));
			}

			field2013.method5987(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(name = "kw", desc = "(Lmn;I)V", opaque = "-386968604")
	public static void method3871(Class326 var0) {
		Class531 var2 = Client.field548.field1447;
		int var4;
		int var5;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var20;
		int var21;
		if (Class326.field3427 == var0) {
			var20 = var2.method9437();
			var4 = (var20 >> 4 & 7) + Client.field121;
			var5 = Client.field3436 + (var20 & 7);
			var21 = var2.method9522() & 31;
			var7 = var2.method9405();
			var8 = var2.method9437();
			var9 = var2.method9522();
			var10 = var2.method9445();
			if (var4 >= 0 && var5 >= 0 && var4 < Client.field4582.field1298 && var5 < Client.field4582.field1282) {
				var11 = var21 + 1;
				if (Client.field107.field1080[0] >= var4 - var11 && Client.field107.field1080[0] <= var11 + var4 && Client.field107.field1127[0] >= var5 - var11 && Client.field107.field1127[0] <= var11 + var5 && Client.field4851.method2657() != 0 && var9 > 0 && Client.field650 < 50) {
					Client.field739[Client.field650] = var10;
					Client.field744[Client.field650] = null;
					Client.field511[Client.field650] = var21 + (var4 << 16) + (var5 << 8);
					Client.field563[Client.field650] = var9;
					Client.field741[Client.field650] = var8;
					Client.field743[Client.field650] = var7;
					++Client.field650;
				}
			}

		} else {
			int var13;
			int var14;
			int var15;
			int var16;
			if (Class326.field3425 == var0) {
				byte var3 = var2.method9439();
				var4 = var2.method9446();
				var5 = var2.method9446();
				byte var6 = var2.method9440();
				var7 = var2.method9446();
				var8 = var2.method9405();
				var9 = var8 >> 2;
				var10 = var8 & 3;
				var11 = Client.field562[var9];
				byte var12 = var2.method9574();
				var13 = var2.method9522();
				var14 = (var13 >> 4 & 7) + Client.field121;
				var15 = (var13 & 7) + Client.field3436;
				var16 = var2.method9505();
				byte var17 = var2.method9439();
				Class83 var18;
				if (var16 == Client.field646) {
					var18 = Client.field107;
				} else {
					var18 = Client.field4582.field1293[var16];
				}

				if (var18 != null) {
					int var19 = -1 == Client.field711 ? Client.field4582.field1300 : Client.field711;
					Class154.method3300(var19, var14, var15, var9, var10, var11, var4, var7, var5, var6, var12, var3, var17, var18);
				}
			}

			int var27;
			if (Class326.field3418 == var0) {
				var20 = var2.method9405();
				var4 = var2.method9522();
				var5 = (var4 >> 4 & 7) + Client.field121;
				var21 = Client.field3436 + (var4 & 7);
				var7 = var2.method9522();
				var8 = var7 >> 2;
				var9 = var7 & 3;
				var10 = Client.field562[var8];
				var11 = var2.method9446();
				if (var5 >= 0 && var21 >= 0 && var5 < Client.field4582.field1298 && var21 < Client.field4582.field1282) {
					var27 = Client.field711 == -1 ? Client.field4582.field1300 : Client.field711;
					Client.method3582(Client.field4582, var27, var5, var21, var10, var11, var8, var9, var20, 0, -1);
				}

			} else if (Class326.field3421 == var0) {
				var20 = var2.method9407();
				var4 = var2.method9522();
				var5 = (var4 >> 4 & 7) + Client.field121;
				var21 = Client.field3436 + (var4 & 7);
				var7 = var2.method9437();
				var8 = var7 >> 2;
				var9 = var7 & 3;
				var10 = Client.field562[var8];
				if (var5 >= 0 && var21 >= 0 && var5 < 103 && var21 < 103) {
					var11 = Client.field711 == -1 ? Client.field4582.field1300 : Client.field711;
					Class89 var28 = Client.method3404(Client.field4582, var11, var5, var21, var10);
					if (var28 != null) {
						Class222 var29 = Class222.method4161(var28.field1188);
						if (var29.field2277) {
							var28.field1185 = var20;
							return;
						}
					}

					boolean var30 = Class65.method1805(var11, var5, var21, var8, var9, var10, var20);
					if (var30) {
						return;
					}

					if (var28 != null) {
						var28.field1185 = var20;
					}
				}

			} else if (Class326.field3422 == var0) {
				var20 = var2.method9445();
				var4 = var2.method9407();
				var5 = var2.method9455();
				var21 = var2.method9438();
				var7 = var2.method9438() * 4;
				byte var23 = var2.method9440();
				var9 = var2.method9455();
				var10 = var2.method9437();
				var11 = Client.field121 + (var10 >> 4 & 7);
				var27 = (var10 & 7) + Client.field3436;
				var13 = var2.method9437() * 4;
				var14 = var2.method9407();
				var15 = var2.method9407();
				byte var31 = var2.method9406();
				var8 = var11 + var23;
				var16 = var31 + var27;
				if (var11 >= 0 && var27 >= 0 && var11 < Client.field4582.field1298 && var27 < Client.field4582.field1282 && var8 >= 0 && var16 >= 0 && var8 < Client.field4582.field1298 && var16 < Client.field4582.field1282 && var4 != 65535) {
					int var32 = -1 == Client.field711 ? Client.field4582.field1300 : Client.field711;
					Client.method6160(var32, var11, var27, var8, var16, var5, var4, var7, var13, var15, var14, var21, var20, var9);
				}

			} else if (Class326.field3426 == var0) {
				var20 = var2.method9438();
				var4 = (var20 >> 4 & 7) + Client.field121;
				var5 = Client.field3436 + (var20 & 7);
				var21 = var2.method9462();
				var7 = var2.method9505();
				var8 = var2.method9462();
				if (var4 >= 0 && var5 >= 0 && var4 < Client.field4582.field1298 && var5 < Client.field4582.field1282) {
					var9 = -1 == Client.field711 ? Client.field4582.field1300 : Client.field711;
					Class137.method3098(var9, var4, var5, var7, var8, var21);
				}

			} else {
				if (Class326.field3430 == var0) {
					var20 = var2.method9407();
					var4 = var2.method9437();
					var5 = var2.method9522();
					var21 = Client.field121 + (var5 >> 4 & 7);
					var7 = (var5 & 7) + Client.field3436;
					var8 = Client.field4582.field1300;
					if (var21 >= 0 && var7 >= 0 && var21 < Client.field4582.field1298 && var7 < Client.field4582.field1282) {
						Class401 var25 = Client.field4582.field1301[var8][var21][var7];
						if (var25 != null) {
							for (Class117 var26 = (Class117)var25.method7482(); var26 != null; var26 = (Class117)var25.method7490()) {
								if ((var20 & 32767) == var26.field1465) {
									var26.method2919(var4);
									break;
								}
							}
						}

						if (var21 >= 0 && var7 >= 0 && var21 < Client.field4582.field1298 && var7 < Client.field4582.field1282) {
							var10 = -1 == Client.field711 ? Client.field4582.field1300 : Client.field711;
							Client.method3064(var10, var21, var7, var20, var4);
						}

						return;
					}
				}

				if (Class326.field3420 == var0) {
					var20 = var2.method9407();
					var4 = var2.method9446();
					var5 = var2.method9460();
					var21 = var2.method9446();
					var7 = var2.method9405();
					boolean var22 = var2.method9405() == 1;
					var9 = var2.method9438();
					var10 = Client.field121 + (var9 >> 4 & 7);
					var11 = (var9 & 7) + Client.field3436;
					var27 = var2.method9438();
					if (var10 >= 0 && var11 >= 0 && var10 < Client.field4582.field1298 && var11 < Client.field4582.field1282) {
						var13 = -1 == Client.field711 ? Client.field4582.field1300 : Client.field711;
						Client.method5998(var13, var10, var11, var21, var5, var27, var20, var4, var7, var22);
					}

				} else if (Class326.field3423 == var0) {
					var20 = var2.method9437();
					var4 = var20 >> 2;
					var5 = var20 & 3;
					var21 = Client.field562[var4];
					var7 = var2.method9405();
					var8 = (var7 >> 4 & 7) + Client.field121;
					var9 = Client.field3436 + (var7 & 7);
					if (var8 >= 0 && var9 >= 0 && var8 < Client.field4582.field1298 && var9 < Client.field4582.field1282) {
						var10 = -1 == Client.field711 ? Client.field4582.field1300 : Client.field711;
						Client.method3582(Client.field4582, var10, var8, var9, var21, -1, var4, var5, 31, 0, -1);
					}

				} else if (Class326.field3431 == var0) {
					var20 = var2.method9438();
					var4 = (var20 >> 4 & 7) + Client.field121;
					var5 = (var20 & 7) + Client.field3436;
					var21 = var2.method9445();
					var7 = var2.method9438();
					var8 = var2.method9407();
					if (var4 >= 0 && var5 >= 0 && var4 < Client.field4582.field1298 && var5 < Client.field4582.field1282) {
						var4 = var4 * 128 + 64;
						var5 = var5 * 128 + 64;
						var9 = Client.field711 == -1 ? Client.field4582.field1300 : Client.field711;
						Class59 var24 = new Class59(var21, var9, var4, var5, Client.method790(Client.field4582, var4, var5, var9) - var7, var8, Client.field778);
						Client.field4582.field1304.method7477(var24);
					}

				} else if (Class326.field3428 == var0) {
					var20 = var2.method9438();
					var4 = Client.field121 + (var20 >> 4 & 7);
					var5 = (var20 & 7) + Client.field3436;
					var21 = var2.method9462();
					var7 = var2.method9505();
					var8 = Client.field4582.field1300;
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						var9 = -1 == Client.field711 ? var8 : Client.field711;
						Client.method6708(var9, var4, var5, var7, var21);
					}

				}
			}
		}
	}
}
