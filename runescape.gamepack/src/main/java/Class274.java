import io.runebox.ObfInfo;

public class Class274 {
	@ObfInfo(name = "ak", desc = "Z")
	public static boolean field3028;
	@ObfInfo(name = "az", desc = "Z")
	public static boolean field3033;
	@ObfInfo(owner = "eq", name = "at", desc = "I", intMultiplier = -1608214613)
	public static int field1489;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1637450235)
	public static int field3023;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -2068561419)
	public static int field3024;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -291553027)
	public static int field3025;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1189565193)
	public static int field3026;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -801708007)
	public static int field3029;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 629882969)
	public static int field3030;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -101648395)
	public static int field3031;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -369508143)
	public static int field3032;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 960707977)
	public static int field3034;
	@ObfInfo(owner = "nw", name = "ac", desc = "I", intMultiplier = -285362375)
	public static int field3971;
	@ObfInfo(owner = "nz", name = "aa", desc = "I", intMultiplier = -1008264913)
	public static int field3983;
	@ObfInfo(name = "ae", desc = "[J")
	public static long[] field3027;

	static {
		field3028 = false;
		field3024 = 0;
		field3025 = 0;
		field3033 = false;
		field3034 = 0;
		field3027 = new long[1000];
	}

	@ObfInfo(name = "af", desc = "(II)Z", opaque = "474054299")
	public static boolean method5518(int var0) {
		return var0 >= Class373.field4065.field4068 && var0 <= Class373.field4066.field4068;
	}

	@ObfInfo(owner = "hk", name = "ak", desc = "(I)I")
	public static int method3812() {
		return field3034;
	}

	@ObfInfo(owner = "lr", name = "aj", desc = "(J)I")
	public static int method6117(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfInfo(owner = "ev", name = "az", desc = "(J)I")
	public static int method3001(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}

	@ObfInfo(owner = "cv", name = "af", desc = "(J)Z")
	public static boolean method2085(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1;
	}

	@ObfInfo(owner = "en", name = "aa", desc = "(J)I")
	public static int method2942(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfInfo(owner = "lg", name = "at", desc = "(II)I")
	public static int method5913(int var0) {
		return method4073(field3027[var0]);
	}

	@ObfInfo(owner = "ih", name = "ab", desc = "(J)I")
	public static int method4073(long var0) {
		return (int)(var0 >>> 49 & 2047L);
	}

	@ObfInfo(owner = "ho", name = "ac", desc = "(IIIZIIB)J")
	public static long method3872(int var0, int var1, int var2, boolean var3, int var4, int var5) {
		long var7 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17 | ((long)var5 & 2047L) << 49;
		if (var3) {
			var7 |= 65536L;
		}

		return var7;
	}

	@ObfInfo(owner = "kl", name = "ao", desc = "(III)V")
	public static void method5477(int var0, int var1) {
		field3024 = var0;
		field3025 = var1;
		field3028 = true;
		field3034 = 0;
		field3033 = false;
	}

	@ObfInfo(owner = "fx", name = "ah", desc = "(I)V")
	public static void method3295() {
		field3028 = false;
		field3034 = 0;
	}

	@ObfInfo(owner = "dx", name = "av", desc = "(B)Z")
	public static boolean method2732() {
		return field3028;
	}

	@ObfInfo(owner = "av", name = "aq", desc = "(IIIII)V", opaque = "846928200")
	public static void method346(int var0, int var1, int var2, int var3) {
		if (!field3033) {
			byte var9 = 50;
			int var10 = Class235.method4555();
			int var11 = (field3024 - Class253.method4805()) * var9 / Class253.method4792();
			int var12 = (field3025 - Class253.method4788()) * var9 / Class253.method4792();
			int var13 = (field3024 - Class253.method4805()) * var10 / Class253.method4792();
			int var14 = (field3025 - Class253.method4788()) * var10 / Class253.method4792();
			int var15 = Class264.method3281(var12, var9, var1, var0);
			int var16 = var9 * var1 - var12 * var0 >> 16;
			var12 = var15;
			var15 = Class264.method3281(var14, var10, var1, var0);
			int var17 = var10 * var1 - var14 * var0 >> 16;
			int var18 = var11 * var3 - var16 * var2 >> 16;
			int var19 = var11 * var2 + var16 * var3 >> 16;
			int var20 = var13 * var3 - var17 * var2 >> 16;
			int var21 = var13 * var2 + var17 * var3 >> 16;
			field3026 = (var20 + var18) / 2;
			field3983 = (var15 + var12) / 2;
			field1489 = (var21 + var19) / 2;
			field3023 = (var20 - var18) / 2;
			field3971 = (var15 - var12) / 2;
			field3029 = (var21 - var19) / 2;
			field3030 = Math.abs(field3023);
			field3031 = Math.abs(field3971);
			field3032 = Math.abs(field3029);
		}
	}

	@ObfInfo(owner = "gx", name = "ap", desc = "(Lkb;IIIIIIIIB)Z", opaque = "26")
	public static boolean method3632(Class262 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (!method2732()) {
			return false;
		} else {
			method346(var5, var6, var7, var8);
			Class249 var10 = (Class249)var0.field2888.get(var1);
			int var11 = var2 + var10.field2669;
			int var12 = var10.field2668 + var3;
			int var13 = var4 + var10.field2667;
			int var14 = var10.field2670;
			int var15 = var10.field2666;
			int var16 = var10.field2665;
			int var17 = field3026 - var11;
			int var18 = field3983 - var12;
			int var19 = field1489 - var13;
			if (Math.abs(var17) > field3030 + var14) {
				return false;
			} else if (Math.abs(var18) > var15 + field3031) {
				return false;
			} else if (Math.abs(var19) > var16 + field3032) {
				return false;
			} else if (Math.abs(var19 * field3971 - field3029 * var18) > var16 * field3031 + var15 * field3032) {
				return false;
			} else if (Math.abs(var17 * field3029 - field3023 * var19) > field3032 * var14 + var16 * field3030) {
				return false;
			} else {
				return Math.abs(field3023 * var18 - field3971 * var17) <= var15 * field3030 + var14 * field3031;
			}
		}
	}
}
