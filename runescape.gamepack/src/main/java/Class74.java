import io.runebox.ObfInfo;

@ObfInfo(name = "cv")
public class Class74 extends Class520 {
	@ObfInfo(name = "aq", desc = "Lbd;")
	public Class30 field892;

	public Class74() {
		this.field892 = null;
	}

	public Class74(Class64 var1) {
		if (var1 != null) {
			this.field892 = new Class30(var1, (Class38)null);
		}
	}

	public Class74(Class38 var1) {
		this.field892 = new Class30((Class64)null, var1);
	}

	@ObfInfo(name = "aq", desc = "(B)Z", opaque = "1")
	public boolean method2147() {
		return this.field892 == null;
	}

	@ObfInfo(name = "ad", desc = "(I)Lbl;", opaque = "1348910997")
	public Class38 method2152() {
		if (this.field892 != null && this.field892.field145.tryLock()) {
			Class38 var2;
			try {
				var2 = this.method2150();
			} finally {
				this.field892.field145.unlock();
			}

			return var2;
		} else {
			return null;
		}
	}

	@ObfInfo(name = "ag", desc = "(B)Lbl;", opaque = "0")
	public Class38 method2149() {
		if (this.field892 != null) {
			this.field892.field145.lock();

			Class38 var2;
			try {
				var2 = this.method2150();
			} finally {
				this.field892.field145.unlock();
			}

			return var2;
		} else {
			return null;
		}
	}

	@ObfInfo(name = "ak", desc = "(I)Lbl;", opaque = "-1064639137")
	public Class38 method2150() {
		if (this.field892.field143 == null) {
			this.field892.field143 = this.field892.field142.method1306((int[])null);
			this.field892.field142 = null;
		}

		return this.field892.field143;
	}
}
