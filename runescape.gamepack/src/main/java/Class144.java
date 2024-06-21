import io.runebox.ObfInfo;

@ObfInfo(name = "fn")
public class Class144 extends Class149 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -2127864729)
	public int field1649;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfu;")
	public final Class151 this$0;

	public Class144(Class151 var1) {
		this.this$0 = var1;
		this.field1649 = -1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3066(Class521 var1) {
		this.field1649 = var1.method9407();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3340(this.field1649);
	}
}
