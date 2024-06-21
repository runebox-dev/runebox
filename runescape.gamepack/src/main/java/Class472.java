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
}
