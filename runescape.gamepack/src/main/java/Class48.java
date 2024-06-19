public class Class48 {
	public int field326;
	public int field329;
	public int field330;
	public int field331;
	public int field332;
	public int field333;
	public int field334;
	public int field335;
	public int field336;
	public int[] field327;
	public int[] field328;

	public Class48() {
		this.field333 = 2;
		this.field327 = new int[2];
		this.field328 = new int[2];
		this.field327[0] = 0;
		this.field327[1] = 65535;
		this.field328[0] = 0;
		this.field328[1] = 65535;
	}

	public final void method864(Class521 var1) {
		this.field332 = var1.method9405();
		this.field329 = var1.method9410();
		this.field330 = var1.method9410();
		this.method866(var1);
	}

	public final void method866(Class521 var1) {
		this.field333 = var1.method9405();
		this.field327 = new int[this.field333];
		this.field328 = new int[this.field333];

		for (int var2 = 0; var2 < this.field333; ++var2) {
			this.field327[var2] = var1.method9407();
			this.field328[var2] = var1.method9407();
		}

	}

	public final void method865() {
		this.field335 = 0;
		this.field331 = 0;
		this.field334 = 0;
		this.field326 = 0;
		this.field336 = 0;
	}

	public final int method867(int var1) {
		if (this.field336 >= this.field335) {
			this.field326 = this.field328[this.field331++] << 15;
			if (this.field331 >= this.field333) {
				this.field331 = this.field333 - 1;
			}

			this.field335 = (int)((double)this.field327[this.field331] / 65536.0D * (double)var1);
			if (this.field335 > this.field336) {
				this.field334 = ((this.field328[this.field331] << 15) - this.field326) / (this.field335 - this.field336);
			}
		}

		this.field326 += this.field334;
		++this.field336;
		return this.field326 - this.field334 >> 15;
	}
}
