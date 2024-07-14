import io.runebox.ObfInfo;

@ObfInfo(name = "bh")
public class Class34 {
	@ObfInfo(name = "aq", desc = "Lok;")
	public Class375 field169;
	@ObfInfo(name = "ad", desc = "Lok;")
	public Class375 field175;
	@ObfInfo(name = "ag", desc = "Lup;")
	public Class536 field171;

	public Class34(Class375 var1, Class375 var2) {
		new Class536(256);
		this.field171 = new Class536(256);
		this.field169 = var1;
		this.field175 = var2;
	}

	@ObfInfo(name = "aq", desc = "(II[IB)Lbl;", opaque = "0")
	public Class38 method453(int var1, int var2, int[] var3) {
		long var5 = this.method458(var1, var2, false);
		Class74 var7 = (Class74)this.field171.method9439(var5);
		if (var7 != null) {
			return var7.method2149();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			Class49 var8 = Class49.method880(this.field169, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				Class38 var9 = var8.method869();
				this.field171.method9445(new Class74(var9), var5);
				if (var3 != null) {
					var3[0] -= var9.field198.length;
				}

				return var9;
			}
		}
	}

	@ObfInfo(name = "ad", desc = "(III)Lcv;", opaque = "2117471043")
	public Class74 method454(int var1, int var2) {
		long var4 = this.method458(var1, var2, true);
		Class74 var6 = (Class74)this.field171.method9439(var4);
		if (var6 != null) {
			return var6;
		} else {
			Class64 var7 = Class64.method1304(this.field175, var1, var2);
			if (var7 == null) {
				return new Class74();
			} else {
				Class74 var8 = new Class74(var7);
				this.field171.method9445(var8, var4);
				return var8;
			}
		}
	}

	@ObfInfo(name = "ag", desc = "(I[II)Lbl;")
	public Class38 method464(int var1, int[] var2) {
		if (this.field169.method7156() == 1) {
			return this.method453(0, var1, var2);
		} else if (this.field169.method7144(var1) == 1) {
			return this.method453(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "ak", desc = "(IB)Lcv;", opaque = "67")
	public Class74 method456(int var1) {
		if (this.field175.method7156() == 1) {
			return this.method454(0, var1);
		} else if (this.field175.method7144(var1) == 1) {
			return this.method454(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "ap", desc = "(IB)Lbl;")
	public Class38 method452(int var1) {
		return this.method464(var1, (int[])null);
	}

	@ObfInfo(name = "an", desc = "(IIZB)J", opaque = "0")
	public long method458(int var1, int var2, boolean var3) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var5 |= var1 << 16;
		return var3 ? (long)var5 ^ 4294967296L : (long)var5;
	}

	@ObfInfo(name = "an", desc = "(IIILho;IB)V", opaque = "-1")
	public static void method470(int var0, int var1, int var2, Class197 var3, int var4) {
		if (var3 != null && var3.method3908()) {
			int var6 = var3.field2140;
			int var7 = var3.field2141;
			if (var4 == 1 || var4 == 3) {
				var6 = var3.field2141;
				var7 = var3.field2140;
			}

			int var8 = (var1 + var6) * 128;
			int var9 = (var2 + var7) * 128;
			var1 *= 128;
			var2 *= 128;
			int var10 = var3.field2169;
			int var11 = var3.field2170 * 128;
			int var12 = var3.field2171 * 128;
			if (var3.field2166 != null) {
				Class197 var13 = var3.method3905();
				if (var13 != null) {
					var10 = var13.field2169;
					var11 = var13.field2170 * 128;
					var12 = var13.field2171 * 128;
				}
			}

			for (Class55 var14 = (Class55)Class55.field409.method7526(); var14 != null; var14 = (Class55)Class55.field409.method7511()) {
				if (var14.field398 == var0 && var14.field395 == var1 && var14.field396 == var2 && var14.field397 == var8 && var14.field405 == var9 && var14.field401 == var10 && var14.field399 == var11 && var14.field400 == var12) {
					if (var14.field402 != null) {
						Client.field2506.method925(var14.field402);
						var14.field402 = null;
					}

					if (var14.field393 != null) {
						Client.field2506.method925(var14.field393);
						var14.field393 = null;
					}

					var14.method9267();
					break;
				}
			}
		}

	}
}
