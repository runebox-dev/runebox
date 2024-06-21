import io.runebox.ObfInfo;

@ObfInfo(name = "dc")
public class Class81 implements Class393 {
	@ObfInfo(name = "az", desc = "Ldc;")
	public static final Class81 field989;
	@ObfInfo(name = "al", desc = "Ldc;")
	public static final Class81 field990;
	@ObfInfo(name = "aa", desc = "Ldc;")
	public static final Class81 field992;
	@ObfInfo(name = "af", desc = "Ldc;")
	public static final Class81 field993;
	@ObfInfo(name = "aj", desc = "Ldc;")
	public static final Class81 field994;
	@ObfInfo(name = "ak", desc = "Ldc;")
	public static final Class81 field996;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -92361051)
	public final int field991;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1019212589)
	public final int field995;

	static {
		field996 = new Class81(0, -1);
		field990 = new Class81(1, 2);
		field994 = new Class81(2, 3);
		field989 = new Class81(3, 4);
		field993 = new Class81(4, 5);
		field992 = new Class81(5, 6);
	}

	public Class81(int var1, int var2) {
		this.field995 = var1;
		this.field991 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field991;
	}

	@ObfInfo(owner = "sq", name = "az", desc = "(I)[Ldc;")
	public static Class81[] method8884() {
		return new Class81[]{field994, field990, field996, field992, field989, field993};
	}
}
