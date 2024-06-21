import io.runebox.ObfInfo;

@ObfInfo(name = "db")
public class Class80 {
	@ObfInfo(desc = "[[[B")
	public static byte[][][] field1941;
	@ObfInfo(desc = "[I")
	public static int[] field144;
	@ObfInfo(desc = "[I")
	public static int[] field4840;
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

	@ObfInfo(name = "al", desc = "(IZB)[B", opaque = "0")
	public static byte[] method2233(int var0, boolean var1) {
		synchronized(Class451.field4829) {
			byte[] var8;
			if ((var0 == 100 || var0 < 100 && var1) && Class451.field4828 > 0) {
				var8 = Class451.field4836[--Class451.field4828];
				Class451.field4836[Class451.field4828] = null;
				return var8;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && Class451.field4827 > 0) {
				var8 = Class451.field4837[--Class451.field4827];
				Class451.field4837[Class451.field4827] = null;
				return var8;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && Class451.field4824 > 0) {
				var8 = Class451.field4834[--Class451.field4824];
				Class451.field4834[Class451.field4824] = null;
				return var8;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && Class451.field4831 > 0) {
				var8 = Class451.field4839[--Class451.field4831];
				Class451.field4839[Class451.field4831] = null;
				return var8;
			}

			int var4;
			if (field1941 != null) {
				for (var4 = 0; var4 < field144.length; ++var4) {
					if ((field144[var4] == var0 || var0 < field144[var4] && var1) && field4840[var4] > 0) {
						byte[] var5 = field1941[var4][--field4840[var4]];
						field1941[var4][field4840[var4]] = null;
						return var5;
					}
				}
			}

			if (var1 && field144 != null) {
				for (var4 = 0; var4 < field144.length; ++var4) {
					if (var0 <= field144[var4] && field4840[var4] < field1941[var4].length) {
						return new byte[field144[var4]];
					}
				}
			}
		}

		return new byte[var0];
	}
}
