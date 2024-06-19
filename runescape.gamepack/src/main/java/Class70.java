import java.util.ArrayList;
import java.util.Iterator;

public class Class70 {
	public Class91 field854;
	public int field855;
	public int[] field856;
	public String[] field860;

	public Class70() {
		this.field855 = -1;
	}

	public static Class493[] method1939() {
		return new Class493[]{Class493.field5005, Class493.field5007, Class493.field5006, Class493.field5010};
	}

	public static void method1940(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			Class332.field3453.clear();
			Class332.field3458.clear();
			Class332.method3151(var5);
			if (!var5) {
				Class332.field3456.clear();
			}

			Iterator var7 = var0.iterator();

			while (var7.hasNext()) {
				Class357 var8 = (Class357)var7.next();
				if (var8.field3937 != -1 && -1 != var8.field3933) {
					if (!var5) {
						Class332.field3456.add(var8);
					}

					Class332.field3453.add(var8);
				}
			}

			if (!Class332.field3453.isEmpty()) {
				Class332.method3185(var1, var2, var3, var4);
				Class332.field3458.add(new Class424((Class447)null));
				Class332.field3458.add(new Class468((Class447)null, Client.field4596, Client.field3463, Client.field1661));
				ArrayList var13 = new ArrayList();
				var13.add(new Class437(new Class460((Class447)null, 0, true, Class332.field3457)));
				if (!Class332.field3455.isEmpty()) {
					ArrayList var14 = new ArrayList();
					var14.add(new Class426(new Class461((Class447)null, var13), Class332.field3462));
					ArrayList var10 = new ArrayList();
					Iterator var11 = Class332.field3455.iterator();

					while (var11.hasNext()) {
						Class357 var12 = (Class357)var11.next();
						var10.add(var12);
					}

					var14.add(new Class426(new Class430(new Class441((Class447)null, var10), 0, false, Class332.field3461), Class332.field3460));
					Class332.field3458.add(new Class461((Class447)null, var14));
				} else {
					Class332.field3458.add(new Class426((Class447)null, Class332.field3462));
					Class332.field3458.add(new Class461((Class447)null, var13));
				}

			}
		}
	}
}
