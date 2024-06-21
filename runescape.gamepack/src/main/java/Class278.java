import io.runebox.ObfInfo;

@ObfInfo(name = "kr")
public class Class278 {
	@ObfInfo(name = "ak", desc = "Lkr;")
	public static final Class278 field3063;
	@ObfInfo(name = "aj", desc = "Lkr;")
	public static final Class278 field3064;
	@ObfInfo(name = "al", desc = "Lkr;")
	public static final Class278 field3065;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1794501215)
	public final int field3066;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1291217647)
	public final int field3067;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1813165403)
	public final int field3068;

	static {
		field3063 = new Class278(1, 0, 4);
		field3065 = new Class278(2, 1, 2);
		field3064 = new Class278(0, 2, 0);
	}

	public Class278(int var1, int var2, int var3) {
		this.field3066 = var1;
		this.field3067 = var2;
		this.field3068 = var3;
	}

	@ObfInfo(name = "al", desc = "(FB)Z", opaque = "8")
	public boolean method5560(float var1) {
		return var1 >= (float)this.field3068;
	}

	@ObfInfo(name = "ak", desc = "(B)[Lkr;")
	public static Class278[] method5565() {
		return new Class278[]{field3063, field3064, field3065};
	}
}
