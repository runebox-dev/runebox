import io.runebox.ObfInfo;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfInfo(name = "ea")
public abstract class Class105 implements Runnable {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1686353651)
	public int field1357;
	@ObfInfo(name = "ag", desc = "Ljava/util/Queue;")
	public Queue field1356;
	@ObfInfo(name = "aq", desc = "Ljava/lang/Thread;")
	public final Thread field1359;
	@ObfInfo(name = "ad", desc = "Z")
	public volatile boolean field1355;

	public Class105(int var1) {
		this.field1356 = new LinkedList();
		this.field1359 = new Thread(this);
		this.field1359.setPriority(1);
		this.field1359.start();
		this.field1357 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lez;I)V")
	public abstract void method2777(Class130 var1) throws IOException;

	public void run() {
		while (!this.field1355) {
			try {
				Class130 var1;
				synchronized(this) {
					var1 = (Class130)this.field1356.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.method2777(var1);
			} catch (Exception var7) {
				Class552.method8390((String)null, var7);
			}
		}

	}

	@ObfInfo(name = "ad", desc = "(Ljava/net/URLConnection;B)I", opaque = "8")
	public int method2783(URLConnection var1) {
		int var3 = Class130.field1525;
		if (var1 != null) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var3 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var5) {
			}
		}

		return var3;
	}

	@ObfInfo(name = "ag", desc = "(Ljava/net/URLConnection;B)V")
	public void method2776(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1357);
	}

	@ObfInfo(name = "ak", desc = "(Ljava/net/URLConnection;Lez;B)V", opaque = "-1")
	public void method2778(URLConnection var1, Class130 var2) {
		DataInputStream var4 = null;

		try {
			int var6 = var1.getContentLength();
			var4 = new DataInputStream(var1.getInputStream());
			byte[] var5;
			if (var6 >= 0) {
				var5 = new byte[var6];
				var4.readFully(var5);
			} else {
				var5 = new byte[0];
				byte[] var7 = Class445.method5601(5000, false);

				for (int var9 = var4.read(var7); var9 > -1; var9 = var4.read(var7)) {
					byte[] var10 = new byte[var5.length + var9];
					System.arraycopy(var5, 0, var10, 0, var5.length);
					System.arraycopy(var7, 0, var10, var5.length, var9);
					var5 = var10;
				}

				Class445.method2280(var7);
			}

			var2.field1518 = var5;
		} catch (IOException var16) {
			var2.field1518 = null;
		} finally {
			var2.field1522 = this.method2783(var1);
		}

		if (var4 != null) {
			try {
				var4.close();
			} catch (IOException var15) {
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(Ljava/net/URL;I)Lez;")
	public Class130 method2781(URL var1) {
		Class130 var3 = new Class130(var1);
		synchronized(this) {
			this.field1356.add(var3);
			this.notify();
			return var3;
		}
	}

	@ObfInfo(name = "an", desc = "(I)V")
	public void method2784() {
		this.field1355 = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.field1359.join();
		} catch (InterruptedException var5) {
		}

	}
}
