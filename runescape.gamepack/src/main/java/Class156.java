import io.runebox.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "fz")
class Class156 implements Callable {
	// $FF: synthetic field
	public final Class137[] val$curveLoadJobs;
	// $FF: synthetic field
	public final Class150 this$0;
	// $FF: synthetic field
	public final int val$workEnd;
	// $FF: synthetic field
	public final int val$workStart;

	public Class156(Class150 var1, int var2, int var3, Class137[] var4) {
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

	@ObfInfo(name = "ag", desc = "(III)Ldg;", opaque = "1589114392")
	public static Class85 method3341(int var0, int var1) {
		Class85 var3 = (Class85)Class85.field1075.method6327((long)(var0 << 16));
		if (var3 != null) {
			return var3;
		} else {
			String var4 = String.valueOf(var0);
			int var5 = Client.field5007.method7150(var4);
			if (var5 == -1) {
				return null;
			} else {
				byte[] var6 = Client.field5007.method7139(var5);
				if (var6 != null) {
					if (var6.length <= 1) {
						return null;
					}

					var3 = Class85.method3320(var6);
					if (var3 != null) {
						Class85.field1075.method6330(var3, (long)(var0 << 16));
						return var3;
					}
				}

				return null;
			}
		}
	}
}
