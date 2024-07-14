import io.runebox.ObfInfo;

@ObfInfo(name = "rx")
public class Class466 {
	@ObfInfo(name = "aj", desc = "(Lok;Lok;Ljava/lang/String;Ljava/lang/String;I)Lqh;", opaque = "-1354288392")
	public static Class424 method8514(Class375 var0, Class375 var1, String var2, String var3) {
		if (!var0.method7137(var2, var3)) {
			return null;
		} else {
			int var5 = var0.method7150(var2);
			int var6 = var0.method7209(var5, var3);
			Class424 var7;
			if (!Class554.method3253(var0, var5, var6)) {
				var7 = null;
			} else {
				byte[] var9 = var1.method7132(var5, var6);
				Class424 var8;
				if (var9 == null) {
					var8 = null;
				} else {
					Class424 var10 = new Class424(var9, Client.field1454, Client.field1561, Client.field5435, Client.field3491, Client.field5432, Client.field5434);
					Class554.method6571();
					var8 = var10;
				}

				var7 = var8;
			}

			return var7;
		}
	}

	@ObfInfo(name = "iv", desc = "(Lhg;IIZI)V", opaque = "-1393177413")
	public static void method8517(Class189 var0, int var1, int var2, boolean var3) {
		if (var0 != null) {
			if (var0.field2085 == 0) {
				if (!var3) {
					return;
				}

				Client.field786[Client.field782] = 0;
			} else {
				int var5 = (var1 - 64) / 128;
				int var6 = (var2 - 64) / 128;
				Client.field786[Client.field782] = (var5 << 16) + (var6 << 8) + var0.field2085;
			}

			Client.field574[Client.field782] = var0.field2087;
			Client.field784[Client.field782] = var0.field2084;
			Client.field785[Client.field782] = 0;
			Client.field788[Client.field782] = null;
			Client.field694[Client.field782] = var0.field2086;
			++Client.field782;
		}
	}

	@ObfInfo(name = "il", desc = "(Lnx;IIB)V", opaque = "-49")
	public static void method8515(Class362 var0, int var1, int var2) {
		if (Client.field780 == 0 || Client.field780 == 3) {
			if (!Client.field672 && (Class42.field227 == 1 || !Client.field911 && Class42.field227 == 4)) {
				Class361 var4 = var0.method6708(Client.field4644, true);
				if (var4 == null) {
					return;
				}

				int var5 = Class42.field230 - var1;
				int var6 = Class42.field222 - var2;
				if (var4.method6616(var5, var6)) {
					var5 -= var4.field3798 / 2;
					var6 -= var4.field3799 / 2;
					int var7 = Client.field615 & 2047;
					int var8 = Class274.field2804[var7];
					int var9 = Class274.field2805[var7];
					int var10 = var5 * var9 + var6 * var8 >> 11;
					int var11 = var6 * var9 - var5 * var8 >> 11;
					int var12 = Client.field4407.method1959() + var10 >> 7;
					int var13 = Client.field4407.method1966() - var11 >> 7;
					Class314 var14 = Class168.method3523(ClientPacket.field3415, Client.field678.field1482);
					var14.field3270.method9809(18);
					var14.field3270.method10010(Client.field5093.field1021 + var13);
					var14.field3270.method9809(Client.field754.method4191(82) ? (Client.field754.method4191(81) ? 2 : 1) : 0);
					var14.field3270.method9866(Client.field5093.field1019 + var12);
					var14.field3270.method9809(var5);
					var14.field3270.method9809(var6);
					var14.field3270.method9810(Client.field615);
					var14.field3270.method9809(57);
					var14.field3270.method9809(0);
					var14.field3270.method9809(0);
					var14.field3270.method9809(89);
					var14.field3270.method9810(Client.field170.field1266);
					var14.field3270.method9810(Client.field170.field1229);
					var14.field3270.method9809(63);
					Client.field678.method3013(var14);
					Client.field778 = var12;
					Client.field779 = var13;
				}
			}

		}
	}
}
