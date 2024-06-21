import io.runebox.ObfInfo;

public class Class344 {
	@ObfInfo(owner = "fo", name = "ak", desc = "(IIB)Z")
	public static boolean method3212(int var0, int var1) {
		return 0 != (var0 >> var1 + 1 & 1);
	}

	@ObfInfo(owner = "gz", name = "al", desc = "(II)I")
	public static int method3653(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfInfo(owner = "mg", name = "aj", desc = "(IB)I")
	public static int method6213(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfInfo(owner = "av", name = "az", desc = "(II)Z", opaque = "-638112240")
	public static boolean method345(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfInfo(owner = "gg", name = "af", desc = "(IB)Z", opaque = "6")
	public static boolean method3423(int var0) {
		return (var0 >> 21 & 1) != 0;
	}
}
