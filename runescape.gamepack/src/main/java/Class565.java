import io.runebox.ObfInfo;

@ObfInfo(name = "vs")
public final class Class565 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 581579677)
	public int field5485;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1619972533)
	public int field5487;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -166485051)
	public int field5488;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -745000075)
	public int field5489;
	@ObfInfo(name = "ap", desc = "[I")
	public int[] field5483;
	@ObfInfo(name = "an", desc = "[I")
	public int[] field5486;

	public Class565(int[] var1) {
		this.field5486 = new int[256];
		this.field5483 = new int[256];

		for (int var2 = 0; var2 < var1.length; ++var2) {
			this.field5483[var2] = var1[var2];
		}

		this.method10094();
	}

	@ObfInfo(name = "aq", desc = "(B)I", opaque = "16")
	public final int method10084() {
		if (this.field5485 == 0) {
			this.method10086();
			this.field5485 = 256;
		}

		return this.field5483[--this.field5485];
	}

	@ObfInfo(name = "ad", desc = "(I)I", opaque = "819505083")
	public final int method10085() {
		if (this.field5485 == 0) {
			this.method10086();
			this.field5485 = 256;
		}

		return this.field5483[this.field5485 - 1];
	}

	@ObfInfo(name = "ag", desc = "(I)V", opaque = "2011368605")
	public final void method10086() {
		this.field5489 += ++this.field5487;

		for (int var2 = 0; var2 < 256; ++var2) {
			int var3 = this.field5486[var2];
			if ((var2 & 2) == 0) {
				if ((var2 & 1) == 0) {
					this.field5488 ^= this.field5488 << 13;
				} else {
					this.field5488 ^= this.field5488 >>> 6;
				}
			} else if ((var2 & 1) == 0) {
				this.field5488 ^= this.field5488 << 2;
			} else {
				this.field5488 ^= this.field5488 >>> 16;
			}

			this.field5488 += this.field5486[var2 + 128 & 255];
			int var4;
			this.field5486[var2] = var4 = this.field5486[(var3 & 1020) >> 2] + this.field5488 + this.field5489;
			this.field5483[var2] = this.field5489 = this.field5486[(var4 >> 8 & 1020) >> 2] + var3;
		}

	}

	@ObfInfo(name = "ak", desc = "(B)V", opaque = "15")
	public final void method10094() {
		int var10 = -1640531527;
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var7 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;

		int var2;
		for (var2 = 0; var2 < 4; ++var2) {
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
		}

		for (var2 = 0; var2 < 256; var2 += 8) {
			var3 += this.field5483[var2];
			var4 += this.field5483[var2 + 1];
			var5 += this.field5483[var2 + 2];
			var6 += this.field5483[var2 + 3];
			var7 += this.field5483[var2 + 4];
			var8 += this.field5483[var2 + 5];
			var9 += this.field5483[var2 + 6];
			var10 += this.field5483[var2 + 7];
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
			this.field5486[var2] = var3;
			this.field5486[var2 + 1] = var4;
			this.field5486[var2 + 2] = var5;
			this.field5486[var2 + 3] = var6;
			this.field5486[var2 + 4] = var7;
			this.field5486[var2 + 5] = var8;
			this.field5486[var2 + 6] = var9;
			this.field5486[var2 + 7] = var10;
		}

		for (var2 = 0; var2 < 256; var2 += 8) {
			var3 += this.field5486[var2];
			var4 += this.field5486[var2 + 1];
			var5 += this.field5486[var2 + 2];
			var6 += this.field5486[var2 + 3];
			var7 += this.field5486[var2 + 4];
			var8 += this.field5486[var2 + 5];
			var9 += this.field5486[var2 + 6];
			var10 += this.field5486[var2 + 7];
			var3 ^= var4 << 11;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 >>> 2;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 << 8;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 >>> 16;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 << 10;
			var10 += var7;
			var8 += var9;
			var8 ^= var9 >>> 4;
			var3 += var8;
			var9 += var10;
			var9 ^= var10 << 8;
			var4 += var9;
			var10 += var3;
			var10 ^= var3 >>> 9;
			var5 += var10;
			var3 += var4;
			this.field5486[var2] = var3;
			this.field5486[var2 + 1] = var4;
			this.field5486[var2 + 2] = var5;
			this.field5486[var2 + 3] = var6;
			this.field5486[var2 + 4] = var7;
			this.field5486[var2 + 5] = var8;
			this.field5486[var2 + 6] = var9;
			this.field5486[var2 + 7] = var10;
		}

		this.method10086();
		this.field5485 = 256;
	}
}
