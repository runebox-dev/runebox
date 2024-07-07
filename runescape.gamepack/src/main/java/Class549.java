import io.runebox.ObfInfo;

@ObfInfo(name = "vc")
public class Class549 {
	@ObfInfo(name = "aq", desc = "Lvc;")
	public static final Class549 field5372;
	@ObfInfo(name = "ad", desc = "Lvc;")
	public static final Class549 field5373;
	@ObfInfo(name = "ag", desc = "Lvc;")
	public static final Class549 field5374;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1040445407)
	public final int field5375;

	static {
		field5372 = new Class549(0);
		field5373 = new Class549(1);
		field5374 = new Class549(2);
	}

	public Class549(int var1) {
		this.field5375 = var1;
	}

	@ObfInfo(owner = "aj", name = "aq", desc = "(II)Lvc;", opaque = "-299330357")
	public static Class549 method145(int var0) {
		Class549[] var2 = new Class549[]{field5373, field5374, field5372};

		for (int var4 = 0; var4 < var2.length; ++var4) {
			Class549 var5 = var2[var4];
			if (var5.field5375 == var0) {
				return var5;
			}
		}

		return null;
	}
}
