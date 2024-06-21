import io.runebox.ObfInfo;

@ObfInfo(name = "uz")
public class Class546 {
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 285355181)
	public static final int field5343;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -2106422351)
	public static final int field5345;

	static {
		field5343 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field5345 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	@ObfInfo(desc = "(I)I")
	public static int method6654(int var0) {
		return var0 >>> 12;
	}

	@ObfInfo(desc = "(I)I")
	public static int method3178(int var0) {
		return var0 >>> 4 & field5345;
	}

	@ObfInfo(desc = "(I)I")
	public static int method3130(int var0) {
		return (var0 & field5343) - 1;
	}
}
