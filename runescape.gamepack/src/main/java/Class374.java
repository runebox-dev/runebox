import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfInfo(name = "oj")
public class Class374 {
	@ObfInfo(name = "ap", desc = "Ljava/util/Comparator;")
	public static Comparator field4439;
	@ObfInfo(name = "ad", desc = "Ljava/util/Comparator;")
	public static Comparator field4440;
	@ObfInfo(name = "ag", desc = "Ljava/util/Comparator;")
	public static Comparator field4441;
	@ObfInfo(name = "ak", desc = "Ljava/util/Comparator;")
	public static Comparator field4442;
	@ObfInfo(name = "aq", desc = "Ljava/util/List;")
	public final List field4444;

	static {
		field4440 = new Class404();
		new Class415();
		field4441 = new Class414();
		field4442 = new Class412();
		field4439 = new Class400();
	}

	public Class374(Class562 var1, boolean var2) {
		int var3 = var1.method9997();
		boolean var4 = var1.method9902() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.method9997();
		this.field4444 = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.field4444.add(new Class403(var1, var5, var3));
		}

	}

	@ObfInfo(name = "aq", desc = "(Ljava/util/Comparator;ZI)V", opaque = "1188325250")
	public void method7125(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.field4444, var1);
		} else {
			Collections.sort(this.field4444, Collections.reverseOrder(var1));
		}

	}
}
