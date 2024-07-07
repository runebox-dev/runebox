import io.runebox.ObfInfo;

@ObfInfo(name = "sv")
public class Class490 {
	@ObfInfo(name = "aq", desc = "Lsv;")
	public static final Class490 field5014;
	@ObfInfo(name = "ad", desc = "Lsv;")
	public static final Class490 field5015;
	@ObfInfo(name = "ag", desc = "Lsv;")
	public static final Class490 field5016;

	static {
		field5014 = new Class490();
		field5015 = new Class490();
		field5016 = new Class490();
	}

	@ObfInfo(name = "nu", desc = "(Lnx;I)V", opaque = "396253424")
	public static void method8827(Class362 var0) {
		if (var0 != null && Client.field746 == var0.field3852) {
			Client.field747[var0.field3957] = true;
		}

	}
}
