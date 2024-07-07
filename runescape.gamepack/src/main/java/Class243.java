import io.runebox.ObfInfo;

@ObfInfo(name = "ji")
public class Class243 {
	@ObfInfo(name = "az", desc = "I", intMultiplier = -251425913)
	public int field2623;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1470630343)
	public int field2628;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1566139879)
	public final int field2626;
	@ObfInfo(name = "af", desc = "[I")
	public final int[] field2624;
	@ObfInfo(name = "aa", desc = "[I")
	public final int[] field2625;
	@ObfInfo(name = "al", desc = "[[I")
	public final int[][] field2620;
	@ObfInfo(name = "ak", desc = "[[I")
	public final int[][] field2621;

	public Class243(int var1, int var2) {
		this.field2621 = new int[var1][var2];
		this.field2620 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = Class248.method4765(var3 / 4);
		this.field2624 = new int[var4];
		this.field2625 = new int[var4];
		this.field2626 = var4 - 1;
	}

	@ObfInfo(name = "ak", desc = "(I)V", opaque = "-1760860991")
	public void method4676() {
		for (int var2 = 0; var2 < this.field2621.length; ++var2) {
			for (int var3 = 0; var3 < this.field2621[var2].length; ++var3) {
				this.field2621[var2][var3] = 0;
				this.field2620[var2][var3] = 99999999;
			}
		}

	}

	@ObfInfo(name = "al", desc = "(III)V")
	public void method4677(int var1, int var2) {
		this.field2628 = var1;
		this.field2623 = var2;
	}

	@ObfInfo(name = "aj", desc = "(B)I")
	public int method4678() {
		return this.field2628;
	}

	@ObfInfo(name = "az", desc = "(I)I")
	public int method4700() {
		return this.field2623;
	}

	@ObfInfo(name = "af", desc = "(I)I")
	public int method4680() {
		return this.field2621.length;
	}

	@ObfInfo(name = "aa", desc = "(I)I")
	public int method4689() {
		return this.field2621[0].length;
	}

	@ObfInfo(name = "at", desc = "(I)[[I")
	public int[][] method4699() {
		return this.field2621;
	}

	@ObfInfo(name = "ab", desc = "(I)[[I")
	public int[][] method4683() {
		return this.field2620;
	}

	@ObfInfo(name = "ac", desc = "(I)[I")
	public int[] method4691() {
		return this.field2624;
	}

	@ObfInfo(name = "ao", desc = "(I)[I")
	public int[] method4685() {
		return this.field2625;
	}

	@ObfInfo(name = "ah", desc = "(I)I")
	public int method4686() {
		return this.field2626;
	}
}
