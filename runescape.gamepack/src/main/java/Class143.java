import io.runebox.ObfInfo;

@ObfInfo(name = "fm")
public class Class143 extends Class149 {
	@ObfInfo(name = "ad", desc = "Z")
	public boolean field1645;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1339989631)
	public int field1644;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class143(Class144 var1) {
		this.this$0 = var1;
		this.field1644 = -1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V", opaque = "15")
	public void method3079(Class562 var1) {
		this.field1644 = var1.method9997();
		this.field1645 = var1.method9902() == 1;
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3453(this.field1644, this.field1645);
	}

	@ObfInfo(name = "ak", desc = "(Lok;Lok;III)Lqh;", opaque = "-683306338")
	public static Class424 method3172(Class375 var0, Class375 var1, int var2, int var3) {
		if (!Class554.method3253(var0, var2, var3)) {
			return null;
		} else {
			byte[] var6 = var1.method7132(var2, var3);
			Class424 var5;
			if (var6 == null) {
				var5 = null;
			} else {
				Class424 var7 = new Class424(var6, Client.field1454, Client.field1561, Client.field5435, Client.field3491, Client.field5432, Client.field5434);
				Class554.method6571();
				var5 = var7;
			}

			return var5;
		}
	}
}
