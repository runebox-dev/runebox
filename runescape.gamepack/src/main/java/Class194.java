import io.runebox.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "hl")
public class Class194 extends Class516 {
	@ObfInfo(name = "aq", desc = "Lmo;")
	public static Class327 field2113;

	static {
		field2113 = new Class327(64);
	}

	@ObfInfo(name = "kl", desc = "(Lde;I)V", opaque = "155626944")
	public static void method3886(Class83 var0) {
		int var2 = var0.field1030 / 8;
		int var3 = var0.field1018 / 8;
		boolean var4 = false;
		Client.method301(false);
		var4 = true;

		int var5;
		for (var5 = 0; var5 < Client.field4946.length; ++var5) {
			if (Client.field209[var5] != -1 && Client.field4946[var5] == null) {
				Client.field4946[var5] = Client.field1869.method7132(Client.field209[var5], 0);
				if (Client.field4946[var5] == null) {
					var4 = false;
				}
			}

			if (Client.field1684[var5] != -1 && Client.field4542[var5] == null) {
				Client.field4542[var5] = Client.field1869.method7170(Client.field1684[var5], 0, Client.field856[var5]);
				if (Client.field4542[var5] == null) {
					var4 = false;
				}
			}
		}

		if (var4) {
			Client.method301(false);
			var4 = true;

			for (var5 = 0; var5 < Client.field4946.length; ++var5) {
				byte[] var6 = Client.field4542[var5];
				if (var6 != null) {
					byte var7 = 10;
					byte var8 = 10;
					var4 &= Class16.method217(var6, var7, var8);
				}
			}

			if (var4) {
				int var18;
				for (var5 = 0; var5 < 4; ++var5) {
					for (var18 = 0; var18 < var0.field1023[var5].length; ++var18) {
						Arrays.fill(var0.field1023[var5][var18], (byte)0);
					}
				}

				Client.method3564();
				Class97.method4118();
				Class55.method1936();
				Client.method301(true);

				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var14;
				int var19;
				for (var5 = 0; var5 < 4; ++var5) {
					Client.method3564();

					for (var18 = 0; var18 < var2; ++var18) {
						for (var19 = 0; var19 < var3; ++var19) {
							boolean var20 = false;
							var9 = Client.field709[var5][var18][var19];
							if (var9 != -1) {
								var10 = var9 >> 24 & 3;
								var11 = var9 >> 1 & 3;
								var12 = var9 >> 14 & 1023;
								var13 = var9 >> 3 & 2047;
								var14 = (var12 / 8 << 8) + var13 / 8;

								for (int var15 = 0; var15 < Client.field2708.length; ++var15) {
									if (Client.field2708[var15] == var14 && Client.field4946[var15] != null) {
										int var16 = (var12 - var18) * 8;
										int var17 = (var13 - var19) * 8;
										Class97.method4130(var0, Client.field4946[var15], var5, var18 * 8, var19 * 8, var10, (var12 & 7) * 8, (var13 & 7) * 8, var11, var16, var17);
										var20 = true;
										break;
									}
								}
							}

							if (!var20) {
								Class97.method1170(var0.field1025, var5, var18 * 8, var19 * 8);
							}
						}
					}
				}

				for (var5 = 0; var5 < 13; ++var5) {
					for (var18 = 0; var18 < 13; ++var18) {
						var19 = Client.field709[0][var5][var18];
						if (var19 == -1) {
							Class97.method5780(var0, var5 * 8, var18 * 8, 8, 8);
						}
					}
				}

				Client.method301(true);

				for (var5 = 0; var5 < 4; ++var5) {
					Client.method3564();

					for (var18 = 0; var18 < var2; ++var18) {
						for (var19 = 0; var19 < var3; ++var19) {
							int var21 = Client.field709[var5][var18][var19];
							if (var21 != -1) {
								var9 = var21 >> 24 & 3;
								var10 = var21 >> 1 & 3;
								var11 = var21 >> 14 & 1023;
								var12 = var21 >> 3 & 2047;
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (var14 = 0; var14 < Client.field2708.length; ++var14) {
									if (Client.field2708[var14] == var13 && Client.field4542[var14] != null) {
										Class97.method2572(var0, Client.field4542[var14], var5, var18 * 8, var19 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10);
										break;
									}
								}
							}
						}
					}
				}

				Client.method301(true);
				Client.method3564();
				Class97.method888(var0);
				Client.method301(true);
				Class197.field2128.method6332();
				Client.method3564();
				Class337.method6392();
				Client.field536 = false;
			}
		}
	}
}
