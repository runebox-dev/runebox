import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public abstract class Class106 implements Runnable {
	public int field1377;
	public Queue field1379;
	public final Thread field1378;
	public volatile boolean field1376;

	public Class106(int var1) {
		this.field1379 = new LinkedList();
		this.field1378 = new Thread(this);
		this.field1378.setPriority(1);
		this.field1378.start();
		this.field1377 = var1;
	}

	public abstract void method2773(Class105 var1) throws IOException;

	public void run() {
		while (!this.field1376) {
			try {
				Class105 var1;
				synchronized(this) {
					var1 = (Class105)this.field1379.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.method2773(var1);
			} catch (Exception var7) {
				Class548.method8904((String)null, var7);
			}
		}

	}

	public int method2756(URLConnection var1) {
		int var3 = Class105.field1369;
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

	public void method2776(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1377);
	}

	public void method2763(URLConnection var1, Class105 var2) {
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
				byte[] var7 = Class57.method1084(5000);

				for (int var8 = var4.read(var7); var8 > -1; var8 = var4.read(var7)) {
					byte[] var9 = new byte[var5.length + var8];
					System.arraycopy(var5, 0, var9, 0, var5.length);
					System.arraycopy(var7, 0, var9, var5.length, var8);
					var5 = var9;
				}

				Class451.method3840(var7);
			}

			var2.field1373 = var5;
		} catch (IOException var15) {
			var2.field1373 = null;
		} finally {
			var2.field1372 = this.method2756(var1);
		}

		if (var4 != null) {
			try {
				var4.close();
			} catch (IOException var14) {
			}
		}

	}

	public Class105 method2759(URL var1) {
		Class105 var3 = new Class105(var1);
		synchronized(this) {
			this.field1379.add(var3);
			this.notify();
			return var3;
		}
	}

	public void method2757() {
		this.field1376 = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.field1378.join();
		} catch (InterruptedException var5) {
		}

	}
}
