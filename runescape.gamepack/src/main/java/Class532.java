import io.runebox.ObfInfo;

@ObfInfo(name = "ul")
final class Class532 implements Class523 {
	public Class532() {
	}

	@ObfInfo(name = "an", desc = "(Ljava/lang/Long;Lvp;I)V")
	public void method9400(Long var1, Class562 var2) {
		var2.method10034(var1);
	}

	@ObfInfo(name = "ad", desc = "(Lvp;B)Ljava/lang/Object;")
	public Object method9289(Class562 var1) {
		return var1.method9833();
	}

	@ObfInfo(name = "aq", desc = "(Ljava/lang/Object;Lvp;I)V")
	public void method9290(Object var1, Class562 var2) {
		this.method9400((Long)var1, var2);
	}
}
