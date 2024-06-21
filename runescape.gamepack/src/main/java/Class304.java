import io.runebox.ObfInfo;

@ObfInfo(name = "lr")
public class Class304 {
	@ObfInfo(name = "al", desc = "[[[B")
	public byte[][][] field3226;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -411117179)
	public int field3227;

	public Class304(int var1) {
		this.field3227 = var1;
	}

	@ObfInfo(name = "ak", desc = "(IIIIIIIIB)V", opaque = "2")
	public void method6099(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && 0 != this.field3227 && this.field3226 != null) {
			var8 = this.method6070(var8, var7);
			var7 = this.method6071(var7);
			Class561.method10141(var1, var2, var5, var6, var3, var4, this.field3226[var7 - 1][var8], this.field3227, true);
		}
	}

	@ObfInfo(name = "al", desc = "(IIB)I", opaque = "7")
	public int method6070(int var1, int var2) {
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

	@ObfInfo(name = "aj", desc = "(IB)I", opaque = "0")
	public int method6071(int var1) {
		if (var1 != 9 && var1 != 10) {
			return var1 == 11 ? 8 : var1;
		} else {
			return 1;
		}
	}

	@ObfInfo(name = "az", desc = "(I)V", opaque = "-1188034264")
	public void method6087() {
		if (this.field3226 == null) {
			this.field3226 = new byte[8][4][];
			this.method6076();
			this.method6074();
			this.method6090();
			this.method6086();
			this.method6100();
			this.method6078();
			this.method6110();
			this.method6080();
		}
	}

	@ObfInfo(name = "af", desc = "(I)V", opaque = "-1316781830")
	public void method6076() {
		byte[] var2 = new byte[this.field3227 * this.field3227];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[0][0] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[0][1] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[0][2] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[0][3] = var2;
	}

	@ObfInfo(name = "aa", desc = "(I)V", opaque = "-508008600")
	public void method6074() {
		byte[] var2 = new byte[this.field3227 * this.field3227];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[1][0] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
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

		this.field3226[1][1] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = this.field3227 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[1][2] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3227 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[1][3] = var2;
	}

	@ObfInfo(name = "at", desc = "(I)V", opaque = "-1331040164")
	public void method6090() {
		byte[] var2 = new byte[this.field3227 * this.field3227];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3227 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[2][0] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[2][1] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[2][2] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = this.field3227 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[2][3] = var2;
	}

	@ObfInfo(name = "ab", desc = "(I)V", opaque = "-248639236")
	public void method6086() {
		byte[] var2 = new byte[this.field3227 * this.field3227];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[3][0] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[3][1] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = this.field3227 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[3][2] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3227 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[3][3] = var2;
	}

	@ObfInfo(name = "ac", desc = "(I)V", opaque = "1452648307")
	public void method6100() {
		byte[] var2 = new byte[this.field3227 * this.field3227];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3227 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[4][0] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[4][1] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[4][2] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var3 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = this.field3227 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field3226[4][3] = var2;
	}

	@ObfInfo(name = "ao", desc = "(S)V", opaque = "8211")
	public void method6078() {
		byte[] var2 = new byte[this.field3227 * this.field3227];
		boolean var3 = false;
		var2 = new byte[this.field3227 * this.field3227];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 <= this.field3227 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3226[5][0] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var6 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var4 <= this.field3227 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3226[5][1] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var6 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 >= this.field3227 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3226[5][2] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var6 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var4 >= this.field3227 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3226[5][3] = var2;
	}

	@ObfInfo(name = "ah", desc = "(S)V", opaque = "254")
	public void method6110() {
		byte[] var2 = new byte[this.field3227 * this.field3227];
		boolean var3 = false;
		var2 = new byte[this.field3227 * this.field3227];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 <= var4 - this.field3227 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3226[6][0] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var6 = 0;

		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 <= var4 - this.field3227 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3226[6][1] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var6 = 0;

		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3227 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field3227 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3226[6][2] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var6 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = this.field3227 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field3227 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3226[6][3] = var2;
	}

	@ObfInfo(name = "av", desc = "(I)V", opaque = "-2089863919")
	public void method6080() {
		byte[] var2 = new byte[this.field3227 * this.field3227];
		boolean var3 = false;
		var2 = new byte[this.field3227 * this.field3227];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 >= var4 - this.field3227 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3226[7][0] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var6 = 0;

		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field3227; ++var5) {
				if (var5 >= var4 - this.field3227 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3226[7][1] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var6 = 0;

		for (var4 = this.field3227 - 1; var4 >= 0; --var4) {
			for (var5 = this.field3227 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 - this.field3227 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3226[7][2] = var2;
		var2 = new byte[this.field3227 * this.field3227];
		var6 = 0;

		for (var4 = 0; var4 < this.field3227; ++var4) {
			for (var5 = this.field3227 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 - this.field3227 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field3226[7][3] = var2;
	}
}
