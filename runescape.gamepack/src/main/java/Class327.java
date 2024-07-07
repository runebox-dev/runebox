import io.runebox.ObfInfo;

@ObfInfo(name = "mo")
public final class Class327 {
	@ObfInfo(name = "ap", desc = "Lpt;")
	public Class410 field3500;
	@ObfInfo(name = "ak", desc = "Lth;")
	public Class502 field3499;
	@ObfInfo(name = "aq", desc = "Ltv;")
	public Class516 field3496;
	@ObfInfo(name = "ad", desc = "I")
	public int field3497;
	@ObfInfo(name = "ag", desc = "I")
	public int field3498;

	public Class327(int var1) {
		this.field3496 = new Class516();
		this.field3500 = new Class410();
		this.field3497 = var1;
		this.field3498 = var1;

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
		}

		this.field3499 = new Class502(var2);
	}

	@ObfInfo(name = "aq", desc = "(J)Ltv;")
	public Class516 method6327(long var1) {
		Class516 var3 = (Class516)this.field3499.method8901(var1);
		if (var3 != null) {
			this.field3500.method7558(var3);
		}

		return var3;
	}

	@ObfInfo(name = "ad", desc = "(J)V")
	public void method6335(long var1) {
		Class516 var3 = (Class516)this.field3499.method8901(var1);
		if (var3 != null) {
			var3.method9267();
			var3.method9044();
			++this.field3498;
		}

	}

	@ObfInfo(name = "ag", desc = "(Ltv;J)V")
	public void method6330(Class516 var1, long var2) {
		if (this.field3498 == 0) {
			Class516 var4 = this.field3500.method7570();
			var4.method9267();
			var4.method9044();
			if (this.field3496 == var4) {
				var4 = this.field3500.method7570();
				var4.method9267();
				var4.method9044();
			}
		} else {
			--this.field3498;
		}

		this.field3499.method8902(var1, var2);
		this.field3500.method7558(var1);
	}

	@ObfInfo(name = "ak", desc = "()V")
	public void method6332() {
		this.field3500.method7562();
		this.field3499.method8903();
		this.field3496 = new Class516();
		this.field3498 = this.field3497;
	}
}
