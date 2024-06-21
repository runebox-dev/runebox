import io.runebox.ObfInfo;

@ObfInfo(name = "ga")
public class Class157 extends Class149 {
	@ObfInfo(name = "al", desc = "I", intMultiplier = -73970559)
	public int field1754;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 774154011)
	public int field1755;
	// $FF: synthetic field
	@ObfInfo(desc = "Lfu;")
	public final Class151 this$0;

	public Class157(Class151 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3066(Class521 var1) {
		this.field1755 = var1.method9410();
		this.field1754 = var1.method9410();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3389(this.field1755, this.field1754);
	}
}
