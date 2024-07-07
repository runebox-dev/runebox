import io.runebox.ObfInfo;

@ObfInfo(name = "jl")
public class Class246 extends Class507 {
	@ObfInfo(name = "ak", desc = "[Ljd;")
	public Class238[] field2645;

	public Class246(Class382 var1, Class382 var2, int var3, boolean var4) {
		Class401 var5 = new Class401();
		int var6 = var1.method7237(var3);
		this.field2645 = new Class238[var6];
		int[] var7 = var1.method7226(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.method7216(var3, var7[var8]);
			Class248 var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (Class248 var12 = (Class248)var5.method7482(); var12 != null; var12 = (Class248)var5.method7490()) {
				if (var12.field2656 == var11) {
					var10 = var12;
					break;
				}
			}

			if (var10 == null) {
				byte[] var13;
				if (var4) {
					var13 = var2.method7224(0, var11);
				} else {
					var13 = var2.method7224(var11, 0);
				}

				var10 = new Class248(var11, var13);
				var5.method7477(var10);
			}

			this.field2645[var7[var8]] = new Class238(var9, var10);
		}

	}

	@ObfInfo(name = "ak", desc = "(IB)Z")
	public boolean method4757(int var1) {
		return this.field2645[var1].field2579;
	}
}
