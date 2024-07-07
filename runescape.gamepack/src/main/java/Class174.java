import io.runebox.ObfInfo;

@ObfInfo(name = "gr")
public class Class174 extends Class157 {
	@ObfInfo(name = "ad", desc = "B")
	public byte field1872;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 458286077)
	public int field1871;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -704237327)
	public int field1874;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field1873;
	// $FF: synthetic field
	public final Class165 this$0;

	public Class174(Class165 var1) {
		this.this$0 = var1;
		this.field1874 = -1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;I)V")
	public void method3152(Class562 var1) {
		var1.method9902();
		this.field1874 = var1.method9997();
		this.field1872 = var1.method9955();
		this.field1871 = var1.method9997();
		var1.method9833();
		this.field1873 = var1.method9837();
		var1.method9902();
	}

	@ObfInfo(name = "ad", desc = "(Lgj;I)V")
	public void method3149(Class166 var1) {
		Class131 var3 = (Class131)var1.field1808.get(this.field1874);
		var3.field1530 = this.field1872;
		var3.field1527 = this.field1871;
		var3.field1528 = new Class561(this.field1873);
	}
}
