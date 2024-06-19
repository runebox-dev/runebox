import java.util.HashMap;
import java.util.Map;

public class Class128 {
	public static int field1531;
	public static final Class392 field1528;
	public static final Class515 field1529;
	public static final Map field1533;

	static {
		field1533 = new HashMap();
		field1529 = new Class515(1024);
		field1528 = new Class392();
		field1531 = 0;
	}

	public static void method2747(int var0, String var1, String var2) {
		Class505.method9272(var0, var1, var2, (String)null);
	}

	public static int method2735(int var0) {
		Class80 var2 = (Class80)field1533.get(var0);
		return var2 == null ? 0 : var2.method2225();
	}

	public static int method2731(int var0) {
		Class67 var2 = (Class67)field1529.method9326((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return field1528.field4560 == var2.field5174 ? -1 : ((Class67)var2.field5174).field833;
		}
	}
}
