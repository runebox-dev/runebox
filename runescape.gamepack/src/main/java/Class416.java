import io.runebox.ObfInfo;

@ObfInfo(name = "pz")
public final class Class416 {
	@ObfInfo(name = "aq", desc = "Ltv;")
	public Class516 field4676;

	public Class416() {
		this.field4676 = new Class516();
		this.field4676.field5158 = this.field4676;
		this.field4676.field5156 = this.field4676;
	}

	@ObfInfo(name = "aq", desc = "(Ltv;)V")
	public void method7656(Class516 var1) {
		if (var1.field5156 != null) {
			var1.method9044();
		}

		var1.field5156 = this.field4676.field5156;
		var1.field5158 = this.field4676;
		var1.field5156.field5158 = var1;
		var1.field5158.field5156 = var1;
	}

	@ObfInfo(name = "ad", desc = "(Ltv;)V")
	public void method7657(Class516 var1) {
		if (var1.field5156 != null) {
			var1.method9044();
		}

		var1.field5156 = this.field4676;
		var1.field5158 = this.field4676.field5158;
		var1.field5156.field5158 = var1;
		var1.field5158.field5156 = var1;
	}

	@ObfInfo(name = "ag", desc = "()Ltv;")
	public Class516 method7659() {
		Class516 var1 = this.field4676.field5158;
		return this.field4676 == var1 ? null : var1;
	}
}
