import io.runebox.ObfInfo;

@ObfInfo(name = "br")
public class Class44 {
	@ObfInfo(name = "ad", desc = "I")
	public int field241;
	@ObfInfo(name = "aq", desc = "I")
	public int field243;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field240;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field242;

	public Class44() {
		Class67 var1 = Class64.field498;
		var1.method1942(16);
		this.field243 = var1.method1930() != 0 ? var1.method1942(4) + 1 : 1;
		if (var1.method1930() != 0) {
			var1.method1942(8);
		}

		var1.method1942(2);
		if (this.field243 > 1) {
			this.field241 = var1.method1942(4);
		}

		this.field242 = new int[this.field243];
		this.field240 = new int[this.field243];

		for (int var2 = 0; var2 < this.field243; ++var2) {
			var1.method1942(8);
			this.field242[var2] = var1.method1942(8);
			this.field240[var2] = var1.method1942(8);
		}

	}
}
