import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

public class Class8 {
	public static Class39 field80;
	public static Class51 field450;
	public static ScheduledExecutorService field2176;
	public Class476 field46;
	public boolean field43;
	public boolean field44;
	public int field45;
	public final Class15 field40;
	public final Class462 field39;
	public final HttpsURLConnection field41;

	public Class8(URL var1, Class15 var2, boolean var3) throws IOException {
		this(var1, var2, new Class462(), var3);
	}

	public Class8(URL var1, Class15 var2, Class462 var3, boolean var4) throws IOException {
		this.field43 = false;
		this.field44 = false;
		this.field45 = 300000;
		if (!var2.method174()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method173());
		} else {
			this.field41 = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.field41.setSSLSocketFactory(Class24.method354());
			}

			this.field40 = var2;
			this.field39 = var3 != null ? var3 : new Class462();
		}
	}

	public Class462 method112() {
		return this.field39;
	}

	public void method125(Class476 var1) {
		if (!this.field43) {
			if (var1 == null) {
				this.field39.method8511("Content-Type");
				this.field46 = null;
			} else {
				this.field46 = var1;
				if (this.field46.method8712() != null) {
					this.field39.method8515(this.field46.method8712());
				} else {
					this.field39.method8516();
				}

			}
		}
	}

	public void method113() throws ProtocolException {
		if (!this.field43) {
			this.field41.setRequestMethod(this.field40.method173());
			this.field39.method8508(this.field41);
			if (this.field40.method183() && this.field46 != null) {
				this.field41.setDoOutput(true);
				ByteArrayOutputStream var2 = new ByteArrayOutputStream();

				try {
					var2.write(this.field46.method8711());
					var2.writeTo(this.field41.getOutputStream());
				} catch (IOException var12) {
					var12.printStackTrace();
				} finally {
					try {
						var2.close();
					} catch (IOException var11) {
						var11.printStackTrace();
					}

				}
			}

			this.field41.setConnectTimeout(this.field45);
			this.field41.setInstanceFollowRedirects(this.field44);
			this.field43 = true;
		}
	}

	public boolean method128() throws IOException {
		if (!this.field43) {
			this.method113();
		}

		this.field41.connect();
		return this.field41.getResponseCode() == -1;
	}

	public Class4 method115() {
		try {
			if (!this.field43 || this.field41.getResponseCode() == -1) {
				return new Class4("No REST response has been received yet.");
			}
		} catch (IOException var11) {
			this.field41.disconnect();
			return new Class4("Error decoding REST response code: " + var11.getMessage());
		}

		Class4 var4;
		try {
			Class4 var2 = new Class4(this.field41);
			return var2;
		} catch (IOException var9) {
			var4 = new Class4("Error decoding REST response: " + var9.getMessage());
		} finally {
			this.field41.disconnect();
		}

		return var4;
	}

	public static Class30 method126(Class182 var0, int var1, int var2) {
		if (0 == Client.field1382) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				Class30 var4 = field450.method166();
				var4.field159 = new int[256 * (Client.field1887 ? 2 : 1)];
				var4.field160 = var2;
				var4.method251();
				var4.field167 = (var2 & -1024) + 1024;
				if (var4.field167 > 16384) {
					var4.field167 = 16384;
				}

				var4.method250(var4.field167);
				if (Client.field2640 > 0 && field80 == null) {
					field80 = new Class39();
					field2176 = Executors.newScheduledThreadPool(1);
					field2176.scheduleAtFixedRate(field80, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (field80 != null) {
					if (field80.field276[var1] != null) {
						throw new IllegalArgumentException();
					}

					field80.field276[var1] = var4;
				}

				return var4;
			} catch (Throwable var5) {
				return new Class30();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static String method127(String var0) {
		StringBuilder var2 = new StringBuilder(var0.length());
		int var3 = 0;
		int var4 = -1;

		for (int var5 = 0; var5 < var0.length(); ++var5) {
			char var6 = var0.charAt(var5);
			if (var6 == '<') {
				var2.append(var0.substring(var3, var5));
				var4 = var5;
			} else if (var6 == '>' && var4 != -1) {
				String var7 = var0.substring(var4 + 1, var5);
				var4 = -1;
				if (var7.equals("lt")) {
					var2.append("<");
				} else if (var7.equals("gt")) {
					var2.append(">");
				} else if (var7.equals("br")) {
					var2.append("\n");
				}

				var3 = var5 + 1;
			}
		}

		if (var3 < var0.length()) {
			var2.append(var0.substring(var3, var0.length()));
		}

		return var2.toString();
	}
}
