import io.runebox.ObfInfo;

@ObfInfo(name = "no")
public class Class353 {
	@ObfInfo(name = "ag", desc = "[I")
	public static int[] field3767;
	@ObfInfo(name = "aq", desc = "[I")
	public static int[] field3768;
	@ObfInfo(name = "ak", desc = "[I")
	public static int[] field3769;

	static {
		field3768 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field3768[var1] = var0 - 1;
			var0 += var0;
		}

		field3767 = new int[5000];
		field3769 = new int[5000];
	}

	@ObfInfo(owner = "gc", name = "aq", desc = "(IB)I")
	public static int method3359(int var0) {
		Class185 var2 = Class185.method2408(var0);
		int var3 = var2.field1995;
		int var4 = var2.field1991;
		int var5 = var2.field1992;
		int var6 = field3768[var5 - var4];
		return field3769[var3] >> var4 & var6;
	}

	@ObfInfo(owner = "ia", name = "ad", desc = "(III)V", opaque = "-1838935502")
	public static void method4043(int var0, int var1) {
		Class185 var3 = Class185.method2408(var0);
		int var4 = var3.field1995;
		int var5 = var3.field1991;
		int var6 = var3.field1992;
		int var7 = field3768[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		field3769[var4] = field3769[var4] & ~var7 | var1 << var5 & var7;
	}
}
