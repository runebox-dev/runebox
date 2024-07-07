import io.runebox.ObfInfo;

@ObfInfo(name = "hp")
public class Class198 implements Class393 {
	@ObfInfo(name = "ad", desc = "Lhp;")
	public static final Class198 field2179;
	@ObfInfo(name = "ag", desc = "Lhp;")
	public static final Class198 field2180;
	@ObfInfo(name = "aq", desc = "Lhp;")
	public static final Class198 field2186;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1640852387)
	public final int field2181;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1968910549)
	public final int field2185;

	static {
		field2186 = new Class198(2, 0);
		field2179 = new Class198(0, 1);
		field2180 = new Class198(1, 2);
	}

	public Class198(int var1, int var2) {
		this.field2181 = var1;
		this.field2185 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field2185;
	}
}
