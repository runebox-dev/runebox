import io.runebox.ObfInfo;

@ObfInfo(name = "hs")
public class Class201 extends Class516 {
	@ObfInfo(name = "aq", desc = "Lmo;")
	public static Class327 field2204;

	static {
		field2204 = new Class327(64);
	}

	@ObfInfo(owner = "ew", name = "aq", desc = "(I)V")
	public static void method3032() {
		field2204.method6332();
	}

	@ObfInfo(name = "an", desc = "(Ljava/lang/CharSequence;I)[B", opaque = "-1689451251")
	public static byte[] method3996(CharSequence var0) {
		int var2 = var0.length();
		byte[] var3 = new byte[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 > 0 && var5 < 128 || var5 >= 160 && var5 <= 255) {
				var3[var4] = (byte)var5;
			} else if (var5 == 8364) {
				var3[var4] = -128;
			} else if (var5 == 8218) {
				var3[var4] = -126;
			} else if (var5 == 402) {
				var3[var4] = -125;
			} else if (var5 == 8222) {
				var3[var4] = -124;
			} else if (var5 == 8230) {
				var3[var4] = -123;
			} else if (var5 == 8224) {
				var3[var4] = -122;
			} else if (var5 == 8225) {
				var3[var4] = -121;
			} else if (var5 == 710) {
				var3[var4] = -120;
			} else if (var5 == 8240) {
				var3[var4] = -119;
			} else if (var5 == 352) {
				var3[var4] = -118;
			} else if (var5 == 8249) {
				var3[var4] = -117;
			} else if (var5 == 338) {
				var3[var4] = -116;
			} else if (var5 == 381) {
				var3[var4] = -114;
			} else if (var5 == 8216) {
				var3[var4] = -111;
			} else if (var5 == 8217) {
				var3[var4] = -110;
			} else if (var5 == 8220) {
				var3[var4] = -109;
			} else if (var5 == 8221) {
				var3[var4] = -108;
			} else if (var5 == 8226) {
				var3[var4] = -107;
			} else if (var5 == 8211) {
				var3[var4] = -106;
			} else if (var5 == 8212) {
				var3[var4] = -105;
			} else if (var5 == 732) {
				var3[var4] = -104;
			} else if (var5 == 8482) {
				var3[var4] = -103;
			} else if (var5 == 353) {
				var3[var4] = -102;
			} else if (var5 == 8250) {
				var3[var4] = -101;
			} else if (var5 == 339) {
				var3[var4] = -100;
			} else if (var5 == 382) {
				var3[var4] = -98;
			} else if (var5 == 376) {
				var3[var4] = -97;
			} else {
				var3[var4] = 63;
			}
		}

		return var3;
	}
}
