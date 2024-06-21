import io.runebox.ObfInfo;
import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

@ObfInfo(name = "au")
class Class21 implements SSLSession {
	// $FF: synthetic field
	@ObfInfo(desc = "Laq;")
	public final Class17 this$1;

	public Class21(Class17 var1) {
		this.this$1 = var1;
	}

	@ObfInfo(desc = "()I")
	public int getApplicationBufferSize() {
		return 0;
	}

	@ObfInfo(desc = "()Ljava/lang/String;")
	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "()J")
	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "()[B")
	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "()J")
	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "()[Ljava/security/cert/Certificate;")
	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "()Ljava/security/Principal;")
	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "()I")
	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "()[Ljavax/security/cert/X509Certificate;")
	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfInfo(desc = "()[Ljava/security/cert/Certificate;")
	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field86;
	}

	@ObfInfo(desc = "()Ljava/lang/String;")
	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "()I")
	public int getPeerPort() {
		return 0;
	}

	@ObfInfo(desc = "()Ljava/security/Principal;")
	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfInfo(desc = "()Ljava/lang/String;")
	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "()Ljavax/net/ssl/SSLSessionContext;")
	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "(Ljava/lang/String;)Ljava/lang/Object;")
	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "()[Ljava/lang/String;")
	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "()V")
	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "()Z")
	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "(Ljava/lang/String;Ljava/lang/Object;)V")
	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(desc = "(Ljava/lang/String;)V")
	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}
}
