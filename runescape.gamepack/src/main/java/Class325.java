import io.runebox.ObfInfo;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfInfo(name = "mm")
class Class325 implements Callable {
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lmw;")
	public final Class335 this$0;
	// $FF: synthetic field
	@ObfInfo(name = "val$cancelled", desc = "Ljava/util/concurrent/atomic/AtomicBoolean;")
	public final AtomicBoolean val$cancelled;

	public Class325(Class335 var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	@ObfInfo(name = "call", desc = "()Ljava/lang/Object;")
	public Object call() {
		PriorityQueue var1 = this.this$0.field3506;

		while (true) {
			Class337 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (Class337)var1.remove();
			}

			var2.field3525.method1117();
		}
	}
}
