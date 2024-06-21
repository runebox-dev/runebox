import io.runebox.ObfInfo;

public class Class357 {
	@ObfInfo(name = "ah", desc = "Lmw;")
	public Class335 field3940;
	@ObfInfo(name = "aq", desc = "Lno;")
	public Class353 field3932;
	@ObfInfo(name = "ak", desc = "Lor;")
	public Class382 field3938;
	@ObfInfo(name = "av", desc = "Lbq;")
	public Class43 field3942;
	@ObfInfo(name = "at", desc = "Z")
	public boolean field3934;
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field3936;
	@ObfInfo(name = "ao", desc = "Z")
	public boolean field3939;
	@ObfInfo(name = "ab", desc = "Z")
	public boolean field3941;
	@ObfInfo(name = "ac", desc = "Z")
	public boolean field3943;
	@ObfInfo(name = "af", desc = "F")
	public float field3935;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1287935663)
	public int field3931;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -239630077)
	public int field3933;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1516252477)
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

	@ObfInfo(name = "ak", desc = "(Lor;IIIZB)V")
	public void method7040(Class382 var1, int var2, int var3, int var4, boolean var5) {
		this.field3938 = var1;
		this.field3937 = var2;
		this.field3933 = var3;
		this.field3931 = var4;
		this.field3936 = var5;
	}
}
