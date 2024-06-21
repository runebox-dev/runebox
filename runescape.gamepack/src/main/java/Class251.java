import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "jq")
public class Class251 implements Comparator {
	@ObfInfo(name = "ak", desc = "(Lim;Lim;S)I")
	public int method4773(Class221 var1, Class221 var2) {
		return var1.method4166() - var2.method4166();
	}

	@ObfInfo(desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method4773((Class221)var1, (Class221)var2);
	}

	@ObfInfo(desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
