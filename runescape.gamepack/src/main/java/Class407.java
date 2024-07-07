import io.runebox.ObfInfo;

@ObfInfo(name = "pq")
public final class Class407 {
	@ObfInfo(owner = "gn", name = "aq", desc = "(Ljava/lang/CharSequence;B)[B", opaque = "0")
	public static byte[] method3539(CharSequence var0) {
		int var2 = var0.length();
		byte[] var3 = new byte[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var5;
			}
		}

		return var3;
	}
}
