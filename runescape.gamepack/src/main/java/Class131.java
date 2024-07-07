import io.runebox.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "fa")
class Class131 implements Callable {
	// $FF: synthetic field
	public final Class145 this$0;
	// $FF: synthetic field
	public final Class521 val$p;
	// $FF: synthetic field
	public final int val$version;

	public Class131(Class145 var1, Class521 var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3189(this.val$p, this.val$version);
		return null;
	}
}
