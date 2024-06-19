public abstract class Class499 {
	public double field5096;
	public int field5098;
	public int field5099;
	public int field5100;

	public Class499(int var1, int var2) {
		this.field5100 = 0;
		this.field5098 = 0;
		this.field5096 = 0.0D;
		this.field5099 = 0;
		this.field5100 = var1;
		this.field5098 = 0;
		this.field5099 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5096 = Class73.method2079(this.field5098, this.field5100, this.field5099);
	}

	public void method9208() {
		if (this.field5098 < this.field5100) {
			++this.field5098;
			this.field5096 = Class73.method2079(this.field5098, this.field5100, this.field5099);
		}

	}

	public double method9209() {
		return this.field5096;
	}
}
