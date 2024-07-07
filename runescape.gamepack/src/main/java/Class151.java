import io.runebox.ObfInfo;

@ObfInfo(name = "fu")
public class Class151 extends Class149 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -328879889)
	public int field1701;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class151(Class144 var1) {
		this.this$0 = var1;
		this.field1701 = -1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V")
	public void method3079(Class562 var1) {
		this.field1701 = var1.method9997();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3495(this.field1701);
	}
}
