import io.runebox.ObfInfo;

@ObfInfo(name = "cu")
public class Class73 {
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 474160853)
	public int field886;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1439460273)
	public int field889;
	@ObfInfo(name = "an", desc = "[[I")
	public int[][] field887;

	public Class73(int var1, int var2) {
		if (var2 != var1) {
			int var4 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var4 = var2;
				var5 = var1;
			}

			while (var5 != 0) {
				int var6 = var4 % var5;
				var4 = var5;
				var5 = var6;
			}

			var1 /= var4;
			var2 /= var4;
			this.field889 = var1;
			this.field886 = var2;
			this.field887 = new int[var1][14];

			for (int var7 = 0; var7 < var1; ++var7) {
				int[] var8 = this.field887[var7];
				double var9 = 6.0D + (double)var7 / (double)var1;
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D));
				if (var11 < 0) {
					var11 = 0;
				}

				int var12 = (int)Math.ceil(7.0D + var9);
				if (var12 > 14) {
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
					double var15 = ((double)var11 - var9) * 3.141592653589793D;
					double var17 = var13;
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(((double)var11 - var9) * 0.2243994752564138D);
					var8[var11] = (int)Math.floor(var17 * 65536.0D + 0.5D);
				}
			}

		}
	}

	@ObfInfo(name = "aq", desc = "([BI)[B", opaque = "106816908")
	public byte[] method2133(byte[] var1) {
		if (this.field887 != null) {
			int var3 = 14 + (int)((long)var1.length * (long)this.field886 / (long)this.field889);
			int[] var4 = new int[var3];
			int var5 = 0;
			int var6 = 0;

			int var7;
			for (var7 = 0; var7 < var1.length; ++var7) {
				byte var8 = var1[var7];
				int[] var9 = this.field887[var6];

				int var10;
				for (var10 = 0; var10 < 14; ++var10) {
					var4[var10 + var5] += var9[var10] * var8;
				}

				var6 += this.field886;
				var10 = var6 / this.field889;
				var5 += var10;
				var6 -= var10 * this.field889;
			}

			var1 = new byte[var3];

			for (var7 = 0; var7 < var3; ++var7) {
				int var11 = 32768 + var4[var7] >> 16;
				if (var11 < -128) {
					var1[var7] = -128;
				} else if (var11 > 127) {
					var1[var7] = 127;
				} else {
					var1[var7] = (byte)var11;
				}
			}
		}

		return var1;
	}

	@ObfInfo(name = "ad", desc = "(II)I")
	public int method2134(int var1) {
		if (this.field887 != null) {
			var1 = (int)((long)this.field886 * (long)var1 / (long)this.field889);
		}

		return var1;
	}

	@ObfInfo(name = "ag", desc = "(II)I", opaque = "-1471944245")
	public int method2135(int var1) {
		if (this.field887 != null) {
			var1 = (int)((long)var1 * (long)this.field886 / (long)this.field889) + 6;
		}

		return var1;
	}
}
