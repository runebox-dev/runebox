import io.runebox.ObfInfo;

public class Class82 {
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1502899557)
	public int field999;
	@ObfInfo(name = "al", desc = "Lot;")
	public final Class384 field1000;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 356148869)
	public final int field1001;

	public Class82(Class384 var1, String var2) {
		this.field999 = 0;
		this.field1000 = var1;
		this.field1001 = var1.method7228();
	}

	@ObfInfo(name = "ak", desc = "(S)Z", opaque = "2603")
	public boolean method2245() {
		this.field999 = 0;

		for (int var2 = 0; var2 < this.field1001; ++var2) {
			if (!this.field1000.method7318(var2) || this.field1000.method7329(var2)) {
				++this.field999;
			}
		}

		return this.field999 >= this.field1001;
	}

	@ObfInfo(name = "al", desc = "(DDIB)[D", opaque = "1")
	public static double[] method2248(double var0, double var2, int var4) {
		int var6 = 1 + var4 * 2;
		double[] var7 = new double[var6];
		int var8 = -var4;

		for (int var9 = 0; var8 <= var4; ++var9) {
			var7[var9] = Class417.method5879((double)var8, var0, var2);
			++var8;
		}

		return var7;
	}
}
