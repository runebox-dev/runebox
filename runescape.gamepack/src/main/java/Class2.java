import io.runebox.ObfInfo;

@ObfInfo(name = "ab")
public class Class2 {
	@ObfInfo(name = "aq", desc = "I")
	public final int field6;
	@ObfInfo(name = "ad", desc = "I")
	public final int field7;
	@ObfInfo(name = "ag", desc = "Ljava/lang/String;")
	public final String field8;

	public Class2(int var1, int var2, String var3) {
		this.field6 = var1;
		this.field7 = var2;
		this.field8 = var3;
	}

	public Class2(Class562 var1) {
		this(var1.method9902(), var1.method9902(), var1.method9837());
	}

	@ObfInfo(name = "aq", desc = "()Ljava/lang/String;")
	public String method7() {
		return Integer.toHexString(this.field6) + Integer.toHexString(this.field7) + this.field8;
	}

	@ObfInfo(name = "ad", desc = "()I")
	public int method6() {
		return this.field7;
	}
}
