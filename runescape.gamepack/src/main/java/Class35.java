import io.runebox.ObfInfo;
import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfInfo(name = "bi")
public class Class35 {
	@ObfInfo(name = "aq", desc = "Ljava/applet/Applet;")
	public static Applet field182;
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public static String field178;

	static {
		field182 = null;
		field178 = "";
	}

	@ObfInfo(owner = "qy", name = "aq", desc = "(Ljava/lang/String;ZZI)V")
	public static void method8133(String var0, boolean var1, boolean var2) {
		method6076(var0, var1, "openjs", var2);
	}

	@ObfInfo(owner = "ma", name = "ad", desc = "(Ljava/lang/String;ZLjava/lang/String;ZB)V", opaque = "6")
	public static void method6076(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var6) {
				}
			}

			if (field178.startsWith("win") && !var3) {
				method797(var0, 0, "openjs");
				return;
			}

			if (field178.startsWith("mac")) {
				method797(var0, 1, var2);
				return;
			}

			method797(var0, 2, "openjs");
		} else {
			method797(var0, 3, "openjs");
		}

	}

	@ObfInfo(owner = "bs", name = "ag", desc = "(Ljava/lang/String;ILjava/lang/String;I)Z", opaque = "1296917026")
	public static boolean method797(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!field178.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var5 = 0; var5 < var0.length(); ++var5) {
						if (var12.indexOf(var0.charAt(var5)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var11 = Class46.method800(field182, var2, new Object[]{(new URL(field182.getCodeBase(), var0)).toString()});
				return var11 != null;
			} catch (Throwable var7) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				field182.getAppletContext().showDocument(new URL(field182.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var4 = field182;
				Object var10000 = null;
			} catch (Throwable var10) {
			}

			try {
				field182.getAppletContext().showDocument(new URL(field182.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var9) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
