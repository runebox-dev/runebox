import io.runebox.ObfInfo;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfInfo(name = "af")
public final class Class6 extends Canvas {
	@ObfInfo(name = "aq", desc = "Ljava/awt/Component;")
	public Component field31;

	public Class6(Component var1) {
		this.field31 = var1;
	}

	public final void update(Graphics var1) {
		this.field31.update(var1);
	}

	public final void paint(Graphics var1) {
		this.field31.paint(var1);
	}

	@ObfInfo(name = "ju", desc = "(Ldb;IIB)V", opaque = "0")
	public static void method71(Class80 var0, int var1, int var2) {
		if (var0.field1273 == var1 && var1 != -1) {
			int var4 = Class344.method6474(var1).field2370;
			if (var4 == 1) {
				var0.field1274 = 0;
				var0.field1275 = 0;
				var0.field1276 = var2;
				var0.field1252 = 0;
			}

			if (var4 == 2) {
				var0.field1252 = 0;
			}
		} else if (var1 == -1 || var0.field1273 == -1 || Class344.method6474(var1).field2363 >= Class344.method6474(var0.field1273).field2363) {
			var0.field1273 = var1;
			var0.field1274 = 0;
			var0.field1275 = 0;
			var0.field1276 = var2;
			var0.field1252 = 0;
			var0.field1303 = var0.field1267;
		}

	}

	@ObfInfo(name = "ks", desc = "(IIIIIIII)V", opaque = "1210346411")
	public static void method70(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var9 = var6 - 334;
		if (var9 < 0) {
			var9 = 0;
		} else if (var9 > 100) {
			var9 = 100;
		}

		int var10 = (Client.field805 - Client.field675) * var9 / 100 + Client.field675;
		int var8 = var5 * var10 / 256;
		var9 = 2048 - var3 & 2047;
		var10 = 2048 - var4 & 2047;
		int var11 = 0;
		int var12 = 0;
		int var13 = var8;
		int var14;
		int var15;
		int var16;
		if (var9 != 0) {
			var14 = Class274.field2804[var9];
			var15 = Class274.field2805[var9];
			var16 = var12 * var15 - var8 * var14 >> 16;
			var13 = var8 * var15 + var12 * var14 >> 16;
			var12 = var16;
		}

		if (var10 != 0) {
			var14 = Class274.field2804[var10];
			var15 = Class274.field2805[var10];
			var16 = var11 * var15 + var13 * var14 >> 16;
			var13 = var13 * var15 - var11 * var14 >> 16;
			var11 = var16;
		}

		if (Client.field792) {
			Client.field2665 = var0 - var11;
			Client.field407 = var1 - var12;
			Client.field1551 = var2 - var13;
			Client.field3667 = var3;
			Client.field2691 = var4;
		} else {
			Client.field144 = var0 - var11;
			Client.field3664 = var1 - var12;
			Client.field850 = var2 - var13;
			Client.field4606 = var3;
			Client.field3333 = var4;
		}

		if (Client.field620 == 1 && Client.field705 >= 2 && Client.field541 % 50 == 0 && (Client.field4526 >> 7 != Client.field170.field1266 >> 7 || Client.field3275 >> 7 != Client.field170.field1229 >> 7)) {
			var14 = Client.field170.field982;
			var15 = (Client.field4526 >> 7) + Client.field5093.field1019;
			var16 = (Client.field3275 >> 7) + Client.field5093.field1021;
			Client.method2715(var15, var16, var14, true);
		}

	}
}
