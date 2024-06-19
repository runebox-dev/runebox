import java.util.Comparator;

public class Class129 implements Comparator {
	public final boolean field1535;

	public Class129(boolean var1) {
		this.field1535 = var1;
	}

	public int method3037(Class483 var1, Class483 var2) {
		return this.field1535 ? var1.field4960 - var2.field4960 : var2.field4960 - var1.field4960;
	}

	public int compare(Object var1, Object var2) {
		return this.method3037((Class483)var1, (Class483)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
