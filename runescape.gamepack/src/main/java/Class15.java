import io.runebox.ObfInfo;

@ObfInfo(name = "ao")
public class Class15 implements Class393 {
	@ObfInfo(name = "al", desc = "Lao;")
	public static final Class15 field66;
	@ObfInfo(name = "aj", desc = "Lao;")
	public static final Class15 field67;
	@ObfInfo(name = "ak", desc = "Lao;")
	public static final Class15 field72;
	@ObfInfo(name = "az", desc = "Lao;")
	public static final Class15 field74;
	@ObfInfo(name = "af", desc = "Lao;")
	public static final Class15 field77;
	@ObfInfo(name = "ab", desc = "Z")
	public boolean field73;
	@ObfInfo(name = "ac", desc = "Z")
	public boolean field75;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -683626941)
	public int field70;
	@ObfInfo(name = "at", desc = "Ljava/lang/String;")
	public String field71;

	static {
		field72 = new Class15(0, "POST", true, true);
		field66 = new Class15(1, "GET", true, false);
		field67 = new Class15(2, "PUT", false, true);
		field74 = new Class15(3, "PATCH", false, true);
		field77 = new Class15(4, "DELETE", false, true);
	}

	public Class15(int var1, String var2, boolean var3, boolean var4) {
		this.field70 = var1;
		this.field71 = var2;
		this.field73 = var3;
		this.field75 = var4;
	}

	@ObfInfo(name = "az", desc = "(I)Z")
	public boolean method174() {
		return this.field73;
	}

	@ObfInfo(name = "af", desc = "(B)Ljava/lang/String;")
	public String method173() {
		return this.field71;
	}

	@ObfInfo(name = "aa", desc = "(I)Z")
	public boolean method183() {
		return this.field75;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field70;
	}
}
