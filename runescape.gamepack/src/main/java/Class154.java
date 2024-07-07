import io.runebox.ObfInfo;

@ObfInfo(name = "fx")
public class Class154 implements Class393 {
	@ObfInfo(name = "ac", desc = "Lfx;")
	public static final Class154 field1712;
	@ObfInfo(name = "ak", desc = "Lfx;")
	public static final Class154 field1713;
	@ObfInfo(name = "aj", desc = "Lfx;")
	public static final Class154 field1714;
	@ObfInfo(name = "az", desc = "Lfx;")
	public static final Class154 field1715;
	@ObfInfo(name = "aa", desc = "Lfx;")
	public static final Class154 field1717;
	@ObfInfo(name = "at", desc = "Lfx;")
	public static final Class154 field1718;
	@ObfInfo(name = "af", desc = "Lfx;")
	public static final Class154 field1719;
	@ObfInfo(name = "ab", desc = "Lfx;")
	public static final Class154 field1721;
	@ObfInfo(name = "al", desc = "Lfx;")
	public static final Class154 field1723;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1640782011)
	public final int field1720;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 2091009523)
	public final int field1722;

	static {
		field1713 = new Class154(0, 0);
		field1723 = new Class154(1, 1);
		field1714 = new Class154(2, 2);
		field1715 = new Class154(3, 3);
		field1719 = new Class154(4, 4);
		field1717 = new Class154(5, 5);
		field1718 = new Class154(6, 6);
		field1721 = new Class154(7, 7);
		field1712 = new Class154(8, 8);
	}

	public Class154(int var1, int var2) {
		this.field1722 = var1;
		this.field1720 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field1720;
	}

	@ObfInfo(owner = "dv", name = "az", desc = "(I)[Lfx;")
	public static Class154[] method2594() {
		return new Class154[]{field1713, field1723, field1714, field1715, field1719, field1717, field1718, field1721, field1712};
	}

	@ObfInfo(name = "ks", desc = "(IIIIIIIIIIIIILde;I)V", opaque = "923669803")
	public static void method3300(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class83 var13) {
		Class222 var15 = Class222.method4161(var6);
		int var16;
		int var17;
		if (var4 != 1 && var4 != 3) {
			var16 = var15.field2252;
			var17 = var15.field2253;
		} else {
			var16 = var15.field2253;
			var17 = var15.field2252;
		}

		int var18 = var1 + (var16 >> 1);
		int var19 = var1 + (var16 + 1 >> 1);
		int var20 = (var17 >> 1) + var2;
		int var21 = (var17 + 1 >> 1) + var2;
		int[][] var22 = Client.field4582.field1291[var0];
		int var23 = var22[var19][var20] + var22[var18][var20] + var22[var18][var21] + var22[var19][var21] >> 2;
		int var24 = (var1 << 7) + (var16 << 6);
		int var25 = (var17 << 6) + (var2 << 7);
		Class262 var26 = var15.method4194(var3, var4, var22, var24, var23, var25);
		if (var26 != null) {
			Client.method3582(Client.field4582, var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1);
			var13.field1016 = var7 + Client.field778;
			var13.field1017 = Client.field778 + var8;
			var13.field1031 = var26;
			var13.field1018 = var16 * 64 + var1 * 128;
			var13.field1027 = var2 * 128 + var17 * 64;
			var13.field1019 = var23;
			int var27;
			if (var9 > var11) {
				var27 = var9;
				var9 = var11;
				var11 = var27;
			}

			if (var10 > var12) {
				var27 = var10;
				var10 = var12;
				var12 = var27;
			}

			var13.field1022 = var9 + var1;
			var13.field1024 = var11 + var1;
			var13.field1028 = var10 + var2;
			var13.field1013 = var12 + var2;
		}

	}
}
