import io.runebox.ObfInfo;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfInfo(name = "al")
public class Class12 implements ThreadFactory {
	// $FF: synthetic field
	public final Class24 this$0;
	@ObfInfo(name = "aq", desc = "Ljava/lang/ThreadGroup;")
	public final ThreadGroup field62;
	@ObfInfo(name = "ad", desc = "Ljava/util/concurrent/atomic/AtomicInteger;")
	public final AtomicInteger field59;

	public Class12(Class24 var1) {
		this.this$0 = var1;
		this.field59 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field62 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field62, var1, this.this$0.field115 + "-rest-request-" + this.field59.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}
}
