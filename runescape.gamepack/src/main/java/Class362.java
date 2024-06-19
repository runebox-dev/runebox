public abstract class Class362 {
	public abstract byte[] method6647();

	public abstract void method6652(byte[] var1);

	public static byte[] method6692(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var4 = (byte[])((byte[])var0);
			return var1 ? Class468.method8606(var4) : var4;
		} else if (var0 instanceof Class362) {
			Class362 var3 = (Class362)var0;
			return var3.method6647();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
