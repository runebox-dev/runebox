public class Class209 extends Class507 {
	public static Class299 field2110;
	public int field2109;
	public int field2112;
	public int field2113;
	public int field2114;
	public int field2115;

	static {
		field2110 = new Class299(64);
	}

	public Class209() {
		this.field2112 = 0;
	}

	public void method3976() {
		this.method3979(this.field2112);
	}

	public void method3977(Class521 var1, int var2) {
		while (true) {
			int var4 = var1.method9405();
			if (var4 == 0) {
				return;
			}

			this.method3978(var1, var4, var2);
		}
	}

	public void method3978(Class521 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field2112 = var1.method9399();
		}

	}

	public void method3979(int var1) {
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
				var13 = (var7 - var3) / (var11 - var9) + 2.0D;
			} else if (var11 == var7) {
				var13 = (var3 - var5) / (var11 - var9) + 4.0D;
			}
		}

		var13 /= 6.0D;
		this.field2109 = (int)(256.0D * var15);
		this.field2114 = (int)(256.0D * var17);
		if (this.field2109 < 0) {
			this.field2109 = 0;
		} else if (this.field2109 > 255) {
			this.field2109 = 255;
		}

		if (this.field2114 < 0) {
			this.field2114 = 0;
		} else if (this.field2114 > 255) {
			this.field2114 = 255;
		}

		if (var17 > 0.5D) {
			this.field2115 = (int)(var15 * (1.0D - var17) * 512.0D);
		} else {
			this.field2115 = (int)(var15 * var17 * 512.0D);
		}

		if (this.field2115 < 1) {
			this.field2115 = 1;
		}

		this.field2113 = (int)(var13 * (double)this.field2115);
	}
}
