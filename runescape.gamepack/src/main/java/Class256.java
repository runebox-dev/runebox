import io.runebox.ObfInfo;

@ObfInfo(name = "jv")
public class Class256 implements Class393 {
	@ObfInfo(name = "av", desc = "[Ljv;")
	public static Class256[] field2708;
	@ObfInfo(name = "ab", desc = "Ljv;")
	public static final Class256 field2697;
	@ObfInfo(name = "ak", desc = "Ljv;")
	public static final Class256 field2698;
	@ObfInfo(name = "al", desc = "Ljv;")
	public static final Class256 field2699;
	@ObfInfo(name = "aj", desc = "Ljv;")
	public static final Class256 field2700;
	@ObfInfo(name = "af", desc = "Ljv;")
	public static final Class256 field2701;
	@ObfInfo(name = "at", desc = "Ljv;")
	public static final Class256 field2703;
	@ObfInfo(name = "az", desc = "Ljv;")
	public static final Class256 field2704;
	@ObfInfo(name = "ac", desc = "Ljv;")
	public static final Class256 field2705;
	@ObfInfo(name = "aa", desc = "Ljv;")
	public static final Class256 field2706;
	@ObfInfo(name = "ao", desc = "B")
	public final byte field2707;
	@ObfInfo(name = "ah", desc = "F")
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

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field2707;
	}
}
