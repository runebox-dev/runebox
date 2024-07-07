import io.runebox.ObfInfo;

@ObfInfo(name = "ou")
public class Class385 implements Runnable {
	@ObfInfo(name = "ad", desc = "Lpr;")
	public static Class408 field4528;
	@ObfInfo(name = "ak", desc = "Z")
	public static boolean field4529;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 968623873)
	public static int field4527;
	@ObfInfo(name = "ap", desc = "Ljava/lang/Object;")
	public static Object field4531;
	@ObfInfo(name = "aq", desc = "Lpr;")
	public static final Class408 field4533;

	static {
		field4533 = new Class408();
		field4528 = new Class408();
		field4527 = 0;
		field4529 = false;
		field4531 = new Object();
	}

	public void run() {
		try {
			while (true) {
				Class387 var1;
				synchronized(field4533) {
					var1 = (Class387)field4533.method7526();
				}

				if (var1 != null) {
					if (var1.field4547 == 0) {
						var1.field4548.method8798((int)var1.field5234, var1.field4546, var1.field4546.length);
						synchronized(field4533) {
							var1.method9267();
						}
					} else if (1 == var1.field4547) {
						var1.field4546 = var1.field4548.method8790((int)var1.field5234);
						synchronized(field4533) {
							field4528.method7506(var1);
						}
					}

					synchronized(field4531) {
						if ((field4529 || field4527 <= 1) && field4533.method7513()) {
							field4527 = 0;
							field4531.notifyAll();
							return;
						}

						field4527 = 600;
					}
				} else {
					Class336.method3895(100L);
					synchronized(field4531) {
						if ((field4529 || field4527 <= 1) && field4533.method7513()) {
							field4527 = 0;
							field4531.notifyAll();
							return;
						}

						--field4527;
					}
				}
			}
		} catch (Exception var13) {
			Class552.method8390((String)null, var13);
		}
	}

	@ObfInfo(owner = "jw", name = "aq", desc = "(ILsq;Loz;B)V", opaque = "13")
	public static void method4977(int var0, Class485 var1, Class390 var2) {
		Class387 var4 = new Class387();
		var4.field4547 = 1;
		var4.field5234 = (long)var0;
		var4.field4548 = var1;
		var4.field4549 = var2;
		synchronized(field4533) {
			field4533.method7506(var4);
		}

		synchronized(field4531) {
			if (field4527 == 0) {
				Class390.field2747 = new Thread(new Class385());
				Class390.field2747.setDaemon(true);
				Class390.field2747.start();
				Class390.field2747.setPriority(5);
			}

			field4527 = 600;
			field4529 = false;
		}
	}

	@ObfInfo(owner = "ni", name = "ad", desc = "(ILsq;Loz;S)V", opaque = "3804")
	public static void method6487(int var0, Class485 var1, Class390 var2) {
		byte[] var4 = null;
		synchronized(field4533) {
			for (Class387 var6 = (Class387)field4533.method7526(); var6 != null; var6 = (Class387)field4533.method7511()) {
				if ((long)var0 == var6.field5234 && var6.field4548 == var1 && 0 == var6.field4547) {
					var4 = var6.field4546;
					break;
				}
			}
		}

		if (var4 != null) {
			var2.method7313(var1, var0, var4, true);
		} else {
			byte[] var5 = var1.method8790(var0);
			var2.method7313(var1, var0, var5, true);
		}
	}

	@ObfInfo(owner = "fp", name = "ag", desc = "(I)V", opaque = "1210605723")
	public static void method3193() {
		while (true) {
			Class387 var1;
			synchronized(field4533) {
				var1 = (Class387)field4528.method7507();
			}

			if (var1 == null) {
				return;
			}

			var1.field4549.method7313(var1.field4548, (int)var1.field5234, var1.field4546, false);
		}
	}

	@ObfInfo(owner = "ox", name = "ak", desc = "(B)V")
	public static void method7266() {
		synchronized(field4531) {
			if (field4527 != 0) {
				field4527 = 1;
				field4529 = true;

				try {
					field4531.wait();
				} catch (InterruptedException var4) {
				}
			}

		}
	}
}
