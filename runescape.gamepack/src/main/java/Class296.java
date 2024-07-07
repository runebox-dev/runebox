import io.runebox.ObfInfo;

@ObfInfo(name = "lj")
public class Class296 {
	@ObfInfo(name = "ak", desc = "Z")
	public static boolean field3048;
	@ObfInfo(name = "aq", desc = "Z")
	public static boolean field3050;
	@ObfInfo(owner = "ef", name = "ai", desc = "I", intMultiplier = -788619659)
	public static int field1378;
	@ObfInfo(owner = "fl", name = "an", desc = "I", intMultiplier = 796681421)
	public static int field1642;
	@ObfInfo(owner = "js", name = "au", desc = "I", intMultiplier = -1109762615)
	public static int field2656;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1893450617)
	public static int field3046;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1815334145)
	public static int field3047;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1299904891)
	public static int field3049;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 427658537)
	public static int field3051;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -82596875)
	public static int field3052;
	@ObfInfo(owner = "nh", name = "av", desc = "I", intMultiplier = 879717905)
	public static int field3738;
	@ObfInfo(owner = "nt", name = "ae", desc = "I", intMultiplier = 570349149)
	public static int field3787;
	@ObfInfo(owner = "rh", name = "ab", desc = "I", intMultiplier = 41907731)
	public static int field4853;
	@ObfInfo(owner = "si", name = "ah", desc = "I", intMultiplier = -1951596397)
	public static int field4973;
	@ObfInfo(name = "ax", desc = "[J")
	public static long[] field3053;

	static {
		field3050 = false;
		field3047 = 0;
		field3046 = 0;
		field3048 = false;
		field3052 = 0;
		field3053 = new long[1000];
	}

	@ObfInfo(owner = "ev", name = "aq", desc = "(J)I")
	public static int method3011(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfInfo(owner = "od", name = "ad", desc = "(II)I")
	public static int method7062(int var0) {
		return method8023(field3053[var0]);
	}

	@ObfInfo(owner = "ql", name = "ag", desc = "(J)I")
	public static int method8023(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfInfo(owner = "fs", name = "ak", desc = "(II)I")
	public static int method3212(int var0) {
		return method4404(field3053[var0]);
	}

	@ObfInfo(owner = "it", name = "ap", desc = "(J)I")
	public static int method4404(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfInfo(owner = "fv", name = "an", desc = "(II)I")
	public static int method3254(int var0) {
		long var3 = field3053[var0];
		int var2 = (int)(var3 >>> 49 & 2047L);
		return var2;
	}

	@ObfInfo(owner = "ih", name = "aj", desc = "(IIIZIII)J", opaque = "-2074590158")
	public static long method4129(int var0, int var1, int var2, boolean var3, int var4, int var5) {
		long var7 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17 | ((long)var5 & 2047L) << 49;
		if (var3) {
			var7 |= 65536L;
		}

		return var7;
	}

	@ObfInfo(owner = "gy", name = "av", desc = "(B)V")
	public static void method3616() {
		field3050 = false;
		field3052 = 0;
	}

	@ObfInfo(owner = "jc", name = "ai", desc = "(Llv;IIIIIIIII)Z", opaque = "1884826881")
	public static boolean method4578(Class308 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		boolean var10 = field3050;
		if (!var10) {
			return false;
		} else {
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var28;
			if (!field3048) {
				byte var15 = 50;
				var16 = Class285.method5649();
				var17 = (field3047 - Class274.method5120()) * var15 / Class274.method5126();
				var18 = (field3046 - Class274.method5115()) * var15 / Class274.method5126();
				var19 = (field3047 - Class274.method5120()) * var16 / Class274.method5126();
				var20 = (field3046 - Class274.method5115()) * var16 / Class274.method5126();
				int var22 = var18 * var6 + var15 * var5 >> 16;
				var28 = Class304.method5080(var18, var15, var6, var5);
				int var23 = var20 * var6 + var16 * var5 >> 16;
				var16 = Class304.method5080(var20, var16, var6, var5);
				int var24 = var17 * var8 - var28 * var7 >> 16;
				int var25 = var17 * var7 + var28 * var8 >> 16;
				int var26 = var19 * var8 - var16 * var7 >> 16;
				int var27 = var16 * var8 + var19 * var7 >> 16;
				field3049 = (var26 + var24) / 2;
				field1642 = (var23 + var22) / 2;
				field3051 = (var27 + var25) / 2;
				field3738 = (var26 - var24) / 2;
				field4853 = (var23 - var22) / 2;
				field1378 = (var27 - var25) / 2;
				field3787 = Math.abs(field3738);
				field2656 = Math.abs(field4853);
				field4973 = Math.abs(field1378);
			}

			Class261 var11 = (Class261)var0.field3188.get(var1);
			int var12 = var11.field2706 + var2;
			int var13 = var3 + var11.field2702;
			int var14 = var11.field2701 + var4;
			var28 = var11.field2704;
			var16 = var11.field2705;
			var17 = var11.field2703;
			var18 = field3049 - var12;
			var19 = field1642 - var13;
			var20 = field3051 - var14;
			if (Math.abs(var18) > field3787 + var28) {
				return false;
			} else if (Math.abs(var19) > var16 + field2656) {
				return false;
			} else if (Math.abs(var20) > var17 + field4973) {
				return false;
			} else if (Math.abs(var20 * field4853 - var19 * field1378) > var16 * field4973 + field2656 * var17) {
				return false;
			} else if (Math.abs(field1378 * var18 - var20 * field3738) > var28 * field4973 + field3787 * var17) {
				return false;
			} else {
				return Math.abs(var19 * field3738 - var18 * field4853) <= field2656 * var28 + field3787 * var16;
			}
		}
	}

	@ObfInfo(owner = "bd", name = "ae", desc = "(IIIIIIII)Z", opaque = "-1775223703")
	public static boolean method435(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 + field3046;
		if (var8 < var0 && var8 < var1 && var8 < var2) {
			return false;
		} else {
			var8 = field3046 - var6;
			if (var8 > var0 && var8 > var1 && var8 > var2) {
				return false;
			} else {
				var8 = field3047 + var6;
				if (var8 < var3 && var8 < var4 && var8 < var5) {
					return false;
				} else {
					var8 = field3047 - var6;
					return var8 <= var3 || var8 <= var4 || var8 <= var5;
				}
			}
		}
	}
}
