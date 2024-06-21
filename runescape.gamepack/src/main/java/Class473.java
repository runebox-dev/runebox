import io.runebox.ObfInfo;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfInfo(name = "se")
public class Class473 implements Runnable {
	@ObfInfo(name = "az", desc = "[B")
	public byte[] field4928;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -222659867)
	public int field4925;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1402659075)
	public int field4929;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1209319713)
	public int field4930;
	@ObfInfo(name = "at", desc = "Ljava/io/IOException;")
	public IOException field4931;
	@ObfInfo(name = "al", desc = "Ljava/io/InputStream;")
	public InputStream field4926;
	@ObfInfo(name = "ak", desc = "Ljava/lang/Thread;")
	public Thread field4927;

	public Class473(InputStream var1, int var2) {
		this.field4929 = 0;
		this.field4930 = 0;
		this.field4926 = var1;
		this.field4925 = var2 + 1;
		this.field4928 = new byte[this.field4925];
		this.field4927 = new Thread(this);
		this.field4927.setDaemon(true);
		this.field4927.start();
	}

	@ObfInfo(desc = "()V")
	public void run() {
		while (true) {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.field4931 != null) {
						return;
					}

					if (this.field4929 == 0) {
						var1 = this.field4925 - this.field4930 - 1;
					} else if (this.field4929 <= this.field4930) {
						var1 = this.field4925 - this.field4930;
					} else {
						var1 = this.field4929 - this.field4930 - 1;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var9) {
					}
				}
			}

			int var2;
			try {
				var2 = this.field4926.read(this.field4928, this.field4930, var1);
				if (var2 == -1) {
					throw new EOFException();
				}
			} catch (IOException var10) {
				IOException var3 = var10;
				synchronized(this) {
					this.field4931 = var3;
					return;
				}
			}

			synchronized(this) {
				this.field4930 = (this.field4930 + var2) % this.field4925;
			}
		}
	}

	@ObfInfo(name = "ak", desc = "(II)Z", opaque = "1358412808")
	public boolean method8670(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.field4925) {
			synchronized(this) {
				int var4;
				if (this.field4929 <= this.field4930) {
					var4 = this.field4930 - this.field4929;
				} else {
					var4 = this.field4930 + (this.field4925 - this.field4929);
				}

				if (var4 < var1) {
					if (this.field4931 != null) {
						throw new IOException(this.field4931.toString());
					} else {
						this.notifyAll();
						return false;
					}
				} else {
					return true;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfInfo(name = "al", desc = "(I)I", opaque = "586789280")
	public int method8657() throws IOException {
		synchronized(this) {
			int var3;
			if (this.field4929 <= this.field4930) {
				var3 = this.field4930 - this.field4929;
			} else {
				var3 = this.field4930 + (this.field4925 - this.field4929);
			}

			if (var3 <= 0 && this.field4931 != null) {
				throw new IOException(this.field4931.toString());
			} else {
				this.notifyAll();
				return var3;
			}
		}
	}

	@ObfInfo(name = "aj", desc = "(I)I", opaque = "573658722")
	public int method8656() throws IOException {
		synchronized(this) {
			if (this.field4930 == this.field4929) {
				if (this.field4931 != null) {
					throw new IOException(this.field4931.toString());
				} else {
					return -1;
				}
			} else {
				int var3 = this.field4928[this.field4929] & 255;
				this.field4929 = (1 + this.field4929) % this.field4925;
				this.notifyAll();
				return var3;
			}
		}
	}

	@ObfInfo(name = "az", desc = "([BIII)I", opaque = "-1285311469")
	public int method8659(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				int var6;
				if (this.field4929 <= this.field4930) {
					var6 = this.field4930 - this.field4929;
				} else {
					var6 = this.field4925 - this.field4929 + this.field4930;
				}

				if (var3 > var6) {
					var3 = var6;
				}

				if (var3 == 0 && this.field4931 != null) {
					throw new IOException(this.field4931.toString());
				} else {
					if (var3 + this.field4929 <= this.field4925) {
						System.arraycopy(this.field4928, this.field4929, var1, var2, var3);
					} else {
						int var7 = this.field4925 - this.field4929;
						System.arraycopy(this.field4928, this.field4929, var1, var2, var7);
						System.arraycopy(this.field4928, 0, var1, var7 + var2, var3 - var7);
					}

					this.field4929 = (this.field4929 + var3) % this.field4925;
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfInfo(name = "af", desc = "(I)V", opaque = "578463986")
	public void method8660() {
		synchronized(this) {
			if (this.field4931 == null) {
				this.field4931 = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.field4927.join();
		} catch (InterruptedException var4) {
		}

	}
}
