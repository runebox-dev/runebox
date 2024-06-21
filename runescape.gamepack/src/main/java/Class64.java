import io.runebox.ObfInfo;
import java.net.URL;

@ObfInfo(name = "cl")
public class Class64 {
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 2131264189)
	public static int field469;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -2090683731)
	public static int field470;
	@ObfInfo(name = "ab", desc = "[I")
	public static int[] field471;
	@ObfInfo(name = "ac", desc = "[I")
	public static int[] field472;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1955345391)
	public int field473;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1068316549)
	public int field475;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = -418279125)
	public int field478;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -169166189)
	public int field480;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -157204183)
	public int field482;
	@ObfInfo(name = "au", desc = "Ljava/lang/String;")
	public String field467;
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	public String field476;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	public String field477;

	static {
		field469 = 0;
		field470 = 0;
		field471 = new int[]{1, 1, 1, 1};
		field472 = new int[]{0, 1, 2, 3};
	}

	@ObfInfo(name = "ao", desc = "(B)Z", opaque = "15")
	public boolean method1175() {
		return (Class534.field5282.method175() & this.field480) != 0;
	}

	@ObfInfo(name = "ah", desc = "(B)Z", opaque = "11")
	public boolean method1139() {
		return (Class534.field5281.method175() & this.field480) != 0;
	}

	@ObfInfo(name = "av", desc = "(I)Z", opaque = "2093692144")
	public boolean method1155() {
		return (Class534.field5265.method175() & this.field480) != 0;
	}

	@ObfInfo(name = "aq", desc = "(I)Z", opaque = "-2146676390")
	public boolean method1147() {
		return (Class534.field5267.method175() & this.field480) != 0;
	}

	@ObfInfo(name = "ap", desc = "(I)Z")
	public boolean method1142() {
		return (Class534.field5271.method175() & this.field480) != 0;
	}

	@ObfInfo(name = "ae", desc = "(I)Z", opaque = "-138488380")
	public boolean method1143() {
		return (Class534.field5294.method175() & this.field480) != 0;
	}

	@ObfInfo(name = "ax", desc = "(I)Z", opaque = "918975274")
	public boolean method1144() {
		return (Class534.field5290.method175() & this.field480) != 0;
	}

	@ObfInfo(name = "ay", desc = "(B)Z", opaque = "1")
	public boolean method1189() {
		return (Class534.field5295.method175() & this.field480) != 0;
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaque = "1895028296")
	public boolean method1146() {
		return (Class534.field5268.method175() & this.field480) != 0;
	}

	@ObfInfo(name = "as", desc = "(B)Z", opaque = "91")
	public boolean method1187() {
		return (Class534.field5270.method175() & this.field480) != 0;
	}

	@ObfInfo(owner = "pd", name = "ak", desc = "(B)Z", opaque = "33")
	public static boolean method7411() {
		try {
			if (Class76.field53 == null) {
				Class76.field53 = Client.field3381.method2759(new URL(Client.field2657));
			} else if (Class76.field53.method2742()) {
				byte[] var1 = Class76.field53.method2743();
				Class521 var2 = new Class521(var1);
				var2.method9410();
				field469 = var2.method9407();
				Class76.field4598 = new Class64[field469];

				Class64 var4;
				for (int var3 = 0; var3 < field469; var4.field478 = var3++) {
					var4 = Class76.field4598[var3] = new Class64();
					var4.field473 = var2.method9407();
					var4.field480 = var2.method9410();
					var4.field476 = var2.method9415();
					var4.field477 = var2.method9415();
					var4.field482 = var2.method9405();
					var4.field475 = var2.method9535();
				}

				Class270.method5396(Class76.field4598, 0, Class76.field4598.length - 1, field472, field471);
				Class76.field53 = null;
				return true;
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			Class76.field53 = null;
		}

		return false;
	}

	@ObfInfo(owner = "je", name = "al", desc = "(IIB)V", opaque = "13")
	public static void method4643(int var0, int var1) {
		int[] var3 = new int[4];
		int[] var4 = new int[4];
		var3[0] = var0;
		var4[0] = var1;
		int var5 = 1;

		for (int var6 = 0; var6 < 4; ++var6) {
			if (field472[var6] != var0) {
				var3[var5] = field472[var6];
				var4[var5] = field471[var6];
				++var5;
			}
		}

		field472 = var3;
		field471 = var4;
		Class270.method5396(Class76.field4598, 0, Class76.field4598.length - 1, field472, field471);
	}

	@ObfInfo(owner = "hd", name = "af", desc = "(IIIZIZI)V", opaque = "2129931306")
	public static void method3694(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var7 = (var1 + var0) / 2;
			int var8 = var0;
			Class64 var9 = Class76.field4598[var7];
			Class76.field4598[var7] = Class76.field4598[var1];
			Class76.field4598[var1] = var9;

			for (int var10 = var0; var10 < var1; ++var10) {
				if (method3596(Class76.field4598[var10], var9, var2, var3, var4, var5) <= 0) {
					Class64 var11 = Class76.field4598[var10];
					Class76.field4598[var10] = Class76.field4598[var8];
					Class76.field4598[var8++] = var11;
				}
			}

			Class76.field4598[var1] = Class76.field4598[var8];
			Class76.field4598[var8] = var9;
			method3694(var0, var8 - 1, var2, var3, var4, var5);
			method3694(var8 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfInfo(owner = "gu", name = "aa", desc = "(Lcl;Lcl;IZIZI)I", opaque = "-247330494")
	public static int method3596(Class64 var0, Class64 var1, int var2, boolean var3, int var4, boolean var5) {
		int var7 = Class256.method4904(var0, var1, var2, var3);
		if (var7 != 0) {
			return var3 ? -var7 : var7;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var8 = Class256.method4904(var0, var1, var4, var5);
			return var5 ? -var8 : var8;
		}
	}

	@ObfInfo(owner = "iy", name = "ab", desc = "(I)Lcl;")
	public static Class64 method4486() {
		field470 = 0;
		return method3086();
	}

	@ObfInfo(owner = "fe", name = "ac", desc = "(I)Lcl;")
	public static Class64 method3086() {
		return field470 < field469 ? Class76.field4598[++field470 - 1] : null;
	}
}
