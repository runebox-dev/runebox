import io.runebox.ObfInfo;

@ObfInfo(name = "jt")
public class Class254 implements Class393 {
	@ObfInfo(owner = "ha", name = "aq", desc = "Lok;")
	public static Class375 field1934;
	@ObfInfo(name = "ak", desc = "Ljt;")
	public static final Class254 field2657;
	@ObfInfo(name = "aq", desc = "Ljt;")
	public static final Class254 field2658;
	@ObfInfo(name = "ag", desc = "Ljt;")
	public static final Class254 field2659;
	@ObfInfo(name = "ad", desc = "Ljt;")
	public static final Class254 field2660;
	@ObfInfo(name = "an", desc = "B")
	public final byte field2662;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 754386531)
	public final int field2661;

	static {
		field2658 = new Class254(2, (byte)0);
		field2660 = new Class254(1, (byte)1);
		field2659 = new Class254(3, (byte)2);
		field2657 = new Class254(0, (byte)3);
	}

	public Class254(int var1, byte var2) {
		this.field2661 = var1;
		this.field2662 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field2662;
	}

	@ObfInfo(name = "ad", desc = "(II)Lha;", opaque = "1600380466")
	public static Class183 method4941(int var0) {
		Class183 var2 = (Class183)Class183.field1916.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field1934.method7132(32, var0);
			var2 = new Class183();
			if (var3 != null) {
				var2.method3642(new Class562(var3));
			}

			Class183.field1916.method6330(var2, (long)var0);
			return var2;
		}
	}
}
