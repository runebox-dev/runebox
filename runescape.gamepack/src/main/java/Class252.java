import io.runebox.ObfInfo;

public class Class252 {
	@ObfInfo(name = "al", desc = "Ljr;")
	public static final Class252 field2678;
	@ObfInfo(name = "ak", desc = "Ljr;")
	public static final Class252 field2679;

	static {
		field2679 = new Class252(-1);
		field2678 = new Class252(1);
	}

	public Class252(int var1) {
	}

	@ObfInfo(name = "ng", desc = "(Lnb;I)Z", opaque = "2330075")
	public static boolean method4780(Class340 var0) {
		if (var0.field3803 == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < var0.field3803.length; ++var2) {
				int var3 = Client.method9206(var0, var2);
				int var4 = var0.field3804[var2];
				if (2 == var0.field3803[var2]) {
					if (var3 >= var4) {
						return false;
					}
				} else if (3 == var0.field3803[var2]) {
					if (var3 <= var4) {
						return false;
					}
				} else if (4 == var0.field3803[var2]) {
					if (var4 == var3) {
						return false;
					}
				} else if (var4 != var3) {
					return false;
				}
			}

			return true;
		}
	}
}
