import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "pj")
final class Class400 implements Comparator {
	public Class400() {
	}

	@ObfInfo(name = "aq", desc = "(Lpm;Lpm;B)I", opaque = "2")
	public int method7462(Class403 var1, Class403 var2) {
		return var1.field4649.field4661 < var2.field4649.field4661 ? -1 : (var1.field4649.field4661 == var2.field4649.field4661 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method7462((Class403)var1, (Class403)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
