import io.runebox.ObfInfo;

@ObfInfo(name = "dx")
public final class Class102 extends Class101 {
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1582882849)
	public static int field1311;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 2050335803)
	public static int field1313;
	@ObfInfo(name = "aq", desc = "Lhb;")
	public Class184 field1309;
	@ObfInfo(name = "ab", desc = "Lhh;")
	public Class190 field1305;
	@ObfInfo(name = "aj", desc = "Lhh;")
	public Class190 field1310;
	@ObfInfo(name = "ap", desc = "Lvi;")
	public Class555 field1314;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -782127427)
	public int field1307;
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public String field1306;

	static {
		field1311 = 1;
		field1313 = 1;
	}

	public Class102() {
		this.field1306 = "";
		this.field1307 = 31;
	}

	@ObfInfo(name = "al", desc = "(Ljava/lang/String;I)V", opaque = "-212261807")
	public void method2700(String var1) {
		this.field1306 = var1 == null ? "" : var1;
	}

	@ObfInfo(name = "ay", desc = "(IB)V")
	public void method2702(int var1) {
		this.field1307 = var1;
	}

	@ObfInfo(name = "ao", desc = "(IB)Z", opaque = "2")
	public boolean method2754(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1307 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfInfo(name = "aa", desc = "(I)Ljava/lang/String;", opaque = "1508686986")
	public final String method2704() {
		if (!this.field1306.isEmpty()) {
			return this.field1306;
		} else {
			Class184 var2 = this.field1309;
			if (var2.field1966 != null) {
				var2 = var2.method3661();
				if (var2 == null) {
					var2 = this.field1309;
				}
			}

			return var2.field1942;
		}
	}

	@ObfInfo(name = "as", desc = "(ILjb;B)V", opaque = "31")
	public final void method2705(int var1, Class236 var2) {
		int var4 = super.field1242[0];
		int var5 = super.field1284[0];
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

		if (super.field1273 != -1 && Class344.method6474(super.field1273).field2348 == 1) {
			super.field1273 = -1;
		}

		if (super.field1267 < 9) {
			++super.field1267;
		}

		for (int var6 = super.field1267; var6 > 0; --var6) {
			super.field1242[var6] = super.field1242[var6 - 1];
			super.field1284[var6] = super.field1284[var6 - 1];
			super.field1301[var6] = super.field1301[var6 - 1];
		}

		super.field1242[0] = var4;
		super.field1284[0] = var5;
		super.field1301[0] = var2;
	}

	@ObfInfo(name = "aw", desc = "(IIZB)V", opaque = "64")
	public final void method2706(int var1, int var2, boolean var3) {
		if (super.field1273 != -1 && Class344.method6474(super.field1273).field2348 == 1) {
			super.field1273 = -1;
		}

		if (!var3) {
			int var5 = var1 - super.field1242[0];
			int var6 = var2 - super.field1284[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (super.field1267 < 9) {
					++super.field1267;
				}

				for (int var7 = super.field1267; var7 > 0; --var7) {
					super.field1242[var7] = super.field1242[var7 - 1];
					super.field1284[var7] = super.field1284[var7 - 1];
					super.field1301[var7] = super.field1301[var7 - 1];
				}

				super.field1242[0] = var1;
				super.field1284[0] = var2;
				super.field1301[0] = Class236.field2511;
				return;
			}
		}

		super.field1267 = 0;
		super.field1303 = 0;
		super.field1302 = 0;
		super.field1242[0] = var1;
		super.field1284[0] = var2;
		super.field1266 = super.field1232 * 64 + super.field1242[0] * 128;
		super.field1229 = 128 * super.field1284[0] + super.field1232 * 64;
	}

	@ObfInfo(name = "ah", desc = "(I)Llv;", opaque = "-1073372180")
	public final Class308 method1140() {
		if (this.field1309 == null) {
			return null;
		} else {
			Class217 var2 = -1 != super.field1273 && super.field1276 == 0 ? Class344.method6474(super.field1273) : null;
			Class217 var3 = super.field1236 != -1 && (super.field1234 != super.field1236 || var2 == null) ? Class344.method6474(super.field1236) : null;
			Class308 var4 = null;
			if (this.field1310 != null && this.field1310.field2090) {
				var4 = Client.field170.field1001.method6434(var2, super.field1274, var3, super.field1270);
			} else {
				var4 = this.field1309.method3703(var2, super.field1274, var3, super.field1270, this.field1310);
			}

			if (var4 == null) {
				return null;
			} else {
				var4.method5865();
				super.field1288 = var4.field2960;
				int var5 = var4.field3162;
				var4 = this.method2649(var4);
				if (1 == this.field1309.field1943) {
					var4.field3219 = true;
				}

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

	@ObfInfo(name = "bo", desc = "(I)Z", opaque = "1756478951")
	public final boolean method2254() {
		return this.field1309 != null;
	}

	@ObfInfo(name = "at", desc = "(I)[I", opaque = "-509525809")
	public int[] method2709() {
		return this.field1314 != null ? this.field1314.method9743() : this.field1309.method3666();
	}

	@ObfInfo(name = "af", desc = "(S)[S", opaque = "8222")
	public short[] method2722() {
		return this.field1314 != null ? this.field1314.method9752() : this.field1309.method3668();
	}

	@ObfInfo(name = "am", desc = "(IISB)V", opaque = "1")
	public void method2711(int var1, int var2, short var3) {
		if (this.field1314 == null) {
			this.field1314 = new Class555(this.field1309);
		}

		this.field1314.method9745(var1, var2, var3);
	}

	@ObfInfo(name = "ar", desc = "([I[SI)V", opaque = "170883828")
	public void method2712(int[] var1, short[] var2) {
		if (this.field1314 == null) {
			this.field1314 = new Class555(this.field1309);
		}

		this.field1314.method9746(var1, var2);
	}

	@ObfInfo(name = "bt", desc = "(B)V")
	public void method2725() {
		this.field1314 = null;
	}

	@ObfInfo(name = "bj", desc = "(Lhh;I)V")
	public void method2714(Class190 var1) {
		this.field1305 = var1;
	}

	@ObfInfo(name = "be", desc = "(B)Lhh;")
	public Class190 method2764() {
		return this.field1305;
	}

	@ObfInfo(name = "bm", desc = "(Lhh;I)V")
	public void method2716(Class190 var1) {
		this.field1310 = var1;
	}

	@ObfInfo(name = "bi", desc = "(B)V")
	public void method2717() {
		this.field1305 = null;
	}

	@ObfInfo(name = "ba", desc = "(I)V")
	public void method2731() {
		this.field1310 = null;
	}

	@ObfInfo(name = "dg", desc = "(B)I", opaque = "-2")
	public int method2697() {
		return -1 == this.field1309.field1983 ? super.field1288 : this.field1309.field1983;
	}
}
