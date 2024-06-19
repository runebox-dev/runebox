public class Class15 implements Class393 {
	public static final Class15 field66;
	public static final Class15 field67;
	public static final Class15 field72;
	public static final Class15 field74;
	public static final Class15 field77;
	public boolean field73;
	public boolean field75;
	public int field70;
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

	public boolean method174() {
		return this.field73;
	}

	public String method173() {
		return this.field71;
	}

	public boolean method183() {
		return this.field75;
	}

	public int method175() {
		return this.field70;
	}
}
