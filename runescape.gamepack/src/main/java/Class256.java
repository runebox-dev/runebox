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

	@ObfInfo(owner = "ky", name = "az", desc = "(BI)Ljv;", opaque = "-109535211")
	public static Class256 method5753(byte var0) {
		Class256[] var2 = field2708;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Class256 var4 = var2[var3];
			if (var4.field2707 == var0) {
				return var4;
			}
		}

		throw new RuntimeException("Could not find MoveSpeed with ID " + var0);
	}

	@ObfInfo(name = "at", desc = "(Lcl;Lcl;IZI)I", opaque = "32767")
	public static int method4904(Class64 var0, Class64 var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var5 = var0.field475;
			int var6 = var1.field475;
			if (!var3) {
				if (var5 == -1) {
					var5 = 2001;
				}

				if (var6 == -1) {
					var6 = 2001;
				}
			}

			return var5 - var6;
		} else if (var2 == 2) {
			return var0.field482 - var1.field482;
		} else if (var2 == 3) {
			if (var0.field477.equals("-")) {
				if (var1.field477.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.field477.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.field477.compareTo(var1.field477);
			}
		} else if (var2 == 4) {
			return var0.method1142() ? (var1.method1142() ? 0 : 1) : (var1.method1142() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1155() ? (var1.method1155() ? 0 : 1) : (var1.method1155() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.method1147() ? (var1.method1147() ? 0 : 1) : (var1.method1147() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.method1175() ? (var1.method1175() ? 0 : 1) : (var1.method1175() ? -1 : 0);
		} else {
			return var0.field473 - var1.field473;
		}
	}
}
