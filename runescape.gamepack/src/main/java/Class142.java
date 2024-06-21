import io.runebox.ObfInfo;

@ObfInfo(name = "fl")
public class Class142 extends Class149 {
	@ObfInfo(name = "al", desc = "Z")
	public boolean field1621;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1967818551)
	public int field1618;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfu;")
	public final Class151 this$0;

	public Class142(Class151 var1) {
		this.this$0 = var1;
		this.field1618 = -1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V", opaque = "1549568484")
	public void method3066(Class521 var1) {
		this.field1618 = var1.method9407();
		this.field1621 = var1.method9405() == 1;
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3337(this.field1618, this.field1621);
	}
}
