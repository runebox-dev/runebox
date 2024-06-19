public class Class446 {
	public boolean field4799;
	public int field4801;
	public int field4803;
	public int field4804;
	public int field4805;
	public long field4797;
	public long field4798;
	public long field4800;
	public long field4802;
	public long field4806;

	public Class446() {
		this.field4798 = -1L;
		this.field4797 = -1L;
		this.field4799 = false;
		this.field4800 = 0L;
		this.field4806 = 0L;
		this.field4802 = 0L;
		this.field4803 = 0;
		this.field4804 = 0;
		this.field4805 = 0;
		this.field4801 = 0;
	}

	public void method8354() {
		this.field4798 = Class327.method3047();
	}

	public void method8353() {
		if (this.field4798 != -1L) {
			this.field4806 = Class327.method3047() - this.field4798;
			this.field4798 = -1L;
		}

	}

	public void method8355(int var1) {
		this.field4797 = Class327.method3047();
		this.field4803 = var1;
	}

	public void method8357() {
		if (this.field4797 != -1L) {
			this.field4800 = Class327.method3047() - this.field4797;
			this.field4797 = -1L;
		}

		++this.field4805;
		this.field4799 = true;
	}

	public void method8358() {
		this.field4799 = false;
		this.field4804 = 0;
	}

	public void method8359() {
		this.method8357();
	}

	public void method8365(Class521 var1) {
		long var3 = this.field4806;
		var3 /= 10L;
		if (var3 < 0L) {
			var3 = 0L;
		} else if (var3 > 65535L) {
			var3 = 65535L;
		}

		var1.method9389((int)var3);
		long var5 = this.field4800;
		var5 /= 10L;
		if (var5 < 0L) {
			var5 = 0L;
		} else if (var5 > 65535L) {
			var5 = 65535L;
		}

		var1.method9389((int)var5);
		long var7 = this.field4802;
		var7 /= 10L;
		if (var7 < 0L) {
			var7 = 0L;
		} else if (var7 > 65535L) {
			var7 = 65535L;
		}

		var1.method9389((int)var7);
		var1.method9389(this.field4803);
		var1.method9389(this.field4804);
		var1.method9389(this.field4805);
		var1.method9389(this.field4801);
	}

	public static int method8360(int var0, int var1) {
		int var3;
		for (var3 = 0; var1 > 0; --var1) {
			var3 = var3 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var3;
	}
}
