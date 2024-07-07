import io.runebox.ObfInfo;

@ObfInfo(name = "ki")
public final class Class269 extends Class520 {
	@ObfInfo(name = "ai", desc = "Lkb;")
	public Class262 field2763;
	@ObfInfo(name = "at", desc = "Lki;")
	public Class269 field2776;
	@ObfInfo(name = "ab", desc = "Lkk;")
	public Class271 field2762;
	@ObfInfo(name = "aj", desc = "Lla;")
	public Class287 field2760;
	@ObfInfo(name = "au", desc = "[Llp;")
	public Class302[] field2765;
	@ObfInfo(name = "ap", desc = "Llt;")
	public Class306 field2768;
	@ObfInfo(name = "av", desc = "Llu;")
	public Class307 field2761;
	@ObfInfo(name = "an", desc = "Llw;")
	public Class309 field2759;
	@ObfInfo(name = "ac", desc = "Z")
	public boolean field2769;
	@ObfInfo(name = "al", desc = "Z")
	public boolean field2770;
	@ObfInfo(name = "ay", desc = "Z")
	public boolean field2771;
	@ObfInfo(name = "as", desc = "I", intMultiplier = 1384418897)
	public int field2754;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 336523667)
	public int field2755;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -720986189)
	public int field2756;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -608515825)
	public int field2757;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 608241537)
	public int field2758;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1837845291)
	public int field2764;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -2079615869)
	public int field2766;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1687914105)
	public int field2767;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 690710773)
	public int field2772;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = -1923980729)
	public int field2775;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1732174243)
	public int field2778;
	@ObfInfo(name = "ah", desc = "[I")
	public int[] field2774;

	public Class269(int var1, int var2, int var3) {
		this.field2765 = new Class302[5];
		this.field2774 = new int[5];
		this.field2767 = 0;
		this.field2757 = this.field2758 = var1;
		this.field2756 = var2;
		this.field2766 = var3;
	}

	@ObfInfo(name = "aq", desc = "(CI)B", opaque = "1638822604")
	public static byte method5083(char var0) {
		byte var2;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 == 8364) {
				var2 = -128;
			} else if (var0 == 8218) {
				var2 = -126;
			} else if (var0 == 402) {
				var2 = -125;
			} else if (var0 == 8222) {
				var2 = -124;
			} else if (var0 == 8230) {
				var2 = -123;
			} else if (var0 == 8224) {
				var2 = -122;
			} else if (var0 == 8225) {
				var2 = -121;
			} else if (var0 == 710) {
				var2 = -120;
			} else if (var0 == 8240) {
				var2 = -119;
			} else if (var0 == 352) {
				var2 = -118;
			} else if (var0 == 8249) {
				var2 = -117;
			} else if (var0 == 338) {
				var2 = -116;
			} else if (var0 == 381) {
				var2 = -114;
			} else if (var0 == 8216) {
				var2 = -111;
			} else if (var0 == 8217) {
				var2 = -110;
			} else if (var0 == 8220) {
				var2 = -109;
			} else if (var0 == 8221) {
				var2 = -108;
			} else if (var0 == 8226) {
				var2 = -107;
			} else if (var0 == 8211) {
				var2 = -106;
			} else if (var0 == 8212) {
				var2 = -105;
			} else if (var0 == 732) {
				var2 = -104;
			} else if (var0 == 8482) {
				var2 = -103;
			} else if (var0 == 353) {
				var2 = -102;
			} else if (var0 == 8250) {
				var2 = -101;
			} else if (var0 == 339) {
				var2 = -100;
			} else if (var0 == 382) {
				var2 = -98;
			} else if (var0 == 376) {
				var2 = -97;
			} else {
				var2 = 63;
			}
		} else {
			var2 = (byte)var0;
		}

		return var2;
	}
}
