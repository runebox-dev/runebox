import io.runebox.ObfInfo;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfInfo(name = "mm")
class Class325 implements Callable {
	// $FF: synthetic field
	public final Class335 this$0;
	// $FF: synthetic field
	public final AtomicBoolean val$cancelled;

	public Class325(Class335 var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

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