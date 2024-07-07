import io.runebox.ObfInfo;

@ObfInfo(name = "sb")
public class Class470 {
	@ObfInfo(name = "ad", desc = "Lsb;")
	public static final Class470 field4944;
	@ObfInfo(name = "aq", desc = "Lsb;")
	public static final Class470 field4947;
	@ObfInfo(name = "ag", desc = "Ljava/lang/String;")
	public String field4945;

	static {
		field4947 = new Class470("application/json");
		field4944 = new Class470("text/plain");
	}

	public Class470(String var1) {
		this.field4945 = var1;
	}

	@ObfInfo(name = "aq", desc = "(I)Ljava/lang/String;")
	public String method8549() {
		return this.field4945;
	}
}
