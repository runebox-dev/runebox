import io.runebox.ObfInfo;

@ObfInfo(name = "fp")
public class Class146 extends Class149 {
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public String field1662;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = 2791208581734828753L)
	public long field1664;
	// $FF: synthetic field
	@ObfInfo(desc = "Lfu;")
	public final Class151 this$0;

	public Class146(Class151 var1) {
		this.this$0 = var1;
		this.field1664 = -1L;
		this.field1662 = null;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V", opaque = "1549568484")
	public void method3066(Class521 var1) {
		if (var1.method9405() != 255) {
			--var1.field5219;
			this.field1664 = var1.method9411();
		}

		this.field1662 = var1.method9414();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3339(this.field1664, this.field1662, 0);
	}
}
