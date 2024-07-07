import io.runebox.ObfInfo;

@ObfInfo(name = "jx")
public class Class258 {
	@ObfInfo(name = "ag", desc = "Ljx;")
	public static final Class258 field2683;
	@ObfInfo(name = "aq", desc = "Ljx;")
	public static final Class258 field2689;
	@ObfInfo(name = "ad", desc = "Ljx;")
	public static final Class258 field2690;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 577264531)
	public final int field2684;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1296221673)
	public final int field2685;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 159073667)
	public final int field2686;

	static {
		field2689 = new Class258(1, 0, 4);
		field2690 = new Class258(0, 1, 2);
		field2683 = new Class258(2, 2, 0);
	}

	public Class258(int var1, int var2, int var3) {
		this.field2684 = var1;
		this.field2685 = var2;
		this.field2686 = var3;
	}

	@ObfInfo(name = "aq", desc = "(FI)Z", opaque = "-1384192412")
	public boolean method4978(float var1) {
		return var1 >= (float)this.field2686;
	}
}
