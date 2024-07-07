import io.runebox.ObfInfo;

@ObfInfo(name = "pd")
public class Class394 {
	@ObfInfo(name = "ad", desc = "Ltf;")
	public Class500 field4593;
	@ObfInfo(name = "aq", desc = "Ltf;")
	public Class500 field4594;

	public Class394() {
		this.field4594 = new Class500();
		this.field4594.field5062 = this.field4594;
		this.field4594.field5061 = this.field4594;
	}

	@ObfInfo(name = "aq", desc = "(Ltf;)V")
	public void method7350(Class500 var1) {
		if (var1.field5061 != null) {
			var1.method8885();
		}

		var1.field5061 = this.field4594.field5061;
		var1.field5062 = this.field4594;
		var1.field5061.field5062 = var1;
		var1.field5062.field5061 = var1;
	}

	@ObfInfo(name = "ad", desc = "()Ltf;")
	public Class500 method7351() {
		Class500 var1 = this.field4594.field5062;
		if (this.field4594 == var1) {
			this.field4593 = null;
			return null;
		} else {
			this.field4593 = var1.field5062;
			return var1;
		}
	}

	@ObfInfo(name = "ag", desc = "()Ltf;")
	public Class500 method7359() {
		Class500 var1 = this.field4593;
		if (this.field4594 == var1) {
			this.field4593 = null;
			return null;
		} else {
			this.field4593 = var1.field5062;
			return var1;
		}
	}
}
