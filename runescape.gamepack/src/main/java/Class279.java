import io.runebox.ObfInfo;

@ObfInfo(name = "ks")
public class Class279 {
	@ObfInfo(owner = "hg", name = "ag", desc = "(IIIB)I", opaque = "-1")
	public static int method3837(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var4;
	}

	@ObfInfo(name = "ai", desc = "(Lnx;I[B[BI)V", opaque = "-1647776469")
	public static void method5584(Class362 var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3889 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3889 = new byte[11][];
			var0.field3962 = new byte[11][];
			var0.field3948 = new int[11];
			var0.field3892 = new int[11];
		}

		var0.field3889[var1] = var2;
		if (var2 != null) {
			var0.field3897 = true;
		} else {
			var0.field3897 = false;

			for (int var5 = 0; var5 < var0.field3889.length; ++var5) {
				if (null != var0.field3889[var5]) {
					var0.field3897 = true;
					break;
				}
			}
		}

		var0.field3962[var1] = var3;
	}
}
