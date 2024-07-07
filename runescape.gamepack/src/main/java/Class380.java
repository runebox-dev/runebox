import io.runebox.ObfInfo;

@ObfInfo(name = "op")
public class Class380 {
	@ObfInfo(name = "ag", desc = "[I")
	public static int[] field4505;
	@ObfInfo(name = "ad", desc = "[Z")
	public static final boolean[] field4502;

	static {
		field4502 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
		field4505 = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			field4505[var1] = var0 / 4;
		}

	}
}
