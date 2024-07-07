import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.Iterator;

@ObfInfo(name = "op")
public class Class380 {
	@ObfInfo(name = "aj", desc = "[I")
	public static int[] field4466;
	@ObfInfo(name = "al", desc = "[Z")
	public static final boolean[] field4464;

	static {
		field4464 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false};
		field4466 = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			field4466[var1] = var0 / 4;
		}

	}

	@ObfInfo(name = "az", desc = "(III)V", opaque = "472109482")
	public static void method7208(int var0, int var1) {
		Class332.method3185(var0, var1, 0, 0);
		Class332.field3456.clear();
		Class332.field3458.clear();
		if (Class332.field3455.isEmpty() || var0 == 0 && var1 == 0) {
			Class332.method2354();
		} else {
			Class332.field3458.add(new Class426((Class447)null, Class332.field3460));
			Class332.field3458.add(new Class430((Class447)null, 0, false, Class332.field3461));
			ArrayList var4 = new ArrayList();
			Iterator var5 = Class332.field3455.iterator();

			while (var5.hasNext()) {
				Class357 var6 = (Class357)var5.next();
				var4.add(var6);
			}

			Class332.field3458.add(new Class441((Class447)null, var4));
		}

	}
}
