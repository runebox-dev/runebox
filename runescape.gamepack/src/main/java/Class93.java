import io.runebox.ObfInfo;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfInfo(name = "do")
public class Class93 implements Callable {
	public Object call() {
		return method7497();
	}

	@ObfInfo(owner = "pp", name = "ak", desc = "(I)Ljava/security/SecureRandom;")
	public static SecureRandom method7497() {
		SecureRandom var1 = new SecureRandom();
		var1.nextInt();
		return var1;
	}

	@ObfInfo(name = "me", desc = "(Lnx;III)V", opaque = "-1831036579")
	public static void method2450(Class362 var0, int var1, int var2) {
		if (var0.field3818 == 0) {
			var0.field3826 = var0.field3888;
		} else if (var0.field3818 == 1) {
			var0.field3826 = (var1 - var0.field3828) / 2 + var0.field3888;
		} else if (var0.field3818 == 2) {
			var0.field3826 = var1 - var0.field3828 - var0.field3888;
		} else if (var0.field3818 == 3) {
			var0.field3826 = var0.field3888 * var1 >> 14;
		} else if (var0.field3818 == 4) {
			var0.field3826 = (var0.field3888 * var1 >> 14) + (var1 - var0.field3828) / 2;
		} else {
			var0.field3826 = var1 - var0.field3828 - (var0.field3888 * var1 >> 14);
		}

		if (var0.field3878 == 0) {
			var0.field3827 = var0.field3823;
		} else if (var0.field3878 == 1) {
			var0.field3827 = (var2 - var0.field3829) / 2 + var0.field3823;
		} else if (var0.field3878 == 2) {
			var0.field3827 = var2 - var0.field3829 - var0.field3823;
		} else if (var0.field3878 == 3) {
			var0.field3827 = var0.field3823 * var2 >> 14;
		} else if (var0.field3878 == 4) {
			var0.field3827 = (var0.field3823 * var2 >> 14) + (var2 - var0.field3829) / 2;
		} else {
			var0.field3827 = var2 - var0.field3829 - (var0.field3823 * var2 >> 14);
		}

	}
}
