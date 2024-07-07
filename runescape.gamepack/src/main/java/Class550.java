import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "vd")
public class Class550 implements Comparator {
	@ObfInfo(name = "ak", desc = "Z")
	public final boolean field5364;

	public Class550(boolean var1) {
		this.field5364 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lsg;Lsg;I)I", opaque = "-489263650")
	public int method10037(Class475 var1, Class475 var2) {
		return this.field5364 ? var1.method8703().method10275(var2.method8703()) : var2.method8703().method10275(var1.method8703());
	}

	public int compare(Object var1, Object var2) {
		return this.method10037((Class475)var1, (Class475)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
