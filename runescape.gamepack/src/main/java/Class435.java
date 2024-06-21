import io.runebox.ObfInfo;
import java.applet.Applet;
import java.net.URL;

@ObfInfo(name = "qs")
public class Class435 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 2054006819)
	public int field4722;

	public Class435(int var1, boolean var2) {
		this.field4722 = var1;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method7981() {
		return this.field4722;
	}

	@ObfInfo(name = "al", desc = "(Ljava/lang/String;ILjava/lang/String;I)Z", opaque = "-857559192")
	public static boolean method7982(String var0, int var1, String var2) {
		String var4;
		if (var1 == 0) {
			try {
				if (!Class40.field279.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var13 = 0; var13 < var0.length(); ++var13) {
						if (var4.indexOf(var0.charAt(var13)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var5 = Class40.field282;
				Object[] var10000 = new Object[]{(new URL(Class40.field282.getCodeBase(), var0)).toString()};
				var4 = null;
				return var4 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				Class40.field282.getAppletContext().showDocument(new URL(Class40.field282.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Class45.method850(Class40.field282, "loggedout");
			} catch (Throwable var12) {
			}

			try {
				Class40.field282.getAppletContext().showDocument(new URL(Class40.field282.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
