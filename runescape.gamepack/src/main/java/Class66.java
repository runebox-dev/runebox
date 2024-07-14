import io.runebox.ObfInfo;

@ObfInfo(name = "cn")
public class Class66 {
	@ObfInfo(name = "av", desc = "F")
	public static float field844;
	@ObfInfo(name = "an", desc = "[[F")
	public static float[][] field847;
	@ObfInfo(name = "ab", desc = "I")
	public static int field845;
	@ObfInfo(name = "aj", desc = "[[I")
	public static int[][] field843;
	@ObfInfo(name = "ap", desc = "[I")
	public int[] field841;
	@ObfInfo(name = "aq", desc = "[I")
	public int[] field848;
	@ObfInfo(name = "ag", desc = "[[[I")
	public int[][][] field839;
	@ObfInfo(name = "ak", desc = "[[[I")
	public int[][][] field840;

	static {
		field847 = new float[2][8];
		field843 = new int[2][8];
	}

	public Class66() {
		this.field848 = new int[2];
		this.field839 = new int[2][2][4];
		this.field840 = new int[2][2][4];
		this.field841 = new int[2];
	}

	@ObfInfo(name = "aq", desc = "(IIF)F")
	public float method1918(int var1, int var2, float var3) {
		float var4 = (float)(this.field840[var1][1][var2] - this.field840[var1][0][var2]) * var3 + (float)this.field840[var1][0][var2];
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
	}

	@ObfInfo(name = "ag", desc = "(IIF)F")
	public float method1924(int var1, int var2, float var3) {
		float var4 = (float)(this.field839[var1][1][var2] - this.field839[var1][0][var2]) * var3 + (float)this.field839[var1][0][var2];
		var4 *= 1.2207031E-4F;
		return method1919(var4);
	}

	@ObfInfo(name = "ak", desc = "(IF)I")
	public int method1920(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float)(this.field841[1] - this.field841[0]) * var2 + (float)this.field841[0];
			var3 *= 0.0030517578F;
			field844 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
			field845 = (int)(field844 * 65536.0F);
		}

		if (this.field848[var1] == 0) {
			return 0;
		} else {
			var3 = this.method1918(var1, 0, var2);
			field847[var1][0] = var3 * -2.0F * (float)Math.cos((double)this.method1924(var1, 0, var2));
			field847[var1][1] = var3 * var3;

			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.field848[var1]; ++var4) {
				var3 = this.method1918(var1, var4, var2);
				float var5 = var3 * -2.0F * (float)Math.cos((double)this.method1924(var1, var4, var2));
				float var6 = var3 * var3;
				field847[var1][var4 * 2 + 1] = field847[var1][var4 * 2 - 1] * var6;
				field847[var1][var4 * 2] = field847[var1][var4 * 2 - 1] * var5 + field847[var1][var4 * 2 - 2] * var6;

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					var10000 = field847[var1];
					var10000[var7] += field847[var1][var7 - 1] * var5 + field847[var1][var7 - 2] * var6;
				}

				var10000 = field847[var1];
				var10000[1] += field847[var1][0] * var5 + var6;
				var10000 = field847[var1];
				var10000[0] += var5;
			}

			if (var1 == 0) {
				for (var4 = 0; var4 < this.field848[0] * 2; ++var4) {
					var10000 = field847[0];
					var10000[var4] *= field844;
				}
			}

			for (var4 = 0; var4 < this.field848[var1] * 2; ++var4) {
				field843[var1][var4] = (int)(field847[var1][var4] * 65536.0F);
			}

			return this.field848[var1] * 2;
		}
	}

	@ObfInfo(name = "ap", desc = "(Lvp;Lbb;)V")
	public final void method1921(Class562 var1, Class28 var2) {
		int var3 = var1.method9902();
		this.field848[0] = var3 >> 4;
		this.field848[1] = var3 & 15;
		if (var3 != 0) {
			this.field841[0] = var1.method9997();
			this.field841[1] = var1.method9997();
			int var4 = var1.method9902();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field848[var5]; ++var6) {
					this.field839[var5][0][var6] = var1.method9997();
					this.field840[var5][0][var6] = var1.method9997();
				}
			}

			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field848[var5]; ++var6) {
					if ((var4 & 1 << var5 * 4 << var6) != 0) {
						this.field839[var5][1][var6] = var1.method9997();
						this.field840[var5][1][var6] = var1.method9997();
					} else {
						this.field839[var5][1][var6] = this.field839[var5][0][var6];
						this.field840[var5][1][var6] = this.field840[var5][0][var6];
					}
				}
			}

			if (var4 != 0 || this.field841[1] != this.field841[0]) {
				var2.method404(var1);
			}
		} else {
			int[] var7 = this.field841;
			this.field841[1] = 0;
			var7[0] = 0;
		}

	}

	@ObfInfo(name = "ad", desc = "(F)F")
	public static float method1919(float var0) {
		float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
		return var1 * 3.1415927F / 11025.0F;
	}
}
