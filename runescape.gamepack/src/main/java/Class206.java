import io.runebox.ObfInfo;

@ObfInfo(name = "hx")
public class Class206 implements Class393 {
	@ObfInfo(name = "ad", desc = "Lhx;")
	public static final Class206 field2238;
	@ObfInfo(name = "ag", desc = "Lhx;")
	public static final Class206 field2242;
	@ObfInfo(name = "aq", desc = "Lhx;")
	public static final Class206 field2243;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1881852725)
	public final int field2240;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1807067017)
	public final int field2241;

	static {
		field2243 = new Class206(0, 0);
		field2238 = new Class206(2, 1);
		field2242 = new Class206(1, 2);
	}

	public Class206(int var1, int var2) {
		this.field2240 = var1;
		this.field2241 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field2241;
	}

	@ObfInfo(owner = "kh", name = "ag", desc = "(I)[Lhx;")
	public static Class206[] method5055() {
		return new Class206[]{field2243, field2242, field2238};
	}
}
