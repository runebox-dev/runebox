import io.runebox.ObfInfo;

public class Class483 extends Class475 {
	@ObfInfo(name = "af", desc = "I", intMultiplier = 580704417)
	public int field4959;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1407439113)
	public int field4960;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -772085279)
	public int field4961;

	public Class483() {
		this.field4959 = -1;
	}

	@ObfInfo(name = "bm", desc = "(III)V")
	public void method8862(int var1, int var2) {
		this.field4959 = var1;
		this.field4960 = var2;
	}

	@ObfInfo(name = "bq", desc = "(B)I")
	public int method8867() {
		return this.field4959;
	}

	@ObfInfo(name = "bj", desc = "(I)Z", opaque = "-763659950")
	public boolean method8861() {
		return this.field4959 > 0;
	}
}
