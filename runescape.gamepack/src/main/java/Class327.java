public final class Class327 {
	public static long field3433;
	public static long field5299;

	public static synchronized long method3047() {
		long var1 = System.currentTimeMillis();
		if (var1 < field3433) {
			field5299 += field3433 - var1;
		}

		field3433 = var1;
		return var1 + field5299;
	}
}
