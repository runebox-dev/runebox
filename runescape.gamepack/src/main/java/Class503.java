import io.runebox.ObfInfo;

@ObfInfo(name = "ti")
public class Class503 {
	@ObfInfo(name = "an", desc = "[I")
	public static final int[] field5079;
	@ObfInfo(name = "ap", desc = "[I")
	public static final int[] field5080;

	static {
		field5080 = new int[16384];
		field5079 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5080[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field5079[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}

	@ObfInfo(owner = "nc", name = "aq", desc = "(III)I")
	public static int method6409(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	@ObfInfo(owner = "ie", name = "ad", desc = "(II)I")
	public static int method4076(int var0) {
		return field5080[var0 & 16383];
	}

	@ObfInfo(owner = "aj", name = "ag", desc = "(II)I")
	public static int method144(int var0) {
		return field5079[var0 & 16383];
	}
}
