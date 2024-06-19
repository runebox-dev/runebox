public class Class493 implements Class393 {
	public static final Class493 field5005;
	public static final Class493 field5006;
	public static final Class493 field5007;
	public static final Class493 field5010;
	public final int field5008;
	public final int field5009;

	static {
		field5010 = new Class493(3, 1);
		field5005 = new Class493(0, 2);
		field5006 = new Class493(2, 3);
		field5007 = new Class493(1, 10);
	}

	public Class493(int var1, int var2) {
		this.field5008 = var1;
		this.field5009 = var2;
	}

	public int method175() {
		return this.field5009;
	}

	public static void method8960(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				Class99.method2511(var0 - 1L);
				Class99.method2511(1L);
			} else {
				Class99.method2511(var0);
			}

		}
	}
}
