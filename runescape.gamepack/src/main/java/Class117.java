public final class Class117 extends Class255 {
	public boolean field1460;
	public int field1458;
	public int field1459;
	public int field1461;
	public int field1463;
	public int field1464;
	public int field1465;

	public Class117() {
		this.field1463 = 31;
	}

	public void method2919(int var1) {
		this.field1463 = var1;
	}

	public boolean method2921(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1463 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	public final Class262 method1092() {
		return Class7.method109(this.field1465).method4418(this.field1458);
	}
}
