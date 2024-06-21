import io.runebox.ObfInfo;
import java.io.File;
import java.io.RandomAccessFile;

@ObfInfo(name = "qj")
public class Class426 extends Class447 {
	@ObfInfo(name = "al", desc = "I", intMultiplier = -1905821101)
	public int field4692;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = -8846500232165804043L)
	public long field4693;

	public Class426(Class447 var1, int var2) {
		super(var1);
		this.field4692 = var2;
		super.field4807 = "DelayFadeTask";
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "709593494")
	public boolean method7832() {
		if (this.field4693 < (long)this.field4692) {
			++this.field4693;
			return false;
		} else {
			return true;
		}
	}

	@ObfInfo(name = "af", desc = "(Ljava/lang/CharSequence;II[BII)I", opaque = "887001194")
	public static int method7872(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var6 = var2 - var1;

		for (int var7 = 0; var7 < var6; ++var7) {
			char var8 = var0.charAt(var7 + var1);
			if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
				if (var8 == 8364) {
					var3[var7 + var4] = -128;
				} else if (var8 == 8218) {
					var3[var7 + var4] = -126;
				} else if (var8 == 402) {
					var3[var7 + var4] = -125;
				} else if (var8 == 8222) {
					var3[var7 + var4] = -124;
				} else if (var8 == 8230) {
					var3[var7 + var4] = -123;
				} else if (var8 == 8224) {
					var3[var7 + var4] = -122;
				} else if (var8 == 8225) {
					var3[var7 + var4] = -121;
				} else if (var8 == 710) {
					var3[var7 + var4] = -120;
				} else if (var8 == 8240) {
					var3[var7 + var4] = -119;
				} else if (var8 == 352) {
					var3[var7 + var4] = -118;
				} else if (var8 == 8249) {
					var3[var7 + var4] = -117;
				} else if (var8 == 338) {
					var3[var7 + var4] = -116;
				} else if (var8 == 381) {
					var3[var7 + var4] = -114;
				} else if (var8 == 8216) {
					var3[var7 + var4] = -111;
				} else if (var8 == 8217) {
					var3[var7 + var4] = -110;
				} else if (var8 == 8220) {
					var3[var7 + var4] = -109;
				} else if (var8 == 8221) {
					var3[var7 + var4] = -108;
				} else if (var8 == 8226) {
					var3[var7 + var4] = -107;
				} else if (var8 == 8211) {
					var3[var7 + var4] = -106;
				} else if (var8 == 8212) {
					var3[var7 + var4] = -105;
				} else if (var8 == 732) {
					var3[var7 + var4] = -104;
				} else if (var8 == 8482) {
					var3[var7 + var4] = -103;
				} else if (var8 == 353) {
					var3[var7 + var4] = -102;
				} else if (var8 == 8250) {
					var3[var7 + var4] = -101;
				} else if (var8 == 339) {
					var3[var7 + var4] = -100;
				} else if (var8 == 382) {
					var3[var7 + var4] = -98;
				} else if (var8 == 376) {
					var3[var7 + var4] = -97;
				} else {
					var3[var7 + var4] = 63;
				}
			} else {
				var3[var7 + var4] = (byte)var8;
			}
		}

		return var6;
	}

	@ObfInfo(name = "aj", desc = "(Ljava/io/File;ZS)Z", opaque = "10304")
	public static boolean method7869(File var0, boolean var1) {
		try {
			RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
			int var4 = var3.read();
			var3.seek(0L);
			var3.write(var4);
			var3.seek(0L);
			var3.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var5) {
			return false;
		}
	}
}
