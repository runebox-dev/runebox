import io.runebox.ObfInfo;

@ObfInfo(name = "hk")
public class Class193 extends Class507 {
	@ObfInfo(name = "al", desc = "Llm;")
	public static Class299 field1986;
	@ObfInfo(name = "ak", desc = "Lor;")
	public static Class382 field1988;
	@ObfInfo(name = "aj", desc = "Z")
	public boolean field1987;

	static {
		field1986 = new Class299(64);
	}

	public Class193() {
		this.field1987 = false;
	}

	@ObfInfo(name = "aj", desc = "(Lua;B)V", opaque = "3")
	public void method3796(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method3806(var1, var3);
		}
	}

	@ObfInfo(name = "az", desc = "(Lua;II)V", opaque = "-530566730")
	public void method3806(Class521 var1, int var2) {
		if (var2 == 2) {
			this.field1987 = true;
		}

	}

	@ObfInfo(owner = "ad", name = "ak", desc = "(Lor;S)V")
	public static void method49(Class382 var0) {
		field1988 = var0;
	}

	@ObfInfo(owner = "fb", name = "al", desc = "(II)Lhk;", opaque = "-242223001")
	public static Class193 method3071(int var0) {
		Class193 var2 = (Class193)field1986.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field1988.method7216(19, var0);
			var2 = new Class193();
			if (var3 != null) {
				var2.method3796(new Class521(var3));
			}

			field1986.method5987(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(owner = "et", name = "af", desc = "(I)V")
	public static void method2983() {
		field1986.method5995();
	}
}
