import io.runebox.ObfInfo;

@ObfInfo(name = "qf")
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

	@ObfInfo(desc = "(J)Ljava/lang/String;")
	public static String method3324(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = field4681[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}
}
