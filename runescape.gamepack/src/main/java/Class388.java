import io.runebox.ObfInfo;

@ObfInfo(name = "ox")
public class Class388 implements Class393 {
	@ObfInfo(name = "aq", desc = "Lox;")
	public static final Class388 field4550;
	@ObfInfo(name = "ad", desc = "Lox;")
	public static final Class388 field4551;
	@ObfInfo(name = "ag", desc = "Lox;")
	public static final Class388 field4552;
	@ObfInfo(name = "ak", desc = "Lox;")
	public static final Class388 field4553;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 2138893877)
	public final int field4554;

	static {
		field4550 = new Class388(0);
		field4551 = new Class388(1);
		field4552 = new Class388(2);
		field4553 = new Class388(3);
	}

	public Class388(int var1) {
		this.field4554 = var1;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field4554;
	}
}
