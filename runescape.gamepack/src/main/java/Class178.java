public class Class178 extends Class190 {
	public long field1879;

	public Class178() {
		this.field1879 = System.nanoTime();
	}

	public void method3556() {
		this.field1879 = System.nanoTime();
	}

	public int method3557(int var1, int var2) {
		long var4 = 1000000L * (long)var2;
		long var6 = this.field1879 - System.nanoTime();
		if (var6 < var4) {
			var6 = var4;
		}

		Class493.method8960(var6 / 1000000L);
		long var8 = System.nanoTime();

		int var10;
		for (var10 = 0; var10 < 10 && (var10 < 1 || this.field1879 < var8); this.field1879 += (long)var1 * 1000000L) {
			++var10;
		}

		if (this.field1879 < var8) {
			this.field1879 = var8;
		}

		return var10;
	}
}
