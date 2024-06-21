import io.runebox.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "fa")
class Class131 implements Callable {
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfo;")
	public final Class145 this$0;
	// $FF: synthetic field
	@ObfInfo(name = "val$p", desc = "Lua;")
	public final Class521 val$p;
	// $FF: synthetic field
	@ObfInfo(name = "val$version", desc = "I")
	public final int val$version;

	public Class131(Class145 var1, Class521 var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	@ObfInfo(name = "call", desc = "()Ljava/lang/Object;")
	public Object call() {
		this.this$0.method3189(this.val$p, this.val$version);
		return null;
	}
}
