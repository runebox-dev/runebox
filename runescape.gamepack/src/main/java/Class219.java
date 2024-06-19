public class Class219 {
	public int field2214;
	public int field2216;
	public int field2217;
	public int field2218;

	public Class219(int var1, int var2, int var3, int var4) {
		this.field2217 = 0;
		this.field2214 = 0;
		this.field2216 = 0;
		this.field2218 = 0;
		this.field2217 = var1;
		this.field2214 = var2;
		this.field2216 = var3;
		this.field2218 = var4;
	}

	public static Class209 method4164(int var0) {
		Class209 var2 = (Class209)Class209.field2110.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field2111.method7216(1, var0);
			var2 = new Class209();
			if (var3 != null) {
				var2.method3977(new Class521(var3), var0);
			}

			var2.method3976();
			Class209.field2110.method5987(var2, (long)var0);
			return var2;
		}
	}
}
