public class Class166 extends Class181 {
	public byte field1825;
	public int field1824;
	public int field1828;
	public String field1826;
	// $FF: synthetic field
	public final Class180 this$0;

	public Class166(Class180 var1) {
		this.this$0 = var1;
		this.field1824 = -1;
	}

	public void method3087(Class521 var1) {
		var1.method9405();
		this.field1824 = var1.method9407();
		this.field1825 = var1.method9406();
		this.field1828 = var1.method9407();
		var1.method9411();
		this.field1826 = var1.method9415();
		var1.method9405();
	}

	public void method3089(Class171 var1) {
		Class140 var3 = (Class140)var1.field1854.get(this.field1824);
		var3.field1602 = this.field1825;
		var3.field1607 = this.field1828;
		var3.field1601 = new Class567(this.field1826);
	}
}
