import io.runebox.ObfInfo;

public final class Class549 extends Class561 {
	@ObfInfo(name = "al", desc = "I")
	public int field5353;
	@ObfInfo(name = "aj", desc = "I")
	public int field5354;
	@ObfInfo(name = "at", desc = "I")
	public int field5358;
	@ObfInfo(name = "aa", desc = "I")
	public int field5361;
	@ObfInfo(name = "af", desc = "I")
	public int field5362;
	@ObfInfo(name = "az", desc = "I")
	public int field5363;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field5357;

	public Class549() {
	}

	public Class549(int var1, int var2) {
		this(new int[var2 * var1], var1, var2);
	}

	public Class549(int[] var1, int var2, int var3) {
		this.field5357 = var1;
		this.field5353 = this.field5361 = var2;
		this.field5354 = this.field5358 = var3;
		this.field5362 = 0;
		this.field5363 = 0;
	}

	@ObfInfo(name = "ak", desc = "()Lvc;")
	public Class549 method9919() {
		Class549 var1 = new Class549(this.field5353, this.field5354);
		var1.field5361 = this.field5361;
		var1.field5358 = this.field5358;
		var1.field5363 = this.field5361 - this.field5353 - this.field5363;
		var1.field5362 = this.field5362;

		for (int var2 = 0; var2 < this.field5354; ++var2) {
			for (int var3 = 0; var3 < this.field5353; ++var3) {
				var1.field5357[this.field5353 * var2 + var3] = this.field5357[this.field5353 * var2 + this.field5353 - 1 - var3];
			}
		}

		return var1;
	}

	@ObfInfo(name = "al", desc = "()Lvc;")
	public Class549 method9952() {
		Class549 var1 = new Class549(this.field5353, this.field5354);
		var1.field5361 = this.field5361;
		var1.field5358 = this.field5358;
		var1.field5363 = this.field5363;
		var1.field5362 = this.field5362;
		int var2 = this.field5357.length;

		for (int var3 = 0; var3 < var2; ++var3) {
			var1.field5357[var3] = this.field5357[var3];
		}

		return var1;
	}

	@ObfInfo(name = "aj", desc = "()Lvc;")
	public Class549 method9921() {
		Class549 var1 = new Class549(this.field5361, this.field5358);

		for (int var2 = 0; var2 < this.field5354; ++var2) {
			for (int var3 = 0; var3 < this.field5353; ++var3) {
				var1.field5357[(this.field5362 + var2) * this.field5361 + this.field5363 + var3] = this.field5357[this.field5353 * var2 + var3];
			}
		}

		return var1;
	}

	@ObfInfo(name = "az", desc = "()V")
	public void method9922() {
		method10142(this.field5357, this.field5353, this.field5354, (float[])null);
	}

	@ObfInfo(name = "af", desc = "()V")
	public void method9923() {
		if (this.field5353 != this.field5361 || this.field5354 != this.field5358) {
			int[] var1 = new int[this.field5361 * this.field5358];

			for (int var2 = 0; var2 < this.field5354; ++var2) {
				for (int var3 = 0; var3 < this.field5353; ++var3) {
					var1[(this.field5362 + var2) * this.field5361 + this.field5363 + var3] = this.field5357[this.field5353 * var2 + var3];
				}
			}

			this.field5357 = var1;
			this.field5353 = this.field5361;
			this.field5354 = this.field5358;
			this.field5363 = 0;
			this.field5362 = 0;
		}
	}

	@ObfInfo(name = "aa", desc = "(I)V")
	public void method10012(int var1) {
		if (this.field5353 != this.field5361 || this.field5354 != this.field5358) {
			int var2 = var1;
			if (var1 > this.field5363) {
				var2 = this.field5363;
			}

			int var3 = var1;
			if (this.field5363 + var1 + this.field5353 > this.field5361) {
				var3 = this.field5361 - this.field5363 - this.field5353;
			}

			int var4 = var1;
			if (var1 > this.field5362) {
				var4 = this.field5362;
			}

			int var5 = var1;
			if (this.field5362 + var1 + this.field5354 > this.field5358) {
				var5 = this.field5358 - this.field5362 - this.field5354;
			}

			int var6 = this.field5353 + var2 + var3;
			int var7 = this.field5354 + var4 + var5;
			int[] var8 = new int[var7 * var6];

			for (int var9 = 0; var9 < this.field5354; ++var9) {
				for (int var10 = 0; var10 < this.field5353; ++var10) {
					var8[(var9 + var4) * var6 + var10 + var2] = this.field5357[this.field5353 * var9 + var10];
				}
			}

			this.field5357 = var8;
			this.field5353 = var6;
			this.field5354 = var7;
			this.field5363 -= var2;
			this.field5362 -= var4;
		}
	}

