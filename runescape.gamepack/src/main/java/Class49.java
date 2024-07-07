import io.runebox.ObfInfo;

@ObfInfo(name = "bw")
public class Class49 {
	@ObfInfo(name = "ad", desc = "[Lch;")
	public Class60[] field313;
	@ObfInfo(name = "ak", desc = "I")
	public int field314;
	@ObfInfo(name = "ag", desc = "I")
	public int field315;

	public Class49(Class562 var1) {
		this.field313 = new Class60[10];

		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.method9902();
			if (var3 != 0) {
				--var1.field5471;
				this.field313[var2] = new Class60();
				this.field313[var2].method1197(var1);
			}
		}

		this.field315 = var1.method9997();
		this.field314 = var1.method9997();
	}

	@ObfInfo(name = "ad", desc = "()Lbl;")
	public Class38 method869() {
		byte[] var1 = this.method879();
		return new Class38(22050, var1, this.field315 * 22050 / 1000, this.field314 * 22050 / 1000);
	}

	@ObfInfo(name = "ag", desc = "()I")
	public final int method870() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field313[var2] != null && this.field313[var2].field448 / 20 < var1) {
				var1 = this.field313[var2].field448 / 20;
			}
		}

		if (this.field315 < this.field314 && this.field315 / 20 < var1) {
			var1 = this.field315 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; ++var2) {
				if (this.field313[var2] != null) {
					Class60 var10000 = this.field313[var2];
					var10000.field448 -= var1 * 20;
				}
			}

			if (this.field315 < this.field314) {
				this.field315 -= var1 * 20;
				this.field314 -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	@ObfInfo(name = "ak", desc = "()[B")
	public final byte[] method879() {
		int var1 = 0;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field313[var2] != null && this.field313[var2].field432 + this.field313[var2].field448 > var1) {
				var1 = this.field313[var2].field432 + this.field313[var2].field448;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			var2 = var1 * 22050 / 1000;
			byte[] var3 = new byte[var2];

			for (int var4 = 0; var4 < 10; ++var4) {
				if (this.field313[var4] != null) {
					int var5 = this.field313[var4].field432 * 22050 / 1000;
					int var6 = this.field313[var4].field448 * 22050 / 1000;
					int[] var7 = this.field313[var4].method1198(var5, this.field313[var4].field432);

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

	@ObfInfo(name = "aq", desc = "(Lok;II)Lbw;")
	public static Class49 method880(Class375 var0, int var1, int var2) {
		byte[] var3 = var0.method7132(var1, var2);
		return var3 == null ? null : new Class49(new Class562(var3));
	}
}
