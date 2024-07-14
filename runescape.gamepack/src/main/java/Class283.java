import io.runebox.ObfInfo;

@ObfInfo(name = "kw")
public class Class283 implements Class264 {
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 407425227)
	public int field2977;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 502415749)
	public int field2978;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1715220047)
	public int field2979;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1345453013)
	public int field2980;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1809402251)
	public int field2981;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1317582751)
	public int field2982;

	@ObfInfo(name = "aq", desc = "(Ljm;I)V", opaque = "1568670940")
	public void method4458(Class247 var1) {
		if (var1.field2607 > this.field2977) {
			var1.field2607 = this.field2977;
		}

		if (var1.field2603 < this.field2977) {
			var1.field2603 = this.field2977;
		}

		if (var1.field2608 > this.field2982) {
			var1.field2608 = this.field2982;
		}

		if (var1.field2609 < this.field2982) {
			var1.field2609 = this.field2982;
		}

	}

	@ObfInfo(name = "ad", desc = "(IIIB)Z", opaque = "-1")
	public boolean method4459(int var1, int var2, int var3) {
		if (var1 >= this.field2978 && var1 < this.field2981 + this.field2978) {
			return var2 >> 6 == this.field2979 && var3 >> 6 == this.field2980;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ag", desc = "(III)Z", opaque = "-889269986")
	public boolean method4480(int var1, int var2) {
		return var1 >> 6 == this.field2977 && var2 >> 6 == this.field2982;
	}

	@ObfInfo(name = "ak", desc = "(IIIB)[I", opaque = "7")
	public int[] method4461(int var1, int var2, int var3) {
		if (!this.method4459(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field2977 * 64 - this.field2979 * 64 + var2, this.field2982 * 64 - this.field2980 * 64 + var3};
			return var5;
		}
	}

	@ObfInfo(name = "ap", desc = "(III)Lnl;", opaque = "796740285")
	public Class350 method4462(int var1, int var2) {
		if (!this.method4480(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2979 * 64 - this.field2977 * 64 + var1;
			int var5 = this.field2980 * 64 - this.field2982 * 64 + var2;
			return new Class350(this.field2978, var4, var5);
		}
	}

	@ObfInfo(name = "an", desc = "(Lvp;I)V")
	public void method4463(Class562 var1) {
		this.field2978 = var1.method9902();
		this.field2981 = var1.method9902();
		this.field2979 = var1.method9997();
		this.field2980 = var1.method9997();
		this.field2977 = var1.method9997();
		this.field2982 = var1.method9997();
		this.method5608();
	}

	@ObfInfo(name = "aj", desc = "(S)V")
	public void method5608() {
	}

	@ObfInfo(name = "aj", desc = "(Lde;Lvp;IIIIIII)V", opaque = "1618953960")
	public static void method5628(Class83 var0, Class562 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var9 = var0.field1025;
		byte[][][] var10 = var0.field1023;
		int var11;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var9[0].length - 1 && var4 >= 0 && var4 < var9[0][0].length - 1) {
			var10[var2][var3][var4] = 0;

			while (true) {
				var11 = var1.method9997();
				if (var11 == 0) {
					if (var2 == 0) {
						var9[0][var3][var4] = -Class97.method3351(var5 + 932731, var6 + 556238) * 8;
					} else {
						var9[var2][var3][var4] = var9[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (var11 == 1) {
					int var12 = var1.method9902();
					if (var12 == 1) {
						var12 = 0;
					}

					if (var2 == 0) {
						var9[0][var3][var4] = -var12 * 8;
					} else {
						var9[var2][var3][var4] = var9[var2 - 1][var3][var4] - var12 * 8;
					}
					break;
				}

				if (var11 <= 49) {
					Class97.field1187[var2][var3][var4] = (short)var1.method9829();
					Class97.field1188[var2][var3][var4] = (byte)((var11 - 2) / 4);
					Class97.field3989[var2][var3][var4] = (byte)(var11 - 2 + var7 & 3);
				} else if (var11 <= 81) {
					var10[var2][var3][var4] = (byte)(var11 - 49);
				} else {
					Class97.field1186[var2][var3][var4] = (short)(var11 - 81);
				}
			}
		} else {
			while (true) {
				var11 = var1.method9997();
				if (var11 == 0) {
					break;
				}

				if (var11 == 1) {
					var1.method9902();
					break;
				}

				if (var11 <= 49) {
					var1.method9829();
				}
			}
		}

	}
}
