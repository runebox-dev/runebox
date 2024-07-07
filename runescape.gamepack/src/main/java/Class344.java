import io.runebox.ObfInfo;
import java.net.MalformedURLException;
import java.net.URL;

@ObfInfo(name = "nf")
public class Class344 {
	@ObfInfo(owner = "sp", name = "ap", desc = "Lok;")
	public static Class375 field5008;
	@ObfInfo(name = "aq", desc = "Lez;")
	public Class130 field3734;
	@ObfInfo(name = "ad", desc = "Lvg;")
	public Class553 field3732;

	public Class344(String var1, Class105 var2) {
		try {
			this.field3734 = var2.method2781(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3734 = null;
		}

	}

	public Class344(Class130 var1) {
		this.field3734 = var1;
	}

	@ObfInfo(name = "aq", desc = "(I)Lvg;", opaque = "2003231681")
	public Class553 method6470() {
		if (this.field3732 == null && this.field3734 != null && this.field3734.method3050()) {
			if (this.field3734.method3051() != null) {
				this.field3732 = Class41.method4002(this.field3734.method3051());
			}

			this.field3734 = null;
		}

		return this.field3732;
	}

	@ObfInfo(name = "ad", desc = "(II)Lii;", opaque = "309624013")
	public static Class217 method6474(int var0) {
		Class217 var2 = (Class217)Class217.field2367.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field5008.method7132(12, var0);
			var2 = new Class217();
			if (var3 != null) {
				var2.method4145(new Class562(var3));
			}

			var2.method4162();
			Class217.field2367.method6330(var2, (long)var0);
			return var2;
		}
	}
}
