import io.runebox.ObfInfo;

public class Class519 extends Class499 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1151427827)
	public int field5207;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -2076905609)
	public int field5208;

	public Class519(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5207 = 0;
		this.field5208 = 0;
		this.field5207 = var1;
		this.field5208 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method9378() {
		double var2 = this.method9209();
		return (int)Math.round((double)this.field5207 + var2 * (double)(this.field5208 - this.field5207));
	}
}
