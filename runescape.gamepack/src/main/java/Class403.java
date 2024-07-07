import io.runebox.ObfInfo;

@ObfInfo(name = "pm")
public class Class403 {
	@ObfInfo(name = "af", desc = "Ljava/lang/String;")
	public String field4620;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public String field4623;
	@ObfInfo(name = "aj", desc = "Lpg;")
	public final Class397 field4622;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1304800329)
	public final int field4624;
	@ObfInfo(name = "al", desc = "J", longMultiplier = 5932765989518071691L)
	public final long field4621;

	public Class403(Class521 var1, byte var2, int var3) {
		this.field4623 = var1.method9415();
		this.field4620 = var1.method9415();
		this.field4624 = var1.method9407();
		this.field4621 = var1.method9411();
		int var4 = var1.method9410();
		int var5 = var1.method9410();
		this.field4622 = new Class397();
		this.field4622.method7438(2);
		this.field4622.method7443(var2);
		this.field4622.field4590 = var4;
		this.field4622.field4591 = var5;
		this.field4622.field4592 = 0;
		this.field4622.field4588 = 0;
		this.field4622.field4589 = var3;
	}

	@ObfInfo(name = "ak", desc = "(I)Ljava/lang/String;")
	public String method7540() {
		return this.field4623;
	}

	@ObfInfo(name = "al", desc = "(I)Ljava/lang/String;")
	public String method7535() {
		return this.field4620;
	}
}
