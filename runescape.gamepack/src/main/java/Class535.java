import io.runebox.ObfInfo;

@ObfInfo(name = "uo")
public class Class535 {
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -951641387)
	public static final int field5293;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -2006265865)
	public static final int field5294;

	static {
		field5293 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field5294 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	@ObfInfo(owner = "gc", name = "aq", desc = "(II)I")
	public static int method3352(int var0) {
		return var0 >>> 12;
	}

	@ObfInfo(owner = "pa", name = "ad", desc = "(IB)I")
	public static int method7324(int var0) {
		return var0 >>> 4 & field5294;
	}

	@ObfInfo(owner = "oj", name = "ag", desc = "(II)I")
	public static int method7128(int var0) {
		return (var0 & field5293) - 1;
	}
}
