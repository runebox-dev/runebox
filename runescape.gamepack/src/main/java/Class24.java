import io.runebox.ObfInfo;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfInfo(name = "ax")
public class Class24 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1413857097)
	public final int field116;
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public final String field115;
	@ObfInfo(name = "ag", desc = "Ljava/util/concurrent/ThreadFactory;")
	public final ThreadFactory field117;
	@ObfInfo(name = "ak", desc = "Ljava/util/concurrent/ThreadPoolExecutor;")
	public final ThreadPoolExecutor field114;

	public Class24(String var1, int var2, int var3) {
		this.field115 = var1;
		this.field116 = var2;
		this.field117 = new Class12(this);
		this.field114 = this.method315(var3);
	}

	@ObfInfo(name = "aq", desc = "(II)Ljava/util/concurrent/ThreadPoolExecutor;")
	public final ThreadPoolExecutor method315(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field116), this.field117);
	}

	@ObfInfo(name = "ad", desc = "(Lae;I)Lao;", opaque = "-683865458")
	public Class15 method322(Class5 var1) {
		if (this.field114.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field114.getCorePoolSize() + " Queue capacity " + this.field116);
			return new Class15("Queue full");
		} else {
			Class15 var3 = new Class15(this.field114.submit(new Class1(this, var1)));
			return var3;
		}
	}

	@ObfInfo(name = "ag", desc = "(I)V")
	public final void method317() {
		try {
			this.field114.shutdown();
		} catch (Exception var3) {
			System.err.println("Error shutting down RestRequestService\r\n" + var3);
		}

	}

	@ObfInfo(name = "ob", desc = "(IIIILvg;Lnw;I)V", opaque = "296381346")
	public static void method323(int var0, int var1, int var2, int var3, Class553 var4, Class361 var5) {
		int var7 = var3 * var3 + var2 * var2;
		if (var7 > 4225 && var7 < 90000) {
			int var8 = Client.field615 & 2047;
			int var9 = Class274.field2804[var8];
			int var10 = Class274.field2805[var8];
			int var11 = var10 * var2 + var9 * var3 >> 16;
			int var12 = var10 * var3 - var9 * var2 >> 16;
			double var13 = Math.atan2((double)var11, (double)var12);
			int var15 = var5.field3798 / 2 - 25;
			int var16 = (int)(Math.sin(var13) * (double)var15);
			int var17 = (int)(Math.cos(var13) * (double)var15);
			byte var18 = 20;
			Client.field961.method9624(var16 + (var5.field3798 / 2 + var0 - var18 / 2), var1 + var5.field3799 / 2 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
		} else {
			Client.method7321(var0, var1, var2, var3, var4, var5);
		}

	}
}
