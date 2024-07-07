import io.runebox.ObfInfo;

@ObfInfo(name = "ai")
public class Class9 implements Class393 {
	@ObfInfo(name = "ag", desc = "Lai;")
	public static final Class9 field38;
	@ObfInfo(name = "ak", desc = "Lai;")
	public static final Class9 field39;
	@ObfInfo(name = "ap", desc = "Lai;")
	public static final Class9 field40;
	@ObfInfo(name = "aq", desc = "Lai;")
	public static final Class9 field44;
	@ObfInfo(name = "ad", desc = "Lai;")
	public static final Class9 field52;
	@ObfInfo(name = "av", desc = "Z")
	public boolean field37;
	@ObfInfo(name = "ab", desc = "Z")
	public boolean field45;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1613497083)
	public int field36;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	public String field42;

	static {
		field44 = new Class9(0, "POST", true, true);
		field52 = new Class9(1, "GET", true, false);
		field38 = new Class9(2, "PUT", false, true);
		field39 = new Class9(3, "PATCH", false, true);
		field40 = new Class9(4, "DELETE", false, true);
	}

	public Class9(int var1, String var2, boolean var3, boolean var4) {
		this.field36 = var1;
		this.field42 = var2;
		this.field37 = var3;
		this.field45 = var4;
	}

	@ObfInfo(name = "ag", desc = "(I)Z")
	public boolean method126() {
		return this.field37;
	}

	@ObfInfo(name = "ak", desc = "(B)Ljava/lang/String;")
	public String method130() {
		return this.field42;
	}

	@ObfInfo(name = "ap", desc = "(I)Z")
	public boolean method128() {
		return this.field45;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field36;
	}
}
