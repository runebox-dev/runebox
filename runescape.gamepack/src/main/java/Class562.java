import io.runebox.ObfInfo;
import java.util.Comparator;

public class Class562 implements Comparator {
	@ObfInfo(name = "ak", desc = "Z")
	public final boolean field5426;

	public Class562(boolean var1) {
		this.field5426 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lsg;Lsg;I)I")
	public int method10225(Class475 var1, Class475 var2) {
		return this.field5426 ? var1.method8409(var2) : var2.method8409(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method10225((Class475)var1, (Class475)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
