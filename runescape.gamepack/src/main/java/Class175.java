public class Class175 extends Class149 {
	public int field1867;
	public String field1866;
	public long field1869;
	// $FF: synthetic field
	public final Class151 this$0;

	public Class175(Class151 var1) {
		this.this$0 = var1;
		this.field1869 = -1L;
		this.field1866 = null;
		this.field1867 = 0;
	}

	public void method3066(Class521 var1) {
		if (var1.method9405() != 255) {
			--var1.field5219;
			this.field1869 = var1.method9411();
		}

		this.field1866 = var1.method9414();
		this.field1867 = var1.method9407();
	}

	public void method3067(Class159 var1) {
		var1.method3339(this.field1869, this.field1866, this.field1867);
	}
}
