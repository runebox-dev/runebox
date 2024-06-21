import io.runebox.ObfInfo;
import java.util.HashMap;
import java.util.Map;

public class Class128 {
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1651905777)
	public static int field1531;
	@ObfInfo(name = "aj", desc = "Lpb;")
	public static final Class392 field1528;
	@ObfInfo(name = "al", desc = "Ltu;")
	public static final Class515 field1529;
	@ObfInfo(name = "ak", desc = "Ljava/util/Map;")
	public static final Map field1533;

	static {
		field1533 = new HashMap();
		field1529 = new Class515(1024);
		field1528 = new Class392();
		field1531 = 0;
	}

	@ObfInfo(owner = "ea", name = "ak", desc = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method2747(int var0, String var1, String var2) {
		Class505.method9272(var0, var1, var2, (String)null);
	}

	@ObfInfo(owner = "po", name = "aj", desc = "(III)Lco;")
	public static Class67 method7541(int var0, int var1) {
		Class80 var3 = (Class80)field1533.get(var0);
		return var3.method2231(var1);
	}

	@ObfInfo(owner = "bd", name = "az", desc = "(IB)Lco;")
	public static Class67 method452(int var0) {
		return (Class67)field1529.method9326((long)var0);
	}

	@ObfInfo(owner = "dy", name = "af", desc = "(IB)I", opaque = "1")
	public static int method2735(int var0) {
		Class80 var2 = (Class80)field1533.get(var0);
		return var2 == null ? 0 : var2.method2225();
	}

	@ObfInfo(owner = "dt", name = "aa", desc = "(I)V")
	public static void method2508() {
		field1533.clear();
		field1529.method9328();
		field1528.method7388();
		field1531 = 0;
	}

	@ObfInfo(owner = "dx", name = "at", desc = "(II)I", opaque = "-1298755725")
	public static int method2731(int var0) {
		Class67 var2 = (Class67)field1529.method9326((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return field1528.field4560 == var2.field5174 ? -1 : ((Class67)var2.field5174).field833;
		}
	}

	@ObfInfo(owner = "du", name = "ab", desc = "(IS)I", opaque = "254")
	public static int method2518(int var0) {
		Class67 var2 = (Class67)field1529.method9326((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return field1528.field4560 == var2.field5172 ? -1 : ((Class67)var2.field5172).field833;
		}
	}
}
