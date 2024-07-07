import io.runebox.ObfInfo;

@ObfInfo(name = "jv")
public abstract class Class256 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -2053854627)
	public int field2670;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -2088073837)
	public int field2671;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1036403129)
	public int field2672;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1910215425)
	public int field2674;

	@ObfInfo(name = "aq", desc = "(IIILip;I)Z")
	public abstract boolean method1967(int var1, int var2, int var3, Class224 var4);

	@ObfInfo(name = "ao", desc = "(ILdg;ZI)I", opaque = "-1393024656")
	public static int method4948(int var0, Class85 var1, boolean var2) {
		Class362 var4 = var2 ? Class70.field869 : Class70.field204;
		if (var0 == 1800) {
			Class70.field865[++Class80.field1598 - 1] = Class345.method5695(Client.method3446(var4));
			return 1;
		} else if (var0 != 1801) {
			if (var0 == 1802) {
				if (var4.field3940 == null) {
					Class70.field860[++Class80.field3328 - 1] = "";
				} else {
					Class70.field860[++Class80.field3328 - 1] = var4.field3940;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = Class70.field865[--Class80.field1598];
			--var5;
			if (var4.field3909 != null && var5 < var4.field3909.length && null != var4.field3909[var5]) {
				Class70.field860[++Class80.field3328 - 1] = var4.field3909[var5];
			} else {
				Class70.field860[++Class80.field3328 - 1] = "";
			}

			return 1;
		}
	}
}
