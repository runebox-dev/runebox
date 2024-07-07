import io.runebox.ObfInfo;

@ObfInfo(name = "kp")
public class Class276 {
	@ObfInfo(name = "ad", desc = "[[[B")
	public byte[][][] field2820;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 109380095)
	public int field2823;

	public Class276(int var1) {
		this.field2823 = var1;
	}

	@ObfInfo(name = "aq", desc = "(IIIIIIIII)V", opaque = "1412617955")
	public void method5207(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && 0 != this.field2823 && this.field2820 != null) {
			var8 = this.method5246(var8, var7);
			var7 = this.method5209(var7);
			Class569.method10141(var1, var2, var5, var6, var3, var4, this.field2820[var7 - 1][var8], this.field2823, true);
		}
	}

	@ObfInfo(name = "ad", desc = "(III)I", opaque = "-212114583")
	public int method5246(int var1, int var2) {
		if (var2 == 9) {
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) {
			var1 = var1 + 3 & 3;
		}

		if (var2 == 11) {
			var1 = var1 + 3 & 3;
		}

		return var1;
	}

	@ObfInfo(name = "ag", desc = "(IS)I", opaque = "4210")
	public int method5209(int var1) {
		if (var1 != 9 && var1 != 10) {
			return var1 == 11 ? 8 : var1;
		} else {
			return 1;
		}
	}

	@ObfInfo(name = "ak", desc = "(B)V")
	public void method5208() {
		if (this.field2820 == null) {
			this.field2820 = new byte[8][4][];
			this.method5211();
			this.method5212();
			this.method5213();
			this.method5214();
			this.method5206();
			this.method5249();
			this.method5217();
			this.method5218();
		}
	}

	@ObfInfo(name = "ap", desc = "(B)V", opaque = "47")
	public void method5211() {
		byte[] var2 = new byte[this.field2823 * this.field2823];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[0][0] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[0][1] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[0][2] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[0][3] = var2;
	}

	@ObfInfo(name = "an", desc = "(I)V", opaque = "-778747730")
	public void method5212() {
		byte[] var2 = new byte[this.field2823 * this.field2823];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[1][0] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var3 >= 0 && var3 < var2.length) {
					if (var5 >= var4 << 1) {
						var2[var3] = -1;
					}

					++var3;
				} else {
					++var3;
				}
			}
		}

		this.field2820[1][1] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = this.field2823 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[1][2] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2823 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[1][3] = var2;
	}

	@ObfInfo(name = "aj", desc = "(I)V", opaque = "-273221889")
	public void method5213() {
		byte[] var2 = new byte[this.field2823 * this.field2823];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2823 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[2][0] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[2][1] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[2][2] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = this.field2823 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[2][3] = var2;
	}

	@ObfInfo(name = "av", desc = "(I)V", opaque = "769603280")
	public void method5214() {
		byte[] var2 = new byte[this.field2823 * this.field2823];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[3][0] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[3][1] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = this.field2823 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[3][2] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2823 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[3][3] = var2;
	}

	@ObfInfo(name = "ab", desc = "(I)V", opaque = "-1411617869")
	public void method5206() {
		byte[] var2 = new byte[this.field2823 * this.field2823];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2823 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[4][0] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[4][1] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[4][2] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var3 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = this.field2823 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2820[4][3] = var2;
	}

	@ObfInfo(name = "ai", desc = "(B)V", opaque = "-4")
	public void method5249() {
		byte[] var2 = new byte[this.field2823 * this.field2823];
		boolean var3 = false;
		var2 = new byte[this.field2823 * this.field2823];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 <= this.field2823 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2820[5][0] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var6 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var4 <= this.field2823 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2820[5][1] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var6 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 >= this.field2823 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2820[5][2] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var6 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var4 >= this.field2823 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2820[5][3] = var2;
	}

	@ObfInfo(name = "ae", desc = "(B)V", opaque = "66")
	public void method5217() {
		byte[] var2 = new byte[this.field2823 * this.field2823];
		boolean var3 = false;
		var2 = new byte[this.field2823 * this.field2823];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 <= var4 - this.field2823 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2820[6][0] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var6 = 0;

		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 <= var4 - this.field2823 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2820[6][1] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var6 = 0;

		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2823 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field2823 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2820[6][2] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var6 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = this.field2823 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field2823 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2820[6][3] = var2;
	}

	@ObfInfo(name = "au", desc = "(I)V", opaque = "-1525777970")
	public void method5218() {
		byte[] var2 = new byte[this.field2823 * this.field2823];
		boolean var3 = false;
		var2 = new byte[this.field2823 * this.field2823];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 >= var4 - this.field2823 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2820[7][0] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var6 = 0;

		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2823; ++var5) {
				if (var5 >= var4 - this.field2823 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2820[7][1] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var6 = 0;

		for (var4 = this.field2823 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2823 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 - this.field2823 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2820[7][2] = var2;
		var2 = new byte[this.field2823 * this.field2823];
		var6 = 0;

		for (var4 = 0; var4 < this.field2823; ++var4) {
			for (var5 = this.field2823 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 - this.field2823 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2820[7][3] = var2;
	}
}
