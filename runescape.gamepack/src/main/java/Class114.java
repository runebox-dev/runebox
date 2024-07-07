import io.runebox.ObfInfo;

@ObfInfo(name = "ej")
public class Class114 implements Class393 {
	@ObfInfo(name = "ak", desc = "Lej;")
	public static final Class114 field1431;
	@ObfInfo(name = "al", desc = "Lej;")
	public static final Class114 field1432;
	@ObfInfo(name = "aj", desc = "Lej;")
	public static final Class114 field1433;
	@ObfInfo(name = "az", desc = "Lej;")
	public static final Class114 field1434;
	@ObfInfo(name = "af", desc = "Lej;")
	public static final Class114 field1438;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1536688327)
	public final int field1436;

	static {
		field1431 = new Class114(0);
		field1432 = new Class114(1);
		field1433 = new Class114(2);
		field1434 = new Class114(3);
		field1438 = new Class114(4);
	}

	public Class114(int var1) {
		this.field1436 = var1;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field1436;
	}

	@ObfInfo(owner = "di", name = "az", desc = "(B)[Lej;")
	public static Class114[] method2385() {
		return new Class114[]{field1438, field1434, field1431, field1432, field1433};
	}
}
