import io.runebox.ObfInfo;

public class Class558 implements Class393 {
	@ObfInfo(name = "ak", desc = "Lvm;")
	public static final Class558 field5400;
	@ObfInfo(name = "al", desc = "Lvm;")
	public static final Class558 field5401;
	@ObfInfo(name = "aj", desc = "Lvm;")
	public static final Class558 field5402;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -906848393)
	public final int field5403;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1771953401)
	public final int field5404;

	static {
		field5400 = new Class558(0, 0);
		field5401 = new Class558(1, 1);
		field5402 = new Class558(2, 2);
	}

	public Class558(int var1, int var2) {
		this.field5404 = var1;
		this.field5403 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field5403;
	}

	@ObfInfo(owner = "om", name = "az", desc = "(B)[Lvm;")
	public static Class558[] method7193() {
		return new Class558[]{field5400, field5402, field5401};
	}
}
