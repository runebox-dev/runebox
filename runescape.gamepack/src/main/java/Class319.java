import io.runebox.ObfInfo;

@ObfInfo(name = "mg")
public class Class319 {
	@ObfInfo(name = "ai", desc = "[B")
	public static final byte[] field3344;
	@ObfInfo(name = "aq", desc = "Lvp;")
	public Class562 field3334;
	@ObfInfo(name = "ad", desc = "I")
	public int field3335;
	@ObfInfo(name = "aj", desc = "I")
	public int field3345;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field3336;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field3337;
	@ObfInfo(name = "ap", desc = "[I")
	public int[] field3339;
	@ObfInfo(name = "an", desc = "[I")
	public int[] field3340;
	@ObfInfo(name = "ab", desc = "J")
	public long field3338;

	static {
		field3344 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	public Class319() {
		this.field3334 = new Class562((byte[])null);
	}

	@ObfInfo(name = "aq", desc = "([B)V")
	public void method6246(byte[] var1) {
		this.field3334.field5472 = var1;
		this.field3334.field5471 = 10;
		int var2 = this.field3334.method9997();
		this.field3335 = this.field3334.method9997();
		this.field3345 = 500000;
		this.field3336 = new int[var2];

		Class562 var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.field5471 += var5) {
			int var4 = this.field3334.method9832();
			var5 = this.field3334.method9832();
			if (var4 == 1297379947) {
				this.field3336[var3] = this.field3334.field5471;
				++var3;
			}

			var10000 = this.field3334;
		}

		this.field3338 = 0L;
		this.field3337 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.field3337[var3] = this.field3336[var3];
		}

		this.field3339 = new int[var2];
		this.field3340 = new int[var2];
	}

	@ObfInfo(name = "ad", desc = "()V")
	public void method6232() {
		this.field3334.field5472 = null;
		this.field3336 = null;
		this.field3337 = null;
		this.field3339 = null;
		this.field3340 = null;
	}

	@ObfInfo(name = "ag", desc = "()Z")
	public boolean method6233() {
		return this.field3334.field5472 != null;
	}

	@ObfInfo(name = "ak", desc = "()I")
	public int method6236() {
		return this.field3337.length;
	}

	@ObfInfo(name = "ap", desc = "(I)V")
	public void method6278(int var1) {
		this.field3334.field5471 = this.field3337[var1];
	}

	@ObfInfo(name = "an", desc = "(I)V")
	public void method6259(int var1) {
		this.field3337[var1] = this.field3334.field5471;
	}

	@ObfInfo(name = "aj", desc = "()V")
	public void method6237() {
		this.field3334.field5471 = -1;
	}

	@ObfInfo(name = "av", desc = "(I)V")
	public void method6273(int var1) {
		int var2 = this.field3334.method9948();
		int[] var10000 = this.field3339;
		var10000[var1] += var2;
	}

	@ObfInfo(name = "ab", desc = "(I)I")
	public int method6239(int var1) {
		int var2 = this.method6247(var1);
		return var2;
	}

	@ObfInfo(name = "ai", desc = "(I)I")
	public int method6247(int var1) {
		byte var2 = this.field3334.field5472[this.field3334.field5471];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.field3340[var1] = var5;
			++this.field3334.field5471;
		} else {
			var5 = this.field3340[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.method6241(var1, var5);
		} else {
			int var3 = this.field3334.method9948();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.field3334.field5472[this.field3334.field5471] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					++this.field3334.field5471;
					this.field3340[var1] = var4;
					return this.method6241(var1, var4);
				}
			}

			Class562 var10000 = this.field3334;
			var10000.field5471 += var3;
			return 0;
		}
	}

	@ObfInfo(name = "ae", desc = "(II)I")
	public int method6241(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.field3334.method9902();
			var4 = this.field3334.method9948();
			Class562 var10000;
			if (var7 == 47) {
				var10000 = this.field3334;
				var10000.field5471 += var4;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.field3334.method9830();
				var4 -= 3;
				int var6 = this.field3339[var1];
				this.field3338 += (long)var6 * (long)(this.field3345 - var5);
				this.field3345 = var5;
				var10000 = this.field3334;
				var10000.field5471 += var4;
				return 2;
			} else {
				var10000 = this.field3334;
				var10000.field5471 += var4;
				return 3;
			}
		} else {
			byte var3 = field3344[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.field3334.method9902() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.field3334.method9902() << 16;
			}

			return var4;
		}
	}

	@ObfInfo(name = "au", desc = "(I)J")
	public long method6242(int var1) {
		return this.field3338 + (long)var1 * (long)this.field3345;
	}

	@ObfInfo(name = "ah", desc = "()I")
	public int method6243() {
		int var1 = this.field3337.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; ++var4) {
			if (this.field3337[var4] >= 0 && this.field3339[var4] < var3) {
				var2 = var4;
				var3 = this.field3339[var4];
			}
		}

		return var2;
	}

	@ObfInfo(name = "az", desc = "()Z")
	public boolean method6244() {
		int var1 = this.field3337.length;

		for (int var2 = 0; var2 < var1; ++var2) {
			if (this.field3337[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	@ObfInfo(name = "ax", desc = "(J)V")
	public void method6245(long var1) {
		this.field3338 = var1;
		int var3 = this.field3337.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field3339[var4] = 0;
			this.field3340[var4] = 0;
			this.field3334.field5471 = this.field3336[var4];
			this.method6273(var4);
			this.field3337[var4] = this.field3334.field5471;
		}

	}
}
