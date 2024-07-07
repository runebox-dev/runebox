import io.runebox.ObfInfo;

@ObfInfo(name = "ie")
public class Class213 extends Class516 {
	@ObfInfo(name = "ad", desc = "Lmo;")
	public static Class327 field2312;
	@ObfInfo(name = "ap", desc = "Z")
	public boolean field2315;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1868876849)
	public int field2307;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1211510327)
	public int field2308;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 2130195297)
	public int field2309;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 940491185)
	public int field2310;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 899009769)
	public int field2311;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 398762743)
	public int field2313;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 992973643)
	public int field2314;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 641939819)
	public int field2316;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 893402431)
	public int field2317;

	static {
		field2312 = new Class327(64);
	}

	public Class213() {
		this.field2309 = 0;
		this.field2307 = -1;
		this.field2315 = true;
		this.field2313 = -1;
	}

	@ObfInfo(name = "ad", desc = "(I)V", opaque = "2009375911")
	public void method4073() {
		if (-1 != this.field2313) {
			this.method4083(this.field2313);
			this.field2316 = this.field2311;
			this.field2317 = this.field2310;
			this.field2308 = this.field2314;
		}

		this.method4083(this.field2309);
	}

	@ObfInfo(name = "ag", desc = "(Lvp;II)V", opaque = "-1711012472")
	public void method4074(Class562 var1, int var2) {
		while (true) {
			int var4 = var1.method9902();
			if (var4 == 0) {
				return;
			}

			this.method4081(var1, var4, var2);
		}
	}

	@ObfInfo(name = "ak", desc = "(Lvp;III)V", opaque = "-2053989642")
	public void method4081(Class562 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field2309 = var1.method9830();
		} else if (var2 == 2) {
			this.field2307 = var1.method9902();
		} else if (var2 == 5) {
			this.field2315 = false;
		} else if (var2 == 7) {
			this.field2313 = var1.method9830();
		} else if (var2 == 8) {
		}

	}

	@ObfInfo(name = "ap", desc = "(II)V", opaque = "574291474")
	public void method4083(int var1) {
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
		if (var9 != var11) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var11 + var9);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var3 == var11) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var11 == var5) {
				var13 = (var7 - var3) / (var11 - var9) + 2.0D;
			} else if (var7 == var11) {
				var13 = 4.0D + (var3 - var5) / (var11 - var9);
			}
		}

		var13 /= 6.0D;
		this.field2311 = (int)(256.0D * var13);
		this.field2310 = (int)(256.0D * var15);
		this.field2314 = (int)(var17 * 256.0D);
		if (this.field2310 < 0) {
			this.field2310 = 0;
		} else if (this.field2310 > 255) {
			this.field2310 = 255;
		}

		if (this.field2314 < 0) {
			this.field2314 = 0;
		} else if (this.field2314 > 255) {
			this.field2314 = 255;
		}

	}

	@ObfInfo(owner = "co", name = "aq", desc = "(IB)Lie;", opaque = "1")
	public static Class213 method1943(int var0) {
		Class213 var2 = (Class213)field2312.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field2318.method7132(4, var0);
			var2 = new Class213();
			if (var3 != null) {
				var2.method4074(new Class562(var3), var0);
			}

			var2.method4073();
			field2312.method6330(var2, (long)var0);
			return var2;
		}
	}
}
