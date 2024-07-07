import io.runebox.ObfInfo;

@ObfInfo(name = "dn")
public class Class92 {
	@ObfInfo(name = "ad", desc = "[Lck;")
	public Class63[] field1136;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -89644527)
	public int field1135;

	public Class92() {
		this.field1136 = new Class63[100];
	}

	@ObfInfo(name = "aq", desc = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)Lck;", opaque = "-16256")
	public Class63 method2440(int var1, String var2, String var3, String var4) {
		Class63 var6 = this.field1136[99];

		for (int var7 = this.field1135; var7 > 0; --var7) {
			if (var7 != 100) {
				this.field1136[var7] = this.field1136[var7 - 1];
			}
		}

		if (var6 == null) {
			var6 = new Class63(var1, var2, var4, var3);
		} else {
			var6.method9267();
			var6.method9044();
			var6.method1293(var1, var2, var4, var3);
		}

		this.field1136[0] = var6;
		if (this.field1135 < 100) {
			++this.field1135;
		}

		return var6;
	}

	@ObfInfo(name = "ad", desc = "(II)Lck;", opaque = "650895180")
	public Class63 method2436(int var1) {
		return var1 >= 0 && var1 < this.field1135 ? this.field1136[var1] : null;
	}

	@ObfInfo(name = "ag", desc = "(B)I")
	public int method2437() {
		return this.field1135;
	}
}
