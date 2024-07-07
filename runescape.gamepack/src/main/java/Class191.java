import io.runebox.ObfInfo;

@ObfInfo(name = "hi")
public class Class191 extends Class516 {
	@ObfInfo(name = "ad", desc = "Lmo;")
	public static Class327 field2094;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -668914137)
	public int field2095;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1053245405)
	public int field2096;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1420791091)
	public int field2097;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1869653971)
	public int field2098;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 80434597)
	public int field2104;

	static {
		field2094 = new Class327(64);
	}

	public Class191() {
		this.field2096 = 0;
	}

	@ObfInfo(name = "ad", desc = "(I)V")
	public void method3841() {
		this.method3844(this.field2096);
	}

	@ObfInfo(name = "ag", desc = "(Lvp;II)V")
	public void method3842(Class562 var1, int var2) {
		while (true) {
			int var4 = var1.method9902();
			if (var4 == 0) {
				return;
			}

			this.method3843(var1, var4, var2);
		}
	}

	@ObfInfo(name = "ak", desc = "(Lvp;III)V", opaque = "-847299366")
	public void method3843(Class562 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field2096 = var1.method9830();
		}

	}

	@ObfInfo(name = "ap", desc = "(II)V", opaque = "1235986810")
	public void method3844(int var1) {
		double var3 = (double)(var1 >> 16 & 255) / 256.0D;
		double var5 = (double)(var1 >> 8 & 255) / 256.0D;
		double var7 = (double)(var1 & 255) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var7 < var9) {
			var9 = var7;
		}

		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}

		if (var7 > var11) {
			var11 = var7;
		}

		double var13 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var9 + var11) / 2.0D;
		if (var9 != var11) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var9 + var11);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var3 == var11) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var5 == var11) {
				var13 = 2.0D + (var7 - var3) / (var11 - var9);
			} else if (var11 == var7) {
				var13 = 4.0D + (var3 - var5) / (var11 - var9);
			}
		}

		var13 /= 6.0D;
		this.field2098 = (int)(var15 * 256.0D);
		this.field2095 = (int)(256.0D * var17);
		if (this.field2098 < 0) {
			this.field2098 = 0;
		} else if (this.field2098 > 255) {
			this.field2098 = 255;
		}

		if (this.field2095 < 0) {
			this.field2095 = 0;
		} else if (this.field2095 > 255) {
			this.field2095 = 255;
		}

		if (var17 > 0.5D) {
			this.field2104 = (int)(512.0D * (1.0D - var17) * var15);
		} else {
			this.field2104 = (int)(512.0D * var17 * var15);
		}

		if (this.field2104 < 1) {
			this.field2104 = 1;
		}

		this.field2097 = (int)((double)this.field2104 * var13);
	}

	@ObfInfo(owner = "gr", name = "aq", desc = "(Lok;B)V")
	public static void method3571(Class375 var0) {
		Class97.field2099 = var0;
	}
}
