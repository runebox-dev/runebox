import io.runebox.ObfInfo;

@ObfInfo(name = "ju")
public abstract class Class255 extends Class507 {
	@ObfInfo(desc = "[LClass200;")
	public static Class200[] field2043;
	@ObfInfo(desc = "LClass382;")
	public static Class382 field2051;
	@ObfInfo(name = "ev", desc = "I", intMultiplier = 2009823259)
	public int field2696;

	public Class255() {
		this.field2696 = 1000;
	}

	@ObfInfo(name = "ef", desc = "(IIIIIIIIIJ)V")
	public void method4892(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		Class262 var12 = this.method1092();
		if (var12 != null) {
			this.field2696 = var12.field2696;
			int var13 = Class253.field2683[var2];
			int var14 = Class253.field2687[var2];
			int var15 = Class253.field2683[var3];
			int var16 = Class253.field2687[var3];
			var12.method5194(var1, var13, var14, var15, var16, var4 - var7, var5 - var8, var6 - var9, var10);
		}

	}

	@ObfInfo(name = "jq", desc = "(ILql;IIIJ)V")
	public void method4893(int var1, Class428 var2, int var3, int var4, int var5, long var6) {
		Class262 var8 = this.method1092();
		if (var8 != null) {
			this.field2696 = var8.field2696;
			var8.method4893(var1, var2, var3, var4, var5, var6);
		}

	}

	@ObfInfo(name = "ah", desc = "(I)Lkb;")
	public Class262 method1092() {
		return null;
	}

	@ObfInfo(name = "ak", desc = "(Lor;Lor;B)Z", opaque = "74")
	public static boolean method4891(Class382 var0, Class382 var1) {
		field2051 = var1;
		if (!var0.method7255()) {
			return false;
		} else {
			Class496.field2098 = var0.method7237(35);
			field2043 = new Class200[Class496.field2098];

			for (int var3 = 0; var3 < Class496.field2098; ++var3) {
				byte[] var4 = var0.method7216(35, var3);
				field2043[var3] = new Class200(var3);
				if (var4 != null) {
					field2043[var3].method3890(new Class521(var4));
					field2043[var3].method3892();
				}
			}

			return true;
		}
	}
}
