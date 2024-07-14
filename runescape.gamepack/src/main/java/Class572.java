import io.runebox.ObfInfo;

@ObfInfo(name = "vz")
public class Class572 {
	@ObfInfo(name = "aq", desc = "[I")
	public static final int[] field5521;

	static {
		field5521 = new int[]{16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472};
	}

	@ObfInfo(owner = "so", name = "aq", desc = "(ILjava/lang/String;Lpe;IS)Lmb;", opaque = "16404")
	public static Class314 method8747(int var0, String var1, Class395 var2, int var3) {
		Class314 var5 = Class168.method3523(ClientPacket.field3377, Client.field678.field1482);
		var5.field3270.method9809(0);
		int var6 = var5.field3270.field5471;
		var5.field3270.method9809(var0);
		String var7 = var1.toLowerCase();
		int var8 = 0;
		byte[] var9 = null;
		if (var7.startsWith(Class367.field4037)) {
			var8 = 0;
			var1 = var1.substring(Class367.field4037.length());
		} else if (var7.startsWith(Class367.field4226)) {
			var8 = 1;
			var1 = var1.substring(Class367.field4226.length());
		} else if (var7.startsWith(Class367.field4212)) {
			var8 = 2;
			var1 = var1.substring(Class367.field4212.length());
		} else if (var7.startsWith(Class367.field4328)) {
			var8 = 3;
			var1 = var1.substring(Class367.field4328.length());
		} else if (var7.startsWith(Class367.field4229)) {
			var8 = 4;
			var1 = var1.substring(Class367.field4229.length());
		} else if (var7.startsWith(Class367.field4230)) {
			var8 = 5;
			var1 = var1.substring(Class367.field4230.length());
		} else if (var7.startsWith(Class367.field4231)) {
			var8 = 6;
			var1 = var1.substring(Class367.field4231.length());
		} else if (var7.startsWith(Class367.field4232)) {
			var8 = 7;
			var1 = var1.substring(Class367.field4232.length());
		} else if (var7.startsWith(Class367.field4233)) {
			var8 = 8;
			var1 = var1.substring(Class367.field4233.length());
		} else if (var7.startsWith(Class367.field4086)) {
			var8 = 9;
			var1 = var1.substring(Class367.field4086.length());
		} else if (var7.startsWith(Class367.field4268)) {
			var8 = 10;
			var1 = var1.substring(Class367.field4268.length());
		} else if (var7.startsWith(Class367.field4106)) {
			var8 = 11;
			var1 = var1.substring(Class367.field4106.length());
		} else if (var7.startsWith(Class367.field4237)) {
			var8 = 12;
			var1 = var1.substring(Class367.field4237.length());
		} else if (var7.startsWith(Class367.field4255)) {
			boolean var11 = true;
			boolean var12 = true;
			int var13 = Class367.field4255.length();
			int var14 = 0;
			byte[] var15 = new byte[8];

			byte[] var10;
			while (true) {
				int var16 = var13 + var14;
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
				var8 = var10.length + 12;
				var1 = var1.substring(Class367.field4255.length() + var10.length + 1);
			}
		}

		var7 = var1.toLowerCase();
		byte var19 = 0;
		if (var7.startsWith(Class367.field4239)) {
			var19 = 1;
			var1 = var1.substring(Class367.field4239.length());
		} else if (var7.startsWith(Class367.field4240)) {
			var19 = 2;
			var1 = var1.substring(Class367.field4240.length());
		} else if (var7.startsWith(Class367.field4241)) {
			var19 = 3;
			var1 = var1.substring(Class367.field4241.length());
		} else if (var7.startsWith(Class367.field4242)) {
			var19 = 4;
			var1 = var1.substring(Class367.field4242.length());
		} else if (var7.startsWith(Class367.field4243)) {
			var19 = 5;
			var1 = var1.substring(Class367.field4243.length());
		}

		var5.field3270.method9809(var8);
		var5.field3270.method9809(var19);
		if (var9 != null) {
			for (int var18 = 0; var18 < var9.length; ++var18) {
				var5.field3270.method9809(var9[var18]);
			}
		}

		Class381.method4044(var5.field3270, var1);
		if (Class386.field4537.method129() == var0) {
			var5.field3270.method9809(var3);
		}

		var5.field3270.method9874(var5.field3270.field5471 - var6);
		return var5;
	}
}
