import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "pp")
final class Class406 implements Comparator {
	public Class406() {
	}

	@ObfInfo(name = "ak", desc = "(Lpm;Lpm;I)I", opaque = "-2117844026")
	public int method7561(Class403 var1, Class403 var2) {
		return var1.field4621 < var2.field4621 ? -1 : (var2.field4621 == var1.field4621 ? 0 : 1);
	}

	@ObfInfo(desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method7561((Class403)var1, (Class403)var2);
	}

	@ObfInfo(desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
