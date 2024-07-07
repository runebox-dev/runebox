import io.runebox.ObfInfo;
import java.net.URL;

@ObfInfo(name = "cw")
public class Class75 {
	@ObfInfo(owner = "gz", name = "ai", desc = "Lez;")
	public static Class130 field1907;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1254652015)
	public static int field898;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1663984253)
	public static int field909;
	@ObfInfo(name = "av", desc = "[I")
	public static int[] field900;
	@ObfInfo(name = "ab", desc = "[I")
	public static int[] field901;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -879175101)
	public int field902;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1966096563)
	public int field904;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1536325123)
	public int field907;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 241496969)
	public int field908;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1816082211)
	public int field912;
	@ObfInfo(name = "ay", desc = "Ljava/lang/String;")
	public String field903;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public String field905;
	@ObfInfo(name = "ax", desc = "Ljava/lang/String;")
	public String field906;

	static {
		field898 = 0;
		field909 = 0;
		field900 = new int[]{1, 1, 1, 1};
		field901 = new int[]{0, 1, 2, 3};
	}

	@ObfInfo(name = "ai", desc = "(I)Z")
	public boolean method2157() {
		return (Class545.field5355.method129() & this.field912) != 0;
	}

	@ObfInfo(name = "ae", desc = "(S)Z")
	public boolean method2188() {
		return (Class545.field5342.method129() & this.field912) != 0;
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaque = "-1337536100")
	public boolean method2159() {
		return (Class545.field5329.method129() & this.field912) != 0;
	}

	@ObfInfo(name = "ah", desc = "(I)Z", opaque = "-2075315413")
	public boolean method2160() {
		return (Class545.field5330.method129() & this.field912) != 0;
	}

	@ObfInfo(name = "az", desc = "(I)Z", opaque = "1680804609")
	public boolean method2187() {
		return (Class545.field5351.method129() & this.field912) != 0;
	}

	@ObfInfo(name = "ax", desc = "(I)Z", opaque = "1582598884")
	public boolean method2162() {
		return (Class545.field5331.method129() & this.field912) != 0;
	}

	@ObfInfo(name = "ac", desc = "(I)Z")
	public boolean method2212() {
		return (Class545.field5353.method129() & this.field912) != 0;
	}

	@ObfInfo(name = "al", desc = "(B)Z", opaque = "65")
	public boolean method2164() {
		return (Class545.field5358.method129() & this.field912) != 0;
	}

	@ObfInfo(name = "ay", desc = "(I)Z", opaque = "1949436624")
	public boolean method2193() {
		return (Class545.field5336.method129() & this.field912) != 0;
	}

	@ObfInfo(name = "ao", desc = "(B)Z")
	public boolean method2166() {
		return (Class545.field5339.method129() & this.field912) != 0;
	}

	@ObfInfo(owner = "oc", name = "aq", desc = "(I)Z", opaque = "-369006170")
	public static boolean method7051() {
		try {
			if (field1907 == null) {
				field1907 = Client.field4823.method2781(new URL(Client.field4577));
			} else if (field1907.method3050()) {
				byte[] var1 = field1907.method3051();
				Class562 var2 = new Class562(var1);
				var2.method9832();
				field898 = var2.method9997();
				Class90.field3782 = new Class75[field898];

				Class75 var4;
				for (int var3 = 0; var3 < field898; var4.field908 = var3++) {
					var4 = Class90.field3782[var3] = new Class75();
					var4.field902 = var2.method9997();
					var4.field912 = var2.method9832();
					var4.field905 = var2.method9837();
					var4.field906 = var2.method9837();
					var4.field907 = var2.method9902();
					var4.field904 = var2.method9829();
				}

				Class245.method4724(Class90.field3782, 0, Class90.field3782.length - 1, field901, field900);
				field1907 = null;
				return true;
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			field1907 = null;
		}

		return false;
	}

	@ObfInfo(owner = "gf", name = "ak", desc = "(IZIZI)V", opaque = "-1299917863")
	public static void method3382(int var0, boolean var1, int var2, boolean var3) {
		if (Class90.field3782 != null) {
			Class512.method9022(0, Class90.field3782.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfInfo(owner = "cx", name = "an", desc = "(Lcw;Lcw;IZIZI)I", opaque = "140226047")
	public static int method2223(Class75 var0, Class75 var1, int var2, boolean var3, int var4, boolean var5) {
		int var7 = Class288.method5697(var0, var1, var2, var3);
		if (var7 != 0) {
			return var3 ? -var7 : var7;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var8 = Class288.method5697(var0, var1, var4, var5);
			return var5 ? -var8 : var8;
		}
	}

	@ObfInfo(owner = "li", name = "av", desc = "(B)Lcw;")
	public static Class75 method5782() {
		field909 = 0;
		return method2220();
	}

	@ObfInfo(name = "ab", desc = "(I)Lcw;", opaque = "409689985")
	public static Class75 method2220() {
		return field909 < field898 ? Class90.field3782[++field909 - 1] : null;
	}
}
