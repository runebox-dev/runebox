public class Class61 {
	public byte[] field449;
	public int field448;
	public int field451;

	public Class61() {
		this.field449 = null;
		this.field448 = 0;
		this.field451 = 0;
	}

	public int method1109(int var1) {
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = 0; var1 >= 8 - this.field451; var1 -= var5) {
			var5 = 8 - this.field451;
			int var6 = (1 << var5) - 1;
			var3 += (this.field449[this.field448] >> this.field451 & var6) << var4;
			this.field451 = 0;
			++this.field448;
			var4 += var5;
		}

		if (var1 > 0) {
			var5 = (1 << var1) - 1;
			var3 += (this.field449[this.field448] >> this.field451 & var5) << var4;
			this.field451 += var1;
		}

		return var3;
	}

	public int method1104() {
		int var2 = this.field449[this.field448] >> this.field451 & 1;
		++this.field451;
		this.field448 += this.field451 >> 3;
		this.field451 &= 7;
		return var2;
	}

	public void method1102(byte[] var1, int var2) {
		this.field449 = var1;
		this.field448 = var2;
		this.field451 = 0;
	}
}
