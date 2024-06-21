import io.runebox.ObfInfo;

@ObfInfo(name = "nf")
public class Class344 {
	@ObfInfo(desc = "(II)Z")
	public static boolean method3212(int var0, int var1) {
		return 0 != (var0 >> var1 + 1 & 1);
	}

	@ObfInfo(desc = "(I)I")
	public static int method3653(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfInfo(desc = "(I)I")
	public static int method6213(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfInfo(desc = "(I)Z")
	public static boolean method345(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfInfo(desc = "(I)Z")
	public static boolean method3423(int var0) {
		return (var0 >> 21 & 1) != 0;
	}
}
