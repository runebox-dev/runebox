import io.runebox.ObfInfo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfInfo(name = "en")
public class Class118 extends Class105 {
	@ObfInfo(name = "ap", desc = "Z")
	public final boolean field1437;

	public Class118(boolean var1, int var2) {
		super(var2);
		this.field1437 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lez;I)V", opaque = "1635944784")
	public void method2777(Class130 var1) throws IOException {
		URLConnection var3 = null;
		boolean var10 = false;

		label124: {
			HttpURLConnection var13;
			label125: {
				try {
					var10 = true;
					String var4 = var1.field1523.getProtocol();
					if (var4.equals("http")) {
						var3 = this.method2954(var1);
					} else {
						if (!var4.equals("https")) {
							var1.field1522 = Class130.field1525;
							var10 = false;
							break label124;
						}

						var3 = this.method2951(var1);
					}

					this.method2778(var3, var1);
					var10 = false;
					break label125;
				} catch (IOException var11) {
					var1.field1522 = Class130.field1525;
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

	@ObfInfo(name = "aa", desc = "(Lez;B)Ljava/net/URLConnection;")
	public URLConnection method2954(Class130 var1) throws IOException {
		URLConnection var3 = var1.field1523.openConnection();
		this.method2776(var3);
		return var3;
	}

	@ObfInfo(name = "as", desc = "(Lez;B)Ljava/net/URLConnection;", opaque = "0")
	public URLConnection method2951(Class130 var1) throws IOException {
		HttpsURLConnection var3 = (HttpsURLConnection)var1.field1523.openConnection();
		if (!this.field1437) {
			var3.setSSLSocketFactory(Class3.method33());
		}

		this.method2776(var3);
		return var3;
	}
}
