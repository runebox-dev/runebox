import io.runebox.ObfInfo;

@ObfInfo(name = "gz")
public class Class182 {
	@ObfInfo(name = "ag", desc = "[S")
	public short[] field1909;
	@ObfInfo(name = "ak", desc = "[S")
	public short[] field1910;

	public Class182(int var1) {
		Class187 var2 = Class187.method3421(var1);
		if (var2.method3758()) {
			this.field1909 = new short[var2.field2033.length];
			System.arraycopy(var2.field2033, 0, this.field1909, 0, this.field1909.length);
		}

		if (var2.method3759()) {
			this.field1910 = new short[var2.field2018.length];
			System.arraycopy(var2.field2018, 0, this.field1910, 0, this.field1910.length);
		}

	}

	@ObfInfo(owner = "iw", name = "aq", desc = "(ILvp;B)Lgz;", opaque = "16")
	public static Class182 method4430(int var0, Class562 var1) {
		int var3 = var1.method9902();
		boolean var4 = 0 != (var3 & 1);
		boolean var5 = 0 != (var3 & 2);
		Class182 var6 = new Class182(var0);
		int var7;
		int[] var8;
		boolean var9;
		int var10;
		short var11;
		if (var4) {
			var7 = var1.method9902();
			var8 = new int[]{var7 & 15, var7 >> 4 & 15};
			var9 = var6.field1909 != null && var8.length == var6.field1909.length;

			for (var10 = 0; var10 < 2; ++var10) {
				if (var8[var10] != 15) {
					var11 = (short)var1.method9997();
					if (var9) {
						var6.field1909[var8[var10]] = var11;
					}
				}
			}
		}

		if (var5) {
			var7 = var1.method9902();
			var8 = new int[]{var7 & 15, var7 >> 4 & 15};
			var9 = var6.field1910 != null && var6.field1910.length == var8.length;

			for (var10 = 0; var10 < 2; ++var10) {
				if (15 != var8[var10]) {
					var11 = (short)var1.method9997();
					if (var9) {
						var6.field1910[var8[var10]] = var11;
					}
				}
			}
		}

		return var6;
	}
}
