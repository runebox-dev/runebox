import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.Iterator;

@ObfInfo(name = "dj")
public class Class88 {
	@ObfInfo(owner = "vw", name = "am", desc = "I")
	public static int field5502;
	@ObfInfo(name = "aq", desc = "[Lvv;")
	public Class568[] field1114;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1310190489)
	public int field1102;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1877836635)
	public int field1106;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -1601274563)
	public int field1107;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1587381431)
	public int field1108;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -632961439)
	public int field1113;
	@ObfInfo(name = "as", desc = "I", intMultiplier = 1230032791)
	public int field1115;
	@ObfInfo(name = "ay", desc = "[I")
	public int[] field1096;
	@ObfInfo(name = "ax", desc = "[I")
	public int[] field1099;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field1101;
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field1103;
	@ObfInfo(name = "ac", desc = "[I")
	public int[] field1104;
	@ObfInfo(name = "au", desc = "[I")
	public int[] field1109;
	@ObfInfo(name = "ai", desc = "[I")
	public int[] field1110;
	@ObfInfo(name = "al", desc = "[I")
	public int[] field1111;
	@ObfInfo(name = "ae", desc = "[I")
	public int[] field1112;

	public Class88(Class568[] var1) {
		this.field1101 = new int[256];
		this.field1102 = 0;
		this.field1107 = 0;
		this.field1108 = 0;
		this.field1113 = 0;
		this.field1106 = 0;
		this.field1115 = 0;
		this.field1114 = var1;
		this.method2373();
	}

	@ObfInfo(name = "aq", desc = "(I)V", opaque = "-974446713")
	public void method2373() {
		this.field1110 = new int[256];

		int var2;
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1110[var2] = var2 * 262144;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1110[var2 + 64] = var2 * 1024 + 16711680;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1110[var2 + 128] = var2 * 4 + 16776960;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1110[var2 + 192] = 16777215;
		}

		this.field1112 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1112[var2] = var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1112[var2 + 64] = var2 * 4 + 65280;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1112[var2 + 128] = var2 * 262144 + 65535;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1112[var2 + 192] = 16777215;
		}

		this.field1109 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1109[var2] = var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1109[var2 + 64] = var2 * 262144 + 255;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1109[var2 + 128] = var2 * 1024 + 16711935;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field1109[var2 + 192] = 16777215;
		}

		this.field1103 = new int[256];
		this.field1113 = 0;
		this.field1111 = new int[32768];
		this.field1096 = new int[32768];
		this.method2381((Class568)null);
		this.field1099 = new int[32768];
		this.field1104 = new int[32768];
	}

	@ObfInfo(name = "ad", desc = "(I)V")
	public void method2404() {
		this.field1110 = null;
		this.field1112 = null;
		this.field1109 = null;
		this.field1103 = null;
		this.field1111 = null;
		this.field1096 = null;
		this.field1099 = null;
		this.field1104 = null;
		this.field1113 = 0;
		this.field1106 = 0;
	}

	@ObfInfo(name = "ag", desc = "(III)V", opaque = "-1667416752")
	public void method2375(int var1, int var2) {
		if (this.field1099 == null) {
			this.method2373();
		}

		if (this.field1115 == 0) {
			this.field1115 = var2;
		}

		int var4 = var2 - this.field1115;
		if (var4 >= 256) {
			var4 = 0;
		}

		this.field1115 = var2;
		if (var4 > 0) {
			this.method2376(var4);
		}

		this.method2378(var1);
	}

	@ObfInfo(name = "ak", desc = "(II)V", opaque = "-1589348651")
	public final void method2376(int var1) {
		this.field1113 += var1 * 128;
		int var3;
		if (this.field1113 > this.field1111.length) {
			this.field1113 -= this.field1111.length;
			var3 = (int)(Math.random() * 12.0D);
			this.method2381(this.field1114[var3]);
		}

		var3 = 0;
		int var4 = var1 * 128;
		int var5 = (256 - var1) * 128;

		int var7;
		for (int var6 = 0; var6 < var5; ++var6) {
			var7 = this.field1099[var3 + var4] - this.field1111[this.field1113 + var3 & this.field1111.length - 1] * var1 / 6;
			if (var7 < 0) {
				var7 = 0;
			}

			this.field1099[var3++] = var7;
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
					this.field1099[var9 + var10] = 255;
				} else {
					this.field1099[var9 + var10] = 0;
				}
			}
		}

		if (this.field1107 > 0) {
			this.field1107 -= var1 * 4;
		}

		if (this.field1108 > 0) {
			this.field1108 -= var1 * 4;
		}

		if (this.field1107 == 0 && this.field1108 == 0) {
			var8 = (int)(Math.random() * (double)(2000 / var1));
			if (var8 == 0) {
				this.field1107 = 1024;
			}

			if (var8 == 1) {
				this.field1108 = 1024;
			}
		}

		for (var8 = 0; var8 < 256 - var1; ++var8) {
			this.field1101[var8] = this.field1101[var1 + var8];
		}

		for (var8 = 256 - var1; var8 < 256; ++var8) {
			this.field1101[var8] = (int)(Math.sin((double)this.field1102 / 14.0D) * 16.0D + Math.sin((double)this.field1102 / 15.0D) * 14.0D + Math.sin((double)this.field1102 / 16.0D) * 12.0D);
			++this.field1102;
		}

		this.field1106 += var1;
		var8 = ((Client.field541 & 1) + var1) / 2;
		if (var8 > 0) {
			short var17 = 128;
			byte var18 = 2;
			var11 = 128 - var18 - var18;

			int var12;
			int var13;
			int var14;
			for (var12 = 0; var12 < this.field1106 * 100; ++var12) {
				var13 = (int)(Math.random() * (double)var11) + var18;
				var14 = (int)(Math.random() * (double)var17) + var17;
				this.field1099[(var14 << 7) + var13] = 192;
			}

			this.field1106 = 0;

			int var15;
			for (var12 = 0; var12 < 256; ++var12) {
				var13 = 0;
				var14 = var12 * 128;

				for (var15 = -var8; var15 < 128; ++var15) {
					if (var8 + var15 < 128) {
						var13 += this.field1099[var14 + var15 + var8];
					}

					if (var15 - (var8 + 1) >= 0) {
						var13 -= this.field1099[var14 + var15 - (var8 + 1)];
					}

					if (var15 >= 0) {
						this.field1104[var14 + var15] = var13 / (var8 * 2 + 1);
					}
				}
			}

			for (var12 = 0; var12 < 128; ++var12) {
				var13 = 0;

				for (var14 = -var8; var14 < 256; ++var14) {
					var15 = var14 * 128;
					if (var8 + var14 < 256) {
						var13 += this.field1104[var8 * 128 + var12 + var15];
					}

					if (var14 - (var8 + 1) >= 0) {
						var13 -= this.field1104[var12 + var15 - (var8 + 1) * 128];
					}

					if (var14 >= 0) {
						this.field1099[var12 + var15] = var13 / (var8 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(IIII)I")
	public final int method2377(int var1, int var2, int var3) {
		int var5 = 256 - var3;
		return ((var1 & 16711935) * var5 + (var2 & 16711935) * var3 & -16711936) + ((var1 & 65280) * var5 + (var2 & 65280) * var3 & 16711680) >> 8;
	}

	@ObfInfo(name = "an", desc = "(II)V", opaque = "1146996789")
	public final void method2378(int var1) {
		int var3 = this.field1103.length;
		if (this.field1107 > 0) {
			this.method2379(this.field1107, this.field1112);
		} else if (this.field1108 > 0) {
			this.method2379(this.field1108, this.field1109);
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				this.field1103[var4] = this.field1110[var4];
			}
		}

		this.method2380(var1);
	}

	@ObfInfo(name = "aj", desc = "(I[II)V", opaque = "1475889578")
	public final void method2379(int var1, int[] var2) {
		int var4 = this.field1103.length;

		for (int var5 = 0; var5 < var4; ++var5) {
			if (var1 > 768) {
				this.field1103[var5] = this.method2377(this.field1110[var5], var2[var5], 1024 - var1);
			} else if (var1 > 256) {
				this.field1103[var5] = var2[var5];
			} else {
				this.field1103[var5] = this.method2377(var2[var5], this.field1110[var5], 256 - var1);
			}
		}

	}

	@ObfInfo(name = "av", desc = "(II)V", opaque = "-124246307")
	public final void method2380(int var1) {
		int var3 = 0;

		for (int var4 = 1; var4 < 255; ++var4) {
			int var5 = (256 - var4) * this.field1101[var4] / 256;
			int var6 = var1 + var5;
			int var7 = 0;
			int var8 = 128;
			if (var6 < 0) {
				var7 = -var6;
				var6 = 0;
			}

			if (var6 + 128 >= Client.field4695.field5513) {
				var8 = Client.field4695.field5513 - var6;
			}

			int var9 = (var4 + 8) * Client.field4695.field5513 + var6;
			var3 += var7;

			for (int var10 = var7; var10 < var8; ++var10) {
				int var11 = this.field1099[var3++];
				int var12 = var9 % field5502;
				if (var11 != 0 && var12 >= Class569.field5508 && var12 < Class569.field5509) {
					int var13 = var11;
					int var14 = 256 - var11;
					var11 = this.field1103[var11];
					int var15 = Client.field4695.field5511[var9];
					Client.field4695.field5511[var9++] = -16777216 | ((var11 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var11 & 65280) * var13 + (var15 & 65280) * var14 & 16711680) >> 8;
				} else {
					++var9;
				}
			}

			var3 += 128 - var8;
		}

	}

	@ObfInfo(name = "ab", desc = "(Lvv;I)V", opaque = "641317882")
	public final void method2381(Class568 var1) {
		int var3;
		for (var3 = 0; var3 < this.field1111.length; ++var3) {
			this.field1111[var3] = 0;
		}

		int var4;
		for (var3 = 0; var3 < 5000; ++var3) {
			var4 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1111[var4] = (int)(Math.random() * 256.0D);
		}

		int var5;
		int var6;
		for (var3 = 0; var3 < 20; ++var3) {
			for (var4 = 1; var4 < 255; ++var4) {
				for (var5 = 1; var5 < 127; ++var5) {
					var6 = (var4 << 7) + var5;
					this.field1096[var6] = (this.field1111[var6 - 1] + this.field1111[var6 + 1] + this.field1111[var6 - 128] + this.field1111[var6 + 128]) / 4;
				}
			}

			int[] var9 = this.field1111;
			this.field1111 = this.field1096;
			this.field1096 = var9;
		}

		if (var1 != null) {
			var3 = 0;

			for (var4 = 0; var4 < var1.field5496; ++var4) {
				for (var5 = 0; var5 < var1.field5495; ++var5) {
					if (var1.field5497[var3++] != 0) {
						var6 = var5 + 16 + var1.field5494;
						int var7 = var4 + 16 + var1.field5493;
						int var8 = (var7 << 7) + var6;
						this.field1111[var8] = 0;
					}
				}
			}
		}

	}

	@ObfInfo(name = "ah", desc = "(I)Ljava/util/ArrayList;", opaque = "-2034965454")
	public static ArrayList method2402() {
		ArrayList var1 = new ArrayList();
		Iterator var2 = Class323.field3464.iterator();

		while (var2.hasNext()) {
			Class351 var3 = (Class351)var2.next();
			var1.add(var3);
		}

		return var1;
	}

	@ObfInfo(name = "in", desc = "(III)V", opaque = "1058476450")
	public static void method2389(int var0, int var1) {
		if (Client.field1474.method2544() != 0 && var0 != -1) {
			ArrayList var3 = new ArrayList();
			var3.add(new Class351(Client.field4372, var0, 0, Client.field1474.method2544(), false));
			Class323.method9265(var3, 0, 0, 0, 0, true);
			Client.field787 = true;
		}

	}
}
