import io.runebox.ObfInfo;

@ObfInfo(name = "fb")
public class Class132 extends Class149 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 642083359)
	public int field1550;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1281571515)
	public int field1551;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -576189647)
	public int field1552;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -1671740993)
	public int field1553;
	// $FF: synthetic field
	@ObfInfo(desc = "Lfu;")
	public final Class151 this$0;

	public Class132(Class151 var1) {
		this.this$0 = var1;
		this.field1550 = -1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3066(Class521 var1) {
		this.field1550 = var1.method9407();
		this.field1553 = var1.method9410();
		this.field1551 = var1.method9405();
		this.field1552 = var1.method9405();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3347(this.field1550, this.field1553, this.field1551, this.field1552);
	}
}
