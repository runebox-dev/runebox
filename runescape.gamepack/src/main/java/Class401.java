import io.runebox.ObfInfo;

public class Class401 {
	@ObfInfo(name = "ak", desc = "Ltl;")
	public Class506 field4605;
	@ObfInfo(name = "al", desc = "Ltl;")
	public Class506 field4606;

	public Class401() {
		this.field4605 = new Class506();
		this.field4605.field5169 = this.field4605;
		this.field4605.field5171 = this.field4605;
	}

	@ObfInfo(name = "ak", desc = "()V")
	public void method7476() {
		while (true) {
			Class506 var1 = this.field4605.field5169;
			if (this.field4605 == var1) {
				this.field4606 = null;
				return;
			}

			var1.method9277();
		}
	}

	@ObfInfo(name = "al", desc = "(Ltl;)V")
	public void method7477(Class506 var1) {
		if (var1.field5171 != null) {
			var1.method9277();
		}

		var1.field5171 = this.field4605.field5171;
		var1.field5169 = this.field4605;
		var1.field5171.field5169 = var1;
		var1.field5169.field5171 = var1;
	}

	@ObfInfo(name = "aj", desc = "(Ltl;)V")
	public void method7478(Class506 var1) {
		if (var1.field5171 != null) {
			var1.method9277();
		}

		var1.field5171 = this.field4605;
		var1.field5169 = this.field4605.field5169;
		var1.field5171.field5169 = var1;
		var1.field5169.field5171 = var1;
	}

	@ObfInfo(name = "af", desc = "()Ltl;")
	public Class506 method7480() {
		Class506 var1 = this.field4605.field5169;
		if (this.field4605 == var1) {
			return null;
		} else {
			var1.method9277();
			return var1;
		}
	}

	@ObfInfo(name = "aa", desc = "()Ltl;")
	public Class506 method7481() {
		Class506 var1 = this.field4605.field5171;
		if (this.field4605 == var1) {
			return null;
		} else {
			var1.method9277();
			return var1;
		}
	}

	@ObfInfo(name = "at", desc = "()Ltl;")
	public Class506 method7482() {
		Class506 var1 = this.field4605.field5169;
		if (this.field4605 == var1) {
			this.field4606 = null;
			return null;
		} else {
			this.field4606 = var1.field5169;
			return var1;
		}
	}

	@ObfInfo(name = "ab", desc = "()Ltl;")
	public Class506 method7483() {
		Class506 var1 = this.field4605.field5171;
		if (this.field4605 == var1) {
			this.field4606 = null;
			return null;
		} else {
			this.field4606 = var1.field5171;
			return var1;
		}
	}

	@ObfInfo(name = "ac", desc = "()Ltl;")
	public Class506 method7490() {
		Class506 var1 = this.field4606;
		if (this.field4605 == var1) {
			this.field4606 = null;
			return null;
		} else {
			this.field4606 = var1.field5169;
			return var1;
		}
	}

	@ObfInfo(name = "ao", desc = "()Ltl;")
	public Class506 method7504() {
		Class506 var1 = this.field4606;
		if (this.field4605 == var1) {
			this.field4606 = null;
			return null;
		} else {
			this.field4606 = var1.field5171;
			return var1;
		}
	}

	@ObfInfo(name = "ah", desc = "()Z")
	public boolean method7485() {
		return this.field4605.field5169 == this.field4605;
	}

	@ObfInfo(name = "az", desc = "(Ltl;Ltl;)V")
	public static void method7479(Class506 var0, Class506 var1) {
		if (var0.field5171 != null) {
			var0.method9277();
		}

		var0.field5171 = var1.field5171;
		var0.field5169 = var1;
		var0.field5171.field5169 = var0;
		var0.field5169.field5171 = var0;
	}
}
