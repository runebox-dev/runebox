import io.runebox.ObfInfo;

@ObfInfo(name = "ie")
public class Class213 implements Class393 {
	@ObfInfo(name = "al", desc = "Lie;")
	public static final Class213 field2157;
	@ObfInfo(name = "aj", desc = "Lie;")
	public static final Class213 field2158;
	@ObfInfo(name = "ak", desc = "Lie;")
	public static final Class213 field2160;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1906955675)
	public final int field2156;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -574374745)
	public final int field2159;

	static {
		field2160 = new Class213(2, 0);
		field2157 = new Class213(0, 1);
		field2158 = new Class213(1, 2);
	}

	public Class213(int var1, int var2) {
		this.field2159 = var1;
		this.field2156 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field2156;
	}

	@ObfInfo(owner = "eh", name = "az", desc = "(I)[Lie;")
	public static Class213[] method2875() {
		return new Class213[]{field2157, field2158, field2160};
	}
}
