import io.runebox.ObfInfo;

@ObfInfo(name = "cc")
public final class Class55 extends Class520 {
	@ObfInfo(name = "aq", desc = "Lpr;")
	public static Class408 field409;
	@ObfInfo(name = "ac", desc = "Lho;")
	public Class197 field408;
	@ObfInfo(name = "ax", desc = "Lbz;")
	public Class52 field393;
	@ObfInfo(name = "ai", desc = "Lbz;")
	public Class52 field402;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -839235315)
	public int field394;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1753203631)
	public int field395;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1882644855)
	public int field396;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1813911287)
	public int field397;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1547628377)
	public int field398;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 835963461)
	public int field399;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1143258933)
	public int field400;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 591656919)
	public int field401;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -502571839)
	public int field403;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -139704035)
	public int field404;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 749652693)
	public int field405;
	@ObfInfo(name = "ah", desc = "[I")
	public int[] field406;

	static {
		field409 = new Class408();
	}

	@ObfInfo(name = "ag", desc = "(I)V", opaque = "680661523")
	public void method1155() {
		int var2 = this.field401;
		Class197 var3 = this.field408.method3905();
		if (var3 != null) {
			this.field401 = var3.field2169;
			this.field399 = var3.field2170 * 128;
			this.field400 = var3.field2171 * 128;
			this.field403 = var3.field2172;
			this.field404 = var3.field2173;
			this.field406 = var3.field2174;
		} else {
			this.field401 = -1;
			this.field399 = 0;
			this.field400 = 0;
			this.field403 = 0;
			this.field404 = 0;
			this.field406 = null;
		}

		if (this.field401 != var2 && this.field402 != null) {
			Client.field2506.method925(this.field402);
			this.field402 = null;
		}

	}

	@ObfInfo(owner = "co", name = "aq", desc = "(I)V", opaque = "-3016048")
	public static void method1936() {
		for (Class55 var1 = (Class55)field409.method7526(); var1 != null; var1 = (Class55)field409.method7511()) {
			if (var1.field402 != null) {
				Client.field2506.method925(var1.field402);
				var1.field402 = null;
			}

			if (var1.field393 != null) {
				Client.field2506.method925(var1.field393);
				var1.field393 = null;
			}
		}

		field409.method7518();
	}

	@ObfInfo(owner = "jf", name = "ad", desc = "(B)V", opaque = "1")
	public static void method4649() {
		for (Class55 var1 = (Class55)field409.method7526(); var1 != null; var1 = (Class55)field409.method7511()) {
			if (var1.field408 != null) {
				var1.method1155();
			}
		}

	}

	@ObfInfo(owner = "fg", name = "ak", desc = "(IIILho;IB)V", opaque = "0")
	public static void method3129(int var0, int var1, int var2, Class197 var3, int var4) {
		Class55 var6 = new Class55();
		var6.field398 = var0;
		var6.field395 = var1 * 128;
		var6.field396 = var2 * 128;
		int var7 = var3.field2140;
		int var8 = var3.field2141;
		if (var4 == 1 || var4 == 3) {
			var7 = var3.field2141;
			var8 = var3.field2140;
		}

		var6.field397 = (var1 + var7) * 128;
		var6.field405 = (var2 + var8) * 128;
		var6.field401 = var3.field2169;
		var6.field399 = var3.field2170 * 128;
		var6.field400 = Math.max(var3.field2171 * 128 - 128, 0);
		var6.field403 = var3.field2172;
		var6.field404 = var3.field2173;
		var6.field406 = var3.field2174;
		if (var3.field2166 != null) {
			var6.field408 = var3;
			var6.method1155();
		}

		field409.method7506(var6);
		if (var6.field406 != null) {
			var6.field394 = var6.field403 + (int)(Math.random() * (double)(var6.field404 - var6.field403));
		}

	}

	@ObfInfo(owner = "im", name = "ap", desc = "(IIIIB)V", opaque = "11")
	public static void method4251(int var0, int var1, int var2, int var3) {
		for (Class55 var5 = (Class55)field409.method7526(); var5 != null; var5 = (Class55)field409.method7511()) {
			if (var5.field401 != -1 || var5.field406 != null) {
				int var6 = 0;
				if (var1 > var5.field397) {
					var6 += var1 - var5.field397;
				} else if (var1 < var5.field395) {
					var6 += var5.field395 - var1;
				}

				if (var2 > var5.field405) {
					var6 += var2 - var5.field405;
				} else if (var2 < var5.field396) {
					var6 += var5.field396 - var2;
				}

				var6 = Math.max(var6 - 64, 0);
				if (var6 < var5.field399 && Client.field1474.method2508() != 0 && var5.field398 == var0) {
					float var7 = var5.field400 < var5.field399 ? Math.min(Math.max((float)(var5.field399 - var6) / (float)(var5.field399 - var5.field400), 0.0F), 1.0F) : 1.0F;
					int var8 = (int)(var7 * (float)Client.field1474.method2508());
					if (var5.field402 == null) {
						if (var5.field401 >= 0) {
							Class49 var9 = Class49.method880(Client.field4697, var5.field401, 0);
							if (var9 != null) {
								Class38 var10 = var9.method869().method549(Client.field1751);
								Class52 var11 = Class52.method1008(var10, 100, var8);
								var11.method1040(-1);
								Client.field2506.method892(var11);
								var5.field402 = var11;
							}
						}
					} else {
						var5.field402.method940(var8);
					}

					if (var5.field393 == null) {
						if (var5.field406 != null && (var5.field394 -= var3) <= 0) {
							int var13 = (int)(Math.random() * (double)var5.field406.length);
							Class49 var14 = Class49.method880(Client.field4697, var5.field406[var13], 0);
							if (var14 != null) {
								Class38 var15 = var14.method869().method549(Client.field1751);
								Class52 var12 = Class52.method1008(var15, 100, var8);
								var12.method1040(0);
								Client.field2506.method892(var12);
								var5.field393 = var12;
								var5.field394 = var5.field403 + (int)(Math.random() * (double)(var5.field404 - var5.field403));
							}
						}
					} else {
						var5.field393.method940(var8);
						if (!var5.field393.method9268()) {
							var5.field393 = null;
						}
					}
				} else {
					if (var5.field402 != null) {
						Client.field2506.method925(var5.field402);
						var5.field402 = null;
					}

					if (var5.field393 != null) {
						Client.field2506.method925(var5.field393);
						var5.field393 = null;
					}
				}
			}
		}

	}

	@ObfInfo(name = "oz", desc = "(Lnx;I)Lnx;", opaque = "150725594")
	public static Class362 method1148(Class362 var0) {
		int var3 = Client.method3446(var0);
		int var2 = var3 >> 17 & 7;
		if (var2 == 0) {
			return null;
		} else {
			for (int var5 = 0; var5 < var2; ++var5) {
				var0 = Client.field4644.method6417(var0.field3832);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
