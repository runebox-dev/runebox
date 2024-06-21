import io.runebox.ObfInfo;

public final class Class563 {
	@ObfInfo(name = "az", desc = "I", intMultiplier = 549097399)
	public int field5429;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1366229673)
	public int field5431;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -615663247)
	public int field5432;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -929931061)
	public int field5433;
	@ObfInfo(name = "af", desc = "[I")
	public int[] field5430;
	@ObfInfo(name = "aa", desc = "[I")
	public int[] field5434;

	public Class563(int[] var1) {
		this.field5434 = new int[256];
		this.field5430 = new int[256];

		for (int var2 = 0; var2 < var1.length; ++var2) {
			this.field5430[var2] = var1[var2];
		}

		this.method10240();
	}

	@ObfInfo(name = "ak", desc = "(I)I", opaque = "-43429038")
	public final int method10239() {
		if (0 == this.field5429) {
			this.method10237();
			this.field5429 = 256;
		}

		return this.field5430[--this.field5429];
	}

	@ObfInfo(name = "al", desc = "(I)I", opaque = "-1072099447")
	public final int method10236() {
		if (0 == this.field5429) {
			this.method10237();
			this.field5429 = 256;
		}

		return this.field5430[this.field5429 - 1];
	}

	@ObfInfo(name = "aj", desc = "(B)V", opaque = "1")
	public final void method10237() {
		this.field5433 += ++this.field5432;

		for (int var2 = 0; var2 < 256; ++var2) {
			int var3 = this.field5434[var2];
			if (0 == (var2 & 2)) {
				if (0 == (var2 & 1)) {
					this.field5431 ^= this.field5431 << 13;
				} else {
					this.field5431 ^= this.field5431 >>> 6;
				}
			} else if (0 == (var2 & 1)) {
				this.field5431 ^= this.field5431 << 2;
			} else {
				this.field5431 ^= this.field5431 >>> 16;
			}

			this.field5431 += this.field5434[var2 + 128 & 255];
			int var4;
			this.field5434[var2] = var4 = this.field5433 + this.field5434[(var3 & 1020) >> 2] + this.field5431;
			this.field5430[var2] = this.field5433 = this.field5434[(var4 >> 8 & 1020) >> 2] + var3;
		}

	}

	@ObfInfo(name = "az", desc = "(I)V", opaque = "65279")
	public final void method10240() {
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
			var3 += this.field5430[var2];
			var4 += this.field5430[var2 + 1];
			var5 += this.field5430[var2 + 2];
			var6 += this.field5430[var2 + 3];
			var7 += this.field5430[var2 + 4];
			var8 += this.field5430[var2 + 5];
			var9 += this.field5430[var2 + 6];
			var10 += this.field5430[var2 + 7];
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
			this.field5434[var2] = var3;
			this.field5434[var2 + 1] = var4;
			this.field5434[var2 + 2] = var5;
			this.field5434[var2 + 3] = var6;
			this.field5434[var2 + 4] = var7;
			this.field5434[var2 + 5] = var8;
			this.field5434[var2 + 6] = var9;
			this.field5434[var2 + 7] = var10;
		}

		for (var2 = 0; var2 < 256; var2 += 8) {
			var3 += this.field5434[var2];
			var4 += this.field5434[var2 + 1];
			var5 += this.field5434[var2 + 2];
			var6 += this.field5434[var2 + 3];
			var7 += this.field5434[var2 + 4];
			var8 += this.field5434[var2 + 5];
			var9 += this.field5434[var2 + 6];
			var10 += this.field5434[var2 + 7];
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
			this.field5434[var2] = var3;
			this.field5434[var2 + 1] = var4;
			this.field5434[var2 + 2] = var5;
			this.field5434[var2 + 3] = var6;
			this.field5434[var2 + 4] = var7;
			this.field5434[var2 + 5] = var8;
			this.field5434[var2 + 6] = var9;
			this.field5434[var2 + 7] = var10;
		}

		this.method10237();
		this.field5429 = 256;
	}
}
