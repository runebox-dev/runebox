import io.runebox.ObfInfo;
import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

@ObfInfo(name = "bn")
public class Class40 {
	@ObfInfo(name = "ak", desc = "Ljava/applet/Applet;")
	public static Applet field282;
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public static String field279;

	static {
		field282 = null;
		field279 = "";
	}

	@ObfInfo(desc = "(Ljava/lang/String;ZZ)V")
	public static void method7134(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (field279.startsWith("win") && !var2) {
				Class435.method7982(var0, 0, "openjs");
			} else if (field279.startsWith("mac")) {
				Class435.method7982(var0, 1, "openjs");
			} else {
				Class435.method7982(var0, 2, "openjs");
			}
		} else {
			Class435.method7982(var0, 3, "openjs");
		}

	}
}
