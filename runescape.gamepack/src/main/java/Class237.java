public class Class237 {
	public int field2564;
	public int field2565;
	public int field2566;

	public static Class211 method4637(int var0) {
		Class211 var2 = (Class211)Class211.field2129.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field2127.method7216(12, var0);
			var2 = new Class211();
			if (var3 != null) {
				var2.method3997(new Class521(var3));
			}

			var2.method3998();
			Class211.field2129.method5987(var2, (long)var0);
			return var2;
		}
	}
}
