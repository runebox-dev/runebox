import io.runebox.ObfInfo;

@ObfInfo(name = "hz")
public class Class208 {
	@ObfInfo(owner = "js", name = "ad", desc = "(Lth;III)I", opaque = "-607359029")
	public static int method4938(Class502 var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			Class508 var4 = (Class508)var0.method8901((long)var1);
			return var4 == null ? var2 : var4.field5094;
		}
	}

	@ObfInfo(owner = "ej", name = "ag", desc = "(Lth;ILjava/lang/String;I)Ljava/lang/String;", opaque = "769603282")
	public static String method2917(Class502 var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			Class497 var4 = (Class497)var0.method8901((long)var1);
			return var4 == null ? var2 : (String)var4.field5054;
		}
	}
}
