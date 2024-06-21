import io.runebox.ObfInfo;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfInfo(name = "gz")
public class Class182 implements Runnable {
	@ObfInfo(name = "aj", desc = "Lhe;")
	public Class187 field1901;
	@ObfInfo(name = "az", desc = "Lhe;")
	public Class187 field1902;
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field1899;
	@ObfInfo(name = "af", desc = "Ljava/lang/Thread;")
	public Thread field1903;

	public Class182() {
		this.field1901 = null;
		this.field1902 = null;
		this.field1899 = false;
		Class548.field1908 = "Unknown";
		Class548.field1900 = "1.6";

		try {
			Class548.field1908 = System.getProperty("java.vendor");
			Class548.field1900 = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.field1899 = false;
		this.field1903 = new Thread(this);
		this.field1903.setPriority(10);
		this.field1903.setDaemon(true);
		this.field1903.start();
	}

	@ObfInfo(name = "ak", desc = "(B)V")
	public final void method3658() {
		synchronized(this) {
			this.field1899 = true;
			this.notifyAll();
		}

		try {
			this.field1903.join();
		} catch (InterruptedException var4) {
		}

	}

	@ObfInfo(name = "run", desc = "()V")
	public final void run() {
		while (true) {
			Class187 var1;
			synchronized(this) {
				while (true) {
					if (this.field1899) {
						return;
					}

					if (this.field1901 != null) {
						var1 = this.field1901;
						this.field1901 = this.field1901.field1934;
						if (this.field1901 == null) {
							this.field1902 = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var7) {
					}
				}
			}

			try {
				int var2 = var1.field1936;
				if (var2 == 1) {
					var1.field1929 = new Socket(InetAddress.getByName((String)var1.field1935), var1.field1933);
				} else if (var2 == 2) {
					Thread var3 = new Thread((Runnable)var1.field1935);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.field1933);
					var1.field1929 = var3;
				} else if (var2 == 4) {
					var1.field1929 = new DataInputStream(((URL)var1.field1935).openStream());
				}

				var1.field1932 = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var1.field1932 = 2;
			}
		}
	}

	@ObfInfo(name = "al", desc = "(IIILjava/lang/Object;B)Lhe;", opaque = "3")
	public final Class187 method3642(int var1, int var2, int var3, Object var4) {
		Class187 var6 = new Class187();
		var6.field1936 = var1;
		var6.field1933 = var2;
		var6.field1935 = var4;
		synchronized(this) {
			if (this.field1902 != null) {
				this.field1902.field1934 = var6;
				this.field1902 = var6;
			} else {
				this.field1902 = this.field1901 = var6;
			}

			this.notify();
			return var6;
		}
	}

	@ObfInfo(name = "aj", desc = "(Ljava/lang/String;II)Lhe;")
	public final Class187 method3657(String var1, int var2) {
		return this.method3642(1, var2, 0, var1);
	}

	@ObfInfo(name = "az", desc = "(Ljava/lang/Runnable;II)Lhe;")
	public final Class187 method3646(Runnable var1, int var2) {
		return this.method3642(2, var2, 0, var1);
	}
}
