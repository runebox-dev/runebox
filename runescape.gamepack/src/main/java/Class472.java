import io.runebox.ObfInfo;

@ObfInfo(name = "sd")
public class Class472 {
	@ObfInfo(name = "al", desc = "Lsd;")
	public static final Class472 field4922;
	@ObfInfo(name = "ak", desc = "Lsd;")
	public static final Class472 field4924;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	public String field4923;

	static {
		field4924 = new Class472("application/json");
		field4922 = new Class472("text/plain");
	}

	public Class472(String var1) {
		this.field4923 = var1;
	}

	@ObfInfo(name = "ak", desc = "(B)Ljava/lang/String;")
	public String method8653() {
		return this.field4923;
	}

	@ObfInfo(name = "az", desc = "(IZIZI)V", opaque = "-2061884702")
	public static void method8652(int var0, boolean var1, int var2, boolean var3) {
		if (Class76.field4598 != null) {
			Class64.method3694(0, Class76.field4598.length - 1, var0, var1, var2, var3);
		}

	}
}
