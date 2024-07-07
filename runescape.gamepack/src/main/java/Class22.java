import io.runebox.ObfInfo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfInfo(name = "av")
class Class22 implements TlsAuthentication {
	// $FF: synthetic field
	public final Class16 this$2;

	public Class22(Class16 var1) {
		this.this$2 = var1;
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.field86 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfInfo(name = "pc", desc = "(I)V", opaque = "-1205493336")
	public static void method340() {
		if (Client.field585 && Client.field107 != null) {
			int var1 = Client.field107.field1080[0];
			int var2 = Client.field107.field1127[0];
			if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
				return;
			}

			Client.field271 = Client.field107.field1065;
			int var3 = Client.method790(Client.field3857, Client.field107.field1065, Client.field107.field1126, Client.field3857.field1300) - Client.field522;
			if (var3 < Client.field2629) {
				Client.field2629 = var3;
			}

			Client.field897 = Client.field107.field1126;
			Client.field585 = false;
		}

	}
}
