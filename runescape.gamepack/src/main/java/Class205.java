import io.runebox.ObfInfo;

@ObfInfo(name = "hw")
public class Class205 extends Class507 {
	@ObfInfo(name = "aj", desc = "Llm;")
	public static Class299 field2084;
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

	@ObfInfo(desc = "(LClass382;)V")
	public static void method3880(Class382 var0) {
		Class239.field2088 = var0;
		Client.field2083 = Class239.field2088.method7237(16);
	}
}
