import io.runebox.ObfInfo;

@ObfInfo(name = "qu")
public class Class437 {
	@ObfInfo(name = "aq", desc = "[F")
	public float[] field4759;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1741438289)
	public int field4760;

	public Class437(float[] var1, int var2) {
		this.field4759 = var1;
		this.field4760 = var2;
	}

	@ObfInfo(owner = "km", name = "ad", desc = "([FIFI)F")
	public static float method5112(float[] var0, int var1, float var2) {
		float var4 = var0[var1];

		for (int var5 = var1 - 1; var5 >= 0; --var5) {
			var4 = var4 * var2 + var0[var5];
		}

		return var4;
	}
}
