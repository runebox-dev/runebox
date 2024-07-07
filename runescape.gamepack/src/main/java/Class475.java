import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "sg")
public abstract class Class475 implements Comparator {
	@ObfInfo(name = "ad", desc = "Ljava/util/Comparator;")
	public Comparator field4968;

	@ObfInfo(name = "aj", desc = "(Ljava/util/Comparator;I)V", opaque = "1647593262")
	public final void method8666(Comparator var1) {
		if (this.field4968 == null) {
			this.field4968 = var1;
		} else if (this.field4968 instanceof Class475) {
			((Class475)this.field4968).method8666(var1);
		}

	}

	@ObfInfo(name = "av", desc = "(Lsk;Lsk;I)I", opaque = "209851529")
	public final int method8667(Class479 var1, Class479 var2) {
		return this.field4968 == null ? 0 : this.field4968.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
