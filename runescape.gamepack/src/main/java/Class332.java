import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfInfo(name = "mt")
public class Class332 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -405285165)
	public static int field3457;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1205264695)
	public static int field3460;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -442404381)
	public static int field3461;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -889756167)
	public static int field3462;
	@ObfInfo(name = "az", desc = "Ljava/util/ArrayList;")
	public static ArrayList field3454;
	@ObfInfo(name = "aa", desc = "Ljava/util/ArrayList;")
	public static ArrayList field3455;
	@ObfInfo(name = "at", desc = "Ljava/util/ArrayList;")
	public static ArrayList field3456;
	@ObfInfo(name = "ab", desc = "Ljava/util/ArrayList;")
	public static ArrayList field3458;
	@ObfInfo(name = "af", desc = "Ljava/util/LinkedList;")
	public static LinkedList field3453;
	@ObfInfo(name = "ac", desc = "Ljava/util/List;")
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

	@ObfInfo(owner = "jx", name = "al", desc = "(IIB)V", opaque = "5")
	public static void method4921(int var0, int var1) {
		Iterator var3 = field3459.iterator();

		while (var3.hasNext()) {
			Class330 var4 = (Class330)var3.next();
			var4.method1208(var0, var1);
		}

	}

	@ObfInfo(owner = "cr", name = "aj", desc = "(Ljava/util/ArrayList;IIIIZB)V", opaque = "5")
	public static void method1940(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			field3453.clear();
			field3458.clear();
			method3151(var5);
			if (!var5) {
				field3456.clear();
			}

			Iterator var7 = var0.iterator();

			while (var7.hasNext()) {
				Class357 var8 = (Class357)var7.next();
				if (var8.field3937 != -1 && -1 != var8.field3933) {
					if (!var5) {
						field3456.add(var8);
					}

					field3453.add(var8);
				}
			}

			if (!field3453.isEmpty()) {
				method3185(var1, var2, var3, var4);
				field3458.add(new Class424((Class447)null));
				field3458.add(new Class468((Class447)null, Client.field4596, Client.field3463, Client.field1661));
				ArrayList var13 = new ArrayList();
				var13.add(new Class437(new Class460((Class447)null, 0, true, field3457)));
				if (!field3455.isEmpty()) {
					ArrayList var14 = new ArrayList();
					var14.add(new Class426(new Class461((Class447)null, var13), field3462));
					ArrayList var10 = new ArrayList();
					Iterator var11 = field3455.iterator();

					while (var11.hasNext()) {
						Class357 var12 = (Class357)var11.next();
						var10.add(var12);
					}

					var14.add(new Class426(new Class430(new Class441((Class447)null, var10), 0, false, field3461), field3460));
					field3458.add(new Class461((Class447)null, var14));
				} else {
					field3458.add(new Class426((Class447)null, field3462));
					field3458.add(new Class461((Class447)null, var13));
				}

			}
		}
	}

	@ObfInfo(owner = "ia", name = "af", desc = "(IIIII)V", opaque = "59705338")
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

	@ObfInfo(owner = "bm", name = "aa", desc = "(I)V")
	public static void method785() {
		field3456.clear();
	}

	@ObfInfo(owner = "lh", name = "at", desc = "(Lor;II)V", opaque = "760045931")
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

			method1940(var3, field3460, field3461, field3462, field3457, false);
		}
	}

	@ObfInfo(owner = "fn", name = "ab", desc = "(IIIII)V")
	public static void method3185(int var0, int var1, int var2, int var3) {
		field3460 = var0;
		field3461 = var1;
		field3462 = var2;
		field3457 = var3;
	}

	@ObfInfo(owner = "di", name = "ac", desc = "(B)V", opaque = "1")
	public static void method2354() {
		Iterator var1 = field3455.iterator();

		while (var1.hasNext()) {
			Class357 var2 = (Class357)var1.next();
			if (var2 != null) {
				var2.field3940.method6319();
				var2.field3940.method6313();
				var2.field3940.method6400(0);
				var2.field3940.field3509 = 0;
				method4921(var2.field3937, var2.field3933);
			}
		}

		field3455.clear();
	}

	@ObfInfo(owner = "fl", name = "ao", desc = "(ZB)V", opaque = "5")
	public static void method3151(boolean var0) {
		if (var0) {
			method2354();
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
