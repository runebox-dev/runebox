import io.runebox.ObfInfo;

@ObfInfo(name = "kd")
public class Class264 {
	@ObfInfo(desc = "(IIII)I")
	public static int method3281(int var0, int var1, int var2, int var3) {
		return var2 * var0 + var3 * var1 >> 16;
	}

	@ObfInfo(desc = "(I)F")
	public static float method3408(int var0) {
		float var2 = 10075.0F - (float)var0;
		return (var2 * 1.0075567F - 75.56675F) / var2;
	}
}
