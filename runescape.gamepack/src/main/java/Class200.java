public class Class200 extends Class507 {
	public static Class299 field2044;
	public Class185 field2049;
	public Class213 field2059;
	public boolean field2052;
	public boolean field2056;
	public byte[] field2064;
	public int field2042;
	public int field2046;
	public int field2047;
	public int field2050;
	public int field2053;
	public int field2057;
	public int field2058;
	public int field2062;
	public int field2065;
	public int[] field2060;
	public int[] field2063;
	public String field2048;
	public String field2055;
	public String[] field2054;
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

	public void method3890(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method3891(var1, var3);
		}
	}

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
					this.field2049 = (Class185)Class62.method1112(Class89.method2403(), var1.method9405());
				} else if (var2 == 30) {
					this.field2059 = (Class213)Class62.method1112(Class213.method2875(), var1.method9405());
				}
			}
		}

	}

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

	public Class549 method3893(boolean var1) {
		int var3 = var1 ? this.field2062 : this.field2046;
		return this.method3894(var3);
	}

	public Class549 method3894(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			Class549 var3 = (Class549)field2044.method5993((long)var1);
			if (var3 != null) {
				return var3;
			} else {
				var3 = Class554.method9868(Class255.field2051, var1, 0);
				if (var3 != null) {
					field2044.method5987(var3, (long)var1);
				}

				return var3;
			}
		}
	}

	public int method3895() {
		return this.field2045;
	}

	public static Class200 method3917(int var0) {
		return var0 >= 0 && var0 < Class255.field2043.length && null != Class255.field2043[var0] ? Class255.field2043[var0] : new Class200(var0);
	}
}
