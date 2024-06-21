import io.runebox.ObfInfo;

public abstract class Class447 {
	@ObfInfo(name = "aj", desc = "Lre;")
	public Class447 field4811;
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field4810;
	@ObfInfo(name = "at", desc = "Z")
	public boolean field4812;
	@ObfInfo(name = "af", desc = "Ljava/lang/String;")
	public String field4807;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public String field4808;

	public Class447(Class447 var1) {
		this.field4811 = var1;
	}

	@ObfInfo(name = "ak", desc = "(I)Z")
	public abstract boolean method7832();

	@ObfInfo(name = "ac", desc = "(B)Z")
	public boolean method8375() {
		return this.field4810;
	}

	@ObfInfo(name = "ao", desc = "(B)Z")
	public boolean method8376() {
		return this.field4812;
	}

	@ObfInfo(name = "ah", desc = "(I)Ljava/lang/String;")
	public String method8393() {
		return "Error in task: " + this.field4807 + ", Error message: " + this.field4808;
	}

	@ObfInfo(name = "av", desc = "(B)Lre;")
	public Class447 method8378() {
		return this.field4811;
	}

	@ObfInfo(name = "aq", desc = "(Ljava/lang/String;I)V")
	public void method8379(String var1) {
		this.field4810 = true;
		this.field4808 = var1;
	}
}
