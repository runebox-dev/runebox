import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class365 {
	@ObfInfo(name = "af", desc = "Ljava/util/Comparator;")
	public static Comparator field3987;
	@ObfInfo(name = "aj", desc = "Ljava/util/Comparator;")
	public static Comparator field3988;
	@ObfInfo(name = "az", desc = "Ljava/util/Comparator;")
	public static Comparator field3989;
	@ObfInfo(name = "al", desc = "Ljava/util/Comparator;")
	public static Comparator field3990;
	@ObfInfo(name = "ak", desc = "Ljava/util/List;")
	public final List field3986;

	static {
		field3990 = new Class406();
		new Class410();
		field3988 = new Class396();
		field3989 = new Class411();
		field3987 = new Class383();
	}

	public Class365(Class521 var1, boolean var2) {
		int var3 = var1.method9407();
		boolean var4 = var1.method9405() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.method9407();
		this.field3986 = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.field3986.add(new Class403(var1, var5, var3));
		}

	}

	@ObfInfo(name = "ak", desc = "(Ljava/util/Comparator;ZB)V", opaque = "13")
	public void method7125(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.field3986, var1);
		} else {
			Collections.sort(this.field3986, Collections.reverseOrder(var1));
		}

	}
}
