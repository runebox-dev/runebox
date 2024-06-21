import io.runebox.ObfInfo;

public class Class407 {
	@ObfInfo(name = "al", desc = "Ltq;")
	public Class511 field4634;
	@ObfInfo(name = "ak", desc = "Ltq;")
	public Class511 field4635;

	public Class407() {
		this.field4635 = new Class511();
		this.field4635.field5185 = this.field4635;
		this.field4635.field5184 = this.field4635;
	}

	@ObfInfo(name = "ak", desc = "(Ltq;)V")
	public void method7577(Class511 var1) {
		if (var1.field5184 != null) {
			var1.method9301();
		}

		var1.field5184 = this.field4635.field5184;
		var1.field5185 = this.field4635;
		var1.field5184.field5185 = var1;
		var1.field5185.field5184 = var1;
	}

	@ObfInfo(name = "al", desc = "()Ltq;")
	public Class511 method7568() {
		Class511 var1 = this.field4635.field5185;
		if (this.field4635 == var1) {
			this.field4634 = null;
			return null;
		} else {
			this.field4634 = var1.field5185;
			return var1;
		}
	}

	@ObfInfo(name = "aj", desc = "()Ltq;")
	public Class511 method7570() {
		Class511 var1 = this.field4634;
		if (this.field4635 == var1) {
			this.field4634 = null;
			return null;
		} else {
			this.field4634 = var1.field5185;
			return var1;
		}
	}
}
