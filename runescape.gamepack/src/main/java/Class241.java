import io.runebox.ObfInfo;

public class Class241 extends Class272 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -653944201)
	public int field2601;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -1004642109)
	public int field2602;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1404479995)
	public int field2603;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 331009503)
	public int field2604;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -174075279)
	public int field2605;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1392008033)
	public int field2606;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 169206163)
	public int field2607;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 490189557)
	public int field2608;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1543758921)
	public int field2609;

	public Class241(int var1, int var2, int var3, int var4, int var5) {
		this.field2601 = var1;
		this.field2602 = var2;
		this.field2603 = var3;
		this.field2604 = var4;
		this.field2608 = var5;
		this.field2606 = Class253.field2683[var4];
		this.field2607 = Class253.field2687[var4];
		this.field2605 = Class253.field2683[var5];
		this.field2609 = Class253.field2687[var5];
	}

	@ObfInfo(name = "ak", desc = "(Lju;IIIIJ)V")
	public void method4663(Class255 var1, int var2, int var3, int var4, int var5, long var6) {
		var1.method4892(var2, this.field2604, this.field2608, var3, var4, var5, this.field2601, this.field2602, this.field2603, var6);
	}

	@ObfInfo(name = "al", desc = "(Ljy;Lkg;IIIB)V", opaque = "13")
	public void method4662(Class259 var1, Class267 var2, int var3, int var4, int var5) {
		int var7;
		int var8 = var7 = (var4 << 7) - this.field2601;
		int var9;
		int var10 = var9 = (var5 << 7) - this.field2603;
		int var11;
		int var12 = var11 = var8 + 128;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15 = var1.field2755[var3][var4][var5] - this.field2602;
		int var16 = var1.field2755[var3][var4 + 1][var5] - this.field2602;
		int var17 = var1.field2755[var3][var4 + 1][var5 + 1] - this.field2602;
		int var18 = var1.field2755[var3][var4][var5 + 1] - this.field2602;
		int var19 = this.field2605 * var10 + this.field2609 * var8 >> 16;
		var10 = var10 * this.field2609 - var8 * this.field2605 >> 16;
		var8 = var19;
		var19 = var15 * this.field2607 - this.field2606 * var10 >> 16;
		var10 = var10 * this.field2607 + var15 * this.field2606 >> 16;
		var15 = var19;
		if (var10 >= 50) {
			var19 = var12 * this.field2609 + this.field2605 * var9 >> 16;
			var9 = this.field2609 * var9 - var12 * this.field2605 >> 16;
			var12 = var19;
			var19 = this.field2607 * var16 - this.field2606 * var9 >> 16;
			var9 = this.field2606 * var16 + var9 * this.field2607 >> 16;
			var16 = var19;
			if (var9 >= 50) {
				var19 = this.field2605 * var14 + var11 * this.field2609 >> 16;
				var14 = var14 * this.field2609 - var11 * this.field2605 >> 16;
				var11 = var19;
				var19 = var17 * this.field2607 - this.field2606 * var14 >> 16;
				var14 = var17 * this.field2606 + this.field2607 * var14 >> 16;
				var17 = var19;
				if (var14 >= 50) {
					var19 = this.field2609 * var7 + this.field2605 * var13 >> 16;
					var13 = var13 * this.field2609 - var7 * this.field2605 >> 16;
					var7 = var19;
					var19 = var18 * this.field2607 - this.field2606 * var13 >> 16;
					var13 = var18 * this.field2606 + var13 * this.field2607 >> 16;
					if (var13 >= 50) {
						this.method5463(var1, var2, var4, var5, var8, var12, var11, var7, var15, var16, var17, var19, var10, var9, var14, var13);
					}
				}
			}
		}
	}

	@ObfInfo(name = "aj", desc = "(Ljy;Lke;IIB)V", opaque = "7")
	public void method4672(Class259 var1, Class265 var2, int var3, int var4) {
		int var6 = var2.field2924.length;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = var2.field2924[var7] - this.field2601;
			int var9 = var2.field2936[var7] - this.field2602;
			int var10 = var2.field2929[var7] - this.field2603;
			int var11 = this.field2609 * var8 + var10 * this.field2605 >> 16;
			var10 = var10 * this.field2609 - this.field2605 * var8 >> 16;
			var8 = var11;
			var11 = this.field2607 * var9 - var10 * this.field2606 >> 16;
			var10 = var9 * this.field2606 + var10 * this.field2607 >> 16;
			if (var10 < 50) {
				return;
			}

			if (var2.field2932 != null) {
				Class265.field2941[var7] = var8;
				Class265.field2942[var7] = var11;
				Class265.field2943[var7] = var10;
			}

			Class265.field2938[var7] = Class253.method4805() + Class253.method4792() * var8 / var10;
			Class265.field2939[var7] = Class253.method4788() + Class253.method4792() * var11 / var10;
			Class265.field2940[var7] = Class264.method3408(var10);
		}

		this.method5472(var1, var2, var3, var4);
	}
}
