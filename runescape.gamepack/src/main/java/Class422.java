import io.runebox.ObfInfo;

public final class Class422 {
	@ObfInfo(name = "al", desc = "[J")
	public static long[] field4682;
	@ObfInfo(name = "ak", desc = "[C")
	public static final char[] field4681;

	static {
		field4681 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4682 = new long[12];

		for (int var0 = 0; var0 < field4682.length; ++var0) {
			field4682[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}
}
