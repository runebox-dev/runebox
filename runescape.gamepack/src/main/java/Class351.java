import io.runebox.ObfInfo;
import java.util.Arrays;

public class Class351 {
	@ObfInfo(name = "aj", desc = "[I")
	public static int[] field3888;
	@ObfInfo(name = "az", desc = "[I")
	public static int[] field3889;
	@ObfInfo(name = "ak", desc = "[I")
	public static int[] field3891;

	static {
		field3891 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field3891[var1] = var0 - 1;
			var0 += var0;
		}

		field3888 = new int[5000];
		field3889 = new int[5000];
	}

	@ObfInfo(owner = "mc", name = "ak", desc = "(IB)I")
	public static int method6175(int var0) {
		Class228 var2 = Class228.method714(var0);
		int var3 = var2.field2394;
		int var4 = var2.field2395;
		int var5 = var2.field2396;
		int var6 = field3891[var5 - var4];
		return field3889[var3] >> var4 & var6;
	}

	@ObfInfo(owner = "dr", name = "al", desc = "(III)V")
	public static void method2494(int var0, int var1) {
		Class228 var3 = Class228.method714(var0);
		int var4 = var3.field2394;
		int var5 = var3.field2395;
		int var6 = var3.field2396;
		int var7 = field3891[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		field3889[var4] = field3889[var4] & ~var7 | var1 << var5 & var7;
	}

	@ObfInfo(owner = "it", name = "aj", desc = "(I)V")
	public static void method4380() {
		Arrays.fill(field3888, 0);
		Arrays.fill(field3889, 0);
	}
}
