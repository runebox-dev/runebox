import io.runebox.ObfInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfInfo(name = "ek")
public class Class115 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 108964459)
	public static int field1430;
	@ObfInfo(name = "ag", desc = "Lpt;")
	public static final Class410 field1429;
	@ObfInfo(name = "ad", desc = "Lth;")
	public static final Class502 field1428;
	@ObfInfo(name = "aq", desc = "Ljava/util/Map;")
	public static final Map field1432;

	static {
		field1432 = new HashMap();
		field1428 = new Class502(1024);
		field1429 = new Class410();
		field1430 = 0;
	}

	@ObfInfo(owner = "hc", name = "aq", desc = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method3716(int var0, String var1, String var2) {
		Class387.method7265(var0, var1, var2, (String)null);
	}

	@ObfInfo(owner = "dt", name = "ag", desc = "(IIB)Lck;")
	public static Class63 method2638(int var0, int var1) {
		Class92 var3 = (Class92)field1432.get(var0);
		return var3.method2436(var1);
	}

	@ObfInfo(owner = "lf", name = "ak", desc = "(II)Lck;")
	public static Class63 method5731(int var0) {
		return (Class63)field1428.method8901((long)var0);
	}

	@ObfInfo(owner = "cv", name = "ap", desc = "(II)I", opaque = "1380335122")
	public static int method2155(int var0) {
		Class92 var2 = (Class92)field1432.get(var0);
		return var2 == null ? 0 : var2.method2437();
	}

	@ObfInfo(owner = "dh", name = "an", desc = "(I)V")
	public static void method2362() {
		field1432.clear();
		field1428.method8903();
		field1429.method7562();
		field1430 = 0;
	}

	@ObfInfo(owner = "cz", name = "aj", desc = "(IB)I", opaque = "15")
	public static int method2231(int var0) {
		Class63 var2 = (Class63)field1428.method8901((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return field1429.field4667 == var2.field5156 ? -1 : ((Class63)var2.field5156).field481;
		}
	}

	@ObfInfo(owner = "bx", name = "av", desc = "(IB)I", opaque = "2")
	public static int method889(int var0) {
		Class63 var2 = (Class63)field1428.method8901((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return field1429.field4667 == var2.field5158 ? -1 : ((Class63)var2.field5158).field481;
		}
	}

	@ObfInfo(name = "ab", desc = "(B)Ljava/lang/String;", opaque = "126")
	public static String method2940() {
		StringBuilder var1 = new StringBuilder();

		Class63 var3;
		for (Iterator var2 = field1428.iterator(); var2.hasNext(); var1.append(var3.field489).append('\n')) {
			var3 = (Class63)var2.next();
			if (var3.field484 != null && !var3.field484.isEmpty()) {
				var1.append(var3.field484).append(':');
			}
		}

		return var1.toString();
	}
}
