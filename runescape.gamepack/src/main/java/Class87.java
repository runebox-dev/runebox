import java.util.Iterator;

public class Class87 {
	public static int field5423;
	public Class557[] field1150;
	public int field1135;
	public int field1136;
	public int field1145;
	public int field1146;
	public int field1151;
	public int field1152;
	public int[] field1134;
	public int[] field1139;
	public int[] field1140;
	public int[] field1141;
	public int[] field1142;
	public int[] field1143;
	public int[] field1144;
	public int[] field1147;
	public int[] field1148;

	public Class87(Class557[] var1) {
		this.field1139 = new int[256];
		this.field1136 = 0;
		this.field1145 = 0;
		this.field1146 = 0;
		this.field1151 = 0;
		this.field1135 = 0;
		this.field1152 = 0;
		this.field1150 = var1;
		this.method2371();
	}

	public void method2371() {
		this.field1142 = new int[256];

		int var2;
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1142[var2] = var2 * 262144;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1142[var2 + 64] = var2 * 1024 + 16711680;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1142[var2 + 128] = var2 * 4 + 16776960;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1142[var2 + 192] = 16777215;
		}

		this.field1143 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1143[var2] = var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1143[var2 + 64] = var2 * 4 + 65280;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1143[var2 + 128] = var2 * 262144 + 65535;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1143[var2 + 192] = 16777215;
		}

		this.field1144 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1144[var2] = var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1144[var2 + 64] = var2 * 262144 + 255;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1144[var2 + 128] = 16711935 + var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1144[var2 + 192] = 16777215;
		}

		this.field1141 = new int[256];
		this.field1151 = 0;
		this.field1134 = new int[32768];
		this.field1140 = new int[32768];
		this.method2367((Class557)null);
		this.field1147 = new int[32768];
		this.field1148 = new int[32768];
	}

	public void method2356() {
		this.field1142 = null;
		this.field1143 = null;
		this.field1144 = null;
		this.field1141 = null;
		this.field1134 = null;
		this.field1140 = null;
		this.field1147 = null;
		this.field1148 = null;
		this.field1151 = 0;
		this.field1135 = 0;
	}

	public void method2366(int var1, int var2) {
		if (this.field1147 == null) {
			this.method2371();
		}

		if (this.field1152 == 0) {
			this.field1152 = var2;
		}

		int var4 = var2 - this.field1152;
		if (var4 >= 256) {
			var4 = 0;
		}

		this.field1152 = var2;
		if (var4 > 0) {
			this.method2353(var4);
		}

		this.method2358(var1);
	}

	public final void method2353(int var1) {
		this.field1151 += var1 * 128;
		int var3;
		if (this.field1151 > this.field1134.length) {
			this.field1151 -= this.field1134.length;
			var3 = (int)(Math.random() * 12.0D);
			this.method2367(this.field1150[var3]);
		}

		var3 = 0;
		int var4 = var1 * 128;
		int var5 = (256 - var1) * 128;

		int var7;
		for (int var6 = 0; var6 < var5; ++var6) {
			var7 = this.field1147[var4 + var3] - var1 * this.field1134[this.field1151 + var3 & this.field1134.length - 1] / 6;
			if (var7 < 0) {
				var7 = 0;
			}

			this.field1147[var3++] = var7;
		}

		byte var16 = 10;
		var7 = 128 - var16;

		int var8;
		int var11;
		for (var8 = 256 - var1; var8 < 256; ++var8) {
			int var9 = var8 * 128;

			for (int var10 = 0; var10 < 128; ++var10) {
				var11 = (int)(Math.random() * 100.0D);
				if (var11 < 50 && var10 > var16 && var10 < var7) {
					this.field1147[var10 + var9] = 255;
				} else {
					this.field1147[var10 + var9] = 0;
				}
			}
		}

		if (this.field1145 > 0) {
			this.field1145 -= var1 * 4;
		}

		if (this.field1146 > 0) {
			this.field1146 -= var1 * 4;
		}

		if (this.field1145 == 0 && 0 == this.field1146) {
			var8 = (int)(Math.random() * (double)(2000 / var1));
			if (var8 == 0) {
				this.field1145 = 1024;
			}

			if (var8 == 1) {
				this.field1146 = 1024;
			}
		}

		for (var8 = 0; var8 < 256 - var1; ++var8) {
			this.field1139[var8] = this.field1139[var8 + var1];
		}

		for (var8 = 256 - var1; var8 < 256; ++var8) {
			this.field1139[var8] = (int)(Math.sin((double)this.field1136 / 14.0D) * 16.0D + Math.sin((double)this.field1136 / 15.0D) * 14.0D + Math.sin((double)this.field1136 / 16.0D) * 12.0D);
			++this.field1136;
		}

		this.field1135 += var1;
		var8 = ((Client.field778 & 1) + var1) / 2;
		if (var8 > 0) {
			short var17 = 128;
			byte var18 = 2;
			var11 = 128 - var18 - var18;

			int var12;
			int var13;
			int var14;
			for (var12 = 0; var12 < this.field1135 * 100; ++var12) {
				var13 = (int)(Math.random() * (double)var11) + var18;
				var14 = (int)(Math.random() * (double)var17) + var17;
				this.field1147[(var14 << 7) + var13] = 192;
			}

			this.field1135 = 0;

			int var15;
			for (var12 = 0; var12 < 256; ++var12) {
				var13 = 0;
				var14 = var12 * 128;

				for (var15 = -var8; var15 < 128; ++var15) {
					if (var15 + var8 < 128) {
						var13 += this.field1147[var15 + var14 + var8];
					}

					if (var15 - (var8 + 1) >= 0) {
						var13 -= this.field1147[var15 + var14 - (var8 + 1)];
					}

					if (var15 >= 0) {
						this.field1148[var15 + var14] = var13 / (var8 * 2 + 1);
					}
				}
			}

			for (var12 = 0; var12 < 128; ++var12) {
				var13 = 0;

				for (var14 = -var8; var14 < 256; ++var14) {
					var15 = var14 * 128;
					if (var14 + var8 < 256) {
						var13 += this.field1148[var15 + var12 + var8 * 128];
					}

					if (var14 - (var8 + 1) >= 0) {
						var13 -= this.field1148[var15 + var12 - (var8 + 1) * 128];
					}

					if (var14 >= 0) {
						this.field1147[var15 + var12] = var13 / (var8 * 2 + 1);
					}
				}
			}
		}

	}

	public final int method2357(int var1, int var2, int var3) {
		int var5 = 256 - var3;
		return (var3 * (var2 & 65280) + (var1 & 65280) * var5 & 16711680) + (var5 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	public final void method2358(int var1) {
		int var3 = this.field1141.length;
		if (this.field1145 > 0) {
			this.method2365(this.field1145, this.field1143);
		} else if (this.field1146 > 0) {
			this.method2365(this.field1146, this.field1144);
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				this.field1141[var4] = this.field1142[var4];
			}
		}

		this.method2360(var1);
	}

	public final void method2365(int var1, int[] var2) {
		int var4 = this.field1141.length;

		for (int var5 = 0; var5 < var4; ++var5) {
			if (var1 > 768) {
				this.field1141[var5] = this.method2357(this.field1142[var5], var2[var5], 1024 - var1);
			} else if (var1 > 256) {
				this.field1141[var5] = var2[var5];
			} else {
				this.field1141[var5] = this.method2357(var2[var5], this.field1142[var5], 256 - var1);
			}
		}

	}

	public final void method2360(int var1) {
		int var3 = 0;

		for (int var4 = 1; var4 < 255; ++var4) {
			int var5 = (256 - var4) * this.field1139[var4] / 256;
			int var6 = var5 + var1;
			int var7 = 0;
			int var8 = 128;
			if (var6 < 0) {
				var7 = -var6;
				var6 = 0;
			}

			if (var6 + 128 >= Client.field3241.field5484) {
				var8 = Client.field3241.field5484 - var6;
			}

			int var9 = var6 + (var4 + 8) * Client.field3241.field5484;
			var3 += var7;

			for (int var10 = var7; var10 < var8; ++var10) {
				int var11 = this.field1147[var3++];
				int var12 = var9 % field5423;
				if (var11 != 0 && var12 >= Class561.field5424 && var12 < Class561.field5425) {
					int var13 = var11;
					int var14 = 256 - var11;
					var11 = this.field1141[var11];
					int var15 = Client.field3241.field5480[var9];
					Client.field3241.field5480[var9++] = -16777216 | (var13 * (var11 & 65280) + (var15 & 65280) * var14 & 16711680) + (var14 * (var15 & 16711935) + (var11 & 16711935) * var13 & -16711936) >> 8;
				} else {
					++var9;
				}
			}

			var3 += 128 - var8;
		}

	}

	public final void method2367(Class557 var1) {
		int var3;
		for (var3 = 0; var3 < this.field1134.length; ++var3) {
			this.field1134[var3] = 0;
		}

		int var4;
		for (var3 = 0; var3 < 5000; ++var3) {
			var4 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1134[var4] = (int)(Math.random() * 256.0D);
		}

		int var5;
		int var6;
		for (var3 = 0; var3 < 20; ++var3) {
			for (var4 = 1; var4 < 255; ++var4) {
				for (var5 = 1; var5 < 127; ++var5) {
					var6 = var5 + (var4 << 7);
					this.field1140[var6] = (this.field1134[var6 + 128] + this.field1134[var6 - 128] + this.field1134[var6 + 1] + this.field1134[var6 - 1]) / 4;
				}
			}

			int[] var9 = this.field1134;
			this.field1134 = this.field1140;
			this.field1140 = var9;
		}

		if (var1 != null) {
			var3 = 0;

			for (var4 = 0; var4 < var1.field5395; ++var4) {
				for (var5 = 0; var5 < var1.field5392; ++var5) {
					if (var1.field5393[var3++] != 0) {
						var6 = var5 + 16 + var1.field5398;
						int var7 = var1.field5397 + var4 + 16;
						int var8 = var6 + (var7 << 7);
						this.field1134[var8] = 0;
					}
				}
			}
		}

	}

	public static void method2354() {
		Iterator var1 = Class332.field3455.iterator();

		while (var1.hasNext()) {
			Class357 var2 = (Class357)var1.next();
			if (var2 != null) {
				var2.field3940.method6319();
				var2.field3940.method6313();
				var2.field3940.method6400(0);
				var2.field3940.field3509 = 0;
				Class332.method4921(var2.field3937, var2.field3933);
			}
		}

		Class332.field3455.clear();
	}

	public static String method2383(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + Class378.field4202 + "</col>" : "<col=00ff80>" + var0 / 1000000 + Class378.field4322 + "</col>";
		}
	}

	public static Class114[] method2385() {
		return new Class114[]{Class114.field1438, Class114.field1434, Class114.field1431, Class114.field1432, Class114.field1433};
	}
}