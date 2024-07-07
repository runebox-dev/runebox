import io.runebox.ObfInfo;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfInfo(name = "ik")
public class Class219 implements Runnable {
	@ObfInfo(name = "ak", desc = "Lig;")
	public Class215 field2388;
	@ObfInfo(name = "ag", desc = "Lig;")
	public Class215 field2393;
	@ObfInfo(name = "an", desc = "Z")
	public boolean field2391;
	@ObfInfo(name = "ap", desc = "Ljava/lang/Thread;")
	public Thread field2390;

	public Class219() {
		this.field2393 = null;
		this.field2388 = null;
		this.field2391 = false;
		Class552.field2386 = "Unknown";
		Class552.field2389 = "1.6";

		try {
			Class552.field2386 = System.getProperty("java.vendor");
			Class552.field2389 = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.field2391 = false;
		this.field2390 = new Thread(this);
		this.field2390.setPriority(10);
		this.field2390.setDaemon(true);
		this.field2390.start();
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	public final void method4233() {
		synchronized(this) {
			this.field2391 = true;
			this.notifyAll();
		}

		try {
			this.field2390.join();
		} catch (InterruptedException var4) {
		}

	}

	public final void run() {
		while (true) {
			Class215 var1;
			synchronized(this) {
				while (true) {
					if (this.field2391) {
						return;
					}

					if (this.field2393 != null) {
						var1 = this.field2393;
						this.field2393 = this.field2393.field2339;
						if (this.field2393 == null) {
							this.field2388 = null;
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
				int var2 = var1.field2333;
				if (var2 == 1) {
					var1.field2340 = new Socket(InetAddress.getByName((String)var1.field2337), var1.field2338);
				} else if (var2 == 2) {
					Thread var3 = new Thread((Runnable)var1.field2337);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.field2338);
					var1.field2340 = var3;
				} else if (var2 == 4) {
					var1.field2340 = new DataInputStream(((URL)var1.field2337).openStream());
				}

				var1.field2334 = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var1.field2334 = 2;
			}
		}
	}

	@ObfInfo(name = "ad", desc = "(IIILjava/lang/Object;I)Lig;", opaque = "859837666")
	public final Class215 method4219(int var1, int var2, int var3, Object var4) {
		Class215 var6 = new Class215();
		var6.field2333 = var1;
		var6.field2338 = var2;
		var6.field2337 = var4;
		synchronized(this) {
			if (this.field2388 != null) {
				this.field2388.field2339 = var6;
				this.field2388 = var6;
			} else {
				this.field2388 = this.field2393 = var6;
			}

			this.notify();
			return var6;
		}
	}

	@ObfInfo(name = "ag", desc = "(Ljava/lang/String;II)Lig;")
	public final Class215 method4220(String var1, int var2) {
		return this.method4219(1, var2, 0, var1);
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/Runnable;II)Lig;")
	public final Class215 method4229(Runnable var1, int var2) {
		return this.method4219(2, var2, 0, var1);
	}
}
