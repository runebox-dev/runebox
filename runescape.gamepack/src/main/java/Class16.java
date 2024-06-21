import io.runebox.ObfInfo;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfInfo(name = "ap")
class Class16 extends DefaultTlsClient {
	// $FF: synthetic field
	@ObfInfo(name = "this$1", desc = "Laq;")
	public final Class17 this$1;

	public Class16(Class17 var1) {
		this.this$1 = var1;
	}

	@ObfInfo(name = "getClientExtensions", desc = "()Ljava/util/Hashtable;")
	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (var1 == null) {
			var1 = new Hashtable();
		}

		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3);
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2);
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	@ObfInfo(name = "getAuthentication", desc = "()Lorg/bouncycastle/crypto/tls/TlsAuthentication;")
	public TlsAuthentication getAuthentication() throws IOException {
		return new Class22(this);
	}

	@ObfInfo(name = "or", desc = "(Lnb;I)Lnb;", opaque = "-1042332838")
	public static Class340 method193(Class340 var0) {
		int var2 = Class344.method6213(Client.method3511(var0));
		if (var2 == 0) {
			return null;
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				var0 = Client.field25.method6718(var0.field3826);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
