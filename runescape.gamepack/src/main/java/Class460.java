import io.runebox.ObfInfo;

@ObfInfo(name = "rr")
public class Class460 {
	@ObfInfo(name = "ad", desc = "Lrr;")
	public static final Class460 field4894;
	@ObfInfo(name = "aq", desc = "Lrr;")
	public static final Class460 field4897;
	@ObfInfo(name = "ag", desc = "Ljava/lang/String;")
	public final String field4896;

	static {
		field4897 = new Class460("Basic");
		field4894 = new Class460("Bearer");
	}

	public Class460(String var1) {
		this.field4896 = var1;
	}

	@ObfInfo(name = "aq", desc = "(I)Ljava/lang/String;")
	public String method8466() {
		return this.field4896;
	}
}
