import io.runebox.ObfInfo;

@ObfInfo(name = "pm")
public class Class403 {
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	public String field4647;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field4651;
	@ObfInfo(name = "ag", desc = "Lps;")
	public final Class409 field4649;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1025438511)
	public final int field4650;
	@ObfInfo(name = "ad", desc = "J", longMultiplier = 1501500222647193011L)
	public final long field4648;

	public Class403(Class562 var1, byte var2, int var3) {
		this.field4651 = var1.method9837();
		this.field4647 = var1.method9837();
		this.field4650 = var1.method9997();
		this.field4648 = var1.method9833();
		int var4 = var1.method9832();
		int var5 = var1.method9832();
		this.field4649 = new Class409();
		this.field4649.method7542(2);
		this.field4649.method7545(var2);
		this.field4649.field4662 = var4;
		this.field4649.field4661 = var5;
		this.field4649.field4664 = 0;
		this.field4649.field4665 = 0;
		this.field4649.field4663 = var3;
	}

	@ObfInfo(name = "aq", desc = "(I)Ljava/lang/String;")
	public String method7478() {
		return this.field4651;
	}

	@ObfInfo(name = "ad", desc = "(I)Ljava/lang/String;")
	public String method7479() {
		return this.field4647;
	}
}
