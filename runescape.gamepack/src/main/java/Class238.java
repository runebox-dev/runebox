import io.runebox.ObfInfo;

@ObfInfo(name = "jd")
public class Class238 {
	@ObfInfo(name = "ab", desc = "(Lde;[BIII)V", opaque = "855566441")
	public static void method4605(Class83 var0, byte[] var1, int var2, int var3) {
		Class562 var5 = new Class562(var1);
		int var6 = -1;

		while (true) {
			int var7 = var5.method9844();
			if (var7 == 0) {
				return;
			}

			var6 += var7;
			int var8 = 0;

			while (true) {
				int var9 = var5.method9842();
				if (var9 == 0) {
					break;
				}

				var8 += var9 - 1;
				int var10 = var8 & 63;
				int var11 = var8 >> 6 & 63;
				int var12 = var8 >> 12;
				int var13 = var5.method9902();
				int var14 = var13 >> 2;
				int var15 = var13 & 3;
				int var16 = var11 + var2;
				int var17 = var10 + var3;
				if (var16 > 0 && var17 > 0 && var16 < var0.field1025[0].length - 2 && var17 < var0.field1025[0][0].length - 2) {
					int var18 = var12;
					if ((var0.field1023[1][var16][var17] & 2) == 2) {
						var18 = var12 - 1;
					}

					Class224 var19 = null;
					if (var18 >= 0 && var0.field1015 != null) {
						var19 = var0.field1015[var18];
					}

					Class97.method246(var0, var12, var16, var17, var6, var15, var14, var19);
				}
			}
		}
	}
}
