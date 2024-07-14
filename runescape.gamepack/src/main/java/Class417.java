import io.runebox.ObfInfo;

@ObfInfo(name = "qa")
public class Class417 {
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 2146983277)
	public int field4677;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 762836177)
	public int field4678;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 2063081713)
	public int field4679;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -999030493)
	public int field4680;

	public Class417(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	public Class417(int var1, int var2, int var3, int var4) {
		this.method7668(var1, var2);
		this.method7669(var3, var4);
	}

	@ObfInfo(name = "aq", desc = "(III)V")
	public void method7668(int var1, int var2) {
		this.field4679 = var1;
		this.field4678 = var2;
	}

	@ObfInfo(name = "ad", desc = "(III)V")
	public void method7669(int var1, int var2) {
		this.field4677 = var1;
		this.field4680 = var2;
	}

	@ObfInfo(name = "ag", desc = "(III)Z", opaque = "1843694578")
	public boolean method7670(int var1, int var2) {
		return var1 >= this.field4679 && var1 < this.field4679 + this.field4677 && var2 >= this.field4678 && var2 < this.field4680 + this.field4678;
	}

	public String toString() {
		return null;
	}

	@ObfInfo(name = "ak", desc = "(Lqa;Lqa;B)V")
	public void method7666(Class417 var1, Class417 var2) {
		this.method7671(var1, var2);
		this.method7672(var1, var2);
	}

	@ObfInfo(name = "ap", desc = "(Lqa;Lqa;I)V", opaque = "1717160927")
	public void method7671(Class417 var1, Class417 var2) {
		var2.field4679 = this.field4679;
		var2.field4677 = this.field4677;
		if (this.field4679 < var1.field4679) {
			var2.field4677 = (var2.field4677 * 663565413 - (var1.field4679 * 663565413 - this.field4679 * 663565413)) * 2146983277;
			var2.field4679 = var1.field4679;
		}

		if (var2.method7673() > var1.method7673()) {
			var2.field4677 -= var2.method7673() - var1.method7673();
		}

		if (var2.field4677 < 0) {
			var2.field4677 = 0;
		}

	}

	@ObfInfo(name = "an", desc = "(Lqa;Lqa;I)V", opaque = "-2093015333")
	public void method7672(Class417 var1, Class417 var2) {
		var2.field4678 = this.field4678;
		var2.field4680 = this.field4680;
		if (this.field4678 < var1.field4678) {
			var2.field4680 = (var2.field4680 * -1551747445 - (var1.field4678 * -1551747445 - this.field4678 * -1551747445)) * -999030493;
			var2.field4678 = var1.field4678;
		}

		if (var2.method7699() > var1.method7699()) {
			var2.field4680 -= var2.method7699() - var1.method7699();
		}

		if (var2.field4680 < 0) {
			var2.field4680 = 0;
		}

	}

	@ObfInfo(name = "aj", desc = "(B)I")
	public int method7673() {
		return this.field4679 + this.field4677;
	}

	@ObfInfo(name = "av", desc = "(B)I")
	public int method7699() {
		return this.field4680 + this.field4678;
	}
}
