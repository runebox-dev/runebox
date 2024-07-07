import io.runebox.ObfInfo;

@ObfInfo(name = "qx")
public class Class440 {
	@ObfInfo(name = "ad", desc = "F")
	public float field4771;
	@ObfInfo(name = "aq", desc = "F")
	public float field4772;
	@ObfInfo(name = "ag", desc = "F")
	public float field4773;
	@ObfInfo(name = "ak", desc = "F")
	public float field4774;
	@ObfInfo(name = "ap", desc = "F")
	public float field4775;
	@ObfInfo(name = "an", desc = "F")
	public float field4776;
	@ObfInfo(name = "ab", desc = "F")
	public float field4777;
	@ObfInfo(name = "av", desc = "F")
	public float field4778;
	@ObfInfo(name = "ae", desc = "F")
	public float field4779;
	@ObfInfo(name = "aj", desc = "F")
	public float field4780;
	@ObfInfo(name = "ai", desc = "F")
	public float field4781;
	@ObfInfo(name = "au", desc = "F")
	public float field4782;

	static {
		new Class440();
	}

	public Class440() {
		this.method8117();
	}

	@ObfInfo(name = "aq", desc = "(B)V")
	public void method8117() {
		this.field4782 = 0.0F;
		this.field4779 = 0.0F;
		this.field4781 = 0.0F;
		this.field4778 = 0.0F;
		this.field4780 = 0.0F;
		this.field4776 = 0.0F;
		this.field4774 = 0.0F;
		this.field4773 = 0.0F;
		this.field4771 = 0.0F;
		this.field4777 = 1.0F;
		this.field4775 = 1.0F;
		this.field4772 = 1.0F;
	}

	@ObfInfo(name = "ad", desc = "(FI)V")
	public void method8116(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4771;
		float var6 = this.field4775;
		float var7 = this.field4778;
		float var8 = this.field4779;
		this.field4771 = var3 * var5 - var4 * this.field4773;
		this.field4773 = var4 * var5 + this.field4773 * var3;
		this.field4775 = var6 * var3 - var4 * this.field4776;
		this.field4776 = var3 * this.field4776 + var6 * var4;
		this.field4778 = var7 * var3 - var4 * this.field4777;
		this.field4777 = var4 * var7 + this.field4777 * var3;
		this.field4779 = var8 * var3 - var4 * this.field4782;
		this.field4782 = var3 * this.field4782 + var8 * var4;
	}

	@ObfInfo(name = "ag", desc = "(FI)V")
	public void method8126(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4772;
		float var6 = this.field4774;
		float var7 = this.field4780;
		float var8 = this.field4781;
		this.field4772 = var4 * this.field4773 + var5 * var3;
		this.field4773 = var3 * this.field4773 - var5 * var4;
		this.field4774 = var3 * var6 + var4 * this.field4776;
		this.field4776 = this.field4776 * var3 - var6 * var4;
		this.field4780 = this.field4777 * var4 + var7 * var3;
		this.field4777 = var3 * this.field4777 - var7 * var4;
		this.field4781 = var8 * var3 + var4 * this.field4782;
		this.field4782 = this.field4782 * var3 - var8 * var4;
	}

	@ObfInfo(name = "ak", desc = "(FI)V")
	public void method8118(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4772;
		float var6 = this.field4774;
		float var7 = this.field4780;
		float var8 = this.field4781;
		this.field4772 = var3 * var5 - this.field4771 * var4;
		this.field4771 = var4 * var5 + this.field4771 * var3;
		this.field4774 = var3 * var6 - var4 * this.field4775;
		this.field4775 = this.field4775 * var3 + var6 * var4;
		this.field4780 = var7 * var3 - this.field4778 * var4;
		this.field4778 = var7 * var4 + this.field4778 * var3;
		this.field4781 = var3 * var8 - this.field4779 * var4;
		this.field4779 = var8 * var4 + this.field4779 * var3;
	}

	@ObfInfo(name = "ap", desc = "(FFFB)V")
	public void method8119(float var1, float var2, float var3) {
		this.field4781 += var1;
		this.field4779 += var2;
		this.field4782 += var3;
	}

	public String toString() {
		return this.field4772 + "," + this.field4774 + "," + this.field4780 + "," + this.field4781 + "\n" + this.field4771 + "," + this.field4775 + "," + this.field4778 + "," + this.field4779 + "\n" + this.field4773 + "," + this.field4776 + "," + this.field4777 + "," + this.field4782;
	}
}
