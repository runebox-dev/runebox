import io.runebox.ObfInfo;

@ObfInfo(name = "nw")
public class Class361 extends Class516 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -8597909)
	public final int field3798;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1301306069)
	public final int field3799;
	@ObfInfo(name = "ak", desc = "[I")
	public final int[] field3797;
	@ObfInfo(name = "ag", desc = "[I")
	public final int[] field3800;

	public Class361(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.field3798 = var1;
		this.field3799 = var2;
		this.field3800 = var3;
		this.field3797 = var4;
	}

	@ObfInfo(name = "aq", desc = "(IIB)Z", opaque = "7")
	public boolean method6616(int var1, int var2) {
		if (var2 >= 0 && var2 < this.field3797.length) {
			int var4 = this.field3797[var2];
			if (var1 >= var4 && var1 <= this.field3800[var2] + var4) {
				return true;
			}
		}

		return false;
	}
}
