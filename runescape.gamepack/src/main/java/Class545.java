public class Class545 implements Class393 {
	public static String field5340;
	public static final Class545 field5333;
	public static final Class545 field5336;
	public static final Class545 field5337;
	public final Class529 field5339;
	public final int field5335;
	public final int field5341;
	public final Class field5338;

	static {
		field5333 = new Class545(2, 0, Integer.class, new Class526());
		field5336 = new Class545(1, 1, Long.class, new Class535());
		field5337 = new Class545(0, 2, String.class, new Class523());
	}

	public Class545(int var1, int var2, Class var3, Class529 var4) {
		this.field5335 = var1;
		this.field5341 = var2;
		this.field5338 = var3;
		this.field5339 = var4;
	}

	public int method175() {
		return this.field5341;
	}

	public Object method9893(Class521 var1) {
		return this.field5339.method9644(var1);
	}

	public static Class545[] method9900() {
		return new Class545[]{field5336, field5333, field5337};
	}
}
