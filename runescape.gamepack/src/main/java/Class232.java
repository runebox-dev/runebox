import io.runebox.ObfInfo;

@ObfInfo(name = "ix")
public abstract class Class232 {
	@ObfInfo(name = "ad", desc = "(III)I")
	public abstract int method4048(int var1, int var2);

	@ObfInfo(name = "aq", desc = "(I)V")
	public abstract void method4046();

	@ObfInfo(owner = "ph", name = "aj", desc = "(S)Lix;")
	public static Class232 method7395() {
		try {
			return new Class223();
		} catch (Throwable var2) {
			return new Class210();
		}
	}

	@ObfInfo(name = "ad", desc = "(IIIIIII)I", opaque = "-294929605")
	public static int method4438(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var7 = var3;
			var3 = var4;
			var4 = var7;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}
}
