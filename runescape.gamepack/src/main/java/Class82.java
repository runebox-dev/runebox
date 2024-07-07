import io.runebox.ObfInfo;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfInfo(name = "dd")
public class Class82 {
	@ObfInfo(name = "aq", desc = "Ljava/util/concurrent/ExecutorService;")
	public ExecutorService field1010;
	@ObfInfo(name = "ad", desc = "Ljava/util/concurrent/Future;")
	public Future field1007;

	public Class82() {
		this.field1010 = Executors.newSingleThreadExecutor();
		this.field1007 = this.field1010.submit(new Class93());
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	public void method2304() {
		this.field1010.shutdown();
		this.field1010 = null;
	}

	@ObfInfo(name = "ad", desc = "(I)Z")
	public boolean method2311() {
		return this.field1007.isDone();
	}

	@ObfInfo(name = "ag", desc = "(S)Ljava/security/SecureRandom;")
	public SecureRandom method2308() {
		try {
			return (SecureRandom)this.field1007.get();
		} catch (Exception var3) {
			return Class93.method7497();
		}
	}

	@ObfInfo(name = "nr", desc = "(IB)V", opaque = "95")
	public static void method2313(int var0) {
		Client.method483();
		Class55.method4649();
		int var2 = Class176.method4047(var0).field1885;
		if (var2 != 0) {
			int var3 = Class353.field3769[var0];
			if (var2 == 1) {
				if (var3 == 1) {
					Client.method3613(0.9D);
				}

				if (var3 == 2) {
					Client.method3613(0.8D);
				}

				if (var3 == 3) {
					Client.method3613(0.7D);
				}

				if (var3 == 4) {
					Client.method3613(0.6D);
				}
			}

			if (var2 == 3) {
				if (var3 == 0) {
					Client.method2360(255);
				}

				if (var3 == 1) {
					Client.method2360(192);
				}

				if (var3 == 2) {
					Client.method2360(128);
				}

				if (var3 == 3) {
					Client.method2360(64);
				}

				if (var3 == 4) {
					Client.method2360(0);
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					Client.method3006(127);
				}

				if (var3 == 1) {
					Client.method3006(96);
				}

				if (var3 == 2) {
					Client.method3006(64);
				}

				if (var3 == 3) {
					Client.method3006(32);
				}

				if (var3 == 4) {
					Client.method3006(0);
				}
			}

			if (var2 == 5) {
				Client.field806 = var3 == 1;
			}

			if (var2 == 6) {
				Client.field637 = var3;
			}

			if (var2 == 9) {
			}

			if (var2 == 10) {
				if (var3 == 0) {
					Client.method3175(127);
				}

				if (var3 == 1) {
					Client.method3175(96);
				}

				if (var3 == 2) {
					Client.method3175(64);
				}

				if (var3 == 3) {
					Client.method3175(32);
				}

				if (var3 == 4) {
					Client.method3175(0);
				}
			}

			if (var2 == 17) {
				Client.field706 = var3 & 65535;
			}

			if (var2 == 18) {
				Class113[] var4 = new Class113[]{Class113.field1419, Class113.field1422, Class113.field1423, Class113.field1418, Class113.field1420};
				Client.field818 = (Class113)Class406.method4071(var4, var3);
				if (Client.field818 == null) {
					Client.field818 = Class113.field1418;
				}
			}

			if (var2 == 19) {
				if (var3 == -1) {
					Client.field556 = -1;
				} else {
					Client.field556 = var3 & 2047;
				}
			}

			if (var2 == 22) {
				Client.field791 = (Class113)Class406.method4071(Class113.method3244(), var3);
				if (Client.field791 == null) {
					Client.field791 = Class113.field1418;
				}
			}

		}
	}
}
