import io.runebox.ObfInfo;

@ObfInfo(name = "ja")
public abstract class Class235 extends Class561 {
	@ObfInfo(name = "ao", desc = "I")
	public static int field2518;
	@ObfInfo(name = "ac", desc = "Lkp;")
	public Class276 field2516;
	@ObfInfo(name = "ak", desc = "Z")
	public boolean field2509;
	@ObfInfo(name = "al", desc = "Z")
	public boolean field2510;
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field2513;

	static {
		field2518 = 0;
	}

	public Class235(Class276 var1) {
		this.field2509 = false;
		this.field2510 = false;
		this.field2513 = Class253.field2684;
		this.field2516 = var1;
	}

	@ObfInfo(name = "at", desc = "(IIIIIIFFFI)V")
	public abstract void method4518(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfInfo(name = "ab", desc = "(IIIIIIFFFIIIIIIIIIIIII)V")
	public abstract void method4519(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfInfo(name = "ac", desc = "(IIIIIIFFFIIIIIIIIIIIII)V")
	public abstract void method4520(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfInfo(name = "aa", desc = "(IIIIIIFFFIII)V")
	public abstract void method4524(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfInfo(name = "ak", desc = "([III[F)V")
	public void method4512(int[] var1, int var2, int var3, float[] var4) {
		method10142(var1, var2, var3, var4);
	}

	@ObfInfo(name = "az", desc = "(IIIIIIFFFIIIBBBB)V")
	public void method4515(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method4513(var10, var13, var14, var15, var16);
		var11 = method4513(var11, var13, var14, var15, var16);
		var12 = method4513(var12, var13, var14, var15, var16);
		this.method4524(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfInfo(name = "af", desc = "(IIIIIIFFFIBBBB)V")
	public void method4516(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method4513(var10, var11, var12, var13, var14);
		var10 = this.field2513[var15];
		this.method4518(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfInfo(name = "al", desc = "(IBBBB)I")
	public static int method4513(int var0, byte var1, byte var2, byte var3, byte var4) {
		int var5 = var0 >> 10 & 63;
		int var6 = var0 >> 7 & 7;
		int var7 = var0 & 127;
		int var8 = var4 & 255;
		if (var1 != -1) {
			var5 += (var1 - var5) * var8 >> 7;
		}

		if (var2 != -1) {
			var6 += (var2 - var6) * var8 >> 7;
		}

		if (var3 != -1) {
			var7 += (var3 - var7) * var8 >> 7;
		}

		return (var5 << 10 | var6 << 7 | var7) & 65535;
	}

	@ObfInfo(name = "aj", desc = "(II)I")
	public static int method4514(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfInfo(name = "ao", desc = "()I")
	public static int method4555() {
		return field2518;
	}

	@ObfInfo(name = "ah", desc = "(I)V")
	public static void method4521(int var0) {
		field2518 = var0;
	}

	@ObfInfo(name = "av", desc = "(I)V")
	public static void method4541(int var0) {
		int var1 = var0 * 140;
		method4521(var1);
	}
}
