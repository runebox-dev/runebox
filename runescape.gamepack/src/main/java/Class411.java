import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "pu")
final class Class411 implements Comparator {
	public Class411() {
	}

	@ObfInfo(name = "ak", desc = "(Lpm;Lpm;I)I")
	public int method7683(Class403 var1, Class403 var2) {
		return var1.method7540().compareTo(var2.method7540());
	}

	@ObfInfo(desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method7683((Class403)var1, (Class403)var2);
	}

	@ObfInfo(desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
