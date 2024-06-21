import io.runebox.ObfInfo;

public class Class231 extends Class506 {
	@ObfInfo(name = "aa", desc = "Lnb;")
	public Class340 field2435;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1823911169)
	public int field2433;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1779630249)
	public int field2434;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 625220569)
	public int field2436;

	public Class231(int var1, int var2, int var3, Class340 var4) {
		this.field2434 = var1;
		this.field2433 = var2;
		this.field2436 = var3;
		this.field2435 = var4;
	}

	@ObfInfo(name = "jt", desc = "(Ldt;B)V", opaque = "3")
	public static void method4409(Class98 var0) {
		for (int var2 = 0; var2 < var0.field1296; ++var2) {
			int var3 = var0.field1297[var2];
			Class100 var4 = var0.field1295[var3];
			if (var4 != null) {
				Client.method1081(var0, var4, var4.field1314.field2320);
			}
		}

	}
}
