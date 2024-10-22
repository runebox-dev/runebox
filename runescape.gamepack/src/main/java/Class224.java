import io.runebox.ObfInfo;

@ObfInfo(name = "ip")
public class Class224 {
	@ObfInfo(name = "bs", desc = "I", intMultiplier = -270571109)
	public int field2424;
	@ObfInfo(name = "bp", desc = "I", intMultiplier = -883837443)
	public int field2432;
	@ObfInfo(name = "bx", desc = "I", intMultiplier = 1510995225)
	public int field2433;
	@ObfInfo(name = "bu", desc = "I", intMultiplier = 928232177)
	public int field2434;
	@ObfInfo(name = "by", desc = "[[I")
	public int[][] field2435;

	public Class224(int var1, int var2) {
		this.field2424 = 0;
		this.field2432 = 0;
		this.field2433 = var1;
		this.field2434 = var2;
		this.field2435 = new int[this.field2433][this.field2434];
		this.method4304();
	}

	@ObfInfo(name = "aq", desc = "(I)V", opaque = "1490249924")
	public void method4304() {
		for (int var2 = 0; var2 < this.field2433; ++var2) {
			for (int var3 = 0; var3 < this.field2434; ++var3) {
				if (var2 != 0 && var3 != 0 && var2 < this.field2433 - 5 && var3 < this.field2434 - 5) {
					this.field2435[var2][var3] = 1073741824;
				} else {
					this.field2435[var2][var3] = 16777215;
				}
			}
		}

	}

