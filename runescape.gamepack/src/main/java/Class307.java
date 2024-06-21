import io.runebox.ObfInfo;

@ObfInfo(name = "lu")
public final class Class307 {
	@ObfInfo(name = "al", desc = "[I")
	public final int[] field3242;

	public Class307() {
		this.field3242 = new int[4096];
	}

	public Class307(int[] var1) {
		this.field3242 = var1;
	}

	@ObfInfo(name = "ak", desc = "(III)I")
	public final int method6156(int var1, int var2) {
		return this.field3242[var1 + var2 * 64];
	}
}
