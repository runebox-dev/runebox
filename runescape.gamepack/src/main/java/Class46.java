import io.runebox.ObfInfo;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfInfo(name = "bt")
public class Class46 {
	static {
		ImageIO.setUseCache(false);
	}

	@ObfInfo(owner = "rh", name = "ak", desc = "([BI)Lvc;")
	public static Class549 method8418(byte[] var0) {
		BufferedImage var2 = null;

		try {
			Class var3 = ImageIO.class;
			synchronized(ImageIO.class) {
				var2 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var10 = var2.getWidth();
			int var4 = var2.getHeight();
			int[] var5 = new int[var4 * var10];
			PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var10, var4, var5, 0, var10);
			var6.grabPixels();
			return new Class549(var5, var10, var4);
		} catch (IOException var8) {
		} catch (InterruptedException var9) {
		}

		return new Class549(0, 0);
	}

	@ObfInfo(name = "aa", desc = "(I)V")
	public static void method857() {
		Class543.field5318.method5995();
	}

	@ObfInfo(name = "ak", desc = "(B)[Lmz;")
	public static ServerPacket[] method855() {
		return new ServerPacket[]{ServerPacket.packet0, ServerPacket.packet1, ServerPacket.packet2, ServerPacket.packet3, ServerPacket.field3533, ServerPacket.field3648, ServerPacket.field3535, ServerPacket.field3596, ServerPacket.field3537, ServerPacket.field3538, ServerPacket.field3604, ServerPacket.field3540, ServerPacket.field3541, ServerPacket.field3542, ServerPacket.field3543, ServerPacket.field3544, ServerPacket.field3635, ServerPacket.field3593, ServerPacket.field3547, ServerPacket.field3622, ServerPacket.field3549, ServerPacket.field3550, ServerPacket.field3602, ServerPacket.field3552, ServerPacket.field3545, ServerPacket.field3554, ServerPacket.field3646, ServerPacket.field3556, ServerPacket.field3557, ServerPacket.field3558, ServerPacket.field3559, ServerPacket.field3560, ServerPacket.field3561, ServerPacket.field3562, ServerPacket.field3563, ServerPacket.field3585, ServerPacket.field3629, ServerPacket.field3566, ServerPacket.field3567, ServerPacket.field3659, ServerPacket.field3569, ServerPacket.field3660, ServerPacket.field3571, ServerPacket.field3608, ServerPacket.field3573, ServerPacket.field3574, ServerPacket.field3594, ServerPacket.field3634, ServerPacket.field3570, ServerPacket.field3578, ServerPacket.field3579, ServerPacket.field3575, ServerPacket.field3539, ServerPacket.field3582, ServerPacket.field3583, ServerPacket.field3584, ServerPacket.field3551, ServerPacket.field3586, ServerPacket.field3587, ServerPacket.field3588, ServerPacket.field3589, ServerPacket.field3590, ServerPacket.field3591, ServerPacket.field3632, ServerPacket.field3565, ServerPacket.field3534, ServerPacket.field3595, ServerPacket.field3532, ServerPacket.field3597, ServerPacket.field3598, ServerPacket.field3599, ServerPacket.field3592, ServerPacket.field3601, ServerPacket.field3577, ServerPacket.field3603, ServerPacket.field3572, ServerPacket.field3605, ServerPacket.field3606, ServerPacket.field3618, ServerPacket.field3600, ServerPacket.field3609, ServerPacket.field3615, ServerPacket.field3611, ServerPacket.field3546, ServerPacket.field3613, ServerPacket.field3614, ServerPacket.field3641, ServerPacket.field3616, ServerPacket.field3617, ServerPacket.field3631, ServerPacket.field3568, ServerPacket.field3607, ServerPacket.field3621, ServerPacket.field3620, ServerPacket.field3623, ServerPacket.field3624, ServerPacket.field3553, ServerPacket.field3626, ServerPacket.field3627, ServerPacket.field3628, ServerPacket.field3625, ServerPacket.field3630, ServerPacket.field3642, ServerPacket.field3658, ServerPacket.field3612, ServerPacket.field3576, ServerPacket.field3580, ServerPacket.field3636, ServerPacket.field3637, ServerPacket.field3638, ServerPacket.field3633, ServerPacket.field3640, ServerPacket.field3639, ServerPacket.field3548, ServerPacket.field3643, ServerPacket.field3644, ServerPacket.field3645, ServerPacket.field3529, ServerPacket.field3647, ServerPacket.field3656, ServerPacket.field3649, ServerPacket.field3564, ServerPacket.field3651, ServerPacket.field3652, ServerPacket.field3653, ServerPacket.field3654, ServerPacket.field3655, ServerPacket.field3650, ServerPacket.field3657, ServerPacket.field3619};
	}
}
