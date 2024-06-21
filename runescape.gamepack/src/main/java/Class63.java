import io.runebox.ObfInfo;

public class Class63 extends Class506 {
	@ObfInfo(name = "ak", desc = "Lbc;")
	public Class29 field464;

	public Class63() {
		this.field464 = null;
	}

	public Class63(Class66 var1) {
		if (var1 != null) {
			this.field464 = new Class29(var1, (Class44)null);
		}
	}

	public Class63(Class44 var1) {
		this.field464 = new Class29((Class66)null, var1);
	}

	@ObfInfo(name = "ak", desc = "(B)Z", opaque = "13")
	public boolean method1116() {
		return this.field464 == null;
	}

	@ObfInfo(name = "al", desc = "(I)Lbr;", opaque = "-343595390")
	public Class44 method1117() {
		if (this.field464 != null && this.field464.field146.tryLock()) {
			Class44 var2;
			try {
				var2 = this.method1119();
			} finally {
				this.field464.field146.unlock();
			}

			return var2;
		} else {
			return null;
		}
	}

	@ObfInfo(name = "aj", desc = "(I)Lbr;", opaque = "2108414507")
	public Class44 method1115() {
		if (this.field464 != null) {
			this.field464.field146.lock();

			Class44 var2;
			try {
				var2 = this.method1119();
			} finally {
				this.field464.field146.unlock();
			}

			return var2;
		} else {
			return null;
		}
	}

	@ObfInfo(name = "az", desc = "(B)Lbr;", opaque = "0")
	public Class44 method1119() {
		if (this.field464.field151 == null) {
			this.field464.field151 = this.field464.field145.method1817((int[])null);
			this.field464.field145 = null;
		}

		return this.field464.field151;
	}

	@ObfInfo(name = "ir", desc = "(Ldt;I)V", opaque = "46472907")
	public static void method1134(Class98 var0) {
		int[] var2 = var0.field1288.field1393;

		int var3;
		for (var3 = 0; var3 < var0.field1288.field1392; ++var3) {
			Class83 var4 = var0.field1293[var2[var3]];
			if (var4 != null && var4.field1069 > 0) {
				--var4.field1069;
				if (var4.field1069 == 0) {
					var4.field1075 = null;
				}
			}
		}

		for (var3 = 0; var3 < var0.field1296; ++var3) {
			int var6 = var0.field1297[var3];
			Class100 var5 = var0.field1295[var6];
			if (var5 != null && var5.field1069 > 0) {
				--var5.field1069;
				if (0 == var5.field1069) {
					var5.field1075 = null;
				}
			}
		}

	}
}
