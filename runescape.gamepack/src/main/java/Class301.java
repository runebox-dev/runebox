import io.runebox.ObfInfo;

@ObfInfo(name = "lo")
public class Class301 {
	@ObfInfo(name = "aj", desc = "Llh;")
	public Class294 field3081;
	@ObfInfo(name = "ad", desc = "Z")
	public boolean field3072;
	@ObfInfo(name = "aq", desc = "Z")
	public boolean field3079;
	@ObfInfo(name = "an", desc = "I")
	public int field3071;
	@ObfInfo(name = "ag", desc = "I")
	public int field3073;
	@ObfInfo(name = "al", desc = "I")
	public int field3075;
	@ObfInfo(name = "ao", desc = "I")
	public int field3076;
	@ObfInfo(name = "aa", desc = "I")
	public int field3077;
	@ObfInfo(name = "ah", desc = "I")
	public int field3083;
	@ObfInfo(name = "az", desc = "I")
	public int field3084;
	@ObfInfo(name = "ax", desc = "I")
	public int field3085;
	@ObfInfo(name = "ac", desc = "I")
	public int field3086;
	@ObfInfo(name = "ay", desc = "I")
	public int field3088;
	@ObfInfo(name = "as", desc = "[I")
	public int[] field3091;

	public Class301() {
		this.field3079 = false;
		this.field3072 = true;
		this.field3073 = 0;
		this.field3071 = 512;
		this.field3091 = new int[1024];
	}

	@ObfInfo(name = "aq", desc = "()V")
	public void method5835() {
		this.field3083 = this.field3085 / 2;
		this.field3084 = this.field3086 / 2;
		this.field3075 = -this.field3083;
		this.field3088 = this.field3085 - this.field3083;
		this.field3076 = -this.field3084;
		this.field3077 = this.field3086 - this.field3084;
	}

	@ObfInfo(name = "ad", desc = "(IIII)V")
	public void method5836(int var1, int var2, int var3, int var4) {
		this.field3083 = var1 - var2;
		this.field3084 = var3 - var4;
		this.field3075 = -this.field3083;
		this.field3088 = this.field3085 - this.field3083;
		this.field3076 = -this.field3084;
		this.field3077 = this.field3086 - this.field3084;
	}

	@ObfInfo(name = "ag", desc = "(III)V")
	public void method5837(int var1, int var2, int var3) {
		this.field3079 = var1 < 0 || var1 > this.field3085 || var2 < 0 || var2 > this.field3085 || var3 < 0 || var3 > this.field3085;
	}
}
