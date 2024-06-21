import io.runebox.ObfInfo;

@ObfInfo(name = "od")
public class Class368 implements Class393 {
	@ObfInfo(name = "al", desc = "Lod;")
	public static final Class368 field4004;
	@ObfInfo(name = "ak", desc = "Lod;")
	public static final Class368 field4005;
	@ObfInfo(name = "aj", desc = "Lod;")
	public static final Class368 field4006;
	@ObfInfo(name = "az", desc = "Lod;")
	public static final Class368 field4007;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 968730851)
	public final int field4008;

	static {
		field4005 = new Class368(0);
		field4004 = new Class368(1);
		field4006 = new Class368(2);
		field4007 = new Class368(3);
	}

	public Class368(int var1) {
		this.field4008 = var1;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field4008;
	}
}
