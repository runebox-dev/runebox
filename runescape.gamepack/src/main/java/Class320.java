import io.runebox.ObfInfo;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@ObfInfo(name = "mh")
public final class Class320 {
	@ObfInfo(name = "ag", desc = "Ljava/util/HashMap;")
	public static final HashMap field3348;

	static {
		field3348 = new HashMap();
		TimeZone var2;
		synchronized(field3348) {
			var2 = (TimeZone)field3348.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3348.put("Europe/London", var2);
			}
		}

		Calendar.getInstance(var2);
	}

	@ObfInfo(name = "kw", desc = "(ZLug;B)V", opaque = "1")
	public static void method6279(boolean var0, Class527 var1) {
		Client.field603 = var0;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.field603) {
			var1.method9969();
			int var3 = var1.method9869();
			var4 = var1.method9868();
			var5 = var1.method9997();
			Client.field1372 = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					Client.field1372[var6][var7] = var1.method9832();
				}
			}

			Client.field917 = new int[var5];
			Client.field1524 = new int[var5];
			Client.field1722 = new int[var5];
			Client.field2780 = new byte[var5][];
			Client.field4633 = new byte[var5][];
			var5 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
					var8 = (var6 << 8) + var7;
					Client.field917[var5] = var8;
					Client.field1524[var5] = Client.field1869.method7150("m" + var6 + "_" + var7);
					Client.field1722[var5] = Client.field1869.method7150("l" + var6 + "_" + var7);
					++var5;
				}
			}

			Client.method2648(var3, var4, true);
		} else {
			boolean var16 = var1.method9861() == 1;
			var4 = var1.method9981();
			var5 = var1.method9997();
			var6 = var1.method9997();
			var1.method9346();

			int var9;
			int var10;
			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = var1.method9347(1);
						if (var10 == 1) {
							Client.field604[var7][var8][var9] = var1.method9347(26);
						} else {
							Client.field604[var7][var8][var9] = -1;
						}
					}
				}
			}

			var1.method9348();
			Client.field1372 = new int[var6][4];

			for (var7 = 0; var7 < var6; ++var7) {
				for (var8 = 0; var8 < 4; ++var8) {
					Client.field1372[var7][var8] = var1.method9832();
				}
			}

			Client.field917 = new int[var6];
			Client.field1524 = new int[var6];
			Client.field1722 = new int[var6];
			Client.field2780 = new byte[var6][];
			Client.field4633 = new byte[var6][];
			var6 = 0;

			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = Client.field604[var7][var8][var9];
						if (var10 != -1) {
							int var11 = var10 >> 14 & 1023;
							int var12 = var10 >> 3 & 2047;
							int var13 = (var11 / 8 << 8) + var12 / 8;

							int var14;
							for (var14 = 0; var14 < var6; ++var14) {
								if (Client.field917[var14] == var13) {
									var13 = -1;
									break;
								}
							}

							if (var13 != -1) {
								Client.field917[var6] = var13;
								var14 = var13 >> 8 & 255;
								int var15 = var13 & 255;
								Client.field1524[var6] = Client.field1869.method7150("m" + var14 + "_" + var15);
								Client.field1722[var6] = Client.field1869.method7150("l" + var14 + "_" + var15);
								++var6;
							}
						}
					}
				}
			}

			Client.method2648(var5, var4, !var16);
		}

	}
}
