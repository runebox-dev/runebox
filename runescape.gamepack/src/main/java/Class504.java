import io.runebox.ObfInfo;

public class Class504 {
	@ObfInfo(name = "ap", desc = "[I")
	public static final int[] field5156;
	@ObfInfo(name = "ae", desc = "[I")
	public static final int[] field5159;

	static {
		field5156 = new int[2048];
		field5159 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field5156[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field5159[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

	}
}
