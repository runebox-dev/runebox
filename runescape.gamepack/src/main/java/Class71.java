import io.runebox.ObfInfo;

public class Class71 {
	@ObfInfo(name = "ab", desc = "F")
	public static float field868;
	@ObfInfo(name = "aa", desc = "[[F")
	public static float[][] field869;
	@ObfInfo(name = "ac", desc = "I")
	public static int field870;
	@ObfInfo(name = "at", desc = "[[I")
	public static int[][] field867;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field861;
	@ObfInfo(name = "af", desc = "[I")
	public int[] field865;
	@ObfInfo(name = "aj", desc = "[[[I")
	public int[][][] field863;
	@ObfInfo(name = "az", desc = "[[[I")
	public int[][][] field864;

	static {
		field869 = new float[2][8];
		field867 = new int[2][8];
	}

	public Class71() {
		this.field861 = new int[2];
		this.field863 = new int[2][2][4];
		this.field864 = new int[2][2][4];
		this.field865 = new int[2];
	}

	@ObfInfo(name = "ak", desc = "(IIF)F")
	public float method1941(int var1, int var2, float var3) {
		float var4 = (float)this.field864[var1][0][var2] + var3 * (float)(this.field864[var1][1][var2] - this.field864[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
	}

	@ObfInfo(name = "aj", desc = "(IIF)F")
	public float method1944(int var1, int var2, float var3) {
		float var4 = (float)this.field863[var1][0][var2] + var3 * (float)(this.field863[var1][1][var2] - this.field863[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return method1943(var4);
	}

	@ObfInfo(name = "az", desc = "(IF)I")
	public int method1945(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float)this.field865[0] + (float)(this.field865[1] - this.field865[0]) * var2;
			var3 *= 0.0030517578F;
			field868 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
			field870 = (int)(field868 * 65536.0F);
		}

		if (this.field861[var1] == 0) {
			return 0;
		} else {
			var3 = this.method1941(var1, 0, var2);
			field869[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method1944(var1, 0, var2));
			field869[var1][1] = var3 * var3;

			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.field861[var1]; ++var4) {
				var3 = this.method1941(var1, var4, var2);
				float var5 = -2.0F * var3 * (float)Math.cos((double)this.method1944(var1, var4, var2));
				float var6 = var3 * var3;
				field869[var1][var4 * 2 + 1] = field869[var1][var4 * 2 - 1] * var6;
				field869[var1][var4 * 2] = field869[var1][var4 * 2 - 1] * var5 + field869[var1][var4 * 2 - 2] * var6;

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					var10000 = field869[var1];
					var10000[var7] += field869[var1][var7 - 1] * var5 + field869[var1][var7 - 2] * var6;
				}

				var10000 = field869[var1];
				var10000[1] += field869[var1][0] * var5 + var6;
				var10000 = field869[var1];
				var10000[0] += var5;
			}

			if (var1 == 0) {
				for (var4 = 0; var4 < this.field861[0] * 2; ++var4) {
					var10000 = field869[0];
					var10000[var4] *= field868;
				}
			}

			for (var4 = 0; var4 < this.field861[var1] * 2; ++var4) {
				field867[var1][var4] = (int)(field869[var1][var4] * 65536.0F);
			}

			return this.field861[var1] * 2;
		}
	}

	@ObfInfo(name = "af", desc = "(Lua;Lbv;)V")
	public final void method1946(Class521 var1, Class48 var2) {
		int var3 = var1.method9405();
		this.field861[0] = var3 >> 4;
		this.field861[1] = var3 & 15;
		if (var3 != 0) {
			this.field865[0] = var1.method9407();
			this.field865[1] = var1.method9407();
			int var4 = var1.method9405();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field861[var5]; ++var6) {
					this.field863[var5][0][var6] = var1.method9407();
					this.field864[var5][0][var6] = var1.method9407();
				}
			}

			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field861[var5]; ++var6) {
					if ((var4 & 1 << var5 * 4 << var6) != 0) {
						this.field863[var5][1][var6] = var1.method9407();
						this.field864[var5][1][var6] = var1.method9407();
					} else {
						this.field863[var5][1][var6] = this.field863[var5][0][var6];
						this.field864[var5][1][var6] = this.field864[var5][0][var6];
					}
				}
			}

			if (var4 != 0 || this.field865[1] != this.field865[0]) {
				var2.method866(var1);
			}
		} else {
			int[] var7 = this.field865;
			this.field865[1] = 0;
			var7[0] = 0;
		}

	}

	@ObfInfo(name = "al", desc = "(F)F")
	public static float method1943(float var0) {
		float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
		return var1 * 3.1415927F / 11025.0F;
	}
}
