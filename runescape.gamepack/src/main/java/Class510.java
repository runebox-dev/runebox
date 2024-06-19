public class Class510 extends Class514 {
	public int field5177;
	public int field5178;
	public int field5179;
	public int field5180;
	public int field5181;
	public int field5182;

	public Class510(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5178 = 0;
		this.field5177 = 0;
		this.field5179 = 0;
		this.field5180 = 0;
		this.field5181 = 0;
		this.field5182 = 0;
		this.field5178 = var1;
		this.field5177 = var2;
		this.field5179 = var3;
		this.field5180 = var4;
		this.field5181 = var5;
		this.field5182 = var6;
	}

	public int method9228() {
		double var2 = this.method9209();
		return (int)Math.round((double)(this.field5180 - this.field5178) * var2 + (double)this.field5178);
	}

	public int method9229() {
		double var2 = this.method9209();
		return (int)Math.round((double)this.field5177 + var2 * (double)(this.field5181 - this.field5177));
	}

	public int method9230() {
		double var2 = this.method9209();
		return (int)Math.round((double)this.field5179 + (double)(this.field5182 - this.field5179) * var2);
	}
}
