import io.runebox.ObfInfo;

@ObfInfo(name = "np")
public abstract class Class354 {
	@ObfInfo(name = "ak", desc = "(B)[B")
	public abstract byte[] method6404();

	@ObfInfo(name = "ap", desc = "([BI)V")
	public abstract void method6403(byte[] var1);

	@ObfInfo(owner = "mn", name = "aq", desc = "([BZB)Ljava/lang/Object;", opaque = "11")
	public static Object method6322(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			Class340 var3 = new Class340();
			var3.method6403(var0);
			return var3;
		} else {
			return var1 ? method3619(var0) : var0;
		}
	}

	@ObfInfo(owner = "ln", name = "ad", desc = "(Ljava/lang/Object;ZB)[B", opaque = "-1")
	public static byte[] method5832(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var4 = (byte[])((byte[])var0);
			return var1 ? method3619(var4) : var4;
		} else if (var0 instanceof Class354) {
			Class354 var3 = (Class354)var0;
			return var3.method6404();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(owner = "gz", name = "ag", desc = "([BB)[B")
	public static byte[] method3619(byte[] var0) {
		int var2 = var0.length;
		byte[] var3 = new byte[var2];
		System.arraycopy(var0, 0, var3, 0, var2);
		return var3;
	}
}
