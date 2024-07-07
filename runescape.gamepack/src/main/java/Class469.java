import io.runebox.ObfInfo;
import java.io.IOException;
import java.io.OutputStream;

@ObfInfo(name = "sa")
public class Class469 implements Runnable {
	@ObfInfo(name = "av", desc = "Z")
	public boolean field4942;
	@ObfInfo(name = "ak", desc = "[B")
	public byte[] field4938;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1436308289)
	public int field4935;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1018166095)
	public int field4939;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 454352641)
	public int field4940;
	@ObfInfo(name = "aj", desc = "Ljava/io/IOException;")
	public IOException field4937;
	@ObfInfo(name = "ad", desc = "Ljava/io/OutputStream;")
	public OutputStream field4936;
	@ObfInfo(name = "aq", desc = "Ljava/lang/Thread;")
	public Thread field4941;

	public Class469(OutputStream var1, int var2) {
		this.field4939 = 0;
		this.field4940 = 0;
		this.field4936 = var1;
		this.field4935 = var2 + 1;
		this.field4938 = new byte[this.field4935];
		this.field4941 = new Thread(this);
		this.field4941.setDaemon(true);
		this.field4941.start();
	}

	@ObfInfo(name = "aq", desc = "(I)Z", opaque = "-43263080")
	public boolean method8536() {
		if (this.field4942) {
			try {
				this.field4936.close();
				if (this.field4937 == null) {
					this.field4937 = new IOException("");
				}
			} catch (IOException var3) {
				if (this.field4937 == null) {
					this.field4937 = new IOException(var3);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	public void run() {
		do {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.field4937 != null) {
						return;
					}

					if (this.field4939 <= this.field4940) {
						var1 = this.field4940 - this.field4939;
					} else {
						var1 = this.field4940 + (this.field4935 - this.field4939);
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.field4936.flush();
					} catch (IOException var10) {
						this.field4937 = var10;
						return;
					}

					if (this.method8536()) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var11) {
					}
				}
			}

			try {
				if (this.field4939 + var1 <= this.field4935) {
					this.field4936.write(this.field4938, this.field4939, var1);
				} else {
					int var13 = this.field4935 - this.field4939;
					this.field4936.write(this.field4938, this.field4939, var13);
					this.field4936.write(this.field4938, 0, var1 - var13);
				}
			} catch (IOException var9) {
				IOException var2 = var9;
				synchronized(this) {
					this.field4937 = var2;
					return;
				}
			}

			synchronized(this) {
				this.field4939 = (var1 + this.field4939) % this.field4935;
			}
		} while(!this.method8536());

	}

	@ObfInfo(name = "ad", desc = "([BIII)V", opaque = "-1922659046")
	public void method8537(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				if (this.field4937 != null) {
					throw new IOException(this.field4937.toString());
				} else {
					int var6;
					if (this.field4939 <= this.field4940) {
						var6 = this.field4935 - this.field4940 + this.field4939 - 1;
					} else {
						var6 = this.field4939 - this.field4940 - 1;
					}

					if (var6 < var3) {
						throw new IOException("");
					} else {
						if (var3 + this.field4940 <= this.field4935) {
							System.arraycopy(var1, var2, this.field4938, this.field4940, var3);
						} else {
							int var7 = this.field4935 - this.field4940;
							System.arraycopy(var1, var2, this.field4938, this.field4940, var7);
							System.arraycopy(var1, var7 + var2, this.field4938, 0, var3 - var7);
						}

						this.field4940 = (var3 + this.field4940) % this.field4935;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfInfo(name = "ag", desc = "(I)V")
	public void method8538() {
		synchronized(this) {
			this.field4942 = true;
			this.notifyAll();
		}

		try {
			this.field4941.join();
		} catch (InterruptedException var4) {
		}

	}
}
