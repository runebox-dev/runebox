import io.runebox.ObfInfo;

@ObfInfo(name = "og")
public class Class371 {
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1861554639)
	public static final int field4409;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1412380809)
	public static final int field4410;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = 744109287)
	public static final int field4425;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -71092613)
	public static final int field4426;

	static {
		field4409 = Class350.method6523(256);
		field4410 = Class350.method6523(256);
		Class350.method6501(field4409);
		Class350.method6501(field4410);
		Class350.method6523(100);
		Class350.method6523(200);
		Class350.method6523(1);
		Class350.method6523(1);
		short var0 = 6400;
		field4425 = var0;
		field4426 = Class350.method6517(field4425);
		Class350.method6523(1);
		Class350.method6523(1);
		int var5 = 0;
		int var1 = 0;
		Class389[] var2 = Class389.field4558;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Class389 var4 = var2[var3];
			if (var4.field4557 > var5) {
				var5 = var4.field4557;
			}

			if (var4.field4559 > var1) {
				var1 = var4.field4559;
			}
		}

	}

	@ObfInfo(name = "aq", desc = "(II)I")
	public static int method7108(int var0) {
		return var0 * 128 + 64;
	}
}
