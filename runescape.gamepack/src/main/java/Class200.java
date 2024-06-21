import io.runebox.ObfInfo;

public class Class200 extends Class507 {
	@ObfInfo(name = "al", desc = "[Lhr;")
	public static Class200[] field2043;
	@ObfInfo(name = "az", desc = "Llm;")
	public static Class299 field2044;
	@ObfInfo(name = "ak", desc = "Lor;")
	public static Class382 field2051;
	@ObfInfo(name = "ad", desc = "Lhc;")
	public Class185 field2049;
	@ObfInfo(name = "ai", desc = "Lie;")
	public Class213 field2059;
	@ObfInfo(name = "av", desc = "Z")
	public boolean field2052;
	@ObfInfo(name = "aq", desc = "Z")
	public boolean field2056;
	@ObfInfo(name = "am", desc = "[B")
	public byte[] field2064;
	@ObfInfo(name = "as", desc = "I", intMultiplier = 2037348525)
	public int field2042;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -5424259)
	public int field2046;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 1730248837)
	public int field2047;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 2092703349)
	public int field2050;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1545215557)
	public int field2053;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = -1902796859)
	public int field2057;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1963779555)
	public int field2058;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1445516927)
	public int field2062;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = 1951731109)
	public int field2065;
	@ObfInfo(name = "ax", desc = "[I")
	public int[] field2060;
	@ObfInfo(name = "an", desc = "[I")
	public int[] field2063;
	@ObfInfo(name = "ab", desc = "Ljava/lang/String;")
	public String field2048;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	public String field2055;
	@ObfInfo(name = "ap", desc = "[Ljava/lang/String;")
	public String[] field2054;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1903111453)
	public final int field2045;

	static {
		field2044 = new Class299(256);
	}

	public Class200(int var1) {
		this.field2046 = -1;
		this.field2062 = -1;
		this.field2050 = 0;
		this.field2052 = true;
		this.field2056 = false;
		this.field2054 = new String[5];
		this.field2057 = Integer.MAX_VALUE;
		this.field2058 = Integer.MAX_VALUE;
		this.field2042 = Integer.MIN_VALUE;
		this.field2047 = Integer.MIN_VALUE;
		this.field2049 = Class185.field1921;
		this.field2059 = Class213.field2157;
		this.field2065 = -1;
		this.field2045 = var1;
	}

	@ObfInfo(name = "aj", desc = "(Lua;I)V")
	public void method3890(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method3891(var1, var3);
		}
	}

	@ObfInfo(name = "az", desc = "(Lua;IB)V", opaque = "62")
	public void method3891(Class521 var1, int var2) {
		if (var2 == 1) {
			this.field2046 = var1.method9423();
		} else if (var2 == 2) {
			this.field2062 = var1.method9423();
		} else if (var2 == 3) {
			this.field2048 = var1.method9415();
		} else if (var2 == 4) {
			this.field2053 = var1.method9399();
		} else if (var2 == 5) {
			var1.method9399();
		} else if (var2 == 6) {
			this.field2050 = var1.method9405();
		} else {
			int var4;
			if (var2 == 7) {
				var4 = var1.method9405();
				if (0 == (var4 & 1)) {
					this.field2052 = false;
				}

				if ((var4 & 2) == 2) {
					this.field2056 = true;
				}
			} else if (var2 == 8) {
				var1.method9405();
			} else if (var2 >= 10 && var2 <= 14) {
				this.field2054[var2 - 10] = var1.method9415();
			} else if (var2 == 15) {
				var4 = var1.method9405();
				this.field2060 = new int[var4 * 2];

				int var5;
				for (var5 = 0; var5 < var4 * 2; ++var5) {
					this.field2060[var5] = var1.method9535();
				}

				var1.method9410();
				var5 = var1.method9405();
				this.field2063 = new int[var5];

				int var6;
				for (var6 = 0; var6 < this.field2063.length; ++var6) {
					this.field2063[var6] = var1.method9410();
				}

				this.field2064 = new byte[var4];

				for (var6 = 0; var6 < var4; ++var6) {
					this.field2064[var6] = var1.method9406();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.field2055 = var1.method9415();
				} else if (var2 == 18) {
					var1.method9423();
				} else if (var2 == 19) {
					this.field2065 = var1.method9407();
				} else if (var2 == 21) {
					var1.method9410();
				} else if (var2 == 22) {
					var1.method9410();
				} else if (var2 == 23) {
					var1.method9405();
					var1.method9405();
					var1.method9405();
				} else if (var2 == 24) {
					var1.method9535();
					var1.method9535();
				} else if (var2 == 25) {
					var1.method9423();
				} else if (var2 == 28) {
					var1.method9405();
				} else if (var2 == 29) {
					this.field2049 = (Class185)Class62.method1112(Class185.method2403(), var1.method9405());
				} else if (var2 == 30) {
					this.field2059 = (Class213)Class62.method1112(Class213.method2875(), var1.method9405());
				}
			}
		}

	}

	@ObfInfo(name = "af", desc = "(I)V", opaque = "539563106")
	public void method3892() {
		if (this.field2060 != null) {
			for (int var2 = 0; var2 < this.field2060.length; var2 += 2) {
				if (this.field2060[var2] < this.field2057) {
					this.field2057 = this.field2060[var2];
				} else if (this.field2060[var2] > this.field2042) {
					this.field2042 = this.field2060[var2];
				}

				if (this.field2060[var2 + 1] < this.field2058) {
					this.field2058 = this.field2060[var2 + 1];
				} else if (this.field2060[var2 + 1] > this.field2047) {
					this.field2047 = this.field2060[var2 + 1];
				}
			}
		}

	}

	@ObfInfo(name = "aa", desc = "(ZI)Lvc;", opaque = "-487522756")
	public Class549 method3893(boolean var1) {
		int var3 = var1 ? this.field2062 : this.field2046;
		return this.method3894(var3);
	}

	@ObfInfo(name = "at", desc = "(II)Lvc;", opaque = "-1492918067")
	public Class549 method3894(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			Class549 var3 = (Class549)field2044.method5993((long)var1);
			if (var3 != null) {
				return var3;
			} else {
				var3 = Class554.method9868(field2051, var1, 0);
				if (var3 != null) {
					field2044.method5987(var3, (long)var1);
				}

				return var3;
			}
		}
	}

	@ObfInfo(name = "ab", desc = "(I)I")
	public int method3895() {
		return this.field2045;
	}

	@ObfInfo(owner = "ju", name = "ak", desc = "(Lor;Lor;B)Z", opaque = "74")
	public static boolean method4891(Class382 var0, Class382 var1) {
		field2051 = var1;
		if (!var0.method7255()) {
			return false;
		} else {
			Class496.field2098 = var0.method7237(35);
			field2043 = new Class200[Class496.field2098];

			for (int var3 = 0; var3 < Class496.field2098; ++var3) {
				byte[] var4 = var0.method7216(35, var3);
				field2043[var3] = new Class200(var3);
				if (var4 != null) {
					field2043[var3].method3890(new Class521(var4));
					field2043[var3].method3892();
				}
			}

			return true;
		}
	}

	@ObfInfo(name = "al", desc = "(II)Lhr;", opaque = "842760438")
	public static Class200 method3917(int var0) {
		return var0 >= 0 && var0 < field2043.length && null != field2043[var0] ? field2043[var0] : new Class200(var0);
	}
}
