import io.runebox.ObfInfo;

@ObfInfo(name = "gc")
public class Class159 extends Class149 {
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1253382525)
	public int field1757;
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public String field1755;
	@ObfInfo(name = "aq", desc = "J", longMultiplier = 90337108135687261L)
	public long field1756;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class159(Class144 var1) {
		this.this$0 = var1;
		this.field1756 = -1L;
		this.field1755 = null;
		this.field1757 = 0;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V", opaque = "15")
	public void method3079(Class562 var1) {
		if (var1.method9902() != 255) {
			--var1.field5471;
			this.field1756 = var1.method9833();
		}

		this.field1755 = var1.method9836();
		this.field1757 = var1.method9997();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3483(this.field1756, this.field1755, this.field1757);
	}
}
