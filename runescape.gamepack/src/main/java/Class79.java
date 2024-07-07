import io.runebox.ObfInfo;

@ObfInfo(name = "da")
public class Class79 implements Class393 {
	@ObfInfo(name = "ad", desc = "Lda;")
	public static final Class79 field964;
	@ObfInfo(name = "ag", desc = "Lda;")
	public static final Class79 field965;
	@ObfInfo(name = "ap", desc = "Lda;")
	public static final Class79 field967;
	@ObfInfo(name = "an", desc = "Lda;")
	public static final Class79 field968;
	@ObfInfo(name = "aq", desc = "Lda;")
	public static final Class79 field971;
	@ObfInfo(name = "ak", desc = "Lda;")
	public static final Class79 field972;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1580717867)
	public final int field963;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -2123916961)
	public final int field970;

	static {
		field971 = new Class79(0, -1);
		field964 = new Class79(1, 2);
		field965 = new Class79(2, 3);
		field972 = new Class79(3, 4);
		field967 = new Class79(4, 5);
		field968 = new Class79(5, 6);
	}

	public Class79(int var1, int var2) {
		this.field963 = var1;
		this.field970 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field970;
	}

	@ObfInfo(owner = "aj", name = "ag", desc = "(B)[Lda;")
	public static Class79[] method142() {
		return new Class79[]{field972, field964, field971, field965, field968, field967};
	}
}
