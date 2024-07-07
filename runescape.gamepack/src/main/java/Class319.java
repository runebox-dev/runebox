import io.runebox.ObfInfo;

@ObfInfo(name = "mg")
public class Class319 {
	@ObfInfo(name = "ak", desc = "[I")
	public static int[] field3393;

	static {
		new Object();
		field3393 = new int[33];
		field3393[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3393[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfInfo(owner = "ln", name = "al", desc = "(II)I")
	public static int method5997(int var0) {
		return field3393[var0];
	}

	@ObfInfo(owner = "cq", name = "aj", desc = "(IB)I")
	public static int method1938(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
		var0 = (var0 >>> 4) + var0 & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfInfo(owner = "cg", name = "az", desc = "(IIII)I")
	public static int method1099(int var0, int var1, int var2) {
		int var4 = method5997(var2 - var1 + 1);
		var4 <<= var1;
		return var0 & ~var4;
	}

	@ObfInfo(owner = "ni", name = "af", desc = "(IIII)I")
	public static int method6695(int var0, int var1, int var2) {
		int var4 = method5997(var2 - var1 + 1);
		var4 <<= var1;
		var0 |= var4;
		return var0;
	}

	@ObfInfo(owner = "rd", name = "ab", desc = "(III)I", opaque = "16777214")
	public static int method8360(int var0, int var1) {
		int var3;
		for (var3 = 0; var1 > 0; --var1) {
			var3 = var3 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var3;
	}

	@ObfInfo(owner = "dy", name = "ac", desc = "(IIB)I")
	public static int method2738(int var0, int var1) {
		int var3 = var0 >>> 31;
		return (var3 + var0) / var1 - var3;
	}
}
