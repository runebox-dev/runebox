public class Class243 {
	public int field2623;
	public int field2628;
	public final int field2626;
	public final int[] field2624;
	public final int[] field2625;
	public final int[][] field2620;
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

	public void method4676() {
		for (int var2 = 0; var2 < this.field2621.length; ++var2) {
			for (int var3 = 0; var3 < this.field2621[var2].length; ++var3) {
				this.field2621[var2][var3] = 0;
				this.field2620[var2][var3] = 99999999;
			}
		}

	}

	public void method4677(int var1, int var2) {
		this.field2628 = var1;
		this.field2623 = var2;
	}

	public int method4678() {
		return this.field2628;
	}

	public int method4700() {
		return this.field2623;
	}

	public int method4680() {
		return this.field2621.length;
	}

	public int method4689() {
		return this.field2621[0].length;
	}

	public int[][] method4699() {
		return this.field2621;
	}

	public int[][] method4683() {
		return this.field2620;
	}

	public int[] method4691() {
		return this.field2624;
	}

	public int[] method4685() {
		return this.field2625;
	}

	public int method4686() {
		return this.field2626;
	}
}
