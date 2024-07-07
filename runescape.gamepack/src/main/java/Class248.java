import io.runebox.ObfInfo;

@ObfInfo(name = "jn")
public class Class248 extends Class506 {
	@ObfInfo(name = "ao", desc = "Lje;")
	public Class239 field2663;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 215908835)
	public int field2656;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 415648975)
	public int field2660;
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field2661;
	@ObfInfo(name = "ac", desc = "[[I")
	public int[][] field2662;

	public Class248(int var1, byte[] var2) {
		this.field2656 = var1;
		Class521 var3 = new Class521(var2);
		this.field2660 = var3.method9405();
		this.field2661 = new int[this.field2660];
		this.field2662 = new int[this.field2660][];

		int var4;
		for (var4 = 0; var4 < this.field2660; ++var4) {
			this.field2661[var4] = var3.method9405();
		}

		for (var4 = 0; var4 < this.field2660; ++var4) {
			this.field2662[var4] = new int[var3.method9405()];
		}

		for (var4 = 0; var4 < this.field2660; ++var4) {
			for (int var5 = 0; var5 < this.field2662[var4].length; ++var5) {
				this.field2662[var4][var5] = var3.method9405();
			}
		}

		if (var3.field5219 < var3.field5221.length) {
			var4 = var3.method9407();
			if (var4 > 0) {
				this.field2663 = new Class239(var3, var4);
			}
		}

	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method4763() {
		return this.field2660;
	}

	@ObfInfo(name = "al", desc = "(I)Lje;")
	public Class239 method4761() {
		return this.field2663;
	}

	@ObfInfo(name = "aa", desc = "(II)I")
	public static int method4765(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public static void method4766() {
		Class222.field2239.method5995();
		Class222.field2276.method5995();
		Class222.field2241.method5995();
		Class222.field2242.method5995();
	}
}
