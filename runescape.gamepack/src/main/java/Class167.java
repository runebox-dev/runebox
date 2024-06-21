import io.runebox.ObfInfo;

@ObfInfo(name = "gk")
public class Class167 extends Class149 {
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public String field1833;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = -670140212667468051L)
	public long field1832;
	// $FF: synthetic field
	@ObfInfo(desc = "Lfu;")
	public final Class151 this$0;

	public Class167(Class151 var1) {
		this.this$0 = var1;
		this.field1832 = -1L;
		this.field1833 = null;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V", opaque = "1549568484")
	public void method3066(Class521 var1) {
		if (var1.method9405() != 255) {
			--var1.field5219;
			this.field1832 = var1.method9411();
		}

		this.field1833 = var1.method9414();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3342(this.field1832, this.field1833);
	}
}
