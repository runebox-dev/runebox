import io.runebox.ObfInfo;

@ObfInfo(name = "jb")
public class Class236 implements Class393 {
	@ObfInfo(name = "au", desc = "[Ljb;")
	public static Class236[] field2500;
	@ObfInfo(name = "ab", desc = "Ljb;")
	public static final Class236 field2499;
	@ObfInfo(name = "ak", desc = "Ljb;")
	public static final Class236 field2501;
	@ObfInfo(name = "ap", desc = "Ljb;")
	public static final Class236 field2502;
	@ObfInfo(name = "an", desc = "Ljb;")
	public static final Class236 field2503;
	@ObfInfo(name = "aq", desc = "Ljb;")
	public static final Class236 field2504;
	@ObfInfo(name = "av", desc = "Ljb;")
	public static final Class236 field2505;
	@ObfInfo(name = "aj", desc = "Ljb;")
	public static final Class236 field2508;
	@ObfInfo(name = "ag", desc = "Ljb;")
	public static final Class236 field2511;
	@ObfInfo(name = "ad", desc = "Ljb;")
	public static final Class236 field2512;
	@ObfInfo(name = "ai", desc = "B")
	public final byte field2507;
	@ObfInfo(name = "ae", desc = "F")
	public final float field2509;

	static {
		field2504 = new Class236((byte)-1, 0.0F);
		field2512 = new Class236((byte)0, 0.5F);
		field2511 = new Class236((byte)1, 1.0F);
		field2501 = new Class236((byte)2, 2.0F);
		field2502 = new Class236((byte)3, 1.5F);
		field2503 = new Class236((byte)4, 2.5F);
		field2508 = new Class236((byte)5, 3.0F);
		field2505 = new Class236((byte)6, 3.5F);
		field2499 = new Class236((byte)7, 4.0F);
		field2500 = method4005();
		Class547.method9548();
	}

	public Class236(byte var1, float var2) {
		this.field2507 = var1;
		this.field2509 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field2507;
	}

	@ObfInfo(owner = "hv", name = "ag", desc = "(B)[Ljb;")
	public static Class236[] method4005() {
		return new Class236[]{field2503, field2512, field2505, field2511, field2501, field2499, field2504, field2508, field2502};
	}

	@ObfInfo(name = "jw", desc = "(Lde;ZI)V", opaque = "1857759722")
	public static void method4492(Class83 var0, boolean var1) {
		for (int var3 = 0; var3 < var0.field1027; ++var3) {
			Class102 var4 = var0.field1013[var0.field1028[var3]];
			if (var4 != null && var4.method2254() && var4.field1309.field1970 == var1 && var4.field1309.method3690()) {
				int var5 = var4.field1266 >> 7;
				int var6 = var4.field1229 >> 7;
				if (var5 >= 0 && var5 < var0.field1030 && var6 >= 0 && var6 < var0.field1018) {
					if (var4.field1232 == 1 && (var4.field1266 & 127) == 64 && (var4.field1229 & 127) == 64) {
						if (Client.field643 == var0.field1036[var5][var6]) {
							continue;
						}

						var0.field1036[var5][var6] = Client.field643;
					}

					long var7 = Class296.method4129(0, 0, 1, !var4.field1309.field1974, var0.field1028[var3], var0.field1026);
					var4.field1233 = Client.field541;
					var0.field1014.method5263(var0.field1016, var4.field1266, var4.field1229, Client.method3531(var0, var4.field1232 * 64 - 64 + var4.field1266, var4.field1229 + (var4.field1232 * 64 - 64), var0.field1016), var4.field1232 * 64 - 64 + 60, var4, var4.field1230, var7, var4.field1231);
				}
			}
		}

	}
}
