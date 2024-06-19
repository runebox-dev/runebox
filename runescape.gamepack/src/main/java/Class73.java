import java.math.BigInteger;

public class Class73 {
	public static final BigInteger field901;
	public static final BigInteger field902;

	static {
		field901 = new BigInteger("10001", 16);
		field902 = new BigInteger("b6ecb07cf4c0f9d84e72bdd5d3e9ae492e386bc55f238705f6f05d8ca54ca4cc0552132507360c1aa650b16b11274aff0ef72db07b6d87276f2dd3105aeb28503f810900d3ce309c621ca62527e66855deeb6ee3be1669c5dae360e2d5cf2d61eed8ac2d52e5bb3485b5aa4735b1843295380c6e020e2fffefb8b4a9abe84019", 16);
	}

	public static double method2079(int var0, int var1, int var2) {
		double var4 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D;
		if (var4 > 0.0D && var4 < 1.0D) {
			double var6;
			double var8;
			switch(var2) {
			case 0:
				return var4;
			case 1:
				return 1.0D - Math.cos(var4 * 3.141592653589793D / 2.0D);
			case 2:
				return Math.sin(var4 * 3.141592653589793D / 2.0D);
			case 3:
				return -(Math.cos(var4 * 3.141592653589793D) - 1.0D) / 2.0D;
			case 4:
				return var4 * var4;
			case 5:
				return 1.0D - (1.0D - var4) * (1.0D - var4);
			case 6:
				return var4 < 0.5D ? 2.0D * var4 * var4 : 1.0D - Math.pow(var4 * -2.0D + 2.0D, 2.0D) / 2.0D;
			case 7:
				return var4 * var4 * var4;
			case 8:
				return 1.0D - Math.pow(1.0D - var4, 3.0D);
			case 9:
				return var4 < 0.5D ? var4 * var4 * var4 * 4.0D : 1.0D - Math.pow(2.0D + var4 * -2.0D, 3.0D) / 2.0D;
			case 10:
				return var4 * var4 * var4 * var4;
			case 11:
				return 1.0D - Math.pow(1.0D - var4, 4.0D);
			case 12:
				return var4 < 0.5D ? var4 * 8.0D * var4 * var4 * var4 : 1.0D - Math.pow(var4 * -2.0D + 2.0D, 4.0D) / 2.0D;
			case 13:
				return var4 * var4 * var4 * var4 * var4;
			case 14:
				return 1.0D - Math.pow(1.0D - var4, 5.0D);
			case 15:
				return var4 < 0.5D ? var4 * var4 * 8.0D * var4 * var4 * var4 : 1.0D - Math.pow(-2.0D * var4 + 2.0D, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, 10.0D * var4 - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var4);
			case 18:
				return var4 < 0.5D ? Math.pow(2.0D, var4 * 20.0D + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, -20.0D * var4 + 10.0D)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var4, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var4 - 1.0D, 2.0D));
			case 21:
				return var4 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var4 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + var4 * -2.0D, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				var6 = 1.70158D;
				var8 = 2.70158D;
				return 2.70158D * var4 * var4 * var4 - var4 * 1.70158D * var4;
			case 23:
				var6 = 1.70158D;
				var8 = 2.70158D;
				return 1.0D + 2.70158D * Math.pow(var4 - 1.0D, 3.0D) + 1.70158D * Math.pow(var4 - 1.0D, 2.0D);
			case 24:
				var6 = 1.70158D;
				var8 = 2.5949095D;
				return var4 < 0.5D ? Math.pow(2.0D * var4, 2.0D) * (var4 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(2.0D * var4 - 2.0D, 2.0D) * (2.5949095D + 3.5949095D * (var4 * 2.0D - 2.0D)) + 2.0D) / 2.0D;
			case 25:
				var6 = 2.0943951023931953D;
				return -Math.pow(2.0D, var4 * 10.0D - 10.0D) * Math.sin(2.0943951023931953D * (var4 * 10.0D - 10.75D));
			case 26:
				var6 = 2.0943951023931953D;
				return Math.pow(2.0D, -10.0D * var4) * Math.sin(2.0943951023931953D * (var4 * 10.0D - 0.75D)) + 1.0D;
			case 27:
				var6 = 1.3962634015954636D;
				var8 = Math.sin((20.0D * var4 - 11.125D) * 1.3962634015954636D);
				return var4 < 0.5D ? -(Math.pow(2.0D, 20.0D * var4 - 10.0D) * var8) / 2.0D : Math.pow(2.0D, 10.0D + var4 * -20.0D) * var8 / 2.0D + 1.0D;
			default:
				return var4;
			}
		} else {
			return var4 <= 0.0D ? 0.0D : 1.0D;
		}
	}
}
