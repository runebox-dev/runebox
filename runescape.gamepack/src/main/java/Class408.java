import io.runebox.ObfInfo;

@ObfInfo(name = "pr")
public class Class408 {
	@ObfInfo(name = "ad", desc = "Ltz;")
	public Class520 field4658;
	@ObfInfo(name = "aq", desc = "Ltz;")
	public Class520 field4659;

	public Class408() {
		this.field4659 = new Class520();
		this.field4659.field5235 = this.field4659;
		this.field4659.field5233 = this.field4659;
	}

	@ObfInfo(name = "aq", desc = "()V")
	public void method7518() {
		while (true) {
			Class520 var1 = this.field4659.field5235;
			if (this.field4659 == var1) {
				this.field4658 = null;
				return;
			}

			var1.method9267();
		}
	}

	@ObfInfo(name = "ad", desc = "(Ltz;)V")
	public void method7506(Class520 var1) {
		if (var1.field5233 != null) {
			var1.method9267();
		}

		var1.field5233 = this.field4659.field5233;
		var1.field5235 = this.field4659;
		var1.field5233.field5235 = var1;
		var1.field5235.field5233 = var1;
	}

	@ObfInfo(name = "ag", desc = "(Ltz;)V")
	public void method7505(Class520 var1) {
		if (var1.field5233 != null) {
			var1.method9267();
		}

		var1.field5233 = this.field4659;
		var1.field5235 = this.field4659.field5235;
		var1.field5233.field5235 = var1;
		var1.field5235.field5233 = var1;
	}

	@ObfInfo(name = "ap", desc = "()Ltz;")
	public Class520 method7507() {
		Class520 var1 = this.field4659.field5235;
		if (this.field4659 == var1) {
			return null;
		} else {
			var1.method9267();
			return var1;
		}
	}

	@ObfInfo(name = "an", desc = "()Ltz;")
	public Class520 method7508() {
		Class520 var1 = this.field4659.field5233;
		if (this.field4659 == var1) {
			return null;
		} else {
			var1.method9267();
			return var1;
		}
	}

	@ObfInfo(name = "aj", desc = "()Ltz;")
	public Class520 method7526() {
		Class520 var1 = this.field4659.field5235;
		if (this.field4659 == var1) {
			this.field4658 = null;
			return null;
		} else {
			this.field4658 = var1.field5235;
			return var1;
		}
	}

	@ObfInfo(name = "av", desc = "()Ltz;")
	public Class520 method7510() {
		Class520 var1 = this.field4659.field5233;
		if (this.field4659 == var1) {
			this.field4658 = null;
			return null;
		} else {
			this.field4658 = var1.field5233;
			return var1;
		}
	}

	@ObfInfo(name = "ab", desc = "()Ltz;")
	public Class520 method7511() {
		Class520 var1 = this.field4658;
		if (this.field4659 == var1) {
			this.field4658 = null;
			return null;
		} else {
			this.field4658 = var1.field5235;
			return var1;
		}
	}

	@ObfInfo(name = "ai", desc = "()Ltz;")
	public Class520 method7512() {
		Class520 var1 = this.field4658;
		if (this.field4659 == var1) {
			this.field4658 = null;
			return null;
		} else {
			this.field4658 = var1.field5233;
			return var1;
		}
	}

	@ObfInfo(name = "ae", desc = "()Z")
	public boolean method7513() {
		return this.field4659.field5235 == this.field4659;
	}

	@ObfInfo(name = "ak", desc = "(Ltz;Ltz;)V")
	public static void method7503(Class520 var0, Class520 var1) {
		if (var0.field5233 != null) {
			var0.method9267();
		}

		var0.field5233 = var1.field5233;
		var0.field5235 = var1;
		var0.field5233.field5235 = var0;
		var0.field5235.field5233 = var0;
	}
}
