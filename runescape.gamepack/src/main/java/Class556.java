import io.runebox.ObfInfo;

@ObfInfo(name = "vj")
public class Class556 implements Class393 {
	@ObfInfo(name = "ad", desc = "Lvj;")
	public static final Class556 field5442;
	@ObfInfo(name = "an", desc = "Lvj;")
	public static final Class556 field5443;
	@ObfInfo(name = "aq", desc = "Lvj;")
	public static final Class556 field5444;
	@ObfInfo(name = "ap", desc = "Lvj;")
	public static final Class556 field5445;
	@ObfInfo(name = "ak", desc = "Lvj;")
	public static final Class556 field5446;
	@ObfInfo(name = "ag", desc = "Lvj;")
	public static final Class556 field5447;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1804310925)
	public final int field5441;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -270693175)
	public final int field5448;

	static {
		field5444 = new Class556(5, 0);
		field5442 = new Class556(4, 2);
		field5447 = new Class556(0, 5);
		field5446 = new Class556(1, 6);
		field5445 = new Class556(2, 7);
		field5443 = new Class556(3, 8);
	}

	public Class556(int var1, int var2) {
		this.field5448 = var1;
		this.field5441 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field5441;
	}

	@ObfInfo(name = "ag", desc = "(S)Z")
	public boolean method9764() {
		return field5442 == this;
	}
}
