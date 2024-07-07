import io.runebox.ObfInfo;

@ObfInfo(name = "jg")
public final class Class241 {
	@ObfInfo(name = "by", desc = "Ljava/lang/String;")
	public static String field2546;
	@ObfInfo(name = "ad", desc = "[I")
	public final int[] field2543;

	public Class241() {
		this.field2543 = new int[4096];
	}

	public Class241(int[] var1) {
		this.field2543 = var1;
	}

	@ObfInfo(name = "ad", desc = "(III)I")
	public final int method4655(int var1, int var2) {
		return this.field2543[var2 * 64 + var1];
	}

	@ObfInfo(owner = "fv", name = "aq", desc = "([BI)Ljg;", opaque = "381395576")
	public static Class241 method3299(byte[] var0) {
		return var0 == null ? new Class241() : new Class241(Class41.method4002(var0).field5429);
	}
}
