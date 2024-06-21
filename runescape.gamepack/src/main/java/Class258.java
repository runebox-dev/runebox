import io.runebox.ObfInfo;

@ObfInfo(name = "jx")
public class Class258 {
	@ObfInfo(name = "aq", desc = "(II)Ljl;", opaque = "-15533869")
	public static Class246 method4922(int var0) {
		Class246 var2 = (Class246)Class211.field2148.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			Class382 var4 = Client.field2123;
			Class382 var5 = Client.field2131;
			boolean var6 = true;
			int[] var7 = var4.method7226(var0);

			for (int var8 = 0; var8 < var7.length; ++var8) {
				byte[] var9 = var4.method7224(var0, var7[var8]);
				if (var9 == null) {
					var6 = false;
				} else {
					int var10 = (var9[0] & 255) << 8 | var9[1] & 255;
					byte[] var11 = var5.method7224(var10, 0);
					if (var11 == null) {
						var6 = false;
					}
				}
			}

			Class246 var3;
			if (!var6) {
				var3 = null;
			} else {
				try {
					var3 = new Class246(var4, var5, var0, false);
				} catch (Exception var12) {
					var3 = null;
				}
			}

			if (var3 != null) {
				Class211.field2148.method5987(var3, (long)var0);
			}

			return var3;
		}
	}

	@ObfInfo(name = "au", desc = "(I)V")
	public static void method4923() {
		Class211.field2129.method5995();
		Class211.field2148.method5995();
		Class211.field2132.method5995();
	}
}
