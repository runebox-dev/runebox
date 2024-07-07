import io.runebox.ObfInfo;

@ObfInfo(name = "uy")
public class Class545 implements Class393 {
	@ObfInfo(name = "bk", desc = "Ljava/lang/String;")
	public static String field5340;
	@ObfInfo(name = "ak", desc = "Luy;")
	public static final Class545 field5333;
	@ObfInfo(name = "al", desc = "Luy;")
	public static final Class545 field5336;
	@ObfInfo(name = "aj", desc = "Luy;")
	public static final Class545 field5337;
	@ObfInfo(name = "at", desc = "Lui;")
	public final Class529 field5339;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -147741281)
	public final int field5335;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1239690253)
	public final int field5341;
	@ObfInfo(name = "aa", desc = "Ljava/lang/Class;")
	public final Class field5338;

	static {
		field5333 = new Class545(2, 0, Integer.class, new Class526());
		field5336 = new Class545(1, 1, Long.class, new Class535());
		field5337 = new Class545(0, 2, String.class, new Class523());
	}

	public Class545(int var1, int var2, Class var3, Class529 var4) {
		this.field5335 = var1;
		this.field5341 = var2;
		this.field5338 = var3;
		this.field5339 = var4;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field5341;
	}

	@ObfInfo(name = "af", desc = "(Lua;B)Ljava/lang/Object;")
	public Object method9893(Class521 var1) {
		return this.field5339.method9644(var1);
	}

	@ObfInfo(name = "az", desc = "(B)[Luy;")
	public static Class545[] method9900() {
		return new Class545[]{field5336, field5333, field5337};
	}
}
