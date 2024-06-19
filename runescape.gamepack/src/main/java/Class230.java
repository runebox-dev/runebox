public class Class230 extends Class507 {
	public static Class299 field2422;
	public boolean field2420;
	public int field2418;
	public int field2419;
	public int field2423;
	public int field2424;
	public int field2425;
	public int field2426;
	public int field2427;
	public int field2429;
	public int field2431;

	static {
		field2422 = new Class299(64);
	}

	public Class230() {
		this.field2418 = 0;
		this.field2429 = -1;
		this.field2420 = true;
		this.field2419 = -1;
	}

	public void method4394() {
		if (-1 != this.field2419) {
			this.method4404(this.field2419);
			this.field2431 = this.field2425;
			this.field2426 = this.field2423;
			this.field2427 = this.field2424;
		}

		this.method4404(this.field2418);
	}

	public void method4393(Class521 var1, int var2) {
		while (true) {
			int var4 = var1.method9405();
			if (var4 == 0) {
				return;
			}

			this.method4395(var1, var4, var2);
		}
	}

	public void method4395(Class521 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field2418 = var1.method9399();
		} else if (var2 == 2) {
			this.field2429 = var1.method9405();
		} else if (var2 == 5) {
			this.field2420 = false;
		} else if (var2 == 7) {
			this.field2419 = var1.method9399();
		} else if (var2 == 8) {
		}

	}

	public void method4404(int var1) {
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
		double var17 = (var11 + var9) / 2.0D;
		if (var11 != var9) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var9 + var11);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var11 == var3) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var5 == var11) {
				var13 = 2.0D + (var7 - var3) / (var11 - var9);
			} else if (var7 == var11) {
				var13 = 4.0D + (var3 - var5) / (var11 - var9);
			}
		}

		var13 /= 6.0D;
		this.field2425 = (int)(256.0D * var13);
		this.field2423 = (int)(256.0D * var15);
		this.field2424 = (int)(256.0D * var17);
		if (this.field2423 < 0) {
			this.field2423 = 0;
		} else if (this.field2423 > 255) {
			this.field2423 = 255;
		}

		if (this.field2424 < 0) {
			this.field2424 = 0;
		} else if (this.field2424 > 255) {
			this.field2424 = 255;
		}

	}

	public static void method3042(Class382 var0) {
		Class93.field2417 = var0;
	}
}
