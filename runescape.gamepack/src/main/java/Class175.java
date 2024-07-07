import io.runebox.ObfInfo;

@ObfInfo(name = "gs")
public class Class175 extends Class149 {
	@ObfInfo(name = "aq", desc = "Ljava/lang/String;")
	public String field1880;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class175(Class144 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V")
	public void method3079(Class562 var1) {
		this.field1880 = var1.method9837();
		var1.method9832();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.field1835 = this.field1880;
	}
}
