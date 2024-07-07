import io.runebox.ObfInfo;

@ObfInfo(name = "ib")
public class Class210 extends Class232 {
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 77467019)
	public int field2275;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 691435497)
	public int field2276;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1561619897)
	public int field2277;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -2128144825)
	public int field2279;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = -4725112427391503235L)
	public long field2278;
	@ObfInfo(name = "aq", desc = "[J")
	public long[] field2274;

	public Class210() {
		this.field2274 = new long[10];
		this.field2275 = 256;
		this.field2276 = 1;
		this.field2277 = 0;
		this.field2278 = Class329.method4953();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2274[var1] = this.field2278;
		}

	}

	@ObfInfo(name = "aq", desc = "(I)V", opaque = "-246153511")
	public void method4046() {
		for (int var2 = 0; var2 < 10; ++var2) {
			this.field2274[var2] = 0L;
		}

	}

	@ObfInfo(name = "ad", desc = "(III)I", opaque = "-816382882")
	public int method4048(int var1, int var2) {
		int var4 = this.field2275;
		int var5 = this.field2276;
		this.field2275 = 300;
		this.field2276 = 1;
		this.field2278 = Class329.method4953();
		if (this.field2274[this.field2279] == 0L) {
			this.field2275 = var4;
			this.field2276 = var5;
		} else if (this.field2278 > this.field2274[this.field2279]) {
			this.field2275 = (int)((long)(var1 * 2560) / (this.field2278 - this.field2274[this.field2279]));
		}

		if (this.field2275 < 25) {
			this.field2275 = 25;
		}

		if (this.field2275 > 256) {
			this.field2275 = 256;
			this.field2276 = (int)((long)var1 - (this.field2278 - this.field2274[this.field2279]) / 10L);
		}

		if (this.field2276 > var1) {
			this.field2276 = var1;
		}

		this.field2274[this.field2279] = this.field2278;
		this.field2279 = (1 + this.field2279) % 10;
		int var6;
		if (this.field2276 > 1) {
			for (var6 = 0; var6 < 10; ++var6) {
				if (this.field2274[var6] != 0L) {
					this.field2274[var6] += (long)this.field2276;
				}
			}
		}

		if (this.field2276 < var2) {
			this.field2276 = var2;
		}

		Class336.method3895((long)this.field2276);

		for (var6 = 0; this.field2277 < 256; this.field2277 += this.field2275) {
			++var6;
		}

		this.field2277 &= 255;
		return var6;
	}
}
