import io.runebox.ObfInfo;

@ObfInfo(name = "ti")
public class Class503 {
	@ObfInfo(name = "af", desc = "[I")
	public static final int[] field5149;
	@ObfInfo(name = "aa", desc = "[I")
	public static final int[] field5150;

	static {
		field5149 = new int[16384];
		field5150 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5149[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field5150[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}

	@ObfInfo(owner = "sg", name = "ak", desc = "(III)I")
	public static int method8709(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	@ObfInfo(owner = "ri", name = "al", desc = "(IB)I")
	public static int method8425(int var0) {
		return field5149[var0 & 16383];
	}

	@ObfInfo(owner = "sm", name = "aj", desc = "(II)I")
	public static int method8816(int var0) {
		return field5150[var0 & 16383];
	}
}
