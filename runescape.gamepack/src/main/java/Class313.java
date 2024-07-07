import io.runebox.ObfInfo;

@ObfInfo(name = "ma")
public class Class313 implements Class331 {
	@ObfInfo(name = "ak", desc = "Lma;")
	public static final Class313 field3258;
	@ObfInfo(name = "ag", desc = "Lma;")
	public static final Class313 field3259;
	@ObfInfo(name = "ad", desc = "Lma;")
	public static final Class313 field3260;
	@ObfInfo(name = "ap", desc = "Lma;")
	public static final Class313 field3261;
	@ObfInfo(name = "an", desc = "Lma;")
	public static final Class313 field3262;
	@ObfInfo(name = "aj", desc = "Lma;")
	public static final Class313 field3263;
	@ObfInfo(name = "av", desc = "Lma;")
	public static final Class313 field3264;
	@ObfInfo(name = "aq", desc = "Lma;")
	public static final Class313 field3265;
	@ObfInfo(name = "ae", desc = "[Lma;")
	public static final Class313[] field3267;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1880455773)
	public final int field3257;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -179587169)
	public final int field3266;

	static {
		field3265 = new Class313(14, 0);
		field3260 = new Class313(15, 20);
		field3259 = new Class313(16, -2);
		field3258 = new Class313(18, -2);
		field3261 = new Class313(19, -2);
		field3262 = new Class313(20, 58);
		field3263 = new Class313(21, 37);
		field3264 = new Class313(27, 0);
		field3267 = new Class313[32];
		Class313[] var0 = method5587();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field3267[var0[var1].field3257] = var0[var1];
		}

	}

	public Class313(int var1, int var2) {
		this.field3257 = var1;
		this.field3266 = var2;
	}

	@ObfInfo(name = "aq", desc = "(III)I", opaque = "-226882551")
	public static int method6077(int var0, int var1) {
		Class213 var3 = Class213.method1943(var0);
		if (var3 == null) {
			return var1;
		} else {
			int var4;
			int var5;
			if (var3.field2313 >= 0) {
				var4 = Class279.method3837(var3.field2316, var3.field2317, var3.field2308);
				var5 = Class80.method2297(var4, 96);
				return Class274.field2806[var5] | -16777216;
			} else if (var3.field2307 >= 0) {
				var4 = Class80.method2297(Class274.field2803.field3081.method5739(var3.field2307), 96);
				return Class274.field2806[var4] | -16777216;
			} else if (16711935 == var3.field2309) {
				return var1;
			} else {
				var4 = Class279.method3837(var3.field2311, var3.field2310, var3.field2314);
				var5 = Class80.method2297(var4, 96);
				return Class274.field2806[var5] | -16777216;
			}
		}
	}

	@ObfInfo(owner = "ks", name = "aq", desc = "(I)[Lma;")
	public static Class313[] method5587() {
		return new Class313[]{field3259, field3263, field3258, field3261, field3265, field3260, field3264, field3262};
	}
}
