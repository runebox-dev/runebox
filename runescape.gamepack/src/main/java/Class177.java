import io.runebox.ObfInfo;

@ObfInfo(name = "gu")
public class Class177 extends Class149 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1872253511)
	public int field1892;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class177(Class144 var1) {
		this.this$0 = var1;
		this.field1892 = -1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V")
	public void method3079(Class562 var1) {
		this.field1892 = var1.method9997();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3464(this.field1892);
	}
}
