public class Class169 extends Class181 {
	public byte field1839;
	public int field1843;
	public String field1841;
	// $FF: synthetic field
	public final Class180 this$0;

	public Class169(Class180 var1) {
		this.this$0 = var1;
		this.field1841 = null;
	}

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

	public void method3089(Class171 var1) {
		Class140 var3 = new Class140();
		var3.field1601 = new Class567(this.field1841);
		var3.field1607 = this.field1843;
		var3.field1602 = this.field1839;
		var1.method3534(var3);
	}
}
