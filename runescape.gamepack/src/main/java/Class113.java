import io.runebox.ObfInfo;

@ObfInfo(name = "ei")
public class Class113 implements Class393 {
	@ObfInfo(name = "aq", desc = "Lei;")
	public static final Class113 field1418;
	@ObfInfo(name = "ad", desc = "Lei;")
	public static final Class113 field1419;
	@ObfInfo(name = "ak", desc = "Lei;")
	public static final Class113 field1420;
	@ObfInfo(name = "ap", desc = "Lei;")
	public static final Class113 field1422;
	@ObfInfo(name = "ag", desc = "Lei;")
	public static final Class113 field1423;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1126248633)
	public final int field1421;

	static {
		field1418 = new Class113(0);
		field1419 = new Class113(1);
		field1423 = new Class113(2);
		field1420 = new Class113(3);
		field1422 = new Class113(4);
	}

	public Class113(int var1) {
		this.field1421 = var1;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field1421;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;Lth;I)Lth;", opaque = "846909064")
	public static Class502 method2910(Class562 var0, Class502 var1) {
		int var3 = var0.method9902();
		int var4;
		if (var1 == null) {
			var4 = Class337.method7475(var3);
			var1 = new Class502(var4);
		}

		for (var4 = 0; var4 < var3; ++var4) {
			boolean var5 = var0.method9902() == 1;
			int var6 = var0.method9830();
			Object var7;
			if (var5) {
				var7 = new Class497(var0.method9837());
			} else {
				var7 = new Class508(var0.method9832());
			}

			var1.method8902((Class520)var7, (long)var6);
		}

		return var1;
	}

	@ObfInfo(owner = "ft", name = "ag", desc = "(B)[Lei;")
	public static Class113[] method3244() {
		return new Class113[]{field1419, field1422, field1423, field1418, field1420};
	}
}