	@ObfInfo(name = "ad", desc = "(IIIIZI)V", opaque = "-1514398241")
	public void method4305(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.field2424;
		var2 -= this.field2432;
		if (var3 == 0) {
			if (var4 == 0) {
				this.method4331(var1, var2, 128);
				this.method4331(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.method4331(var1, var2, 2);
				this.method4331(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.method4331(var1, var2, 8);
				this.method4331(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.method4331(var1, var2, 32);
				this.method4331(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.method4331(var1, var2, 1);
				this.method4331(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.method4331(var1, var2, 4);
				this.method4331(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.method4331(var1, var2, 16);
				this.method4331(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.method4331(var1, var2, 64);
				this.method4331(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.method4331(var1, var2, 130);
				this.method4331(var1 - 1, var2, 8);
				this.method4331(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.method4331(var1, var2, 10);
				this.method4331(var1, var2 + 1, 32);
				this.method4331(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.method4331(var1, var2, 40);
				this.method4331(var1 + 1, var2, 128);
				this.method4331(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.method4331(var1, var2, 160);
				this.method4331(var1, var2 - 1, 2);
				this.method4331(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.method4331(var1, var2, 65536);
					this.method4331(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.method4331(var1, var2, 1024);
					this.method4331(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.method4331(var1, var2, 4096);
					this.method4331(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.method4331(var1, var2, 16384);
					this.method4331(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.method4331(var1, var2, 512);
					this.method4331(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.method4331(var1, var2, 2048);
					this.method4331(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.method4331(var1, var2, 8192);
					this.method4331(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.method4331(var1, var2, 32768);
					this.method4331(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.method4331(var1, var2, 66560);
					this.method4331(var1 - 1, var2, 4096);
					this.method4331(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.method4331(var1, var2, 5120);
					this.method4331(var1, var2 + 1, 16384);
					this.method4331(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.method4331(var1, var2, 20480);
					this.method4331(var1 + 1, var2, 65536);
					this.method4331(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.method4331(var1, var2, 81920);
					this.method4331(var1, var2 - 1, 1024);
					this.method4331(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfInfo(name = "ag", desc = "(IIIIZI)V", opaque = "1592901653")
	public void method4306(int var1, int var2, int var3, int var4, boolean var5) {
		int var7 = 256;
		if (var5) {
			var7 += 131072;
		}

		var1 -= this.field2424;
		var2 -= this.field2432;

		for (int var8 = var1; var8 < var1 + var3; ++var8) {
			if (var8 >= 0 && var8 < this.field2433) {
				for (int var9 = var2; var9 < var2 + var4; ++var9) {
					if (var9 >= 0 && var9 < this.field2434) {
						this.method4331(var8, var9, var7);
					}
				}
			}
		}

	}

	@ObfInfo(name = "ak", desc = "(III)V")
	public void method4321(int var1, int var2) {
		var1 -= this.field2424;
		var2 -= this.field2432;
		int[] var10000 = this.field2435[var1];
		var10000[var2] |= 2097152;
	}

	@ObfInfo(name = "ap", desc = "(III)V")
	public void method4308(int var1, int var2) {
		var1 -= this.field2424;
		var2 -= this.field2432;
		int[] var10000 = this.field2435[var1];
		var10000[var2] |= 262144;
	}

	@ObfInfo(name = "an", desc = "(IIII)V")
	public void method4331(int var1, int var2, int var3) {
		int[] var10000 = this.field2435[var1];
		var10000[var2] |= var3;
	}

	@ObfInfo(name = "aj", desc = "(IIIIZI)V", opaque = "2147483646")
	public void method4333(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.field2424;
		var2 -= this.field2432;
		if (var3 == 0) {
			if (var4 == 0) {
				this.method4311(var1, var2, 128);
				this.method4311(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.method4311(var1, var2, 2);
				this.method4311(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.method4311(var1, var2, 8);
				this.method4311(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.method4311(var1, var2, 32);
				this.method4311(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.method4311(var1, var2, 1);
				this.method4311(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.method4311(var1, var2, 4);
				this.method4311(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.method4311(var1, var2, 16);
				this.method4311(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.method4311(var1, var2, 64);
				this.method4311(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.method4311(var1, var2, 130);
				this.method4311(var1 - 1, var2, 8);
				this.method4311(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.method4311(var1, var2, 10);
				this.method4311(var1, var2 + 1, 32);
				this.method4311(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.method4311(var1, var2, 40);
				this.method4311(var1 + 1, var2, 128);
				this.method4311(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.method4311(var1, var2, 160);
				this.method4311(var1, var2 - 1, 2);
				this.method4311(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.method4311(var1, var2, 65536);
					this.method4311(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.method4311(var1, var2, 1024);
					this.method4311(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.method4311(var1, var2, 4096);
					this.method4311(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.method4311(var1, var2, 16384);
					this.method4311(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.method4311(var1, var2, 512);
					this.method4311(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.method4311(var1, var2, 2048);
					this.method4311(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.method4311(var1, var2, 8192);
					this.method4311(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.method4311(var1, var2, 32768);
					this.method4311(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.method4311(var1, var2, 66560);
					this.method4311(var1 - 1, var2, 4096);
					this.method4311(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.method4311(var1, var2, 5120);
					this.method4311(var1, var2 + 1, 16384);
					this.method4311(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.method4311(var1, var2, 20480);
					this.method4311(var1 + 1, var2, 65536);
					this.method4311(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.method4311(var1, var2, 81920);
					this.method4311(var1, var2 - 1, 1024);
					this.method4311(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfInfo(name = "av", desc = "(IIIIIZI)V", opaque = "704924458")
	public void method4310(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var8 = 33554688;
		if (var6) {
			var8 += 131072;
		}

		var1 -= this.field2424;
		var2 -= this.field2432;
		int var9;
		if (var5 == 1 || var5 == 3) {
			var9 = var3;
			var3 = var4;
			var4 = var9;
		}

		for (var9 = var1; var9 < var1 + var3; ++var9) {
			if (var9 >= 0 && var9 < this.field2433) {
				for (int var10 = var2; var10 < var2 + var4; ++var10) {
					if (var10 >= 0 && var10 < this.field2434) {
						this.method4311(var9, var10, var8);
					}
				}
			}
		}

	}

	@ObfInfo(name = "ab", desc = "(IIII)V")
	public void method4311(int var1, int var2, int var3) {
		int[] var10000 = this.field2435[var1];
		var10000[var2] &= ~var3;
	}

	@ObfInfo(name = "ai", desc = "(III)V")
	public void method4312(int var1, int var2) {
		var1 -= this.field2424;
		var2 -= this.field2432;
		int[] var10000 = this.field2435[var1];
		var10000[var2] &= -262145;
	}
}
