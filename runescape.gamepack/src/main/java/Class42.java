import io.runebox.ObfInfo;

public class Class42 {
	@ObfInfo(name = "al", desc = "[Lcc;")
	public Class55[] field300;
	@ObfInfo(name = "aj", desc = "I")
	public int field299;
	@ObfInfo(name = "az", desc = "I")
	public int field302;

	public Class42(Class521 var1) {
		this.field300 = new Class55[10];

		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.method9405();
			if (var3 != 0) {
				--var1.field5219;
				this.field300[var2] = new Class55();
				this.field300[var2].method1057(var1);
			}
		}

		this.field299 = var1.method9407();
		this.field302 = var1.method9407();
	}

	@ObfInfo(name = "al", desc = "()Lbr;")
	public Class44 method808() {
		byte[] var1 = this.method810();
		return new Class44(22050, var1, this.field299 * 22050 / 1000, this.field302 * 22050 / 1000);
	}

	@ObfInfo(name = "aj", desc = "()I")
	public final int method809() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field300[var2] != null && this.field300[var2].field404 / 20 < var1) {
				var1 = this.field300[var2].field404 / 20;
			}
		}

		if (this.field299 < this.field302 && this.field299 / 20 < var1) {
			var1 = this.field299 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; ++var2) {
				if (this.field300[var2] != null) {
					Class55 var10000 = this.field300[var2];
					var10000.field404 -= var1 * 20;
				}
			}

			if (this.field299 < this.field302) {
				this.field299 -= var1 * 20;
				this.field302 -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	@ObfInfo(name = "az", desc = "()[B")
	public final byte[] method810() {
		int var1 = 0;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field300[var2] != null && this.field300[var2].field406 + this.field300[var2].field404 > var1) {
				var1 = this.field300[var2].field406 + this.field300[var2].field404;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			var2 = var1 * 22050 / 1000;
			byte[] var3 = new byte[var2];

			for (int var4 = 0; var4 < 10; ++var4) {
				if (this.field300[var4] != null) {
					int var5 = this.field300[var4].field406 * 22050 / 1000;
					int var6 = this.field300[var4].field404 * 22050 / 1000;
					int[] var7 = this.field300[var4].method1058(var5, this.field300[var4].field406);

					for (int var8 = 0; var8 < var5; ++var8) {
						int var9 = var3[var8 + var6] + (var7[var8] >> 8);
						if ((var9 + 128 & -256) != 0) {
							var9 = var9 >> 31 ^ 127;
						}

						var3[var8 + var6] = (byte)var9;
					}
				}
			}

			return var3;
		}
	}

	@ObfInfo(name = "ak", desc = "(Lor;II)Lbp;")
	public static Class42 method820(Class382 var0, int var1, int var2) {
		byte[] var3 = var0.method7216(var1, var2);
		return var3 == null ? null : new Class42(new Class521(var3));
	}
}
