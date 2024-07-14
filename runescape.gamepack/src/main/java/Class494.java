import io.runebox.ObfInfo;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfInfo(name = "sz")
public class Class494 implements Runnable {
	@ObfInfo(name = "ak", desc = "[B")
	public byte[] field5040;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 725690807)
	public int field5042;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1931419243)
	public int field5043;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 512687671)
	public int field5045;
	@ObfInfo(name = "aj", desc = "Ljava/io/IOException;")
	public IOException field5044;
	@ObfInfo(name = "ad", desc = "Ljava/io/InputStream;")
	public InputStream field5039;
	@ObfInfo(name = "aq", desc = "Ljava/lang/Thread;")
	public Thread field5041;

	public Class494(InputStream var1, int var2) {
		this.field5042 = 0;
		this.field5043 = 0;
		this.field5039 = var1;
		this.field5045 = var2 + 1;
		this.field5040 = new byte[this.field5045];
		this.field5041 = new Thread(this);
		this.field5041.setDaemon(true);
		this.field5041.start();
	}

	public void run() {
		while (true) {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.field5044 != null) {
						return;
					}

					if (this.field5042 == 0) {
						var1 = this.field5045 - this.field5043 - 1;
					} else if (this.field5042 <= this.field5043) {
						var1 = this.field5045 - this.field5043;
					} else {
						var1 = this.field5042 - this.field5043 - 1;
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
				var2 = this.field5039.read(this.field5040, this.field5043, var1);
				if (var2 == -1) {
					throw new EOFException();
				}
			} catch (IOException var10) {
				IOException var3 = var10;
				synchronized(this) {
					this.field5044 = var3;
					return;
				}
			}

			synchronized(this) {
				this.field5043 = (this.field5043 + var2) % this.field5045;
			}
		}
	}

	@ObfInfo(name = "aq", desc = "(II)Z", opaque = "-434744533")
	public boolean method8833(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.field5045) {
			synchronized(this) {
				int var4;
				if (this.field5042 <= this.field5043) {
					var4 = this.field5043 - this.field5042;
				} else {
					var4 = this.field5045 - this.field5042 + this.field5043;
				}

				if (var4 < var1) {
					if (this.field5044 != null) {
						throw new IOException(this.field5044.toString());
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

	@ObfInfo(name = "ad", desc = "(B)I", opaque = "0")
	public int method8834() throws IOException {
		synchronized(this) {
			int var3;
			if (this.field5042 <= this.field5043) {
				var3 = this.field5043 - this.field5042;
			} else {
				var3 = this.field5045 - this.field5042 + this.field5043;
			}

			if (var3 <= 0 && this.field5044 != null) {
				throw new IOException(this.field5044.toString());
			} else {
				this.notifyAll();
				return var3;
			}
		}
	}

	@ObfInfo(name = "ag", desc = "(I)I", opaque = "1875502007")
	public int method8850() throws IOException {
		synchronized(this) {
			if (this.field5043 == this.field5042) {
				if (this.field5044 != null) {
					throw new IOException(this.field5044.toString());
				} else {
					return -1;
				}
			} else {
				int var3 = this.field5040[this.field5042] & 255;
				this.field5042 = (this.field5042 + 1) % this.field5045;
				this.notifyAll();
				return var3;
			}
		}
	}

	@ObfInfo(name = "ak", desc = "([BIII)I", opaque = "-484263670")
	public int method8853(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized(this) {
				int var6;
				if (this.field5042 <= this.field5043) {
					var6 = this.field5043 - this.field5042;
				} else {
					var6 = this.field5045 - this.field5042 + this.field5043;
				}

				if (var3 > var6) {
					var3 = var6;
				}

				if (var3 == 0 && this.field5044 != null) {
					throw new IOException(this.field5044.toString());
				} else {
					if (this.field5042 + var3 <= this.field5045) {
						System.arraycopy(this.field5040, this.field5042, var1, var2, var3);
					} else {
						int var7 = this.field5045 - this.field5042;
						System.arraycopy(this.field5040, this.field5042, var1, var2, var7);
						System.arraycopy(this.field5040, 0, var1, var2 + var7, var3 - var7);
					}

					this.field5042 = (this.field5042 + var3) % this.field5045;
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfInfo(name = "ap", desc = "(I)V", opaque = "-1127898521")
	public void method8854() {
		synchronized(this) {
			if (this.field5044 == null) {
				this.field5044 = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.field5041.join();
		} catch (InterruptedException var4) {
		}

	}
}
