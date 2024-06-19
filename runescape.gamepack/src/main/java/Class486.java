import java.io.IOException;
import java.io.OutputStream;

public class Class486 implements Runnable {
	public boolean field4971;
	public byte[] field4968;
	public int field4969;
	public int field4970;
	public int field4972;
	public IOException field4974;
	public OutputStream field4973;
	public Thread field4975;

	public Class486(OutputStream var1, int var2) {
		this.field4972 = 0;
		this.field4969 = 0;
		this.field4973 = var1;
		this.field4970 = var2 + 1;
		this.field4968 = new byte[this.field4970];
		this.field4975 = new Thread(this);
		this.field4975.setDaemon(true);
		this.field4975.start();
	}

	public boolean method8886() {
		if (this.field4971) {
			try {
				this.field4973.close();
				if (this.field4974 == null) {
					this.field4974 = new IOException("");
				}
			} catch (IOException var3) {
				if (this.field4974 == null) {
					this.field4974 = new IOException(var3);
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
					if (this.field4974 != null) {
						return;
					}

					if (this.field4972 <= this.field4969) {
						var1 = this.field4969 - this.field4972;
					} else {
						var1 = this.field4970 - this.field4972 + this.field4969;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.field4973.flush();
					} catch (IOException var10) {
						this.field4974 = var10;
						return;
					}

					if (this.method8886()) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var11) {
					}
				}
			}

			try {
				if (var1 + this.field4972 <= this.field4970) {
					this.field4973.write(this.field4968, this.field4972, var1);
				} else {
					int var13 = this.field4970 - this.field4972;
					this.field4973.write(this.field4968, this.field4972, var13);
					this.field4973.write(this.field4968, 0, var1 - var13);
				}
			} catch (IOException var9) {
				IOException var2 = var9;
				synchronized(this) {
					this.field4974 = var2;
					return;
				}
			}

			synchronized(this) {
				this.field4972 = (var1 + this.field4972) % this.field4970;
			}
		} while(!this.method8886());

	}

	public void method8887(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				if (this.field4974 != null) {
					throw new IOException(this.field4974.toString());
				} else {
					int var6;
					if (this.field4972 <= this.field4969) {
						var6 = this.field4972 + (this.field4970 - this.field4969) - 1;
					} else {
						var6 = this.field4972 - this.field4969 - 1;
					}

					if (var6 < var3) {
						throw new IOException("");
					} else {
						if (this.field4969 + var3 <= this.field4970) {
							System.arraycopy(var1, var2, this.field4968, this.field4969, var3);
						} else {
							int var7 = this.field4970 - this.field4969;
							System.arraycopy(var1, var2, this.field4968, this.field4969, var7);
							System.arraycopy(var1, var7 + var2, this.field4968, 0, var3 - var7);
						}

						this.field4969 = (this.field4969 + var3) % this.field4970;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	public void method8898() {
		synchronized(this) {
			this.field4971 = true;
			this.notifyAll();
		}

		try {
			this.field4975.join();
		} catch (InterruptedException var4) {
		}

	}
}