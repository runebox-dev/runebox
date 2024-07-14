import io.runebox.ObfInfo;

@ObfInfo(name = "fy")
public class Class155 extends Class157 {
	@ObfInfo(name = "ad", desc = "B")
	public byte field1737;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -298078541)
	public int field1738;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -8381223)
	public int field1740;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field1739;
	// $FF: synthetic field
	public final Class165 this$0;

	public Class155(Class165 var1) {
		this.this$0 = var1;
		this.field1738 = -1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;I)V")
	public void method3152(Class562 var1) {
		this.field1738 = var1.method9997();
		this.field1737 = var1.method9955();
		this.field1740 = var1.method9997();
		var1.method9833();
		this.field1739 = var1.method9837();
	}

	@ObfInfo(name = "ad", desc = "(Lgj;I)V")
	public void method3149(Class166 var1) {
		Class131 var3 = (Class131)var1.field1808.get(this.field1738);
		var3.field1530 = this.field1737;
		var3.field1527 = this.field1740;
		var3.field1528 = new Class561(this.field1739);
	}

	@ObfInfo(name = "kk", desc = "(Lmd;S)V", opaque = "254")
	public static void method3334(Class316 var0) {
		Class527 var2 = Client.field678.field1487;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		if (Class316.field3312 == var0) {
			var3 = var2.method9859();
			var4 = var2.method9861() & 31;
			var5 = var2.method9861();
			var6 = var2.method9859();
			var7 = (var6 >> 4 & 7) + Client.field1556;
			var8 = (var6 & 7) + Client.field1312;
			var9 = var2.method9859();
			var10 = var2.method9868();
			if (var7 >= 0 && var8 >= 0 && var7 < Client.field94.field1030 && var8 < Client.field94.field1018) {
				var11 = var4 + 1;
				if (Client.field170.field1242[0] >= var7 - var11 && Client.field170.field1242[0] <= var7 + var11 && Client.field170.field1284[0] >= var8 - var11 && Client.field170.field1284[0] <= var8 + var11 && Client.field1474.method2508() != 0 && var3 > 0 && Client.field782 < 50) {
					Client.field574[Client.field782] = var10;
					Client.field788[Client.field782] = null;
					Client.field786[Client.field782] = (var7 << 16) + (var8 << 8) + var4;
					Client.field784[Client.field782] = var3;
					Client.field785[Client.field782] = var5;
					Client.field694[Client.field782] = var9;
					++Client.field782;
				}
			}

		} else {
			if (Class316.field3315 == var0) {
				var3 = var2.method9860();
				var4 = var2.method9860();
				var5 = (var4 >> 4 & 7) + Client.field1556;
				var6 = (var4 & 7) + Client.field1312;
				var7 = var2.method9997();
				var8 = Client.field94.field1016;
				if (var5 >= 0 && var6 >= 0 && var5 < Client.field94.field1030 && var6 < Client.field94.field1018) {
					Class408 var28 = Client.field94.field1032[var8][var5][var6];
					if (var28 != null) {
						for (Class119 var29 = (Class119)var28.method7526(); var29 != null; var29 = (Class119)var28.method7511()) {
							if ((var7 & 32767) == var29.field1439) {
								var29.method2960(var3);
								break;
							}
						}
					}

					if (var5 >= 0 && var6 >= 0 && var5 < Client.field94.field1030 && var6 < Client.field94.field1018) {
						var10 = Client.field606 == -1 ? Client.field94.field1016 : Client.field606;
						Client.method5807(var10, var5, var6, var7, var3);
					}

					return;
				}
			}

			if (Class316.field3311 == var0) {
				var3 = var2.method9902();
				var4 = (var3 >> 4 & 7) + Client.field1556;
				var5 = (var3 & 7) + Client.field1312;
				var6 = var2.method9860();
				var7 = var6 >> 2;
				var8 = var6 & 3;
				var9 = Client.field605[var7];
				if (var4 >= 0 && var5 >= 0 && var4 < Client.field94.field1030 && var5 < Client.field94.field1018) {
					var10 = Client.field606 == -1 ? Client.field94.field1016 : Client.field606;
					Client.method438(Client.field94, var10, var4, var5, var9, -1, var7, var8, 31, 0, -1);
				}

			} else if (Class316.field3318 == var0) {
				var3 = var2.method9859();
				var4 = (var3 >> 4 & 7) + Client.field1556;
				var5 = (var3 & 7) + Client.field1312;
				var6 = var2.method9860();
				var7 = var2.method9869();
				var8 = var2.method9868();
				if (var4 >= 0 && var5 >= 0 && var4 < Client.field94.field1030 && var5 < Client.field94.field1018) {
					var4 = Class371.method7108(var4);
					var5 = Class371.method7108(var5);
					var9 = Client.field606 == -1 ? Client.field94.field1016 : Client.field606;
					Class54 var27 = new Class54(var8, var9, var4, var5, Client.method3531(Client.field94, var4, var5, var9) - var6, var7, Client.field541);
					Client.field94.field1035.method7506(var27);
				}

			} else if (Class316.field3316 == var0) {
				var3 = var2.method9883();
				var4 = var2.method9997();
				var5 = var2.method9832();
				var6 = var2.method9860();
				var7 = (var6 >> 4 & 7) + Client.field1556;
				var8 = (var6 & 7) + Client.field1312;
				if (var7 >= 0 && var8 >= 0 && var7 < Client.field94.field1030 && var8 < Client.field94.field1018) {
					var9 = Client.field606 == -1 ? Client.field94.field1016 : Client.field606;
					Class41.method573(var9, var7, var8, var4, var5, var3);
				}

			} else {
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				if (Class316.field3320 == var0) {
					byte var22 = var2.method9955();
					var4 = var2.method9868();
					byte var24 = var2.method9863();
					var6 = var2.method9831();
					var7 = var2.method9902();
					var8 = var2.method9861();
					var9 = (var8 >> 4 & 7) + Client.field1556;
					var10 = (var8 & 7) + Client.field1312;
					var11 = var2.method9902() * 4;
					var12 = var2.method9981();
					var13 = var2.method9869();
					var14 = var2.method9997();
					var15 = var2.method9860() * 4;
					var16 = var2.method9876();
					var3 = var22 + var9;
					var5 = var24 + var10;
					if (var9 >= 0 && var10 >= 0 && var9 < Client.field94.field1030 && var10 < Client.field94.field1018 && var3 >= 0 && var5 >= 0 && var3 < Client.field94.field1030 && var5 < Client.field94.field1018 && var12 != 65535) {
						var17 = Client.field606 == -1 ? Client.field94.field1016 : Client.field606;
						Client.method4248(var17, var9, var10, var3, var5, var6, var12, var11, var15, var13, var4, var7, var14, var16);
					}

				} else if (Class316.field3314 == var0) {
					var3 = var2.method9860();
					var4 = var3 >> 2;
					var5 = var3 & 3;
					var6 = Client.field605[var4];
					var7 = var2.method9861();
					var8 = var2.method9861();
					var9 = (var8 >> 4 & 7) + Client.field1556;
					var10 = (var8 & 7) + Client.field1312;
					var11 = var2.method9869();
					if (var9 >= 0 && var10 >= 0 && var9 < Client.field94.field1030 && var10 < Client.field94.field1018) {
						var12 = Client.field606 == -1 ? Client.field94.field1016 : Client.field606;
						Client.method438(Client.field94, var12, var9, var10, var6, var11, var4, var5, var7, 0, -1);
					}

				} else if (Class316.field3321 == var0) {
					var3 = var2.method9860();
					var4 = (var3 >> 4 & 7) + Client.field1556;
					var5 = (var3 & 7) + Client.field1312;
					var6 = var2.method9855();
					var7 = var2.method9981();
					var8 = Client.field94.field1016;
					if (0 <= var4 && var4 < 104 && 0 <= var5 && var5 < 104) {
						var9 = Client.field606 == -1 ? var8 : Client.field606;
						Client.method5101(var9, var4, var5, var7, var6);
					}

				} else {
					if (Class316.field3319 == var0) {
						var3 = var2.method9997();
						byte var20 = var2.method9864();
						var5 = var2.method9997();
						byte var23 = var2.method9863();
						byte var25 = var2.method10018();
						byte var26 = var2.method9863();
						var9 = var2.method9861();
						var10 = (var9 >> 4 & 7) + Client.field1556;
						var11 = (var9 & 7) + Client.field1312;
						var12 = var2.method9861();
						var13 = var12 >> 2;
						var14 = var12 & 3;
						var15 = Client.field605[var13];
						var16 = var2.method9981();
						var17 = var2.method9869();
						Class80 var18;
						if (Client.field732 == var17) {
							var18 = Client.field170;
						} else {
							var18 = Client.field94.field1024[var17];
						}

						if (var18 != null) {
							int var19 = Client.field606 == -1 ? Client.field94.field1016 : Client.field606;
							Class370.method7105(var19, var10, var11, var13, var14, var15, var3, var16, var5, var23, var26, var20, var25, var18);
						}
					}

					if (Class316.field3317 == var0) {
						var3 = var2.method9860();
						var4 = var3 >> 2;
						var5 = var3 & 3;
						var6 = Client.field605[var4];
						var7 = var2.method9860();
						var8 = (var7 >> 4 & 7) + Client.field1556;
						var9 = (var7 & 7) + Client.field1312;
						var10 = var2.method9868();
						if (0 <= var8 && var8 < 103 && 0 <= var9 && var9 < 103) {
							var11 = Client.field606 == -1 ? Client.field94.field1016 : Client.field606;
							Class103 var30 = Client.method8467(Client.field94, var11, var8, var9, var6);
							if (var30 != null) {
								Class197 var31 = Class197.method61(var30.field1319);
								if (var31.field2176) {
									var30.field1325 = var10;
									return;
								}
							}

							boolean var32 = Class127.method3033(var11, var8, var9, var4, var5, var6, var10);
							if (var32) {
								return;
							}

							if (var30 != null) {
								var30.field1325 = var10;
							}
						}

					} else if (Class316.field3313 == var0) {
						var3 = var2.method9868();
						boolean var21 = var2.method9861() == 1;
						var5 = var2.method9869();
						var6 = var2.method9859();
						var7 = var2.method9859();
						var8 = var2.method9997();
						var9 = var2.method9883();
						var10 = var2.method9902();
						var11 = (var10 >> 4 & 7) + Client.field1556;
						var12 = (var10 & 7) + Client.field1312;
						if (var11 >= 0 && var12 >= 0 && var11 < Client.field94.field1030 && var12 < Client.field94.field1018) {
							var13 = Client.field606 == -1 ? Client.field94.field1016 : Client.field606;
							Client.method804(var13, var11, var12, var5, var9, var6, var8, var3, var7, var21);
						}

					}
				}
			}
		}
	}
}
