import io.runebox.ObfInfo;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;

@ObfInfo(name = "cz")
public class Class78 {
	@ObfInfo(name = "ap", desc = "Ljava/math/BigInteger;")
	public static final BigInteger field953;
	@ObfInfo(name = "an", desc = "Ljava/math/BigInteger;")
	public static final BigInteger field962;

	static {
		field953 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field962 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfInfo(owner = "cs", name = "aq", desc = "(I)J", opaque = "-1668891893")
	public static long method2131() {
		try {
			URL var1 = new URL(Class77.method2225("services", false) + "m=accountappeal/login.ws");
			URLConnection var2 = var1.openConnection();
			var2.setRequestProperty("connection", "close");
			var2.setDoInput(true);
			var2.setDoOutput(true);
			var2.setConnectTimeout(5000);
			OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
			var3.write("data1=req");
			var3.flush();
			InputStream var4 = var2.getInputStream();
			Class562 var5 = new Class562(new byte[1000]);

			do {
				int var6 = var4.read(var5.field5472, var5.field5471, 1000 - var5.field5471);
				if (var6 == -1) {
					var5.field5471 = 0;
					long var9 = var5.method9833();
					return var9;
				}

				var5.field5471 += var6;
			} while(var5.field5471 < 1000);

			return 0L;
		} catch (Exception var8) {
			return 0L;
		}
	}
}
