import io.runebox.ObfInfo;
import java.util.Comparator;

final class Class383 implements Comparator {
	public Class383() {
	}

	@ObfInfo(name = "ak", desc = "(Lpm;Lpm;I)I", opaque = "934387916")
	public int method7309(Class403 var1, Class403 var2) {
		return var1.field4622.field4591 < var2.field4622.field4591 ? -1 : (var2.field4622.field4591 == var1.field4622.field4591 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method7309((Class403)var1, (Class403)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
