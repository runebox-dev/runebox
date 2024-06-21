import io.runebox.ObfInfo;

public abstract class Class362 {
	@ObfInfo(name = "aj", desc = "(B)[B")
	public abstract byte[] method6647();

	@ObfInfo(name = "az", desc = "([BI)V")
	public abstract void method6652(byte[] var1);

	@ObfInfo(owner = "rz", name = "al", desc = "([BI)[B")
	public static byte[] method8606(byte[] var0) {
		int var2 = var0.length;
		byte[] var3 = new byte[var2];
		System.arraycopy(var0, 0, var3, 0, var2);
		return var3;
	}
}
