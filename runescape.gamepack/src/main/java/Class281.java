public class Class281 extends Class303 {
	public int field3100;
	public int field3101;
	public int field3102;
	public int field3103;

	public void method5696(Class521 var1) {
		int var3 = var1.method9405();
		if (var3 != Class300.field3201.field3202) {
			throw new IllegalStateException("");
		} else {
			super.field3214 = var1.method9405();
			super.field3215 = var1.method9405();
			super.field3212 = var1.method9407();
			super.field3211 = var1.method9407();
			this.field3101 = var1.method9405();
			this.field3103 = var1.method9405();
			super.field3223 = var1.method9407();
			super.field3213 = var1.method9407();
			this.field3102 = var1.method9405();
			this.field3100 = var1.method9405();
			super.field3217 = var1.method9423();
			super.field3216 = var1.method9423();
		}
	}

	public void method5697(Class521 var1) {
		super.field3215 = Math.min(super.field3215, 4);
		super.field3218 = new short[1][64][64];
		super.field3219 = new short[super.field3215][64][64];
		super.field3210 = new byte[super.field3215][64][64];
		super.field3221 = new byte[super.field3215][64][64];
		super.field3222 = new Class291[super.field3215][64][64][];
		int var3 = var1.method9405();
		if (Class293.field3166.field3168 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method9405();
			int var5 = var1.method9405();
			int var6 = var1.method9405();
			int var7 = var1.method9405();
			if (super.field3223 == var4 && var5 == super.field3213 && var6 == this.field3102 && this.field3100 == var7) {
				for (int var8 = 0; var8 < 8; ++var8) {
					for (int var9 = 0; var9 < 8; ++var9) {
						this.method6051(this.field3102 * 8 + var8, this.field3100 * 8 + var9, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof Class281)) {
			return false;
		} else {
			Class281 var2 = (Class281)var1;
			if (var2.field3223 == super.field3223 && var2.field3213 == super.field3213) {
				return this.field3102 == var2.field3102 && this.field3100 == var2.field3100;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.field3223 | super.field3213 << 8 | this.field3102 << 16 | this.field3100 << 24;
	}

	public int method5699() {
		return this.field3101;
	}

	public int method5710() {
		return this.field3103;
	}

	public int method5700() {
		return this.field3102;
	}

	public int method5701() {
		return this.field3100;
	}

	public static Class217 method5716(int var0) {
		Class217 var2 = (Class217)Class217.field2188.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class84.field4601.method7216(11, var0);
			var2 = new Class217();
			if (var3 != null) {
				var2.method4100(new Class521(var3));
			}

			var2.method4099();
			Class217.field2188.method5987(var2, (long)var0);
			return var2;
		}
	}

	public static void method5712(int var0) {
		Client.field577 = var0;
	}
}