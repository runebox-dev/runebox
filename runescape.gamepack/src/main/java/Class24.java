import io.runebox.ObfInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

@ObfInfo(name = "ax")
public class Class24 extends SSLSocketFactory {
	@ObfInfo(name = "al", desc = "Lax;")
	public static Class24 field130;
	@ObfInfo(name = "ak", desc = "Ljava/security/SecureRandom;")
	public SecureRandom field131;

	static {
		if (Security.getProvider("BC") == null) {
			Security.addProvider(new BouncyCastleProvider());
		}

	}

	public Class24() {
		this.field131 = new SecureRandom();
	}

	@ObfInfo(desc = "(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;")
	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (var1 == null) {
			var1 = new Socket();
		}

		if (!var1.isConnected()) {
			var1.connect(new InetSocketAddress(var2, var3));
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field131);
		return this.method368(var2, var5);
	}

	@ObfInfo(desc = "()[Ljava/lang/String;")
	public String[] getDefaultCipherSuites() {
		return null;
	}

	@ObfInfo(desc = "()[Ljava/lang/String;")
	public String[] getSupportedCipherSuites() {
		return null;
	}

	@ObfInfo(desc = "(Ljava/lang/String;I)Ljava/net/Socket;")
	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null;
	}

	@ObfInfo(desc = "(Ljava/net/InetAddress;I)Ljava/net/Socket;")
	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null;
	}

	@ObfInfo(desc = "(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;")
	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null;
	}

	@ObfInfo(desc = "(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;")
	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null;
	}

	@ObfInfo(name = "al", desc = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;I)Ljavax/net/ssl/SSLSocket;")
	public SSLSocket method368(String var1, TlsClientProtocol var2) {
		return new Class17(this, var2, var1);
	}

	@ObfInfo(name = "ak", desc = "(I)Lax;", opaque = "-1935020918")
	public static Class24 method354() {
		if (field130 == null) {
			field130 = new Class24();
		}

		return field130;
	}
}
