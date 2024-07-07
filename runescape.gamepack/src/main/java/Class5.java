import io.runebox.ObfInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfInfo(name = "ae")
public class Class5 {
	@ObfInfo(name = "ak", desc = "Lsr;")
	public Class486 field25;
	@ObfInfo(name = "ap", desc = "Z")
	public boolean field21;
	@ObfInfo(name = "an", desc = "Z")
	public boolean field24;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 347953321)
	public int field19;
	@ObfInfo(name = "ad", desc = "Lrw;")
	public final Class465 field23;
	@ObfInfo(name = "ag", desc = "Lai;")
	public final Class9 field22;
	@ObfInfo(name = "aq", desc = "Ljavax/net/ssl/HttpsURLConnection;")
	public final HttpsURLConnection field20;

	public Class5(URL var1, Class9 var2, boolean var3) throws IOException {
		this(var1, var2, new Class465(), var3);
	}

	public Class5(URL var1, Class9 var2, Class465 var3, boolean var4) throws IOException {
		this.field21 = false;
		this.field24 = false;
		this.field19 = 300000;
		if (!var2.method126()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method130());
		} else {
			this.field20 = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.field20.setSSLSocketFactory(Class3.method33());
			}

			this.field22 = var2;
			this.field23 = var3 != null ? var3 : new Class465();
		}
	}

	@ObfInfo(name = "aq", desc = "(B)Lrw;")
	public Class465 method43() {
		return this.field23;
	}

	@ObfInfo(name = "ad", desc = "(Lsr;I)V", opaque = "-713727113")
	public void method44(Class486 var1) {
		if (!this.field21) {
			if (var1 == null) {
				this.field23.method8508("Content-Type");
				this.field25 = null;
			} else {
				this.field25 = var1;
				if (this.field25.method8809() != null) {
					this.field23.method8473(this.field25.method8809());
				} else {
					this.field23.method8506();
				}

			}
		}
	}

	@ObfInfo(name = "ag", desc = "(I)V", opaque = "-602181305")
	public void method52() throws ProtocolException {
		if (!this.field21) {
			this.field20.setRequestMethod(this.field22.method130());
			this.field23.method8474(this.field20);
			if (this.field22.method128() && this.field25 != null) {
				this.field20.setDoOutput(true);
				ByteArrayOutputStream var2 = new ByteArrayOutputStream();

				try {
					var2.write(this.field25.method8805());
					var2.writeTo(this.field20.getOutputStream());
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

			this.field20.setConnectTimeout(this.field19);
			this.field20.setInstanceFollowRedirects(this.field24);
			this.field21 = true;
		}
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "-202873158")
	public boolean method46() throws IOException {
		if (!this.field21) {
			this.method52();
		}

		this.field20.connect();
		return this.field20.getResponseCode() == -1;
	}

	@ObfInfo(name = "ap", desc = "(B)Las;", opaque = "-1")
	public Class19 method47() {
		try {
			if (!this.field21 || this.field20.getResponseCode() == -1) {
				return new Class19("No REST response has been received yet.");
			}
		} catch (IOException var11) {
			this.field20.disconnect();
			return new Class19("Error decoding REST response code: " + var11.getMessage());
		}

		Class19 var4;
		try {
			Class19 var2 = new Class19(this.field20);
			return var2;
		} catch (IOException var9) {
			var4 = new Class19("Error decoding REST response: " + var9.getMessage());
		} finally {
			this.field20.disconnect();
		}

		return var4;
	}
}
