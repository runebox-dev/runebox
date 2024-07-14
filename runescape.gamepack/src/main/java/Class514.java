import io.runebox.ObfInfo;

@ObfInfo(name = "tt")
public class Class514 extends Class511 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1565062035)
	public int field5149;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1298917515)
	public int field5150;

	public Class514(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5149 = 0;
		this.field5150 = 0;
		this.field5149 = var1;
		this.field5150 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method9032() {
		double var2 = this.method9003();
		return (int)Math.round((double)(this.field5150 - this.field5149) * var2 + (double)this.field5149);
	}
}
