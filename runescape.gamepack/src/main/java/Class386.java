import io.runebox.ObfInfo;

@ObfInfo(name = "ov")
public class Class386 implements Class393 {
	@ObfInfo(name = "ad", desc = "Lov;")
	public static final Class386 field4536;
	@ObfInfo(name = "ak", desc = "Lov;")
	public static final Class386 field4537;
	@ObfInfo(name = "ag", desc = "Lov;")
	public static final Class386 field4538;
	@ObfInfo(name = "aq", desc = "Lov;")
	public static final Class386 field4541;
	@ObfInfo(name = "ap", desc = "Lov;")
	public static final Class386 field4545;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -386739827)
	public final int field4539;

	static {
		field4541 = new Class386(0);
		field4536 = new Class386(1);
		field4538 = new Class386(2);
		field4537 = new Class386(3);
		field4545 = new Class386(4);
	}

	public Class386(int var1) {
		this.field4539 = var1;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field4539;
	}
}
