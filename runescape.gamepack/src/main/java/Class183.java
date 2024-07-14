import io.runebox.ObfInfo;

@ObfInfo(name = "ha")
public class Class183 extends Class516 {
	@ObfInfo(name = "ak", desc = "Lmo;")
	public static Class327 field1916;
	@ObfInfo(name = "ap", desc = "Lmo;")
	public static Class327 field1917;
	@ObfInfo(name = "an", desc = "Lmo;")
	public static Class327 field1918;
	@ObfInfo(name = "ad", desc = "Lok;")
	public static Class375 field1914;
	@ObfInfo(name = "ag", desc = "Lok;")
	public static Class375 field1915;
	@ObfInfo(owner = "fi", name = "ah", desc = "Lqh;")
	public static Class424 field1620;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -290743515)
	public int field1913;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1456549433)
	public int field1919;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 740567617)
	public int field1920;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -886926797)
	public int field1921;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1750332237)
	public int field1922;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1801737031)
	public int field1923;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -510782169)
	public int field1925;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = 2141591761)
	public int field1926;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 590461861)
	public int field1928;
	@ObfInfo(name = "as", desc = "I", intMultiplier = -1345009173)
	public int field1929;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 506293749)
	public int field1931;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1372659175)
	public int field1932;
	@ObfInfo(name = "bt", desc = "I", intMultiplier = -1111852629)
	public int field1933;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = 1141721607)
	public int field1935;
	@ObfInfo(name = "am", desc = "[I")
	public int[] field1924;
	@ObfInfo(name = "aw", desc = "Ljava/lang/String;")
	public String field1930;

	static {
		field1916 = new Class327(64);
		field1917 = new Class327(64);
		field1918 = new Class327(20);
	}

	public Class183() {
		this.field1920 = -1;
		this.field1921 = 16777215;
		this.field1922 = 70;
		this.field1923 = -1;
		this.field1913 = -1;
		this.field1925 = -1;
		this.field1926 = -1;
		this.field1919 = 0;
		this.field1928 = 0;
		this.field1929 = -1;
		this.field1930 = "";
		this.field1931 = -1;
		this.field1932 = 0;
		this.field1935 = -1;
		this.field1933 = -1;
	}

	@ObfInfo(name = "ag", desc = "(Lvp;B)V", opaque = "2")
	public void method3642(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method3651(var1, var3);
		}
	}

	@ObfInfo(name = "ak", desc = "(Lvp;IB)V", opaque = "113")
	public void method3651(Class562 var1, int var2) {
		if (var2 == 1) {
			this.field1920 = var1.method9871();
		} else if (var2 == 2) {
			this.field1921 = var1.method9830();
		} else if (var2 == 3) {
			this.field1923 = var1.method9871();
		} else if (var2 == 4) {
			this.field1925 = var1.method9871();
		} else if (var2 == 5) {
			this.field1913 = var1.method9871();
		} else if (var2 == 6) {
			this.field1926 = var1.method9871();
		} else if (var2 == 7) {
			this.field1919 = var1.method9829();
		} else if (var2 == 8) {
			this.field1930 = var1.method9980();
		} else if (var2 == 9) {
			this.field1922 = var1.method9997();
		} else if (var2 == 10) {
			this.field1928 = var1.method9829();
		} else if (var2 == 11) {
			this.field1929 = 0;
		} else if (var2 == 12) {
			this.field1931 = var1.method9902();
		} else if (var2 == 13) {
			this.field1932 = var1.method9829();
		} else if (var2 == 14) {
			this.field1929 = var1.method9997();
		} else if (var2 == 17 || var2 == 18) {
			this.field1935 = var1.method9997();
			if (this.field1935 == 65535) {
				this.field1935 = -1;
			}

			this.field1933 = var1.method9997();
			if (this.field1933 == 65535) {
				this.field1933 = -1;
			}

			int var4 = -1;
			if (var2 == 18) {
				var4 = var1.method9997();
				if (var4 == 65535) {
					var4 = -1;
				}
			}

			int var5 = var1.method9902();
			this.field1924 = new int[var5 + 2];

			for (int var6 = 0; var6 <= var5; ++var6) {
				this.field1924[var6] = var1.method9997();
				if (this.field1924[var6] == 65535) {
					this.field1924[var6] = -1;
				}
			}

			this.field1924[var5 + 1] = var4;
		}

	}

	@ObfInfo(name = "ap", desc = "(B)Lha;", opaque = "2")
	public final Class183 method3646() {
		int var2 = -1;
		if (this.field1935 != -1) {
			var2 = Class353.method3359(this.field1935);
		} else if (this.field1933 != -1) {
			var2 = Class353.field3769[this.field1933];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field1924.length - 1) {
			var3 = this.field1924[var2];
		} else {
			var3 = this.field1924[this.field1924.length - 1];
		}

		return var3 != -1 ? Class254.method4941(var3) : null;
	}

	@ObfInfo(name = "an", desc = "(IB)Ljava/lang/String;", opaque = "14")
	public String method3624(int var1) {
		String var3 = this.field1930;

		while (true) {
			int var4 = var3.indexOf("%1");
			if (var4 < 0) {
				return var3;
			}

			var3 = var3.substring(0, var4) + Class413.method3887(var1, false) + var3.substring(var4 + 2);
		}
	}

	@ObfInfo(name = "aj", desc = "(I)Lvg;", opaque = "564184401")
	public Class553 method3625() {
		if (this.field1923 < 0) {
			return null;
		} else {
			Class553 var2 = (Class553)field1917.method6327((long)this.field1923);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class554.method7253(field1914, this.field1923, 0);
				if (var2 != null) {
					field1917.method6330(var2, (long)this.field1923);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "av", desc = "(I)Lvg;", opaque = "1064007667")
	public Class553 method3626() {
		if (this.field1913 < 0) {
			return null;
		} else {
			Class553 var2 = (Class553)field1917.method6327((long)this.field1913);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class554.method7253(field1914, this.field1913, 0);
				if (var2 != null) {
					field1917.method6330(var2, (long)this.field1913);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "ab", desc = "(I)Lvg;", opaque = "1183128767")
	public Class553 method3627() {
		if (this.field1925 < 0) {
			return null;
		} else {
			Class553 var2 = (Class553)field1917.method6327((long)this.field1925);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class554.method7253(field1914, this.field1925, 0);
				if (var2 != null) {
					field1917.method6330(var2, (long)this.field1925);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "ai", desc = "(B)Lvg;", opaque = "0")
	public Class553 method3628() {
		if (this.field1926 < 0) {
			return null;
		} else {
			Class553 var2 = (Class553)field1917.method6327((long)this.field1926);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class554.method7253(field1914, this.field1926, 0);
				if (var2 != null) {
					field1917.method6330(var2, (long)this.field1926);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(B)Lqh;", opaque = "1")
	public Class424 method3629() {
		if (this.field1920 == -1) {
			return null;
		} else {
			Class424 var2 = (Class424)field1918.method6327((long)this.field1920);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class143.method3172(field1914, field1915, this.field1920, 0);
				if (var2 != null) {
					field1918.method6330(var2, (long)this.field1920);
				}

				return var2;
			}
		}
	}

	@ObfInfo(owner = "ow", name = "aq", desc = "(Lok;Lok;Lok;B)V")
	public static void method7264(Class375 var0, Class375 var1, Class375 var2) {
		Class254.field1934 = var0;
		field1914 = var1;
		field1915 = var2;
	}

	@ObfInfo(name = "au", desc = "(IIIIIZI)Lvg;", opaque = "78323717")
	public static Class553 method3653(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var7 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0;
		Class553 var9;
		if (!var5) {
			var9 = (Class553)Class187.field2010.method6327(var7);
			if (var9 != null) {
				return var9;
			}
		}

		Class187 var10 = Class187.method3421(var0);
		if (var1 > 1 && var10.field2036 != null) {
			int var11 = -1;

			for (int var12 = 0; var12 < 10; ++var12) {
				if (var1 >= var10.field2047[var12] && var10.field2047[var12] != 0) {
					var11 = var10.field2036[var12];
				}
			}

			if (var11 != -1) {
				var10 = Class187.method3421(var11);
			}
		}

		Class308 var21 = var10.method3777(1);
		if (var21 == null) {
			return null;
		} else {
			Class553 var22 = null;
			if (var10.field2049 != -1) {
				var22 = method3653(var10.field2048, 10, 1, 0, 0, true);
				if (var22 == null) {
					return null;
				}
			} else if (var10.field2040 != -1) {
				var22 = method3653(var10.field2059, var1, var2, var3, 0, false);
				if (var22 == null) {
					return null;
				}
			} else if (var10.field2062 != -1) {
				var22 = method3653(var10.field2061, var1, 0, 0, 0, false);
				if (var22 == null) {
					return null;
				}
			}

			int[] var13 = Class569.field5504;
			int var14 = Class88.field5502;
			int var15 = Class569.field5503;
			float[] var16 = Class569.field5506;
			int[] var17 = new int[4];
			Class569.method10132(var17);
			var9 = new Class553(36, 32);
			Class274.method5128(var9.field5429, 36, 32, (float[])null);
			Class569.method10134();
			Class274.method5171();
			Class274.method5176(16, 16);
			Class274.field2803.field3072 = false;
			if (var10.field2062 != -1) {
				var22.method9628(0, 0);
			}

			int var18 = var10.field2019;
			if (var5) {
				var18 = (int)((double)var18 * 1.5D);
			} else if (var2 == 2) {
				var18 = (int)((double)var18 * 1.04D);
			}

			int var19 = Class274.field2804[var10.field2031] * var18 >> 16;
			int var20 = Class274.field2805[var10.field2031] * var18 >> 16;
			var21.method5865();
			var21.method5883(0, var10.field2042, var10.field2022, var10.field2031, var10.field2023, var21.field2960 / 2 + var19 + var10.field2024, var10.field2024 + var20);
			if (var10.field2040 != -1) {
				var22.method9628(0, 0);
			}

			if (var2 >= 1) {
				var9.method9657(1);
			}

			if (var2 >= 2) {
				var9.method9657(16777215);
			}

			if (var3 != 0) {
				var9.method9603(var3);
			}

			Class274.method5128(var9.field5429, 36, 32, (float[])null);
			if (var10.field2049 != -1) {
				var22.method9628(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var10.field2025 == 1) {
				field1620.method8248(Class187.method3038(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				Class187.field2010.method6330(var9, var7);
			}

			Class274.method5128(var13, var14, var15, var16);
			Class569.method10133(var17);
			Class274.method5171();
			Class274.field2803.field3072 = true;
			return var9;
		}
	}
}
