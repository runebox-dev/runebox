import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "ng")
public class Class345 implements Comparator {
	@ObfInfo(name = "ak", desc = "(Lmy;Lmy;B)I")
	public int method6681(Class337 var1, Class337 var2) {
		return var1.field3524 - var2.field3524;
	}

	@ObfInfo(desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method6681((Class337)var1, (Class337)var2);
	}

	@ObfInfo(desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
