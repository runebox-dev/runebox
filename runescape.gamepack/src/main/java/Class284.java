import io.runebox.ObfInfo;

@ObfInfo(name = "kx")
public class Class284 extends Class300 {
	@ObfInfo(name = "aq", desc = "Lqg;")
	public Class423 field2986;
	@ObfInfo(name = "ad", desc = "[F")
	public float[] field2987;

	public Class284(Class423 var1) {
		this.field2987 = new float[3];
		this.field2986 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lkt;IIIIJ)V")
	public void method5021(Class280 var1, int var2, int var3, int var4, int var5, long var6) {
		var1.method5590(var2, this.field2986, var3, var4, var5, var6);
	}

	@ObfInfo(name = "ad", desc = "(Lkq;Llt;IIII)V")
	public void method5013(Class277 var1, Class306 var2, int var3, int var4, int var5) {
		int var7;
		int var8 = var7 = var4 << 7;
		int var9;
		int var10 = var9 = var5 << 7;
		int var11;
		int var12 = var11 = var8 + 128;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15 = var1.field2881[var3][var4][var5];
		int var16 = var1.field2881[var3][var4 + 1][var5];
		int var17 = var1.field2881[var3][var4 + 1][var5 + 1];
		int var18 = var1.field2881[var3][var4][var5 + 1];
		this.field2986.method7743((float)var8, (float)var15, (float)var10, this.field2987);
		var8 = (int)this.field2987[0];
		var15 = (int)this.field2987[1];
		var10 = (int)this.field2987[2] | 1;
		this.field2986.method7743((float)var12, (float)var16, (float)var9, this.field2987);
		var12 = (int)this.field2987[0];
		var16 = (int)this.field2987[1];
		var9 = (int)this.field2987[2] | 1;
		this.field2986.method7743((float)var11, (float)var17, (float)var14, this.field2987);
		var11 = (int)this.field2987[0];
		var17 = (int)this.field2987[1];
		var14 = (int)this.field2987[2] | 1;
		this.field2986.method7743((float)var7, (float)var18, (float)var13, this.field2987);
		var7 = (int)this.field2987[0];
		var18 = (int)this.field2987[1];
		var13 = (int)this.field2987[2] | 1;
		this.method5814(var1, var2, var4, var5, var8, var12, var11, var7, var15, var16, var17, var18, var10, var9, var14, var13);
	}

	@ObfInfo(name = "ag", desc = "(Lkq;Llw;IIB)V", opaque = "1")
	public void method5015(Class277 var1, Class309 var2, int var3, int var4) {
		int var6 = var2.field3251.length;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = var2.field3251[var7];
			int var9 = var2.field3230[var7];
			int var10 = var2.field3229[var7];
			this.field2986.method7743((float)var8, (float)var9, (float)var10, this.field2987);
			var8 = (int)this.field2987[0];
			var9 = (int)this.field2987[1];
			var10 = (int)this.field2987[2];
			if (var2.field3231 != null) {
				Class309.field3236[var7] = var8;
				Class309.field3248[var7] = var9;
				Class309.field3249[var7] = var10;
			}

			var10 |= 1;
			Class309.field3238[var7] = Class274.method5120() + Class274.method5126() * var8 / var10;
			Class309.field3246[var7] = Class274.method5115() + Class274.method5126() * var9 / var10;
			Class309.field3245[var7] = Class304.method7114(var10);
		}

		this.method5825(var1, var2, var3, var4);
	}
}
