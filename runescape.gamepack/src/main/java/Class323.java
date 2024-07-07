import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfInfo(name = "mk")
public class Class323 {
	@ObfInfo(name = "ad", desc = "Lok;")
	public static Class375 field3459;
	@ObfInfo(name = "aq", desc = "Lok;")
	public static Class375 field3463;
	@ObfInfo(name = "ag", desc = "Lok;")
	public static Class375 field3471;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 554380341)
	public static int field3460;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -950072303)
	public static int field3466;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 664447525)
	public static int field3469;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1265911605)
	public static int field3470;
	@ObfInfo(name = "av", desc = "Ljava/util/ArrayList;")
	public static ArrayList field3461;
	@ObfInfo(name = "ak", desc = "Ljava/util/ArrayList;")
	public static ArrayList field3462;
	@ObfInfo(name = "an", desc = "Ljava/util/ArrayList;")
	public static ArrayList field3464;
	@ObfInfo(name = "aj", desc = "Ljava/util/ArrayList;")
	public static ArrayList field3465;
	@ObfInfo(name = "ap", desc = "Ljava/util/LinkedList;")
	public static LinkedList field3467;
	@ObfInfo(name = "ab", desc = "Ljava/util/List;")
	public static final List field3468;

	static {
		field3462 = null;
		field3467 = new LinkedList();
		field3464 = new ArrayList(3);
		field3465 = new ArrayList(3);
		field3461 = new ArrayList();
		field3468 = new ArrayList();
		field3460 = 0;
		field3469 = 0;
		field3470 = 0;
		field3466 = 0;
	}

	@ObfInfo(name = "aq", desc = "(Lok;IIB)[Lvv;", opaque = "0")
	public static Class568[] method6308(Class375 var0, int var1, int var2) {
		if (!Class554.method3253(var0, var1, var2)) {
			return null;
		} else {
			Class568[] var5 = new Class568[Client.field5437];

			for (int var6 = 0; var6 < Client.field5437; ++var6) {
				Class568 var7 = var5[var6] = new Class568();
				var7.field5499 = Client.field5433;
				var7.field5498 = Client.field5438;
				var7.field5494 = Client.field1454[var6];
				var7.field5493 = Client.field1561[var6];
				var7.field5495 = Client.field5435[var6];
				var7.field5496 = Client.field3491[var6];
				var7.field5500 = Client.field5432;
				var7.field5497 = Client.field5434[var6];
			}

			Class554.method6571();
			return var5;
		}
	}

	@ObfInfo(owner = "ou", name = "aq", desc = "(Lok;Lok;Lok;Ljava/util/ArrayList;B)Z")
	public static boolean method7257(Class375 var0, Class375 var1, Class375 var2, ArrayList var3) {
		field3463 = var0;
		field3459 = var1;
		field3471 = var2;
		field3462 = var3;
		return true;
	}

	@ObfInfo(owner = "ty", name = "ag", desc = "(Ljava/util/ArrayList;IIIIZI)V", opaque = "-1899132692")
	public static void method9265(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			field3467.clear();
			field3461.clear();
			Class351 var8;
			if (var5) {
				Iterator var7 = field3464.iterator();

				label64:
				while (true) {
					do {
						if (!var7.hasNext()) {
							field3464.clear();
							break label64;
						}

						var8 = (Class351)var7.next();
					} while(var8 == null);

					var8.field3761.method6129();
					var8.field3761.method6094();
					var8.field3761.method6090(0);
					var8.field3761.field3309 = 0;
					int var9 = var8.field3764;
					int var10 = var8.field3753;
					Iterator var11 = field3468.iterator();

					while (var11.hasNext()) {
						Class333 var12 = (Class333)var11.next();
						var12.method1324(var9, var10);
					}
				}
			} else {
				for (int var13 = 0; var13 < field3464.size(); ++var13) {
					var8 = (Class351)field3464.get(var13);
					if (var8 == null) {
						field3464.remove(var13);
						--var13;
					} else if (var8.field3760) {
						if (var8.field3761.field3309 > 0) {
							--var8.field3761.field3309;
						}

						var8.field3761.method6129();
						var8.field3761.method6094();
						var8.field3761.method6090(0);
						field3464.remove(var13);
						--var13;
					} else {
						var8.field3760 = true;
					}
				}
			}

			method3316(var0, var5);
			if (!field3467.isEmpty()) {
				method444(var1, var2, var3, var4);
				field3461.add(new Class420((Class457)null));
				field3461.add(new Class453((Class457)null, field3463, field3459, field3471));
				ArrayList var15 = new ArrayList();
				var15.add(new Class432(new Class468((Class457)null, 0, true, field3466)));
				if (!field3464.isEmpty()) {
					ArrayList var14 = new ArrayList();
					var14.add(new Class438(new Class459((Class457)null, var15), field3470));
					ArrayList var16 = Class88.method2402();
					var14.add(new Class438(new Class452(new Class436((Class457)null, var16), 0, false, field3469), field3460));
					field3461.add(new Class459((Class457)null, var14));
				} else {
					field3461.add(new Class438((Class457)null, field3470));
					field3461.add(new Class459((Class457)null, var15));
				}

			}
		}
	}

	@ObfInfo(owner = "as", name = "ak", desc = "(II)V", opaque = "641695103")
	public static void method277(int var0) {
		if (!field3464.isEmpty()) {
			Iterator var2 = field3464.iterator();

			while (var2.hasNext()) {
				Class351 var3 = (Class351)var2.next();
				if (var3 != null) {
					var3.field3754 = var0;
				}
			}

			Class351 var4 = (Class351)field3464.get(0);
			if (var4 != null && var4.field3761 != null && var4.field3761.method6097() && !var4.field3763) {
				var4.field3761.method6090(var0);
				var4.field3752 = (float)var0;
			}
		}

	}

	@ObfInfo(owner = "fb", name = "ap", desc = "(III)V", opaque = "1264179893")
	public static void method3075(int var0, int var1) {
		method444(var0, var1, 0, 0);
		field3465.clear();
		field3461.clear();
		if (!field3464.isEmpty() && (var0 != 0 || var1 != 0)) {
			field3461.add(new Class438((Class457)null, field3460));
			field3461.add(new Class452((Class457)null, 0, false, field3469));
			ArrayList var9 = new ArrayList();
			Iterator var10 = field3464.iterator();

			while (var10.hasNext()) {
				Class351 var11 = (Class351)var10.next();
				var9.add(var11);
			}

			field3461.add(new Class436((Class457)null, var9));
		} else {
			Iterator var3 = field3464.iterator();

			while (true) {
				Class351 var4;
				do {
					if (!var3.hasNext()) {
						field3464.clear();
						return;
					}

					var4 = (Class351)var3.next();
				} while(var4 == null);

				var4.field3761.method6129();
				var4.field3761.method6094();
				var4.field3761.method6090(0);
				var4.field3761.field3309 = 0;
				int var5 = var4.field3764;
				int var6 = var4.field3753;
				Iterator var7 = field3468.iterator();

				while (var7.hasNext()) {
					Class333 var8 = (Class333)var7.next();
					var8.method1324(var5, var6);
				}
			}
		}
	}

	@ObfInfo(owner = "gj", name = "an", desc = "(B)Z", opaque = "8")
	public static boolean method3450() {
		if (!field3461.isEmpty()) {
			return true;
		} else {
			return !field3464.isEmpty() && field3464.get(0) != null && ((Class351)field3464.get(0)).field3761 != null ? ((Class351)field3464.get(0)).field3761.method6097() : false;
		}
	}

	@ObfInfo(owner = "ex", name = "aj", desc = "(IIIII)V", opaque = "1115336218")
	public static void method3040(int var0, int var1, int var2, int var3) {
		if (field3464.size() > 1 && field3464.get(0) != null && ((Class351)field3464.get(0)).field3761.method6097() && field3464.get(1) != null && ((Class351)field3464.get(1)).field3761.method6097()) {
			method444(var0, var1, var2, var3);
			field3461.add(new Class434((Class457)null));
			ArrayList var5 = new ArrayList();
			var5.add(new Class438(new Class468((Class457)null, 1, false, field3466), field3470));
			var5.add(new Class438(new Class452((Class457)null, 0, false, field3469), field3460));
			field3461.add(new Class459((Class457)null, var5));
			if (field3465.get(0) != null && field3465.get(1) != null) {
				Class351 var6 = (Class351)field3465.get(0);
				field3465.set(0, field3464.get(1));
				field3465.set(1, var6);
			}
		}

	}

	@ObfInfo(owner = "jf", name = "av", desc = "(II)Z", opaque = "-2046494793")
	public static boolean method4622(int var0) {
		if (field3465.isEmpty()) {
			return false;
		} else {
			Class351 var2 = (Class351)field3465.get(0);
			return var2 != null && var2.field3764 == var0;
		}
	}

	@ObfInfo(owner = "jj", name = "ab", desc = "(I)Z", opaque = "-2028841376")
	public static boolean method4690() {
		return !field3465.isEmpty();
	}

	@ObfInfo(owner = "jh", name = "ai", desc = "(I)V")
	public static void method4662() {
		field3465.clear();
	}

	@ObfInfo(owner = "fw", name = "ae", desc = "(Ljava/util/ArrayList;ZI)V", opaque = "-397558820")
	public static void method3316(ArrayList var0, boolean var1) {
		if (!var1) {
			field3465.clear();
		}

		Iterator var3 = var0.iterator();

		while (var3.hasNext()) {
			Class351 var4 = (Class351)var3.next();
			if (-1 != var4.field3764 && -1 != var4.field3753) {
				if (!var1) {
					field3465.add(var4);
				}

				field3467.add(var4);
			}
		}

	}

	@ObfInfo(owner = "bg", name = "au", desc = "(IIIIB)V")
	public static void method444(int var0, int var1, int var2, int var3) {
		field3460 = var0;
		field3469 = var1;
		field3470 = var2;
		field3466 = var3;
	}

	@ObfInfo(owner = "gq", name = "az", desc = "(Ljava/util/ArrayList;IIIIB)V")
	public static void method3560(ArrayList var0, int var1, int var2, int var3, int var4) {
		field3465.clear();
		field3465.addAll(var0);
		method444(var1, var2, var3, var4);
	}
}
