import io.runebox.ObfInfo;

@ObfInfo(name = "ge")
public class Class161 extends Class157 {
	@ObfInfo(name = "ag", desc = "B")
	public byte field1764;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1439169443)
	public int field1766;
	@ObfInfo(name = "aq", desc = "Ljava/lang/String;")
	public String field1765;
	// $FF: synthetic field
	public final Class165 this$0;

	public Class161(Class165 var1) {
		this.this$0 = var1;
		this.field1765 = null;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;I)V", opaque = "36173477")
	public void method3152(Class562 var1) {
		if (var1.method9902() != 255) {
			--var1.field5471;
			var1.method9833();
		}

		this.field1765 = var1.method9836();
		this.field1766 = var1.method9997();
		this.field1764 = var1.method9955();
		var1.method9833();
	}

	@ObfInfo(name = "ad", desc = "(Lgj;I)V")
	public void method3149(Class166 var1) {
		Class131 var3 = new Class131();
		var3.field1528 = new Class561(this.field1765);
		var3.field1527 = this.field1766;
		var3.field1530 = this.field1764;
		var1.method3425(var3);
	}
}
