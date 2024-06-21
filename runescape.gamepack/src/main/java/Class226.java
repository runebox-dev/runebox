import io.runebox.ObfInfo;

public class Class226 {
	@ObfInfo(name = "bg", desc = "I", intMultiplier = 462939225)
	public int field2362;
	@ObfInfo(name = "bu", desc = "I", intMultiplier = -907414625)
	public int field2364;
	@ObfInfo(name = "be", desc = "I", intMultiplier = 431710865)
	public int field2369;
	@ObfInfo(name = "bh", desc = "I", intMultiplier = 1122138315)
	public int field2372;
	@ObfInfo(name = "bk", desc = "[[I")
	public int[][] field2363;

	public Class226(int var1, int var2) {
		this.field2369 = 0;
		this.field2362 = 0;
		this.field2364 = var1;
		this.field2372 = var2;
		this.field2363 = new int[this.field2364][this.field2372];
		this.method4302();
	}

	@ObfInfo(name = "ak", desc = "(I)V", opaque = "1687727593")
	public void method4302() {
		for (int var2 = 0; var2 < this.field2364; ++var2) {
			for (int var3 = 0; var3 < this.field2372; ++var3) {
				if (var2 != 0 && var3 != 0 && var2 < this.field2364 - 5 && var3 < this.field2372 - 5) {
					this.field2363[var2][var3] = 1073741824;
				} else {
					this.field2363[var2][var3] = 16777215;
				}
			}
		}

	}

