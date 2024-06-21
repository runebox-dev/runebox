import io.runebox.ObfInfo;

public class Class199 extends Class507 {
	@ObfInfo(name = "al", desc = "Llm;")
	public static Class299 field2034;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1319222005)
	public int field2036;

	static {
		field2034 = new Class299(64);
	}

	public Class199() {
		this.field2036 = 0;
	}

	@ObfInfo(name = "al", desc = "(Lua;I)V", opaque = "-481213061")
	public void method3877(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method3879(var1, var3);
		}
	}

	@ObfInfo(name = "aj", desc = "(Lua;II)V")
	public void method3879(Class521 var1, int var2) {
		if (var2 == 2) {
			this.field2036 = var1.method9407();
		}

	}

	@ObfInfo(owner = "cy", name = "ak", desc = "(IB)Lhq;", opaque = "7")
	public static Class199 method2189(int var0) {
		Class199 var2 = (Class199)field2034.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field2039.method7216(5, var0);
			var2 = new Class199();
			if (var3 != null) {
				var2.method3877(new Class521(var3));
			}

			field2034.method5987(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(name = "ak", desc = "(Lmr;I)V", opaque = "-1194566834")
	public static void method3887(Class330 var0) {
		if (!Class332.field3459.contains(var0)) {
			Class332.field3459.add(var0);
		}

	}

	@ObfInfo(owner = "ea", name = "az", desc = "(I)V")
	public static void method2750() {
		field2034.method5995();
	}

	@ObfInfo(name = "ay", desc = "(Lnb;I)I", opaque = "707630900")
	public static int method3888(Class340 var0) {
		if (11 != var0.field3755) {
			--Class85.field1806;
			Class72.field887[++Class85.field83 - 1] = -1;
			return 1;
		} else {
			String var2 = Class72.field880[--Class85.field1806];
			Class72.field887[++Class85.field83 - 1] = var0.method6520(var2);
			return 1;
		}
	}
}
