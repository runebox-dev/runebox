public class Class256 implements Class393 {
	public static Class256[] field2708;
	public static final Class256 field2697;
	public static final Class256 field2698;
	public static final Class256 field2699;
	public static final Class256 field2700;
	public static final Class256 field2701;
	public static final Class256 field2703;
	public static final Class256 field2704;
	public static final Class256 field2705;
	public static final Class256 field2706;
	public final byte field2707;
	public final float field2702;

	static {
		field2698 = new Class256((byte)-1, 0.0F);
		field2699 = new Class256((byte)0, 0.5F);
		field2700 = new Class256((byte)1, 1.0F);
		field2704 = new Class256((byte)2, 2.0F);
		field2701 = new Class256((byte)3, 1.5F);
		field2706 = new Class256((byte)4, 2.5F);
		field2703 = new Class256((byte)5, 3.0F);
		field2697 = new Class256((byte)6, 3.5F);
		field2705 = new Class256((byte)7, 4.0F);
		Class256[] var0 = new Class256[]{field2697, field2701, field2699, field2703, field2704, field2705, field2706, field2700, field2698};
		field2708 = var0;
		StringBuilder var4 = new StringBuilder();
		Class256[] var1 = field2708;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Class256 var3 = var1[var2];
			var4.append(var3.field2707);
			var4.append(", ");
		}

		String var5 = var4.toString();
		var5.substring(0, var5.length() - 2);
	}

	public Class256(byte var1, float var2) {
		this.field2707 = var1;
		this.field2702 = var2;
	}

	public int method175() {
		return this.field2707;
	}
}
