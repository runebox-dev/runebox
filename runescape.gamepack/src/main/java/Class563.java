import io.runebox.ObfInfo;

@ObfInfo(name = "vq")
public class Class563 implements Class393 {
	@ObfInfo(name = "ad", desc = "Lvq;")
	public static final Class563 field5477;
	@ObfInfo(name = "aq", desc = "Lvq;")
	public static final Class563 field5478;
	@ObfInfo(name = "ag", desc = "Lvq;")
	public static final Class563 field5479;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -484581119)
	public final int field5476;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1671682405)
	public final int field5480;

	static {
		field5478 = new Class563(0, 0);
		field5477 = new Class563(1, 1);
		field5479 = new Class563(2, 2);
	}

	public Class563(int var1, int var2) {
		this.field5476 = var1;
		this.field5480 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field5480;
	}

	@ObfInfo(owner = "ft", name = "ag", desc = "(I)[Lvq;")
	public static Class563[] method3243() {
		return new Class563[]{field5478, field5479, field5477};
	}
}
