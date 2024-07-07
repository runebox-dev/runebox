import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "qp")
public class Class432 extends Class457 {
	public Class432(Class457 var1) {
		super(var1);
		super.field4890 = "StartSongTask";
	}

	@ObfInfo(name = "aq", desc = "(S)Z", opaque = "254")
	public boolean method7710() {
		Iterator var2 = Class323.field3464.iterator();

		while (var2.hasNext()) {
			Class351 var3 = (Class351)var2.next();
			if (var3 != null && !var3.field3758 && var3.field3761 != null) {
				try {
					var3.field3761.method6164();
					var3.field3761.method6090(0);
					if (var3.field3751 != null) {
						var3.field3761.method6162(var3.field3751, var3.field3759);
					}

					var3.field3751 = null;
					var3.field3762 = null;
					var3.field3756 = null;
					var3.field3758 = true;
				} catch (Exception var5) {
					Class552.method8390((String)null, var5);
					this.method8406(var5.getMessage());
					return true;
				}
			}
		}

		super.field4892 = true;
		return true;
	}

	@ObfInfo(name = "oo", desc = "(Ljava/lang/String;I)V", opaque = "-2092080182")
	public static void method8038(String var0) {
		if (!var0.equals("")) {
			Class314 var2 = Class168.method3523(Class321.field3440, Client.field678.field1482);
			var2.field3270.method9809(Class562.method2698(var0));
			var2.field3270.method9816(var0);
			Client.field678.method3013(var2);
		}
	}
}
