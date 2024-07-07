import io.runebox.ObfInfo;

@ObfInfo(name = "hm")
public class Class195 extends Class202 {
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field2009;
	// $FF: synthetic field
	public final Class192 this$0;

	public Class195(Class192 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2009 = var3;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method3591() {
		return 1;
	}

	@ObfInfo(name = "aa", desc = "(I)Ljava/lang/String;")
	public String method3835() {
		return this.field2009;
	}
}
