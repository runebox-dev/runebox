import io.runebox.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "ce")
public class Class57 implements Comparator {
	@ObfInfo(name = "ak", desc = "Z")
	public boolean field426;

	@ObfInfo(name = "ak", desc = "(Lpm;Lpm;B)I", opaque = "0")
	public int method1072(Class403 var1, Class403 var2) {
		if (var2.field4624 == var1.field4624) {
			return 0;
		} else {
			if (this.field426) {
				if (Client.field557 == var1.field4624) {
					return -1;
				}

				if (Client.field557 == var2.field4624) {
					return 1;
				}
			}

			return var1.field4624 < var2.field4624 ? -1 : 1;
		}
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method1072((Class403)var1, (Class403)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfInfo(name = "lu", desc = "(Ldt;IIIIIIIII)V", opaque = "1075729854")
	public static void method1071(Class98 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Class259 var10 = var0.field1283;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.field1298 - 1 && var4 <= var0.field1282 - 1) {
			if (Client.field599 && var1 != var0.field1300) {
				return;
			}

			long var11 = 0L;
			boolean var13 = true;
			boolean var14 = false;
			boolean var15 = false;
			if (var2 == 0) {
				var11 = var10.method4951(var1, var3, var4);
			}

			if (var2 == 1) {
				var11 = var10.method4952(var1, var3, var4);
			}

			if (var2 == 2) {
				var11 = var10.method4953(var1, var3, var4);
			}

			if (var2 == 3) {
				var11 = var10.method4954(var1, var3, var4);
			}

			int var16;
			Class222 var17;
			if (var11 != 0L) {
				var16 = var10.method5003(var1, var3, var4, var11);
				int var28 = Class274.method2942(var11);
				int var29 = var16 & 31;
				int var30 = var16 >> 6 & 3;
				var17 = Class222.method4161(var28);
				if (var17 != null && var17.method4210()) {
					int var20 = var17.field2252;
					int var21 = var17.field2253;
					if (var30 == 1 || var30 == 3) {
						var20 = var17.field2253;
						var21 = var17.field2252;
					}

					int var22 = (var20 + var3) * 128;
					int var23 = (var21 + var4) * 128;
					int var18 = var3 * 128;
					int var19 = var4 * 128;
					int var24 = var17.field2245;
					int var25 = var17.field2273 * 128;
					int var26 = var17.field2283 * 128;
					if (var17.field2278 != null) {
						Class222 var27 = var17.method4181();
						if (var27 != null) {
							var24 = var27.field2245;
							var25 = var27.field2273 * 128;
							var26 = var27.field2283 * 128;
						}
					}

					Class77 var10000 = (Class77)null;

					for (Class77 var31 = (Class77)Class77.field976.method7482(); var31 != null; var31 = (Class77)Class77.field976.method7490()) {
						if (var1 == var31.field974 && var18 == var31.field973 && var31.field961 == var19 && var22 == var31.field962 && var23 == var31.field963 && var31.field966 == var24 && var31.field960 == var25 && var31.field959 == var26) {
							if (var31.field958 != null) {
								Client.field3984.method755(var31.field958);
								var31.field958 = null;
							}

							if (var31.field972 != null) {
								Client.field3984.method755(var31.field972);
								var31.field972 = null;
							}

							var31.method9277();
							break;
						}

						var10000 = (Class77)null;
					}
				}

				if (var2 == 0) {
					var10.method5074(var1, var3, var4);
					if (var17.field2282 != 0) {
						var0.field1284[var1].method4324(var3, var4, var29, var30, var17.field2255);
					}
				}

				if (var2 == 1) {
					var10.method4943(var1, var3, var4);
				}

				if (var2 == 2) {
					var10.method5033(var1, var3, var4);
					if (var3 + var17.field2252 > var0.field1298 - 1 || var17.field2252 + var4 > var0.field1282 - 1 || var3 + var17.field2253 > var0.field1298 - 1 || var4 + var17.field2253 > var0.field1282 - 1) {
						return;
					}

					if (var17.field2282 != 0) {
						var0.field1284[var1].method4308(var3, var4, var17.field2252, var17.field2253, var30, var17.field2255);
					}
				}

				if (var2 == 3) {
					var10.method4945(var1, var3, var4);
					if (1 == var17.field2282) {
						var0.field1284[var1].method4316(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var16 = var1;
				if (var1 < 3 && (var0.field1292[1][var3][var4] & 2) == 2) {
					var16 = var1 + 1;
				}

				Class333.method6307(var0, var1, var16, var3, var4, var5, var6, var7, var8, var0.field1284[var1]);
				var17 = Class222.method4161(var5);
				if (var17 != null && var17.method4210()) {
					Class77.method846(var16, var3, var4, var17, var6);
				}
			}
		}

	}
}
