import io.runebox.ObfInfo;

@ObfInfo(name = "hy")
public class Class207 extends Class507 {
	@ObfInfo(name = "ak", desc = "Llm;")
	public static Class299 field2096;

	static {
		field2096 = new Class299(64);
	}

	@ObfInfo(name = "al", desc = "([BIII)Ljava/lang/String;", opaque = "2084895070")
	public static String method3961(byte[] var0, int var1, int var2) {
		StringBuilder var4 = new StringBuilder();

		for (int var5 = var1; var5 < var2 + var1; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(Class416.field4663[var6 >>> 2]);
			if (var5 < var2 - 1) {
				int var7 = var0[var5 + 1] & 255;
				var4.append(Class416.field4663[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var2 - 2) {
					int var8 = var0[var5 + 2] & 255;
					var4.append(Class416.field4663[(var7 & 15) << 2 | var8 >>> 6]).append(Class416.field4663[var8 & 63]);
				} else {
					var4.append(Class416.field4663[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(Class416.field4663[(var6 & 3) << 4]).append("==");
			}
		}

		return var4.toString();
	}

	@ObfInfo(name = "od", desc = "(Ljava/lang/String;I)V", opaque = "-1910951575")
	public static void method3960(String var0) {
		if (!var0.equals("")) {
			Class316 var2 = Class316.method3908(Class315.field3344, Client.field548.field1446);
			var2.field3374.method9388(Class521.method7983(var0));
			var2.field3374.method9473(var0);
			Client.field548.method2897(var2);
		}
	}
}
