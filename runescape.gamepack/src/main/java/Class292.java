import io.runebox.ObfInfo;

@ObfInfo(name = "lf")
public class Class292 extends Class516 {
	@ObfInfo(name = "aq", desc = "[Lkv;")
	public Class282[] field3034;

	public Class292(Class375 var1, Class375 var2, int var3, boolean var4) {
		Class408 var5 = new Class408();
		int var6 = var1.method7144(var3);
		this.field3034 = new Class282[var6];
		int[] var7 = var1.method7143(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.method7132(var3, var7[var8]);
			Class275 var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (Class275 var12 = (Class275)var5.method7526(); var12 != null; var12 = (Class275)var5.method7511()) {
				if (var12.field2813 == var11) {
					var10 = var12;
					break;
				}
			}

			if (var10 == null) {
				byte[] var13;
				if (var4) {
					var13 = var2.method7140(0, var11);
				} else {
					var13 = var2.method7140(var11, 0);
				}

				var10 = new Class275(var11, var13);
				var5.method7506(var10);
			}

			this.field3034[var7[var8]] = new Class282(var9, var10);
		}

	}

	@ObfInfo(name = "ad", desc = "(II)Z")
	public boolean method5734(int var1) {
		return this.field3034[var1].field2975;
	}

	@ObfInfo(owner = "cw", name = "aq", desc = "(Lok;Lok;IZI)Llf;", opaque = "-836714352")
	public static Class292 method2221(Class375 var0, Class375 var1, int var2, boolean var3) {
		boolean var5 = true;
		int[] var6 = var0.method7143(var2);

		for (int var7 = 0; var7 < var6.length; ++var7) {
			byte[] var8 = var0.method7140(var2, var6[var7]);
			if (var8 == null) {
				var5 = false;
			} else {
				int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
				byte[] var10;
				if (var3) {
					var10 = var1.method7140(0, var9);
				} else {
					var10 = var1.method7140(var9, 0);
				}

				if (var10 == null) {
					var5 = false;
				}
			}
		}

		if (!var5) {
			return null;
		} else {
			try {
				return new Class292(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}
}
