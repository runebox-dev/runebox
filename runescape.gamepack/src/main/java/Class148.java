import io.runebox.ObfInfo;

@ObfInfo(name = "fr")
public class Class148 implements Class393 {
	@ObfInfo(name = "al", desc = "Lfr;")
	public static final Class148 field1673;
	@ObfInfo(name = "aj", desc = "Lfr;")
	public static final Class148 field1674;
	@ObfInfo(name = "az", desc = "Lfr;")
	public static final Class148 field1675;
	@ObfInfo(name = "ak", desc = "Lfr;")
	public static final Class148 field1677;
	@ObfInfo(name = "af", desc = "Lfr;")
	public static final Class148 field1683;
	@ObfInfo(name = "aa", desc = "Lfr;")
	public static final Class148 field1684;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1730610183)
	public final int field1672;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1366100427)
	public final int field1676;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 2042400925)
	public final int field1680;

	static {
		field1677 = new Class148(0, 0, (String)null, 0);
		field1673 = new Class148(1, 1, (String)null, 9);
		field1674 = new Class148(2, 2, (String)null, 3);
		field1675 = new Class148(3, 3, (String)null, 6);
		field1683 = new Class148(4, 4, (String)null, 1);
		field1684 = new Class148(5, 5, (String)null, 3);
	}

	public Class148(int var1, int var2, String var3, int var4) {
		this.field1672 = var1;
		this.field1676 = var2;
		this.field1680 = var4;
	}

	@ObfInfo(name = "af", desc = "(B)I")
	public int method3247() {
		return this.field1680;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field1676;
	}

	@ObfInfo(owner = "lf", name = "az", desc = "(II)Lfr;", opaque = "1257407705")
	public static Class148 method5906(int var0) {
		Class148[] var2 = new Class148[]{field1677, field1673, field1674, field1675, field1683, field1684};
		Class148 var3 = (Class148)Class62.method1112(var2, var0);
		if (var3 == null) {
			var3 = field1677;
		}

		return var3;
	}

	@ObfInfo(name = "ac", desc = "(Ldt;[BIII)V", opaque = "-106912157")
	public static void method3258(Class98 var0, byte[] var1, int var2, int var3) {
		Class521 var5 = new Class521(var1);
		int var6 = -1;

		while (true) {
			int var7 = var5.method9421();
			if (var7 == 0) {
				return;
			}

			var6 += var7;
			int var8 = 0;

			while (true) {
				int var9 = var5.method9419();
				if (var9 == 0) {
					break;
				}

				var8 += var9 - 1;
				int var10 = var8 & 63;
				int var11 = var8 >> 6 & 63;
				int var12 = var8 >> 12;
				int var13 = var5.method9405();
				int var14 = var13 >> 2;
				int var15 = var13 & 3;
				int var16 = var11 + var2;
				int var17 = var10 + var3;
				if (var16 > 0 && var17 > 0 && var16 < var0.field1291[0].length - 2 && var17 < var0.field1291[0][0].length - 2) {
					int var18 = var12;
					if (2 == (var0.field1292[1][var16][var17] & 2)) {
						var18 = var12 - 1;
					}

					Class226 var19 = null;
					if (var18 >= 0 && var0.field1284 != null) {
						var19 = var0.field1284[var18];
					}

					Class93.method3110(var0, var12, var16, var17, var6, var15, var14, var19);
				}
			}
		}
	}

	@ObfInfo(name = "bj", desc = "(ILdm;ZB)I", opaque = "10")
	public static int method3257(int var0, Class91 var1, boolean var2) {
		if (var0 == 6809) {
			int var4 = Class72.field887[--Class85.field83];
			Class222 var5 = Class222.method4161(var4);
			Class72.field880[++Class85.field1806 - 1] = var5 != null ? var5.field2247 : "";
			return 1;
		} else {
			return 2;
		}
	}
}
