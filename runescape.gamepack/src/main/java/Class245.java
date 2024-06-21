import io.runebox.ObfInfo;

@ObfInfo(name = "jk")
public class Class245 extends Class272 {
	@ObfInfo(name = "ak", desc = "Lql;")
	public Class428 field2638;
	@ObfInfo(name = "al", desc = "[F")
	public float[] field2641;

	public Class245(Class428 var1) {
		this.field2641 = new float[3];
		this.field2638 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lju;IIIIJ)V")
	public void method4663(Class255 var1, int var2, int var3, int var4, int var5, long var6) {
		var1.method4893(var2, this.field2638, var3, var4, var5, var6);
	}

	@ObfInfo(name = "al", desc = "(Ljy;Lkg;IIIB)V")
	public void method4662(Class259 var1, Class267 var2, int var3, int var4, int var5) {
		int var7;
		int var8 = var7 = var4 << 7;
		int var9;
		int var10 = var9 = var5 << 7;
		int var11;
		int var12 = var11 = var8 + 128;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15 = var1.field2755[var3][var4][var5];
		int var16 = var1.field2755[var3][var4 + 1][var5];
		int var17 = var1.field2755[var3][var4 + 1][var5 + 1];
		int var18 = var1.field2755[var3][var4][var5 + 1];
		this.field2638.method7904((float)var8, (float)var15, (float)var10, this.field2641);
		var8 = (int)this.field2641[0];
		var15 = (int)this.field2641[1];
		var10 = (int)this.field2641[2] | 1;
		this.field2638.method7904((float)var12, (float)var16, (float)var9, this.field2641);
		var12 = (int)this.field2641[0];
		var16 = (int)this.field2641[1];
		var9 = (int)this.field2641[2] | 1;
		this.field2638.method7904((float)var11, (float)var17, (float)var14, this.field2641);
		var11 = (int)this.field2641[0];
		var17 = (int)this.field2641[1];
		var14 = (int)this.field2641[2] | 1;
		this.field2638.method7904((float)var7, (float)var18, (float)var13, this.field2641);
		var7 = (int)this.field2641[0];
		var18 = (int)this.field2641[1];
		var13 = (int)this.field2641[2] | 1;
		this.method5463(var1, var2, var4, var5, var8, var12, var11, var7, var15, var16, var17, var18, var10, var9, var14, var13);
	}

	@ObfInfo(name = "aj", desc = "(Ljy;Lke;IIB)V", opaque = "7")
	public void method4672(Class259 var1, Class265 var2, int var3, int var4) {
		int var6 = var2.field2924.length;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = var2.field2924[var7];
			int var9 = var2.field2936[var7];
			int var10 = var2.field2929[var7];
			this.field2638.method7904((float)var8, (float)var9, (float)var10, this.field2641);
			var8 = (int)this.field2641[0];
			var9 = (int)this.field2641[1];
			var10 = (int)this.field2641[2];
			if (var2.field2932 != null) {
				Class265.field2941[var7] = var8;
				Class265.field2942[var7] = var9;
				Class265.field2943[var7] = var10;
			}

			var10 |= 1;
			Class265.field2938[var7] = Class253.method4805() + Class253.method4792() * var8 / var10;
			Class265.field2939[var7] = Class253.method4788() + Class253.method4792() * var9 / var10;
			Class265.field2940[var7] = Class264.method3408(var10);
		}

		this.method5472(var1, var2, var3, var4);
	}
}
