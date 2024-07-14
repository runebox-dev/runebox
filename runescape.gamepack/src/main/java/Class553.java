import io.runebox.ObfInfo;

@ObfInfo(name = "vg")
public final class Class553 extends Class569 {
	@ObfInfo(name = "ap", desc = "I")
	public int field5420;
	@ObfInfo(name = "ad", desc = "I")
	public int field5421;
	@ObfInfo(name = "ak", desc = "I")
	public int field5423;
	@ObfInfo(name = "ag", desc = "I")
	public int field5424;
	@ObfInfo(name = "an", desc = "I")
	public int field5425;
	@ObfInfo(name = "aj", desc = "I")
	public int field5426;
	@ObfInfo(name = "aq", desc = "[I")
	public int[] field5429;

	public Class553() {
	}

	public Class553(int var1, int var2) {
		this(new int[var1 * var2], var1, var2);
	}

	public Class553(int[] var1, int var2, int var3) {
		this.field5429 = var1;
		this.field5421 = this.field5425 = var2;
		this.field5424 = this.field5426 = var3;
		this.field5420 = 0;
		this.field5423 = 0;
	}

	@ObfInfo(name = "aq", desc = "()Lvg;")
	public Class553 method9594() {
		Class553 var1 = new Class553(this.field5421, this.field5424);
		var1.field5425 = this.field5425;
		var1.field5426 = this.field5426;
		var1.field5423 = this.field5425 - this.field5421 - this.field5423;
		var1.field5420 = this.field5420;

		for (int var2 = 0; var2 < this.field5424; ++var2) {
			for (int var3 = 0; var3 < this.field5421; ++var3) {
				var1.field5429[this.field5421 * var2 + var3] = this.field5429[this.field5421 * var2 + this.field5421 - 1 - var3];
			}
		}

		return var1;
	}

	@ObfInfo(name = "ad", desc = "()Lvg;")
	public Class553 method9595() {
		Class553 var1 = new Class553(this.field5421, this.field5424);
		var1.field5425 = this.field5425;
		var1.field5426 = this.field5426;
		var1.field5423 = this.field5423;
		var1.field5420 = this.field5420;
		int var2 = this.field5429.length;

		for (int var3 = 0; var3 < var2; ++var3) {
			var1.field5429[var3] = this.field5429[var3];
		}

		return var1;
	}

	@ObfInfo(name = "ag", desc = "()Lvg;")
	public Class553 method9596() {
		Class553 var1 = new Class553(this.field5425, this.field5426);

		for (int var2 = 0; var2 < this.field5424; ++var2) {
			for (int var3 = 0; var3 < this.field5421; ++var3) {
				var1.field5429[(this.field5420 + var2) * this.field5425 + this.field5423 + var3] = this.field5429[this.field5421 * var2 + var3];
			}
		}

		return var1;
	}

	@ObfInfo(name = "ak", desc = "()V")
	public void method9597() {
		method10146(this.field5429, this.field5421, this.field5424, (float[])null);
	}

	@ObfInfo(name = "ap", desc = "()V")
	public void method9598() {
		if (this.field5425 != this.field5421 || this.field5426 != this.field5424) {
			int[] var1 = new int[this.field5426 * this.field5425];

			for (int var2 = 0; var2 < this.field5424; ++var2) {
				for (int var3 = 0; var3 < this.field5421; ++var3) {
					var1[(this.field5420 + var2) * this.field5425 + this.field5423 + var3] = this.field5429[this.field5421 * var2 + var3];
				}
			}

			this.field5429 = var1;
			this.field5421 = this.field5425;
			this.field5424 = this.field5426;
			this.field5423 = 0;
			this.field5420 = 0;
		}
	}

	@ObfInfo(name = "an", desc = "(I)V")
	public void method9599(int var1) {
		if (this.field5425 != this.field5421 || this.field5426 != this.field5424) {
			int var2 = var1;
			if (var1 > this.field5423) {
				var2 = this.field5423;
			}

			int var3 = var1;
			if (this.field5423 + var1 + this.field5421 > this.field5425) {
				var3 = this.field5425 - this.field5423 - this.field5421;
			}

			int var4 = var1;
			if (var1 > this.field5420) {
				var4 = this.field5420;
			}

			int var5 = var1;
			if (this.field5420 + var1 + this.field5424 > this.field5426) {
				var5 = this.field5426 - this.field5420 - this.field5424;
			}

			int var6 = this.field5421 + var2 + var3;
			int var7 = this.field5424 + var4 + var5;
			int[] var8 = new int[var6 * var7];

			for (int var9 = 0; var9 < this.field5424; ++var9) {
				for (int var10 = 0; var10 < this.field5421; ++var10) {
					var8[(var4 + var9) * var6 + var2 + var10] = this.field5429[this.field5421 * var9 + var10];
				}
			}

			this.field5429 = var8;
			this.field5421 = var6;
			this.field5424 = var7;
			this.field5423 -= var2;
			this.field5420 -= var4;
		}
	}

