public class Class107 extends Class471 {
	public final boolean field1385;

	public Class107(boolean var1) {
		this.field1385 = var1;
	}

	public int method2777(Class483 var1, Class483 var2) {
		if (var1.field4959 != 0) {
			if (var2.field4959 == 0) {
				return this.field1385 ? -1 : 1;
			}
		} else if (0 != var2.field4959) {
			return this.field1385 ? 1 : -1;
		}

		return this.method8640(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.method2777((Class483)var1, (Class483)var2);
	}
}
