import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class500 extends Class506 {
	public boolean field5114;
	public boolean field5118;
	public int field5101;
	public int field5105;
	public int field5106;
	public int field5108;
	public int field5109;
	public int field5110;
	public int field5112;
	public int field5113;
	public int field5116;
	public int field5121;
	public int field5122;
	public int field5123;
	public int field5125;
	public int field5129;
	public int field5130;
	public int[] field5128;
	public String field5104;
	public String field5107;
	public String field5119;
	public String field5120;
	public String field5124;
	public String field5126;
	public String field5127;
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
