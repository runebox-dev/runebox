public class Class115 extends Class471 {
	public final boolean field1441;

	public Class115(boolean var1) {
		this.field1441 = var1;
	}

	public int method2886(Class483 var1, Class483 var2) {
		if (var1.field4959 == Client.field557 && Client.field557 == var2.field4959) {
			return this.field1441 ? var1.field4960 - var2.field4960 : var2.field4960 - var1.field4960;
		} else {
			return this.method8640(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2886((Class483)var1, (Class483)var2);
	}
}
