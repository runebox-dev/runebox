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

	@ObfInfo(desc = "([B)LClass549;")
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
	public static Class338[] method855() {
		return new Class338[]{Class338.field3610, Class338.field3530, Class338.field3531, Class338.field3581, Class338.field3533, Class338.field3648, Class338.field3535, Class338.field3596, Class338.field3537, Class338.field3538, Class338.field3604, Class338.field3540, Class338.field3541, Class338.field3542, Class338.field3543, Class338.field3544, Class338.field3635, Class338.field3593, Class338.field3547, Class338.field3622, Class338.field3549, Class338.field3550, Class338.field3602, Class338.field3552, Class338.field3545, Class338.field3554, Class338.field3646, Class338.field3556, Class338.field3557, Class338.field3558, Class338.field3559, Class338.field3560, Class338.field3561, Class338.field3562, Class338.field3563, Class338.field3585, Class338.field3629, Class338.field3566, Class338.field3567, Class338.field3659, Class338.field3569, Class338.field3660, Class338.field3571, Class338.field3608, Class338.field3573, Class338.field3574, Class338.field3594, Class338.field3634, Class338.field3570, Class338.field3578, Class338.field3579, Class338.field3575, Class338.field3539, Class338.field3582, Class338.field3583, Class338.field3584, Class338.field3551, Class338.field3586, Class338.field3587, Class338.field3588, Class338.field3589, Class338.field3590, Class338.field3591, Class338.field3632, Class338.field3565, Class338.field3534, Class338.field3595, Class338.field3532, Class338.field3597, Class338.field3598, Class338.field3599, Class338.field3592, Class338.field3601, Class338.field3577, Class338.field3603, Class338.field3572, Class338.field3605, Class338.field3606, Class338.field3618, Class338.field3600, Class338.field3609, Class338.field3615, Class338.field3611, Class338.field3546, Class338.field3613, Class338.field3614, Class338.field3641, Class338.field3616, Class338.field3617, Class338.field3631, Class338.field3568, Class338.field3607, Class338.field3621, Class338.field3620, Class338.field3623, Class338.field3624, Class338.field3553, Class338.field3626, Class338.field3627, Class338.field3628, Class338.field3625, Class338.field3630, Class338.field3642, Class338.field3658, Class338.field3612, Class338.field3576, Class338.field3580, Class338.field3636, Class338.field3637, Class338.field3638, Class338.field3633, Class338.field3640, Class338.field3639, Class338.field3548, Class338.field3643, Class338.field3644, Class338.field3645, Class338.field3529, Class338.field3647, Class338.field3656, Class338.field3649, Class338.field3564, Class338.field3651, Class338.field3652, Class338.field3653, Class338.field3654, Class338.field3655, Class338.field3650, Class338.field3657, Class338.field3619};
	}
}
