import io.runebox.ObfInfo;

@ObfInfo(name = "bv")
public class Class48 {
	@ObfInfo(name = "ao", desc = "I")
	public int field326;
	@ObfInfo(name = "az", desc = "I")
	public int field329;
	@ObfInfo(name = "af", desc = "I")
	public int field330;
	@ObfInfo(name = "ab", desc = "I")
	public int field331;
	@ObfInfo(name = "aa", desc = "I")
	public int field332;
	@ObfInfo(name = "ak", desc = "I")
	public int field333;
	@ObfInfo(name = "ac", desc = "I")
	public int field334;
	@ObfInfo(name = "at", desc = "I")
	public int field335;
	@ObfInfo(name = "ah", desc = "I")
	public int field336;
	@ObfInfo(name = "al", desc = "[I")
	public int[] field327;
	@ObfInfo(name = "aj", desc = "[I")
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

	@ObfInfo(name = "ak", desc = "(Lua;)V")
	public final void method864(Class521 var1) {
		this.field332 = var1.method9405();
		this.field329 = var1.method9410();
		this.field330 = var1.method9410();
		this.method866(var1);
	}

	@ObfInfo(name = "al", desc = "(Lua;)V")
	public final void method866(Class521 var1) {
		this.field333 = var1.method9405();
		this.field327 = new int[this.field333];
		this.field328 = new int[this.field333];

		for (int var2 = 0; var2 < this.field333; ++var2) {
			this.field327[var2] = var1.method9407();
			this.field328[var2] = var1.method9407();
		}

	}

	@ObfInfo(name = "aj", desc = "()V")
	public final void method865() {
		this.field335 = 0;
		this.field331 = 0;
		this.field334 = 0;
		this.field326 = 0;
		this.field336 = 0;
	}

	@ObfInfo(name = "az", desc = "(I)I")
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
