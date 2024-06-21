import io.runebox.ObfInfo;

public class Class11 implements Class26 {
	@ObfInfo(name = "ak", desc = "(Lua;)Lua;")
	public Class521 method147(Class521 var1) {
		Class521 var2 = new Class521(100);
		this.method144(var1, var2);
		return var2;
	}

	@ObfInfo(name = "al", desc = "(Lua;Lua;)V")
	public void method144(Class521 var1, Class521 var2) {
		Class3 var3 = new Class3(var1);
		Class1 var4 = new Class1(var3);

		long var5;
		for (var5 = 0L; !var4.method2(var3.method41(), var3.method38(), var5); ++var5) {
		}

		var2.method9393(var5);
	}
}
