import io.runebox.ObfInfo;
import java.util.Comparator;

class Class455 implements Comparator {
	// $FF: synthetic field
	public final Class467 this$0;

	public Class455(Class467 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lrp;Lrp;I)I", opaque = "-1901187320")
	public int method8441(Class458 var1, Class458 var2) {
		if (var1.field4865 > var2.field4865) {
			return 1;
		} else {
			return var1.field4865 < var2.field4865 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method8441((Class458)var1, (Class458)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
