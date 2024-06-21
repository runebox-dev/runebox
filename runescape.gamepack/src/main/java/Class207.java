import io.runebox.ObfInfo;

@ObfInfo(name = "hy")
public class Class207 extends Class507 {
	@ObfInfo(name = "ak", desc = "Llm;")
	public static Class299 field2096;

	static {
		field2096 = new Class299(64);
	}

	@ObfInfo(name = "od", desc = "(Ljava/lang/String;I)V", opaque = "-1910951575")
	public static void method3960(String var0) {
		if (!var0.equals("")) {
			Class316 var2 = Class316.method3908(Class315.field3344, Client.field548.field1446);
			var2.field3374.method9388(Class521.method7983(var0));
			var2.field3374.method9473(var0);
			Client.field548.method2897(var2);
		}
	}
}
