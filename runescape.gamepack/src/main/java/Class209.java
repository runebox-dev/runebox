import io.runebox.ObfInfo;

@ObfInfo(name = "ia")
public class Class209 {
	@ObfInfo(name = "ap", desc = "[F")
	public float[] field2267;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1255674463)
	public int field2270;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1383873547)
	public int field2272;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -2014108559)
	public int field2273;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field2269;
	// $FF: synthetic field
	public final Class214 this$0;

	public Class209(Class214 var1) {
		this.this$0 = var1;
		this.field2267 = new float[4];
		this.field2270 = 1;
		this.field2272 = 1;
		this.field2273 = 0;
	}

	@ObfInfo(name = "ab", desc = "(B)I")
	public static int method4045() {
		return Class296.field3046;
	}

	@ObfInfo(name = "bc", desc = "(Lnx;IIB)V", opaque = "0")
	public static void method4041(Class362 var0, int var1, int var2) {
		Class343 var4 = var0.field3820;
		boolean var5 = var2 != var4.field3720;
		var4.field3720 = var2;
		if (var5) {
			int var6;
			int var7;
			if (var1 == var4.field3720) {
				for (var6 = 0; var6 < Class343.field3722.length; ++var6) {
					var7 = Class343.field3722[var6];
					if (var4.field3717[var7] > 0 && var4.field3717[var7] < 512) {
						var4.field3717[var7] = var4.field3716[var7];
					}
				}
			} else {
				label67: {
					if (var4.field3717[0] >= 512) {
						boolean var8;
						if (var4.field3717[0] < 512) {
							var8 = false;
						} else {
							Class187 var9 = Class187.method3421(var4.field3717[0] - 512);
							var8 = var9.field2021 != Class212.field2292.field2296 && Class212.field2292.field2296 != var9.field2029;
						}

						if (!var8) {
							break label67;
						}
					}

					var4.field3717[Class212.field2292.field2296] = 1;
				}

				for (var6 = 0; var6 < 7; ++var6) {
					var7 = Class343.field3722[var6];
					if (var4.field3717[var7] > 0 && var4.field3717[var7] < 512) {
						Class343.method6282(var2, var4.field3717, var6);
					}
				}
			}
		}

		var4.method6425();
	}

	@ObfInfo(name = "ji", desc = "(II)V", opaque = "1837408975")
	public static void method4042(int var0) {
		Client.field755 = 0L;
		if (var0 >= 2) {
			Client.field756 = true;
		} else {
			Client.field756 = false;
		}

		if (Client.method2130() == 1) {
			Client.field4671.method627(765, 503);
		} else {
			Client.field4671.method627(7680, 2160);
		}

		if (Client.field537 >= 25) {
			Client.method6362();
		}

	}
}
