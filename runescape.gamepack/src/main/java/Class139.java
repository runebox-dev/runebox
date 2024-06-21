import io.runebox.ObfInfo;

public class Class139 extends Class149 {
	@ObfInfo(name = "ak", desc = "Z")
	public boolean field1595;
	@ObfInfo(name = "al", desc = "B")
	public byte field1592;
	@ObfInfo(name = "aj", desc = "B")
	public byte field1593;
	@ObfInfo(name = "az", desc = "B")
	public byte field1594;
	@ObfInfo(name = "af", desc = "B")
	public byte field1598;
	// $FF: synthetic field
	public final Class151 this$0;

	public Class139(Class151 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3066(Class521 var1) {
		this.field1595 = var1.method9405() == 1;
		this.field1592 = var1.method9406();
		this.field1593 = var1.method9406();
		this.field1594 = var1.method9406();
		this.field1598 = var1.method9406();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.field1765 = this.field1595;
		var1.field1770 = this.field1592;
		var1.field1771 = this.field1593;
		var1.field1776 = this.field1594;
		var1.field1773 = this.field1598;
	}
}
