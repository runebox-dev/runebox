import io.runebox.ObfInfo;

@ObfInfo(name = "om")
public class Class377 implements Runnable {
	@ObfInfo(name = "al", desc = "Lpk;")
	public static Class401 field4135;
	@ObfInfo(name = "az", desc = "Z")
	public static boolean field4137;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1779711313)
	public static int field4134;
	@ObfInfo(name = "af", desc = "Ljava/lang/Object;")
	public static Object field4136;
	@ObfInfo(name = "ak", desc = "Lpk;")
	public static final Class401 field4138;

	static {
		field4138 = new Class401();
		field4135 = new Class401();
		field4134 = 0;
		field4137 = false;
		field4136 = new Object();
	}

	@ObfInfo(desc = "()V")
	public void run() {
		try {
			while (true) {
				Class386 var1;
				synchronized(field4138) {
					var1 = (Class386)field4138.method7482();
				}

				if (var1 != null) {
					if (0 == var1.field4519) {
						var1.field4515.method8684((int)var1.field5170, var1.field4514, var1.field4514.length);
						synchronized(field4138) {
							var1.method9277();
						}
					} else if (1 == var1.field4519) {
						var1.field4514 = var1.field4515.method8676((int)var1.field5170);
						synchronized(field4138) {
							field4135.method7477(var1);
						}
					}

					synchronized(field4136) {
						if ((field4137 || field4134 <= 1) && field4138.method7485()) {
							field4134 = 0;
							field4136.notifyAll();
							return;
						}

						field4134 = 600;
					}
				} else {
					Class493.method8960(100L);
					synchronized(field4136) {
						if ((field4137 || field4134 <= 1) && field4138.method7485()) {
							field4134 = 0;
							field4136.notifyAll();
							return;
						}

						--field4134;
					}
				}
			}
		} catch (Exception var13) {
			Class548.method8904((String)null, var13);
		}
	}

	@ObfInfo(desc = "(ILClass474;LClass384;)V")
	public static void method6694(int var0, Class474 var1, Class384 var2) {
		byte[] var4 = null;
		synchronized(field4138) {
			for (Class386 var6 = (Class386)field4138.method7482(); var6 != null; var6 = (Class386)field4138.method7490()) {
				if (var6.field5170 == (long)var0 && var6.field4515 == var1 && 0 == var6.field4519) {
					var4 = var6.field4514;
					break;
				}
			}
		}

		if (var4 != null) {
			var2.method7337(var1, var0, var4, true);
		} else {
			byte[] var5 = var1.method8676(var0);
			var2.method7337(var1, var0, var5, true);
		}
	}

	@ObfInfo(desc = "()V")
	public static void method6261() {
		synchronized(field4136) {
			if (0 != field4134) {
				field4134 = 1;
				field4137 = true;

				try {
					field4136.wait();
				} catch (InterruptedException var4) {
				}
			}

		}
	}
}
