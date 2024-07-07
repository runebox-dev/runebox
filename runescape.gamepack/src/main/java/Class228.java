import io.runebox.ObfInfo;

@ObfInfo(name = "it")
public class Class228 extends Class507 {
	@ObfInfo(name = "al", desc = "Llm;")
	public static Class299 field2393;
	@ObfInfo(name = "ak", desc = "Lor;")
	public static Class382 field2397;
	@ObfInfo(name = "aa", desc = "[I")
	public static final int[] field2392;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1882753779)
	public int field2394;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1148518977)
	public int field2395;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -2059703331)
	public int field2396;

	static {
		field2393 = new Class299(64);
		field2392 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2392[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfInfo(name = "aj", desc = "(Lua;B)V", opaque = "7")
	public void method4389(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method4381(var1, var3);
		}
	}

	@ObfInfo(name = "az", desc = "(Lua;IB)V", opaque = "1")
	public void method4381(Class521 var1, int var2) {
		if (var2 == 1) {
			this.field2394 = var1.method9407();
			this.field2395 = var1.method9405();
			this.field2396 = var1.method9405();
		}

	}

	@ObfInfo(owner = "bg", name = "al", desc = "(II)Lit;", opaque = "1505481636")
	public static Class228 method714(int var0) {
		Class228 var2 = (Class228)field2393.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2397.method7216(14, var0);
			var2 = new Class228();
			if (var3 != null) {
				var2.method4389(new Class521(var3));
			}

			field2393.method5987(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(owner = "lv", name = "af", desc = "(B)V")
	public static void method6158() {
		field2393.method5995();
	}
}
