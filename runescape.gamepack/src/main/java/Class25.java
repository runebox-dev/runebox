import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class Class25 implements ThreadFactory {
	// $FF: synthetic field
	public final Class5 this$0;
	public final ThreadGroup field134;
	public final AtomicInteger field133;

	public Class25(Class5 var1) {
		this.this$0 = var1;
		this.field133 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field134 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field134, var1, this.this$0.field19 + "-rest-request-" + this.field133.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}
}
