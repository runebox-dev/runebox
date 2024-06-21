import io.runebox.ObfInfo;

@ObfInfo(name = "dg")
public class Class85 implements Runnable {
	@ObfInfo(owner = "gg", name = "ah", desc = "I", intMultiplier = 755505003)
	public static int field1806;
	@ObfInfo(owner = "ap", name = "ac", desc = "I", intMultiplier = -1194566833)
	public static int field83;
	@ObfInfo(name = "ak", desc = "Z")
	public boolean field1050;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1511893417)
	public int field1048;
	@ObfInfo(name = "az", desc = "[I")
	public int[] field1049;
	@ObfInfo(name = "af", desc = "[I")
	public int[] field1053;
	@ObfInfo(name = "al", desc = "Ljava/lang/Object;")
	public Object field1047;
	@ObfInfo(name = "aa", desc = "[J")
	public long[] field1051;

	public Class85() {
		this.field1050 = true;
		this.field1047 = new Object();
		this.field1048 = 0;
		this.field1049 = new int[500];
		this.field1053 = new int[500];
		this.field1051 = new long[500];
	}

	@ObfInfo(name = "run", desc = "()V")
	public void run() {
		for (; this.field1050; Class493.method8960(50L)) {
			synchronized(this.field1047) {
				if (this.field1048 < 500) {
					this.field1049[this.field1048] = Class33.field229;
					this.field1053[this.field1048] = Class33.field220;
					this.field1051[this.field1048] = Class33.field232;
					++this.field1048;
				}
			}
		}

	}

	@ObfInfo(name = "bi", desc = "(ILdm;ZI)I", opaque = "27437585")
	public static int method2305(int var0, Class91 var1, boolean var2) {
		if (var0 == 3600) {
			if (Client.field274.field851 == 0) {
				Class72.field887[++field83 - 1] = -2;
			} else if (1 == Client.field274.field851) {
				Class72.field887[++field83 - 1] = -1;
			} else {
				Class72.field887[++field83 - 1] = Client.field274.field849.method8761();
			}

			return 1;
		} else {
			int var4;
			if (var0 == 3601) {
				var4 = Class72.field887[--field83];
				if (Client.field274.method1872() && var4 >= 0 && var4 < Client.field274.field849.method8761()) {
					Class448 var9 = (Class448)Client.field274.field849.method8781(var4);
					Class72.field880[++field1806 - 1] = var9.method8694();
					Class72.field880[++field1806 - 1] = var9.method8690();
				} else {
					Class72.field880[++field1806 - 1] = "";
					Class72.field880[++field1806 - 1] = "";
				}

				return 1;
			} else if (var0 == 3602) {
				var4 = Class72.field887[--field83];
				if (Client.field274.method1872() && var4 >= 0 && var4 < Client.field274.field849.method8761()) {
					Class72.field887[++field83 - 1] = ((Class483)Client.field274.field849.method8781(var4)).field4959;
				} else {
					Class72.field887[++field83 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3603) {
				var4 = Class72.field887[--field83];
				if (Client.field274.method1872() && var4 >= 0 && var4 < Client.field274.field849.method8761()) {
					Class72.field887[++field83 - 1] = ((Class483)Client.field274.field849.method8781(var4)).field4961;
				} else {
					Class72.field887[++field83 - 1] = 0;
				}

				return 1;
			} else {
				String var10;
				if (var0 == 3604) {
					var10 = Class72.field880[--field1806];
					int var8 = Class72.field887[--field83];
					Class69.method4403(var10, var8);
					return 1;
				} else if (var0 == 3605) {
					var10 = Class72.field880[--field1806];
					Client.field274.method1879(var10);
					return 1;
				} else if (var0 == 3606) {
					var10 = Class72.field880[--field1806];
					Client.field274.method1933(var10);
					return 1;
				} else if (var0 == 3607) {
					var10 = Class72.field880[--field1806];
					Client.field274.method1921(var10);
					return 1;
				} else if (var0 == 3608) {
					var10 = Class72.field880[--field1806];
					boolean var7 = true;
					Client.field274.method1884(var10, var7);
					return 1;
				} else if (var0 == 3609) {
					var10 = Class72.field880[--field1806];
					var10 = Client.method3135(var10);
					Class72.field887[++field83 - 1] = Client.field274.method1893(new Class567(var10, Client.field2627), false) ? 1 : 0;
					return 1;
				} else if (var0 == 3611) {
					if (Client.field1420 != null) {
						Class72.field880[++field1806 - 1] = Client.field1420.field4858;
					} else {
						Class72.field880[++field1806 - 1] = "";
					}

					return 1;
				} else if (var0 == 3612) {
					if (Client.field1420 != null) {
						Class72.field887[++field83 - 1] = Client.field1420.method8761();
					} else {
						Class72.field887[++field83 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3613) {
					var4 = Class72.field887[--field83];
					if (Client.field1420 != null && var4 < Client.field1420.method8761()) {
						Class72.field880[++field1806 - 1] = Client.field1420.method8781(var4).method8703().method10260();
					} else {
						Class72.field880[++field1806 - 1] = "";
					}

					return 1;
				} else if (var0 == 3614) {
					var4 = Class72.field887[--field83];
					if (Client.field1420 != null && var4 < Client.field1420.method8761()) {
						Class72.field887[++field83 - 1] = ((Class483)Client.field1420.method8781(var4)).method8867();
					} else {
						Class72.field887[++field83 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3615) {
					var4 = Class72.field887[--field83];
					if (Client.field1420 != null && var4 < Client.field1420.method8761()) {
						Class72.field887[++field83 - 1] = ((Class483)Client.field1420.method8781(var4)).field4961;
					} else {
						Class72.field887[++field83 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3616) {
					Class72.field887[++field83 - 1] = Client.field1420 != null ? Client.field1420.field4860 : 0;
					return 1;
				} else if (var0 == 3617) {
					var10 = Class72.field880[--field1806];
					Client.method1124(var10);
					return 1;
				} else if (var0 == 3618) {
					Class72.field887[++field83 - 1] = Client.field1420 != null ? Client.field1420.field4861 : 0;
					return 1;
				} else if (var0 == 3619) {
					var10 = Class72.field880[--field1806];
					Class207.method3960(var10);
					return 1;
				} else if (var0 == 3620) {
					Client.method3270();
					return 1;
				} else if (var0 == 3621) {
					if (!Client.field274.method1872()) {
						Class72.field887[++field83 - 1] = -1;
					} else {
						Class72.field887[++field83 - 1] = Client.field274.field850.method8761();
					}

					return 1;
				} else if (var0 == 3622) {
					var4 = Class72.field887[--field83];
					if (Client.field274.method1872() && var4 >= 0 && var4 < Client.field274.field850.method8761()) {
						Class478 var5 = (Class478)Client.field274.field850.method8781(var4);
						Class72.field880[++field1806 - 1] = var5.method8694();
						Class72.field880[++field1806 - 1] = var5.method8690();
					} else {
						Class72.field880[++field1806 - 1] = "";
						Class72.field880[++field1806 - 1] = "";
					}

					return 1;
				} else if (var0 == 3623) {
					var10 = Class72.field880[--field1806];
					var10 = Client.method3135(var10);
					Class72.field887[++field83 - 1] = Client.field274.method1878(new Class567(var10, Client.field2627)) ? 1 : 0;
					return 1;
				} else if (var0 == 3624) {
					var4 = Class72.field887[--field83];
					if (Client.field1420 != null && var4 < Client.field1420.method8761() && Client.field1420.method8781(var4).method8703().equals(Client.field107.field1025)) {
						Class72.field887[++field83 - 1] = 1;
					} else {
						Class72.field887[++field83 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3625) {
					if (Client.field1420 != null && Client.field1420.field4855 != null) {
						Class72.field880[++field1806 - 1] = Client.field1420.field4855;
					} else {
						Class72.field880[++field1806 - 1] = "";
					}

					return 1;
				} else if (var0 == 3626) {
					var4 = Class72.field887[--field83];
					if (Client.field1420 != null && var4 < Client.field1420.method8761() && ((Class482)Client.field1420.method8781(var4)).method8850()) {
						Class72.field887[++field83 - 1] = 1;
					} else {
						Class72.field887[++field83 - 1] = 0;
					}

					return 1;
				} else if (var0 != 3627) {
					if (var0 == 3628) {
						Client.field274.field849.method8751();
						return 1;
					} else {
						boolean var6;
						if (var0 == 3629) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field849.method8752(new Class562(var6));
							return 1;
						} else if (var0 == 3630) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field849.method8752(new Class550(var6));
							return 1;
						} else if (var0 == 3631) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field849.method8752(new Class125(var6));
							return 1;
						} else if (var0 == 3632) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field849.method8752(new Class129(var6));
							return 1;
						} else if (var0 == 3633) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field849.method8752(new Class107(var6));
							return 1;
						} else if (var0 == 3634) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field849.method8752(new Class121(var6));
							return 1;
						} else if (var0 == 3635) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field849.method8752(new Class127(var6));
							return 1;
						} else if (var0 == 3636) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field849.method8752(new Class122(var6));
							return 1;
						} else if (var0 == 3637) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field849.method8752(new Class124(var6));
							return 1;
						} else if (var0 == 3638) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field849.method8752(new Class115(var6));
							return 1;
						} else if (var0 == 3639) {
							Client.field274.field849.method8742();
							return 1;
						} else if (var0 == 3640) {
							Client.field274.field850.method8751();
							return 1;
						} else if (var0 == 3641) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field850.method8752(new Class562(var6));
							return 1;
						} else if (var0 == 3642) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field850.method8752(new Class550(var6));
							return 1;
						} else if (var0 == 3643) {
							Client.field274.field850.method8742();
							return 1;
						} else if (var0 == 3644) {
							if (Client.field1420 != null) {
								Client.field1420.method8751();
							}

							return 1;
						} else if (var0 == 3645) {
							var6 = Class72.field887[--field83] == 1;
							if (Client.field1420 != null) {
								Client.field1420.method8752(new Class562(var6));
							}

							return 1;
						} else if (var0 == 3646) {
							var6 = Class72.field887[--field83] == 1;
							if (Client.field1420 != null) {
								Client.field1420.method8752(new Class550(var6));
							}

							return 1;
						} else if (var0 == 3647) {
							var6 = Class72.field887[--field83] == 1;
							if (Client.field1420 != null) {
								Client.field1420.method8752(new Class125(var6));
							}

							return 1;
						} else if (var0 == 3648) {
							var6 = Class72.field887[--field83] == 1;
							if (Client.field1420 != null) {
								Client.field1420.method8752(new Class129(var6));
							}

							return 1;
						} else if (var0 == 3649) {
							var6 = Class72.field887[--field83] == 1;
							if (Client.field1420 != null) {
								Client.field1420.method8752(new Class107(var6));
							}

							return 1;
						} else if (var0 == 3650) {
							var6 = Class72.field887[--field83] == 1;
							if (Client.field1420 != null) {
								Client.field1420.method8752(new Class121(var6));
							}

							return 1;
						} else if (var0 == 3651) {
							var6 = Class72.field887[--field83] == 1;
							if (Client.field1420 != null) {
								Client.field1420.method8752(new Class127(var6));
							}

							return 1;
						} else if (var0 == 3652) {
							var6 = Class72.field887[--field83] == 1;
							if (Client.field1420 != null) {
								Client.field1420.method8752(new Class122(var6));
							}

							return 1;
						} else if (var0 == 3653) {
							var6 = Class72.field887[--field83] == 1;
							if (Client.field1420 != null) {
								Client.field1420.method8752(new Class124(var6));
							}

							return 1;
						} else if (var0 == 3654) {
							var6 = Class72.field887[--field83] == 1;
							if (Client.field1420 != null) {
								Client.field1420.method8752(new Class115(var6));
							}

							return 1;
						} else if (var0 == 3655) {
							if (Client.field1420 != null) {
								Client.field1420.method8742();
							}

							return 1;
						} else if (var0 == 3656) {
							var6 = Class72.field887[--field83] == 1;
							Client.field274.field849.method8752(new Class111(var6));
							return 1;
						} else if (var0 == 3657) {
							var6 = Class72.field887[--field83] == 1;
							if (Client.field1420 != null) {
								Client.field1420.method8752(new Class111(var6));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = Class72.field887[--field83];
					if (Client.field1420 != null && var4 < Client.field1420.method8761() && ((Class482)Client.field1420.method8781(var4)).method8841()) {
						Class72.field887[++field83 - 1] = 1;
					} else {
						Class72.field887[++field83 - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
