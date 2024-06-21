import io.runebox.ObfInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfInfo(name = "aq")
class Class17 extends SSLSocket {
	@ObfInfo(name = "ak", desc = "[Ljava/security/cert/Certificate;")
	public Certificate[] field86;
	// $FF: synthetic field
	@ObfInfo(desc = "Lax;")
	public final Class24 this$0;
	// $FF: synthetic field
	@ObfInfo(desc = "Ljava/lang/String;")
	public final String val$host;
	// $FF: synthetic field
	@ObfInfo(desc = "Lorg/bouncycastle/crypto/tls/TlsClientProtocol;")
	public final TlsClientProtocol val$tlsClientProtocol;

	public Class17(Class24 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	@ObfInfo(desc = "()Ljava/io/InputStream;")
	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	@ObfInfo(desc = "()Ljava/io/OutputStream;")
	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	@ObfInfo(desc = "()V")
	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	@ObfInfo(desc = "(Ljavax/net/ssl/HandshakeCompletedListener;)V")
	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@ObfInfo(desc = "()Z")
	public boolean getEnableSessionCreation() {
		return false;
	}

	@ObfInfo(desc = "()[Ljava/lang/String;")
	public String[] getEnabledCipherSuites() {
		return null;
	}

	@ObfInfo(desc = "()[Ljava/lang/String;")
	public String[] getEnabledProtocols() {
		return null;
	}

	@ObfInfo(desc = "()Z")
	public boolean getNeedClientAuth() {
		return false;
	}

	@ObfInfo(desc = "()Ljavax/net/ssl/SSLSession;")
	public SSLSession getSession() {
		return new Class21(this);
	}

	@ObfInfo(desc = "()[Ljava/lang/String;")
	public String[] getSupportedProtocols() {
		return null;
	}

	@ObfInfo(desc = "()[Ljava/lang/String;")
	public String[] getSupportedCipherSuites() {
		return null;
	}

	@ObfInfo(desc = "()Z")
	public boolean getUseClientMode() {
		return false;
	}

	@ObfInfo(desc = "()Z")
	public boolean getWantClientAuth() {
		return false;
	}

	@ObfInfo(desc = "(Ljavax/net/ssl/HandshakeCompletedListener;)V")
	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@ObfInfo(desc = "(Z)V")
	public void setEnableSessionCreation(boolean var1) {
	}

	@ObfInfo(desc = "([Ljava/lang/String;)V")
	public void setEnabledCipherSuites(String[] var1) {
	}

	@ObfInfo(desc = "([Ljava/lang/String;)V")
	public void setEnabledProtocols(String[] var1) {
	}

	@ObfInfo(desc = "(Z)V")
	public void setNeedClientAuth(boolean var1) {
	}

	@ObfInfo(desc = "(Z)V")
	public void setUseClientMode(boolean var1) {
	}

	@ObfInfo(desc = "(Z)V")
	public void setWantClientAuth(boolean var1) {
	}

	@ObfInfo(desc = "()V")
	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new Class16(this));
	}
}
