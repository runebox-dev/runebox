import io.runebox.ObfInfo;

@ObfInfo(name = "gf")
public class Class162 extends Class149 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1118752625)
	public int field1768;
	@ObfInfo(name = "ad", desc = "J", longMultiplier = 2806569176464727727L)
	public long field1769;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class162(Class144 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V")
	public void method3079(Class562 var1) {
		this.field1768 = var1.method9832();
		this.field1769 = var1.method9833();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3471(this.field1768, this.field1769);
	}
}