	@ObfInfo(name = "aj", desc = "()V")
	public void method9600() {
		int[] var1 = new int[this.field5424 * this.field5421];
		int var2 = 0;

		for (int var3 = 0; var3 < this.field5424; ++var3) {
			for (int var4 = this.field5421 - 1; var4 >= 0; --var4) {
				var1[var2++] = this.field5429[this.field5421 * var3 + var4];
			}
		}

		this.field5429 = var1;
		this.field5423 = this.field5425 - this.field5421 - this.field5423;
	}

	@ObfInfo(name = "av", desc = "()V")
	public void method9601() {
		int[] var1 = new int[this.field5424 * this.field5421];
		int var2 = 0;

		for (int var3 = this.field5424 - 1; var3 >= 0; --var3) {
			for (int var4 = 0; var4 < this.field5421; ++var4) {
				var1[var2++] = this.field5429[this.field5421 * var3 + var4];
			}
		}

		this.field5429 = var1;
		this.field5420 = this.field5426 - this.field5424 - this.field5420;
	}

	@ObfInfo(name = "ab", desc = "(I)V")
	public void method9657(int var1) {
		int[] var2 = new int[this.field5424 * this.field5421];
		int var3 = 0;

		for (int var4 = 0; var4 < this.field5424; ++var4) {
			for (int var5 = 0; var5 < this.field5421; ++var5) {
				int var6 = this.field5429[var3];
				if (var6 == 0) {
					if (var5 > 0 && this.field5429[var3 - 1] != 0) {
						var6 = var1;
					} else if (var4 > 0 && this.field5429[var3 - this.field5421] != 0) {
						var6 = var1;
					} else if (var5 < this.field5421 - 1 && this.field5429[var3 + 1] != 0) {
						var6 = var1;
					} else if (var4 < this.field5424 - 1 && this.field5429[this.field5421 + var3] != 0) {
						var6 = var1;
					}
				}

				var2[var3++] = var6;
			}
		}

		this.field5429 = var2;
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	public void method9603(int var1) {
		for (int var2 = this.field5424 - 1; var2 > 0; --var2) {
			int var3 = this.field5421 * var2;

			for (int var4 = this.field5421 - 1; var4 > 0; --var4) {
				if (this.field5429[var3 + var4] == 0 && this.field5429[var3 + var4 - 1 - this.field5421] != 0) {
					this.field5429[var3 + var4] = var1;
				}
			}
		}

	}

	@ObfInfo(name = "ae", desc = "(II)V")
	public void method9636(int var1, int var2) {
		var1 += this.field5423;
		var2 += this.field5420;
		int var3 = Class88.field5502 * var2 + var1;
		int var4 = 0;
		int var5 = this.field5424;
		int var6 = this.field5421;
		int var7 = Class88.field5502 - var6;
		int var8 = 0;
		int var9;
		if (var2 < Class569.field5505) {
			var9 = Class569.field5505 - var2;
			var5 -= var9;
			var2 = Class569.field5505;
			var4 += var6 * var9;
			var3 += Class88.field5502 * var9;
		}

		if (var2 + var5 > Class569.field5507) {
			var5 -= var2 + var5 - Class569.field5507;
		}

		if (var1 < Class569.field5508) {
			var9 = Class569.field5508 - var1;
			var6 -= var9;
			var1 = Class569.field5508;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var1 + var6 > Class569.field5509) {
			var9 = var1 + var6 - Class569.field5509;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			method9605(Class569.field5504, this.field5429, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfInfo(name = "ah", desc = "(II)V")
	public void method9628(int var1, int var2) {
		var1 += this.field5423;
		var2 += this.field5420;
		int var3 = Class88.field5502 * var2 + var1;
		int var4 = 0;
		int var5 = this.field5424;
		int var6 = this.field5421;
		int var7 = Class88.field5502 - var6;
		int var8 = 0;
		int var9;
		if (var2 < Class569.field5505) {
			var9 = Class569.field5505 - var2;
			var5 -= var9;
			var2 = Class569.field5505;
			var4 += var6 * var9;
			var3 += Class88.field5502 * var9;
		}

		if (var2 + var5 > Class569.field5507) {
			var5 -= var2 + var5 - Class569.field5507;
		}

		if (var1 < Class569.field5508) {
			var9 = Class569.field5508 - var1;
			var6 -= var9;
			var1 = Class569.field5508;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var1 + var6 > Class569.field5509) {
			var9 = var1 + var6 - Class569.field5509;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			method9607(Class569.field5504, this.field5429, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfInfo(name = "ax", desc = "(IIII)V")
	public void method9709(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var5 = this.field5421;
			int var6 = this.field5424;
			int var7 = 0;
			int var8 = 0;
			int var9 = this.field5425;
			int var10 = this.field5426;
			int var11 = (var9 << 16) / var3;
			int var12 = (var10 << 16) / var4;
			int var13;
			if (this.field5423 > 0) {
				var13 = ((this.field5423 << 16) + var11 - 1) / var11;
				var1 += var13;
				var7 += var11 * var13 - (this.field5423 << 16);
			}

			if (this.field5420 > 0) {
				var13 = ((this.field5420 << 16) + var12 - 1) / var12;
				var2 += var13;
				var8 += var12 * var13 - (this.field5420 << 16);
			}

			if (var5 < var9) {
				var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
			}

			if (var6 < var10) {
				var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			var13 = Class88.field5502 * var2 + var1;
			int var14 = Class88.field5502 - var3;
			if (var2 + var4 > Class569.field5507) {
				var4 -= var2 + var4 - Class569.field5507;
			}

			int var15;
			if (var2 < Class569.field5505) {
				var15 = Class569.field5505 - var2;
				var4 -= var15;
				var13 += Class88.field5502 * var15;
				var8 += var12 * var15;
			}

			if (var1 + var3 > Class569.field5509) {
				var15 = var1 + var3 - Class569.field5509;
				var3 -= var15;
				var14 += var15;
			}

			if (var1 < Class569.field5508) {
				var15 = Class569.field5508 - var1;
				var3 -= var15;
				var13 += var15;
				var7 += var11 * var15;
				var14 += var15;
			}

			method9609(Class569.field5504, this.field5429, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
		}
	}

	@ObfInfo(name = "al", desc = "(IIII)V")
	public void method9610(int var1, int var2, int var3, int var4) {
		if (var3 == 256) {
			this.method9628(var1, var2);
		} else {
			var1 += this.field5423;
			var2 += this.field5420;
			int var5 = Class88.field5502 * var2 + var1;
			int var6 = 0;
			int var7 = this.field5424;
			int var8 = this.field5421;
			int var9 = Class88.field5502 - var8;
			int var10 = 0;
			int var11;
			if (var2 < Class569.field5505) {
				var11 = Class569.field5505 - var2;
				var7 -= var11;
				var2 = Class569.field5505;
				var6 += var8 * var11;
				var5 += Class88.field5502 * var11;
			}

			if (var2 + var7 > Class569.field5507) {
				var7 -= var2 + var7 - Class569.field5507;
			}

			if (var1 < Class569.field5508) {
				var11 = Class569.field5508 - var1;
				var8 -= var11;
				var1 = Class569.field5508;
				var6 += var11;
				var5 += var11;
				var10 += var11;
				var9 += var11;
			}

			if (var1 + var8 > Class569.field5509) {
				var11 = var1 + var8 - Class569.field5509;
				var8 -= var11;
				var10 += var11;
				var9 += var11;
			}

			if (var8 > 0 && var7 > 0) {
				method9613(Class569.field5504, this.field5429, 0, var6, var5, var8, var7, var9, var10, var3, var4);
			}
		}
	}

	@ObfInfo(name = "ao", desc = "(III)V")
	public void method9625(int var1, int var2, int var3) {
		var1 += this.field5423;
		var2 += this.field5420;
		int var4 = Class88.field5502 * var2 + var1;
		int var5 = 0;
		int var6 = this.field5424;
		int var7 = this.field5421;
		int var8 = Class88.field5502 - var7;
		int var9 = 0;
		int var10;
		if (var2 < Class569.field5505) {
			var10 = Class569.field5505 - var2;
			var6 -= var10;
			var2 = Class569.field5505;
			var5 += var7 * var10;
			var4 += Class88.field5502 * var10;
		}

		if (var2 + var6 > Class569.field5507) {
			var6 -= var2 + var6 - Class569.field5507;
		}

		if (var1 < Class569.field5508) {
			var10 = Class569.field5508 - var1;
			var7 -= var10;
			var1 = Class569.field5508;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var1 + var7 > Class569.field5509) {
			var10 = var1 + var7 - Class569.field5509;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			method9684(Class569.field5504, this.field5429, 0, var5, var4, var7, var6, var8, var9, var3);
		}
	}

	@ObfInfo(name = "as", desc = "(IIIII)V")
	public void method9614(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.field5421;
			int var7 = this.field5424;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.field5425;
			int var11 = this.field5426;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			int var14;
			if (this.field5423 > 0) {
				var14 = ((this.field5423 << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var12 * var14 - (this.field5423 << 16);
			}

			if (this.field5420 > 0) {
				var14 = ((this.field5420 << 16) + var13 - 1) / var13;
				var2 += var14;
				var9 += var13 * var14 - (this.field5420 << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			var14 = Class88.field5502 * var2 + var1;
			int var15 = Class88.field5502 - var3;
			if (var2 + var4 > Class569.field5507) {
				var4 -= var2 + var4 - Class569.field5507;
			}

			int var16;
			if (var2 < Class569.field5505) {
				var16 = Class569.field5505 - var2;
				var4 -= var16;
				var14 += Class88.field5502 * var16;
				var9 += var13 * var16;
			}

			if (var1 + var3 > Class569.field5509) {
				var16 = var1 + var3 - Class569.field5509;
				var3 -= var16;
				var15 += var16;
			}

			if (var1 < Class569.field5508) {
				var16 = Class569.field5508 - var1;
				var3 -= var16;
				var14 += var16;
				var8 += var12 * var16;
				var15 += var16;
			}

			method9615(Class569.field5504, this.field5429, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
		}
	}

	@ObfInfo(name = "at", desc = "(III)V")
	public void method9617(int var1, int var2, int var3) {
		var1 += this.field5423;
		var2 += this.field5420;
		int var4 = Class88.field5502 * var2 + var1;
		int var5 = 0;
		int var6 = this.field5424;
		int var7 = this.field5421;
		int var8 = Class88.field5502 - var7;
		int var9 = 0;
		int var10;
		if (var2 < Class569.field5505) {
			var10 = Class569.field5505 - var2;
			var6 -= var10;
			var2 = Class569.field5505;
			var5 += var7 * var10;
			var4 += Class88.field5502 * var10;
		}

		if (var2 + var6 > Class569.field5507) {
			var6 -= var2 + var6 - Class569.field5507;
		}

		if (var1 < Class569.field5508) {
			var10 = Class569.field5508 - var1;
			var7 -= var10;
			var1 = Class569.field5508;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var1 + var7 > Class569.field5509) {
			var10 = var1 + var7 - Class569.field5509;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			if (var3 == 256) {
				method9611(0, 0, 0, Class569.field5504, this.field5429, var5, 0, var4, 0, var7, var6, var8, var9);
			} else {
				method9618(0, 0, 0, Class569.field5504, this.field5429, var5, 0, var4, 0, var7, var6, var8, var9, var3);
			}

		}
	}

	@ObfInfo(name = "ar", desc = "(IIIII)V")
	public void method9619(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.field5421;
			int var7 = this.field5424;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.field5425;
			int var11 = this.field5426;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			int var14;
			if (this.field5423 > 0) {
				var14 = ((this.field5423 << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var12 * var14 - (this.field5423 << 16);
			}

			if (this.field5420 > 0) {
				var14 = ((this.field5420 << 16) + var13 - 1) / var13;
				var2 += var14;
				var9 += var13 * var14 - (this.field5420 << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			var14 = Class88.field5502 * var2 + var1;
			int var15 = Class88.field5502 - var3;
			if (var2 + var4 > Class569.field5507) {
				var4 -= var2 + var4 - Class569.field5507;
			}

			int var16;
			if (var2 < Class569.field5505) {
				var16 = Class569.field5505 - var2;
				var4 -= var16;
				var14 += Class88.field5502 * var16;
				var9 += var13 * var16;
			}

			if (var1 + var3 > Class569.field5509) {
				var16 = var1 + var3 - Class569.field5509;
				var3 -= var16;
				var15 += var16;
			}

			if (var1 < Class569.field5508) {
				var16 = Class569.field5508 - var1;
				var3 -= var16;
				var14 += var16;
				var8 += var12 * var16;
				var15 += var16;
			}

			if (var5 == 256) {
				method9620(0, 0, 0, var8, this.field5429, Class569.field5504, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
			} else {
				method9621(0, 0, 0, var8, this.field5429, Class569.field5504, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
			}

		}
	}

	@ObfInfo(name = "be", desc = "(IIIIII[I[I)V")
	public void method9676(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
		int var9 = var2 < 0 ? -var2 : 0;
		int var10 = this.field5424 + var2 <= var6 ? this.field5424 : var6 - var2;
		int var11 = var1 < 0 ? -var1 : 0;
		int var10000;
		if (this.field5421 + var1 <= var5) {
			var10000 = this.field5421;
		} else {
			var10000 = var5 - var1;
		}

		int var13 = (var2 + var4 + var9) * Class88.field5502 + var1 + var3 + var11;
		int var14 = var2 + var9;

		for (int var15 = var9; var15 < var10; ++var15) {
			int var16 = var7[var14];
			int var17 = var8[var14++];
			int var18 = var13;
			int var19;
			if (var1 < var16) {
				var19 = var16 - var1;
				var18 = var19 - var11 + var13;
			} else {
				var19 = var11;
			}

			int var12;
			if (this.field5421 + var1 <= var16 + var17) {
				var12 = this.field5421;
			} else {
				var12 = var16 + var17 - var1;
			}

			for (int var20 = var19; var20 < var12; ++var20) {
				int var21 = this.field5429[this.field5421 * var15 + var20];
				if (var21 != 0) {
					Class569.field5504[var18++] = var21;
				} else {
					++var18;
				}
			}

			var13 += Class88.field5502;
		}

	}

	@ObfInfo(name = "bm", desc = "(IIIIIIII[I[I)V")
	public void method9660(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
		try {
			int var11 = -var3 / 2;
			int var12 = -var4 / 2;
			int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
			int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
			var13 = var8 * var13 >> 8;
			var14 = var8 * var14 >> 8;
			int var15 = (var5 << 16) + var11 * var14 + var12 * var13;
			int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
			int var17 = Class88.field5502 * var2 + var1;

			for (var2 = 0; var2 < var4; ++var2) {
				int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var14 * var18 + var15;
				int var21 = var16 - var13 * var18;

				for (var1 = -var10[var2]; var1 < 0; ++var1) {
					Class569.field5504[var19++] = this.field5429[(var20 >> 16) + (var21 >> 16) * this.field5421];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += Class88.field5502;
			}
		} catch (Exception var22) {
		}

	}

	@ObfInfo(name = "bo", desc = "(IIIIIIDI)V")
	public void method9624(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			int var10 = -var3 / 2;
			int var11 = -var4 / 2;
			int var12 = (int)(Math.sin(var7) * 65536.0D);
			int var13 = (int)(Math.cos(var7) * 65536.0D);
			var12 = var9 * var12 >> 8;
			var13 = var9 * var13 >> 8;
			int var14 = (var5 << 16) + var10 * var13 + var11 * var12;
			int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
			int var16 = Class88.field5502 * var2 + var1;

			for (var2 = 0; var2 < var4; ++var2) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0; ++var1) {
					int var20 = this.field5429[(var18 >> 16) + (var19 >> 16) * this.field5421];
					if (var20 != 0) {
						Class569.field5504[var17++] = var20;
					} else {
						++var17;
					}

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += Class88.field5502;
			}
		} catch (Exception var21) {
		}

	}

	@ObfInfo(name = "bi", desc = "(IIII)V")
	public void method9622(int var1, int var2, int var3, int var4) {
		this.method9696(this.field5425 << 3, this.field5426 << 3, var1 << 4, var2 << 4, var3, var4);
	}

	@ObfInfo(name = "ba", desc = "(IIIIII)V")
	public void method9696(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) {
			var1 -= this.field5423 << 4;
			var2 -= this.field5420 << 4;
			double var7 = (double)(var5 & 65535) * 9.587379924285257E-5D;
			int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
			int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
			int var11 = -var1 * var10 + -var2 * var9;
			int var12 = -(-var1) * var9 + -var2 * var10;
			int var13 = ((this.field5421 << 4) - var1) * var10 + -var2 * var9;
			int var14 = -((this.field5421 << 4) - var1) * var9 + -var2 * var10;
			int var15 = ((this.field5424 << 4) - var2) * var9 + -var1 * var10;
			int var16 = ((this.field5424 << 4) - var2) * var10 + -(-var1) * var9;
			int var17 = ((this.field5424 << 4) - var2) * var9 + ((this.field5421 << 4) - var1) * var10;
			int var18 = ((this.field5424 << 4) - var2) * var10 + -((this.field5421 << 4) - var1) * var9;
			int var19;
			int var20;
			if (var11 < var13) {
				var19 = var11;
				var20 = var13;
			} else {
				var19 = var13;
				var20 = var11;
			}

			if (var15 < var19) {
				var19 = var15;
			}

			if (var17 < var19) {
				var19 = var17;
			}

			if (var15 > var20) {
				var20 = var15;
			}

			if (var17 > var20) {
				var20 = var17;
			}

			int var21;
			int var22;
			if (var12 < var14) {
				var21 = var12;
				var22 = var14;
			} else {
				var21 = var14;
				var22 = var12;
			}

			if (var16 < var21) {
				var21 = var16;
			}

			if (var18 < var21) {
				var21 = var18;
			}

			if (var16 > var22) {
				var22 = var16;
			}

			if (var18 > var22) {
				var22 = var18;
			}

			var19 >>= 12;
			var20 = var20 + 4095 >> 12;
			var21 >>= 12;
			var22 = var22 + 4095 >> 12;
			var19 += var3;
			var20 += var3;
			var21 += var4;
			var22 += var4;
			var19 >>= 4;
			var20 = var20 + 15 >> 4;
			var21 >>= 4;
			var22 = var22 + 15 >> 4;
			if (var19 < Class569.field5508) {
				var19 = Class569.field5508;
			}

			if (var20 > Class569.field5509) {
				var20 = Class569.field5509;
			}

			if (var21 < Class569.field5505) {
				var21 = Class569.field5505;
			}

			if (var22 > Class569.field5507) {
				var22 = Class569.field5507;
			}

			var20 = var19 - var20;
			if (var20 < 0) {
				var22 = var21 - var22;
				if (var22 < 0) {
					int var23 = Class88.field5502 * var21 + var19;
					double var24 = 1.6777216E7D / (double)var6;
					int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
					int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
					int var28 = (var19 << 4) + 8 - var3;
					int var29 = (var21 << 4) + 8 - var4;
					int var30 = (var1 << 8) - (var26 * var29 >> 4);
					int var31 = (var2 << 8) + (var27 * var29 >> 4);
					int var32;
					int var33;
					int var34;
					int var36;
					int var37;
					int var38;
					if (var27 == 0) {
						if (var26 == 0) {
							for (var33 = var22; var33 < 0; var23 += Class88.field5502) {
								var34 = var23;
								var37 = var20;
								if (var30 >= 0 && var31 >= 0 && var30 - (this.field5421 << 12) < 0 && var31 - (this.field5424 << 12) < 0) {
									for (; var37 < 0; ++var37) {
										var38 = this.field5429[(var30 >> 12) + (var31 >> 12) * this.field5421];
										if (var38 != 0) {
											Class569.field5504[var34++] = var38;
										} else {
											++var34;
										}
									}
								}

								++var33;
							}
						} else if (var26 < 0) {
							for (var33 = var22; var33 < 0; var23 += Class88.field5502) {
								var34 = var23;
								var36 = (var26 * var28 >> 4) + var31;
								var37 = var20;
								if (var30 >= 0 && var30 - (this.field5421 << 12) < 0) {
									if ((var32 = var36 - (this.field5424 << 12)) >= 0) {
										var32 = (var26 - var32) / var26;
										var37 = var20 + var32;
										var36 += var26 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (var36 - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5429[(var30 >> 12) + (var36 >> 12) * this.field5421];
										if (var38 != 0) {
											Class569.field5504[var34++] = var38;
										} else {
											++var34;
										}

										var36 += var26;
										++var37;
									}
								}

								++var33;
								var30 -= var26;
							}
						} else {
							for (var33 = var22; var33 < 0; var23 += Class88.field5502) {
								var34 = var23;
								var36 = (var26 * var28 >> 4) + var31;
								var37 = var20;
								if (var30 >= 0 && var30 - (this.field5421 << 12) < 0) {
									if (var36 < 0) {
										var32 = (var26 - 1 - var36) / var26;
										var37 = var20 + var32;
										var36 += var26 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (var36 + 1 - (this.field5424 << 12) - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5429[(var30 >> 12) + (var36 >> 12) * this.field5421];
										if (var38 != 0) {
											Class569.field5504[var34++] = var38;
										} else {
											++var34;
										}

										var36 += var26;
										++var37;
									}
								}

								++var33;
								var30 -= var26;
							}
						}
					} else {
						int var35;
						if (var27 < 0) {
							if (var26 == 0) {
								for (var33 = var22; var33 < 0; var23 += Class88.field5502) {
									var34 = var23;
									var35 = (var27 * var28 >> 4) + var30;
									var37 = var20;
									if (var31 >= 0 && var31 - (this.field5424 << 12) < 0) {
										if ((var32 = var35 - (this.field5421 << 12)) >= 0) {
											var32 = (var27 - var32) / var27;
											var37 = var20 + var32;
											var35 += var27 * var32;
											var34 = var23 + var32;
										}

										if ((var32 = (var35 - var27) / var27) > var37) {
											var37 = var32;
										}

										while (var37 < 0) {
											var38 = this.field5429[(var35 >> 12) + (var31 >> 12) * this.field5421];
											if (var38 != 0) {
												Class569.field5504[var34++] = var38;
											} else {
												++var34;
											}

											var35 += var27;
											++var37;
										}
									}

									++var33;
									var31 += var27;
								}
							} else if (var26 < 0) {
								for (var33 = var22; var33 < 0; var23 += Class88.field5502) {
									var34 = var23;
									var35 = (var27 * var28 >> 4) + var30;
									var36 = (var26 * var28 >> 4) + var31;
									var37 = var20;
									if ((var32 = var35 - (this.field5421 << 12)) >= 0) {
										var32 = (var27 - var32) / var27;
										var37 = var20 + var32;
										var35 += var27 * var32;
										var36 += var26 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (var35 - var27) / var27) > var37) {
										var37 = var32;
									}

									if ((var32 = var36 - (this.field5424 << 12)) >= 0) {
										var32 = (var26 - var32) / var26;
										var37 += var32;
										var35 += var27 * var32;
										var36 += var26 * var32;
										var34 += var32;
									}

									if ((var32 = (var36 - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5429[(var35 >> 12) + (var36 >> 12) * this.field5421];
										if (var38 != 0) {
											Class569.field5504[var34++] = var38;
										} else {
											++var34;
										}

										var35 += var27;
										var36 += var26;
										++var37;
									}

									++var33;
									var30 -= var26;
									var31 += var27;
								}
							} else {
								for (var33 = var22; var33 < 0; var23 += Class88.field5502) {
									var34 = var23;
									var35 = (var27 * var28 >> 4) + var30;
									var36 = (var26 * var28 >> 4) + var31;
									var37 = var20;
									if ((var32 = var35 - (this.field5421 << 12)) >= 0) {
										var32 = (var27 - var32) / var27;
										var37 = var20 + var32;
										var35 += var27 * var32;
										var36 += var26 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (var35 - var27) / var27) > var37) {
										var37 = var32;
									}

									if (var36 < 0) {
										var32 = (var26 - 1 - var36) / var26;
										var37 += var32;
										var35 += var27 * var32;
										var36 += var26 * var32;
										var34 += var32;
									}

									if ((var32 = (var36 + 1 - (this.field5424 << 12) - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5429[(var35 >> 12) + (var36 >> 12) * this.field5421];
										if (var38 != 0) {
											Class569.field5504[var34++] = var38;
										} else {
											++var34;
										}

										var35 += var27;
										var36 += var26;
										++var37;
									}

									++var33;
									var30 -= var26;
									var31 += var27;
								}
							}
						} else if (var26 == 0) {
							for (var33 = var22; var33 < 0; var23 += Class88.field5502) {
								var34 = var23;
								var35 = (var27 * var28 >> 4) + var30;
								var37 = var20;
								if (var31 >= 0 && var31 - (this.field5424 << 12) < 0) {
									if (var35 < 0) {
										var32 = (var27 - 1 - var35) / var27;
										var37 = var20 + var32;
										var35 += var27 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (var35 + 1 - (this.field5421 << 12) - var27) / var27) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5429[(var35 >> 12) + (var31 >> 12) * this.field5421];
										if (var38 != 0) {
											Class569.field5504[var34++] = var38;
										} else {
											++var34;
										}

										var35 += var27;
										++var37;
									}
								}

								++var33;
								var31 += var27;
							}
						} else if (var26 < 0) {
							for (var33 = var22; var33 < 0; var23 += Class88.field5502) {
								var34 = var23;
								var35 = (var27 * var28 >> 4) + var30;
								var36 = (var26 * var28 >> 4) + var31;
								var37 = var20;
								if (var35 < 0) {
									var32 = (var27 - 1 - var35) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 = var23 + var32;
								}

								if ((var32 = (var35 + 1 - (this.field5421 << 12) - var27) / var27) > var37) {
									var37 = var32;
								}

								if ((var32 = var36 - (this.field5424 << 12)) >= 0) {
									var32 = (var26 - var32) / var26;
									var37 += var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 += var32;
								}

								if ((var32 = (var36 - var26) / var26) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.field5429[(var35 >> 12) + (var36 >> 12) * this.field5421];
									if (var38 != 0) {
										Class569.field5504[var34++] = var38;
									} else {
										++var34;
									}

									var35 += var27;
									var36 += var26;
									++var37;
								}

								++var33;
								var30 -= var26;
								var31 += var27;
							}
						} else {
							for (var33 = var22; var33 < 0; var23 += Class88.field5502) {
								var34 = var23;
								var35 = (var27 * var28 >> 4) + var30;
								var36 = (var26 * var28 >> 4) + var31;
								var37 = var20;
								if (var35 < 0) {
									var32 = (var27 - 1 - var35) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 = var23 + var32;
								}

								if ((var32 = (var35 + 1 - (this.field5421 << 12) - var27) / var27) > var37) {
									var37 = var32;
								}

								if (var36 < 0) {
									var32 = (var26 - 1 - var36) / var26;
									var37 += var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 += var32;
								}

								if ((var32 = (var36 + 1 - (this.field5424 << 12) - var26) / var26) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.field5429[(var35 >> 12) + (var36 >> 12) * this.field5421];
									if (var38 != 0) {
										Class569.field5504[var34++] = var38;
									} else {
										++var34;
									}

									var35 += var27;
									var36 += var26;
									++var37;
								}

								++var33;
								var30 -= var26;
								var31 += var27;
							}
						}
					}

				}
			}
		}
	}

	@ObfInfo(name = "bg", desc = "(IIII)V")
	public void method9627(int var1, int var2, int var3, int var4) {
		if (var3 <= this.field5425 && var4 <= this.field5426) {
			int var5 = this.field5423 * var3 / this.field5425 + var1;
			int var6 = ((this.field5423 + this.field5421) * var3 + this.field5425 - 1) / this.field5425 + var1;
			int var7 = this.field5420 * var4 / this.field5426 + var2;
			int var8 = ((this.field5424 + this.field5420) * var4 + this.field5426 - 1) / this.field5426 + var2;
			if (var5 < Class569.field5508) {
				var5 = Class569.field5508;
			}

			if (var6 > Class569.field5509) {
				var6 = Class569.field5509;
			}

			if (var7 < Class569.field5505) {
				var7 = Class569.field5505;
			}

			if (var8 > Class569.field5507) {
				var8 = Class569.field5507;
			}

			if (var5 < var6 && var7 < var8) {
				int var9 = Class88.field5502 * var7 + var5;
				int var10 = Class88.field5502 - (var6 - var5);
				if (var9 < Class569.field5504.length) {
					for (int var11 = var7; var11 < var8; ++var11) {
						for (int var12 = var5; var12 < var6; ++var12) {
							int var13 = var12 - var1 << 4;
							int var14 = var11 - var2 << 4;
							int var15 = this.field5425 * var13 / var3 - (this.field5423 << 4);
							int var16 = (var13 + 16) * this.field5425 / var3 - (this.field5423 << 4);
							int var17 = this.field5426 * var14 / var4 - (this.field5420 << 4);
							int var18 = (var14 + 16) * this.field5426 / var4 - (this.field5420 << 4);
							int var19 = (var16 - var15) * (var18 - var17) >> 1;
							if (var19 != 0) {
								if (var15 < 0) {
									var15 = 0;
								}

								if (var16 >= this.field5421 << 4) {
									var16 = this.field5421 << 4;
								}

								if (var17 < 0) {
									var17 = 0;
								}

								if (var18 >= this.field5424 << 4) {
									var18 = this.field5424 << 4;
								}

								--var16;
								--var18;
								int var20 = 16 - (var15 & 15);
								int var21 = (var16 & 15) + 1;
								int var22 = 16 - (var17 & 15);
								int var23 = (var18 & 15) + 1;
								var15 >>= 4;
								var16 >>= 4;
								var17 >>= 4;
								var18 >>= 4;
								int var24 = 0;
								int var25 = 0;
								int var26 = 0;
								int var27 = 0;

								int var28;
								for (var28 = var17; var28 <= var18; ++var28) {
									int var29 = 16;
									if (var17 == var28) {
										var29 = var22;
									}

									if (var18 == var28) {
										var29 = var23;
									}

									for (int var30 = var15; var30 <= var16; ++var30) {
										int var31 = this.field5429[this.field5421 * var28 + var30];
										if (var31 != 0) {
											int var32;
											if (var15 == var30) {
												var32 = var20 * var29;
											} else if (var16 == var30) {
												var32 = var21 * var29;
											} else {
												var32 = var29 << 4;
											}

											var27 += var32;
											var24 += (var31 >> 16 & 255) * var32;
											var25 += (var31 >> 8 & 255) * var32;
											var26 += (var31 & 255) * var32;
										}
									}
								}

								if (var27 >= var19) {
									var28 = var26 / var27 + (var24 / var27 << 16) + (var25 / var27 << 8);
									if (var28 == 0) {
										var28 = 1;
									}

									Class569.field5504[var9] = var28;
								}

								++var9;
							}
						}

						var9 += var10;
					}

				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(name = "au", desc = "([I[IIIIIII)V")
	public static void method9605(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5; var8 < 0; ++var8) {
			int var9;
			for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
			}

			var3 += var6;
			var2 += var7;
		}

	}

	@ObfInfo(name = "az", desc = "([I[IIIIIIII)V")
	public static void method9607(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	@ObfInfo(name = "ac", desc = "([I[IIIIIIIIIII)V")
	public static void method9609(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; ++var13) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0) {
					var0[var5++] = var2;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}

	@ObfInfo(name = "ay", desc = "([I[IIIIIIIIII)V")
	public static void method9613(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		int var11 = 256 - var9;
		int var12 = (var10 & 16711935) * var11 & -16711936;
		int var13 = (var10 & 65280) * var11 & 16711680;
		var10 = (var12 | var13) >>> 8;

		for (int var14 = -var6; var14 < 0; ++var14) {
			for (int var15 = -var5; var15 < 0; ++var15) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var12 = (var2 & 16711935) * var9 & -16711936;
					var13 = (var2 & 65280) * var9 & 16711680;
					var0[var4++] = ((var12 | var13) >>> 8) + var10;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	@ObfInfo(name = "aa", desc = "([I[IIIIIIIII)V")
	public static void method9684(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; ++var11) {
			for (int var12 = -var5; var12 < 0; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					int var13 = var0[var4];
					var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & 65280) * var9 + (var13 & 65280) * var10 & 16711680) >> 8;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	@ObfInfo(name = "aw", desc = "([I[IIIIIIIIIIII)V")
	public static void method9615(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12;
		int var14 = var3;

		for (int var15 = -var8; var15 < 0; ++var15) {
			int var16 = (var4 >> 16) * var11;

			for (int var17 = -var7; var17 < 0; ++var17) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					int var18 = var0[var5];
					var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & 65280) * var12 + (var18 & 65280) * var13 & 16711680) >> 8;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var14;
			var5 += var6;
		}

	}

	@ObfInfo(name = "af", desc = "(III[I[IIIIIIIII)V")
	public static void method9611(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		for (var8 = -var10; var8 < 0; ++var8) {
			for (var6 = -var9; var6 < 0; ++var6) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = var3[var7];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var2 - var0 & 65536) + (var0 & 16777472);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					++var7;
				}
			}

			var7 += var11;
			var5 += var12;
		}

	}

	@ObfInfo(name = "am", desc = "(III[I[IIIIIIIIII)V")
	public static void method9618(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		for (var8 = -var10; var8 < 0; ++var8) {
			for (var6 = -var9; var6 < 0; ++var6) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var13;
					var0 = (var0 * var13 - var1 & 16711680) + (var1 & -16711936) >>> 8;
					var1 = var3[var7];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var2 - var0 & 65536) + (var0 & 16777472);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					++var7;
				}
			}

			var7 += var11;
			var5 += var12;
		}

	}

	@ObfInfo(name = "bt", desc = "(IIII[I[IIIIIIIIIII)V")
	public static void method9620(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
		for (int var16 = var3; var8 < 0; ++var8) {
			var7 = (var9 >> 16) * var15;

			for (var6 = -var12; var6 < 0; ++var6) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = var5[var10];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var2 - var0 & 65536) + (var0 & 16777472);
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					++var10;
				}

				var3 += var13;
			}

			var9 += var14;
			var3 = var16;
			var10 += var11;
		}

	}

	@ObfInfo(name = "bj", desc = "(IIII[I[IIIIIIIIIIII)V")
	public static void method9621(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
		for (int var17 = var3; var8 < 0; ++var8) {
			var7 = (var9 >> 16) * var15;

			for (var6 = -var12; var6 < 0; ++var6) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var16;
					var0 = (var0 * var16 - var1 & 16711680) + (var1 & -16711936) >>> 8;
					var1 = var5[var10];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var2 - var0 & 65536) + (var0 & 16777472);
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					++var10;
				}

				var3 += var13;
			}

			var9 += var14;
			var3 = var17;
			var10 += var11;
		}

	}
}
