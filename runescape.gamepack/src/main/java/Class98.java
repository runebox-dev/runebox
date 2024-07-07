import io.runebox.ObfInfo;

@ObfInfo(name = "dt")
public class Class98 implements Class393 {
	@ObfInfo(name = "ak", desc = "Ldt;")
	public static final Class98 field1201;
	@ObfInfo(name = "ad", desc = "Ldt;")
	public static final Class98 field1202;
	@ObfInfo(name = "ag", desc = "Ldt;")
	public static final Class98 field1203;
	@ObfInfo(name = "aq", desc = "Ldt;")
	public static final Class98 field1204;
	@ObfInfo(name = "ap", desc = "Ldt;")
	public static final Class98 field1205;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1435071827)
	public final int field1206;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -40741879)
	public final int field1207;

	static {
		field1204 = new Class98(0, -1);
		field1202 = new Class98(1, 1);
		field1203 = new Class98(2, 7);
		field1201 = new Class98(3, 8);
		field1205 = new Class98(4, 9);
	}

	public Class98(int var1, int var2) {
		this.field1206 = var1;
		this.field1207 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field1207;
	}

	@ObfInfo(owner = "cr", name = "ag", desc = "(I)[Ldt;")
	public static Class98[] method2119() {
		return new Class98[]{field1203, field1201, field1204, field1205, field1202};
	}

	@ObfInfo(name = "ad", desc = "(Lmu;I)V", opaque = "-380315748")
	public static void method2632(Class333 var0) {
		if (!Class323.field3468.contains(var0)) {
			Class323.field3468.add(var0);
		}

	}
}
