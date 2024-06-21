import io.runebox.ObfInfo;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfInfo(name = "my")
public class Class337 {
	@ObfInfo(desc = "I", intMultiplier = 910389071)
	public static int field1653;
	@ObfInfo(desc = "Ljava/util/concurrent/ThreadPoolExecutor;")
	public static ThreadPoolExecutor field155;
	@ObfInfo(name = "al", desc = "Lck;")
	public Class63 field3525;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 435230045)
	public int field3524;

	public Class337(int var1, Class63 var2) {
		this.field3524 = var1;
		this.field3525 = var2;
	}

	@ObfInfo(name = "ak", desc = "(Lor;Lor;IZI)Lfo;", opaque = "-1743362675")
	public static Class145 method6486(Class382 var0, Class382 var1, int var2, boolean var3) {
		boolean var5 = true;
		byte[] var6 = var0.method7224(var2 >> 16 & 65535, var2 & 65535);
		if (var6 == null) {
			var5 = false;
			return null;
		} else {
			int var7 = (var6[1] & 255) << 8 | var6[2] & 255;
			byte[] var8;
			if (var3) {
				var8 = var1.method7224(0, var7);
			} else {
				var8 = var1.method7224(var7, 0);
			}

			if (var8 == null) {
				var5 = false;
			}

			if (!var5) {
				return null;
			} else {
				if (field155 == null) {
					field1653 = Runtime.getRuntime().availableProcessors();
					field155 = new ThreadPoolExecutor(0, field1653, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + field1653 * 100), new Class133());
				}

				try {
					return new Class145(var0, var1, var2, var3);
				} catch (Exception var10) {
					return null;
				}
			}
		}
	}
}
