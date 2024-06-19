import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class74 {
	public static final BigInteger field909;
	public static final BigInteger field911;

	static {
		field911 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field909 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	public static long method7131() {
		try {
			URL var1 = new URL(Client.method8428("services", false) + "m=accountappeal/login.ws");
			URLConnection var2 = var1.openConnection();
			var2.setRequestProperty("connection", "close");
			var2.setDoInput(true);
			var2.setDoOutput(true);
			var2.setConnectTimeout(5000);
			OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
			var3.write("data1=req");
			var3.flush();
			InputStream var4 = var2.getInputStream();
			Class521 var5 = new Class521(new byte[1000]);

			do {
				int var6 = var4.read(var5.field5221, var5.field5219, 1000 - var5.field5219);
				if (var6 == -1) {
					var5.field5219 = 0;
					long var9 = var5.method9411();
					return var9;
				}

				var5.field5219 += var6;
			} while(var5.field5219 < 1000);

			return 0L;
		} catch (Exception var8) {
			return 0L;
		}
	}

	public static boolean method2085(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1;
	}

	public static int method68(long var0, String var2) {
		Random var4 = new Random();
		Class521 var5 = new Class521(128);
		Class521 var6 = new Class521(128);
		int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
		var5.method9388(10);

		int var8;
		for (var8 = 0; var8 < 4; ++var8) {
			var5.method9590(var4.nextInt());
		}

		var5.method9590(var7[0]);
		var5.method9590(var7[1]);
		var5.method9393(var0);
		var5.method9393(0L);

		for (var8 = 0; var8 < 4; ++var8) {
			var5.method9590(var4.nextInt());
		}

		var5.method9430(field911, field909);
		var6.method9388(10);

		for (var8 = 0; var8 < 3; ++var8) {
			var6.method9590(var4.nextInt());
		}

		var6.method9393(var4.nextLong());
		var6.method9392(var4.nextLong());
		Client.method2301(var6);
		var6.method9393(var4.nextLong());
		var6.method9430(field911, field909);
		var8 = Class521.method7983(var2);
		if (0 != var8 % 8) {
			var8 += 8 - var8 % 8;
		}

		Class521 var9 = new Class521(var8);
		var9.method9473(var2);
		var9.field5219 = var8;
		var9.method9581(var7);
		Class521 var10 = new Class521(var5.field5219 + 5 + var6.field5219 + var9.field5219);
		var10.method9388(2);
		var10.method9388(var5.field5219);
		var10.method9548(var5.field5221, 0, var5.field5219);
		var10.method9388(var6.field5219);
		var10.method9548(var6.field5221, 0, var6.field5219);
		var10.method9389(var9.field5219);
		var10.method9548(var9.field5221, 0, var9.field5219);
		String var11 = Class416.method3598(var10.field5221);

		try {
			URL var12 = new URL(Client.method8428("services", false) + "m=accountappeal/login.ws");
			URLConnection var13 = var12.openConnection();
			var13.setDoInput(true);
			var13.setDoOutput(true);
			var13.setConnectTimeout(5000);
			OutputStreamWriter var14 = new OutputStreamWriter(var13.getOutputStream());
			var14.write("data2=" + Class99.method2520(var11) + "&dest=" + Class99.method2520("passwordchoice.ws"));
			var14.flush();
			InputStream var15 = var13.getInputStream();
			var10 = new Class521(new byte[1000]);

			do {
				int var16 = var15.read(var10.field5221, var10.field5219, 1000 - var10.field5219);
				if (var16 == -1) {
					var14.close();
					var15.close();
					String var18 = new String(var10.field5221);
					if (var18.startsWith("OFFLINE")) {
						return 4;
					} else if (var18.startsWith("WRONG")) {
						return 7;
					} else if (var18.startsWith("RELOAD")) {
						return 3;
					} else if (var18.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var10.method9427(var7);

						while (var10.field5219 > 0 && 0 == var10.field5221[var10.field5219 - 1]) {
							--var10.field5219;
						}

						var18 = new String(var10.field5221, 0, var10.field5219);
						if (method7103(var18)) {
							Class40.method7134(var18, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var10.field5219 += var16;
			} while(var10.field5219 < 1000);

			return 5;
		} catch (Throwable var17) {
			var17.printStackTrace();
			return 5;
		}
	}

	public static boolean method7103(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var3) {
				return false;
			}
		}
	}
}
