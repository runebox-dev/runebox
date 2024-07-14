import io.runebox.ObfInfo;

@ObfInfo(name = "ts")
public class Class513 extends Class507 {
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 161810591)
	public int field5143;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1493674541)
	public int field5144;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 176892205)
	public int field5145;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1074800777)
	public int field5146;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1385835369)
	public int field5147;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1343005253)
	public int field5148;

	public Class513(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5146 = 0;
		this.field5144 = 0;
		this.field5143 = 0;
		this.field5145 = 0;
		this.field5147 = 0;
		this.field5148 = 0;
		this.field5146 = var1;
		this.field5144 = var2;
		this.field5143 = var3;
		this.field5145 = var4;
		this.field5147 = var5;
		this.field5148 = var6;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method8957() {
		double var2 = this.method9003();
		return (int)Math.round((double)(this.field5145 - this.field5146) * var2 + (double)this.field5146);
	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method8958() {
		double var2 = this.method9003();
		return (int)Math.round((double)(this.field5147 - this.field5144) * var2 + (double)this.field5144);
	}

	@ObfInfo(name = "ag", desc = "(I)I")
	public int method8956() {
		double var2 = this.method9003();
		return (int)Math.round((double)(this.field5148 - this.field5143) * var2 + (double)this.field5143);
	}
}
