import io.runebox.ObfInfo;

@ObfInfo(name = "fj")
public class Class140 extends Class157 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1796418191)
	public int field1630;
	// $FF: synthetic field
	public final Class165 this$0;

	public Class140(Class165 var1) {
		this.this$0 = var1;
		this.field1630 = -1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;I)V", opaque = "36173477")
	public void method3152(Class562 var1) {
		this.field1630 = var1.method9997();
		var1.method9902();
		if (var1.method9902() != 255) {
			--var1.field5471;
			var1.method9833();
		}

	}

	@ObfInfo(name = "ad", desc = "(Lgj;I)V")
	public void method3149(Class166 var1) {
		var1.method3437(this.field1630);
	}
}
