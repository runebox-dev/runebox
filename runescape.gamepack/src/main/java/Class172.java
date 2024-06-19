public class Class172 extends Class190 {
	public int field1855;
	public int field1856;
	public int field1857;
	public int field1860;
	public long field1858;
	public long[] field1859;

	public Class172() {
		this.field1859 = new long[10];
		this.field1856 = 256;
		this.field1855 = 1;
		this.field1857 = 0;
		this.field1858 = Class327.method3047();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1859[var1] = this.field1858;
		}

	}

	public void method3556() {
		for (int var2 = 0; var2 < 10; ++var2) {
			this.field1859[var2] = 0L;
		}

	}

	public int method3557(int var1, int var2) {
		int var4 = this.field1856;
		int var5 = this.field1855;
		this.field1856 = 300;
		this.field1855 = 1;
		this.field1858 = Class327.method3047();
		if (0L == this.field1859[this.field1860]) {
			this.field1856 = var4;
			this.field1855 = var5;
		} else if (this.field1858 > this.field1859[this.field1860]) {
			this.field1856 = (int)((long)(var1 * 2560) / (this.field1858 - this.field1859[this.field1860]));
		}

		if (this.field1856 < 25) {
			this.field1856 = 25;
		}

		if (this.field1856 > 256) {
			this.field1856 = 256;
			this.field1855 = (int)((long)var1 - (this.field1858 - this.field1859[this.field1860]) / 10L);
		}

		if (this.field1855 > var1) {
			this.field1855 = var1;
		}

		this.field1859[this.field1860] = this.field1858;
		this.field1860 = (1 + this.field1860) % 10;
		int var6;
		if (this.field1855 > 1) {
			for (var6 = 0; var6 < 10; ++var6) {
				if (0L != this.field1859[var6]) {
					this.field1859[var6] += (long)this.field1855;
				}
			}
		}

		if (this.field1855 < var2) {
			this.field1855 = var2;
		}

		Class493.method8960((long)this.field1855);

		for (var6 = 0; this.field1857 < 256; this.field1857 += this.field1856) {
			++var6;
		}

		this.field1857 &= 255;
		return var6;
	}
}
