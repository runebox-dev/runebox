import io.runebox.ObfInfo;

@ObfInfo(name = "fq")
public class Class147 extends Class149 {
	@ObfInfo(name = "ad", desc = "B")
	public byte field1667;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 278243013)
	public int field1663;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class147(Class144 var1) {
		this.this$0 = var1;
		this.field1663 = -1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V")
	public void method3079(Class562 var1) {
		this.field1663 = var1.method9997();
		this.field1667 = var1.method9955();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3465(this.field1663, this.field1667);
	}
}
