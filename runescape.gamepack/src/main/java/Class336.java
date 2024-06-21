import io.runebox.ObfInfo;

@ObfInfo(name = "mx")
public class Class336 {
	@ObfInfo(name = "ao", desc = "[B")
	public static final byte[] field3519;
	@ObfInfo(name = "ak", desc = "Lua;")
	public Class521 field3517;
	@ObfInfo(name = "al", desc = "I")
	public int field3511;
	@ObfInfo(name = "at", desc = "I")
	public int field3516;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field3512;
	@ObfInfo(name = "af", desc = "[I")
	public int[] field3514;
	@ObfInfo(name = "aa", desc = "[I")
	public int[] field3515;
	@ObfInfo(name = "az", desc = "[I")
	public int[] field3522;
	@ObfInfo(name = "ac", desc = "J")
	public long field3518;

	static {
		field3519 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	public Class336() {
		this.field3517 = new Class521((byte[])null);
	}

	@ObfInfo(name = "ak", desc = "([B)V")
	public void method6465(byte[] var1) {
		this.field3517.field5221 = var1;
		this.field3517.field5219 = 10;
		int var2 = this.field3517.method9407();
		this.field3511 = this.field3517.method9407();
		this.field3516 = 500000;
		this.field3512 = new int[var2];

		Class521 var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.field5219 += var5) {
			int var4 = this.field3517.method9410();
			var5 = this.field3517.method9410();
			if (var4 == 1297379947) {
				this.field3512[var3] = this.field3517.field5219;
				++var3;
			}

			var10000 = this.field3517;
		}

		this.field3518 = 0L;
		this.field3522 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.field3522[var3] = this.field3512[var3];
		}

		this.field3514 = new int[var2];
		this.field3515 = new int[var2];
	}

	@ObfInfo(name = "al", desc = "()V")
	public void method6459() {
		this.field3517.field5221 = null;
		this.field3512 = null;
		this.field3522 = null;
		this.field3514 = null;
		this.field3515 = null;
	}

	@ObfInfo(name = "aj", desc = "()Z")
	public boolean method6448() {
		return this.field3517.field5221 != null;
	}

	@ObfInfo(name = "az", desc = "()I")
	public int method6449() {
		return this.field3522.length;
	}

	@ObfInfo(name = "af", desc = "(I)V")
	public void method6450(int var1) {
		this.field3517.field5219 = this.field3522[var1];
	}

	@ObfInfo(name = "aa", desc = "(I)V")
	public void method6451(int var1) {
		this.field3522[var1] = this.field3517.field5219;
	}

	@ObfInfo(name = "at", desc = "()V")
	public void method6473() {
		this.field3517.field5219 = -1;
	}

	@ObfInfo(name = "ab", desc = "(I)V")
	public void method6447(int var1) {
		int var2 = this.field3517.method9424();
		int[] var10000 = this.field3514;
		var10000[var1] += var2;
	}

	@ObfInfo(name = "ac", desc = "(I)I")
	public int method6453(int var1) {
		int var2 = this.method6454(var1);
		return var2;
	}

	@ObfInfo(name = "ao", desc = "(I)I")
	public int method6454(int var1) {
		byte var2 = this.field3517.field5221[this.field3517.field5219];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.field3515[var1] = var5;
			++this.field3517.field5219;
		} else {
			var5 = this.field3515[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.method6472(var1, var5);
		} else {
			int var3 = this.field3517.method9424();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.field3517.field5221[this.field3517.field5219] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					++this.field3517.field5219;
					this.field3515[var1] = var4;
					return this.method6472(var1, var4);
				}
			}

			Class521 var10000 = this.field3517;
			var10000.field5219 += var3;
			return 0;
		}
	}

	@ObfInfo(name = "ah", desc = "(II)I")
	public int method6472(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.field3517.method9405();
			var4 = this.field3517.method9424();
			Class521 var10000;
			if (var7 == 47) {
				var10000 = this.field3517;
				var10000.field5219 += var4;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.field3517.method9399();
				var4 -= 3;
				int var6 = this.field3514[var1];
				this.field3518 += (long)var6 * (long)(this.field3516 - var5);
				this.field3516 = var5;
				var10000 = this.field3517;
				var10000.field5219 += var4;
				return 2;
			} else {
				var10000 = this.field3517;
				var10000.field5219 += var4;
				return 3;
			}
		} else {
			byte var3 = field3519[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.field3517.method9405() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.field3517.method9405() << 16;
			}

			return var4;
		}
	}

	@ObfInfo(name = "av", desc = "(I)J")
	public long method6446(int var1) {
		return this.field3518 + (long)var1 * (long)this.field3516;
	}

	@ObfInfo(name = "aq", desc = "()I")
	public int method6457() {
		int var1 = this.field3522.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; ++var4) {
			if (this.field3522[var4] >= 0 && this.field3514[var4] < var3) {
				var2 = var4;
				var3 = this.field3514[var4];
			}
		}

		return var2;
	}

	@ObfInfo(name = "ap", desc = "()Z")
	public boolean method6481() {
		int var1 = this.field3522.length;

		for (int var2 = 0; var2 < var1; ++var2) {
			if (this.field3522[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	@ObfInfo(name = "ae", desc = "(J)V")
	public void method6474(long var1) {
		this.field3518 = var1;
		int var3 = this.field3522.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field3514[var4] = 0;
			this.field3515[var4] = 0;
			this.field3517.field5219 = this.field3512[var4];
			this.method6447(var4);
			this.field3522[var4] = this.field3517.field5219;
		}

	}
}
