import io.runebox.ObfInfo;

@ObfInfo(name = "qs")
public class Class435 {
	@ObfInfo(owner = "at", name = "aq", desc = "(D)D")
	public static double method281(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
	}

	@ObfInfo(owner = "jm", name = "ad", desc = "(DDD)D")
	public static double method4828(double var0, double var2, double var4) {
		return method281((var0 - var2) / var4) / var4;
	}

	@ObfInfo(owner = "ep", name = "ag", desc = "(DDII)[D")
	public static double[] method2972(double var0, double var2, int var4) {
		int var6 = var4 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var4;

		for (int var9 = 0; var8 <= var4; ++var9) {
			var7[var9] = method4828((double)var8, var0, var2);
			++var8;
		}

		return var7;
	}
}
