import io.runebox.ObfInfo;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class95 {
	@ObfInfo(name = "ak", desc = "Ljava/util/concurrent/ExecutorService;")
	public ExecutorService field1263;
	@ObfInfo(name = "al", desc = "Ljava/util/concurrent/Future;")
	public Future field1258;

	public Class95() {
		this.field1263 = Executors.newSingleThreadExecutor();
		this.field1258 = this.field1263.submit(new Class97());
	}

	@ObfInfo(name = "ak", desc = "(B)V")
	public void method2480() {
		this.field1263.shutdown();
		this.field1263 = null;
	}

	@ObfInfo(name = "al", desc = "(I)Z")
	public boolean method2481() {
		return this.field1258.isDone();
	}

	@ObfInfo(name = "aj", desc = "(B)Ljava/security/SecureRandom;")
	public SecureRandom method2490() {
		try {
			return (SecureRandom)this.field1258.get();
		} catch (Exception var5) {
			SecureRandom var4 = new SecureRandom();
			var4.nextInt();
			return var4;
		}
	}

	@ObfInfo(name = "az", desc = "(I)[Low;")
	public static Class387[] method2485() {
		return new Class387[]{Class387.field4523, Class387.field4522, Class387.field4525, Class387.field4524};
	}

	@ObfInfo(name = "ak", desc = "(Lua;Ltu;I)Ltu;", opaque = "-1206983756")
	public static Class515 method2487(Class521 var0, Class515 var1) {
		int var3 = var0.method9405();
		int var4;
		if (var1 == null) {
			var4 = Class248.method4765(var3);
			var1 = new Class515(var4);
		}

		for (var4 = 0; var4 < var3; ++var4) {
			boolean var5 = var0.method9405() == 1;
			int var6 = var0.method9399();
			Object var7;
			if (var5) {
				var7 = new Class498(var0.method9415());
			} else {
				var7 = new Class516(var0.method9410());
			}

			var1.method9333((Class506)var7, (long)var6);
		}

		return var1;
	}
}
