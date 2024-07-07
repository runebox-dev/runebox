import io.runebox.ObfInfo;

@ObfInfo(name = "mx")
public class Class336 {
	@ObfInfo(owner = "hm", name = "aq", desc = "(J)V")
	public static void method3895(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var7) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var6) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var5) {
				}
			}

		}
	}
}
