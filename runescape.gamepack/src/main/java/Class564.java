import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "vr")
public class Class564 implements Comparator {
	@ObfInfo(name = "aq", desc = "Z")
	public final boolean field5481;

	public Class564(boolean var1) {
		this.field5481 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lsk;Lsk;I)I")
	public int method10075(Class479 var1, Class479 var2) {
		return this.field5481 ? var1.method8693().method9799(var2.method8693()) : var2.method8693().method9799(var1.method8693());
	}

	public int compare(Object var1, Object var2) {
		return this.method10075((Class479)var1, (Class479)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
