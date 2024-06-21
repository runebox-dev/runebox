import io.runebox.ObfInfo;

@ObfInfo(name = "cg")
public final class Class59 extends Class255 {
	@ObfInfo(name = "at", desc = "Lic;")
	public Class211 field440;
	@ObfInfo(name = "ao", desc = "Z")
	public boolean field443;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -217494561)
	public int field435;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -107795739)
	public int field436;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1739675053)
	public int field437;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1549919911)
	public int field438;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1573445793)
	public int field439;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 777941077)
	public int field441;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1586287101)
	public int field442;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -61247699)
	public int field445;

	public Class59(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field438 = 0;
		this.field442 = 0;
		this.field443 = false;
		this.field445 = var1;
		this.field436 = var2;
		this.field437 = var3;
		this.field441 = var4;
		this.field439 = var5;
		this.field435 = var7 + var6;
		int var8 = Class224.method4163(this.field445).field2301;
		if (var8 != -1) {
			this.field443 = false;
			this.field440 = Class211.method4637(var8);
		} else {
			this.field443 = true;
		}

	}

	@ObfInfo(name = "ak", desc = "(IB)V", opaque = "9")
	public final void method1091(int var1) {
		if (!this.field443) {
			this.field442 += var1;
			if (!this.field440.method4038()) {
				while (this.field442 > this.field440.field2139[this.field438]) {
					this.field442 -= this.field440.field2139[this.field438];
					++this.field438;
					if (this.field438 >= this.field440.field2142.length) {
						this.field443 = true;
						break;
					}
				}
			} else {
				this.field438 += var1;
				if (this.field438 >= this.field440.method4005()) {
					this.field443 = true;
				}
			}

		}
	}

	@ObfInfo(name = "ah", desc = "(I)Lkb;", opaque = "102285859")
	public final Class262 method1092() {
		Class224 var2 = Class224.method4163(this.field445);
		Class262 var3;
		if (!this.field443) {
			var3 = var2.method4227(this.field438);
		} else {
			var3 = var2.method4227(-1);
		}

		return var3 == null ? null : var3;
	}

	@ObfInfo(name = "ly", desc = "(Ldt;Ldk;I)V", opaque = "-1872905711")
	public static void method1094(Class98 var0, Class89 var1) {
		Class259 var3 = var0.field1283;
		long var4 = 0L;
		int var6 = -1;
		int var7 = 0;
		int var8 = 0;
		if (var1.field1186 == 0) {
			var4 = var3.method4951(var1.field1195, var1.field1187, var1.field1191);
		}

		if (1 == var1.field1186) {
			var4 = var3.method4952(var1.field1195, var1.field1187, var1.field1191);
		}

		if (var1.field1186 == 2) {
			var4 = var3.method4953(var1.field1195, var1.field1187, var1.field1191);
		}

		if (3 == var1.field1186) {
			var4 = var3.method4954(var1.field1195, var1.field1187, var1.field1191);
		}

		if (var4 != 0L) {
			int var9 = var3.method5003(var1.field1195, var1.field1187, var1.field1191, var4);
			var6 = Class274.method2942(var4);
			var7 = var9 & 31;
			var8 = var9 >> 6 & 3;
		}

		var1.field1189 = var6;
		var1.field1196 = var7;
		var1.field1190 = var8;
	}
}