	@ObfInfo(name = "at", desc = "()V")
	public void method9925() {
		int[] var1 = new int[this.field5353 * this.field5354];
		int var2 = 0;

		for (int var3 = 0; var3 < this.field5354; ++var3) {
			for (int var4 = this.field5353 - 1; var4 >= 0; --var4) {
				var1[var2++] = this.field5357[var4 + this.field5353 * var3];
			}
		}

		this.field5357 = var1;
		this.field5363 = this.field5361 - this.field5353 - this.field5363;
	}

	@ObfInfo(name = "ab", desc = "()V")
	public void method9926() {
		int[] var1 = new int[this.field5353 * this.field5354];
		int var2 = 0;

		for (int var3 = this.field5354 - 1; var3 >= 0; --var3) {
			for (int var4 = 0; var4 < this.field5353; ++var4) {
				var1[var2++] = this.field5357[var4 + this.field5353 * var3];
			}
		}

		this.field5357 = var1;
		this.field5362 = this.field5358 - this.field5354 - this.field5362;
	}

	@ObfInfo(name = "ac", desc = "(I)V")
	public void method9920(int var1) {
		int[] var2 = new int[this.field5353 * this.field5354];
		int var3 = 0;

		for (int var4 = 0; var4 < this.field5354; ++var4) {
			for (int var5 = 0; var5 < this.field5353; ++var5) {
				int var6 = this.field5357[var3];
				if (var6 == 0) {
					if (var5 > 0 && this.field5357[var3 - 1] != 0) {
						var6 = var1;
					} else if (var4 > 0 && this.field5357[var3 - this.field5353] != 0) {
						var6 = var1;
					} else if (var5 < this.field5353 - 1 && this.field5357[var3 + 1] != 0) {
						var6 = var1;
					} else if (var4 < this.field5354 - 1 && this.field5357[this.field5353 + var3] != 0) {
						var6 = var1;
					}
				}

				var2[var3++] = var6;
			}
		}

		this.field5357 = var2;
	}

	@ObfInfo(name = "ao", desc = "(I)V")
	public void method9928(int var1) {
		for (int var2 = this.field5354 - 1; var2 > 0; --var2) {
			int var3 = this.field5353 * var2;

			for (int var4 = this.field5353 - 1; var4 > 0; --var4) {
				if (this.field5357[var4 + var3] == 0 && this.field5357[var4 + var3 - 1 - this.field5353] != 0) {
					this.field5357[var4 + var3] = var1;
				}
			}
		}

	}

