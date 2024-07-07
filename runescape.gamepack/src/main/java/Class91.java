import io.runebox.ObfInfo;

@ObfInfo(name = "dm")
public class Class91 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -338655735)
	public int field1129;
	@ObfInfo(name = "ad", desc = "Loz;")
	public final Class390 field1133;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 942374317)
	public final int field1128;

	public Class91(Class390 var1, String var2) {
		this.field1129 = 0;
		this.field1133 = var1;
		this.field1128 = var1.method7156();
	}

	@ObfInfo(name = "aq", desc = "(I)Z", opaque = "-1506639674")
	public boolean method2430() {
		this.field1129 = 0;

		for (int var2 = 0; var2 < this.field1128; ++var2) {
			if (!this.field1133.method7295(var2) || this.field1133.method7285(var2)) {
				++this.field1129;
			}
		}

		return this.field1129 >= this.field1128;
	}

	@ObfInfo(name = "mg", desc = "([Lnx;IIIZI)V", opaque = "-277668464")
	public static void method2432(Class362[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var6 = 0; var6 < var0.length; ++var6) {
			Class362 var7 = var0[var6];
			if (var7 != null && var7.field3832 == var1) {
				Client.method4714(var7, var2, var3, var4);
				Class93.method2450(var7, var2, var3);
				if (var7.field3958 > var7.field3836 - var7.field3828) {
					var7.field3958 = var7.field3836 - var7.field3828;
				}

				if (var7.field3958 < 0) {
					var7.field3958 = 0;
				}

				if (var7.field3835 > var7.field3837 - var7.field3829) {
					var7.field3835 = var7.field3837 - var7.field3829;
				}

				if (var7.field3835 < 0) {
					var7.field3835 = 0;
				}

				if (var7.field3815 == 0) {
					Client.method4491(var0, var7, var4);
				}
			}
		}

	}
}
