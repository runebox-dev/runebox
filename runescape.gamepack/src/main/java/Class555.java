import io.runebox.ObfInfo;

public class Class555 implements Class393 {
	@ObfInfo(name = "al", desc = "Lvj;")
	public static final Class555 field5382;
	@ObfInfo(name = "az", desc = "Lvj;")
	public static final Class555 field5384;
	@ObfInfo(name = "af", desc = "Lvj;")
	public static final Class555 field5385;
	@ObfInfo(name = "aa", desc = "Lvj;")
	public static final Class555 field5386;
	@ObfInfo(name = "aj", desc = "Lvj;")
	public static final Class555 field5388;
	@ObfInfo(name = "ak", desc = "Lvj;")
	public static final Class555 field5389;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -652509963)
	public final int field5383;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1018796563)
	public final int field5387;

	static {
		field5389 = new Class555(5, 0);
		field5382 = new Class555(4, 2);
		field5388 = new Class555(1, 5);
		field5384 = new Class555(3, 6);
		field5385 = new Class555(2, 7);
		field5386 = new Class555(0, 8);
	}

	public Class555(int var1, int var2) {
		this.field5387 = var1;
		this.field5383 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field5383;
	}

	@ObfInfo(name = "az", desc = "(I)Z", opaque = "143509423")
	public boolean method10080() {
		return field5382 == this;
	}
}
