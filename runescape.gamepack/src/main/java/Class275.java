import io.runebox.ObfInfo;

@ObfInfo(name = "ko")
public class Class275 extends Class520 {
	@ObfInfo(name = "ai", desc = "Lkj;")
	public Class270 field2817;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 303187343)
	public int field2813;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 360049709)
	public int field2815;
	@ObfInfo(name = "av", desc = "[I")
	public int[] field2810;
	@ObfInfo(name = "ab", desc = "[[I")
	public int[][] field2816;

	public Class275(int var1, byte[] var2) {
		this.field2813 = var1;
		Class562 var3 = new Class562(var2);
		this.field2815 = var3.method9902();
		this.field2810 = new int[this.field2815];
		this.field2816 = new int[this.field2815][];

		int var4;
		for (var4 = 0; var4 < this.field2815; ++var4) {
			this.field2810[var4] = var3.method9902();
		}

		for (var4 = 0; var4 < this.field2815; ++var4) {
			this.field2816[var4] = new int[var3.method9902()];
		}

		for (var4 = 0; var4 < this.field2815; ++var4) {
			for (int var5 = 0; var5 < this.field2816[var4].length; ++var5) {
				this.field2816[var4][var5] = var3.method9902();
			}
		}

		if (var3.field5471 < var3.field5472.length) {
			var4 = var3.method9997();
			if (var4 > 0) {
				this.field2817 = new Class270(var3, var4);
			}
		}

	}

	@ObfInfo(name = "aq", desc = "(B)I")
	public int method5199() {
		return this.field2815;
	}

	@ObfInfo(name = "ad", desc = "(I)Lkj;")
	public Class270 method5200() {
		return this.field2817;
	}
}
