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
	@ObfInfo(name = "this$1", desc = "Laq;")
	public final Class17 this$1;

	public Class21(Class17 var1) {
		this.this$1 = var1;
	}

	@ObfInfo(name = "getApplicationBufferSize", desc = "()I")
	public int getApplicationBufferSize() {
		return 0;
	}

	@ObfInfo(name = "getCipherSuite", desc = "()Ljava/lang/String;")
	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "getCreationTime", desc = "()J")
	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "getId", desc = "()[B")
	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "getLastAccessedTime", desc = "()J")
	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "getLocalCertificates", desc = "()[Ljava/security/cert/Certificate;")
	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "getLocalPrincipal", desc = "()Ljava/security/Principal;")
	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "getPacketBufferSize", desc = "()I")
	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "getPeerCertificateChain", desc = "()[Ljavax/security/cert/X509Certificate;")
	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfInfo(name = "getPeerCertificates", desc = "()[Ljava/security/cert/Certificate;")
	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field86;
	}

	@ObfInfo(name = "getPeerHost", desc = "()Ljava/lang/String;")
	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "getPeerPort", desc = "()I")
	public int getPeerPort() {
		return 0;
	}

	@ObfInfo(name = "getPeerPrincipal", desc = "()Ljava/security/Principal;")
	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	@ObfInfo(name = "getProtocol", desc = "()Ljava/lang/String;")
	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "getSessionContext", desc = "()Ljavax/net/ssl/SSLSessionContext;")
	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "getValue", desc = "(Ljava/lang/String;)Ljava/lang/Object;")
	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "getValueNames", desc = "()[Ljava/lang/String;")
	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "invalidate", desc = "()V")
	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "isValid", desc = "()Z")
	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "putValue", desc = "(Ljava/lang/String;Ljava/lang/Object;)V")
	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	@ObfInfo(name = "removeValue", desc = "(Ljava/lang/String;)V")
	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}
}
