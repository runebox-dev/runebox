import io.runebox.ObfInfo;

@ObfInfo(name = "vh")
public class Class553 {
	@ObfInfo(name = "al", desc = "Lvh;")
	public static final Class553 field5371;
	@ObfInfo(name = "ak", desc = "Lvh;")
	public static final Class553 field5372;
	@ObfInfo(name = "aj", desc = "Lvh;")
	public static final Class553 field5373;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1298431127)
	public final int field5370;

	static {
		field5372 = new Class553(0);
		field5371 = new Class553(1);
		field5373 = new Class553(2);
	}

	public Class553(int var1) {
		this.field5370 = var1;
	}

	@ObfInfo(owner = "ia", name = "ak", desc = "(B)[Lvh;")
	public static Class553[] method3987() {
		return new Class553[]{field5372, field5371, field5373};
	}
}
