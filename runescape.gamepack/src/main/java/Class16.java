import io.runebox.ObfInfo;

@ObfInfo(name = "ap")
public final class Class16 {
	@ObfInfo(name = "aq", desc = "(III)Z", opaque = "-316945897")
	public static boolean method216(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	@ObfInfo(name = "av", desc = "([BIII)Z", opaque = "1559475479")
	public static boolean method217(byte[] var0, int var1, int var2) {
		boolean var4 = true;
		Class562 var5 = new Class562(var0);
		int var6 = -1;

		label60:
		while (true) {
			int var7 = var5.method9844();
			if (var7 == 0) {
				return var4;
			}

			var6 += var7;
			int var8 = 0;
			boolean var9 = false;

			while (true) {
				int var10;
				while (!var9) {
					var10 = var5.method9842();
					if (var10 == 0) {
						continue label60;
					}

					var8 += var10 - 1;
					int var11 = var8 & 63;
					int var12 = var8 >> 6 & 63;
					int var13 = var5.method9902() >> 2;
					int var14 = var12 + var1;
					int var15 = var11 + var2;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						Class197 var16 = Class197.method61(var6);
						if (var13 != 22 || !Client.field687 || var16.field2144 != 0 || 1 == var16.field2126 || var16.field2134) {
							if (!var16.method3901()) {
								++Client.field599;
								var4 = false;
							}

							var9 = true;
						}
					}
				}

				var10 = var5.method9842();
				if (var10 == 0) {
					break;
				}

				var5.method9902();
			}
		}
	}
}
