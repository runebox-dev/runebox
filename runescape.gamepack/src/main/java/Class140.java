import io.runebox.ObfInfo;

public class Class140 {
	@ObfInfo(name = "aj", desc = "Lvv;")
	public Class567 field1601;
	@ObfInfo(name = "ak", desc = "B")
	public byte field1602;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 533400535)
	public int field1607;

	@ObfInfo(name = "ak", desc = "(Lor;I)V")
	public static void method3141(Class382 var0) {
		Class228.field2397 = var0;
	}

	@ObfInfo(name = "al", desc = "(III)I", opaque = "-1604422643")
	public static int method3139(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = var1 * (var0 & 127) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}

	@ObfInfo(name = "of", desc = "(II)V", opaque = "1693947294")
	public static void method3138(int var0) {
		Client.method2384();
		Class201.method3919();
		int var2 = Class205.method4659(var0).field2085;
		if (var2 != 0) {
			int var3 = Class351.field3889[var0];
			if (var2 == 1) {
				if (var3 == 1) {
					Class253.method4784(0.9D);
					((Class244)Class253.field2688.field3043).method4716(0.9D);
					if (Client.field104 != null) {
						Client.field104.method9134();
					}

					Class232.method3345();
					Client.field4851.method2620(0.9D);
				}

				if (var3 == 2) {
					Class253.method4784(0.8D);
					((Class244)Class253.field2688.field3043).method4716(0.8D);
					if (Client.field104 != null) {
						Client.field104.method9134();
					}

					Class232.method3345();
					Client.field4851.method2620(0.8D);
				}

				if (var3 == 3) {
					Class253.method4784(0.7D);
					((Class244)Class253.field2688.field3043).method4716(0.7D);
					if (Client.field104 != null) {
						Client.field104.method9134();
					}

					Class232.method3345();
					Client.field4851.method2620(0.7D);
				}

				if (var3 == 4) {
					Class253.method4784(0.6D);
					((Class244)Class253.field2688.field3043).method4716(0.6D);
					if (Client.field104 != null) {
						Client.field104.method9134();
					}

					Class232.method3345();
					Client.field4851.method2620(0.6D);
				}
			}

			if (var2 == 3) {
				if (var3 == 0) {
					Client.method6714(255);
				}

				if (var3 == 1) {
					Client.method6714(192);
				}

				if (var3 == 2) {
					Client.method6714(128);
				}

				if (var3 == 3) {
					Client.method6714(64);
				}

				if (var3 == 4) {
					Client.method6714(0);
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					Client.method795(127);
				}

				if (var3 == 1) {
					Client.method795(96);
				}

				if (var3 == 2) {
					Client.method795(64);
				}

				if (var3 == 3) {
					Client.method795(32);
				}

				if (var3 == 4) {
					Client.method795(0);
				}
			}

			if (var2 == 5) {
				Client.field494 = var3 == 1;
			}

			if (var2 == 6) {
				Client.field488 = var3;
			}

			if (var2 == 9) {
			}

			if (var2 == 10) {
				if (var3 == 0) {
					Client.method1773(127);
				}

				if (var3 == 1) {
					Client.method1773(96);
				}

				if (var3 == 2) {
					Client.method1773(64);
				}

				if (var3 == 3) {
					Client.method1773(32);
				}

				if (var3 == 4) {
					Client.method1773(0);
				}
			}

			if (var2 == 17) {
				Client.field662 = var3 & 65535;
			}

			if (var2 == 18) {
				Client.field516 = (Class114)Class62.method1112(Class114.method2385(), var3);
				if (Client.field516 == null) {
					Client.field516 = Class114.field1431;
				}
			}

			if (var2 == 19) {
				if (var3 == -1) {
					Client.field622 = -1;
				} else {
					Client.field622 = var3 & 2047;
				}
			}

			if (var2 == 22) {
				Class114[] var4 = new Class114[]{Class114.field1438, Class114.field1434, Class114.field1431, Class114.field1432, Class114.field1433};
				Client.field517 = (Class114)Class62.method1112(var4, var3);
				if (Client.field517 == null) {
					Client.field517 = Class114.field1431;
				}
			}

		}
	}
}
