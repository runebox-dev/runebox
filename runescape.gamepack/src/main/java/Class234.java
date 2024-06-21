import io.runebox.ObfInfo;

public class Class234 extends Class507 {
	@ObfInfo(name = "al", desc = "Llm;")
	public static Class299 field2505;
	@ObfInfo(name = "ak", desc = "Lor;")
	public static Class382 field2508;
	@ObfInfo(name = "aj", desc = "Ltu;")
	public Class515 field2506;

	static {
		field2505 = new Class299(64);
	}

	@ObfInfo(name = "aj", desc = "(I)V")
	public void method4488() {
	}

	@ObfInfo(name = "az", desc = "(Lua;I)V", opaque = "64719232")
	public void method4489(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method4490(var1, var3);
		}
	}

	@ObfInfo(name = "af", desc = "(Lua;IB)V", opaque = "-1")
	public void method4490(Class521 var1, int var2) {
		if (var2 == 249) {
			this.field2506 = Class95.method2487(var1, this.field2506);
		}

	}

	@ObfInfo(name = "aa", desc = "(III)I", opaque = "1962444475")
	public int method4491(int var1, int var2) {
		Class515 var5 = this.field2506;
		int var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			Class516 var6 = (Class516)var5.method9326((long)var1);
			if (var6 == null) {
				var4 = var2;
			} else {
				var4 = var6.field5199;
			}
		}

		return var4;
	}

	@ObfInfo(name = "at", desc = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4492(int var1, String var2) {
		return Class188.method2595(this.field2506, var1, var2);
	}

	@ObfInfo(owner = "ot", name = "ak", desc = "(Lor;B)V")
	public static void method7366(Class382 var0) {
		field2508 = var0;
	}

	@ObfInfo(owner = "dw", name = "al", desc = "(II)Liz;", opaque = "-1171319348")
	public static Class234 method2604(int var0) {
		Class234 var2 = (Class234)field2505.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2508.method7216(34, var0);
			var2 = new Class234();
			if (var3 != null) {
				var2.method4489(new Class521(var3));
			}

			var2.method4488();
			field2505.method5987(var2, (long)var0);
			return var2;
		}
	}
}
