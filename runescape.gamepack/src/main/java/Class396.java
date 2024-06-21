import io.runebox.ObfInfo;
import java.util.Comparator;

final class Class396 implements Comparator {
	public Class396() {
	}

	@ObfInfo(name = "ak", desc = "(Lpm;Lpm;S)I", opaque = "179")
	public int method7422(Class403 var1, Class403 var2) {
		return var1.field4622.field4590 < var2.field4622.field4590 ? -1 : (var1.field4622.field4590 == var2.field4622.field4590 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method7422((Class403)var1, (Class403)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
