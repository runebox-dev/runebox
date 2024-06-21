import io.runebox.ObfInfo;

@ObfInfo(name = "ln")
public class Class300 {
	@ObfInfo(name = "ak", desc = "Lln;")
	public static final Class300 field3200;
	@ObfInfo(name = "al", desc = "Lln;")
	public static final Class300 field3201;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -938647203)
	public final int field3202;

	static {
		field3200 = new Class300(0);
		field3201 = new Class300(1);
	}

	public Class300(int var1) {
		this.field3202 = var1;
	}

	@ObfInfo(name = "az", desc = "(FB)F")
	public static float method5999(float var0) {
		float var2 = 75.0F;
		float var3 = 10000.0F;
		float var4 = 750000.0F / (10000.0F - var0 * 9925.0F);
		return (var4 - 75.0F) / 9925.0F;
	}
}
