import io.runebox.ObfInfo;

@ObfInfo(name = "fh")
public class Class138 implements Class393 {
	@ObfInfo(name = "ad", desc = "Lfh;")
	public static final Class138 field1607;
	@ObfInfo(name = "ag", desc = "Lfh;")
	public static final Class138 field1608;
	@ObfInfo(name = "ak", desc = "Lfh;")
	public static final Class138 field1609;
	@ObfInfo(name = "ap", desc = "Lfh;")
	public static final Class138 field1610;
	@ObfInfo(name = "aq", desc = "Lfh;")
	public static final Class138 field1611;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1133507491)
	public final int field1612;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -997691535)
	public final int field1614;

	static {
		field1611 = new Class138(0, 0);
		field1607 = new Class138(1, 1);
		field1608 = new Class138(2, 2);
		field1609 = new Class138(3, 3);
		field1610 = new Class138(4, 4);
	}

	public Class138(int var1, int var2) {
		this.field1614 = var1;
		this.field1612 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field1612;
	}

	@ObfInfo(owner = "hi", name = "ag", desc = "(I)[Lfh;")
	public static Class138[] method3858() {
		return new Class138[]{field1611, field1607, field1608, field1609, field1610};
	}

	@ObfInfo(owner = "bh", name = "ak", desc = "(II)Lfh;", opaque = "1670505910")
	public static Class138 method463(int var0) {
		Class138 var2 = (Class138)Class406.method4071(method3858(), var0);
		if (var2 == null) {
			var2 = field1611;
		}

		return var2;
	}
}
