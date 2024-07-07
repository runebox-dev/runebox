import io.runebox.ObfInfo;

@ObfInfo(name = "qi")
public class Class425 {
	@ObfInfo(name = "az", desc = "I", intMultiplier = -171794869)
	public int field4688;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 649036843)
	public int field4689;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1160059855)
	public int field4690;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1135336181)
	public int field4691;

	public Class425(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	public Class425(int var1, int var2, int var3, int var4) {
		this.method7840(var1, var2);
		this.method7841(var3, var4);
	}

	@ObfInfo(name = "ak", desc = "(III)V")
	public void method7840(int var1, int var2) {
		this.field4691 = var1;
		this.field4689 = var2;
	}

	@ObfInfo(name = "al", desc = "(III)V")
	public void method7841(int var1, int var2) {
		this.field4690 = var1;
		this.field4688 = var2;
	}

	@ObfInfo(name = "aj", desc = "(III)Z", opaque = "-190023585")
	public boolean method7851(int var1, int var2) {
		return var1 >= this.field4691 && var1 < this.field4690 + this.field4691 && var2 >= this.field4689 && var2 < this.field4689 + this.field4688;
	}

	public String toString() {
		return null;
	}

	@ObfInfo(name = "az", desc = "(Lqi;Lqi;I)V")
	public void method7843(Class425 var1, Class425 var2) {
		this.method7844(var1, var2);
		this.method7845(var1, var2);
	}

	@ObfInfo(name = "af", desc = "(Lqi;Lqi;B)V", opaque = "-2")
	public void method7844(Class425 var1, Class425 var2) {
		var2.field4691 = this.field4691;
		var2.field4690 = this.field4690;
		if (this.field4691 < var1.field4691) {
			var2.field4690 = (var2.field4690 * -1403128623 - (var1.field4691 * -1403128623 - this.field4691 * -1403128623)) * -1160059855;
			var2.field4691 = var1.field4691;
		}

		if (var2.method7846() > var1.method7846()) {
			var2.field4690 -= var2.method7846() - var1.method7846();
		}

		if (var2.field4690 < 0) {
			var2.field4690 = 0;
		}

	}

	@ObfInfo(name = "aa", desc = "(Lqi;Lqi;B)V", opaque = "7")
	public void method7845(Class425 var1, Class425 var2) {
		var2.field4689 = this.field4689;
		var2.field4688 = this.field4688;
		if (this.field4689 < var1.field4689) {
			var2.field4688 = (var2.field4688 * 1658108771 - (var1.field4689 * 1658108771 - this.field4689 * 1658108771)) * -171794869;
			var2.field4689 = var1.field4689;
		}

		if (var2.method7847() > var1.method7847()) {
			var2.field4688 -= var2.method7847() - var1.method7847();
		}

		if (var2.field4688 < 0) {
			var2.field4688 = 0;
		}

	}

	@ObfInfo(name = "at", desc = "(B)I")
	public int method7846() {
		return this.field4691 + this.field4690;
	}

	@ObfInfo(name = "ab", desc = "(I)I")
	public int method7847() {
		return this.field4689 + this.field4688;
	}
}
