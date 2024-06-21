import io.runebox.ObfInfo;

public class Class136 extends Class181 {
	@ObfInfo(name = "al", desc = "B")
	public byte field1567;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1128650951)
	public int field1566;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1845299605)
	public int field1568;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public String field1569;
	// $FF: synthetic field
	public final Class180 this$0;

	public Class136(Class180 var1) {
		this.this$0 = var1;
		this.field1566 = -1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3087(Class521 var1) {
		this.field1566 = var1.method9407();
		this.field1567 = var1.method9406();
		this.field1568 = var1.method9407();
		var1.method9411();
		this.field1569 = var1.method9415();
	}

	@ObfInfo(name = "al", desc = "(Lgo;I)V")
	public void method3089(Class171 var1) {
		Class140 var3 = (Class140)var1.field1854.get(this.field1566);
		var3.field1602 = this.field1567;
		var3.field1607 = this.field1568;
		var3.field1601 = new Class567(this.field1569);
	}
}
