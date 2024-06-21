import io.runebox.ObfInfo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfInfo(name = "ep")
public class Class120 extends Class106 {
	@ObfInfo(name = "af", desc = "Z")
	public final boolean field1482;

	public Class120(boolean var1, int var2) {
		super(var2);
		this.field1482 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lea;B)V", opaque = "0")
	public void method2773(Class105 var1) throws IOException {
		URLConnection var3 = null;
		boolean var10 = false;

		label124: {
			HttpURLConnection var13;
			label125: {
				try {
					var10 = true;
					String var4 = var1.field1375.getProtocol();
					if (var4.equals("http")) {
						var3 = this.method2954(var1);
					} else {
						if (!var4.equals("https")) {
							var1.field1372 = Class105.field1369;
							var10 = false;
							break label124;
						}

						var3 = this.method2955(var1);
					}

					this.method2763(var3, var1);
					var10 = false;
					break label125;
				} catch (IOException var11) {
					var1.field1372 = Class105.field1369;
					var10 = false;
				} finally {
					if (var10) {
						if (var3 != null && var3 instanceof HttpURLConnection) {
							HttpURLConnection var7 = (HttpURLConnection)var3;
							var7.disconnect();
						}

					}
				}

				if (var3 != null && var3 instanceof HttpURLConnection) {
					var13 = (HttpURLConnection)var3;
					var13.disconnect();
				}

				return;
			}

			if (var3 != null && var3 instanceof HttpURLConnection) {
				var13 = (HttpURLConnection)var3;
				var13.disconnect();
			}

			return;
		}

		if (var3 != null && var3 instanceof HttpURLConnection) {
			HttpURLConnection var5 = (HttpURLConnection)var3;
			var5.disconnect();
		}

	}

	@ObfInfo(name = "as", desc = "(Lea;I)Ljava/net/URLConnection;")
	public URLConnection method2954(Class105 var1) throws IOException {
		URLConnection var3 = var1.field1375.openConnection();
		this.method2776(var3);
		return var3;
	}

	@ObfInfo(name = "aw", desc = "(Lea;B)Ljava/net/URLConnection;", opaque = "0")
	public URLConnection method2955(Class105 var1) throws IOException {
		HttpsURLConnection var3 = (HttpsURLConnection)var1.field1375.openConnection();
		if (!this.field1482) {
			var3.setSSLSocketFactory(Class24.method354());
		}

		this.method2776(var3);
		return var3;
	}
}
