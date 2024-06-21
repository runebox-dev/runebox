import io.runebox.ObfInfo;

public class Class361 extends Class507 {
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1324622685)
	public final int field3968;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -771143131)
	public final int field3970;
	@ObfInfo(name = "az", desc = "[I")
	public final int[] field3967;
	@ObfInfo(name = "aj", desc = "[I")
	public final int[] field3969;

	public Class361(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.field3970 = var1;
		this.field3968 = var2;
		this.field3969 = var3;
		this.field3967 = var4;
	}

	@ObfInfo(name = "ak", desc = "(IIB)Z", opaque = "8")
	public boolean method7100(int var1, int var2) {
		if (var2 >= 0 && var2 < this.field3967.length) {
			int var4 = this.field3967[var2];
			if (var1 >= var4 && var1 <= var4 + this.field3969[var2]) {
				return true;
			}
		}

		return false;
	}
}
