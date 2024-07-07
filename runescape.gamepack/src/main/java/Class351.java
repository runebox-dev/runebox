import io.runebox.ObfInfo;

@ObfInfo(name = "nm")
public class Class351 {
	@ObfInfo(name = "ae", desc = "Lmc;")
	public Class315 field3761;
	@ObfInfo(name = "au", desc = "Lbh;")
	public Class34 field3762;
	@ObfInfo(name = "ah", desc = "Lnz;")
	public Class364 field3751;
	@ObfInfo(name = "aq", desc = "Lok;")
	public Class375 field3756;
	@ObfInfo(name = "aj", desc = "Z")
	public boolean field3757;
	@ObfInfo(name = "av", desc = "Z")
	public boolean field3758;
	@ObfInfo(name = "an", desc = "Z")
	public boolean field3759;
	@ObfInfo(name = "ai", desc = "Z")
	public boolean field3760;
	@ObfInfo(name = "ab", desc = "Z")
	public boolean field3763;
	@ObfInfo(name = "ap", desc = "F")
	public float field3752;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 821498491)
	public int field3753;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 562187867)
	public int field3754;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1234485003)
	public int field3764;

	public Class351(Class375 var1, String var2, String var3, int var4, boolean var5) {
		this.field3764 = -1;
		this.field3753 = -1;
		this.field3754 = 0;
		this.field3752 = 0.0F;
		this.field3759 = false;
		this.field3763 = false;
		this.field3760 = false;
		this.field3764 = var1.method7150(var2);
		this.field3753 = var1.method7209(this.field3764, var3);
		this.method6542(var1, this.field3764, this.field3753, var4, var5);
	}

	public Class351(Class375 var1, int var2, int var3, int var4, boolean var5) {
		this.field3764 = -1;
		this.field3753 = -1;
		this.field3754 = 0;
		this.field3752 = 0.0F;
		this.field3759 = false;
		this.field3763 = false;
		this.field3760 = false;
		this.method6542(var1, var2, var3, var4, var5);
	}

	@ObfInfo(name = "aq", desc = "(Lok;IIIZS)V")
	public void method6542(Class375 var1, int var2, int var3, int var4, boolean var5) {
		this.field3756 = var1;
		this.field3764 = var2;
		this.field3753 = var3;
		this.field3754 = var4;
		this.field3759 = var5;
	}
}
