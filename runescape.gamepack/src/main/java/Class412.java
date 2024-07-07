import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "pv")
final class Class412 implements Comparator {
	public Class412() {
	}

	@ObfInfo(name = "aq", desc = "(Lpm;Lpm;I)I")
	public int method7603(Class403 var1, Class403 var2) {
		return var1.method7478().compareTo(var2.method7478());
	}

	public int compare(Object var1, Object var2) {
		return this.method7603((Class403)var1, (Class403)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
