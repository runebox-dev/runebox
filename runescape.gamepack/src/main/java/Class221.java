import io.runebox.ObfInfo;

@ObfInfo(name = "im")
public abstract class Class221 {
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field2404;
	// $FF: synthetic field
	public final Class214 this$0;

	public Class221(Class214 var1, String var2) {
		this.this$0 = var1;
		this.field2404 = var2;
	}

	@ObfInfo(name = "aq", desc = "(B)I")
	public abstract int method4255();

	@ObfInfo(name = "au", desc = "(I)Ljava/lang/String;")
	public String method4252() {
		return this.field2404;
	}

	@ObfInfo(name = "ab", desc = "(B)Ljava/lang/String;")
	public String method4253() {
		return null;
	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method4254() {
		return -1;
	}
}
