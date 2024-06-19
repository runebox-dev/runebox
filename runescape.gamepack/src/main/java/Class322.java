public class Class322 implements Class321 {
	public static final Class322 field3395;
	public static final Class322 field3396;
	public static final Class322 field3397;
	public static final Class322 field3398;
	public static final Class322 field3400;
	public static final Class322 field3402;
	public static final Class322 field3403;
	public static final Class322 field3404;
	public static final Class322[] field3405;
	public final int field3399;
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

	public static String method6223(int var0) {
		return "<img=" + var0 + ">";
	}

	public static Class322[] method3236() {
		return new Class322[]{field3395, field3400, field3397, field3398, field3404, field3402, field3396, field3403};
	}
}
