import io.runebox.ObfInfo;

@ObfInfo(name = "ky")
public abstract class Class285 extends Class569 {
	@ObfInfo(name = "ai", desc = "I")
	public static int field3001;
	@ObfInfo(name = "ab", desc = "Llo;")
	public Class301 field3000;
	@ObfInfo(name = "ad", desc = "Z")
	public boolean field2992;
	@ObfInfo(name = "aq", desc = "Z")
	public boolean field2995;
	@ObfInfo(name = "av", desc = "[I")
	public int[] field2996;

	static {
		field3001 = 0;
	}

	public Class285(Class301 var1) {
		this.field2995 = false;
		this.field2992 = false;
		this.field2996 = Class274.field2806;
		this.field3000 = var1;
	}

	@ObfInfo(name = "an", desc = "(IIIIIIFFFIII)V")
	public abstract void method5645(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfInfo(name = "aj", desc = "(IIIIIIFFFI)V")
	public abstract void method5646(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfInfo(name = "ab", desc = "(IIIIIIFFFIIIIIIIIIIIII)V")
	public abstract void method5648(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfInfo(name = "av", desc = "(IIIIIIFFFIIIIIIIIIIIII)V")
	public abstract void method5655(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfInfo(name = "aq", desc = "([III[F)V")
	public void method5640(int[] var1, int var2, int var3, float[] var4) {
		method10146(var1, var2, var3, var4);
	}

	@ObfInfo(name = "ak", desc = "(IIIIIIFFFIIIBBBB)V")
	public void method5643(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method5641(var10, var13, var14, var15, var16);
		var11 = method5641(var11, var13, var14, var15, var16);
		var12 = method5641(var12, var13, var14, var15, var16);
		this.method5645(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfInfo(name = "ap", desc = "(IIIIIIFFFIBBBB)V")
	public void method5677(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method5641(var10, var11, var12, var13, var14);
		var10 = this.field2996[var15];
		this.method5646(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfInfo(name = "ad", desc = "(IBBBB)I")
	public static int method5641(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfInfo(name = "ag", desc = "(II)I")
	public static int method5683(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfInfo(name = "ai", desc = "()I")
	public static int method5649() {
		return field3001;
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public static void method5650(int var0) {
		field3001 = var0;
	}

	@ObfInfo(name = "au", desc = "(I)V")
	public static void method5651(int var0) {
		int var1 = var0 * 140;
		method5650(var1);
	}
}
