import io.runebox.ObfInfo;

@ObfInfo(name = "ew")
public class Class127 {
	@ObfInfo(name = "an", desc = "Lew;")
	public static final Class127 field1495;
	@ObfInfo(name = "ad", desc = "Lew;")
	public static final Class127 field1496;
	@ObfInfo(name = "ag", desc = "Lew;")
	public static final Class127 field1497;
	@ObfInfo(name = "ak", desc = "Lew;")
	public static final Class127 field1498;
	@ObfInfo(name = "ai", desc = "Lew;")
	public static final Class127 field1499;
	@ObfInfo(name = "ap", desc = "Lew;")
	public static final Class127 field1501;
	@ObfInfo(name = "av", desc = "Lew;")
	public static final Class127 field1502;
	@ObfInfo(name = "ab", desc = "Lew;")
	public static final Class127 field1503;
	@ObfInfo(name = "au", desc = "Lew;")
	public static final Class127 field1504;
	@ObfInfo(name = "ae", desc = "Lew;")
	public static final Class127 field1505;
	@ObfInfo(name = "aq", desc = "Lew;")
	public static final Class127 field1506;
	@ObfInfo(name = "aj", desc = "Lew;")
	public static final Class127 field1507;
	@ObfInfo(name = "az", desc = "Lew;")
	public static final Class127 field1508;
	@ObfInfo(name = "ax", desc = "Lew;")
	public static final Class127 field1509;
	@ObfInfo(name = "ac", desc = "Lew;")
	public static final Class127 field1510;
	@ObfInfo(name = "ah", desc = "Lew;")
	public static final Class127 field1512;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -262339015)
	public int field1511;

	static {
		field1506 = new Class127(0);
		field1496 = new Class127(1);
		field1497 = new Class127(2);
		field1498 = new Class127(3);
		field1501 = new Class127(4);
		field1495 = new Class127(5);
		field1507 = new Class127(6);
		field1502 = new Class127(7);
		field1503 = new Class127(8);
		field1499 = new Class127(9);
		field1505 = new Class127(10);
		field1504 = new Class127(11);
		field1512 = new Class127(12);
		field1508 = new Class127(13);
		field1509 = new Class127(14);
		field1510 = new Class127(15);
	}

	public Class127(int var1) {
		this.field1511 = var1;
	}

	@ObfInfo(name = "ko", desc = "(IIIIIIIB)Z", opaque = "0")
	public static boolean method3033(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Class277 var8 = Client.field94.field1014;
		int var10;
		if (Class388.field4550.field4554 == var5) {
			Class287 var9 = var8.method5366(var0, var1, var2);
			if (var9 != null) {
				var10 = Class296.method4404(var9.field3023);
				if (Class368.field4364.field4347 == var3) {
					var9.field3022 = new Class96(Client.field94, var10, 2, var4 + 4, var0, var1, var2, var6, false, var9.field3022);
					var9.field3017 = new Class96(Client.field94, var10, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var9.field3017);
				} else {
					var9.field3022 = new Class96(Client.field94, var10, var3, var4, var0, var1, var2, var6, false, var9.field3022);
				}

				return true;
			}
		} else if (Class388.field4551.field4554 == var5) {
			Class307 var11 = var8.method5275(var0, var1, var2);
			if (var11 != null) {
				var10 = Class296.method4404(var11.field3139);
				if (Class368.field4351.field4347 != var3 && Class368.field4363.field4347 != var3) {
					if (Class368.field4353.field4347 == var3) {
						var11.field3138 = new Class96(Client.field94, var10, 4, var4 + 4, var0, var1, var2, var6, false, var11.field3138);
					} else if (Class368.field4354.field4347 == var3) {
						var11.field3138 = new Class96(Client.field94, var10, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var11.field3138);
					} else if (Class368.field4355.field4347 == var3) {
						var11.field3138 = new Class96(Client.field94, var10, 4, var4 + 4, var0, var1, var2, var6, false, var11.field3138);
						var11.field3146 = new Class96(Client.field94, var10, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var11.field3146);
					}
				} else {
					var11.field3138 = new Class96(Client.field94, var10, 4, var4, var0, var1, var2, var6, false, var11.field3138);
				}

				return true;
			}
		} else if (Class388.field4552.field4554 == var5) {
			Class302 var12 = var8.method5276(var0, var1, var2);
			if (Class368.field4367.field4347 == var3) {
				var3 = Class368.field4366.field4347;
			}

			if (var12 != null) {
				var12.field3096 = new Class96(Client.field94, Class296.method4404(var12.field3104), var3, var4, var0, var1, var2, var6, false, var12.field3096);
				return true;
			}
		} else if (Class388.field4553.field4554 == var5) {
			Class271 var13 = var8.method5387(var0, var1, var2);
			if (var13 != null) {
				var13.field2788 = new Class96(Client.field94, Class296.method4404(var13.field2787), 22, var4, var0, var1, var2, var6, false, var13.field2788);
				return true;
			}
		}

		return false;
	}
}
