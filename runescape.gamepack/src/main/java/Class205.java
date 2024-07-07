import io.runebox.ObfInfo;

@ObfInfo(name = "hw")
public class Class205 extends Class507 {
	@ObfInfo(name = "aj", desc = "Llm;")
	public static Class299 field2084;
	@ObfInfo(name = "ak", desc = "Lor;")
	public static Class382 field2088;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 50356669)
	public int field2085;

	static {
		field2084 = new Class299(64);
	}

	public Class205() {
		this.field2085 = 0;
	}

	@ObfInfo(name = "aj", desc = "(Lua;I)V", opaque = "-553659953")
	public void method3942(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method3943(var1, var3);
		}
	}

	@ObfInfo(name = "az", desc = "(Lua;II)V", opaque = "481880328")
	public void method3943(Class521 var1, int var2) {
		if (var2 == 5) {
			this.field2085 = var1.method9407();
		}

	}

	@ObfInfo(owner = "hq", name = "ak", desc = "(Lor;B)V")
	public static void method3880(Class382 var0) {
		field2088 = var0;
		Client.field2083 = field2088.method7237(16);
	}

	@ObfInfo(owner = "je", name = "al", desc = "(II)Lhw;", opaque = "-1459518751")
	public static Class205 method4659(int var0) {
		Class205 var2 = (Class205)field2084.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2088.method7216(16, var0);
			var2 = new Class205();
			if (var3 != null) {
				var2.method3942(new Class521(var3));
			}

			field2084.method5987(var2, (long)var0);
			return var2;
		}
	}
}
