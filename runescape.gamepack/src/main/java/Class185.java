import io.runebox.ObfInfo;

public class Class185 implements Class393 {
	@ObfInfo(name = "al", desc = "Lhc;")
	public static final Class185 field1921;
	@ObfInfo(name = "ak", desc = "Lhc;")
	public static final Class185 field1922;
	@ObfInfo(name = "aj", desc = "Lhc;")
	public static final Class185 field1924;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 91144155)
	public final int field1920;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -2096204705)
	public final int field1923;

	static {
		field1922 = new Class185(2, 0);
		field1921 = new Class185(0, 1);
		field1924 = new Class185(1, 2);
	}

	public Class185(int var1, int var2) {
		this.field1923 = var1;
		this.field1920 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field1920;
	}

	@ObfInfo(owner = "dk", name = "az", desc = "(I)[Lhc;")
	public static Class185[] method2403() {
		return new Class185[]{field1921, field1924, field1922};
	}
}
