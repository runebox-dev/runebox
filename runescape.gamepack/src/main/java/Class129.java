import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "ey")
public class Class129 implements Comparator {
	@ObfInfo(name = "ak", desc = "Z")
	public final boolean field1535;

	public Class129(boolean var1) {
		this.field1535 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lso;Lso;B)I")
	public int method3037(Class483 var1, Class483 var2) {
		return this.field1535 ? var1.field4960 - var2.field4960 : var2.field4960 - var1.field4960;
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method3037((Class483)var1, (Class483)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
