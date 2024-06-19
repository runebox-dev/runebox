import java.util.Comparator;

final class Class410 implements Comparator {
	public Class410() {
	}

	public int method7676(Class403 var1, Class403 var2) {
		return var1.field4624 < var2.field4624 ? -1 : (var2.field4624 == var1.field4624 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method7676((Class403)var1, (Class403)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
