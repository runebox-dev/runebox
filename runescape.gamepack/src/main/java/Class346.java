import io.runebox.ObfInfo;

@ObfInfo(name = "nh")
public class Class346 {
	@ObfInfo(owner = "nt", name = "aq", desc = "(IIII)I", opaque = "-932875866")
	public static int method6604(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfInfo(name = "af", desc = "(ILdg;ZI)I", opaque = "-1875344852")
	public static int method6483(int var0, Class85 var1, boolean var2) {
		Class362 var4 = Client.field4644.method6417(Class70.field865[--Class80.field1598]);
		if (var0 == 2800) {
			Class70.field865[++Class80.field1598 - 1] = Class345.method5695(Client.method3446(var4));
			return 1;
		} else if (var0 != 2801) {
			if (var0 == 2802) {
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
