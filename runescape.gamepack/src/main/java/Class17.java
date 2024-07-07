import io.runebox.ObfInfo;

@ObfInfo(name = "aq")
public class Class17 implements Class11 {
	@ObfInfo(name = "aq", desc = "(Lvp;)Lvp;")
	public Class562 method149(Class562 var1) {
		Class562 var2 = new Class562(100);
		this.method222(var1, var2);
		return var2;
	}

	@ObfInfo(name = "ad", desc = "(Lvp;Lvp;)V")
	public void method222(Class562 var1, Class562 var2) {
		Class2 var3 = new Class2(var1);
		Class14 var4 = new Class14(var3);

		long var5;
		for (var5 = 0L; !var4.method180(var3.method6(), var3.method7(), var5); ++var5) {
		}

		var2.method10034(var5);
	}
}
