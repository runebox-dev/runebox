import io.runebox.ObfInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ObfInfo(name = "tr")
public class Class512 extends Class520 implements Class125 {
	@ObfInfo(name = "bg", desc = "Z")
	public boolean field5118;
	@ObfInfo(name = "bw", desc = "Z")
	public boolean field5124;
	@ObfInfo(name = "bf", desc = "I", intMultiplier = 2145527819)
	public int field5111;
	@ObfInfo(name = "by", desc = "I", intMultiplier = 880016047)
	public int field5112;
	@ObfInfo(name = "ba", desc = "I", intMultiplier = 1443411709)
	public int field5117;
	@ObfInfo(name = "bs", desc = "I", intMultiplier = -848330753)
	public int field5119;
	@ObfInfo(name = "bx", desc = "I", intMultiplier = -1469332107)
	public int field5121;
	@ObfInfo(name = "bu", desc = "I", intMultiplier = -485504683)
	public int field5122;
	@ObfInfo(name = "bc", desc = "I", intMultiplier = -439330597)
	public int field5123;
	@ObfInfo(name = "bb", desc = "I", intMultiplier = -1024146357)
	public int field5127;
	@ObfInfo(name = "bn", desc = "I", intMultiplier = 839691755)
	public int field5128;
	@ObfInfo(name = "bl", desc = "I", intMultiplier = -1454507281)
	public int field5130;
	@ObfInfo(name = "br", desc = "I", intMultiplier = -2146477359)
	public int field5134;
	@ObfInfo(name = "bk", desc = "I", intMultiplier = 1722479495)
	public int field5135;
	@ObfInfo(name = "cf", desc = "I", intMultiplier = 1429426761)
	public int field5136;
	@ObfInfo(name = "bp", desc = "I", intMultiplier = 667260975)
	public int field5137;
	@ObfInfo(name = "cg", desc = "I", intMultiplier = 722566405)
	public int field5139;
	@ObfInfo(name = "cm", desc = "[I")
	public int[] field5140;
	@ObfInfo(name = "cv", desc = "Ljava/lang/String;")
	public String field5113;
	@ObfInfo(name = "bd", desc = "Ljava/lang/String;")
	public String field5125;
	@ObfInfo(name = "bq", desc = "Ljava/lang/String;")
	public String field5126;
	@ObfInfo(name = "bh", desc = "Ljava/lang/String;")
	public String field5129;
	@ObfInfo(name = "bz", desc = "Ljava/lang/String;")
	public String field5132;
	@ObfInfo(name = "cl", desc = "Ljava/lang/String;")
	public String field5138;
	@ObfInfo(name = "cu", desc = "Ljava/lang/String;")
	public String field5141;
	@ObfInfo(name = "cn", desc = "Ljava/lang/String;")
	public String field5142;

	public Class512(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27) {
		this.field5140 = new int[3];
		this.field5117 = var1;
		this.field5118 = var2;
		this.field5119 = var3;
		this.field5137 = var4;
		this.field5121 = var5;
		this.field5122 = var6;
		this.field5112 = var7;
		this.field5124 = var8;
		this.field5130 = var9;
		this.field5123 = var10;
		this.field5127 = var11;
		this.field5128 = var12;
		this.field5129 = var13;
		this.field5126 = var14;
		this.field5125 = var15;
		this.field5132 = var16;
		this.field5135 = var17;
		this.field5134 = var18;
		this.field5111 = var19;
		this.field5136 = var20;
		this.field5113 = var21;
		this.field5138 = var22;
		this.field5140 = var23;
		this.field5139 = var24;
		this.field5141 = var25;
		this.field5142 = var26;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;I)V", opaque = "668387316")
	public void method9014(Class562 var1) {
		var1.method9809(9);
		var1.method9809(this.field5117);
		var1.method9809(this.field5118 ? 1 : 0);
		var1.method9810(this.field5119);
		var1.method9809(this.field5137);
		var1.method9809(this.field5121);
		var1.method9809(this.field5122);
		var1.method9809(this.field5112);
		var1.method9809(this.field5124 ? 1 : 0);
		var1.method9810(this.field5130);
		var1.method9809(this.field5123);
		var1.method9811(this.field5127);
		var1.method9810(this.field5128);
		var1.method10003(this.field5129);
		var1.method10003(this.field5126);
		var1.method10003(this.field5125);
		var1.method10003(this.field5132);
		var1.method9809(this.field5134);
		var1.method9810(this.field5135);
		var1.method10003(this.field5113);
		var1.method10003(this.field5138);
		var1.method9809(this.field5111);
		var1.method9809(this.field5136);

		for (int var3 = 0; var3 < this.field5140.length; ++var3) {
			var1.method9812(this.field5140[var3]);
		}

		var1.method9812(this.field5139);
		var1.method10003(this.field5141);
		var1.method10003(this.field5142);
	}

