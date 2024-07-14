import io.runebox.ObfInfo;

@ObfInfo(name = "dr")
public class Class96 extends Class280 {
	@ObfInfo(name = "av", desc = "Lii;")
	public Class217 field1179;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -405582099)
	public int field1181;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 302909337)
	public int field1182;
	@ObfInfo(name = "aq", desc = "Lde;")
	public final Class83 field1184;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 289855771)
	public final int field1173;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1437264679)
	public final int field1175;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 2076222903)
	public final int field1176;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -129198571)
	public final int field1177;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1080493665)
	public final int field1178;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1563928111)
	public final int field1180;

	public Class96(Class83 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Class280 var10) {
		this.field1184 = var1;
		this.field1180 = var2;
		this.field1175 = var3;
		this.field1176 = var4;
		this.field1177 = var5;
		this.field1178 = var6;
		this.field1173 = var7;
		if (var8 != -1) {
			this.field1179 = Class344.method6474(var8);
			this.field1181 = 0;
			this.field1182 = Client.field541 - 1;
			if (this.field1179.field2370 == 0 && var10 instanceof Class96) {
				Class96 var11 = (Class96)var10;
				if (this.field1179 == var11.field1179) {
					this.field1181 = var11.field1181;
					this.field1182 = var11.field1182;
					return;
				}
			}

			if (var9 && this.field1179.field2359 != -1) {
				if (!this.field1179.method4132()) {
					this.field1181 = (int)(Math.random() * (double)this.field1179.field2355.length);
					this.field1182 -= (int)(Math.random() * (double)this.field1179.field2349[this.field1181]);
				} else {
					this.field1181 = (int)(Math.random() * (double)this.field1179.method4141());
				}
			}
		}

	}

	@ObfInfo(name = "ah", desc = "(I)Llv;", opaque = "-1073372180")
	public final Class308 method1140() {
		Class197 var2 = Class197.method61(this.field1180);
		if (var2.field2166 != null) {
			var2 = var2.method3905();
		}

		if (var2 == null) {
			return null;
		} else {
			int var3;
			int var4;
			if (this.field1176 != 1 && this.field1176 != 3) {
				var3 = var2.field2140;
				var4 = var2.field2141;
			} else {
				var3 = var2.field2141;
				var4 = var2.field2140;
			}

			int var5 = (var3 >> 1) + this.field1178;
			int var6 = (var3 + 1 >> 1) + this.field1178;
			int var7 = (var4 >> 1) + this.field1173;
			int var8 = (var4 + 1 >> 1) + this.field1173;
			int[][] var9 = this.field1184.field1025[this.field1177];
			int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
			int var11 = (this.field1178 << 7) + (var3 << 6);
			int var12 = (this.field1173 << 7) + (var4 << 6);
			if (this.field1179 != null) {
				int var13 = Client.field541 - this.field1182;
				if (var13 > 100 && this.field1179.field2359 > 0) {
					var13 = 100;
				}

				if (!this.field1179.method4132()) {
					label56: {
						do {
							while (true) {
								if (var13 <= this.field1179.field2349[this.field1181]) {
									break label56;
								}

								var13 -= this.field1179.field2349[this.field1181];
								++this.field1181;
								if (this.field1181 >= this.field1179.field2355.length) {
									this.field1181 -= this.field1179.field2359;
									break;
								}

								Client.method3891(this.field1179, this.field1181, var11, var12, false);
							}
						} while(this.field1181 >= 0 && this.field1181 < this.field1179.field2355.length);

						this.field1179 = null;
					}
				} else {
					int var14 = this.field1179.method4141();
					this.field1181 += var13;
					var13 = 0;
					if (this.field1181 >= var14) {
						this.field1181 = var14 - this.field1179.field2359;
						if (this.field1181 < 0 || this.field1181 > var14) {
							this.field1179 = null;
						}
					}

					if (this.field1179 != null) {
						Client.method4983(this.field1179, this.field1181, var11, var12, false);
					}
				}

				this.field1182 = Client.field541 - var13;
			}

			return var2.method3904(this.field1175, this.field1176, var9, var11, var10, var12, this.field1179, this.field1181);
		}
	}

	@ObfInfo(name = "mb", desc = "(Ldb;IIIII)V", opaque = "833889290")
	public static void method2565(Class80 var0, int var1, int var2, int var3, int var4) {
		if (Client.field732 != var0.field995) {
			if (Client.field602 < 400) {
				String var6;
				if (var0.field979 == 0) {
					var6 = var0.field977[0] + var0.field991 + var0.field977[1] + Client.method3836(var0.field976, Client.field170.field976) + " " + Class111.field1390 + Class367.field4205 + var0.field976 + Class111.field1391 + var0.field977[2];
				} else {
					var6 = var0.field977[0] + var0.field991 + var0.field977[1] + " " + Class111.field1390 + Class367.field4206 + var0.field979 + Class111.field1391 + var0.field977[2];
				}

				int var7;
				if (Client.field614 == 1) {
					Class247.method4829(Class367.field4035, Client.field668 + " " + Class111.field1392 + " " + Class111.method3839(16777215) + var6, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.field692) {
					if ((Client.field969 & 8) == 8) {
						Class247.method4829(Client.field695, Client.field696 + " " + Class111.field1392 + " " + Class111.method3839(16777215) + var6, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var7 = 7; var7 >= 0; --var7) {
						if (Client.field712[var7] != null) {
							short var8 = 0;
							if (Client.field712[var7].equalsIgnoreCase(Class367.field4046)) {
								if (Client.field818 == Class113.field1420) {
									continue;
								}

								if (Client.field818 == Class113.field1419 || Client.field818 == Class113.field1418 && var0.field976 > Client.field170.field976) {
									var8 = 2000;
								}

								if (Client.field170.field998 != 0 && var0.field998 != 0) {
									if (Client.field170.field998 == var0.field998) {
										var8 = 2000;
									} else {
										var8 = 0;
									}
								} else if (Client.field818 == Class113.field1422 && var0.method2248()) {
									var8 = 2000;
								}
							} else if (Client.field664[var7]) {
								var8 = 2000;
							}

							boolean var9 = false;
							int var10 = Client.field662[var7] + var8;
							Class247.method4829(Client.field712[var7], Class111.method3839(16777215) + var6, var10, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var7 = 0; var7 < Client.field602; ++var7) {
					if (Client.field783[var7] == 23) {
						Client.field681[var7] = Class111.method3839(16777215) + var6;
						break;
					}
				}

			}
		}
	}
}
