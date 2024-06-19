public class Class295 implements Class298 {
	public int field3179;
	public int field3180;
	public int field3181;
	public int field3182;
	public int field3183;
	public int field3184;
	public int field3185;
	public int field3186;
	public int field3187;
	public int field3188;
	public int field3189;
	public int field3190;
	public int field3191;
	public int field3192;

	public void method5354(Class286 var1) {
		if (var1.field3135 > this.field3191) {
			var1.field3135 = this.field3191;
		}

		if (var1.field3136 < this.field3191) {
			var1.field3136 = this.field3191;
		}

		if (var1.field3134 > this.field3184) {
			var1.field3134 = this.field3184;
		}

		if (var1.field3129 < this.field3184) {
			var1.field3129 = this.field3184;
		}

	}

	public boolean method5327(int var1, int var2, int var3) {
		if (var1 >= this.field3181 && var1 < this.field3181 + this.field3180) {
			return var2 >= (this.field3185 << 3) + (this.field3179 << 6) && var2 <= 7 + (this.field3179 << 6) + (this.field3187 << 3) && var3 >= (this.field3186 << 3) + (this.field3182 << 6) && var3 <= 7 + (this.field3182 << 6) + (this.field3188 << 3);
		} else {
			return false;
		}
	}

	public boolean method5348(int var1, int var2) {
		return var1 >= (this.field3189 << 3) + (this.field3191 << 6) && var1 <= (this.field3183 << 3) + (this.field3191 << 6) + 7 && var2 >= (this.field3190 << 3) + (this.field3184 << 6) && var2 <= (this.field3184 << 6) + (this.field3192 << 3) + 7;
	}

	public int[] method5329(int var1, int var2, int var3) {
		if (!this.method5327(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{var2 + (this.field3191 * 64 - this.field3179 * 64) + (this.field3189 * 8 - this.field3185 * 8), var3 + (this.field3184 * 64 - this.field3182 * 64) + (this.field3190 * 8 - this.field3186 * 8)};
			return var5;
		}
	}

	public Class348 method5330(int var1, int var2) {
		if (!this.method5348(var1, var2)) {
			return null;
		} else {
			int var4 = this.field3185 * 8 - this.field3189 * 8 + var1 + (this.field3179 * 64 - this.field3191 * 64);
			int var5 = var2 + (this.field3182 * 64 - this.field3184 * 64) + (this.field3186 * 8 - this.field3190 * 8);
			return new Class348(this.field3181, var4, var5);
		}
	}

	public void method5349(Class521 var1) {
		this.field3181 = var1.method9405();
		this.field3180 = var1.method9405();
		this.field3179 = var1.method9407();
		this.field3185 = var1.method9405();
		this.field3187 = var1.method9405();
		this.field3182 = var1.method9407();
		this.field3186 = var1.method9405();
		this.field3188 = var1.method9405();
		this.field3191 = var1.method9407();
		this.field3189 = var1.method9405();
		this.field3183 = var1.method9405();
		this.field3184 = var1.method9407();
		this.field3190 = var1.method9405();
		this.field3192 = var1.method9405();
		this.method5916();
	}

	public void method5916() {
	}
}
