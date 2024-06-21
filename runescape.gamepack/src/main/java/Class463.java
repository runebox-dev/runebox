import io.runebox.ObfInfo;

public class Class463 {
	@ObfInfo(name = "al", desc = "Lru;")
	public static final Class463 field4882;
	@ObfInfo(name = "ak", desc = "Lru;")
	public static final Class463 field4883;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	public final String field4884;

	static {
		field4883 = new Class463("Basic");
		field4882 = new Class463("Bearer");
	}

	public Class463(String var1) {
		this.field4884 = var1;
	}

	@ObfInfo(name = "ak", desc = "(B)Ljava/lang/String;")
	public String method8548() {
		return this.field4884;
	}
}
