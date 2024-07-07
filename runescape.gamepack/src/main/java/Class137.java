import io.runebox.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "fg")
class Class137 implements Callable {
	// $FF: synthetic field
	public final Class145 this$0;
	// $FF: synthetic field
	public final Class155[] val$curveLoadJobs;
	// $FF: synthetic field
	public final int val$workEnd;
	// $FF: synthetic field
	public final int val$workStart;

	public Class137(Class145 var1, int var2, int var3, Class155[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	@ObfInfo(name = "kz", desc = "(IIIIIII)V", opaque = "-1926631438")
	public static void method3098(int var0, int var1, int var2, int var3, int var4, int var5) {
		Class401 var7 = Client.field4582.field1301[var0][var1][var2];
		if (var7 != null) {
			for (Class117 var8 = (Class117)var7.method7482(); var8 != null; var8 = (Class117)var7.method7490()) {
				if (var8.field1465 == (var3 & 32767) && var4 == var8.field1458) {
					var8.field1458 = var5;
					break;
				}
			}

			Client.method7123(var0, var1, var2);
		}

	}
}
