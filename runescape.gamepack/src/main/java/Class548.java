import io.runebox.ObfInfo;
import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class Class548 extends RuntimeException {
	@ObfInfo(owner = "uc", name = "aj", desc = "I", intMultiplier = -2084016401)
	public static int field5223;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1257272621)
	public static int field5348;
	@ObfInfo(name = "ak", desc = "Ljava/applet/Applet;")
	public static Applet field5351;
	@ObfInfo(owner = "gz", name = "al", desc = "Ljava/lang/String;")
	public static String field1900;
	@ObfInfo(owner = "gz", name = "ak", desc = "Ljava/lang/String;")
	public static String field1908;
	@ObfInfo(name = "aa", desc = "Ljava/lang/String;")
	public String field5350;
	@ObfInfo(name = "at", desc = "Ljava/lang/Throwable;")
	public Throwable field5349;

	public Class548(Throwable var1, String var2) {
		this.field5350 = var2;
		this.field5349 = var1;
	}

	@ObfInfo(owner = "sr", name = "ak", desc = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", opaque = "902127395")
	public static void method8904(String var0, Throwable var1) {
		try {
			String var3 = "";
			if (var1 != null) {
				var3 = method3057(var1);
			}

			if (var0 != null) {
				if (var1 != null) {
					var3 = var3 + " | ";
				}

				var3 = var3 + var0;
			}

			System.out.println("Error: " + var3);
			var3 = var3.replace(':', '.');
			var3 = var3.replace('@', '_');
			var3 = var3.replace('&', '_');
			var3 = var3.replace('#', '_');
			if (field5351 == null) {
				return;
			}

			URL var4 = new URL(field5351.getCodeBase(), "clienterror.ws?cv=" + field5223 + "&cs=" + field5348 + "&u=" + Class83.field5475 + "&v1=" + field1908 + "&v2=" + field1900 + "&ct=" + Client.field3152 + "&e=" + var3);
			DataInputStream var5 = new DataInputStream(var4.openStream());
			var5.read();
			var5.close();
		} catch (Exception var6) {
		}

	}

	@ObfInfo(owner = "fa", name = "aj", desc = "(Ljava/lang/Throwable;I)Ljava/lang/String;", opaque = "-2131269456")
	public static String method3057(Throwable var0) throws IOException {
		String var2;
		if (var0 instanceof Class548) {
			Class548 var3 = (Class548)var0;
			var2 = var3.field5350 + " | ";
			var0 = var3.field5349;
		} else {
			var2 = "";
		}

		StringWriter var13 = new StringWriter();
		PrintWriter var4 = new PrintWriter(var13);
		var0.printStackTrace(var4);
		var4.close();
		String var5 = var13.toString();
		BufferedReader var6 = new BufferedReader(new StringReader(var5));
		String var7 = var6.readLine();

		while (true) {
			while (true) {
				String var8 = var6.readLine();
				if (var8 == null) {
					var2 = var2 + "| " + var7;
					return var2;
				}

				int var9 = var8.indexOf(40);
				int var10 = var8.indexOf(41, var9 + 1);
				if (var9 >= 0 && var10 >= 0) {
					String var11 = var8.substring(var9 + 1, var10);
					int var12 = var11.indexOf(".java:");
					if (var12 >= 0) {
						var11 = var11.substring(0, var12) + var11.substring(var12 + 5);
						var2 = var2 + var11 + ' ';
						continue;
					}

					var8 = var8.substring(0, var9);
				}

				var8 = var8.trim();
				var8 = var8.substring(var8.lastIndexOf(32) + 1);
				var8 = var8.substring(var8.lastIndexOf(9) + 1);
				var2 = var2 + var8 + ' ';
			}
		}
	}
}
