public final class Class100 extends Class86 {
	public static int field1319;
	public static int field1321;
	public Class223 field1315;
	public Class223 field1318;
	public Class225 field1314;
	public Class564 field1317;
	public int field1316;
	public String field1320;

	static {
		field1319 = 1;
		field1321 = 1;
	}

	public Class100() {
		this.field1320 = "";
		this.field1316 = 31;
	}

	public void method2522(String var1) {
		this.field1320 = var1 == null ? "" : var1;
	}

	public void method2547(int var1) {
		this.field1316 = var1;
	}

	public boolean method2562(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return 0 != (this.field1316 & 1 << var1);
		} else {
			return true;
		}
	}

	public final String method2525() {
		if (!this.field1320.isEmpty()) {
			return this.field1320;
		} else {
			Class225 var2 = this.field1314;
			if (var2.field2351 != null) {
				var2 = var2.method4249();
				if (var2 == null) {
					var2 = this.field1314;
				}
			}

			return var2.field2337;
		}
	}

	public final void method2526(int var1, Class256 var2) {
		int var4 = super.field1080[0];
		int var5 = super.field1127[0];
		if (var1 == 0) {
			--var4;
			++var5;
		}

		if (var1 == 1) {
			++var5;
		}

		if (var1 == 2) {
			++var4;
			++var5;
		}

		if (var1 == 3) {
			--var4;
		}

		if (var1 == 4) {
			++var4;
		}

		if (var1 == 5) {
			--var4;
			--var5;
		}

		if (var1 == 6) {
			--var5;
		}

		if (var1 == 7) {
			++var4;
			--var5;
		}

		if (super.field1074 != -1 && Class237.method4637(super.field1074).field2141 == 1) {
			super.field1074 = -1;
		}

		if (super.field1125 < 9) {
			++super.field1125;
		}

		for (int var6 = super.field1125; var6 > 0; --var6) {
			super.field1080[var6] = super.field1080[var6 - 1];
			super.field1127[var6] = super.field1127[var6 - 1];
			super.field1128[var6] = super.field1128[var6 - 1];
		}

		super.field1080[0] = var4;
		super.field1127[0] = var5;
		super.field1128[0] = var2;
	}

	public final void method2527(int var1, int var2, boolean var3) {
		if (super.field1074 != -1 && Class237.method4637(super.field1074).field2141 == 1) {
			super.field1074 = -1;
		}

		if (!var3) {
			int var5 = var1 - super.field1080[0];
			int var6 = var2 - super.field1127[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (super.field1125 < 9) {
					++super.field1125;
				}

				for (int var7 = super.field1125; var7 > 0; --var7) {
					super.field1080[var7] = super.field1080[var7 - 1];
					super.field1127[var7] = super.field1127[var7 - 1];
					super.field1128[var7] = super.field1128[var7 - 1];
				}

				super.field1080[0] = var1;
				super.field1127[0] = var2;
				super.field1128[0] = Class256.field2700;
				return;
			}
		}

		super.field1125 = 0;
		super.field1077 = 0;
		super.field1129 = 0;
		super.field1080[0] = var1;
		super.field1127[0] = var2;
		super.field1065 = super.field1059 * 64 + super.field1080[0] * 128;
		super.field1126 = super.field1059 * 64 + 128 * super.field1127[0];
	}

	public final Class262 method1092() {
		if (this.field1314 == null) {
			return null;
		} else {
			Class211 var2 = -1 != super.field1074 && 0 == super.field1103 ? Class237.method4637(super.field1074) : null;
			Class211 var3 = super.field1096 == -1 || super.field1061 == super.field1096 && var2 != null ? null : Class237.method4637(super.field1096);
			Class262 var4 = null;
			if (this.field1318 != null && this.field1318.field2294) {
				var4 = Client.field107.field1029.method7086(var2, super.field1101, var3, super.field1122);
			} else {
				var4 = this.field1314.method4246(var2, super.field1101, var3, super.field1122, this.field1318);
			}

			if (var4 == null) {
				return null;
			} else {
				var4.method5173();
				super.field1130 = var4.field2696;
				int var5 = var4.field2853;
				var4 = this.method2338(var4);
				if (this.field1314.field2320 == 1) {
					var4.field2873 = true;
				}

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

	public final boolean method2264() {
		return this.field1314 != null;
	}

	public int[] method2530() {
		return this.field1317 != null ? this.field1317.method10250() : this.field1314.method4242();
	}

	public short[] method2531() {
		return this.field1317 != null ? this.field1317.method10247() : this.field1314.method4257();
	}

	public void method2532(int var1, int var2, short var3) {
		if (this.field1317 == null) {
			this.field1317 = new Class564(this.field1314);
		}

		this.field1317.method10248(var1, var2, var3);
	}

	public void method2533(int[] var1, short[] var2) {
		if (this.field1317 == null) {
			this.field1317 = new Class564(this.field1314);
		}

		this.field1317.method10249(var1, var2);
	}

	public void method2534() {
		this.field1317 = null;
	}

	public void method2561(Class223 var1) {
		this.field1315 = var1;
	}

	public Class223 method2536() {
		return this.field1315;
	}

	public void method2537(Class223 var1) {
		this.field1318 = var1;
	}

	public void method2538() {
		this.field1315 = null;
	}

	public void method2557() {
		this.field1318 = null;
	}
}
