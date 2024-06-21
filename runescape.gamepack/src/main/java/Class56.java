import io.runebox.ObfInfo;

@ObfInfo(name = "cd")
public class Class56 {
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1468640071)
	public int field420;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1676912385)
	public int field421;
	@ObfInfo(name = "aa", desc = "[[I")
	public int[][] field417;

	public Class56(int var1, int var2) {
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
			this.field421 = var1;
			this.field420 = var2;
			this.field417 = new int[var1][14];

			for (int var7 = 0; var7 < var1; ++var7) {
				int[] var8 = this.field417[var7];
				double var9 = (double)var7 / (double)var1 + 6.0D;
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D));
				if (var11 < 0) {
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D);
				if (var12 > 14) {
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
					double var15 = 3.141592653589793D * ((double)var11 - var9);
					double var17 = var13;
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9));
					var8[var11] = (int)Math.floor(0.5D + var17 * 65536.0D);
				}
			}

		}
	}

	@ObfInfo(name = "ak", desc = "([BB)[B", opaque = "61")
	public byte[] method1068(byte[] var1) {
		if (this.field417 != null) {
			int var3 = 14 + (int)((long)this.field420 * (long)var1.length / (long)this.field421);
			int[] var4 = new int[var3];
			int var5 = 0;
			int var6 = 0;

			int var7;
			for (var7 = 0; var7 < var1.length; ++var7) {
				byte var8 = var1[var7];
				int[] var9 = this.field417[var6];

				int var10;
				for (var10 = 0; var10 < 14; ++var10) {
					var4[var10 + var5] += var9[var10] * var8;
				}

				var6 += this.field420;
				var10 = var6 / this.field421;
				var5 += var10;
				var6 -= var10 * this.field421;
			}

			var1 = new byte[var3];

			for (var7 = 0; var7 < var3; ++var7) {
				int var11 = var4[var7] + 32768 >> 16;
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

	@ObfInfo(name = "al", desc = "(IB)I")
	public int method1063(int var1) {
		if (this.field417 != null) {
			var1 = (int)((long)this.field420 * (long)var1 / (long)this.field421);
		}

		return var1;
	}

	@ObfInfo(name = "aj", desc = "(IB)I", opaque = "-1")
	public int method1067(int var1) {
		if (this.field417 != null) {
			var1 = (int)((long)this.field420 * (long)var1 / (long)this.field421) + 6;
		}

		return var1;
	}
}
