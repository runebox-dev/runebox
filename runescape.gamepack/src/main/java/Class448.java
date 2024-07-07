import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "rf")
class Class448 implements Comparator {
	// $FF: synthetic field
	public final Class444 this$0;

	public Class448(Class444 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lre;Lre;I)I", opaque = "526770924")
	public int method8304(Class447 var1, Class447 var2) {
		if (var1.field4836 > var2.field4836) {
			return 1;
		} else {
			return var1.field4836 < var2.field4836 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method8304((Class447)var1, (Class447)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
