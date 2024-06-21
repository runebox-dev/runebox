import io.runebox.ObfInfo;

public class Class174 extends Class181 {
	@ObfInfo(name = "al", desc = "B")
	public byte field1862;
	@ObfInfo(name = "aj", desc = "B")
	public byte field1863;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field1864;
	// $FF: synthetic field
	public final Class180 this$0;

	public Class174(Class180 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3087(Class521 var1) {
		this.field1864 = var1.method9414();
		if (this.field1864 != null) {
			var1.method9405();
			this.field1862 = var1.method9406();
			this.field1863 = var1.method9406();
		}

	}

	@ObfInfo(name = "al", desc = "(Lgo;I)V")
	public void method3089(Class171 var1) {
		var1.field1851 = this.field1864;
		if (this.field1864 != null) {
			var1.field1852 = this.field1862;
			var1.field1853 = this.field1863;
		}

	}
}
