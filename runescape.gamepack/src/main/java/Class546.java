import io.runebox.ObfInfo;

public class Class546 {
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 285355181)
	public static final int field5343;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -2106422351)
	public static final int field5345;

	static {
		field5343 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field5345 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	@ObfInfo(owner = "nd", name = "ak", desc = "(II)I")
	public static int method6654(int var0) {
		return var0 >>> 12;
	}

	@ObfInfo(owner = "fm", name = "al", desc = "(II)I")
	public static int method3178(int var0) {
		return var0 >>> 4 & field5345;
	}

	@ObfInfo(owner = "fi", name = "aj", desc = "(II)I")
	public static int method3130(int var0) {
		return (var0 & field5343) - 1;
	}
}
