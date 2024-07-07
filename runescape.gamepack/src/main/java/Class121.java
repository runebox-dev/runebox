import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "eq")
public class Class121 implements Comparator {
	@ObfInfo(name = "aq", desc = "Z")
	public final boolean field1458;

	public Class121(boolean var1) {
		this.field1458 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lsh;Lsh;I)I")
	public int method2980(Class476 var1, Class476 var2) {
		return this.field1458 ? var1.field4970 - var2.field4970 : var2.field4970 - var1.field4970;
	}

	public int compare(Object var1, Object var2) {
		return this.method2980((Class476)var1, (Class476)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
