import java.io.EOFException;
import java.io.IOException;

public class Class528 {
	public Class525 field5249;
	public byte[] field5240;
	public byte[] field5242;
	public int field5241;
	public int field5244;
	public long field5243;
	public long field5245;
	public long field5246;
	public long field5248;
	public long field5250;
	public long field5251;

	public Class528(Class525 var1, int var2, int var3) throws IOException {
		this.field5243 = -1L;
		this.field5246 = -1L;
		this.field5241 = 0;
		this.field5249 = var1;
		this.field5250 = this.field5248 = var1.method9674();
		this.field5242 = new byte[var2];
		this.field5240 = new byte[var3];
		this.field5245 = 0L;
	}

	public void method9707() throws IOException {
		this.method9739();
		this.field5249.method9672();
	}

	public void method9736(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			this.field5245 = var1;
		}
	}

	public long method9714() {
		return this.field5250;
	}

	public void method9710(byte[] var1) throws IOException {
		this.method9711(var1, 0, var1.length);
	}

	public void method9711(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var3 + var2 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
			}

			if (this.field5246 != -1L && this.field5245 >= this.field5246 && this.field5245 + (long)var3 <= (long)this.field5241 + this.field5246) {
				System.arraycopy(this.field5240, (int)(this.field5245 - this.field5246), var1, var2, var3);
				this.field5245 += (long)var3;
				return;
			}

			long var5 = this.field5245;
			int var8 = var3;
			int var9;
			if (this.field5245 >= this.field5243 && this.field5245 < (long)this.field5244 + this.field5243) {
				var9 = (int)((long)this.field5244 - (this.field5245 - this.field5243));
				if (var9 > var3) {
					var9 = var3;
				}

				System.arraycopy(this.field5242, (int)(this.field5245 - this.field5243), var1, var2, var9);
				this.field5245 += (long)var9;
				var2 += var9;
				var3 -= var9;
			}

			if (var3 > this.field5242.length) {
				this.field5249.method9667(this.field5245);

				for (this.field5251 = this.field5245; var3 > 0; var3 -= var9) {
					var9 = this.field5249.method9682(var1, var2, var3);
					if (var9 == -1) {
						break;
					}

					this.field5251 += (long)var9;
					this.field5245 += (long)var9;
					var2 += var9;
				}
			} else if (var3 > 0) {
				this.method9712();
				var9 = var3;
				if (var3 > this.field5244) {
					var9 = this.field5244;
				}

				System.arraycopy(this.field5242, 0, var1, var2, var9);
				var2 += var9;
				var3 -= var9;
				this.field5245 += (long)var9;
			}

			if (-1L != this.field5246) {
				if (this.field5246 > this.field5245 && var3 > 0) {
					var9 = (int)(this.field5246 - this.field5245) + var2;
					if (var9 > var3 + var2) {
						var9 = var3 + var2;
					}

					while (var2 < var9) {
						var1[var2++] = 0;
						--var3;
						++this.field5245;
					}
				}

				long var15 = -1L;
				long var11 = -1L;
				if (this.field5246 >= var5 && this.field5246 < (long)var8 + var5) {
					var15 = this.field5246;
				} else if (var5 >= this.field5246 && var5 < this.field5246 + (long)this.field5241) {
					var15 = var5;
				}

				if ((long)this.field5241 + this.field5246 > var5 && this.field5246 + (long)this.field5241 <= var5 + (long)var8) {
					var11 = (long)this.field5241 + this.field5246;
				} else if ((long)var8 + var5 > this.field5246 && var5 + (long)var8 <= (long)this.field5241 + this.field5246) {
					var11 = var5 + (long)var8;
				}

				if (var15 > -1L && var11 > var15) {
					int var13 = (int)(var11 - var15);
					System.arraycopy(this.field5240, (int)(var15 - this.field5246), var1, var2 + (int)(var15 - var5), var13);
					if (var11 > this.field5245) {
						var3 = (int)((long)var3 - (var11 - this.field5245));
						this.field5245 = var11;
					}
				}
			}
		} catch (IOException var14) {
			this.field5251 = -1L;
			throw var14;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	public void method9712() throws IOException {
		this.field5244 = 0;
		if (this.field5251 != this.field5245) {
			this.field5249.method9667(this.field5245);
			this.field5251 = this.field5245;
		}

		int var3;
		for (this.field5243 = this.field5245; this.field5244 < this.field5242.length; this.field5244 += var3) {
			int var2 = this.field5242.length - this.field5244;
			if (var2 > 200000000) {
				var2 = 200000000;
			}

			var3 = this.field5249.method9682(this.field5242, this.field5244, var2);
			if (var3 == -1) {
				break;
			}

			this.field5251 += (long)var3;
		}

	}

	public void method9709(byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((long)var3 + this.field5245 > this.field5250) {
				this.field5250 = (long)var3 + this.field5245;
			}

			if (this.field5246 != -1L && (this.field5245 < this.field5246 || this.field5245 > this.field5246 + (long)this.field5241)) {
				this.method9739();
			}

			if (-1L != this.field5246 && (long)var3 + this.field5245 > this.field5246 + (long)this.field5240.length) {
				int var5 = (int)((long)this.field5240.length - (this.field5245 - this.field5246));
				System.arraycopy(var1, var2, this.field5240, (int)(this.field5245 - this.field5246), var5);
				this.field5245 += (long)var5;
				var2 += var5;
				var3 -= var5;
				this.field5241 = this.field5240.length;
				this.method9739();
			}

			if (var3 <= this.field5240.length) {
				if (var3 > 0) {
					if (-1L == this.field5246) {
						this.field5246 = this.field5245;
					}

					System.arraycopy(var1, var2, this.field5240, (int)(this.field5245 - this.field5246), var3);
					this.field5245 += (long)var3;
					if (this.field5245 - this.field5246 > (long)this.field5241) {
						this.field5241 = (int)(this.field5245 - this.field5246);
					}

				}
			} else {
				if (this.field5251 != this.field5245) {
					this.field5249.method9667(this.field5245);
					this.field5251 = this.field5245;
				}

				this.field5249.method9668(var1, var2, var3);
				this.field5251 += (long)var3;
				if (this.field5251 > this.field5248) {
					this.field5248 = this.field5251;
				}

				long var11 = -1L;
				long var7 = -1L;
				if (this.field5245 >= this.field5243 && this.field5245 < this.field5243 + (long)this.field5244) {
					var11 = this.field5245;
				} else if (this.field5243 >= this.field5245 && this.field5243 < this.field5245 + (long)var3) {
					var11 = this.field5243;
				}

				if ((long)var3 + this.field5245 > this.field5243 && this.field5245 + (long)var3 <= (long)this.field5244 + this.field5243) {
					var7 = this.field5245 + (long)var3;
				} else if ((long)this.field5244 + this.field5243 > this.field5245 && this.field5243 + (long)this.field5244 <= (long)var3 + this.field5245) {
					var7 = this.field5243 + (long)this.field5244;
				}

				if (var11 > -1L && var7 > var11) {
					int var9 = (int)(var7 - var11);
					System.arraycopy(var1, (int)(var11 + (long)var2 - this.field5245), this.field5242, (int)(var11 - this.field5243), var9);
				}

				this.field5245 += (long)var3;
			}
		} catch (IOException var10) {
			this.field5251 = -1L;
			throw var10;
		}
	}

	public void method9739() throws IOException {
		if (-1L != this.field5246) {
			if (this.field5246 != this.field5251) {
				this.field5249.method9667(this.field5246);
				this.field5251 = this.field5246;
			}

			this.field5249.method9668(this.field5240, 0, this.field5241);
			this.field5251 += (long)this.field5241;
			if (this.field5251 > this.field5248) {
				this.field5248 = this.field5251;
			}

			long var2 = -1L;
			long var4 = -1L;
			if (this.field5246 >= this.field5243 && this.field5246 < (long)this.field5244 + this.field5243) {
				var2 = this.field5246;
			} else if (this.field5243 >= this.field5246 && this.field5243 < this.field5246 + (long)this.field5241) {
				var2 = this.field5243;
			}

			if ((long)this.field5241 + this.field5246 > this.field5243 && this.field5246 + (long)this.field5241 <= (long)this.field5244 + this.field5243) {
				var4 = (long)this.field5241 + this.field5246;
			} else if ((long)this.field5244 + this.field5243 > this.field5246 && this.field5243 + (long)this.field5244 <= (long)this.field5241 + this.field5246) {
				var4 = this.field5243 + (long)this.field5244;
			}

			if (var2 > -1L && var4 > var2) {
				int var6 = (int)(var4 - var2);
				System.arraycopy(this.field5240, (int)(var2 - this.field5246), this.field5242, (int)(var2 - this.field5243), var6);
			}

			this.field5246 = -1L;
			this.field5241 = 0;
		}

	}
}
