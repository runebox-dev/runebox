import io.runebox.ObfInfo;

@ObfInfo(name = "iq")
public class Class225 extends Class221 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 729760543)
	public int field2438;
	// $FF: synthetic field
	public final Class214 this$0;

	public Class225(Class214 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2438 = var3;
	}

	@ObfInfo(name = "aq", desc = "(B)I")
	public int method4255() {
		return 0;
	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method4254() {
		return this.field2438;
	}

	@ObfInfo(name = "ag", desc = "(CI)Z", opaque = "-342383675")
	public static boolean method4342(char var0) {
		if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 160) && (var0 <= 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var2 = Class411.field4669;

				for (int var3 = 0; var3 < var2.length; ++var3) {
					char var4 = var2[var3];
					if (var0 == var4) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfInfo(name = "hc", desc = "(IZZZZZI)Loz;")
	public static Class390 method4344(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		Class485 var7 = null;
		if (Class211.field2286 != null) {
			var7 = new Class485(var0, Class211.field2286, Client.field1750[var0], 1000000);
		}

		return new Class390(var7, Client.field232, Client.field2487, var0, var1, var2, var3, var4, var5);
	}

	@ObfInfo(name = "nf", desc = "(II)V", opaque = "-1555708630")
	public static void method4334(int var0) {
		if (Client.field4644.method6412(var0)) {
			Class449.method8306(Client.field4644.field3698[var0], -1);
		}
	}
}
