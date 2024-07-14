import io.runebox.ObfInfo;

@ObfInfo(name = "of")
public class Class370 implements Class393 {
	@ObfInfo(name = "ad", desc = "Lof;")
	public static final Class370 field4400;
	@ObfInfo(name = "ag", desc = "Lof;")
	public static final Class370 field4401;
	@ObfInfo(name = "ak", desc = "Lof;")
	public static final Class370 field4402;
	@ObfInfo(name = "ap", desc = "Lof;")
	public static final Class370 field4403;
	@ObfInfo(name = "an", desc = "Lof;")
	public static final Class370 field4404;
	@ObfInfo(name = "aq", desc = "Lof;")
	public static final Class370 field4405;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 1132351427)
	public final int field4399;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	public final String field4406;

	static {
		field4405 = new Class370("runescape", "RuneScape", 0);
		field4400 = new Class370("stellardawn", "Stellar Dawn", 1);
		field4401 = new Class370("game3", "Game 3", 2);
		field4402 = new Class370("game4", "Game 4", 3);
		field4403 = new Class370("game5", "Game 5", 4);
		field4404 = new Class370("oldscape", "RuneScape 2007", 5);
	}

	public Class370(String var1, String var2, int var3) {
		this.field4406 = var1;
		this.field4399 = var3;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field4399;
	}

	@ObfInfo(owner = "kj", name = "ag", desc = "(S)[Lof;")
	public static Class370[] method5102() {
		return new Class370[]{field4405, field4400, field4402, field4403, field4404, field4401};
	}

	@ObfInfo(name = "ki", desc = "(IIIIIIIIIIIIILdb;I)V", opaque = "-1758462952")
	public static void method7105(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class80 var13) {
		Class197 var15 = Class197.method61(var6);
		int var16;
		int var17;
		if (var4 != 1 && var4 != 3) {
			var16 = var15.field2140;
			var17 = var15.field2141;
		} else {
			var16 = var15.field2141;
			var17 = var15.field2140;
		}

		int var18 = (var16 >> 1) + var1;
		int var19 = (var16 + 1 >> 1) + var1;
		int var20 = (var17 >> 1) + var2;
		int var21 = (var17 + 1 >> 1) + var2;
		int[][] var22 = Client.field94.field1025[var0];
		int var23 = var22[var18][var20] + var22[var19][var20] + var22[var18][var21] + var22[var19][var21] >> 2;
		int var24 = (var1 << 7) + (var16 << 6);
		int var25 = (var2 << 7) + (var17 << 6);
		Class308 var26 = var15.method3945(var3, var4, var22, var24, var23, var25);
		if (var26 != null) {
			Client.method438(Client.field94, var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1);
			var13.field974 = Client.field541 + var7;
			var13.field973 = Client.field541 + var8;
			var13.field986 = var26;
			var13.field983 = var1 * 128 + var16 * 64;
			var13.field985 = var2 * 128 + var17 * 64;
			var13.field984 = var23;
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

			var13.field987 = var1 + var9;
			var13.field989 = var1 + var11;
			var13.field981 = var2 + var10;
			var13.field994 = var2 + var12;
		}

	}
}
