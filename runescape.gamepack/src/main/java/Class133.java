import io.runebox.ObfInfo;

@ObfInfo(name = "fc")
public class Class133 extends Class149 {
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public String field1557;
	@ObfInfo(name = "aq", desc = "J", longMultiplier = 3441742155483086295L)
	public long field1559;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class133(Class144 var1) {
		this.this$0 = var1;
		this.field1559 = -1L;
		this.field1557 = null;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V", opaque = "15")
	public void method3079(Class562 var1) {
		if (var1.method9902() != 255) {
			--var1.field5471;
			this.field1559 = var1.method9833();
		}

		this.field1557 = var1.method9836();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3483(this.field1559, this.field1557, 0);
	}
}