	@ObfInfo(name = "ah", desc = "(II)V")
	public void method9929(int var1, int var2) {
		var1 += this.field5363;
		var2 += this.field5362;
		int var3 = var1 + Class87.field5423 * var2;
		int var4 = 0;
		int var5 = this.field5354;
		int var6 = this.field5353;
		int var7 = Class87.field5423 - var6;
		int var8 = 0;
		int var9;
		if (var2 < Class561.field5422) {
			var9 = Class561.field5422 - var2;
			var5 -= var9;
			var2 = Class561.field5422;
			var4 += var9 * var6;
			var3 += Class87.field5423 * var9;
		}

		if (var5 + var2 > Class561.field5419) {
			var5 -= var5 + var2 - Class561.field5419;
		}

		if (var1 < Class561.field5424) {
			var9 = Class561.field5424 - var1;
			var6 -= var9;
			var1 = Class561.field5424;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 + var1 > Class561.field5425) {
			var9 = var6 + var1 - Class561.field5425;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			method9930(Class561.field5418, this.field5357, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfInfo(name = "aq", desc = "(II)V")
	public void method10023(int var1, int var2) {
		var1 += this.field5363;
		var2 += this.field5362;
		int var3 = var1 + Class87.field5423 * var2;
		int var4 = 0;
		int var5 = this.field5354;
		int var6 = this.field5353;
		int var7 = Class87.field5423 - var6;
		int var8 = 0;
		int var9;
		if (var2 < Class561.field5422) {
			var9 = Class561.field5422 - var2;
			var5 -= var9;
			var2 = Class561.field5422;
			var4 += var9 * var6;
			var3 += Class87.field5423 * var9;
		}

		if (var5 + var2 > Class561.field5419) {
			var5 -= var5 + var2 - Class561.field5419;
		}

		if (var1 < Class561.field5424) {
			var9 = Class561.field5424 - var1;
			var6 -= var9;
			var1 = Class561.field5424;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 + var1 > Class561.field5425) {
			var9 = var6 + var1 - Class561.field5425;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			method9932(Class561.field5418, this.field5357, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfInfo(name = "ae", desc = "(IIII)V")
	public void method9947(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var5 = this.field5353;
			int var6 = this.field5354;
			int var7 = 0;
			int var8 = 0;
			int var9 = this.field5361;
			int var10 = this.field5358;
			int var11 = (var9 << 16) / var3;
			int var12 = (var10 << 16) / var4;
			int var13;
			if (this.field5363 > 0) {
				var13 = ((this.field5363 << 16) + var11 - 1) / var11;
				var1 += var13;
				var7 += var13 * var11 - (this.field5363 << 16);
			}

			if (this.field5362 > 0) {
				var13 = ((this.field5362 << 16) + var12 - 1) / var12;
				var2 += var13;
				var8 += var13 * var12 - (this.field5362 << 16);
			}

			if (var5 < var9) {
				var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
			}

			if (var6 < var10) {
				var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			var13 = var1 + Class87.field5423 * var2;
			int var14 = Class87.field5423 - var3;
			if (var4 + var2 > Class561.field5419) {
				var4 -= var4 + var2 - Class561.field5419;
			}

			int var15;
			if (var2 < Class561.field5422) {
				var15 = Class561.field5422 - var2;
				var4 -= var15;
				var13 += Class87.field5423 * var15;
				var8 += var15 * var12;
			}

			if (var3 + var1 > Class561.field5425) {
				var15 = var3 + var1 - Class561.field5425;
				var3 -= var15;
				var14 += var15;
			}

			if (var1 < Class561.field5424) {
				var15 = Class561.field5424 - var1;
				var3 -= var15;
				var13 += var15;
				var7 += var15 * var11;
				var14 += var15;
			}

			method9972(Class561.field5418, this.field5357, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
		}
	}

	@ObfInfo(name = "ay", desc = "(IIII)V")
	public void method9951(int var1, int var2, int var3, int var4) {
		if (var3 == 256) {
			this.method10023(var1, var2);
		} else {
			var1 += this.field5363;
			var2 += this.field5362;
			int var5 = var1 + Class87.field5423 * var2;
			int var6 = 0;
			int var7 = this.field5354;
			int var8 = this.field5353;
			int var9 = Class87.field5423 - var8;
			int var10 = 0;
			int var11;
			if (var2 < Class561.field5422) {
				var11 = Class561.field5422 - var2;
				var7 -= var11;
				var2 = Class561.field5422;
				var6 += var11 * var8;
				var5 += Class87.field5423 * var11;
			}

			if (var7 + var2 > Class561.field5419) {
				var7 -= var7 + var2 - Class561.field5419;
			}

			if (var1 < Class561.field5424) {
				var11 = Class561.field5424 - var1;
				var8 -= var11;
				var1 = Class561.field5424;
				var6 += var11;
				var5 += var11;
				var10 += var11;
				var9 += var11;
			}

			if (var8 + var1 > Class561.field5425) {
				var11 = var8 + var1 - Class561.field5425;
				var8 -= var11;
				var10 += var11;
				var9 += var11;
			}

			if (var8 > 0 && var7 > 0) {
				method9936(Class561.field5418, this.field5357, 0, var6, var5, var8, var7, var9, var10, var3, var4);
			}
		}
	}

	@ObfInfo(name = "as", desc = "(III)V")
	public void method9937(int var1, int var2, int var3) {
		var1 += this.field5363;
		var2 += this.field5362;
		int var4 = var1 + Class87.field5423 * var2;
		int var5 = 0;
		int var6 = this.field5354;
		int var7 = this.field5353;
		int var8 = Class87.field5423 - var7;
		int var9 = 0;
		int var10;
		if (var2 < Class561.field5422) {
			var10 = Class561.field5422 - var2;
			var6 -= var10;
			var2 = Class561.field5422;
			var5 += var10 * var7;
			var4 += Class87.field5423 * var10;
		}

		if (var6 + var2 > Class561.field5419) {
			var6 -= var6 + var2 - Class561.field5419;
		}

		if (var1 < Class561.field5424) {
			var10 = Class561.field5424 - var1;
			var7 -= var10;
			var1 = Class561.field5424;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 + var1 > Class561.field5425) {
			var10 = var7 + var1 - Class561.field5425;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			method9938(Class561.field5418, this.field5357, 0, var5, var4, var7, var6, var8, var9, var3);
		}
	}

	@ObfInfo(name = "ad", desc = "(IIIII)V")
	public void method9939(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.field5353;
			int var7 = this.field5354;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.field5361;
			int var11 = this.field5358;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			int var14;
			if (this.field5363 > 0) {
				var14 = ((this.field5363 << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.field5363 << 16);
			}

			if (this.field5362 > 0) {
				var14 = ((this.field5362 << 16) + var13 - 1) / var13;
				var2 += var14;
				var9 += var14 * var13 - (this.field5362 << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			var14 = var1 + Class87.field5423 * var2;
			int var15 = Class87.field5423 - var3;
			if (var4 + var2 > Class561.field5419) {
				var4 -= var4 + var2 - Class561.field5419;
			}

			int var16;
			if (var2 < Class561.field5422) {
				var16 = Class561.field5422 - var2;
				var4 -= var16;
				var14 += Class87.field5423 * var16;
				var9 += var16 * var13;
			}

			if (var3 + var1 > Class561.field5425) {
				var16 = var3 + var1 - Class561.field5425;
				var3 -= var16;
				var15 += var16;
			}

			if (var1 < Class561.field5424) {
				var16 = Class561.field5424 - var1;
				var3 -= var16;
				var14 += var16;
				var8 += var16 * var12;
				var15 += var16;
			}

			method9940(Class561.field5418, this.field5357, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
		}
	}

	@ObfInfo(name = "an", desc = "(III)V")
	public void method9941(int var1, int var2, int var3) {
		var1 += this.field5363;
		var2 += this.field5362;
		int var4 = var1 + Class87.field5423 * var2;
		int var5 = 0;
		int var6 = this.field5354;
		int var7 = this.field5353;
		int var8 = Class87.field5423 - var7;
		int var9 = 0;
		int var10;
		if (var2 < Class561.field5422) {
			var10 = Class561.field5422 - var2;
			var6 -= var10;
			var2 = Class561.field5422;
			var5 += var10 * var7;
			var4 += Class87.field5423 * var10;
		}

		if (var6 + var2 > Class561.field5419) {
			var6 -= var6 + var2 - Class561.field5419;
		}

		if (var1 < Class561.field5424) {
			var10 = Class561.field5424 - var1;
			var7 -= var10;
			var1 = Class561.field5424;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 + var1 > Class561.field5425) {
			var10 = var7 + var1 - Class561.field5425;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			if (var3 == 256) {
				method10032(0, 0, 0, Class561.field5418, this.field5357, var5, 0, var4, 0, var7, var6, var8, var9);
			} else {
				method9943(0, 0, 0, Class561.field5418, this.field5357, var5, 0, var4, 0, var7, var6, var8, var9, var3);
			}

		}
	}

	@ObfInfo(name = "ag", desc = "(IIIII)V")
	public void method9944(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.field5353;
			int var7 = this.field5354;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.field5361;
			int var11 = this.field5358;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			int var14;
			if (this.field5363 > 0) {
				var14 = ((this.field5363 << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.field5363 << 16);
			}

			if (this.field5362 > 0) {
				var14 = ((this.field5362 << 16) + var13 - 1) / var13;
				var2 += var14;
				var9 += var14 * var13 - (this.field5362 << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			var14 = var1 + Class87.field5423 * var2;
			int var15 = Class87.field5423 - var3;
			if (var4 + var2 > Class561.field5419) {
				var4 -= var4 + var2 - Class561.field5419;
			}

			int var16;
			if (var2 < Class561.field5422) {
				var16 = Class561.field5422 - var2;
				var4 -= var16;
				var14 += Class87.field5423 * var16;
				var9 += var16 * var13;
			}

			if (var3 + var1 > Class561.field5425) {
				var16 = var3 + var1 - Class561.field5425;
				var3 -= var16;
				var15 += var16;
			}

			if (var1 < Class561.field5424) {
				var16 = Class561.field5424 - var1;
				var3 -= var16;
				var14 += var16;
				var8 += var16 * var12;
				var15 += var16;
			}

			if (var5 == 256) {
				method9945(0, 0, 0, var8, this.field5357, Class561.field5418, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
			} else {
				method9946(0, 0, 0, var8, this.field5357, Class561.field5418, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
			}

		}
	}

	@ObfInfo(name = "bo", desc = "(IIIIII[I[I)V")
	public void method9975(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
		int var9 = var2 < 0 ? -var2 : 0;
		int var10 = this.field5354 + var2 <= var6 ? this.field5354 : var6 - var2;
		int var11 = var1 < 0 ? -var1 : 0;
		int var10000;
		if (this.field5353 + var1 <= var5) {
			var10000 = this.field5353;
		} else {
			var10000 = var5 - var1;
		}

		int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * Class87.field5423;
		int var14 = var9 + var2;

		for (int var15 = var9; var15 < var10; ++var15) {
			int var16 = var7[var14];
			int var17 = var8[var14++];
			int var18 = var13;
			int var19;
			if (var1 < var16) {
				var19 = var16 - var1;
				var18 = var13 + (var19 - var11);
			} else {
				var19 = var11;
			}

			int var12;
			if (this.field5353 + var1 <= var17 + var16) {
				var12 = this.field5353;
			} else {
				var12 = var17 + var16 - var1;
			}

			for (int var20 = var19; var20 < var12; ++var20) {
				int var21 = this.field5357[var20 + this.field5353 * var15];
				if (var21 != 0) {
					Class561.field5418[var18++] = var21;
				} else {
					++var18;
				}
			}

			var13 += Class87.field5423;
		}

	}

	@ObfInfo(name = "bi", desc = "(IIIIIIII[I[I)V")
	public void method9961(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
		try {
			int var11 = -var3 / 2;
			int var12 = -var4 / 2;
			int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
			int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
			var13 = var13 * var8 >> 8;
			var14 = var14 * var8 >> 8;
			int var15 = (var5 << 16) + var13 * var12 + var14 * var11;
			int var16 = (var6 << 16) + (var14 * var12 - var13 * var11);
			int var17 = var1 + Class87.field5423 * var2;

			for (var2 = 0; var2 < var4; ++var2) {
				int var18 = var9[var2];
				int var19 = var18 + var17;
				int var20 = var15 + var18 * var14;
				int var21 = var16 - var18 * var13;

				for (var1 = -var10[var2]; var1 < 0; ++var1) {
					Class561.field5418[var19++] = this.field5357[(var20 >> 16) + (var21 >> 16) * this.field5353];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += Class87.field5423;
			}
		} catch (Exception var22) {
		}

	}

	@ObfInfo(name = "bt", desc = "(IIIIIIDI)V")
	public void method10030(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			int var10 = -var3 / 2;
			int var11 = -var4 / 2;
			int var12 = (int)(Math.sin(var7) * 65536.0D);
			int var13 = (int)(Math.cos(var7) * 65536.0D);
			var12 = var12 * var9 >> 8;
			var13 = var13 * var9 >> 8;
			int var14 = (var5 << 16) + var12 * var11 + var13 * var10;
			int var15 = (var6 << 16) + (var13 * var11 - var12 * var10);
			int var16 = var1 + Class87.field5423 * var2;

			for (var2 = 0; var2 < var4; ++var2) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0; ++var1) {
					int var20 = this.field5357[(var18 >> 16) + (var19 >> 16) * this.field5353];
					if (var20 != 0) {
						Class561.field5418[var17++] = var20;
					} else {
						++var17;
					}

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += Class87.field5423;
			}
		} catch (Exception var21) {
		}

	}

	@ObfInfo(name = "bn", desc = "(IIII)V")
	public void method9950(int var1, int var2, int var3, int var4) {
		this.method10007(this.field5361 << 3, this.field5358 << 3, var1 << 4, var2 << 4, var3, var4);
	}

	@ObfInfo(name = "bw", desc = "(IIIIII)V")
	public void method10007(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) {
			var1 -= this.field5363 << 4;
			var2 -= this.field5362 << 4;
			double var7 = (double)(var5 & 65535) * 9.587379924285257E-5D;
			int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
			int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
			int var11 = -var1 * var10 + -var2 * var9;
			int var12 = -(-var1) * var9 + -var2 * var10;
			int var13 = ((this.field5353 << 4) - var1) * var10 + -var2 * var9;
			int var14 = -((this.field5353 << 4) - var1) * var9 + -var2 * var10;
			int var15 = -var1 * var10 + ((this.field5354 << 4) - var2) * var9;
			int var16 = -(-var1) * var9 + ((this.field5354 << 4) - var2) * var10;
			int var17 = ((this.field5353 << 4) - var1) * var10 + ((this.field5354 << 4) - var2) * var9;
			int var18 = -((this.field5353 << 4) - var1) * var9 + ((this.field5354 << 4) - var2) * var10;
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
			if (var19 < Class561.field5424) {
				var19 = Class561.field5424;
			}

			if (var20 > Class561.field5425) {
				var20 = Class561.field5425;
			}

			if (var21 < Class561.field5422) {
				var21 = Class561.field5422;
			}

			if (var22 > Class561.field5419) {
				var22 = Class561.field5419;
			}

			var20 = var19 - var20;
			if (var20 < 0) {
				var22 = var21 - var22;
				if (var22 < 0) {
					int var23 = Class87.field5423 * var21 + var19;
					double var24 = 1.6777216E7D / (double)var6;
					int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
					int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
					int var28 = (var19 << 4) + 8 - var3;
					int var29 = (var21 << 4) + 8 - var4;
					int var30 = (var1 << 8) - (var29 * var26 >> 4);
					int var31 = (var2 << 8) + (var29 * var27 >> 4);
					int var32;
					int var33;
					int var34;
					int var36;
					int var37;
					int var38;
					if (var27 == 0) {
						if (var26 == 0) {
							for (var33 = var22; var33 < 0; var23 += Class87.field5423) {
								var34 = var23;
								var37 = var20;
								if (var30 >= 0 && var31 >= 0 && var30 - (this.field5353 << 12) < 0 && var31 - (this.field5354 << 12) < 0) {
									for (; var37 < 0; ++var37) {
										var38 = this.field5357[(var31 >> 12) * this.field5353 + (var30 >> 12)];
										if (var38 != 0) {
											Class561.field5418[var34++] = var38;
										} else {
											++var34;
										}
									}
								}

								++var33;
							}
						} else if (var26 < 0) {
							for (var33 = var22; var33 < 0; var23 += Class87.field5423) {
								var34 = var23;
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if (var30 >= 0 && var30 - (this.field5353 << 12) < 0) {
									if ((var32 = var36 - (this.field5354 << 12)) >= 0) {
										var32 = (var26 - var32) / var26;
										var37 = var20 + var32;
										var36 += var32 * var26;
										var34 = var23 + var32;
									}

									if ((var32 = (var36 - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5357[(var36 >> 12) * this.field5353 + (var30 >> 12)];
										if (var38 != 0) {
											Class561.field5418[var34++] = var38;
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
							for (var33 = var22; var33 < 0; var23 += Class87.field5423) {
								var34 = var23;
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if (var30 >= 0 && var30 - (this.field5353 << 12) < 0) {
									if (var36 < 0) {
										var32 = (var26 - 1 - var36) / var26;
										var37 = var20 + var32;
										var36 += var32 * var26;
										var34 = var23 + var32;
									}

									if ((var32 = (var36 + 1 - (this.field5354 << 12) - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5357[(var36 >> 12) * this.field5353 + (var30 >> 12)];
										if (var38 != 0) {
											Class561.field5418[var34++] = var38;
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
								for (var33 = var22; var33 < 0; var23 += Class87.field5423) {
									var34 = var23;
									var35 = var30 + (var28 * var27 >> 4);
									var37 = var20;
									if (var31 >= 0 && var31 - (this.field5354 << 12) < 0) {
										if ((var32 = var35 - (this.field5353 << 12)) >= 0) {
											var32 = (var27 - var32) / var27;
											var37 = var20 + var32;
											var35 += var32 * var27;
											var34 = var23 + var32;
										}

										if ((var32 = (var35 - var27) / var27) > var37) {
											var37 = var32;
										}

										while (var37 < 0) {
											var38 = this.field5357[(var31 >> 12) * this.field5353 + (var35 >> 12)];
											if (var38 != 0) {
												Class561.field5418[var34++] = var38;
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
								for (var33 = var22; var33 < 0; var23 += Class87.field5423) {
									var34 = var23;
									var35 = var30 + (var28 * var27 >> 4);
									var36 = var31 + (var28 * var26 >> 4);
									var37 = var20;
									if ((var32 = var35 - (this.field5353 << 12)) >= 0) {
										var32 = (var27 - var32) / var27;
										var37 = var20 + var32;
										var35 += var32 * var27;
										var36 += var32 * var26;
										var34 = var23 + var32;
									}

									if ((var32 = (var35 - var27) / var27) > var37) {
										var37 = var32;
									}

									if ((var32 = var36 - (this.field5354 << 12)) >= 0) {
										var32 = (var26 - var32) / var26;
										var37 += var32;
										var35 += var32 * var27;
										var36 += var32 * var26;
										var34 += var32;
									}

									if ((var32 = (var36 - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5357[(var36 >> 12) * this.field5353 + (var35 >> 12)];
										if (var38 != 0) {
											Class561.field5418[var34++] = var38;
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
								for (var33 = var22; var33 < 0; var23 += Class87.field5423) {
									var34 = var23;
									var35 = var30 + (var28 * var27 >> 4);
									var36 = var31 + (var28 * var26 >> 4);
									var37 = var20;
									if ((var32 = var35 - (this.field5353 << 12)) >= 0) {
										var32 = (var27 - var32) / var27;
										var37 = var20 + var32;
										var35 += var32 * var27;
										var36 += var32 * var26;
										var34 = var23 + var32;
									}

									if ((var32 = (var35 - var27) / var27) > var37) {
										var37 = var32;
									}

									if (var36 < 0) {
										var32 = (var26 - 1 - var36) / var26;
										var37 += var32;
										var35 += var32 * var27;
										var36 += var32 * var26;
										var34 += var32;
									}

									if ((var32 = (var36 + 1 - (this.field5354 << 12) - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5357[(var36 >> 12) * this.field5353 + (var35 >> 12)];
										if (var38 != 0) {
											Class561.field5418[var34++] = var38;
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
							for (var33 = var22; var33 < 0; var23 += Class87.field5423) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var37 = var20;
								if (var31 >= 0 && var31 - (this.field5354 << 12) < 0) {
									if (var35 < 0) {
										var32 = (var27 - 1 - var35) / var27;
										var37 = var20 + var32;
										var35 += var32 * var27;
										var34 = var23 + var32;
									}

									if ((var32 = (var35 + 1 - (this.field5353 << 12) - var27) / var27) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5357[(var31 >> 12) * this.field5353 + (var35 >> 12)];
										if (var38 != 0) {
											Class561.field5418[var34++] = var38;
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
							for (var33 = var22; var33 < 0; var23 += Class87.field5423) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if (var35 < 0) {
									var32 = (var27 - 1 - var35) / var27;
									var37 = var20 + var32;
									var35 += var32 * var27;
									var36 += var32 * var26;
									var34 = var23 + var32;
								}

								if ((var32 = (var35 + 1 - (this.field5353 << 12) - var27) / var27) > var37) {
									var37 = var32;
								}

								if ((var32 = var36 - (this.field5354 << 12)) >= 0) {
									var32 = (var26 - var32) / var26;
									var37 += var32;
									var35 += var32 * var27;
									var36 += var32 * var26;
									var34 += var32;
								}

								if ((var32 = (var36 - var26) / var26) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.field5357[(var36 >> 12) * this.field5353 + (var35 >> 12)];
									if (var38 != 0) {
										Class561.field5418[var34++] = var38;
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
							for (var33 = var22; var33 < 0; var23 += Class87.field5423) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if (var35 < 0) {
									var32 = (var27 - 1 - var35) / var27;
									var37 = var20 + var32;
									var35 += var32 * var27;
									var36 += var32 * var26;
									var34 = var23 + var32;
								}

								if ((var32 = (var35 + 1 - (this.field5353 << 12) - var27) / var27) > var37) {
									var37 = var32;
								}

								if (var36 < 0) {
									var32 = (var26 - 1 - var36) / var26;
									var37 += var32;
									var35 += var32 * var27;
									var36 += var32 * var26;
									var34 += var32;
								}

								if ((var32 = (var36 + 1 - (this.field5354 << 12) - var26) / var26) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.field5357[(var36 >> 12) * this.field5353 + (var35 >> 12)];
									if (var38 != 0) {
										Class561.field5418[var34++] = var38;
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

	@ObfInfo(name = "bl", desc = "(IIII)V")
	public void method9918(int var1, int var2, int var3, int var4) {
		if (var3 <= this.field5361 && var4 <= this.field5358) {
			int var5 = var1 + this.field5363 * var3 / this.field5361;
			int var6 = var1 + ((this.field5363 + this.field5353) * var3 + this.field5361 - 1) / this.field5361;
			int var7 = var2 + this.field5362 * var4 / this.field5358;
			int var8 = var2 + ((this.field5362 + this.field5354) * var4 + this.field5358 - 1) / this.field5358;
			if (var5 < Class561.field5424) {
				var5 = Class561.field5424;
			}

			if (var6 > Class561.field5425) {
				var6 = Class561.field5425;
			}

			if (var7 < Class561.field5422) {
				var7 = Class561.field5422;
			}

			if (var8 > Class561.field5419) {
				var8 = Class561.field5419;
			}

			if (var5 < var6 && var7 < var8) {
				int var9 = Class87.field5423 * var7 + var5;
				int var10 = Class87.field5423 - (var6 - var5);
				if (var9 < Class561.field5418.length) {
					for (int var11 = var7; var11 < var8; ++var11) {
						for (int var12 = var5; var12 < var6; ++var12) {
							int var13 = var12 - var1 << 4;
							int var14 = var11 - var2 << 4;
							int var15 = this.field5361 * var13 / var3 - (this.field5363 << 4);
							int var16 = (var13 + 16) * this.field5361 / var3 - (this.field5363 << 4);
							int var17 = this.field5358 * var14 / var4 - (this.field5362 << 4);
							int var18 = (var14 + 16) * this.field5358 / var4 - (this.field5362 << 4);
							int var19 = (var16 - var15) * (var18 - var17) >> 1;
							if (var19 != 0) {
								if (var15 < 0) {
									var15 = 0;
								}

								if (var16 >= this.field5353 << 4) {
									var16 = this.field5353 << 4;
								}

								if (var17 < 0) {
									var17 = 0;
								}

								if (var18 >= this.field5354 << 4) {
									var18 = this.field5354 << 4;
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
									if (var28 == var17) {
										var29 = var22;
									}

									if (var28 == var18) {
										var29 = var23;
									}

									for (int var30 = var15; var30 <= var16; ++var30) {
										int var31 = this.field5357[this.field5353 * var28 + var30];
										if (var31 != 0) {
											int var32;
											if (var30 == var15) {
												var32 = var29 * var20;
											} else if (var30 == var16) {
												var32 = var29 * var21;
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
									var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
									if (var28 == 0) {
										var28 = 1;
									}

									Class561.field5418[var9] = var28;
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

	@ObfInfo(name = "av", desc = "([I[IIIIIII)V")
	public static void method9930(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5; var8 < 0; ++var8) {
			int var9;
			for (var9 = var4 + var3 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
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

	@ObfInfo(name = "ap", desc = "([I[IIIIIIII)V")
	public static void method9932(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

	@ObfInfo(name = "ax", desc = "([I[IIIIIIIIIII)V")
	public static void method9972(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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

	@ObfInfo(name = "au", desc = "([I[IIIIIIIIII)V")
	public static void method9936(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
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

	@ObfInfo(name = "aw", desc = "([I[IIIIIIIII)V")
	public static void method9938(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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

	@ObfInfo(name = "ai", desc = "([I[IIIIIIIIIIII)V")
	public static void method9940(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
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

	@ObfInfo(name = "am", desc = "(III[I[IIIIIIIII)V")
	public static void method10032(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		for (var8 = -var10; var8 < 0; ++var8) {
			for (var6 = -var9; var6 < 0; ++var6) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = var3[var7];
					var2 = var1 + var0;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					++var7;
				}
			}

			var7 += var11;
			var5 += var12;
		}

	}

	@ObfInfo(name = "ar", desc = "(III[I[IIIIIIIIII)V")
	public static void method9943(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		for (var8 = -var10; var8 < 0; ++var8) {
			for (var6 = -var9; var6 < 0; ++var6) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var13;
					var0 = (var1 & -16711936) + (var13 * var0 - var1 & 16711680) >>> 8;
					var1 = var3[var7];
					var2 = var1 + var0;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					++var7;
				}
			}

			var7 += var11;
			var5 += var12;
		}

	}

	@ObfInfo(name = "bs", desc = "(IIII[I[IIIIIIIIIII)V")
	public static void method9945(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
		for (int var16 = var3; var8 < 0; ++var8) {
			var7 = (var9 >> 16) * var15;

			for (var6 = -var12; var6 < 0; ++var6) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = var5[var10];
					var2 = var1 + var0;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
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

	@ObfInfo(name = "bf", desc = "(IIII[I[IIIIIIIIIIII)V")
	public static void method9946(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
		for (int var17 = var3; var8 < 0; ++var8) {
			var7 = (var9 >> 16) * var15;

			for (var6 = -var12; var6 < 0; ++var6) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var16;
					var0 = (var1 & -16711936) + (var16 * var0 - var1 & 16711680) >>> 8;
					var1 = var5[var10];
					var2 = var1 + var0;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
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
