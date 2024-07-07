import io.runebox.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "fe")
class Class135 implements Callable {
	// $FF: synthetic field
	public final Class150 this$0;
	// $FF: synthetic field
	public final Class562 val$p;
	// $FF: synthetic field
	public final int val$version;

	public Class135(Class150 var1, Class562 var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3215(this.val$p, this.val$version);
		return null;
	}
}
