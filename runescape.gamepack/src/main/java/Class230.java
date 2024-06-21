import io.runebox.ObfInfo;

@ObfInfo(name = "iv")
public class Class230 extends Class507 {
	@ObfInfo(name = "al", desc = "Llm;")
	public static Class299 field2422;
	@ObfInfo(name = "af", desc = "Z")
	public boolean field2420;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1508869635)
	public int field2418;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 448604885)
	public int field2419;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -258030593)
	public int field2423;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -216947469)
	public int field2424;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -2000576281)
	public int field2425;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -983409521)
	public int field2426;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 311593259)
	public int field2427;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 348384781)
	public int field2429;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 776889423)
	public int field2431;

	static {
		field2422 = new Class299(64);
	}

	public Class230() {
		this.field2418 = 0;
		this.field2429 = -1;
		this.field2420 = true;
		this.field2419 = -1;
	}

	@ObfInfo(name = "al", desc = "(I)V")
	public void method4394() {
		if (-1 != this.field2419) {
			this.method4404(this.field2419);
			this.field2431 = this.field2425;
			this.field2426 = this.field2423;
			this.field2427 = this.field2424;
		}

		this.method4404(this.field2418);
	}

	@ObfInfo(name = "aj", desc = "(Lua;IB)V")
	public void method4393(Class521 var1, int var2) {
		while (true) {
			int var4 = var1.method9405();
			if (var4 == 0) {
				return;
			}

			this.method4395(var1, var4, var2);
		}
	}

	@ObfInfo(name = "az", desc = "(Lua;IIB)V", opaque = "36")
	public void method4395(Class521 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field2418 = var1.method9399();
		} else if (var2 == 2) {
			this.field2429 = var1.method9405();
		} else if (var2 == 5) {
			this.field2420 = false;
		} else if (var2 == 7) {
			this.field2419 = var1.method9399();
		} else if (var2 == 8) {
		}

	}

	@ObfInfo(name = "af", desc = "(II)V", opaque = "-1679585992")
	public void method4404(int var1) {
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
		double var17 = (var11 + var9) / 2.0D;
		if (var11 != var9) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var9 + var11);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var11 == var3) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var5 == var11) {
				var13 = 2.0D + (var7 - var3) / (var11 - var9);
			} else if (var7 == var11) {
				var13 = 4.0D + (var3 - var5) / (var11 - var9);
			}
		}

		var13 /= 6.0D;
		this.field2425 = (int)(256.0D * var13);
		this.field2423 = (int)(256.0D * var15);
		this.field2424 = (int)(256.0D * var17);
		if (this.field2423 < 0) {
			this.field2423 = 0;
		} else if (this.field2423 > 255) {
			this.field2423 = 255;
		}

		if (this.field2424 < 0) {
			this.field2424 = 0;
		} else if (this.field2424 > 255) {
			this.field2424 = 255;
		}

	}

	@ObfInfo(desc = "(LClass382;)V")
	public static void method3042(Class382 var0) {
		Class93.field2417 = var0;
	}
}
