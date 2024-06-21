import io.runebox.ObfInfo;

@ObfInfo(name = "mo")
public final class Class327 {
	@ObfInfo(name = "ak", desc = "J", longMultiplier = -2105784994464855103L)
	public static long field3433;
	@ObfInfo(desc = "J", longMultiplier = 6580268898646674783L)
	public static long field5299;

	@ObfInfo(desc = "()J")
	public static synchronized long method3047() {
		long var1 = System.currentTimeMillis();
		if (var1 < field3433) {
			field5299 += field3433 - var1;
		}

		field3433 = var1;
		return var1 + field5299;
	}
}
