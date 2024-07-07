import io.runebox.ObfInfo;

@ObfInfo(name = "ky")
public class Class285 implements Class298 {
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1017322657)
	public int field3116;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1674055677)
	public int field3117;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 67806907)
	public int field3119;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1093060133)
	public int field3120;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -2090173435)
	public int field3121;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 701348013)
	public int field3122;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1175493055)
	public int field3123;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1838745981)
	public int field3124;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1496156289)
	public int field3125;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1274329653)
	public int field3126;

	@ObfInfo(name = "ak", desc = "(Lkz;I)V", opaque = "795611668")
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

	@ObfInfo(name = "al", desc = "(IIII)Z", opaque = "-1194566834")
	public boolean method5327(int var1, int var2, int var3) {
		if (var1 >= this.field3123 && var1 < this.field3123 + this.field3119) {
			return var2 >> 6 >= this.field3126 && var2 >> 6 <= this.field3120 && var3 >> 6 >= this.field3116 && var3 >> 6 <= this.field3121;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "aj", desc = "(III)Z", opaque = "1114654110")
	public boolean method5348(int var1, int var2) {
		return var1 >> 6 >= this.field3117 && var1 >> 6 <= this.field3124 && var2 >> 6 >= this.field3122 && var2 >> 6 <= this.field3125;
	}

	@ObfInfo(name = "az", desc = "(IIII)[I", opaque = "-1353943887")
	public int[] method5329(int var1, int var2, int var3) {
		if (!this.method5327(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{var2 + (this.field3117 * 64 - this.field3126 * 64), this.field3122 * 64 - this.field3116 * 64 + var3};
			return var5;
		}
	}

	@ObfInfo(name = "af", desc = "(III)Lnj;", opaque = "-2116954761")
	public Class348 method5330(int var1, int var2) {
		if (!this.method5348(var1, var2)) {
			return null;
		} else {
			int var4 = var1 + (this.field3126 * 64 - this.field3117 * 64);
			int var5 = var2 + (this.field3116 * 64 - this.field3122 * 64);
			return new Class348(this.field3123, var4, var5);
		}
	}

	@ObfInfo(name = "aa", desc = "(Lua;B)V")
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

	@ObfInfo(name = "at", desc = "(B)V")
	public void method5756() {
	}
}
