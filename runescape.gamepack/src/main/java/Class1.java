import io.runebox.ObfInfo;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Class1 implements Class10 {
	@ObfInfo(name = "ak", desc = "Ljava/security/MessageDigest;")
	public final MessageDigest field2;

	public Class1(Class3 var1) {
		this.field2 = this.method1();
	}

	@ObfInfo(name = "ak", desc = "(ILjava/lang/String;J)Z")
	public boolean method2(int var1, String var2, long var3) {
		byte[] var5 = this.method9(var2, var3);
		return method16(var5) >= var1;
	}

	@ObfInfo(name = "az", desc = "(Ljava/lang/String;J)[B")
	public byte[] method9(String var1, long var2) {
		StringBuilder var4 = new StringBuilder();
		var4.append(var1).append(Long.toHexString(var2));
		this.field2.reset();

		try {
			this.field2.update(var4.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException var6) {
			var6.printStackTrace();
		}

		return this.field2.digest();
	}

	@ObfInfo(name = "af", desc = "()Ljava/security/MessageDigest;")
	public MessageDigest method1() {
		try {
			return MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException var2) {
			var2.printStackTrace();
			return null;
		}
	}

	@ObfInfo(name = "al", desc = "([B)I")
	public static int method16(byte[] var0) {
		int var1 = 0;

		for (int var3 = 0; var3 < var0.length; ++var3) {
			byte var4 = var0[var3];
			int var5 = method4(var4);
			var1 += var5;
			if (var5 != 8) {
				break;
			}
		}

		return var1;
	}

	@ObfInfo(name = "aj", desc = "(B)I")
	public static int method4(byte var0) {
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
