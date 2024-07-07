import io.runebox.ObfInfo;

@ObfInfo(name = "hc")
public class Class185 extends Class516 {
	@ObfInfo(name = "ad", desc = "Lmo;")
	public static Class327 field1989;
	@ObfInfo(name = "an", desc = "[I")
	public static final int[] field1993;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -957731269)
	public int field1991;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -989672663)
	public int field1992;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -403599393)
	public int field1995;

	static {
		field1989 = new Class327(64);
		field1993 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field1993[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfInfo(name = "ad", desc = "(Lvp;B)V", opaque = "1")
	public void method3711(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method3710(var1, var3);
		}
	}

	@ObfInfo(name = "ag", desc = "(Lvp;II)V", opaque = "-1485306621")
	public void method3710(Class562 var1, int var2) {
		if (var2 == 1) {
			this.field1995 = var1.method9997();
			this.field1991 = var1.method9902();
			this.field1992 = var1.method9902();
		}

	}

	@ObfInfo(owner = "dk", name = "aq", desc = "(II)Lhc;", opaque = "-860239590")
	public static Class185 method2408(int var0) {
		Class185 var2 = (Class185)field1989.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field1990.method7132(14, var0);
			var2 = new Class185();
			if (var3 != null) {
				var2.method3711(new Class562(var3));
			}

			field1989.method6330(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(owner = "fk", name = "ak", desc = "(B)V")
	public static void method3164() {
		field1989.method6332();
	}
}
