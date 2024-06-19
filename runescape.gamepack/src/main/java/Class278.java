public class Class278 {
	public static final Class278 field3063;
	public static final Class278 field3064;
	public static final Class278 field3065;
	public final int field3066;
	public final int field3067;
	public final int field3068;

	static {
		field3063 = new Class278(1, 0, 4);
		field3065 = new Class278(2, 1, 2);
		field3064 = new Class278(0, 2, 0);
	}

	public Class278(int var1, int var2, int var3) {
		this.field3066 = var1;
		this.field3067 = var2;
		this.field3068 = var3;
	}

	public boolean method5560(float var1) {
		return var1 >= (float)this.field3068;
	}

	public static Class278[] method5565() {
		return new Class278[]{field3063, field3064, field3065};
	}
}
