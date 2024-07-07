import io.runebox.ObfInfo;

@ObfInfo(name = "gb")
public class Class158 extends Class149 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -239094847)
	public int field1758;
	@ObfInfo(name = "al", desc = "J", longMultiplier = 8502200598084483025L)
	public long field1757;
	// $FF: synthetic field
	public final Class151 this$0;

	public Class158(Class151 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3066(Class521 var1) {
		this.field1758 = var1.method9410();
		this.field1757 = var1.method9411();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3350(this.field1758, this.field1757);
	}
}
