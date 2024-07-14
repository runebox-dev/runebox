import io.runebox.ObfInfo;

@ObfInfo(name = "qh")
public final class Class424 extends Class442 {
	public Class424(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	public Class424(byte[] var1) {
		super(var1);
	}

	@ObfInfo(name = "aq", desc = "([BIIIII)V")
	public final void method7813(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = Class88.field5502 * var3 + var2;
		int var8 = Class88.field5502 - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < Class569.field5505) {
			var11 = Class569.field5505 - var3;
			var5 -= var11;
			var3 = Class569.field5505;
			var10 += var4 * var11;
			var7 += Class88.field5502 * var11;
		}

		if (var3 + var5 > Class569.field5507) {
			var5 -= var3 + var5 - Class569.field5507;
		}

		if (var2 < Class569.field5508) {
			var11 = Class569.field5508 - var2;
			var4 -= var11;
			var2 = Class569.field5508;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var2 + var4 > Class569.field5509) {
			var11 = var2 + var4 - Class569.field5509;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var4 > 0 && var5 > 0) {
			method8236(Class569.field5504, var1, var6, var10, var7, var4, var5, var8, var9);
		}
	}

	@ObfInfo(name = "ad", desc = "([BIIIIII)V")
	public final void method7811(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = Class88.field5502 * var3 + var2;
		int var9 = Class88.field5502 - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < Class569.field5505) {
			var12 = Class569.field5505 - var3;
			var5 -= var12;
			var3 = Class569.field5505;
			var11 += var4 * var12;
			var8 += Class88.field5502 * var12;
		}

		if (var3 + var5 > Class569.field5507) {
			var5 -= var3 + var5 - Class569.field5507;
		}

		if (var2 < Class569.field5508) {
			var12 = Class569.field5508 - var2;
			var4 -= var12;
			var2 = Class569.field5508;
			var11 += var12;
			var8 += var12;
			var10 += var12;
			var9 += var12;
		}

		if (var2 + var4 > Class569.field5509) {
			var12 = var2 + var4 - Class569.field5509;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}

		if (var4 > 0 && var5 > 0) {
			method8202(Class569.field5504, var1, var6, var11, var8, var4, var5, var9, var10, var7);
		}
	}
}
