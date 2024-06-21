import io.runebox.ObfInfo;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfInfo(name = "ay")
public class Class25 implements ThreadFactory {
	// $FF: synthetic field
	@ObfInfo(desc = "Lae;")
	public final Class5 this$0;
	@ObfInfo(name = "ak", desc = "Ljava/lang/ThreadGroup;")
	public final ThreadGroup field134;
	@ObfInfo(name = "al", desc = "Ljava/util/concurrent/atomic/AtomicInteger;")
	public final AtomicInteger field133;

	public Class25(Class5 var1) {
		this.this$0 = var1;
		this.field133 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field134 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	@ObfInfo(desc = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field134, var1, this.this$0.field19 + "-rest-request-" + this.field133.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}
}
