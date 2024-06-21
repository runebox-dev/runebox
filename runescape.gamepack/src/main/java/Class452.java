import io.runebox.ObfInfo;

public class Class452 {
	@ObfInfo(name = "os", desc = "(Ljava/lang/String;ZI)Ljava/lang/String;", opaque = "1225028476")
	public static String method8428(String var0, boolean var1) {
		String var3 = var1 ? "https://" : "http://";
		if (1 == Client.field532) {
			var0 = var0 + "-wtrc";
		} else if (2 == Client.field532) {
			var0 = var0 + "-wtqa";
		} else if (3 == Client.field532) {
			var0 = var0 + "-wtwip";
		} else if (5 == Client.field532) {
			var0 = var0 + "-wti";
		} else if (Client.field532 == 4) {
			var0 = "local";
		}

		String var4 = "";
		if (Client.field4720 != null) {
			var4 = "/p=" + Client.field4720;
		}

		String var5 = "runescape.com";
		return var3 + var0 + "." + var5 + "/l=" + Client.field2071 + "/a=" + Client.field1751 + var4 + "/";
	}
}
