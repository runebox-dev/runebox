import io.runebox.ObfInfo;

@ObfInfo(name = "oq")
public class Class381 {
	@ObfInfo(name = "al", desc = "Loq;")
	public static final Class381 field4468;
	@ObfInfo(name = "ak", desc = "Loq;")
	public static final Class381 field4469;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 684695629)
	public final int field4470;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -153254801)
	public final int field4471;

	static {
		field4469 = new Class381(51, 27, 800, 0, 16, 16);
		field4468 = new Class381(25, 28, 800, 656, 40, 40);
	}

	public Class381(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field4470 = var5;
		this.field4471 = var6;
	}

	@ObfInfo(owner = "ii", name = "ak", desc = "(I)[Loq;")
	public static Class381[] method4119() {
		return new Class381[]{field4469, field4468};
	}
}
