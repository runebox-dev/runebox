import io.runebox.ObfInfo;

@ObfInfo(name = "gq")
public class Class173 extends Class149 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1680782365)
	public int field1867;
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public String field1865;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class173(Class144 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V")
	public void method3079(Class562 var1) {
		this.field1867 = var1.method9832();
		this.field1865 = var1.method9837();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3472(this.field1867, this.field1865);
	}
}
