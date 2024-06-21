import io.runebox.ObfInfo;

final class Class112 implements Class350 {
	// $FF: synthetic field
	public final Class340 val$cc;

	public Class112(Class340 var1) {
		this.val$cc = var1;
	}

	@ObfInfo(name = "ak", desc = "(I)V", opaque = "652965052")
	public void method2874() {
		if (this.val$cc != null && this.val$cc.method6533().field3894 != null) {
			Class101 var2 = new Class101();
			var2.method2603(this.val$cc);
			var2.method2598(this.val$cc.method6533().field3894);
			Client.method398().method7477(var2);
		}

	}
}
