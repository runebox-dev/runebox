import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "ji")
public class Class243 implements Comparator {
	@ObfInfo(name = "aq", desc = "(Liz;Liz;I)I")
	public int method4682(Class234 var1, Class234 var2) {
		return var1.method4451() - var2.method4451();
	}

	public int compare(Object var1, Object var2) {
		return this.method4682((Class234)var1, (Class234)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
