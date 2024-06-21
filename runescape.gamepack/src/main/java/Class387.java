import io.runebox.ObfInfo;

public class Class387 implements Class393 {
	@ObfInfo(name = "aj", desc = "Low;")
	public static final Class387 field4522;
	@ObfInfo(name = "ak", desc = "Low;")
	public static final Class387 field4523;
	@ObfInfo(name = "al", desc = "Low;")
	public static final Class387 field4524;
	@ObfInfo(name = "az", desc = "Low;")
	public static final Class387 field4525;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1328107157)
	public final int field4526;

	static {
		field4523 = new Class387(-1);
		field4524 = new Class387(0);
		field4522 = new Class387(1);
		field4525 = new Class387(2);
	}

	public Class387(int var1) {
		this.field4526 = var1;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field4526;
	}

	@ObfInfo(name = "ak", desc = "(Lat;S)Laz;")
	public static Class26 method7379(Class20 var0) {
		switch(var0.field99) {
		case 0:
			return new Class11();
		default:
			throw new IllegalArgumentException();
		}
	}
}
