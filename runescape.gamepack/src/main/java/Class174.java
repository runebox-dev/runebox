public class Class174 extends Class181 {
	public byte field1862;
	public byte field1863;
	public String field1864;
	// $FF: synthetic field
	public final Class180 this$0;

	public Class174(Class180 var1) {
		this.this$0 = var1;
	}

	public void method3087(Class521 var1) {
		this.field1864 = var1.method9414();
		if (this.field1864 != null) {
			var1.method9405();
			this.field1862 = var1.method9406();
			this.field1863 = var1.method9406();
		}

	}

	public void method3089(Class171 var1) {
		var1.field1851 = this.field1864;
		if (this.field1864 != null) {
			var1.field1852 = this.field1862;
			var1.field1853 = this.field1863;
		}

	}
}
