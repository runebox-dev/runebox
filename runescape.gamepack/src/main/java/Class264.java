import io.runebox.ObfInfo;

@ObfInfo(name = "kd")
public class Class264 {
	@ObfInfo(owner = "fv", name = "al", desc = "(IIIII)I")
	public static int method3281(int var0, int var1, int var2, int var3) {
		return var2 * var0 + var3 * var1 >> 16;
	}

	@ObfInfo(owner = "ge", name = "aj", desc = "(IB)F")
	public static float method3408(int var0) {
		float var2 = 10075.0F - (float)var0;
		return (var2 * 1.0075567F - 75.56675F) / var2;
	}

	@ObfInfo(owner = "ln", name = "az", desc = "(FB)F")
	public static float method5999(float var0) {
		float var2 = 75.0F;
		float var3 = 10000.0F;
		float var4 = 750000.0F / (10000.0F - var0 * 9925.0F);
		return (var4 - 75.0F) / 9925.0F;
	}
}
