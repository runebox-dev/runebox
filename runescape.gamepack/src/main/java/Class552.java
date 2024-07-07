import io.runebox.ObfInfo;
import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

@ObfInfo(name = "vf")
public class Class552 extends RuntimeException {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -176146183)
	public static int field5416;
	@ObfInfo(owner = "ao", name = "ag", desc = "I", intMultiplier = -528146361)
	public static int field75;
	@ObfInfo(owner = "qm", name = "aq", desc = "Ljava/applet/Applet;")
	public static Applet field4736;
	@ObfInfo(owner = "ik", name = "aq", desc = "Ljava/lang/String;")
	public static String field2386;
	@ObfInfo(owner = "ik", name = "ad", desc = "Ljava/lang/String;")
	public static String field2389;
	@ObfInfo(name = "an", desc = "Ljava/lang/String;")
	public String field5418;
	@ObfInfo(name = "aj", desc = "Ljava/lang/Throwable;")
	public Throwable field5419;

	public Class552(Throwable var1, String var2) {
		this.field5418 = var2;
		this.field5419 = var1;
	}

	@ObfInfo(owner = "rm", name = "aq", desc = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", opaque = "-682367896")
	public static void method8390(String var0, Throwable var1) {
		try {
			String var3 = "";
			if (var1 != null) {
				Throwable var5 = var1;
				String var6;
				if (var1 instanceof Class552) {
					Class552 var7 = (Class552)var1;
					var6 = var7.field5418 + " | ";
					var5 = var7.field5419;
				} else {
					var6 = "";
				}

				StringWriter var19 = new StringWriter();
				PrintWriter var8 = new PrintWriter(var19);
				var5.printStackTrace(var8);
				var8.close();
				String var9 = var19.toString();
				BufferedReader var10 = new BufferedReader(new StringReader(var9));
				String var11 = var10.readLine();

				while (true) {
					String var12 = var10.readLine();
					if (var12 == null) {
						var6 = var6 + "| " + var11;
						var3 = var6;
						break;
					}

					int var13 = var12.indexOf(40);
					int var14 = var12.indexOf(41, var13 + 1);
					if (var13 >= 0 && var14 >= 0) {
						String var15 = var12.substring(var13 + 1, var14);
						int var16 = var15.indexOf(".java:");
						if (var16 >= 0) {
							var15 = var15.substring(0, var16) + var15.substring(var16 + 5);
							var6 = var6 + var15 + ' ';
							continue;
						}

						var12 = var12.substring(0, var13);
					}

					var12 = var12.trim();
					var12 = var12.substring(var12.lastIndexOf(32) + 1);
					var12 = var12.substring(var12.lastIndexOf(9) + 1);
					var6 = var6 + var12 + ' ';
				}
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
			if (field4736 == null) {
				return;
			}

			URL var4 = new URL(field4736.getCodeBase(), "clienterror.ws?cv=" + field75 + "&cs=" + field5416 + "&u=" + Class80.field5417 + "&v1=" + field2386 + "&v2=" + field2389 + "&ct=" + Client.field4903 + "&e=" + var3);
			DataInputStream var18 = new DataInputStream(var4.openStream());
			var18.read();
			var18.close();
		} catch (Exception var17) {
		}

	}
}
