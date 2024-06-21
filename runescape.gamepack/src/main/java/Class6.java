import io.runebox.ObfInfo;

public final class Class6 {
	@ObfInfo(name = "mp", desc = "(Ldv;IIIII)V", opaque = "-384431621")
	public static void method72(Class100 var0, int var1, int var2, int var3, int var4) {
		Class225 var6 = var0.field1314;
		if (Client.field629 < 400) {
			if (var6.field2351 != null) {
				var6 = var6.method4249();
			}

			if (var6 != null) {
				if (var6.field2354) {
					if (!var6.field2356 || var1 == Client.field662) {
						String var7 = var0.method2525();
						int var8;
						if (0 != var6.field2319 && var0.field1131 != 0) {
							var8 = var0.field1131 != -1 ? var0.field1131 : var6.field2319;
							var7 = var7 + Client.method6269(var8, Client.field107.field1020) + " " + Class113.field1423 + Class378.field4316 + var8 + Class113.field1428;
						}

						if (var6.field2344 && Client.field639) {
							Client.method3958(Class378.field4311, Class113.method8551(16776960) + var7, 1003, var1, var2, var3, -1, false, var4);
						}

						if (1 == Client.field702) {
							Client.method3958(Class378.field4310, Client.field503 + " " + Class113.field1424 + " " + Class113.method8551(16776960) + var7, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.field648) {
							if ((Client.field4587 & 2) == 2) {
								Client.method3958(Client.field651, Client.field578 + " " + Class113.field1424 + " " + Class113.method8551(16776960) + var7, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var8 = var6.field2344 && Client.field639 ? 2000 : 0;
							String[] var9 = var6.field2342;
							int var10;
							int var11;
							if (var9 != null) {
								for (var10 = 4; var10 >= 0; --var10) {
									if (var0.method2562(var10) && null != var9[var10] && !var9[var10].equalsIgnoreCase(Class378.field4201)) {
										var11 = 0;
										if (var10 == 0) {
											var11 = var8 + 9;
										}

										if (var10 == 1) {
											var11 = var8 + 10;
										}

										if (var10 == 2) {
											var11 = var8 + 11;
										}

										if (var10 == 3) {
											var11 = var8 + 12;
										}

										if (var10 == 4) {
											var11 = var8 + 13;
										}

										Client.method3958(var9[var10], Class113.method8551(16776960) + var7, var11, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var9 != null) {
								for (var10 = 4; var10 >= 0; --var10) {
									if (var0.method2562(var10) && var9[var10] != null && var9[var10].equalsIgnoreCase(Class378.field4201)) {
										short var12 = 0;
										if (Client.field517 != Class114.field1434) {
											if (Class114.field1432 == Client.field517 || Class114.field1431 == Client.field517 && var6.field2319 > Client.field107.field1020) {
												var12 = 2000;
											}

											var11 = 0;
											if (var10 == 0) {
												var11 = var12 + 9;
											}

											if (var10 == 1) {
												var11 = var12 + 10;
											}

											if (var10 == 2) {
												var11 = var12 + 11;
											}

											if (var10 == 3) {
												var11 = var12 + 12;
											}

											if (var10 == 4) {
												var11 = var12 + 13;
											}

											Client.method3958(var9[var10], Class113.method8551(16776960) + var7, var11, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var6.field2344 || !Client.field639) {
								Client.method3958(Class378.field4311, Class113.method8551(16776960) + var7, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}
}
