import io.runebox.ObfInfo;

public class Class3 {
	@ObfInfo(name = "al", desc = "I")
	public final int field11;
	@ObfInfo(name = "ak", desc = "I")
	public final int field12;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	public final String field10;

	public Class3(int var1, int var2, String var3) {
		this.field12 = var1;
		this.field11 = var2;
		this.field10 = var3;
	}

	public Class3(Class521 var1) {
		this(var1.method9405(), var1.method9405(), var1.method9415());
	}

	@ObfInfo(name = "ak", desc = "()Ljava/lang/String;")
	public String method38() {
		return Integer.toHexString(this.field12) + Integer.toHexString(this.field11) + this.field10;
	}

	@ObfInfo(name = "al", desc = "()I")
	public int method41() {
		return this.field11;
	}
}
