import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "nv")
public class Class360 implements Comparator {
	@ObfInfo(name = "aq", desc = "(Lme;Lme;I)I")
	public int method6613(Class317 var1, Class317 var2) {
		return var1.field3324 - var2.field3324;
	}

	public int compare(Object var1, Object var2) {
		return this.method6613((Class317)var1, (Class317)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
