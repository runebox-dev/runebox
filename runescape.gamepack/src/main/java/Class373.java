import io.runebox.ObfInfo;

@ObfInfo(name = "oi")
public class Class373 {
	@ObfInfo(name = "ak", desc = "Loi;")
	public static final Class373 field4433;
	@ObfInfo(name = "ad", desc = "Loi;")
	public static final Class373 field4434;
	@ObfInfo(name = "ag", desc = "Loi;")
	public static final Class373 field4435;
	@ObfInfo(name = "aq", desc = "Loi;")
	public static final Class373 field4436;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 43822321)
	public final int field4438;
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	public final String field4437;

	static {
		field4436 = new Class373("LIVE", 0);
		field4434 = new Class373("BUILDLIVE", 3);
		field4435 = new Class373("RC", 1);
		field4433 = new Class373("WIP", 2);
	}

	public Class373(String var1, int var2) {
		this.field4437 = var1;
		this.field4438 = var2;
	}

	@ObfInfo(owner = "lu", name = "aq", desc = "(I)[Loi;")
	public static Class373[] method5853() {
		return new Class373[]{field4433, field4435, field4434, field4436};
	}

	@ObfInfo(owner = "mi", name = "ad", desc = "(IB)Loi;")
	public static Class373 method6284(int var0) {
		Class373[] var2 = method5853();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Class373 var4 = var2[var3];
			if (var4.field4438 == var0) {
				return var4;
			}
		}

		return null;
	}
}
