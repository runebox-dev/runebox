import io.runebox.ObfInfo;

@ObfInfo(name = "gf")
public class Class162 extends Class149 {
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field1801;
	// $FF: synthetic field
	@ObfInfo(desc = "Lfu;")
	public final Class151 this$0;

	public Class162(Class151 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3066(Class521 var1) {
		this.field1801 = var1.method9415();
		var1.method9410();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.field1772 = this.field1801;
	}
}
