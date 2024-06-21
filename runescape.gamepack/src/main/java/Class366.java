import io.runebox.ObfInfo;

@ObfInfo(name = "ob")
public class Class366 {
	@ObfInfo(name = "ak", desc = "Lob;")
	public static final Class366 field3992;
	@ObfInfo(name = "al", desc = "Lob;")
	public static final Class366 field3993;
	@ObfInfo(name = "aj", desc = "Lob;")
	public static final Class366 field3994;
	@ObfInfo(name = "az", desc = "Lob;")
	public static final Class366 field3995;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -405984643)
	public final int field3997;
	@ObfInfo(name = "af", desc = "Ljava/lang/String;")
	public final String field3996;

	static {
		field3992 = new Class366("LIVE", 0);
		field3993 = new Class366("BUILDLIVE", 3);
		field3994 = new Class366("RC", 1);
		field3995 = new Class366("WIP", 2);
	}

	public Class366(String var1, int var2) {
		this.field3996 = var1;
		this.field3997 = var2;
	}

	@ObfInfo(owner = "ck", name = "ak", desc = "(II)Lob;", opaque = "521275722")
	public static Class366 method1136(int var0) {
		Class366[] var2 = new Class366[]{field3992, field3993, field3994, field3995};

		for (int var4 = 0; var4 < var2.length; ++var4) {
			Class366 var5 = var2[var4];
			if (var5.field3997 == var0) {
				return var5;
			}
		}

		return null;
	}
}
