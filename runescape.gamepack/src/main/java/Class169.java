import io.runebox.ObfInfo;

@ObfInfo(name = "gm")
public class Class169 extends Class181 {
	@ObfInfo(name = "aj", desc = "B")
	public byte field1839;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1051872717)
	public int field1843;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field1841;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lgx;")
	public final Class180 this$0;

	public Class169(Class180 var1) {
		this.this$0 = var1;
		this.field1841 = null;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V", opaque = "1106407032")
	public void method3087(Class521 var1) {
		if (var1.method9405() != 255) {
			--var1.field5219;
			var1.method9411();
		}

		this.field1841 = var1.method9414();
		this.field1843 = var1.method9407();
		this.field1839 = var1.method9406();
		var1.method9411();
	}

	@ObfInfo(name = "al", desc = "(Lgo;I)V")
	public void method3089(Class171 var1) {
		Class140 var3 = new Class140();
		var3.field1601 = new Class567(this.field1841);
		var3.field1607 = this.field1843;
		var3.field1602 = this.field1839;
		var1.method3534(var3);
	}
}
