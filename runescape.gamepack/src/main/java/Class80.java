import io.runebox.ObfInfo;

public class Class80 {
	@ObfInfo(name = "al", desc = "[Lco;")
	public Class67[] field984;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1975266977)
	public int field985;

	public Class80() {
		this.field984 = new Class67[100];
	}

	@ObfInfo(name = "ak", desc = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lco;", opaque = "-411117179")
	public Class67 method2224(int var1, String var2, String var3, String var4) {
		Class67 var6 = this.field984[99];

		for (int var7 = this.field985; var7 > 0; --var7) {
			if (var7 != 100) {
				this.field984[var7] = this.field984[var7 - 1];
			}
		}

		if (var6 == null) {
			var6 = new Class67(var1, var2, var4, var3);
		} else {
			var6.method9277();
			var6.method9280();
			var6.method1825(var1, var2, var4, var3);
		}

		this.field984[0] = var6;
		if (this.field985 < 100) {
			++this.field985;
		}

		return var6;
	}

	@ObfInfo(name = "al", desc = "(II)Lco;", opaque = "-1267031710")
	public Class67 method2231(int var1) {
		return var1 >= 0 && var1 < this.field985 ? this.field984[var1] : null;
	}

	@ObfInfo(name = "aj", desc = "(I)I")
	public int method2225() {
		return this.field985;
	}
}
