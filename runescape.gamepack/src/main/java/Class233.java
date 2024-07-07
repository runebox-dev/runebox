import io.runebox.ObfInfo;

@ObfInfo(name = "iy")
public class Class233 extends Class221 {
	@ObfInfo(name = "aq", desc = "Ljava/lang/String;")
	public String field2473;
	// $FF: synthetic field
	public final Class214 this$0;

	public Class233(Class214 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2473 = var3;
	}

	@ObfInfo(name = "aq", desc = "(B)I")
	public int method4255() {
		return 1;
	}

	@ObfInfo(name = "ab", desc = "(B)Ljava/lang/String;")
	public String method4253() {
		return this.field2473;
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/String;B)I", opaque = "-1")
	public static int method4448(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}
}
