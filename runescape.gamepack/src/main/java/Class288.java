import io.runebox.ObfInfo;

@ObfInfo(name = "lb")
public class Class288 {
	@ObfInfo(name = "aj", desc = "(Lcw;Lcw;IZI)I", opaque = "-254289583")
	public static int method5697(Class75 var0, Class75 var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var5 = var0.field904;
			int var6 = var1.field904;
			if (!var3) {
				if (var5 == -1) {
					var5 = 2001;
				}

				if (var6 == -1) {
					var6 = 2001;
				}
			}

			return var5 - var6;
		} else if (var2 == 2) {
			return var0.field907 - var1.field907;
		} else if (var2 == 3) {
			if (var0.field906.equals("-")) {
				if (var1.field906.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.field906.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.field906.compareTo(var1.field906);
			}
		} else if (var2 == 4) {
			return var0.method2187() ? (var1.method2187() ? 0 : 1) : (var1.method2187() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method2159() ? (var1.method2159() ? 0 : 1) : (var1.method2159() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.method2160() ? (var1.method2160() ? 0 : 1) : (var1.method2160() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.method2157() ? (var1.method2157() ? 0 : 1) : (var1.method2157() ? -1 : 0);
		} else {
			return var0.field902 - var1.field902;
		}
	}
}
