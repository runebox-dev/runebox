import io.runebox.ObfInfo;

@ObfInfo(name = "fi")
public class Class139 implements Class393 {
	@ObfInfo(name = "ag", desc = "Lfi;")
	public static final Class139 field1615;
	@ObfInfo(name = "ap", desc = "Lfi;")
	public static final Class139 field1616;
	@ObfInfo(name = "ad", desc = "Lfi;")
	public static final Class139 field1617;
	@ObfInfo(name = "ak", desc = "Lfi;")
	public static final Class139 field1618;
	@ObfInfo(name = "aq", desc = "Lfi;")
	public static final Class139 field1625;
	@ObfInfo(name = "an", desc = "Lfi;")
	public static final Class139 field1627;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 669295793)
	public final int field1621;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 1253664005)
	public final int field1622;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 426669381)
	public final int field1623;

	static {
		field1625 = new Class139(0, 0, (String)null, 0);
		field1617 = new Class139(1, 1, (String)null, 9);
		field1615 = new Class139(2, 2, (String)null, 3);
		field1618 = new Class139(3, 3, (String)null, 6);
		field1616 = new Class139(4, 4, (String)null, 1);
		field1627 = new Class139(5, 5, (String)null, 3);
	}

	public Class139(int var1, int var2, String var3, int var4) {
		this.field1621 = var1;
		this.field1622 = var2;
		this.field1623 = var4;
	}

	@ObfInfo(name = "ap", desc = "(I)I")
	public int method3141() {
		return this.field1623;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field1622;
	}

	@ObfInfo(owner = "ci", name = "ak", desc = "(IB)Lfi;", opaque = "7")
	public static Class139 method1273(int var0) {
		Class139 var2 = (Class139)Class406.method4071(Class441.method8134(), var0);
		if (var2 == null) {
			var2 = field1625;
		}

		return var2;
	}

	@ObfInfo(name = "im", desc = "(Lde;B)V", opaque = "12")
	public static void method3147(Class83 var0) {
		int[] var2 = var0.field1017.field1407;

		int var3;
		for (var3 = 0; var3 < var0.field1017.field1402; ++var3) {
			Class80 var4 = var0.field1024[var2[var3]];
			if (var4 != null && var4.field1244 > 0) {
				--var4.field1244;
				if (var4.field1244 == 0) {
					var4.field1249 = null;
				}
			}
		}

		for (var3 = 0; var3 < var0.field1027; ++var3) {
			int var6 = var0.field1028[var3];
			Class102 var5 = var0.field1013[var6];
			if (var5 != null && var5.field1244 > 0) {
				--var5.field1244;
				if (0 == var5.field1244) {
					var5.field1249 = null;
				}
			}
		}

	}
}
