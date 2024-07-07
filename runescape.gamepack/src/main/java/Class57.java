import io.runebox.ObfInfo;

@ObfInfo(name = "ce")
public class Class57 {
	@ObfInfo(name = "aq", desc = "Lbc;")
	public Class29 field418;
	@ObfInfo(name = "ad", desc = "Z")
	public boolean field423;
	@ObfInfo(name = "ap", desc = "[Z")
	public boolean[] field420;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field417;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field419;

	public Class57(Class29 var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field418 = var1;
		this.field423 = var2;
		this.field419 = var3;
		this.field417 = var4;
		this.field420 = var5;
	}

	@ObfInfo(name = "aq", desc = "([FII)V", opaque = "-656480108")
	public void method1171(float[] var1, int var2) {
		int var4 = this.field418.field135.length;
		Class29 var10000 = this.field418;
		int var5 = Class29.field137[this.field418.field136 - 1];
		boolean[] var6 = this.field420;
		this.field420[1] = true;
		var6[0] = true;

		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		for (var7 = 2; var7 < var4; ++var7) {
			var8 = this.field418.method431(this.field419, var7);
			var9 = this.field418.method413(this.field419, var7);
			var10 = this.field418.method415(this.field419[var8], this.field417[var8], this.field419[var9], this.field417[var9], this.field419[var7]);
			var11 = this.field417[var7];
			int var12 = var5 - var10;
			int var14 = (var12 < var10 ? var12 : var10) << 1;
			if (var11 != 0) {
				boolean[] var15 = this.field420;
				this.field420[var9] = true;
				var15[var8] = true;
				this.field420[var7] = true;
				if (var11 >= var14) {
					this.field417[var7] = var12 > var10 ? var11 - var10 + var10 : var12 + (var10 - var11) - 1;
				} else {
					this.field417[var7] = 0 != (var11 & 1) ? var10 - (var11 + 1) / 2 : var11 / 2 + var10;
				}
			} else {
				this.field420[var7] = false;
				this.field417[var7] = var10;
			}
		}

		this.method1173(0, var4 - 1);
		var7 = 0;
		var8 = this.field417[0] * this.field418.field136;

		for (var9 = 1; var9 < var4; ++var9) {
			if (this.field420[var9]) {
				var10 = this.field419[var9];
				var11 = this.field417[var9] * this.field418.field136;
				this.field418.method416(var7, var8, var10, var11, var1, var2);
				if (var10 >= var2) {
					return;
				}

				var7 = var10;
				var8 = var11;
			}
		}

		var10000 = this.field418;
		float var17 = Class29.field134[var8];

		for (var10 = var7; var10 < var2; ++var10) {
			var1[var10] *= var17;
		}

	}

	@ObfInfo(name = "ad", desc = "(S)Z")
	public boolean method1174() {
		return this.field423;
	}

	@ObfInfo(name = "ag", desc = "(IIB)V", opaque = "-1")
	public void method1173(int var1, int var2) {
		if (var1 < var2) {
			int var4 = var1;
			int var5 = this.field419[var1];
			int var6 = this.field417[var1];
			boolean var7 = this.field420[var1];

			for (int var8 = var1 + 1; var8 <= var2; ++var8) {
				int var9 = this.field419[var8];
				if (var9 < var5) {
					this.field419[var4] = var9;
					this.field417[var4] = this.field417[var8];
					this.field420[var4] = this.field420[var8];
					++var4;
					this.field419[var8] = this.field419[var4];
					this.field417[var8] = this.field417[var4];
					this.field420[var8] = this.field420[var4];
				}
			}

			this.field419[var4] = var5;
			this.field417[var4] = var6;
			this.field420[var4] = var7;
			this.method1173(var1, var4 - 1);
			this.method1173(var4 + 1, var2);
		}
	}
}
