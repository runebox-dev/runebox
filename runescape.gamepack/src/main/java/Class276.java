import io.runebox.ObfInfo;

public class Class276 {
	@ObfInfo(name = "at", desc = "Lkc;")
	public Class263 field3043;
	@ObfInfo(name = "ak", desc = "Z")
	public boolean field3039;
	@ObfInfo(name = "al", desc = "Z")
	public boolean field3044;
	@ObfInfo(name = "ay", desc = "I")
	public int field3037;
	@ObfInfo(name = "aa", desc = "I")
	public int field3042;
	@ObfInfo(name = "aq", desc = "I")
	public int field3048;
	@ObfInfo(name = "aj", desc = "I")
	public int field3049;
	@ObfInfo(name = "ap", desc = "I")
	public int field3050;
	@ObfInfo(name = "ae", desc = "I")
	public int field3051;
	@ObfInfo(name = "ax", desc = "I")
	public int field3052;
	@ObfInfo(name = "au", desc = "I")
	public int field3054;
	@ObfInfo(name = "as", desc = "I")
	public int field3055;
	@ObfInfo(name = "aw", desc = "I")
	public int field3056;
	@ObfInfo(name = "ad", desc = "[I")
	public int[] field3057;

	public Class276() {
		this.field3039 = false;
		this.field3044 = true;
		this.field3049 = 0;
		this.field3042 = 512;
		this.field3057 = new int[1024];
	}

	@ObfInfo(name = "ak", desc = "()V")
	public void method5550() {
		this.field3048 = this.field3051 / 2;
		this.field3050 = this.field3052 / 2;
		this.field3037 = -this.field3048;
		this.field3054 = this.field3051 - this.field3048;
		this.field3055 = -this.field3050;
		this.field3056 = this.field3052 - this.field3050;
	}

	@ObfInfo(name = "al", desc = "(IIII)V")
	public void method5549(int var1, int var2, int var3, int var4) {
		this.field3048 = var1 - var2;
		this.field3050 = var3 - var4;
		this.field3037 = -this.field3048;
		this.field3054 = this.field3051 - this.field3048;
		this.field3055 = -this.field3050;
		this.field3056 = this.field3052 - this.field3050;
	}

	@ObfInfo(name = "aj", desc = "(III)V")
	public void method5552(int var1, int var2, int var3) {
		this.field3039 = var1 < 0 || var1 > this.field3051 || var2 < 0 || var2 > this.field3051 || var3 < 0 || var3 > this.field3051;
	}
}