	@ObfInfo(name = "al", desc = "(IIIIZB)V", opaque = "-1")
	public void method4303(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.field2369;
		var2 -= this.field2362;
		if (var3 == 0) {
			if (var4 == 0) {
				this.method4307(var1, var2, 128);
				this.method4307(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.method4307(var1, var2, 2);
				this.method4307(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.method4307(var1, var2, 8);
				this.method4307(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.method4307(var1, var2, 32);
				this.method4307(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.method4307(var1, var2, 1);
				this.method4307(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.method4307(var1, var2, 4);
				this.method4307(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.method4307(var1, var2, 16);
				this.method4307(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.method4307(var1, var2, 64);
				this.method4307(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.method4307(var1, var2, 130);
				this.method4307(var1 - 1, var2, 8);
				this.method4307(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.method4307(var1, var2, 10);
				this.method4307(var1, var2 + 1, 32);
				this.method4307(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.method4307(var1, var2, 40);
				this.method4307(var1 + 1, var2, 128);
				this.method4307(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.method4307(var1, var2, 160);
				this.method4307(var1, var2 - 1, 2);
				this.method4307(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.method4307(var1, var2, 65536);
					this.method4307(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.method4307(var1, var2, 1024);
					this.method4307(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.method4307(var1, var2, 4096);
					this.method4307(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.method4307(var1, var2, 16384);
					this.method4307(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.method4307(var1, var2, 512);
					this.method4307(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.method4307(var1, var2, 2048);
					this.method4307(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.method4307(var1, var2, 8192);
					this.method4307(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.method4307(var1, var2, 32768);
					this.method4307(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.method4307(var1, var2, 66560);
					this.method4307(var1 - 1, var2, 4096);
					this.method4307(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.method4307(var1, var2, 5120);
					this.method4307(var1, var2 + 1, 16384);
					this.method4307(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.method4307(var1, var2, 20480);
					this.method4307(var1 + 1, var2, 65536);
					this.method4307(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.method4307(var1, var2, 81920);
					this.method4307(var1, var2 - 1, 1024);
					this.method4307(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfInfo(name = "aj", desc = "(IIIIZI)V", opaque = "1970370370")
	public void method4301(int var1, int var2, int var3, int var4, boolean var5) {
		int var7 = 256;
		if (var5) {
			var7 += 131072;
		}

		var1 -= this.field2369;
		var2 -= this.field2362;

		for (int var8 = var1; var8 < var3 + var1; ++var8) {
			if (var8 >= 0 && var8 < this.field2364) {
				for (int var9 = var2; var9 < var4 + var2; ++var9) {
					if (var9 >= 0 && var9 < this.field2372) {
						this.method4307(var8, var9, var7);
					}
				}
			}
		}

	}

	@ObfInfo(name = "az", desc = "(III)V")
	public void method4305(int var1, int var2) {
		var1 -= this.field2369;
		var2 -= this.field2362;
		int[] var10000 = this.field2363[var1];
		var10000[var2] |= 2097152;
	}

	@ObfInfo(name = "af", desc = "(III)V")
	public void method4306(int var1, int var2) {
		var1 -= this.field2369;
		var2 -= this.field2362;
		int[] var10000 = this.field2363[var1];
		var10000[var2] |= 262144;
	}

	@ObfInfo(name = "aa", desc = "(IIII)V")
	public void method4307(int var1, int var2, int var3) {
		int[] var10000 = this.field2363[var1];
		var10000[var2] |= var3;
	}

	@ObfInfo(name = "at", desc = "(IIIIZI)V", opaque = "761211736")
	public void method4324(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.field2369;
		var2 -= this.field2362;
		if (var3 == 0) {
			if (var4 == 0) {
				this.method4309(var1, var2, 128);
				this.method4309(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.method4309(var1, var2, 2);
				this.method4309(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.method4309(var1, var2, 8);
				this.method4309(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.method4309(var1, var2, 32);
				this.method4309(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.method4309(var1, var2, 1);
				this.method4309(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.method4309(var1, var2, 4);
				this.method4309(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.method4309(var1, var2, 16);
				this.method4309(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.method4309(var1, var2, 64);
				this.method4309(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.method4309(var1, var2, 130);
				this.method4309(var1 - 1, var2, 8);
				this.method4309(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.method4309(var1, var2, 10);
				this.method4309(var1, var2 + 1, 32);
				this.method4309(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.method4309(var1, var2, 40);
				this.method4309(var1 + 1, var2, 128);
				this.method4309(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.method4309(var1, var2, 160);
				this.method4309(var1, var2 - 1, 2);
				this.method4309(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.method4309(var1, var2, 65536);
					this.method4309(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.method4309(var1, var2, 1024);
					this.method4309(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.method4309(var1, var2, 4096);
					this.method4309(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.method4309(var1, var2, 16384);
					this.method4309(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.method4309(var1, var2, 512);
					this.method4309(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.method4309(var1, var2, 2048);
					this.method4309(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.method4309(var1, var2, 8192);
					this.method4309(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.method4309(var1, var2, 32768);
					this.method4309(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.method4309(var1, var2, 66560);
					this.method4309(var1 - 1, var2, 4096);
					this.method4309(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.method4309(var1, var2, 5120);
					this.method4309(var1, var2 + 1, 16384);
					this.method4309(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.method4309(var1, var2, 20480);
					this.method4309(var1 + 1, var2, 65536);
					this.method4309(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.method4309(var1, var2, 81920);
					this.method4309(var1, var2 - 1, 1024);
					this.method4309(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfInfo(name = "ab", desc = "(IIIIIZI)V", opaque = "1270669828")
	public void method4308(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var8 = 33554688;
		if (var6) {
			var8 += 131072;
		}

		var1 -= this.field2369;
		var2 -= this.field2362;
		int var9;
		if (var5 == 1 || var5 == 3) {
			var9 = var3;
			var3 = var4;
			var4 = var9;
		}

		for (var9 = var1; var9 < var3 + var1; ++var9) {
			if (var9 >= 0 && var9 < this.field2364) {
				for (int var10 = var2; var10 < var4 + var2; ++var10) {
					if (var10 >= 0 && var10 < this.field2372) {
						this.method4309(var9, var10, var8);
					}
				}
			}
		}

	}

	@ObfInfo(name = "ac", desc = "(IIIB)V")
	public void method4309(int var1, int var2, int var3) {
		int[] var10000 = this.field2363[var1];
		var10000[var2] &= ~var3;
	}

	@ObfInfo(name = "ao", desc = "(III)V")
	public void method4316(int var1, int var2) {
		var1 -= this.field2369;
		var2 -= this.field2362;
		int[] var10000 = this.field2363[var1];
		var10000[var2] &= -262145;
	}
}
