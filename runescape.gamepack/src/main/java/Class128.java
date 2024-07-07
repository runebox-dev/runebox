import io.runebox.ObfInfo;

@ObfInfo(name = "ex")
final class Class128 implements Class348 {
	// $FF: synthetic field
	public final Class362 val$cc;

	public Class128(Class362 var1) {
		this.val$cc = var1;
	}

	@ObfInfo(name = "aq", desc = "(I)V", opaque = "2053770825")
	public void method2915() {
		if (this.val$cc != null && this.val$cc.method6657().field3708 != null) {
			Class99 var2 = new Class99();
			var2.method2642(this.val$cc);
			var2.method2640(this.val$cc.method6657().field3708);
			Client.method6545().method7506(var2);
		}

	}
}
