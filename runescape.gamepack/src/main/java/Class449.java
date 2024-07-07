import io.runebox.ObfInfo;

@ObfInfo(name = "rg")
public class Class449 {
	@ObfInfo(name = "nd", desc = "([Lnx;II)V", opaque = "-1883916637")
	public static void method8306(Class362[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			Class362 var4 = var0[var3];
			if (var4 != null && var1 == var4.field3832 && (!var4.field3896 || !Client.method3365(var4))) {
				if (0 == var4.field3815) {
					if (!var4.field3896 && Client.method3365(var4) && Client.field1905 != var4) {
						continue;
					}

					method8306(var0, var4.field3812);
					if (var4.field3950 != null) {
						method8306(var4.field3950, var4.field3812);
					}

					Class100 var5 = (Class100)Client.field698.method9439((long)var4.field3812);
					if (var5 != null) {
						Class225.method4334(var5.field1225);
					}
				}

				if (6 == var4.field3815) {
					int var6;
					if (-1 != var4.field3861 || var4.field3918 != -1) {
						boolean var9 = Client.method9305(var4);
						if (var9) {
							var6 = var4.field3918;
						} else {
							var6 = var4.field3861;
						}

						if (var6 != -1) {
							Class217 var7 = Class344.method6474(var6);
							if (!var7.method4132()) {
								for (var4.field3926 += Client.field831; var4.field3926 > var7.field2349[var4.field3853]; Class490.method8827(var4)) {
									var4.field3926 -= var7.field2349[var4.field3853];
									++var4.field3853;
									if (var4.field3853 >= var7.field2355.length) {
										var4.field3853 -= var7.field2359;
										if (var4.field3853 < 0 || var4.field3853 >= var7.field2355.length) {
											var4.field3853 = 0;
										}
									}
								}
							} else {
								var4.field3853 += Client.field831;
								int var8 = var7.method4141();
								if (var4.field3853 >= var8) {
									var4.field3853 -= var7.field2359;
									if (var4.field3853 < 0 || var4.field3853 >= var8) {
										var4.field3853 = 0;
									}
								}

								Class490.method8827(var4);
							}
						}
					}

					if (var4.field3925 != 0 && !var4.field3896) {
						int var10 = var4.field3925 >> 16;
						var6 = var4.field3925 << 16 >> 16;
						var10 *= Client.field831;
						var6 *= Client.field831;
						var4.field3865 = var10 + var4.field3865 & 2047;
						var4.field3866 = var6 + var4.field3866 & 2047;
						Class490.method8827(var4);
					}
				}
			}
		}

	}
}
