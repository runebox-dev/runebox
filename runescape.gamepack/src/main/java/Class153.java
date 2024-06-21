import io.runebox.ObfInfo;

@ObfInfo(name = "fw")
public class Class153 extends Class181 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 982220485)
	public int field1708;
	// $FF: synthetic field
	@ObfInfo(desc = "Lgx;")
	public final Class180 this$0;

	public Class153(Class180 var1) {
		this.this$0 = var1;
		this.field1708 = -1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3087(Class521 var1) {
		this.field1708 = var1.method9407();
		var1.method9405();
		if (var1.method9405() != 255) {
			--var1.field5219;
			var1.method9411();
		}

	}

	@ObfInfo(name = "al", desc = "(Lgo;I)V")
	public void method3089(Class171 var1) {
		var1.method3549(this.field1708);
	}
}
