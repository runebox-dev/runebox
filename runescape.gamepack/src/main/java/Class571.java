import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "vy")
public class Class571 implements Comparator {
	@ObfInfo(name = "aq", desc = "Z")
	public final boolean field5515;

	public Class571(boolean var1) {
		this.field5515 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lsk;Lsk;B)I", opaque = "0")
	public int method10219(Class479 var1, Class479 var2) {
		return this.field5515 ? var1.method8393(var2) : var2.method8393(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method10219((Class479)var1, (Class479)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
