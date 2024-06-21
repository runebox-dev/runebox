import io.runebox.ObfInfo;

@ObfInfo(name = "ht")
public abstract class Class202 {
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public String field2072;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lhj;")
	public final Class192 this$0;

	public Class202(Class192 var1, String var2) {
		this.this$0 = var1;
		this.field2072 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public abstract int method3591();

	@ObfInfo(name = "ab", desc = "(B)Ljava/lang/String;")
	public String method3927() {
		return this.field2072;
	}

	@ObfInfo(name = "aa", desc = "(I)Ljava/lang/String;")
	public String method3835() {
		return null;
	}

	@ObfInfo(name = "al", desc = "(I)I")
	public int method3592() {
		return -1;
	}
}
