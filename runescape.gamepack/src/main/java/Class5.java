import io.runebox.ObfInfo;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Class5 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -476345029)
	public final int field22;
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public final String field19;
	@ObfInfo(name = "aj", desc = "Ljava/util/concurrent/ThreadFactory;")
	public final ThreadFactory field21;
	@ObfInfo(name = "az", desc = "Ljava/util/concurrent/ThreadPoolExecutor;")
	public final ThreadPoolExecutor field24;

	public Class5(String var1, int var2, int var3) {
		this.field19 = var1;
		this.field22 = var2;
		this.field21 = new Class25(this);
		this.field24 = this.method64(var3);
	}

	@ObfInfo(name = "ak", desc = "(II)Ljava/util/concurrent/ThreadPoolExecutor;")
	public final ThreadPoolExecutor method64(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field22), this.field21);
	}

	@ObfInfo(name = "al", desc = "(Lah;I)Las;", opaque = "779177967")
	public Class19 method57(Class8 var1) {
		if (this.field24.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field24.getCorePoolSize() + " Queue capacity " + this.field22);
			return new Class19("Queue full");
		} else {
			Class19 var3 = new Class19(this.field24.submit(new Class23(this, var1)));
			return var3;
		}
	}

	@ObfInfo(name = "aj", desc = "(B)V")
	public final void method60() {
		try {
			this.field24.shutdown();
		} catch (Exception var3) {
			System.err.println("Error shutting down RestRequestService\r\n" + var3);
		}

	}
}
