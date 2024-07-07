import io.runebox.ObfInfo;

@ObfInfo(name = "fk")
public class Class141 extends Class149 {
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1641898427)
	public int field1633;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1092215929)
	public int field1634;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 220879453)
	public int field1636;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -234504907)
	public int field1637;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class141(Class144 var1) {
		this.this$0 = var1;
		this.field1636 = -1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V")
	public void method3079(Class562 var1) {
		this.field1636 = var1.method9997();
		this.field1634 = var1.method9832();
		this.field1633 = var1.method9902();
		this.field1637 = var1.method9902();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3468(this.field1636, this.field1634, this.field1633, this.field1637);
	}
}