	@ObfInfo(name = "ad", desc = "(B)I")
	public int method9019() {
		byte var2 = 39;
		String var5 = this.field5129;
		int var4 = var5.length() + 2;
		int var27 = var4 + var2;
		String var8 = this.field5126;
		int var7 = var8.length() + 2;
		var27 += var7;
		String var11 = this.field5125;
		int var10 = var11.length() + 2;
		var27 += var10;
		String var14 = this.field5132;
		int var13 = var14.length() + 2;
		var27 += var13;
		String var17 = this.field5113;
		int var16 = var17.length() + 2;
		var27 += var16;
		String var20 = this.field5138;
		int var19 = var20.length() + 2;
		var27 += var19;
		String var23 = this.field5141;
		int var22 = var23.length() + 2;
		var27 += var22;
		String var26 = this.field5142;
		int var25 = var26.length() + 2;
		var27 += var25;
		return var27;
	}

	@ObfInfo(name = "ag", desc = "(II)Ljava/lang/String;", opaque = "1007469139")
	public String method9016(int var1) {
		String var3 = "";
		String var4 = "12345678-0000-0000-0000-123456789012";
		switch(var1) {
		case 1:
			var3 = "wmic csproduct get UUID";
			break;
		case 2:
			var3 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
			break;
		case 3:
			var3 = "cat /etc/machine-id";
			break;
		default:
			return "Unknown";
		}

		try {
			Process var5 = Runtime.getRuntime().exec(var3);
			BufferedReader var6 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
			StringBuilder var7 = new StringBuilder();

			String var8;
			while ((var8 = var6.readLine()) != null) {
				var7.append(var8 + "\n");
			}

			if (var1 == 1) {
				var4 = var7.substring(var7.indexOf("\n"), var7.length()).trim();
			} else if (var1 == 2) {
				int var9 = var7.indexOf("UUID: ") + 36;
				var4 = var7.substring(var7.indexOf("UUID: "), var9).replace("UUID: ", "");
			} else if (var1 == 3) {
				if (var7.length() == 33) {
					var7 = new StringBuilder(var7.substring(0, var7.length() - 1));
				}

				if (var7.length() == 32) {
					var7.insert(20, "-");
					var7.insert(16, "-");
					var7.insert(12, "-");
					var7.insert(8, "-");
					var4 = var7.toString();
				} else {
					var4 = "12345678-0000-0000-0000-123456789012";
				}
			}
		} catch (IOException var10) {
		}

		return var4;
	}

	@ObfInfo(name = "ap", desc = "(IIIZIZS)V", opaque = "256")
	public static void method9022(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var7 = (var1 + var0) / 2;
			int var8 = var0;
			Class75 var9 = Class90.field3782[var7];
			Class90.field3782[var7] = Class90.field3782[var1];
			Class90.field3782[var1] = var9;

			for (int var10 = var0; var10 < var1; ++var10) {
				if (Class75.method2223(Class90.field3782[var10], var9, var2, var3, var4, var5) <= 0) {
					Class75 var11 = Class90.field3782[var10];
					Class90.field3782[var10] = Class90.field3782[var8];
					Class90.field3782[var8++] = var11;
				}
			}

			Class90.field3782[var1] = Class90.field3782[var8];
			Class90.field3782[var8] = var9;
			method9022(var0, var8 - 1, var2, var3, var4, var5);
			method9022(var8 + 1, var1, var2, var3, var4, var5);
		}

	}
}
