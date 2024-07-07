import io.runebox.ObfInfo;

@ObfInfo(name = "fr")
public class Class148 implements Class393 {
	@ObfInfo(name = "ag", desc = "Lfr;")
	public static final Class148 field1668;
	@ObfInfo(name = "aq", desc = "Lfr;")
	public static final Class148 field1669;
	@ObfInfo(name = "av", desc = "Lfr;")
	public static final Class148 field1670;
	@ObfInfo(name = "ad", desc = "Lfr;")
	public static final Class148 field1672;
	@ObfInfo(name = "ak", desc = "Lfr;")
	public static final Class148 field1673;
	@ObfInfo(name = "aj", desc = "Lfr;")
	public static final Class148 field1674;
	@ObfInfo(name = "ab", desc = "Lfr;")
	public static final Class148 field1675;
	@ObfInfo(name = "an", desc = "Lfr;")
	public static final Class148 field1676;
	@ObfInfo(name = "ap", desc = "Lfr;")
	public static final Class148 field1677;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 273837669)
	public final int field1671;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1831211699)
	public final int field1678;

	static {
		field1669 = new Class148(0, 0);
		field1672 = new Class148(1, 1);
		field1668 = new Class148(2, 2);
		field1673 = new Class148(3, 3);
		field1677 = new Class148(4, 4);
		field1676 = new Class148(5, 5);
		field1674 = new Class148(6, 6);
		field1670 = new Class148(7, 7);
		field1675 = new Class148(8, 8);
	}

	public Class148(int var1, int var2) {
		this.field1671 = var1;
		this.field1678 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field1678;
	}

	@ObfInfo(owner = "gz", name = "ag", desc = "(II)Lfr;", opaque = "1381974394")
	public static Class148 method3617(int var0) {
		Class148[] var2 = new Class148[]{field1669, field1672, field1668, field1673, field1677, field1676, field1674, field1670, field1675};
		Class148 var3 = (Class148)Class406.method4071(var2, var0);
		if (var3 == null) {
			var3 = field1675;
		}

		return var3;
	}
}
