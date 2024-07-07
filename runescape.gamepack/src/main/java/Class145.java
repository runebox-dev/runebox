import io.runebox.ObfInfo;

@ObfInfo(name = "fo")
public class Class145 extends Class149 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 814487451)
	public int field1653;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1954655977)
	public int field1654;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 919033843)
	public int field1655;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 243421889)
	public int field1657;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class145(Class144 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V")
	public void method3079(Class562 var1) {
		this.field1657 = var1.method9832();
		this.field1653 = var1.method9832();
		this.field1654 = var1.method9902();
		this.field1655 = var1.method9902();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3470(this.field1657, this.field1653, this.field1654, this.field1655);
	}
}
