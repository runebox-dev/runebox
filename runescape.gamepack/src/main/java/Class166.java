import io.runebox.ObfInfo;

@ObfInfo(name = "gj")
public class Class166 extends Class181 {
	@ObfInfo(name = "al", desc = "B")
	public byte field1825;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -735242945)
	public int field1824;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1460325249)
	public int field1828;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public String field1826;
	// $FF: synthetic field
	public final Class180 this$0;

	public Class166(Class180 var1) {
		this.this$0 = var1;
		this.field1824 = -1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3087(Class521 var1) {
		var1.method9405();
		this.field1824 = var1.method9407();
		this.field1825 = var1.method9406();
		this.field1828 = var1.method9407();
		var1.method9411();
		this.field1826 = var1.method9415();
		var1.method9405();
	}

	@ObfInfo(name = "al", desc = "(Lgo;I)V")
	public void method3089(Class171 var1) {
		Class140 var3 = (Class140)var1.field1854.get(this.field1824);
		var3.field1602 = this.field1825;
		var3.field1607 = this.field1828;
		var3.field1601 = new Class567(this.field1826);
	}

	@ObfInfo(name = "ak", desc = "(ILjava/lang/String;Lpl;II)Lmd;", opaque = "1664267168")
	public static Class316 method3512(int var0, String var1, Class402 var2, int var3) {
		Class316 var5 = Class316.method3908(Class315.field3352, Client.field548.field1446);
		var5.field3374.method9388(0);
		int var6 = var5.field3374.field5219;
		var5.field3374.method9388(var0);
		String var7 = var1.toLowerCase();
		int var8 = 0;
		byte[] var9 = null;
		if (var7.startsWith(Class378.field4336)) {
			var8 = 0;
			var1 = var1.substring(Class378.field4336.length());
		} else if (var7.startsWith(Class378.field4337)) {
			var8 = 1;
			var1 = var1.substring(Class378.field4337.length());
		} else if (var7.startsWith(Class378.field4148)) {
			var8 = 2;
			var1 = var1.substring(Class378.field4148.length());
		} else if (var7.startsWith(Class378.field4339)) {
			var8 = 3;
			var1 = var1.substring(Class378.field4339.length());
		} else if (var7.startsWith(Class378.field4340)) {
			var8 = 4;
			var1 = var1.substring(Class378.field4340.length());
		} else if (var7.startsWith(Class378.field4294)) {
			var8 = 5;
			var1 = var1.substring(Class378.field4294.length());
		} else if (var7.startsWith(Class378.field4342)) {
			var8 = 6;
			var1 = var1.substring(Class378.field4342.length());
		} else if (var7.startsWith(Class378.field4343)) {
			var8 = 7;
			var1 = var1.substring(Class378.field4343.length());
		} else if (var7.startsWith(Class378.field4344)) {
			var8 = 8;
			var1 = var1.substring(Class378.field4344.length());
		} else if (var7.startsWith(Class378.field4345)) {
			var8 = 9;
			var1 = var1.substring(Class378.field4345.length());
		} else if (var7.startsWith(Class378.field4449)) {
			var8 = 10;
			var1 = var1.substring(Class378.field4449.length());
		} else if (var7.startsWith(Class378.field4257)) {
			var8 = 11;
			var1 = var1.substring(Class378.field4257.length());
		} else if (var7.startsWith(Class378.field4331)) {
			var8 = 12;
			var1 = var1.substring(Class378.field4331.length());
		} else if (var7.startsWith(Class378.field4349)) {
			boolean var11 = true;
			boolean var12 = true;
			int var13 = Class378.field4349.length();
			int var14 = 0;
			byte[] var15 = new byte[8];

			byte[] var10;
			while (true) {
				int var16 = var14 + var13;
				if (var16 >= var7.length()) {
					var10 = null;
					break;
				}

				char var17 = var7.charAt(var16);
				if (var17 == ':') {
					if (var14 == 0) {
						var10 = null;
					} else {
						byte[] var20 = new byte[var14];
						System.arraycopy(var15, 0, var20, 0, var14);
						var10 = var20;
					}
					break;
				}

				if (var15.length == var14) {
					var10 = null;
					break;
				}

				if (var17 >= '0' && var17 <= '9') {
					var17 = (char)(var17 - '0');
				} else {
					if (var17 < 'a' || var17 > 'z') {
						var10 = null;
						break;
					}

					var17 = (char)(var17 - 'W');
				}

				var15[var14++] = (byte)var17;
			}

			var9 = var10;
			if (var10 != null) {
				var8 = 12 + var10.length;
				var1 = var1.substring(Class378.field4349.length() + var10.length + 1);
			}
		}

		var7 = var1.toLowerCase();
		byte var19 = 0;
		if (var7.startsWith(Class378.field4245)) {
			var19 = 1;
			var1 = var1.substring(Class378.field4245.length());
		} else if (var7.startsWith(Class378.field4291)) {
			var19 = 2;
			var1 = var1.substring(Class378.field4291.length());
		} else if (var7.startsWith(Class378.field4170)) {
			var19 = 3;
			var1 = var1.substring(Class378.field4170.length());
		} else if (var7.startsWith(Class378.field4447)) {
			var19 = 4;
			var1 = var1.substring(Class378.field4447.length());
		} else if (var7.startsWith(Class378.field4354)) {
			var19 = 5;
			var1 = var1.substring(Class378.field4354.length());
		}

		var5.field3374.method9388(var8);
		var5.field3374.method9388(var19);
		if (var9 != null) {
			for (int var18 = 0; var18 < var9.length; ++var18) {
				var5.field3374.method9388(var9[var18]);
			}
		}

		Class134.method3084(var5.field3374, var1);
		if (Class379.field4459.method175() == var0) {
			var5.field3374.method9388(var3);
		}

		var5.field3374.method9386(var5.field3374.field5219 - var6);
		return var5;
	}
}
