import io.runebox.ObfInfo;

@ObfInfo(name = "io")
public class Class223 extends Class232 {
	@ObfInfo(name = "aq", desc = "J", longMultiplier = -8762299103708938087L)
	public long field2423;

	public Class223() {
		this.field2423 = System.nanoTime();
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	public void method4046() {
		this.field2423 = System.nanoTime();
	}

	@ObfInfo(name = "ad", desc = "(III)I", opaque = "-816382882")
	public int method4048(int var1, int var2) {
		long var4 = 1000000L * (long)var2;
		long var6 = this.field2423 - System.nanoTime();
		if (var6 < var4) {
			var6 = var4;
		}

		Class336.method3895(var6 / 1000000L);
		long var8 = System.nanoTime();

		int var10;
		for (var10 = 0; var10 < 10 && (var10 < 1 || this.field2423 < var8); this.field2423 += 1000000L * (long)var1) {
			++var10;
		}

		if (this.field2423 < var8) {
			this.field2423 = var8;
		}

		return var10;
	}
}
