public class Class111 extends Class471 {
	public final boolean field1416;

	public Class111(boolean var1) {
		this.field1416 = var1;
	}

	public int method2863(Class483 var1, Class483 var2) {
		if (var2.field4961 != var1.field4961) {
			return this.field1416 ? var1.field4961 - var2.field4961 : var2.field4961 - var1.field4961;
		} else {
			return this.method8640(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2863((Class483)var1, (Class483)var2);
	}

	public static Class141 method2869(int var0) {
		Class141[] var2 = new Class141[]{Class141.field1613, Class141.field1609, Class141.field1616, Class141.field1611, Class141.field1612};
		Class141 var3 = (Class141)Class62.method1112(var2, var0);
		if (var3 == null) {
			var3 = Class141.field1613;
		}

		return var3;
	}
}