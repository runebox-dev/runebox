import io.runebox.ObfInfo;

public class Class510 extends Class514 {
	@ObfInfo(name = "al", desc = "I", intMultiplier = -80254017)
	public int field5177;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1187107183)
	public int field5178;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -297415589)
	public int field5179;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1375003211)
	public int field5180;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 972883817)
	public int field5181;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -429974495)
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

	@ObfInfo(name = "ak", desc = "(B)I")
	public int method9228() {
		double var2 = this.method9209();
		return (int)Math.round((double)(this.field5180 - this.field5178) * var2 + (double)this.field5178);
	}

	@ObfInfo(name = "al", desc = "(I)I")
	public int method9229() {
		double var2 = this.method9209();
		return (int)Math.round((double)this.field5177 + var2 * (double)(this.field5181 - this.field5177));
	}

	@ObfInfo(name = "aj", desc = "(I)I")
	public int method9230() {
		double var2 = this.method9209();
		return (int)Math.round((double)this.field5179 + (double)(this.field5182 - this.field5179) * var2);
	}
}
