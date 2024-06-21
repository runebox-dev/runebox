import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "sc")
public abstract class Class471 implements Comparator {
	@ObfInfo(name = "al", desc = "Ljava/util/Comparator;")
	public Comparator field4921;

	@ObfInfo(name = "ao", desc = "(Ljava/util/Comparator;I)V", opaque = "-1646299233")
	public final void method8639(Comparator var1) {
		if (this.field4921 == null) {
			this.field4921 = var1;
		} else if (this.field4921 instanceof Class471) {
			((Class471)this.field4921).method8639(var1);
		}

	}

	@ObfInfo(name = "ah", desc = "(Lsg;Lsg;I)I")
	public final int method8640(Class475 var1, Class475 var2) {
		return this.field4921 == null ? 0 : this.field4921.compare(var1, var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
