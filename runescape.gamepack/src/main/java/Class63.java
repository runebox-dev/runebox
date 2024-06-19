public class Class63 extends Class506 {
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

	public boolean method1116() {
		return this.field464 == null;
	}

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

	public Class44 method1119() {
		if (this.field464.field151 == null) {
			this.field464.field151 = this.field464.field145.method1817((int[])null);
			this.field464.field145 = null;
		}

		return this.field464.field151;
	}

	public static Class366 method1136(int var0) {
		Class366[] var2 = new Class366[]{Class366.field3992, Class366.field3993, Class366.field3994, Class366.field3995};

		for (int var4 = 0; var4 < var2.length; ++var4) {
			Class366 var5 = var2[var4];
			if (var5.field3997 == var0) {
				return var5;
			}
		}

		return null;
	}

	public static Class549 method1135(int var0, int var1, int var2) {
		Class290 var4 = Class279.field3086;
		long var5 = (long)(var2 << 16 | var0 << 8 | var1);
		return (Class549)var4.method5885(var5);
	}

	public static void method1133() {
		if (Class33.field223 != null) {
			synchronized(Class33.field223) {
				Class33.field223 = null;
			}
		}

	}
}
