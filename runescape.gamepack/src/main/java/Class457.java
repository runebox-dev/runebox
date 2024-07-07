import io.runebox.ObfInfo;

@ObfInfo(name = "ro")
public abstract class Class457 {
	@ObfInfo(name = "ag", desc = "Lro;")
	public Class457 field4891;
	@ObfInfo(name = "an", desc = "Z")
	public boolean field4889;
	@ObfInfo(name = "aj", desc = "Z")
	public boolean field4892;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field4888;
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	public String field4890;

	public Class457(Class457 var1) {
		this.field4891 = var1;
	}

	@ObfInfo(name = "aq", desc = "(S)Z")
	public abstract boolean method7710();

	@ObfInfo(name = "aj", desc = "(I)Z")
	public boolean method8402() {
		return this.field4889;
	}

	@ObfInfo(name = "av", desc = "(I)Z")
	public boolean method8403() {
		return this.field4892;
	}

	@ObfInfo(name = "ab", desc = "(I)Ljava/lang/String;")
	public String method8404() {
		return "Error in task: " + this.field4890 + ", Error message: " + this.field4888;
	}

	@ObfInfo(name = "ai", desc = "(I)Lro;")
	public Class457 method8407() {
		return this.field4891;
	}

	@ObfInfo(name = "ae", desc = "(Ljava/lang/String;I)V")
	public void method8406(String var1) {
		this.field4889 = true;
		this.field4888 = var1;
	}
}
