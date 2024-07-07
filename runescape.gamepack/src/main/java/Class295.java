import io.runebox.ObfInfo;

@ObfInfo(name = "li")
public class Class295 implements Class294 {
	@ObfInfo(name = "aq", desc = "[Lkz;")
	public Class286[] field3044;
	@ObfInfo(name = "aj", desc = "Lok;")
	public Class375 field3040;
	@ObfInfo(name = "ad", desc = "Lpr;")
	public Class408 field3039;
	@ObfInfo(name = "ap", desc = "D")
	public double field3042;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -2028628447)
	public int field3038;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1163704053)
	public int field3041;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1041474121)
	public int field3043;

	public Class295(Class375 var1, Class375 var2, int var3, double var4, int var6) {
		this.field3039 = new Class408();
		this.field3043 = 0;
		this.field3042 = 1.0D;
		this.field3041 = 128;
		this.field3040 = var2;
		this.field3038 = var3;
		this.field3043 = this.field3038;
		this.field3042 = var4;
		this.field3041 = var6;
		int[] var7 = var1.method7143(0);
		if (var7 != null) {
			int var8 = var7.length;
			this.field3044 = new Class286[var1.method7144(0)];

			for (int var9 = 0; var9 < var8; ++var9) {
				Class562 var10 = new Class562(var1.method7132(0, var7[var9]));
				this.field3044[var7[var9]] = new Class286(var10);
			}
		} else {
			this.field3044 = new Class286[0];
		}

	}

	@ObfInfo(name = "aq", desc = "(I)I", opaque = "1461773364")
	public int method5753() {
		if (0 == this.field3044.length) {
			return 100;
		} else {
			int var2 = 0;
			int var3 = 0;
			Class286[] var4 = this.field3044;

			for (int var5 = 0; var5 < var4.length; ++var5) {
				Class286 var6 = var4[var5];
				if (var6 != null && var6.field3009 != null) {
					var2 += var6.field3009.length;
					int[] var7 = var6.field3009;

					for (int var8 = 0; var8 < var7.length; ++var8) {
						int var9 = var7[var8];
						if (this.field3040.method7135(var9)) {
							++var3;
						}
					}
				}
			}

			if (var2 == 0) {
				return 0;
			} else {
				return var3 * 100 / var2;
			}
		}
	}

	@ObfInfo(name = "ad", desc = "(D)V")
	public void method5754(double var1) {
		this.field3042 = var1;
		this.method5759();
	}

	@ObfInfo(name = "ag", desc = "(IB)[I", opaque = "1")
	public int[] method5742(int var1) {
		Class286 var3 = this.field3044[var1];
		if (var3 != null) {
			if (var3.field3014 != null) {
				this.field3039.method7505(var3);
				var3.field3015 = true;
				return var3.field3014;
			}

			boolean var4 = var3.method5686(this.field3042, this.field3041, this.field3040);
			if (var4) {
				if (this.field3043 == 0) {
					Class286 var5 = (Class286)this.field3039.method7508();
					var5.method5687();
				} else {
					--this.field3043;
				}

				this.field3039.method7505(var3);
				var3.field3015 = true;
				return var3.field3014;
			}
		}

		return null;
	}

	@ObfInfo(name = "ak", desc = "(II)I", opaque = "739833648")
	public int method5739(int var1) {
		return this.field3044[var1] != null ? this.field3044[var1].field3006 : 0;
	}

	@ObfInfo(name = "ap", desc = "(II)Z")
	public boolean method5740(int var1) {
		return this.field3044[var1].field3007;
	}

	@ObfInfo(name = "an", desc = "(II)Z", opaque = "-551375103")
	public boolean method5741(int var1) {
		return this.field3041 == 64;
	}

	@ObfInfo(name = "aj", desc = "(B)V", opaque = "48")
	public void method5759() {
		for (int var2 = 0; var2 < this.field3044.length; ++var2) {
			if (this.field3044[var2] != null) {
				this.field3044[var2].method5687();
			}
		}

		this.field3039 = new Class408();
		this.field3043 = this.field3038;
	}

	@ObfInfo(name = "av", desc = "(II)V", opaque = "603613830")
	public void method5766(int var1) {
		for (int var3 = 0; var3 < this.field3044.length; ++var3) {
			Class286 var4 = this.field3044[var3];
			if (var4 != null && var4.field3012 != 0 && var4.field3015) {
				var4.method5688(var1);
				var4.field3015 = false;
			}
		}

	}
}
