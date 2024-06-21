import io.runebox.ObfInfo;

public final class Class414 {
	@ObfInfo(name = "ak", desc = "Ltm;")
	public Class507 field4655;

	public Class414() {
		this.field4655 = new Class507();
		this.field4655.field5172 = this.field4655;
		this.field4655.field5174 = this.field4655;
	}

	@ObfInfo(name = "ak", desc = "(Ltm;)V")
	public void method7753(Class507 var1) {
		if (var1.field5174 != null) {
			var1.method9280();
		}

		var1.field5174 = this.field4655.field5174;
		var1.field5172 = this.field4655;
		var1.field5174.field5172 = var1;
		var1.field5172.field5174 = var1;
	}

	@ObfInfo(name = "al", desc = "(Ltm;)V")
	public void method7750(Class507 var1) {
		if (var1.field5174 != null) {
			var1.method9280();
		}

		var1.field5174 = this.field4655;
		var1.field5172 = this.field4655.field5172;
		var1.field5174.field5172 = var1;
		var1.field5172.field5174 = var1;
	}

	@ObfInfo(name = "aj", desc = "()Ltm;")
	public Class507 method7751() {
		Class507 var1 = this.field4655.field5172;
		return this.field4655 == var1 ? null : var1;
	}
}
