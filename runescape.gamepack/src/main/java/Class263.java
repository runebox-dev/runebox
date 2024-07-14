import io.runebox.ObfInfo;

@ObfInfo(name = "kc")
public class Class263 extends Class300 {
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1611315841)
	public int field2718;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1099588265)
	public int field2719;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -705159913)
	public int field2720;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1404845653)
	public int field2721;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 136535019)
	public int field2722;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -903591805)
	public int field2723;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -919142613)
	public int field2724;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1173490183)
	public int field2725;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1431280305)
	public int field2726;

	public Class263(int var1, int var2, int var3, int var4, int var5) {
		this.field2726 = var1;
		this.field2719 = var2;
		this.field2720 = var3;
		this.field2721 = var4;
		this.field2722 = var5;
		this.field2718 = Class274.field2804[var4];
		this.field2724 = Class274.field2805[var4];
		this.field2725 = Class274.field2804[var5];
		this.field2723 = Class274.field2805[var5];
	}

	@ObfInfo(name = "aq", desc = "(Lkt;IIIIJ)V")
	public void method5021(Class280 var1, int var2, int var3, int var4, int var5, long var6) {
		var1.method5297(var2, this.field2721, this.field2722, var3, var4, var5, this.field2726, this.field2719, this.field2720, var6);
	}

	@ObfInfo(name = "ad", desc = "(Lkq;Llt;IIII)V", opaque = "1839825453")
	public void method5013(Class277 var1, Class306 var2, int var3, int var4, int var5) {
		int var7;
		int var8 = var7 = (var4 << 7) - this.field2726;
		int var9;
		int var10 = var9 = (var5 << 7) - this.field2720;
		int var11;
		int var12 = var11 = var8 + 128;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15 = var1.field2881[var3][var4][var5] - this.field2719;
		int var16 = var1.field2881[var3][var4 + 1][var5] - this.field2719;
		int var17 = var1.field2881[var3][var4 + 1][var5 + 1] - this.field2719;
		int var18 = var1.field2881[var3][var4][var5 + 1] - this.field2719;
		int var19 = this.field2725 * var10 + this.field2723 * var8 >> 16;
		var10 = this.field2723 * var10 - this.field2725 * var8 >> 16;
		var8 = var19;
		var19 = this.field2724 * var15 - this.field2718 * var10 >> 16;
		var10 = this.field2724 * var10 + this.field2718 * var15 >> 16;
		var15 = var19;
		if (var10 >= 50) {
			var19 = this.field2725 * var9 + this.field2723 * var12 >> 16;
			var9 = this.field2723 * var9 - this.field2725 * var12 >> 16;
			var12 = var19;
			var19 = this.field2724 * var16 - this.field2718 * var9 >> 16;
			var9 = this.field2724 * var9 + this.field2718 * var16 >> 16;
			var16 = var19;
			if (var9 >= 50) {
				var19 = this.field2725 * var14 + this.field2723 * var11 >> 16;
				var14 = this.field2723 * var14 - this.field2725 * var11 >> 16;
				var11 = var19;
				var19 = this.field2724 * var17 - this.field2718 * var14 >> 16;
				var14 = this.field2724 * var14 + this.field2718 * var17 >> 16;
				var17 = var19;
				if (var14 >= 50) {
					var19 = this.field2725 * var13 + this.field2723 * var7 >> 16;
					var13 = this.field2723 * var13 - this.field2725 * var7 >> 16;
					var7 = var19;
					var19 = this.field2724 * var18 - this.field2718 * var13 >> 16;
					var13 = this.field2724 * var13 + this.field2718 * var18 >> 16;
					if (var13 >= 50) {
						this.method5814(var1, var2, var4, var5, var8, var12, var11, var7, var15, var16, var17, var19, var10, var9, var14, var13);
					}
				}
			}
		}
	}

	@ObfInfo(name = "ag", desc = "(Lkq;Llw;IIB)V", opaque = "1")
	public void method5015(Class277 var1, Class309 var2, int var3, int var4) {
		int var6 = var2.field3251.length;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = var2.field3251[var7] - this.field2726;
			int var9 = var2.field3230[var7] - this.field2719;
			int var10 = var2.field3229[var7] - this.field2720;
			int var11 = this.field2725 * var10 + this.field2723 * var8 >> 16;
			var10 = this.field2723 * var10 - this.field2725 * var8 >> 16;
			var8 = var11;
			var11 = this.field2724 * var9 - this.field2718 * var10 >> 16;
			var10 = this.field2724 * var10 + this.field2718 * var9 >> 16;
			if (var10 < 50) {
				return;
			}

			if (var2.field3231 != null) {
				Class309.field3236[var7] = var8;
				Class309.field3248[var7] = var11;
				Class309.field3249[var7] = var10;
			}

			Class309.field3238[var7] = Class274.method5120() + Class274.method5126() * var8 / var10;
			Class309.field3246[var7] = Class274.method5115() + Class274.method5126() * var11 / var10;
			Class309.field3245[var7] = Class304.method7114(var10);
		}

		this.method5825(var1, var2, var3, var4);
	}
}
