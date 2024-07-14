import io.runebox.ObfInfo;
import java.io.EOFException;
import java.io.IOException;

@ObfInfo(name = "uf")
public class Class526 {
	@ObfInfo(name = "ad", desc = "Lus;")
	public Class539 field5255;
	@ObfInfo(name = "ag", desc = "[B")
	public byte[] field5256;
	@ObfInfo(name = "an", desc = "[B")
	public byte[] field5259;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 723509877)
	public int field5258;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 2105706187)
	public int field5261;
	@ObfInfo(name = "ai", desc = "J", longMultiplier = 124927601552937745L)
	public long field5254;
	@ObfInfo(name = "au", desc = "J", longMultiplier = -1194310706701037253L)
	public long field5257;
	@ObfInfo(name = "aj", desc = "J", longMultiplier = -3075363468947746217L)
	public long field5260;
	@ObfInfo(name = "ab", desc = "J", longMultiplier = 4168692518325958791L)
	public long field5262;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = 8128475648297205287L)
	public long field5263;
	@ObfInfo(name = "ae", desc = "J", longMultiplier = -499123905742165831L)
	public long field5265;

	public Class526(Class539 var1, int var2, int var3) throws IOException {
		this.field5263 = -1L;
		this.field5260 = -1L;
		this.field5261 = 0;
		this.field5255 = var1;
		this.field5265 = this.field5254 = var1.method9483();
		this.field5256 = new byte[var2];
		this.field5259 = new byte[var3];
		this.field5262 = 0L;
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	public void method9312() throws IOException {
		this.method9319();
		this.field5255.method9481();
	}

	@ObfInfo(name = "ad", desc = "(J)V")
	public void method9313(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			this.field5262 = var1;
		}
	}

	@ObfInfo(name = "ag", desc = "(I)J")
	public long method9327() {
		return this.field5265;
	}

	@ObfInfo(name = "ak", desc = "([BB)V")
	public void method9329(byte[] var1) throws IOException {
		this.method9316(var1, 0, var1.length);
	}

	@ObfInfo(name = "ap", desc = "([BIII)V", opaque = "1049335052")
	public void method9316(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
			}

			if (this.field5260 != -1L && this.field5262 >= this.field5260 && (long)var3 + this.field5262 <= (long)this.field5261 + this.field5260) {
				System.arraycopy(this.field5259, (int)(this.field5262 - this.field5260), var1, var2, var3);
				this.field5262 += (long)var3;
				return;
			}

			long var5 = this.field5262;
			int var8 = var3;
			int var9;
			if (this.field5262 >= this.field5263 && this.field5262 < (long)this.field5258 + this.field5263) {
				var9 = (int)((long)this.field5258 - (this.field5262 - this.field5263));
				if (var9 > var3) {
					var9 = var3;
				}

				System.arraycopy(this.field5256, (int)(this.field5262 - this.field5263), var1, var2, var9);
				this.field5262 += (long)var9;
				var2 += var9;
				var3 -= var9;
			}

			if (var3 > this.field5256.length) {
				this.field5255.method9479(this.field5262);

				for (this.field5257 = this.field5262; var3 > 0; var3 -= var9) {
					var9 = this.field5255.method9499(var1, var2, var3);
					if (var9 == -1) {
						break;
					}

					this.field5257 += (long)var9;
					this.field5262 += (long)var9;
					var2 += var9;
				}
			} else if (var3 > 0) {
				this.method9317();
				var9 = var3;
				if (var3 > this.field5258) {
					var9 = this.field5258;
				}

				System.arraycopy(this.field5256, 0, var1, var2, var9);
				var2 += var9;
				var3 -= var9;
				this.field5262 += (long)var9;
			}

			if (this.field5260 != -1L) {
				if (this.field5260 > this.field5262 && var3 > 0) {
					var9 = (int)(this.field5260 - this.field5262) + var2;
					if (var9 > var2 + var3) {
						var9 = var2 + var3;
					}

					while (var2 < var9) {
						var1[var2++] = 0;
						--var3;
						++this.field5262;
					}
				}

				long var15 = -1L;
				long var11 = -1L;
				if (this.field5260 >= var5 && this.field5260 < (long)var8 + var5) {
					var15 = this.field5260;
				} else if (var5 >= this.field5260 && var5 < (long)this.field5261 + this.field5260) {
					var15 = var5;
				}

				if ((long)this.field5261 + this.field5260 > var5 && (long)this.field5261 + this.field5260 <= (long)var8 + var5) {
					var11 = (long)this.field5261 + this.field5260;
				} else if ((long)var8 + var5 > this.field5260 && (long)var8 + var5 <= (long)this.field5261 + this.field5260) {
					var11 = (long)var8 + var5;
				}

				if (var15 > -1L && var11 > var15) {
					int var13 = (int)(var11 - var15);
					System.arraycopy(this.field5259, (int)(var15 - this.field5260), var1, (int)(var15 - var5) + var2, var13);
					if (var11 > this.field5262) {
						var3 = (int)((long)var3 - (var11 - this.field5262));
						this.field5262 = var11;
					}
				}
			}
		} catch (IOException var14) {
			this.field5257 = -1L;
			throw var14;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	@ObfInfo(name = "an", desc = "(I)V", opaque = "1039285770")
	public void method9317() throws IOException {
		this.field5258 = 0;
		if (this.field5262 != this.field5257) {
			this.field5255.method9479(this.field5262);
			this.field5257 = this.field5262;
		}

		int var3;
		for (this.field5263 = this.field5262; this.field5258 < this.field5256.length; this.field5258 += var3) {
			int var2 = this.field5256.length - this.field5258;
			if (var2 > 200000000) {
				var2 = 200000000;
			}

			var3 = this.field5255.method9499(this.field5256, this.field5258, var2);
			if (var3 == -1) {
				break;
			}

			this.field5257 += (long)var3;
		}

	}

	@ObfInfo(name = "aj", desc = "([BIII)V", opaque = "-51760466")
	public void method9336(byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((long)var3 + this.field5262 > this.field5265) {
				this.field5265 = (long)var3 + this.field5262;
			}

			if (this.field5260 != -1L && (this.field5262 < this.field5260 || this.field5262 > (long)this.field5261 + this.field5260)) {
				this.method9319();
			}

			if (this.field5260 != -1L && (long)var3 + this.field5262 > (long)this.field5259.length + this.field5260) {
				int var5 = (int)((long)this.field5259.length - (this.field5262 - this.field5260));
				System.arraycopy(var1, var2, this.field5259, (int)(this.field5262 - this.field5260), var5);
				this.field5262 += (long)var5;
				var2 += var5;
				var3 -= var5;
				this.field5261 = this.field5259.length;
				this.method9319();
			}

			if (var3 <= this.field5259.length) {
				if (var3 > 0) {
					if (this.field5260 == -1L) {
						this.field5260 = this.field5262;
					}

					System.arraycopy(var1, var2, this.field5259, (int)(this.field5262 - this.field5260), var3);
					this.field5262 += (long)var3;
					if (this.field5262 - this.field5260 > (long)this.field5261) {
						this.field5261 = (int)(this.field5262 - this.field5260);
					}

				}
			} else {
				if (this.field5262 != this.field5257) {
					this.field5255.method9479(this.field5262);
					this.field5257 = this.field5262;
				}

				this.field5255.method9486(var1, var2, var3);
				this.field5257 += (long)var3;
				if (this.field5257 > this.field5254) {
					this.field5254 = this.field5257;
				}

				long var11 = -1L;
				long var7 = -1L;
				if (this.field5262 >= this.field5263 && this.field5262 < (long)this.field5258 + this.field5263) {
					var11 = this.field5262;
				} else if (this.field5263 >= this.field5262 && this.field5263 < (long)var3 + this.field5262) {
					var11 = this.field5263;
				}

				if ((long)var3 + this.field5262 > this.field5263 && (long)var3 + this.field5262 <= (long)this.field5258 + this.field5263) {
					var7 = (long)var3 + this.field5262;
				} else if ((long)this.field5258 + this.field5263 > this.field5262 && (long)this.field5258 + this.field5263 <= (long)var3 + this.field5262) {
					var7 = (long)this.field5258 + this.field5263;
				}

				if (var11 > -1L && var7 > var11) {
					int var9 = (int)(var7 - var11);
					System.arraycopy(var1, (int)((long)var2 + var11 - this.field5262), this.field5256, (int)(var11 - this.field5263), var9);
				}

				this.field5262 += (long)var3;
			}
		} catch (IOException var10) {
			this.field5257 = -1L;
			throw var10;
		}
	}

	@ObfInfo(name = "av", desc = "(B)V", opaque = "1")
	public void method9319() throws IOException {
		if (this.field5260 != -1L) {
			if (this.field5260 != this.field5257) {
				this.field5255.method9479(this.field5260);
				this.field5257 = this.field5260;
			}

			this.field5255.method9486(this.field5259, 0, this.field5261);
			this.field5257 += (long)this.field5261;
			if (this.field5257 > this.field5254) {
				this.field5254 = this.field5257;
			}

			long var2 = -1L;
			long var4 = -1L;
			if (this.field5260 >= this.field5263 && this.field5260 < (long)this.field5258 + this.field5263) {
				var2 = this.field5260;
			} else if (this.field5263 >= this.field5260 && this.field5263 < (long)this.field5261 + this.field5260) {
				var2 = this.field5263;
			}

			if ((long)this.field5261 + this.field5260 > this.field5263 && (long)this.field5261 + this.field5260 <= (long)this.field5258 + this.field5263) {
				var4 = (long)this.field5261 + this.field5260;
			} else if ((long)this.field5258 + this.field5263 > this.field5260 && (long)this.field5258 + this.field5263 <= (long)this.field5261 + this.field5260) {
				var4 = (long)this.field5258 + this.field5263;
			}

			if (var2 > -1L && var4 > var2) {
				int var6 = (int)(var4 - var2);
				System.arraycopy(this.field5259, (int)(var2 - this.field5260), this.field5256, (int)(var2 - this.field5263), var6);
			}

			this.field5260 = -1L;
			this.field5261 = 0;
		}

	}

	@ObfInfo(name = "aq", desc = "(IB)I", opaque = "15")
	public static int method9337(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
