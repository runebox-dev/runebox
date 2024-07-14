import io.runebox.ObfInfo;

@ObfInfo(name = "tl")
public class Class506 extends Class507 {
	@ObfInfo(name = "aj", desc = "D")
	public double field5086;
	@ObfInfo(name = "ag", desc = "D")
	public double field5087;
	@ObfInfo(name = "ak", desc = "D")
	public double field5088;
	@ObfInfo(name = "ap", desc = "D")
	public double field5089;
	@ObfInfo(name = "an", desc = "D")
	public double field5090;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1651361859)
	public int field5085;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 773906829)
	public int field5091;

	public Class506(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5085 = 0;
		this.field5091 = 0;
		this.field5087 = 0.0D;
		this.field5088 = 0.0D;
		this.field5089 = 0.0D;
		this.field5090 = 0.0D;
		this.field5086 = 0.0D;
		this.field5085 = var3;
		this.field5091 = var6;
		if ((var7 - var1) * (var5 - var8) == (var8 - var2) * (var4 - var7)) {
			this.field5087 = (double)var4;
			this.field5088 = (double)var5;
		} else {
			double var11 = (double)((float)(var1 + var7)) / 2.0D;
			double var13 = (double)((float)(var2 + var8)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field5087 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
			this.field5088 = (this.field5087 - var11) * var19 + var13;
			this.field5089 = Math.sqrt(Math.pow(this.field5087 - (double)var1, 2.0D) + Math.pow(this.field5088 - (double)var2, 2.0D));
			this.field5090 = Math.atan2((double)var2 - this.field5088, (double)var1 - this.field5087);
			double var23 = Math.atan2((double)var8 - this.field5088, (double)var7 - this.field5087);
			this.field5086 = Math.atan2((double)var5 - this.field5088, (double)var4 - this.field5087);
			boolean var25 = this.field5090 <= var23 && var23 <= this.field5086 || this.field5086 <= var23 && var23 <= this.field5090;
			if (!var25) {
				this.field5086 += 3.141592653589793D * (double)(this.field5090 - this.field5086 > 0.0D ? 2 : -2);
			}

		}
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method8957() {
		double var2 = this.method9003();
		double var4 = (this.field5086 - this.field5090) * var2 + this.field5090;
		return (int)Math.round(this.field5087 + this.field5089 * Math.cos(var4));
	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method8958() {
		double var2 = this.method9003();
		double var4 = (this.field5086 - this.field5090) * var2 + this.field5090;
		return (int)Math.round(this.field5088 + this.field5089 * Math.sin(var4));
	}

	@ObfInfo(name = "ag", desc = "(I)I")
	public int method8956() {
		double var2 = this.method9003();
		return (int)Math.round((double)(this.field5091 - this.field5085) * var2 + (double)this.field5085);
	}
}
