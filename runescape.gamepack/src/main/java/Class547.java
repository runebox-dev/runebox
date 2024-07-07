import io.runebox.ObfInfo;

@ObfInfo(name = "va")
public class Class547 {
	@ObfInfo(name = "ap", desc = "(I)Ljava/lang/String;", opaque = "-101179886")
	public static String method9548() {
		StringBuilder var1 = new StringBuilder();
		Class236[] var2 = Class236.field2500;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Class236 var4 = var2[var3];
			var1.append(var4.field2507);
			var1.append(", ");
		}

		String var5 = var1.toString();
		return var5.substring(0, var5.length() - 2);
	}
}
