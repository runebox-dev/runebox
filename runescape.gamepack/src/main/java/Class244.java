import io.runebox.ObfInfo;

@ObfInfo(name = "jj")
public class Class244 implements Class263 {
	@ObfInfo(name = "ak", desc = "[Ljw;")
	public Class257[] field2634;
	@ObfInfo(name = "at", desc = "Lor;")
	public Class382 field2635;
	@ObfInfo(name = "al", desc = "Lpk;")
	public Class401 field2630;
	@ObfInfo(name = "af", desc = "D")
	public double field2633;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 560141227)
	public int field2631;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -173568361)
	public int field2632;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1600177769)
	public int field2636;

	public Class244(Class382 var1, Class382 var2, int var3, double var4, int var6) {
		this.field2630 = new Class401();
		this.field2632 = 0;
		this.field2633 = 1.0D;
		this.field2631 = 128;
		this.field2635 = var2;
		this.field2636 = var3;
		this.field2632 = this.field2636;
		this.field2633 = var4;
		this.field2631 = var6;
		int[] var7 = var1.method7226(0);
		if (var7 != null) {
			int var8 = var7.length;
			this.field2634 = new Class257[var1.method7237(0)];

			for (int var9 = 0; var9 < var8; ++var9) {
				Class521 var10 = new Class521(var1.method7216(0, var7[var9]));
				this.field2634[var7[var9]] = new Class257(var10);
			}
		} else {
			this.field2634 = new Class257[0];
		}

	}

	@ObfInfo(name = "ak", desc = "(B)I", opaque = "11")
	public int method4715() {
		if (this.field2634.length == 0) {
			return 100;
		} else {
			int var2 = 0;
			int var3 = 0;
			Class257[] var4 = this.field2634;

			for (int var5 = 0; var5 < var4.length; ++var5) {
				Class257 var6 = var4[var5];
				if (var6 != null && var6.field2718 != null) {
					var2 += var6.field2718.length;
					int[] var7 = var6.field2718;

					for (int var8 = 0; var8 < var7.length; ++var8) {
						int var9 = var7[var8];
						if (this.field2635.method7219(var9)) {
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

	@ObfInfo(name = "al", desc = "(D)V")
	public void method4716(double var1) {
		this.field2633 = var1;
		this.method4741();
	}

	@ObfInfo(name = "aj", desc = "(IB)[I", opaque = "-1")
	public int[] method4717(int var1) {
		Class257 var3 = this.field2634[var1];
		if (var3 != null) {
			if (var3.field2712 != null) {
				this.field2630.method7478(var3);
				var3.field2725 = true;
				return var3.field2712;
			}

			boolean var4 = var3.method4912(this.field2633, this.field2631, this.field2635);
			if (var4) {
				if (0 == this.field2632) {
					Class257 var5 = (Class257)this.field2630.method7481();
					var5.method4913();
				} else {
					--this.field2632;
				}

				this.field2630.method7478(var3);
				var3.field2725 = true;
				return var3.field2712;
			}
		}

		return null;
	}

	@ObfInfo(name = "az", desc = "(II)I")
	public int method4718(int var1) {
		return this.field2634[var1] != null ? this.field2634[var1].field2716 : 0;
	}

	@ObfInfo(name = "af", desc = "(II)Z")
	public boolean method4719(int var1) {
		return this.field2634[var1].field2719;
	}

	@ObfInfo(name = "aa", desc = "(II)Z", opaque = "660032096")
	public boolean method4731(int var1) {
		return this.field2631 == 64;
	}

	@ObfInfo(name = "at", desc = "(I)V", opaque = "-598476332")
	public void method4741() {
		for (int var2 = 0; var2 < this.field2634.length; ++var2) {
			if (this.field2634[var2] != null) {
				this.field2634[var2].method4913();
			}
		}

		this.field2630 = new Class401();
		this.field2632 = this.field2636;
	}

	@ObfInfo(name = "ab", desc = "(II)V", opaque = "-89858524")
	public void method4734(int var1) {
		for (int var3 = 0; var3 < this.field2634.length; ++var3) {
			Class257 var4 = this.field2634[var3];
			if (var4 != null && var4.field2722 != 0 && var4.field2725) {
				var4.method4914(var1);
				var4.field2725 = false;
			}
		}

	}
}
