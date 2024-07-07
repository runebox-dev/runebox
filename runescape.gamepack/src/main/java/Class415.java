import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "py")
final class Class415 implements Comparator {
	public Class415() {
	}

	@ObfInfo(name = "aq", desc = "(Lpm;Lpm;I)I", opaque = "1229514425")
	public int method7648(Class403 var1, Class403 var2) {
		return var1.field4650 < var2.field4650 ? -1 : (var2.field4650 == var1.field4650 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method7648((Class403)var1, (Class403)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
