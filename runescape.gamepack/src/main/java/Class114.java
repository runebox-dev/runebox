import io.runebox.ObfInfo;

@ObfInfo(name = "ej")
final class Class114 implements Class348 {
	// $FF: synthetic field
	public final Class362 val$cc;

	public Class114(Class362 var1) {
		this.val$cc = var1;
	}

	@ObfInfo(name = "aq", desc = "(I)V", opaque = "2053770825")
	public void method2915() {
		if (this.val$cc != null && this.val$cc.method6657().field3711 != null) {
			Class99 var2 = new Class99();
			var2.method2642(this.val$cc);
			var2.method2640(this.val$cc.method6657().field3711);
			Client.method6545().method7506(var2);
		}

	}
}
