import io.runebox.ObfInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfInfo(name = "ab")
public class Class2 {
	@ObfInfo(name = "ak", desc = "Ljava/util/concurrent/ExecutorService;")
	public ExecutorService field4;
	@ObfInfo(name = "al", desc = "Ljava/util/concurrent/Future;")
	public Future field7;
	@ObfInfo(name = "az", desc = "Laz;")
	public final Class26 field3;
	@ObfInfo(name = "aj", desc = "Lua;")
	public final Class521 field5;

	public Class2(Class521 var1, Class26 var2) {
		this.field4 = Executors.newSingleThreadExecutor();
		this.field5 = var1;
		this.field3 = var2;
		this.method22();
	}

	@ObfInfo(name = "ak", desc = "(I)Z")
	public boolean method19() {
		return this.field7.isDone();
	}

	@ObfInfo(name = "al", desc = "(B)V")
	public void method20() {
		this.field4.shutdown();
		this.field4 = null;
	}

	@ObfInfo(name = "aj", desc = "(S)Lua;")
	public Class521 method21() {
		try {
			return (Class521)this.field7.get();
		} catch (Exception var3) {
			return null;
		}
	}

	@ObfInfo(name = "az", desc = "(I)V")
	public void method22() {
		this.field7 = this.field4.submit(new Class12(this, this.field5, this.field3));
	}

	@ObfInfo(name = "ae", desc = "(ILdm;ZB)I", opaque = "4")
	public static int method24(int var0, Class91 var1, boolean var2) {
		Class340 var4 = var2 ? Class72.field892 : Class72.field88;
		if (var0 == 1600) {
			Class72.field887[++Class85.field83 - 1] = var4.field3698;
			return 1;
		} else if (var0 == 1601) {
			Class72.field887[++Class85.field83 - 1] = var4.field3699;
			return 1;
		} else {
			Class354 var8;
			if (var0 == 1602) {
				if (12 == var4.field3755) {
					var8 = var4.method6530();
					if (var8 != null) {
						Class72.field880[++Class85.field1806 - 1] = var8.method6801().method8125();
						return 1;
					}
				}

				Class72.field880[++Class85.field1806 - 1] = var4.field3740;
				return 1;
			} else if (var0 == 1603) {
				Class72.field887[++Class85.field83 - 1] = var4.field3800;
				return 1;
			} else if (var0 == 1604) {
				Class72.field887[++Class85.field83 - 1] = var4.field3701;
				return 1;
			} else if (var0 == 1605) {
				Class72.field887[++Class85.field83 - 1] = var4.field3732;
				return 1;
			} else if (var0 == 1606) {
				Class72.field887[++Class85.field83 - 1] = var4.field3729;
				return 1;
			} else if (var0 == 1607) {
				Class72.field887[++Class85.field83 - 1] = var4.field3731;
				return 1;
			} else if (var0 == 1608) {
				Class72.field887[++Class85.field83 - 1] = var4.field3814;
				return 1;
			} else if (var0 == 1609) {
				Class72.field887[++Class85.field83 - 1] = var4.field3708;
				return 1;
			} else if (var0 == 1610) {
				Class72.field887[++Class85.field83 - 1] = var4.field3709;
				return 1;
			} else if (var0 == 1611) {
				Class72.field887[++Class85.field83 - 1] = var4.field3702;
				return 1;
			} else if (var0 == 1612) {
				Class72.field887[++Class85.field83 - 1] = var4.field3703;
				return 1;
			} else if (var0 == 1613) {
				Class72.field887[++Class85.field83 - 1] = var4.field3670.method175();
				return 1;
			} else if (var0 == 1614) {
				Class72.field887[++Class85.field83 - 1] = var4.field3737 ? 1 : 0;
				return 1;
			} else {
				Class364 var5;
				if (var0 == 1617) {
					var5 = var4.method6531();
					Class72.field887[++Class85.field83 - 1] = var5 != null ? var5.field3979 : 0;
				}

				if (var0 == 1618) {
					var5 = var4.method6531();
					Class72.field887[++Class85.field83 - 1] = var5 != null ? var5.field3980 : 0;
					return 1;
				} else if (var0 == 1619) {
					var8 = var4.method6530();
					Class72.field880[++Class85.field1806 - 1] = var8 != null ? var8.method6802().method8125() : "";
					return 1;
				} else if (var0 == 1620) {
					var5 = var4.method6531();
					Class72.field887[++Class85.field83 - 1] = var5 != null ? var5.field3981 : 0;
					return 1;
				} else if (var0 == 1621) {
					var8 = var4.method6530();
					Class72.field887[++Class85.field83 - 1] = var8 != null ? var8.method6812() : 0;
					return 1;
				} else if (var0 == 1622) {
					var8 = var4.method6530();
					Class72.field887[++Class85.field83 - 1] = var8 != null ? var8.method6813() : 0;
					return 1;
				} else if (var0 == 1623) {
					var8 = var4.method6530();
					Class72.field887[++Class85.field83 - 1] = var8 != null ? var8.method6814() : 0;
					return 1;
				} else if (var0 == 1624) {
					var8 = var4.method6530();
					Class72.field887[++Class85.field83 - 1] = var8 != null && var8.method6929() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var8 = var4.method6530();
						Class72.field880[++Class85.field1806 - 1] = var8 != null ? var8.method6803().method8113() : "";
						return 1;
					} else if (var0 == 1627) {
						var8 = var4.method6530();
						int var6 = var8 != null ? var8.method6958() : 0;
						int var7 = var8 != null ? var8.method6807() : 0;
						Class72.field887[++Class85.field83 - 1] = Math.min(var6, var7);
						Class72.field887[++Class85.field83 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 1628) {
						var8 = var4.method6530();
						Class72.field887[++Class85.field83 - 1] = var8 != null ? var8.method6807() : 0;
						return 1;
					} else if (var0 == 1629) {
						var8 = var4.method6530();
						Class72.field887[++Class85.field83 - 1] = var8 != null ? var8.method6816() : 0;
						return 1;
					} else if (var0 == 1630) {
						var8 = var4.method6530();
						Class72.field887[++Class85.field83 - 1] = var8 != null ? var8.method6815() : 0;
						return 1;
					} else if (var0 == 1631) {
						var8 = var4.method6530();
						Class72.field887[++Class85.field83 - 1] = var8 != null ? var8.method6817() : 0;
						return 1;
					} else if (var0 == 1632) {
						var8 = var4.method6530();
						Class72.field887[++Class85.field83 - 1] = var8 != null ? var8.method6934() : 0;
						return 1;
					} else {
						Class32 var9;
						if (var0 == 1633) {
							var9 = var4.method6629();
							Class72.field887[Class85.field83 - 1] = var9 != null ? var9.method660(Class72.field887[Class85.field83 - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var9 = var4.method6629();
							Class72.field887[Class85.field83 - 1] = var9 != null ? var9.method646((char)Class72.field887[Class85.field83 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method6530();
					Class72.field887[++Class85.field83 - 1] = var8 != null && var8.method6867() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
