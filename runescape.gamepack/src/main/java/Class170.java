import io.runebox.ObfInfo;

@ObfInfo(name = "gn")
public class Class170 extends Class149 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 748264935)
	public int field1844;
	// $FF: synthetic field
	@ObfInfo(desc = "Lfu;")
	public final Class151 this$0;

	public Class170(Class151 var1) {
		this.this$0 = var1;
		this.field1844 = -1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3066(Class521 var1) {
		this.field1844 = var1.method9407();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3343(this.field1844);
	}
}
