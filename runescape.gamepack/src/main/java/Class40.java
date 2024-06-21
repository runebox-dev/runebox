import io.runebox.ObfInfo;
import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

public class Class40 {
	@ObfInfo(name = "ak", desc = "Ljava/applet/Applet;")
	public static Applet field282;
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public static String field279;

	static {
		field282 = null;
		field279 = "";
	}

	@ObfInfo(owner = "od", name = "ak", desc = "(Ljava/lang/String;ZZI)V", opaque = "65279")
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
				method7982(var0, 0, "openjs");
			} else if (field279.startsWith("mac")) {
				method7982(var0, 1, "openjs");
			} else {
				method7982(var0, 2, "openjs");
			}
		} else {
			method7982(var0, 3, "openjs");
		}

	}

	@ObfInfo(owner = "qs", name = "al", desc = "(Ljava/lang/String;ILjava/lang/String;I)Z", opaque = "-857559192")
	public static boolean method7982(String var0, int var1, String var2) {
		String var4;
		if (var1 == 0) {
			try {
				if (!field279.startsWith("win")) {
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
				Applet var5 = field282;
				Object[] var10000 = new Object[]{(new URL(field282.getCodeBase(), var0)).toString()};
				var4 = null;
				return var4 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				field282.getAppletContext().showDocument(new URL(field282.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Class45.method850(field282, "loggedout");
			} catch (Throwable var12) {
			}

			try {
				field282.getAppletContext().showDocument(new URL(field282.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(name = "aq", desc = "(III)I", opaque = "313617622")
	public static int method797(int var0, int var1) {
		for (int var3 = 0; var3 < 8; ++var3) {
			if (var1 <= var0 + 30) {
				return var3;
			}

			var0 += 30;
			var0 += var3 != 1 && var3 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfInfo(name = "in", desc = "(Lic;IIILdh;I)V", opaque = "-931224378")
	public static void method794(Class211 var0, int var1, int var2, int var3, Class86 var4) {
		if (Client.field650 < 50) {
			if (var0.field2134 != null && var0.field2134.containsKey(var1)) {
				Class219 var6 = (Class219)var0.field2134.get(var1);
				if (var6 != null) {
					int var7 = var6.field2216 & 31;
					if ((var7 <= 0 || Client.field4851.method2657() != 0) && (var7 != 0 || Client.field4851.method2704() != 0)) {
						boolean var11 = Client.field107 == var4;
						if (var6 != null) {
							if (var6.field2216 == 0) {
								if (!var11) {
									return;
								}

								Client.field511[Client.field650] = 0;
							} else {
								int var12 = (var2 - 64) / 128;
								int var13 = (var3 - 64) / 128;
								Client.field511[Client.field650] = (var13 << 8) + (var12 << 16) + var6.field2216;
							}

							Client.field739[Client.field650] = var6.field2217;
							Client.field563[Client.field650] = var6.field2214;
							Client.field741[Client.field650] = 0;
							Client.field744[Client.field650] = null;
							Client.field743[Client.field650] = var6.field2218;
							++Client.field650;
						}

					}
				}
			}
		}
	}
}
