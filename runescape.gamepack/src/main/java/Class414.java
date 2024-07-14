import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "px")
final class Class414 implements Comparator {
	public Class414() {
	}

	@ObfInfo(name = "aq", desc = "(Lpm;Lpm;I)I", opaque = "-1719899561")
	public int method7641(Class403 var1, Class403 var2) {
		return var1.field4649.field4662 < var2.field4649.field4662 ? -1 : (var1.field4649.field4662 == var2.field4649.field4662 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method7641((Class403)var1, (Class403)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
