public class Class285 implements Class298 {
	public int field3116;
	public int field3117;
	public int field3119;
	public int field3120;
	public int field3121;
	public int field3122;
	public int field3123;
	public int field3124;
	public int field3125;
	public int field3126;

	public void method5354(Class286 var1) {
		if (var1.field3135 > this.field3117) {
			var1.field3135 = this.field3117;
		}

		if (var1.field3136 < this.field3124) {
			var1.field3136 = this.field3124;
		}

		if (var1.field3134 > this.field3122) {
			var1.field3134 = this.field3122;
		}

		if (var1.field3129 < this.field3125) {
			var1.field3129 = this.field3125;
		}

	}

	public boolean method5327(int var1, int var2, int var3) {
		if (var1 >= this.field3123 && var1 < this.field3123 + this.field3119) {
			return var2 >> 6 >= this.field3126 && var2 >> 6 <= this.field3120 && var3 >> 6 >= this.field3116 && var3 >> 6 <= this.field3121;
		} else {
			return false;
		}
	}

	public boolean method5348(int var1, int var2) {
		return var1 >> 6 >= this.field3117 && var1 >> 6 <= this.field3124 && var2 >> 6 >= this.field3122 && var2 >> 6 <= this.field3125;
	}

	public int[] method5329(int var1, int var2, int var3) {
		if (!this.method5327(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{var2 + (this.field3117 * 64 - this.field3126 * 64), this.field3122 * 64 - this.field3116 * 64 + var3};
			return var5;
		}
	}

	public Class348 method5330(int var1, int var2) {
		if (!this.method5348(var1, var2)) {
			return null;
		} else {
			int var4 = var1 + (this.field3126 * 64 - this.field3117 * 64);
			int var5 = var2 + (this.field3116 * 64 - this.field3122 * 64);
			return new Class348(this.field3123, var4, var5);
		}
	}

	public void method5349(Class521 var1) {
		this.field3123 = var1.method9405();
		this.field3119 = var1.method9405();
		this.field3126 = var1.method9407();
		this.field3116 = var1.method9407();
		this.field3120 = var1.method9407();
		this.field3121 = var1.method9407();
		this.field3117 = var1.method9407();
		this.field3122 = var1.method9407();
		this.field3124 = var1.method9407();
		this.field3125 = var1.method9407();
		this.method5756();
	}

	public void method5756() {
	}

	public static Class256 method5753(byte var0) {
		Class256[] var2 = Class256.field2708;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Class256 var4 = var2[var3];
			if (var4.field2707 == var0) {
				return var4;
			}
		}

		throw new RuntimeException("Could not find MoveSpeed with ID " + var0);
	}
}
