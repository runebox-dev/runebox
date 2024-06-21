import io.runebox.ObfInfo;

public class Class62 {
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1142179225)
	public int field452;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -582057783)
	public int field453;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1246959339)
	public int field455;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1490913279)
	public int field456;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1628070977)
	public int field457;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1945940723)
	public int field459;
	@ObfInfo(name = "ab", desc = "Ljava/lang/String;")
	public String field454;
	@ObfInfo(name = "at", desc = "Ljava/lang/String;")
	public String field458;

	@ObfInfo(name = "ak", desc = "([Lpc;II)Lpc;", opaque = "-612728295")
	public static Class393 method1112(Class393[] var0, int var1) {
		for (int var4 = 0; var4 < var0.length; ++var4) {
			Class393 var5 = var0[var4];
			if (var5.method175() == var1) {
				return var5;
			}
		}

		return null;
	}
}
