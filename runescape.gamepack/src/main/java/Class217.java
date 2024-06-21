import io.runebox.ObfInfo;

@ObfInfo(name = "ii")
public class Class217 extends Class507 {
	@ObfInfo(name = "al", desc = "Llm;")
	public static Class299 field2188;
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field2184;
	@ObfInfo(name = "aj", desc = "C")
	public char field2185;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1594880197)
	public int field2186;
	@ObfInfo(name = "af", desc = "Ljava/lang/String;")
	public String field2187;

	static {
		field2188 = new Class299(64);
	}

	public Class217() {
		this.field2184 = true;
	}

	@ObfInfo(name = "aj", desc = "(I)V")
	public void method4099() {
	}

	@ObfInfo(name = "az", desc = "(Lua;I)V")
	public void method4100(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method4101(var1, var3);
		}
	}

	@ObfInfo(name = "af", desc = "(Lua;IB)V", opaque = "0")
	public void method4101(Class521 var1, int var2) {
		if (var2 == 1) {
			this.field2185 = Class405.method3288(var1.method9406());
		} else if (var2 == 2) {
			this.field2186 = var1.method9410();
		} else if (var2 == 4) {
			this.field2184 = false;
		} else if (var2 == 5) {
			this.field2187 = var1.method9415();
		}

	}

	@ObfInfo(name = "aa", desc = "(I)Z", opaque = "446925683")
	public boolean method4117() {
		return this.field2185 == 's';
	}
}
