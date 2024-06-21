import io.runebox.ObfInfo;

@ObfInfo(name = "ik")
public class Class219 {
	@ObfInfo(name = "al", desc = "I", intMultiplier = -264194065)
	public int field2214;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 556845087)
	public int field2216;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1546624377)
	public int field2217;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1449503097)
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

	@ObfInfo(name = "ak", desc = "(II)Lia;", opaque = "-1567988952")
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
