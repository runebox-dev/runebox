import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "cs")
public class Class71 implements Comparator {
	@ObfInfo(name = "aq", desc = "Z")
	public boolean field878;

	@ObfInfo(name = "aq", desc = "(Lpm;Lpm;I)I", opaque = "-1263083412")
	public int method2122(Class403 var1, Class403 var2) {
		if (var2.field4650 == var1.field4650) {
			return 0;
		} else {
			if (this.field878) {
				if (var1.field4650 == Client.field525) {
					return -1;
				}

				if (var2.field4650 == Client.field525) {
					return 1;
				}
			}

			return var1.field4650 < var2.field4650 ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2122((Class403)var1, (Class403)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfInfo(name = "jb", desc = "(I)V", opaque = "1232667776")
	public static void method2124() {
		if (Client.field3069 != null) {
			Client.field3069.method9060(Client.field5093.field1016, (Client.field4407.method1959() >> 7) + Client.field5093.field1019, (Client.field4407.method1966() >> 7) + Client.field5093.field1021, false);
			Client.field3069.method9077();
		}

	}
}
