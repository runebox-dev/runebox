import io.runebox.ObfInfo;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfInfo(name = "mf")
class Class318 implements Callable {
	// $FF: synthetic field
	public final Class315 this$0;
	// $FF: synthetic field
	public final AtomicBoolean val$cancelled;

	public Class318(Class315 var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.field3306;

		while (true) {
			Class317 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (Class317)var1.remove();
			}

			var2.field3325.method2152();
		}
	}
}
