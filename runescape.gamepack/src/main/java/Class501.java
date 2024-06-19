public class Class501 extends Class514 {
	public double field5133;
	public double field5135;
	public double field5136;
	public double field5137;
	public double field5139;
	public int field5134;
	public int field5138;

	public Class501(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5138 = 0;
		this.field5134 = 0;
		this.field5135 = 0.0D;
		this.field5133 = 0.0D;
		this.field5137 = 0.0D;
		this.field5139 = 0.0D;
		this.field5136 = 0.0D;
		this.field5138 = var3;
		this.field5134 = var6;
		if ((var4 - var7) * (var8 - var2) == (var7 - var1) * (var5 - var8)) {
			this.field5135 = (double)var4;
			this.field5133 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var7 + var4)) / 2.0D;
			double var17 = (double)((float)(var8 + var5)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field5135 = (var17 + (var19 * var11 - var21 * var15) - var13) / (var19 - var21);
			this.field5133 = var19 * (this.field5135 - var11) + var13;
			this.field5137 = Math.sqrt(Math.pow(this.field5135 - (double)var1, 2.0D) + Math.pow(this.field5133 - (double)var2, 2.0D));
			this.field5139 = Math.atan2((double)var2 - this.field5133, (double)var1 - this.field5135);
			double var23 = Math.atan2((double)var8 - this.field5133, (double)var7 - this.field5135);
			this.field5136 = Math.atan2((double)var5 - this.field5133, (double)var4 - this.field5135);
			boolean var25 = this.field5139 <= var23 && var23 <= this.field5136 || this.field5136 <= var23 && var23 <= this.field5139;
			if (!var25) {
				this.field5136 += (double)(this.field5139 - this.field5136 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}

		}
	}

	public int method9228() {
		double var2 = this.method9209();
		double var4 = this.field5139 + var2 * (this.field5136 - this.field5139);
		return (int)Math.round(this.field5135 + this.field5137 * Math.cos(var4));
	}

	public int method9229() {
		double var2 = this.method9209();
		double var4 = var2 * (this.field5136 - this.field5139) + this.field5139;
		return (int)Math.round(this.field5133 + this.field5137 * Math.sin(var4));
	}

	public int method9230() {
		double var2 = this.method9209();
		return (int)Math.round(var2 * (double)(this.field5134 - this.field5138) + (double)this.field5138);
	}
}
