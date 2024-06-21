import io.runebox.ObfInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ObfInfo(name = "tf")
public class Class500 extends Class506 {
	@ObfInfo(name = "bl", desc = "Z")
	public boolean field5114;
	@ObfInfo(name = "bp", desc = "Z")
	public boolean field5118;
	@ObfInfo(name = "cw", desc = "I", intMultiplier = 1954892853)
	public int field5101;
	@ObfInfo(name = "bx", desc = "I", intMultiplier = -1144840647)
	public int field5105;
	@ObfInfo(name = "bw", desc = "I", intMultiplier = -1333731967)
	public int field5106;
	@ObfInfo(name = "be", desc = "I", intMultiplier = 48225155)
	public int field5108;
	@ObfInfo(name = "bg", desc = "I", intMultiplier = -1130035443)
	public int field5109;
	@ObfInfo(name = "bu", desc = "I", intMultiplier = 2075561049)
	public int field5110;
	@ObfInfo(name = "bk", desc = "I", intMultiplier = -678989481)
	public int field5112;
	@ObfInfo(name = "by", desc = "I", intMultiplier = 567706703)
	public int field5113;
	@ObfInfo(name = "bv", desc = "I", intMultiplier = 1274393823)
	public int field5116;
	@ObfInfo(name = "bm", desc = "I", intMultiplier = 1481322487)
	public int field5121;
	@ObfInfo(name = "ba", desc = "I", intMultiplier = 715881903)
	public int field5122;
	@ObfInfo(name = "bh", desc = "I", intMultiplier = -1055521719)
	public int field5123;
	@ObfInfo(name = "bb", desc = "I", intMultiplier = -1975114093)
	public int field5125;
	@ObfInfo(name = "cp", desc = "I", intMultiplier = -40810841)
	public int field5129;
	@ObfInfo(name = "br", desc = "I", intMultiplier = 2109912297)
	public int field5130;
	@ObfInfo(name = "ch", desc = "[I")
	public int[] field5128;
	@ObfInfo(name = "bq", desc = "Ljava/lang/String;")
	public String field5104;
	@ObfInfo(name = "cd", desc = "Ljava/lang/String;")
	public String field5107;
	@ObfInfo(name = "bj", desc = "Ljava/lang/String;")
	public String field5119;
	@ObfInfo(name = "bc", desc = "Ljava/lang/String;")
	public String field5120;
	@ObfInfo(name = "bz", desc = "Ljava/lang/String;")
	public String field5124;
	@ObfInfo(name = "ck", desc = "Ljava/lang/String;")
	public String field5126;
	@ObfInfo(name = "cn", desc = "Ljava/lang/String;")
	public String field5127;
	@ObfInfo(name = "cs", desc = "Ljava/lang/String;")
	public String field5131;

	public Class500(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27) {
		this.field5128 = new int[3];
		this.field5106 = var1;
		this.field5114 = var2;
		this.field5108 = var3;
		this.field5109 = var4;
		this.field5110 = var5;
		this.field5123 = var6;
		this.field5112 = var7;
		this.field5118 = var8;
		this.field5130 = var9;
		this.field5105 = var10;
		this.field5116 = var11;
		this.field5121 = var12;
		this.field5104 = var13;
		this.field5119 = var14;
		this.field5120 = var15;
		this.field5124 = var16;
		this.field5122 = var17;
		this.field5125 = var18;
		this.field5113 = var19;
		this.field5101 = var20;
		this.field5126 = var21;
		this.field5127 = var22;
		this.field5128 = var23;
		this.field5129 = var24;
		this.field5107 = var25;
		this.field5131 = var26;
	}

	@ObfInfo(name = "ak", desc = "(Lua;B)V", opaque = "31")
	public void method9218(Class521 var1) {
		var1.method9388(9);
		var1.method9388(this.field5106);
		var1.method9388(this.field5114 ? 1 : 0);
		var1.method9389(this.field5108);
		var1.method9388(this.field5109);
		var1.method9388(this.field5110);
		var1.method9388(this.field5123);
		var1.method9388(this.field5112);
		var1.method9388(this.field5118 ? 1 : 0);
		var1.method9389(this.field5130);
		var1.method9388(this.field5105);
		var1.method9390(this.field5116);
		var1.method9389(this.field5121);
		var1.method9396(this.field5104);
		var1.method9396(this.field5119);
		var1.method9396(this.field5120);
		var1.method9396(this.field5124);
		var1.method9388(this.field5125);
		var1.method9389(this.field5122);
		var1.method9396(this.field5126);
		var1.method9396(this.field5127);
		var1.method9388(this.field5113);
		var1.method9388(this.field5101);

		for (int var3 = 0; var3 < this.field5128.length; ++var3) {
			var1.method9590(this.field5128[var3]);
		}

		var1.method9590(this.field5129);
		var1.method9396(this.field5107);
		var1.method9396(this.field5131);
	}

	@ObfInfo(name = "al", desc = "(B)I")
	public int method9217() {
		byte var2 = 39;
		int var3 = Class521.method6668(this.field5104) + var2;
		var3 += Class521.method6668(this.field5119);
		var3 += Class521.method6668(this.field5120);
		var3 += Class521.method6668(this.field5124);
		var3 += Class521.method6668(this.field5126);
		var3 += Class521.method6668(this.field5127);
		var3 += Class521.method6668(this.field5107);
		var3 += Class521.method6668(this.field5131);
		return var3;
	}

	@ObfInfo(name = "aj", desc = "(II)Ljava/lang/String;", opaque = "813297285")
	public String method9219(int var1) {
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
}
