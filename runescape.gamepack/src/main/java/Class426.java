import io.runebox.ObfInfo;

@ObfInfo(name = "qj")
public final class Class426 {
	@ObfInfo(name = "ad", desc = "[J")
	public static long[] field4712;
	@ObfInfo(name = "aq", desc = "[C")
	public static final char[] field4711;

	static {
		field4711 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4712 = new long[12];

		for (int var0 = 0; var0 < field4712.length; ++var0) {
			field4712[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfInfo(owner = "hs", name = "ad", desc = "(Ljava/lang/CharSequence;I)Ljava/lang/String;", opaque = "-1642292380")
	public static String method3995(CharSequence var0) {
		long var4 = 0L;
		int var6 = var0.length();

		for (int var7 = 0; var7 < var6; ++var7) {
			var4 *= 37L;
			char var8 = var0.charAt(var7);
			if (var8 >= 'A' && var8 <= 'Z') {
				var4 += (long)(var8 + 1 - 65);
			} else if (var8 >= 'a' && var8 <= 'z') {
				var4 += (long)(var8 + 1 - 97);
			} else if (var8 >= '0' && var8 <= '9') {
				var4 += (long)(var8 + 27 - 48);
			}

			if (var4 >= 177917621779460413L) {
				break;
			}
		}

		while (var4 % 37L == 0L && var4 != 0L) {
			var4 /= 37L;
		}

		String var9 = Class240.method4650(var4);
		if (var9 == null) {
			var9 = "";
		}

		return var9;
	}
}
