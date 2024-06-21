import io.runebox.ObfInfo;

public class Class322 implements Class321 {
	@ObfInfo(name = "af", desc = "Lmj;")
	public static final Class322 field3395;
	@ObfInfo(name = "al", desc = "Lmj;")
	public static final Class322 field3396;
	@ObfInfo(name = "az", desc = "Lmj;")
	public static final Class322 field3397;
	@ObfInfo(name = "ak", desc = "Lmj;")
	public static final Class322 field3398;
	@ObfInfo(name = "aa", desc = "Lmj;")
	public static final Class322 field3400;
	@ObfInfo(name = "ab", desc = "Lmj;")
	public static final Class322 field3402;
	@ObfInfo(name = "aj", desc = "Lmj;")
	public static final Class322 field3403;
	@ObfInfo(name = "at", desc = "Lmj;")
	public static final Class322 field3404;
	@ObfInfo(name = "ah", desc = "[Lmj;")
	public static final Class322[] field3405;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1371261987)
	public final int field3399;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 717417699)
	public final int field3401;

	static {
		field3398 = new Class322(14, 0);
		field3396 = new Class322(15, 4);
		field3403 = new Class322(16, -2);
		field3397 = new Class322(18, -2);
		field3395 = new Class322(19, -2);
		field3400 = new Class322(20, 58);
		field3404 = new Class322(21, 37);
		field3402 = new Class322(27, 0);
		field3405 = new Class322[32];
		Class322[] var0 = method3236();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field3405[var0[var1].field3401] = var0[var1];
		}

	}

	public Class322(int var1, int var2) {
		this.field3401 = var1;
		this.field3399 = var2;
	}

	@ObfInfo(owner = "fp", name = "ak", desc = "(I)[Lmj;")
	public static Class322[] method3236() {
		return new Class322[]{field3395, field3400, field3397, field3398, field3404, field3402, field3396, field3403};
	}
}
