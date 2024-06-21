import io.runebox.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "fg")
class Class137 implements Callable {
	// $FF: synthetic field
	@ObfInfo(desc = "Lfo;")
	public final Class145 this$0;
	// $FF: synthetic field
	@ObfInfo(desc = "[Lfy;")
	public final Class155[] val$curveLoadJobs;
	// $FF: synthetic field
	@ObfInfo(desc = "I")
	public final int val$workEnd;
	// $FF: synthetic field
	@ObfInfo(desc = "I")
	public final int val$workStart;

	public Class137(Class145 var1, int var2, int var3, Class155[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	@ObfInfo(desc = "()Ljava/lang/Object;")
	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}
}
