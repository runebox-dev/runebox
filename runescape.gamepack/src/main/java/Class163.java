import io.runebox.ObfInfo;

@ObfInfo(name = "gg")
public class Class163 extends Class149 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1184575361)
	public int field1805;
	// $FF: synthetic field
	public final Class151 this$0;

	public Class163(Class151 var1) {
		this.this$0 = var1;
		this.field1805 = -1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3066(Class521 var1) {
		this.field1805 = var1.method9407();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3384(this.field1805);
	}
}
