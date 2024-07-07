import io.runebox.ObfInfo;

@ObfInfo(name = "oy")
public class Class389 {
	@ObfInfo(name = "ad", desc = "Loy;")
	public static final Class389 field4556;
	@ObfInfo(name = "aq", desc = "Loy;")
	public static final Class389 field4560;
	@ObfInfo(name = "ag", desc = "[Loy;")
	public static final Class389[] field4558;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1370579203)
	public final int field4557;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -382716461)
	public final int field4559;

	static {
		field4560 = new Class389(51, 27, Class371.field4426, Class350.method6523(0), Class350.method6523(2), Class350.method6523(2));
		field4556 = new Class389(25, 28, Class371.field4426, Class350.method6523(82), Class350.method6523(5), Class350.method6523(5));
		field4558 = method7273();
	}

	public Class389(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field4557 = var5;
		this.field4559 = var6;
	}

	@ObfInfo(name = "aq", desc = "(B)[Loy;")
	public static Class389[] method7273() {
		return new Class389[]{field4560, field4556};
	}
}
