import io.runebox.ObfInfo;

@ObfInfo(name = "my")
public class Class337 {
	@ObfInfo(name = "aq", desc = "[I")
	public static int[] field3663;

	static {
		new Object();
		field3663 = new int[33];
		field3663[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3663[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfInfo(owner = "cb", name = "aq", desc = "(II)I")
	public static int method1146(int var0) {
		return field3663[var0];
	}

	@ObfInfo(owner = "cw", name = "ad", desc = "(II)I")
	public static int method2219(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
		var0 = (var0 >>> 4) + var0 & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfInfo(owner = "ao", name = "ag", desc = "(IIII)I")
	public static int method215(int var0, int var1, int var2) {
		int var4 = method1146(var2 - var1 + 1);
		var4 <<= var1;
		return var0 & ~var4;
	}

	@ObfInfo(owner = "gp", name = "ak", desc = "(IIIS)I")
	public static int method3554(int var0, int var1, int var2) {
		int var4 = method1146(1 + (var2 - var1));
		var4 <<= var1;
		var0 |= var4;
		return var0;
	}

	@ObfInfo(owner = "pl", name = "ap", desc = "(II)I")
	public static int method7475(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfInfo(name = "ad", desc = "(B)V")
	public static void method6392() {
		Class97.field1186 = (short[][][])null;
		Class97.field1187 = (short[][][])null;
		Class97.field1188 = (byte[][][])null;
		Class97.field3989 = (byte[][][])null;
		Class97.field82 = (int[][][])null;
		Class97.field2822 = (byte[][][])null;
		Class97.field1192 = (int[][])null;
		Class97.field1190 = null;
		Class97.field1191 = null;
		Class97.field34 = null;
		Class97.field1189 = null;
		Class97.field5252 = null;
	}

	@ObfInfo(owner = "gh", name = "an", desc = "(II)I", opaque = "692637456")
	public static int method3414(int var0) {
		int var2 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var2 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var2 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var2 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var2 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var2;
		}

		return var2 + var0;
	}

	@ObfInfo(owner = "ds", name = "aj", desc = "(III)I", opaque = "-760747244")
	public static int method2625(int var0, int var1) {
		int var3;
		for (var3 = 0; var1 > 0; --var1) {
			var3 = var3 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var3;
	}

	@ObfInfo(owner = "hv", name = "av", desc = "(III)I")
	public static int method4003(int var0, int var1) {
		int var3 = var0 >>> 31;
		return (var3 + var0) / var1 - var3;
	}

	@ObfInfo(owner = "fx", name = "ab", desc = "(IIII)I", opaque = "747669371")
	public static int method3325(int var0, int var1, int var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}
}
