public class Class357 {
	public Class335 field3940;
	public Class353 field3932;
	public Class382 field3938;
	public Class43 field3942;
	public boolean field3934;
	public boolean field3936;
	public boolean field3939;
	public boolean field3941;
	public boolean field3943;
	public float field3935;
	public int field3931;
	public int field3933;
	public int field3937;

	public Class357(Class382 var1, String var2, String var3, int var4, boolean var5) {
		this.field3937 = -1;
		this.field3933 = -1;
		this.field3931 = 0;
		this.field3935 = 0.0F;
		this.field3936 = false;
		this.field3943 = false;
		this.field3939 = false;
		this.field3937 = var1.method7233(var2);
		this.field3933 = var1.method7299(this.field3937, var3);
		this.method7040(var1, this.field3937, this.field3933, var4, var5);
	}

	public Class357(Class382 var1, int var2, int var3, int var4, boolean var5) {
		this.field3937 = -1;
		this.field3933 = -1;
		this.field3931 = 0;
		this.field3935 = 0.0F;
		this.field3936 = false;
		this.field3943 = false;
		this.field3939 = false;
		this.method7040(var1, var2, var3, var4, var5);
	}

	public void method7040(Class382 var1, int var2, int var3, int var4, boolean var5) {
		this.field3938 = var1;
		this.field3937 = var2;
		this.field3933 = var3;
		this.field3931 = var4;
		this.field3936 = var5;
	}
}
