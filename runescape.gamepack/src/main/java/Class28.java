import io.runebox.ObfInfo;

@ObfInfo(name = "bb")
public class Class28 {
	@ObfInfo(name = "av", desc = "I")
	public int field122;
	@ObfInfo(name = "an", desc = "I")
	public int field125;
	@ObfInfo(name = "ap", desc = "I")
	public int field126;
	@ObfInfo(name = "ak", desc = "I")
	public int field127;
	@ObfInfo(name = "aj", desc = "I")
	public int field128;
	@ObfInfo(name = "aq", desc = "I")
	public int field129;
	@ObfInfo(name = "ab", desc = "I")
	public int field130;
	@ObfInfo(name = "ai", desc = "I")
	public int field131;
	@ObfInfo(name = "ae", desc = "I")
	public int field132;
	@ObfInfo(name = "ad", desc = "[I")
	public int[] field123;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field124;

	public Class28() {
		this.field129 = 2;
		this.field123 = new int[2];
		this.field124 = new int[2];
		this.field123[0] = 0;
		this.field123[1] = 65535;
		this.field124[0] = 0;
		this.field124[1] = 65535;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;)V")
	public final void method411(Class562 var1) {
		this.field125 = var1.method9902();
		this.field127 = var1.method9832();
		this.field126 = var1.method9832();
		this.method404(var1);
	}

	@ObfInfo(name = "ad", desc = "(Lvp;)V")
	public final void method404(Class562 var1) {
		this.field129 = var1.method9902();
		this.field123 = new int[this.field129];
		this.field124 = new int[this.field129];

		for (int var2 = 0; var2 < this.field129; ++var2) {
			this.field123[var2] = var1.method9997();
			this.field124[var2] = var1.method9997();
		}

	}

	@ObfInfo(name = "ag", desc = "()V")
	public final void method405() {
		this.field128 = 0;
		this.field122 = 0;
		this.field130 = 0;
		this.field131 = 0;
		this.field132 = 0;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public final int method408(int var1) {
		if (this.field132 >= this.field128) {
			this.field131 = this.field124[this.field122++] << 15;
			if (this.field122 >= this.field129) {
				this.field122 = this.field129 - 1;
			}

			this.field128 = (int)((double)this.field123[this.field122] / 65536.0D * (double)var1);
			if (this.field128 > this.field132) {
				this.field130 = ((this.field124[this.field122] << 15) - this.field131) / (this.field128 - this.field132);
			}
		}

		this.field131 += this.field130;
		++this.field132;
		return this.field131 - this.field130 >> 15;
	}
}
