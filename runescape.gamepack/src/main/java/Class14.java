import io.runebox.ObfInfo;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ObfInfo(name = "an")
public class Class14 implements Class7 {
	@ObfInfo(name = "aq", desc = "Ljava/security/MessageDigest;")
	public final MessageDigest field69;

	public Class14(Class2 var1) {
		this.field69 = this.method184();
	}

	@ObfInfo(name = "aq", desc = "(ILjava/lang/String;J)Z")
	public boolean method180(int var1, String var2, long var3) {
		byte[] var5 = this.method188(var2, var3);
		return method179(var5) >= var1;
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/String;J)[B")
	public byte[] method188(String var1, long var2) {
		StringBuilder var4 = new StringBuilder();
		var4.append(var1).append(Long.toHexString(var2));
		this.field69.reset();

		try {
			this.field69.update(var4.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException var6) {
			var6.printStackTrace();
		}

		return this.field69.digest();
	}

	@ObfInfo(name = "ap", desc = "()Ljava/security/MessageDigest;")
	public MessageDigest method184() {
		try {
			return MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException var2) {
			var2.printStackTrace();
			return null;
		}
	}

	@ObfInfo(name = "ad", desc = "([B)I")
	public static int method179(byte[] var0) {
		int var1 = 0;

		for (int var3 = 0; var3 < var0.length; ++var3) {
			byte var4 = var0[var3];
			int var5 = method182(var4);
			var1 += var5;
			if (var5 != 8) {
				break;
			}
		}

		return var1;
	}

	@ObfInfo(name = "ag", desc = "(B)I")
	public static int method182(byte var0) {
		int var1 = 0;
		if (var0 == 0) {
			var1 = 8;
		} else {
			for (int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
				++var1;
			}
		}

		return var1;
	}
}
