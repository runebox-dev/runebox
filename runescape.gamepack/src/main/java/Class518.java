import io.runebox.ObfInfo;

@ObfInfo(name = "tx")
public class Class518 {
	@ObfInfo(name = "ax", desc = "[I")
	public static final int[] field5218;
	@ObfInfo(name = "az", desc = "[I")
	public static final int[] field5224;

	static {
		field5224 = new int[2048];
		field5218 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field5224[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field5218[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
