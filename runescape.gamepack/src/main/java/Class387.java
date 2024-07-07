import io.runebox.ObfInfo;

@ObfInfo(name = "ow")
public class Class387 extends Class520 {
	@ObfInfo(name = "ak", desc = "Loz;")
	public Class390 field4549;
	@ObfInfo(name = "ag", desc = "Lsq;")
	public Class485 field4548;
	@ObfInfo(name = "ad", desc = "[B")
	public byte[] field4546;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -311695871)
	public int field4547;

	@ObfInfo(name = "ad", desc = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", opaque = "-680497403")
	public static void method7265(int var0, String var1, String var2, String var3) {
		Class92 var5 = (Class92)Class115.field1432.get(var0);
		if (var5 == null) {
			var5 = new Class92();
			Class115.field1432.put(var0, var5);
		}

		Class63 var6 = var5.method2440(var0, var1, var2, var3);
		Class115.field1428.method8902(var6, (long)var6.field481);
		Class115.field1429.method7558(var6);
		Client.field673 = Client.field721;
	}
}
