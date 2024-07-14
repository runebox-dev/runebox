import io.runebox.ObfInfo;

@ObfInfo(name = "sk")
public class Class479 implements Comparable {
	@ObfInfo(name = "ak", desc = "Lvo;")
	public Class561 field4982;
	@ObfInfo(name = "ag", desc = "Lvo;")
	public Class561 field4983;

	@ObfInfo(name = "bj", desc = "(I)Lvo;")
	public Class561 method8693() {
		return this.field4983;
	}

	@ObfInfo(name = "be", desc = "(I)Ljava/lang/String;", opaque = "780168639")
	public String method8694() {
		return this.field4983 == null ? "" : this.field4983.method9789();
	}

	@ObfInfo(name = "bm", desc = "(I)Ljava/lang/String;", opaque = "1161546092")
	public String method8695() {
		return this.field4982 == null ? "" : this.field4982.method9789();
	}

	@ObfInfo(name = "bo", desc = "(Lvo;Lvo;I)V")
	public void method8696(Class561 var1, Class561 var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.field4983 = var1;
			this.field4982 = var2;
		}
	}

	@ObfInfo(name = "ad", desc = "(Lsk;B)I")
	public int method8393(Class479 var1) {
		return this.field4983.method9799(var1.field4983);
	}

	public int compareTo(Object var1) {
		return this.method8393((Class479)var1);
	}

	@ObfInfo(name = "jy", desc = "(Lde;IIIII)V", opaque = "-546288790")
	public static void method8710(Class83 var0, int var1, int var2, int var3, int var4) {
		Client.field632 = 0;
		boolean var6 = false;
		int var7 = -1;
		int var8 = -1;
		int var9 = var0.field1017.field1402;
		int[] var10 = var0.field1017.field1407;

		int var11;
		for (var11 = 0; var11 < var0.field1027 + var9; ++var11) {
			Object var12;
			if (var11 < var9) {
				var12 = var0.field1024[var10[var11]];
				if (var10[var11] == Client.field556) {
					var6 = true;
					var7 = var11;
					continue;
				}

				if (Client.field170 == var12) {
					var8 = var11;
					continue;
				}
			} else {
				var12 = var0.field1013[var0.field1028[var11 - var9]];
			}

			Client.method2854(var0, (Class101)var12, var11, var1, var2, var3, var4);
		}

		if (Client.field577 && var8 != -1) {
			Client.method2854(var0, Client.field170, var8, var1, var2, var3, var4);
		}

		if (var6) {
			Client.method2854(var0, var0.field1024[Client.field556], var7, var1, var2, var3, var4);
		}

		for (var11 = 0; var11 < Client.field632; ++var11) {
			int var23 = Client.field634[var11];
			int var13 = Client.field635[var11];
			int var14 = Client.field693[var11];
			int var15 = Client.field636[var11];
			boolean var16 = true;

			while (var16) {
				var16 = false;

				for (int var17 = 0; var17 < var11; ++var17) {
					if (var13 + 2 > Client.field635[var17] - Client.field636[var17] && var13 - var15 < Client.field635[var17] + 2 && var23 - var14 < Client.field693[var17] + Client.field634[var17] && var23 + var14 > Client.field634[var17] - Client.field693[var17] && Client.field635[var17] - Client.field636[var17] < var13) {
						var13 = Client.field635[var17] - Client.field636[var17];
						var16 = true;
					}
				}
			}

			Client.field644 = Client.field634[var11];
			Client.field611 = Client.field635[var11] = var13;
			String var24 = Client.field642[var11];
			if (Client.field637 == 0) {
				int var18 = 16776960;
				if (Client.field638[var11] < 6) {
					var18 = Client.field759[Client.field638[var11]];
				}

				if (Client.field638[var11] == 6) {
					var18 = Client.field643 % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field638[var11] == 7) {
					var18 = Client.field643 % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field638[var11] == 8) {
					var18 = Client.field643 % 20 < 10 ? '\ub000' : 8454016;
				}

				int var19;
				if (Client.field638[var11] == 9) {
					var19 = 150 - Client.field641[var11];
					if (var19 < 50) {
						var18 = var19 * 1280 + 16711680;
					} else if (var19 < 100) {
						var18 = 16776960 - (var19 - 50) * 327680;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 65280;
					}
				}

				if (Client.field638[var11] == 10) {
					var19 = 150 - Client.field641[var11];
					if (var19 < 50) {
						var18 = var19 * 5 + 16711680;
					} else if (var19 < 100) {
						var18 = 16711935 - (var19 - 50) * 327680;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 327680 + 255 - (var19 - 100) * 5;
					}
				}

				if (Client.field638[var11] == 11) {
					var19 = 150 - Client.field641[var11];
					if (var19 < 50) {
						var18 = 16777215 - var19 * 327685;
					} else if (var19 < 100) {
						var18 = (var19 - 50) * 327685 + 65280;
					} else if (var19 < 150) {
						var18 = 16777215 - (var19 - 100) * 327680;
					}
				}

				int var20;
				if (Client.field638[var11] == 12 && Client.field566[var11] == null) {
					var19 = var24.length();
					Client.field566[var11] = new int[var19];

					for (var20 = 0; var20 < var19; ++var20) {
						int var21 = (int)((float)var20 / (float)var19 * 64.0F);
						int var22 = var21 << 10 | 896 | 64;
						Client.field566[var11][var20] = Class501.field5065[var22];
					}
				}

				if (Client.field639[var11] == 0) {
					Client.field2002.method8138(var24, Client.field644 + var1, Client.field611 + var2, var18, 0, Client.field566[var11]);
				}

				if (Client.field639[var11] == 1) {
					Client.field2002.method8151(var24, Client.field644 + var1, Client.field611 + var2, var18, 0, Client.field643, Client.field566[var11]);
				}

				if (Client.field639[var11] == 2) {
					Client.field2002.method8152(var24, Client.field644 + var1, Client.field611 + var2, var18, 0, Client.field643, Client.field566[var11]);
				}

				if (Client.field639[var11] == 3) {
					Client.field2002.method8153(var24, Client.field644 + var1, Client.field611 + var2, var18, 0, Client.field643, 150 - Client.field641[var11], Client.field566[var11]);
				}

				if (Client.field639[var11] == 4) {
					var19 = (150 - Client.field641[var11]) * (Client.field2002.method8139(var24) + 100) / 150;
					Class569.method10137(Client.field644 + var1 - 50, var2, Client.field644 + var1 + 50, var2 + var4);
					Client.field2002.method8155(var24, Client.field644 + var1 + 50 - var19, Client.field611 + var2, var18, 0, Client.field566[var11]);
					Class569.method10183(var1, var2, var1 + var3, var2 + var4);
				}

				if (Client.field639[var11] == 5) {
					var19 = 150 - Client.field641[var11];
					var20 = 0;
					if (var19 < 25) {
						var20 = var19 - 25;
					} else if (var19 > 125) {
						var20 = var19 - 125;
					}

					Class569.method10137(var1, Client.field611 + var2 - Client.field2002.field4784 - 1, var1 + var3, Client.field611 + var2 + 5);
					Client.field2002.method8138(var24, Client.field644 + var1, Client.field611 + var2 + var20, var18, 0, Client.field566[var11]);
					Class569.method10183(var1, var2, var1 + var3, var2 + var4);
				}
			} else {
				Client.field2002.method8147(var24, Client.field644 + var1, Client.field611 + var2, 16776960, 0);
			}
		}

	}
}
