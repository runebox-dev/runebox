public class Class475 implements Comparable {
	public Class567 field4940;
	public Class567 field4941;

	public Class567 method8703() {
		return this.field4941;
	}

	public String method8694() {
		return this.field4941 == null ? "" : this.field4941.method10260();
	}

	public String method8690() {
		return this.field4940 == null ? "" : this.field4940.method10260();
	}

	public void method8692(Class567 var1, Class567 var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.field4941 = var1;
			this.field4940 = var2;
		}
	}

	public int method8409(Class475 var1) {
		return this.field4941.method10275(var1.field4941);
	}

	public int compareTo(Object var1) {
		return this.method8409((Class475)var1);
	}
}
