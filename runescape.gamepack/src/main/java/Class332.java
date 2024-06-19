import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class332 {
	public static int field3457;
	public static int field3460;
	public static int field3461;
	public static int field3462;
	public static ArrayList field3454;
	public static ArrayList field3455;
	public static ArrayList field3456;
	public static ArrayList field3458;
	public static LinkedList field3453;
	public static final List field3459;

	static {
		field3454 = null;
		field3453 = new LinkedList();
		field3455 = new ArrayList(3);
		field3456 = new ArrayList(3);
		field3458 = new ArrayList();
		field3459 = new ArrayList();
		field3460 = 0;
		field3461 = 0;
		field3462 = 0;
		field3457 = 0;
	}

	public static void method3887(Class330 var0) {
		if (!field3459.contains(var0)) {
			field3459.add(var0);
		}

	}

	public static void method4921(int var0, int var1) {
		Iterator var3 = field3459.iterator();

		while (var3.hasNext()) {
			Class330 var4 = (Class330)var3.next();
			var4.method1208(var0, var1);
		}

	}

	public static void method3992(int var0, int var1, int var2, int var3) {
		if (field3455.size() > 1 && field3455.get(0) != null && ((Class357)field3455.get(0)).field3940.method6320() && field3455.get(1) != null && ((Class357)field3455.get(1)).field3940.method6320()) {
			method3185(var0, var1, var2, var3);
			field3458.add(new Class427((Class447)null));
			ArrayList var5 = new ArrayList();
			var5.add(new Class426(new Class460((Class447)null, 1, false, field3457), field3462));
			var5.add(new Class426(new Class430((Class447)null, 0, false, field3461), field3460));
			field3458.add(new Class461((Class447)null, var5));
			if (field3456.get(0) != null && field3456.get(1) != null) {
				Class357 var6 = (Class357)field3456.get(0);
				field3456.set(0, field3455.get(1));
				field3456.set(1, var6);
			}
		}

	}

	public static void method5915(Class382 var0, int var1) {
		if (!field3456.isEmpty()) {
			ArrayList var3 = new ArrayList();
			Iterator var4 = field3456.iterator();

			while (var4.hasNext()) {
				Class357 var5 = (Class357)var4.next();
				var5.field3941 = false;
				var5.field3934 = false;
				var5.field3943 = false;
				var5.field3939 = false;
				var5.field3938 = var0;
				var5.field3931 = var1;
				var5.field3935 = 0.0F;
				var3.add(var5);
			}

			Class70.method1940(var3, field3460, field3461, field3462, field3457, false);
		}
	}

	public static void method3185(int var0, int var1, int var2, int var3) {
		field3460 = var0;
		field3461 = var1;
		field3462 = var2;
		field3457 = var3;
	}

	public static void method3151(boolean var0) {
		if (var0) {
			Class87.method2354();
		} else {
			for (int var2 = 0; var2 < field3455.size(); ++var2) {
				Class357 var3 = (Class357)field3455.get(var2);
				if (var3 == null) {
					field3455.remove(var2);
					--var2;
				} else if (var3.field3939) {
					if (var3.field3940.field3509 > 0) {
						--var3.field3940.field3509;
					}

					var3.field3940.method6319();
					var3.field3940.method6313();
					var3.field3940.method6400(0);
					field3455.remove(var2);
					--var2;
				} else {
					var3.field3939 = true;
				}
			}
		}

	}
}
