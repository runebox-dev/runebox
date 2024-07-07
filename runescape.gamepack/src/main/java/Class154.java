import io.runebox.ObfInfo;

@ObfInfo(name = "fx")
public class Class154 extends Class149 {
	@ObfInfo(name = "aq", desc = "Z")
	public boolean field1730;
	@ObfInfo(name = "ad", desc = "B")
	public byte field1729;
	@ObfInfo(name = "ak", desc = "B")
	public byte field1731;
	@ObfInfo(name = "ag", desc = "B")
	public byte field1732;
	@ObfInfo(name = "ap", desc = "B")
	public byte field1733;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class154(Class144 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V", opaque = "15")
	public void method3079(Class562 var1) {
		this.field1730 = var1.method9902() == 1;
		this.field1729 = var1.method9955();
		this.field1732 = var1.method9955();
		this.field1731 = var1.method9955();
		this.field1733 = var1.method9955();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.field1836 = this.field1730;
		var1.field1824 = this.field1729;
		var1.field1825 = this.field1732;
		var1.field1826 = this.field1731;
		var1.field1827 = this.field1733;
	}
}
