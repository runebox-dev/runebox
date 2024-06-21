import io.runebox.ObfInfo;

@ObfInfo(name = "qg")
public class Class423 {
	@ObfInfo(name = "ak", desc = "[F")
	public float[] field4684;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 330454819)
	public int field4685;

	public Class423(float[] var1, int var2) {
		this.field4684 = var1;
		this.field4685 = var2;
	}

	@ObfInfo(owner = "ls", name = "al", desc = "([FIFI)F", opaque = "-1052148801")
	public static float method6122(float[] var0, int var1, float var2) {
		float var4 = var0[var1];

		for (int var5 = var1 - 1; var5 >= 0; --var5) {
			var4 = var0[var5] + var4 * var2;
		}

		return var4;
	}
}
