import io.runebox.ObfInfo;

@ObfInfo(name = "qb")
public final class Class418 extends Class436 {
	public Class418(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	public Class418(byte[] var1) {
		super(var1);
	}

	@ObfInfo(name = "ak", desc = "([BIIIII)V")
	public final void method7772(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + Class87.field5423 * var3;
		int var8 = Class87.field5423 - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < Class561.field5422) {
			var11 = Class561.field5422 - var3;
			var5 -= var11;
			var3 = Class561.field5422;
			var10 += var11 * var4;
			var7 += Class87.field5423 * var11;
		}

		if (var5 + var3 > Class561.field5419) {
			var5 -= var5 + var3 - Class561.field5419;
		}

		if (var2 < Class561.field5424) {
			var11 = Class561.field5424 - var2;
			var4 -= var11;
			var2 = Class561.field5424;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var4 + var2 > Class561.field5425) {
			var11 = var4 + var2 - Class561.field5425;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var4 > 0 && var5 > 0) {
			method8031(Class561.field5418, var1, var6, var10, var7, var4, var5, var8, var9);
		}
	}

	@ObfInfo(name = "al", desc = "([BIIIIII)V")
	public final void method7775(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + Class87.field5423 * var3;
		int var9 = Class87.field5423 - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < Class561.field5422) {
			var12 = Class561.field5422 - var3;
			var5 -= var12;
			var3 = Class561.field5422;
			var11 += var12 * var4;
			var8 += Class87.field5423 * var12;
		}

		if (var5 + var3 > Class561.field5419) {
			var5 -= var5 + var3 - Class561.field5419;
		}

		if (var2 < Class561.field5424) {
			var12 = Class561.field5424 - var2;
			var4 -= var12;
			var2 = Class561.field5424;
			var11 += var12;
			var8 += var12;
			var10 += var12;
			var9 += var12;
		}

		if (var4 + var2 > Class561.field5425) {
			var12 = var4 + var2 - Class561.field5425;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}

		if (var4 > 0 && var5 > 0) {
			method8062(Class561.field5418, var1, var6, var11, var8, var4, var5, var9, var10, var7);
		}
	}
}
