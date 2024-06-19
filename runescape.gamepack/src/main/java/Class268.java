public class Class268 implements Class298 {
	public int field2972;
	public int field2973;
	public int field2974;
	public int field2975;
	public int field2976;
	public int field2977;
	public int field2978;
	public int field2979;
	public int field2981;
	public int field2984;

	public void method5354(Class286 var1) {
		if (var1.field3135 > this.field2976) {
			var1.field3135 = this.field2976;
		}

		if (var1.field3136 < this.field2976) {
			var1.field3136 = this.field2976;
		}

		if (var1.field3134 > this.field2977) {
			var1.field3134 = this.field2977;
		}

		if (var1.field3129 < this.field2977) {
			var1.field3129 = this.field2977;
		}

	}

	public boolean method5327(int var1, int var2, int var3) {
		if (var1 >= this.field2973 && var1 < this.field2973 + this.field2978) {
			return var2 >= (this.field2974 << 3) + (this.field2975 << 6) && var2 <= 7 + (this.field2975 << 6) + (this.field2974 << 3) && var3 >= (this.field2979 << 3) + (this.field2972 << 6) && var3 <= (this.field2972 << 6) + (this.field2979 << 3) + 7;
		} else {
			return false;
		}
	}

	public boolean method5348(int var1, int var2) {
		return var1 >= (this.field2976 << 6) + (this.field2984 << 3) && var1 <= (this.field2984 << 3) + (this.field2976 << 6) + 7 && var2 >= (this.field2981 << 3) + (this.field2977 << 6) && var2 <= (this.field2981 << 3) + (this.field2977 << 6) + 7;
	}

	public int[] method5329(int var1, int var2, int var3) {
		if (!this.method5327(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{var2 + (this.field2976 * 64 - this.field2975 * 64) + (this.field2984 * 8 - this.field2974 * 8), var3 + (this.field2977 * 64 - this.field2972 * 64) + (this.field2981 * 8 - this.field2979 * 8)};
			return var5;
		}
	}

	public Class348 method5330(int var1, int var2) {
		if (!this.method5348(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2975 * 64 - this.field2976 * 64 + var1 + (this.field2974 * 8 - this.field2984 * 8);
			int var5 = this.field2979 * 8 - this.field2981 * 8 + this.field2972 * 64 - this.field2977 * 64 + var2;
			return new Class348(this.field2973, var4, var5);
		}
	}

	public void method5349(Class521 var1) {
		this.field2973 = var1.method9405();
		this.field2978 = var1.method9405();
		this.field2975 = var1.method9407();
		this.field2974 = var1.method9405();
		this.field2972 = var1.method9407();
		this.field2979 = var1.method9405();
		this.field2976 = var1.method9407();
		this.field2984 = var1.method9405();
		this.field2977 = var1.method9407();
		this.field2981 = var1.method9405();
		this.method5332();
	}

	public void method5332() {
	}

	public static int method5356(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
