import io.runebox.ObfInfo;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfInfo(name = "bo")
public class Class41 {
	static {
		ImageIO.setUseCache(false);
	}

	@ObfInfo(owner = "hu", name = "aq", desc = "([BI)Lvg;")
	public static Class553 method4002(byte[] var0) {
		BufferedImage var2 = null;

		try {
			Class var3 = ImageIO.class;
			synchronized(ImageIO.class) {
				var2 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var10 = var2.getWidth();
			int var4 = var2.getHeight();
			int[] var5 = new int[var10 * var4];
			PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var10, var4, var5, 0, var10);
			var6.grabPixels();
			return new Class553(var5, var10, var4);
		} catch (IOException var8) {
		} catch (InterruptedException var9) {
		}

		return new Class553(0, 0);
	}

	@ObfInfo(name = "kv", desc = "(IIIIIII)V", opaque = "1450788263")
	public static void method573(int var0, int var1, int var2, int var3, int var4, int var5) {
		Class408 var7 = Client.field94.field1032[var0][var1][var2];
		if (var7 != null) {
			for (Class119 var8 = (Class119)var7.method7526(); var8 != null; var8 = (Class119)var7.method7511()) {
				if ((var3 & 32767) == var8.field1439 && var8.field1443 == var4) {
					var8.field1443 = var5;
					break;
				}
			}

			Client.method4907(var0, var1, var2);
		}

	}

	@ObfInfo(name = "nb", desc = "(Lnx;I)V", opaque = "-1265045225")
	public static void method578(Class362 var0) {
		int var2 = var0.field3817;
		if (var2 == 324) {
			if (Client.field816 == -1) {
				Client.field816 = var0.field3848;
				Client.field691 = var0.field3857;
			}

			if (Client.field815.field3720 == 1) {
				var0.field3848 = Client.field816;
			} else {
				var0.field3848 = Client.field691;
			}

		} else if (var2 == 325) {
			if (Client.field816 == -1) {
				Client.field816 = var0.field3848;
				Client.field691 = var0.field3857;
			}

			if (Client.field815.field3720 == 1) {
				var0.field3848 = Client.field691;
			} else {
				var0.field3848 = Client.field816;
			}

		} else if (var2 == 327) {
			var0.field3865 = 150;
			var0.field3866 = (int)(Math.sin((double)Client.field541 / 40.0D) * 256.0D) & 2047;
			var0.field3891 = 5;
			var0.field3858 = 0;
		} else if (var2 == 328) {
			var0.field3865 = 150;
			var0.field3866 = (int)(Math.sin((double)Client.field541 / 40.0D) * 256.0D) & 2047;
			var0.field3891 = 5;
			var0.field3858 = 1;
		}
	}
}
